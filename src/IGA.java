import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// $FF: renamed from: e
public final class IGA {
	// $FF: renamed from: a javax.microedition.lcdui.Image[]
	public static Image[] promotionImages;
	// $FF: renamed from: a a
	public static ASprite navigationArrowSprite;
	// $FF: renamed from: b a
	public static ASprite promotionFont;
	// $FF: renamed from: a java.lang.String[]
	public static String[] promotionLinks;
	// $FF: renamed from: b java.lang.String[]
	public static String[] promotionText;
	// $FF: renamed from: a int
	public static int crtPromotionPage;
	// $FF: renamed from: b int
	public static int promotionFrameCounter;
	// $FF: renamed from: c int
	public static int promotionScreenState;
	// $FF: renamed from: a boolean
	public boolean arrowOffsetDecreasing;
	// $FF: renamed from: d int
	public int arrowOffset;

	public IGA() {
		promotionImages = new Image[5];
		promotionLinks = new String[5];
	}

	// $FF: renamed from: a (java.lang.String) void
	private static void openPromotionLink(String var0) {
		if (var0 != null) {
			try {
				cGame.field_358.platformRequest(var0);
			} catch (Exception var2) {
			}
		}
	}

	// $FF: renamed from: a () void
	public static void loadPromotionScreen() {
		promotionFont = cGame.field_320[41];
		promotionFont._nLineSpacing = 1;
		navigationArrowSprite = cGame.loadGfxFile("/tips.f", 0);
		if (promotionText == null) {
			boolean var0 = false;
			promotionText = cGame.loadStringsFromFile("/lang_IGA.f", 15);
			promotionText[7] = cGame.getWrapText(promotionText[7], 170);
			promotionText[8] = cGame.getWrapText(promotionText[8], 170);
			promotionText[9] = cGame.getWrapText(promotionText[9], 170);
		}

		int var3 = 10;

		for(int var1 = 0; var3 <= 14; ++var1) {
			promotionLinks[var1] = cGame.field_358.getAppProperty(promotionText[var3]);
			if (promotionLinks[var1] != null && (promotionLinks[var1].compareTo("no") == 0 || promotionLinks[var1].compareTo("") == 0)) {
				promotionLinks[var1] = null;
			}

			++var3;
		}

		promotionText[3] = promotionText[3] + "\n\u0001\u0001" + promotionText[4] + "\n\u0001\u0000" + promotionText[5];
		promotionText[7] = new String("\u0001\u0000" + promotionText[7]);

		try {
			for(int var4 = 0; var4 < 4; ++var4) {
				promotionImages[var4] = Image.createImage("/ad" + (var4 + 1));
			}

			cGame.field_323[0] = new ASpriteInstance(cGame.loadGfxFile("/ui.f", 0), 0, 0, (ASpriteInstance)null);
		} catch (Exception var2) {
		}

		crtPromotionPage = 0;
		cGame.setPromotionScreenState(3);
	}

	// $FF: renamed from: a (int) void
	private static void movePromotionPage(int var0) {
		crtPromotionPage += var0;
		if (crtPromotionPage == 3 && promotionLinks[crtPromotionPage] == null) {
			crtPromotionPage += var0;
		}

		if (crtPromotionPage < 0) {
			crtPromotionPage = 4;
		} else if (crtPromotionPage == 5) {
			crtPromotionPage = 0;
		}
	}

	// $FF: renamed from: a (javax.microedition.lcdui.Graphics, int) void
	private static void drawBlinkingLinkPrompt(Graphics var0, int var1) {
		if (promotionLinks[crtPromotionPage] != null) {
			if (promotionFrameCounter % 30 >= 15) {
				String var2;
				if (crtPromotionPage >= 3) {
					var2 = promotionText[8];
				} else {
					var2 = promotionText[9];
				}

				promotionFont.UpdateStringSize(var2);
				int var3 = ASprite._text_w + 2;
				int var4 = promotionFont.getStringHeight(var2);
				int var6;
				if (var1 != 0) {
					var6 = 320 + var1 >> 1;
					var6 -= (byte) ((var4 >> 1) + 4); //NOTE: ADDED CAST
				} else {
					var6 = 160;
					var6 -= (byte) (var4 >> 1); //NOTE: ADDED CAST
				}

				int var5 = var6;
				var0.setClip(0, 0, 240, 320);
				var0.setColor(16711680);
				var0.fillRect(120 - (var3 >> 1) - 4, var5 - 4, var3 + 8, var4 + 8);
				promotionFont.DrawPage(var0, var2, 120, var5, 1);
			}
		}
	}

