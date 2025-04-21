import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public final class GloftDIRU extends MIDlet {
   // $FF: renamed from: a byte[]
   public static byte[] field_574 = null;
   // $FF: renamed from: a i
   public cGame field_575;
   // $FF: renamed from: a javax.microedition.lcdui.Display
   public Display field_576;

   public GloftDIRU() {
      field_574 = ((MIDlet)this).getAppProperty("MIDlet-Version").getBytes();
      this.field_575 = new cGame(this);
   }

   public final void startApp() throws MIDletStateChangeException {
      if (this.field_576 == null) {
         this.field_576 = Display.getDisplay(this);
      }

      this.field_576.setCurrent(this.field_575);
      this.field_575.method_292();
   }

   public final void pauseApp() {
      this.field_575.method_291();
      ((MIDlet)this).notifyPaused();
   }

   public final void destroyApp(boolean var1) throws MIDletStateChangeException {
      ((MIDlet)this).notifyDestroyed();
   }

   // $FF: renamed from: a () void
   public final void method_443() {
      cGame.method_289();
      this.field_575.field_353.method_55();
      this.method_444();

      try {
         this.destroyApp(true);
      } catch (MIDletStateChangeException var2) {
      }
   }

   // $FF: renamed from: b () void
   private void method_444() {
      this.field_575 = null;
      this.field_576 = null;
      System.gc();
   }
}
