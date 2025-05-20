import javax.microedition.lcdui.Graphics;

// $FF: renamed from: g
public final class ASpriteInstance {
	// $FF: renamed from: a int
	public int _posX;
	// $FF: renamed from: b int
	public int _posY;
	// $FF: renamed from: c int
	public int _pos_ox;
	// $FF: renamed from: d int
	public int _pos_oy;
	// $FF: renamed from: e int
	public int _flags;
	// $FF: renamed from: a a
	public ASprite _sprite;
	// $FF: renamed from: f int
	public int _nCrtAnim;
	// $FF: renamed from: g int
	public int _nCrtAFrame;
	// $FF: renamed from: h int
	public int _nCrtTime;
	// $FF: renamed from: a g
	public ASpriteInstance _parent;

	public ASpriteInstance() {
	}

	public ASpriteInstance(ASprite spr, int posX, int posY, ASpriteInstance parent) {
		this._posX = posX << 0;
		this._posY = posY << 0;
		this._sprite = spr;
		this._parent = parent;
	}

	// $FF: renamed from: a (int) void
	public final void SetAnim(int id) {
		if (id != this._nCrtAnim) {
			this._nCrtAnim = id;
			this._nCrtAFrame = 0;
			this._nCrtTime = 0;

			this._pos_ox = 0;
			this._pos_oy = 0;
		}

	}

	// $FF: renamed from: a () void
	public final void ApplyAnimOff() {
		int off = (this._sprite._anims_af_start[this._nCrtAnim] + this._nCrtAFrame) * 5;

		this._pos_ox = (this._sprite.animFrames[off + 2] << 0) * 1 / 1;
		if ((this._flags & ASprite.FLAG_FLIP_X) != 0) {
			this._pos_ox = -this._pos_ox;
		}

		this._pos_oy = (this._sprite.animFrames[off + 3] << 0) * 1 / 1;
		if ((this._flags & ASprite.FLAG_FLIP_Y) != 0) {
			this._pos_oy = -this._pos_oy;
		}

		this._posX += this._pos_ox;
		this._posY += this._pos_oy;
	}

	// $FF: renamed from: a () boolean
	public final boolean IsAnimEnded() {
		if (this._nCrtAFrame != this._sprite.getAnimFrames(this._nCrtAnim) - 1)
			return false;

		int time = this._sprite.GetAFrameTime(this._nCrtAnim, this._nCrtAFrame);

		return ((time == 0) || (this._nCrtTime == time - 1));
	}

	// $FF: renamed from: a (javax.microedition.lcdui.Graphics) void
	public final void PaintSprite(Graphics g) {
		if (this._sprite == null)
			return;

		int posX = this._posX;
		int posY = this._posY;

		for (ASpriteInstance o = this._parent; o != null; o = o._parent)
		{
			posX += o._posX;
			posY += o._posY;
		}

		posX = ZOOM_IN_FIXED_X(posX) + 0;
		posY = ZOOM_IN_FIXED_Y(posY) + 0;
		if (this._nCrtTime >= 0) {
			this._sprite.drawAnimFrame(g, this._nCrtAnim, this._nCrtAFrame, posX, posY, this._flags, 0, 0);
		} else if (this._nCrtAnim >= 0) {
			this._sprite.drawModule(g, this._nCrtAnim, posX, posY, this._flags);
		} else if (this._nCrtAFrame >= 0) {
			this._sprite.drawFrame(g, this._nCrtAFrame, posX, posY, this._flags, 0, 0);
		}
	}

	// $FF: renamed from: b () void
	public final void UpdateSpriteAnim() {
		if (this._sprite == null)
			return;

		if (this._nCrtTime < 0)
			return;

		int time = this._sprite.GetAFrameTime(this._nCrtAnim, this._nCrtAFrame);

		if (time == 0)
			return;

		++this._nCrtTime;

		if (time > this._nCrtTime)
			return;

		this._nCrtTime = 0;

		++this._nCrtAFrame;

		if (this._nCrtAFrame >= this._sprite.getAnimFrames(this._nCrtAnim)) {
			this._nCrtAFrame = 0;
			this._pos_ox = 0;
			this._pos_oy = 0;
		}
	}

	// $FF: renamed from: a (int) int
	private static int ZOOM_IN_FIXED_X(int x) {
		return (x >> 0) * 1 / 1;
	}

	// $FF: renamed from: b (int) int
	private static int ZOOM_IN_FIXED_Y(int y) {
		return (y >> 0) * 1 / 1;
	}
}
