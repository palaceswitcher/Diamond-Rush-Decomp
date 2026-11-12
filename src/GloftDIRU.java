import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public final class GloftDIRU extends MIDlet {
	// $FF: renamed from: a byte[]
	public static byte[] gameVersion = null;
	// $FF: renamed from: a i
	public cGame gameCanvas;
	// $FF: renamed from: a javax.microedition.lcdui.Display
	public Display display;

	public GloftDIRU() {
		gameVersion = this.getAppProperty("MIDlet-Version").getBytes();
		this.gameCanvas = new cGame(this);
	}

	public final void startApp() throws MIDletStateChangeException {
		if (this.display == null) {
			this.display = Display.getDisplay(this);
		}

		this.display.setCurrent(this.gameCanvas);
		this.gameCanvas.resumeGameCanvas();
	}

	public final void pauseApp() {
		this.gameCanvas.pauseGameCanvas();
		this.notifyPaused();
	}

	public final void destroyApp(boolean var1) throws MIDletStateChangeException {
		this.notifyDestroyed();
	}

	// $FF: renamed from: a () void
	public final void exitGame() {
		cGame.requestGameLoopExit();
		this.gameCanvas.soundEngine.releaseMidiPlayersAndStopThread(); // Release sound player resources
		this.releaseDisplayReferences();

		try {
			this.destroyApp(true);
		} catch (MIDletStateChangeException var2) {
		}
	}

	// $FF: renamed from: b () void
	private void releaseDisplayReferences() {
		this.gameCanvas = null;
		this.display = null;
		System.gc();
	}
}
