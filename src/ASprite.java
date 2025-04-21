import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// $FF: renamed from: a
public final class ASprite {
	private static final short ARGB8888 = (short) 0x8888;
	private static final short ARGB4444 = 0x4444;
	private static final short ARGB1555 = 0x5515;
	private static final short RGB565 = 0x6505;
	private static final short UNC_8BPP = 0x5602;
	private static final short UNC_4BPP = 0x1600;
	private static final short UNC_2BPP = 0x0400;
	private static final short UNC_1BPP = 0x0200;
	private static final short RLE_8BPP = 0x56F2;
	private static final short RLE_7BPP = 0x27F1;
	// $FF: renamed from: a int[]
	public static int[] argbBitmapData = new int[4096];
	// $FF: renamed from: a byte[]
	public byte[] spriteDims;
	// $FF: renamed from: b byte[]
	public byte[] field_7;
	// $FF: renamed from: a short[]
	public short[] field_8;
	// $FF: renamed from: c byte[]
	public byte[] field_9;
	// $FF: renamed from: d byte[]
	public byte[] spriteDefs;
	// $FF: renamed from: e byte[]
	public byte[] field_11;
	// $FF: renamed from: b short[]
	public short[] field_12;
	// $FF: renamed from: f byte[]
	public byte[] field_13;
	// $FF: renamed from: a int[][]
	public int[][] field_14;
	// $FF: renamed from: b int[][]
	public int[][] palettes;
	// $FF: renamed from: a int
	public int paletteCount;
	// $FF: renamed from: b int
	public int spritePalette;
	// $FF: renamed from: a boolean
	public boolean isTransparent;
	// $FF: renamed from: a short
	public short bitDepth;
	// $FF: renamed from: g byte[]
	public byte[] bitmapData;
	// $FF: renamed from: c short[]
	public short[] bitmapInds;
	// $FF: renamed from: a javax.microedition.lcdui.Image[][]
	public Image[][] sprites;
	// $FF: renamed from: c int
	public static int drawnTextWidth;
	// $FF: renamed from: d int
	public static int drawnTextHeight;
	// $FF: renamed from: h byte[]
	public static byte[] field_25;
	// $FF: renamed from: e int
	public int field_26 = 0;
	// $FF: renamed from: f int
	public static int field_27 = -1;
	// $FF: renamed from: g int
	public static int field_28 = -1;

