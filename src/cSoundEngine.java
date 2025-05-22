import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

// $FF: renamed from: h
public final class cSoundEngine implements Runnable, PlayerListener {
	// Sound IDs
	final static int SOUND_SFX_SWITCH = 0;
	final static int SOUND_SFX_RIDDLE = 1;
	final static int SOUND_SFX_DEATH = 2;
	final static int SOUND_SFX_CHEST_1 = 3;
	final static int SOUND_SFX_CHEST_2 = 4;
	final static int SOUND_SFX_HERO_HURT = 5;
	final static int SOUND_SFX_HAMMER_HIT_UNBREAKABLE = 6;
	final static int SOUND_SFX_MINE = 7;
	final static int SOUND_SFX_WORKING = 8;
	final static int SOUND_SFX_CHECKPOINT = 9;
	final static int SOUND_SFX_ENEMY_HURT = 10;
	final static int SOUND_SFX_BREAK = 11;
	final static int SOUND_SFX_HOOKING = 12;
	final static int SOUND_SFX_WATER = 13;
	final static int SOUND_SFX_BOULDER = 14;
	final static int SOUND_M_LEVEL_CLEAR = 15;
	final static int SOUND_M_WORLDS_INIT = 16;
	final static int SOUND_M_GERMANY = 17;
	final static int SOUND_M_TIBET = 18;
	final static int SOUND_M_TITLE = 19;
	final static int SOUND_M_GAMEOVER = 20;

	// Number of sounds
	final static int TOTAL_SOUNDS = 21;

	// The volume of sounds
	final static int SOUND_VOLUME = 100;

	// $FF: renamed from: a int
	public static int crtSoundId = -1;
	// $FF: renamed from: b int
	public static int newSoundId = -1;
	// $FF: renamed from: c int
	public static int crtSoundPriority;
	// $FF: renamed from: d int
	public static int newSoundPriority;
	// $FF: renamed from: e int
	public static int previousSoundId = -1;
	// $FF: renamed from: a long
	public long soundLoopStartTime = 0L;
	// $FF: renamed from: a javax.microedition.media.Player[]
	public static Player[] midiPlayers;
	// $FF: renamed from: a boolean
	public static boolean soundEnabled;
	// $FF: renamed from: b boolean
	public static boolean stopSoundThreadLoop;
	// $FF: renamed from: c boolean
	public static boolean needFreeCrtPlayerResource = false;
	// $FF: renamed from: a java.io.ByteArrayInputStream
	public ByteArrayInputStream midiByteStream;
	// $FF: renamed from: a java.io.InputStream
	public InputStream sndFileStream;
	// $FF: renamed from: a byte[]
	public byte[] sndFileMetadata;
	// $FF: renamed from: a java.lang.Thread
	public Thread soundThread;

	// $FF: renamed from: a (int) void
	/**
	 * Load the specified audio data into the midiPlayers
	 * @param soundId The ID of the audio data to be loaded
	 */
	public final void method_51(int soundId) {
		if (midiPlayers == null) {
			midiPlayers = new Player[TOTAL_SOUNDS]; // Initialize players for each MIDI
		}

		try {
			byte[] midiFile = new byte[cGame.getShortFromBytes(this.sndFileMetadata, soundId * 8 + 4)]; //Get size of song's MIDI
			this.sndFileStream.read(midiFile);
			this.midiByteStream = new ByteArrayInputStream(midiFile);
			midiPlayers[soundId] = Manager.createPlayer(this.midiByteStream, "audio/midi");
			midiPlayers[soundId].addPlayerListener(this);
			midiPlayers[soundId].realize();
			((VolumeControl)midiPlayers[soundId].getControl("VolumeControl")).setLevel(SOUND_VOLUME); //Play at full volume
			this.midiByteStream.close();
			this.midiByteStream = null;
			System.gc();
		} catch (Exception var4) {
		}
	}

	// $FF: renamed from: a () void
	/**
	 * Start the audio playback thread
	 */
	public final void method_52() {
		stopSoundThreadLoop = false;
		this.soundThread = new Thread(this);
		this.soundThread.setPriority(1);
		this.soundThread.start();
	}

	// $FF: renamed from: b () void
	/**
	 * Loads the indices for the MIDI files if they haven't already been loaded.
	 */
	public final void loadMidiIndices() {
		if (midiPlayers == null) {
			try {
				this.sndFileStream = this.getClass().getResourceAsStream("/snd.f");
				this.sndFileStream.skip(1L); // Ignore file count
				this.sndFileMetadata = new byte[TOTAL_SOUNDS << 3]; // Metadata size for MIDI data
				this.sndFileStream.read(this.sndFileMetadata); // Load MIDI file pack metadata
				return;
			} catch (Exception var2) {
				((Throwable)var2).printStackTrace();
			}
		}

	}

	// $FF: renamed from: c () void
	public final void method_54() {
		try {
			crtSoundId = -1;
			previousSoundId = -1;
			crtSoundPriority = 0;
			this.sndFileStream.close();
			this.sndFileStream = null;
			this.sndFileMetadata = null;
			System.gc();
		} catch (Exception var2) {
		}
	}

	// $FF: renamed from: d () void
	/**
	 * Release player resources and stop the audio playback thread loop
	 */
	public final void method_55() {
		if (midiPlayers != null) {
			this.freeCrtPlayerResource();
			int var1 = midiPlayers.length;

			for(int var2 = 0; var2 < var1; ++var2) {
				if (midiPlayers[var2] != null) {
					midiPlayers[var2].close();
					midiPlayers[var2] = null;
				}
			}
		}

		midiPlayers = null;
		stopSoundThreadLoop = true;
	}

