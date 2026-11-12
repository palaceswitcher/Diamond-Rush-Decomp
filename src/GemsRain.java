import javax.microedition.lcdui.Graphics;

// $FF: renamed from: b
public final class GemsRain {
	// $FF: renamed from: a byte[][]
	public static byte[][] primaryGemGrid;
	// $FF: renamed from: a byte
	public static byte primaryScrollOffsetY = 0;
	// $FF: renamed from: b byte
	public static byte primaryScrollStepY = 4;
	// $FF: renamed from: a int
	public static int crtFrame = 0;
	// $FF: renamed from: b byte[][]
	public static byte[][] secondaryGemGrid;
	// $FF: renamed from: c byte
	public static byte secondaryScrollOffsetY = 0;
	// $FF: renamed from: d byte
	public static byte secondaryScrollStepY = 2;
	// $FF: renamed from: a boolean
	public static boolean secondaryLayerEnabled = false;
	// $FF: renamed from: b int
	public static int framesCount = 0;

	// $FF: renamed from: a (int) void
	public static void advanceGemRain(int var0) {
		primaryScrollOffsetY += primaryScrollStepY;
		if (primaryScrollOffsetY > 24) {
			primaryScrollOffsetY = 0;

			for(int var1 = 12; var1 >= 1; --var1) {
				for(int var2 = 0; var2 < 12; ++var2) {
					primaryGemGrid[var2][var1] = primaryGemGrid[var2][var1 - 1];
				}
			}

			seedTopGemRows(var0);
		}

		if (secondaryLayerEnabled) {
			secondaryScrollOffsetY += secondaryScrollStepY;
			if (secondaryScrollOffsetY > 24) {
				secondaryScrollOffsetY = 0;

				for(int var3 = 12; var3 >= 1; --var3) {
					for(int var4 = 0; var4 < 12; ++var4) {
						secondaryGemGrid[var4][var3] = secondaryGemGrid[var4][var3 - 1];
					}
				}

				seedTopGemRows(var0);
			}
		}

	}

	// $FF: renamed from: b (int) void
	public static void seedTopGemRows(int var0) {
		for(int var1 = 0; var1 < 12; ++var1) {
			primaryGemGrid[var1][0] = 0;
		}

		if (secondaryLayerEnabled) {
			for(int var4 = 0; var4 < 12; ++var4) {
				secondaryGemGrid[var4][0] = 0;
			}
		}

		int var2 = 0;

		for(int var3 = 0; var3 < var0; ++var3) {
			int var5;
			do {
				var5 = Utils.getRandomInt(0, 12);
			} while(primaryGemGrid[var5][0] != 0);

			var2 = Utils.getRandomInt(1, 3);
			primaryGemGrid[var5][0] = (byte)var2;
		}

		if (secondaryLayerEnabled) {
			for(int var9 = 0; var9 < var0; ++var9) {
				int var6;
				do {
					var6 = Utils.getRandomInt(0, 12);
				} while(secondaryGemGrid[var6][0] != 0);

				var2 = Utils.getRandomInt(1, 3);
				secondaryGemGrid[var6][0] = (byte)var2;
			}
		}

	}

	// $FF: renamed from: a (javax.microedition.lcdui.Graphics) void
	public static void drawGemRain(Graphics g) {
		for(int var1 = 0; var1 < 12; ++var1) {
			for(int var2 = 0; var2 < 13; ++var2) {
				if (primaryGemGrid[var1][var2] == 1) {
					cGame.field_320[cGame.method_149(2)].drawFrame(g, crtFrame, var1 * 24, (var2 - 1) * 24 + primaryScrollOffsetY, 0, 0, 0);
				} else if (primaryGemGrid[var1][var2] == 2) {
					cGame.field_320[cGame.method_149(2)].drawFrame(g, 0, var1 * 24, (var2 - 1) * 24 + primaryScrollOffsetY, 0, 0, 0);
				}
			}
		}

		if (secondaryLayerEnabled) {
			for(int var3 = 0; var3 < 12; ++var3) {
				for(int var4 = 0; var4 < 13; ++var4) {
					if (secondaryGemGrid[var3][var4] == 1 || secondaryGemGrid[var3][var4] == 2) {
						cGame.field_320[cGame.method_149(2)].drawFrame(g, 0, var3 * 24, (var4 - 1) * 24 + secondaryScrollOffsetY, 0, 0, 0);
					}
				}
			}
		}

		crtFrame = (crtFrame + 1) % framesCount;
	}
}