	// $FF: renamed from: a (byte[], int) void
	/**
	 * Initializes graphics with graphical data
	 * @param data Graphical data
	 * @param index Starting index of the graphical data, including the signature
	 */
	public final void loadData(byte[] data, int index) {
		try {
			System.gc();
			++index;
			++index;
			boolean var3 = false;
			++index;
			++index;
			++index;
			++index;
			short spriteDimCount; //Amount of image dimensions present
			if ((spriteDimCount = (short)((data[index++] & 0xFF) + ((data[index++] & 0xFF) << 8))) > 0) {
				this.spriteDims = new byte[spriteDimCount << 1];
				System.arraycopy(data, index, this.spriteDims, 0, this.spriteDims.length);
				index += this.spriteDims.length;
			}

			short spriteDefCount;
			if ((spriteDefCount = (short)((data[index++] & 0xFF) + ((data[index++] & 0xFF) << 8))) > 0) {
				this.spriteDefs = new byte[spriteDefCount << 2];
				System.arraycopy(data, index, this.spriteDefs, 0, this.spriteDefs.length);
				index += this.spriteDefs.length;
			}

			short var7;
			if ((var7 = (short)((data[index++] & 0xFF) + ((data[index++] & 0xFF) << 8))) > 0) {
				this.field_7 = new byte[var7];
				this.field_8 = new short[var7];

				for(int i = 0; i < var7; i++) {
					this.field_7[i] = data[index++];
					++index;
					this.field_8[i] = (short)((data[index++] & 0xFF) + ((data[index++] & 0xFF) << 8));
				}

				int var53 = var7 << 2;
				this.field_9 = new byte[var53];

				for(int i = 0; i < var53; i++) {
					this.field_9[i] = data[index++];
				}
			}

			short var54;
			if ((var54 = (short)((data[index++] & 0xFF) + ((data[index++] & 0xFF) << 8))) > 0) {
				this.field_13 = new byte[var54 * 5];
				System.arraycopy(data, index, this.field_13, 0, this.field_13.length);
				index += this.field_13.length;
			}

			short var55;
			if ((var55 = (short)((data[index++] & 0xFF) + ((data[index++] & 0xFF) << 8))) > 0) {
				this.field_11 = new byte[var55];
				this.field_12 = new short[var55];

				for(int i = 0; i < var55; i++) {
					this.field_11[i] = data[index++];
					++index;
					this.field_12[i] = (short)((data[index++] & 0xFF) + ((data[index++] & 0xFF) << 8));
				}
			}

			if (spriteDimCount <= 0) {
				System.gc();
			} else {
				short paletteFormat = (short)((data[index++] & 0xFF) + ((data[index++] & 0xFF) << 8));
				this.paletteCount = data[index++] & 0xFF;
				int paletteSize = data[index++] & 0xFF;
				this.palettes = new int[16][];

				for(int i = 0; i < this.paletteCount; i++) {
					this.palettes[i] = new int[paletteSize];
					switch (paletteFormat) {
						case ARGB8888:
							for(int c = 0; c < paletteSize; c++) {
								int palColor;
								if (((palColor = (data[index++] & 0xFF) + ((data[index++] & 0xFF) << 8) + ((data[index++] & 0xFF) << 16) + ((data[index++] & 0xFF) << 24)) & 0xFF000000) != 0xFF000000) {
									this.isTransparent = true;
								}

								this.palettes[i][c] = palColor;
							}
							break;
						case ARGB4444:
							for(int c = 0; c < paletteSize; c++) {
								int palColor;
								if (((palColor = (data[index++] & 0xFF) + ((data[index++] & 0xFF) << 8)) & 0xF000) != 61440) {
									this.isTransparent = true;
								}

								this.palettes[i][c] = (palColor & 0xF000) << 16 | (palColor & 0xF000) << 12 | (palColor & 0xF00) << 12 | (palColor & 0xF00) << 8 | (palColor & 0xF0) << 8 | (palColor & 0xF0) << 4 | (palColor & 0xF) << 4 | palColor & 0xF;
							}
							break;
						case ARGB1555:
							for(int c = 0; c < paletteSize; c++) {
								int palColor = (data[index++] & 0xFF) + ((data[index++] & 0xFF) << 8);
								int alpha = 0xFF000000;
								if ((palColor & 0x8000) != 0x8000) {
									alpha = 0; //No transparency if transparency bit is clear
									this.isTransparent = true;
								}

								this.palettes[i][c] = alpha | (palColor & 0x7C00) << 9 | (palColor & 0x3E0) << 6 | (palColor & 0x1F) << 3;
							}
							break;
						case RGB565:
							for(int c = 0; c < paletteSize; c++) {
								int palColor = (data[index++] & 0xFF) + ((data[index++] & 0xFF) << 8);
								int alpha = 0xFF000000;
								if (palColor == 0xF81F) {
									alpha = 0;
									this.isTransparent = true;
								}

								this.palettes[i][c] = alpha | (palColor & 0xF800) << 8 | (palColor & 0x7E0) << 5 | (palColor & 0x1F) << 3;
							}
					}
				}

				this.bitDepth = (short)((data[index++] & 0xFF) + ((data[index++] & 0xFF) << 8));
				if (spriteDimCount > 0) {
					this.bitmapInds = new short[spriteDimCount];
					int bitmapIndex = 0;
					int bitmapDataInd = index;

					for(int i = 0; i < spriteDimCount; i++) {
						short bitmapSize = (short)((data[bitmapDataInd++] & 0xFF) + ((data[bitmapDataInd++] & 0xFF) << 8)); //Get size of current bitmap image
						this.bitmapInds[i] = (short)bitmapIndex;
						bitmapDataInd += bitmapSize; //Move to next bitmap image
						bitmapIndex += bitmapSize;
					}

					this.bitmapData = new byte[bitmapIndex];
					for(int i = 0; i < spriteDimCount; i++) {
						short bitmapSize = (short)((data[index++] & 0xFF) + ((data[index++] & 0xFF) << 8));
						System.arraycopy(data, index, this.bitmapData, this.bitmapInds[i] & 0xFFFF, bitmapSize); //Copy current bitmap image to bitmap data buffer
						index += bitmapSize; //Move to next bitmap image
					}
				}

				System.gc();
			}
		} catch (Exception var16) {
			((Throwable)var16).printStackTrace();
		}
	}

