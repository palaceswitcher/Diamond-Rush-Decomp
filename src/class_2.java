import javax.microedition.lcdui.Graphics;

// $FF: renamed from: b
public final class class_2 {
   // $FF: renamed from: a byte[][]
   public static byte[][] field_29;
   // $FF: renamed from: a byte
   public static byte field_30 = 0;
   // $FF: renamed from: b byte
   public static byte field_31 = 4;
   // $FF: renamed from: a int
   public static int field_32 = 0;
   // $FF: renamed from: b byte[][]
   public static byte[][] field_33;
   // $FF: renamed from: c byte
   public static byte field_34 = 0;
   // $FF: renamed from: d byte
   public static byte field_35 = 2;
   // $FF: renamed from: a boolean
   public static boolean field_36 = false;
   // $FF: renamed from: b int
   public static int field_37 = 0;

   // $FF: renamed from: a (int) void
   public static void method_16(int var0) {
      field_30 += field_31;
      if (field_30 > 24) {
         field_30 = 0;

         for(int var1 = 12; var1 >= 1; --var1) {
            for(int var2 = 0; var2 < 12; ++var2) {
               field_29[var2][var1] = field_29[var2][var1 - 1];
            }
         }

         method_17(var0);
      }

      if (field_36) {
         field_34 += field_35;
         if (field_34 > 24) {
            field_34 = 0;

            for(int var3 = 12; var3 >= 1; --var3) {
               for(int var4 = 0; var4 < 12; ++var4) {
                  field_33[var4][var3] = field_33[var4][var3 - 1];
               }
            }

            method_17(var0);
         }
      }

   }

   // $FF: renamed from: b (int) void
   public static void method_17(int var0) {
      for(int var1 = 0; var1 < 12; ++var1) {
         field_29[var1][0] = 0;
      }

      if (field_36) {
         for(int var4 = 0; var4 < 12; ++var4) {
            field_33[var4][0] = 0;
         }
      }

      int var2 = 0;

      for(int var3 = 0; var3 < var0; ++var3) {
         int var5;
         do {
            var5 = class_4.method_36(0, 12);
         } while(field_29[var5][0] != 0);

         var2 = class_4.method_36(1, 3);
         field_29[var5][0] = (byte)var2;
      }

      if (field_36) {
         for(int var9 = 0; var9 < var0; ++var9) {
            int var6;
            do {
               var6 = class_4.method_36(0, 12);
            } while(field_33[var6][0] != 0);

            var2 = class_4.method_36(1, 3);
            field_33[var6][0] = (byte)var2;
         }
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics) void
   public static void method_18(Graphics var0) {
      for(int var1 = 0; var1 < 12; ++var1) {
         for(int var2 = 0; var2 < 13; ++var2) {
            BitmapGfx var10000;
            Graphics var10001;
            int var10002;
            if (field_29[var1][var2] == 1) {
               var10000 = class_8.field_320[class_8.method_149(2)];
               var10001 = var0;
               var10002 = field_32;
            } else {
               if (field_29[var1][var2] != 2) {
                  continue;
               }

               var10000 = class_8.field_320[class_8.method_149(2)];
               var10001 = var0;
               var10002 = 0;
            }

            var10000.method_8(var10001, var10002, var1 * 24, (var2 - 1) * 24 + field_30, 0, 0, 0);
         }
      }

      if (field_36) {
         for(int var3 = 0; var3 < 12; ++var3) {
            for(int var4 = 0; var4 < 13; ++var4) {
               if (field_33[var3][var4] == 1 || field_33[var3][var4] == 2) {
                  class_8.field_320[class_8.method_149(2)].method_8(var0, 0, var3 * 24, (var4 - 1) * 24 + field_34, 0, 0, 0);
               }
            }
         }
      }

      field_32 = (field_32 + 1) % field_37;
   }
}
