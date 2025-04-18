import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// $FF: renamed from: e
public final class class_5 {
   // $FF: renamed from: a javax.microedition.lcdui.Image[]
   public static Image[] field_58;
   // $FF: renamed from: a a
   public static BitmapGfx field_59;
   // $FF: renamed from: b a
   public static BitmapGfx field_60;
   // $FF: renamed from: a java.lang.String[]
   public static String[] field_61;
   // $FF: renamed from: b java.lang.String[]
   public static String[] field_62;
   // $FF: renamed from: a int
   public static int field_63;
   // $FF: renamed from: b int
   public static int field_64;
   // $FF: renamed from: c int
   public static int field_65;
   // $FF: renamed from: a boolean
   public boolean field_66;
   // $FF: renamed from: d int
   public int field_67;

   public class_5() {
      field_58 = new Image[5];
      field_61 = new String[5];
   }

   // $FF: renamed from: a (java.lang.String) void
   private static void method_37(String var0) {
      if (var0 != null) {
         try {
            class_8.field_358.platformRequest(var0);
         } catch (Exception var2) {
         }
      }
   }

   // $FF: renamed from: a () void
   public static void method_38() {
      field_60 = class_8.field_320[41];
      field_60.field_26 = 1;
      field_59 = class_8.loadGfxFile("/tips.f", 0);
      if (field_62 == null) {
         boolean var0 = false;
         field_62 = class_8.loadStringsFromFile("/lang_IGA.f", 15);
         field_62[7] = class_8.method_441(field_62[7], 170);
         field_62[8] = class_8.method_441(field_62[8], 170);
         field_62[9] = class_8.method_441(field_62[9], 170);
      }

      int var3 = 10;

      for(int var1 = 0; var3 <= 14; ++var1) {
         field_61[var1] = class_8.field_358.getAppProperty(field_62[var3]);
         if (field_61[var1] != null && (field_61[var1].compareTo("no") == 0 || field_61[var1].compareTo("") == 0)) {
            field_61[var1] = null;
         }

         ++var3;
      }

      field_62[3] = field_62[3] + "\n\u0001\u0001" + field_62[4] + "\n\u0001\u0000" + field_62[5];
      field_62[7] = new String("\u0001\u0000" + field_62[7]);

      try {
         for(int var4 = 0; var4 < 4; ++var4) {
            field_58[var4] = Image.createImage("/ad" + (var4 + 1));
         }

         class_8.field_323[0] = new class_6(class_8.loadGfxFile("/ui.f", 0), 0, 0, (class_6)null);
      } catch (Exception var2) {
      }

      field_63 = 0;
      class_8.method_363(3);
   }

   // $FF: renamed from: a (int) void
   private static void method_39(int var0) {
      field_63 += var0;
      if (field_63 == 3 && field_61[field_63] == null) {
         field_63 += var0;
      }

      byte var10000;
      if (field_63 < 0) {
         var10000 = 4;
      } else {
         if (field_63 != 5) {
            return;
         }

         var10000 = 0;
      }

      field_63 = var10000;
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int) void
   private static void method_40(Graphics var0, int var1) {
      if (field_61[field_63] != null) {
         if (field_64 % 30 >= 15) {
            String[] var10000;
            byte var10001;
            if (field_63 >= 3) {
               var10000 = field_62;
               var10001 = 8;
            } else {
               var10000 = field_62;
               var10001 = 9;
            }

            String var2 = var10000[var10001];
            field_60.updateDrawnTextSize(var2);
            int var3 = BitmapGfx.drawnTextWidth + 2;
            int var4 = field_60.method_6(var2);
            int var6;
            if (var1 != 0) {
               var6 = 320 + var1 >> 1;
               var10001 = (byte) ((var4 >> 1) + 4); //NOTE: ADDED CAST
            } else {
               var6 = 160;
               var10001 = (byte) (var4 >> 1); //NOTE: ADDED CAST
            }

            int var5 = var6 - var10001;
            var0.setClip(0, 0, 240, 320);
            var0.setColor(16711680);
            var0.fillRect(120 - (var3 >> 1) - 4, var5 - 4, var3 + 8, var4 + 8);
            field_60.method_14(var0, var2, 120, var5, 1);
         }
      }
   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics) void
   private static void method_41(Graphics var0) {
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
   public final void method_42(Graphics var1) {
      method_41(var1);
      int var2 = 0;
      if (field_63 != 3) {
         class_8.field_323[0].field_73.method_8(var1, 11, 120, 15, 0, 0, 0);
      }

      int var10000;
      switch (field_63) {
         case 3:
            var1.drawImage(field_58[field_63], 120, 15, 17);
            field_60.method_14(var1, field_62[3], 120, 160, 3);
            field_60.updateDrawnTextSize(field_62[3]);
            var10000 = 160 + (BitmapGfx.drawnTextHeight >> 1) + 4;
            break;
         case 4:
            field_60.method_14(var1, "\n\u0001\u0002" + field_62[6], 120, 35, 17);
            field_60.method_14(var1, field_62[7], 120, 160, 3);
            field_60.updateDrawnTextSize(field_62[7]);
            var10000 = 160 + (BitmapGfx.drawnTextHeight >> 1) + 4;
            break;
         default:
            var1.drawImage(field_58[field_63], 120, 240, 33);
            field_60.method_14(var1, field_62[field_63], 120, 242, 17);
            var10000 = 0;
      }

      var2 = var10000;
      class_8.field_92.method_176();
      if (field_61[field_63] != null) {
         class_8.field_92.method_177();
      }

      method_40(var1, var2);
      if (class_8.isKeyPressed(16388)) {
         method_39(-1);
      } else if (class_8.isKeyPressed(65544)) {
         method_39(1);
      } else if (class_8.isKeyPressed(32944)) {
         method_37(field_61[field_63]);
      } else if (class_8.isKeyPressed(64)) {
         class_8.field_92.method_63(0);
         field_65 = 2;
         class_8.keysPressed = 0;
      }

      field_59.method_7(var1, class_8.isKeyPressed(16388) ? 2 : 0, field_64 % field_59.method_4(0), 20 + this.field_67, 160, 0, 0, 0);
      field_59.method_7(var1, class_8.isKeyPressed(65544) ? 3 : 1, field_64 % field_59.method_4(1), 220 - this.field_67, 160, 0, 0, 0);
      this.field_67 += this.field_66 ? -1 : 1;
      if (this.field_67 > 3 || this.field_67 < 1) {
         this.field_66 = !this.field_66;
      }

      class_8.keysPressed = 0;
   }

   // $FF: renamed from: b () void
   public static void method_43() {
      boolean var0 = false;
      int var1 = field_58.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         field_58[var2] = null;
      }

      field_58 = null;
      var1 = field_61.length;

      for(int var3 = 0; var3 < var1; ++var3) {
         field_61[var3] = null;
      }

      field_61 = null;
      var1 = field_62.length;

      for(int var4 = 0; var4 < var1; ++var4) {
         field_62[var4] = null;
      }

      field_62 = null;
      field_60 = null;
      field_59 = null;
      field_65 = 0;
      System.gc();
   }
}