	// $FF: renamed from: a (int, int, int, int) void
	/**
	 * Initialize a range of sprites from bitmap data or copy them from one palette to another. Setting copyPalette to -1 will initialize the sprites from bitmap data.
	 * @param palette Palette number
	 * @param start Starting image number
	 * @param stop Last image number, last image if -1
	 * @param copyPalette Palette to copy the sprites from, sprites are constructed from bitmap data if -1.
	 */
	public final void initSprites(int palette, int start, int stop, int copyPalette) {
		if (this.spriteDims != null) {
			if (stop == -1) {
				stop = (this.spriteDims.length >> 1) - 1; //Get all sprites up to the last
			}

			if (this.sprites == null) {
				this.sprites = new Image[this.paletteCount][];
			}

			if (this.sprites[palette] == null) {
				this.sprites[palette] = new Image[this.spriteDims.length >> 1];
			}

			if (copyPalette >= 0) {
				// Copy from one palette to another
				for (int i = start; i <= stop; i++) {
					this.sprites[palette][i] = this.sprites[copyPalette][i]; 
				}
			} else {
				int var14 = this.spritePalette;
				this.spritePalette = palette;
				System.gc();

				for (int i = start; i <= stop; i++) {
					int var7 = i << 1;
					int spriteWidth = this.spriteDims[var7] & 0xFF; //Get width
					int spriteHeight = this.spriteDims[var7 + 1] & 0xFF; //Get height
					int[] argbData;
					if (spriteWidth > 0 && spriteHeight > 0 && (argbData = this.method_11(i)) != null) {
						boolean sprIsTransparent = false;
						int spritePixelCount = spriteWidth * spriteHeight;

						for(int j = 0; j < spritePixelCount; j++) {
							if ((argbData[j] & 0xFF000000) != 0xFF000000) {
								sprIsTransparent = true;
								break;
							}
						}

						this.sprites[palette][i] = Image.createRGBImage(argbData, spriteWidth, spriteHeight, sprIsTransparent);
					}
				}

				System.gc();
				this.spritePalette = var14;
			}

			System.gc();
		}
	}

	// $FF: renamed from: a (int) void
	public final void method_2(int var1) {
		if (this.spriteDims != null) {
			if (this.sprites != null) {
				if (this.sprites[var1] != null) {
					for(int i = 0; i < this.sprites[var1].length; i++) {
						this.sprites[var1][i] = null;
					}

					this.sprites[var1] = null;
					--this.paletteCount;
				}
			}
		}
	}

	public final String toString() {
		new String();
		Object var1 = null;
		int var2 = 0;

		for(int i = 0; i < this.spriteDims.length / 2; i++) {
			var2 += 2 * (this.spriteDims[2 * i] & 0xFF) * (this.spriteDims[2 * i + 1] & 0xFF);
		}

		return "raw/full: " + this.bitmapData.length + "/" + var2;
	}

	// $FF: renamed from: a (int, int) int
	public final int method_3(int var1, int var2) {
		return this.field_13[(this.field_12[var1] + var2) * 5 + 1] & 0xFF;
	}

	// $FF: renamed from: a (int) int
	public final int method_4(int var1) {
		return this.field_11[var1] & 0xFF;
	}

	// $FF: renamed from: b (int) int
	public final int method_5(int var1) {
		return this.field_7[var1] & 0xFF;
	}

