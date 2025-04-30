import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.game.Sprite;

// $FF: renamed from: a
public final class ASprite {
	public static final short PIXEL_FORMAT_8888     = (short) 0x8888;
	public static final short PIXEL_FORMAT_4444     = (short) 0x4444;
	public static final short PIXEL_FORMAT_1555     = (short) 0x5515;
	public static final short PIXEL_FORMAT_0565     = (short) 0x6505;

	public static final short ENCODE_FORMAT_I256    = 0x5602;
	public static final short ENCODE_FORMAT_I16     = 0x1600;
	public static final short ENCODE_FORMAT_I4      = 0x0400;
	public static final short ENCODE_FORMAT_I2      = 0x0200;
	public static final short ENCODE_FORMAT_I256RLE = 0x56F2;
	public static final short ENCODE_FORMAT_I127RLE = 0x27F1;

	public static final short FLAG_FLIP_X           = 0x1;
	public static final short FLAG_FLIP_Y           = 0x2;
	public static final short FLAG_OFFSET_AF        = 0x20;

	// $FF: renamed from: a int[]
	public static int[] temp = new int[4*1024];
	// $FF: renamed from: a byte[]
	public byte[] _modules;
	// $FF: renamed from: b byte[]
	public byte[] _frames_nfm;
	// $FF: renamed from: a short[]
	public short[] _frames_fm_start;
	// $FF: renamed from: c byte[]
	public byte[] _frames_rc;
	// $FF: renamed from: d byte[]
	public byte[] _fmodules;
	// $FF: renamed from: e byte[]
	public byte[] _anims_naf;
	// $FF: renamed from: b short[]
	public short[] _anims_af_start;
	// $FF: renamed from: f byte[]
	public byte[] _aframes;
	// $FF: renamed from: a int[][]
	public int[][] _map;
	// $FF: renamed from: b int[][]
	public int[][] _pal;
	// $FF: renamed from: a int
	public int _palettes;
	// $FF: renamed from: b int
	public int _crt_pal;
	// $FF: renamed from: a boolean
	public boolean _alpha;
	// $FF: renamed from: a short
	public short _data_format;
	// $FF: renamed from: g byte[]
	public byte[] _modules_data;
	// $FF: renamed from: c short[]
	public short[] _modules_data_off;
	// $FF: renamed from: a javax.microedition.lcdui.Image[][]
	public Image[][] _modules_image;
	// $FF: renamed from: c int
	public static int _text_w;
	// $FF: renamed from: d int
	public static int _text_h;
	// $FF: renamed from: h byte[]
	public static byte[] _pMapChar;
	// $FF: renamed from: e int
	public int _nLineSpacing = 0;
	// $FF: renamed from: f int
	public static int _index1 = -1;
	// $FF: renamed from: g int
	public static int _index2 = -1;

