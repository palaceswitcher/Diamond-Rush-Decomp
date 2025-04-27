import javax.microedition.lcdui.Graphics;

// $FF: renamed from: g
public final class ASpriteInstance {
   // $FF: renamed from: a int
   public int field_68;
   // $FF: renamed from: b int
   public int field_69;
   // $FF: renamed from: c int
   public int field_70;
   // $FF: renamed from: d int
   public int field_71;
   // $FF: renamed from: e int
   public int field_72;
   // $FF: renamed from: a a
   public ASprite field_73;
   // $FF: renamed from: f int
   public int field_74;
   // $FF: renamed from: g int
   public int field_75;
   // $FF: renamed from: h int
   public int field_76;
   // $FF: renamed from: a g
   public ASpriteInstance field_77;

   public ASpriteInstance() {
   }

   public ASpriteInstance(ASprite var1, int var2, int var3, ASpriteInstance var4) {
      this.field_68 = var2 << 0;
      this.field_69 = var3 << 0;
      this.field_73 = var1;
      this.field_77 = var4;
   }

   // $FF: renamed from: a (int) void
   public final void method_44(int var1) {
      if (var1 != this.field_74) {
         this.field_74 = var1;
         this.field_75 = 0;
         this.field_76 = 0;
         this.field_70 = 0;
         this.field_71 = 0;
      }

   }

   // $FF: renamed from: a () void
   public final void method_45() {
      int var1 = (this.field_73.field_12[this.field_74] + this.field_75) * 5;
      this.field_70 = (this.field_73.animFrameData[var1 + 2] << 0) * 1 / 1;
      if ((this.field_72 & 1) != 0) {
         this.field_70 = -this.field_70;
      }

      this.field_71 = (this.field_73.animFrameData[var1 + 3] << 0) * 1 / 1;
      if ((this.field_72 & 2) != 0) {
         this.field_71 = -this.field_71;
      }

      this.field_68 += this.field_70;
      this.field_69 += this.field_71;
   }

   // $FF: renamed from: a () boolean
   public final boolean method_46() {
      if (this.field_75 != this.field_73.method_4(this.field_74) - 1) {
         return false;
      } else {
         int var1;
         return (var1 = this.field_73.method_3(this.field_74, this.field_75)) == 0 || this.field_76 == var1 - 1;
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics) void
   public final void method_47(Graphics var1) {
      if (this.field_73 != null) {
         int var2 = this.field_68;
         int var3 = this.field_69;

         ASpriteInstance var4;
         for(ASpriteInstance var10000 = this; (var4 = var10000.field_77) != null; var10000 = var4) {
            var2 += var4.field_68;
            var3 += var4.field_69;
         }

         var2 = method_49(var2) + 0;
         var3 = method_50(var3) + 0;
         if (this.field_76 >= 0) {
            this.field_73.method_7(var1, this.field_74, this.field_75, var2, var3, this.field_72, 0, 0);
         } else if (this.field_74 >= 0) {
            this.field_73.method_10(var1, this.field_74, var2, var3, this.field_72);
         } else {
            if (this.field_75 >= 0) {
               this.field_73.method_8(var1, this.field_75, var2, var3, this.field_72, 0, 0);
            }

         }
      }
   }

   // $FF: renamed from: b () void
   public final void method_48() {
      if (this.field_73 != null) {
         if (this.field_76 >= 0) {
            int var1;
            if ((var1 = this.field_73.method_3(this.field_74, this.field_75)) != 0) {
               ++this.field_76;
               if (var1 <= this.field_76) {
                  this.field_76 = 0;
                  ++this.field_75;
                  if (this.field_75 >= this.field_73.method_4(this.field_74)) {
                     this.field_75 = 0;
                     this.field_70 = 0;
                     this.field_71 = 0;
                  }

               }
            }
         }
      }
   }

   // $FF: renamed from: a (int) int
   private static int method_49(int var0) {
      return (var0 >> 0) * 1 / 1;
   }

   // $FF: renamed from: b (int) int
   private static int method_50(int var0) {
      return (var0 >> 0) * 1 / 1;
   }
}