	// $FF: renamed from: a (java.lang.String) int
	public final int method_6(String var1) {
		int lineCount = 1;
		int strLen = var1.length();

		// Count amount of lines in string
		for(int i = var1.indexOf('\n'); i != -1; i = i < strLen - 1 ? var1.indexOf('\n', i + 1) : -1) {
			++lineCount;
		}

		return this.field_26 * (lineCount - 1) + this.spriteDims[1] * lineCount;
	}

	// $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int, int, int) void
	public final void method_7(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = (this.field_12[var2] + var3) * 5;
		int var10 = this.field_13[var9] & 0xFF;
		if ((var6 & 32) != 0) {
			var7 = (var6 & 1) != 0 ? var7 + this.field_13[var9 + 2] : var7 - this.field_13[var9 + 2];
			var8 = (var6 & 2) != 0 ? var8 + this.field_13[var9 + 3] : var8 - this.field_13[var9 + 3];
		}

		this.method_8(var1, var10, var4 - var7, var5 - var8, var6 ^ this.field_13[var9 + 4] & 15, var7, var8);
	}

	// $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int, int) void
	public final void method_8(Graphics var1, int var2, int spriteBoxX, int spriteBoxY, int var5, int var6, int var7) {
		int var8 = this.field_7[var2] & 0xFF;

		for(int i = 0; i < var8; i++) {
			this.method_9(var1, var2, i, spriteBoxX, spriteBoxY, var5);
		}

	}

	// $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int) void
	public final void method_9(Graphics var1, int var2, int var3, int spriteBoxX, int spriteBoxY, int var6) {
		int var7 = this.field_8[var2] + var3 << 2;
		int var8 = this.spriteDefs[var7 + 3] & 0xFF;
		int var9 = this.spriteDefs[var7] & 0xFF;
		spriteBoxX = (var6 & 1) != 0 ? spriteBoxX - this.spriteDefs[var7 + 1] : spriteBoxX + this.spriteDefs[var7 + 1];
		spriteBoxY = (var6 & 2) != 0 ? spriteBoxY - this.spriteDefs[var7 + 2] : spriteBoxY + this.spriteDefs[var7 + 2];
		if ((var6 & 1) != 0) {
			spriteBoxX -= this.spriteDims[var9 << 1] & 0xFF;
		}

		if ((var6 & 2) != 0) {
			spriteBoxY -= this.spriteDims[(var9 << 1) + 1] & 0xFF;
		}

		this.method_10(var1, var9, spriteBoxX, spriteBoxY, var6 ^ var8 & 15);
	}

	// $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int) void
	public final void method_10(Graphics var1, int var2, int spriteBoxX, int spriteBoxY, int var5) {
		int var6 = var2 << 1;
		int spriteBoxWidth = this.spriteDims[var6] & 0xFF;
		int spriteBoxHeight = this.spriteDims[var6 + 1] & 0xFF;
		if (spriteBoxWidth > 0 && spriteBoxHeight > 0) {
			Image var9 = null;
			if (this.sprites != null && this.sprites[this.spritePalette] != null) {
				var9 = this.sprites[this.spritePalette][var2];
			}

			if (var9 == null) {
				int[] rawImgData;
				if ((rawImgData = this.method_11(var2)) == null) {
					return;
				}

				var9 = Image.createRGBImage(rawImgData, spriteBoxWidth, spriteBoxHeight, this.isTransparent);
			}

			spriteBoxWidth = var9.getWidth();
			spriteBoxHeight = var9.getHeight();
			Graphics var10000;
			Image var10001;
			byte var10002;
			byte var10003;
			int var10004;
			int var10005;
			byte spriteTransform;
			if ((var5 & 1) != 0) {
				if ((var5 & 2) != 0) {
					var10000 = var1;
					var10001 = var9;
					var10002 = 0;
					var10003 = 0;
					var10004 = spriteBoxWidth;
					var10005 = spriteBoxHeight;
					spriteTransform = 3;
				} else {
					var10000 = var1;
					var10001 = var9;
					var10002 = 0;
					var10003 = 0;
					var10004 = spriteBoxWidth;
					var10005 = spriteBoxHeight;
					spriteTransform = 2;
				}
			} else if ((var5 & 2) != 0) {
				var10000 = var1;
				var10001 = var9;
				var10002 = 0;
				var10003 = 0;
				var10004 = spriteBoxWidth;
				var10005 = spriteBoxHeight;
				spriteTransform = 1;
			} else {
				var10000 = var1;
				var10001 = var9;
				var10002 = 0;
				var10003 = 0;
				var10004 = spriteBoxWidth;
				var10005 = spriteBoxHeight;
				spriteTransform = 0;
			}

			var10000.drawRegion(var10001, var10002, var10003, var10004, var10005, spriteTransform, spriteBoxX, spriteBoxY, 0);
		}
	}