	// $FF: renamed from: a (int) int
	/**
	 * Get the playback priority of a specific sound
	 * @param soundId The ID of the sound
	 */
	private static int getSoundPriority(int soundId) {
		switch (soundId) {
			case SOUND_SFX_SWITCH:
			case SOUND_SFX_HERO_HURT:
			case SOUND_SFX_HAMMER_HIT_UNBREAKABLE:
			case SOUND_SFX_ENEMY_HURT:
			case SOUND_SFX_BOULDER:
				return 10;
			case SOUND_SFX_RIDDLE:
			case SOUND_SFX_DEATH:
			case SOUND_SFX_CHEST_2:
			case SOUND_M_LEVEL_CLEAR:
			case SOUND_M_WORLDS_INIT:
			case SOUND_M_GERMANY:
			case SOUND_M_TIBET:
			case SOUND_M_TITLE:
			case SOUND_M_GAMEOVER:
				return 30;
			case SOUND_SFX_CHEST_1:
			case SOUND_SFX_MINE:
			case SOUND_SFX_WORKING:
			case SOUND_SFX_CHECKPOINT:
			case SOUND_SFX_BREAK:
			case SOUND_SFX_HOOKING:
			case SOUND_SFX_WATER:
				return 20;
			default:
				return 0;
		}
	}

	// $FF: renamed from: a (int) boolean
	/**
	 * Determines if the specified sound effect ID is a long-duration sound effect
	 * This method checks whether the specified sound effect resource is classified
	 * as long-duration, which is used to decide whether special resource cleanup
	 * is required for long-duration sound effects
	 * @param soundId The ID of the sound
	 */
	private static boolean isLongDurationSFX(int sfxId) {
		switch (sfxId) {
			case SOUND_SFX_SWITCH:
			case SOUND_SFX_HERO_HURT:
			case SOUND_SFX_HAMMER_HIT_UNBREAKABLE:
			case SOUND_SFX_MINE:
			case SOUND_SFX_WORKING:
			case SOUND_SFX_ENEMY_HURT:
			case SOUND_SFX_BREAK:
			case SOUND_SFX_HOOKING:
			case SOUND_SFX_WATER:
			case SOUND_SFX_BOULDER:
				return false;
			case SOUND_SFX_RIDDLE:
			case SOUND_SFX_DEATH:
			case SOUND_SFX_CHEST_1:
			case SOUND_SFX_CHEST_2:
			case SOUND_SFX_CHECKPOINT:
			default:
				return true;
		}
	}

	public final synchronized void run() {
		while(!stopSoundThreadLoop) {
			try {
				this.wait(); // Waiting for this.notify() call
			} catch (Exception var18) {
			}

			if (needFreeCrtPlayerResource) {
				try {
					if (isLongDurationSFX(crtSoundId)) {
						midiPlayers[crtSoundId].deallocate();
						previousSoundId = -1;
					}

					crtSoundId = -1;
					needFreeCrtPlayerResource = false;
				} catch (Exception var16) {
				} finally {
					crtSoundPriority = 0;
				}
			}

			if (newSoundId != -1) {
				try {
					// If the previous sound is different from the current sound
					// release the player resources of the previous sound
					if (previousSoundId != -1 && newSoundId != previousSoundId) {
						midiPlayers[previousSoundId].deallocate();
						previousSoundId = -1;
					}

					if (previousSoundId == -1) {
						midiPlayers[newSoundId].prefetch();
						previousSoundId = newSoundId;
					}

					midiPlayers[newSoundId].start();
					crtSoundId = newSoundId;
					crtSoundPriority = newSoundPriority;
					this.soundLoopStartTime = System.currentTimeMillis();
				} catch (Exception var14) {
				} finally {
					newSoundId = -1;
				}
			}
		}

	}

	// $FF: renamed from: b (int) void
	/**
	 * Play specified sound
	 * @param soundId The ID of the sound
	 * @note It has the same function as freeCrtPlayerResource
	 *       The specified sound may not be played due to the sound priority
	 *       or the interval between the last sound playback is too short
	 */
	public final synchronized void playSound(int soundId) {
		if (soundEnabled) {
			if (crtSoundId != -1) {
				// if (crtSoundPriority > getSoundPriority(soundId) || Math.abs(System.currentTimeMillis() - this.soundLoopStartTime) <= 50L) {
				if (crtSoundPriority >= getSoundPriority(soundId) && (crtSoundPriority != getSoundPriority(soundId) || Math.abs(System.currentTimeMillis() - this.soundLoopStartTime) <= 50L)) {
					return;
				}

				needFreeCrtPlayerResource = true;
			} else {
				crtSoundPriority = 0;
			}

			int priority;
			if ((priority = getSoundPriority(soundId)) >= crtSoundPriority) {
				newSoundId = soundId;
				newSoundPriority = priority;
				this.notify();
			}
		}

	}

	// $FF: renamed from: e () void
	/**
	 * Release the current player resource, reset crtSoundId and crtSoundPriority
	 */
	public final synchronized void freeCrtPlayerResource() {
		if (crtSoundId != -1) {
			needFreeCrtPlayerResource = true;
		}

		this.notify();
	}

	// $FF: renamed from: a () boolean
	public static synchronized boolean method_60() {
		return crtSoundId != -1;
	}

	public final void playerUpdate(Player player, String event, Object eventData) {
		if (midiPlayers != null && crtSoundId != -1 && event.equals("endOfMedia")) {
			this.freeCrtPlayerResource();
		}

	}
}
