import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

// $FF: renamed from: h
public final class class_7 implements Runnable, PlayerListener {
   // $FF: renamed from: a int
   public static int field_78 = -1;
   // $FF: renamed from: b int
   public static int field_79 = -1;
   // $FF: renamed from: c int
   public static int field_80;
   // $FF: renamed from: d int
   public static int field_81;
   // $FF: renamed from: e int
   public static int field_82 = -1;
   // $FF: renamed from: a long
   public long field_83 = 0L;
   // $FF: renamed from: a javax.microedition.media.Player[]
   public static Player[] midiPlayers;
   // $FF: renamed from: a boolean
   public static boolean soundEnabled;
   // $FF: renamed from: b boolean
   public static boolean field_86;
   // $FF: renamed from: c boolean
   public static boolean field_87 = false;
   // $FF: renamed from: a java.io.ByteArrayInputStream
   public ByteArrayInputStream midiByteStream;
   // $FF: renamed from: a java.io.InputStream
   public InputStream sndFileStream;
   // $FF: renamed from: a byte[]
   public byte[] sndFileMetadata;
   // $FF: renamed from: a java.lang.Thread
   public Thread field_91;

   // $FF: renamed from: a (int) void
   /**
    * Plays a specific MIDI track.
    * @param trackNum The MIDI being played
    */
   public final void method_51(int trackNum) {
      if (midiPlayers == null) {
         midiPlayers = new Player[21]; //Initialize players for each MIDI
      }

      try {
         byte[] midiFile = new byte[class_8.getShortFromBytes(this.sndFileMetadata, trackNum * 8 + 4)]; //Get size of song's MIDI
         this.sndFileStream.read(midiFile);
         this.midiByteStream = new ByteArrayInputStream(midiFile);
         midiPlayers[trackNum] = Manager.createPlayer(this.midiByteStream, "audio/midi");
         midiPlayers[trackNum].addPlayerListener(this);
         midiPlayers[trackNum].realize();
         ((VolumeControl)midiPlayers[trackNum].getControl("VolumeControl")).setLevel(100); //Play at full volume
         this.midiByteStream.close();
         this.midiByteStream = null;
         System.gc();
      } catch (Exception var4) {
      }
   }

   // $FF: renamed from: a () void
   public final void method_52() {
      field_86 = false;
      this.field_91 = new Thread(this);
      this.field_91.setPriority(1);
      this.field_91.start();
   }

   // $FF: renamed from: b () void
   /**
    * Loads the indices for the MIDI files if they haven't already been loaded.
    */
   public final void loadMidiIndices() {
      if (midiPlayers == null) {
         try {
            this.sndFileStream = this.getClass().getResourceAsStream("/snd.f");
            this.sndFileStream.skip(1L); //Ignore file count
            this.sndFileMetadata = new byte[168]; //Metadata size for MIDI data
            this.sndFileStream.read(this.sndFileMetadata); //Load MIDI file pack metadata
            return;
         } catch (Exception var2) {
            ((Throwable)var2).printStackTrace();
         }
      }

   }

   // $FF: renamed from: c () void
   public final void method_54() {
      try {
         field_78 = -1;
         field_82 = -1;
         field_80 = 0;
         this.sndFileStream.close();
         this.sndFileStream = null;
         this.sndFileMetadata = null;
         System.gc();
      } catch (Exception var2) {
      }
   }

   // $FF: renamed from: d () void
   public final void method_55() {
      if (midiPlayers != null) {
         this.method_59();
         int var1 = midiPlayers.length;

         for(int var2 = 0; var2 < var1; ++var2) {
            if (midiPlayers[var2] != null) {
               midiPlayers[var2].close();
               midiPlayers[var2] = null;
            }
         }
      }

      midiPlayers = null;
      field_86 = true;
   }

   // $FF: renamed from: a (int) int
   private static int method_56(int var0) {
      switch (var0) {
         case 0:
         case 5:
         case 6:
         case 10:
         case 14:
            return 10;
         case 1:
         case 2:
         case 4:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
            return 30;
         case 3:
         case 7:
         case 8:
         case 9:
         case 11:
         case 12:
         case 13:
            return 20;
         default:
            return 0;
      }
   }

   // $FF: renamed from: a (int) boolean
   /**
    * Returns true if the track number is for music and false if it's a sound effect.
    * @param trackNum Number of the MIDI track
    * @return True if track is music, false if SFX
    */
   private static boolean isMusic(int trackNum) {
      switch (trackNum) {
      // Sound effect MIDI tracks
         case 0:
         case 5:
         case 6:
         case 7:
         case 8:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
            return false;
      // Music MIDI tracks
         case 1:
         case 2:
         case 3:
         case 4:
         case 9:
         default:
            return true;
      }
   }

   public final synchronized void run() {
      while(!field_86) {
         try {
            this.wait();
         } catch (Exception var18) {
         }

         if (field_87) {
            try {
               if (isMusic(field_78)) {
                  midiPlayers[field_78].deallocate();
                  field_82 = -1;
               }

               field_78 = -1;
               field_87 = false;
            } catch (Exception var16) {
            } finally {
               field_80 = 0;
            }
         }

         if (field_79 != -1) {
            try {
               if (field_82 != -1 && field_79 != field_82) {
                  midiPlayers[field_82].deallocate();
                  field_82 = -1;
               }

               if (field_82 == -1) {
                  midiPlayers[field_79].prefetch();
                  field_82 = field_79;
               }

               midiPlayers[field_79].start();
               field_78 = field_79;
               field_80 = field_81;
               this.field_83 = System.currentTimeMillis();
            } catch (Exception var14) {
            } finally {
               field_79 = -1;
            }
         }
      }

   }

   // $FF: renamed from: b (int) void
   public final synchronized void method_58(int var1) {
      if (soundEnabled) {
         if (field_78 != -1) {
            if (field_80 >= method_56(var1) && (field_80 != method_56(var1) || Math.abs(System.currentTimeMillis() - this.field_83) <= 50L)) {
               return;
            }

            field_87 = true;
         } else {
            field_80 = 0;
         }

         int var2;
         if ((var2 = method_56(var1)) >= field_80) {
            field_79 = var1;
            field_81 = var2;
            this.notify();
         }
      }

   }

   // $FF: renamed from: e () void
   public final synchronized void method_59() {
      if (field_78 != -1) {
         field_87 = true;
      }

      this.notify();
   }

   // $FF: renamed from: a () boolean
   public static synchronized boolean method_60() {
      return field_78 != -1;
   }

   public final void playerUpdate(Player var1, String var2, Object var3) {
      if (midiPlayers != null && field_78 != -1 && var2.equals("endOfMedia")) {
         this.method_59();
      }

   }
}