	// $FF: renamed from: a (int) int[]
	private int[] method_11(int var1) {
		if (this.bitmapData != null && this.bitmapInds != null) {
			int var2 = var1 << 1;
			int spriteWidth = this.spriteDims[var2] & 0xFF; //Get width
			int spriteHeight = this.spriteDims[var2 + 1] & 0xFF; //Get height
			int[] var5 = argbBitmapData;
			int[] palette; //Palette
			if ((palette = this.palettes[this.spritePalette]) == null) {
				return null;
			} else {
				byte[] var7 = this.bitmapData; //(Reference) Bitmap data
				int var8 = this.bitmapInds[var1] & 0xFFFF; //Get index for image
				int argbBitmapInd = 0;
				int spritePixelCount = spriteWidth * spriteHeight; //Total amount of pixels
				if (this.bitDepth != RLE_7BPP) {
					if (this.bitDepth == UNC_4BPP) {
						while(argbBitmapInd < spritePixelCount) {
							var5[argbBitmapInd++] = palette[var7[var8] >> 4 & 0xF];
							var5[argbBitmapInd++] = palette[var7[var8] & 0xF];
							++var8;
						}
					} else if (this.bitDepth == UNC_2BPP) {
						while(argbBitmapInd < spritePixelCount) {
							var5[argbBitmapInd++] = palette[var7[var8] >> 6 & 3];
							var5[argbBitmapInd++] = palette[var7[var8] >> 4 & 3];
							var5[argbBitmapInd++] = palette[var7[var8] >> 2 & 3];
							var5[argbBitmapInd++] = palette[var7[var8] & 3];
							++var8;
						}
					} else if (this.bitDepth == UNC_1BPP) {
						while(argbBitmapInd < spritePixelCount) {
							var5[argbBitmapInd++] = palette[var7[var8] >> 7 & 1];
							var5[argbBitmapInd++] = palette[var7[var8] >> 6 & 1];
							var5[argbBitmapInd++] = palette[var7[var8] >> 5 & 1];
							var5[argbBitmapInd++] = palette[var7[var8] >> 4 & 1];
							var5[argbBitmapInd++] = palette[var7[var8] >> 3 & 1];
							var5[argbBitmapInd++] = palette[var7[var8] >> 2 & 1];
							var5[argbBitmapInd++] = palette[var7[var8] >> 1 & 1];
							var5[argbBitmapInd++] = palette[var7[var8] & 1];
							++var8;
						}
					} else if (this.bitDepth == UNC_8BPP) {
						while(argbBitmapInd < spritePixelCount) {
							var5[argbBitmapInd++] = palette[var7[var8++] & 0xFF];
						}
					} else if (this.bitDepth == RLE_8BPP) {
						while(argbBitmapInd < spritePixelCount) {
							int var26;
							// If not RLE tag
							if ((var26 = var7[var8++] & 0xFF) > 127) {
								for(int i = var26 - 0x80;
									i-- > 0;
									var5[argbBitmapInd++] = palette[var7[var8++] & 0xFF]) {}
							// If RLE tag
							} else {
								for(int i = palette[var7[var8++] & 0xFF];
									var26-- > 0;
									var5[argbBitmapInd++] = i) {}
							}
						}
					}
				} else {
					while(argbBitmapInd < spritePixelCount) {
						int var11;
						// If RLE tag
						if ((var11 = var7[var8++] & 0xFF) > 127) {
							int var12 = var7[var8++] & 0xFF;
							int var13 = palette[var12];

							for(int i = var11 - 0x80;
								i-- > 0;
								var5[argbBitmapInd++] = var13) {}
						// If uncompressed data
						} else {
							var5[argbBitmapInd++] = palette[var11];
						}
					}
				}

				return var5;
			}
		} else {
			return null;
		}
	}