	// $FF: renamed from: b (javax.microedition.lcdui.Graphics) void
	private static void drawPromotionGradient(Graphics var0) {
		int var10 = 99;
		int var12 = 189;
		var0.setClip(0, 0, 240, 320);

		for(int var13 = 0; var13 < 16; ++var13) {
			var0.setColor(var10 << 16 | 0 | var12);
			var0.fillRect(0, 160 + 160 * var13 / 16, 240, 21);
			var0.fillRect(0, 160 - 160 * (var13 + 1) / 16, 240, 21);
			var10 -= 4;
			var12 -= 8;
		}

	}

	// $FF: renamed from: a (javax.microedition.lcdui.Graphics) void
	public final void drawAndHandlePromotionScreen(Graphics var1) {
		drawPromotionGradient(var1);
		int var2 = 0;
		if (crtPromotionPage != 3) {
			cGame.field_323[0]._sprite.drawFrame(var1, 11, 120, 15, 0, 0, 0);
		}

		switch (crtPromotionPage) {
			case 3:
				var1.drawImage(promotionImages[crtPromotionPage], 120, 15, 17);
				promotionFont.DrawPage(var1, promotionText[3], 120, 160, 3);
				promotionFont.UpdateStringSize(promotionText[3]);
				var2 = 160 + (ASprite._text_h >> 1) + 4;
				break;
			case 4:
				promotionFont.DrawPage(var1, "\n\u0001\u0002" + promotionText[6], 120, 35, 17);
				promotionFont.DrawPage(var1, promotionText[7], 120, 160, 3);
				promotionFont.UpdateStringSize(promotionText[7]);
				var2 = 160 + (ASprite._text_h >> 1) + 4;
				break;
			default:
				var1.drawImage(promotionImages[crtPromotionPage], 120, 240, 33);
				promotionFont.DrawPage(var1, promotionText[crtPromotionPage], 120, 242, 17);
				var2 = 0;
		}

		cGame.field_92.drawBackButton();
		if (promotionLinks[crtPromotionPage] != null) {
			cGame.field_92.drawOKButton();
		}

		drawBlinkingLinkPrompt(var1, var2);
		if (cGame.isKeyPressed(cGame.SKEY_NUM4|cGame.SKEY_LEFT)) {
			movePromotionPage(-1);
		} else if (cGame.isKeyPressed(cGame.SKEY_NUM6|cGame.SKEY_RIGHT)) {
			movePromotionPage(1);
		} else if (cGame.isKeyPressed(cGame.SKEY_NUM5|cGame.SKEY_CENTER_ALT|cGame.SKEY_LSH|cGame.SKEY_CENTER)) {
			openPromotionLink(promotionLinks[crtPromotionPage]);
		} else if (cGame.isKeyPressed(cGame.SKEY_RSH)) {
			cGame.field_92.openMenu(0);
			promotionScreenState = 2;
			cGame.keysPressed = 0;
		}

		navigationArrowSprite.drawAnimFrame(var1, cGame.isKeyPressed(cGame.SKEY_NUM4|cGame.SKEY_LEFT) ? 2 : 0, promotionFrameCounter % navigationArrowSprite.getAnimFrames(0), 20 + this.arrowOffset, 160, 0, 0, 0);
		navigationArrowSprite.drawAnimFrame(var1, cGame.isKeyPressed(cGame.SKEY_NUM6|cGame.SKEY_RIGHT) ? 3 : 1, promotionFrameCounter % navigationArrowSprite.getAnimFrames(1), 220 - this.arrowOffset, 160, 0, 0, 0);
		this.arrowOffset += this.arrowOffsetDecreasing ? -1 : 1;
		if (this.arrowOffset > 3 || this.arrowOffset < 1) {
			this.arrowOffsetDecreasing = !this.arrowOffsetDecreasing;
		}

		cGame.keysPressed = 0;
	}

	// $FF: renamed from: b () void
	public static void releasePromotionResources() {
		boolean var0 = false;
		int var1 = promotionImages.length;

		for(int var2 = 0; var2 < var1; ++var2) {
			promotionImages[var2] = null;
		}

		promotionImages = null;
		var1 = promotionLinks.length;

		for(int var3 = 0; var3 < var1; ++var3) {
			promotionLinks[var3] = null;
		}

		promotionLinks = null;
		var1 = promotionText.length;

		for(int var4 = 0; var4 < var1; ++var4) {
			promotionText[var4] = null;
		}

		promotionText = null;
		promotionFont = null;
		navigationArrowSprite = null;
		promotionScreenState = 0;
		System.gc();
	}
}
