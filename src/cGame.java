import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.rms.RecordStore;

// $FF: renamed from: i
public final class cGame extends GameCanvas implements Runnable {
	private static final int SKEY_UP = 1;
	private static final int SKEY_DOWN = 2;
	private static final int SKEY_LEFT = 4;
	private static final int SKEY_RIGHT = 8;
	private static final int SKEY_CENTER = 16;
	private static final int SKEY_LSH = 32;
	private static final int SKEY_RSH = 64;
	private static final int SKEY_CENTER_ALT = 128; //Center key for Motorola devices
	private static final int SKEY_STAR = 256;
	private static final int SKEY_POUND = 512;
	private static final int SKEY_NUM0 = 1024;
	private static final int SKEY_NUM1 = 2048;
	private static final int SKEY_NUM2 = 4096;
	private static final int SKEY_NUM3 = 8192;
	private static final int SKEY_NUM4 = 16384;
	private static final int SKEY_NUM5 = 32768;
	private static final int SKEY_NUM6 = 65536;
	private static final int SKEY_NUM7 = 131072;
	private static final int SKEY_NUM8 = 262144;
	private static final int SKEY_NUM9 = 524288;
	// $FF: renamed from: a i
	public static cGame field_92;
	// $FF: renamed from: a int
	public int field_93 = 40;
	// $FF: renamed from: b int
	public int field_94;
	// $FF: renamed from: a boolean
	public boolean field_95 = false;
	// $FF: renamed from: b boolean
	public boolean noKeysPressed;
	// $FF: renamed from: c int
	public int field_97 = 0;
	// $FF: renamed from: d int
	public int field_98;
	// $FF: renamed from: a java.lang.String
	public String field_99;
	// $FF: renamed from: c boolean
	public boolean field_100;
	// $FF: renamed from: e int
	public int field_101;
	// $FF: renamed from: f int
	public int field_102;
	// $FF: renamed from: g int
	public int field_103;
	// $FF: renamed from: h int
	public int field_104;
	// $FF: renamed from: i int
	public int field_105;
	// $FF: renamed from: b java.lang.String
	public String field_106;
	// $FF: renamed from: c java.lang.String
	public String field_107;
	// $FF: renamed from: j int
	public int field_108;
	// $FF: renamed from: d boolean
	public boolean field_109;
	// $FF: renamed from: e boolean
	public boolean field_110;
	// $FF: renamed from: a byte
	public byte field_111;
	// $FF: renamed from: k int
	public int field_112;
	// $FF: renamed from: l int
	public int field_113;
	// $FF: renamed from: m int
	public int field_114;
	// $FF: renamed from: n int
	public int field_115;
	// $FF: renamed from: o int
	public int field_116;
	// $FF: renamed from: p int
	public int field_117;
	// $FF: renamed from: q int
	public int field_118;
	// $FF: renamed from: a boolean[]
	public static boolean[] field_119 = new boolean[]{true, false, false};
	// $FF: renamed from: r int
	public int field_120;
	// $FF: renamed from: b boolean[]
	public static boolean[] field_121 = new boolean[]{false, false, false};
	// $FF: renamed from: f boolean
	public boolean field_122;
	// $FF: renamed from: s int
	public int field_123;
	// $FF: renamed from: t int
	public int field_124;
	// $FF: renamed from: u int
	public int field_125;
	// $FF: renamed from: v int
	public int field_126;
	// $FF: renamed from: w int
	public int field_127;
	// $FF: renamed from: x int
	public int field_128;
	// $FF: renamed from: y int
	public int field_129;
	// $FF: renamed from: z int
	public int field_130;
	// $FF: renamed from: g boolean
	public boolean field_131;
	// $FF: renamed from: A int
	public int field_132;
	// $FF: renamed from: B int
	public int field_133;
	// $FF: renamed from: C int
	public int field_134;
	// $FF: renamed from: D int
	public int field_135;
	// $FF: renamed from: E int
	public int field_136;
	// $FF: renamed from: F int
	public int field_137;
	// $FF: renamed from: G int
	public int field_138;
	// $FF: renamed from: H int
	public int field_139;
	// $FF: renamed from: h boolean
	public boolean field_140;
	// $FF: renamed from: i boolean
	public boolean field_141;
	// $FF: renamed from: I int
	public int field_142;
	// $FF: renamed from: J int
	public int field_143;
	// $FF: renamed from: K int
	public int field_144;
	// $FF: renamed from: L int
	public int field_145;
	// $FF: renamed from: M int
	public int field_146;
	// $FF: renamed from: N int
	public int field_147;
	// $FF: renamed from: O int
	public int field_148;
	// $FF: renamed from: b byte
	public byte field_149;
	// $FF: renamed from: c byte
	public byte field_150;
	// $FF: renamed from: d byte
	public byte field_151;
	// $FF: renamed from: e byte
	public byte field_152;
	// $FF: renamed from: f byte
	public byte field_153;
	// $FF: renamed from: g byte
	public byte field_154;
	// $FF: renamed from: j boolean
	public boolean field_155;
	// $FF: renamed from: P int
	public int field_156;
	// $FF: renamed from: Q int
	public int field_157;
	// $FF: renamed from: R int
	public int field_158;
	// $FF: renamed from: a byte[]
	public static byte[] field_159 = new byte[16];
	// $FF: renamed from: b byte[]
	public static byte[] field_160 = new byte[8];
	// $FF: renamed from: c byte[]
	public static byte[] field_161 = new byte[8];
	// $FF: renamed from: S int
	public int field_162;
	// $FF: renamed from: T int
	public int field_163;
	// $FF: renamed from: h byte
	public byte field_164;
	// $FF: renamed from: k boolean
	public static boolean vibrationEnabled;
	// $FF: renamed from: U int
	public int field_166;
	// $FF: renamed from: V int
	public int field_167;
	// $FF: renamed from: W int
	public static int keysPressed;
	// $FF: renamed from: l boolean
	public boolean field_169;
	// $FF: renamed from: m boolean
	public boolean field_170;
	// $FF: renamed from: X int
	public int field_171;
	// $FF: renamed from: Y int
	public int field_172;
	// $FF: renamed from: d byte[]
	public static byte[] field_173;
	// $FF: renamed from: i byte
	public byte field_174;
	// $FF: renamed from: Z int
	public int field_175;
	// $FF: renamed from: aa int
	public int field_176;
	// $FF: renamed from: ab int
	public int field_177;
	// $FF: renamed from: ac int
	public int field_178;
	// $FF: renamed from: n boolean
	public boolean field_179;
	// $FF: renamed from: ad int
	public int field_180;
	// $FF: renamed from: ae int
	public int field_181;
	// $FF: renamed from: af int
	public int field_182;
	// $FF: renamed from: ag int
	public int field_183;
	// $FF: renamed from: ah int
	public int field_184;
	// $FF: renamed from: ai int
	public int field_185;
	// $FF: renamed from: o boolean
	public boolean field_186;
	// $FF: renamed from: p boolean
	public boolean field_187;
	// $FF: renamed from: q boolean
	public boolean field_188;
	// $FF: renamed from: r boolean
	public boolean field_189;
	// $FF: renamed from: aj int
	public int field_190;
	// $FF: renamed from: ak int
	public int field_191;
	// $FF: renamed from: e byte[]
	public static byte[] field_192;
	// $FF: renamed from: al int
	public int field_193;
	// $FF: renamed from: am int
	public int field_194;
	// $FF: renamed from: an int
	public int field_195;
	// $FF: renamed from: j byte
	public byte field_196;
	// $FF: renamed from: k byte
	public byte field_197;
	// $FF: renamed from: ao int
	public int playerLifeCount;
	// $FF: renamed from: ap int
	public int currentWorld;
	// $FF: renamed from: aq int
	public int currentLevel;
	// $FF: renamed from: ar int
	public int field_201;
	// $FF: renamed from: as int
	public int field_202;
	// $FF: renamed from: at int
	public int field_203;
	// $FF: renamed from: au int
	public int field_204;
	// $FF: renamed from: av int
	public int currentLevelWidth;
	// $FF: renamed from: aw int
	public int currentLevelHeight;
	// $FF: renamed from: ax int
	public int field_207;
	// $FF: renamed from: ay int
	public int field_208;
	// $FF: renamed from: az int
	public int field_209;
	// $FF: renamed from: aA int
	public int field_210;
	// $FF: renamed from: aB int
	public int field_211;
	// $FF: renamed from: aC int
	public int field_212;
	// $FF: renamed from: aD int
	public int field_213;
	// $FF: renamed from: aE int
	public int field_214;
	// $FF: renamed from: aF int
	public int field_215;
	// $FF: renamed from: aG int
	public int field_216;
	// $FF: renamed from: aH int
	public int field_217;
	// $FF: renamed from: aI int
	public int field_218;
	// $FF: renamed from: aJ int
	public int field_219;
	// $FF: renamed from: aK int
	public int field_220;
	// $FF: renamed from: aL int
	public int field_221;
	// $FF: renamed from: l byte
	public static byte field_222 = 0;
	// $FF: renamed from: aM int
	public int field_223;
	// $FF: renamed from: m byte
	public static byte field_224;
	// $FF: renamed from: s boolean
	public boolean field_225;
	// $FF: renamed from: aN int
	public static int frameCounter;
	// $FF: renamed from: aO int
	public static int field_227;
	// $FF: renamed from: a long
	public long field_228;
	// $FF: renamed from: t boolean
	public boolean field_229;
	// $FF: renamed from: aP int
	public int playerXPos;
	// $FF: renamed from: aQ int
	public int playerYPos;
	// $FF: renamed from: aR int
	public int field_232;
	// $FF: renamed from: aS int
	public int field_233;
	// $FF: renamed from: aT int
	public int field_234;
	// $FF: renamed from: u boolean
	public boolean field_235;
	// $FF: renamed from: aU int
	public int playerGoldKeys;
	// $FF: renamed from: aV int
	public int playerSilverKeys;
	// $FF: renamed from: v boolean
	public boolean field_238;
	// $FF: renamed from: n byte
	public byte field_239;
	// $FF: renamed from: aW int
	public int field_240;
	// $FF: renamed from: b long
	public long field_241;
	// $FF: renamed from: aX int
	public int field_242;
	// $FF: renamed from: aY int
	public int levelDiamondCount;
	// $FF: renamed from: aZ int
	public int collectedDiamonds;
	// $FF: renamed from: ba int
	public int levelRedDiamondCount;
	// $FF: renamed from: bb int
	public int collectedRedDiamonds;
	// $FF: renamed from: bc int
	public int field_247;
	// $FF: renamed from: bd int
	public int field_248;
	// $FF: renamed from: be int
	public int field_249;
	// $FF: renamed from: bf int
	public int field_250;
	// $FF: renamed from: o byte
	public byte field_251;
	// $FF: renamed from: bg int
	public int field_252;
	// $FF: renamed from: bh int
	public int field_253;
	// $FF: renamed from: bi int
	public int field_254;
	// $FF: renamed from: bj int
	public int field_255;
	// $FF: renamed from: bk int
	public int field_256;
	// $FF: renamed from: bl int
	public int field_257;
	// $FF: renamed from: bm int
	public int field_258;
	// $FF: renamed from: w boolean
	public boolean field_259;
	// $FF: renamed from: bn int
	public int field_260;
	// $FF: renamed from: x boolean
	public boolean field_261;
	// $FF: renamed from: bo int
	public int currentMenu;
	// $FF: renamed from: bp int
	public int previousMenu;
	// $FF: renamed from: bq int
	public int currentMenuSelection;
	// $FF: renamed from: br int
	public int field_265;
	// $FF: renamed from: bs int
	public int field_266;
	// $FF: renamed from: bt int
	public int field_267;
	// $FF: renamed from: bu int
	public int field_268;
	// $FF: renamed from: bv int
	public int field_269;
	// $FF: renamed from: bw int
	public int field_270;
	// $FF: renamed from: bx int
	public int field_271;
	// $FF: renamed from: by int
	public int field_272;
	// $FF: renamed from: bz int
	public int field_273;
	// $FF: renamed from: bA int
	public int field_274;
	// $FF: renamed from: bB int
	public int field_275;
	// $FF: renamed from: bC int
	public int field_276;
	// $FF: renamed from: y boolean
	public boolean field_277;
	// $FF: renamed from: bD int
	public int field_278;
	// $FF: renamed from: bE int
	public int field_279;
	// $FF: renamed from: bF int
	public int field_280;
	// $FF: renamed from: bG int
	public int processedTileX;
	// $FF: renamed from: bH int
	public int processedTileY;
	// $FF: renamed from: bI int
	public int field_283;
	// $FF: renamed from: bJ int
	public int field_284;
	// $FF: renamed from: bK int
	public int field_285;
	// $FF: renamed from: bL int
	public int field_286;
	// $FF: renamed from: bM int
	public int field_287;
	// $FF: renamed from: bN int
	public int field_288;
	// $FF: renamed from: bO int
	public int field_289;
	// $FF: renamed from: bP int
	public int field_290;
	// $FF: renamed from: bQ int
	public int field_291;
	// $FF: renamed from: bR int
	public int field_292;
	// $FF: renamed from: bS int
	public int field_293;
	// $FF: renamed from: bT int
	public int field_294;
	// $FF: renamed from: bU int
	public int field_295;
	// $FF: renamed from: bV int
	public int field_296;
	// $FF: renamed from: bW int
	public int field_297;
	// $FF: renamed from: bX int
	public int field_298;
	// $FF: renamed from: bY int
	public int field_299;
	// $FF: renamed from: bZ int
	public int field_300;
	// $FF: renamed from: ca int
	public int field_301;
	// $FF: renamed from: cb int
	public int field_302;
	// $FF: renamed from: z boolean
	public boolean field_303;
	// $FF: renamed from: cc int
	public int field_304;
	// $FF: renamed from: cd int
	public int field_305;
	// $FF: renamed from: a java.io.InputStream
	public InputStream field_306;
	// $FF: renamed from: p byte
	public byte field_307;
	// $FF: renamed from: q byte
	public byte field_308;
	// $FF: renamed from: A boolean
	public boolean field_309;
	// $FF: renamed from: ce int
	public int field_310;
	// $FF: renamed from: cf int
	public int field_311;
	// $FF: renamed from: cg int
	public int field_312;
	// $FF: renamed from: ch int
	public int field_313;
	// $FF: renamed from: a javax.microedition.lcdui.Graphics
	public Graphics field_314;
	// $FF: renamed from: a javax.microedition.lcdui.Image
	public static Image field_315;
	// $FF: renamed from: b javax.microedition.lcdui.Image
	public static Image field_316;
	// $FF: renamed from: c javax.microedition.lcdui.Image
	public static Image field_317;
	// $FF: renamed from: a javax.microedition.lcdui.Image[][]
	public static Image[][] field_318;
	// $FF: renamed from: b javax.microedition.lcdui.Image[][]
	public static Image[][] field_319;
	// $FF: renamed from: a a[]
	public static ASprite[] field_320;
	// $FF: renamed from: a a
	public static ASprite field_321;
	// $FF: renamed from: f byte[]
	public static byte[] field_322;
	// $FF: renamed from: a g[]
	public static ASpriteInstance[] field_323;
	// $FF: renamed from: b a
	public static ASprite field_324;
	// $FF: renamed from: g byte[]
	public static byte[] field_325;
	// $FF: renamed from: h byte[]
	public static byte[] field_326;
	// $FF: renamed from: c long
	public long field_327;
	// $FF: renamed from: d long
	public long field_328;
	// $FF: renamed from: B boolean
	public boolean field_329;
	// $FF: renamed from: i byte[]
	public static byte[] field_330;
	// $FF: renamed from: j byte[]
	public static byte[] preferenceData;
	// $FF: renamed from: a int[][]
	public static int[][] field_332;
	// $FF: renamed from: b int[][]
	public static int[][] field_333;
	// $FF: renamed from: a byte[][]
	public static byte[][] field_334;
	// $FF: renamed from: b byte[][]
	public static byte[][] field_335;
	// $FF: renamed from: c byte[][]
	public static byte[][] field_336;
	// $FF: renamed from: k byte[]
	public static byte[] field_337;
	// $FF: renamed from: C boolean
	public boolean field_338;
	// $FF: renamed from: ci int
	public int field_339;
	// $FF: renamed from: cj int
	public int field_340;
	// $FF: renamed from: ck int
	public int field_341;
	// $FF: renamed from: cl int
	public int field_342;
	// $FF: renamed from: l byte[]
	public static byte[] field_343;
	// $FF: renamed from: m byte[]
	public static byte[] field_344;
	// $FF: renamed from: cm int
	public static int field_345;
	// $FF: renamed from: cn int
	public static int field_346;
	// $FF: renamed from: n byte[]
	public static byte[] field_347;
	// $FF: renamed from: c int[][]
	public static int[][] field_348;
	// $FF: renamed from: d int[][]
	public static int[][] field_349;
	// $FF: renamed from: d byte[][]
	public static byte[][] field_350;
	// $FF: renamed from: e byte[][]
	public static byte[][] field_351;
	// $FF: renamed from: o byte[]
	public static byte[] field_352;
	// $FF: renamed from: a h
	public final cSoundEngine field_353;
	// $FF: renamed from: a c
	public DemoInterpreter field_354;
	// $FF: renamed from: a c[]
	public static DemoInterpreter[] field_355;
	// $FF: renamed from: p byte[]
	public static byte[] field_356;
	// $FF: renamed from: a java.lang.Thread
	public final Thread field_357;
	// $FF: renamed from: a GloftDIRU
	public static GloftDIRU field_358;
	// $FF: renamed from: co int
	public int field_359;
	// $FF: renamed from: cp int
	public int field_360;
	// $FF: renamed from: cq int
	public int field_361;
	// $FF: renamed from: cr int
	public int field_362;
	// $FF: renamed from: cs int
	public int field_363;
	// $FF: renamed from: c a
	public static ASprite field_364;
	// $FF: renamed from: ct int
	public int field_365;
	// $FF: renamed from: r byte
	public byte field_366;
	// $FF: renamed from: D boolean
	public static boolean field_367;
	// $FF: renamed from: e long
	public long field_368;
	// $FF: renamed from: f long
	public long field_369;
	// $FF: renamed from: g long
	public long field_370;
	// $FF: renamed from: E boolean
	public boolean field_371;
	// $FF: renamed from: F boolean
	public boolean field_372;
	// $FF: renamed from: G boolean
	public boolean field_373;
	// $FF: renamed from: H boolean
	public boolean field_374;
	// $FF: renamed from: I boolean
	public boolean field_375;
	// $FF: renamed from: J boolean
	public boolean field_376;
	// $FF: renamed from: K boolean
	public boolean field_377;
	// $FF: renamed from: L boolean
	public boolean field_378;
	// $FF: renamed from: M boolean
	public boolean field_379;
	// $FF: renamed from: cu int
	public int field_380;
	// $FF: renamed from: cv int
	public int preferenceDataSize;
	// $FF: renamed from: cw int
	public int field_382;
	// $FF: renamed from: N boolean
	public boolean field_383;
	// $FF: renamed from: O boolean
	public boolean field_384;
	// $FF: renamed from: cx int
	public int field_385;
	// $FF: renamed from: cy int
	public int field_386;
	// $FF: renamed from: P boolean
	public boolean field_387;
	// $FF: renamed from: Q boolean
	public boolean field_388;
	// $FF: renamed from: cz int
	public int field_389;
	// $FF: renamed from: cA int
	public int field_390;
	// $FF: renamed from: R boolean
	public boolean field_391;
	// $FF: renamed from: S boolean
	public boolean field_392;
	// $FF: renamed from: cB int
	public int field_393;
	// $FF: renamed from: d javax.microedition.lcdui.Image
	public static Image field_394;
	// $FF: renamed from: b javax.microedition.lcdui.Graphics
	public static Graphics field_395;
	// $FF: renamed from: cC int
	public static int field_396;
	// $FF: renamed from: cD int
	public static int field_397;
	// $FF: renamed from: cE int
	public static int field_398;
	// $FF: renamed from: cF int
	public static int field_399;
	// $FF: renamed from: cG int
	public static int field_400;
	// $FF: renamed from: cH int
	public static int field_401;
	// $FF: renamed from: cI int
	public int field_402;
	// $FF: renamed from: cJ int
	public int field_403;
	// $FF: renamed from: cK int
	public int field_404;
	// $FF: renamed from: cL int
	public int field_405;
	// $FF: renamed from: e javax.microedition.lcdui.Image
	public static Image field_406;
	// $FF: renamed from: cM int
	public static int field_407;
	// $FF: renamed from: cN int
	public static int field_408;
	// $FF: renamed from: cO int
	public static int field_409;
	// $FF: renamed from: cP int
	public int field_410;
	// $FF: renamed from: cQ int
	public int field_411;
	// $FF: renamed from: cR int
	public int field_412;
	// $FF: renamed from: cS int
	public int field_413;
	// $FF: renamed from: cT int
	public int field_414;
	// $FF: renamed from: cU int
	public int field_415;
	// $FF: renamed from: cV int
	public int field_416;
	// $FF: renamed from: T boolean
	public boolean field_417;
	// $FF: renamed from: cW int
	public int field_418;
	// $FF: renamed from: cX int
	public int field_419;
	// $FF: renamed from: cY int
	public int field_420;
	// $FF: renamed from: cZ int
	public int field_421;
	// $FF: renamed from: da int
	public int field_422;
	// $FF: renamed from: db int
	public int field_423;
	// $FF: renamed from: dc int
	public int field_424;
	// $FF: renamed from: dd int
	public int field_425;
	// $FF: renamed from: h long
	public long field_426;
	// $FF: renamed from: de int
	public int field_427;
	// $FF: renamed from: f javax.microedition.lcdui.Image
	public static Image field_428;
	// $FF: renamed from: U boolean
	public static boolean field_429;
	// $FF: renamed from: V boolean
	public static boolean field_430;
	// $FF: renamed from: i long
	public long field_431;
	// $FF: renamed from: W boolean
	public boolean field_432;
	// $FF: renamed from: X boolean
	public boolean field_433;
	// $FF: renamed from: Y boolean
	public boolean field_434;
	// $FF: renamed from: Z boolean
	public boolean field_435;
	// $FF: renamed from: aa boolean
	public boolean field_436;
	// $FF: renamed from: df int
	public int field_437;
	// $FF: renamed from: a int[]
	public int[] field_438;
	// $FF: renamed from: s byte
	public static byte field_439;
	// $FF: renamed from: b int[]
	public static final int[] field_440;
	// $FF: renamed from: dg int
	public static int field_441;
	// $FF: renamed from: dh int
	public static int field_442;
	// $FF: renamed from: di int
	public static int field_443;
	// $FF: renamed from: t byte
	public byte field_444;
	// $FF: renamed from: u byte
	public byte field_445;
	// $FF: renamed from: ab boolean
	public boolean field_446;
	// $FF: renamed from: q byte[]
	public static byte[] field_447;
	// $FF: renamed from: r byte[]
	public static byte[] field_448;
	// $FF: renamed from: j long
	public long field_449;
	// $FF: renamed from: ac boolean
	public boolean field_450;
	// $FF: renamed from: dj int
	public int field_451;
	// $FF: renamed from: ad boolean
	public boolean field_452;
	// $FF: renamed from: k long
	public long field_453;
	// $FF: renamed from: l long
	public long field_454;
	// $FF: renamed from: ae boolean
	public boolean field_455;
	// $FF: renamed from: af boolean
	public boolean field_456;
	// $FF: renamed from: m long
	public long field_457;
	// $FF: renamed from: ag boolean
	public boolean field_458;
	// $FF: renamed from: ah boolean
	public boolean field_459;
	// $FF: renamed from: ai boolean
	public boolean field_460;
	// $FF: renamed from: aj boolean
	public boolean field_461;
	// $FF: renamed from: d java.lang.String
	public String field_462;
	// $FF: renamed from: dk int
	public int field_463;
	// $FF: renamed from: dl int
	public int field_464;
	// $FF: renamed from: dm int
	public int field_465;
	// $FF: renamed from: dn int
	public int field_466;
	// $FF: renamed from: ak boolean
	public static boolean field_467;
	// $FF: renamed from: do int
	public static int field_468;
	// $FF: renamed from: dp int
	public static int field_469;
	// $FF: renamed from: dq int
	public static int field_470;
	// $FF: renamed from: dr int
	public static int field_471;
	// $FF: renamed from: a e
	public IGA field_472;
	// $FF: renamed from: al boolean
	public boolean field_473;
	// $FF: renamed from: am boolean
	public boolean field_474;
	// $FF: renamed from: ds int
	public int field_475;
	// $FF: renamed from: dt int
	public int field_476;
	// $FF: renamed from: du int
	public int field_477;
	// $FF: renamed from: v byte
	public byte field_478;
	// $FF: renamed from: dv int
	public int field_479;
	// $FF: renamed from: dw int
	public int field_480;
	// $FF: renamed from: dx int
	public int field_481;
	// $FF: renamed from: dy int
	public int field_482;
	// $FF: renamed from: dz int
	public int field_483;
	// $FF: renamed from: w byte
	public byte field_484;
	// $FF: renamed from: dA int
	public int field_485;
	// $FF: renamed from: dB int
	public int field_486;
	// $FF: renamed from: x byte
	public byte field_487;
	// $FF: renamed from: y byte
	public byte field_488;
	// $FF: renamed from: dC int
	public int field_489;
	// $FF: renamed from: dD int
	public int field_490;
	// $FF: renamed from: dE int
	public int field_491;
	// $FF: renamed from: z byte
	public byte field_492;
	// $FF: renamed from: dF int
	public int field_493;
	// $FF: renamed from: dG int
	public int field_494;
	// $FF: renamed from: dH int
	public int field_495;
	// $FF: renamed from: A byte
	public byte field_496;
	// $FF: renamed from: dI int
	public int field_497;
	// $FF: renamed from: dJ int
	public int field_498;
	// $FF: renamed from: d a
	public static ASprite field_499;
	// $FF: renamed from: e int[][]
	public static int[][] field_500;
	// $FF: renamed from: a long[]
	public static long[] field_501;
	// $FF: renamed from: b long[]
	public static long[] field_502;
	// $FF: renamed from: f int[][]
	public static int[][] field_503;
	// $FF: renamed from: c long[]
	public static long[] field_504;
	// $FF: renamed from: d long[]
	public static long[] field_505;
	// $FF: renamed from: an boolean
	public static boolean field_506;
	// $FF: renamed from: dK int
	public int field_507;
	// $FF: renamed from: dL int
	public int field_508;
	// $FF: renamed from: a long[][]
	public static long[][] field_509;
	// $FF: renamed from: a java.lang.StringBuffer
	public static StringBuffer field_510;
	// $FF: renamed from: b java.lang.StringBuffer
	public static StringBuffer field_511;
	// $FF: renamed from: c java.lang.StringBuffer
	public static StringBuffer field_512;
	// $FF: renamed from: g javax.microedition.lcdui.Image
	public static Image field_513;
	// $FF: renamed from: c javax.microedition.lcdui.Graphics
	public static Graphics field_514;
	// $FF: renamed from: dM int
	public int field_515;
	// $FF: renamed from: dN int
	public int field_516;
	// $FF: renamed from: dO int
	public int field_517;
	// $FF: renamed from: dP int
	public int field_518;
	// $FF: renamed from: dQ int
	public int field_519;
	// $FF: renamed from: dR int
	public int field_520;
	// $FF: renamed from: dS int
	public int field_521;
	// $FF: renamed from: dT int
	public int field_522;
	// $FF: renamed from: dU int
	public int field_523;
	// $FF: renamed from: dV int
	public int field_524;
	// $FF: renamed from: dW int
	public int field_525;
	// $FF: renamed from: ao boolean
	public boolean field_526;
	// $FF: renamed from: ap boolean
	public boolean field_527;
	// $FF: renamed from: dX int
	public int field_528;
	// $FF: renamed from: dY int
	public int field_529;
	// $FF: renamed from: dZ int
	public int field_530;
	// $FF: renamed from: ea int
	public int field_531;
	// $FF: renamed from: eb int
	public static int field_532;
	// $FF: renamed from: ec int
	public int field_533;
	// $FF: renamed from: ed int
	public int field_534;
	// $FF: renamed from: ee int
	public int field_535;
	// $FF: renamed from: ef int
	public int field_536;
	// $FF: renamed from: eg int
	public int field_537;
	// $FF: renamed from: eh int
	public int field_538;
	// $FF: renamed from: ei int
	public int field_539;
	// $FF: renamed from: ej int
	public int field_540;
	// $FF: renamed from: aq boolean
	public boolean field_541;
	// $FF: renamed from: ar boolean
	public boolean field_542;
	// $FF: renamed from: as boolean
	public boolean field_543;
	// $FF: renamed from: c int[]
	public int[] field_544;
	// $FF: renamed from: ek int
	public int field_545;
	// $FF: renamed from: el int
	public int field_546;
	// $FF: renamed from: em int
	public int field_547;
	// $FF: renamed from: en int
	public int field_548;
	// $FF: renamed from: eo int
	public int field_549;
	// $FF: renamed from: at boolean
	public boolean field_550;
	// $FF: renamed from: au boolean
	public boolean field_551;
	// $FF: renamed from: av boolean
	public boolean field_552;
	// $FF: renamed from: n long
	public long field_553;
	// $FF: renamed from: ep int
	public int field_554;
	// $FF: renamed from: e java.lang.String
	public String field_555;
	// $FF: renamed from: d java.lang.StringBuffer
	public StringBuffer field_556;
	// $FF: renamed from: aw boolean
	public boolean field_557;
	// $FF: renamed from: ax boolean
	public boolean field_558;
	// $FF: renamed from: eq int
	public int field_559;
	// $FF: renamed from: er int
	public int field_560;
	// $FF: renamed from: a short[][]
	public static final short[][] menuData;
	// $FF: renamed from: d int[]
	public static final int[] field_562;
	// $FF: renamed from: g int[][]
	public static final int[][] field_563;
	// $FF: renamed from: a java.lang.String[]
	public static String[] menuText;
	// $FF: renamed from: s byte[]
	public static byte[] field_565;
	// $FF: renamed from: b java.lang.String[]
	public static final String[] field_566;
	// $FF: renamed from: es int
	public static int field_567;
	// $FF: renamed from: o long
	public long field_568;
	// $FF: renamed from: f java.lang.String
	public String field_569;
	// $FF: renamed from: et int
	public int field_570;
	// $FF: renamed from: eu int
	public int field_571;
	// $FF: renamed from: ev int
	public int field_572;
	// $FF: renamed from: ew int
	public int field_573;

	public cGame(GloftDIRU var1) {
		super(false);
		this.field_98 = Define.itemPrices[this.field_97];
		this.field_99 = "";
		this.field_100 = true;
		this.field_101 = 0;
		this.field_102 = 0;
		this.field_103 = 0;
		this.field_104 = this.field_102;
		this.field_105 = this.field_103;
		this.field_106 = "";
		this.field_107 = "";
		this.field_108 = -1;
		this.field_109 = false;
		this.field_110 = true;
		this.field_111 = 0;
		this.field_112 = 0;
		this.field_113 = 0;
		this.field_114 = 0;
		this.field_115 = 0;
		this.field_116 = 0;
		this.field_117 = 0;
		this.field_118 = 0;
		this.field_120 = 0;
		this.field_122 = false;
		this.field_123 = -1;
		this.field_124 = 10;
		this.field_125 = 10;
		this.field_126 = 0;
		this.field_127 = 0;
		this.field_128 = 0;
		this.field_129 = 0;
		this.field_130 = 0;
		this.field_131 = false;
		this.field_132 = 0;
		this.field_133 = -1;
		this.field_134 = -1;
		this.field_135 = 0;
		this.field_136 = 0;
		this.field_137 = 0;
		this.field_138 = 0;
		this.field_139 = 0;
		this.field_140 = false;
		this.field_141 = false;
		this.field_142 = 0;
		this.field_143 = 0;
		this.field_144 = 0;
		this.field_145 = 0;
		this.field_146 = 0;
		this.field_147 = 0;
		this.field_148 = 0;
		this.field_149 = 1;
		this.field_150 = 1;
		this.field_151 = 3;
		this.field_152 = 3;
		this.field_153 = 2;
		this.field_154 = 0;
		this.field_155 = false;
		this.field_167 = 0;
		this.field_169 = true;
		this.field_174 = 0;
		this.field_175 = 0;
		this.field_186 = false;
		this.field_187 = false;
		this.field_188 = false;
		this.field_189 = false;
		this.field_196 = 0;
		this.field_197 = 0;
		this.field_225 = false;
		this.levelDiamondCount = 0;
		this.levelRedDiamondCount = 0;
		this.field_258 = -1;
		this.field_278 = 0;
		this.field_297 = 0;
		this.field_298 = 0;
		this.field_299 = 0;
		this.field_300 = 0;
		this.field_301 = 0;
		this.field_302 = 0;
		this.field_309 = false;
		this.field_329 = false;
		this.field_354 = null;
		this.field_359 = -1;
		this.field_360 = -1;
		this.field_366 = 0;
		this.field_371 = false;
		this.field_372 = false;
		this.field_373 = false;
		this.field_374 = false;
		this.field_375 = false;
		this.field_376 = false;
		this.field_377 = false;
		this.field_378 = false;
		this.field_379 = false;
		this.field_380 = -1;
		this.field_384 = false;
		this.field_387 = false;
		this.field_388 = false;
		this.field_410 = -1;
		this.field_411 = -1;
		this.field_412 = -1;
		this.field_413 = -1;
		this.field_414 = -1;
		this.field_415 = -1;
		this.field_416 = -1;
		this.field_417 = true;
		this.field_421 = 2;
		this.field_422 = 0;
		this.field_424 = 3;
		this.field_425 = -1;
		this.field_426 = 0L;
		this.field_427 = -1;
		this.field_431 = 0L;
		this.field_436 = false;
		this.field_437 = 0;
		this.field_438 = new int[]{0, 0, 0, 0, 0};
		this.field_446 = false;
		this.field_449 = 0L;
		this.field_451 = 0;
		this.field_453 = 0L;
		this.field_454 = 0L;
		this.field_455 = false;
		this.field_456 = false;
		this.field_461 = false;
		this.field_463 = 0;
		this.field_473 = false;
		this.field_474 = true;
		this.field_475 = -1;
		this.field_486 = -1;
		this.field_487 = 3;
		this.field_515 = 100;
		this.field_526 = true;
		this.field_541 = true;
		this.field_542 = true;
		this.field_543 = true;
		this.field_547 = 2;
		this.field_549 = 2;
		this.field_551 = true;
		this.field_552 = true;
		this.field_553 = 0L;
		this.field_554 = -1;
		this.field_556 = new StringBuffer();
		this.field_557 = true;
		this.field_558 = true;
		this.field_568 = System.currentTimeMillis();
		field_92 = this;
		this.field_208 = -1;
		this.field_210 = -1;
		this.field_212 = -1;
		field_323 = new ASpriteInstance[6];
		field_320 = new ASprite[61];
		this.method_360();
		field_318 = new Image[33][];
		field_319 = new Image[2][];
		field_358 = var1;
		this.field_353 = new cSoundEngine();
		vibrationEnabled = true;
		((Canvas)this).setFullScreenMode(true);
		this.method_96();
		this.field_357 = new Thread(this);
		this.field_357.start();
	}

	// $FF: renamed from: a (int, int, int) void
	private void method_61(int var1, int var2, int var3) {
		this.field_210 = -1;
		this.field_213 = -1;
		this.field_212 = -1;
		int var5;
		if ((var5 = field_323[(this.field_233 & 16384) == 0 ? 0 : 3]._nCrtAnim) != 40) {
			if (var5 != 48) {
				if (var5 != 47) {
					if (this.field_241 <= 0L && this.field_240 == 0 && this.field_254 == 0 && this.field_197 != 6 && (this.field_233 & 112) == 0 || this.field_234 > 0) {
						this.field_247++;
						this.method_62((byte)(this.field_239 - var1));
						if (this.field_257 == 0 && this.field_239 == 0) {
							this.field_453 = 0L;
							this.field_359 = this.field_279;
							this.field_360 = this.field_280;
							field_364 = null;
						}

						this.field_233 = this.field_233 & -113 | var2;
						this.method_433(5);
						switch (var2) {
						case 16:
							this.field_190 = this.field_191 = 0;
							this.field_234 = 5;
							field_334[this.playerXPos][this.playerYPos] = 9;
							this.field_233 = this.field_233 & -113 | 0;
							field_333[this.playerXPos][this.playerYPos] = 138412032;
							field_336[this.playerXPos][this.playerYPos] = 24;
							return;
						case 64:
							this.method_211(1000);
							return;
						}

						this.method_211(10);
						if (var3 != 0) {
							byte var6 = (byte)var3;

							do {
								int var7 = this.playerXPos - field_325[var6];
								int var8 = this.playerYPos - field_325[var6 + 8];
								if (field_334[var7][var8] < 0 && (byte)(field_332[var7][var8] & 255) < 0) {
									this.playerXPos = var7;
									this.playerYPos = var8;
									this.field_232 = 18;
									this.field_196 = 0;
									this.field_233 = this.field_233 & -8 | var6 | 2048;
									return;
								}
							} while ((var6 = var6 >= 4 ? 1 : (byte)(var6 + 1)) != var3);
						}
					}

				}
			}
		}
	}

	// $FF: renamed from: a (byte) void
	private void method_62(byte var1) {
		this.field_239 = var1;

		if (this.field_239 <= 0) {
			this.field_239 = 0;
		} else if (this.field_239 > field_330[8]) {
			this.field_239 = field_330[8];
		}

		this.method_96();
	}

	// $FF: renamed from: a (int) void
	/**
	 * Navigates the UI to a submenu
	 * @param menu Menu number
	 */
	public final void openSubmenu(int menu) {
		this.previousMenu = this.currentMenu;
		this.field_261 = false;
		this.currentMenuSelection = 0;
		this.currentMenu = menu;
		this.field_418 = 0;
		if (menu >= 0) {
			this.method_172();
		}

	}

	// $FF: renamed from: a (int) boolean
	/**
	 * Returns true if the specified key bits were pressed
	 * @param serializedKeyCode Serialized key inputs, can match for multiple keys
	 * @return True if the specified keys were pressed
	 */
	public static boolean isKeyPressed(int serializedKeyCode) {
		return (keysPressed & serializedKeyCode) != 0;
	}

	public final void keyPressed(int keyCode) {
		int serializedKey = serializeKey(keyCode);
		keysPressed |= serializedKey; //Serialize the pressed key
		this.noKeysPressed = false;
	}

	public final void keyReleased(int var1) {
		keysPressed &= ~serializeKey(var1); //Remove key from pressed key bitmap
		this.noKeysPressed = true;
	}

	// $FF: renamed from: g () void
	private void method_65() {
		this.field_228 = System.currentTimeMillis();
		frameCounter = 0;
		field_227 = 0;
		this.field_175 = 0;
	}

	// $FF: renamed from: a (long) void
	/**
	 * Sleeps the game thread for a duration of time in milliseconds
	 * @param time Sleep time in milliseconds
	 */
	private static void method_66(long time) {
		if (time > 0L) {
			System.currentTimeMillis();

			try {
				Thread.sleep(time);
			} catch (Exception var5) {
			}
		}
	}

	public final void run() {
		this.field_228 = System.currentTimeMillis();
		this.method_65();
		this.loadPreferenceData();

		while(!this.field_303) {
			Thread.yield(); //Yield to any other running threads
			if (!this.field_455) {
				this.field_368 = System.currentTimeMillis();

				try {
					this.method_67();
				} catch (Exception var2) {
					((Throwable)var2).printStackTrace();
					method_66(5000L);
				}

				if (this.field_303) {
					break;
				}

				if (field_222 != 2) {
					frameCounter++;
				}

				this.field_369 = System.currentTimeMillis();
				if (this.field_370 > 65L) {
					method_66(100L - this.field_370 - this.field_369);
					this.field_229 = true;
					this.field_370 = 0L;
				} else {
					this.method_132(this.getGraphics());
					this.flushGraphics(); 
					this.field_229 = false;
					if (field_222 != 2) {
						field_227++;
					}

					this.field_370 = Math.abs(System.currentTimeMillis() - this.field_368);
					method_66(50L - (System.currentTimeMillis() - this.field_368)); //Set frame rate to 20FPS (50ms per frame)
				}
			}
		}

		this.method_95();
		this.field_353.method_55();
		field_358.method_443();
	}

	// $FF: renamed from: h () void
	private void method_67() throws Exception {
		this.method_436();
		this.method_217();
		switch (field_222) {
		case 0:
			field_323[0] = new ASpriteInstance(loadGfxFile("/ui.f", 0), 0, 0, (ASpriteInstance)null);
			field_323[0].SetAnim(0);
			field_222 = 6;
			this.method_65();
			return;
		case 1:
			this.method_236();
			return;
		case 2:
		case 12:
			return;
		case 3:
			this.field_303 = true;
			return;
		case 4:
		case 10:
		case 13:
		case 14:
		case 18:
		case 19:
		case 23:
		case 24:
		case 25:
		case 26:
		case 30:
		case 32:
		case 33:
		case 34:
		default:
			break;
		case 5:
			if (this.field_329 && this.field_266 <= 5) {
				this.method_113(this.field_266++);

				for (int var5 = 0; var5 < 3; ++var5) {
					field_121[var5] = false;
				}

				for (int var6 = 1; var6 < 3; ++var6) {
					field_119[var6] = false;
				}

				this.method_65();
				if (this.field_266 == 5) {
					this.field_379 = true;
					this.field_378 = true;
					this.field_377 = true;
					this.currentWorld = 0;
					this.currentLevel = 13;
					keysPressed = 0;
				}
			} else {
				this.method_78();
			}

			this.method_65();
			return;
		case 6:
			if (frameCounter < 60) {
				field_323[0].UpdateSpriteAnim();
				return;
			}

			menuText = loadStringsFromFile("/lang.f", 115);
			loadFontSprite();
			field_320[18] = loadGfxFile("/ui.f", 3);
			this.method_95();
			this.openSubmenu(3);
			field_222 = 7;
			return;
		case 7:
			if (this.field_261) {
				field_222 = 8;
				this.field_266 = 0;
				this.field_265 = 32;
				return;
			}
			break;
		case 8:
			this.method_76(this.field_266++);
			this.method_65();
			return;
		case 9:
			try {
				if ((preferenceData[0] & 1) == 0) {
					this.field_473 = true;
				}

				this.method_109();
				int var1 = this.field_265 == 8 ? this.field_266 : this.field_266 - 24;
				this.method_170(var1);
				++var1;
				++this.field_266;
				this.field_433 = true;
				if (var1 == 8) {
					if (this.field_371) {
						field_222 = 4;
						if (this.currentMenu == -1) {
							this.field_223 = 0;
							this.openSubmenu(0);
						} else {
							this.field_223 = 2;
						}
					} else {
						field_222 = 30;
						this.field_371 = true;
					}

					this.field_353.method_58(19);
				}
			} catch (Exception var3) {
			}

			this.method_65();
			return;
		case 11:
			this.field_375 = true;
			this.field_373 = true;
			field_222 = 5;
			this.field_388 = true;
			this.method_65();
			return;
		case 15:
			this.method_74();
			return;
		case 16:
			this.field_329 = true;
			this.method_86();
			keysPressed = 0;
			return;
		case 17:
			this.method_250();
			return;
		case 20:
			if (frameCounter > 30) {
				this.field_309 = true;
				this.field_375 = true;
				this.field_373 = true;
				this.method_408();
				return;
			}
			break;
		case 21:
			this.method_425(this.field_266++);
			this.method_65();
			return;
		case 22:
			this.method_434();
			return;
		case 27:
			this.method_75();
			return;
		case 28:
			try {
				this.method_71(this.field_266);
				this.field_266++;
				if (this.field_266 == 11) {
					field_222 = 27;
				}
			} catch (Exception var2) {
			}

			this.method_65();
			return;
		case 29:
			this.method_69();
			break;
		case 31:
			return;
		case 35:
			this.method_249(this.field_266++);
			this.method_65();
			if (this.field_266 == 12) {
				field_222 = 17;
				this.field_223 = 0;
				this.method_433(15);
				return;
			}
		}

	}

	// $FF: renamed from: i () void
	private void method_68() {
		if (this.field_148 >= this.field_151) {
			this.field_149 = -1;
		} else if (this.field_148 <= -this.field_151) {
			this.field_149 = 1;
		}

		this.field_148 += this.field_149 * this.field_153;
		if (this.field_147 >= this.field_152) {
			this.field_150 = -1;
		} else if (this.field_148 <= -this.field_152) {
			this.field_150 = 1;
		}

		this.field_147 += this.field_150 * this.field_154;
	}

	// $FF: renamed from: j () void
	private void method_69() {
		switch (this.field_145) {
		case 0:
			if (System.currentTimeMillis() - this.field_228 >= 3000L) {
				++this.field_145;
				this.method_65();
				return;
			}
			break;
		case 1:
			cGame var10000;
			boolean var10001;
			if (frameCounter % 6 >= 3) {
				this.field_146 += 1677721;
				var10000 = this;
				var10001 = false;
			} else {
				var10000 = this;
				var10001 = true;
			}

			var10000.field_557 = var10001;
			if (System.currentTimeMillis() - this.field_228 >= 5000L) {
				++this.field_145;
				this.field_557 = true;
				this.method_65();
				return;
			}
			break;
		case 2:
			this.method_68();
			if (System.currentTimeMillis() - this.field_228 >= 10000L) {
				this.field_147 = 0;
				this.field_148 = 0;
				this.method_65();
				++this.field_145;
				return;
			}
			break;
		case 3:
			if (System.currentTimeMillis() - this.field_228 >= 1000L) {
				++this.field_145;
				return;
			}
			break;
		case 4:
			if (System.currentTimeMillis() - this.field_228 >= 1000L) {
				++this.field_145;
				return;
			}
			break;
		case 5:
			if (System.currentTimeMillis() - this.field_228 >= 1000L) {
				++this.field_145;
				return;
			}
			break;
		case 6:
			if (System.currentTimeMillis() - this.field_228 >= 1000L) {
				++this.field_145;
				this.method_65();
				return;
			}
			break;
		case 7:
			if (System.currentTimeMillis() - this.field_228 >= 1000L) {
				GemsRain.field_29 = new byte[12][13];
				++this.field_145;
				GemsRain.method_17(3);
				this.field_353.method_58(19);
				this.method_65();
				return;
			}
			break;
		case 8:
			GemsRain.method_16(3);
			this.field_557 = true;
			if (System.currentTimeMillis() - this.field_228 >= 15000L) {
				++this.field_145;
				this.method_65();
				return;
			}
			break;
		case 9:
			this.field_557 = true;
			GemsRain.method_16(3);
			if (System.currentTimeMillis() - this.field_228 >= 12000L) {
				++this.field_145;
				this.method_65();
				return;
			}
			break;
		case 10:
			this.method_95();
			this.openSubmenu(0);
			field_222 = 22;
			this.field_223 = 0;
			this.field_353.method_59();
		}

	}

	// $FF: renamed from: k () void
	private void method_70() {
		this.field_372 = false;
		method_94(field_320[17], true);
		field_320[17] = null;
		int var1 = IGA.field_58.length;

		for (int var2 = 0; var2 < var1; ++var2) {
			IGA.field_58[var2] = null;
		}

		IGA.field_58 = null;
		method_94(field_320[10], true);
		field_320[10] = null;
		method_94(field_320[46], true);
		field_320[46] = null;
		method_94(field_320[55], true);
		field_320[55] = null;
		field_318[8] = null;
		method_94(field_320[59], true);
		field_318[3] = null;
		method_94(field_320[17], true);
		field_320[17] = null;
		System.gc();
	}

	// $FF: renamed from: c (int) void
	private void method_71(int var1) {
		switch (var1) {
		case 0:
			if (this.field_376) {
				this.method_92();
				return;
			}
			break;
		case 1:
			if (this.field_373) {
				this.method_407();
				return;
			}
			break;
		case 2:
			if (this.field_378) {
				this.method_115();
				return;
			}
			break;
		case 3:
			if (this.field_377) {
				System.gc();
				this.field_377 = false;
				return;
			}
			break;
		case 4:
			this.method_95();
			IGA.field_58 = loadSpritesFromFile("/demoui.f", 0);
			if (field_320[10] == null) {
				field_320[10] = loadGfxFile("/mmv.f", 0);
			}

			if (field_320[46] == null) {
				field_320[46] = loadGfxFile("/mmv.f", 5);
			}

			this.field_116 = 240 - method_402(field_320[10], 0) >> 1;
			this.field_117 = 320 - method_401(field_320[10], 0) - 48 >> 1;
			return;
		case 5:
			if (field_320[55] == null) {
				field_320[55] = loadGfxFile("/mmv.f", 4);
				this.field_114 = method_313(field_320[55], 0);
				field_324 = field_320[55];
			}

			if (field_320[18] == null) {
				field_320[18] = loadGfxFile("/ui.f", 3);
				return;
			}
			break;
		case 6:
			if (field_320[54] == null) {
				field_320[54] = loadGfxFile("/mmv.f", 1);
			}

			this.field_126 = method_402(field_320[54], 0) >> 1;
			this.field_127 = method_401(field_320[54], 0) >> 1;
			return;
		case 7:
			if (field_320[53] == null) {
				field_320[53] = loadGfxFile("/mmv.f", 2);
				return;
			}
			break;
		case 8:
			if (field_320[52] == null) {
				field_320[52] = loadGfxFile("/mmv.f", 3);
				return;
			}
			break;
		case 9:
			try {
				ASprite var6 = loadGfxFileInit("/" + 0 + ".f", 3, 0);
				field_318[8] = var6._modules_image[0];
				(var6 = loadGfxFileInit("/cm.f", 2, 0)).BuildCacheImages(0, 0, -1, -1);
				var6.BuildCacheImages(1, 0, 0, -1);
				field_320[59] = var6;
				GemsRain.field_37 = var6._modules_image[0].length;
				var6._modules_data = null;
				if (field_320[17] == null) {
					field_320[17] = loadGfxFile("/ms.f", 0);
				}

				return;
			} catch (Exception var4) {
				return;
			}
		case 10:
			if (field_320[9] == null) {
				field_320[9] = loadGfxFile("/cm.f", 7);
			}

			this.field_129 = method_313(field_320[9], 5);
			byte var2 = field_330[2];

			for (int var3 = 0; var3 < 3; ++var3) {
				if ((var2 & 1 << var3) != 0) {
					field_121[var3] = true;
				}
			}

			this.field_124 = 10;
			this.field_125 = 10;
			if (((var2 = field_330[1]) & 1) != 0) {
				field_119[1] = true;
			} else if (getShortFromBytes(field_330, 6) < Define.worldPrices[1]) {
				field_119[1] = false;
			} else {
				field_330[1] |= 1;
				this.method_110();
				this.field_118 = 1;
				this.field_101 = 1;
			}

			if ((var2 & 2) != 0) {
				field_119[2] = true;
			} else if (getShortFromBytes(field_330, 6) < Define.worldPrices[2]) {
				field_119[2] = false;
			} else {
				field_330[1] |= 2;
				this.method_110();
				this.field_118 = 2;
				this.field_101 = 2;
			}

			this.field_102 = Define.field_3[this.field_101 << 1];
			this.field_103 = Define.field_3[(this.field_101 << 1) + 1];
			this.field_104 = this.field_102;
			this.field_105 = this.field_103;
			this.method_72();
			this.field_110 = true;
			this.field_557 = true;
		}

	}

	// $FF: renamed from: l () void
	private void method_72() {
		cGame var10000;
		StringBuffer var10001;
		String var10002;
		if (this.field_101 == 3) {
			var10000 = this;
			var10001 = new StringBuffer();
			var10002 = menuText[82];
		} else if (method_73(this.field_101)) {
			var10000 = this;
			var10001 = new StringBuffer();
			var10002 = menuText[82];
		} else {
			var10000 = this;
			var10001 = (new StringBuffer()).append(Define.worldPrices[this.field_101]).append(" ");
			var10002 = menuText[114].toLowerCase();
		}

		var10000.field_106 = var10001.append(var10002).append(" ").append(menuText[79]).toString();

		switch (this.field_101) {
		case 0:
			this.field_107 = menuText[28];
			break;
		case 1:
			this.field_107 = menuText[29];
			break;
		case 2:
			this.field_107 = menuText[30];
			break;
		case 3:
			this.field_107 = menuText[31];
			break;
		}
	}

	// $FF: renamed from: b (int) boolean
	private static boolean method_73(int var0) {
		if (var0 != 0 && var0 != 3) {
			return getShortFromBytes(field_330, 6) >= Define.worldPrices[var0];
		} else {
			return true;
		}
	}

	// $FF: renamed from: m () void
	private void method_74() {
		if (this.field_143 > 0 || this.field_144 > 0) {
			StringBuffer var1 = new StringBuffer();
			if (this.field_143 > 0) {
				var1.append(menuText[92]).append("\n");
				switch (this.field_143) {
				case 1:
					var1.append(menuText[29]);
					field_330[2] |= 8;
					break;
				case 2:
					var1.append(menuText[30]);
					field_330[2] |= 8;
					field_330[2] |= 16;
					break;
				default:
					break;
				}

				this.method_110();
				this.field_143 = 0;
			}

			if (this.field_144 > 0) {
				if (var1.length() > 0) {
					var1.append("\n\n");
				}

				var1.append(menuText[99]).append("\n").append(menuText[85 + this.field_144 - 1]);
				this.field_144 = 0;
			}

			if (var1.length() > 0) {
				this.method_437(var1.toString(), -1, -1, 5000, 0x41340D, 0);
			}
		}

	}

	// $FF: renamed from: n () void
	private void method_75() {
		if (!this.field_229) {
			this.field_104 = this.field_102;
			this.field_105 = this.field_103;
		}

		if (this.field_109) {
			keysPressed = 0;
			int var1 = this.field_112 - this.field_102;
			int var2 = this.field_113 - this.field_103;
			this.field_102 += var1 / (8 - this.field_111);
			this.field_103 += var2 / (8 - this.field_111);
			++this.field_111;
			if (this.field_111 == 8) {
				this.field_102 = this.field_112;
				this.field_103 = this.field_113;
				this.field_109 = false;
				this.field_111 = 0;
				this.field_110 = true;
				this.method_72();
				return;
			}
		} else {
			label33:
				switch (this.field_108) {
				case -1:
					break;
				case 4:
					switch (this.field_101) {
					case 0:
						this.field_372 = true;
						this.field_373 = true;
						this.field_353.method_59();
						this.currentWorld = 0;
						this.field_155 = false;
						field_222 = 15;
						field_532 = this.method_119(this.currentWorld);
						this.method_408();
						break label33;
					case 1:
						if (method_73(this.field_101)) {
							this.field_372 = true;
							this.field_373 = true;
							this.field_353.method_59();
							this.currentWorld = 1;
							this.currentLevel = 0;
							field_222 = 15;
							field_532 = this.method_119(this.currentWorld);
							this.method_408();
							this.field_179 = true;
							this.field_155 = false;
							if (field_330[9] < 1) {
								field_330[9] = 1;
							}
						}
						break label33;
					case 2:
						if (method_73(this.field_101)) {
							this.field_372 = true;
							this.field_373 = true;
							this.field_353.method_59();
							this.currentWorld = 2;
							this.currentLevel = 0;
							this.field_155 = false;
							field_222 = 15;
							field_532 = this.method_119(this.currentWorld);
							this.method_408();
							this.field_179 = true;
							if (field_330[9] < 2) {
								field_330[9] = 2;
							}
						}
						break label33;
					case 3:
						field_222 = 18;
					default:
						break label33;
					}
				default:
					byte var3;
					if ((var3 = Define.field_4[this.field_108][this.field_101]) != -1) {
						this.field_101 = var3;
						this.field_109 = true;
						this.field_112 = Define.field_3[this.field_101 * 2];
						this.field_113 = Define.field_3[this.field_101 * 2 + 1];
					}
				}

			this.field_108 = -1;
		}

	}

	// $FF: renamed from: d (int) void
	private void method_76(int var1) {
		if (var1 < 21) {
			if (var1 == 0) {
				this.field_353.loadMidiIndices();
			}

			this.field_353.method_51(var1);
			if (var1 == 20) {
				this.field_353.method_54();
			}

			System.gc();
		} else {
			switch (var1) {
			case 21:
				field_320[9] = loadGfxFile("/cm.f", 7);
				return;
			case 22:
				field_320[0] = loadGfxFile("/ui.f", 2);
				return;
			case 23:
				field_319[0] = loadSpritesFromFile("/demoui.f", 0, 0);
				field_319[1] = loadSpritesFromFile("/demoui.f", 0, 1);
				return;
			case 24:
				this.field_353.method_52();
				field_222 = 9;
				this.openSubmenu(-1);
				field_510 = new StringBuffer(menuText[8]);
				field_510.delete(field_510.length() - 1, field_510.length());
				field_511 = new StringBuffer(menuText[20]);
				field_511.delete(field_511.length() - 1, field_511.length());
				field_512 = new StringBuffer("1");
			default:
			}
		}
	}

	// $FF: renamed from: a (java.lang.String, int) java.lang.String[]
	/**
	 * Loads null-terminated strings from the first file of an asset pack
	 * @param path Asset pack path
	 * @param stringCount Amount of strings to load
	 * @return
	 */
	public static String[] loadStringsFromFile(String path, int stringCount) {
		byte[] rawStrings = loadPackedFile(path, 0); //Load raw strings from asset pack
		int strStartInd = 0;
		int strCharInd = 0;
		int strNum = 0;
		String[] var6 = new String[stringCount];

		while(strNum < stringCount) {
			if (rawStrings[strStartInd + strCharInd] == 0) {
				try {
					var6[strNum] = new String(rawStrings, strStartInd, strCharInd, "ISO-8859-1");
				} catch (Exception var8) {
					((Throwable)var8).printStackTrace();
				}

				strStartInd += strCharInd + 1; //Move to next raw string
				strCharInd = 0; //Start at beginning of next raw string
				strNum++;
			} else {
				strCharInd++; //Keep going through characters until the string terminator is found
			}
		}

		return var6;
	}

	// $FF: renamed from: o () void
	private void method_78() {
		try {
			int var1 = this.field_266;
			if (this.field_329) {
				var1 -= 5;
			}

			this.field_266++;
			switch (var1) {
			case 0:
				if (this.field_379) {
					this.method_110();
				}

				return;
			case 1:
				if (this.field_378) {
					this.method_115();
				}

				return;
			case 2:
				if (this.field_377) {
					System.gc();
					this.field_377 = false;
				}

				return;
			case 3:
				field_320[41].DeleteCacheImages(1);
				field_320[41].DeleteCacheImages(2);
				return;
			case 4:
				if (this.field_375) {
					this.method_95();
				}

				return;
			case 5:
				if (this.field_373) {
					this.method_407();
				}

				return;
			case 6:
			{
				int var5;
				if ((var5 = method_103()) < 1) {
					this.field_167 = var5;
				} else if ((this.field_167 + 8) % 8 < 1) {
					this.field_167 = 1;
				}
			}

			method_403(this.field_167 % 8);
			return;
			case 7:
				this.method_107();
				return;
			case 8:
				method_146();
				this.loadLevelData();
				return;
			case 9:
				this.method_296();
				return;
			case 10:
				String var2 = "/" + this.currentWorld + ".f";
				this.field_306 = this.getClass().getResourceAsStream(var2);
				this.field_304 = this.field_306.read();
				field_347 = new byte[this.field_304 << 3];
				this.field_306.read(field_347); //Load file index for world's data??
				return;
			default:
				int var6;
				if ((var6 = var1 - 10 - 1) < 4) {
					this.method_97(var6);
					this.field_267 = 0;
				} else {
					var6 -= 4;
					if (var6 >= 0 && var6 < 43) {
						this.method_100(var6);
					} else {
						var6 -= 43;
						if (var6 >= 0 && var6 < 8) {
							this.method_98(var6);
							if (var6 == 7) {
								this.field_306.close();
								this.field_306 = null;
								System.gc();
							}

						} else {
							var6 -= 8;
							if (var6 >= 0 && var6 < 16) {
								if (var6 < field_355.length) {
									field_355[var6] = new DemoInterpreter(this);
									field_355[var6].method_31(field_356[var6]);
								}

								if (var6 == 15 && field_355.length >= 16) {
									for (int var14 = 16; var14 < field_355.length; ++var14) {
										field_355[var14] = new DemoInterpreter(this);
										field_355[var14].method_31(field_356[var14]);
									}
								}

							} else {
								var6 -= 16;
								if (var6 >= 0 && var6 < 3) {
									switch (this.field_174) {
									case 1:
										this.method_102(var6);
										if (var6 == 2) {
											this.field_306.close();
											this.field_306 = null;
										}

										return;
									case 2:
									default:
										return;
									case 3:
										if (var6 > 0) {
											return;
										}

										ASprite var13 = loadGfxFileInit("/mmv.f", 1, 0);
										field_318[31] = var13._modules_image[0];
										field_323[5] = new ASpriteInstance(loadGfxFile("/mm1.f", 0), 0, 0, (ASpriteInstance)null);
										field_323[5].SetAnim(0);
										return;
									case 4:
										if (var6 >= 2) {
											return;
										}

										this.method_101(var6);
										ASprite var12 = loadGfxFileInit("/mmv.f", 3, 0);
										field_318[32] = var12._modules_image[0];
										field_320[20] = loadGfxFileInit("/gen0.f", 7, 0);
										if (var6 == 1) {
											this.field_306.close();
											this.field_306 = null;
										}

										return;
									case 5:
										ASprite var3 = loadGfxFileInit("/mmv.f", 2, 0);
										field_318[30] = var3._modules_image[0];
										field_320[20] = loadGfxFileInit("/gen0.f", 7, 0);
										field_323[5] = new ASpriteInstance(loadGfxFile("/b1.f", 0), 0, 0, (ASpriteInstance)null);
										field_323[5].SetAnim(10);
									}
								} else {
									var6 -= 3;
									switch (var6) {
									case 0:
										field_347 = null;
										this.method_80(field_320[12] != null || field_318[6] != null || field_320[58] != null || this.field_174 == 1 || this.field_174 == 4 || this.field_174 == 5);
										return;
									case 1:
										this.field_327 = 0L;
										this.field_328 = 0L;
										this.field_268 = 0;
										++this.field_167;
										method_104(this.field_167 < 3 ? this.field_167 : 3);
										this.method_110();
										return;
									case 2:
										field_348 = new int[this.currentLevelWidth][this.currentLevelHeight];
										field_350 = new byte[this.currentLevelWidth][this.currentLevelHeight];
										field_351 = new byte[this.currentLevelWidth][this.currentLevelHeight];
										field_349 = new int[this.currentLevelWidth][this.currentLevelHeight];
										if (field_344 != null) {
											field_352 = new byte[field_344.length];
											return;
										}
										break;
									case 3:
										this.method_370();
										return;
									case 4:
										this.field_257 = 0;
										this.field_162 = this.field_163 = 0;
										this.method_346();
										return;
									case 5:
										this.field_260 = frameCounter + 60;
										(new StringBuffer(menuText[38])).append("\n").append(this.field_156).append(" ").append(menuText[39]).toString();
										this.method_96();
										return;
									case 6:
										method_94(field_321, true);
										field_321 = null;
										System.gc();
										return;
									case 7:
										this.field_329 = false;
										field_322 = null;
										System.gc();
										this.field_353.method_58(16 + this.currentWorld); //Play intro theme for current world
										field_222 = 1;
									}

								}
							}
						}
					}
				}
			}
		} catch (Exception var4) {
		}
	}

	// $FF: renamed from: a () int
	private static int method_79() {
		return field_330[8] - 4;
	}

	// $FF: renamed from: a (boolean) void
	private void method_80(boolean var1) {
		try {
			InputStream var2;
			byte[] var4 = new byte[(var2 = this.getClass().getResourceAsStream("/o.f")).read() << 3];
			var2.read(var4);
			byte[] var6 = new byte[getIntFromBytes(var4, 4)];
			var2.read(var6);
			if (!var1) {
				var2.close();
				var2 = null;
				System.gc();
			}

			ASprite var7;
			(var7 = new ASprite()).Load(var6, 0);
			this.field_380 = method_79();
			var7.BuildCacheImages(this.field_380, 0, -1, -1);
			var7._crt_pal = this.field_380;
			var7._modules_data = null;
			field_323[0] = new ASpriteInstance(var7, 0, 0, (ASpriteInstance)null);
			System.gc();
			if (var1) {
				var6 = new byte[getIntFromBytes(var4, 12)];
				var2.read(var6);
				var2.close();
				System.gc();
				(var7 = new ASprite()).Load(var6, 0);
				var7.BuildCacheImages(0, 0, -1, -1);
				var7._modules_data = null;
				field_323[3] = new ASpriteInstance(var7, 0, 0, (ASpriteInstance)null);
				System.gc();
			}

		} catch (Exception var8) {
		}
	}

	// $FF: renamed from: b () int
	private int method_81() {
		return menuData[this.currentMenu][this.currentMenuSelection << 1];
	}

	// $FF: renamed from: p () void
	private void method_82() {
		field_320[41]._crt_pal = 0;
		this.field_261 = true;
		switch (this.currentMenu) {
		case 0:
			this.method_89();
			return;
		case 1:
			this.method_85();
			return;
		case 2:
			this.method_87();
			return;
		case 3:
			this.method_88();
			return;
		case 5:
			this.method_84();
		case 4:
		case 6:
		default:
			return;
		case 7:
			this.method_83();
		}
	}

	// $FF: renamed from: q () void
	private void method_83() {
		switch (this.method_81()) {
		case 0:
			if (this.previousMenu == 0) {
				field_222 = 4;
			}

			this.openSubmenu(this.previousMenu);
			break;
		case 1:
			switch (this.field_223) {
			case 1:
				this.method_86();
			case 2:
			default:
				break;
			case 3:
				field_222 = 15;
				this.field_375 = true;
				this.field_373 = true;
				this.method_408();
				break;
			case 4:
				this.method_95();
				field_222 = 9;
				this.field_265 = 8;
				this.openSubmenu(-1);
				this.field_266 = 0;
				break;
			case 5:
				field_222 = 3;
				this.field_353.method_55();
				field_358.notifyDestroyed();
			}
		}

		this.field_223 = -1;
	}

	// $FF: renamed from: r () void
	private void method_84() {
		switch (this.method_81()) {
		case 0:
			cSoundEngine.soundEnabled = !cSoundEngine.soundEnabled;
			if (cSoundEngine.soundEnabled) {
				this.method_433(0);
				setMenuTextIndex(5, 0, (short) 32); //Set sound text to on
			} else {
				this.field_353.method_59();
				this.field_353.method_59();
				setMenuTextIndex(5, 0, (short) 33); //Set sound text to off
			}
			break;
		case 1:
			vibrationEnabled = !vibrationEnabled;
			if (vibrationEnabled) {
				vibrate(200);
				setMenuTextIndex(5, 1, (short) 50); //Set vibrate text to on
			} else {
				setMenuTextIndex(5, 1, (short) 51); //Set vibrate text to off
			}
			break;
		default:
			return;
		}
	}

	// $FF: renamed from: s () void
	private void method_85() {
		switch (this.method_81()) {
		case 0:
			field_222 = 1;
			field_513 = null;
			field_428 = null;
			return;
		case 1:
			this.openSubmenu(7); //Open yes/no confirmation
			this.field_223 = 1;
			return;
		case 2:
			this.openSubmenu(5); //Show options menu
			return;
		case 3:
			if (this.currentLevel != 13 || this.currentWorld != 0) {
				this.openSubmenu(7); //Open yes/no confirmation
				this.field_223 = 3;
				return;
			}
			break;
		case 4:
			this.openSubmenu(7); //Open yes/no confirmation
			this.field_223 = 4;
			return;
		case 5:
			this.openSubmenu(7); //Open yes/no confirmation
			this.field_223 = 5;
			return;
		case 6:
			field_222 = 33;
			this.field_557 = true;
			return;
		default:
			this.field_261 = false;
		}

	}

	// $FF: renamed from: t () void
	private void method_86() {
		this.field_265 = this.field_329 ? 97 : 92;
		this.field_266 = 0;
		this.field_375 = true;
		this.field_238 = false;
		field_222 = 11;
		this.field_233 = this.field_197 = this.field_196 = 0;
		this.field_210 = this.field_211 = -1;
		this.field_241 = 0L;
	}

	// $FF: renamed from: u () void
	private void method_87() {
		switch (this.method_81()) {
		case 0:
			this.field_353.method_59();
			this.currentWorld = 0;
			this.field_155 = false;
			field_222 = 15;
			field_532 = this.method_119(this.currentWorld);
			this.field_373 = true;
			this.method_408();
			return;
		case 1:
			this.field_353.method_59();
			this.currentWorld = 1;
			this.currentLevel = 0;
			field_222 = 15;
			field_532 = this.method_119(this.currentWorld);
			this.field_373 = true;
			this.method_408();
			this.field_179 = true;
			this.field_155 = false;
			if (field_330[9] < 1) {
				field_330[9] = 1;
				return;
			}
			break;
		case 2:
			this.field_353.method_59();
			this.currentWorld = 2;
			this.currentLevel = 0;
			this.field_155 = false;
			field_222 = 15;
			field_532 = this.method_119(this.currentWorld);
			this.field_373 = true;
			this.method_408();
			this.field_179 = true;
			if (field_330[9] < 2) {
				field_330[9] = 2;
			}

			if (field_330[8] < 8) {
				field_330[8] = 8;
				return;
			}
			break;
		case 3:
			this.openSubmenu(4);
			return;
		default:
			field_222 = 3;
			this.field_353.method_55();
			field_358.method_443();
		}

	}

	// $FF: renamed from: v () void
	private void method_88() {
		byte var1 = 0;
		switch (this.method_81()) {
		case 0:
			cSoundEngine.soundEnabled = true;
			var1 = 32;
			break;
		case 1:
			cSoundEngine.soundEnabled = false;
			var1 = 33;
			break;
		default:
		}

		this.field_223 = 0;
		setMenuTextIndex(5, 0, var1);
	}

	// $FF: renamed from: w () void
	private void method_89() {
		switch (this.method_81()) {
		case 1:
			this.field_353.method_59();
			this.method_109();
			if (field_330 != null && method_105()) {
				this.field_167 = 0;
				this.field_378 = true;
				this.field_179 = true;
				this.field_266 = 0;
				field_222 = 28;
				return;
			}
		case 0:
			this.field_353.method_59();
			if (!method_105()) {
				this.method_218();
				return;
			}

			this.field_387 = true;
			this.field_329 = false;
			field_222 = 31;
			return;
		case 2:
			this.openSubmenu(5);
			this.field_353.method_59();
			return;
		case 3:
			field_222 = 33;
			this.field_353.method_59();
			this.field_557 = true;
			return;
		case 4:
			field_222 = 22;
			this.field_223 = 0;
			this.field_353.method_59();
			return;
		case 5:
			this.openSubmenu(7);
			this.field_223 = 5;
			return;
		case 6:
			field_222 = 10;
			return;
		default:
			this.field_261 = false;
		}
	}

	// $FF: renamed from: x () void
	private void selectPreviousMenuItem() {
		this.currentMenuSelection--;
		if (this.currentMenuSelection < 0) {
			this.currentMenuSelection = (menuData[this.currentMenu].length >> 1) - 1; //Wrap around menu
		}

	}

	// $FF: renamed from: y () void
	private void selectNextMenuItem() {
		this.currentMenuSelection = (this.currentMenuSelection + 1) % (menuData[this.currentMenu].length >> 1);
	}

	// $FF: renamed from: z () void
	private void method_92() {
		this.field_376 = false;
		if (field_355 != null) {
			int var1 = field_355.length;

			for (int var2 = 0; var2 < var1; ++var2) {
				method_93(field_355[var2]);
				field_355[var2] = null;
			}
		}

		field_355 = null;
		method_94(field_320[42], true);
		method_94(field_320[43], true);
		System.gc();
	}

	// $FF: renamed from: a (c) void
	private static void method_93(DemoInterpreter var0) {
		if (var0 != null) {
			if (DemoInterpreter.field_41 != null) {
				for (int var1 = 0; var1 < DemoInterpreter.field_41.length; ++var1) {
					method_94(DemoInterpreter.field_41[var1], true);
					DemoInterpreter.field_41[var1] = null;
				}
			}

			if (var0.field_42 != null) {
				for (int var2 = 0; var2 < var0.field_42.length; ++var2) {
					var0.field_42[var2] = null;
				}

				var0.field_42 = (byte[][])null;
			}

			var0.field_45 = null;
		}
	}

	// $FF: renamed from: a (a, boolean) void
	private static void method_94(ASprite var0, boolean var1) {
		if (var0 != null) {
			var0.FreeCacheData(var1);
		}
	}

	// $FF: renamed from: A () void
	private void method_95() {
		this.field_375 = false;
		this.field_170 = true;
		this.field_338 = false;
		this.field_463 = 0;
		this.field_462 = null;
		field_344 = null;
		field_343 = null;
		this.field_171 = 0;
		this.field_172 = 0;
		field_173 = null;
		field_192 = null;
		this.field_306 = null;
		field_347 = null;
		field_513 = null;
		field_514 = null;
		field_395 = null;
		field_394 = null;
		field_356 = null;
		field_337 = null;
		if (field_355 != null) {
			int var1 = field_355.length;

			for (int var2 = 0; var2 < var1; ++var2) {
				method_93(field_355[var2]);
				field_355[var2] = null;
			}
		}

		field_355 = null;
		if (this.field_354 != null) {
			method_93(this.field_354);
			this.field_354 = null;
		}

		if (field_318 != null) {
			for (int var4 = 0; var4 < 33; ++var4) {
				if (field_318[var4] != null) {
					int var7 = field_318[var4].length;

					for (int var3 = 0; var3 < var7; ++var3) {
						field_318[var4][var3] = null;
					}

					field_318[var4] = null;
				}
			}
		}

		method_94(field_499, true);
		System.gc();
		if (field_320 != null) {
			for (int var5 = 0; var5 < 61; ++var5) {
				if (var5 != 41 && var5 != 0 && var5 != 9 && var5 != 18) {
					method_94(field_320[var5], true);
					field_320[var5] = null;
				}
			}
		}

		if (field_323 != null) {
			for (int var6 = 0; var6 < 6; ++var6) {
				if (field_323[var6] != null) {
					method_94(field_323[var6]._sprite, true);
					field_323[var6]._sprite = null;
					field_323[var6] = null;
				}
			}
		}

		field_333 = (int[][])null;
		field_332 = (int[][])null;
		field_335 = (byte[][])null;
		field_334 = (byte[][])null;
		field_336 = (byte[][])null;
		field_348 = (int[][])null;
		field_349 = (int[][])null;
		field_350 = (byte[][])null;
		field_351 = (byte[][])null;
		field_352 = null;
		this.field_327 = 0L;
		this.field_268 = 0;
		this.field_208 = -1;
		this.field_210 = -1;
		this.field_212 = -1;
		this.field_213 = -1;
		field_324 = null;
		this.field_285 = -1;
		this.field_487 = 3;
		field_500 = (int[][])null;
		field_503 = (int[][])null;
		field_501 = null;
		field_504 = null;
		field_502 = null;
		field_505 = null;
		this.field_474 = false;
		this.field_475 = -1;
		this.field_476 = 0;
		this.field_477 = 0;
		this.field_478 = 0;
		this.field_481 = 0;
		this.field_482 = 0;
		this.field_483 = 0;
		this.field_484 = 0;
		this.field_485 = 0;
		this.field_486 = -1;
		this.field_155 = false;
		field_192 = null;
		method_171();
		System.gc();
	}

	// $FF: renamed from: B () void
	private void method_96() {
		this.field_170 = true;
	}

	// $FF: renamed from: e (int) void
	private void method_97(int var1) throws Exception {
		ASprite var4;
		byte[] var3 = new byte[getIntFromBytes(field_347, var1 * 8 + 4)];
		this.field_306.read(var3);
		(var4 = new ASprite()).Load(var3, 0);
		var4.BuildCacheImages(0, 0, -1, -1);
		switch (var1) {
		case 0:
			if ((this.field_328 & 1L) == 0L) {
				break;
			}
			field_320[60] = var4;
			break;
		case 1:
			if ((this.field_328 & 2L) == 0L) {
				break;
			}
			field_320[16] = var4;
			break;
		case 2:
			field_318[0] = null;
			field_320[42] = var4;
			break;
		case 3:
			field_318[8] = var4._modules_image[0];
			break;
		default:
			break;
		}

		var4._modules_data = null;
	}

	// $FF: renamed from: f (int) void
	private void method_98(int var1) {
		try {
			if (var1 == 0) {
				this.field_306.close();
				this.field_306 = null;
				System.gc();
				this.field_306 = this.getClass().getResourceAsStream("/cm.f");
				this.field_304 = this.field_306.read();
				field_347 = new byte[this.field_304 << 3];
				this.field_306.read(field_347);
			}

			ASprite var4;
			label36: {
				Object var10000;
				byte var10001;
				Object var10002;
				label35: {
					byte[] var3 = new byte[getIntFromBytes(field_347, var1 * 8 + 4)];
					this.field_306.read(var3);
					(var4 = new ASprite()).Load(var3, 0);
					var4.BuildCacheImages(0, 0, -1, -1);
					switch (var1) {
					case 0:
						var10000 = field_318;
						var10001 = 11;
						break;
					case 1:
						switch (this.currentWorld) {
						case 1:
						case 2:
							if (this.currentWorld != 0) {
								var4.BuildCacheImages(this.currentWorld, 0, -1, -1);
								var4.DeleteCacheImages(0);
								var4._crt_pal = this.currentWorld;
							}
						default:
							var10000 = field_320;
							var10001 = 56;
							var10002 = var4;
							break label35;
						}
					case 2:
						var4.BuildCacheImages(1, 0, 0, -1);
						var10000 = field_320;
						var10001 = 59;
						var10002 = var4;
						break label35;
					case 3:
						field_320[13] = var4;
						this.method_99();
						break label36;
					case 4:
						var10000 = field_318;
						var10001 = 5;
						break;
					case 5:
						var10000 = field_318;
						var10001 = 18;
						break;
					case 6:
						field_320[43] = var4;
						var10000 = field_318;
						var10001 = 20;
						var10002 = null;
						break label35;
					default:
						break label36;
					}

					var10002 = var4._modules_image[0];
				}

				((Object[])var10000)[var10001] = var10002;
			}

			var4._modules_data = null;
		} catch (Exception var5) {
		}
	}

	// $FF: renamed from: C () void
	private void method_99() {
		if ((this.field_328 & 1L) == 0L) {
			for (int var1 = 0; var1 < 5; ++var1) {
				field_320[13]._modules_image[0][var1] = null;
			}
		}

	}

	// $FF: renamed from: g (int) void
	private void method_100(int var1) {
		try {
			if (var1 % 10 == 0) {
				this.field_306.close();
				this.field_306 = null;
				StringBuffer var2 = (new StringBuffer("/gen")).append(this.field_267).append(".f");
				this.field_306 = this.getClass().getResourceAsStream(var2.toString());
				this.field_304 = this.field_306.read();
				field_347 = new byte[this.field_304 << 3];
				this.field_306.read(field_347);
				this.field_305 = 0;
				++this.field_267;
			}

			int var9 = var1 - (this.field_267 - 1) * 10;
			int var3 = getIntFromBytes(field_347, var9 * 8 + 4);
			if ((this.field_327 & 1L << var1) == 0L) {
				this.field_305 += var3;
				return;
			}

			if (this.field_305 != 0) {
				this.field_306.skip((long)this.field_305);
				this.field_305 = 0;
			}

			byte[] var4 = new byte[var3];
			this.field_306.read(var4);
			ASprite var5;
			(var5 = new ASprite()).Load(var4, 0);
			if ((var1 != 28 || this.field_458) && (var1 != 24 || this.field_460)) {
				var5.BuildCacheImages(0, 0, -1, -1);
			}

			byte var6;
			byte var7;
			label104: {
				var6 = -1;
				var7 = -1;
				byte var10000;
				switch (var1) {
				case 0:
					var6 = 33;
					break label104;
				case 1:
					var6 = 34;
					break label104;
				case 2:
					if (this.field_458) {
						field_318[24] = var5._modules_image[0];
					}

					if (this.field_459) {
						var5.BuildCacheImages(1, 0, -1, -1);
						field_318[25] = var5._modules_image[1];
					}
					break label104;
				case 3:
					var6 = 7;
					break label104;
				case 4:
				case 21:
					if (this.currentWorld != 2) {
						var6 = 3;
					}
					break label104;
				case 5:
					var6 = 58;
					break label104;
				case 6:
					var10000 = 21;
					break;
				case 7:
					if (this.currentWorld == 2) {
						var5._modules_image = (Image[][])null;
						var5.BuildCacheImages(1, 0, -1, -1);
						var5._crt_pal = 1;
					}

					var6 = 20;
					break label104;
				case 8:
					var6 = 5;
					break label104;
				case 9:
					var6 = 12;
					break label104;
				case 10:
					field_323[4] = new ASpriteInstance(var5, 0, 0, (ASpriteInstance)null);
					field_323[4].SetAnim(0);
					break label104;
				case 11:
					var6 = 11;
					break label104;
				case 12:
					var10000 = 10;
					break;
				case 13:
					var6 = 1;
					break label104;
				case 14:
					var10000 = 6;
					break;
				case 15:
				case 17:
					if ((this.field_268 & 2) != 0) {
						if (this.currentWorld == 2) {
							var5._modules_image = (Image[][])null;
							var5.BuildCacheImages(2, 0, -1, -1);
							var5._crt_pal = 2;
						}

						var6 = 4;
					}

					if ((this.field_268 & 1) != 0) {
						field_320[21] = new ASprite();
						field_320[21].Load(var4, 0);
						field_320[21].BuildCacheImages(1, 0, -1, -1);
						field_320[21]._crt_pal = 1;
						field_320[21]._modules_data = null;
					}
					break label104;
				case 16:
				case 18:
					var6 = 37;
					break label104;
				case 19:
					var10000 = 7;
					break;
				case 20:
					var10000 = 13;
					break;
				case 22:
					var6 = 8;
					break label104;
				case 23:
					var6 = 30;
					break label104;
				case 24:
					field_318[15] = null;
					var5.BuildCacheImages(1, 0, -1, -1);
					var6 = 57;
					field_318[14] = null;
					break label104;
				case 25:
					var10000 = 17;
					break;
				case 26:
					field_499 = var5;
					break label104;
				case 27:
					var10000 = 19;
					break;
				case 28:
					if (this.field_459) {
						var5.BuildCacheImages(1, 0, -1, -1);
					}

					var6 = 45;
					break label104;
				case 29:
					var10000 = 26;
					break;
				case 30:
					var6 = 15;
					break label104;
				case 31:
					var10000 = 29;
					break;
				case 32:
					var6 = 32;
					break label104;
				case 33:
					var6 = 22;
					break label104;
				case 34:
					var6 = 27;
					break label104;
				case 35:
					var6 = 28;
					break label104;
				case 36:
					var6 = 35;
					break label104;
				case 37:
					var6 = 29;
					break label104;
				case 38:
					var6 = 36;
					break label104;
				case 39:
					var6 = 6;
					break label104;
				case 40:
					var6 = 2;
					break label104;
				case 41:
					var6 = 38;
					break label104;
				case 42:
					var6 = 39;
				default:
					break label104;
				}

				var7 = var10000;
			}

			if (var6 != -1) {
				field_320[var6] = var5;
			}

			if (var7 != -1) {
				field_318[var7] = var5._modules_image[0];
			}

			var5._modules_data = null;
		} catch (IOException var8) {
		}

	}

	// $FF: renamed from: h (int) void
	private void method_101(int var1) {
		try {
			if (var1 == 0) {
				this.field_306 = this.getClass().getResourceAsStream("/b0.f");
				this.field_304 = this.field_306.read();
				field_347 = new byte[this.field_304 * 8];
				this.field_306.read(field_347);
			}

			byte[] var3 = new byte[getIntFromBytes(field_347, var1 * 8 + 4)];
			this.field_306.read(var3);
			ASprite var4;
			(var4 = new ASprite()).Load(var3, 0);
			var4.BuildCacheImages(0, 0, -1, -1);
			var4._modules_data = null;
			switch (var1) {
			case 0:
				field_323[5] = new ASpriteInstance(var4, 0, 0, (ASpriteInstance)null);
				break;
			case 1:
				field_320[40] = var4;
			default:
				return;
			}
		} catch (Exception var5) {
		}

	}

	// $FF: renamed from: i (int) void
	private void method_102(int var1) {
		try {
			if (var1 == 0) {
				this.field_306 = this.getClass().getResourceAsStream("/mm0.f");
				this.field_304 = this.field_306.read();
				field_347 = new byte[this.field_304 * 8];
				this.field_306.read(field_347);
			}

			byte[] var3 = new byte[getIntFromBytes(field_347, var1 * 8 + 4)];
			this.field_306.read(var3);
			ASprite var4;
			(var4 = new ASprite()).Load(var3, 0);
			var4.BuildCacheImages(0, 0, -1, -1);
			var4._modules_data = null;
			switch (var1) {
			case 0:
				field_323[1] = new ASpriteInstance(var4, 0, 0, (ASpriteInstance)null);
				field_323[1].SetAnim(2);
			default:
				return;
			case 1:
				field_323[2] = new ASpriteInstance(var4, 0, 0, (ASpriteInstance)null);
				field_323[2].SetAnim(0);
				break;
			case 2:
				field_318[27] = var4._modules_image[0];
			}
		} catch (Exception var5) {
		}

	}

	// $FF: renamed from: c () int
	private static int method_103() {
		return field_330[12];
	}

	// $FF: renamed from: j (int) void
	private static void method_104(int var0) {
		field_330[12] = (byte)var0;
	}

	// $FF: renamed from: a () boolean
	private static boolean method_105() {
		if (field_330 == null) {
			return false;
		} else {
			return field_330[13] != 0;
		}
	}

	// $FF: renamed from: b (boolean) void
	private void method_106(boolean var1) {
		field_330[13] = (byte)(var1 ? 1 : 0);
		this.method_110();
	}

	// $FF: renamed from: D () void
	private void method_107() {
		this.levelRedDiamondCount = this.method_126(this.currentWorld, this.currentLevel);
	}

	// $FF: renamed from: E () void
	private void method_108() {
		this.field_374 = false;
		this.method_114();
		this.method_118(this.currentWorld, field_532);
		this.method_125(this.currentWorld, this.currentLevel, this.collectedRedDiamonds + this.method_124(this.currentWorld, this.currentLevel));
		this.method_110();
	}

	// $FF: renamed from: F () void
	private void method_109() {
		try {
			RecordStore var1;
			field_330 = (var1 = RecordStore.openRecordStore("DiamondRush", true)).getRecord(1);
			this.field_382 = field_330.length;
			var1.closeRecordStore();
		} catch (Exception var2) {
		}
	}

	// $FF: renamed from: G () void
	private void method_110() {
		this.field_379 = false;

		try {
			RecordStore var1;
			if ((var1 = RecordStore.openRecordStore("DiamondRush", true)).getNumRecords() == 0) {
				var1.addRecord(field_330, 0, this.field_382);
			} else {
				var1.setRecord(1, field_330, 0, this.field_382);
			}

			var1.closeRecordStore();
		} catch (Exception var2) {
		}
	}

	// $FF: renamed from: H () void
	private void loadPreferenceData() {
		RecordStore preferences = null;

		try {
			preferences = RecordStore.openRecordStore("Preferences", false);
		} catch (Exception var5) {
		}

		preferenceData = new byte[1];
		// If preference data doesn't exist
		if (preferences == null) {
			try {
				preferences = RecordStore.openRecordStore("Preferences", true); //Create and open record
				preferenceData[0] = 0; //Initialize preference data
				this.preferenceDataSize = preferenceData.length; //Get size of preference data
				preferences.closeRecordStore();
				this.initPreferenceRecord();
			} catch (Exception var3) {
			}
			// If preference data already exists
		} else {
			try {
				preferenceData = preferences.getRecord(1); //Load preference data
				this.preferenceDataSize = preferenceData.length; //Get size of preference data
				preferences.closeRecordStore();
			} catch (Exception var4) {
			}
		}
	}

	// $FF: renamed from: I () void
	private void initPreferenceRecord() {
		try {
			RecordStore preferences;
			if ((preferences = RecordStore.openRecordStore("Preferences", true)).getNumRecords() == 0) {
				preferences.addRecord(preferenceData, 0, this.preferenceDataSize); //Add record if preference record store is empty
			} else {
				preferences.setRecord(1, preferenceData, 0, this.preferenceDataSize); //Initialize preference record if it already exists
			}

			preferences.closeRecordStore();
		} catch (Exception var2) {
		}
	}

	// $FF: renamed from: k (int) void
	private void method_113(int var1) {
		try {
			String var2 = null;
			switch (var1) {
			case 0:
			case 1:
				RecordStore var3 = null;

				try {
					var3 = RecordStore.openRecordStore("DiamondRush", false);
				} catch (Exception var17) {
				}

				if (var3 == null) {
					this.field_383 = true;
				} else {
					this.field_383 = false;
					var3.closeRecordStore();
				}

				if (var1 != 0) {
					field_330 = new byte[1000];
					field_330[3] = 5;
					field_330[8] = 4;
					field_330[9] = 0;
					field_330[10] = 0;
					this.field_382 = 14;
					this.field_382 += 6;
				}

				return;
			case 2:
				var2 = "/map_angkor.out";
			case 3:
				if (var2 == null) {
					var2 = "/map_scotland.out";
				}
			case 4:
				if (var2 == null) {
					var2 = "/map_tibet.out";
				}

				this.field_306 = this.getClass().getResourceAsStream(field_566[var1 - 2]);
				this.field_306.read();
				int var4 = var1 - 2;
				int var5 = this.field_382;
				field_330[14 + var4 * 2] = (byte)(this.field_382 & 255);
				field_330[14 + var4 * 2 + 1] = (byte)(this.field_382 >> 8);
				int var6 = this.field_306.read();
				field_330[this.field_382++] = (byte)var6;
				field_330[this.field_382++] = 0;
				this.method_409();
				this.method_426(var2);
				field_330[this.field_382++] = (byte)this.field_515;
				this.method_407();
				this.field_382 += var6 << 1;

				for (int i = 0; i < var6; i++) {
					int var8 = this.field_382;
					field_330[var5 + 3 + i * 2] = (byte)(var8 & 255);
					field_330[var5 + 3 + i * 2 + 1] = (byte)(var8 >> 8);
					byte var9 = 0;
					byte var10 = 0;
					int var11 = readU16FromStream(this.field_306);
					int var12 = readU16FromStream(this.field_306);
					byte[] var13 = new byte[var11 * var12];
					this.field_306.read(var13);

					for (int var14 = 0; var14 < var12; ++var14) {
						for (int var15 = 0; var15 < var11; ++var15) {
							if (var13[var15 + var14 * var11] == 2) {
								++var10;
							}
						}
					}

					field_330[0] += var10;
					field_330[this.field_382++] = 0;
					field_330[this.field_382++] = var10;
					field_330[this.field_382++] = 0;
					this.field_306.skip((long)(var11 * var12));
					int var19 = this.field_382;
					this.field_382 += 2;
					this.field_306.read(var13);

					for (int var20 = 0; var20 < var12; ++var20) {
						for (int var16 = 0; var16 < var11; ++var16) {
							if (var13[var16 + var20 * var11] == 14 || var13[var16 + var20 * var11] == 33) {
								field_330[this.field_382++] = (byte)var16;
								field_330[this.field_382++] = (byte)var20;
								++var9;
							}
						}
					}

					field_330[var19] = 0;
					field_330[var19 + 1] = var9;
				}

				this.field_306.close();
				this.field_306 = null;
				System.gc();
			case 5:
			}

		} catch (Exception var18) {
		}
	}

	// $FF: renamed from: J () void
	private void method_114() {
		field_330[3] = (byte)this.playerLifeCount;
		field_330[11] = this.field_366;
	}

	// $FF: renamed from: K () void
	private void method_115() {
		this.field_378 = false;
		this.playerLifeCount = field_330[3];
		this.field_366 = field_330[11];
		this.collectedDiamonds = getShortFromBytes(field_330, 4);
	}

	// $FF: renamed from: a (int, int) byte
	private byte method_116(int var1, int var2) {
		int var3 = this.method_123(var1, var2);
		return field_330[var3 + 2];
	}

	// $FF: renamed from: a (int, int, byte) void
	private void method_117(int var1, int var2, byte var3) {
		int var4 = this.method_123(var1, var2);
		field_330[var4 + 2] |= var3;
	}

	// $FF: renamed from: a (int, int) void
	private void method_118(int var1, int var2) {
		int var3 = method_120(var1) + 1;
		if (field_330[var3] < var2) {
			field_330[var3] = (byte)var2;
		}

	}

	// $FF: renamed from: b (int) int
	private int method_119(int var1) {
		int var2 = method_120(var1) + 1;
		return var2 >= 0 && var2 <= field_330.length ? field_330[method_120(var1) + 1] : 0;
	}

	// $FF: renamed from: c (int) int
	private static int method_120(int var0) {
		if (var0 < 0) {
			var0 = 0;
		} else {
			if (var0 < 3) {
				return getShortFromBytes(field_330, 14 + var0 * 2);
			}

			var0 = 2;
		}

		return getShortFromBytes(field_330, 14 + var0 * 2);
	}

	// $FF: renamed from: d (int) int
	private int method_121(int var1) {
		try {
			return field_330[method_120(var1) + 0];
		} catch (Exception var3) {
			return 0;
		}
	}

	// $FF: renamed from: e (int) int
	private int method_122(int var1) {
		return field_330[method_120(var1) + 2];
	}

	// $FF: renamed from: a (int, int) int
	private int method_123(int var1, int var2) {
		return getShortFromBytes(field_330, method_120(var1) + 3 + var2 * 2);
	}

	// $FF: renamed from: b (int, int) int
	private int method_124(int var1, int var2) {
		return field_330[this.method_123(var1, var2) + 0];
	}

	// $FF: renamed from: b (int, int, int) void
	private void method_125(int var1, int var2, int var3) {
		field_330[this.method_123(var1, var2) + 0] = (byte)var3;
	}

	// $FF: renamed from: c (int, int) int
	private int method_126(int var1, int var2) {
		return field_330[this.method_123(var1, var2) + 1];
	}

	// $FF: renamed from: a (int, int, int, int) void
	private void method_127(int var1, int var2, int var3, int var4) {
		int var5 = this.method_123(var1, var2);
		byte var6 = field_330[var5 + 4];

		for (int var7 = 0; var7 < var6; ++var7) {
			if (field_330[var5 + 5 + 2 * var7 + 0] == var3 && field_330[var5 + 5 + 2 * var7 + 1] == var4) {
				field_330[var5 + 5 + 2 * var7 + 0] = 0;
				field_330[var5 + 5 + 2 * var7 + 1] = 0;
				++field_330[var5 + 3];
				return;
			}
		}

	}

	// $FF: renamed from: a (int, int, int, int) boolean
	private boolean method_128(int var1, int var2, int var3, int var4) {
		int var5 = this.method_123(var1, var2);
		byte var6 = field_330[var5 + 4];

		for (int var7 = 0; var7 < var6; ++var7) {
			if (field_330[var5 + 5 + 2 * var7 + 0] == var3 && field_330[var5 + 5 + 2 * var7 + 1] == var4) {
				return false;
			}
		}

		return true;
	}

	// $FF: renamed from: L () void
	private void method_129() {
		this.field_180 = 13;
		this.field_182 = 4;
		this.field_185 = 408;
		this.field_174 = 5;
		this.field_327 |= 128L;
		this.field_327 |= 8L;
		this.field_452 = false;
		this.field_135 = 16;
		this.field_136 = 16;
		this.field_137 = 19;
		this.field_138 = 18;
	}

	// $FF: renamed from: M () void
	private void loadLevelData() throws Exception {
		field_398 = -1;
		field_367 = false;
		this.field_100 = true;
		this.field_207 = 0;
		this.field_255 = 0;
		this.field_327 = 0L;
		this.field_328 = 0L;
		this.field_157 = 0;
		this.field_158 = 0;
		this.field_174 = 0;
		this.field_384 = (this.method_116(this.currentWorld, this.currentLevel) & 2) != 0;
		this.field_342 = 0;
		switch (this.currentWorld) {
		case 0:
			if (this.currentLevel == 5) {
				this.field_174 = 1;
				this.field_176 = 816;
				this.field_177 = 0;
			} else if (this.currentLevel == 13) {
				this.field_174 = 2;
				this.field_189 = false;
			} else if (this.currentLevel == 8) {
				this.field_174 = 4;
				this.field_180 = 0;
				this.field_182 = 3;
				this.field_183 = 0;
				this.field_181 = 0;
				this.field_141 = false;
				this.field_327 |= 8L;
				this.field_327 |= 1024L;
				this.field_135 = 2;
				this.field_136 = 12;
				this.field_137 = 15;
				this.field_138 = 5;
			}
			break;
		case 1:
			if (this.currentLevel == 9) {
				this.method_129();
			}
			break;
		case 2:
			if (this.currentLevel == 10) {
				this.method_281();
				this.field_184 = 360;
				this.field_174 = 3;
				this.field_327 |= 128L;
				this.field_327 |= 8L;
			}
		}

		this.field_186 = false;
		this.field_187 = false;
		this.field_188 = false;
		this.field_156 = 0;
		this.field_249 = -1;
		this.field_250 = -1;
		this.field_251 = 0;
		this.field_252 = 0;
		this.field_253 = 0;
		this.field_254 = 0;
		this.field_194 = 70;
		this.field_239 = field_330[8];
		this.field_197 = 0;
		this.collectedDiamonds = 0;
		this.field_247 = 0;
		this.field_248 = 0;
		this.collectedRedDiamonds = 0;
		this.field_240 = 0;
		this.field_233 = 0;
		this.field_234 = 0;
		this.playerGoldKeys = 0;
		this.playerSilverKeys = 0;
		field_345 = -1;
		field_344 = null;
		field_343 = null;
		this.field_306 = this.getClass().getResourceAsStream(field_566[this.currentWorld]);
		this.field_306.read();
		boolean var2 = false;

		while(!var2) {
			int var3 = this.field_306.read();
			int var4 = 0;

			for (byte[] buf = new byte[4]; var4 < var3 && !var2; var4++) {
				this.field_306.read(buf);
				int levelWidth = getShortFromBytes(buf, 0);
				int levelHeight = getShortFromBytes(buf, 2); //Get level dimensions
				if (var4 != this.currentLevel) {
					this.field_306.skip((long)(levelWidth * levelHeight * 3)); //Skip until the data for the current level is found
				} else {
					this.currentLevelWidth = levelWidth;
					this.currentLevelHeight = levelHeight;
					field_334 = (byte[][])null;
					field_336 = (byte[][])null;
					field_332 = (int[][])null;
					System.gc();
					field_334 = new byte[this.currentLevelWidth][this.currentLevelHeight];
					field_336 = new byte[this.currentLevelWidth][this.currentLevelHeight];
					field_332 = new int[this.currentLevelWidth][this.currentLevelHeight];
					buf = new byte[this.currentLevelWidth * this.currentLevelHeight];
					this.field_306.read(buf);

					for (int c = 0; c < this.currentLevelWidth; c++) {
						for (int r = 0; r < this.currentLevelHeight; r++) {
							field_334[c][r] = buf[c + r * this.currentLevelWidth];
						}
					}

					field_335 = new byte[this.currentLevelWidth][this.currentLevelHeight];
					field_333 = new int[this.currentLevelWidth][this.currentLevelHeight];
					this.field_306.read(buf);

					for (int c = 0; c < this.currentLevelWidth; c++) {
						for (int r = 0; r < this.currentLevelHeight; r++) {
							field_333[c][r] = buf[c + r * this.currentLevelWidth];
						}
					}

					this.field_306.read(buf);

					for (int c = 0; c < this.currentLevelWidth; c++) {
						for (int r = 0; r < this.currentLevelHeight; r++) {
							field_332[c][r] = buf[c + r * this.currentLevelWidth];
						}
					}

					buf = null;
					var2 = true;
				}
			}
		}

		this.field_306.close();
		this.field_306 = null;
		this.field_201 = this.field_203 = 0;
		this.field_202 = this.field_204 = 0;
		this.method_285();
		System.gc();
	}

	// $FF: renamed from: N () void
	private void method_131() {
		int var1 = this.field_528;
		int var2 = this.field_529;
		long var3;
		int var5 = method_410(var3 = field_509[var1][var2], (byte)6, (byte)5);
		int var6 = method_410(var3, (byte)11, (byte)3);
		int var7 = 14;
		if (this.currentLevel >= this.field_515) {
			this.method_117(this.currentWorld, this.currentLevel, (byte)2);
		}

		if (var6 > 1) {
			for (int var8 = 0; var8 < var6; var7 += 4) {
				int var9 = method_410(var3, (byte)var7, (byte)4);
				var7 += 4;
				int var10 = method_410(var3, (byte)var7, (byte)4);
				long var11;
				int var14;
				if (method_410(var11 = field_509[var9][var10], (byte)3, (byte)3) == 1 && (var14 = method_410(var11, (byte)6, (byte)5)) > var5) {
					field_532 = var14;
					this.field_385 = var1;
					this.field_386 = var2;
					this.method_117(this.currentWorld, field_532, (byte)64);
					this.field_446 = true;
				}

				var8++;
			}
		} else {
			field_532 = this.currentLevel;
		}

	}

	// $FF: renamed from: a (javax.microedition.lcdui.Graphics) void
	private void method_132(Graphics var1) {
		try {
			this.field_314 = var1;
			this.field_314.setClip(0, 0, 240, 320);
			switch (field_222) {
			case 0:
			case 3:
			case 11:
			case 13:
			case 14:
			case 19:
			case 23:
			case 26:
			case 32:
			default:
				break;
			case 1:
				this.method_153();
				break;
			case 2:
				this.method_175();
				break;
			case 4:
				this.method_141();
				break;
			case 5:
				if (!this.field_388) {
					this.field_314.setClip(0, 293, 240, 27);
					this.renderProgressBar();
					this.field_314.setClip(0, 0, 240, 320);
				} else {
					this.renderProgressBar();
				}

				if (field_322 != null && this.field_388) {
					this.method_404();
				}
				break;
			case 6:
				this.method_208();
				break;
			case 7:
				this.method_175();
				break;
			case 8:
			case 9:
			case 21:
			case 35:
				this.renderProgressBar();
				break;
			case 10:
				this.method_364(this.field_314);
				break;
			case 12:
				this.method_143();
				break;
			case 15:
				this.method_412();
				break;
			case 16:
				this.renderProgressBar();
				break;
			case 17:
				this.method_242();
				break;
			case 18:
				this.method_428();
				this.field_557 = true;
				field_222 = 25;
				this.field_554 = this.field_97;
				this.field_555 = menuText[110] + " " + getShortFromBytes(field_330, 4) + " " + menuText[109];
			case 25:
				this.method_431();
				break;
			case 20:
				renderDialog(this.field_314, field_320[41], menuText[48], 120, 180, 3, 20, true);
				break;
			case 22:
				this.method_435();
				break;
			case 24:
				this.method_139();
				break;
			case 27:
				this.method_137();
				break;
			case 28:
				this.field_265 = 11;
				this.renderProgressBar();
				break;
			case 29:
				this.method_136();
				break;
			case 30:
				this.method_142(this.field_314, true);
				if (frameCounter % 20 >= 10) {
					field_320[41].DrawString(this.field_314, menuText[82], 120, 250, 17);
				}
				break;
			case 31:
				if (this.field_387) {
					this.field_387 = false;
					this.field_314.setColor(0);
					this.field_314.fillRect(0, 0, 240, 320);
					field_320[41]._nLineSpacing = 5;
					field_320[41].DrawPage(this.field_314, method_441(menuText[this.field_383 ? 69 : 68], 220), 120, 160, 3);
					this.method_177();
					this.method_176();
				}
				break;
			case 33:
				this.method_133();
				break;
			case 34:
				this.method_140();
			}

			this.method_440();
		} catch (Throwable var3) {
		}
	}

	// $FF: renamed from: O () void
	private void method_133() {
		if (this.field_557) {
			this.field_314.setColor(0);
			this.field_314.setClip(0, 0, 240, 320);
			this.field_314.fillRect(0, 0, 240, 320);
			field_320[41]._nLineSpacing = 3;
			String var1 = method_441(menuText[4] + "\n\n" + menuText[103] + "\n" + menuText[104] + "\n" + menuText[105] + "\n\n" + menuText[106] + "\n\n" + menuText[107] + "\n\n" + menuText[108], 235);
			field_320[41].DrawPage(this.field_314, var1, 120, 10, 17);
			this.method_176();
			this.field_557 = false;
		}

	}

	// $FF: renamed from: a (javax.microedition.lcdui.Graphics, boolean, int, int) void
	private void method_134(Graphics var1, boolean var2, int var3, int var4) {
		var1.setClip(0, 0, 240, 320);
		int var5 = 0;
		int var6 = 0;
		if (var3 != 0 || var4 != 0) {
			var5 -= 24;
			var6 -= 24;
		}

		int var9 = var6;

		for (int var10 = 0; /* ORIGINALLY BOOL */ var9 < 320; var9 += 24) {
			for (int var11 = var5; var11 < 240; var11 += 24) {
				var1.drawImage(field_318[8][0], var11 + var3, var9 + var4, 0);
			}
		}

		field_320[10].PaintFrame(var1, 0, this.field_116 + var3, this.field_117 + var4, 0, 0, 0);
		if (var2) {
			for (int var13 = 0; var13 < 320; var13 += 24) {
				for (int var14 = 0; var14 < 240; var14 += 24) {
					field_320[17].PaintFrame(var1, 16, var14, var13, 0, 0, 0);
				}
			}
		}

	}

	// $FF: renamed from: a (javax.microedition.lcdui.Graphics, boolean) void
	private void method_135(Graphics var1, boolean var2) {
		this.method_134(var1, var2, 0, 0);
	}

	// $FF: renamed from: P () void
	private void method_136() {
		if (this.field_557) {
			this.method_134(this.field_314, false, this.field_147, this.field_148);
			field_320[17].PaintFrame(this.field_314, 11, 120 + Define.field_2[6] + this.field_147, 136 + Define.field_2[7] + this.field_148, 0, 0, 0);
			int var1 = 0;

			for (int var2 = 0; var2 < 3; ++var2) {
				var1 = 52 + var2;
				field_320[var1].PaintFrame(this.field_314, 0, Define.field_2[var2 << 1] + 120 - this.field_126 + this.field_147, Define.field_2[(var2 << 1) + 1] + 136 - this.field_127 + this.field_148, 0, 0, 0);
			}
		}

		switch (this.field_145) {
		case 1:
			if (!this.field_557) {
				this.field_314.setColor(this.field_146);
				this.field_314.fillRect(0, 0, 240, 320);

				for (int var7 = 0; var7 < 3; ++var7) {
					int var5 = 52 + var7;
					field_320[var5].PaintFrame(this.field_314, 0, Define.field_2[var7 << 1] + 120 - this.field_126, Define.field_2[(var7 << 1) + 1] + 136 - this.field_127, 0, 0, 0);
				}
			}
			break;
		case 2:
			return;
		case 3:
			return;
		case 4:
			return;
		case 5:
			return;
		case 6:
			return;
		case 7:
			return;
		case 8:
			GemsRain.method_18(this.field_314);
			return;
		case 9:
		case 10:
			GemsRain.method_18(this.field_314);
			int var4 = field_320[41]._nLineSpacing;
			field_320[41]._nLineSpacing = 3;
			String var6 = method_441(menuText[40] + "\n" + menuText[97], 220);
			field_320[41].UpdateStringSize(var6);
			method_429(this.field_314, (240 - ASprite._text_w >> 1) - 3, (320 - ASprite._text_h >> 1) - 3, ASprite._text_w + 6, ASprite._text_h + 6, 7096587, 0);
			field_320[41].DrawPage(this.field_314, var6, 120, 160, 3);
			field_320[41]._nLineSpacing = var4;
		}

	}

	// $FF: renamed from: Q () void
	private void method_137() {
		if (!this.field_557 && !this.field_110) {
			this.field_314.setClip(this.field_104 + 120, this.field_105 + 136, 14, 22);
			field_320[10].PaintFrame(this.field_314, 0, this.field_116, this.field_117, 0, 0, 0);
		} else {
			this.field_314.setClip(0, 0, 240, 320);
			this.method_135(this.field_314, false);
			field_320[17].PaintFrame(this.field_314, 11, 120 + Define.field_2[6], 136 + Define.field_2[7], 0, 0, 0);
			this.method_176();
			this.method_177();
			field_320[41].DrawString(this.field_314, menuText[27].toLowerCase(), 222, 311, 10);
			this.field_557 = false;
		}

		if (this.field_118 != 0) {
			this.field_110 = false;
			this.field_557 = true;

			for (int var1 = 0; var1 < this.field_118; ++var1) {
				if (method_73(var1)) {
					field_320[10].PaintFrame(this.field_314, var1 + 1, this.field_116, this.field_117, 0, 0, 0);
				}
			}

			this.field_314.setClip(0, 0, 240, 320);
			if (this.field_130 < this.field_129) {
				field_320[9].PaintAFrame(this.field_314, 5, this.field_130, Define.field_2[this.field_118 << 1] + 120 - 12, Define.field_2[(this.field_118 << 1) + 1] + 124, 0, 0, 0);
				++this.field_130;
			} else {
				if (this.field_115 % this.field_114 >= this.field_114 >> 1) {
					field_320[10].PaintFrame(this.field_314, this.field_118 + 1, this.field_116, this.field_117, 0, 0, 0);
					++this.field_120;
				}

				if (this.field_120 >= 15) {
					field_119[this.field_118] = true;
					this.field_120 = 0;
					this.field_118 = 0;
					this.field_130 = 0;
					this.method_72();
					this.field_110 = true;
					this.field_557 = false;
				}
			}
		} else {
			for (int var8 = 0; var8 < 3; ++var8) {
				if (field_119[var8]) {
					field_320[10].PaintFrame(this.field_314, var8 + 1, this.field_116, this.field_117, 0, 0, 0);
				}
			}
		}

		for (int var2 = 0; var2 < 3; ++var2) {
			if (field_121[var2]) {
				int var9 = 52 + var2;
				if (this.field_123 != var2) {
					field_320[var9].PaintFrame(this.field_314, 0, Define.field_2[var2 << 1] + 120 - this.field_126, Define.field_2[(var2 << 1) + 1] + 136 - this.field_127, 0, 0, 0);
				}
			}
		}

		if (this.field_123 != -1) {
			this.field_557 = true;
			if (this.method_138(this.field_123)) {
				this.field_123 = -1;
				if (field_121[0] && field_121[1] && field_121[2]) {
					this.method_65();
					this.field_557 = true;
					this.field_131 = true;
					field_222 = 29;
				}
			}

		} else {
			this.field_115 %= this.field_114;
			this.field_314.setClip(this.field_102 + 120, 136 + this.field_103, 14, 22);
			field_320[55].PaintAFrame(this.field_314, 0, this.field_115, 120 + this.field_102, 136 + this.field_103, 0, 0, 0);
			this.field_115++;
			if (this.field_110) {
				int var10 = field_320[41]._nLineSpacing;
				field_320[41]._nLineSpacing = 1;
				String var3 = method_441(this.field_106 + "\n" + this.field_107, 220);
				field_320[41].UpdateStringSize(var3);
				int var4 = (240 - ASprite._text_w >> 1) - 3;
				int var5 = 250 - (ASprite._text_h >> 1) - 3;
				int var6 = ASprite._text_w + 6;
				int var7 = ASprite._text_h + 6;
				this.field_314.setClip(var4, var5, var6, var7);
				method_429(this.field_314, var4, var5, var6, var7, 7096587, 0);
				field_320[41].DrawPage(this.field_314, var3, 120, 250, 3);
				field_320[41]._nLineSpacing = var10;
				this.field_110 = false;
			}

		}
	}

	// $FF: renamed from: c (int) boolean
	private boolean method_138(int var1) {
		int var2;
		int var3;
		int var4;
		int var6;
		label49: {
			var2 = 52 + var1;
			var3 = Define.field_2[var1 << 1] + 120;
			int var5 = (var4 = Define.field_2[(var1 << 1) + 1] + 136) - this.field_125;
			var6 = var3 - this.field_124;
			if (var5 < 0) {
				this.field_125 -= 2;
				if (this.field_125 > var4) {
					break label49;
				}
			} else {
				if (var5 <= 0) {
					break label49;
				}

				this.field_125 += 2;
				if (this.field_125 < var4) {
					break label49;
				}
			}

			this.field_125 = var4;
		}

		label41: {
			if (var6 < 0) {
				this.field_124 -= 3;
				if (this.field_124 > var3) {
					break label41;
				}
			} else {
				if (var6 <= 0) {
					break label41;
				}

				this.field_124 += 3;
				if (this.field_124 < var3) {
					break label41;
				}
			}

			this.field_124 = var3;
		}

		field_320[var2].PaintFrame(this.field_314, 0, this.field_124 - this.field_126, this.field_125 - this.field_127, 0, 0, 0);
		if (this.field_124 == var3 && this.field_125 == var4) {
			this.field_124 = var3;
			this.field_125 = var4;
			if (this.field_128 < 20) {
				if (this.field_128 % 2 == 1) {
					int var7 = 838860;
					this.field_314.setColor(0 + var7 * this.field_128);
					this.field_314.fillRect(0, 0, 240, 320);
				}

				++this.field_128;
				return false;
			} else if (this.field_130 < this.field_129) {
				field_320[9].PaintAFrame(this.field_314, 5, this.field_130, Define.field_2[var1 << 1] + 120 - 12, Define.field_2[(var1 << 1) + 1] + 124, 0, 0, 0);
				++this.field_130;
				return false;
			} else {
				this.field_130 = 0;
				this.field_128 = 0;
				return true;
			}
		} else {
			return false;
		}
	}

	// $FF: renamed from: R () void
	private void method_139() {
		String var1 = null;
		ASprite var2;
		(var2 = field_320[41])._nLineSpacing = 15;
		this.field_314.setColor(0);
		this.field_314.fillRect(0, 0, 240, 320);

		for (int i = 0; i < 6; ++i) {
			byte var4;
			label46: {
				var4 = -1;
				String var10000;
				switch (i) {
				case 0:
					var4 = 60;
					var10000 = " 6 - Add " + String.valueOf(this.collectedDiamonds);
					break;
				case 1:
					var4 = 61;
					var10000 = " 7 - Add " + String.valueOf(this.collectedRedDiamonds);
					break;
				case 2:
					var4 = 62;
					var10000 = " 8 - x " + String.valueOf(this.field_390) + (this.field_390 >= 4 ? " blue potion" : "");
					break;
				case 3:
					var4 = 63;
					var10000 = " 9 - " + menuText[this.field_391 ? 66 : 67];
					break;
				case 4:
					var4 = 64;
					var10000 = " 0 - " + menuText[this.field_392 ? 66 : 67];
					break;
				case 5:
					var4 = -1;
					var10000 = "5 to activate lang cheat";
					break;
				default:
					break label46;
				}

				var1 = var10000;
			}

			int var5 = i * 35;
			if (var4 >= 0) {
				var2.DrawString(this.field_314, menuText[var4], 110, var5, 17);
			}

			var5 += var2._nLineSpacing;
			var2.DrawString(this.field_314, menuText[65], 110, var5, 24);
			var2.DrawString(this.field_314, var1, 110, var5, 20);
		}

		var1 = "Pound - Pass levels ";
		StringBuffer var9;
		String var10001;
		if (this.field_436) {
			var9 = (new StringBuffer()).append(var1);
			var10001 = "on";
		} else {
			var9 = (new StringBuffer()).append(var1);
			var10001 = "off";
		}

		var1 = var9.append(var10001).toString();
		var2.DrawString(this.field_314, var1, 110, 290, 17);
		this.method_176();
		this.method_177();
	}

	// $FF: renamed from: S () void
	private void method_140() {
		ASprite var2;
		(var2 = field_320[41])._nLineSpacing = 2;
		this.field_314.setColor(0);
		this.field_314.fillRect(0, 0, 240, 320);
		String var1;
		switch (this.field_437) {
		case 0:
			var1 = "Mix";
			var2.DrawPage(this.field_314, menuText[this.field_438[0]], 10, 5, 20);
			break;
		case 1:
			var1 = "Tips";
			method_403(this.field_438[1]);
			this.method_404();
			break;
		default:
			var1 = "";
		}

		var2._nLineSpacing = 2;
		var2.DrawString(this.field_314, var1, 40, 308, 20);
		var2.DrawString(this.field_314, "" + this.field_438[this.field_437], 120, 308, 20);
		var2.DrawPage(this.field_314, "Use up, down, left and right to navigate", 10, 280, 20);
		this.method_176();
		this.method_177();
	}

	// $FF: renamed from: T () void
	private void method_141() {
		this.method_175();
	}

	// $FF: renamed from: b (javax.microedition.lcdui.Graphics, boolean) void
	private void method_142(Graphics var1, boolean var2) {
		var1.drawImage(field_316, 0, 0, 20);
		var1.drawImage(field_315, 0, 0, 20);
		if (var2) {
			var1.drawImage(field_317, 120, 319, 33);
		}

	}

	// $FF: renamed from: U () void
	private void method_143() {
		this.field_314.setColor(0);
		this.field_314.fillRect(0, 0, 240, 320);
		ASprite var1;
		(var1 = field_320[41]).DrawString(this.field_314, menuText[35], 120, 50, 17);

		if (this.field_174 == 2) {
			var1.DrawString(this.field_314, menuText[26], 0, 320, 36);
		} else {
			var1.DrawString(this.field_314, menuText[1], 0, 320, 36);
			String var2 = menuText[111] + " " + (getShortFromBytes(field_330, 4) < 500 ? getShortFromBytes(field_330, 4) : 500) + " " + menuText[109];
			var1.DrawString(this.field_314, var2, 120, 160, 17);
		}

		this.method_191();
	}

	// $FF: renamed from: b (javax.microedition.lcdui.Graphics) void
	private void method_144(Graphics var1) {
		Graphics var10000;
		int var10001;
		int var10002;
		int var10003;
		int var10004;
		label19: {
			int var2 = this.field_201 % field_396;
			int var3 = this.field_202 % field_397;
			int var4 = (this.field_201 + 240) % field_396;
			int var5 = (this.field_202 + 240) % field_397;
			if (var4 > var2) {
				if (var5 > var3) {
					var10000 = var1;
					var10001 = var2;
					var10002 = var3;
					var10003 = 0;
					var10004 = 0;
					break label19;
				}

				method_145(var1, var2, var3, 0, 0);
				var10000 = var1;
				var10001 = var2;
				var10002 = 0;
				var10003 = 0;
			} else {
				if (var5 > var3) {
					method_145(var1, var2, var3, 0, 0);
					var10000 = var1;
					var10001 = 0;
					var10002 = var3;
					var10003 = 240 - var4;
					var10004 = 0;
					break label19;
				}

				method_145(var1, var2, var3, 0, 0);
				method_145(var1, var2, 0, 0, 240 - var5);
				method_145(var1, 0, var3, 240 - var4, 0);
				var10000 = var1;
				var10001 = 0;
				var10002 = 0;
				var10003 = 240 - var4;
			}

			var10004 = 240 - var5;
		}

		method_145(var10000, var10001, var10002, var10003, var10004);
	}

	// $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int) void
	private static void method_145(Graphics var0, int var1, int var2, int var3, int var4) {
		var0.drawImage(field_394, var3 - var1, var4 - var2, 0);
	}

	// $FF: renamed from: V () void
	private static void method_146() {
		field_396 = 264;
		field_397 = 264;
		field_394 = Image.createImage(field_396, field_397);
		field_395 = field_394.getGraphics();
	}

	// $FF: renamed from: b (int, int) void
	/**
	 * Update the graphics for a level tile to be blank?
	 * @param var1
	 * @param var2
	 */
	private void method_147(int var1, int var2) {
		int var3 = this.field_201 - this.field_201 % 24;
		int var4 = this.field_202 - this.field_202 % 24;
		int var5 = this.field_201 + field_396 - 24 - (this.field_201 + field_396 - 24) % 24;
		int var6 = this.field_202 + field_397 - 24 - (this.field_202 + field_397 - 24) % 24;
		int var7 = var1 * 24;
		int var8 = var2 * 24;
		if (var7 >= var3 && var7 <= var5 && var8 >= var4 && var8 <= var6) {
			int var9 = field_332[var1][var2] & 255;
			if (field_334[var1][var2] < 80) {
				if (var9 == 4 || var9 == 16 || var9 == 15) {
					this.method_148(var1, var2);
					return;
				}

				field_395.drawImage(field_318[8][0], var7 % field_396, var8 % field_397, 0);
			}
		}

	}

	// $FF: renamed from: c (int, int) void
	private void method_148(int var1, int var2) {
		int var3 = this.field_201 - this.field_201 % 24;
		int var4 = this.field_202 - this.field_202 % 24;
		int var5 = this.field_201 + field_396 - 24 - (this.field_201 + field_396 - 24) % 24;
		int var6 = this.field_202 + field_397 - 24 - (this.field_202 + field_397 - 24) % 24;
		int var7 = var1 * 24;
		int var8 = var2 * 24;
		if (var7 >= var3 && var7 <= var5 && var8 >= var4 && var8 <= var6) {
			this.method_150(var7, var8, var7, var8, false);
		}

	}

	// $FF: renamed from: a (int) int
	public static int method_149(int var0) {
		switch (var0) {
		case 0:
			return 42;
		case 1:
			return 60;
		case 2:
			field_320[59]._crt_pal = 0;
			return 59;
		case 3:
			field_320[59]._crt_pal = 1;
			return 59;
		case 4:
			return 56;
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 17:
		case 18:
		case 19:
		case 21:
		default:
			return -1;
		case 14:
			field_320[57]._crt_pal = 1;
			return 57;
		case 15:
			field_320[57]._crt_pal = 0;
			return 57;
		case 16:
			return 58;
		case 20:
			return 43;
		case 22:
			field_320[45]._crt_pal = 0;
			return 45;
		case 23:
			field_320[45]._crt_pal = 1;
			return 45;
		}
	}

	// $FF: renamed from: a (int, int, int, int, boolean) void
	private void method_150(int var1, int var2, int var3, int var4, boolean var5) {
		Object var6 = null;
		int var9 = 0;
		int var10 = 0;
		Graphics var14 = field_395;
		int var7 = field_396;
		int var8 = field_397;
		var9 = var1 % var7;
		var10 = var2 % var8;
		this.field_272 = var10 - 24;
		this.processedTileY = var2 / 24 - 1;

		for (int i = var2; i <= var4; i += 24) {
			this.field_271 = var9 - 24;
			this.processedTileX = var1 / 24 - 1;
			this.field_272 += 24;
			this.processedTileY++;
			if (this.field_272 >= var8) {
				this.field_272 = 0;
			}

			for (int j = var1; j <= var3; j += 24) {
				this.field_271 += 24;
				this.processedTileX++;
				if (this.field_271 >= var7) {
					this.field_271 = 0;
				}

				if (this.processedTileX >= 0 && this.processedTileX < this.currentLevelWidth && this.processedTileY >= 0 && this.processedTileY < this.currentLevelHeight) {
					this.field_283 = field_334[this.processedTileX][this.processedTileY];
					this.field_284 = field_332[this.processedTileX][this.processedTileY] & 255;
					if (this.field_283 < 80 && !var5) {
						var14.drawImage(field_318[8][0], this.field_271, this.field_272, 0);
					}

					if (this.field_284 > -1 && this.field_284 < 38) {
						switch (this.field_284) {
						case 4:
							this.field_214 = 20;
							this.field_215 = 7;
							this.field_288 = this.field_289 = 0;
							break;
						case 15:
							if (this.field_310 == 0) {
								this.field_214 = 14;
								this.field_215 = 0 + this.field_310 * 5 / 10;
							}
							break;
						case 16:
							if (this.field_310 == 9) {
								this.field_214 = 15;
								this.field_215 = 4 - this.field_310 * 5 / 10;
								if (this.field_215 < 0) {
									this.field_215 = 0;
								}
							}
							break;
						case 27:
							this.field_214 = 21;
							this.field_215 = 0;
							this.field_288 = this.field_289 = 0;
						default:
							break;
						}
					}

					if (this.field_214 != -1) {
						if (field_318[this.field_214] == null) {
							field_320[method_149(this.field_214)].PaintFrame(var14, this.field_215, this.field_271 + this.field_288, this.field_272 + this.field_289, this.field_290, 0, 0);
						} else {
							var14.drawImage(field_318[this.field_214][this.field_215], this.field_271 + this.field_288, this.field_272 + this.field_289, this.field_290);
						}

						this.field_290 = 0;
						this.field_214 = -1;
						this.field_288 = this.field_289 = 0;
					}

					if (this.field_283 != -1 && !var5) {
						byte var13;
						if ((var13 = (byte)(this.field_283 - 80)) >= 0) {
							this.field_216 = 0;
							this.field_217 = var13;
						} else {
							switch (this.field_283) {
							case 0:
								if (field_335[this.processedTileX][this.processedTileY] == 0 && (field_500 == null || field_500[this.processedTileX][this.processedTileY] == 0)) {
									this.method_192();
								}
								break;
							case 1:
								if (field_335[this.processedTileX][this.processedTileY] == 0 && (field_500 == null || field_500[this.processedTileX][this.processedTileY] == 0)) {
									this.method_192();
									this.field_217 -= this.field_292;
									this.field_289 = 0;
								}
								break;
							case 10:
								field_320[16].PaintFrame(var14, 0, this.field_271, this.field_272, 0, 0, 0);
								break;
							case 34:
								if (this.field_310 == 9) {
									this.field_216 = 14;
									this.field_217 = 0 + this.field_310 * 5 / 10;
								}
								break;
							case 35:
								if (this.field_310 == 0) {
									this.field_216 = 15;
									this.field_217 = 4 - this.field_310 * 5 / 10;
									if (this.field_217 < 0) {
										this.field_217 = 0;
									}
								}
							default:
								break;
							}
						}

						if (this.field_216 != -1) {
							if (field_318[this.field_216] == null) {
								field_320[method_149(this.field_216)].PaintFrame(var14, this.field_217, this.field_271 + this.field_288, this.field_272 + this.field_289, this.field_290, 0, 0);
							} else {
								var14.drawImage(field_318[this.field_216][this.field_217], this.field_271 + this.field_288, this.field_272 + this.field_289, this.field_290);
							}

							this.field_216 = -1;
							this.field_290 = 0;
							this.field_288 = this.field_289 = 0;
						}
					}

					if (this.field_174 == 2) {
						this.method_181(var14);
					}
				}
			}
		}

	}

	// $FF: renamed from: c (javax.microedition.lcdui.Graphics) void
	private void method_151(Graphics var1) {
		for (int var2 = -1; var2 < 12; ++var2) {
			for (int var3 = -1; var3 < 12; ++var3) {
				this.processedTileX = var3 + this.field_402;
				this.processedTileY = var2 + this.field_403;
				if (this.processedTileX >= 0 && this.processedTileX < this.currentLevelWidth && this.processedTileY >= 0 && this.processedTileY < this.currentLevelHeight) {
					this.field_283 = field_334[this.processedTileX][this.processedTileY];
					this.field_284 = field_332[this.processedTileX][this.processedTileY] & 255;
					this.field_271 = var3 * 24 - this.field_404;
					this.field_272 = var2 * 24 - this.field_405;
					this.method_152();
					if (this.field_284 > -1 && this.field_284 < 38) {
						switch (this.field_284) {
						case 3:
							int var4;
							if ((var4 = (field_332[this.processedTileX][this.processedTileY] >> 8) - 1) >= 0) {
								this.field_214 = 12;
								this.field_215 = (byte)var4;
							}
							break;
						case 4:
							if (field_332[this.processedTileX][this.processedTileY] >> 8 >= this.field_207) {
								this.method_164();
							}
							break;
						case 5:
						case 28:
							this.field_214 = 11;
							this.field_215 = 0;
							break;
						case 6:
							this.method_195();
							if (this.field_272 + 24 < 240) {
								var1.clipRect(this.field_271, this.field_272, 24, 24);
							}
							break;
						case 7:
							this.method_200();
							break;
						case 8:
						case 9:
							this.method_199();
						case 10:
						case 11:
						case 12:
						case 13:
						case 17:
						case 18:
						case 19:
						case 20:
						case 21:
						case 22:
						case 23:
						case 24:
						case 25:
						case 26:
						case 27:
						case 29:
						case 30:
						case 31:
						case 32:
						case 36:
						default:
							break;
						case 14:
						case 33:
							this.method_165(this.field_284);
							break;
						case 15:
							if (this.field_310 != 0 && this.field_310 <= 5) {
								this.field_214 = 14;
								this.field_215 = 0 + this.field_310 * 5 / 10;
							}
							break;
						case 16:
							if (this.field_310 != 9 && this.field_310 >= 5) {
								this.field_214 = 15;
								this.field_215 = 4 - this.field_310 * 5 / 10;
								if (this.field_215 < 0) {
									this.field_215 = 0;
								}
							}
							break;
						case 34:
							field_320[27].PaintAFrame(var1, 2, 0, this.field_271, this.field_272, 0, 0, 0);
							break;
						case 35:
							this.method_157();
							break;
						case 37:
							field_320[27].PaintAFrame(var1, 2, 0, this.field_271, this.field_272, 0, 0, 0);
							this.method_157();
						}

						if (this.field_214 != -1) {
							if (field_318[this.field_214] == null) {
								field_320[method_149(this.field_214)].PaintFrame(var1, this.field_215, this.field_271 + this.field_288, this.field_272 + this.field_289, this.field_290, 0, 0);
							} else {
								var1.drawImage(field_318[this.field_214][this.field_215], this.field_271 + this.field_288, this.field_272 + this.field_289, this.field_290);
							}

							this.field_290 = 0;
							this.field_214 = -1;
							var1.setClip(0, -this.field_256, 240, 240);
							this.field_288 = this.field_289 = 0;
						} else if (field_324 != null) {
							if (this.field_285 != -1) {
								field_324.PaintAFrame(var1, this.field_285, this.field_286, this.field_271 + this.field_288, this.field_272 + this.field_289, 0, 0, 0);
								this.field_285 = -1;
							}

							field_324 = null;
							this.field_288 = this.field_289 = 0;
						}

					}

					if (this.field_283 != -1) {
						if ((byte)(this.field_283 - 80) < 0) {
							label194: {
								int var5 = field_333[this.processedTileX][this.processedTileY];
								cGame var7;
								switch (this.field_283) {
								case 0:
									if ((field_333[this.processedTileX][this.processedTileY] & Integer.MIN_VALUE) == 0) {
										break label194;
									}
								case 8:
									var7 = this;
									break;
								case 1:
									if ((field_333[this.processedTileX][this.processedTileY] & Integer.MIN_VALUE) != 0 || this.field_292 != 0) {
										var7 = this;
										break;
									}
								case 2:
								case 3:
								case 4:
								case 5:
								case 6:
								case 7:
								case 10:
								case 13:
								case 15:
								case 17:
								case 20:
								case 24:
								case 25:
								case 26:
								case 27:
								case 29:
								case 31:
								case 33:
								case 38:
								case 39:
								case 40:
								case 41:
								case 42:
								default:
									break label194;
								case 9:
									this.method_192();
									if ((field_333[this.processedTileX][this.processedTileY] & 264241152) == 138412032) {
										this.field_288 += this.field_190;
										this.field_289 += this.field_191;
									}
									break label194;
								case 11:
									this.method_197();
									break label194;
								case 12:
									this.method_161();
									break label194;
								case 14:
									this.method_201();
									break label194;
								case 16:
									this.method_202();
									break label194;
								case 18:
									this.method_167();
									break label194;
								case 19:
									this.method_194((byte)this.field_283);
									break label194;
								case 21:
									this.method_158();
									break label194;
								case 22:
									field_324 = field_320[12];
									this.field_286 = 1;
									this.method_169((byte)22);
									break label194;
								case 23:
									field_324 = field_320[12];
									this.field_286 = 0;
									this.method_169((byte)23);
									break label194;
								case 28:
									this.method_207();
									break label194;
								case 30:
									field_324 = field_320[20];
									this.field_285 = 0;
									this.field_286 = 0 + (var5 - 1) * 7 / 16;
									break label194;
								case 32:
									this.method_198();
									break label194;
								case 34:
									if (this.field_310 != 9 && this.field_310 >= 5) {
										this.field_216 = 14;
										this.field_217 = 0 + this.field_310 * 5 / 10;
									}
									break label194;
								case 35:
									if (this.field_310 != 0 && this.field_310 <= 5) {
										this.field_216 = 15;
										this.field_217 = 4 - this.field_310 * 5 / 10;
										if (this.field_217 < 0) {
											this.field_217 = 0;
										}
									}
									break label194;
								case 36:
									this.method_168();
									break label194;
								case 37:
									this.field_216 = 17;
									this.field_217 = 0 + (var5 - 1) * 3 / 8;
									break label194;
								case 43:
									this.method_194((byte)this.field_283);
									break label194;
								case 44:
									this.method_160();
									this.field_286 = 0;
									break label194;
								case 45:
									this.method_203();
									break label194;
								case 46:
									this.method_159();
									break label194;
								case 47:
									var7 = this;
									break;
								case 48:
									this.method_155();
									break label194;
								case 49:
									this.method_193();
									break label194;
								}

								var7.method_192();
							}
						}

						if (this.field_216 != -1) {
							if (field_318[this.field_216] == null) {
								field_320[method_149(this.field_216)].PaintFrame(var1, this.field_217, this.field_271 + this.field_288, this.field_272 + this.field_289, this.field_290, 0, 0);
							} else {
								var1.drawImage(field_318[this.field_216][this.field_217], this.field_271 + this.field_288, this.field_272 + this.field_289, this.field_290);
							}

							this.field_216 = -1;
							this.field_290 = 0;
						} else {
							if (field_324 == null) {
								continue;
							}

							if (this.processedTileX == this.field_359 && this.processedTileY == this.field_360) {
								field_364 = field_324;
								this.field_365 = this.field_285;
								this.field_363 = this.field_286;
								this.field_362 = this.field_271 + this.field_288;
								this.field_361 = this.field_272 + this.field_289;
							}

							if (this.field_285 != -1) {
								field_324.PaintAFrame(var1, this.field_285, this.field_286, this.field_271 + this.field_288, this.field_272 + this.field_289, this.field_287, 0, 0);
								this.field_285 = -1;
							} else {
								field_324.PaintFrame(var1, this.field_286, this.field_271 + this.field_288, this.field_272 + this.field_289, this.field_287, 0, 0);
							}

							field_324 = null;
							this.field_287 = 0;
						}

						this.field_288 = this.field_289 = 0;
					}
				}
			}
		}

	}

	// $FF: renamed from: W () void
	private void method_152() {
		this.field_314.setClip(0, 0, 240, 240);
	}

	// $FF: renamed from: X () void
	private void method_153() {
		Graphics var1 = this.field_314;
		int var2 = frameCounter;
		this.field_291 = (this.field_233 & 4096) == 0 ? this.field_197 : 0;
		var1.translate(0, 40);
		this.field_256 = 0;
		this.method_152();
		if (this.field_255 > 0) {
			this.field_256 = this.field_255 * var2 % ((this.field_255 >> 1) + 1) % 12;
		}

		if (this.field_256 > this.field_202) {
			this.field_256 = this.field_202;
		}

		this.field_202 -= this.field_256;
		this.field_402 = this.field_201 / 24;
		this.field_403 = this.field_202 / 24;
		this.field_404 = this.field_201 % 24;
		this.field_405 = this.field_202 % 24;
		this.field_292 = (var2 & 63) >> 1;
		if (this.field_292 >= 4) {
			this.field_292 = 0;
		}

		int var3 = this.field_201 - this.field_404;
		int var4 = this.field_202 - this.field_405;
		int var5 = this.field_201 + field_396 - 24 - (this.field_201 + field_396 - 24) % 24;
		int var6 = this.field_202 + field_397 - 24 - (this.field_202 + field_397 - 24) % 24;
		if (field_398 == -1) {
			this.method_150(var3, var4, var5, var6, false);
			field_398 = var3;
			field_399 = var5;
			field_400 = var4;
			field_401 = var6;
		}

		if (field_398 != var3) {
			int var7;
			int var8;
			if (field_398 < var3) {
				var7 = field_399 + 24;
				var8 = var5;
			} else {
				var7 = var3;
				var8 = field_398 - 24;
			}

			this.method_150(var7, var4, var8, var6, false);
			field_398 = var3;
			field_399 = var5;
		}

		if (field_400 != var4) {
			int var36;
			int var43;
			if (field_400 < var4) {
				var36 = field_401 + 24;
				var43 = var6;
			} else {
				var36 = var4;
				var43 = field_400 - 24;
			}

			int var38 = var43;
			this.method_150(var3, var36, var5, var38, false);
			field_400 = var4;
			field_401 = var6;
		}

		this.method_144(var1);
		this.method_152();
		this.method_151(var1);
		if (field_367) {
			var1.setColor(0);
			var1.fillRect(0, 0, 240, 320);
			this.method_191();
			if (field_406 != null) {
				var1.drawImage(field_406, field_407, field_408, field_409);
			}

			if (this.field_162 != this.field_163) {
				int var48 = this.field_162;

				while(true) {
					var3 = var48;
					if (var48 == this.field_163) {
						break;
					}

					var4 = field_159[var3 << 1] * 24 - this.field_201;
					var5 = field_159[(var3 << 1) + 1] * 24 - this.field_202;
					ASprite var49;
					Graphics var52;
					byte var55;
					int var57;
					if (field_161[var3] < 0) {
						ASprite var35;
						var49 = var35 = field_320[2];
						var52 = var1;
						var55 = 0;
						var57 = method_204(var35, 0, field_160[var3]);
					} else {
						var49 = field_320[9];
						var52 = var1;
						var55 = field_161[var3];
						var57 = field_160[var3];
					}

					var49.PaintAFrame(var52, var55, var57, var4, var5, 0, 0, 0);
					++var3;
					var48 = var3 & 7;
				}
			}

			this.field_314.setClip(0, 0, 240, 320);
			var1.translate(0, -40);
			this.method_166();
		} else {
			this.method_191();
			if (this.field_155) {
				this.method_163(this.field_404, this.field_405);
			}

			if (field_406 != null) {
				var1.drawImage(field_406, field_407, field_408, field_409);
			}

			if (this.field_193 > 0) {
				this.method_154();
			}

			if (this.field_174 != 0) {
				this.method_179();
			}

			for (int var17 = -1; var17 < 12; ++var17) {
				for (int var24 = -1; var24 < 12; ++var24) {
					int var37 = var24 + this.field_402;
					int var39 = var17 + this.field_403;
					if (var37 >= 0 && var37 < this.currentLevelWidth && var39 >= 0 && var39 < this.currentLevelHeight) {
						var5 = field_332[var37][var39] & 255;
						var6 = field_334[var37][var39];
						if (var5 < 38 || var5 >= 80) {
							int var10;
							int var11;
							label284: {
								var10 = var24 * 24 - this.field_404;
								var11 = var17 * 24 - this.field_405;
								ASprite var44;
								Graphics var10001;
								int var10002;
								int var10003;
								if (var5 >= 20 && var5 < 26) {
									int var42 = var5 - 20;
									var44 = field_320[3];
									var10001 = var1;
									var10002 = var42;
									var10003 = (var2 >> 2) % (field_320[3]._anims_naf[var42] & 255);
								} else {
									switch (var5) {
									case 31:
										int var13 = field_332[var37][var39] >> 8;
										ASprite var14 = field_320[15];
										int var15 = (frameCounter >> 1) % (var14._anims_naf[var13] & 255);
										var14.PaintAFrame(this.field_314, var13, var15, var10, var11, 0, 0, 0);
										break;
									case 32:
										field_320[16].PaintAFrame(this.field_314, 0, field_332[var37][var39] >> 8 & 255, var10, var11, 0, 0, 0);
										break;
									case 36:
										int var12 = (field_332[var37][var39] >> 8) - 1;
										var12 = (0 + var12 * 7) / 16;
										field_320[20].PaintAFrame(var1, 0, var12, var10, var11, 0, 0, 0);
										break;
									default:
										byte var16;
										if ((var16 = (byte)(var5 - 80)) >= 0) {
											field_320[42].PaintFrame(var1, var16, var10, var11, 0, 0, 0);
										}
									}

									int var41;
									if ((var41 = (field_332[var37][var39] & -268435456) >> 28) <= 0) {
										break label284;
									}

									var44 = field_320[13];
									var10001 = var1;
									var10002 = 0;
									var10003 = var41;
								}

								var44.PaintAFrame(var10001, var10002, var10003, var10, var11, 0, 0, 0);
							}

							if (var6 == 54) {
								field_320[7].PaintAFrame(var1, 0, method_204(field_320[7], 0, field_333[var37][var39]), var10, var11, 0, 0, 0);
							}
						}
					}
				}
			}

			if (this.field_277) {
				var3 = (this.field_275 - this.field_402) * 24 - this.field_404 + this.field_273;
				var4 = (this.field_276 - this.field_403 + 1) * 24 - this.field_405 + this.field_274;
				var1.drawImage(field_320[13]._modules_image[0][0 + this.field_278], var3, var4, 0);
				this.field_277 = false;
			}

			if (this.field_208 != -1) {
				var1.drawImage(field_318[13][0], this.field_269 + -12, this.field_270 + -24 + 2, 3);
				var1.drawImage(field_318[this.field_208][this.field_209], this.field_269 + -12, this.field_270 + -24, 3);
			}

			if (this.field_162 != this.field_163) {
				int var45 = this.field_162;

				while(true) {
					var3 = var45;
					if (var45 == this.field_163) {
						break;
					}

					var4 = field_159[var3 << 1] * 24 - this.field_201;
					var5 = field_159[(var3 << 1) + 1] * 24 - this.field_202;
					ASprite var46;
					Graphics var50;
					byte var53;
					int var56;
					if (field_161[var3] < 0) {
						ASprite var34;
						var46 = var34 = field_320[2];
						var50 = var1;
						var53 = 0;
						var56 = method_204(var34, 0, field_160[var3]);
					} else {
						var46 = field_320[9];
						var50 = var1;
						var53 = field_161[var3];
						var56 = field_160[var3];
					}

					var46.PaintAFrame(var50, var53, var56, var4, var5, 0, 0, 0);
					++var3;
					var45 = var3 & 7;
				}
			}

			this.field_202 += this.field_256;
			if (this.field_238) {
				renderDialog(var1, field_320[41], menuText[40], 120, 160, 17, 19, false);
			}

			if (this.field_260 > frameCounter && this.field_174 != 2) {
				if (!this.field_461 && !this.field_122) {
					var3 = this.field_260 - frameCounter;
					var4 = var3 < 20 ? (var3 - 10) * 240 / 20 : (var3 >= 50 ? (60 - var3) * 240 / 15 : 120);
					var5 = 240 - var4;
					renderDialog(var1, field_320[41], menuText[field_562[this.currentWorld]], var4, 15, 17, 20, false);
					renderDialog(var1, field_320[41], menuText[field_563[this.currentWorld][this.currentLevel]], var5, 50, 17, 20, false);
				}
			} else if (this.field_175 > frameCounter && this.field_366 <= 2) {
				renderDialog(var1, field_320[41], menuText[36], 120, 230, 33, 20, false);
			} else if (this.field_175 == frameCounter && this.field_366 <= 2) {
				this.field_366++;
				this.method_114();
			}

			label212: {
				cGame var47;
				Graphics var51;
				byte var54;
				switch (this.field_174) {
				case 3:
					if (this.field_180 == -1 || this.field_180 == 15) {
						break label212;
					}

					var47 = this;
					var51 = var1;
					var54 = 5;
					break;
				case 4:
					this.method_184();
					break label212;
				case 5:
					if (this.field_180 != -1 && this.field_180 != 15 && this.field_180 != 13 && this.field_180 != 12) {
						var47 = this;
						var51 = var1;
						var54 = 4;
						break;
					}
				default:
					break label212;
				}

				var47.method_185(var51, var54);
			}

			var1.translate(0, -40);
			var1.setClip(0, 0, 240, 320);
			if (this.field_354 == null) {
				this.method_166();
			}

			if (this.field_462 != null) {
				this.field_170 = true;
				renderDialog(var1, field_320[41], this.field_462, 120, 263, 33, 4, true);
			}

			if (this.field_354 != null && !field_367) {
				this.field_170 = true;
				this.field_354.method_22(var1);
			}

			if (this.field_257 > 0) {
				this.field_170 = true;
				var1.setColor(0);
				var1.fillRect(0, 0, 240, this.field_257);
				var1.fillRect(0, 320 - this.field_257, 240, this.field_257);
				var1.translate(0, 40);
				this.method_191();
				if (field_406 != null) {
					var1.drawImage(field_406, field_407, field_408, field_409);
				}

				if (field_364 != null) {
					if (this.field_365 != -1) {
						field_364.PaintAFrame(var1, this.field_365, this.field_363, (this.field_359 - this.field_402) * 24 - this.field_404, (this.field_360 - this.field_403) * 24 - this.field_405, this.field_287, 0, 0);
					} else {
						field_364.PaintFrame(var1, this.field_363, this.field_362, this.field_361, this.field_287, 0, 0);
					}
				}

				var1.translate(0, -40);
			}

		}
	}

	// $FF: renamed from: Y () void
	private void method_154() {
		int var1 = this.field_202 - 24;
		int var2 = this.field_202 + 320;
		int var3 = this.field_201;
		int var4 = this.field_201 + 240;
		int var5 = (frameCounter >> 1) % field_320[2].GetAFrames(1);

		for (int var6 = 0; var6 < field_192.length; var6 += 3) {
			int var7 = 0;
			byte var8;
			int var9;
			if ((var9 = (var8 = field_192[var6 + 2]) * 24) > var1 && var9 < var2) {
				byte var10 = field_192[var6 + 0];
				byte var11 = field_192[var6 + 1];
				int var12 = var10 * 24;
				int var13 = var11 * 24 + 24;
				if (var12 >= var3 && var12 <= var4 || var13 >= var3 && var13 <= var4 || var12 <= var3 && var13 >= var4) {
					int var14 = var12 - var3;
					int var15 = var10 + (var10 != 0 ? -1 : 0);
					boolean var16 = true;
					if (field_334[var15][var8] == 48 && (field_333[var15][var8] & 8) != 0) {
						var14 -= 12;
						var16 = false;
						if ((field_333[var15][var8 + 1] & 7) == 3) {
							var7 = -field_335[var15][var8 + 1];
						} else {
							var14 -= -field_335[var15][var8 + 1];
						}
					}

					int var17 = var13 - var3;
					var15 = var11 + (var11 < this.currentLevelWidth - 1 ? 1 : 0);
					boolean var18 = true;
					if (field_334[var15][var8] == 48 && (field_333[var15][var8] & 8) != 0) {
						var17 += 12;
						var18 = false;
						if ((field_333[var15][var8 + 1] & 7) == 3) {
							var7 = -field_335[var15][var8 + 1];
						} else {
							var17 += -field_335[var15][var8 + 1];
						}
					}

					int var19 = var9 - this.field_202 + 10 + var7;
					this.field_314.setColor(1820159);
					this.field_314.drawLine(var14, var19, var17, var19);
					var19 += 2;
					this.field_314.drawLine(var14, var19, var17, var19);
					--var19;
					this.field_314.setColor(14153215);
					this.field_314.drawLine(var14, var19, var17, var19);

					if (var16) {
						field_320[2].PaintAFrame(this.field_314, 1, var5, var14, var19, 1, 0, 0);
					} else if (var18) {
						field_320[2].PaintAFrame(this.field_314, 1, var5, var17, var19, 0, 0, 0);
					}
				}
			}
		}

	}

	// $FF: renamed from: Z () void
	private void method_155() {
		int var1;
		if (((var1 = field_333[this.processedTileX][this.processedTileY]) & 8) == 0) {
			field_324 = field_320[32];
			int var2 = var1 & 7;
			boolean var3;

			if ((!(var3 = (var1 & 16) == 0) || var2 != 2) && (var3 || var2 != 4)) {
				this.field_286 = var3 ? 1 : 0;
			} else {
				this.field_286 = 2;
			}

			byte var4 = field_335[this.processedTileX][this.processedTileY];
			this.field_288 = var4 * field_325[var2];
			this.field_289 = var4 * field_325[var2 + 8];
		}

	}

	// $FF: renamed from: aa () void
	private void method_156() {
		if ((field_333[this.processedTileX][this.processedTileY] & 7) == 1 && (field_332[this.processedTileX][this.processedTileY] & 255) == 35) {
			this.field_288 = 0;
			this.field_289 = field_335[this.processedTileX][this.processedTileY];
		}

	}

	// $FF: renamed from: ab () void
	private void method_157() {
		field_324 = field_320[30];
		this.field_285 = 1;
		this.field_286 = method_204(field_324, 1, frameCounter % method_313(field_324, 1));
	}

	// $FF: renamed from: ac () void
	private void method_158() {
		int var1 = field_333[this.processedTileX][this.processedTileY] & 7;
		field_324 = field_320[29];
		cGame var3;
		int var5;
		if ((field_333[this.processedTileX][this.processedTileY] & 8) == 0) {
			switch (var1) {
			case 1:
				this.field_286 = 2;
				break;
			case 2:
				this.field_286 = 1;
				break;
			case 3:
			default:
				break;
			case 4:
				this.field_286 = 0;
			}


			this.field_288 = field_335[this.processedTileX][this.processedTileY] * field_325[var1];
			this.field_289 = field_335[this.processedTileX][this.processedTileY] * field_325[8 + var1];
		} else {
			switch (var1) {
			case 1:
				this.field_285 = 14;
				break;
			case 2:
				this.field_285 = 13;
				break;
			case 3:
			default:
				break;
			case 4:
				this.field_285 = 12;
			}


			this.field_286 = method_204(field_324, this.field_285, field_335[this.processedTileX][this.processedTileY]);
			int var2 = (field_324._anims_af_start[this.field_285] + this.field_286) * 5;
			this.field_288 = field_324._aframes[var2 + 2];
			this.field_289 = field_324._aframes[var2 + 3];
		}
	}

	// $FF: renamed from: ad () void
	private void method_159() {
		field_324 = field_320[29];
		this.field_285 = field_333[this.processedTileX][this.processedTileY] & 31;

		if (this.field_285 != 8 && this.field_285 != 9) {
			int var4 = (field_333[this.processedTileX][this.processedTileY] & 8160) >> 5;
			int var2 = method_204(field_324, this.field_285, var4);
			this.field_286 = var2;
			int var3 = (field_324._anims_af_start[this.field_285] + var2) * 5;
			this.field_288 = field_324._aframes[var3 + 2];
			this.field_289 = field_324._aframes[var3 + 3];
		} else {
			this.field_286 = 0;
			int var1 = (field_324._anims_af_start[this.field_285] + 0) * 5;
			this.field_288 = field_324._aframes[var1 + 2];
			this.field_289 = -field_335[this.processedTileX][this.processedTileY];
		}

	}

	// $FF: renamed from: ae () void
	private void method_160() {
		this.field_285 = (field_333[this.processedTileX][this.processedTileY] & 56) >> 3;
		field_324 = field_320[27];
		switch (this.field_285) {
		case 1:
			this.field_286 = (field_335[this.processedTileX][this.processedTileY] >> 1) % field_320[27].GetAFrames(1);
			break;
		case 3:
			this.field_286 = 0;
			this.field_289 = -field_335[this.processedTileX][this.processedTileY];
			return;
		default:
			this.field_286 = field_335[this.processedTileX][this.processedTileY];
		}
	}

	// $FF: renamed from: af () void
	private void method_161() {
		this.method_162(this.field_271, this.field_272, false);
	}

	// $FF: renamed from: a (int, int, boolean) void
	private void method_162(int var1, int var2, boolean var3) {
		Image[] var4 = field_318[18];
		byte var5 = 0;
		if (var3) {
			var5 = -5;
		}

		this.field_314.drawImage(var4[1], var1 + 6, var2 + var5, 0);
		this.field_314.drawImage(var4[0], var1 + 3, var2 + 7, 0);
		if (!var3) {
			int var7 = 0;
			if (this.field_156 < 10) {
				var7 = field_320[0]._modules_image[0][0].getWidth() >> 1;
				var7++;
			}

			method_209(this.field_314, var1 + 19 - var7, var2 + 13, this.field_156, field_320[0]._modules_image[0], 0);
		}

	}

	// $FF: renamed from: d (int, int) void
	private void method_163(int var1, int var2) {
		Graphics var3 = this.field_314;

		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				int var7 = j + this.field_201 / 24;
				int var8 = i + this.field_202 / 24;
				if (var7 >= 0 && var7 < this.currentLevelWidth && var8 >= 0 && var8 < this.currentLevelHeight) {
					int var6 = field_500[var7][var8];
					int var10 = j * 24 - var1;
					int var11 = i * 24 - var2;
					byte var12 = 0;
					if (var6 > 0) {
						for (byte k = 0; k > 2; k++) {
							if (method_373(var6, k, (byte)0, (byte)3) != 0) {
								if ((var12 = (byte)(method_373(var6, k, (byte)7, (byte)2) << 3)) > 0) {
									var12 = (byte) (method_375(method_373(var6, k, (byte)0, (byte)3), (byte)45, (byte)2) <= 1 ? var12 - (byte)24 : (byte)(24 - var12));
									this.method_152();
									var3.clipRect(var10, var11 + (k << 3), 24, 8);
								}

								int var14 = this.method_396(var7, var8, var6, k) >> 1;
								int var15 = var14 == 7 ? frameCounter >> 3 : frameCounter;
								int var16 = var15 & 1;
								if (var15 == 15) {
									field_499.PaintFrame(var3, var14 + this.field_393, var10 + var12 - 8, var11 + (k << 3) + 8, 36, 0, 0);
									this.field_393++;
									if (this.field_393 > 2) {
										this.field_393 = 0;
									}
								} else {
									if (var15 != 14 && var15 != 11) {
										if (var15 == 8 && k == 0 && field_500[var7][var8 - 1] > 0) {
											field_499.PaintFrame(var3, 33, var10 + var12, var11, 20, 0, 0);
											k = 3;
										} else {
											field_499.PaintFrame(var3, var14 + var16, var10 + var12, var11 + (k << 3), 20, 0, 0);
										}
									} else {
										field_499.PaintFrame(var3, var14 + var16, var10 + var12, var11, 20, 0, 0);
									}
									this.method_152();
								}
							}

						}
					}
				}
			}
		}

	}

	// $FF: renamed from: ag () void
	private void method_164() {
		this.field_214 = 20;
		if (field_332[this.processedTileX][this.processedTileY] >> 8 >= this.field_207) {
			this.field_215 =  0 + (frameCounter >> 1) % 7;
		} else {
			this.field_215 = 7;
		}
	}

	// $FF: renamed from: l (int) void
	private void method_165(int var1) {
		int var2 = field_332[this.processedTileX][this.processedTileY] >> 8;
		if (var2 == 255) {
			var2 = 0;
		}

		int var3 = 14 == var1 ? 8 : 22;
		if (field_320[var3] != null) {
			field_320[var3].PaintAFrame(this.field_314, 0, var2, this.field_271, this.field_272, 0, 0, 0);
		}

	}

	// $FF: renamed from: ah () void
	private void method_166() {
		boolean var1 = false;
		Graphics var2 = this.field_314;
		ASprite var3;
		if ((var3 = field_320[0]) != null) {
			var2.translate(120, 320);
			if (!this.field_170 && field_222 != 2) {
				var1 = true;
				var2.setClip(-120, -320, 240, 320);
			} else {
				var3.PaintFrame(var2, 0, 0, 0, 0, 0, 0);
				if (this.field_417) {
					var3.PaintFrame(var2, 19, 0, 0, 0, 0, 0);
				}
			}

			var3.PaintFrame(var2, 1, 0, 0, 0, 0, 0);
			if (this.field_179) {
				var3.PaintFrame(var2, 2, 2, 0, 0, 0, 0);
				var3.PaintFrame(var2, 3 + this.field_178, 2, 0, 0, 0, 0);
			}

			if (var1) {
				var2.setClip(-120, -320, 240, 320);
			}

			if (this.field_239 != this.field_410 || this.field_170 || this.field_239 <= 1) {
				Image[] var4 = field_320[0]._modules_image[0];
				int var5 = 0;
				int var6 = this.field_239 <= 1 ? 1 : 0;
				int var7 = -33 - (field_330[8] - 4) * var4[11 + var6].getWidth() / 2;
				var2.drawImage(var4[11 + var6], var7, -29, 0);
				var5 = 0 + var4[11 + var6].getWidth();
				int var8 = var4[15].getWidth();

				for (int i = 0; i < field_330[8]; i++) {
					if ((this.field_239 > 1 || i != 0 || (frameCounter >> 2 & 1) != 0) && (i >= this.field_239 || this.field_239 <= 1)) {
						var2.drawImage(var4[13 + var6], var7 + var5, -29, 0);
					} else {
						var2.drawImage(var4[15 + var6], var7 + var5, -29, 0);
					}

					var5 += var8;
				}

				var2.drawImage(var4[17 + var6], var7 + var5, -29, 0);
				this.field_410 = this.field_239;
			}

			if (this.field_411 != this.collectedDiamonds || this.field_414 != this.field_156 || this.field_170) {
				method_209(var2, 70, -12, this.collectedDiamonds, field_320[0]._modules_image[0], 0);
			}

			if (this.field_412 != this.collectedRedDiamonds || this.field_170) {
				this.field_412 = this.collectedRedDiamonds;
				method_209(var2, 107, -12, this.collectedRedDiamonds, field_320[0]._modules_image[0], 0);
			}

			var2.translate(-120, -320);
			var2.translate(120, 0);
			boolean var10 = false;
			if (this.field_170 || field_222 == 2) {
				var3.PaintFrame(var2, 20, 0, 0, 0, 0, 0);
				var10 = true;
			}

			if (this.field_415 != this.playerGoldKeys || this.field_416 != this.playerSilverKeys || this.field_170 || field_222 == 2 || var10) {
				if (!var10) {
					var3.PaintFrame(var2, 20, 0, 0, 0, 0, 0);
					var10 = true;
				}

				method_209(var2, 47, 18, this.playerGoldKeys, field_320[0]._modules_image[0], 0);
				method_209(var2, 87, 18, this.playerSilverKeys, field_320[0]._modules_image[0], 0);
				this.field_415 = this.playerGoldKeys;
				this.field_416 = this.playerSilverKeys;
			}

			if (this.field_413 != this.playerLifeCount || this.field_170 || var10) {
				if (!var10) {
					var3.PaintFrame(var2, 20, 0, 0, 0, 0, 0);
				}

				method_209(var2, -29, 18, this.playerLifeCount, field_320[0]._modules_image[0], 0);
				this.field_413 = this.playerLifeCount;
			}

			var2.translate(-120, 0);
			this.field_411 = this.collectedDiamonds;
			this.field_414 = this.field_156;
			this.field_170 = false;
		}
	}

	// $FF: renamed from: ai () void
	private void method_167() {
		field_324 = field_320[6];
		this.field_285 = 0;
		if (this.field_310 == 0) {
			this.field_286 = 0;
		} else if (this.field_310 == 9) {
			this.field_286 = 2;
		} else {
			this.field_286 = this.field_311 < 0 ? 1 : 3;
		}
	}

	// $FF: renamed from: aj () void
	private void method_168() {
		int var1 = field_333[this.processedTileX][this.processedTileY] == 1 ? 1 : 0;
		ASprite var2 = field_320[5];
		var2.PaintAFrame(this.field_314, var1, (frameCounter >> 1) % var2.GetAFrames(var1), this.field_271, this.field_272, 0, 0, 0);
	}

	// $FF: renamed from: b (byte) void
	private void method_169(byte var1) {
		ASpriteInstance var2 = field_323[4];
		if (var1 == 23) {
			var2._posX = this.field_271;
			var2._flags |= 1;
		} else {
			var2._flags &= -2;
			var2._posX = this.field_271 + 24;
		}

		var2._posY = this.field_272;
		var2.ApplyAnimOff();
		var2.PaintSprite(this.field_314);
	}

	// $FF: renamed from: m (int) void
	private void method_170(int var1) {
		switch (var1) {
		case 0:
			loadFontSprite();
			System.gc();
			return;
		case 1:
			return;
		case 2:
			field_320[41]._nLineSpacing = 15;
			return;
		case 3:
			return;
		case 4:
			return;
		case 5:
			return;
		case 6:
			if (field_315 == null) {
				field_315 = loadImageFile("/spl.f", 0);
			}

			if (field_316 == null) {
				field_316 = loadImageFile("/spl.f", 1);
			}

			if (field_317 == null) {
				field_317 = loadImageFile("/spl.f", 2);
				return;
			}
			break;
		case 7:
			if (field_320[18] == null) {
				field_320[18] = loadGfxFile("/ui.f", 3);
			}
		}

	}

	// $FF: renamed from: ak () void
	private static void method_171() {
		field_315 = null;
		field_316 = null;
		field_317 = null;
		field_513 = null;
		field_428 = null;
		field_514 = null;
		System.gc();
	}

	// $FF: renamed from: al () void
	private void method_172() {
		this.field_419 = menuData[this.currentMenu].length >> 1;
		this.field_420 = 0;

		for (int var1 = 0; var1 < this.field_419; ++var1) {
			int var2 = method_361(field_320[41], menuText[menuData[this.currentMenu][var1 * 2 + 1]], 0);
			if ((this.currentMenu != 0 || var1 != 3) && var2 > this.field_420) {
				this.field_420 = var2;
			}
		}

		this.field_423 = 0;
		this.field_418 = 0;
	}

	// $FF: renamed from: e (int, int) void
	private void method_173(int var1, int var2) {
		if (field_222 == 4) {
			this.method_142(this.field_314, false);

			for (int var3 = var1 - 1; var3 < var2 - 2; ++var3) {
				field_320[18].PaintFrame(this.field_314, 4, var3 % 2, var3, 0, 0, 0);
			}
		}

		if (field_222 == 2) {
			this.field_314.setColor(0);
			this.field_314.fillRect(0, var1 - 1, 240, var2 - 2 - (var1 - 1));
		}

		this.field_314.setColor(0xFFFFFF);
		this.field_314.drawLine(0, var1 - 1 - 1, 240, var1 - 1 - 1);
		this.field_314.drawLine(0, var2 - 1, 240, var2 - 1);
		this.field_314.setColor(0);
		this.field_314.drawLine(0, var1 - 1 - 2, 240, var1 - 1 - 2);
		this.field_314.drawLine(0, var2 - 2, 240, var2 - 2);
	}

	// $FF: renamed from: am () void
	private void method_174() {
		this.field_433 = false;
		this.field_432 = method_105();
	}

	// $FF: renamed from: an () void
	private void method_175() {
		if (this.field_433) {
			this.method_174();
		}

		int var1 = (var1 = 320 - (this.field_419 * 15 + 1 + 2)) + (!this.field_432 && this.currentMenu == 0 ? 15 : 0);
		int var2 = 320;
		this.field_314.setClip(0, 0, 240, 320);
		if (field_222 == 2 && field_429 && field_430) {
			this.field_417 = false;
			this.method_153();
			this.field_417 = true;
			field_430 = false;
		}

		if (field_222 == 7 || field_222 == 2) {
			int var3 = var1 - (160 - (320 - var1) / 2);
			var1 -= var3;
			var2 = 320 - var3;
		}

		if (this.currentMenu == 7) {
			field_320[41].DrawString(this.field_314, menuText[this.field_223 == 5 ? 102 : 113], 120, var1 - 20, 17);
		}

		if (field_222 == 7) {
			if (this.field_427 != -1 && !field_429) {
				int var16 = var1 + this.field_427 * 15;
				this.field_314.setColor(0);
				this.field_314.fillRect(0, var16, 240, 16);
			} else {
				this.field_314.setColor(0);
				this.field_314.fillRect(0, 0, 240, 320);
			}
		}

		long var17 = System.currentTimeMillis();
		if (this.field_425 >= 0 && var17 - this.field_426 > 100L) {
			this.field_425++;
			this.field_426 = var17;
		}

		if (this.field_427 != -1 && !field_429) {
			int var5 = this.currentMenu == 0 && this.field_427 > 1 && !this.field_432 ? 15 : 0;
			int var6 = var1 + this.field_427 * 15 - var5;
			this.field_314.setClip(0, var6, 240, 16);
		}

		if (this.field_427 != this.currentMenuSelection || field_429) {
			this.method_173(var1, var2);
		}

		for (int i = 0; i < this.field_419; i++) {
			if ((this.field_427 == -1 || i == this.field_427 || i == this.currentMenuSelection || field_429) && (this.currentMenu != 0 || i != 1 || this.field_432)) {
				int var19;
				int var7 = (var19 = var1 + i * 15) + 7;
				if (this.currentMenu == 0 && i > 1 && !this.field_432) {
					var19 -= 15;
					var7 -= 15;
				}

				byte var8 = 0;
				if (i == 2 && this.currentMenu == 0) {
					var8 = 1;
				}

				if (this.field_174 == 2 && i == 4 && this.currentMenu == 1) {
					var8 = 0;
					if (i != this.currentMenuSelection) {
						this.field_314.setColor(0xCCCCCC);
						this.field_314.fillRect(0, var7 - 7 + 1, 240, 14);
					} else {
						this.field_314.setColor(0x666666);
						this.field_314.fillRect(0, var7 - 7, 240, 16);
					}
				} else if (i == this.currentMenuSelection) {
					this.field_314.setColor(0xCE9B00);
					this.field_314.fillRect(0, var7 - 7, 240, 16);
				}

				int var11 = 0;
				boolean var14 = false;
				field_320[41].UpdateStringSize(menuText[menuData[this.currentMenu][i * 2 + 1]]);
				int var9;
				int var10 = var9 = ASprite._text_w;
				int var12 = i == 2 && this.currentMenu == 0 ? 152 : 210;
				if (var9 > var12) {
					var14 = true;
					var9 = var12;
				}

				int var13 = 120 - var9 / 2;
				if (var14) {
					var11 = i == this.currentMenuSelection ? this.field_422 : 0;
					this.field_314.setClip(var13, var19, var9, 15);
				}

				field_320[41]._crt_pal = var8;
				field_320[41].DrawString(this.field_314, menuText[menuData[this.currentMenu][i * 2 + 1]], 120 - var9 / 2 - var11, var7 + 1, 6);
				if (var14) {
					this.field_314.setClip(0, 0, 240, 320);
				}

				if (i == this.currentMenuSelection) {
					this.field_314.setColor(0xFFFFFF);
					field_320[18].PaintFrame(this.field_314, 2, 120 - var9 / 2 - 8, var7, 0, 0, 10);
					field_320[18].PaintFrame(this.field_314, 2, 120 + var9 / 2 + 8, var7, 0, 0, 6);
				}

				if (i == this.currentMenuSelection && var14 && this.field_418 % 2 == 0) {
					this.field_422 += this.field_421;
					if (this.field_422 < -5 || this.field_422 + var12 - 5 > var10) {
						this.field_421 = -this.field_421;
						this.field_422 += this.field_421;
					}
				}
			}
		}

		this.field_427 = this.currentMenuSelection;
		this.field_418++;
		if (this.field_424 < 0) {
			this.field_424 = 3;
		} else {
			this.field_424 -= 1;
		}

		if (this.field_424 == 0 && this.field_423 + 1 < this.field_419) {
			this.field_423++;
		}

		this.field_314.setClip(0, 0, 240, 320);
		if (this.currentMenu == 0 && this.field_473) {
			if (this.field_418 % 20 >= 10) {
				field_320[18].PaintFrame(this.field_314, 1, 1, var1 + 30 + 7 - (this.field_432 ? 0 : 15), 0, 0, 6);
			} else if (this.currentMenuSelection != 2) {
				if (field_428 == null) {
					int var20 = var1 + 30 + 1 - (this.field_432 ? 0 : 15);
					field_428 = Image.createImage(28, 14);
					Graphics var21;
					(var21 = field_428.getGraphics()).translate(-1, -var20);
					this.method_142(var21, false);
					var21.translate(1, var20);

					for (int i = 0; i < 14; i++) {
						field_320[18].PaintFrame(var21, 4, (var20 + i + 1) % 2, i, 0, 0, 0);
					}
				}

				this.field_314.drawImage(field_428, 1, var1 + 30 + 1 - (this.field_432 ? 0 : 15), 0);
			}
		}

		if (this.currentMenu != 0 && this.currentMenu != 3 && this.currentMenu != 1 && this.currentMenu != 7) {
			this.method_176();
		}

		this.method_177();
		field_429 = false;
		if (this.field_425 == 2) {
			if (field_222 == 2) {
				field_429 = true;
				field_430 = true;
			}

			this.field_425 = -1;
			this.field_170 = true;
			this.field_427 = -1;
			this.method_82();
		}

	}

	// $FF: renamed from: a () void
	public final void method_176() {
		field_320[18].PaintFrame(this.field_314, 0, 223, 308, 0, 0, 0);
	}

	// $FF: renamed from: b () void
	public final void method_177() {
		field_320[18].PaintFrame(this.field_314, 3, 2, 308, 0, 0, 0);
	}

	// $FF: renamed from: ao () void
	private void renderProgressBar() {
		Graphics var1 = this.field_314;
		var1.setColor(0x000000);
		var1.fillRect(0, 0, 240, 320);
		int barWidth = (this.field_266 + 1) * 230 / this.field_265;
		if (barWidth > 230) {
			barWidth = 230;
		}

		var1.setColor(0xCE9B00); //Progress bar fill color
		this.field_314.fillRect(5, 310, barWidth, 6);
		var1.setColor(0xFC9A04); //Progress bar border color
		this.field_314.drawRoundRect(4, 309, 231, 6, 2, 2); //Progress bar box
		field_320[41]._crt_pal = 0;
		field_320[41].DrawString(this.field_314, menuText[37], 120, 293, 1); //Draw loading text (menuText[37])
	}

	// $FF: renamed from: ap () void
	private void method_179() {
		switch (this.field_174) {
		case 1:
			this.method_187();
			return;
		case 2:
			this.method_189();
			this.method_180();
			return;
		case 3:
			this.method_183();
			return;
		case 4:
			this.method_186();
			return;
		case 5:
			this.method_182();
		default:
		}
	}

	// $FF: renamed from: aq () void
	private void method_180() {
		if (this.field_201 + 240 > 1440 && this.field_202 + 320 > 48) {
			if (field_320[10] == null) {
				field_320[10] = loadGfxFile("/mmv.f", 0);
			}

			ASprite var1 = field_320[10];
			if (this.method_298(60, 3) || this.method_298(61, 3)) {
				var1.PaintFrame(this.field_314, 1, 1440 - this.field_201, 48 - this.field_202, 0, 0, 0);
			}
		}

		if (this.playerXPos > 55 && this.field_100) {
			field_323[0].PaintSprite(this.field_314);
		}

	}

	// $FF: renamed from: d (javax.microedition.lcdui.Graphics) void
	private void method_181(Graphics var1) {
		if (field_320[10] == null) {
			field_320[10] = loadGfxFile("/mmv.f", 0);
		}

		if (this.processedTileX >= 60 && this.processedTileX < 65 && this.processedTileY >= 2 && this.processedTileY < 7) {
			field_320[10].PaintFrame(var1, 4 + (this.processedTileY - 2) * 5 + this.processedTileX - 60, this.field_271, this.field_272, 0, 0, 0);
		}

	}

	// $FF: renamed from: ar () void
	private void method_182() {
		if (this.field_180 != -1) {
			ASpriteInstance var1;
			(var1 = field_323[5])._posX = this.field_185 - this.field_201;
			var1._posY = 504 - this.field_202;
			var1.ApplyAnimOff();
			var1.PaintSprite(this.field_314);
			if (this.field_180 == 12) {
				int var2 = this.field_185 - this.field_201 + frameCounter * this.field_181 % 48;
				int var3 = field_323[5]._posY + 24;
				field_320[7].PaintAFrame(this.field_314, 0, frameCounter % field_320[7].GetAFrames(1), var2, var3, 0, 0, 0);
				this.method_268(var2, var3);
			}
		}

	}

	// $FF: renamed from: as () void
	private void method_183() {
		if (this.field_174 == 3 && (long)frameCounter >= this.field_454 + 80L) {
			for (int var1 = 14; var1 <= 21; ++var1) {
				field_333[var1][15] = 0;
				field_332[var1][15] = -1;
				field_334[var1][15] = 44;
				field_335[var1][15] = 0;
				field_336[var1][15] = 24;
			}

			this.field_454 = 0L;
		}

		if (this.field_180 != 15) {
			if (this.field_201 + 240 + 48 >= this.field_184 && this.field_202 + 320 + 48 >= 504) {
				ASpriteInstance var3 = field_323[5];
				var3._posX = this.field_184 - this.field_201;
				var3._posY = 504 - this.field_202;
				var3.ApplyAnimOff();
				var3.PaintSprite(this.field_314);
			}

			if (this.field_180 == 12) {
				int var4 = this.field_184 - this.field_201 + frameCounter * this.field_181 % 48;
				int var2 = field_323[5]._posY + 24;
				field_320[7].PaintAFrame(this.field_314, 0, frameCounter % field_320[7].GetAFrames(0), var4, var2, 0, 0, 0);
				this.method_268(var4, var2);
			}
		}

	}

	// $FF: renamed from: at () void
	private void method_184() {
		Graphics var1 = this.field_314;
		ASpriteInstance var2 = field_323[5];
		if (this.field_180 == 7) {
			int var3 = var2._posX + frameCounter * this.field_181 % 48;
			int var4 = var2._posY;
			if (this.field_139 == 10) {
				var4 -= 144;
			}

			field_320[7].PaintAFrame(var1, 1, frameCounter % field_320[7].GetAFrames(1), var3, var4, 0, 0, 0);
			this.method_268(var3, var4);
		} else {
			if (this.field_180 != 8 && this.field_180 != 0) {
				this.method_185(var1, 3);
			}

		}
	}

	// $FF: renamed from: a (javax.microedition.lcdui.Graphics, int) void
	private void method_185(Graphics var1, int var2) {
		int var3 = var2 * 14 + 2;
		int var4 = 240 - var3 >> 1;
		if (this.field_182 > 0) {
			var1.setColor(0);
			var1.fillRect(var4, 5, var3, 12);
			var1.setColor(0x3BB78F);

			for (int i = 0; i < this.field_182; i++) {
				var1.fillRect(var4 + 2 + i * 14, 7, 12, 8);
			}
		}

	}

	// $FF: renamed from: au () void
	private void method_186() {
		Graphics var1 = this.field_314;
		ASpriteInstance var2 = field_323[5];
		ASpriteInstance var3 = field_323[4];
		int var4;
		switch (this.field_180) {
		case 1:
			var4 = this.field_181 * 1;
			break;
		case 2:
		case 7:
			var4 = 40;
			break;
		case 3:
			var4 = 40;
			break;
		case 4:
			var4 = 40 - (this.field_181 * 2 << 1);
			break;
		case 5:
			var4 = 15 + this.field_181 * 18;
			this.field_434 = false;
			break;
		case 6:
		case 8:
		default:
			var4 = -1000;
			break;
		case 9:
			var4 = 15 + this.field_181 * 18;
			break;
		case 10:
			var4 = 15 + this.field_181 * 18;
			break;
		case 11:
			var4 = 15 + this.field_181 * 18;
		}

		var2._posX = (10 + this.field_183 * (2 + (this.field_183 > 0 ? 1 : 0))) * 24 - this.field_201;
		if (this.field_180 == 5) {
			int var5 = var2._posY;
			var2._posY = 256 - this.field_202 - this.field_142 - 15;
			if (this.method_275() == 3) {
				var2._posY = var5;
			}
		} else {
			var2._posY = 256 - var4 - this.field_202;
		}

		var2.PaintSprite(var1);
		if (this.field_141) {
			var3._posY = 96 - this.field_202;
			var3._posX = (this.method_274() + 1) * 24 - this.field_201;
			var3.PaintSprite(var1);
		}

		for (int i = 0; i < 3; i++) {
			int var6 = (i * (2 + (i > 0 ? 1 : 0)) + 10) * 24 - this.field_201;
			if (var6 < 240 && var6 > -48 && this.field_202 > -80) {
				field_320[40].PaintFrame(var1, 1, var6, 216 - this.field_202, 0, 0, 0);
			}
		}

	}

	// $FF: renamed from: av () void
	private void method_187() {
		int var1 = frameCounter;
		ASpriteInstance var2 = field_323[2];
		if (this.field_202 + this.field_256 < 1008 && this.field_202 + this.field_256 > 592) {
			var2._posX = 240 - this.field_201;
			var2._posY = 1008 - this.field_202;
			var2.ApplyAnimOff();
			var2.PaintSprite(this.field_314);
			var2._posX = 336 - this.field_201;
			var2._posY = 1008 - this.field_202;
			var2.ApplyAnimOff();
			var2._flags = 1;
			var2.PaintSprite(this.field_314);
		}

		if (this.field_255 > 10) {
			this.method_188();
		}

		int var5 = this.currentLevelHeight * 24 - this.field_176 - this.field_202;
		int var6;
		int var7 = var6 = 168 - this.field_201;

		int var8;
		for (var8 = var6 + 240; var6 <= -24; var6 += 24) {
		}

		ASpriteInstance var9 = field_323[1];
		if ((this.field_176 >= 816 || var9._nCrtAnim == 2) && this.field_176 > 816) {
			for (int i = var5 + 20; i < 320; i += 24) {
				for (int j = var6; j < var8; j += 24) {
					var9._sprite.PaintAFrame(this.field_314, 1, ((var1 >> 1) + j + i) % 2, j, i, 0, 0, 0);
				}
			}
		}

		if (var2._nCrtAnim == 2) {
			var9._flags = 0;
			var9._posX = var7 + 120;
			var9._posY = var5;
			var9.ApplyAnimOff();
			var9.PaintSprite(this.field_314);
			var9._flags = 1;
			var9.PaintSprite(this.field_314);
			this.method_190();
		}

	}

	// $FF: renamed from: aw () void
	private void method_188() {
		for (int var1 = 3; var1 < 13; var1 += 2) {
			int var2;
			int var3 = ((var2 = 10 * (2 * var1 / 5 + 1)) + frameCounter / var2) * var1 % 240;
			int var4 = 320 / var2 * frameCounter % 320;
			this.field_314.drawImage(field_318[27][var1 & 1], var3, var4, 0);
		}

	}

	// $FF: renamed from: ax () void
	private void method_189() {
		if (this.field_189 && this.field_354 == null && this.field_258 == -1) {
			field_320[15].PaintAFrame(this.field_314, 0, frameCounter >> 1 & 3, this.field_269, this.field_270 - 24, 0, 0, 0);
		}

	}

	// $FF: renamed from: ay () void
	private void method_190() {
		Graphics var1 = this.field_314;
		int var3 = (frameCounter << 3) % 160;
		int var2 = (frameCounter / 160 & 1) == 0 ? 160 - var3 : 0 + var3;
		var1.setColor(255, var2, 0);
		var1.drawRect(0, 0, 239, 319);
	}

	// $FF: renamed from: az () void
	private void method_191() {
		if (!this.field_338) {
			int var1 = this.playerXPos;
			int var2 = this.playerYPos;
			int var3 = frameCounter;
			int var4 = this.field_233 & 7;
			int var5 = (this.field_233 & 16384) == 0 ? 0 : 3;
			ASpriteInstance var6 = field_323[var5];
			boolean var7 = this.playerPosInBounds();
			int var8 = (this.field_233 & 2048) == 0 ? this.field_291 : this.field_233 & 7;
			if (this.field_100) {
				this.field_269 = var1 * 24 + field_325[var8] * this.field_232 - this.field_201;
				this.field_270 = var2 * 24 + field_325[var8 + 8] * this.field_232 - this.field_202;
				if ((this.field_241 <= 0L || (var3 >> 1 & 1) == 0) && this.field_234 <= 0) {
					var6._posX = this.field_269;
					var6._posY = this.field_270;
					if (field_500 != null && var7 && var4 != 1 && var4 != 3 && field_500[var1][var2 + 1] != 0 && method_344(var1, var2 + 1)) {
						int var9;
						int var10 = (var9 = (var3 >> 1) + var1) % 4;
						if ((var9 / 4 & 1) == 1) {
							var10 = 4 - var10;
						}

						var6._posY += var10;
					}

					var6.ApplyAnimOff();
					var6.PaintSprite(this.field_314);
					int var14;
					field_367 = (var14 = var6._nCrtAnim) == 47 && var6._nCrtAFrame == 0;
					switch (var14) {
					case 17:
					case 18:
						if (var6._nCrtAFrame == 0) {
							this.field_314.drawImage(field_318[this.field_210][this.field_211], var6._posX, var6._posY - 12, 0);
						}
						break;
					case 40:
					case 47:
					case 48:
						if (var6._nCrtAFrame > (var14 == 40 ? 13 : 6) || var14 == 47) {
							try {
								byte var16 = 0;
								if (this.field_210 == 30 || this.field_210 == 31 || this.field_210 == 32) {
									var16 = -2;
								}

								if (field_318[this.field_210] == null) {
									field_320[method_149(this.field_210)].PaintFrame(this.field_314, this.field_211, var6._posX + var16, var6._posY - 24, 0, 0, 0);
								} else {
									this.field_314.drawImage(field_318[this.field_210][this.field_211], var6._posX + var16, var6._posY - 24, 0);
								}
							} catch (Exception var13) {
							}

							if (this.field_212 > 0) {
								method_209(this.field_314, var6._posX + 24, var6._posY - 10, this.field_212, field_320[0]._modules_image[0], 0);
							}
						}
					}
				}

				if (var7 && field_334[var1][var2] == 0) {
					int var15 = field_333[var1][var2] & 7;
					byte var17 = field_335[var1][var2];

					try {
						field_320[method_149(1)].PaintFrame(this.field_314, 0 + (field_333[var1][var2] & 56), var1 * 24 - this.field_201 + field_325[var15] * var17, var2 * 24 - this.field_202 + field_325[var15 + 8] * var17, 0, 0, 0);
						return;
					} catch (Exception var12) {
					}
				}

			}
		}
	}

	// $FF: renamed from: aA () void
	private void method_192() {
		int var1 = this.processedTileX;
		int var2;
		int var3 = (var2 = this.processedTileY) + 1;
		this.field_273 = 0;
		this.field_274 = 0;
		this.field_277 = false;
		int var4;
		int var6 = (var4 = field_333[var1][var2]) & 7;
		byte var5 = field_335[var1][var2];
		if (var4 == -1) {
			var4 = -1;
		}

		this.field_288 += var5 * field_325[var6];
		this.field_289 += var5 * field_325[var6 + 8];
		boolean var7 = field_500 != null && field_500[var1][var2] != 0;
		switch (this.field_283) {
		case 0:
			int var8 = (var4 & 56) >> 3;
			int var9 = (var4 & 28672) >> 12;
			boolean var10 = (var4 & 65536) == 0;
			if (!var7 && var6 == 0 && method_344(var1, var3)) {
				var4 = var4 & -28673 | var9 << 12;
				if (var10) {
					var4 &= -65537;
				} else {
					var4 |= 65536;
					var9 = -var9;
				}

				this.field_288 = var9;
			} else {
				var4 &= -28673;
			}

			field_333[var1][var2] = var4;
			this.field_216 = 1;
			this.field_217 = 0 + var8;
			break;
		case 1:
			this.field_216 = 2;
			this.field_217 = 0 + this.field_292;
			break;
		case 2:
			this.method_196();
			break;
		case 4:
			this.field_216 = 24;
			this.field_217 = 0 + this.field_292;
			break;
		case 5:
			this.field_216 = 25;
			this.field_217 = 0 + this.field_292;
			break;
		case 6:
			this.field_216 = 5;
			this.field_217 = 0;
			break;
		case 7:
			this.field_216 = 5;
			this.field_217 = 1;
			break;
		case 8:
			this.field_216 = 16;
			this.field_217 = 0 + (frameCounter >> 1 & 1);
			break;
		case 9:
			field_324 = field_320[(var4 & 264241152) >> 22];
			this.field_286 = 0;
			break;
		case 47:
			field_324 = field_320[30];
			this.field_285 = 0;
			this.field_286 = method_204(field_324, 0, frameCounter % method_313(field_324, 0));
		}

		if (var7 || field_500 != null && field_500[var1][var3] != 0 && method_344(var1, var3)) {
			int var22 = (frameCounter >> 1) + var1;
			int var23 = var22 % 4;
			if ((var22 / 4 & 1) == 1) {
				var23 = 4 - var23;
			}

			this.field_289 += var23;
		}

		if (((var4 & 512) != 0 || field_334[var1 - field_325[var6]][var3] < 0 && method_344(var1, var3) && (field_333[var1][var3] & 7) == 0 && var1 != this.field_252 && var2 != this.field_253) && (this.field_233 & 8) == 0) {
			this.field_289 += var5 * var5 / 24;
			if (this.field_283 != 9) {
				this.field_288 += -1 + frameCounter % 3;
			}
		}

		if ((var4 & 512) != 0) {
			this.field_288 = -this.field_288;
		}

		if (this.field_283 == 0) {
			this.field_278 = ((var4 & 448) >> 6) - 1;
			if (this.field_278 >= 0 && this.field_278 < 5) {
				this.field_277 = true;
				switch (var4 & 7) {
				case 2:
					this.field_273 = -24;
					break;
				case 4:
					this.field_273 = 24;
					break;
				default:
					this.field_273 = 0;
				}

				this.field_274 = 13;
				this.field_275 = this.processedTileX;
				this.field_276 = this.processedTileY - 1;
			}
		}

		this.method_156();
	}

	// $FF: renamed from: aB () void
	private void method_193() {
		int var1 = this.processedTileX;
		int var2 = this.processedTileY;
		int var3 = field_333[var1][var2];
		byte var4 = field_335[var1][var2];
		int var5 = var3 & 7;
		this.field_288 = var4 * field_325[var5];
		this.field_289 = var4 * field_325[var5 + 8];
		field_324 = field_320[38];
		int var6;

		if (((var6 = (var3 & 28672) >> 12) != 2 && var6 != 4 && var5 != 2 && var5 != 4 || field_334[var1 - 1][var2] < 0 || field_334[var1 + 1][var2] < 0) && (var6 != 1 && var6 != 3 && var5 != 1 && var5 != 3 || field_334[var1][var2 - 1] < 0 || field_334[var1][var2 + 1] < 0)) {
			if (var5 != 1 && var5 != 3) {
				this.field_285 = 0;
			} else {
				this.field_285 = var5 - 1;
			}

			this.field_286 = (frameCounter >> 1) % field_324.GetAFrames(this.field_285);
		} else {
			this.field_285 = 1;
			this.field_286 = 0;
		}

		this.method_156();
	}

	// $FF: renamed from: c (byte) void
	private void method_194(byte var1) {
		cGame var7;
		int var9;
		ASprite var10002;
		int var10003;
		label33: {
			int var2 = field_333[this.processedTileX][this.processedTileY];
			byte var3 = field_335[this.processedTileX][this.processedTileY];
			int var4 = var2 & 7;
			this.field_288 = var3 * field_325[var4];
			this.field_289 = var3 * field_325[var4 + 8];
			int var5 = var1 == 19 ? 4 : 21;
			field_324 = field_320[var5];
			if (this.currentWorld == 1) {
				if ((var2 & 248) >> 3 > 0) {
					var7 = this;
					var9 = 2;
				} else {
					var7 = this;
					var9 = 0;
				}

				var7.field_285 = var9;
				var7 = this;
				var9 = frameCounter;
				var10002 = field_324;
			} else {
				label30: {
					if ((var2 & 248) >> 3 > 0) {
						var7 = this;
						var9 = 4;
					} else {
						this.field_285 = var4 - 1;
						if (this.field_285 >= 0) {
							break label30;
						}

						var7 = this;
						var9 = ((var2 & 28672) >> 12) - 1;
					}

					var7.field_285 = var9;
				}

				var7 = this;
				var9 = frameCounter >> 1;
				var10002 = field_324;
				if (this.field_285 < 0) {
					var10003 = 0;
					break label33;
				}
			}

			var10003 = this.field_285;
		}

		var7.field_286 = var9 % var10002.GetAFrames(var10003);
		this.method_156();
	}

	// $FF: renamed from: aC () void
	private void method_195() {
		label44: {
			int var1 = this.processedTileX;
			int var2 = this.processedTileY;
			this.field_214 = 26;
			this.field_215 = 0;
			cGame var10000;
			int var10001;
			if (method_344(var1, var2) && field_335[var1][var2] <= 12) {
				var10000 = this;
				var10001 = -(field_335[var1][var2] - 12);
			} else if (this.method_298(var1, var2)) {
				if ((this.field_233 & 4096) == 0) {
					if (this.field_232 > 12) {
						break label44;
					}

					var10000 = this;
					var10001 = -(this.field_232 - 12);
				} else {
					var10000 = this;
					var10001 = 12;
				}
			} else {
				if (this.method_298(var1 - 1, var2)) {
					if (this.field_291 != 4 || this.field_232 <= 12) {
						break label44;
					}
				} else if (!this.method_298(var1 + 1, var2) || this.field_291 != 2 || this.field_232 <= 12) {
					break label44;
				}

				var10000 = this;
				var10001 = this.field_232 - 12;
			}

			var10000.field_289 = var10001;
		}

		this.field_289 += 24;
		this.field_290 = 36;
	}

	// $FF: renamed from: aD () void
	private void method_196() {
		int var1 = field_332[this.processedTileX][this.processedTileY] & 255;
		int var2 = field_332[this.processedTileX][this.processedTileY] >> 8;
		if (var1 != 14 && var1 != 33 || var2 > 11) {
			this.field_216 = 3;
			this.field_217 = 0 + this.field_292;

			if (var1 == 14) {
				this.field_289 = -(field_320[8].GetAFrames(0) - var2);
			} else if (var1 == 33) {
				this.field_289 = -(field_320[22].GetAFrames(0) - var2);
			}

		}

	}

	// $FF: renamed from: aE () void
	private void method_197() {
		int var1 = this.processedTileX;
		int var2 = this.processedTileY;
		this.field_216 = 6;
		int var3;
		if ((var3 = (field_333[var1][var2] & 3840) >> 8) >= 4) {
			this.field_216 = -1;
		} else {
			this.field_217 = (var3 == 0) ? 0 + (frameCounter >> 1) % 3 : 3 + var3 - 1;
			int var4 = field_333[var1][var2] & 7;
			this.field_288 = field_335[var1][var2] * field_325[var4] + 2;
			this.field_289 = field_335[var1][var2] * field_325[var4 + 8] + 2;
			if ((field_333[var1][var2] & 16) == 0) {
				switch (var4) {
				case 1:
					this.field_288 += 4;
					return;
				case 2:
					this.field_289 += 4;
					break;
				case 3:
					this.field_288 -= 4;
					return;
				case 4:
					this.field_289 -= 4;
					break;
				}
			} else {
				switch (var4) {
				case 1:
					this.field_288 -= 4;
					return;
				case 2:
					this.field_289 -= 4;
					break;
				case 3:
					this.field_288 += 4;
					return;
				case 4:
					this.field_289 += 4;
					break;
				}
			}
		}
	}

	// $FF: renamed from: aF () void
	private void method_198() {
		this.field_314.setColor(13883367);
		byte var3 = field_335[this.processedTileX][this.processedTileY];
		int var1;
		int var2;

		if ((field_333[this.processedTileX][this.processedTileY] & 1) != 0) {
			var1 = this.field_271;
			var2 = this.field_271 + 24 - var3;
			this.field_286 = 0;
		} else {
			var1 = this.field_271 + 24;
			var2 = this.field_271 + var3;
			this.field_286 = 1;
		}

		this.field_314.drawLine(var1, this.field_272 + 12, var2, this.field_272 + 12);
		if (var3 > 0) {
			field_323[0]._sprite.PaintModule(this.field_314, this.field_286, var2, this.field_272 + 12 - 2, 0);
		}

	}

	// $FF: renamed from: aG () void
	private void method_199() {
		int var1 = field_332[this.processedTileX][this.processedTileY] >> 8;
		this.field_214 = this.field_284 == 9 ? 22 : 23;

		if ((var1 & 512) != 0) {
			if (this.field_284 == 9) {
				// ???
			}

			this.field_215 = (byte)(1 + (frameCounter >> 2) % 6);
		} else if ((var1 & 256) != 0) {
			this.field_215 = 1;
		} else {
			this.field_215 = 0;
		}

	}

	// $FF: renamed from: aH () void
	private void method_200() {
		int var1 = this.processedTileX;
		int var2 = this.processedTileY;
		int var4;
		if ((var4 = ((field_332[var1][var2] >> 8 & 240) >> 4) - 1) < 0) {
			var4 = 0;
		}

		if ((field_332[var1][var2 - 1] & 255) != 9 && (field_332[var1][var2 - 1] & 255) != 8) {
			field_320[56].PaintFrame(this.field_314, var4, this.field_271, this.field_272, 0, 0, 0);
		}

		this.field_214 = 4;
		this.field_215 = (byte)(var4 + 3);
	}

	// $FF: renamed from: aI () void
	private void method_201() {
		int var1 = frameCounter;
		int var2 = field_333[this.processedTileX][this.processedTileY];
		byte var3;
		if ((var3 = field_335[this.processedTileX][this.processedTileY]) > 24) {
			var3 = 24;
		}

		int var4 = var2 & 7;
		this.field_288 = var3 * field_325[var4];
		this.field_289 = var3 * field_325[var4 + 8];
		if ((var2 & 8) == 0) {
			this.field_216 = 10;
			this.field_217 = (var1 >> 1) % 3;
			if (var4 != 3) {
				int var5 = (var1 >> 1) % 5;
				this.field_314.drawImage(field_318[10][3 + var5], this.field_271 + this.field_288 - var5 * 4, this.field_272 + this.field_289 + 24, 36);
				return;
			}
		} else {
			this.field_216 = 10;
			this.field_217 = 2 - (var1 >> 1) % 3;
			if (var4 != 3) {
				int var6 = (var1 >> 1) % 5;
				this.field_314.drawImage(field_318[10][8 + var6], this.field_271 + 24 - 12 + this.field_288 + var6 * 3, this.field_272 + this.field_289 + 24, 36);
				if ((var1 >> 1 & 1) == 0 && field_334[this.processedTileX - 1][this.processedTileY] >= 0) {
					this.field_288--;
					this.field_289++;
				}
			}
		}

	}

	// $FF: renamed from: aJ () void
	private void method_202() {
		if (field_334[this.processedTileX][this.processedTileY + 1] != 16) {
			int var1 = field_333[this.processedTileX][this.processedTileY];
			ASprite var2;
			field_324 = var2 = field_320[1];
			byte var3 = field_335[this.processedTileX][this.processedTileY];
			int var4 = 36 - var3;
			int var5 = 0;
			this.field_285 = (var1 & 7) == 4 ? 1 : 0;
			if (var3 != 0) {
				for (int var6 = 0; var4 > 0; var5 = var6++) {
					var4 -= var2.GetAFrameTime(this.field_285, var6);
				}
			}

			this.field_286 = var5;
			int var7 = (var2._anims_af_start[this.field_285] + var5) * 5;
			this.field_288 = var2._aframes[var7 + 2];
		}
	}

	// $FF: renamed from: aK () void
	private void method_203() {
		int var1 = field_333[this.processedTileX][this.processedTileY];
		field_324 = field_320[28];
		this.field_285 = var1 & 15;
		int var2 = (field_333[this.processedTileX][this.processedTileY] & 2088960) >> 13;
		if (this.field_285 == 10) {
			int var3 = var2;
			int var4 = 0;
			int var6 = field_324.GetAFrames(this.field_285);

			for (int var5 = 0; var3 > 0; var5 = (var5 + 1) % var6) {
				var3 -= field_324.GetAFrameTime(this.field_285, var5);
				var4 = var5;
			}

			this.field_286 = var4;
		} else {
			int var7 = method_204(field_324, this.field_285, var2);
			this.field_286 = var7;
			int var8 = (field_324._anims_af_start[this.field_285] + var7) * 5;
			this.field_288 = field_324._aframes[var8 + 2];
			this.field_289 = field_324._aframes[var8 + 3];
		}

		this.method_156();
	}

	// $FF: renamed from: a (a, int, int) int
	private static int method_204(ASprite var0, int var1, int var2) {
		int var3 = 0;

		for (int var4 = 0; var2 > 0; var3 = var4++) {
			var2 -= var0.GetAFrameTime(var1, var4);
		}

		return var3;
	}

	// $FF: renamed from: b (a, int, int) int
	private static int method_205(ASprite var0, int var1, int var2) {
		int var3 = 0;

		for (int var4 = 0; var4 < var2; ++var4) {
			var3 += var0.GetAFrameTime(var1, var4);
		}

		return var3;
	}

	// $FF: renamed from: aL () void
	private void method_206() {
		int var1 = this.field_279;
		int var2 = this.field_280;
		field_336[var1][var2] = 24;
		int var3 = (field_333[var1][var2] & 7168) >> 10;
		int var4 = field_333[var1][var2] & 15;
		int var5 = 0;
		boolean var6 = (field_332[var1][var2] & 255) == 35;
		if (var4 == 10) {
			var5 = 100;
		} else {
			int var7 = field_320[28].GetAFrames(var4);

			for (int var8 = 0; var8 < var7; ++var8) {
				var5 += field_320[28].GetAFrameTime(var4, var8);
			}
		}

		int var16 = (field_333[var1][var2] & 2088960) >> 13;
		var16++;
		field_333[var1][var2] = field_333[var1][var2] & -2088961 | var16 << 13;
		field_335[var1][var2] = (byte) ((var4 >= 4 && var4 <= 9) ? 12 : 0);

		if (var16 > var5 >> 1) {
			if (!var6) {
				if (this.method_298(var1, var2) && var4 != 10) {
					byte var21;
					switch (var4) {
					case 4:
					case 5:
						var21 = 1;
						break;
					case 6:
						var21 = 2;
						break;
					case 7:
					case 8:
						var21 = 3;
						break;
					case 9:
						var21 = 4;
						break;
					default:
						var21 = field_326[this.field_233 & 7];
					}

					byte var18 = var21;
					this.method_61(1, 48, var18);
				}

				if (this.method_343(var1, var2)) {
					field_334[var1][var2] = -1;
					this.method_335(var1, var2);
					return;
				}
			}

			if (var16 >= var5) {
				method_345(var1, var2);
				int var10 = this.method_324(var1, var2, this.playerXPos, this.playerYPos, true);
				boolean var11 = false;
				switch (var4) {
				case 0:
				case 3:
				case 4:
				case 7:
				case 9:
					var11 = true;
				case 1:
				case 2:
				case 5:
				case 6:
				case 8:
				default:
					boolean var12 = var10 == 4;
					int var9;
					int var13;
					int var14;
					if (var11 != var12) {
						var9 = var12 ? 3 : 2;
						var13 = var1;
						var14 = var2;
					} else {
						var13 = var1 - field_325[var10];
						var14 = var2 - field_325[8 + var10];
						if (var12) {
							if (this.method_298(var13, var14) && var4 != 0) {
								var9 = 0;
								var13 = var1;
								var14 = var2;
							} else {
								switch (var10) {
								case 1:
									var9 = 4;
									break;
								case 2:
								default:
									var9 = 0;
									break;
								case 3:
									var9 = 7;
									break;
								case 4:
									var9 = 9;
								}
							}
						} else {
							if (this.method_298(var13, var14) && var4 != 1) {
								var9 = 1;
								var13 = var1;
								var14 = var2;
							} else {
								switch (var10) {
								case 1:
									var9 = 5;
									break;
								case 2:
									var9 = 6;
									break;
								case 3:
									var9 = 8;
									break;
								default:
									var9 = 1;
								}
							}
						}
					}

					if (field_334[var13][var14] >= 0 || var6) {
						if (var13 != var1 || var14 != var2) {
							var9 = 0;
						}

						var13 = var1;
						var14 = var2;
					}

					field_334[var1][var2] = -1;
					field_335[var13][var14] = 0;
					field_333[var13][var14] = var3 << 10 | var9;
					field_333[var13][var14] &= -2088961;
					field_334[var13][var14] = 45;
				}
			}
		}

		if (var6) {
			if (!this.method_298(var1, var2) || var4 == 10) {
				return;
			}
		} else {
			int var19 = var1;
			int var20 = var2;
			switch (var4) {
			case 0:
			case 1:
			case 2:
			case 3:
			default:
				break;
			case 4:
			case 5:
				var20 = var2 + 1;
				break;
			case 6:
				var19 = var1 - 1;
				break;
			case 7:
			case 8:
				var20 = var2 - 1;
				break;
			case 9:
				var19 = var1 + 1;
				break;
			case 10:
				var19 = -1;
				var20 = -1;
			}

			if (!this.method_298(var19, var20)) {
				return;
			}
		}

		this.method_61(1, 48, field_326[this.field_233 & 7]);
	}

	// $FF: renamed from: aM () void
	private void method_207() {
		byte var1 = -1;
		byte var2 = 3;
		int var3;
		if (((var3 = field_333[this.processedTileX][this.processedTileY]) & 7) == 3) {
			var1 = 1;
			var2 = 0;
		}

		int var4;
		int var5;
		if ((var3 & 8) == 0) {
			var4 = this.field_219;
			var5 = this.field_218;
		} else {
			var4 = this.field_221;
			var5 = this.field_220;
		}

		for (int i = 0; i < var4; i++) {
			field_320[11].PaintFrame(this.field_314, var2 + i * var1, this.field_271 + 3, this.field_272 + var1 * (var5 - i * 24), 0, 0, 0);
		}

		if (var1 == 1) {
			field_320[42].PaintFrame(this.field_314, field_334[this.processedTileX][this.processedTileY - 1] - 80, this.field_271, this.field_272 - 24, 0, 0, 0);
		} else {
			field_320[42].PaintFrame(this.field_314, field_334[this.processedTileX][this.processedTileY + 1] - 80, this.field_271, this.field_272 + 24, 0, 0, 0);
		}
	}

	// $FF: renamed from: aN () void
	private void method_208() {
		ASpriteInstance var1 = field_323[0];
		this.field_314.setColor(0);
		this.field_314.fillRect(0, 0, 240, 320);
		var1._posY = 136;
		int var3 = 0;
		if (frameCounter > 30) {
			var1._posX = 139;
			var1.SetAnim(1);
			int var4 = (frameCounter - 30) * 4;
			if (var4 > 29) {
				var4 = 29;
				if (frameCounter < 42) {
					int var5 = 42 - frameCounter;
					var3 = 0 + var5 * var5 % ((var5 >> 1) + 1);
					var1._sprite.PaintFrame(this.field_314, 10, 138, 136 + var3, 0, 0, 0);
				} else {
					var1._sprite.PaintFrame(this.field_314, 4, 138, 136, 0, 0, 0);
				}

				var1._nCrtAFrame = 0;
			} else {
				var1._sprite.PaintFrame(this.field_314, 10, 138, 136, 0, 0, 0);
			}

			var1._posY = 136 + var4;
		} else {
			var1._posX = frameCounter * 4 - 1 + 18;
		}

		var1._posY += var3;
		var1.PaintSprite(this.field_314);
		var1._sprite.PaintFrame(this.field_314, 5, 138, 160 + var3, 0, 0, 0);
	}

	// $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, javax.microedition.lcdui.Image[], int) void
	private static void method_209(Graphics var0, int var1, int var2, int var3, Image[] var4, int var5) {
		if (var3 == 0) {
			Image var8 = field_320[0]._modules_image[0][0];
			var0.drawImage(var8, var1, var2, 24);
		} else {
			while(var3 > 0) {
				int var6 = var3 % 10;
				var3 /= 10;
				Image var7 = var4[var6 + var5];
				var1 -= var7.getWidth();
				var0.drawImage(var7, var1, var2, 0);
			}

		}
	}

	// $FF: renamed from: b () boolean
	// Returns true if the player's position is within the bounds of the level
	private boolean playerPosInBounds() {
		return this.playerXPos > 0 && this.playerXPos < this.currentLevelWidth - 1 && this.playerYPos > 0 && this.playerYPos < this.currentLevelHeight - 1;
	}

	// $FF: renamed from: n (int) void
	private void method_211(int var1) {
		int var2 = field_323[0]._nCrtAnim;
		if (var2 != 19 && (this.field_233 & 16384) == 0 && (this.field_233 & 2048) == 0) {
			if (this.playerPosInBounds()) {
				int var3 = field_500 == null ? 0 : method_373(field_500[this.playerXPos][this.playerYPos], (byte)0, (byte)3, (byte)4); //TODO VERIFY THIS IN BYTECODE
				if (var3 != 8 && var3 != 7) {
					if (field_334[this.playerXPos][this.playerYPos + 1] < 0 || field_334[this.playerXPos][this.playerYPos + 1] == 14) {
						switch (var1) {
						case 0:
							var1 = 0;
							break;
						case 1:
							var1 = 35;
							break;
						case 2:
							var1 = 2;
							break;
						case 3:
							var1 = 34;
							break;
						case 4:
						case 5:
						case 6:
						case 7:
						case 8:
						case 9:
						case 10:
						case 11:
						case 12:
						case 13:
						case 15:
						case 17:
						case 18:
						case 19:
						case 24:
						case 25:
						case 26:
						case 27:
						case 28:
						case 29:
						case 30:
						case 31:
						case 32:
						case 33:
						case 34:
						case 35:
						case 36:
						case 37:
						case 38:
						case 39:
						case 40:
						case 41:
						case 43:
						default:
							break;
						case 14:
							var1 = 28;
							break;
						case 16:
							var1 = 29;
							break;
						case 20:
							var1 = 30;
							break;
						case 21:
							var1 = 32;
							break;
						case 22:
							var1 = 31;
							break;
						case 23:
							var1 = 33;
							break;
						case 42:
							var1 = 46;
							break;
						case 44:
							var1 = 45;
						}
					}
				} else {
					switch (var1) {
					case 0:
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
					case 6:
					case 7:
					case 8:
					case 9:
					case 11:
					case 24:
					case 25:
					case 26:
					case 27:
						var1 = 36 + (this.field_233 & 7) - 1;
					case 10:
					case 12:
					case 13:
					case 14:
					case 15:
					case 16:
					case 17:
					case 18:
					case 19:
					case 20:
					case 21:
					case 22:
					case 23:
					}
				}
			}

			if (var1 == 1000) {
				field_323[3].SetAnim(0);
				this.field_233 |= 16384;
			} else {
				field_323[0].SetAnim(var1);
			}

			if (var2 != var1) {
				this.field_194 = 70;
			}
		}

	}

	// $FF: renamed from: aO () void
	private void method_212() {
		if (isKeyPressed(SKEY_NUM5|SKEY_CENTER_ALT|SKEY_CENTER|SKEY_LSH)) {
			keysPressed = 0;
			this.field_557 = true;
			this.method_214(this.field_97);
		} else if (isKeyPressed(SKEY_RSH)) {
			keysPressed = 0;
			field_222 = 27;
			this.field_557 = true;
			this.field_110 = true;
			keysPressed = 0;
		} else {
			if (isKeyPressed(SKEY_NUM2|SKEY_UP)) {
				this.method_215(-1);
			} else if (isKeyPressed(SKEY_NUM8|SKEY_DOWN)) {
				this.method_215(1);
			}

			keysPressed = 0;
			if (canBuyItem(this.field_97) == 0) {
				this.field_98 = -1;
				this.field_99 = menuText[81];
			} else {
				this.field_98 = Define.itemPrices[this.field_97];
				this.field_556.delete(0, this.field_556.length());
				this.field_556.append(this.field_98);
				this.field_99 = menuText[90];
			}

			this.field_557 = true;
		}
	}

	// $FF: renamed from: f (int) int
	/**
	 * Returns the outcome of the player trying to purchase an item
	 * @param item Item number
	 * @return 0 if it or a higher tier item was already bought, -1 if the player can't afford it, or 1 if it can be bought
	 */
	private static int canBuyItem(int item) {
		if (field_330[8] >= 4 + item + 1) {
			return 0; //Return if the item or an item better than it was already bought
		} else {
			return getShortFromBytes(field_330, 4) < Define.itemPrices[item] ? -1 : 1;
		}
	}

	// $FF: renamed from: o (int) void
	private void method_214(int var1) {
		this.field_554 = -1;
		switch (canBuyItem(var1)) {
		case -1:
			this.field_99 = menuText[89]; //Display text if player can't afford the item
			return;
		case 0:
			this.field_99 = menuText[81]; //Display text if the player already bought the item
			return;
		case 1:
			this.collectedDiamonds = getShortFromBytes(field_330, 4) - Define.itemPrices[this.field_97];
			this.field_555 = null;
			System.gc();
			this.field_555 = menuText[110] + " " + this.collectedDiamonds + " " + menuText[109];
			field_330[4] = (byte)(this.collectedDiamonds & 255);
			field_330[5] = (byte)(this.collectedDiamonds >> 8 & 255);
			field_330[8] = (byte)(4 + var1 + 1);
			this.method_110();
			this.field_98 = -1;
			this.field_99 = menuText[81];
			this.field_435 = true;
			this.method_437(menuText[91], -1, -1, 5000, 0x41340D, 0);
		default:
		}
	}

	// $FF: renamed from: p (int) void
	private void method_215(int var1) {
		this.field_97 += var1;
		if (this.field_97 < 0) {
			this.field_97 = 3;
		}

		if (this.field_97 == 4) {
			this.field_97 = 0;
		}

	}

	// $FF: renamed from: aP () void
	private void method_216() {
		if (isKeyPressed(SKEY_RSH)) {
			field_222 = 4;
			this.openSubmenu(4);
		}

		keysPressed = 0;
	}

	// $FF: renamed from: aQ () void
	private void method_217() {
		if (keysPressed == 0) {
			this.field_196 = 0;
		} else if (method_439()) {
			this.method_438(true);
			keysPressed = 0;
		} else {
			switch (field_222) {
			case 1:
				if (this.field_122 || this.field_461) {
					keysPressed = 0;
				}

				field_224 = field_222;
				this.method_220();
				this.method_227();
				break;
			case 2:
			case 7:
			case 32:
				this.method_228();
			case 3:
			case 5:
			case 6:
			case 8:
			case 9:
			case 10:
			case 11:
			case 13:
			case 14:
			case 16:
			case 18:
			case 19:
			case 21:
			case 22:
			case 23:
			case 28:
			case 29:
			default:
				break;
			case 4:
				this.method_228();
				break;
			case 12:
				this.method_226();
				break;
			case 15:
				this.method_424();
				break;
			case 17:
			case 20:
				if (isKeyPressed(SKEY_NUM5|SKEY_CENTER_ALT|SKEY_CENTER|SKEY_LSH)) {
					if (this.field_223 == 5) {
						this.method_253();
						this.method_95();
					}

					this.field_225 = true;
					break;
				}
				break;
			case 24:
				this.method_223();
				break;
			case 25:
				this.method_212();
				break;
			case 26:
				this.method_216();
				break;
			case 27:
				field_224 = field_222;
				this.method_220();
				this.method_221();
				break;
			case 30:
				if (isKeyPressed(SKEY_NUM5|SKEY_CENTER)) {
					field_222 = 4;
					if (this.currentMenu == -1) {
						this.field_223 = 0;
						this.openSubmenu(0);
					} else {
						this.field_223 = 2;
					}

					keysPressed = 0;
				}
				break;
			case 31:
				if (isKeyPressed(SKEY_RSH)) {
					this.field_266 = 0;
					this.field_265 = 8;
					field_222 = 9;
					this.openSubmenu(-1);
				} else if (isKeyPressed(SKEY_NUM5|SKEY_CENTER_ALT|SKEY_CENTER|SKEY_LSH)) {
					this.method_218();
				}
				break;
			case 33:
				this.method_219();
				break;
			case 34:
				this.method_225();
				break;
			}


			if (!this.noKeysPressed) {
				if ((this.field_233 & 7) != 0) {
					this.field_94 = 10;
				}

			}
		}
	}

	// $FF: renamed from: aR () void
	private void method_218() {
		this.field_329 = true;
		field_222 = 16;
		this.field_266 = 0;
		this.field_265 = 6;
		this.playerLifeCount = 0;
		this.collectedRedDiamonds = 0;
		this.collectedDiamonds = 0;
		this.field_179 = false;
		this.field_167 = 0;
		field_532 = 0;
	}

	// $FF: renamed from: aS () void
	private void method_219() {
		if (isKeyPressed(SKEY_RSH)) {
			if (this.currentMenu == 0) {
				field_222 = 4;
				this.openSubmenu(0);
				this.field_353.method_58(19);
			}

			if (this.currentMenu == 1) {
				field_222 = 2;
				field_429 = true;
				this.field_170 = true;
				this.openSubmenu(1);
			}
		}

	}

	// $FF: renamed from: aT () void
	private void method_220() {
		if (field_439 < field_440.length && isKeyPressed(field_440[field_439])) {
			keysPressed = 0;
			++field_439;
			if (field_439 == field_440.length) {
				keysPressed = 0;
				field_222 = 24;
				this.field_389 = field_330[8];
				this.field_390 = field_330[9];
				this.field_391 = false;
				this.field_392 = false;
				return;
			}
		} else {
			if (isKeyPressed(field_440[0])) {
				keysPressed = 0;
				field_439 = 1;
			} else {
				field_439 = 0;
			}
		}

	}

	// $FF: renamed from: aU () void
	private void method_221() {
		if (this.field_123 == -1 && this.field_118 == 0) {
			if (isKeyPressed(SKEY_NUM5|SKEY_CENTER_ALT|SKEY_CENTER|SKEY_LSH)) {
				this.field_108 = 4;
			} else {
				if (isKeyPressed(SKEY_RSH)) {
					this.method_95();
					field_222 = 9;
					this.field_265 = 8;
					this.openSubmenu(-1);
					this.field_266 = 0;
				}

				if (isKeyPressed(SKEY_NUM2|SKEY_UP)) {
					this.field_108 = 0;
				} else if (isKeyPressed(SKEY_NUM8|SKEY_DOWN)) {
					this.field_108 = 2;
				} else if (isKeyPressed(SKEY_NUM4|SKEY_LEFT)) {
					this.field_108 = 3;
				} else if (isKeyPressed(SKEY_NUM6|SKEY_RIGHT)){
					this.field_108 = 1;
				}
			}

			keysPressed = 0;
		} else {
			keysPressed = 0;
		}
	}

	// $FF: renamed from: aV () void
	private void method_222() {
		if (this.currentWorld == 0 && this.currentLevel == 13) {
			this.field_354 = null;
			this.playerXPos = 60;
			this.playerYPos = 3;
		} else {
			this.field_551 = isKeyPressed(SKEY_NUM9);
			this.field_309 = !this.field_551;
			this.field_248 = 0;
			this.field_247 = 0;
			this.field_238 = true;
			this.playerXPos = this.currentLevelWidth + 5 + 1;
		}
	}

	// $FF: renamed from: aW () void
	private void method_223() {
		boolean var1 = false;
		if (isKeyPressed(SKEY_POUND)) {
			this.field_436 = !this.field_436;
		} else if (isKeyPressed(SKEY_NUM6)) {
			this.collectedDiamonds += 50;
		} else if (isKeyPressed(SKEY_NUM7)) {
			this.collectedRedDiamonds += 5;
		} else if (isKeyPressed(SKEY_NUM8)) {
			if (field_224 != 1) {
				this.field_390 <<= 1;
				if (this.field_390 == 0) {
					this.field_390 = 1;
				} else if (this.field_390 > 8) {
					this.field_390 = 0;
				}

				if (this.field_390 > 2) {
					field_330[10] = 1;
				} else {
					field_330[10] = 0;
				}
			}
		} else if (isKeyPressed(SKEY_NUM9)) {
			this.field_391 = !this.field_391;
		} else if (isKeyPressed(32768)) {
			field_222 = 34;
		} else if (isKeyPressed(1024)) {
			this.field_392 = !this.field_392;
		} else {
			if (!isKeyPressed(SKEY_RSH)) {
				if (isKeyPressed(SKEY_NUM5|SKEY_CENTER_ALT|SKEY_CENTER|SKEY_LSH)) {
					field_330[8] = (byte)this.field_389;
					field_330[9] = (byte)this.field_390;
					if (this.field_391 || this.field_392) {
						for (int i = 0; i <= 2; i++) {
							int var3 = this.method_122(i);
							if (i == 2) {
								var3++;
							}

							for (int j = 0; j <= var3; j++) {
								this.method_117(i, j, (byte)2);
								this.method_117(i, j, (byte)64);
							}

							this.method_118(i, var3);
						}

						if (this.field_392) {
							for (int i = 0; i <= 2; i++) {
								int var6 = this.method_121(i);
								if (i == 0) {
									var6--;
								}

								for (int j = this.method_122(i); j < var6; j++) {
									this.method_117(i, j, (byte)2);
									this.method_117(i, j, (byte)64);
								}

								this.method_118(i, var6 - 1);
							}
						}
					}

					this.addCollectedDiamonds();
					this.addCollectedRedDiamonds();
					this.method_110();
					var1 = true;
				}
			} else {
				var1 = true;
			}
		}

		if (var1) {
			this.method_224();
		}

		keysPressed = 0;
	}

	// $FF: renamed from: aX () void
	private void method_224() {
		field_222 = field_224;
		if (field_224 == 27) {
			this.field_557 = true;
			this.field_110 = true;
		} else if (field_224 == 1) {
			this.method_96();
		}

		keysPressed = 0;
	}

	// $FF: renamed from: aY () void
	private void method_225() {
		byte var1 = 0;
		int var2 = 0;
		if (isKeyPressed(SKEY_NUM5|SKEY_CENTER_ALT|SKEY_RSH|SKEY_LSH|SKEY_CENTER)) {
			this.method_224();
			method_94(field_321, true);
			field_321 = null;
		}

		if (isKeyPressed(SKEY_NUM2|SKEY_UP)) {
			this.field_437--;
			if (this.field_437 < 0) {
				this.field_437 = 0;
			}
		}

		if (isKeyPressed(SKEY_NUM8|SKEY_DOWN)) {
			this.field_437++;
			if (this.field_437 >= 2) {
				this.field_437 = 1;
			}
		}

		var2 = this.field_438[this.field_437];
		if (isKeyPressed(SKEY_NUM4|SKEY_LEFT)) {
			var2--;
		}

		if (isKeyPressed(SKEY_NUM6|SKEY_RIGHT)) {
			var2++;
		}

		if (var2 < 0) {
			var2 = 0;
		}

		switch (this.field_437) {
		case 0:
			var1 = 115;
			break;
		case 1:
			var1 = 8;
			break;
		default:
			break;
		}

		if (var2 >= var1) {
			var2 = var1 - 1;
		}

		this.field_438[this.field_437] = var2;
		keysPressed = 0;
	}

	// $FF: renamed from: aZ () void
	private void method_226() {
		if (isKeyPressed(SKEY_NUM5|SKEY_CENTER_ALT|SKEY_CENTER|SKEY_LSH)) {
			this.playerLifeCount = 5;
			field_330[3] = (byte)this.playerLifeCount;
			if (this.field_174 == 2) {
				this.method_86();
			} else {
				addShortInRecord(4, -500);
				field_222 = 15;
				this.field_375 = true;
				this.field_373 = true;
				this.method_408();
			}
		}
	}

	// $FF: renamed from: ba () void
	//NOTE: HEAVILY RESTRUCTURED TO BE MORE READABLE, MAY HAVE ERRORS!
	private void method_227() {
		if (this.field_436 && (isKeyPressed(SKEY_NUM9) || isKeyPressed(SKEY_NUM7))) {
			this.method_222();
		}

		if ((this.field_342 == 0 || isKeyPressed(SKEY_NUM5|SKEY_CENTER_ALT|SKEY_CENTER|SKEY_LSH)) && this.field_195 == 0 && !this.field_238 && this.field_239 > 0 && field_323[0]._nCrtAnim != 19 && !this.field_338) {
			if (this.field_354 != null) {
				if (isKeyPressed(SKEY_NUM5|SKEY_CENTER)) {
					this.field_354.method_21();
				} else if (isKeyPressed(SKEY_NUM5|SKEY_CENTER_ALT|SKEY_CENTER|SKEY_LSH)) {
					this.field_354.field_53 = true;
				}

				keysPressed = 0;
			} else {
				if (this.field_234 > 0) {
					boolean var1 = true;
					if (isKeyPressed(SKEY_NUM2|SKEY_UP)) {
						this.field_191 = -5;
					} else if (isKeyPressed(SKEY_NUM8|SKEY_DOWN)) {
						this.field_191 = 5;
					} else if (isKeyPressed(SKEY_NUM4|SKEY_LEFT)) {
						this.field_190 = -5;
					} else if (isKeyPressed(SKEY_NUM6|SKEY_RIGHT)) {
						this.field_190 = 5;
					} else if (!isKeyPressed(SKEY_NUM5|SKEY_CENTER)) {
						if (isKeyPressed(SKEY_NUM5|SKEY_CENTER_ALT|SKEY_CENTER|SKEY_LSH)) {
							this.method_290();
							keysPressed = 0;
						} else {
							var1 = false;
						}
					}

					if (var1) {
						this.field_234--;
						if (this.field_234 == 0) {
							if ((byte)(field_332[this.playerXPos][this.playerYPos] & 255) < 0) {
								field_332[this.playerXPos][this.playerYPos] = 32;
							}

							if (field_334[this.playerXPos][this.playerYPos] == 9) {
								field_334[this.playerXPos][this.playerYPos] = -1;
							}

							this.field_241 = 40L;
							this.field_232 = 0;
							this.field_233 = this.field_233 & -113 | 0;
							this.method_211(this.method_261());
						}

						keysPressed = 0;
						return;
					}
				} else {
					if (isKeyPressed(SKEY_NUM2|SKEY_UP)) {
						this.field_196 = 1;
					} else if (isKeyPressed(SKEY_NUM8|SKEY_DOWN)) {
						this.field_196 = 3;
					} else if (isKeyPressed(SKEY_NUM4|SKEY_LEFT)) {
						this.field_196 = 4;
					} else if (isKeyPressed(SKEY_NUM6|SKEY_RIGHT)) {
						this.field_196 = 2;
					} else if (!isKeyPressed(SKEY_NUM5|SKEY_CENTER)) {
						if (isKeyPressed(SKEY_STAR)) {
							this.field_208 = -1;
							int var22;
							if ((var22 = field_323[0]._nCrtAnim) == 36 + (this.field_233 & 7) - 1) {
								if ((field_332[this.playerXPos][this.playerYPos] & 255) == 4) {
									this.method_347();
								} else {
									this.method_433(2);
									this.method_211(19);
								}
							}

							switch (var22) {
							case 0:
							case 1:
							case 2:
							case 3:
							case 34:
							case 35:
								if ((field_332[this.playerXPos][this.playerYPos] & 255) == 4) {
									this.method_347();
								} else {
									this.method_433(2);
									this.method_211(19);
								}
							}
						} else if (isKeyPressed(SKEY_NUM5|SKEY_CENTER_ALT|SKEY_CENTER|SKEY_LSH)) {
							this.method_290();
							keysPressed = 0;
						}
					} else {
						keysPressed = 0;
						if (this.field_293 == this.playerXPos && this.field_294 == this.playerYPos && (field_332[this.playerXPos][this.playerYPos] & 255) == 4) {
							this.method_433(9);
							this.method_347();
						} else {
							int var21 = field_500 == null ? 0 : method_373(field_500[this.playerXPos][this.playerYPos], (byte)0, (byte)3, (byte)4);;
							if (var21 != 8 && var21 != 7) {
								int var2 = this.field_233 & 7;
								int var3 = -1;
								int var4 = -1;
								boolean var5 = false;
								if (field_330[9] >= 2) {
									int var6 = 0;

									for (int i = 0; i < 2; i++) {
										int var8 = i == 0 ? 1 : -1;
										if (var8 > 0 && this.playerXPos < this.currentLevelWidth - 3 || var8 < 0 && this.playerXPos > 3) {
											for (int j = 1; j <= 3; j++) {
												int var10 = this.playerXPos + var8 * j;
												byte var11 = field_334[var10][this.playerYPos];
												if ((field_332[var10][this.playerYPos] & 255) != 7 || (field_332[var10][this.playerYPos] >> 8 & 240) != 0) {
													if (var11 == 48 && (field_333[var10][this.playerYPos] & 8) != 0) {
														continue;
													}

													switch (var11) {
													case -1:
														continue;
													case 11:
													case 19:
													case 43:
														if (var8 > 0) {
															var6 = var6 | 2;
														} else if (var8 < 0) {
															var6 = var6 | 4;
														}
													case 0:
													case 1:
													case 8:
													case 9:
													case 14:
													case 47:
													case 48:
														if (j == 1) {
															j = 4;
														} else if (var4 >= 0) {
															var5 = true;
															var4 = var6 == 2 ? 2 : (var6 == 4 ? 4 : -1);
															j = 4;
														} else {
															var4 = var8 > 0 ? 2 : 4;
														}
													}
												}

												j = 4;
											}
										}
									}
								}

								if (field_330[9] >= 1) {
									this.field_196 = 5;
									int var23 = 0;
									int[] var24 = new int[]{0, 1, 0, -1, 1, 1, -1, -1, 0, 2, 0, -2};
									int[] var25 = new int[]{-1, 0, 1, 0, -1, 1, 1, -1, -2, 0, 2, 0};
									int[] var13 = new int[]{0, 0, 0, 0, 3, 6, 12, 9, 1, 2, 4, 8};

									for (int i = 0; i < var24.length; i++) {
										int var15 = this.playerXPos + var24[i];
										int var16 = this.playerYPos + var25[i];
										if (var15 >= 0 && var15 < this.currentLevelWidth && var16 >= 0 && var16 < this.currentLevelHeight) {
											int var17 = field_333[var15][var16] & 7;
											boolean var18 = false;
											int var19 = -1;
											boolean var20 = false;
											switch (field_334[var15][var16]) {
											case 9:
											case 18:
											case 30:
												if (var13[i] == 0) {
													var20 = true;
												}
												break;
											case 19:
											case 43:
												if ((field_333[var15][var16] & 248) == 0) {
													var18 = true;
												}
												break;
											case 45:
												if ((field_333[var15][var16] & 15) != 10) {
													var18 = true;
												}

												break;
											case 46:
											case 49:
											case 50:
												if (var13[i] == 0) {
													var23++;
													var20 = true;
												}
											default:
												break;
											}

											if (var18) {
												if (var13[i] == 0) {
													var19 = i + 1;
												} else if (field_335[var15][var16] >= 12) {
													if ((var13[i] & 1) != 0 && var17 == 3) {
														if (var24[i] == 0) {
															var19 = 1;
														} else if (var24[i] < 0) {
															var19 = 4;
														} else if (var24[i] > 0) {
															var19 = 2;
														}
													} else if ((var13[i] & 8) != 0 && var17 == 2) {
														if (var25[i] == 0) {
															var19 = 4;
														} else if (var25[i] < 0) {
															var19 = 1;
														} else if (var25[i] > 0) {
															var19 = 3;
														}
													}
												}

												if (var19 != -1) {
													var20 = true;
													var23++;
												}
											}

											if (var20) {
												if (var23 == 0) {
													if (var2 == i + 1) {
														var3 = var2;
													} else if (var3 < 0) {
														var3 = i + 1;
													}
												} else {
													if (var23 != 1) {
														var3 = var2;
														break;
													}

													var3 = var19;
												}
											}
										}
									}
								}

								int var30;
								if (var3 > 0 && var4 == var2) {
									this.field_196 = 6;
									var30 = this.field_233 & -8;
									this.field_233 = var30 | var2;
								} else if (var3 > 0 && var4 < 0 && !var5) {
									var30 = this.field_233 & -8;
									this.field_233 = var30 | var3;
								} else if (var3 >= 0 || var4 <= 0 || var5) {
									if (var5 && (var2 == 2 || var2 == 4)) {
										this.field_196 = 6;
										var30 = this.field_233 & -8;
										this.field_233 = var30 | var2;
									} else if (var5 && var4 > 0) {
										this.field_196 = 6;
										var30 = this.field_233 & -8;
										this.field_233 = var30 | var4;
									}
								} else {
									this.field_196 = 6;
									var30 = this.field_233 & -8;
									this.field_233 = var30 | var4;
								}

								if (this.field_196 == 6 && (field_332[this.playerXPos][this.playerYPos] & 255) == 2 && field_332[this.playerXPos][this.playerYPos] >> 8 == 1) {
									this.field_208 = -1;
									this.method_287(this.playerXPos, this.playerYPos, (byte)2);
								}
							}
						}
					}

					if (this.field_196 != 5 && this.field_197 == 0 && this.field_94 == 0 && this.field_196 != (this.field_233 & 7)) {
						this.field_233 |= 4096;
					}
				}

			}
		} else {
			keysPressed = 0;
		}
	}

	// $FF: renamed from: bb () void
	private void method_228() {
		if (this.field_425 >= 0 && this.field_425 <= 2) {
			keysPressed = 0;
		} else {
			if (isKeyPressed(SKEY_NUM2|SKEY_UP)) {
				if (System.currentTimeMillis() - this.field_431 < 300L) {
					return;
				}

				this.selectPreviousMenuItem();
				if (this.currentMenu == 0 && this.currentMenuSelection == 1 && !this.field_432) {
					this.selectPreviousMenuItem();
				}
			} else if (isKeyPressed(SKEY_NUM8|SKEY_DOWN)) {
				if (System.currentTimeMillis() - this.field_431 < 300L) {
					return;
				}

				this.selectNextMenuItem();
				if (this.currentMenu == 0 && this.currentMenuSelection == 1 && !this.field_432) {
					this.selectNextMenuItem();
				}
			} else if (isKeyPressed(SKEY_NUM5|SKEY_CENTER_ALT|SKEY_CENTER|SKEY_LSH)) {
				if (this.field_425 < 0 || this.field_425 > 2) {
					this.field_425 = 0;
					this.field_426 = System.currentTimeMillis();
				}
			} else if (isKeyPressed(SKEY_RSH)) {
				this.method_229();
			}

			keysPressed = 0;
		}
	}

	// $FF: renamed from: bc () void
	private void method_229() {
		switch (this.currentMenu) {
		case -1:
			return;
		case 0:
		case 1:
		case 3:
		default:
			break;
		case 2:
			field_222 = 9;
			this.openSubmenu(0);
			this.field_265 = 8;
			this.field_266 = 0;
			return;
		case 4:
			this.openSubmenu(2);
			break;
		case 5:
			field_429 = true;
			field_430 = false;
			if (field_222 == 2) {
				this.openSubmenu(1);
				this.method_96();
				field_430 = true;
			}

			if (field_222 == 4) {
				this.openSubmenu(0);
				this.method_433(19);
				return;
			}
		}

	}

	// $FF: renamed from: f (int, int) void
	private void method_230(int var1, int var2) {
		int[] var3;
		int[] var4;
		boolean var5;
		boolean var6;
		boolean var7;
		var3 = new int[]{0, 1, -1, 0, 0};
		var4 = new int[]{0, 0, 0, 1, -1};
		var5 = false;
		var6 = field_330[9] >= 8;
		var7 = false;
		switch (field_334[var1][var2]) {
		case 0:
			var7 = true;
			break;
		case 9:
			if ((this.field_233 & 8192) == 0) {
				this.field_233 |= 8192;
				var5 = true;
				this.method_231(var1, var2);
			}
			break;
		case 10:
			if (this.field_487 == 3 && field_333[var1][var2] <= 0) {
				var5 = true;
				field_333[var1][var2] = 1;
				this.method_147(var1, var2);
			}
			break;
		case 16:
			var5 = true;
			var7 = true;
			break;
		case 18:
			var5 = this.method_232();
			break;
		case 30:
			var5 = true;
			if (field_333[var1][var2] == 0) {
				this.method_433(11);
				field_333[var1][var2] = 1;
			}
			break;
		default:
			if (field_334[var1][var2] - 80 >= 0 || ((field_332[var1][var2] & 255) == 7 && (field_332[var1][var2] >> 8 & 240) == 0)) {
				var7 = true;
				var5 = true;
			}
		}

		if (var7) {
			vibrate(200);
			this.method_433(6);
			this.method_211(41 + (this.field_233 & 7) - 1);
		}

		if (!var5) {
			for (int i = 0; i < 5; i++) {
				int var10 = var1 + var3[i];
				int var11 = var2 + var4[i];
				if (var10 >= 0 && var10 < this.currentLevelWidth && var11 >= 0 && var11 < this.currentLevelHeight) {
					byte var8 = field_334[var10][var11];
					boolean var12 = false;
					boolean var13 = false;
					switch (var8) {
					case 1:
						if (var10 == this.playerXPos - field_325[this.field_233 & 7] && var11 == this.playerYPos - field_325[(this.field_233 & 7) + 8]) {
							var13 = true;
						}
						break;
					case 19:
					case 43:
					case 45:
					case 46:
					case 49:
						int var14;
						byte var15 = (var14 = field_333[var10][var11] & 7) == 0 ? 0 : field_335[var10][var11];
						boolean var16 = var8 != 49 && var8 != 46;
						if (method_350(var1, var2, 0, 0, var10, var11, var14, var15)) {
							var13 = true;
							var12 = var16;
						}

						if (var13) {
							this.method_433(10);
						}
					}

					if (var6 && var13 && (var10 != this.playerXPos || var11 != this.playerYPos)) {
						if (this.method_240(var10, var11)) {
							this.field_233 |= 8192;
						}
					} else if (var12) {
						this.field_233 |= 8192;
						if (var8 == 45) {
							int var17;
							if ((var17 = (field_333[var10][var11] & 7168) >> 10) == 3) {
								field_334[var10][var11] = -1;
								this.method_335(var10, var11);
							} else {
								var17++;
								field_333[var10][var11] = 10 | var17 << 10;
								field_333[var10][var11] = field_333[var10][var11] & -249 | 120;
								field_335[var10][var11] = 0;
							}
						} else {
							this.method_233(var8, var10, var11);
						}
					}
				}
			}
		}

	}

	// $FF: renamed from: g (int, int) void
	private void method_231(int var1, int var2) {
		if (!method_238(var1, var2)) {
			method_345(var1, var2);
			int var3 = this.method_298(var1, var2 - 1) ? 2 : 1;
			switch ((field_333[var1][var2] & 264241152) >> 22) {
			case 34:
				field_334[var1][var2] = 1;
				this.method_148(var1, var2);
				return;
			case 35:
				field_334[var1][var2] = 45;
				field_333[var1][var2] = field_333[var1][var2] & -16 | 10;
				return;
			case 36:
				field_334[var1][var2] = 46;
				field_333[var1][var2] = 0;
				field_335[var1][var2] = 0;
			case 38:
			default:
				return;
			case 37:
				if ((field_333[var1][var2] & 268435456) != 0) {
					field_334[var1][var2] = 43;
				} else {
					field_334[var1][var2] = 19;
				}

				field_333[var1][var2] = var3;
				this.method_233(19, var1, var2);
				return;
			case 39:
				field_334[var1][var2] = 49;
				field_333[var1][var2] = var3;
			}
		}
	}

	// $FF: renamed from: c () boolean
	private boolean method_232() {
		if (this.field_487 == 3) {
			int var1 = field_332[this.playerXPos][this.playerYPos] & 255;
			if (this.field_311 == 0 && var1 != 15 && var1 != 16) {
				this.method_433(0);
				this.field_311 = (this.field_310 <= 0) ? 1 : -1;
			}

			return true;
		} else {
			return false;
		}
	}

	// $FF: renamed from: c (int, int, int) void
	private void method_233(int var1, int var2, int var3) {
		int var4 = field_333[var2][var3];
		if (var1 == 43 && (var4 & 248) == 0) {
			if ((var4 & 98304) == 0) {
				field_334[var2][var3] = -1;
				this.method_335(var2, var3);
				return;
			}

			int var5 = var4 - 0x8000;
			int var6 = (var5 & -16646145 | var2 << 17) & -2130706433 | var3 << 24;
			var4 = (var6 & 7) != 1 && (var6 & 7) != 3 ? var6 & Integer.MAX_VALUE : var6 | Integer.MIN_VALUE;
		}

		var4 = var4 & -249 | 120;
		field_333[var2][var3] = var4;
	}

	// $FF: renamed from: bd () void
	private void method_234() {
		int var2 = field_332[this.field_279][this.field_280] >> 8;
		var2++;
		if (var2 >= 16) {
			field_332[this.field_279][this.field_280] = -1;
		} else {
			field_336[this.field_279][this.field_280] = 24;
			field_332[this.field_279][this.field_280] = var2 << 8 | 36;
		}

	}

	// $FF: renamed from: h (int, int) void
	private void method_235(int var1, int var2) {
		switch (field_334[var1][var2]) {
		case 0:
			this.method_433(11);
		case 19:
		case 43:
		case 45:
		case 46:
			field_332[var1][var2] = -1;
			this.method_335(var1, var2);
			return;
		case 48:
			field_332[var1][var2] = -1;
			this.method_335(var1, var2);
			int var3 = var2 + 1;
			if (field_334[var1][var3] != 48) {
				var3 = -1;
			}

			field_334[var1][var3] = -1;
			this.method_335(var1, var3);
			int var4 = (field_333[var1][var2] >> 24) * 3;
			field_192[var4 + 2] = -1;
			return;
		default:
			field_332[var1][var2] = -1;
		}
	}

	// $FF: renamed from: be () void
	private void method_236() {
		if (this.field_95) {
			this.field_93--;
		}

		if ((this.field_122 || this.field_461) && frameCounter > 140) {
			if (this.field_461) {
				this.addCollectedDiamonds();
			}

			this.field_122 = false;
			this.field_461 = false;
			this.field_376 = true;
			this.field_266 = 0;
			this.method_65();
			this.field_374 = true;
			field_222 = 28;
		}

		boolean var1 = this.playerPosInBounds();
		if (this.field_474) {
			this.field_474 = false;
			if (this.field_479 < this.field_480) {
				int var2 = method_377((byte)this.field_479, (byte)13, (byte)7);
				int var3 = method_377((byte)this.field_479, (byte)20, (byte)7);
				this.method_400(var2, var3);
				this.field_479++;
			} else {
				this.field_479 = 0;
				this.field_480 = 0;
			}
		}

		if (field_323[4] != null) {
			field_323[4].UpdateSpriteAnim();
		}

		if (this.field_255 > 0) {
			this.field_255--;
		}

		if (this.field_463 > 0) {
			this.field_463--;
			if (this.field_463 == 0) {
				this.field_462 = null;
			}
		}

		if (this.field_162 != this.field_163) {
			for (int i = this.field_162; i != this.field_163; i = i + 1 & 7) {
				field_160[i]++;
				int var14 = field_161[i] < 0 ? method_313(field_320[2], 0) : field_320[9].GetAFrames(field_161[i]);
				if (field_160[i] >= var14) {
					this.field_162++;
					this.field_162 &= 7;
				}
			}
		}

		if (this.field_174 != 0) {
			this.method_266();
			if (field_222 != 1) {
				return;
			}
		}

		if ((frameCounter & 15) == 0) {
			this.method_265();
		}

		if (this.field_311 != 0 && (frameCounter >> 1 & 1) == 0) {
			this.field_310 += this.field_311;
			if (this.field_310 != 0 && this.field_310 != 9) {
				if (this.field_310 == 5) {
					int var12 = this.currentLevelHeight - 1;
					int var16 = this.currentLevelWidth - 1;

					for (int i = 1; i < var12; i++) {
						for (int j = 1; j < var16; j++) {
							int var6 = field_332[j][i] & 255;
							byte var7 = field_334[j][i];
							if (var6 == 15) {
								this.method_235(j, i);
								field_334[j][i] = 34;
							} else if (var6 == 16) {
								this.method_235(j, i);
								field_334[j][i] = 35;
							} else {
								if (var7 == 34) {
									field_332[j][i] = 15;
								} else if (var7 == 35) {
									field_332[j][i] = 16;
								} else {
									continue;
								}

								field_334[j][i] = -1;
								this.method_397(j, i);
							}

							method_345(j, i);
						}
					}
				}
			} else {
				this.field_311 = 0;

				for (int i = 1; i < this.currentLevelHeight - 1; i++) {
					for (int j = 1; j < this.currentLevelWidth - 1; j++) {
						int var4 = field_332[j][i] & 255;
						byte var5 = field_334[j][i];
						if (var4 == 15 || var4 == 16 || var5 == 34 || var5 == 35) {
							this.method_148(j, i);
						}
					}
				}
			}
		}

		this.field_241--;
		if (this.field_240 > 0 && --this.field_240 == 0) {
			this.killPlayer();
		}

		if (this.field_232 <= 0 && this.field_235) {
			this.field_235 = false;
			this.method_433(9);

			try {
				Thread.sleep(100L);
			} catch (InterruptedException var9) {
			}

			this.method_346();
		}

		if (field_320[11] != null) {
			this.method_264();
		}

		if (this.field_254 != 0 && this.field_252 != 0) {
			this.method_263();
		}

		this.method_304();
		if (this.field_193 > 0) {
			this.method_239();
		}

		this.method_381();
		if (this.field_342 != 0) {
			this.method_301();
		}

		if (this.field_354 != null) {
			this.field_194 = 70;
			if (this.field_354.method_29() && this.field_354.method_26() == null) {
				this.field_354 = null;
			}

			if (this.field_354 != null) {
				this.field_354.method_27();
			}
		} else if (this.field_258 != -1) {
			this.method_299(this.field_258);
			this.field_258 = -1;
			this.field_196 = 0;
		}

		if (this.field_234 > 0) {
			if (field_334[this.playerXPos][this.playerYPos] < 0) {
				if (field_334[this.playerXPos][this.playerYPos + 1] == 9 && (field_333[this.playerXPos][this.playerYPos + 1] & 7) == 3) {
					this.playerYPos++;
					this.field_233 = (byte) (this.field_233 & -8) | 3;
				} else if (field_334[this.playerXPos - 1][this.playerYPos + 1] == 9 && (field_333[this.playerXPos - 1][this.playerYPos + 1] & 7) == 3) {
					this.playerYPos++;
					this.playerXPos--;
					this.field_233 = (byte) (this.field_233 & -8) | 3;
				} else if (field_334[this.playerXPos + 1][this.playerYPos + 1] == 9 && (field_333[this.playerXPos + 1][this.playerYPos + 1] & 7) == 3) {
					this.playerYPos++;
					this.playerXPos++;
					this.field_233 = (byte) (this.field_233 & -8) | 3;
				} else {
					this.field_233 = (byte) (this.field_233 & -8) | 0;
				}
			}

			this.field_232 = field_335[this.playerXPos][this.playerYPos];
		} else {
			if ((this.field_197 == 0 || this.field_232 <= 0 && this.field_197 != 5) && !this.field_238 && (this.field_233 & 112) == 0 && this.field_210 == -1) {
				this.field_197 = this.field_196;
				boolean var13 = false;
				if (this.field_195 > 0) {
					this.field_197 = 2;
					this.field_195--;
					if (this.field_195 == 0) {
						this.method_258(this.playerXPos - 1, this.playerYPos);
						this.field_196 = 0;
						keysPressed = 0;
					}
				} else if (var1) {
					method_345(this.playerXPos, this.playerYPos);
				}

				label299:
					switch (this.field_197) {
					case 0:
						this.field_233 &= -9;
						boolean var27 = false;
						switch (field_323[0]._nCrtAnim) {
						default:
							if ((this.field_233 & 16384) == 0) {
								var27 = true;
							}
						case 0:
						case 2:
						case 10:
						case 11:
						case 12:
						case 34:
						case 35:
						case 40:
						case 48:
							if (var27) {
								int var28;
								if ((var28 = 0 + (this.field_233 & 7) - 1) < 0) {
									var28 = 0;
								}

								this.method_211(var28);
							}

							if (this.field_354 == null) {
								this.field_242 = 6;
							} else {
								this.field_242 = 0;
							}

							if (this.field_232 > 0) {
								this.field_232 -= 6;
							}
							break label299;
						}
					case 3:
						this.field_233 &= -9;
					case 1:
					case 2:
					case 4:
						if (field_323[0]._nCrtAnim != 40 && field_323[0]._nCrtAnim != 48) {
							if ((this.field_233 & 4096) == 0) {
								var13 = this.method_288(-field_325[this.field_197], -field_325[this.field_197 + 8], false);
								var1 = this.playerPosInBounds();
								if (var13) {
									this.field_93 = 40;
									this.field_95 = false;
									int var18 = this.field_197 - 1;
									if (var18 < 0) {
										var18 = 0;
									}

									if ((this.field_233 & 8) != 0) {
										if (this.field_197 == 2) {
											this.method_211(8);
										} else {
											this.method_211(9);
										}
									} else {
										this.method_211(4 + var18);
									}
								}
							} else {
								this.field_233 = this.field_233 & -8 | this.field_197;
								this.field_232 = 18;
								int var19 = this.field_197 - 1;
								if (var19 < 0) {
									var19 = 0;
								}

								this.method_211(0 + var19);
							}
						}
						break;
					case 5:
						this.field_232 = 0;
						int var23 = this.field_233 & 7;
						if (this.playerPosInBounds()) {
							this.method_211(13 + var23 - 1);
						}
						break;
					case 6:
						int var17 = (this.field_233 & 7) == 2 ? 1 : -1;
						if (var1 && field_334[this.playerXPos + var17][this.playerYPos] < 0) {
							this.method_211(var17 == -1 ? 22 : 20);
							field_334[this.playerXPos + var17][this.playerYPos] = 32;
							field_335[this.playerXPos + var17][this.playerYPos] = 18;
							field_333[this.playerXPos + var17][this.playerYPos] = 4 | (var17 > 0 ? 1 : 0);
							field_336[this.playerXPos + var17][this.playerYPos] = 30;
							this.field_232 = 72;
							this.field_196 = 0;
						}
					}

				if (var1) {
					byte var20 = field_334[this.playerXPos][this.playerYPos - 1];
					if (!var13 && this.field_197 != 5 && this.field_232 <= 0 && (var20 == 0 || var20 == 9 || var20 == 8 || var20 == 48) && (field_332[this.playerXPos][this.playerYPos] & 255) != 35) {
						int var24 = 0;
						if (field_500 != null) {
							var24 = method_373(field_500[this.playerXPos][this.playerYPos], (byte)0, (byte)3, (byte)4);
						}

						if (!this.field_155 || var24 == 0 && var24 != 3) {
							if ((this.field_233 & 8) == 0 && field_323[0]._nCrtAnim != 11 && field_323[0]._nCrtAnim != 10 && field_323[0]._nCrtAnim != 12) {
								this.method_211(11);
							}

							this.field_95 = true;
							if (this.field_93 <= 0) {
								this.field_93 = 40;
								this.field_241 = 0L;
								this.method_61(field_330[8], 32, 0);
								return;
							}
						}
					}
				}

				if (var13) {
					this.field_259 = false;
				} else if (var1 && (frameCounter & 31) == 0) {
					boolean var21 = field_334[this.playerXPos][this.playerYPos - 1] == 0;

					for (int var25 = 1; !var21 && var25 <= 4; ++var25) {
						var21 |= this.method_288(field_325[var25], field_325[var25 + 8], true);
					}

					if (!var21) {
						if (this.field_259) {
							this.method_211(19);
						} else {
							this.field_259 = true;
						}
					}
				}
			} else {
				if (this.field_238 && this.field_232 <= 0) {
					if (this.field_551) {
						this.field_197 = this.field_307;
					} else {
						this.field_197 = this.field_308;
					}

					this.field_233 = this.field_233 & -8 | this.field_197;
					this.playerXPos += -field_325[this.field_197];
					this.playerYPos += -field_325[this.field_197 + 8];
					var1 = this.playerPosInBounds();
					this.field_232 = 18;
					if (field_323[0]._nCrtAnim != 4) {
						this.method_211(4 + this.field_197 - 1);
					}
				}

				if ((this.field_233 & 112) <= 32 || (this.field_233 & 2048) != 0) {
					this.field_232 -= 6;
					if (this.field_232 <= 0) {
						this.field_233 &= -4209;
						this.field_232 = 0;
					}
				}
			}
		}

		if (this.field_342 == 0) {
			if (this.field_338) {
				this.field_341 = 8;
				if (this.method_300()) {
					this.method_254(this.field_293, this.field_294, 5);
					this.field_338 = false;
				}
			} else if (this.field_354 == null) {
				if (field_467 && this.field_197 != 0) {
					field_467 = false;
					this.field_194 = 0;
				}

				if (!field_467) {
					this.method_285();
				}
			} else {
				this.field_201 = this.field_203;
				this.field_202 = this.field_204;
			}
		}

		if (this.field_197 != 0 && var1) {
			this.field_169 = field_334[this.playerXPos][this.playerYPos + 1] >= 0;
		}

		this.method_260();
		if (this.field_238 && (this.playerXPos < -5 || this.playerXPos > this.currentLevelWidth + 5 || this.playerYPos < -5 || this.playerYPos > this.currentLevelHeight + 5)) {
			this.method_92();
			if (!this.field_551 && this.currentLevel < this.field_515) {
				field_222 = 20;
				this.field_266 = 0;
				this.method_246();
				this.method_131();
				addShortInRecord(6, this.collectedRedDiamonds);
				this.method_108();
			} else {
				this.field_266 = 0;
				this.field_265 = 12;
				field_222 = 35;
			}

			this.method_65();
			this.field_223 = -1;
		}

	}

	// $FF: renamed from: a (int, int, int, int) byte
	private byte method_237(int var1, int var2, int var3, int var4) {
		int var5 = var1 + var2;
		if ((var1 > 0 && var3 == 0 || var1 < var3 && var3 > 0) && (field_334[var5][var4] < 0 || field_334[var5][var4] == 31 || method_241(var5, var4) >= 0)) {
			do {
				var1 = var5;
				var5 += var2;
			} while((var1 > 0 && var3 == 0 || var1 < var3 && var3 > 0) && (field_334[var5][var4] < 0 || method_241(var5, var4) >= 0 || field_334[var5][var4] == 31));
		}

		return (byte)var1;
	}

	// $FF: renamed from: a (int, int) boolean
	private static boolean method_238(int var0, int var1) {
		if (field_192 == null) {
			return false;
		} else {
			for (int var2 = 0; var2 < field_192.length; var2 += 3) {
				if (field_192[var2 + 2] == var1 && (field_192[var2 + 0] - 1 == var0 || field_192[var2 + 1] + 1 == var0)) {
					return true;
				}
			}

			return false;
		}
	}

	// $FF: renamed from: bf () void
	private void method_239() {
		int var1 = this.currentLevelWidth - 1;

		for (int i = 0; i < field_192.length; i += 3) {
			byte var3 = field_192[i + 2];
			if (var3 > 0) {
				byte var4 = field_192[i + 1];
				byte var5 = field_192[i + 0];
				var5 = field_192[i + 0] = this.method_237(var5, -1, 0, var3);
				var4 = field_192[i + 1] = this.method_237(var4, 1, var1, var3);

				for (int j = var5; j <= var4; ++j) {
					this.method_240(j, var3);
				}
			}
		}

	}

	// $FF: renamed from: b (int, int) boolean
	private boolean method_240(int var1, int var2) {
		int var3 = method_241(var1, var2);
		int var4 = 0;
		if (var3 >= 0) {
			if (var3 == 37 && field_334[var1][var2] == 43) {
				var4 = 268435456;
			}

			method_345(var1, var2);
			field_334[var1][var2] = 9;
			field_333[var1][var2] = field_333[var1][var2] & -264241153 | var3 << 22 | var4;
			this.method_254(var1, var2, 1);
		}

		int var5 = (this.field_233 & 16384) == 0 ? 0 : 3;
		ASpriteInstance var6 = field_323[var5];
		if (this.method_298(var1, var2) && this.field_234 <= 0 && var6._nCrtAnim != 40 && var6._nCrtAnim != 48 && var6._nCrtAnim != 47) {
			this.method_61(0, 16, 0);
		}

		return var3 >= 0;
	}

	// $FF: renamed from: d (int, int) int
	private static int method_241(int var0, int var1) {
		if (field_334[var0][var1] < 0) {
			return -1;
		} else {
			switch (field_334[var0][var1]) {
			case 1:
				return 34;
			case 19:
			case 43:
				return 37;
			case 45:
				return 35;
			case 46:
				return 36;
			case 49:
				return 39;
			default:
				return -1;
			}
		}
	}

	// NOTE: REPLACED WITH PROCYON OUTPUT
	// $FF: renamed from: bg () void
	private void method_242() {
		final int am = this.field_223;
		final ASprite a = cGame.field_320[41];
		final Graphics a2;
		(a2 = this.field_314).setColor(2496263);
		a2.fillRect(0, 0, 240, 320);
		switch (am) {
		case 5: {
			if (this.field_248 == 0) {
				if ((this.field_445 & 0x20) != 0x0) {
					a2.drawImage(cGame.field_318[5][0], 200, 237, 0);
					final ASprite a3;
					if (am == 5 && cGame.frameCounter < (a3 = cGame.field_320[9]).GetAFrames(0) * 2) {
						a3.PaintAFrame(a2, 0, cGame.frameCounter * 2, 200, 237, 0, 0, 0);
					}
				}
				a2.drawImage(cGame.field_318[28][0], 180, 254, 0);
			}
		}
		case 4: {
			int n;
			if (am != 4 || (n = -100 + cGame.frameCounter * 10) > 0) {
				n = 0;
			}
			cGame.field_323[0]._sprite.PaintAFrame(a2, 12, 0, 7 + n, 243, 0, 0, 0);
			a.DrawPage(a2, cGame.menuText[44], 120, 243, 17);
			a.DrawPage(a2, String.valueOf(this.field_248), 120, 255, 17);
			if (this.field_247 == 0) {
				if ((this.field_445 & 0x10) != 0x0) {
					a2.drawImage(cGame.field_318[5][0], 200, 179, 0);
					final ASprite a4;
					if (am == 4 && cGame.frameCounter < (a4 = cGame.field_320[9]).GetAFrames(0) * 2) {
						a4.PaintAFrame(a2, 0, cGame.frameCounter >> 1, 200, 179, 0, 0, 0);
					}
				}
				a2.drawImage(cGame.field_318[28][0], 180, 196, 0);
			}
		}
		case 3: {
			int n2;
			if (am != 3 || (n2 = -100 + cGame.frameCounter * 10) > 0) {
				n2 = 0;
			}
			cGame.field_323[0]._sprite.PaintAFrame(a2, 10, 0, 7 + n2, 189, 0, 0, 0);
			a.DrawPage(a2, cGame.menuText[43], 120, 185, 17);
			a.DrawPage(a2, String.valueOf(this.field_247), 120, 197, 17);
			if (this.collectedRedDiamonds == this.levelRedDiamondCount) {
				if ((this.field_445 & 0x8) != 0x0) {
					a2.drawImage(cGame.field_318[5][0], 200, 121, 0);
					final ASprite a5;
					if (am == 3 && cGame.frameCounter < (a5 = cGame.field_320[9]).GetAFrames(0) * 2) {
						a5.PaintAFrame(a2, 0, cGame.frameCounter >> 1, 200, 121, 0, 0, 0);
					}
				}
				a2.drawImage(cGame.field_318[28][0], 180, 138, 0);
			}
		}
		case 2: {
			int n3;
			if (am != 2 || (n3 = -100 + cGame.frameCounter * 10) > 0) {
				n3 = 0;
			}
			cGame.field_320[method_149(3)].PaintFrame(a2, 0, 7 + n3, 127, 0, 0, 0);
			a.DrawPage(a2, cGame.menuText[114], 120, 127, 17);
			a.DrawPage(a2, this.collectedRedDiamonds + "/" + this.levelRedDiamondCount, 120, 139, 17);
			if (this.collectedDiamonds == this.levelDiamondCount) {
				if ((this.field_445 & 0x4) != 0x0) {
					a2.drawImage(cGame.field_318[5][0], 200, 63, 0);
					final ASprite a6;
					if (am == 2 && cGame.frameCounter < (a6 = cGame.field_320[9]).GetAFrames(0) >> 1) {
						a6.PaintAFrame(a2, 0, cGame.frameCounter * 2, 200, 63, 0, 0, 0);
					}
				}
				a2.drawImage(cGame.field_318[28][0], 180, 80, 0);
			}
		}
		case 1: {
			int n4;
			if (am != 1 || (n4 = -100 + cGame.frameCounter * 10) > 0) {
				n4 = 0;
			}
			cGame.field_320[method_149(2)].PaintFrame(a2, 0, 7 + n4, 69, 0, 0, 0);
			a.DrawPage(a2, cGame.menuText[109], 120, 69, 17);
			int az;
			if (am != 1 || (az = cGame.frameCounter >> 1) > this.collectedDiamonds) {
				az = this.collectedDiamonds;
			}
			a.DrawPage(a2, az + "/" + this.levelDiamondCount, 120, 81, 17);
		}
		case 0: {
			int n6 = 0;
			int n5 = 0;
			Label_0963: {
				if (am == 0) {
					n5 = (n6 = -100 + cGame.frameCounter * 10) - 240;
					if (n6 > 0) {
						n6 = 0;
					}
					if (n5 <= 0) {
						break Label_0963;
					}
				}
				else {
					n6 = 0;
				}
				n5 = 0;
			}
			a.DrawString(a2, cGame.menuText[cGame.field_563[this.currentWorld][this.currentLevel]], 120 + n6, 10, 17);
			a.DrawString(a2, cGame.menuText[41], 120 + n5, 25, 17);
			break;
		}
		}
		cGame.field_320[41].DrawString(this.field_314, cGame.menuText[(this.field_223 == 5) ? 98 : 53], 5, 318, 36);
	}

	// $FF: renamed from: a (byte[], int) int
	/**
	 * Returns a short from an array of bytes at a specified index.
	 * @param arr An array of bytes, must have at least 2 elements.
	 * @param index The index of the short in the byte array.
	 * @return A short as an integer from a byte array.
	 */
	public static int getShortFromBytes(byte[] arr, int index) {
		return arr[index] & 255 | (arr[index + 1] & 255) << 8; //Get short from two bytes
	}

	// $FF: renamed from: b (byte[], int) int
	/**
	 * Returns an integer from an array of bytes at a specified index.
	 * @param arr An array of bytes, must have at least 4 elements.
	 * @param index The index of the integer in the byte array.
	 * @return An integer from an index in a byte array.
	 */
	public static int getIntFromBytes(byte[] arr, int index) {
		return arr[index] & 255 | (arr[index + 1] & 255) << 8 | (arr[index + 2] & 255) << 16 | (arr[index + 3] & 255) << 24; //Get int from four bytes
	}

	// $FF: renamed from: e (int, int) int
	/**
	 * Adds to a little-endian short stored in the game's record/save data.
	 * @param index
	 * @param addend Number being added to the short
	 * @return
	 */
	private static int addShortInRecord(int index, int addend) {
		int addedValue;
		if ((addedValue = getShortFromBytes(field_330, index) + addend) < 0) {
			addedValue = 0; //Limit to zero
		}

		field_330[index] = (byte)(addedValue & 255);
		field_330[index + 1] = (byte)(addedValue >> 8 & 255);
		return addedValue;
	}

	// $FF: renamed from: bh () void
	private void method_246() {
		for (int var1 = 0; var1 < this.field_171; ++var1) {
			this.method_127(this.currentWorld, this.currentLevel, field_173[var1 << 1] & 255, field_173[(var1 << 1) + 1] & 255);
		}

	}

	// $FF: renamed from: d () int
	// Adds collected diamonds to save data and returns the amount added
	private int addCollectedDiamonds() {
		return addShortInRecord(4, this.collectedDiamonds);
	}

	// $FF: renamed from: e () int
	// Adds collected red diamonds to save data and returns the amount added
	private int addCollectedRedDiamonds() {
		return addShortInRecord(6, this.collectedRedDiamonds);
	}

	// $FF: renamed from: q (int) void
	private void method_249(int var1) {
		switch (var1) {
		case 0:
			field_441 = 0;
			field_442 = 0;
			field_443 = 0;
			this.field_444 = this.method_116(this.currentWorld, this.currentLevel);
			this.field_445 = 0;
			return;
		case 1:
			field_441 = getShortFromBytes(field_330, 4);
			field_441 += this.collectedDiamonds;
			this.field_225 = false;
			return;
		case 2:
			field_330[4] = (byte)(field_441 & 255);
			field_330[5] = (byte)(field_441 >> 8 & 255);
			return;
		case 3:
			field_442 = getShortFromBytes(field_330, 6);
			field_442 += this.collectedRedDiamonds;
			return;
		case 4:
			field_330[6] = (byte)(field_442 & 255);
			field_330[7] = (byte)(field_442 >> 8 & 255);
			return;
		case 5:
			field_443 = field_330[2];
			this.field_143 = 0;
			if ((field_443 & 8) == 0 && field_442 >= Define.worldPrices[1]) {
				this.field_143 = 1;
				return;
			}

			if ((field_443 & 16) == 0 && field_442 >= Define.worldPrices[2]) {
				this.field_143 = 2;
				return;
			}
			break;
		case 6:
			try {
				field_318[28] = loadSpritesFromFile("/ui.f", 4);
				return;
			} catch (Exception var4) {
				return;
			}
		case 7:
			this.method_117(this.currentWorld, this.currentLevel, (byte)2);
			this.field_144 = 0;
			return;
		case 8:
			int var2;
			int var3;
			for (var3 = var2 = (field_443 & 224) >> 5; var3 < 4 && field_441 >= Define.itemPrices[var3]; ++var3) {
			}

			if (var2 < var3) {
				field_330[2] &= (byte)-225;
				field_330[2] |= (byte)(var3 << 5 & 224);
				this.method_110();
				this.field_144 = var3;
			}
		case 9:
			this.method_246();
			return;
		case 10:
			this.method_65();
			System.gc();
			return;
		case 11:
			if (this.playerLifeCount < 99 && this.collectedDiamonds == this.levelDiamondCount && (this.field_444 & 4) == 0) {
				this.method_117(this.currentWorld, this.currentLevel, (byte)4);
				this.field_445 = (byte)(this.field_445 | 4);
				this.playerLifeCount++;
			}

			if (this.playerLifeCount < 99 && this.collectedRedDiamonds == this.levelRedDiamondCount && (this.field_444 & 8) == 0) {
				this.method_117(this.currentWorld, this.currentLevel, (byte)8);
				this.field_445 = (byte)(this.field_445 | 8);
				this.playerLifeCount++;
			}

			if (this.playerLifeCount < 99 && this.field_247 == 0 && (this.field_444 & 16) == 0) {
				this.method_117(this.currentWorld, this.currentLevel, (byte)16);
				this.field_445 = (byte)(this.field_445 | 16);
				this.playerLifeCount++;
			}

			if (this.playerLifeCount < 99 && this.field_248 == 0 && (this.field_444 & 32) == 0) {
				this.method_117(this.currentWorld, this.currentLevel, (byte)32);
				this.field_445 = (byte)(this.field_445 | 32);
				this.playerLifeCount++;
			}

			this.method_252();
			this.method_108();
			this.field_374 = false;
			this.field_373 = true;
		}

	}

	// $FF: renamed from: bi () void
	private void method_250() {
		switch (this.field_223) {
		case 0:
			if (frameCounter > 40 || this.field_225) {
				++this.field_223;
				this.method_65();
				return;
			}
			break;
		case 1:
			if (frameCounter > this.collectedDiamonds << 1 && frameCounter > 40 || this.field_225) {
				++this.field_223;
				this.method_65();
				return;
			}
			break;
		case 2:
			if (frameCounter > 40 || this.field_225) {
				++this.field_223;
				this.method_65();
				return;
			}
			break;
		case 3:
			if (frameCounter > 10 || this.field_225) {
				++this.field_223;
				this.method_65();
				return;
			}
			break;
		case 4:
			if (frameCounter > 10 || this.field_225) {
				++this.field_223;
				this.method_65();
				this.field_225 = false;
			}
		case 5:
		}

	}

	// $FF: renamed from: a (int) long
	private long method_251(int var1) {
		for (int var2 = 0; var2 < 12; ++var2) {
			for (int var3 = 0; var3 < 12; ++var3) {
				long var4;
				if ((var4 = field_509[var2][var3]) != 0L && method_410(var4, (byte)6, (byte)5) == var1) {
					return var4;
				}
			}
		}

		return -1L;
	}

	// $FF: renamed from: bj () void
	private void method_252() {
		long var1 = this.method_251(this.currentLevel);
		if ((this.currentLevel == 0 || method_410(var1, (byte)11, (byte)3) > 1) && var1 >= 0L && (this.method_116(this.currentWorld, this.currentLevel + 1) & 64) == 0) {
			field_532 = this.currentLevel + 1;
			this.method_117(this.currentWorld, field_532, (byte)64);
			this.field_446 = true;
		} else {
			field_532 = this.currentLevel;
		}
	}

	// $FF: renamed from: bk () void
	private void method_253() {
		this.method_408();
	}

	// $FF: renamed from: d (int, int, int) void
	private void method_254(int var1, int var2, int var3) {
		int var4 = this.field_163 << 1;
		field_159[var4] = (byte)var1;
		field_159[var4 + 1] = (byte)var2;
		field_161[this.field_163] = (byte)var3;
		field_160[this.field_163] = 0;
		this.field_163 = this.field_163 + 1 & 7;
	}

	// $FF: renamed from: bl () void
	// Kills the player and respawns them at the last checkpoint
	private void killPlayer() {
		this.playerLifeCount--;
		this.field_248++;
		if (this.playerLifeCount >= 0) {
			this.method_347();
			this.field_239 = field_330[8];
			this.method_96();
			this.field_233 = 0;
			this.field_234 = 0;
			this.field_196 = this.field_197 = 0;
		} else {
			field_222 = 12;
		}
	}

	// $FF: renamed from: r (int) void
	private void method_256(int var1) {
		if (var1 >= 0) {
			byte var2 = field_447[var1];
			byte var3 = field_448[var1];
			int var4 = field_332[var2][var3] & 255;
			int var5;
			if (((var5 = field_332[var2][var3] >> 8) & 240) == 0) {
				if (var4 != 7 || (var5 & 0xFF00) >> 8 != var1) {
					System.out.println("!!!!!!!!!!!!!! door missing");
				}

				int var6 = var5 & 15;
				--var6;
				if (var6 == 0) {
					var5 = var5 & -241 | 16;
					this.method_297(var2, var3 - 1, 1, 0, 1);
					this.method_297(var2, var3 - 1, -1, 0, 1);
					int var7 = field_332[var2][var3 - 1] >> 8 | 512;
					field_332[var2][var3 - 1] = var7 << 8 | field_332[var2][var3 - 1] & 255;
					field_336[var2][var3] = 24;
				} else {
					var5 = var5 & -16 | var6;
				}

				field_332[var2][var3] = var5 << 8 | var4;
				this.method_433(8);
			}
		}
	}

	// $FF: renamed from: i (int, int) void
	private static void method_257(int var0, int var1) {
		int var2;
		if (((var2 = field_332[var0][var1] >> 8) & 240) == 0) {
			var2 |= 16;
			field_332[var0][var1] = var2 << 8 | 7;
			field_336[var0][var1] = 24;
		}

	}

	// $FF: renamed from: j (int, int) void
	private void method_258(int var1, int var2) {
		int var3 = field_332[var1][var2] >> 8;
		if ((field_332[var1][var2] & 255) == 7) {
			if ((var3 & 240) != 0) {
				if (field_334[var1][var2] != 32) {
					this.method_433(14);
					var3 &= -241;
					field_332[var1][var2] = var3 << 8 | 7;
					this.method_297(var1, var2 - 1, 1, 0, 0);
					this.method_297(var1, var2 - 1, -1, 0, 0);
					if (this.method_298(var1, var2)) {
						this.field_241 = 0L;
						this.field_254 = 0;
						this.method_61(field_330[8], 48, 0);
						this.method_433(2);
					} else {
						switch (field_334[var1][var2]) {
						case 0:
						case 1:
						case 19:
						case 43:
						case 45:
							field_334[var1][var2] = -1;
							this.method_147(var1, var2);
							this.method_335(var1, var2);
						}
					}

					field_336[var1][var2] = 24;
				}
			}
		}
	}

	// $FF: renamed from: s (int) void
	private void method_259(int var1) {
		if (var1 >= 0) {
			this.method_258(field_447[var1], field_448[var1]);
		}
	}

	// $FF: renamed from: bm () void
	private void method_260() {
		int var1 = (this.field_233 & 16384) == 0 ? 0 : 3;
		ASpriteInstance var2 = field_323[var1];
		int var3 = -1;
		boolean var4 = true;
		boolean var5 = false;
		boolean var6;
		if (var6 = var2.IsAnimEnded()) {
			this.field_233 &= -8193;
		}

		label224: {
			int var15;
			if (var1 == 3) {
				if (!var6) {
					break label224;
				}

				this.field_233 &= -18433;
				var15 = this.method_261();
			} else {
				label216: {
					switch (var2._nCrtAnim) {
					case 0:
						var5 = true;
						var15 = 0;
						break label216;
					case 1:
					case 3:
						if (var6) {
							var3 = 0 + (this.field_233 & 7) - 1;
						}

						var5 = true;
						break label224;
					case 2:
						var5 = true;
						var15 = 2;
						break label216;
					case 4:
					case 6:
						if (!this.field_169) {
							break label224;
						}

						var15 = var2._nCrtAnim;
						break label216;
					case 5:
						if (this.field_169) {
							break label224;
						}

						var15 = 24;
						break label216;
					case 7:
						if (this.field_169) {
							break label224;
						}

						var15 = 25;
						break label216;
					case 8:
						if (this.field_169) {
							break label224;
						}

						var15 = 26;
						break label216;
					case 9:
						if (this.field_169) {
							break label224;
						}

						var15 = 27;
						break label216;
					case 10:
						if (!var6) {
							this.field_241 = 40L;
							break label224;
						}

						this.field_233 &= -2049;
						var15 = this.method_261();
						break label216;
					case 11:
						if (field_334[this.playerXPos][this.playerYPos - 1] != -1) {
							if (var6 && field_334[this.playerXPos][this.playerYPos - 1] != -1) {
								this.field_241 = 0L;
								this.method_61(field_330[8], 32, 0);
							}
							break label224;
						}

						var15 = 0;
						break;
					case 12:
						if (this.field_257 < 160) {
							this.field_257 += 12;
						}
						break label224;
					case 13:
					case 14:
					case 15:
					case 16:
					case 28:
					case 29:
						if (!var6) {
							if ((this.field_233 & 8192) == 0 && var2._nCrtAFrame == 2 && var2._nCrtTime == 0) {
								int var11 = this.playerXPos - field_325[this.field_233 & 7];
								int var14 = this.playerYPos - field_325[(this.field_233 & 7) + 8];
								if (field_330[9] >= 8 && var2._nCrtAFrame == 2 && var2._nCrtTime == 0) {
									this.method_254(var11, var14, -1);
								}

								this.method_230(var11, var14);
								this.field_196 = 0;
								keysPressed = 0;
							}
							break label224;
						}

						keysPressed = 0;
						this.field_197 = 0;
						this.field_232 = 0;
						var15 = 0;
						break;
					case 17:
					case 18:
						if (var6) {
							var3 = 0 + (this.field_233 & 7) - 1;
							this.field_232 = 0;
						} else if (var2._nCrtAFrame > 0 && this.field_210 != -1) {
							int var10 = (this.field_233 & 7) == 2 ? this.playerXPos + 1 : this.playerXPos - 1;
							int var12 = field_332[var10][this.playerYPos] >> 8;
							int var9 = field_332[var10][this.playerYPos] & 255;
							var12 |= 256;
							if (var9 == 9) {
								--this.playerGoldKeys;
							} else {
								--this.playerSilverKeys;
							}

							field_332[var10][this.playerYPos] = var12 << 8 | var9;
							this.method_256(var12 & 255);
							this.field_210 = this.field_212 = -1;
						}
						break label224;
					case 19:
						if (var6) {
							var4 = false;
							this.killPlayer();
						}
						break label224;
					case 20:
					case 21:
					case 22:
					case 23:
					case 30:
					case 31:
					case 32:
					case 33:
						if (var6) {
							var4 = false;
							keysPressed = 0;
						}
						break label224;
					case 24:
						if (!this.field_169) {
							break label224;
						}

						var15 = 5;
						break label216;
					case 25:
						if (!this.field_169) {
							break label224;
						}

						var15 = 7;
						break label216;
					case 26:
						if (this.field_169) {
							break label224;
						}

						var15 = 8;
						break label216;
					case 27:
						if (this.field_169) {
							break label224;
						}

						var15 = 9;
						break label216;
					case 34:
						var5 = true;
						var15 = 34;
						break label216;
					case 35:
						var5 = true;
						var15 = 35;
						break label216;
					case 36:
					case 37:
					case 38:
					case 39:
						if (!var6) {
							break label224;
						}

						var15 = 4;
						break;
					case 40:
					case 48:
						this.field_232 = 0;
						this.field_196 = this.field_197 = 0;
						if (var2._nCrtTime == 0) {
							if (var2._nCrtAFrame == (var2._nCrtAnim == 40 ? 12 : 6)) {
								this.method_433(4);
							}

							if (var2._nCrtAFrame == (var2._nCrtAnim == 40 ? 13 : 6)) {
								this.method_321();
							}
						}

						if (var2.IsAnimEnded()) {
							this.field_449 = System.currentTimeMillis();
							var3 = 0 + (this.field_233 & 7) - 1;
							this.field_210 = this.field_211 = this.field_212 = -1;
						}
						break label224;
					case 41:
					case 42:
					case 43:
					case 44:
					case 45:
					case 46:
						if (var6) {
							var3 = 0 + (this.field_233 & 7) - 1;
							this.field_197 = this.field_196 = 0;
							this.field_232 = 0;
							keysPressed = 0;
						}
						break label224;
					case 47:
						this.field_232 = 0;
						this.field_196 = this.field_197 = 0;
						if ((frameCounter & 1) == 0) {
							int var7 = this.playerXPos - 2 + frameCounter % 5;
							int var8 = this.playerYPos - 2 + frameCounter % 3;
							if (var7 == this.playerXPos && (var8 == this.playerYPos || var8 == this.playerYPos - 1)) {
								var7 += (frameCounter >> 1 & 1) == 0 ? 1 : -1;
							}

							this.method_254(var7, var8, frameCounter * 3 % 5);
						}

						if (var6) {
							var3 = 0 + (this.field_233 & 7) - 1;
							this.field_210 = this.field_211 = this.field_212 = -1;
						}
						break label224;
					default:
						var15 = 36;
					}

					var15 = var15 + (this.field_233 & 7) - 1;
				}
			}

			var3 = var15;
		}

		this.field_194 = var5 ? this.field_194 - 1 : 70;
		if (var3 != -1) {
			this.method_211(var3);
		}

		if (var4) {
			var2.UpdateSpriteAnim();
		}

		this.field_94 = this.field_94 > 0 ? --this.field_94 : 0;
	}

	// $FF: renamed from: f () int
	private int method_261() {
		int var1 = 0;
		if (this.field_239 <= 0) {
			this.method_433(2);
			var1 = 12;
			this.field_240 = 80;
		} else {
			var1 = 0 + (this.field_233 & 7) - 1;
			this.field_233 = this.field_233 & -113 | 0;
			this.field_241 = 40L;
		}

		this.field_197 = 0;
		return var1;
	}

	// $FF: renamed from: t (int) void
	/**
	 * Vibrates the device for an amount of milliseconds, if vibration is enabled
	 * @param duration Vibration duration in milliseconds
	 */
	private static void vibrate(int duration) {
		if (vibrationEnabled) {
			field_358.field_576.vibrate(duration);
		}

	}

	// $FF: renamed from: bn () void
	private void method_263() {
		if (this.field_251 <= 0) {
			int var1 = this.field_254 > 0 ? 1 : -1;
			this.field_254 -= var1;
			if (this.field_254 != 0) {
				if (field_334[this.field_252][this.field_253] == 48) {
					int var2 = field_333[this.field_252][this.field_253];
					int var3 = this.field_253 + ((var2 & 8) == 0 ? -1 : 1);
					if (field_334[this.field_252 + var1][var3] >= 0) {
						int var10000 = this.playerXPos;

						while(true) {
							int var4 = var10000 - var1;
							if (field_334[var4][this.playerYPos] != 32) {
								this.field_254 = 0;
								return;
							}

							field_334[var4][this.playerYPos] = -1;
							var10000 = var4;
						}
					}

					field_334[this.field_252 + var1][var3] = field_334[this.field_252][var3];
					field_334[this.field_252][var3] = -1;
					field_333[this.field_252 + var1][var3] = field_333[this.field_252][var3];
					field_335[this.field_252][var3] = this.field_251;
				}

				field_334[this.field_252 + var1][this.field_253] = field_334[this.field_252][this.field_253];
				field_334[this.field_252][this.field_253] = -1;
				this.method_147(this.field_252, this.field_253);
				this.field_252 += var1;
				field_333[this.field_252][this.field_253] = this.field_249 | Integer.MIN_VALUE;
				this.field_251 = 18;
				field_335[this.field_252][this.field_253] = this.field_251;
			} else {
				if (field_334[this.field_252][this.field_253] == 48) {
					int var5 = field_333[this.field_252][this.field_253];
					int var6 = this.field_253 + ((var5 & 8) == 0 ? -1 : 1);
					field_335[this.field_252][var6] = 0;
				} else {
					field_333[this.field_252][this.field_253] = this.field_250;
				}

				field_335[this.field_252][this.field_253] = 0;
				this.field_250 = -1;
				this.method_148(this.field_252, this.field_253);
			}

			method_345(this.field_252 - var1, this.field_253);
		} else {
			this.field_251 = (byte)(this.field_251 - 6);
			field_335[this.field_252][this.field_253] = this.field_251;
			if ((this.field_254 == 1 || this.field_254 == -1) && this.field_251 <= 6 && (this.field_233 & 112) == 0) {
				this.method_211((this.field_233 & 7) == 4 ? 23 : 21);
			}

		}
	}

	// $FF: renamed from: bo () void
	private void method_264() {
		int var1 = frameCounter % 89;
		if (var1 < 15) {
			this.field_218 = 0;
		} else if (var1 < 45) {
			this.field_218 = 48 * (var1 - 15) / 30;
		} else if (var1 < 60) {
			this.field_218 = 48;
		} else {
			this.field_218 = 48 - 48 * (var1 - 60) / 30;
		}

		var1 = frameCounter % 44;
		this.field_219 = this.field_218 > 0 ? (this.field_218 - 1) / 24 + 2 : 1;
		if (var1 < 7) {
			this.field_220 = 0;
		} else if (var1 < 22) {
			this.field_220 = 48 * (var1 - 7) / 15;
		} else if (var1 < 30) {
			this.field_220 = 48;
		} else {
			this.field_220 = 48 - 48 * (var1 - 30) / 15;
		}

		this.field_221 = this.field_220 > 0 ? (this.field_220 - 1) / 24 + 2 : 1;
	}

	// $FF: renamed from: bp () void
	private void method_265() {
		int var1 = field_337[this.field_207 << 1] - this.playerXPos;
		int var2 = field_337[(this.field_207 << 1) + 1] - this.playerYPos;
		if (this.field_174 == 2 && this.field_207 == 2) {
			var1 = 10;
			var2 = -8;
		}

		byte var4;
		if (var2 == 0) {
			if (var1 < 0) {
				var4 = 12;
			} else {
				var4 = 4;
			}
		} else if (var1 == 0) {
			if (var2 < 0) {
				var4 = 0;
			} else {
				var4 = 8;
			}
		} else {
			int var3 = var1 * 128 / var2;
			if (var3 > 0) {
				if (var3 < 128) {
					if (var1 > 0) {
						var4 = 7;
					} else {
						var4 = 15;
					}
				} else if (var3 > 128) {
					if (var1 > 0) {
						var4 = 5;
					} else {
						var4 = 13;
					}
				} else if (var1 > 0) {
					var4 = 6;
				} else {
					var4 = 14;
				}
			} else if (var3 > -128) {
				if (var1 < 0) {
					var4 = 9;
				} else {
					var4 = 1;
				}
			} else if (var3 < -128) {
				if (var1 < 0) {
					var4 = 11;
				} else {
					var4 = 3;
				}
			} else if (var1 < 0) {
				var4 = 10;
			} else {
				var4 = 2;
			}
		}

		this.field_178 = var4;
	}

	// $FF: renamed from: bq () void
	private void method_266() {
		switch (this.field_174) {
		case 1:
			this.method_283();
			return;
		case 2:
			this.method_284();
			this.method_267();
			return;
		case 3:
			this.method_282();
			return;
		case 4:
			this.method_278();
			return;
		case 5:
			this.method_269();
		default:
		}
	}

	// $FF: renamed from: br () void
	private void method_267() {
		if (this.method_298(61, 3) && this.field_232 == 6) {
			this.method_254(this.playerXPos, this.playerYPos, 5);
			this.field_100 = false;
		}

		if (this.field_354 == null && (this.method_298(60, 3) || this.method_298(61, 3))) {
			this.method_106(true);
			this.field_379 = true;
			this.method_407();
			this.method_95();
			this.currentWorld = 0;
			this.currentLevel = 0;
			this.method_86();
		}

		if (this.field_213 == 2) {
			field_332[11][50] = -1;
		}

	}

	// $FF: renamed from: k (int, int) void
	private void method_268(int var1, int var2) {
		for (int var3 = -1; var3 < 2; ++var3) {
			for (int var4 = -1; var4 < 2; ++var4) {
				int var5 = (this.field_201 + var1) / 24 + var4;
				int var6 = (this.field_202 + var2) / 24 + var3;
				if (this.method_298(var5, var6)) {
					this.method_61(1, 48, 0);
				}
			}
		}

	}

	// $FF: renamed from: bs () void
	private void method_269() {
		ASpriteInstance var1 = field_323[5];
		if (this.field_180 == 12) {
			if (this.field_181++ > 100) {
				this.field_180 = 15;
				this.method_335(11, 11);
			} else {
				this.field_353.method_58(7);
			}
		} else {
			if (this.field_180 == -1) {
				if (this.playerXPos * 24 >= 360) {
					this.field_180 = 10;
					var1.SetAnim(10);
					return;
				}

				return;
			}

			if (this.field_180 == 15 || this.field_180 == -1) {
				return;
			}

			int var2 = -1;
			int var3 = this.playerXPos * 24 + 12;
			int var4 = this.playerYPos * 24;
			int var5 = this.field_185 + 24;
			if (this.field_180 == 13) {
				var2 = 13;
				if (var3 > var5) {
					this.field_452 = true;
				}
			}

			int var6 = this.field_182 > 0 && frameCounter % this.field_182 == 0 ? 2 : 1;
			if (this.field_180 == 6 || this.field_180 == 7) {
				var6 = (frameCounter & 11) == 0 ? 2 : var6;
			}

			if (!this.field_450 && (this.field_180 == 0 || this.field_180 == 1)) {
				if (this.field_180 == 0) {
					this.field_451 = 36;
					this.field_451 = ~this.field_451;
					this.field_451++;
				} else {
					this.field_451 = 36;
				}

				if (var4 < 504 && (var3 == var5 + this.field_451 || frameCounter % 76 == 0)) {
					this.field_450 = true;
				}
			}

			while(var6-- > 0) {
				label302: {
					switch (this.field_180) {
					case 0:
						if (var4 >= 504 && var5 > 360) {
							if (var3 < var5) {
								var2 = 6;
								this.field_180 = 6;
							} else {
								--this.field_185;
							}
						} else if (this.field_450) {
							var2 = 2;
							this.field_180 = 2;
						} else if (var5 <= 360) {
							var2 = 1;
							this.field_180 = 1;
						} else {
							--this.field_185;
						}
						break label302;
					case 1:
						if (var4 >= 504 && var5 < 504) {
							if (var3 < var5) {
								++this.field_185;
							} else {
								var2 = 7;
								this.field_180 = 7;
							}
						} else if (this.field_450) {
							var2 = 3;
							this.field_180 = 3;
						} else if (var5 >= 504) {
							var2 = 0;
							this.field_180 = 0;
						} else {
							++this.field_185;
						}
						break label302;
					case 2:
						if (var1._nCrtAFrame == 5 && var1._nCrtTime == 0) {
							this.field_255 = 30;
						}

						if (var1.IsAnimEnded()) {
							var2 = 10;
							this.field_180 = 10;
							this.field_450 = false;
							this.field_451 = 0;
						}

						if (var1._nCrtAFrame < 7 || var4 >= 504 || var3 != var5 + this.field_451) {
							break label302;
						}
						break;
					case 3:
						if (var1._nCrtAFrame == 5 && var1._nCrtTime == 0) {
							this.field_255 = 30;
						}

						if (var1.IsAnimEnded()) {
							var2 = 11;
							this.field_180 = 11;
							this.field_450 = false;
							this.field_451 = 0;
						}

						if (var1._nCrtAFrame < 7 || var4 >= 504 || var3 != var5 + this.field_451) {
							break label302;
						}
						break;
					case 4:
					case 5:
						if (var1.IsAnimEnded()) {
							this.field_180 = var2 = this.field_180 == 4 ? 0 : 1;
						}

						this.field_450 = false;
						this.field_451 = 0;
						break label302;
					case 6:
						if (var4 >= 504) {
							if (var3 >= var5 - 48) {
								var2 = 8;
								this.field_180 = 8;
							} else {
								this.field_185 -= 2;
							}
						} else if (var5 >= 360) {
							var2 = 0;
							this.field_180 = 0;
						}
						break label302;
					case 7:
						if (var4 >= 504) {
							if (var3 <= var5 + 48) {
								var2 = 9;
								this.field_180 = 9;
							} else {
								this.field_185 += 2;
							}
						} else if (var5 <= 504) {
							var2 = 1;
							this.field_180 = 1;
						}
						break label302;
					case 8:
						if (var1.IsAnimEnded()) {
							var2 = 10;
							this.field_180 = 10;
						}

						if (var1._nCrtAFrame < 4 || var4 < 504 || var3 < var5 - 48 || var3 > var5) {
							break label302;
						}
						break;
					case 9:
						if (var1.IsAnimEnded()) {
							var2 = 11;
							this.field_180 = 11;
						}

						if (var1._nCrtAFrame < 4 || var4 < 504 || var3 < var5 || var3 > var5 + 48) {
							break label302;
						}
						break;
					case 10:
					case 11:
						label352: {
							cGame var11;
							byte var13;
							if (var3 > var5 && var5 < 504) {
								var11 = this;
								var13 = 1;
							} else {
								if (var3 >= var5 || var5 <= 360) {
									break label352;
								}

								var11 = this;
								var13 = 0;
							}

							var2 = var13;
							var11.field_180 = var13;
						}

						this.field_450 = false;
						this.field_451 = 0;
					case 12:
					default:
						break label302;
					case 13:
						if (var1.IsAnimEnded()) {
							var2 = 0;
							this.field_180 = 0;
							this.field_452 = false;
						} else if (this.field_452) {
							var1.UpdateSpriteAnim();
						}
						break label302;
					}

					this.method_61(1, 48, 0);
				}

				if (var4 >= 504 && var3 >= var5 - 24 && var3 <= var5 - 24) {
					this.method_61(1, 48, field_326[this.field_233 & 7]);
				}
			}

			if ((this.field_180 == 8 || this.field_180 == 9) && var1._nCrtAFrame == 5) {
				this.method_280();
			}

			if (this.field_180 != 6 && this.field_180 != 7) {
				for (int var7 = 21; var7 < 23; ++var7) {
					for (int var8 = var5 / 24 - 1; var8 < var5 / 24 - 2 + 4; ++var8) {
						if (field_334[var8][var7] == 0) {
							if ((field_333[var8][var7] & 7) == 3 && this.field_180 != 13) {
								label346: {
									--this.field_182;
									cGame var12;
									byte var14;
									switch (this.field_180) {
									case 0:
									case 2:
									case 4:
									case 8:
									case 10:
										var12 = this;
										var14 = 4;
										break;
									case 1:
									case 3:
									case 5:
									case 9:
									case 11:
										var12 = this;
										var14 = 5;
										break;
									case 6:
									case 7:
									default:
										break label346;
									}

									var2 = var14;
									var12.field_180 = var14;
								}
							}

							field_334[var8][var7] = -1;
							this.method_147(var8, var7);
							field_334[var8][var7] = 30;
							field_336[var8][var7] = 24;
							field_333[var8][var7] = 4;
							this.method_433(14);
						}
					}
				}
			}

			if (this.field_182 <= 0) {
				this.field_180 = 12;
				this.field_181 = 0;
				var2 = 12;
			}

			if (var2 != -1) {
				var1.SetAnim(var2);
				return;
			}
		}

		var1.UpdateSpriteAnim();
	}

	// $FF: renamed from: bt () void
	private void method_270() {
		int var1 = this.method_274();
		if (this.playerXPos == var1 || this.playerXPos == var1 + 1) {
			ASpriteInstance var2;
			int var3 = (var2 = field_323[5])._posY + -40;
			int var4 = var2._posY + 256;
			int var5 = (var2._sprite._anims_af_start[var2._nCrtAnim] + var2._nCrtAFrame) * 5;
			var5 = (var2._sprite._aframes[var5 + 3] << 0) * 1 / 1;
			var3 -= var5;
			var4 -= var5;
			int var6;
			if ((var6 = field_323[0]._posY) > var3 && var6 < var4 && !this.field_140) {
				this.method_61(1, 48, this.playerXPos == var1 ? 4 : 2);
			}
		}

	}

	// $FF: renamed from: l (int, int) void
	private static void method_271(int var0, int var1) {
		if (var0 >= 0 && var1 >= 0) {
			field_334[var0][var1] = -1;
			field_334[var0 + 1][var1] = -1;
		}
	}

	// $FF: renamed from: m (int, int) void
	private static void method_272(int var0, int var1) {
		if (var0 >= 0 && var1 >= 0) {
			field_334[var0][var1] = 50;
			field_334[var0 + 1][var1] = 50;
		}
	}

	// $FF: renamed from: c (int, int) boolean
	private boolean method_273(int var1, int var2) {
		boolean var3 = false;

		for (int var4 = var1; var4 <= var1 + 1; ++var4) {
			for (int var5 = var2; var5 >= var2 - 1; --var5) {
				if (field_334[var4][var5] == 0) {
					this.method_235(var4, var5);
					method_345(var4, var5);
					field_334[var4][var5] = -1;
					this.method_147(var4, var5);
					var3 = true;
				}
			}
		}

		return var3;
	}

	// $FF: renamed from: g () int
	private int method_274() {
		int var1 = this.field_183 > 0 ? 1 : 0;
		return 10 + this.field_183 * (2 + var1);
	}

	// $FF: renamed from: h () int
	private int method_275() {
		ASpriteInstance var1;
		int var2 = (var1 = field_323[5])._posY + -40;
		int var3 = (var1._sprite._anims_af_start[var1._nCrtAnim] + var1._nCrtAFrame) * 5;
		var3 = (var1._sprite._aframes[var3 + 3] << 0) * 1 / 1;
		var2 = var2 - var3 + this.field_202;
		return this.currentLevelHeight * var2 / (this.currentLevelHeight * 24);
	}

	// $FF: renamed from: d () boolean
	private boolean method_276() {
		int var1 = this.method_274();
		int var2 = this.method_275();
		boolean var3 = false;

		for (int var4 = var1; var4 <= var1 + 1; ++var4) {
			for (int var5 = var2; var5 <= 10; ++var5) {
				if (field_334[var4][var5] == 0) {
					this.method_235(var4, var5);
					method_345(var4, var5);
					field_334[var4][var5] = -1;
					this.method_147(var4, var5);
					var3 = true;
				}
			}
		}

		return var3;
	}

	// $FF: renamed from: i () int
	private int method_277() {
		int var1;
		int var2 = (var1 = this.playerXPos - 10) / 3;
		if (var1 == var2 * 3 + 2) {
			var2 += frameCounter % 50 / 25;
		}

		return var2;
	}

	// $FF: renamed from: bu () void
	private void method_278() {
		if (this.field_180 == 5) {
			if (this.field_434) {
				return;
			}

			this.field_434 = true;
		}

		ASpriteInstance var1 = field_323[5];
		++this.field_181;
		byte var2 = -1;
		ASpriteInstance var3 = field_323[4];
		byte var4 = -1;
		int var5 = this.method_274();
		if (field_334[this.field_136][2] == -1) {
			field_334[this.field_136][2] = 31;
		}

		if (field_334[this.field_137][2] == -1) {
			field_334[this.field_137][2] = 31;
		}

		switch (this.field_180) {
		case 0:
			if (this.playerXPos >= 10) {
				this.field_180 = 6;
				this.field_181 = 0;
			}
			break;
		case 1:
			boolean var14 = false;
			if (this.field_181 > 40) {
				this.field_180 = 2;
				this.field_181 = 0;
			} else if (this.field_181 > 20) {
				this.method_273(var5, 8);
				method_272(var5, 8);
				this.field_133 = var5;
				this.field_134 = 8;
			}
			break;
		case 2:
			boolean var13 = false;
			if (this.method_273(var5, 8)) {
				--this.field_182;
				this.field_139 = this.field_180;
				method_271(this.field_133, this.field_134);
				this.field_133 = -1;
				this.field_134 = -1;
				this.field_139 = this.field_180;
				this.field_180 = 3;
				var2 = 3;
				this.method_433(10);
			}

			if (this.field_181 > 15 && var1._nCrtAnim != 6) {
				var2 = 6;
			}

			if (this.field_181 > 30) {
				this.field_180 = 4;
				this.field_181 = 0;
				var2 = 0;
				method_271(this.field_133, this.field_134);
				this.field_133 = -1;
				this.field_134 = -1;
			}
			break;
		case 3:
			boolean var12 = false;
			if (this.field_181 > 40) {
				if (this.field_182 > 0) {
					if (this.field_139 == 10) {
						this.field_180 = 9;
						this.field_181 = 0;
					} else if (this.field_139 == 2 || this.field_139 == 1) {
						this.field_180 = 4;
						this.field_181 = 0;
						var2 = 2;
					}
				} else {
					this.field_180 = 7;
					this.field_181 = 0;
				}
			}
			break;
		case 4:
			label109: {
				int var7 = this.field_182 <= 1 ? 5 : 10;
				byte var10000;
				if (this.field_181 >= var7) {
					this.field_180 = 5;
					this.field_181 = 0;
					var10000 = 4;
				} else {
					if (this.field_181 <= var7 >> 1 || var1._nCrtAnim == 1) {
						break label109;
					}

					var10000 = 1;
				}

				var2 = var10000;
			}

			this.method_276();
			this.method_270();
			break;
		case 5:
			int var8 = var1._posY + -40;
			int var9 = (var1._sprite._anims_af_start[var1._nCrtAnim] + var1._nCrtAFrame) * 5;
			var9 = (var1._sprite._aframes[var9 + 3] << 0) * 1 / 1;
			if (var8 - var9 <= 72 - this.field_202 + 40) {
				this.field_142 = 0;
				this.method_280();
				this.field_180 = 10;
				this.field_133 = var5;
				this.field_134 = 4;
				method_272(this.field_133, this.field_134);
			}

			this.method_276();
			this.method_270();
			break;
		case 6:
			if (this.field_181 > 10) {
				this.field_180 = 1;
				var2 = 2;
				this.field_181 = 0;
			}
			break;
		case 7:
			method_271(this.field_133, this.field_134);
			this.field_133 = -1;
			this.field_134 = -1;
			if (this.field_181 > 80) {
				this.field_180 = 8;
				this.method_327();
			}

			if ((this.field_181 & 111) == 1) {
				this.method_433(7);
			}
		case 8:
		default:
			break;
		case 9:
			this.field_181 -= 2;
			this.method_270();
			int var10 = var1._posY + -40;
			int var11 = (var1._sprite._anims_af_start[var1._nCrtAnim] + var1._nCrtAFrame) * 5;
			var11 = (var1._sprite._aframes[var11 + 3] << 0) * 1 / 1;
			if (var10 - var11 >= 240 - this.field_202 + 40) {
				this.field_180 = 6;
				this.field_181 = 0;
				this.field_183 = this.method_277();
			}
			break;
		case 10:
			--this.field_181;
			this.method_270();
			++this.field_132;
			if (this.field_132 == 28) {
				var2 = 7;
			}

			if (this.field_132 >= 50) {
				this.field_132 = 0;
				this.field_180 = 11;
				method_271(this.field_133, this.field_134);
				this.field_133 = -1;
				this.field_134 = -1;
				var2 = 8;
				var4 = 2;
				this.field_141 = true;
			}
			break;
		case 11:
			--this.field_181;
			++this.field_132;
			if (this.field_132 >= 12) {
				this.field_132 = 0;
				this.field_180 = 9;
				var2 = 4;
				this.field_140 = false;
				this.field_141 = false;
			} else if (!this.field_140) {
				this.method_279();
			}
		}

		if (var2 == -1) {
			var1.UpdateSpriteAnim();
		} else {
			var1.SetAnim(var2);
		}

		if (this.field_141) {
			if (var4 == -1) {
				var3.UpdateSpriteAnim();
				return;
			}

			var3.SetAnim(var4);
		}

	}

	// $FF: renamed from: bv () void
	private void method_279() {
		int var1 = this.method_274();
		if (this.playerYPos == 4 && this.playerXPos >= var1 - 3 && this.playerXPos <= var1 + 4) {
			this.method_61(1, 64, this.playerXPos == var1 ? 4 : 2);
			this.field_140 = true;
		}

	}

	// $FF: renamed from: bw () void
	private void method_280() {
		this.field_255 = 30;
		if (field_334[this.field_136][this.field_138] == -1) {
			field_334[this.field_136][this.field_135] = 0;
			method_345(this.field_136, this.field_135);
		}

		if (field_334[this.field_137][this.field_138] == -1) {
			field_334[this.field_137][this.field_135] = 0;
			method_345(this.field_137, this.field_135);
		}

	}

	// $FF: renamed from: bx () void
	private void method_281() {
		this.field_180 = -1;
		this.field_182 = 5;
	}

	// $FF: renamed from: by () void
	private void method_282() {
		ASpriteInstance var1 = field_323[5];
		int var2 = this.field_279;
		int var3 = this.field_280;
		int var4 = this.playerXPos - 8;
		int var5 = this.playerXPos + 8;
		int var6 = this.playerYPos + 8;
		int var7 = this.playerYPos - 8;

		for (int var8 = 15; var8 <= 22; ++var8) {
			for (int var9 = 14; var9 <= 21; ++var9) {
				if ((var9 <= var4 || var9 >= var5 || var8 <= var6 || var8 >= var7) && field_334[var9][var8] == 44) {
					this.field_279 = var9;
					this.field_280 = var8;
					this.method_314();
				}
			}
		}

		this.field_279 = var2;
		this.field_280 = var3;
		if (this.field_239 == 0) {
			this.method_281();
		}

		if (this.field_180 == 12) {
			if (this.field_181++ > 100) {
				this.field_180 = 15;
				this.method_335(11, 11);
			} else {
				this.field_353.method_58(7);
			}
		} else {
			if (this.field_180 == -1) {
				if (this.playerXPos * 24 >= 336) {
					this.field_180 = 0;
					var1.SetAnim(0);
					return;
				}

				return;
			}

			if (this.field_180 == 15 || this.field_180 == -1) {
				return;
			}

			byte var17 = -1;
			int var18 = this.playerXPos * 24 + 12;
			int var10 = this.playerYPos * 24;
			int var11 = this.field_184 + 24;
			if (this.field_453 == 0L && this.field_239 != 0) {
				this.field_453 = (long)(frameCounter + Utils.method_36(340, 441));
			}

			int var12 = this.field_182 > 0 && frameCounter % this.field_182 == 0 ? 2 : 1;
			if (this.field_180 == 10 || this.field_180 == 11) {
				var12 = (frameCounter & 11) == 0 ? 2 : var12;
			}

			while(var12-- > 0) {
				switch (this.field_180) {
				case 0:
					if (var11 > 360) {
						var17 = 4;
						this.field_180 = 4;
					} else {
						var17 = 5;
						this.field_180 = 5;
					}
					break;
				case 1:
					if (var11 < 504) {
						var17 = 5;
						this.field_180 = 5;
					} else {
						var17 = 4;
						this.field_180 = 4;
					}
					break;
				case 2:
					if (var1.IsAnimEnded()) {
						if ((long)frameCounter > this.field_453) {
							var17 = 13;
							this.field_180 = 13;
						} else {
							var17 = 4;
							this.field_180 = 4;
						}
					}
					break;
				case 3:
					if (var1.IsAnimEnded()) {
						if ((long)frameCounter > this.field_453) {
							var17 = 14;
							this.field_180 = 14;
						} else {
							var17 = 5;
							this.field_180 = 5;
						}
					}
					break;
				case 4:
					if ((long)frameCounter > this.field_453) {
						var17 = 13;
						this.field_180 = 13;
					} else {
						if (var10 >= 504 && var18 < var11 && this.field_184 - 48 >= 360) {
							var17 = 10;
							this.field_180 = 10;
						}

						if (var11 <= 360) {
							var17 = 5;
							this.field_180 = 5;
						}

						if (this.field_180 == 4) {
							--this.field_184;
						}
					}
					break;
				case 5:
					if ((long)frameCounter > this.field_453) {
						var17 = 14;
						this.field_180 = 14;
					} else {
						if (var10 >= 504 && var18 > var11 && this.field_184 + 48 <= 504) {
							var17 = 11;
							this.field_180 = 11;
						}

						if (var11 >= 504) {
							var17 = 4;
							this.field_180 = 4;
						}

						if (this.field_180 == 5) {
							++this.field_184;
						}
					}
					break;
				case 6:
				case 7:
				case 13:
				case 14:
					byte var14;
					byte var15;
					byte var16;
					label274: {
						var14 = 0;
						var15 = 0;
						var16 = 0;
						byte var21;
						switch (this.field_180) {
						case 6:
						case 13:
							var14 = 4;
							var15 = 2;
							var21 = 1;
							break;
						case 7:
						case 14:
							var14 = 5;
							var15 = 1;
							var21 = 2;
							break;
						case 8:
						case 9:
						case 10:
						case 11:
						case 12:
						default:
							break label274;
						}

						var16 = var21;
					}

					if (var1._nCrtAFrame == 5 && var1._nCrtTime == 0) {
						if (this.field_180 != 13 && this.field_180 != 14) {
							this.field_255 = 10;
						} else {
							this.field_255 = 80;
						}
					}

					if (var1.IsAnimEnded()) {
						if (this.field_180 == 13 || this.field_180 == 14) {
							this.field_454 = (long)(frameCounter + 40);
							this.field_453 = (long)(frameCounter + Utils.method_36(340, 441));
						}

						var17 = var14;
						this.field_180 = var14;
					}

					if (var1._nCrtAFrame >= 5 && var10 >= 504 && var18 >= var11 - var15 * 24 && var18 <= var11 + var16 * 24) {
						this.method_61(1, 48, 4);
					}
				case 8:
				case 9:
				case 12:
				default:
					break;
				case 10:
					if (var1.IsAnimEnded()) {
						this.field_255 = 10;
						var11 = this.field_184 + 24;
						if ((long)frameCounter > this.field_453) {
							var17 = 13;
							this.field_180 = 13;
						} else if (var10 >= 504) {
							if (var18 >= var11 - 48) {
								var17 = 6;
								this.field_180 = 6;
							}
						} else {
							var17 = 4;
							this.field_180 = 4;
						}
					} else {
						this.field_184 -= 2;
					}
					break;
				case 11:
					if (var1.IsAnimEnded()) {
						this.field_255 = 10;
						var11 = this.field_184 + 24;
						if ((long)frameCounter > this.field_453) {
							var17 = 14;
							this.field_180 = 14;
						} else if (var10 >= 504) {
							if (var18 <= var11 + 48) {
								var17 = 7;
								this.field_180 = 7;
							}
						} else {
							var17 = 5;
							this.field_180 = 5;
						}
					} else {
						this.field_184 += 2;
					}
				}

				if (var10 >= 504 && var18 >= var11 - 24 && var18 <= var11 + 24) {
					this.method_61(1, 48, field_326[this.field_233 & 7]);
				}

				if (this.field_182 <= 0) {
					this.field_180 = 12;
					this.field_181 = 0;
					return;
				}
			}

			if (this.field_310 == 5) {
				label335: {
					int[] var23;
					byte var25;
					if (this.field_311 <= 0) {
						if (this.field_182 <= 2) {
							field_334[10][16] = 45;
							field_336[10][16] = 24;
							field_335[10][16] = 0;
							field_333[10][16] = 0;
						}

						field_334[26][19] = 45;
						field_336[26][19] = 24;
						field_335[26][19] = 0;
						var23 = field_333[26];
						var25 = 19;
					} else {
						field_334[10][19] = 45;
						field_336[10][19] = 24;
						field_335[10][19] = 0;
						field_333[10][19] = 0;
						if (this.field_182 > 2) {
							break label335;
						}

						field_334[26][16] = 45;
						field_336[26][16] = 24;
						field_335[26][16] = 0;
						var23 = field_333[26];
						var25 = 16;
					}

					var23[var25] = 0;
				}
			}

			if (this.field_180 != 10 && this.field_180 != 11) {
				for (int var13 = 21; var13 < 23; ++var13) {
					for (int var19 = var11 / 24 - 1; var19 < var11 / 24 - 2 + 4; ++var19) {
						if (field_334[var19][var13] == 9) {
							if ((field_333[var19][var13] & 7) == 3) {
								label338: {
									--this.field_182;
									cGame var24;
									byte var26;
									switch (this.field_180) {
									case 0:
									case 2:
									case 4:
									case 6:
										var24 = this;
										var26 = 2;
										break;
									case 1:
									case 3:
									case 5:
									case 7:
										var24 = this;
										var26 = 3;
										break;
									default:
										break label338;
									}

									var17 = var26;
									var24.field_180 = var26;
								}
							}

							field_334[var19][var13] = -1;
							this.method_147(var19, var13);
							field_334[var19][var13] = 30;
							field_336[var19][var13] = 24;
							field_333[var19][var13] = 4;
							this.method_433(14);
						}
					}
				}
			}

			if (var17 != -1) {
				var1.SetAnim(var17);
				return;
			}
		}

		var1.UpdateSpriteAnim();
	}

	// $FF: renamed from: bz () void
	private void method_283() {
		if (field_334[18][63] == 0 && field_335[18][63] <= 0 && this.field_177 == 0) {
			this.field_255 = 120;
			++this.field_177;
		}

		label60: {
			ASpriteInstance var10000;
			byte var10001;
			if (this.field_177 == 3) {
				if (field_323[2]._nCrtAnim != 0) {
					if (field_323[2]._nCrtAnim == 1 && field_323[2].IsAnimEnded()) {
						field_323[2].SetAnim(2);
						if (this.playerYPos == this.currentLevelHeight - 4) {
							this.field_176 = 817;
						}
					}
					break label60;
				}

				var10000 = field_323[2];
				var10001 = 1;
			} else {
				if (field_323[2]._nCrtAnim == 0) {
					break label60;
				}

				var10000 = field_323[2];
				var10001 = 0;
			}

			var10000.SetAnim(var10001);
		}

		field_323[2].UpdateSpriteAnim();
		if (field_323[2]._nCrtAnim == 2) {
			field_323[1].UpdateSpriteAnim();
			if (this.field_255 == 10) {
				this.field_255 = 60;
			}

			if (field_323[1]._nCrtAnim == 0) {
				if ((this.field_354 == null || this.field_176 < 46) && this.field_176 < 1704) {
					++this.field_176;
					int var1 = this.currentLevelHeight * 24 - (this.field_202 + 320 - 80);
					if (this.field_176 < var1) {
						this.field_176 = var1;
					}
				}

				if (this.currentLevelHeight * 24 - this.field_176 <= this.playerYPos * 24 + 18 && this.playerXPos < 17) {
					this.method_61(field_330[8], 64, 1);
					return;
				}
			} else if (field_323[1].IsAnimEnded()) {
				field_323[1].SetAnim(0);
			}
		}

	}

	// $FF: renamed from: bA () void
	private void method_284() {
		if (field_332 != null && this.playerPosInBounds() && (field_332[this.playerXPos][this.playerYPos] & 255) == 0) {
			int var1;
			if ((var1 = field_332[this.playerXPos][this.playerYPos] >> 8) == 13) {
				this.field_186 = true;
			} else if (var1 == 16) {
				this.field_187 = true;
			}
		}

		if (!this.field_188 && this.field_232 <= 0 && this.method_298(46, 7)) {
			this.field_189 = true;
			this.field_188 = true;
		}

	}

	// $FF: renamed from: c () void
	public final void method_285() {
		byte var1;
		int var4;
		int var5;
		label58: {
			var1 = (this.field_233 & 4096) == 0 ? this.field_197 : 0;
			int var2 = this.playerXPos * 24 + this.field_232 * field_325[var1];
			var4 = 24 * this.currentLevelWidth - 240;
			var5 = 24 * this.currentLevelHeight - 240;
			cGame var10000;
			int var10001;
			if (var2 < this.field_203 + 96) {
				this.field_203 = this.field_203 - 96 + var2 >> 1;
				if (this.field_203 >= 0) {
					break label58;
				}

				var10000 = this;
				var10001 = 0;
			} else {
				if (var2 <= this.field_203 + 120) {
					break label58;
				}

				this.field_203 = this.field_203 - 120 + var2 >> 1;
				if (this.field_203 <= var4) {
					break label58;
				}

				var10000 = this;
				var10001 = var4;
			}

			var10000.field_203 = var10001;
		}

		int var6;
		if ((var6 = this.playerYPos * 24 + this.field_232 * field_325[var1 + 8] + 40) < this.field_204 + 96) {
			this.field_204 = this.field_204 - 96 + var6 >> 1;
			if (this.field_204 < 0) {
				this.field_204 = 0;
			}
		}

		if (var6 > this.field_204 + 160) {
			this.field_204 = this.field_204 - 160 + var6 >> 1;
			if (this.field_204 > var5) {
				this.field_204 = var5;
			}
		}

		label45: {
			this.field_201 = this.field_203;
			this.field_202 = this.field_204;
			cGame var7;
			int var9;
			if (this.field_201 < 0) {
				var7 = this;
				var9 = 0;
			} else {
				if (this.field_201 <= var4) {
					break label45;
				}

				var7 = this;
				var9 = var4;
			}

			var7.field_201 = var9;
		}

		if (this.field_202 < 0) {
			this.field_202 = 0;
			this.field_202 = 0;
		} else if (this.field_202 > var5) {
			this.field_202 = var5;
			this.field_204 = var5;
		}
	}

	// $FF: renamed from: a (int, int, boolean, byte) void
	private void method_286(int var1, int var2, boolean var3, byte var4) {
		int var5 = var3 ? var1 + 1 : var1 - 1;
		int var6 = field_333[var1][var2];
		field_334[var5][var2] = var4;
		field_334[var1][var2] = -1;
		field_335[var5][var2] = 18;
		int var10000;
		short var10001;
		if (var3) {
			var10000 = (var6 & -8 | 2) & -3073;
			var10001 = 1024;
		} else {
			var10000 = (var6 & -8 | 4) & -3073;
			var10001 = 2048;
		}

		var6 = var10000 | var10001;
		field_333[var5][var2] = var6 & -513 | Integer.MIN_VALUE;
		method_345(var5, var2);
		this.method_147(var1, var2);
	}

	// $FF: renamed from: b (int, int, byte) void
	private void method_287(int var1, int var2, byte var3) {
		if ((field_332[var1][var2] & 255) == var3) {
			field_332[var1][var2] = -1;
			this.method_287(var1 - 1, var2, var3);
			this.method_287(var1 + 1, var2, var3);
			this.method_287(var1, var2 - 1, var3);
			this.method_287(var1, var2 + 1, var3);
		}

	}

	// $FF: renamed from: a (int, int, boolean) boolean
	private boolean method_288(int var1, int var2, boolean var3) {
		int var4 = 0; //NOTE: MODIFY TO MATCH PROCYON OUTPUT
		int var5 = this.field_233;
		int var6 = this.playerXPos;
		int var7 = this.playerYPos;
		byte var8 = this.field_197;
		boolean var9 = this.field_238;
		int var10 = this.field_242;
		int var11 = this.field_232;
		int var12 = this.field_240;
		int var10000;
		byte var10001;
		if (var1 > 0) {
			var10000 = var5 & -8;
			var10001 = 2;
		} else if (var1 < 0) {
			var10000 = var5 & -8;
			var10001 = 4;
		} else if (var2 < 0) {
			var10000 = var5 & -8;
			var10001 = 1;
		} else {
			var10000 = var5 & -8;
			var10001 = 3;
		}

		var5 = var10000 | var10001;
		int var13 = var6 + var1;
		int var14 = var7 + var2;
		boolean var15 = false;
		boolean var16 = false;
		if (var13 >= 0 && var13 < this.currentLevelWidth && var14 >= 0 && var14 < this.currentLevelHeight) {
			if (field_500 != null && field_500[var13][var14] != 0 && field_330[10] == 0) {
				var15 = false;
				var4 = 1; //NOTE: MODIFIED TO MATCH PROCYON OUTPUT
			}

			label328: {
				switch ((byte)(field_332[var13][var14] & 255)) {
				case 1:
					if (!var3) {
						this.field_255 = 120;
						++this.field_177;
						this.method_287(var13, var14, (byte)1);
					}
					break label328;
				case 2:
					if (var3) {
						break label328; //FIXME: COULD PROBABLY BE RESTRUCTURED NICER, SEE PROCYON OUTPUT
					}

					cGame var38; //NOTE: ADDED AS DIRTY FIX FROM PROCYON OUTPUT
					label322: {
						cGame var37;
						label321: {
							var16 = true;
							switch (field_332[var13][var14] >> 8) {
							case 0:
								if (field_330[9] >= 1) {
									this.field_208 = 7;
									var38 = this;
									var10001 = 0;
									break label322;
								}

								var37 = this;
								break;
							case 1:
								if (field_330[9] >= 2) {
									var37 = this;
									var10001 = 7;
									break label321;
								}

								var37 = this;
								break;
							default:
								break label328;
							}

							var10001 = 13;
						}

						var37.field_208 = var10001;
						var38 = this;
						var10001 = 1;
					}

					var38.field_209 = var10001;
					break label328;
				case 3:
					if (field_332[var13][var14] >> 8 < 3) {
						var15 = true;
						break label328;
					}

					var15 = false;
					var10000 = 1;
					break;
				case 4:
					int var18;
					if (!var3 && (var18 = (field_332[var13][var14] & -256) >> 8) >= this.field_207) {
						this.field_235 = true;
						this.field_207 = var18 + 1;
						this.field_175 = frameCounter + 13;
					}
					break label328;
				case 5:
					var15 = true;
					if (!var3) {
						var9 = true;
						this.field_551 = true;
					}
				case 6:
				case 8:
				case 9:
				case 10:
				case 11:
				case 12:
				case 13:
				case 14:
				case 15:
				case 16:
				case 17:
				case 18:
				case 20:
				case 21:
				case 22:
				case 23:
				case 24:
				case 25:
				case 26:
				case 27:
				default:
					break label328;
				case 7:
					if ((field_332[var13][var14] >> 8 & 240) >> 4 >= 2) {
						break label328;
					}

					var10000 = 1;
					break;
				case 19:
					if (var3) {
						break label328;
					}

					int var19 = var13 + 3;

					int var20;
					for (var20 = var14; field_334[var19][var20] != 39; --var20) {
					}

					if (!this.field_155) {
						this.method_371();
					}

					this.field_155 = true;
					this.field_474 = false;
					if (field_500 == null) {
						field_500 = new int[this.currentLevelWidth][this.currentLevelHeight];
					}

					this.method_372((byte)field_333[var19][var20], (byte)var19, (byte)var20, (byte)0);
					this.method_400(var19, var20);
					var19 = var13;

					while(true) {
						++var20;
						if ((field_332[var19][var20] & 255) != 19) {
							break label328;
						}

						field_332[var19][var20] = -1;
					}
				case 28:
					if (!var3) {
						var9 = true;
						this.field_551 = false;
					}
					break label328;
				}

				var4 = var10000;
			}

			if (var4 == 0) { //NOTE: MODIFIED TO MATCH PROCYON OUTPUT
				byte var30;
				switch (var30 = field_334[var13][var14]) {
				case -1:
					label365: {
						boolean b6; //NOTE: CHANGED BASED ON PROCYON OUTPUT
						if (var13 != 0 && var14 != 0 && var13 != this.currentLevelWidth - 1 && var14 != this.currentLevelHeight - 1) {
							if ((var1 != 0 && field_334[var13][var7 + 1] == 0 && (field_333[var13][var7 + 1] & 7) == 3 || this.field_218 >= 24 && (field_334[var13][var14 - 1] == 28 && (field_333[var13][var14 - 1] & 8) == 0 || field_334[var13][var14 + 1] == 28 && (field_333[var13][var14 + 1] & 8) == 0) || this.field_220 >= 24 && (field_334[var13][var14 - 1] == 28 || field_334[var13][var14 + 1] == 28)) && !var3) {
								var8 = 0;
								break label365;
							} //FIXME: IF STATEMENTS MAY BE STRUCTURED WRONG, CHECK PROCYON OUTPUT

							b6 = true; //NOTE: CHANGED BASED ON PROCYON OUTPUT
						} else {
							b6 = true; //NOTE: CHANGED BASED ON PROCYON OUTPUT
						}

						var15 = b6; //NOTE: CHANGED BASED ON PROCYON OUTPUT
					}

					var5 &= -9;
					break;
				case 0:
				case 8:
				case 9:
				case 47:
					int var32 = var6 + (var1 << 1);
					int var33 = var7 + (var2 << 1);
					if (this.field_174 == 4) {
						int var22 = this.method_274();
						if (var32 == var22 || var32 == var22 + 1) {
							int var23 = this.method_275();
							if (var33 >= var23) {
								var5 |= 8;
								this.method_211((var5 & 7) == 2 ? 8 : 9);
								return false;
							}
						}
					}

					--var10;
					int var34 = field_332[var32][var33] & 255;
					int var35 = field_332[var32][var33] >> 8;
					byte var24 = field_334[var13][var7 + 1];
					if ((var10 < 0 || var3) && var1 != 0 && method_309(var32, var33) && (var34 != 7 || (var35 & 240) != 0) && (var24 != 19 && var24 != 45 && var24 != 49 && var24 != 43 || (field_332[var13][var7 + 1] & 255) == 35)) {
						if (!var3) {
							this.method_286(var13, var14, var1 > 0, var30);
						}

						var15 = true;
						var5 |= 8;
					} else {
						if (var1 != 0) {
							var5 |= 8;
						}

						var8 = 0;
						field_333[var13][var14] = field_333[var13][var14] & -8 | 0;
					}
					break;
				case 1:
				case 2:
				case 4:
				case 5:
				case 6:
				case 7:
				case 11:
				case 14:
				case 19:
				case 24:
				case 26:
				case 27:
				case 33:
				case 40:
				case 41:
				case 42:
				case 43:
				case 45:
				case 50:
				case 51:
				case 52:
				case 53:
					var15 = true;
					break;
				case 3:
				case 12:
				case 13:
				case 15:
				case 16:
				case 17:
				case 18:
				case 20:
				case 21:
				case 22:
				case 23:
				case 25:
				case 29:
				case 30:
				case 32:
				case 36:
				case 37:
				case 38:
				case 39:
				case 44:
				case 46:
				default:
					var1 = 0;
					var15 = false;
					if (this.field_197 == 4 || this.field_197 == 2) {
						this.method_211(0 + this.field_197 - 1);
					}
					break;
				case 10:
					if (this.field_487 == 3) {
						if (!var3 && field_333[var13][var14] <= 0) {
							field_333[var13][var14] = 1;
						}

						var15 = true;
					}
					break;
				case 28:
					var8 = 0;
					var5 &= -9;
					break;
				case 31:
				case 49:
					var15 = false;
					break;
				case 34:
				case 35:
					var15 = var3;
					break;
				case 48:
					int var31 = var6 + (var1 << 1);
					int var21 = var7 + (var2 << 1);
					--var10;
					byte var25;
					if ((field_333[var13][var14] & 8) != 0) {
						var25 = 0;
						var10000 = 1;
					} else {
						var25 = -1;
						var10000 = 0;
					}

					byte var26 = (byte)var10000;
					if ((var10 < 0 || var3) && var1 != 0 && field_334[var31][var21 + var25] < 0 && field_334[var31][var21 + var26] < 0 && field_334[var13][var14 + var26 + 1] >= 0) {
						if (!var3) {
							field_334[var31][var21 + var25] = var30;
							field_334[var31][var21 + var26] = var30;
							field_334[var13][var14 + var25] = -1;
							field_334[var13][var14 + var26] = -1;
							field_333[var31][var21 + var25] = field_333[var13][var14 + var25];
							field_333[var31][var21 + var26] = field_333[var13][var14 + var26] & -16 | (var1 > 0 ? 2 : 4);
							field_335[var31][var21 + var26] = 18;
							field_336[var31][var21 + var25 - 1] = 48;
							field_336[var31][var21 + var25 - 1] = 48;
							field_336[var31][var21 + var25 - 1] = 48;
							method_345(var31, var21 + var26);
						}

						var15 = true;
						var5 |= 8;
					} else {
						if (var1 != 0) {
							var5 |= 8;
						}

						var8 = 0;
					}
				}
			}
		} else {
			var15 = true;
		}

		if (!var3 && var15 && !var16) {
			this.field_208 = -1;
		}

		if (var15 && var12 == 0) {
			var11 = 18;
			var6 += var1;
			var7 += var2;
			if ((var5 & 8) == 0 && !var3) {
				this.method_211(4 + var8 - 1);
			}
		} else if (var1 != 0 && !var3) {
			var5 |= 8;
		}

		if ((var5 & 8) != 0 && !var3) {
			this.method_211((var5 & 7) == 2 ? 8 : 9);
		}

		if (!var3) {
			this.field_233 = var5;
			this.playerXPos = var6;
			this.playerYPos = var7;
			this.field_197 = var8;
			this.field_238 = var9;
			this.field_242 = var10;
			this.field_232 = var11;
			this.field_240 = var12;
		}

		return var15;
	}

	// $FF: renamed from: d () void
	public static void method_289() {
		field_222 = 3;
	}

	// $FF: renamed from: bB () void
	private void method_290() {
		field_222 = 2;
		field_429 = true;
		this.openSubmenu(1);
		this.method_96();
		if (field_320[18] == null) {
			field_320[18] = loadGfxFile("/ui.f", 3);
		}

	}

	// $FF: renamed from: e () void
	public final void method_291() {
		this.field_457 = System.currentTimeMillis() - this.field_228;
		this.field_455 = true;
		System.out.println(cSoundEngine.method_60());
		if ((field_222 == 30 || field_222 == 4) && cSoundEngine.method_60()) {
			this.field_456 = true;
		}

		this.field_353.method_59();
	}

	public final void showNotify() {
		if (this.field_455) {
			this.method_292();
		}

	}

	public final void hideNotify() {
		if (!this.field_455) {
			this.method_291();
		}

	}

	// $FF: renamed from: f () void
	public final void method_292() {
		this.field_455 = false;
		field_429 = true;
		field_430 = true;
		this.noKeysPressed = true;
		keysPressed = 0;
		this.field_425 = -1;
		if (this.currentMenu == 7) {
			this.currentMenuSelection = 0;
		}

		this.field_228 = System.currentTimeMillis() - this.field_457;
		switch (field_222) {
		case 0:
		case 6:
		case 12:
		case 22:
			return;
		case 1:
			this.method_96();
			if (field_367) {
				return;
			}

			if (this.field_354 != null) {
				return;
			}

			if (this.field_195 != 0) {
				return;
			}

			if (this.field_238) {
				return;
			}

			if (this.field_239 <= 0) {
				return;
			}

			if (field_323[0]._nCrtAnim == 19) {
				return;
			}

			if (this.field_338) {
				return;
			}

			this.method_290();
			return;
		case 2:
			field_513 = null;
			this.field_170 = true;
			if (this.currentMenu == 1) {
				this.currentMenuSelection = 0;
				return;
			}

			return;
		case 3:
		case 13:
		case 14:
		case 24:
		case 29:
		case 32:
		default:
			return;
		case 4:
		case 30:
			if (this.field_456) {
				this.field_353.method_58(19);
				return;
			}

			return;
		case 5:
			this.field_388 = true;
			return;
		case 7:
			this.currentMenuSelection = 1;
			return;
		case 8:
			return;
		case 9:
		case 28:
			return;
		case 10:
			field_430 = false;
			return;
		case 11:
			this.field_266 = 6;
			return;
		case 15:
			break;
		case 16:
			this.playerLifeCount = 0;
			this.collectedRedDiamonds = 0;
			this.field_179 = false;
			this.field_167 = 0;
			this.field_329 = true;
			return;
		case 17:
			return;
		case 18:
		case 25:
		case 26:
			break;
		case 19:
			return;
		case 20:
			return;
		case 21:
			this.method_408();
			return;
		case 23:
			return;
		case 27:
			this.field_557 = true;
			this.field_110 = true;
			return;
		case 31:
			this.field_387 = true;
			return;
		case 33:
			break;
		}

		this.field_557 = true;
	}

	// $FF: renamed from: bC () void
	private void method_293() {
		if (this.field_155) {
			for (int var1 = 0; var1 < this.currentLevelWidth; ++var1) {
				for (int var2 = 0; var2 < this.currentLevelHeight; ++var2) {
					if (field_334[var1][var2] == 38) {
						this.method_372((byte)field_333[var1][var2], (byte)var1, (byte)var2, (byte)0);
						++this.field_480;
					}
				}
			}

		}
	}

	// $FF: renamed from: n (int, int) void
	private void method_294(int var1, int var2) {
		this.field_327 |= 4194304L;
		int[] var10000 = field_332[var1];
		var10000[var2] &= -256;
		var10000 = field_332[var1];
		var10000[var2] |= 14;
	}

	// $FF: renamed from: e () boolean
	private boolean method_295() {
		return this.field_174 == 4 || this.field_174 == 5 || this.field_174 == 3;
	}

	// $FF: renamed from: bD () void
	private void method_296() {
		Hashtable var1 = new Hashtable();
		Hashtable var2 = new Hashtable();
		Hashtable var3 = new Hashtable();
		this.field_171 = 0;
		this.field_172 = 0;
		int var4 = 0;
		this.levelDiamondCount = 0;
		this.field_268 = 0;
		int var5 = 0;
		int var6 = 0;
		this.field_458 = false;
		this.field_459 = false;
		this.field_460 = false;
		this.field_193 = 0;
		int var7 = 0;

		for (int var8 = 0; var8 < this.currentLevelWidth; ++var8) {
			for (int var9 = 0; var9 < this.currentLevelHeight; ++var9) {
				field_335[var8][var9] = 0;
				field_336[var8][var9] = 0;
				int var10 = field_332[var8][var9];
				int var11 = field_333[var8][var9];
				byte var12 = field_334[var8][var9];
				if (var10 != -1) {
					label377:
						switch (var10 & 255) {
						case 0:
							++var7;
							field_332[var8][var9] = var11 << 8 | var10 & 255;
							break;
						case 2:
							this.field_327 |= 1048576L;
							switch (var11) {
							case 0:
							case 1:
								this.field_327 |= 524288L;
							default:
								field_332[var8][var9] = var11 << 8 | 2;
								break label377;
							}
						case 3:
							field_336[var8][var9] = 127;
							if (var11 > 0) {
								field_332[var8][var9] = var11 + 1 << 8 | 3;
							}
							break;
						case 4:
							++var5;
							this.field_327 |= 16L;
							field_332[var8][var9] = var11 << 8 | var10 & 255;
							break;
						case 5:
							this.field_307 = (byte)var11;
							break;
						case 6:
							Integer var34 = new Integer(var11);
							Integer var40;
							var40 = (var40 = (Integer)var1.get(var34)) == null ? new Integer(1) : new Integer(var40.intValue() + 1);
							var1.put(var34, var40);
							this.field_327 |= 536870912L;
							field_332[var8][var9] = var11 << 8 | 6;
							break;
						case 7:
							if (var11 != -1) {
								field_447[var11] = (byte)var8;
								field_448[var11] = (byte)var9;
							}

							field_332[var8][var9] = var11 << 8 | var10;
							break;
						case 8:
							this.field_459 = true;
						case 9:
							if ((var10 & 255) != 8) {
								this.field_458 = true;
							}

							this.field_327 |= 268435456L;
							Integer var33 = new Integer(var11);
							Integer var38;
							var38 = (var38 = (Integer)var1.get(var33)) == null ? new Integer(1) : new Integer(var38.intValue() + 1);
							var1.put(var33, var38);
							field_332[var8][var9] = var11 << 8 | var10;
							break;
						case 10:
						case 11:
						case 12:
						case 13:
						case 15:
						case 16:
						case 18:
						case 20:
						case 21:
						case 22:
						case 23:
						case 24:
						case 25:
						case 27:
						case 29:
						case 32:
						default:
							if (var10 >= 20 && var10 < 26) {
								field_332[var8][var9] = var10;
								cGame var45;
								long var10001;
								long var10002;
								switch (this.currentWorld) {
								case 0:
									var45 = this;
									var10001 = this.field_327;
									var10002 = 16L;
									break;
								case 1:
									var45 = this;
									var10001 = this.field_327;
									var10002 = 2097152L;
									break;
								default:
									break label377;
								}

								var45.field_327 = var10001 | var10002;
							} else if (var10 < 80 && var10 > -1) {
								field_332[var8][var9] = -1;
							}
							break;
						case 14:
						case 33:
							if (!this.method_295()) {
								field_332[var8][var9] = 33;
							}

							this.field_327 |= 1L << ((field_332[var8][var9] & 255) == 14 ? 22 : 33);
							if (this.method_128(this.currentWorld, this.currentLevel, var8, var9)) {
								if (this.method_295()) {
									field_334[var8][var9] = 41;
									field_333[var8][var9] = 10;
									this.levelDiamondCount += 10;
								} else {
									field_334[var8][var9] = -1;
									int[] var10000 = field_332[var8];
									var10000[var9] |= 256;
								}
							}
							break;
						case 17:
							int var13;
							if ((var13 = field_332[var8][var9 - 1] & 0xFF) == 14 || var13 == 33) {
								field_332[var8][var9 - 1] = 0xFF00 | var13;
							}

							byte var14;
							switch (var14 = field_334[var8][var9 - 1]) {
							case 19:
							case 36:
							case 43:
							case 45:
							case 46:
							case 49:
								Integer var15 = new Integer(var11);
								Integer var16;
								var16 = (var16 = (Integer)var2.get(var15)) == null ? new Integer(1) : new Integer(var16.intValue() + 1);
								var2.put(var15, var16);
								field_332[var8][var9] = -1;
								Integer var17 = (Integer)var3.get(var15);
								if (var14 == 36) {
									if (var17 == null) {
										var3.put(var15, new Integer(58));
									}
								} else {
									var3.put(var15, new Integer(57));
									if (this.field_174 == 4) {
										var3.put(var15, new Integer(93));
									} else if (this.field_174 == 5) {
										var3.put(var15, new Integer(94));
									} else if (this.field_174 == 3) {
										var3.put(var15, new Integer(95));
									}
								}
								break;
							default:
								field_332[var8][var9] = var11 << 8 | 17;
							}

							if (var11 >= 0) {
								var6 |= 1 << var11;
							}
							break;
						case 28:
							this.field_308 = (byte)var11;
							break;
						case 30:
							this.field_327 |= 1073741824L;
							++var7;
						case 1:
						case 26:
							field_332[var8][var9] = var11 << 8 | var10 & 255;
							break;
						case 31:
							this.field_327 |= 1073741824L;
							field_332[var8][var9] = var11 << 8 | 31;
						case 19:
							field_332[var8][var9] = var11 << 8 | 19;
							break;
						case 34:
							this.field_327 |= 17179869184L;
						}
				}

				byte[] var46;
				int var53;
				byte var58;
				switch (var12) {
				case 1:
					++this.levelDiamondCount;
					field_336[var8][var9] = 48;
					field_333[var8][var9] = 0;
					continue;
				case 3:
				case 9:
				case 13:
				case 15:
				case 17:
				case 20:
				case 21:
				case 25:
				case 29:
				case 32:
				case 50:
				case 54:
				case 55:
				case 56:
				case 57:
				case 58:
				case 59:
				case 60:
				case 61:
				case 62:
				case 63:
				case 64:
				case 65:
				case 66:
				case 67:
				case 68:
				case 69:
				case 70:
				case 71:
				case 72:
				case 73:
				case 74:
				case 75:
				case 76:
				case 77:
				case 78:
				default:
					if (var12 >= 80 || var12 <= -1) {
						continue;
					}

					var46 = field_334[var8];
					var53 = var9;
					var58 = -1;
					break;
				case 6:
					++var4;
					this.method_294(var8, var9);
				case 7:
					this.field_327 |= 16L;
					field_333[var8][var9] = 0;
					continue;
				case 8:
					this.field_327 |= 32L;
					this.field_327 |= 8L;
				case 4:
					if (var12 != 8) {
						this.method_294(var8, var9);
					}
				case 5:
					this.field_327 |= 4L;
				case 2:
					++var4;
				case 0:
					field_336[var8][var9] = 48;
					field_333[var8][var9] = 0;
					this.field_328 |= 1L;
					continue;
				case 10:
					field_333[var8][var9] = 0;
					this.field_328 |= 2L;
					continue;
				case 11:
					field_333[var8][var9] = var11 == 1 ? 16 : 0;
					field_336[var8][var9] = 48;
					this.field_327 |= 16384L;
					continue;
				case 12:
					field_334[var8][var9] = -1;
					this.field_157 = var8;
					this.field_158 = var9;
					this.field_156 = var11;
					continue;
				case 14:
					this.field_327 |= 4096L;
					field_333[var8][var9] = field_333[var8][var9] == 4 ? 8 : 0;
					var46 = field_336[var8];
					var53 = var9;
					var58 = 24;
					break;
				case 16:
					if (field_334[var8][var9 + 1] != 16) {
						field_334[var8][var9 - 1] = 16;
						field_333[var8][var9 - 1] = var11;
					}

					this.field_327 |= 8192L;
					continue;
				case 18:
					this.field_310 = 0;
					this.field_311 = 0;
					this.field_327 |= 549755813888L;
					this.field_327 |= 128L;
					continue;
				case 19:
					this.field_327 |= 1L << (this.currentWorld == 1 ? 17 : 15);
					this.field_268 |= 2;
					var46 = field_336[var8];
					var53 = var9;
					var58 = 48;
					break;
				case 22:
				case 23:
					this.field_327 |= 512L;
					this.field_327 |= 1024L;
					var46 = field_336[var8];
					var53 = var9;
					var58 = 48;
					break;
				case 26:
					this.field_327 |= 1099511627776L;
				case 24:
				case 27:
					++var7;
					++var4;
					this.field_327 |= 1073741824L;
					this.field_327 |= 524288L;
					this.method_294(var8, var9);
					continue;
				case 28:
					this.field_327 |= 2048L;
					if (var11 > 10) {
						int[] var48 = field_333[var8];
						var48[var9] /= 11;
						var48 = field_333[var8];
						var48[var9] |= 8;
					}

					var46 = field_336[var8];
					var53 = var9;
					var58 = 24;
					break;
				case 30:
					this.field_327 |= 128L;
					field_333[var8][var9] = 0;
				case 31:
				case 33:
				case 51:
				case 52:
				case 53:
					continue;
				case 34:
					field_334[var8][var9] = -1;
					field_332[var8][var9] = 15;
					this.field_327 |= 16777216L;
					continue;
				case 35:
					field_334[var8][var9] = 35;
					field_332[var8][var9] = -1;
					this.field_327 |= 16777216L;
					this.field_460 = true;
					continue;
				case 36:
					if (field_333[var8][var9] != 1) {
						field_333[var8][var9] = 0;
					}

					this.field_327 |= 256L;
					continue;
				case 37:
					this.field_327 |= 33554432L;
					field_333[var8][var9] = 0;
					continue;
				case 38:
					this.field_155 = true;
					this.field_327 |= 67108864L;
					field_332[var8][var9] = 27;
					this.field_327 |= 64L;
					continue;
				case 39:
					this.field_155 = true;
					this.field_327 |= 67108864L;
					continue;
				case 40:
					this.field_327 |= 1073741824L;
					++var7;
					this.field_155 = true;
					this.field_327 |= 134217728L;
					this.method_294(var8, var9);
					++var4;
					continue;
				case 41:
					if (field_333[var8][var9] <= 0) {
						field_333[var8][var9] = 1;
					}

					this.levelDiamondCount += field_333[var8][var9];
					continue;
				case 42:
					++var7;
					++var4;
					this.field_327 |= 2147483648L;
					this.field_327 |= 1073741824L;
					this.method_294(var8, var9);
					continue;
				case 43:
					this.field_327 |= 1L << (this.currentWorld == 1 ? 17 : 15);
					this.field_268 |= 1;
					field_333[var8][var9] = var11 & -98305 | 65536;
					var46 = field_336[var8];
					var53 = var9;
					var58 = 48;
					break;
				case 44:
					field_336[var8][var9] = 24;
					field_333[var8][var9] = 0;
					this.field_327 |= 17179869184L;
					continue;
				case 45:
					field_333[var8][var9] = 0;
					field_336[var8][var9] = 24;
					this.field_327 |= 34359738368L;
					continue;
				case 46:
					field_333[var8][var9] = 0;
					field_336[var8][var9] = 24;
					field_335[var8][var9] = 0;
					this.field_327 |= 137438953472L;
					continue;
				case 47:
					field_336[var8][var9] = 48;
					field_333[var8][var9] = 0;
					this.field_327 |= 8388608L;
					continue;
				case 48:
					int[] var47;
					if ((var11 & 7) == 4) {
						var47 = field_333[var8];
						var53 = var9;
						var58 = 16;
					} else {
						var47 = field_333[var8];
						var53 = var9;
						var58 = 0;
					}

					var47[var53] = var58;
					++this.field_193;
					this.field_327 |= 1099511627776L;
					this.field_327 |= 4294967296L;
					int var29 = var9 - 1;
					field_334[var8][var29] = 48;
					field_333[var8][var29] = 8;
					method_345(var8, var29);
					continue;
				case 49:
					this.field_327 |= 2199023255552L;
					var46 = field_336[var8];
					var53 = var9;
					var58 = 48;
					break;
				case 79:
					this.playerXPos = 0;
					this.playerYPos = var9;
					this.field_195 = var8;
					field_334[var8][var9] = -1;
					this.field_201 = this.field_203 = 0;
					this.field_202 = this.field_204 = this.playerYPos * 24 - 160;
					continue;
				}

				var46[var53] = var58;
			}
		}

		field_173 = new byte[var4 << 1];

		for (int var22 = 0; var22 < field_173.length; ++var22) {
			field_173[var22] = 0;
		}

		field_355 = new DemoInterpreter[var7];
		field_356 = new byte[var7];
		int var23 = 0;
		field_337 = new byte[(var5 + 1) * 2];

		int var24;
		for (var24 = 31; var24 >= 0 && (var6 & 1 << var24) == 0; --var24) {
		}

		++var24;
		if (var24 > 0) {
			field_344 = new byte[var24];
			field_343 = new byte[var24];
		}

		if (this.field_193 > 0) {
			field_192 = new byte[this.field_193 * 3];
		}

		int var26 = 0;

		for (int var27 = 0; var27 < this.currentLevelHeight; ++var27) {
			for (int var28 = 0; var28 < this.currentLevelWidth; ++var28) {
				label326: {
					int var30 = field_332[var28][var27] & 255;
					int var31 = field_332[var28][var27] >> 8;
					byte[] var50;
					int var55;
					byte var60;
					switch (var30) {
					case 0:
					case 30:
						var50 = field_356;
						var55 = var23++;
						var60 = (byte)var31;
						break;
					case 4:
						field_337[var31 * 2] = (byte)var28;
						var50 = field_337;
						var55 = var31 * 2 + 1;
						var60 = (byte)var27;
						break;
					case 5:
						field_337[var5 * 2] = (byte)var28;
						var50 = field_337;
						var55 = var5 * 2 + 1;
						var60 = (byte)var27;
						break;
					case 7:
						Integer var35 = (Integer)var1.get(new Integer(var31));
						var31 <<= 8;
						if (var35 != null) {
							var31 = var31 & -16 | var35.intValue();
						}

						boolean var42 = (field_332[var28][var27 - 1] & 255) == 17;
						boolean var44 = (field_332[var28][var27 + 1] & 255) == 17 && (field_332[var28 + 1][var27] & 255) != 26 && (field_332[var28 - 1][var27] & 255) != 26;
						if (var42 || var44) {
							var31 = var31 & -241 | 48;
							field_336[var28][var27] = 24;
							if (var42) {
								field_332[var28][var27 - 1] = -1;
							}
						}

						field_332[var28][var27] = var31 << 8 | var30;
						break label326;
					case 17:
						if (var31 != -1) {
							Integer var19 = new Integer(var31);
							Integer var20;
							if ((var20 = (Integer)var2.get(var19)) == null) {
								var20 = new Integer(0);
							}

							field_344[var31] = var20.byteValue();
							Integer var21;
							if ((var21 = (Integer)var3.get(var19)) == null) {
								var21 = new Integer(59);
							}

							var50 = field_343;
							var55 = var31;
							var60 = var21.byteValue();
							break;
						}
					default:
						break label326;
					}

					var50[var55] = var60;
				}

				byte[] var52;
				int var57;
				byte var62;
				switch (field_334[var28][var27]) {
				case 24:
					var52 = field_356;
					var57 = var23++;
					var62 = 22;
					break;
				case 26:
					var52 = field_356;
					var57 = var23++;
					var62 = 25;
					break;
				case 27:
					var52 = field_356;
					var57 = var23++;
					var62 = 23;
					break;
				case 40:
					var52 = field_356;
					var57 = var23++;
					var62 = 24;
					break;
				case 42:
					var52 = field_356;
					var57 = var23++;
					var62 = 11;
					break;
				case 48:
					if ((field_333[var28][var27] & 8) != 0) {
						int var36 = var28 + ((field_333[var28][var27 + 1] & 16) == 0 ? 1 : -1);
						int var43 = var26 * 3;
						if (method_241(var36, var27) >= 0) {
							field_192[var43 + 0] = (byte)var36;
							field_192[var43 + 1] = (byte)var36;
							var52 = field_192;
							var57 = var43 + 2;
							var62 = (byte)var27;
						} else {
							var52 = field_192;
							var57 = var43 + 2;
							var62 = -1;
						}

						var52[var57] = var62;
						field_333[var28][var27] = field_333[var28][var27] & 0xFFFFFF | var26 << 24;
						++var26;
					}
				default:
					continue;
				}

				var52[var57] = var62;
			}
		}

		field_332[this.field_195 - 2][this.playerYPos] = -193 << 8 | 7;
		if ((this.field_327 & 4294967296L) != 0L || field_330[9] >= 8) {
			this.field_327 |= 1099511627776L;
			this.field_327 |= 2L;
			this.field_327 |= 1L;
			if ((this.field_327 & 131072L) != 0L) {
				this.field_327 |= 262144L;
			}

			if ((this.field_327 & 32768L) != 0L) {
				this.field_327 |= 65536L;
			}

			if ((this.field_327 & 34359738368L) != 0L) {
				this.field_327 |= 68719476736L;
			}

			if ((this.field_327 & 137438953472L) != 0L) {
				this.field_327 |= 274877906944L;
			}

			if ((this.field_327 & 2199023255552L) != 0L) {
				this.field_327 |= 4398046511104L;
			}
		}

	}

	// $FF: renamed from: a (int, int, int, int, int) void
	private void method_297(int var1, int var2, int var3, int var4, int var5) {
		if (var1 + var3 > 0 && var1 + var3 < this.currentLevelWidth && var2 + var4 > 0 && var2 + var4 < this.currentLevelHeight) {
			int var9;
			switch (var9 = field_332[var1 + var3][var2 + var4] & 255) {
			case 8:
			case 9:
				int var8 = field_332[var1 + var3][var2 + var4] >> 8;
				var8 = var5 == 1 ? var8 | 512 : var8 & -513;
				field_332[var1 + var3][var2 + var4] = var8 << 8 | var9;
				this.method_297(var1 + var3, var2 + var4, var3, var4, var5);
				this.method_297(var1 + var3, var2 + var4, 0, 1, var5);
			default:
			}
		}
	}

	// $FF: renamed from: d (int, int) boolean
	private boolean method_298(int var1, int var2) {
		return var1 == this.playerXPos && var2 == this.playerYPos;
	}

	// $FF: renamed from: u (int) void
	private void method_299(int var1) {
		this.field_196 = this.field_197 = 0;

		for (int var2 = 0; var2 < field_356.length; ++var2) {
			if (field_356[var2] == var1) {
				this.field_354 = field_355[var2];
			}
		}

		this.field_354.method_23();
	}

	// $FF: renamed from: f () boolean
	private boolean method_300() {
		label61: {
			if (this.field_201 < this.field_339) {
				this.field_201 += this.field_341;
				if (this.field_201 <= this.field_339) {
					break label61;
				}
			} else {
				if (this.field_201 <= this.field_339) {
					break label61;
				}

				this.field_201 -= this.field_341;
				if (this.field_201 >= this.field_339) {
					break label61;
				}
			}

			this.field_201 = this.field_339;
		}

		label53: {
			if (this.field_202 < this.field_340) {
				this.field_202 += this.field_341;
				if (this.field_202 <= this.field_340) {
					break label53;
				}
			} else {
				if (this.field_202 <= this.field_340) {
					break label53;
				}

				this.field_202 -= this.field_341;
				if (this.field_202 >= this.field_340) {
					break label53;
				}
			}

			this.field_202 = this.field_340;
		}

		boolean var1;
		boolean var2;
		label45: {
			var1 = false;
			var2 = false;
			if (this.field_201 < 0) {
				this.field_201 = 0;
			} else if (this.field_201 > this.currentLevelWidth * 24 - 240) {
				this.field_201 = this.currentLevelWidth * 24 - 240;
			} else if (this.field_201 != this.field_339) {
				break label45;
			}

			var1 = true;
		}

		label39: {
			if (this.field_202 < 0) {
				this.field_202 = 0;
			} else if (this.field_202 > this.currentLevelHeight * 24 - 320 + 80) {
				this.field_202 = this.currentLevelHeight * 24 - 320 + 80;
			} else if (this.field_202 != this.field_340) {
				break label39;
			}

			var2 = true;
		}

		if (var1 && var2) {
			this.field_203 = this.field_201;
			this.field_204 = this.field_202;
			this.field_194 = 70;
			return true;
		} else {
			return false;
		}
	}

	// $FF: renamed from: bE () void
	private void method_301() {
		switch (this.field_342) {
		case 1:
			this.field_341 = 8;
			if (this.method_300()) {
				this.field_342 = 2;
				this.field_466 = 40;
				return;
			}
			break;
		case 2:
			--this.field_466;
			if (this.field_466 == 30) {
				if ((field_332[this.field_464][this.field_465] >> 8 & 240) != 0) {
					this.method_258(this.field_464, this.field_465);
					return;
				}
			} else if (this.field_466 == 0) {
				this.field_342 = 3;
				this.field_339 = this.playerXPos * 24 - 108;
				this.field_340 = this.playerYPos * 24 - 108;
				this.field_341 = 5;
				this.field_462 = menuText[field_343[field_345]];
				field_320[41].GetStringHeight(this.field_462);
				this.field_463 = 80;
				return;
			}
			break;
		case 3:
			if (this.method_300()) {
				this.field_466 = 20;
				this.field_342 = 4;
				this.field_194 = 0;
				return;
			}
			break;
		case 4:
			--this.field_466;
			if (this.field_466 == 0) {
				this.field_194 = 0;
				this.field_342 = 0;
				field_467 = true;
			}
		}

	}

	// $FF: renamed from: v (int) void
	private void method_302(int var1) {
		this.method_433(1);
		int var2 = this.currentLevelWidth - 1;
		int var3 = this.currentLevelHeight - 1;

		for (int var4 = 1; var4 < var3; ++var4) {
			for (int var5 = 1; var5 < var2; ++var5) {
				if ((field_332[var5][var4] & 255) == 17 && field_332[var5][var4] >> 8 == var1) {
					int var6;
					int var7;
					label33: {
						var6 = -1;
						var7 = -1;
						int var10000;
						if (field_334[var5][var4] == 18) {
							var6 = var5;
							var10000 = var4;
						} else {
							switch (field_332[var5][var4 - 1] & 255) {
							case 7:
								if ((field_332[var5][var4 - 1] >> 8 & 240) == 0) {
									break label33;
								}
							case 14:
							case 33:
								var6 = var5;
								var10000 = var4 - 1;
								break;
							default:
								break label33;
							}
						}

						var7 = var10000;
					}

					if (var6 != -1) {
						this.field_464 = var6;
						this.field_465 = var7;
						this.field_339 = 24 * var6 - 108;
						this.field_340 = 24 * var7 - 108;
					}
				}
			}
		}

	}

	// $FF: renamed from: w (int) void
	private void method_303(int var1) {
		this.method_433(8);
		int var2 = this.currentLevelWidth - 1;
		int var3 = this.currentLevelHeight - 1;

		for (int var4 = 1; var4 < var3; ++var4) {
			for (int var5 = 1; var5 < var2; ++var5) {
				if ((field_332[var5][var4] & 255) == 17 && field_332[var5][var4] >> 8 == var1) {
					int var6;
					switch (var6 = field_332[var5][var4 - 1] & 255) {
					case 7:
						method_257(var5, var4 - 1);
						break;
					case 14:
					case 33:
						field_332[var5][var4 - 1] = 0 | var6;
					}
				}
			}
		}

	}

	// $FF: renamed from: bF () void
	private void method_304() {
		int var2 = this.playerXPos - 8;
		int var3 = this.playerXPos + 8;
		int var4 = this.playerYPos + 8;
		int var5 = this.playerYPos - 8;
		int var6 = 0;
		if (field_323[4] != null) {
			int var7;
			var6 = (var7 = field_323[4]._nCrtAFrame) == 0 ? 0 : (var7 <= 10 ? 1 : (var7 <= 20 ? 2 : 3));
		}

		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 > this.currentLevelWidth - 2) {
			var3 = this.currentLevelWidth - 2;
		}

		if (var5 < 1) {
			var5 = 1;
		}

		if (var4 > this.currentLevelHeight - 2) {
			var4 = this.currentLevelHeight - 2;
		}

		cGame var10000 = this;
		int var10001 = var4;

		while(true) {
			var10000.field_280 = var10001;
			if (this.field_280 < var5) {
				return;
			}

			var10000 = this;
			var10001 = var2;

			while(true) {
				var10000.field_279 = var10001;
				if (this.field_279 > var3) {
					var10000 = this;
					var10001 = this.field_280 - 1;
					break;
				}

				boolean var9 = this.field_254 != 0 && this.field_279 == this.field_252 && this.field_280 == this.field_253;
				if (field_336[this.field_279][this.field_280] > 0 && !var9) {
					label215: {
						label195: {
							byte[] var11 = field_336[this.field_279];
							var10001 = this.field_280;
							var11[var10001] = (byte)(var11[var10001] - 6);
							cGame var12;
							switch ((byte)(field_332[this.field_279][this.field_280] & 255)) {
							case 0:
								if (this.field_354 == null && this.field_258 == -1 && this.method_298(this.field_279, this.field_280) && this.field_232 <= 6) {
									this.field_258 = field_332[this.field_279][this.field_280] >> 8;
									field_332[this.field_279][this.field_280] = -1;
								}
							case 1:
							case 4:
							case 5:
							case 10:
							case 11:
							case 12:
							case 13:
							case 15:
							case 16:
							case 17:
							case 18:
							case 19:
							case 20:
							case 21:
							case 22:
							case 23:
							case 24:
							case 25:
							case 27:
							case 28:
							case 29:
							case 31:
							case 34:
							default:
								break label195;
							case 2:
								switch (field_332[this.field_279][this.field_280] >> 8) {
								case 0:
									if (field_334[this.field_279 - 1][this.field_280] != 30 && field_334[this.field_279 + 1][this.field_280] != 30 && field_334[this.field_279][this.field_280 - 1] != 30 && field_334[this.field_279][this.field_280 + 1] != 30) {
										this.field_208 = -1;
										this.method_287(this.field_279, this.field_280, (byte)2);
									}
								default:
									break label195;
								}
							case 3:
								this.method_341();
								break label195;
							case 6:
								this.method_316();
								break label195;
							case 7:
								this.method_340();
								break label195;
							case 8:
								var12 = this;
								break;
							case 9:
								var12 = this;
								break;
							case 14:
								this.method_342(14);
								break label195;
							case 26:
								this.method_319();
								break label195;
							case 30:
								if (this.field_354 == null && this.field_258 == -1 && this.method_298(this.field_279, this.field_280) && this.field_232 <= 0) {
									this.field_258 = field_332[this.field_279][this.field_280] >> 8;
									field_332[this.field_279][this.field_280] = -1;
								}
								break label195;
							case 32:
								this.method_315();
								break label195;
							case 33:
								this.method_342(33);
								break label195;
							case 35:
							case 37:
								if (this.field_279 != this.field_252 || this.field_280 != this.field_253 || this.field_254 == 0) {
									this.method_307();
								}
								break label195;
							case 36:
								this.method_234();
								break label195;
							}

							var12.method_339();
						}

						if ((field_332[this.field_279][this.field_280] & -268435456) >> 28 > 0) {
							this.method_326();
						}

						switch (field_334[this.field_279][this.field_280]) {
						case 0:
							this.method_351();
							break label215;
						case 1:
							this.method_351();
							break label215;
						case 2:
							this.method_322(2);
						case 3:
						case 12:
						case 13:
						case 15:
						case 17:
						case 18:
						case 20:
						case 25:
						case 29:
						case 31:
						case 33:
						case 34:
						case 35:
						case 38:
						case 39:
						default:
							break label215;
						case 4:
							this.method_322(4);
							break label215;
						case 5:
							this.method_322(5);
							break label215;
						case 6:
							this.method_322(6);
							break label215;
						case 7:
							this.method_322(7);
							break label215;
						case 8:
							this.method_351();
							break label215;
						case 9:
							if ((field_333[this.field_279][this.field_280] & 264241152) == 138412032) {
								label219: {
									label177: {
										field_336[this.field_279][this.field_280] = 24;
										if (this.field_190 > 0) {
											var10000 = this;
											var10001 = this.field_190 - 1;
										} else {
											if (this.field_190 >= 0) {
												break label177;
											}

											var10000 = this;
											var10001 = this.field_190 + 1;
										}

										var10000.field_190 = var10001;
									}

									if (this.field_191 > 0) {
										var10000 = this;
										var10001 = this.field_191 - 1;
									} else {
										if (this.field_191 >= 0) {
											break label219;
										}

										var10000 = this;
										var10001 = this.field_191 + 1;
									}

									var10000.field_191 = var10001;
								}
							}

							this.method_351();
							break label215;
						case 10:
							this.method_332();
							break label215;
						case 11:
							this.method_331();
							break label215;
						case 14:
							this.method_336();
							break label215;
						case 16:
							this.method_337();
							break label215;
						case 19:
							this.method_325((byte)19);
							break label215;
						case 21:
							this.method_334();
							break label215;
						case 22:
							var10000 = this;
							var10001 = 22;
							break;
						case 23:
							var10000 = this;
							var10001 = 23;
							break;
						case 24:
							this.method_328(24);
							break label215;
						case 26:
							this.method_328(26);
							break label215;
						case 27:
							this.method_328(27);
							break label215;
						case 28:
							this.method_338();
							break label215;
						case 30:
							this.method_329();
							break label215;
						case 32:
							this.method_333();
							break label215;
						case 36:
							this.method_318();
							break label215;
						case 37:
							this.method_330();
							break label215;
						case 40:
							this.method_322(40);
							break label215;
						case 41:
							this.method_322(41);
							break label215;
						case 42:
							this.method_322(42);
							break label215;
						case 43:
							this.method_325((byte)43);
							break label215;
						case 44:
							this.method_314();
							break label215;
						case 45:
							this.method_206();
							break label215;
						case 46:
							this.method_312();
							break label215;
						case 47:
							this.method_351();
							this.method_311();
							break label215;
						case 48:
							if ((field_333[this.field_279][this.field_280] & 8) == 0) {
								this.method_306((byte)48);
							} else {
								this.method_305();
							}
							break label215;
						case 49:
							this.method_325((byte)49);
							break label215;
						case 50:
							if (this.field_232 < 12 && this.method_298(this.field_279, this.field_280) && !this.field_140) {
								this.method_61(1, 48, field_326[this.field_233 & 7]);
							}
							break label215;
						case 51:
							this.method_322(51);
							break label215;
						case 52:
							this.method_322(52);
							break label215;
						case 53:
							this.method_322(53);
							break label215;
						case 54:
							this.method_317();
							break label215;
						}

						var10000.method_320(var10001, var6);
					}
				}

				var10000 = this;
				var10001 = this.field_279 + 1;
			}
		}
	}

	// $FF: renamed from: bG () void
	private void method_305() {
		int var1;
		int var2;
		int var7;
		label21: {
			var1 = this.field_279;
			int var3 = (var2 = this.field_280) + 1;
			int var4;
			switch ((var4 = field_333[var1][var3]) & 7) {
			case 2:
				var7 = var1;
				break;
			case 4:
				var7 = var1 + 1;
				break label21;
			default:
				if ((var4 & 16) == 0) {
					var7 = var1 + 1;
					break label21;
				}

				var7 = var1;
			}

			--var7;
		}

		int var5 = var7;
		int var6 = (field_333[var1][var2] >> 24) * 3;
		byte[] var8;
		int var10001;
		byte var10002;
		if (field_334[var5][var2] < 0) {
			field_192[var6 + 2] = (byte)var2;
			field_192[var6 + 1] = (byte)var5;
			var8 = field_192;
			var10001 = var6 + 0;
			var10002 = (byte)var5;
		} else {
			var8 = field_192;
			var10001 = var6 + 2;
			var10002 = -1;
		}

		var8[var10001] = var10002;
	}

	// $FF: renamed from: d (byte) void
	private void method_306(byte var1) {
		int var2 = this.field_279;
		int var3 = this.field_280;
		if (field_335[var2][var3] == 6 && (field_332[var2][var3] & 255) == 6) {
			this.method_256(field_332[var2][var3] >> 8);
		}

		if (field_335[var2][var3] <= 0) {
			int var4;
			label42: {
				int var5;
				int var10000;
				if ((var5 = (var4 = field_333[var2][var3]) & 7) == 2) {
					var10000 = var4 | 16;
				} else {
					if (var5 != 4) {
						break label42;
					}

					var10000 = var4 & -17;
				}

				var4 = var10000;
			}

			int var6 = var3 + 1;
			if (field_334[var2][var6] < 0 && (!this.method_298(var2, var6) || this.field_240 != 0)) {
				field_334[var2][var3 - 1] = -1;
				field_334[var2][var6] = var1;
				field_333[var2][var6] = var4 & -8 | 3;
				field_333[var2][var3] = field_333[var2][var3 - 1] | 8;
				field_335[var2][var6] = 18;
				int var7 = var3 - 2;
				field_336[var2 - 1][var7] = 48;
				field_336[var2][var7] = 48;
				field_336[var2 + 1][var7] = 48;
				method_345(var2, var3);
				if (var1 == 48) {
					this.method_305();
				}
			} else {
				if ((var4 & 7) == 3 && this.method_298(var2, var3 + 1)) {
					this.method_61(2, 48, 0);
				}

				field_333[var2][var3] = var4 & -8 | 0;
			}
		} else {
			byte[] var8 = field_335[var2];
			var8[var3] = (byte)(var8[var3] - 6);
		}

		field_336[var2][var3] = 24;
		field_336[var2][var3 - 1] = 24;
	}

	// $FF: renamed from: bH () void
	private void method_307() {
		int var1 = this.field_279;
		int var2 = this.field_280;
		field_336[var1][var2] = 24;
		byte[] var8;
		int var10;
		byte var12;
		if (field_335[var1][var2] <= 0) {
			int var3;
			int var4;
			byte var5;
			label64: {
				var3 = var2 - 1;
				var4 = var2 + 1;
				int[] var10000;
				if ((var5 = (byte)(field_332[var1][var3] & 255)) != 34 && var5 != 37) {
					if (var5 == 35 || !method_308(var1, var3)) {
						break label64;
					}

					field_335[var1][var3] = 18;
					var10000 = field_332[var1];
					var10 = var3;
					var12 = 35;
				} else {
					var10000 = field_332[var1];
					var10 = var3;
					var12 = 37;
				}

				var10000[var10] = var12;
			}

			byte var6 = field_334[var1][var2];
			if (field_334[var1][var3] < 0 && !this.method_298(var1, var3) && var5 == 35 && var6 != 32 && var6 != 21 && field_334[var1][var2] != -1) {
				field_335[var1][var3] = 18;
				field_334[var1][var3] = field_334[var1][var2];
				field_333[var1][var3] = field_333[var1][var2] & -8 | 1;
				field_334[var1][var2] = -1;
				this.method_147(var1, var2);
			} else {
				this.method_148(var1, var2);
			}

			if ((field_332[var1][var4] & 255) != 35 && field_334[var1][var4] != 47) {
				int[] var7;
				if (field_332[var1][var2] == 37) {
					var7 = field_332[var1];
					var10 = var2;
					var12 = 34;
				} else {
					var7 = field_332[var1];
					var10 = var2;
					var12 = -1;
				}

				var7[var10] = var12;
			}

			field_336[var1][var3] = 24;
			if (field_334[var1][var2] >= 0) {
				return;
			}

			var8 = field_335[var1];
			var10 = var2;
			var12 = 18;
		} else {
			var8 = field_335[var1];
			var10 = var2;
			var12 = (byte)(var8[var2] - 6);
		}

		var8[var10] = var12;
	}

	// $FF: renamed from: e (int, int) boolean
	private static boolean method_308(int var0, int var1) {
		byte var2 = field_334[var0][var1];
		int var3 = field_332[var0][var1] & 255;
		return var2 < 80 && var2 != 30 && var2 != 10 && var2 != 37 && var2 != 34 && var2 != 35 && var3 != 14 && var3 != 33 && var3 != 15 && var3 != 4 && var3 != 16;
	}

	// $FF: renamed from: f (int, int) boolean
	private static boolean method_309(int var0, int var1) {
		byte var2 = field_334[var0][var1];
		int var3 = field_332[var0][var1] & 255;
		return var2 == -1 && var3 != 14 && var3 != 33 && var3 != 5 && var3 != 28;
	}

	// $FF: renamed from: g (int, int) boolean
	private static boolean method_310(int var0, int var1) {
		byte var2 = field_334[var0][var1];
		int var3 = field_332[var0][var1] & 255;
		return var2 == -1 && var3 != 14 && var3 != 33 && var3 != 4 && var3 != 32 && (var3 != 7 || (field_332[var0][var1] >> 8 & 240) != 0);
	}

	// $FF: renamed from: bI () void
	private void method_311() {
		int var1 = this.field_280 - 1;
		boolean var2 = field_500 != null && field_500[this.field_279][this.field_280] != 0 && field_500[this.field_279][this.field_280 - 1] == 0;
		if ((field_333[this.field_279][this.field_280] & 7) == 0 && (field_332[this.field_279][var1] & 255) != 35 && method_308(this.field_279, var1) && (!this.method_298(this.field_279 - 1, this.field_280) && !this.method_298(this.field_279 + 1, this.field_280) || (this.field_233 & 8) == 0) && (field_334[this.field_279][this.field_280 + 1] >= 0 || var2)) {
			field_332[this.field_279][var1] = 35;
			field_335[this.field_279][var1] = 18;
			field_336[this.field_279][var1] = 24;
		}

	}

	// $FF: renamed from: bJ () void
	private void method_312() {
		int var1 = this.field_279;
		int var2 = this.field_280;
		int var3 = field_333[var1][var2] & 31;
		int var4 = (field_333[var1][var2] & 8160) >> 5;
		int var5 = method_313(field_320[29], var3);
		if ((field_332[var1][var2] & 255) == 35) {
			++var4;
			if (var4 > var5) {
				var4 = 0;
			}

			field_333[var1][var2] = 0 | var4 << 5;
		} else if (field_334[var1][var2 + 1] < 0 && var3 != 8 && var3 != 9) {
			byte var18;
			switch (var3) {
			case 0:
			case 2:
			case 4:
			case 6:
				var18 = 8;
				break;
			case 1:
			case 3:
			case 5:
			default:
				var18 = 9;
			}

			var3 = var18;
			field_335[var1][var2 + 1] = 18;
			field_334[var1][var2 + 1] = 46;
			field_334[var1][var2] = -1;
			field_333[var1][var2 + 1] = var3;
			method_345(var1, var2);
		} else {
			if (var3 != 8 && var3 != 9) {
				if (this.method_343(var1, var2)) {
					field_334[var1][var2] = -1;
					this.method_335(var1, var2);
					method_345(var1, var2);
					return;
				}

				if (!this.method_298(var1 - 1, var2) && !this.method_298(var1 + 1, var2) && !this.method_298(var1, var2 - 1)) {
					int var7 = this.field_233 & 7;
					if (this.playerXPos == var1 && this.field_232 == 6 && (var7 == 4 || var7 == 2) && this.playerYPos < var2 && field_334[var1][var2 - 1] < 0 && var2 * 24 <= this.field_202 + 320 - 80) {
						switch (var3) {
						case 0:
						case 2:
							var3 = 6;
							var4 = 0;
							break;
						case 1:
						case 3:
							var3 = 7;
							var4 = 0;
							break;
						default:
							break;
						}
					} else if (this.playerYPos != var2 || this.field_232 != 6 || var7 != 1 && var7 != 3 || var3 < 0 || var3 > 3 || (this.playerXPos >= var1 || field_334[var1 - 1][var2] >= 0 || var1 * 24 >= this.field_201 + 240) && (this.playerXPos <= var1 || field_334[var1 + 1][var2] >= 0 || (var1 + 1) * 24 <= this.field_201)) {
						var4++;
						switch (var3) {
						case 4:
							int var8 = var1 - 1;
							if (field_334[var8][var2] < 0 && var4 == method_205(field_320[29], 4, 1)) {
								field_334[var8][var2] = 21;
								field_333[var8][var2] = 4;
								field_335[var8][var2] = 18;
								field_336[var8][var2] = 24;
							}
							break;
						case 5:
							int var9 = var1 + 1;
							if (field_334[var9][var2] < 0 && var4 == method_205(field_320[29], 5, 1)) {
								field_334[var9][var2] = 21;
								field_333[var9][var2] = 2;
								field_335[var9][var2] = 18;
								field_336[var9][var2] = 24;
							}
							break;
						case 6:
						case 7:
							int var10 = var2 - 1;
							if (field_334[var1][var10] < 0 && var4 == method_205(field_320[29], var3, 1)) {
								field_334[var1][var10] = 21;
								field_333[var1][var10] = 1;
								field_335[var1][var10] = 18;
								field_336[var1][var10] = 24;
								break;
							}
						default:
							break;
						}

						if (var4 > var5) {
							label269: {
								var4 = 0;
								int var16;
								switch (this.method_324(var1, var2, this.playerXPos, this.playerYPos, false)) {
								case 1:
									if (this.playerXPos == var1 && var3 != 6 && var3 != 7 && var2 * 24 <= this.field_202 + 320 - 80) {
										var3 = var3 == 2 ? 6 : 7;
										break label269;
									}

									var3 = this.playerXPos < var1 ? 2 : 3;
									break label269;
								case 2:
									var16 = this.playerYPos == var2 && var3 != 5 && (var1 + 1) * 24 > this.field_201 ? 5 : 1;
									break;
								case 3:
								default:
									var16 = this.playerXPos < var1 ? 0 : 1;
									break;
								case 4:
									var16 = this.playerYPos == var2 && var3 != 4 && var1 * 24 < this.field_201 + 240 ? 4 : 0;
								}

								var3 = var16;
							}
						}
					} else {
						var3 = this.playerXPos < var1 ? 4 : 5;
						var4 = 0;
					}
				} else {
					label215: {
						byte var14;
						if (this.playerYPos == var2 - 1) {
							var14 = 17;
						} else if (this.playerXPos == var1 - 1) {
							var14 = 16;
						} else {
							if (this.playerXPos != var1 + 1) {
								break label215;
							}

							var14 = 15;
						}

						var3 = var14;
					}

					var4 = 0;
				}

				field_336[var1][var2] = 24;
				field_333[var1][var2] = var3 & 31 | var4 << 5;
			} else {
				byte[] var10000 = field_335[var1];
				var10000[var2] = (byte)(var10000[var2] - 6);
				if (field_335[var1][var2] < 0) {
					if (field_334[var1][var2 + 1] < 0) {
						field_335[var1][var2 + 1] = 18;
						field_334[var1][var2 + 1] = 46;
						field_334[var1][var2] = -1;
						field_333[var1][var2 + 1] = var3;
						method_345(var1, var2);
						return;
					}

					var3 = var3 == 8 ? 10 : 11;
					field_333[var1][var2] = var3;
					field_335[var1][var2] = 0;
					return;
				}

				if (method_350(var1, var2, 3, field_335[var1][var2], this.playerXPos, this.playerYPos, this.field_233 & 7, this.field_232)) {
					this.method_61(1, 48, field_333[var1][var2] & 7);
					return;
				}
			}

		}
	}

	// $FF: renamed from: a (a, int) int
	private static int method_313(ASprite var0, int var1) {
		int var2 = 0;
		int var3 = var0._anims_naf[var1] & 255;

		for (int var4 = 0; var4 < var3; ++var4) {
			var2 += var0._aframes[(var0._anims_af_start[var1] + var4) * 5 + 1] & 255;
		}

		return var2;
	}

	// $FF: renamed from: bK () void
	private void method_314() {
		int var1 = this.field_279;
		int var2 = this.field_280;
		field_336[var1][var2] = 24;
		byte[] var8;
		int var10001;
		byte var10002;
		switch ((field_333[var1][var2] & 56) >> 3) {
		case 0:
			if ((this.playerXPos != var1 || (var2 + 1) * 24 <= this.field_202 || this.field_174 == 3) && (this.field_174 != 3 || this.field_454 == 0L || (long)frameCounter < this.field_454 + (long)(21 - var1))) {
				return;
			}

			int var6 = var2 + 1;

			while(true) {
				byte var7 = field_334[var1][var6];
				if (this.playerYPos == var6 || var7 >= 80 || var7 == 30 || var7 == 34 || var7 == 35 || var7 == 0) {
					if (this.playerYPos == var6 || this.field_174 == 3) {
						field_333[var1][var2] = field_333[var1][var2] & -57 | 8;
						field_335[var1][var2] = 10;
						return;
					}

					return;
				}

				++var6;
			}
		case 1:
			--field_335[var1][var2];
			if (field_335[var1][var2] <= 0) {
				field_332[var1][var2] = 34;
				field_333[var1][var2] = field_333[var1][var2] & -64 | 24 | 3;
				field_335[var1][var2] = 0;
				return;
			}

			return;
		case 2:
		default:
			return;
		case 3:
			if (field_335[var1][var2] > 0) {
				var8 = field_335[var1];
				var8[var2] = (byte)(var8[var2] - 5);
				return;
			}

			boolean var4 = this.method_298(var1, var2 + 1);
			boolean var5 = false;
			if (var4 || field_334[var1][var2 + 1] >= 0 || this.field_155 && field_500[var1][var2 + 1] != 0) {
				if (var4) {
					this.method_61(1, 48, 0);
					var5 = true;
				} else {
					var5 = true;
					switch (field_334[var1][var2 + 1]) {
					case 10:
						field_332[var1][var2 + 1] = 32;
						this.method_147(var1, var2 + 1);
						var5 = false;
						break;
					case 18:
						this.method_232();
						break;
					case 19:
					case 43:
					case 45:
					case 46:
					case 49:
						this.method_335(var1, var2 + 1);
						field_334[var1][var2 + 1] = -1;
						break;
					case 21:
						var5 = false;
						break;
					case 30:
						this.method_433(11);
						field_333[var1][var2 + 1] = 1;
						break;
					default:
						this.method_433(14);
					}
				}
			}

			if (var5) {
				field_333[var1][var2] = field_333[var1][var2] & -64 | 32;
				field_335[var1][var2] = 0;
				return;
			}

			field_334[var1][var2] = -1;
			field_334[var1][var2 + 1] = 44;
			field_333[var1][var2 + 1] = field_333[var1][var2];
			var8 = field_335[var1];
			var10001 = var2 + 1;
			var10002 = 19;
			break;
		case 4:
			if ((frameCounter & 1) != 0) {
				return;
			}

			++field_335[var1][var2];
			if (field_335[var1][var2] != field_320[27].GetAFrames(4)) {
				return;
			}

			var8 = field_334[var1];
			var10001 = var2;
			var10002 = -1;
		}

		var8[var10001] = var10002;
		method_345(var1, var2);
	}

	// $FF: renamed from: bL () void
	private void method_315() {
		int var1 = field_332[this.field_279][this.field_280] >> 8 & 255;
		if ((frameCounter & 1) == 0) {
			++var1;
		} else if (var1 == 1) {
			this.method_147(this.field_279, this.field_280);
		}

		int[] var10000;
		int var10001;
		int var10002;
		if (var1 == field_320[16].GetAFrames(0)) {
			var10000 = field_332[this.field_279];
			var10001 = this.field_280;
			var10002 = -1;
		} else {
			var10000 = field_332[this.field_279];
			var10001 = this.field_280;
			var10002 = var1 << 8 | 32;
		}

		var10000[var10001] = var10002;
		field_336[this.field_279][this.field_280] = 24;
	}

	// $FF: renamed from: bM () void
	private void method_316() {
		int var1 = this.field_279;
		int var2 = this.field_280;
		int var3 = field_332[var1][var2] >> 8;
		boolean var4 = method_344(var1, var2) || field_334[var1][var2] == 47 || field_334[var1][var2] == 48;
		int var5 = field_335[var1][var2];
		if (!var4 && this.method_298(var1, var2)) {
			var4 = true;
			var5 = (this.field_233 & 4096) != 0 ? 0 : this.field_232;
		}

		if (var4 && var5 < 12) {
			this.method_256(var3);
		} else {
			this.method_259(var3);
		}
	}

	// $FF: renamed from: bN () void
	private void method_317() {
		int var1 = this.field_279;
		int var2 = this.field_280;
		int var3 = field_333[var1][var2];
		ASprite var4 = field_320[7];
		++var3;
		int var5 = method_313(var4, 0);
		if (var3 >= var5) {
			field_334[var1][var2] = -1;
			method_345(var1, var2);
		} else {
			if (var3 == 1) {
				this.method_433(7);
				method_345(var1, var2);
			} else if (var3 == var5 >> 1) {
				for (int var6 = -1; var6 < 2; ++var6) {
					for (int var7 = -1; var7 < 2; ++var7) {
						int var8;
						int var9;
						label39: {
							var8 = var1 + var7;
							var9 = var2 + var6;
							int[] var10000;
							int var10001;
							byte var10002;
							switch (field_334[var8][var9]) {
							case 8:
								field_334[var8][var9] = 54;
								var10000 = field_333[var8];
								var10001 = var9;
								var10002 = 0;
								break;
							case 10:
								if (this.field_487 != 3) {
									break label39;
								}
							case 30:
							case 37:
								var10000 = field_333[var8];
								var10001 = var9;
								var10002 = 1;
								break;
							case 16:
							case 19:
							case 43:
							case 49:
								field_334[var8][var9] = -1;
								this.method_335(var8, var9);
								field_336[var8][var9] = 24;
							default:
								break label39;
							}

							var10000[var10001] = var10002;
							method_345(var8, var9);
						}

						if (this.method_298(var8, var9)) {
							this.method_61(1, 64, 0);
						}
					}
				}
			}

			field_333[var1][var2] = var3;
			field_336[var1][var2] = 24;
		}
	}

	// $FF: renamed from: bO () void
	private void method_318() {
		int var1 = this.field_279;
		int var2 = this.field_280;
		if (field_333[var1][var2] == 0) {
			if (field_334[var1][var2 - 1] == 11) {
				field_333[var1][var2] = 1;
				this.method_327();
				return;
			}
		} else if (this.method_298(var1, var2 - 1)) {
			this.method_61(1, 64, 0);
		}

	}

	// $FF: renamed from: bP () void
	private void method_319() {
		if (this.field_232 <= 6 && this.method_298(this.field_279, this.field_280)) {
			keysPressed = 0;
			this.field_196 = 0;
			field_345 = field_332[this.field_279][this.field_280] >> 8;
			this.method_258(this.playerXPos + field_325[this.field_233 & 7], this.playerYPos);
			if (field_345 >= 0 && field_345 < field_344.length) {
				this.method_433(1);
				this.field_342 = 1;
				this.method_302(field_345);
			} else {
				field_345 = -1;
			}

			field_332[this.field_279][this.field_280] = -1;
		}

	}

	// $FF: renamed from: o (int, int) void
	private void method_320(int var1, int var2) {
		int var3 = this.field_279;
		int var4 = this.field_280;
		int var5 = var1 == 23 ? -1 : 1;
		field_336[var3][var4] = 24;
		if (this.playerYPos == var4) {
			for (int var6 = 0; var6 <= var2; ++var6) {
				int var7 = var3 + var6 * var5;
				if (this.playerXPos == var7) {
					this.method_61(1, 64, 0);
				}
			}
		}

	}

	// $FF: renamed from: bQ () void
	private void method_321() {
		boolean var1 = false;
		byte var2 = -1;
		boolean var3 = false;
		switch (this.field_213) {
		case 2:
			this.collectedRedDiamonds++;
			var3 = true;
			var2 = 0;
		case 3:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 25:
		case 28:
		case 29:
		case 30:
		case 31:
		case 32:
		case 33:
		case 34:
		case 35:
		case 36:
		case 37:
		case 38:
		case 39:
		case 43:
		case 44:
		case 45:
		case 46:
		case 47:
		case 48:
		case 49:
		case 50:
		default:
			break;
		case 4:
			var2 = 2;
			this.playerGoldKeys++;
			break;
		case 5:
			this.playerSilverKeys++;
			var2 = 1;
			break;
		case 6:
			this.playerLifeCount++;
			field_351[this.playerXPos][this.playerYPos] = -1;
			field_349[this.playerXPos][playerYPos] |= 256;
			var2 = 0;
			this.method_127(this.currentWorld, this.currentLevel, this.playerXPos, this.playerYPos);
			break;
		case 7:
			this.method_62((byte)127);
			var2 = 4;
			break;
		case 24:
			var3 = true;
			var1 = true;
			this.field_258 = 22;
			break;
		case 26:
			var1 = true;
			this.field_258 = 25;
			var3 = true;
			break;
		case 27:
			var3 = true;
			var1 = true;
			this.field_258 = 23;
			break;
		case 40:
			var3 = true;
			var1 = true;
			this.field_258 = 24;
			break;
		case 41:
			if (this.method_295()) {
				this.field_461 = true;
				this.method_65();
			}

			this.collectedDiamonds += this.field_212;
			this.field_156 -= this.field_212;
			if (this.field_156 <= 0 && !this.method_295()) {
				field_334[this.field_157][this.field_158] = -1;
				this.field_156 = 0;
			}

			var2 = 3;
			break;
		case 42:
			var3 = true;
			var1 = true;
			this.field_179 = true;
			this.field_258 = 11;
			break;
		case 51:
		case 52:
		case 53:
			this.method_127(this.currentWorld, this.currentLevel, this.playerXPos, this.playerYPos);
			var2 = 0;
			var1 = true;
			this.method_65();
			this.field_122 = true;
			cGame var10000;
			byte var10001;
			if (this.field_213 == 53) {
				var10000 = this;
				var10001 = 0;
			} else if (this.field_213 == 51) {
				var10000 = this;
				var10001 = 1;
			} else {
				var10000 = this;
				var10001 = 2;
			}

			var10000.field_123 = var10001;
			byte[] var4 = field_330;
			var4[2] = (byte)(var4[2] | 1 << this.field_123);
			this.method_110();
		}

		if (var1) {
			this.method_211(47);
		}

		if (var2 != -1) {
			this.method_254(this.playerXPos, this.playerYPos - 1, var2);
		}

		if (var3) {
			field_173[this.field_171 << 1] = (byte)this.playerXPos;
			field_173[(this.field_171 << 1) + 1] = (byte)this.playerYPos;
			this.field_171++;
		}

		this.method_96();
		this.field_213 = -1;
	}

	// $FF: renamed from: x (int) void
	private void method_322(int var1) {
		int var2 = this.field_279;
		int var3 = this.field_280;
		if (this.field_232 <= 0 && this.method_298(var2, var3)) {
			int var4;
			if ((var4 = field_332[var2][var3] & 255) != 14 && var4 != 33 || field_332[var2][var3] >> 8 != 255) {
				label38: {
					this.field_213 = var1;
					cGame var10000;
					byte var10001;
					switch (var1) {
					case 2:
						this.field_210 = 3;
						var10000 = this;
						var10001 = 0;
						break;
					case 4:
						this.field_210 = 24;
						var10000 = this;
						var10001 = 0;
						break;
					case 5:
						this.field_210 = 25;
						var10000 = this;
						var10001 = 0;
						break;
					case 6:
						if (this.playerLifeCount >= 99) {
							field_334[var2][var3] = 7;
							field_333[var2][var3] = 0;
							this.method_322(7);
							break label38;
						}

						this.field_210 = 5;
						var10000 = this;
						var10001 = 0;
						break;
					case 7:
						if (this.field_239 == field_330[8]) {
							field_334[var2][var3] = 41;
							field_333[var2][var3] = 10;
							this.levelDiamondCount += 10;
							this.method_322(41);
							break label38;
						}

						this.field_210 = 5;
						var10000 = this;
						var10001 = 1;
						break;
					case 40:
						this.field_210 = 19;
						this.field_211 = 0;
						field_334[this.field_279][this.field_280] = -1;
						this.field_213 = 40;
						field_330[10] = 1;
						break label38;
					case 41:
						this.field_210 = 2;
						this.field_211 = 0;
						this.field_212 = field_333[this.field_279][this.field_280];
						break label38;
					case 42:
						this.field_210 = 29;
						var10000 = this;
						var10001 = 0;
						break;
					case 51:
						this.field_210 = 30;
						var10000 = this;
						var10001 = 0;
						break;
					case 52:
						this.field_210 = 31;
						var10000 = this;
						var10001 = 0;
						break;
					case 53:
						this.field_210 = 32;
						var10000 = this;
						var10001 = 0;
						break;
					default:
						break label38;
					}

					var10000.field_211 = var10001;
				}

				field_334[var2][var3] = -1;
				this.method_96();
			}
		}
	}

	// $FF: renamed from: h (int, int) boolean
	private boolean method_323(int var1, int var2) {
		return field_334[var1][var2] == 28 || this.field_218 >= 24 && (field_334[var1][var2 - 1] == 28 && (field_333[var1][var2 - 1] & 8) == 0 || field_334[var1][var2 + 1] == 28 && (field_333[var1][var2 + 1] & 8) == 0) || this.field_220 >= 24 && (field_334[var1][var2 - 1] == 28 || field_334[var1][var2 + 1] == 28);
	}

	// $FF: renamed from: a (int, int, int, int, boolean) int
	private int method_324(int var1, int var2, int var3, int var4, boolean var5) {
		int var6 = var1 - var3;
		int var7 = var2 - var4;
		int var8 = var6 > 0 ? var6 : -var6;
		int var9 = var7 > 0 ? var7 : -var7;
		byte var10 = 0;
		if (var8 > var9) {
			label79: {
				byte var10000;
				if (var6 > 0) {
					var10000 = 4;
				} else {
					if (var6 >= 0) {
						break label79;
					}

					var10000 = 2;
				}

				var10 = var10000;
			}

			if (var10 != 0 && (!method_310(var1 - field_325[var10], var2) || this.method_323(var1 - field_325[var10], var2))) {
				var10 = 0;
			}
		}

		if (var10 == 0) {
			label66: {
				byte var12;
				if (var7 > 0) {
					var12 = 1;
				} else {
					if (var7 >= 0) {
						break label66;
					}

					var12 = 3;
				}

				var10 = var12;
			}

			int var11 = var2 - field_325[8 + var10];
			if (var5 && var10 != 0 && (!method_310(var1, var11) || this.field_155 && field_500[var1][var11] != 0 || this.method_323(var1, var11))) {
				label50: {
					var10 = 0;
					byte var13;
					if (var6 > 0) {
						var13 = 4;
					} else {
						if (var6 >= 0) {
							break label50;
						}

						var13 = 2;
					}

					var10 = var13;
				}

				if (var10 != 0 && field_334[var1 - field_325[var10]][var2] >= 0) {
					var10 = 0;
				}
			}
		}

		return var10;
	}

	// $FF: renamed from: e (byte) void
	private void method_325(byte var1) {
		int var2 = this.field_279;
		int var3 = this.field_280;
		int var4 = field_333[var2][var3];
		byte var5 = field_335[var2][var3];
		int var6 = 0;
		int var7 = 0;
		boolean var8 = (field_332[var2][var3] & 255) == 35;
		boolean var9 = var1 == 43 && (var4 & 3840) != 0;
		if (!var8 && this.method_343(var2, var3)) {
			field_334[var2][var3] = -1;
			this.method_335(var2, var3);
		} else {
			int var10;
			label122: {
				var10 = var4 & 7;
				byte[] var19;
				int var20;
				byte var10002;
				if (var5 <= 0) {
					if (var8 && var5 <= 6) {
						if (var5 < 0) {
							field_335[var2][var3] = 0;
						}
					} else {
						method_345(var2, var3);
						if (var9) {
							var5 = 18;
							int var18 = this.method_324(var2, var3, this.playerXPos, this.playerYPos, true);
							var4 = var4 & -8 | var18;
							var10 = var18;
							var6 = -field_325[var18];
							var7 = -field_325[var18 + 8];
							if (var18 == 0) {
								var5 = 0;
								var7 = 0;
								var6 = 0;
							}

							var4 -= 256;
						} else {
							label150: {
								if ((var4 & 16646144) != 0 && (var4 & 248) == 0) {
									int var17 = (var4 & 16646144) >> 17;
									int var12 = (var4 & 2130706432) >> 24;
									if (var2 == var17 && var3 == var12) {
										int var14;
										var10 = ((var14 = var4 & -16646145) & Integer.MIN_VALUE) == 0 ? 2 : 1;
										var4 = var14 & -8 | var10;
										break label150;
									}

									var5 = 21;
									int var13 = this.method_324(var2, var3, var17, var12, true);
									var4 = var4 & -8 | var13;
									var6 = -field_325[var13];
									var7 = -field_325[var13 + 8];
									var10 = var13;
									if (var13 != 0) {
										break label150;
									}

									var5 = 0;
								} else {
									if (var10 == 0) {
										var5 = 21;
										int var11 = (var4 & 28672) >> 12;
										var4 = var4 & -8 | var11;
										var10 = var11;
										var6 = -field_325[var11];
										var7 = -field_325[var11 + 8];
										if (!method_310(var2 + var6, var3 + var7)) {
											var7 = 0;
											var6 = 0;
											var5 = 0;
										}
										break label150;
									}

									var5 = 21;
									var6 = -field_325[var10];
									var7 = -field_325[var10 + 8];
									if (method_310(var2 + var6, var3 + var7)) {
										break label150;
									}

									label107: {
										int var10000;
										switch (var10) {
										case 1:
											var10000 = var4 & -28673;
											var20 = 12288;
											break;
										case 2:
											var10000 = var4 & -28673;
											var20 = 16384;
											break;
										case 3:
											var10000 = var4 & -28673;
											var20 = 4096;
											break;
										case 4:
											var10000 = var4 & -28673;
											var20 = 8192;
											break;
										default:
											break label107;
										}

										var4 = var10000 | var20;
									}

									var4 = var4 & -8 | 0;
									var10 = 0;
								}

								var7 = 0;
								var6 = 0;
							}
						}
					}

					if ((var4 & 248) == 0) {
						field_334[var2][var3] = -1;
						field_334[var2 + var6][var3 + var7] = var1;
						field_336[var2 + var6][var3 + var7] = 48;
						field_335[var2 + var6][var3 + var7] = var5;
						field_333[var2 + var6][var3 + var7] = var4;
						break label122;
					}

					if ((frameCounter & 3) == 0) {
						var4 = var4 & -249 | (var4 & 248) - 8;
						if (var1 == 43 && (var4 & 248) == 0) {
							var4 = var4 & -3841 | 3072;
						}
					}

					var19 = field_335[var2];
					var20 = var3;
					var10002 = 0;
				} else {
					if (var5 < 0) {
						field_335[var2][var3] = 0;
					}

					var5 = (byte)(var5 - 3);
					var19 = field_335[var2];
					var20 = var3;
					var10002 = var5;
				}

				var19[var20] = var10002;
			}

			if ((var4 & 248) == 0 && (field_323[0]._nCrtAnim < 13 || field_323[0]._nCrtAnim > 16) && method_350(var2, var3, var10, field_335[var2][var3], this.playerXPos, this.playerYPos, (this.field_233 & 4096) == 0 ? this.field_197 : 0, this.field_232)) {
				this.method_61(1, 48, var10);
				if (var9) {
					var4 &= -3841;
				}
			}

			field_333[var2][var3] = var4;
		}
	}

	// $FF: renamed from: bR () void
	private void method_326() {
		int var1;
		if ((var1 = (field_332[this.field_279][this.field_280] & -268435456) >> 28) == 0) {
			this.method_433(10);
		}

		if ((frameCounter & 1) == 0) {
			++var1;
		}

		int[] var10000;
		int var10001;
		int var10002;
		if (var1 >= field_320[13].GetAFrames(0)) {
			var10000 = field_332[this.field_279];
			var10001 = this.field_280;
			var10002 = field_332[this.field_279][this.field_280] & 268435455;
		} else {
			var10000 = field_332[this.field_279];
			var10001 = this.field_280;
			var10002 = field_332[this.field_279][this.field_280] & 268435455 | var1 << 28;
		}

		var10000[var10001] = var10002;
		method_345(this.field_279, this.field_280);
	}

	// $FF: renamed from: bS () void
	private void method_327() {
		if (this.field_174 != 3 && this.field_174 != 4 && this.field_174 != 5 || this.field_182 <= 0) {
			if (field_345 >= 0) {
				--field_344[field_345];
				if (field_344[field_345] == 0) {
					this.method_303(field_345);
				}
			}

		}
	}

	// $FF: renamed from: y (int) void
	private void method_328(int var1) {
		if ((field_332[this.field_279][this.field_280] & 255) != 14 || field_332[this.field_279][this.field_280] >> 8 != 255) {
			if (this.method_298(this.field_279, this.field_280) && (field_323[0]._nCrtAnim == 40 || field_323[0]._nCrtAnim == 48)) {
				label23: {
					field_334[this.field_279][this.field_280] = -1;
					cGame var10000;
					byte var10001;
					switch (var1) {
					case 24:
						field_330[9] = 1;
						this.field_210 = 7;
						this.field_211 = 0;
						var10000 = this;
						var10001 = 24;
						break;
					case 25:
					default:
						break label23;
					case 26:
						field_330[9] = 8;
						this.field_210 = 7;
						this.field_211 = 2;
						var10000 = this;
						var10001 = 26;
						break;
					case 27:
						field_330[9] = 2;
						this.field_210 = 7;
						this.field_211 = 1;
						var10000 = this;
						var10001 = 27;
					}

					var10000.field_213 = var10001;
				}

				this.method_127(this.currentWorld, this.currentLevel, this.field_279, this.field_280);
			}

		}
	}

	// $FF: renamed from: bT () void
	private void method_329() {
		int var1 = field_333[this.field_279][this.field_280];
		if (var1 > 0) {
			int var2 = this.field_279;
			int var3 = this.field_280;
			if (var1 == 4) {
				for (int i = 1; i < 5; i++) {
					byte var5 = field_325[i];
					byte var6 = field_325[i + 8];
					if (field_334[var2 + var5][var3 + var6] == 30) {
						field_333[var2 + var5][var3 + var6]++;
						field_336[var2 + var5][var3 + var6] = 24;
					}
				}
			} else if (var1 >= 16) {
				field_334[var2][var3] = -1;
				method_345(var2, var3);
			}

			field_333[var2][var3] = var1 + 1;
			field_336[var2][var3] = 24;
		}

	}

	// $FF: renamed from: bU () void
	private void method_330() {
		int var1 = this.field_279;
		int var2 = this.field_280;
		int var3;
		if ((var3 = field_333[var1][var2]) > 0) {
			if (var3 >= 8) {
				this.method_397(var1, var2);
				field_334[var1][var2] = -1;
				method_345(var1, var2);
			}

			field_333[var1][var2] = var3 + 1;
			field_336[var1][var2] = 24;
		}

	}

	// $FF: renamed from: bV () void
	private void method_331() {
		int var1 = this.field_279;
		int var2 = this.field_280;
		int var3;
		if ((var3 = (field_333[var1][var2] & 3840) >> 8) != 0) {
			if (var3 >= 4) {
				field_334[var1][var2] = -1;
			} else if ((frameCounter >> 1 & 1) == 0) {
				field_333[var1][var2] += 256;
			}
		} else if (field_500 != null && field_500[var1][var2] != 0) {
			field_333[var1][var2] = field_333[var1][var2] & -3841 | 256;
		} else if (field_335[var1][var2] <= 4) {
			label163: {
				int var4 = field_333[var1][var2];
				field_336[var1][var2] = 24;
				boolean var5 = (var4 & 16) != 0;
				int var6;
				int[] var13;
				int var10001;
				int var10002;
				int var10003;
				if ((var6 = var4 & 7) != 0) {
					int var7;
					int var8;
					byte var9;
					byte var10;
					int var11;
					int var12;
					label154: {
						var7 = 0;
						var8 = 0;
						var9 = 0;
						var10 = 0;
						var11 = 0;
						var12 = 0;
						byte var10000;
						switch (var6) {
						case 1:
							var7 = var5 ? -1 : 1;
							var11 = var5 ? 4 : 2;
							var12 = var5 ? 2 : 4;
							var10 = -1;
							break label154;
						case 2:
							var8 = var5 ? -1 : 1;
							var11 = var5 ? 1 : 3;
							var12 = var5 ? 3 : 1;
							var10000 = 1;
							break;
						case 3:
							var7 = var5 ? 1 : -1;
							var11 = var5 ? 2 : 4;
							var12 = var5 ? 4 : 2;
							var10 = 1;
							break label154;
						case 4:
							var8 = var5 ? 1 : -1;
							var11 = var5 ? 3 : 1;
							var12 = var5 ? 1 : 3;
							var10000 = -1;
							break;
						default:
							break label154;
						}

						var9 = var10000;
					}

					if (method_310(var1 + var9, var2 + var10) && method_310(var1 + var7, var2 + var8) && method_310(var1 + var7 - var9, var2 + var8 - var10)) {
						if (field_335[var1][var2] <= 0) {
							field_333[var1 + var9][var2 + var10] = var4;
							field_334[var1 + var9][var2 + var10] = 11;
							field_334[var1][var2] = -1;
							field_335[var1 + var9][var2 + var10] = 18;
						}
						break label163;
					}

					if (method_310(var1 + var7, var2 + var8)) {
						field_333[var1 + var7][var2 + var8] = var4 & -8 | var11;
						field_334[var1 + var7][var2 + var8] = 11;
						field_334[var1][var2] = -1;
						field_335[var1 + var7][var2 + var8] = 18;
						break label163;
					}

					if (method_310(var1 + var9, var2 + var10)) {
						if (field_335[var1][var2] <= 0) {
							field_333[var1 + var9][var2 + var10] = var4;
							field_334[var1 + var9][var2 + var10] = 11;
							field_334[var1][var2] = -1;
							field_335[var1 + var9][var2 + var10] = 18;
						}
						break label163;
					}

					var13 = field_333[var1];
					var10001 = var2;
					var10002 = var4 & -8;
					var10003 = var12;
				} else {
					label160: {
						if (field_334[var1 - 1][var2] >= 0) {
							var13 = field_333[var1];
							var10001 = var2;
							var10002 = var4 & -8 | (var5 ? 1 : 3);
						} else {
							if (field_334[var1][var2 + 1] < 0) {
								break label160;
							}

							var13 = field_333[var1];
							var10001 = var2;
							var10002 = var4 & -8 | (var5 ? 2 : 4);
						}

						var13[var10001] = var10002;
					}

					if (field_334[var1 + 1][var2] >= 0) {
						field_333[var1][var2] = var4 & -8 | (var5 ? 3 : 1);
					}

					if (field_334[var1][var2 + 1] < 0) {
						break label163;
					}

					var13 = field_333[var1];
					var10001 = var2;
					var10002 = var4 & -8;
					var10003 = var5 ? 4 : 2;
				}

				var13[var10001] = var10002 | var10003;
			}

			method_345(var1, var2);
		}

		if (this.method_298(var1, var2)) {
			this.method_61(1, 64, 0);
		}

		if (field_335[var1][var2] > 0) {
			byte[] var15 = field_335[var1];
			var15[var2] = (byte)(var15[var2] - 5);
		}

	}

	// $FF: renamed from: bW () void
	private void method_332() {
		int var1 = this.field_279;
		int var2 = this.field_280;
		if (field_333[var1][var2] > 0) {
			field_334[var1][var2] = -1;
			field_332[var1][var2] = 32;
			method_345(var1, var2);
			this.method_397(var1, var2);
			field_336[var1][var2] = 24;
		}

	}

	// $FF: renamed from: bX () void
	private void method_333() {
		int var1 = this.field_279;
		int var2 = this.field_280;
		field_336[var1][var2] = 24;
		byte[] var10000;
		int var10001;
		byte var10002;
		if (field_335[var1][var2] == 0) {
			int var4;
			byte var5;
			boolean var7;
			label64: {
				int var3;
				var4 = ((var3 = field_333[var1][var2]) & 1) == 0 ? -1 : 1;
				var5 = field_334[var1 + var4][var2];
				int var6 = field_332[var1 + var4][var2] & 255;
				var7 = false;
				int var8;
				if ((var8 = var3 >> 1) > 0) {
					if (var5 < 0 && var6 != 14 && var6 != 33) {
						field_333[var1 + var4][var2] = var8 - 1 << 1 | var3 & 1;
						field_336[var1 + var4][var2] = 30;
						field_335[var1 + var4][var2] = 18;
						var5 = 32;
						break label64;
					}

					if (var5 == 32) {
						break label64;
					}

					int var9 = field_333[var1 + var4][var2];
					int var10 = 0;
					if (var5 == 48 && (var9 & 8) != 0) {
						break label64;
					}

					switch (var5) {
					case 1:
					case 2:
					case 4:
					case 5:
					case 6:
					case 7:
						var10 = -var4;
					case 0:
					case 8:
					case 9:
					case 11:
					case 14:
					case 19:
					case 43:
					case 47:
					case 48:
					case 49:
						this.method_433(12);
						this.field_251 = 0;
						this.field_254 = this.playerXPos - (var1 + var4) + var10;
						this.field_252 = var1 + var4;
						this.field_253 = var2;
						if (this.field_250 == -1) {
							switch (var5) {
							case 0:
							case 8:
							case 9:
							case 47:
								int var11 = var9 & -28673;
								var9 = var11 & -513;
							default:
								this.field_250 = var9;
							}
						}

						if (this.field_254 < 0) {
							this.field_249 = var9 & -8 | 4;
						} else {
							this.field_249 = var9 & -8 | 2;
						}
						break label64;
					case 3:
					case 10:
					case 12:
					case 13:
					case 15:
					case 16:
					case 17:
					case 18:
					case 20:
					case 21:
					case 22:
					case 23:
					case 24:
					case 25:
					case 26:
					case 27:
					case 28:
					case 29:
					case 30:
					case 31:
					case 32:
					case 33:
					case 34:
					case 35:
					case 36:
					case 37:
					case 38:
					case 39:
					case 40:
					case 41:
					case 42:
					case 44:
					case 45:
					case 46:
					default:
						if (var5 == -1) {
							break label64;
						}
					}
				}

				var7 = true;
			}

			if (var7) {
				for (int var12 = 1; var12 <= 3; ++var12) {
					if (field_334[this.playerXPos + var4 * var12][this.playerYPos] == 32) {
						field_334[this.playerXPos + var4 * var12][this.playerYPos] = -1;
					}
				}
			}

			var10000 = field_334[var1 + var4];
			var10001 = var2;
			var10002 = var5;
		} else {
			var10000 = field_335[var1];
			var10001 = var2;
			var10002 = (byte)(var10000[var2] - 6);
		}

		var10000[var10001] = var10002;
		method_345(var1, var2);
	}

	// $FF: renamed from: bY () void
	private void method_334() {
		int var1 = this.field_279;
		int var2 = this.field_280;
		int var3 = field_333[var1][var2] & 7;
		if ((field_333[var1][var2] & 8) != 0) {
			byte var14;
			switch (var3) {
			case 2:
				var14 = 13;
				break;
			case 4:
				var14 = 12;
				break;
			default:
				var14 = 14;
			}

			byte var11 = var14;
			if (field_335[var1][var2] < method_313(field_320[29], var11) && (field_332[this.field_279][this.field_280] & 255) != 35) {
				++field_335[var1][var2];
			} else {
				field_334[var1][var2] = -1;
				method_345(var1, var2);
			}

			field_336[var1][var2] = 24;
		} else {
			if (this.method_298(var1, var2) || this.method_298(var1 + field_325[var3], var2 + field_325[8 + var3]) && field_335[var1][var2] <= this.field_232) {
				this.method_61(1, 48, 0);
			}

			byte[] var13;
			int var16;
			byte var17;
			if (field_335[var1][var2] <= 0) {
				int var4 = var1 - field_325[var3];
				int var5 = var2 - field_325[var3 + 8];
				byte var6 = 24;
				if (var3 == 4) {
					var6 = 12;
				}

				if (field_334[var4][var5] < 0) {
					field_334[var4][var5] = 21;
					field_333[var4][var5] = field_333[var1][var2];
					field_335[var4][var5] = var6;
					var13 = field_334[var1];
					var16 = var2;
					var17 = -1;
				} else if (field_334[var4][var5] == 21) {
					int var7 = field_333[var4][var5] & 7;
					int var8 = var4 - field_325[var7];
					int var9 = var5 - field_325[var7 + 8];
					field_334[var1][var2] = -1;
					method_345(var1, var2);
					int var10 = field_333[var1][var2];
					if (field_334[var8][var9] < 0) {
						field_334[var8][var9] = 21;
						field_333[var8][var9] = field_333[var4][var5];
						field_335[var8][var9] = 18;
					}

					field_334[var4][var5] = 21;
					field_333[var4][var5] = var10;
					var13 = field_335[var4];
					var16 = var5;
					var17 = 18;
				} else {
					switch (field_334[var4][var5]) {
					case 10:
					case 30:
						if (field_333[var4][var5] < 1) {
							field_333[var4][var5] = 1;
						}
						break;
					case 19:
					case 43:
					case 45:
					case 46:
						field_334[var4][var5] = -1;
						this.method_335(var4, var5);
					}

					int[] var12 = field_333[var1];
					var12[var2] |= 8;
					var13 = field_335[var1];
					var16 = var2;
					var17 = 0;
				}

				var13[var16] = var17;
				var13 = field_336[var4];
				var16 = var5;
				var17 = 48;
			} else {
				var13 = field_335[var1];
				var16 = var2;
				var17 = (byte)(var13[var2] - 12);
			}

			var13[var16] = var17;
		}
	}

	// $FF: renamed from: p (int, int) void
	private void method_335(int var1, int var2) {
		field_332[var1][var2] = field_332[var1][var2] & 268435455 | 268435456;
		this.method_327();
	}

	// $FF: renamed from: bZ () void
	private void method_336() {
		int var1 = this.field_279;
		int var2 = this.field_280;
		int var3;
		int var4 = ((var3 = field_333[var1][var2]) & 0xFF00) >> 8;
		int var5 = (var3 & 8) != 0 ? 4 : 2;
		if (var4 >= 20) {
			if (method_310(var1, var2 + 1) || var5 == 4 && (field_334[var1 - 1][var2] < 0 || field_334[var1 - 1][var2] == 16 || field_334[var1 - 1][var2] == 19 || field_334[var1 - 1][var2] == 43) || var5 == 2 && (field_334[var1 + 1][var2] < 0 || field_334[var1 + 1][var2] == 16 || field_334[var1 + 1][var2] == 19 || field_334[var1 + 1][var2] == 43)) {
				field_333[var1][var2] = var3 & -65281 | 4864;
			}
		} else {
			label79: {
				byte[] var10000;
				int var10001;
				byte var10002;
				if (var4 > 0) {
					field_333[var1][var2] = var3 & -65281 | var4 - 1 << 8;
					var10000 = field_336[var1];
					var10001 = var2;
					var10002 = 24;
				} else {
					byte var6;
					if ((var6 = field_335[var1][var2]) <= 0) {
						int var7 = var1;
						int var8 = var2;
						if (method_310(var1, var2 + 1)) {
							var8 = var2 + 1;
							var5 = 3;
						} else {
							label111: {
								if (var5 == 4) {
									if (method_310(var1 - 1, var2)) {
										var7 = var1 - 1;
										break label111;
									}

									var5 = 0;
									if (field_334[var1 - 1][var2] == 16 || field_334[var1 - 1][var2] == 19 || field_334[var1 - 1][var2] == 43) {
										break label111;
									}
								} else {
									if (method_310(var1 + 1, var2)) {
										var7 = var1 + 1;
										break label111;
									}

									var5 = 0;
									if (field_334[var1 + 1][var2] == 16 || field_334[var1 + 1][var2] == 19 || field_334[var1 + 1][var2] == 43) {
										break label111;
									}
								}

								var3 = var3 & -65281 | 5120;
							}
						}

						if (var7 != var1 || var8 != var2) {
							field_334[var7][var8] = 14;
							method_345(var7, var8);
							field_334[var1][var2] = -1;
							field_335[var7][var8] = 18;
						}

						field_333[var7][var8] = var3 & -8 | var5;
						break label79;
					}

					var10000 = field_335[var1];
					var10001 = var2;
					var10002 = (byte)(var6 - 6);
				}

				var10000[var10001] = var10002;
			}
		}

		if (this.method_298(var1, var2)) {
			this.method_61(1, 48, var5);
		}

	}

	// $FF: renamed from: ca () void
	private void method_337() {
		int var1 = this.field_279;
		int var2 = this.field_280;
		byte var3;
		byte var10000;
		if (field_334[var1][var2 + 1] != 16) {
			var3 = 0;
			var10000 = -1;
		} else {
			var3 = 1;
			var10000 = 0;
		}

		byte var4 = var10000;
		byte var5 = field_335[var1][var2 + var3];
		int var6;
		int var7 = ((var6 = field_333[var1][var2 + var3]) & 7) == 4 ? 4 : 2;
		boolean var8 = this.method_298(var1 - field_325[var7], var2 + var3) || this.method_298(var1 - field_325[var7], var2 + var4);
		if (var5 <= 0 && var8 && this.field_232 <= 12) {
			var5 = 36;
		} else if (var5 > 0) {
			if (var3 == 0) {
				--var5;
			}

			if ((var5 == 11 || var3 == 0 && var5 < 11) && var8) {
				this.method_61(1, 48, var6 & 7);
			}

			field_336[var1][var2] = 24;
		}

		if (this.method_343(var1, var2)) {
			this.method_433(14);
			field_334[var1][var2 + var4] = -1;
			this.method_335(var1, var2 + var4);
			field_334[var1][var2 + var3] = -1;
			this.method_335(var1, var2 + var3);
		} else {
			field_333[var1][var2 + var4] = var6;
			field_333[var1][var2 + var3] = var6;
			if (var3 == 0) {
				field_335[var1][var2 + var4] = var5;
				field_335[var1][var2 + var3] = var5;
			}

		}
	}

	// $FF: renamed from: cb () void
	private void method_338() {
		int var1;
		int var2 = ((var1 = field_333[this.field_279][this.field_280]) & 7) == 3 ? 1 : -1;
		int var3 = (var1 & 8) == 0 ? this.field_219 : this.field_221;
		int var5 = this.field_280 + (var3 - 1) * var2;
		if (this.method_298(this.field_279, var5)) {
			this.method_61(2, 48, field_326[this.field_233 & 7]);
		}

		switch (field_334[this.field_279][var5]) {
		default:
			this.method_335(this.field_279, var5);
			field_334[this.field_279][var5] = -1;
			method_345(this.field_279, var5);
			this.method_147(this.field_279, var5);
		case -1:
		case 28:
		case 32:
			field_336[this.field_279][this.field_280] = 24;
		}
	}

	// $FF: renamed from: cc () void
	private void method_339() {
		int var1 = this.field_279;
		int var2 = this.field_280;
		int var3 = field_332[var1][var2] >> 8;
		int var4 = field_332[var1][var2] & 255;
		int var5;
		if ((var3 & 256) == 0 && (var4 == 9 && this.playerGoldKeys > 0 || var4 == 8 && this.playerSilverKeys > 0) && this.playerYPos == var2 && (this.playerXPos == var1 - 1 || this.playerXPos == var1 + 1) && (var5 = field_323[0]._nCrtAnim) != 18 && var5 != 17 && this.field_232 <= 6) {
			this.field_197 = this.field_196 = 0;
			cGame var10000;
			byte var10001;
			if (this.playerXPos == var1 - 1) {
				this.field_233 = this.field_233 & -8 | 2;
				var10000 = this;
				var10001 = 18;
			} else {
				this.field_233 = this.field_233 & -8 | 4;
				var10000 = this;
				var10001 = 17;
			}

			var10000.method_211(var10001);
			if (var4 == 9) {
				var10000 = this;
				var10001 = 24;
			} else {
				var10000 = this;
				var10001 = 25;
			}

			var10000.field_210 = var10001;
			this.field_211 = 0;
		}

	}

	// $FF: renamed from: cd () void
	private void method_340() {
		int var1 = this.field_279;
		int var2 = this.field_280;
		int var3;
		int var4;
		if ((var4 = ((var3 = field_332[var1][var2] >> 8) & 240) >> 4) != 0) {
			if (frameCounter % 3 == 0 && var4 < 3) {
				var3 = var3 & -241 | var4 + 1 << 4;
				if (var4 == 2) {
					int var5;
					if ((var5 = field_332[var1][var2 - 1] & 255) == 9 || var5 == 8) {
						int var6 = field_332[var1][var2 - 1] >> 8 & -513;
						field_332[var1][var2 - 1] = var6 << 8 | var5;
					}

					this.method_297(var1, var2 - 1, 1, 0, 0);
					this.method_297(var1, var2 - 1, -1, 0, 0);
				}

				field_336[var1][var2] = 24;
			}

			field_332[var1][var2] = var3 << 8 | 7;
		}

	}

	// $FF: renamed from: ce () void
	private void method_341() {
		int var1 = this.field_279;
		int var2 = this.field_280;
		int var3;
		if ((var3 = field_332[var1][var2] >> 8) >= 6) {
			field_336[var1][var2] = 0;
		} else {
			label37:
				switch (var3) {
				case -1:
					if (Math.abs(this.playerXPos - var1) < 4 && Math.abs(this.playerYPos - var2) < 4) {
						var3 = 3;
					}
				case 0:
				case 1:
					break;
				case 2:
					switch (this.field_197) {
					case 1:
						if (!this.method_298(var1, var2 - 1)) {
							break label37;
						}
						break;
					case 2:
						if (!this.method_298(var1 + 1, var2)) {
							break label37;
						}
						break;
					case 3:
						if (!this.method_298(var1, var2 + 1)) {
							break label37;
						}
						break;
					case 4:
						if (!this.method_298(var1 - 1, var2)) {
							break label37;
						}
						break;
					default:
						break label37;
					}

					var3 = 3;
					break;
				default:
					if ((frameCounter & 1) == 0) {
						++var3;
					}
				}

			field_336[var1][var2] = 24;
			field_332[var1][var2] = var3 << 8 | 3;
		}
	}

	// $FF: renamed from: z (int) void
	private void method_342(int var1) {
		int var2 = this.field_279;
		int var3 = this.field_280;
		int var4 = field_332[var2][var3] >> 8;
		field_332[var2][var3] = var4 << 8 | var1;
		if (field_335[var2][var3] <= 0) {
			if (var4 == 0) {
				if (this.method_298(var2, var3) && this.field_232 <= 0) {
					this.field_233 &= -2049;
					field_332[var2][var3] = 256 | var1;
					cGame var10000;
					byte var10001;
					if (Math.abs(this.field_449 - System.currentTimeMillis()) >= 5000L) {
						var10000 = this;
						var10001 = 40;
					} else {
						var10000 = this;
						var10001 = 48;
					}

					var10000.method_211(var10001);
					this.method_433(3);
					return;
				}
			} else if ((frameCounter >> 1 & 1) == 0 && field_320[var1 == 14 ? 8 : 22] != null && var4 < field_320[var1 == 14 ? 8 : 22].GetAFrames(0) - 1) {
				field_332[var2][var3] = var4 + 1 << 8 | var1;
				field_336[var2][var3] = 24;
			}
		}

	}

	// $FF: renamed from: i (int, int) boolean
	private boolean method_343(int var1, int var2) {
		int var3 = var2 - 1;
		int var4 = var1 - 1;
		int var5 = var1 + 1;
		return field_335[var1][var3] <= 6 && (method_344(var1, var3) && ((field_333[var1][var3] & 7) == 3 || field_334[var1][var2] != 16 && field_334[var1][var3] != 1) || field_334[var1][var3] == 46 || field_334[var1][var3] == 14 || field_334[var1][var3] == 48) || field_335[var5][var2] <= 0 && field_334[var5][var2] == 14 && (field_333[var5][var2] & 8) != 0 && (field_333[var5][var2] & 7) != 3 || field_335[var4][var2] <= 0 && field_334[var4][var2] == 14 && (field_333[var4][var2] & 8) == 0 && (field_333[var4][var2] & 7) != 3;
	}

	// $FF: renamed from: j (int, int) boolean
	private static boolean method_344(int var0, int var1) {
		if (field_334[var0][var1] >= 0) {
			switch (field_334[var0][var1]) {
			case 0:
			case 1:
			case 8:
			case 9:
				return true;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			}
		}

		return false;
	}

	// $FF: renamed from: q (int, int) void
	private static void method_345(int var0, int var1) {
		int var2 = var0 - 1;
		int var3 = var0 + 1;
		int var4 = var1 - 1;
		int var5 = var1 + 1;
		field_336[var2][var4] = 48;
		field_336[var0][var4] = 48;
		field_336[var3][var4] = 48;
		field_336[var2][var1] = 48;
		field_336[var0][var1] = 48;
		field_336[var3][var1] = 48;
		field_336[var2][var5] = 48;
		field_336[var0][var5] = 48;
		field_336[var3][var5] = 48;
	}

	// $FF: renamed from: cf () void
	private void method_346() {
		this.field_164 = field_330[10];
		this.field_313 = this.field_311;
		this.field_312 = this.field_310;
		this.field_166 = this.field_156;
		this.field_300 = this.field_207;
		this.field_298 = this.collectedDiamonds;
		this.field_299 = this.collectedRedDiamonds;
		this.field_293 = this.playerXPos;
		this.field_294 = this.playerYPos;
		this.field_295 = this.playerGoldKeys;
		this.field_296 = this.playerSilverKeys;
		this.field_297 = this.field_195;
		this.field_172 = this.field_171;
		this.field_301 = this.field_177;
		this.field_302 = this.field_176;
		field_346 = field_345;
		if (field_344 != null) {
			System.arraycopy(field_344, 0, field_352, 0, field_344.length);
		}

		for (int var1 = 0; var1 < this.currentLevelWidth; ++var1) {
			System.arraycopy(field_333[var1], 0, field_348[var1], 0, this.currentLevelHeight);
			System.arraycopy(field_335[var1], 0, field_350[var1], 0, this.currentLevelHeight);
			System.arraycopy(field_334[var1], 0, field_351[var1], 0, this.currentLevelHeight);
			System.arraycopy(field_332[var1], 0, field_349[var1], 0, this.currentLevelHeight);
		}

		this.method_368();
	}

	// $FF: renamed from: cg () void
	private void method_347() {
		field_398 = -1;
		this.field_210 = this.field_211 = this.field_212 = -1;
		this.field_252 = 0;
		this.field_253 = 0;
		this.field_338 = true;
		this.field_339 = this.field_293 * 24 - 120;
		this.field_340 = this.field_294 * 24 - 160 + 40;
		this.field_257 = 0;
		if (this.field_186) {
			this.field_258 = 15;
			this.field_186 = false;
			field_349[37][7] = -1;
			field_349[39][5] = -1;
		} else if (this.field_187) {
			this.field_258 = 17;
			this.field_187 = false;
			field_349[46][7] = -1;
			field_349[50][7] = -1;
		}

		this.field_189 = false;
		this.field_194 = 70;
		field_330[10] = this.field_164;
		this.field_156 = this.field_166;
		this.field_311 = this.field_313;
		this.field_310 = this.field_312;
		this.field_207 = this.field_300;
		this.collectedRedDiamonds = this.field_299;
		this.collectedDiamonds = this.field_298;
		field_323[0].SetAnim(2);
		this.field_233 = 2;
		this.field_255 = 0;
		this.playerXPos = this.field_293;
		this.playerYPos = this.field_294;
		this.playerGoldKeys = this.field_295;
		this.playerSilverKeys = this.field_296;
		this.field_171 = this.field_172;
		switch (this.field_174) {
		case 1:
			this.field_176 = this.field_302;
			this.field_177 = this.field_301;
		case 2:
		default:
			break;
		case 3:
			this.field_182 = 5;
			break;
		case 4:
			this.field_180 = 0;
			this.field_183 = 0;
			this.field_182 = 3;
			this.field_141 = false;
			break;
		case 5:
			this.method_129();
		}

		field_345 = field_346;
		if (field_344 != null) {
			System.arraycopy(field_352, 0, field_344, 0, field_344.length);
		}

		for (int var1 = 0; var1 < this.currentLevelWidth; ++var1) {
			System.arraycopy(field_348[var1], 0, field_333[var1], 0, this.currentLevelHeight);
			System.arraycopy(field_350[var1], 0, field_335[var1], 0, this.currentLevelHeight);
			System.arraycopy(field_351[var1], 0, field_334[var1], 0, this.currentLevelHeight);
			System.arraycopy(field_349[var1], 0, field_332[var1], 0, this.currentLevelHeight);
		}

		int var7 = this.currentLevelHeight - 1;

		for (int var2 = 1; var2 < var7; ++var2) {
			int var3 = this.currentLevelWidth - 1;

			for (int var4 = 1; var4 < var3; ++var4) {
				byte var5 = field_334[var4][var2];
				int var6 = field_332[var4][var2] & 255;
				if (var5 > -1 && var5 < 80 || var6 > -1 && var6 < 80) {
					method_345(var4, var2);
				}
			}
		}

		if (field_323[2] != null) {
			field_323[2].SetAnim(0);
			field_334[18][63] = -1;
		}

		this.field_195 = this.field_297;
		this.method_96();
		if (this.field_155) {
			this.method_369();
		}

		if (field_192 != null) {
			for (int var8 = 0; var8 < this.currentLevelHeight; ++var8) {
				for (int var9 = 0; var9 < this.currentLevelWidth; ++var9) {
					if (field_334[var9][var8] == 48) {
						this.field_279 = var9;
						this.field_280 = var8;
						if ((field_333[var9][var8] & 8) == 0) {
							this.method_306((byte)48);
						} else {
							this.method_305();
						}
					}
				}
			}
		}

	}

	// $FF: renamed from: a (short, short, byte, int) void
	public static void method_348(short var0, short var1, byte var2, int var3) {
		field_334[var0][var1] = var2;
		field_333[var0][var1] = var3;
	}

	// $FF: renamed from: b (int, int, int, int) boolean
	private static boolean method_349(int var0, int var1, int var2, int var3) {
		return Math.abs(var0 - var2) < 24 && Math.abs(var1 - var3) < 24;
	}

	// $FF: renamed from: a (int, int, int, int, int, int, int, int) boolean
	private static boolean method_350(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		field_469 = 0;
		field_468 = 0;
		field_471 = 100;
		field_470 = 100;
		if (Math.abs(var0 - var4) <= 1 && Math.abs(var1 - var5) <= 1) {
			field_468 = var0 * 24 + field_325[var2] * var3;
			field_469 = var1 * 24 + field_325[8 + var2] * var3;
			field_470 = var4 * 24 + field_325[var6] * var7;
			field_471 = var5 * 24 + field_325[8 + var6] * var7;
			return method_349(field_468, field_469, field_470, field_471);
		} else {
			return false;
		}
	}

	// $FF: renamed from: ch () void
	private void method_351() {
		int var1 = this.field_279;
		int var2 = this.field_280;
		byte var3 = field_335[var1][var2];
		int var4 = field_333[var1][var2];
		byte var5 = field_334[var1][var2];
		boolean var10 = field_500 != null && field_500[var1][var2] != 0;
		int var11 = var4 & 7;
		byte var6;
		byte var7;
		int var8;
		int var10000;
		if (var10 && field_500[var1][var2] != 3) {
			var6 = -1;
			var7 = 1;
			var8 = var2 - 1;
		} else {
			var6 = 1;
			var7 = 3;
			var8 = var2 + 1;
		}

		byte var12 = (this.field_233 & 4096) == 0 ? this.field_197 : 0;
		boolean var13 = method_350(var1, var2, var11, var3, this.playerXPos, this.playerYPos, var12, this.field_232);
		if (var5 == 1 && var13) {
			this.method_352(var1, var2);
		} else {
			boolean var14 = (field_332[var1][var2] & 255) == 35;
			if (field_334[var1][var8] == 9 && var3 <= 0) {
				byte var16 = (byte)(field_332[var1][var8] & 255);
				int var17;
				if ((var17 = (field_333[var1][var8] & 264241152) >> 22) != 34) {
					if (var17 == 33) {
						if (var16 == -1) {
							field_332[var1][var8] = 32;
						}

						this.playerXPos = var1;
						this.playerYPos = var8;
						field_334[var1][var8] = -1;
						this.field_232 = 0;
						this.field_234 = 0;
						this.method_61(2, 48, 0);
					} else if (field_334[var1][var8] == 19 || field_334[var1][var8] == 43 || field_334[var1][var8] == 45 || field_334[var1][var8] == 46 || field_334[var1][var8] == 49 || field_334[var1][var8] == 11) {
						field_334[var1][var8] = -1;
						this.method_335(var1, var8);
					}
				}
			}

			if (var3 <= 0 && !var14) {
				if (var11 == var7 && this.method_298(var1, var8) && method_309(var1, var8)) {
					if ((var5 == 0 || var5 == 9) && var6 > 0) {
						this.method_61(2, 48, 0);
					} else if (var5 == 1) {
						field_333[var1][var8] = var4 & -8 | 3;
						field_335[var1][var8] = 18;
						field_334[var1][var8] = 1;
						field_334[var1][var2] = -1;
						this.method_147(var1, var2);
					} else if (var5 == 8) {
						var4 &= -4063233;
					}

					field_333[var1][var2] = var4 & -8 | 0;
				} else if ((method_309(var1, var8) || field_334[var1][var8] == 21) && (!this.method_298(var1, var2) || this.field_234 > 0) && (!this.method_298(var1, var8) && !method_349(field_468, field_469, field_470, field_471 - 1) || this.field_234 > 0 || this.field_240 != 0 || var5 != 0 && var11 == var7)) {
					if (var6 <= 0 && (field_500 == null || field_500[var1][var8] == 0)) {
						var4 = var4 & -4063240 | 0;
						field_333[var1][var2] = var4;
						field_335[var1][var8] = 0;
					} else {
						int var27 = var4 + 131072;
						var4 = var27 & -8 | var7;
						field_333[var1][var8] = var4 | Integer.MIN_VALUE;
						field_335[var1][var8] = 18;
						field_334[var1][var8] = var5;
						field_334[var1][var2] = -1;
						method_345(var1, var2);
						field_336[var1][var2 + 2 * var6] = 24;
						this.method_147(var1, var2);
					}
				} else if (method_344(var1, var8)) {
					if (var6 < 0 && (field_500 == null || field_500[var1][var8] == 0) && field_334[var1][var2 + 1] < 0) {
						field_333[var1][var2 + 1] = var4 & -8 | 3;
						field_333[var1][var2 + 1] |= Integer.MIN_VALUE;
						field_334[var1][var2 + 1] = var5;
						field_335[var1][var2 + 1] = 18;
						field_334[var1][var2] = -1;
					} else if (field_335[var1][var8] <= 0) {
						if ((var4 & 4063232) >> 17 >= 2) {
							if (var5 == 8) {
								field_334[var1][var2] = 54;
								field_333[var1][var2] = 0;
								method_345(var1, var2);
								return;
							}

							if (field_334[var1][var8] == 8) {
								field_334[var1][var8] = 54;
								field_333[var1][var8] = 0;
								method_345(var1, var8);
								return;
							}
						}

						var4 &= -4063233;
						if (method_309(var1 - 1, var2) && method_309(var1 - 1, var8) && !this.method_298(var1 - 1, var2)) {
							field_335[var1][var2] = (byte)(((var4 & 28672) >> 12) + 1);
							field_336[var1][var2] = 24;
							var4 = (var4 & -8 | 4) & -3073 | 2048 | 512;
						} else if (method_309(var1 + 1, var2) && method_309(var1 + 1, var8) && !this.method_298(var1 + 1, var2)) {
							field_335[var1][var2] = (byte)(((var4 & 28672) >> 12) + 1);
							field_336[var1][var2] = 24;
							var4 = (var4 & -8 | 2) & -3073 | 1024 | 512;;
						}

						field_333[var1][var2] = var4;
					}
				} else if (var5 == 8) {
					if ((var4 & 4063232) >> 17 >= 2) {
						field_334[var1][var2] = 54;
						field_333[var1][var2] = 0;
						method_345(var1, var2);
						return;
					}

					var4 &= -4063233;
				} else {
					var4 = (var4 & -3073 | 0) & -4063233 & -8;
					field_333[var1][var2] = var4;
				}
			} else if (!var14) {
				if ((var4 & 512) == 0) {
					if (var11 == 3 && (field_332[var1][var2] & 255) == 6 && var3 <= 12) {
						var3 = (byte)(var3 - (frameCounter & 1));
						field_336[var1][var2] = 24;
					} else {
						var3 = (byte)(var3 - 6);
					}

					if (var3 == 0 || var3 == 12) {
						switch (var4 & 3072) {
						case 1024:
							var4 = var4 & -57 | var4 + 8 & 56;
							break;
						case 2048:
							var4 = var4 & -57 | var4 - 8 & 56;
							break;
						default:
							break;
						}

						if (var3 == 0) {
							if ((field_332[var1][var2] & 255) == 6) {
								var4 &= -449;
							}

							if (var11 == var7) {
								if ((var5 == 0 || var5 == 9) && var6 > 0 && !method_309(var1, var2 + 1)) {
									vibrate(200);
									this.method_433(14);
									this.field_255 = 10;
									if (var5 == 9 && this.field_234 > 0 && this.method_298(var1, var2)) {
										this.method_61(1, 0, 0);
										this.method_96();
									}

									if (!method_344(var1, var2 + 1)) {
										var4 = var4 & -449 | 64;
									}
								}

								field_336[var1][var2] = 30;
								if (!this.method_298(var1, var8)) {
									var4 = var4 & -8 | 0;
								}
							}
						}
					}

					field_335[var1][var2] = var3;
					field_333[var1][var2] = var4;
				} else {
					byte var29;
					byte var31;
					var29 = 0;
					var31 = 0;
					if (var11 == 4) {
						var29 = -1;
					} else if (var11 == 2) {
						var29 = 1;
					}

					if (method_309(var1, var8) && !this.method_298(var1, var8)) {
						if ((var3 = (byte)(var3 - 6)) <= 0) {
							var3 = 0;
							int var26 = var4 & -513;
							var4 = var26 & -8 | 0;
						}

						field_335[var1][var2] = var3;
						field_333[var1][var2] = var4;
						field_336[var1][var2] = 24;
					} else if (method_309(var1 + var29, var2) && !this.method_298(var1 + var29, var2) && method_309(var1 + var29, var8) && !this.method_298(var1 + var29, var8) && (field_333[var1][var8] & 512) == 0) {
						if (var3 >= 6 || (frameCounter & 3) == 0) {
							var3++;
						}

						if (var3 >= 12) {
							var4 &= -513;
							if (var29 != 0) {
								var3 = 6;
								field_334[var1][var2] = -1;
								if (method_309(var1 + var29, var8)) {
									var3 = 12;
									var4 = var4 & -8 | var7;
									var31 = var6;
								}
							} else {
								var4 = var4 & -8 | 0;
								var3 = 0;
							}

							field_333[var1 + var29][var2 + var31] = var4 | Integer.MIN_VALUE;
							field_335[var1 + var29][var2 + var31] = var3;
							field_334[var1 + var29][var2 + var31] = var5;
							method_345(var1, var2);
							field_336[var1][var2 + 2 * var6] = 24;
						} else {
							field_335[var1][var2] = var3;
							field_333[var1][var2] = var4;
							field_336[var1][var2] = 24;
						}
					} else {
						if ((var3 = (byte)(var3 - 6)) <= 0) {
							var3 = 0;
							int var25 = var4 & -513;
							var4 = var25 & -8 | 0;
						}

						field_335[var1][var2] = var3;
						field_333[var1][var2] = var4;
						field_336[var1][var2] = 24;
						this.method_148(var1, var2);
					}
				}
			}

			int var30 = var4 & 536870912;
			byte var32 = field_335[var1][var2];
			int var18 = var4 & 1073741824;
			int var19 = 0;
			if (var30 == 0 && var32 != 0 || var18 == 0 && var10) {
				this.method_147(var1, var2);
			}

			if (var30 != 0 && var32 == 0 || var18 != 0 && !var10) {
				this.method_148(var1, var2);
			}

			var19 = (var4 & 512) != 0 ? 1 : (var32 == 0 && var30 == 0 ? (var10 ? 3 : (field_332[var1][var2] > -1 && field_332[var1][var2] < 38 ? 4 : ((method_309(var1 - 1, var2) || method_309(var1 + 1, var2)) && method_344(var1, var2 + 1) && (field_333[var1][var2 + 1] & 7) == 0 && var1 != this.field_252 && var2 != this.field_253 ? 6 : 0))) : 2);
			var4 = ((var4 & -536870913 | (var32 != 0 ? 536870912 : 0)) & -1073741825 | (var10 ? 1073741824 : 0)) & Integer.MAX_VALUE | (var19 != 0 ? Integer.MIN_VALUE : 0);
			field_333[var1][var2] = var4;
			int var20;
			if ((var20 = ((field_333[var1][var2] & 448) >> 6) - 1) >= 0 && var20 < 5) {
				field_333[var1][var2] = field_333[var1][var2] & -449 | field_333[var1][var2] + 64 & 448;
			}

		}
	}

	// $FF: renamed from: r (int, int) void
	private void method_352(int x, int y) {
		this.method_254(x, y, 3);
		this.collectedDiamonds++; //Add to total diamonds
		field_334[x][y] = -1; //Remove diamond tile
		this.field_156--;
		this.field_254 = 0;
		if (this.field_156 == 0) {
			field_334[this.field_157][this.field_158] = -1;
		}

		if (field_334[x][y - 1] == -1) {
			this.method_147(x, y - 1);
		}

		this.method_147(x, y);
		this.method_96();
	}

	// $FF: renamed from: a (java.lang.String, int, int, int) a
	/**
	 * Loads graphics from an asset pack and initializes all palettes in a specified range
	 * @param path
	 * @param fileNum
	 * @param start Start palette (inclusive)
	 * @param stop End palette (inclusive)
	 * @return Initialized graphics
	 */
	private static ASprite loadGfxFileInitRange(String path, int fileNum, int start, int stop) {
		ASprite gfx = null;

		try {
			gfx = new ASprite();
			byte[] fileData = loadPackedFile(path, fileNum);
			gfx.Load(fileData, 0); //Load graphical data from file

			for (int i = start; i <= stop; i++) {
				gfx.BuildCacheImages(i, 0, -1, -1);
			}

			gfx._crt_pal = start;
			gfx._modules_data = null; //Clear bitmap data
			System.gc();
		} catch (Exception var7) {
		}

		return gfx;
	}

	// $FF: renamed from: a (java.lang.String, int) a
	/**
	 * Loads graphics from an asset pack and intializes their first palette
	 * @param path
	 * @param fileNum
	 * @return Initialized graphics
	 */
	public static ASprite loadGfxFile(String path, int fileNum) {
		return loadGfxFileInit(path, fileNum, 0);
	}

	// $FF: renamed from: a (java.lang.String, int, int) a
	/**
	 * Loads graphics from an asset pack and initiailzes a single palette from them
	 * @param path
	 * @param fileNum
	 * @param palette
	 * @return
	 */
	private static ASprite loadGfxFileInit(String path, int fileNum, int palette) {
		return loadGfxFileInitRange(path, fileNum, palette, palette);
	}

	// $FF: renamed from: a (java.lang.String, int) javax.microedition.lcdui.Image[]
	/**
	 * Loads all sprites with the first palette in Image form from an asset pack
	 * @param path
	 * @param fileNum
	 * @return
	 */
	private static Image[] loadSpritesFromFile(String path, int fileNum) {
		return loadSpritesFromFile(path, fileNum, 0);
	}

	// $FF: renamed from: a (java.lang.String, int, int) javax.microedition.lcdui.Image[]
	/**
	 * Loads all sprites with a speicifed palette in Image form from an asset pack
	 * @param path
	 * @param fileNum
	 * @param palette
	 * @return
	 */
	private static Image[] loadSpritesFromFile(String path, int fileNum, int palette) {
		ASprite bitmapGfx = null;

		try {
			bitmapGfx = new ASprite();
			byte[] fileData = loadPackedFile(path, fileNum);
			bitmapGfx.Load(fileData, 0);
			bitmapGfx.BuildCacheImages(palette, 0, -1, -1);
			method_94(bitmapGfx, false);
			System.gc();
		} catch (Exception var5) {
		}

		return bitmapGfx._modules_image[palette];
	}

	// $FF: renamed from: a (java.lang.String, int) javax.microedition.lcdui.Image
	/**
	 * Loads an Image from an asset pack
	 * @param path
	 * @param fileNum
	 * @return
	 */
	private static Image loadImageFile(String path, int fileNum) {
		Image image = null;

		try {
			byte[] fileData = loadPackedFile(path, fileNum);
			image = Image.createImage(fileData, 0, fileData.length);
			System.gc();
		} catch (Exception var4) {
		}

		return image;
	}

	// $FF: renamed from: a (java.lang.String, int) byte[]
	/**
	 * Loads a standard format packed file and returns it as an array of bytes.
	 * @param file The directory of the file pack.
	 * @param fileNum The number of the file in the pack, starting from 0.
	 * @return The packed file as an array of bytes.
	 */
	public static byte[] loadPackedFile(String file, int fileNum) {
		byte[] fileArr = null;
		InputStream fileStream = file.getClass().getResourceAsStream(file);

		try {
			fileArr = new byte[fileStream.read() << 3];
			fileStream.read(fileArr);
			int fileOffset = getIntFromBytes(fileArr, fileNum << 3);
			int fileSize = getIntFromBytes(fileArr, (fileNum << 3) + 4);
			fileStream.skip((long)fileOffset);
			fileArr = new byte[fileSize];
			fileStream.read(fileArr);
			fileStream.close();
		} catch (Exception var7) {
		}

		return fileArr;
	}

	// $FF: renamed from: ci () void
	private void method_360() {
		if (ASprite._pMapChar == null) {
			InputStream var1 = this.getClass().getResourceAsStream("/mc");
			ASprite._pMapChar = new byte[256];

			try {
				var1.read(ASprite._pMapChar);
				var1.close();
				return;
			} catch (Exception var3) {
			}
		}

	}

	// $FF: renamed from: a (a, java.lang.String, int) int
	public static final int method_361(ASprite gfx, String str, int firstLineOnly) {
		int var3 = str.indexOf('\n');
		if (firstLineOnly != -1 && var3 != -1) {
			str = str.substring(0, var3);
		}

		var3 = str.indexOf('}');
		if (var3 != -1) {
			str = str.substring(0, var3);
		}

		gfx.UpdateStringSize(str);
		return ASprite._text_w;
	}

	// $FF: renamed from: a (a) int
	public static int method_362(ASprite var0) {
		return var0._nLineSpacing + (var0._modules[1] & 255);
	}

	// $FF: renamed from: b (int) void
	public static void method_363(int var0) {
		IGA.field_65 = var0;
	}

	// $FF: renamed from: a (javax.microedition.lcdui.Graphics) boolean
	private boolean method_364(Graphics var1) {
		IGA.field_64++;
		switch (IGA.field_65) {
		case 0:
			this.method_95();
			this.field_472 = new IGA();
			this.method_365();
			this.field_353.method_59();
			method_363(1);
			this.field_473 = false;
			break;
		case 1:
			IGA.method_38();
			field_430 = false;
			break;
		case 2:
			IGA.method_43();
			this.method_95();
			field_222 = 9;
			this.field_265 = 8;
			this.field_266 = 0;
			break;
		case 3:
			this.field_472.method_42(var1);
			break;
		case 4:
			method_363(0);
			this.field_472 = null;
			System.gc();
			return false;
		}

		return true;
	}

	// $FF: renamed from: cj () void
	private void method_365() {
		if ((preferenceData[0] & 1) == 0) {
			this.field_473 = true;
			byte[] var10000 = preferenceData;
			var10000[0] = (byte)(var10000[0] | 1);
			this.initPreferenceRecord();
		}

	}

	// $FF: renamed from: a (java.io.InputStream) int
	/**
	 * Reads an unsigned, little-endian 16-bit integer from an input stream
	 * @param stream Input stream
	 * @return Unsigned 16-bit integer
	 * @throws IOException
	 */
	private static int readU16FromStream(InputStream stream) throws IOException {
		return stream.read() & 255 | (stream.read() & 255) << 8;
	}

	// $FF: renamed from: g (int) int
	/**
	 * Serializes a key code into its bitmask bit.
	 * @param keyCode The key code of the key pressed.
	 * @return
	 */
	private static int serializeKey(int keyCode) {
		if (keyCode < 0) {
			keyCode = Math.abs(keyCode);
		}

		switch (keyCode) {
		case 1:
			return SKEY_UP;
		case 2:
			return SKEY_DOWN;
		case 3:
			return SKEY_LEFT;
		case 4:
			return SKEY_RIGHT;
		case 5:
			return SKEY_CENTER;
		case 6:
			return SKEY_LSH;
		case 7:
			return SKEY_RSH;
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 24:
		case 25:
		case 26:
		case 27:
		case 28:
		case 29:
		case 30:
		case 31:
		case 32:
		case 33:
		case 34:
		case 36:
		case 37:
		case 38:
		case 39:
		case 40:
		case 41:
		case 43:
		case 44:
		case 45:
		case 46:
		case 47:
		default:
			return 0;
		case 23:
			return SKEY_CENTER_ALT;
		case KEY_POUND:
			return SKEY_POUND;
		case KEY_STAR:
			return SKEY_STAR;
		case KEY_NUM0:
			return SKEY_NUM0;
		case KEY_NUM1:
			return SKEY_NUM1;
		case KEY_NUM2:
			return SKEY_NUM2;
		case KEY_NUM3:
			return SKEY_NUM3;
		case KEY_NUM4:
			return SKEY_NUM4;
		case KEY_NUM5:
			return SKEY_NUM5;
		case KEY_NUM6:
			return SKEY_NUM6;
		case KEY_NUM7:
			return SKEY_NUM7;
		case KEY_NUM8:
			return SKEY_NUM8;
		case KEY_NUM9:
			return SKEY_NUM9;
		}
	}

	// $FF: renamed from: ck () void
	private void method_368() {
		if (this.field_155) {
			if (field_503 == null) {
				field_503 = new int[this.currentLevelWidth][this.currentLevelHeight];
			}

			for (int var1 = 0; var1 < this.currentLevelWidth; ++var1) {
				System.arraycopy(field_500[var1], 0, field_503[var1], 0, this.currentLevelHeight);
			}

			if (field_504 == null) {
				field_504 = new long[15];
			}

			System.arraycopy(field_501, 0, field_504, 0, field_501.length);
			if (field_505 == null) {
				field_505 = new long[15];
			}

			System.arraycopy(field_502, 0, field_505, 0, field_502.length);
			this.field_488 = this.field_487;
			this.field_489 = this.field_475;
			this.field_490 = this.field_476;
			this.field_491 = this.field_477;
			this.field_492 = this.field_478;
			this.field_493 = this.field_481;
			this.field_494 = this.field_482;
			this.field_495 = this.field_483;
			this.field_496 = this.field_484;
			this.field_497 = this.field_485;
			this.field_498 = this.field_486;
			field_506 = this.field_474;
			this.field_507 = this.field_479;
			this.field_508 = this.field_480;
		}
	}

	// $FF: renamed from: cl () void
	private void method_369() {
		this.field_474 = field_506;
		this.field_479 = this.field_507;
		this.field_480 = this.field_508;

		for (int var1 = 0; var1 < this.currentLevelWidth; ++var1) {
			System.arraycopy(field_503[var1], 0, field_500[var1], 0, this.currentLevelHeight);
		}

		System.arraycopy(field_504, 0, field_501, 0, field_501.length);
		System.arraycopy(field_505, 0, field_502, 0, field_502.length);
		this.field_487 = this.field_488;
		this.field_475 = this.field_489;
		this.field_476 = this.field_490;
		this.field_477 = this.field_491;
		this.field_478 = this.field_492;
		this.field_481 = this.field_493;
		this.field_482 = this.field_494;
		this.field_483 = this.field_495;
		this.field_484 = this.field_496;
		this.field_485 = this.field_497;
		this.field_486 = this.field_498;
	}

	// $FF: renamed from: cm () void
	private void method_370() {
		if (this.field_155) {
			this.method_371();
			field_500 = new int[this.currentLevelWidth][this.currentLevelHeight];
			this.method_293();
		}

	}

	// $FF: renamed from: cn () void
	private void method_371() {
		if (this.field_155) {
			field_501 = new long[15];
			field_504 = new long[15];
			field_502 = new long[15];
			field_505 = new long[15];
			this.field_487 = 3;
			this.field_474 = true;
			this.field_475 = -1;
			this.field_476 = 0;
			this.field_477 = 0;
			this.field_478 = 0;
			this.field_481 = 0;
			this.field_482 = 0;
			this.field_483 = 0;
			this.field_484 = 0;
			this.field_485 = 0;
			this.field_486 = -1;
			this.field_479 = 0;
			this.field_480 = 0;
		}

	}

	// $FF: renamed from: a (byte, byte, byte, byte) byte
	private byte method_372(byte var1, byte var2, byte var3, byte var4) {
		byte var10000 = 0;

		while(true) {
			byte var5 = var10000;
			if (var10000 >= 15 || method_377(var5, (byte)0, (byte)4) == 0) {
				if (var5 < 15) {
					this.method_378(var5, (byte)1, (byte)0, (byte)4);
					this.method_378(var5, var4, (byte)4, (byte)2);
					this.method_378(var5, var1, (byte)6, (byte)7);
					this.method_378(var5, var1, (byte)27, (byte)7);
					this.method_378(var5, var2, (byte)13, (byte)7);
					this.method_378(var5, var3, (byte)20, (byte)7);
					return var5;
				} else {
					return -1;
				}
			}

			var10000 = (byte)(var5 + 1);
		}
	}

	// $FF: renamed from: a (int, byte, byte, byte) int
	private static int method_373(int var0, byte var1, byte var2, byte var3) {
		return var0 >>> var1 * 9 + var2 & ~(-1 << var3);
	}

	// $FF: renamed from: a (int, int, byte, byte, byte, byte) void
	private void method_374(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
		int var7;
		int var8 = method_373(var7 = field_500[var1][var2], var3, var5, var6);
		byte var9 = (byte)(var3 * 9 + var5);
		var8 <<= var9;
		var7 ^= var8;
		int var10 = var4 << var9;
		var7 |= var10;
		field_500[var1][var2] = var7;
		field_336[var1][var2] = 24;
		field_336[var1][var2 + 1] = 24;
	}

	// $FF: renamed from: a (int, byte, byte) int
	private static int method_375(int var0, byte var1, byte var2) {
		return (int)(field_501[var0 - 1] >>> var1 & ~(-1L << var2));
	}

	// $FF: renamed from: a (int, byte, byte, byte) void
	private void method_376(int var1, byte var2, byte var3, byte var4) {
		long var5 = (long)method_375(var1, var3, var4);
		--var1;
		long var7 = field_501[var1];
		var5 <<= var3;
		var7 ^= var5;
		long var9;
		var9 = (var9 = (long)var2) << var3;
		var7 |= var9;
		field_501[var1] = var7;
	}

	// $FF: renamed from: a (byte, byte, byte) int
	private static int method_377(byte var0, byte var1, byte var2) {
		return (int)(field_502[var0] >>> var1 & ~(-1L << var2));
	}

	// $FF: renamed from: a (byte, byte, byte, byte) void
	private void method_378(byte var1, byte var2, byte var3, byte var4) {
		long var5 = (long)method_377(var1, var3, var4);
		long var7 = field_502[var1];
		var5 <<= var3;
		var7 ^= var5;
		int var9 = var2 << var3;
		var7 |= (long)var9;
		field_502[var1] = var7;
	}

	// $FF: renamed from: b (int, int) byte
	private byte method_379(int var1, int var2) {
		byte var10000 = 0;

		while(true) {
			byte var3 = var10000;
			if (var10000 >= 15) {
				return -1;
			}

			if (var1 == method_377(var3, (byte)13, (byte)7) && var2 == method_377(var3, (byte)20, (byte)7)) {
				return var3;
			}

			var10000 = (byte)(var3 + 1);
		}
	}

	// $FF: renamed from: a (int, int, byte) byte
	private byte method_380(int var1, int var2, byte var3) {
		byte var4;
		if ((var4 = this.method_379(var1, var2)) < 0) {
			return -1;
		} else {
			this.method_378(var4, var3, (byte)0, (byte)4);
			byte var10000;
			switch (var3) {
			case 1:
				var10000 = 38;
				break;
			case 2:
				var10000 = 39;
				break;
			case 3:
				var10000 = 39;
				break;
			default:
				return var4;
			}

			var4 = var10000;
			return var4;
		}
	}

	// $FF: renamed from: co () void
	private void method_381() {
		if (this.field_155) {
			if (this.field_475 >= 0 && this.field_486 >= 0) {
				++this.field_475;
				this.method_384();
			}

			switch (this.field_487) {
			case 1:
				this.field_487 = 2;
				return;
			case 2:
				byte var10000 = 1;

				while(true) {
					byte var1 = var10000;
					if (var10000 > 15) {
						break;
					}

					switch (method_375(var1, (byte)28, (byte)3)) {
					case 1:
					case 6:
					case 7:
						this.method_390(var1);
						break;
					case 2:
						if (this.field_486 >= 0) {
							++this.field_486;
							this.method_385(var1);
						}
						break;
					case 3:
						method_382(var1);
					case 4:
					case 5:
					}

					var10000 = (byte)(var1 + 1);
				}
			case 3:
			default:
				break;
			case 4:
				this.method_383();
				this.field_487 = 2;
				return;
			case 5:
				this.method_399(this.field_481, this.field_482);
			}

		}
	}

	// $FF: renamed from: f (byte) void
	private static void method_382(byte var0) {
		field_501[var0 - 1] = 0L;
	}

	// $FF: renamed from: cp () void
	private void method_383() {
		byte var10000 = 0;

		while(true) {
			byte var1 = var10000;
			if (var10000 >= 15) {
				return;
			}

			if (method_377(var1, (byte)0, (byte)4) == 3) {
				int var2;
				int var3;
				byte var5;
				byte var6;
				label24: {
					label23: {
						var2 = method_377(var1, (byte)13, (byte)7);
						var3 = method_377(var1, (byte)20, (byte)7);
						int var4 = method_377(var1, (byte)4, (byte)2);
						field_502[var1] = 0L;
						var5 = 0;
						var6 = 0;
						switch (var4) {
						case 0:
							++var3;
							var5 = 0;
							var10000 = 0;
							break label23;
						case 1:
							++var2;
							var10000 = 1;
							break;
						case 2:
							--var2;
							var10000 = -1;
							break;
						default:
							break label24;
						}

						var5 = var10000;
						var10000 = 2;
					}

					var6 = var10000;
				}

				this.method_395(var2, var3, (byte)7, var5, var6, this.method_379(var2, var3));
			}

			var10000 = (byte)(var1 + 1);
		}
	}

	// $FF: renamed from: cq () void
	private void method_384() {
		cGame var16;
		byte var10001;
		byte var10002;
		byte var10003;
		byte var10004;
		int var1 = method_375(this.field_484, (byte)14, (byte)6);
		int var2 = method_375(this.field_484, (byte)20, (byte)6);
		label201:
			switch (method_375(this.field_484, (byte)47, (byte)2)) {
			case 0:
				this.method_376(this.field_484, (byte)1, (byte)47, (byte)2);
				byte var11 = (byte)method_375(this.field_484, (byte)49, (byte)5);
				byte var13 = (byte)method_375(this.field_484, (byte)45, (byte)2);
				int var14 = 0;
				if (var13 != 0) {
					if (var13 == 2) {
						while(var1 >= this.field_481 && (byte)(field_334[var1 + 1][var2] - 80) < 0 && field_334[var1 + 1][var2] != 10 && field_334[var1 + 1][var2] != 37 && field_334[var1 + 1][var2] != 34 && field_334[var1 + 1][var2] != 35) {
							++var1;
						}
					} else {
						while(var1 <= this.field_481 && (byte)(field_334[var1 + 1][var2] - 80) < 0 && field_334[var1 + 1][var2] != 10 && field_334[var1 + 1][var2] != 37 && field_334[var1 + 1][var2] != 34 && field_334[var1 + 1][var2] != 35) {
							++var1;
						}
					}
				} else if ((byte)(field_334[var1 + 1][var2] - 80) < 0 && field_334[var1 + 1][var2] != 10 && field_334[var1 + 1][var2] != 37 && field_334[var1 + 1][var2] != 34 && field_334[var1 + 1][var2] != 35) {
					while((byte)(field_334[var1 + 1][var2] - 80) < 0 && field_334[var1 + 1][var2] != 10 && field_334[var1 + 1][var2] != 37 && field_334[var1 + 1][var2] != 34 && field_334[var1 + 1][var2] != 35) {
						++var1;
					}
				} else {
					while(var14 < var11) {
						++var14;
						if ((byte)(field_334[var1][var2] - 80) < 0 && field_334[var1][var2] != 10 && field_334[var1][var2] != 37 && field_334[var1][var2] != 34 && field_334[var1][var2] != 35) {
							var14 = var11;
						} else {
							--var1;
						}
					}
				}

				if (this.field_483 != 2 && var1 <= this.field_481) {
					while((byte)(field_334[var1 + 1][var2] - 80) < 0 && field_334[var1 + 1][var2] != 10 && field_334[var1 + 1][var2] != 37 && field_334[var1 + 1][var2] != 34 && field_334[var1 + 1][var2] != 35) {
						++var1;
					}
				}

				this.method_376(this.field_484, (byte)var1, (byte)14, (byte)6);
				byte var17 = 1;

				while(true) {
					byte var15 = var17;
					if ((byte)(field_334[var1 - var15][var2] - 80) >= 0 || field_334[var1 - var15][var2] == 10 || field_334[var1 - var15][var2] == 37 || field_334[var1 - var15][var2] == 34 || field_334[var1 - var15][var2] == 35) {
						var16 = this;
						var10001 = this.field_484;
						var10002 = var15;
						var10003 = 49;
						var10004 = 5;
						break label201;
					}

					var17 = (byte)(var15 + 1);
				}
			case 1:
				if (var2 == this.field_485) {
					this.field_475 = -1;
					this.field_486 = -1;
					method_382(this.field_484);
					this.field_487 = 4;
					return;
				}

				byte var4 = (byte)method_375(this.field_484, (byte)49, (byte)5);
				if (this.field_475 != 0 && this.field_475 % var4 == 0) {
					this.field_475 = 0;
					byte var5;
					if ((var5 = (byte)method_375(this.field_484, (byte)26, (byte)2)) >= 0) {
						byte var10000 = 0;

						while(true) {
							byte var6 = var10000;
							if (var10000 >= var4) {
								if (var5 == 2) {
									this.method_376(this.field_484, (byte)0, (byte)47, (byte)2);
									this.method_376(this.field_484, (byte)0, (byte)26, (byte)2);
									++var2;
									var16 = this;
									var10001 = this.field_484;
									var10002 = (byte)var2;
									var10003 = 20;
									var10004 = 6;
								} else {
									var16 = this;
									var10001 = this.field_484;
									var10002 = ++var5;
									var10003 = 26;
									var10004 = 2;
								}
								break label201;
							}

							method_394(var1 - var6, var2, var5);
							int var8 = var2;
							byte var7;
							if ((var7 = (byte)(var5 + 1)) > 2) {
								var7 = 0;
								var8 = var2 + 1;
							}

							label222: {
								int var9 = method_373(field_500[var1 - var6][var8], var7, (byte)3, (byte)4);
								if (var8 == this.field_485 && var5 == 2) {
									if (var9 == 0 || var9 == 3) {
										break label222;
									}
								} else if (var9 == 12 || var9 == 9) {
									break label222;
								}

								this.method_374(var1 - var6, var8, var7, (byte)7, (byte)3, (byte)4);
							}

							var10000 = (byte)(var6 + 1);
						}
					}
				}

				return;
			default:
				return;
			}

		var16.method_376(var10001, var10002, var10003, var10004);
	}

	// $FF: renamed from: g (byte) void
	private void method_385(byte var1) {
		int var2 = method_375(var1, (byte)14, (byte)6);
		int var3 = method_375(var1, (byte)20, (byte)6);
		int var4 = method_375(var1, (byte)0, (byte)7);
		int var5 = method_375(var1, (byte)7, (byte)7);
		int var6 = method_375(var1, (byte)47, (byte)2);
		byte var7;
		byte var8 = (byte)method_377(var7 = (byte)method_375(var1, (byte)54, (byte)3), (byte)6, (byte)7);
		switch (var6) {
		case 0:
			this.method_376(var1, (byte)1, (byte)47, (byte)2);
			--var3;
			this.method_376(var1, (byte)var3, (byte)20, (byte)6);
			boolean var20 = false;
			if ((byte)(field_334[var2][var3] - 80) < 0 && field_334[var2][var3] != 10 && field_334[var2][var3] != 37 && field_334[var2][var3] != 34 && field_334[var2][var3] != 35) {
				while((byte)(field_334[var2 + 1][var3] - 80) < 0 && field_334[var2 + 1][var3] != 10 && field_334[var2 + 1][var3] != 37 && field_334[var2 + 1][var3] != 34 && field_334[var2 + 1][var3] != 35) {
					var2++;
				}
			} else {
				while((byte)(field_334[var2][var3] - 80) >= 0 || field_334[var2][var3] == 10 || field_334[var2][var3] == 37 || field_334[var2][var3] == 34 || field_334[var2][var3] == 35) {
					var2 += -1;
				}
			}

			this.method_376(var1, (byte)var2, (byte)14, (byte)6);
			byte var31 = 1;

			while(true) {
				byte var21 = var31;
				if ((byte)(field_334[var2 - var21][var3] - 80) >= 0 || field_334[var2 - var21][var3] == 10 || field_334[var2 - var21][var3] == 37 || field_334[var2 - var21][var3] == 34 || field_334[var2 - var21][var3] == 35) {
					this.method_376(var1, var21, (byte)49, (byte)5);
					var8 = (byte)(var8 - var21);
					byte var23 = 0;
					this.field_478 = 0;
					if (var8 < 0) {
						int var24;
						var24 = (var24 = -var8) * 3;
						byte var28 = 0;
						int var15;
						if ((var15 = var21 + var8) * 3 - var21 != 0 && (var15 = var15 * 3) <= var21 * 3 / 2) {
							var28 = 1;
						}

						var24 /= var21;
						this.field_478 = (byte)var24;
						this.field_478 += var28;
						if (this.field_478 > 2) {
							this.method_376(var1, (byte)1, (byte)57, (byte)1);
						}

						var23 = (byte)Math.abs(var8);
						var8 = 0;
					}

					if ((var5 = var5 + (var21 - var23)) > var4) {
						int var27 = var4 - var5;
						var5 += var27;
						var8 = (byte)(var8 - var27);
					}

					this.method_376(var1, (byte)var5, (byte)7, (byte)7);
					this.method_378(var7, var8, (byte)6, (byte)7);
					return;
				}

				var31 = (byte)(var21 + 1);
			}
		case 1:
			byte var9 = (byte)method_375(var1, (byte)49, (byte)5);
			if (this.field_486 != 0 && this.field_486 % var9 == 0) {
				this.field_486 = 0;
				byte var10 = (byte)method_375(var1, (byte)26, (byte)2);
				byte var11 = (byte)method_375(var1, (byte)57, (byte)1);
				if (var10 >= 0) {
					if (var11 != 1) {
						byte var10000 = 0;

						while(true) {
							byte var12 = var10000;
							if (var10000 >= var9) {
								if (this.field_476 > 0) {
									int var13 = var3;
									if ((var12 = (byte)(var10 + 1)) > 2) {
										var12 = 0;
										var13 = var3 + 1;
									}

									var10000 = 0;

									while(true) {
										byte var14 = var10000;
										if (var10000 >= var9) {
											break;
										}

										if ((byte)(field_334[var2 - var14][var13] - 80) < 0 && field_334[var2 - var14][var13] != 10 && field_334[var2 - var14][var13] != 37 && field_334[var2 - var14][var13] != 34 && field_334[var2 - var14][var13] != 35) {
											this.method_374(var2 - var14, var13, var12, (byte)8, (byte)3, (byte)4);
										}

										var10000 = (byte)(var14 + 1);
									}
								}

								++this.field_476;
								break;
							}

							this.method_374(var2 - var12, var3, var10, (byte)7, (byte)3, (byte)4);
							this.method_376(var1, var10, (byte)43, (byte)2);
							this.method_374(var2 - var12, var3, var10, var1, (byte)0, (byte)3);
							var10000 = (byte)(var12 + 1);
						}
					}

					if (var11 == 1 || (var5 >= var4 || var8 == 0) && var10 == this.field_478) {
						if (var11 == 1) {
							this.method_376(var1, (byte)0, (byte)57, (byte)1);
						}

						this.method_376(var1, (byte)3, (byte)28, (byte)3);
						if (var8 == 0) {
							this.method_378(var7, (byte)3, (byte)0, (byte)4);
							this.method_376(var1, (byte)5, (byte)28, (byte)3);
							if (this.field_475 == -1) {
								this.field_486 = -1;
								this.field_487 = 4;
							}

							return;
						}
					}

					if (var10 == 0) {
						this.method_376(var1, (byte)0, (byte)47, (byte)2);
						this.method_376(var1, (byte)2, (byte)26, (byte)2);
						return;
					}

					this.method_376(var1, --var10, (byte)26, (byte)2);
					return;
				}
			}
		}

	}

	// $FF: renamed from: a (byte, int, int, byte, byte, byte, boolean) byte
	private byte method_386(byte var1, int var2, int var3, byte var4, byte var5, byte var6, boolean var7) {
		byte var8 = 0;
		if ((byte)(field_334[var2 + var6][var3] - 80) < 0 && field_334[var2 + var6][var3] != 10 && field_334[var2 + var6][var3] != 37 && field_334[var2 + var6][var3] != 34 && field_334[var2 + var6][var3] != 35) {
			var8 = var6;
			if (var4 != var6) {
				this.method_376(var1, var6 < 0 ? 2 : var6, (byte)45, (byte)2);
			}

			var2 += var6;
			this.method_376(var1, (byte)var2, (byte)31, (byte)6);
			this.method_374(var2, var3, var5, var1, (byte)0, (byte)3);
			if (var7) {
				method_394(var2, var3, var5);
			} else {
				int var9 = 0;
				byte var10 = 0;
				int var11 = method_375(var1, (byte)28, (byte)3);
				byte var10000;
				if (var6 > 0) {
					var9 = var11 == 6 && this.field_481 == var2 && this.field_482 == var3 ? 11 : 4;
					var10000 = 9;
				} else {
					var9 = var11 == 6 && this.field_481 == var2 && this.field_482 == var3 ? 14 : 5;
					var10000 = 12;
				}

				var10 = var10000;
				cGame var16;
				int var10001;
				int var10002;
				byte var10003;
				int var10004;
				if ((byte)(field_334[var2][var3 + 1] - 80) < 0 && field_334[var2 + var6][var3] != 10 && field_334[var2 + var6][var3] != 37 && field_334[var2 + var6][var3] != 34 && field_334[var2 + var6][var3] != 35) {
					var16 = this;
					var10001 = var2;
					var10002 = var3;
					var10003 = var5;
					var10004 = var10;
				} else {
					var16 = this;
					var10001 = var2;
					var10002 = var3;
					var10003 = var5;
					var10004 = var9;
				}

				var16.method_374(var10001, var10002, var10003, (byte)var10004, (byte)3, (byte)4);
			}
		} else {
			var8 = -2;
		}

		return var8;
	}

	// $FF: renamed from: d (int) boolean
	private boolean method_387(int var1) {
		return var1 != -1 && method_388(var1, (byte)6, (byte)1) == 1;
	}

	// $FF: renamed from: a (int, byte, byte) byte
	private static byte method_388(int var0, byte var1, byte var2) {
		return (byte)(var0 >>> var1 & ~(0xFFFFFF << var2));
	}

	// $FF: renamed from: a (int, int, int) boolean
	private static boolean method_389(int var0, int var1, int var2) {
		boolean var3 = true;
		boolean var10000 = true;

		label83:
			while(true) {
				boolean var4 = var10000;

				while(var4) {
					var4 = true;
					var0 -= var2;
					if (var2 != 0) {
						if ((byte)(field_334[var0][var1 + 1] - 80) < 0 && field_334[var0][var1 + 1] != 10 && field_334[var0][var1 + 1] != 37 && field_334[var0][var1 + 1] != 34 && field_334[var0][var1 + 1] != 35) {
							var4 = false;
						}

						if ((byte)(field_334[var0][var1] - 80) >= 0 || field_334[var0][var1] == 10 || field_334[var0][var1] == 37 || field_334[var0][var1] == 34 || field_334[var0][var1] == 35) {
							var3 = var4;
							var10000 = false;
							continue label83;
						}

						if (!var4) {
							return var4;
						}
					} else if ((byte)(field_334[var0 - 1][var1] - 80) >= 0 || field_334[var0 - 1][var1] == 10 || field_334[var0 - 1][var1] == 37 || field_334[var0 - 1][var1] == 34 || field_334[var0 - 1][var1] == 35 && (byte)(field_334[var0 + 1][var1] - 80) >= 0 || field_334[var0 + 1][var1] == 10 || field_334[var0 + 1][var1] == 37 || field_334[var0 + 1][var1] == 34 || field_334[var0 + 1][var1] == 35) {
						var3 = true;
						var10000 = false;
						continue label83;
					}
				}

				return var3;
			}
	}

	// $FF: renamed from: h (byte) void
	private void method_390(byte var1) {
		int var2 = method_375(var1, (byte)31, (byte)6);
		int var3 = method_375(var1, (byte)37, (byte)6);
		byte var4 = (byte)method_375(var1, (byte)43, (byte)2);
		byte var5 = (byte)method_373(field_500[var2][var3], var4, (byte)7, (byte)2);
		byte var6 = (byte)method_375(var1, (byte)45, (byte)2);
		boolean var8 = (byte)method_375(var1, (byte)28, (byte)3) == 7;
		byte var9 = 0;
		if (var6 > 1) {
			var6 = -1;
		}

		if (var5 == 0) {
			byte var10 = (byte)(var4 + 1);
			int var11 = var3;
			if (var4 == 2) {
				var10 = 0;
				var11 = var3 + 1;
			}

			if (method_373(field_500[var2][var11], var10, (byte)3, (byte)4) == 7) {
				this.field_476 = 1;
				if (var8) {
					method_382(var1);
					this.field_487 = 3;
					this.field_474 = true;
					return;
				}

				int var12;
				if ((var12 = var10 - 1) < 0) {
					var12 = 2;
				}

				this.field_486 = 0;
				byte var13 = (byte)method_373(field_500[var2][var11], var10, (byte)0, (byte)3);
				byte var14 = (byte)method_375(var1, (byte)54, (byte)3);
				this.method_376(var13, var14, (byte)54, (byte)3);
				this.method_376(var13, (byte)2, (byte)28, (byte)3);
				this.method_376(var13, (byte)0, (byte)47, (byte)2);
				this.method_376(var13, (byte)var12, (byte)26, (byte)2);
				this.method_376(var13, (byte)var2, (byte)14, (byte)6);
				this.method_376(var13, (byte)var11, (byte)20, (byte)6);
				this.method_376(var13, (byte)0, (byte)57, (byte)1);
				method_382(var1);
				return;
			}
		}

		if (var4 == 2 && var5 == 0) {
			if ((byte)(field_334[var2][var3 + 1] - 80) < 0 && field_334[var2][var3 + 1] != 10 && field_334[var2][var3 + 1] != 37 && field_334[var2][var3 + 1] != 34 && field_334[var2][var3 + 1] != 35) {
				if (var6 != 0) {
					var6 = 0;
					this.method_376(var1, (byte)0, (byte)45, (byte)2);
				}
			} else {
				label90: {
					cGame var10000;
					byte var10001;
					int var10002;
					int var10003;
					byte var10004;
					byte var10005;
					byte var10006;
					if (var6 == 0) {
						if (var8) {
							method_394(var2, var3, var4);
						} else {
							this.method_374(var2, var3, var4, (byte)15, (byte)3, (byte)4);
						}

						if ((var9 = this.method_386(var1, var2, var3, var6, var4, (byte)1, var8)) >= 0) {
							if ((byte)(field_334[var2 + -1][var3] - 80) < 0 && field_334[var2 + -1][var3] != 10 && field_334[var2 + -1][var3] != 37 && field_334[var2 + -1][var3] != 34 && field_334[var2 + -1][var3] != 35) {
								this.method_395(var2 - 1, var3, (byte)(var8 ? 7 : 5), (byte)-1, (byte)2, (byte)method_375(var1, (byte)54, (byte)3));
							}
							break label90;
						}

						var10000 = this;
						var10001 = var1;
						var10002 = var2;
						var10003 = var3;
						var10004 = var6;
						var10005 = var4;
						var10006 = -1;
					} else {
						var10000 = this;
						var10001 = var1;
						var10002 = var2;
						var10003 = var3;
						var10004 = var6;
						var10005 = var4;
						var10006 = var6;
					}

					var9 = var10000.method_386(var10001, var10002, var10003, var10004, var10005, var10006, var8);
				}

				if (var9 == -2) {
					int var15 = field_333[var2][var3 + 1];
					cGame var16;
					byte var17;
					byte var18;
					byte var19;
					byte var20;
					if (this.method_387(var15) && method_389(var2, var3, var6)) {
						this.field_476 = 0;
						this.field_486 = 0;
						this.method_376(var1, (byte)2, (byte)28, (byte)3);
						this.method_376(var1, method_388(var15, (byte)0, (byte)6), (byte)0, (byte)7);
						this.method_376(var1, (byte)2, (byte)26, (byte)2);
						this.method_376(var1, (byte)var2, (byte)14, (byte)6);
						var16 = this;
						var17 = var1;
						var18 = (byte)(var3 + 1);
						var19 = 20;
						var20 = 6;
					} else {
						var16 = this;
						var17 = var1;
						var18 = 3;
						var19 = 28;
						var20 = 3;
					}

					var16.method_376(var17, var18, var19, var20);
					var2 += var6;
				} else {
					var6 = var9;
					var2 += var9;
				}
			}
		}

		if (var9 != -2) {
			switch (var6) {
			case -1:
			case 1:
				this.method_391(var2, var3, var4, var5);
				break;
			case 0:
				this.method_392(var1, var2, var3, var4, var8);
				return;
			}
		}

	}

	// $FF: renamed from: a (int, int, byte, byte) void
	private void method_391(int var1, int var2, byte var3, byte var4) {
		if (++var4 > 2) {
			var4 = 0;
		}

		this.method_374(var1, var2, var3, var4, (byte)7, (byte)2);
	}

	// $FF: renamed from: a (byte, int, int, byte, boolean) void
	private void method_392(byte var1, int var2, int var3, byte var4, boolean var5) {
		if (!var5 && method_373(field_500[var2][var3], var4, (byte)3, (byte)4) == 0) {
			this.method_374(var2, var3, var4, (byte)3, (byte)3, (byte)4);
		}

		if (++var4 > 2) {
			var4 = 0;
			++var3;
			this.method_376(var1, (byte)var3, (byte)37, (byte)6);
		}

		this.method_376(var1, var4, (byte)43, (byte)2);
		cGame var10000;
		int var10001;
		int var10002;
		byte var10003;
		byte var10004;
		if (var5) {
			var10000 = this;
			var10001 = var2;
			var10002 = var3;
			var10003 = var4;
			var10004 = 6;
		} else {
			this.method_374(var2, var3, var4, var1, (byte)0, (byte)3);
			var10000 = this;
			var10001 = var2;
			var10002 = var3;
			var10003 = var4;
			var10004 = 0;
		}

		var10000.method_374(var10001, var10002, var10003, var10004, (byte)3, (byte)4);
	}

	// $FF: renamed from: s (int, int) void
	private void method_393(int var1, int var2) {
		this.field_487 = 1;
		this.method_395(var1, var2 + 1, (byte)0, (byte)0, (byte)0, this.method_379(var1, var2));
	}

	// $FF: renamed from: c (int, int, byte) void
	private static void method_394(int var0, int var1, byte var2) {
		int var3 = field_500[var0][var1];
		byte var4 = (byte)(var2 * 9);
		int var5 = (var3 >>> var4 & 511) << var4;
		var3 ^= var5;
		field_500[var0][var1] = var3;
		field_336[var0][var1] = 24;
	}

	// $FF: renamed from: a (int, int, byte, byte, byte, byte) byte
	private byte method_395(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
		byte var10000 = 1;

		while(true) {
			byte var7 = var10000;
			if (var10000 > 15 || method_375(var7, (byte)28, (byte)3) == 0) {
				field_501[var7 - 1] = 0L;
				if (var3 == 7) {
					method_394(var1, var2, var5);
					this.method_376(var7, (byte)7, (byte)28, (byte)3);
				} else {
					this.method_376(var7, (byte)1, (byte)28, (byte)3);
					this.method_376(var7, var6, (byte)54, (byte)3);
					this.method_374(var1, var2, var5, var7, (byte)0, (byte)3);
					this.method_374(var1, var2, var5, var3, (byte)3, (byte)4);
				}

				this.method_376(var7, (byte)var1, (byte)31, (byte)6);
				this.method_376(var7, (byte)var2, (byte)37, (byte)6);
				this.method_376(var7, var5, (byte)43, (byte)2);
				if (var4 < 0) {
					var4 = 2;
				}

				this.method_376(var7, var4, (byte)45, (byte)2);
				return var7;
			}

			var10000 = (byte)(var7 + 1);
		}
	}

	// $FF: renamed from: a (int, int, int, byte) int
	private int method_396(int var1, int var2, int var3, byte var4) {
		byte var5;
		int var6 = method_375(var5 = (byte)method_373(var3, var4, (byte)0, (byte)3), (byte)31, (byte)6);
		int var7 = method_375(var5, (byte)37, (byte)6);
		int var8 = method_375(var5, (byte)43, (byte)2);
		int var9 = method_373(var3, var4, (byte)3, (byte)4);
		if (var6 == var1 && var7 == var2 && var8 == var4) {
			byte var10000;
			switch (var9) {
			case 4:
				var10000 = 1;
				break;
			case 5:
				var10000 = 2;
				break;
			default:
				return var9 << 1;
			}

			var9 = var10000;
			return var9 << 1;
		} else {
			switch (var9) {
			case 6:
				method_394(var1, var2, var4);
			default:
				return var9 << 1;
			}
		}
	}

	// $FF: renamed from: t (int, int) void
	private void method_397(int var1, int var2) {
		if (this.field_155) {
			this.field_483 = field_500[var1 - 1][var2] != 0 ? -1 : (field_500[var1 + 1][var2] != 0 ? 1 : 0);
			if (this.field_483 == 0) {
				this.field_483 = field_500[var1][var2 - 1] != 0 ? 2 : 0;
			}

			if (this.field_483 != 0) {
				this.field_487 = 5;
				this.method_433(13);
				this.field_481 = var1;
				this.field_482 = var2;
			}
		}

	}

	// $FF: renamed from: f (int, int) int
	private int method_398(int var1, int var2) {
		byte var3 = 0;
		boolean var4 = true;
		int var5 = 0;
		int var6 = this.field_483;
		int var7 = 0;

		while(true) {
			int var8;
			for (var8 = 0; field_500[var1 + var6][var2 - 1] != 0 && (byte)(field_334[var1][var2] - 80) >= 0 || field_334[var1][var2] == 10 || field_334[var1][var2] == 37 || field_334[var1][var2] == 34 || field_334[var1][var2] == 35; var1 += var6) {
			}

			int var10000 = 0;

			while(true) {
				var5 = var10000;
				if ((byte)(field_334[var1 + var5][var2] - 80) >= 0 || field_334[var1 + var5][var2] == 10 || field_334[var1 + var5][var2] == 37 || field_334[var1 + var5][var2] == 34 || field_334[var1 + var5][var2] == 35) {
					var5 = Math.abs(var5);
					var7 += var5;
					++var2;

					while(field_500[var1][var2] == 0) {
						var1 += var6;
						if (var8 >= var5 || var1 < 0 || var1 == this.currentLevelWidth) {
							if (var7 > 0) {
								this.method_376(var3, (byte)var7, (byte)7, (byte)7);
							}

							return var7;
						}

						++var8;
					}
					break;
				}

				if (var4) {
					var4 = false;
					var3 = this.method_395(var1, var2, (byte)8, (byte)-2, (byte)2, (byte)0);
					this.method_376(var3, (byte)5, (byte)28, (byte)3);
					this.method_376(var3, (byte)var1, (byte)14, (byte)6);
					this.method_376(var3, (byte)var2, (byte)20, (byte)6);
				}

				this.method_374(var1 + var5, var2, (byte)2, var3, (byte)0, (byte)3);
				var10000 = var5 + var6;
			}
		}
	}

	// $FF: renamed from: u (int, int) void
	private void method_399(int var1, int var2) {
		this.field_475 = 0;
		int var3 = 0;
		int[] var10000;
		int var10001;
		if (this.field_483 > 1) {
			var10000 = field_500[var1];
			var10001 = var2 - 1;
		} else {
			var10000 = field_500[var1 + this.field_483];
			var10001 = var2;
		}

		var3 = var10000[var10001];
		this.field_484 = (byte)method_373(var3, (byte)2, (byte)0, (byte)3);
		this.method_376(this.field_484, (byte)0, (byte)47, (byte)2);
		int var4 = method_375(this.field_484, (byte)7, (byte)7);
		int var5 = 0;
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;
		int var9 = 0;
		switch (this.field_483) {
		case 2:
			var5 = 0;
			var6 = var1;
			var7 = var2;
			var8 = var4;
			var9 = var2 - 1;
			this.field_481 = this.field_482 = -1;
			break;
		default:
			var5 = this.field_483;
			var6 = var1 + var5;
			var5 = var5 < 0 ? 1 : 2;
			var7 = var2 + 1;
			var8 = var4 - this.method_398(var6, var7);
			var9 = var2;
			this.field_481 = var1;
			this.field_482 = var2;
		}

		byte var10;
		label31: {
			int var10002;
			byte var10003;
			byte var10004;
			byte var10005;
			cGame var18 = null; //NOTE: ADDED AS DITY FIX FROM PROCYON OUTPUT
			label30: { //FIXME: THIS MAY BE BETTER AS A WHILE LOOP, CHECK PROCYON OUTPUT
				this.method_376(this.field_484, (byte)var5, (byte)45, (byte)2);
				this.field_485 = var7;
				this.method_372((byte)var8, (byte)var6, (byte)var9, (byte)var5);
				var10 = this.method_379(var6, var9);
				this.method_378(var10, (byte)2, (byte)0, (byte)4);
				this.field_487 = 1;
				switch (this.field_483) {
				case -1:
					var18 = this;
					var10001 = var6 + 1;
					var10002 = var2;
					var10003 = 11;
					var10004 = 1;
					break;
				case 0:
				default:
					break label31;
				case 1:
					var18 = this;
					var10001 = var6 - 1;
					var10002 = var2;
					var10003 = 14;
					var10004 = -1;
					break;
				case 2:
					var18 = this;
					var10001 = var6;
					var10002 = var2;
					var10003 = 3;
					var10004 = 0;
					var10005 = 0;
					break label30;
				}

				var10005 = 2;
			}

			var10 = var18.method_395(var10001, var10002, var10003, var10004, var10005, var10);
		}

		this.method_376(var10, (byte)6, (byte)28, (byte)3);
		this.field_483 = 0;
	}

	// $FF: renamed from: v (int, int) void
	private void method_400(int var1, int var2) {
		if (this.method_380(var1, var2, (byte)2) > 0) {
			field_334[var1][var2] = -1;
			this.method_393(var1, var2);
		}

	}

	// $FF: renamed from: b (a, int) int
	private static int method_401(ASprite var0, int var1) {
		int var2 = (var1 << 2) + 3;
		return var0._frames_rc[var2] & 255;
	}

	// $FF: renamed from: c (a, int) int
	private static int method_402(ASprite var0, int var1) {
		int var2 = (var1 << 2) + 2;
		return var0._frames_rc[var2] & 255;
	}

	// $FF: renamed from: A (int) void
	private static void method_403(int var0) {
		try {
			field_321 = var0 <= 4 ? loadGfxFile("/tips.f", var0) : null;
			ByteArrayInputStream var1;
			int var2 = (var1 = new ByteArrayInputStream(loadPackedFile("/tipst.f", 0))).read();
			var0 %= var2;
			byte[] var3 = new byte[(var2 + 1) * 2];
			var1.read(var3);
			int var4 = getShortFromBytes(var3, var0 << 1);
			int var5 = getShortFromBytes(var3, var0 + 1 << 1);
			var1.skip((long)var4);
			field_322 = new byte[var5 - var4];
			var1.read(field_322);
			var1.close();
		} catch (Exception var6) {
		}
	}

	// $FF: renamed from: cr () void
	private void method_404() {
		field_320[41]._nLineSpacing = 5;
		int var22 = 0;
		++var22;
		byte var2 = field_322[0];
		this.field_388 = false;
		Graphics var3;
		(var3 = this.field_314).setColor(0x0C2F39); //Tip box background color
		var3.fillRoundRect(20, 60, 200, 200, 8, 8);
		var3.setColor(0xCE9B00); //Tip box border color
		var3.drawRoundRect(20, 60, 200, 200, 8, 8);
		int var4 = 0;
		boolean var5 = true;

		for (int var6 = 0; var6 <= var2; ++var6) {
			if (var6 == var2) {
				if (!var5) {
					return;
				}

				var5 = false;
				var6 = -1;
				var22 = 1;
				var4 -= 4;
				var4 = 60 + (200 - var4 >> 1);
			} else {
				label35: {
					int var27;
					int var10000;
					if (field_322[var22++] == 0) {
						var22 += 2;
						var22 += 2;
						int var10 = getShortFromBytes(field_322, var22);
						var22 += 2;
						int var11 = var22; //NOTE: ADDED TO MATCH PROCYON OUTPUT, BASED ON N95 1.0.3 DECOMP
						int var19 = var22 + var10;
						byte var12 = field_322[var19++];
						int n7 = var19; //NOTE: ADDED BASED ON PROCYON OUTPUT
						var22 = var19 + var12;
						var4 -= 3;
						var10000 = var4;
						var27 = this.method_406(var3, field_322, field_320[41], var11, var10, var5 ? -1 : var4, field_321, n7, 192); //NOTE: CHANGED TO MATCH PROCYON OUTPUT
					} else {
						int var21 = var22 + 2;
						var22 = var21 + 2;
						int var25 = field_322[var22++] & 255;
						if (field_321 == null) {
							break label35;
						}

						if (!var5) {
							field_321.PaintFrame(var3, var25, (240 - field_321._frames_rc[(var25 << 2) + 2] & 255) >> 1, var4, 0, 0, 0);
						}

						var10000 = var4;
						var27 = field_321._frames_rc[(var25 << 2) + 3] & 255;
					}

					var4 = var10000 + var27;
				}

				var4 += 4;
			}
		}

	}

	// $FF: renamed from: a (javax.microedition.lcdui.Graphics, a, java.lang.String, int, int, int, int, boolean) void
	/**
	 * Shows a dialog on-screen
	 * @param var0
	 * @param fSprite Font sprite
	 * @param text Dialog string
	 * @param x X position
	 * @param y Y position
	 * @param flags Rendering flags.<br>
	 * Bit 5 = Offset position by text height <br>
	 * Bit 3 = Offset position by text width<br>
	 * Bit 1 = Offset position by half of text height<br>
	 * Bit 0 = Offset position by half of text width
	 * @param var6
	 * @param firstLineOnly Unknown
	 */
	private static void renderDialog(Graphics var0, ASprite fSprite, String text, int x, int y, int flags, int var6, boolean firstLineOnly) {
		fSprite._nLineSpacing = var6;
		if (text.endsWith("\n")) {
			text = text.substring(0, text.length() - 1);
		}

		int textWidth; //Pixel width of rendered text
		int textHeight; //Pixel height of rendered text
		int var10;
		int var11;
		text = method_441(text, 230);
		textWidth = method_361(fSprite, text, firstLineOnly ? -1 : 0);
		textHeight = fSprite.GetStringHeight(text);
		var10 = x;
		var11 = y;
		if ((flags & 32) != 0) {
			var11 = y - textHeight;
		} else if ((flags & 2) != 0) {
			var11 = y - (textHeight >> 1);
		}

		if ((flags & 8) != 0) {
			var10 = x - textWidth;
		} else if ((flags & 1) != 0) {
			var10 = x - (textWidth >> 1);
		}

		var0.setColor(0x0C2F39); //Dialog background color
		var0.fillRoundRect(var10 - 5, var11 - 5, textWidth + 10, textHeight + 10, 10, 10);
		var0.setColor(0xCE9B00); //Dialog border color
		var0.drawRoundRect(var10 - 5, var11 - 5, textWidth + 10, textHeight + 10, 10, 10);
		fSprite.DrawPage(var0, text, x, y, flags);
	}

	// $FF: renamed from: a (javax.microedition.lcdui.Graphics, byte[], a, int, int, int, a, int, int) int
	private int method_406(Graphics var1, byte[] var2, ASprite var3, int var4, int var5, int var6, ASprite var7, int var8, int var9) {
		int var10 = 0;
		var6 -= var3._fmodules[2];
		int var11 = var3._nLineSpacing + (var3._modules[1] & 255);
		int var12 = 0;
		int var13 = var6;
		boolean var14 = var6 != -1;
		int var15 = var3._crt_pal;
		int var16 = var4;
		boolean var17 = true;
		int var18 = var4;
		int var19 = 0;

		for (int var21 = var4; var21 <= var4 + var5; ++var21) {
			int var22 = 10;
			if (var21 < var4 + var5) {
				var22 = var2[var21] & 255;
			}

			if (var17 && var12 > var9) {
				var12 = var19;
				var2[var18] = 10;
				var21 = var18 - 1;
			} else if (var22 == 10) {
				if (var17 && var14) {
					var12 = 120 - (var12 >> 1);
					var21 = var16 - 1;
					var10 = 0;
				} else {
					var12 = 0;
					var16 = var21 + 1;
					var13 += var11;
					var11 = var3._nLineSpacing + (var3._modules[1] & 255);
				}

				if (var14) {
					var17 = !var17;
				}
			} else {
				int var28;
				int var30;
				label105: {
					byte[] var10000;
					if (var22 > 32) {
						if (var22 == 64 && var7 != null) {
							if (!var17 && var14) {
								var7.PaintFrame(var1, var2[var10 + var8], var12, var13, 0, 0, 0);
							}

							var12 += method_402(var7, var2[var10 + var8]);
							int var23;
							if ((var23 = method_401(var7, var2[var10 + var8])) > var11) {
								var11 = var23;
							}

							++var10;
							continue;
						}

						var10000 = ASprite._pMapChar;
						var30 = var22;
					} else {
						if (var22 == 32) {
							var18 = var21;
							var19 = var12;
							var28 = var12;
							var30 = var3._modules[0] & 255;
							break label105;
						}

						if (var22 == 1) {
							++var21;
							var3._crt_pal = var2[var21];
							continue;
						}

						if (var22 != 2) {
							continue;
						}

						++var21;
						var10000 = var2;
						var30 = var21;
					}

					int var10002;
					if ((var22 = var10000[var30] & 255) >= var3.GetFModules(0)) {
						int var26 = var22 - var3.GetFModules(0);
						if (!var17 && var14) {
							var3.PaintFrame(var1, var26, var12, var13, 0, 0, 0);
						}

						var28 = var12;
						var30 = var3._frames_rc[(var26 << 2) + 2] & 255;
						var10002 = var3._frames_rc[var26 << 2] & 255;
					} else {
						int var27 = (var3._fmodules[var22 << 2] & 255) << 1;
						if (!var17 && var14) {
							var3.PaintFModule(var1, 0, var22, var12, var13, 0);
						}

						var28 = var12;
						var30 = var3._modules[var27] & 255;
						var10002 = var3._fmodules[(var22 << 2) + 1];
					}

					var30 -= var10002;
				}

				var12 = var28 + var30 + var3._fmodules[1];
			}
		}

		var3._crt_pal = var15;
		return var13 - var6;
	}

	// $FF: renamed from: cs () void
	private void method_407() {
		this.field_373 = false;
		method_94(field_320[23], true);
		field_320[23] = null;
		method_94(field_320[24], true);
		field_320[24] = null;
		method_94(field_320[25], true);
		field_320[25] = null;
		method_94(field_320[26], true);
		field_320[26] = null;
		method_94(field_320[17], true);
		field_320[17] = null;
		this.field_544 = null;
		field_513 = null;
		field_514 = null;
		System.gc();
	}

	// $FF: renamed from: ct () void
	private void method_408() {
		this.method_65();
		this.field_552 = true;
		this.field_557 = true;
		this.field_526 = true;
		field_222 = 21;
		this.field_266 = 0;
		this.field_265 = 14;
		this.field_515 = 100;
		if (this.currentLevel > this.method_119(this.currentWorld)) {
			this.currentLevel = this.method_119(this.currentWorld);
		}

		this.method_409();
	}

	// $FF: renamed from: cu () void
	private void method_409() {
		field_509 = new long[12][12];
		this.field_544 = new int[20];
	}

	// $FF: renamed from: a (long, byte, byte) int
	private static int method_410(long var0, byte var2, byte var3) {
		return (int)(var0 >>> var2 & ~(-1L << var3));
	}

	// $FF: renamed from: a (int, int, int, byte, byte) void
	private void method_411(int var1, int var2, int var3, byte var4, byte var5) {
		long var6;
		long var8 = (long)method_410(var6 = field_509[var1][var2], var4, var5) << var4;
		var6 ^= var8;
		long var10;
		var10 = (var10 = (long)var3) << var4;
		var6 |= var10;
		field_509[var1][var2] = var6;
	}

	// $FF: renamed from: cv () void
	private void method_412() {
		if (this.field_552) {
			field_513 = Image.createImage(186, 226);
		}

		if (this.field_557) {
			this.field_557 = false;
			this.field_558 = true;
			this.method_422();
			this.method_421();
		}

		if (this.field_558) {
			this.field_314.drawImage(field_513, 27, 56, 0);
			this.method_423();
			this.method_417();
			this.method_413();
			this.method_414();
		}

		if (this.field_558 && this.field_528 == this.field_530 && this.field_529 == this.field_531) {
			this.field_558 = false;
		}

	}

	// $FF: renamed from: cw () void
	private void method_413() {
		int var3;
		ASprite var10000;
		Graphics var10001;
		StringBuffer var10002;
		int var10003;
		if ((var3 = method_410(field_509[this.field_528][this.field_529], (byte)6, (byte)5)) < this.field_515) {
			var10000 = field_320[41];
			var10001 = this.field_314;
			var10002 = (new StringBuffer()).append(field_510.toString());
			var10003 = var3;
		} else {
			var10000 = field_320[41];
			var10001 = this.field_314;
			var10002 = (new StringBuffer()).append(field_511.toString());
			var10003 = var3 - this.field_515;
		}

		var10000.DrawString(var10001, var10002.append(var10003 + 1).toString(), 8, 45, 6);
	}

	// $FF: renamed from: cx () void
	private void method_414() {
		if (this.field_528 == this.field_530 && this.field_529 == this.field_531) {
			int var3 = method_410(field_509[this.field_528][this.field_529], (byte)6, (byte)5);
			int var4 = 0;
			var4 = this.method_124(this.currentWorld, var3);
			int var5 = this.method_126(this.currentWorld, var3);
			if (var4 > var5) {
				var4 = var5;
			}

			field_512.delete(0, field_512.length());
			field_512.append(var4);
			field_512.append('/');
			field_512.append(var5);
			field_320[41].UpdateStringSize(field_512.toString());
			int var7 = ASprite._text_w + 6 + 14;
			int var9 = 37 + this.field_528 * 13 + 6;
			int var10 = 73 + this.field_529 * 13 + 6;
			int var11 = var9 - (var7 >> 1) + 0;
			int var12;
			if ((var12 = var10 - 17 + -31) <= 63) {
				var12 = 63;
				if ((var11 = var9 + 20) + var7 >= 200) {
					var11 = var9 - var7 + -20;
				}
			}

			if (var11 <= 35) {
				var11 = 35;
			}

			if (var11 + var7 >= 200) {
				var11 = 150;
			}

			method_429(this.field_314, var11, var12, var7, 17, 37042, 0);
			field_320[41].DrawString(this.field_314, field_512.toString(), var11 + 2, var12 + 2 - 1, 20);
			if (field_320[17] != null) {
				field_320[17].PaintFrame(this.field_314, 10, var11 + var7 - 2 - 14, var12 + 2 - 1, 0, 0, 0);
			}

		}
	}

	// $FF: renamed from: cy () void
	private void method_415() {
		this.field_548 = 0;
		this.field_545 = 0;
		this.field_546 = 0;
		this.field_543 = false;
		this.field_542 = true;
		this.field_541 = false;
		this.field_547 = 2;
		this.field_549 = 2;
		this.field_550 = false;
	}

	// $FF: renamed from: g () boolean
	private boolean method_416() {
		boolean var1 = false;
		int var2 = this.field_545 >> 1;
		cGame var10000;
		int var10001;
		if (this.field_547 < 0) {
			var10000 = this;
			var10001 = 2;
		} else {
			var10000 = this;
			var10001 = this.field_547 - 1;
		}

		var10000.field_547 = var10001;
		if (this.field_530 == 0 && this.field_531 == 0) {
			this.field_530 = this.field_528;
			this.field_531 = this.field_529;
		}

		if (this.field_547 == 0) {
			boolean var23;
			if (this.field_546 == var2) {
				var23 = true;
			} else {
				++this.field_546;
				var23 = false;
			}

			var1 = var23;
		}

		int var5;
		int var8;
		byte var9;
		label113: {
			var5 = method_410(field_509[this.field_528][this.field_529], (byte)3, (byte)3);
			var8 = method_410(field_509[this.field_530][this.field_531], (byte)3, (byte)3);
			var9 = 0;
			boolean var10 = false;
			byte var24;
			switch (var5 != 1 && var8 != 1 ? var5 : 1) {
			case 0:
				var24 = 2;
				break;
			case 1:
				var24 = 8;
				break;
			default:
				break label113;
			}

			var9 = var24;
		}

		int var11 = 0;
		int var12 = this.field_550 ? var2 - 1 : 0;

		for (int var13 = this.field_550 ? -1 : 1; var11 < this.field_546; var12 += var13) {
			int var14 = var12 * 2;
			field_320[17].PaintFrame(this.field_314, var9, this.field_544[var14], this.field_544[var14 + 1], 0, 0, 0);
			++var11;
		}

		byte var15;
		byte var20;
		label101: {
			var20 = 0;
			var15 = 0;
			byte var25;
			switch (var5) {
			case 0:
				var15 = 0;
				var25 = 0;
				break;
			case 1:
				var15 = 2;
				var25 = 9;
				break;
			default:
				break label101;
			}

			var20 = var25;
		}

		int var16 = this.field_528 * 13 + var15 + 37;
		int var17 = this.field_529 * 13 + var15 + 73;
		field_320[17].PaintFrame(this.field_314, var20, var16, var17, 0, 0, 0);
		int var18 = this.field_527 ? 7 : 6;
		field_320[17].PaintFrame(this.field_314, var18, var16 + 6, var17 + 6, 0, 0, 0);
		boolean var19 = true;
		if (var11 == var2) {
			if (this.field_549 < 0) {
				var10000 = this;
				var10001 = 2;
			} else {
				var10000 = this;
				var10001 = this.field_549 - 1;
			}

			var10000.field_549 = var10001;
			if (this.field_549 == 0) {
				this.field_549 = 1;
				var19 = false;
			}
		}

		if (!var19) {
			label93: {
				byte var27;
				switch (var8) {
				case 0:
					var15 = 0;
					var27 = 0;
					break;
				case 1:
					var15 = 2;
					var27 = 9;
					break;
				default:
					break label93;
				}

				var20 = var27;
			}
		} else {
			label88: {
				byte var28;
				switch (var8) {
				case 0:
					var15 = 0;
					var28 = 1;
					break;
				case 1:
					var15 = 2;
					var28 = 5;
					break;
				default:
					break label88;
				}

				var20 = var28;
			}
		}

		var16 = this.field_530 * 13 + var15 + 37;
		var17 = this.field_531 * 13 + var15 + 73;
		field_320[17].PaintFrame(this.field_314, var20, var16, var17, 0, 0, 0);
		if (!var19) {
			boolean var29;
			if (this.field_548 == field_320[9].GetAFrames(0)) {
				--this.field_548;
				this.field_543 = true;
				var29 = true;
			} else {
				var29 = false;
			}

			var1 = var29;
			if (!this.field_384) {
				field_320[9].PaintFrame(this.field_314, this.field_548, var16, var17, 0, 0, 0);
			}

			++this.field_548;
		}

		return var1;
	}

	// $FF: renamed from: cz () void
	private void method_417() {
		int var1 = 37 + this.field_528 * 13 + 6;
		int var2 = 73 + this.field_529 * 13 + 6;
		if (this.field_528 == this.field_530 && this.field_529 == this.field_531) {
			if (this.field_558) {
				int var6 = this.field_527 ? 7 : 6;
				field_320[17].PaintFrame(this.field_314, var6, var1, var2, 0, 0, 0);
			}
		} else {
			int var3 = 37 + this.field_530 * 13 + 6;
			int var4 = 73 + this.field_531 * 13 + 6;
			if ((this.method_116(this.currentWorld, this.currentLevel + 1) & 2) != 0 && this.currentLevel + 1 == field_532 || this.currentLevel == field_532) {
				this.field_541 = true;
			}

			if (!this.field_541) {
				this.field_541 = this.method_416();
				if (this.field_541) {
					this.field_557 = true;
					return;
				}
			} else if (this.method_418(var1, var2, var3, var4)) {
				this.field_528 = this.field_530;
				this.field_529 = this.field_531;
				return;
			}
		}

	}

	// $FF: renamed from: c (int, int, int, int) boolean
	private boolean method_418(int var1, int var2, int var3, int var4) {
		if (this.field_526) {
			this.field_526 = false;
			this.field_517 = var1;
			this.field_518 = var2;
			this.field_519 = 0;
			this.field_520 = var3 - var1;
			this.field_521 = var4 - var2;
			this.field_522 = 0;
			this.field_523 = 0;
			this.field_524 = 10;
			this.field_525 = 10;
		}

		if (this.field_520 < 0) {
			this.field_524 = -10;
			this.field_520 = -this.field_520;
		}

		if (this.field_521 < 0) {
			this.field_525 = -10;
			this.field_521 = -this.field_521;
		}

		this.field_527 = this.field_524 <= 0;
		int var5 = this.field_527 ? 7 : 6;
		if (this.field_521 <= this.field_520) {
			this.field_522 = 2 * this.field_520;
			this.field_523 = 2 * this.field_521;
			if (this.field_524 < 0 && this.field_517 <= var3 || this.field_524 > 0 && this.field_517 >= var3) {
				var3 = 37 + this.field_530 * 13 + 6;
				var4 = 73 + this.field_531 * 13 + 6;
				field_320[17].PaintFrame(this.field_314, var5, var3, var4, 0, 0, 0);
				this.field_526 = true;
				return true;
			}

			field_320[17].PaintFrame(this.field_314, var5, this.field_517, this.field_518, 0, 0, 0);
			this.field_517 += this.field_524;
			this.field_519 += this.field_523;
			if (this.field_519 <= this.field_520) {
				return false;
			}

			this.field_518 += this.field_525;
		} else {
			this.field_522 = 2 * this.field_521;
			this.field_523 = 2 * this.field_520;
			if (this.field_525 < 0 && this.field_518 <= var4 || this.field_525 > 0 && this.field_518 >= var4) {
				var3 = 37 + this.field_530 * 13 + 6;
				var4 = 73 + this.field_531 * 13 + 6;
				field_320[17].PaintFrame(this.field_314, var5, var3, var4, 0, 0, 0);
				this.field_526 = true;
				return true;
			}

			field_320[17].PaintFrame(this.field_314, var5, this.field_517, this.field_518, 0, 0, 0);
			this.field_518 += this.field_525;
			this.field_519 += this.field_523;
			if (this.field_519 <= this.field_521) {
				return false;
			}

			this.field_517 += this.field_524;
		}

		this.field_519 -= this.field_522;
		return false;
	}

	// $FF: renamed from: a (int, int, long, int, int) void
	private void method_419(int var1, int var2, long var3, int var5, int var6) {
		int var7 = method_410(var3, (byte)6, (byte)5);
		this.field_516 |= 1 << var7;
		int var8 = method_410(var3, (byte)11, (byte)3);
		int var9 = 14;

		for (int var10 = 0; var10 < var8; var9 += 4) {
			int var11 = 37 + var1 * 13;
			int var12 = 73 + var2 * 13;
			int var13 = method_410(var3, (byte)var9, (byte)4);
			var9 += 4;
			int var14 = method_410(var3, (byte)var9, (byte)4);
			long var17;
			int var19 = method_410(var17 = field_509[var13][var14], (byte)6, (byte)5);
			if ((this.field_516 & 1 << var19) <= 0) {
				label108: {
					int var15 = 37 + var13 * 13;
					int var16 = 73 + var14 * 13;
					var11 += 6;
					var12 += 6;
					var15 += 6;
					var16 += 6;
					this.field_533 = var11;
					this.field_534 = var12;
					this.field_535 = 0;
					this.field_536 = var15 - var11;
					this.field_537 = var16 - var12;
					this.field_538 = 0;
					this.field_539 = 0;
					this.field_540 = 1;
					byte var21 = 1;
					byte var22 = 1;
					if (this.field_536 < 0) {
						var21 = -1;
						this.field_536 = -this.field_536;
					}

					if (this.field_537 < 0) {
						var22 = -1;
						this.field_537 = -this.field_537;
					}

					byte var23 = 0;
					int var24 = method_410(var17, (byte)0, (byte)3);
					int var25 = method_410(var17, (byte)3, (byte)3);
					if (var5 == 1) {
						var25 = var5;
					}

					if (var6 == 1) {
						if (var25 == 1) {
							break label108;
						}

						var24 = var6;
					}

					if (!this.field_543 && var19 == field_532) {
						var24 = 1;
					}

					if (var24 == 0) {
						label95: {
							byte var10000;
							switch (var25) {
							case 0:
								var10000 = 2;
								break;
							case 1:
								var10000 = 8;
								break;
							default:
								break label95;
							}

							var23 = var10000;
						}
					} else {
						label90: {
							byte var32;
							switch (var25) {
							case 0:
								var32 = 3;
								break;
							case 1:
								var32 = 4;
								break;
							default:
								break label90;
							}

							var23 = var32;
						}
					}

					if (this.field_537 <= this.field_536) {
						this.field_538 = this.field_536 << 1;
						this.field_539 = this.field_537 << 1;

						while(true) {
							if (this.field_540 % 8 == 0) {
								field_320[17].PaintFrame(field_514, var23, this.field_533 - 27, this.field_534 - 56, 0, 0, 0);
								if (this.field_542) {
									this.method_420(var7, var19);
								}
							}

							if (this.field_533 == var15) {
								break;
							}

							this.field_533 += var21;
							this.field_535 += this.field_539;
							if (this.field_535 > this.field_536) {
								this.field_534 += var22;
								this.field_535 -= this.field_538;
							}

							++this.field_540;
						}
					} else {
						this.field_538 = 2 * this.field_537;
						this.field_539 = 2 * this.field_536;

						while(true) {
							if (this.field_540 % 8 == 0) {
								field_320[17].PaintFrame(field_514, var23, this.field_533 - 27, this.field_534 - 56, 0, 0, 0);
								if (this.field_542) {
									this.method_420(var7, var19);
								}
							}

							if (this.field_534 == var16) {
								break;
							}

							this.field_534 += var22;
							this.field_535 += this.field_539;
							if (this.field_535 > this.field_537) {
								this.field_533 += var21;
								this.field_535 -= this.field_538;
							}

							++this.field_540;
						}
					}
				}
			}

			++var10;
		}

	}

	// $FF: renamed from: w (int, int) void
	private void method_420(int var1, int var2) {
		cGame var10000;
		if (!this.field_551) {
			int var5 = method_410(field_509[this.field_385][this.field_386], (byte)6, (byte)5);
			if ((var2 != field_532 || var1 != var5) && (var1 != field_532 || var2 != var5)) {
				return;
			}

			if (var1 == field_532 && var2 == var5) {
				this.field_550 = true;
			}

			var10000 = this;
		} else {
			if ((var2 != field_532 || var1 != field_532 - 1) && (var1 != field_532 || var2 != field_532 - 1)) {
				return;
			}

			if (var1 == field_532 && var2 == field_532 - 1) {
				this.field_550 = true;
			}

			var10000 = this;
		}

		var10000.field_544[this.field_545++] = this.field_533;
		this.field_544[this.field_545++] = this.field_534;
	}

	// $FF: renamed from: cA () void
	private void method_421() {
		this.field_516 = 0;
		if ((this.method_116(this.currentWorld, this.currentLevel + 1) & 2) != 0 && this.currentLevel + 1 == field_532 || this.currentLevel == field_532) {
			this.field_542 = false;
			this.field_543 = true;
		}

		for (int var1 = 0; var1 < 12; ++var1) {
			for (int var2 = 0; var2 < 12; ++var2) {
				long var3 = field_509[var1][var2];
				boolean var5 = false;
				if (var3 != 0L) {
					int var6 = method_410(var3, (byte)3, (byte)3);
					int var7 = method_410(var3, (byte)6, (byte)5);
					int var8 = !this.field_543 && var7 == field_532 && var7 != 0 ? 1 : method_410(var3, (byte)0, (byte)3);
					int var9 = -1;
					byte var10 = -1;
					byte var11 = -1;
					if (var8 == 0) {
						label112: {
							var5 = this.method_124(this.currentWorld, var7) == this.method_126(this.currentWorld, var7);
							int var10000;
							switch (var6) {
							case 0:
								var10 = 17;
								var11 = 0;
								var10000 = method_410(var3, (byte)11, (byte)3) > 2 ? 13 : 0;
								break;
							case 1:
								var10 = 18;
								var11 = 2;
								var10000 = 9;
								break;
							default:
								break label112;
							}

							var9 = var10000;
						}
					} else {
						switch (var6) {
						case 0:
							var11 = 0;
							var9 = 1;
						case 1:
						}
					}

					this.method_419(var1, var2, var3, var6, var8);
					if (var11 != -1 && var9 != -1) {
						if (var5 && var10 != -1) {
							field_320[17].PaintFrame(field_514, var10, var1 * 13 + var11 + 37 - 27, var2 * 13 + var11 + 73 - 56, 0, 0, 0);
						}

						byte var12;
						label72: {
							field_320[17].PaintFrame(field_514, var9, var1 * 13 + var11 + 37 - 27, var2 * 13 + var11 + 73 - 56, 0, 0, 0);
							var12 = -1;
							byte var13;
							switch (this.currentWorld) {
							case 0:
								if (var7 != 8) {
									break label72;
								}

								var13 = 52;
								break;
							case 1:
								if (var7 != 9) {
									break label72;
								}

								var13 = 53;
								break;
							case 2:
								if (var7 == 10) {
									var13 = 54;
									break;
								}
							default:
								break label72;
							}

							var12 = var13;
						}

						if (var12 != -1) {
							field_320[var12].PaintFrame(field_514, 0, var1 * 13 + -8 + 37 - 27, var2 * 13 + -8 + 73 - 56, 0, 0, 0);
						}
					}
				}
			}
		}

		this.field_542 = false;
	}

	// $FF: renamed from: cB () void
	private void method_422() {
		int var1;
		int var2;
		int var3;
		byte var4;
		byte var5;
		label23: {
			this.field_314.setClip(0, 0, 240, 320);
			var1 = 0;
			var2 = 0;
			var3 = 0;
			var4 = -1;
			var5 = 0;
			byte var10000;
			switch (this.currentWorld) {
			case 0:
				var1 = 939282;
				var2 = 3111750;
				var3 = 8635434;
				var5 = 24;
				var10000 = 28;
				break;
			case 1:
				var1 = 869201;
				var2 = 4022666;
				var3 = 5873874;
				var5 = 25;
				var10000 = 29;
				break;
			case 2:
				var1 = 5210510;
				var2 = 3711421;
				var3 = 7469567;
				var5 = 26;
				var10000 = 30;
				break;
			default:
				break label23;
			}

			var4 = var10000;
		}

		this.field_314.setColor(var1);
		this.field_314.fillRect(0, 0, 240, 320);
		field_320[var5].PaintFrame(this.field_314, 0, 120, 0, 0, 0, 0);
		field_320[41].DrawString(this.field_314, menuText[var4], 8, 6, 20);
		field_514 = field_513.getGraphics();
		field_514.setColor(var1);
		field_514.fillRect(0, 0, 186, 226);
		field_320[23].PaintFrame(field_514, 0, 93, 113, 0, 0, 0);
		this.field_314.setColor(var2);
		this.field_314.fillRoundRect(2, 282, 236, 22, 8, 8);
		this.field_314.setColor(var3);
		this.field_314.drawRoundRect(2, 282, 236, 22, 8, 8);
		this.method_176();
		this.method_177();
		field_320[41].DrawString(this.field_314, menuText[96], 222, 311, 10);
		if (field_320[17] != null) {
			field_320[17].PaintFrame(this.field_314, 12, 11, 284, 0, 0, 0);
			field_320[17].PaintFrame(this.field_314, 10, 155, 285, 0, 0, 0);
			field_320[17].PaintFrame(this.field_314, 11, 80, 285, 0, 0, 0);
		}

		field_512.delete(0, field_512.length());
		field_512.append(this.playerLifeCount);
		field_320[41].DrawString(this.field_314, field_512.toString(), 39, 285, 20);
		field_512.delete(0, field_512.length());
		field_512.append(getShortFromBytes(field_330, 4));
		field_320[41].DrawString(this.field_314, field_512.toString(), 100, 285, 20);
		field_512.delete(0, field_512.length());
		int var6 = getShortFromBytes(field_330, 6);
		byte var8 = field_330[0];
		if (var6 >= var8) {
			field_512.append(var6).append("/").append(var6);
		} else {
			field_512.append(var6).append("/").append(var8);
		}

		field_320[41].DrawString(this.field_314, field_512.toString(), 175, 285, 20);
		this.field_552 = false;
	}

	// $FF: renamed from: cC () void
	private void method_423() {
		int var1;
		int var2;
		label14: {
			var1 = 0;
			var2 = 0;
			int var10000;
			switch (this.currentWorld) {
			case 0:
				var1 = 3111750;
				var10000 = 8635434;
				break;
			case 1:
				var1 = 4022666;
				var10000 = 5873874;
				break;
			case 2:
				var1 = 3711421;
				var10000 = 7469567;
				break;
			default:
				break label14;
			}

			var2 = var10000;
		}

		this.field_314.setColor(var1);
		this.field_314.fillRoundRect(2, 34, 236, 22, 8, 8);
		this.field_314.setColor(var2);
		this.field_314.drawRoundRect(2, 34, 236, 22, 8, 8);
	}

	// $FF: renamed from: cD () void
	private void method_424() {
		if (this.field_528 == this.field_530 && this.field_529 == this.field_531) {
			byte var1 = -1;
			if (isKeyPressed(SKEY_NUM2|SKEY_UP)) {
				var1 = 2;
			} else if (isKeyPressed(SKEY_NUM8|SKEY_DOWN)) {
				var1 = 3;
			} else if (isKeyPressed(SKEY_NUM4|SKEY_LEFT)) {
				var1 = 4;
			} else if (isKeyPressed(SKEY_NUM6|SKEY_RIGHT)) {
				var1 = 1;
			} else {
				if (isKeyPressed(SKEY_NUM5|SKEY_CENTER_ALT|SKEY_CENTER|SKEY_LSH)) {
					if (System.currentTimeMillis() - this.field_553 < 2000L) {
						return;
					}

					int var16 = method_410(field_509[this.field_528][this.field_529], (byte)6, (byte)5);
					this.method_95();
					this.method_407();
					System.gc();
					this.currentLevel = var16;
					this.method_86();
					keysPressed = 0;
					return;
				}

				if (isKeyPressed(SKEY_RSH)) {
					this.field_375 = true;
					this.field_373 = true;
					this.field_377 = true;
					this.field_266 = 0;
					field_222 = 28;
					keysPressed = 0;
					return;
				}
			}

			keysPressed = 0;
			if (var1 != -1) {
				int var2 = this.field_528;
				int var3 = this.field_529;
				long var4;
				int var6 = method_410(var4 = field_509[var2][var3], (byte)11, (byte)3);
				int var7 = 14;
				int var8 = -1;
				int var9 = -1;

				for (int var10 = 0; var10 < var6; var7 += 4) {
					int var11 = method_410(var4, (byte)var7, (byte)4);
					var7 += 4;
					int var12 = method_410(var4, (byte)var7, (byte)4);
					if (method_410(field_509[var11][var12], (byte)0, (byte)3) != 1) {
						label121: {
							int var10000;
							switch (var1) {
							case 1:
								if (var11 <= var2) {
									break label121;
								}

								if (var8 >= 0) {
									var9 = var10;
									break label121;
								}

								var10000 = var10;
								break;
							case 2:
								if (var12 >= var3) {
									break label121;
								}

								if (var8 >= 0) {
									var9 = var10;
									break label121;
								}

								var10000 = var10;
								break;
							case 3:
								if (var12 <= var3) {
									break label121;
								}

								if (var8 >= 0) {
									var9 = var10;
									break label121;
								}

								var10000 = var10;
								break;
							case 4:
								if (var11 < var2) {
									if (var8 < 0) {
										var10000 = var10;
										break;
									} else {
										var9 = var10;
									}
								}
							default:
								break label121;
							}

							var8 = var10000;
						}
					}

					++var10;
				}

				if (var8 != -1) {
					int var24 = -1;
					if (var9 == -1) {
						var24 = var8;
					} else {
						label140: {
							int var29;
							label93: {
								var7 = 14 + var8 * 2 * 4;
								int var25 = method_410(var4, (byte)var7, (byte)4);
								var7 += 4;
								int var27 = method_410(var4, (byte)var7, (byte)4);
								var7 = 14 + var9 * 2 * 4;
								int var13 = method_410(var4, (byte)var7, (byte)4);
								var7 += 4;
								int var14 = method_410(var4, (byte)var7, (byte)4);
								switch (var1) {
								case 1:
								case 4:
									if (var3 == var27) {
										var29 = var8;
										break label93;
									}

									if (var3 != var14) {
										var29 = Math.abs(var2 - var25) > Math.abs(var2 - var13) ? var8 : var9;
										break label93;
									}
									break;
								case 2:
								case 3:
									if (var2 == var25) {
										var29 = var8;
										break label93;
									}

									if (var2 != var13 && var25 > var13) {
										var29 = var8;
										break label93;
									}
									break;
								default:
									break label140;
								}

								var29 = var9;
							}

							var24 = var29;
						}
					}

					if (var24 != -1) {
						var7 = 14 + var24 * 2 * 4;
						int var26 = method_410(var4, (byte)var7, (byte)4);
						var7 += 4;
						int var28 = method_410(var4, (byte)var7, (byte)4);
						if (method_410(field_509[var26][var28], (byte)0, (byte)3) == 0) {
							this.field_530 = var26;
							this.field_531 = var28;
							this.field_558 = true;
						}
					}
				}
			}
		}

	}

	// $FF: renamed from: B (int) void
	private void method_425(int var1) {
		try {
			switch (var1) {
			case 0:
				if (this.field_374) {
					this.method_108();
					return;
				}
				break;
			case 1:
				if (this.field_375) {
					this.method_95();
					return;
				}
				break;
			case 2:
				if (this.field_372) {
					this.method_70();
					return;
				}
				break;
			case 3:
				if (this.field_373) {
					this.method_407();
					return;
				}
				break;
			case 4:
				field_320[41]._crt_pal = 0;
				field_512.delete(0, field_512.length());
				switch (this.currentWorld) {
				case 0:
					field_512.append("/map_angkor.out");
					break;
				case 1:
					field_512.append("/map_scotland.out");
					break;
				case 2:
					field_512.append("/map_tibet.out");
				}

				field_509 = new long[12][12];
				this.field_544 = new int[20];
				this.method_426(field_512.toString());
				return;
			case 5:
				field_320[17] = loadGfxFile("/ms.f", 0);
				field_320[23] = loadGfxFile("/ms.f", 1);
				return;
			case 6:
				switch (this.currentWorld) {
				case 0:
					field_320[24] = loadGfxFile("/ms.f", 2);
					break;
				case 1:
					field_320[25] = loadGfxFile("/ms.f", 3);
					break;
				case 2:
					field_320[26] = loadGfxFile("/ms.f", 4);
					break;
				}
				return;
			case 7:
				if (field_320[54] == null) {
					field_320[54] = loadGfxFile("/mmv.f", 1);
				}

				this.field_126 = method_402(field_320[54], 0) >> 1;
				this.field_127 = method_401(field_320[54], 0) >> 1;
				return;
			case 8:
				if (field_320[53] == null) {
					field_320[53] = loadGfxFile("/mmv.f", 2);
					return;
				}
				break;
			case 9:
				if (field_320[52] == null) {
					field_320[52] = loadGfxFile("/mmv.f", 3);
					return;
				}
				break;
			case 10:
				if (this.field_446) {
					this.method_415();
					return;
				}
			case 11:
			case 12:
			case 13:
			default:
				break;
			case 14:
				if (this.field_309) {
					this.field_309 = false;
				}

				this.method_427();
				field_222 = 15;
			}

		} catch (Exception var3) {
		}
	}

	// $FF: renamed from: a (java.lang.String) void
	private void method_426(String var1) throws IOException {
		InputStream var2;
		int var3 = ((byte)(var2 = this.getClass().getResourceAsStream(var1)).read() & 255) + ((byte)var2.read() & 255) * 256;
		int var4 = var2.read();
		field_322 = new byte[var3];
		var2.read(field_322);
		var2.close();
		int var5 = 0;

		for (int var6 = 0; var6 < var4; ++var6) {
			byte var7 = field_322[var5++];
			byte var8 = field_322[var5++];
			byte var9 = field_322[var5++];
			byte var10 = field_322[var5++];
			if (var9 == 1 && var10 < this.field_515) {
				this.field_515 = var10;
			}

			byte var11 = field_322[var5++];
			this.method_411(var7, var8, 1, (byte)0, (byte)3);
			this.method_411(var7, var8, var9, (byte)3, (byte)3);
			this.method_411(var7, var8, var10, (byte)6, (byte)5);
			this.method_411(var7, var8, var11, (byte)11, (byte)3);
			byte var12 = 14;

			for (int var13 = 0; var13 < var11; ++var13) {
				byte var14 = field_322[var5++];
				this.method_411(var7, var8, var14, var12, (byte)4);
				var12 = (byte)(var12 + 4);
				byte var15 = field_322[var5++];
				this.method_411(var7, var8, var15, var12, (byte)4);
				var12 = (byte)(var12 + 4);
			}
		}

		field_322 = null;
		System.gc();
	}

	// $FF: renamed from: cE () void
	private void method_427() {
		this.field_528 = -1;
		if (!this.field_446) {
			this.currentLevel = field_532;
		}

		this.field_446 = false;

		for (int var1 = 0; var1 < 12; ++var1) {
			for (int var2 = 0; var2 < 12; ++var2) {
				long var3;
				if ((var3 = field_509[var1][var2]) != 0L) {
					int var5 = method_410(var3, (byte)6, (byte)5);
					cGame var10000;
					int var10001;
					int var10002;
					byte var10003;
					if ((this.method_116(this.currentWorld, var5) & 64) == 0 && var5 != 0) {
						var10000 = this;
						var10001 = var1;
						var10002 = var2;
						var10003 = 1;
					} else {
						var10000 = this;
						var10001 = var1;
						var10002 = var2;
						var10003 = 0;
					}

					var10000.method_411(var10001, var10002, var10003, (byte)0, (byte)3);
					if (var5 == this.currentLevel) {
						this.field_528 = var1;
						this.field_529 = var2;
					}

					if (var5 == field_532) {
						this.field_530 = var1;
						this.field_531 = var2;
					}

					this.field_527 = false;
				}
			}
		}

	}

	// $FF: renamed from: cF () void
	private void method_428() {
		field_320[17] = loadGfxFile("/ms.f", 0);
		this.method_212();
	}

	// $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int, int) void
	public static final void method_429(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var0.getClipX();
		int var8 = var0.getClipY();
		int var9 = var0.getClipWidth();
		int var10 = var0.getClipHeight();
		var0.setClip(var1, var2, var3, var4);
		var0.setColor(var5);
		var0.fillRect(var1, var2, var3, var4);
		var0.setClip(var1 - 3, var2, var3 + 6, var4);

		for (int var11 = var2; var11 <= var2 + var4; var11 += 8) {
			var0.drawImage(field_319[var6][7], var1, var11, 24);
			var0.drawImage(field_319[var6][5], var1 + var3, var11, 20);
		}

		var0.setClip(var1, var2 - 3, var3, var4 + 6);

		for (int var12 = var1; var12 <= var1 + var3; var12 += 8) {
			var0.drawImage(field_319[var6][4], var12, var2, 36);
			var0.drawImage(field_319[var6][6], var12, var2 + var4, 20);
		}

		var0.setClip(var1 - 3, var2 - 3, var3 + 6, var4 + 6);
		var0.drawImage(field_319[var6][0], var1, var2, 40);
		var0.drawImage(field_319[var6][1], var1 + var3, var2, 36);
		var0.drawImage(field_319[var6][2], var1, var2 + var4, 24);
		var0.drawImage(field_319[var6][3], var1 + var3, var2 + var4, 20);
		var0.setClip(var7, var8, var9, var10);
	}

	// $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int, int, int, int) void
	public static final void method_430(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = var0.getClipX();
		int var10 = var0.getClipY();
		int var11 = var0.getClipWidth();
		int var12 = var0.getClipHeight();
		method_429(var0, var1, var2, var3, var4, var5, var6);
		method_429(var0, var1 + 10, var2 - 3 - var8, var7, var8, var5, var6);
		var0.setClip(var1 + 10 - 3, var2 - 3, var7 + 6, 3);
		var0.setColor(var5);
		var0.fillRect(var1 + 10 - 3, var2 - 3, var7 + 6, 3);
		var0.drawImage(field_319[var6][3], var1 + 10, var2 - 3, 24);
		var0.drawImage(field_319[var6][2], var1 + 10 + var7, var2 - 3, 20);
		var0.setClip(var9, var10, var11, var12);
	}

	// $FF: renamed from: cG () void
	private void method_431() {
		if (this.field_97 != this.field_554 || this.field_557) {
			if (this.field_97 != this.field_554) {
				this.field_557 = true;
			}

			this.field_314.setClip(0, 0, 240, 320);
			if (this.field_557) {
				this.method_135(this.field_314, true);
				this.field_314.setColor(0);
				this.field_314.fillRect(0, 0, 240, 15);
				this.field_314.setColor(0xFFFFFF);
				this.field_314.drawLine(0, 15, 240, 15);
				field_320[41].DrawString(this.field_314, menuText[72], 120, 0, 17);
				method_429(this.field_314, 10, 35, 220, 90, 0x41340D, 0);
				if (this.field_98 != -1) {
					field_320[41].DrawPage(this.field_314, method_441(this.field_99, 200), 120, 280, 17);
				}

				if (this.field_435) {
					this.field_435 = false;
					field_320[41].DrawString(this.field_314, this.field_99, 120, 191, 1);
				}

				field_320[41].DrawPage(this.field_314, this.field_555, 120, 260, 17);
				this.method_176();
				this.method_177();
				this.field_557 = false;
			}

			if (this.field_97 != this.field_554) {
				this.field_314.setColor(0x41340D);
				this.field_314.fillRect(20, 43 + (this.field_554 >= 0 ? this.field_554 : this.field_97) * 20 + 2, 7, 9);
			}

			field_320[17].PaintFrame(this.field_314, 14, 20, 43 + this.field_97 * 20 + 2, 0, 0, 0);
			method_429(this.field_314, 10, 155, 220, 70, 0x41340D, 0);
			ASprite var10000;
			Graphics var10001;
			String var10002;
			byte var10003;
			short var10004;
			if (this.field_98 != -1) {
				String var1 = menuText[74] + " " + this.field_556.toString() + "\n" + menuText[42];
				field_320[41]._nLineSpacing = 0;
				var10000 = field_320[41];
				var10001 = this.field_314;
				var10002 = var1;
				var10003 = 120;
				var10004 = 185;
			} else {
				var10000 = field_320[41];
				var10001 = this.field_314;
				var10002 = this.field_99;
				var10003 = 120;
				var10004 = 191;
			}

			var10000.DrawPage(var10001, var10002, var10003, var10004, 1);
			int var10 = 0;

			for (int var2 = 0; var2 < 4; ++var2) {
				var10 = 43 + 20 * var2;
				field_320[46].PaintFrame(this.field_314, 0 + var2, 27, var10, 0, 0, 0);
				field_320[41].DrawString(this.field_314, menuText[85 + var2], 53, var10, 0);
			}

			Image[] var12;
			int var3 = (var12 = field_320[0]._modules_image[0])[11].getWidth();
			int var4 = var12[15].getWidth();
			this.field_314.drawImage(var12[11], 100, 160, 0);

			for (int i = 0; i < 8; i++) {
				int var8 = i >= 4 ? 13 : 15;
				this.field_314.drawImage(var12[var8], 100 + var3, 160, 0);
				var3 += var4;
			}

			int var14 = this.field_97;
			int var8 = var3; //NOTE: ADDED TO MATCH DECOMPILER OUTPUT
			var3 -= var4 * 4;

			for (int i = 0; i <= var14; i++) {
				this.field_314.drawImage(var12[15], 100 + var3, 160, 0);
				var3 += var4;
			}

			this.field_314.drawImage(var12[17], 100 + var8, 160, 0);
			if (this.field_97 != this.field_554) {
				this.field_554 = this.field_97;
			}

		}
	}

	// $FF: renamed from: a (int, int, short) void
	/**
	 * Sets the text index for a particular menu (represented as an array of paired bytes)
	 * @param menu Menu number
	 * @param targetNum The ID of the index being modified (represented as the first byte in the pair)
	 * @param index The new text index
	 */
	private static void setMenuTextIndex(int menu, int targetNum, short index) {
		for (int i = 0; i < menuData[menu].length; i += 2) {
			if (targetNum == menuData[menu][i]) {
				menuData[menu][i + 1] = index;
				return;
			}
		}

	}

	// $FF: renamed from: C (int) void
	private void method_433(int var1) {
		this.field_353.method_58(var1);
	}

	// $FF: renamed from: cH () void
	private void method_434() {
		switch (this.field_223) {
		case 0:
			this.field_559 = 0;
			this.field_560 = 0;
			this.field_223 = 1;
			return;
		case 1:
			field_565 = loadPackedFile("/cr.f", 0);
			int var4 = 0;

			while(var4 < field_565.length) {
				if (field_565[var4] == 92 && field_565[var4 + 1] == 110) {
					field_565[var4++] = 10;
					field_565[var4++] = 32;
				} else {
					var4++;
				}
			}

			for (var4 = 0; field_565[var4] != 36; ++var4) {
			}

			for (int i = 0; i < GloftDIRU.field_574.length; ++var4) {
				field_565[var4] = GloftDIRU.field_574[i];
				i++;
			}

			this.field_223 = 2;
			return;
		case 2:
			if (isKeyPressed(SKEY_NUM2|SKEY_UP)) {
				boolean var2 = false;
				if (this.field_559 >= 240) {
					this.field_559 -= 3;
					if (this.field_559 < 240) {
						this.field_559 = 240;
						break;
					}
				}
			} else {
				if (isKeyPressed(SKEY_NUM8|SKEY_DOWN)) {
					this.field_559 += 3;
					break;
				} else if (isKeyPressed(SKEY_RSH)) {
					if (this.field_131) {
						this.field_266 = 0;
						this.field_265 = 8;
						field_222 = 9;
						this.field_131 = false;
					} else {
						this.field_223 = 3;
					}
					break;
				} else {
					this.field_559 += 1;
				}
			}

			int var7 = -this.field_559;

			int var1;
			for (var1 = 0; var1 < field_565.length && var7 <= -340; ++var1) {
				if (field_565[var1] == 10) {
					var7 += 17;
				}
			}

			this.field_560 = var1;
			if (this.field_560 >= field_565.length) {
				this.field_560 = 0;
				this.field_559 = 0;
				return;
			}
			break;
		case 3:
			field_565 = null;
			System.gc();
			field_222 = 4;
			this.field_223 = 2;
			this.openSubmenu(0);
			this.field_353.method_58(19);
		}

	}

	// $FF: renamed from: cI () void
	private void method_435() {
		if (this.field_223 == 2) {
			Graphics var1 = this.field_314;
			var1.setColor(0, 0, 0);
			var1.fillRect(0, 0, 240, 320);
			int var2 = 0;
			int var3 = -17;
			int var4 = this.field_560;
			int var5 = this.field_560;
			boolean var7 = false;

			for (int var10 = this.field_559 >= 340 ? -(this.field_559 % 17) : 340 - this.field_559 - 17; var4 < field_565.length && var3 < 340; ++var4) {
				if (field_565[var4] == 10) {
					field_320[41]._crt_pal = 0;
					this.method_406(var1, field_565, field_320[41], var5, var4 - var5, var3 + var10, (ASprite)null, 0, 234);
					var3 += 17;
					var5 = var4 + 1;
				}
			}

			var2 = 0;

			for (int var8 = 6; var8 > 0; --var8) {
				var1.setColor(0);
				var1.fillRect(0, var2, 240, var8);
				var1.fillRect(0, 320 - var2 - var8, 240, var8);
				var2 += var8 + 1;
			}

			this.method_176();
		}
	}

	// $FF: renamed from: cJ () void
	private void method_436() {
		if (field_567 > 0) {
			field_567 = (int)((long)field_567 - (System.currentTimeMillis() - this.field_568));
			this.field_568 = System.currentTimeMillis();
			if (field_567 <= 0) {
				this.method_438(true);
			}
		}

	}

	// $FF: renamed from: a (java.lang.String, int, int, int, int, int) void
	private void method_437(String var1, int var2, int var3, int var4, int var5, int var6) {
		this.field_568 = System.currentTimeMillis();
		field_567 = var4;
		this.field_570 = var2;
		this.field_571 = var3;
		this.field_569 = method_441(var1, 220);
		this.field_572 = var5;
		this.field_573 = var6;
	}

	// $FF: renamed from: c (boolean) void
	private void method_438(boolean var1) {
		field_567 = 0;
		if (var1) {
			this.field_557 = true;
		}

	}

	// $FF: renamed from: h () boolean
	private static boolean method_439() {
		return field_567 > 0;
	}

	// $FF: renamed from: cK () void
	private void method_440() {
		ASprite var1 = field_320[41];
		if (field_567 > 0) {
			int var2 = var1._nLineSpacing;
			var1._nLineSpacing = 3;
			var1.UpdateStringSize(this.field_569);
			int var3 = ASprite._text_h;
			int var4 = ASprite._text_w;
			if (this.field_570 == -1) {
				this.field_570 = 240 - var4 >> 1;
			}

			if (this.field_571 == -1) {
				this.field_571 = 320 - var3 >> 1;
			}

			this.field_314.setClip(this.field_570 - 6, this.field_571 - 3, var4 + 12, var3 + 6);
			method_429(this.field_314, this.field_570 - 6, this.field_571 - 3, var4 + 12, var3 + 6, this.field_572, this.field_573);
			var1.DrawPage(this.field_314, this.field_569, this.field_570, this.field_571, 0);
			var1._nLineSpacing = var2;
		}
	}

	// $FF: renamed from: a (java.lang.String, int) java.lang.String
	public static String method_441(String var0, int var1) {
		ASprite var2 = field_320[41];
		int var4 = 0;
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;
		StringBuffer var9 = new StringBuffer(var0);

		for (int i = 0; i <= var9.length(); i++) {
			int var11 = 10;
			if (i < var9.length()) {
				var11 = var9.charAt(i) & 255;
			}

			if (var4 > var1 && var6 != var8) {
				var4 = var7;
				var9.setCharAt(var6, '\n');
				i = var6 - 1;
				var8 = var6;
			} else {
				if (var11 == 10) {
					var4 = 0;
				} else {
					int var16;
					if (var11 > 32) {
						if (var11 == 64) {
							var4 += 14;
							continue;
						}

						var11 = ASprite._pMapChar[var11] & 255;
						if (var11 >= var2.GetFModules(0)) {
							int var12 = var11 - var2.GetFModules(0);
							var16 = var2._frames_rc[(var12 << 2) + 2] & 255;
							var16 -= var2._frames_rc[var12 << 2] & 255;
							var4 += var16 + var2._fmodules[1];
						} else {
							int var14 = (var2._fmodules[var11 << 2] & 255) << 1;
							var16 = var2._modules[var14] & 255;
							var16 -= var2._fmodules[(var11 << 2) + 1];
							var4 += var16 + var2._fmodules[1];
						}
					} else if (var11 == 32) {
						var6 = i;
						var7 = var4;
						var16 = var2._modules[0] & 255;
						var4 += var16 + var2._fmodules[1];
					}
				}
			}
		}

		return var9.toString();
	}

	// $FF: renamed from: cL () void
	private static void loadFontSprite() {
		if (field_320[41] != null) {
			field_320[41] = null;
			System.gc();
		}

		field_320[41] = new ASprite();
		byte[] var0 = loadPackedFile("/ui.f", 1);
		field_320[41].Load(var0, 0);
		field_320[41].BuildCacheImages(0, 0, -1, -1);
		field_320[41].BuildCacheImages(1, 0, -1, -1);
		field_320[41].BuildCacheImages(2, 0, -1, -1); //Initialize 3 palettes of font
		field_320[41]._modules_data = null;
	}

	static {
		field_224 = field_222;
		field_325 = new byte[]{0, 0, -1, 0, 1, 0, 0, 0, 0, 1, 0, -1, 0, 0, 0, 0};
		field_326 = new byte[]{0, 3, 4, 1, 2, 5, 6};
		field_330 = null;
		preferenceData = null;
		field_355 = null;
		field_356 = null;
		field_367 = false;
		field_394 = null;
		field_395 = null;
		field_396 = 0;
		field_397 = 0;
		field_398 = -1;
		field_399 = -1;
		field_400 = -1;
		field_401 = -1;
		field_406 = null;
		field_407 = 0;
		field_408 = 0;
		field_409 = 0;
		field_428 = null;
		field_429 = false;
		field_430 = true;
		field_439 = 0;
		field_440 = new int[]{512, 16384, 131072, 131072, 4096};
		field_441 = 0;
		field_442 = 0;
		field_443 = 0;
		field_447 = new byte[16];
		field_448 = new byte[16];
		field_467 = false;
		field_501 = new long[15];
		field_502 = new long[15];
		menuData = new short[][]{{0, 0, 1, 1, 6, 3, 2, 2, 3, 4, 4, 5, 5, 6},
			{0, 25, 1, 26, 2, 2, 6, 4, 3, 49, 4, 27, 5, 6},
			{0, 28, 1, 29, 2, 30, 3, 31},
			{0, 32, 1, 33},
			{0, 45, 1, 46},
			{0, 33, 1, 50},
			{0, 25, 4, 27},
			{0, 101, 1, 100}};
			field_562 = new int[]{28, 29, 30};
			field_563 = new int[][]{{8, 9, 10, 11, 12, 14, 15, 16, 17, 20, 21, 22, 23}, {8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 20, 21, 22}, {8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 22, 47}};
			field_565 = null;
			field_566 = new String[]{"/w0.bin", "/w1.bin", "/w2.bin"};
			field_567 = 0;
	}
}