	// $FF: renamed from: a (java.lang.String) void
	/**
	 * Updates the dimensions of a drawn text string for the graphics file
	 * @param str
	 */
	public final void updateDrawnTextSize(String str) {
		drawnTextWidth = 0;
		drawnTextHeight = this.spriteDims[1] & 0xFF;
		int textPixelWidth = 0; //Width of the rendered text
		int strStart = field_27 >= 0 ? field_27 : 0;
		int strLen = field_28 >= 0 ? field_28 : str.length();

		for(int i = strStart; i < strLen; i++) {
			int charSubsprite;
			char var6 = str.charAt(i);
			if (var6 > ' ') {
				charSubsprite = field_25[var6] & 0xFF;
			} else {
				if (var6 == ' ') {
					textPixelWidth += (this.spriteDims[0] & 0xFF) + this.spriteDefs[1];
					continue;
				}

				if (var6 == '\n') {
					if (textPixelWidth > drawnTextWidth) {
						drawnTextWidth = textPixelWidth;
					}

					textPixelWidth = 0;
					drawnTextHeight += this.field_26 + (this.spriteDims[1] & 0xFF);
					continue;
				}

				if (var6 == 1) {
					i++;
					continue;
				}

				if (var6 != 2) {
					continue;
				}

				i++;
				charSubsprite = str.charAt(i);
			}

			var6 = (char) charSubsprite; //NOTE: CAST ADDED
			if (charSubsprite >= this.method_5(0)) {
				int var7 = var6 - this.method_5(0);
				textPixelWidth += ((this.field_9[(var7 << 2) + 2] & 0xFF) - (this.field_9[var7 << 2] & 0xFF)) + this.spriteDefs[1];
			} else {
				int charSprite = (this.spriteDefs[var6 << 2] & 0xFF) << 1; //Get sprite number of subsprite
				textPixelWidth += ((this.spriteDims[charSprite] & 0xFF) - (this.spriteDefs[(var6 << 2) + 1])) + this.spriteDefs[1];
			}
		}

		if (textPixelWidth > drawnTextWidth) {
			drawnTextWidth = textPixelWidth;
		}

		if (drawnTextWidth > 0) {
			drawnTextWidth -= this.spriteDefs[1];
		}

	}