	// $FF: renamed from: a (byte[], int) void
	//------------------------------------------------------------------------------
	// Load the sprite from the given byte array
	// @param file A byte array containing a sprite file
	// @param offset The offset inside the array at which to start reading
	//------------------------------------------------------------------------------
	public final void Load(byte[] file, int offset) {
		try {
			System.gc();
			++offset;
			++offset;
			++offset;
			++offset;
			++offset;
			++offset;
			short nModules; //Amount of image dimensions present
			if ((nModules = (short)((file[offset++] & 0xFF) + ((file[offset++] & 0xFF) << 8))) > 0) {
				this._modules = new byte[nModules * 2];
				System.arraycopy(file, offset, this._modules, 0, this._modules.length);
				offset += this._modules.length;
			}

			short nFModules;
			if ((nFModules = (short)((file[offset++] & 0xFF) + ((file[offset++] & 0xFF) << 8))) > 0) {
				this._fmodules = new byte[nFModules * 4];
				System.arraycopy(file, offset, this._fmodules, 0, this._fmodules.length);
				offset += this._fmodules.length;
			}

			short nFrames;
			if ((nFrames = (short)((file[offset++] & 0xFF) + ((file[offset++] & 0xFF) << 8))) > 0) {
				this._frames_nfm = new byte[nFrames];
				this._frames_fm_start = new short[nFrames];

				for (int i = 0; i < nFrames; i++) {
					this._frames_nfm[i] = file[offset++];
					++offset;
					this._frames_fm_start[i] = (short)((file[offset++] & 0xFF) + ((file[offset++] & 0xFF) << 8));
				}

				int nFRectSize = nFrames << 2;
				this._frames_rc = new byte[nFRectSize];

				for (int i = 0; i < nFRectSize; i++) {
					this._frames_rc[i] = file[offset++];
				}
			}

			short nAFrames;
			if ((nAFrames = (short)((file[offset++] & 0xFF) + ((file[offset++] & 0xFF) << 8))) > 0) {
				this._aframes = new byte[nAFrames * 5];
				System.arraycopy(file, offset, this._aframes, 0, this._aframes.length);
				offset += this._aframes.length;
			}

			short nAnims;
			if ((nAnims = (short)((file[offset++] & 0xFF) + ((file[offset++] & 0xFF) << 8))) > 0) {
				this._anims_naf = new byte[nAnims];
				this._anims_af_start = new short[nAnims];

				for (int i = 0; i < nAnims; i++) {
					this._anims_naf[i] = file[offset++];
					++offset;
					this._anims_af_start[i] = (short)((file[offset++] & 0xFF) + ((file[offset++] & 0xFF) << 8));
				}
			}

			if (nModules <= 0) {
				System.gc();
			} else {
				short _pixel_format = (short)((file[offset++] & 0xFF) + ((file[offset++] & 0xFF) << 8));
				this._palettes = file[offset++] & 0xFF;
				int colors = file[offset++] & 0xFF;
				this._pal = new int[16][];

				for (int p = 0; p < this._palettes; p++) {
					this._pal[p] = new int[colors];
					switch (_pixel_format) {
						case PIXEL_FORMAT_8888:
							for (int c = 0; c < colors; c++) {
								int _8888 = (file[offset++] & 0xFF) + ((file[offset++] & 0xFF) << 8) + ((file[offset++] & 0xFF) << 16) + ((file[offset++] & 0xFF) << 24);
								if ((_8888 & 0xFF000000) != 0xFF000000) {
									this._alpha = true;
								}

								this._pal[p][c] = _8888;
							}
							break;
						case PIXEL_FORMAT_4444:
							for (int c = 0; c < colors; c++) {
								int _4444 = (file[offset++] & 0xFF) + ((file[offset++] & 0xFF) << 8);
								if ((_4444 & 0xF000) != 0xF000) {
									this._alpha = true;
								}

								this._pal[p][c] = (_4444 & 0xF000) << 16 | (_4444 & 0xF000) << 12 | (_4444 & 0xF00) << 12 | (_4444 & 0xF00) << 8 | (_4444 & 0xF0) << 8 | (_4444 & 0xF0) << 4 | (_4444 & 0xF) << 4 | _4444 & 0xF;
							}
							break;
						case PIXEL_FORMAT_1555:
							for (int c = 0; c < colors; c++) {
								int _1555 = (file[offset++] & 0xFF) + ((file[offset++] & 0xFF) << 8);
								int a = 0xFF000000;
								if ((_1555 & 0x8000) != 0x8000) {
									a = 0; //No transparency if transparency bit is clear
									this._alpha = true;
								}

								this._pal[p][c] = a | (_1555 & 0x7C00) << 9 | (_1555 & 0x3E0) << 6 | (_1555 & 0x1F) << 3;
							}
							break;
						case PIXEL_FORMAT_0565:
							for (int c = 0; c < colors; c++) {
								int _0565 = (file[offset++] & 0xFF) + ((file[offset++] & 0xFF) << 8);
								int a = 0xFF000000;
								if (_0565 == 0xF81F) {
									a = 0;
									this._alpha = true;
								}

								this._pal[p][c] = a | (_0565 & 0xF800) << 8 | (_0565 & 0x7E0) << 5 | (_0565 & 0x1F) << 3;
							}
							break;
					}
				}

				this._data_format = (short)((file[offset++] & 0xFF) + ((file[offset++] & 0xFF) << 8));
				if (nModules > 0) {
					this._modules_data_off = new short[nModules];
					int len = 0;
					int off = offset;

					for (int i = 0; i < nModules; i++) {
						short size = (short)((file[off++] & 0xFF) + ((file[off++] & 0xFF) << 8)); //Get size of current bitmap image
						this._modules_data_off[i] = (short)len;
						off += size; //Move to next bitmap image
						len += size;
					}

					this._modules_data = new byte[len];
					for (int i = 0; i < nModules; i++) {
						short size = (short)((file[offset++] & 0xFF) + ((file[offset++] & 0xFF) << 8));
						System.arraycopy(file, offset, this._modules_data, this._modules_data_off[i] & 0xFFFF, size); //Copy current bitmap image to bitmap data buffer
						offset += size; //Move to next bitmap image
					}
				}

				System.gc();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// $FF: renamed from: a (int, int, int, int) void
	//------------------------------------------------------------------------------
	// Build Cache Images for this sprite
	// @param pal palette to be initialized
	// @param m1 first module
	// @param m2 last module (-1 . to end)
	// @param pal_copy mapping to another palette (-1 . build)
	//
	// @note GC is called twice internally here.
	//------------------------------------------------------------------------------
	public final void BuildCacheImages(int pal, int m1, int m2, int pal_copy) {
		if (this._modules != null) {
			if (m2 == -1) {
				m2 = (this._modules.length >> 1) - 1; //Get all sprites up to the last
			}

			if (this._modules_image == null) {
				this._modules_image = new Image[this._palettes][];
			}

			if (this._modules_image[pal] == null) {
				this._modules_image[pal] = new Image[this._modules.length >> 1];
			}

			if (pal_copy >= 0) {
				// Copy from one palette to another
				for (int i = m1; i <= m2; i++) {
					this._modules_image[pal][i] = this._modules_image[pal_copy][i]; 
				}
			} else {
				int _old_pal = this._crt_pal;
				this._crt_pal = pal;
				System.gc();

				for (int i = m1; i <= m2; i++) {
					int offset = i * 2;
					int sizeX = this._modules[offset] & 0xFF; //Get width
					int sizeY = this._modules[offset + 1] & 0xFF; //Get height
					int[] image_data;
					if (sizeX > 0 && sizeY > 0 && (image_data = this.DecodeImage(i)) != null) {
						boolean hasAlpha = false;
						int size = sizeX * sizeY;

						for (int j = 0; j < size; j++) {
							if ((image_data[j] & 0xFF000000) != 0xFF000000) {
								hasAlpha = true;
								break;
							}
						}

						this._modules_image[pal][i] = Image.createRGBImage(image_data, sizeX, sizeY, hasAlpha);
					}
				}

				System.gc();
				this._crt_pal = _old_pal;
			}

			System.gc();
		}
	}

	// $FF: renamed from: a (int) void
	public final void DeleteCacheImages(int pal) {
		if (this._modules != null) {
			if (this._modules_image != null) {
				if (this._modules_image[pal] != null) {
					for (int i = 0; i < this._modules_image[pal].length; i++) {
						this._modules_image[pal][i] = null;
					}

					this._modules_image[pal] = null;
					--this._palettes;
				}
			}
		}
	}

	public final String toString() {
		int nModulesMem = 0;

		// Memory usage...
		for (int i = 0; i < this._modules.length / 2; i++) {
			nModulesMem += (this._modules[2 * i] & 0xFF) * (this._modules[2 * i + 1] & 0xFF);
		}

		return "raw/full: " + this._modules_data.length + "/" + (nModulesMem * 2);
	}

	// $FF: renamed from: a (int, int) int  
	//------------------------------------------------------------------------------
	// Gets the time of a frame in an animation
	// @param anim The animation to be examined
	// @param aframe The frame in the animation
	// @returns The frame time
	//------------------------------------------------------------------------------
	public final int GetAFrameTime(int anim, int aframe) {
		return this._aframes[(this._anims_af_start[anim] + aframe) * 5 + 1] & 0xFF;
	}

	// $FF: renamed from: a (int) int
	//------------------------------------------------------------------------------
	// Get the number of frames in an animation
	// @param anim The animation to be examined
	// @returns The number of frames
	//------------------------------------------------------------------------------
	public final int GetAFrames(int anim) {
		return this._anims_naf[anim] & 0xFF;
	}

	// $FF: renamed from: b (int) int
	//------------------------------------------------------------------------------
	// Get the number of modules in a frame
	// @param frame The frame to be examined
	// @returns The number of modules
	//------------------------------------------------------------------------------
	public final int GetFModules(int frame) {
		return this._frames_nfm[frame] & 0xFF;
	}

	// $FF: renamed from: a (java.lang.String) int
	public final int GetStringHeight(String s) {
		int lines = 1;
		int nStrLen = s.length();

		// Count amount of lines in string
		int i = s.indexOf('\n');
		while (i != -1)
		{
			lines++;
			i = i < nStrLen - 1 ? s.indexOf('\n', i + 1) : -1;
		}

		return this._nLineSpacing * (lines - 1) + this._modules[1] * lines;
	}

	// $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int, int, int) void
	//------------------------------------------------------------------------------
	// Draws an animation frame at PosX/PosY with Flags
	// @param g The Graphics context
	// @param anim The animation containing the frame
	// @param aframe The frame to be drawn
	// @param posX The X coordinate to be drawn to
	// @param posY The Y coordinate to be drawn to
	// @param flags The flags to be used for this operation
	// @param offsetX
	// @param offsetY
	//------------------------------------------------------------------------------
	public final void PaintAFrame(Graphics g, int anim, int aframe, int posX, int posY, int flags, int offsetX, int offsetY) {
		int offset = (this._anims_af_start[anim] + aframe) * 5;
		int frame = this._aframes[offset] & 0xFF;
		if ((flags & FLAG_OFFSET_AF) != 0) {
			offsetX = (flags & FLAG_FLIP_X) != 0 ? offsetX + this._aframes[offset + 2] : offsetX - this._aframes[offset + 2];
			offsetY = (flags & FLAG_FLIP_Y) != 0 ? offsetY + this._aframes[offset + 3] : offsetY - this._aframes[offset + 3];
		}

		this.PaintFrame(g, frame, posX - offsetX, posY - offsetY, (flags ^ this._aframes[offset + 4]) & 0xF, offsetX, offsetY);
	}

	// $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int, int) void
	//------------------------------------------------------------------------------
	// Draws a frame at PosX/PosY with Flags
	// @param g The Graphics context
	// @param frame The frame to be drawn
	// @param posX The X coordinate to be drawn to
	// @param posY The Y coordinate to be drawn to
	// @param flags The flags to be used for this operation
	//------------------------------------------------------------------------------
	public final void PaintFrame(Graphics g, int frame, int posX, int posY, int flags, int unused1, int unused2) {
		int nFModules = this._frames_nfm[frame] & 0xFF;

		for (int fmodule = 0; fmodule < nFModules; fmodule++) {
			this.PaintFModule(g, frame, fmodule, posX, posY, flags);
		}
	}

	// $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int) void
	//------------------------------------------------------------------------------
	// Draws a module from a frame at PosX/PosY with Flags
	// @param g The Graphics context
	// @param frame The frame containing the module
	// @param fmodule The module to be drawn
	// @param posX The X coordinate to be drawn to
	// @param posY The Y coordinate to be drawn to
	// @param flags The flags to be used for this operation
	//------------------------------------------------------------------------------
	public final void PaintFModule(Graphics g, int frame, int fmodule, int posX, int posY, int flags) {
		int offset, index, fm_flags;

		offset = this._frames_fm_start[frame] + fmodule << 2;
		fm_flags = this._fmodules[offset + 3] & 0xFF;
		index = this._fmodules[offset] & 0xFF;
		posX = (flags & FLAG_FLIP_X) != 0 ? posX - this._fmodules[offset + 1] : posX + this._fmodules[offset + 1];
		posY = (flags & FLAG_FLIP_Y) != 0 ? posY - this._fmodules[offset + 2] : posY + this._fmodules[offset + 2];

		if ((flags & FLAG_FLIP_X) != 0) {
			posX -= this._modules[index << 1] & 0xFF;
		}

		if ((flags & FLAG_FLIP_Y) != 0) {
			posY -= this._modules[(index << 1) + 1] & 0xFF;
		}

		this.PaintModule(g, index, posX, posY, (flags ^ fm_flags) & 0xF);
	}

	// $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int) void
	//------------------------------------------------------------------------------
	// Draws a module at PosX/PosY with Flags
	// @param g The Graphics context
	// @param module The frame to be drawn
	// @param posX The X coordinate to be drawn to
	// @param posY The Y coordinate to be drawn to
	// @param flags The flags to be used for this operation
	//------------------------------------------------------------------------------
	public final void PaintModule(Graphics g, int module, int posX, int posY, int flags) {
		int offset = module << 1;
		int moduleW = this._modules[offset] & 0xFF;
		int moduleH = this._modules[offset + 1] & 0xFF;
		if (moduleW > 0 && moduleH > 0) {
			Image img_image = null;
			if (this._modules_image != null && this._modules_image[this._crt_pal] != null) {
				img_image = this._modules_image[this._crt_pal][module];
			}

			if (img_image == null) {
				int[] img_intA;
				if ((img_intA = this.DecodeImage(module)) == null) {
					return;
				}

				img_image = Image.createRGBImage(img_intA, moduleW, moduleH, this._alpha);
			}

			moduleW = img_image.getWidth();
			moduleH = img_image.getHeight();

			if ((flags & FLAG_FLIP_X) != 0) {
				if ((flags & FLAG_FLIP_Y) != 0) {    /* FLAG_FLIP_X | FLAG_FLIP_Y */
					g.drawRegion(img_image, 0, 0, moduleW, moduleH, Sprite.TRANS_ROT180, posX, posY, 0);
				} else {                             /* FLAG_FLIP_X */
					g.drawRegion(img_image, 0, 0, moduleW, moduleH, Sprite.TRANS_MIRROR, posX, posY, 0);
				}
			} else if ((flags & FLAG_FLIP_Y) != 0) { /* FLAG_FLIP_Y */
				g.drawRegion(img_image, 0, 0, moduleW, moduleH, Sprite.TRANS_MIRROR_ROT180, posX, posY, 0);
			} else {
				g.drawRegion(img_image, 0, 0, moduleW, moduleH, Sprite.TRANS_NONE, posX, posY, 0);
			}
		}
	}

	// $FF: renamed from: a (int) int[]
	//------------------------------------------------------------------------------
	// Decodes loaded module data
	// @param module Module to be decoded
	// @returns int[] The decoded image data
	//------------------------------------------------------------------------------
	private int[] DecodeImage(int module) {
		if (this._modules_data != null && this._modules_data_off != null) {
			int imageIndex = module * 2;
			int sizeX = this._modules[imageIndex] & 0xFF; //Get width
			int sizeY = this._modules[imageIndex + 1] & 0xFF; //Get height

			int[] pal_int = this._pal[this._crt_pal]; //Palette
			if (pal_int == null) {
				return null;
			} else {
				byte[] image = this._modules_data; //(Reference) Bitmap data
				int si = this._modules_data_off[module] & 0xFFFF; //Get index for image
				int di = 0;
				int ds = sizeX * sizeY; //Total amount of pixels
				if (this._data_format == ENCODE_FORMAT_I127RLE) {
					while (di < ds) {
						int c = image[si++] & 0xFF;
						// If RLE tag
						if (c > 127) {
							int c2 = image[si++] & 0xFF;
							int clr_int = pal_int[c2];

							for (int i = c - 0x80;
								i-- > 0;
								temp[di++] = clr_int) {}
						// If uncompressed data
						} else {
							temp[di++] = pal_int[c];
						}
					}
				} else if (this._data_format == ENCODE_FORMAT_I16) {
					while (di < ds) {
						int c = image[si++] & 0xFF;
						temp[di++] = pal_int[(c >> 4) & 0xF];
						temp[di++] = pal_int[c & 0xF];
					}
				} else if (this._data_format == ENCODE_FORMAT_I4) {
					while (di < ds) {
						int c = image[si++] & 0xFF;
						temp[di++] = pal_int[(c >> 6) & 3];
						temp[di++] = pal_int[(c >> 4) & 3];
						temp[di++] = pal_int[(c >> 2) & 3];
						temp[di++] = pal_int[c & 3];
					}
				} else if (this._data_format == ENCODE_FORMAT_I2) {
					while (di < ds) {
						int c = image[si++] & 0xFF;
						temp[di++] = pal_int[(c >> 7) & 1];
						temp[di++] = pal_int[(c >> 6) & 1];
						temp[di++] = pal_int[(c >> 5) & 1];
						temp[di++] = pal_int[(c >> 4) & 1];
						temp[di++] = pal_int[(c >> 3) & 1];
						temp[di++] = pal_int[(c >> 2) & 1];
						temp[di++] = pal_int[(c >> 1) & 1];
						temp[di++] = pal_int[c & 1];
					}
				} else if (this._data_format == ENCODE_FORMAT_I256) {
					while (di < ds) {
						temp[di++] = pal_int[image[si++] & 0xFF];
					}
				} else if (this._data_format == ENCODE_FORMAT_I256RLE) {
					while (di < ds) {
						int c = image[si++] & 0xFF;
						// If not RLE tag
						if (c > 127) {
							for (int i = c - 0x80;
								i-- > 0;
								temp[di++] = pal_int[image[si++] & 0xFF]) {}
						// If RLE tag
						} else {
							for (int i = pal_int[image[si++] & 0xFF];
								c-- > 0;
								temp[di++] = i) {}
						}
					}
				}

				return temp;
			}
		} else {
			return null;
		}
	}

	// $FF: renamed from: a (java.lang.String) void
	//------------------------------------------------------------------------------
	// Updates the current string size for the sprite given a string
	// @param s the string
	//------------------------------------------------------------------------------
	public final void UpdateStringSize(String s) {
		_text_w = 0;
		_text_h = this._modules[1] & 0xFF;
		int tw = 0; // text width
		int index1 = _index1 >= 0 ? _index1 : 0;
		int index2 = _index2 >= 0 ? _index2 : s.length();

		for (int i = index1; i < index2; i++) {
			int c = s.charAt(i);

			if (c > ' ') {
				c = _pMapChar[c] & 0xFF;
			} else {
				if (c == ' ') {
					tw += (this._modules[0] & 0xFF) + this._fmodules[1];
					continue;
				} else if (c == '\n') {
					if (tw > _text_w) {
						_text_w = tw;
					}
					tw = 0;
					_text_h += this._nLineSpacing + (this._modules[1] & 0xFF);
					continue;
				} else if (c == 1) {
					i++;
					continue;
				} else if (c == 2) {
					i++;
					c = s.charAt(i);
				}
			}

			if (c >= this.GetFModules(0)) {
				int frame = c - this.GetFModules(0);
				tw += ((this._frames_rc[(frame << 2) + 2] & 0xFF) - (this._frames_rc[frame << 2] & 0xFF)) + this._fmodules[1];
			} else {
				int module = (this._fmodules[c << 2] & 0xFF) << 1;
				tw += ((this._modules[module] & 0xFF) - (this._fmodules[(c << 2) + 1])) + this._fmodules[1];
			}
		}

		if (tw > _text_w) {
			_text_w = tw;
		}

		if (_text_w > 0) {
			_text_w -= this._fmodules[1];
		}

	}

	// $FF: renamed from: a (javax.microedition.lcdui.Graphics, java.lang.String, int, int, int) void
	//------------------------------------------------------------------------------
	// Draws text given a string
	// @param g The graphics context
	// @param s The string to be drawn
	// @param x The X coordinate to be drawn to
	// @param y The Y coordinate to be drawn to
	// @param anchor The anchor flags to be used for drawing
	//------------------------------------------------------------------------------
	public final void DrawString(Graphics g, String s, int x, int y, int anchor) {
		y -= this._fmodules[2];
		if ((anchor & (Graphics.RIGHT | Graphics.HCENTER | Graphics.BOTTOM | Graphics.VCENTER)) != 0) {
			this.UpdateStringSize(s);
			if ((anchor & Graphics.RIGHT) != 0) {
				x -= _text_w;
			} else if ((anchor & Graphics.HCENTER) != 0) {
				x -= _text_w >> 1;
			}

			if ((anchor & Graphics.BOTTOM) != 0) {
				y -= _text_h;
			} else if ((anchor & Graphics.VCENTER) != 0) {
				y -= _text_h >> 1;
			}
		}

		int xx = x;
		int yy = y;
		// wrap current palette
		int _old_pal = this._crt_pal;
		int index1 = _index1 >= 0 ? _index1 : 0;
		int index2 = _index2 >= 0 ? _index2 : s.length();

		for (int i = index1; i < index2; ++i) {
			int nCharW;

			int c = s.charAt(i);
			if (c > ' ') {
				c = _pMapChar[c] & 0xFF;
			} else {
				if (c == ' ') {
					xx += (this._modules[0] & 0xFF) + this._fmodules[1];
					continue;
				} else if (c == '\n') {
					xx = x;
					yy += this._nLineSpacing + (this._modules[1] & 0xFF);
					continue;
				} else if (c == 1) {                // change current palette
					++i;
					this._crt_pal = s.charAt(i);
					continue;
				} else if (c == 2) {
					++i;
					c = s.charAt(i);
				}
			}

			if (c >= this.GetFModules(0)) {
				int frame = c - this.GetFModules(0);
				this.PaintFrame(g, frame, xx, yy, 0, 0, 0);
				nCharW = (this._frames_rc[(frame << 2) + 2] & 0xFF) - (this._frames_rc[frame << 2] & 0xFF);
			} else {
				int module = (this._fmodules[c << 2] & 0xFF) << 1;
				this.PaintFModule(g, 0, c, xx, yy, 0);
				nCharW = (this._modules[module] & 0xFF) - this._fmodules[(c << 2) + 1];
			}

			// xx += this.GetCharWidth(c) + this.GetCharSpacing();
			xx += nCharW + this._fmodules[1];
		}
		// restore current palette
		this._crt_pal = _old_pal;
	}

	// $FF: renamed from: b (javax.microedition.lcdui.Graphics, java.lang.String, int, int, int) void
	//------------------------------------------------------------------------------
	// Draws a string with appropriate newline characters as a page given a start and end
	// @param g The graphics context
	// @param s The string to be drawn
	// @param x The X coordinate to be drawn to
	// @param y The Y coordinate to be drawn to
	// @param anchor The anchor flags to be used for drawing
	//------------------------------------------------------------------------------
	public final void DrawPage(Graphics g, String s, int x, int y, int anchor) {
		int lines = 0;
		int nStrLen = s.length();
		int[] off = new int[100];

		for (int i = 0; i < nStrLen; ++i) {
			if (s.charAt(i) == '\n') {
				off[lines++] = i;
			}
		}

		// total height
		int th = this._nLineSpacing + (this._modules[1] & 0xFF);
		off[lines++] = nStrLen;
		if ((anchor & Graphics.BOTTOM) != 0) {
			y -= th * (lines - 1);
		} else if ((anchor & Graphics.VCENTER) != 0) {
			y -= th * (lines - 1) >> 1;
		}

		for (int j = 0; j < lines; ++j) {
			_index1 = j > 0 ? off[j - 1] + 1 : 0;
			_index2 = off[j];
			this.DrawString(g, s, x, y + j * th, anchor);
		}

		_index1 = -1;
		_index2 = -1;
	}

	// $FF: renamed from: a (boolean) void
	public final void FreeCacheData(boolean freeImageCache) {
		this._modules = null;
		this._frames_nfm = null;
		this._frames_fm_start = null;
		this._frames_rc = null;
		this._fmodules = null;
		this._anims_naf = null;
		this._anims_af_start = null;
		this._aframes = null;
		if (this._map != null) {
			for (int i = 0; i < this._map.length; i++) {
				this._map[i] = null;
			}

			this._map = (int[][])null;
		}

		if (this._pal != null) {
			for (int i = 0; i < this._pal.length; i++) {
				this._pal[i] = null;
			}

			this._pal = (int[][])null;
		}

		this._modules_data = null;
		this._modules_data_off = null;
		if (freeImageCache && this._modules_image != null) {
			for (int i = 0; i < this._modules_image.length; i++) {
				if (this._modules_image[i] != null) {
					for (int j = 0; j < this._modules_image[i].length; j++) {
						this._modules_image[i][j] = null;
					}
				}
			}

			this._modules_image = (Image[][])null;
		}

	}
}