	// $FF: renamed from: a (javax.microedition.lcdui.Graphics, java.lang.String, int, int, int) void
	public final void method_13(Graphics var1, String var2, int var3, int var4, int var5) {
		var4 -= this.spriteDefs[2];
		if ((var5 & 43) != 0) {
			label79: {
				label74: {
					this.updateDrawnTextSize(var2);
					int var10000;
					int var10001;
					if ((var5 & 8) != 0) {
						var10000 = var3;
						var10001 = drawnTextWidth;
					} else {
						if ((var5 & 1) == 0) {
							break label74;
						}

						var10000 = var3;
						var10001 = drawnTextWidth >> 1;
					}

					var3 = var10000 - var10001;
				}

				int var17;
				int var20;
				if ((var5 & 32) != 0) {
					var17 = var4;
					var20 = drawnTextHeight;
				} else {
					if ((var5 & 2) == 0) {
						break label79;
					}

					var17 = var4;
					var20 = drawnTextHeight >> 1;
				}

				var4 = var17 - var20;
			}
		}

		int var6 = var3;
		int var7 = var4;
		int var8 = this.spritePalette;
		int var9 = field_27 >= 0 ? field_27 : 0;
		int var10 = field_28 >= 0 ? field_28 : var2.length();

		for(int var11 = var9; var11 < var10; ++var11) {
			int var19;
			int var22;
			label81: {
				char var12;
				if ((var12 = var2.charAt(var11)) > 32) {
					var19 = field_25[var12] & 0xFF;
				} else {
					if (var12 == 32) {
						var19 = var6;
						var22 = this.spriteDims[0] & 0xFF;
						break label81;
					}

					if (var12 == 10) {
						var6 = var3;
						var7 += this.field_26 + (this.spriteDims[1] & 0xFF);
						continue;
					}

					if (var12 == 1) {
						++var11;
						this.spritePalette = var2.charAt(var11);
						continue;
					}

					if (var12 != 2) {
						continue;
					}

					++var11;
					var19 = var2.charAt(var11);
				}

				var12 = (char) var19; //NOTE: ADDED CAST
				int var10002;
				if (var19 >= this.method_5(0)) {
					int var13 = var12 - this.method_5(0);
					this.method_8(var1, var13, var6, var7, 0, 0, 0);
					var19 = var6;
					var22 = this.field_9[(var13 << 2) + 2] & 0xFF;
					var10002 = this.field_9[var13 << 2] & 0xFF;
				} else {
					int var16 = (this.spriteDefs[var12 << 2] & 0xFF) << 1;
					this.method_9(var1, 0, var12, var6, var7, 0);
					var19 = var6;
					var22 = this.spriteDims[var16] & 0xFF;
					var10002 = this.spriteDefs[(var12 << 2) + 1];
				}

				var22 -= var10002;
			}

			var6 = var19 + var22 + this.spriteDefs[1];
		}

		this.spritePalette = var8;
	}

	// $FF: renamed from: b (javax.microedition.lcdui.Graphics, java.lang.String, int, int, int) void
	public final void method_14(Graphics var1, String var2, int var3, int var4, int var5) {
		int var6 = 0;
		int var7 = var2.length();
		int[] var8 = new int[100];

		for(int var9 = 0; var9 < var7; ++var9) {
			if (var2.charAt(var9) == '\n') {
				var8[var6++] = var9;
			}
		}

		int var12;
		label33: {
			var8[var6++] = var7;
			var12 = this.field_26 + (this.spriteDims[1] & 0xFF);
			int var14;
			int var10000;
			if ((var5 & 32) != 0) {
				var10000 = var4;
				var14 = var12 * (var6 - 1);
			} else {
				if ((var5 & 2) == 0) {
					break label33;
				}

				var10000 = var4;
				var14 = var12 * (var6 - 1) >> 1;
			}

			var4 = var10000 - var14;
		}

		for(int var10 = 0; var10 < var6; ++var10) {
			field_27 = var10 > 0 ? var8[var10 - 1] + 1 : 0;
			field_28 = var8[var10];
			this.method_13(var1, var2, var3, var4 + var10 * var12, var5);
		}

		field_27 = -1;
		field_28 = -1;
	}

	// $FF: renamed from: a (boolean) void
	public final void method_15(boolean var1) {
		this.spriteDims = null;
		this.field_7 = null;
		this.field_8 = null;
		this.field_9 = null;
		this.spriteDefs = null;
		this.field_11 = null;
		this.field_12 = null;
		this.field_13 = null;
		if (this.field_14 != null) {
			for(int i = 0; i < this.field_14.length; i++) {
				this.field_14[i] = null;
			}

			this.field_14 = (int[][])null;
		}

		if (this.palettes != null) {
			for(int i = 0; i < this.palettes.length; i++) {
				this.palettes[i] = null;
			}

			this.palettes = (int[][])null;
		}

		this.bitmapData = null;
		this.bitmapInds = null;
		if (var1 && this.sprites != null) {
			for(int i = 0; i < this.sprites.length; i++) {
				if (this.sprites[i] != null) {
					for(int j = 0; j < this.sprites[i].length; j++) {
						this.sprites[i][j] = null;
					}
				}
			}

			this.sprites = (Image[][])null;
		}

	}
}
