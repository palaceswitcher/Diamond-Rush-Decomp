import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Graphics;

// $FF: renamed from: c
public final class DemoInterpreter {
   // $FF: renamed from: a long
   public static long field_38 = 1000L;
   // $FF: renamed from: a java.lang.String
   public static String field_39 = "/demoSpr.bin";
   // $FF: renamed from: b java.lang.String
   public static String field_40 = "/demo.f";
   // $FF: renamed from: a a[]
   public static ASprite[] field_41 = null;
   // $FF: renamed from: a byte[][]
   public byte[][] field_42 = (byte[][])null;
   // $FF: renamed from: a int
   public int field_43 = 0;
   // $FF: renamed from: b long
   public long field_44;
   // $FF: renamed from: a byte[]
   public byte[] field_45 = null;
   // $FF: renamed from: b int
   public int field_46;
   // $FF: renamed from: a boolean
   public boolean field_47 = false;
   // $FF: renamed from: c int
   public int field_48 = 0;
   // $FF: renamed from: d int
   public int field_49 = 0;
   // $FF: renamed from: e int
   public int field_50 = 0;
   // $FF: renamed from: f int
   public int field_51 = 0;
   // $FF: renamed from: g int
   public int field_52 = -1;
   // $FF: renamed from: b boolean
   public boolean field_53 = false;
   // $FF: renamed from: a i
   public cGame field_54 = null;
   // $FF: renamed from: a short[]
   public final short[] field_55 = new short[16];
   // $FF: renamed from: h int
   public int field_56;

   public DemoInterpreter(cGame var1) {
      this.field_54 = var1;
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, byte[], int) void
   private void method_19(Graphics var1, byte[] var2, int var3) {
      if (var2 != null) {
         byte var13;
         switch (var13 = var2[var3 + 0]) {
            case 1:
               int var45 = this.field_46;
               short var29 = (short)cGame.getShortFromBytes(var2, var3 + 2);
               short var32 = (short)cGame.getShortFromBytes(var2, var3 + 4);
               short var41 = (short)cGame.getShortFromBytes(var2, var3 + 6);
               short var35 = (short)cGame.getShortFromBytes(var2, var3 + 8);
               short var37 = (short)cGame.getShortFromBytes(var2, var3 + 10);
               if (var35 == 10000) {
                  var35 = (short)this.field_54.field_203;
               }

               if (var37 == 10000) {
                  var37 = (short)this.field_54.field_204;
               }

               if (var45 > var41) {
                  var45 = var41;
               }

               int var19;
               int var20;
               label97: {
                  var29 = (short)(var29 - 108);
                  var32 = (short)(var32 - 108);
                  this.field_54.field_203 = (short)((var29 * var45 + var35 * (var41 - var45)) / var41);
                  this.field_54.field_204 = (short)((var32 * var45 + var37 * (var41 - var45)) / var41);
                  var19 = this.field_54.crtLevelWidth * 24 - 240;
                  var20 = this.field_54.crtLevelHeight * 24 - 320 + 80;
                  cGame var10000;
                  int var10001;
                  if (this.field_54.field_203 > var19) {
                     var10000 = this.field_54;
                     var10001 = var19;
                  } else {
                     if (this.field_54.field_203 >= 0) {
                        break label97;
                     }

                     var10000 = this.field_54;
                     var10001 = 0;
                  }

                  var10000.field_203 = var10001;
               }

               label91: {
                  cGame var50;
                  int var52;
                  if (this.field_54.field_204 > var20) {
                     var50 = this.field_54;
                     var52 = var20;
                  } else {
                     if (this.field_54.field_204 >= 0) {
                        break label91;
                     }

                     var50 = this.field_54;
                     var52 = 0;
                  }

                  var50.field_204 = var52;
               }

               this.field_54.field_201 = this.field_54.field_203;
               this.field_54.field_202 = this.field_54.field_204;
               if (this.field_54.field_201 > var19) {
                  cGame var51 = this.field_54;
                  var51.field_201 -= var19;
               }

               if (this.field_54.field_202 > var20) {
                  this.field_54.field_202 = var20;
                  return;
               }

               if (this.field_54.field_202 < 0) {
                  return;
               }
               break;
            case 2:
               cGame.field_320[41]._nLineSpacing = 2;
               short var39 = (short)cGame.getShortFromBytes(var2, var3 + 6);
               short var38;
               if ((var38 = (short)cGame.getShortFromBytes(var2, var3 + 4)) == 10000) {
                  var38 = -240;
               }

               int var23 = var2[var3 + 8] & 255;
               int var48 = var2[var3 + 9] & 255;
               int var24 = var23 * cGame.method_362(cGame.field_320[41]) + 4 - 2;
               cGame.method_429(var1, var38, var39, 226, var24, 73, 0);
               String var49 = null;

               try {
                  var49 = new String(var2, var3 + 11, (short)cGame.getShortFromBytes(var2, var3 + 2), "ISO-8859-1");
               } catch (Exception var26) {
               }

               this.method_33(var49, 222);
               this.method_32(var1, var49, var38 + 2, var39 + 2, var48, var48 + var23);
               if (cGame.field_227 / 2 % 4 < 2) {
                  var1.drawImage(cGame.field_319[0][9], var38 + 226 - 10, var39 + var24 - 5, 17);
               }

               var1.setClip(0, 0, 240, 320);
               break;
            case 4:
               int var44 = this.field_46;
               short var34 = (short)cGame.getShortFromBytes(var2, var3 + 2);
               short var36 = (short)cGame.getShortFromBytes(var2, var3 + 4);
               short var28 = (short)cGame.getShortFromBytes(var2, var3 + 6);
               short var31 = (short)cGame.getShortFromBytes(var2, var3 + 6);
               short var40 = (short)cGame.getShortFromBytes(var2, var3 + 14);
               if (var44 > var40) {
                  var44 = var40;
               }

               short var8 = (short)((var28 * var44 + var34 * (var40 - var44)) / var40);
               short var9 = (short)((var31 * var44 + var36 * (var40 - var44)) / var40);
               short var11 = (short)cGame.getShortFromBytes(var2, var3 + 10);
               short var12 = (short)cGame.getShortFromBytes(var2, var3 + 12);
               field_41[var11].PaintFrame(var1, var12, var8, var9, 0, 0, 0);
               return;
            case 12:
               int var43 = this.field_46;
               var1.setColor(16777215);
               if (var43 > 5) {
                  var43 = 5;
               }

               int var15 = this.field_54.playerXPos * 24;
               int var16 = this.field_54.playerYPos * 24;
               int var46 = this.field_48;
               int var47 = this.field_49;
               var1.fillRect(((var15 - this.field_54.field_201) * (5 - var43) + var46 * var43) / 5, ((var16 - this.field_54.field_202) * (5 - var43) + var47 * var43) / 5, 102 * var43 / 5, 38 * var43 / 5);
               return;
            case 13:
               int var42 = this.field_46;
               short var4 = (short)cGame.getShortFromBytes(var2, var3 + 2);
               short var5 = (short)cGame.getShortFromBytes(var2, var3 + 4);
               short var10 = (short)cGame.getShortFromBytes(var2, var3 + 6);
               short var6 = (short)cGame.getShortFromBytes(var2, var3 + 8);
               short var7 = (short)cGame.getShortFromBytes(var2, var3 + 10);
               if (var42 > var10) {
                  var42 = var10;
               }

               short var17 = (short)((var4 * var42 + var6 * (var10 - var42)) / var10);
               short var18 = (short)((var5 * var42 + var7 * (var10 - var42)) / var10);
               if (var13 == 13) {
                  this.field_48 = var17;
                  this.field_49 = var18;
                  return;
               }
               break;
            case 18:
               if (var2[var3 + 7] != 0) {
                  int var14 = (var2[var3 + 3] & 255) + ((var2[var3 + 3 + 1] & 255) << 8) + ((var2[var3 + 3 + 2] & 255) << 16);
                  var1.setColor(var14);
                  var1.fillRect(0, 0, 240, 320);
                  return;
               }
               break;
            case 27:
               cGame.field_320[41]._nLineSpacing = 2;
               int var21 = var2[var3 + 6] & 255;
               cGame.method_430(var1, 6, 229, 226, 35, 73, 1, cGame.getStringWidth(cGame.field_320[41], cGame.menuText[70], 0) + 10, 15);
               String var22 = null;

               try {
                  var22 = new String(var2, var3 + 8, (short)cGame.getShortFromBytes(var2, var3 + 2), "ISO-8859-1");
               } catch (Exception var27) {
               }

               this.method_33(var22, 196);
               this.method_32(var1, var22, 22, 231, var21, var21 + 2);
               cGame.field_320[41].DrawString(var1, cGame.menuText[70], 19, 211, 20);
               if (cGame.field_227 / 2 % 4 < 2) {
                  var1.drawImage(cGame.field_319[0][9], 223, 220, 17);
                  return;
               }
         }

      }
   }

   // $FF: renamed from: a (byte[], int) void
   private void method_20(byte[] var1, int var2) {
      switch ((short)var1[var2 + 0]) {
         case 2:
            String var10 = null;

            try {
               var10 = new String(var1, var2 + 11, (short)cGame.getShortFromBytes(var1, var2 + 2), "ISO-8859-1");
            } catch (Exception var9) {
            }

            this.method_33(var10, 222);
            short var11 = (short)(var1[var2 + 9] & 255);
            short var12 = (short)(var1[var2 + 8] & 255);
            byte[] var10000;
            int var10001;
            byte var10002;
            if (var11 + var12 >= this.field_56) {
               var10000 = var1;
               var10001 = var2 + 10;
               var10002 = 1;
            } else {
               var10000 = var1;
               var10001 = var2 + 9;
               var10002 = (byte)(var11 + var12);
            }

            var10000[var10001] = var10002;
         default:
            return;
         case 7:
            var1[var2 + 1] = 1;
            return;
         case 27:
            if (!cGame.field_367) {
               String var4 = null;

               try {
                  var4 = new String(var1, var2 + 8, (short)cGame.getShortFromBytes(var1, var2 + 2), "ISO-8859-1");
               } catch (Exception var8) {
               }

               this.method_33(var4, 196);
               short var5 = (short)(var1[var2 + 6] & 255);
               boolean var6 = false;
               if (var5 + 2 >= this.field_56) {
                  var1[var2 + 7] = 1;
               } else {
                  var1[var2 + 6] = (byte)(var5 + 2);
               }
            }
      }
   }

   // $FF: renamed from: a () void
   public final void method_21() {
      if (this.field_45 != null) {
         if (Math.abs(this.field_44 - System.currentTimeMillis()) >= field_38) {
            if (this.field_45[0] == 0) {
               byte var1 = this.field_45[1];
               int var2 = 2 + var1 * 4;

               for(int var3 = 0; var3 < var1; ++var3) {
                  int var4 = cGame.getI32FromBytes(this.field_45, 2 + var3 * 4);
                  this.method_20(this.field_45, var2);
                  var2 += var4;
               }
            } else {
               this.method_20(this.field_45, 0);
            }

         }
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics) void
   public final void method_22(Graphics var1) {
      if (!this.field_53) {
         switch (this.method_30()) {
            case 25:
            case 26:
               if (this.field_42 == null || this.field_43 >= this.field_42.length) {
                  return;
               }
               break;
            default:
               var1.setColor(0);
               var1.fillRect(0, 0, 240, 42);
               var1.fillRect(0, 278, 240, 42);
               cGame.field_320[41].DrawString(var1, cGame.menuText[53], 5, 315, 36);
         }

         if (this.field_45[0] == 0) {
            byte var2 = this.field_45[1];
            int var3 = 2 + var2 * 4;

            for(int var4 = 0; var4 < var2; ++var4) {
               int var5 = cGame.getI32FromBytes(this.field_45, 2 + var4 * 4);
               this.method_19(var1, this.field_45, var3);
               var3 += var5;
            }
         } else {
            this.method_19(var1, this.field_45, 0);
         }

         if (this.field_47) {
            var1.setColor(0);
            var1.fillRect(this.field_48 - 3, this.field_49 - 3, 109, 45);
            field_41[this.field_51].PaintAFrame(var1, 0, this.field_46 % field_41[this.field_51].GetAFrames(0), this.field_48, this.field_49, 0, 0, 0);
            field_41[0].PaintFrame(var1, this.field_50, this.field_48 + 0, this.field_49, 0, 0, 0);
            if (this.field_52 >= 0) {
               field_41[1].PaintFrame(var1, this.field_52, this.field_48 + 90, this.field_49 + -6, 0, 0, 0);
            }
         }

      }
   }

   // $FF: renamed from: a () byte[]
   public final byte[] method_23() {
      this.method_25(this.field_42);
      this.field_47 = false;
      this.field_48 = 0;
      this.field_49 = 0;
      this.field_50 = 0;
      this.field_51 = 0;
      this.field_52 = -1;
      this.field_53 = false;
      this.field_43 = 0;
      this.field_44 = System.currentTimeMillis();
      return this.method_26();
   }

   // $FF: renamed from: b (byte[], int) void
   private void method_24(byte[] var1, int var2) {
      if (var1[var2 + 0] != 0) {
         var1[var2 + 1] = 0;
         byte[] var10000;
         int var10001;
         byte var10002;
         switch (var1[var2 + 0]) {
            case 2:
               var1[var2 + 9] = 0;
               method_34(var1, var2 + 4, (short)-240);
               var10000 = var1;
               var10001 = var2;
               var10002 = 10;
               break;
            case 27:
               var1[var2 + 6] = 0;
               method_34(var1, var2 + 4, (short)-240);
               var10000 = var1;
               var10001 = var2;
               var10002 = 7;
               break;
            default:
               return;
         }

         var10000[var10001 + var10002] = 0;
      } else {
         byte var3 = var1[var2 + 1];
         int var4 = var2 + 2 + var3 * 4;

         for(int var5 = 0; var5 < var3; ++var5) {
            int var6 = cGame.getI32FromBytes(var1, var2 + 2 + var5 * 4);
            this.method_24(var1, var4);
            var4 += var6;
         }

      }
   }

   // $FF: renamed from: a (byte[][]) void
   private void method_25(byte[][] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.method_24(var1[var2], 0);
      }

   }

   // $FF: renamed from: b () byte[]
   public final byte[] method_26() {
      this.field_46 = 0;
      DemoInterpreter var10000;
      byte[] var10001;
      if (this.field_42 != null && this.field_43 < this.field_42.length) {
         var10000 = this;
         var10001 = this.field_42[this.field_43++];
      } else {
         var10000 = this;
         var10001 = null;
      }

      var10000.field_45 = var10001;
      return this.field_45;
   }

   // $FF: renamed from: b () void
   public final void method_27() {
      if (this.field_45[0] == 0) {
         byte var1 = this.field_45[1];
         int var2 = 2 + var1 * 4;

         for(int var3 = 0; var3 < var1; ++var3) {
            int var4 = cGame.getI32FromBytes(this.field_45, 2 + var3 * 4);
            this.method_28(this.field_45, var2);
            var2 += var4;
         }
      } else {
         this.method_28(this.field_45, 0);
      }

      ++this.field_46;
   }

   // $FF: renamed from: c (byte[], int) void
   private void method_28(byte[] var1, int var2) {
      short var7 = (short)var1[var2 + 0];
      if (this.field_53) {
         switch (var7) {
            case 5:
            case 9:
            case 10:
            case 25:
            case 26:
               break;
            default:
               var1[var2 + 1] = 1;
               return;
         }
      }

      switch (var7) {
         case 1:
            if ((short)cGame.getShortFromBytes(var1, var2 + 8) == 10000) {
               method_34(var1, var2 + 8, (short)this.field_54.field_203);
            }

            if ((short)cGame.getShortFromBytes(var1, var2 + 10) == 10000) {
               method_34(var1, var2 + 10, (short)this.field_54.field_204);
            }

            short var22 = (short)cGame.getShortFromBytes(var1, var2 + 6);
            if (this.field_46 > var22) {
               var1[var2 + 1] = 1;
               return;
            }
            break;
         case 2:
            short var17;
            if ((var17 = (short)cGame.getShortFromBytes(var1, var2 + 4)) == 10000) {
               var17 = -226;
            }

            var17 = (short)(var17 + 30);
            if (var1[var2 + 10] == 0) {
               if (var17 > 7) {
                  var17 = 7;
               }
            } else if (var17 > 240) {
               var1[var2 + 1] = 1;
            }

            method_34(var1, var2 + 4, var17);
         case 3:
         case 7:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         default:
            break;
         case 4:
            short var21 = (short)cGame.getShortFromBytes(var1, var2 + 14);
            if (this.field_46 > var21) {
               var1[var2 + 1] = 1;
               return;
            }
            break;
         case 5:
            cGame.method_348((short)cGame.getShortFromBytes(var1, var2 + 2), (short)cGame.getShortFromBytes(var1, var2 + 4), var1[var2 + 6], 0);
            var1[var2 + 1] = 1;
            return;
         case 6:
            if (this.field_46 > cGame.getI32FromBytes(var1, var2 + 2)) {
               var1[var2 + 1] = 1;
               return;
            }
            break;
         case 8:
            return;
         case 9:
            cGame.method_348((short)cGame.getShortFromBytes(var1, var2 + 2), (short)cGame.getShortFromBytes(var1, var2 + 4), (byte)0, (short)cGame.getShortFromBytes(var1, var2 + 6));
            var1[var2 + 1] = 1;
            return;
         case 10:
            byte var6 = var1[var2 + 2];
            if (this.field_46 == 0) {
               this.field_54.field_233 = this.field_54.field_233 & -8 | var6;
               this.field_54.field_196 = var6;
            } else if (this.field_54.field_232 <= 0) {
               this.field_54.field_196 = 0;
               var1[var2 + 1] = 1;
            }

            this.field_54.method_285();
            return;
         case 11:
            this.field_51 = (short)cGame.getShortFromBytes(var1, var2 + 4);
            this.field_50 = (short)cGame.getShortFromBytes(var1, var2 + 2);
            var1[var2 + 1] = 1;
            return;
         case 12:
            short var16 = (short)cGame.getShortFromBytes(var1, var2 + 2);
            short var20 = (short)cGame.getShortFromBytes(var1, var2 + 4);
            this.field_48 = var16;
            this.field_49 = var20;
            if (this.field_46 > 5) {
               var1[var2 + 1] = 1;
               this.field_47 = true;
               return;
            }
            break;
         case 13:
            if ((short)cGame.getShortFromBytes(var1, var2 + 8) == 10000) {
               method_34(var1, var2 + 8, (short)this.field_48);
            }

            if ((short)cGame.getShortFromBytes(var1, var2 + 10) == 10000) {
               method_34(var1, var2 + 10, (short)this.field_49);
            }

            short var5 = (short)cGame.getShortFromBytes(var1, var2 + 6);
            if (this.field_46 > var5) {
               var1[var2 + 1] = 1;
               return;
            }
            break;
         case 14:
         case 15:
            this.field_47 = var7 == 14;
            var1[var2 + 1] = 1;
            return;
         case 16:
         case 17:
         case 18:
            if (this.field_46 % 2 == 0) {
               return;
            }

            int var8 = var2 + (var7 == 18 ? 2 : 4);
            byte var9 = var1[var8];
            short var10 = -1;
            int var11 = var2 + (var7 == 18 ? 7 : 5);
            boolean var12 = var1[var11] != 0;
            if (var7 != 18) {
               var10 = (short)cGame.getShortFromBytes(var1, var2 + 2);
            }

            if (var12) {
               var12 = false;
               this.field_52 = -1;
               if (--var9 == 0) {
                  var1[var2 + 1] = 1;
                  if (var7 != 18) {
                     this.field_52 = var7 == 16 ? var10 : -1;
                  }
               }
            } else if (var9 > 0) {
               var12 = true;
               if (var7 != 18) {
                  this.field_52 = var10;
               }
            } else {
               var1[var2 + 1] = 1;
            }

            var1[var11] = (byte)(var12 ? 1 : 0);
            var1[var8] = var9;
            return;
         case 25:
            short var15 = (short)cGame.getShortFromBytes(var1, var2 + 2);
            short var19 = (short)cGame.getShortFromBytes(var1, var2 + 4);
            byte var23 = var1[var2 + 6];
            byte var14 = var1[var2 + 7];
            cGame.field_332[var15][var19] = var14 << 8 | var23;
            var1[var2 + 1] = 1;
            return;
         case 26:
            short var3 = (short)cGame.getShortFromBytes(var1, var2 + 2);
            short var4 = (short)cGame.getShortFromBytes(var1, var2 + 4);
            int var13 = cGame.getI32FromBytes(var1, var2 + 6);
            cGame.field_333[var3][var4] = var13;
            var1[var2 + 1] = 1;
            return;
         case 27:
            if (var1[var2 + 7] != 0) {
               var1[var2 + 1] = 1;
               return;
            }
      }

   }

   // $FF: renamed from: a () boolean
   public final boolean method_29() {
      boolean var1 = true;
      if (this.field_45[0] == 0) {
         byte var2 = this.field_45[1];
         int var3 = 2 + var2 * 4;

         for(int var4 = 0; var4 < var2; ++var4) {
            int var5 = cGame.getI32FromBytes(this.field_45, 2 + var4 * 4);
            if (!(var1 = var1 && this.field_45[var3 + 1] == 1)) {
               break;
            }

            var3 += var5;
         }
      } else {
         var1 = this.field_45[1] == 1;
      }

      return var1;
   }

   // $FF: renamed from: a () byte
   private byte method_30() {
      return this.field_45 == null ? -1 : this.field_45[0];
   }

   // $FF: renamed from: a (int) void
   public final void method_31(int var1) {
      try {
         String var10002 = field_40;
         this.field_54.getClass();
         ByteArrayInputStream var2 = new ByteArrayInputStream(cGame.loadPackedFile(var10002, 0));
         byte[] var3 = new byte[4];
         var2.read(var3, 0, 2);
         boolean var4 = false;

         do {
            var2.read(var3, 0, 2);
            if ((short)cGame.getShortFromBytes(var3, 0) != var1) {
               var2.skip(2L);
               var2.read(var3, 0, 4);
               int var40 = cGame.getI32FromBytes(var3, 0);
               var2.skip((long)var40);
            } else {
               var2.read(var3, 0, 2);
               short var6 = (short)cGame.getShortFromBytes(var3, 0);
               var2.read(var3, 0, 4);
               var3 = new byte[cGame.getI32FromBytes(var3, 0)];
               ((InputStream)var2).read(var3);
               var2.close();
               var2 = null;
               var4 = true;
               int var8 = 0;
               short var9 = (short)cGame.getShortFromBytes(var3, 0);
               var8 += 2;
               if (var9 != 0) {
                  short[] var10 = new short[var9];

                  for(int var11 = 0; var11 < var9; ++var11) {
                     var10[var11] = (short)cGame.getShortFromBytes(var3, var8);
                     var8 += 2;
                  }

                  for(int var13 = 1; var13 < var9; ++var13) {
                     short var72 = var10[var13];
                     int var10000 = var13;

                     while(true) {
                        int var12 = var10000;
                        if (var10000 <= 0 || var10[var12 - 1] <= var72) {
                           var10[var12] = var72;
                           break;
                        }

                        var10[var12] = var10[var12 - 1];
                        var10000 = var12 - 1;
                     }
                  }

                  InputStream var75 = this.getClass().getResourceAsStream(field_39);
                  byte[] var14 = new byte[4];
                  var75.read(var14, 0, 2);
                  short var15 = (short)cGame.getShortFromBytes(var14, 0);
                  if (field_41 == null) {
                     field_41 = new ASprite[var15];
                  }

                  for(int var16 = 0; var16 < var9; ++var16) {
                     short var17 = var10[var16];
                     boolean var18 = false;

                     while(!var18) {
                        var75.read(var14, 0, 2);
                        short var19 = (short)cGame.getShortFromBytes(var14, 0);
                        if (var17 == var19) {
                           var18 = true;
                        }

                        var75.read(var14, 0, 4);
                        int var20 = cGame.getI32FromBytes(var14, 0);
                        if (!var18 && field_41[var17] != null) {
                           var75.skip((long)var20);
                        } else {
                           var14 = new byte[var20];
                           var75.read(var14);
                           field_41[var17] = new ASprite();
                           field_41[var17].Load(var14, 0);
                           field_41[var17].BuildCacheImages(0, 0, -1, -1);
                           field_41[var17]._modules_data = null;
                        }
                     }
                  }

                  var75.close();
               }

               byte[][] var71 = new byte[var6][];
               int var73 = 0;
               byte[][] var74 = (byte[][])null;
               int var76 = 0;
               Object var77 = null;
               int var79 = 0;

               for(int var80 = 0; var80 < var6 || var79 != 0; ++var80) {
                  byte[][] var78;
                  if (var79 == 0) {
                     var78 = var71;
                  } else {
                     var78 = var74;
                     --var79;
                     --var80;
                  }

                  int var81;
                  byte[] var82;
                  label96: {
                     var81 = var3[var8++] & 255;
                     var82 = null;
                     byte[] var112;
                     switch (var81) {
                        case 0:
                           var74 = new byte[var79 = (short)(var3[var8++] & 255)][];
                           var112 = null;
                           break;
                        case 1:
                           short var98 = (short)(cGame.getShortFromBytes(var3, var8) * 24);
                           var8 += 2;
                           short var105 = (short)(cGame.getShortFromBytes(var3, var8) * 24);
                           var8 += 2;
                           short var107 = (short)cGame.getShortFromBytes(var3, var8);
                           var8 += 2;
                           method_34(var82 = new byte[12], 2, var98);
                           method_34(var82, 4, var105);
                           method_34(var82, 6, var107);
                           method_34(var82, 8, (short)10000);
                           method_34(var82, 10, (short)10000);
                           break label96;
                        case 2:
                           short var36 = (short)(var3[var8++] & 255);
                           short var104 = (short)cGame.getShortFromBytes(var3, var8);
                           var8 += 2;
                           short var109 = (short)cGame.getShortFromBytes(var3, var8);
                           var8 += 2;
                           method_34(var82 = new byte[11 + var109], 2, var109);
                           method_34(var82, 4, (short)10000);
                           method_34(var82, 6, var104);
                           var82[8] = (byte)var36;
                           var82[9] = 0;
                           var82[10] = 0;
                           System.arraycopy(var3, var8, var82, 11, var109);
                           var8 += var109;
                        case 3:
                        case 8:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        default:
                           break label96;
                        case 4:
                           short var26 = (short)cGame.getShortFromBytes(var3, var8);
                           var8 += 2;
                           short var27 = (short)cGame.getShortFromBytes(var3, var8);
                           var8 += 2;
                           short var28 = (short)cGame.getShortFromBytes(var3, var8);
                           var8 += 2;
                           short var29 = (short)cGame.getShortFromBytes(var3, var8);
                           var8 += 2;
                           short var30 = (short)cGame.getShortFromBytes(var3, var8);
                           var8 += 2;
                           short var91 = (short)cGame.getShortFromBytes(var3, var8);
                           var8 += 2;
                           short var106 = (short)cGame.getShortFromBytes(var3, var8);
                           var8 += 2;
                           method_34(var82 = new byte[16], 2, var26);
                           method_34(var82, 4, var27);
                           method_34(var82, 6, var28);
                           method_34(var82, 8, var29);
                           method_34(var82, 10, var30);
                           method_34(var82, 12, var91);
                           method_34(var82, 14, var106);
                           break label96;
                        case 5:
                           short var97 = (short)cGame.getShortFromBytes(var3, var8);
                           int var58 = var8 + 2;
                           short var103 = (short)cGame.getShortFromBytes(var3, var58);
                           var8 = var58 + 2;
                           short var108 = (short)(var3[var8++] & 255);
                           method_34(var82 = new byte[7], 2, var97);
                           method_34(var82, 4, var103);
                           var82[6] = (byte)var108;
                           break label96;
                        case 6:
                           int var31 = cGame.getI32FromBytes(var3, var8);
                           var8 += 4;
                           method_35(var82 = new byte[6], 2, var31);
                           break label96;
                        case 7:
                           var112 = new byte[2];
                           break;
                        case 9:
                           short var96 = (short)cGame.getShortFromBytes(var3, var8);
                           var8 += 2;
                           short var102 = (short)cGame.getShortFromBytes(var3, var8);
                           var8 += 2;
                           short var37 = (short)cGame.getShortFromBytes(var3, var8);
                           var8 += 2;
                           method_34(var82 = new byte[8], 2, var96);
                           method_34(var82, 4, var102);
                           method_34(var82, 6, var37);
                           break label96;
                        case 10:
                           short var38 = (short)(var3[var8++] & 255);
                           (var82 = new byte[3])[2] = (byte)var38;
                           break label96;
                        case 11:
                           short var90 = (short)cGame.getShortFromBytes(var3, var8);
                           var8 += 2;
                           short var22 = (short)cGame.getShortFromBytes(var3, var8);
                           var8 += 2;
                           method_34(var82 = new byte[6], 2, var90);
                           method_34(var82, 4, var22);
                           break label96;
                        case 12:
                           short var95 = (short)cGame.getShortFromBytes(var3, var8);
                           var8 += 2;
                           short var101 = (short)cGame.getShortFromBytes(var3, var8);
                           var8 += 2;
                           method_34(var82 = new byte[6], 2, var95);
                           method_34(var82, 4, var101);
                           break label96;
                        case 13:
                           short var94 = (short)cGame.getShortFromBytes(var3, var8);
                           var8 += 2;
                           short var100 = (short)cGame.getShortFromBytes(var3, var8);
                           var8 += 2;
                           short var25 = (short)cGame.getShortFromBytes(var3, var8);
                           var8 += 2;
                           method_34(var82 = new byte[12], 2, var94);
                           method_34(var82, 4, var100);
                           method_34(var82, 6, var25);
                           method_34(var82, 8, (short)10000);
                           method_34(var82, 10, (short)10000);
                           break label96;
                        case 14:
                        case 15:
                           var112 = new byte[2];
                           break;
                        case 16:
                        case 17:
                           short var21 = (short)cGame.getShortFromBytes(var3, var8);
                           var8 += 2;
                           short var85 = (short)(var3[var8++] & 255);
                           method_34(var82 = new byte[6], 2, var21);
                           method_34(var82, 4, var85);
                           var82[5] = 0;
                           break label96;
                        case 18:
                           short var84 = (short)(var3[var8++] & 255);
                           int var87 = (var3[var8++] & 255) + ((var3[var8++] & 255) << 8) + ((var3[var8++] & 255) << 16);
                           method_34(var82 = new byte[8], 2, var84);
                           method_35(var82, 3, var87);
                           var82[7] = 0;
                           break label96;
                        case 25:
                           short var93 = (short)cGame.getShortFromBytes(var3, var8);
                           int var45 = var8 + 2;
                           short var99 = (short)cGame.getShortFromBytes(var3, var45);
                           var8 = var45 + 2;
                           short var33 = (short)(var3[var8++] & 255);
                           short var34 = (short)(var3[var8++] & 255);
                           method_34(var82 = new byte[8], 2, var93);
                           method_34(var82, 4, var99);
                           var82[6] = (byte)var33;
                           var82[7] = (byte)var34;
                           break label96;
                        case 26:
                           short var23 = (short)cGame.getShortFromBytes(var3, var8);
                           var8 += 2;
                           short var24 = (short)cGame.getShortFromBytes(var3, var8);
                           var8 += 2;
                           int var32 = cGame.getI32FromBytes(var3, var8);
                           var8 += 4;
                           method_34(var82 = new byte[10], 2, var23);
                           method_34(var82, 4, var24);
                           method_35(var82, 6, var32);
                           break label96;
                        case 27:
                           short var35 = (short)cGame.getShortFromBytes(var3, var8);
                           var8 += 2;
                           method_34(var82 = new byte[8 + var35], 2, var35);
                           method_34(var82, 4, (short)10000);
                           var82[6] = 0;
                           var82[7] = 0;
                           System.arraycopy(var3, var8, var82, 8, var35);
                           var8 += var35;
                           break label96;
                     }

                     var82 = var112;
                  }

                  if (var82 != null) {
                     var82[0] = (byte)(var81 & 255);
                     var82[1] = 0;
                     if (var78 == var74) {
                        var78[var76] = var82;
                        ++var76;
                     } else {
                        var78[var73] = var82;
                        ++var73;
                     }
                  }

                  if (var78 == var74 && var79 == 0) {
                     int var86 = 0;

                     for(int var88 = 0; var88 < var74.length; ++var88) {
                        var86 += var74[var88].length;
                     }

                     (var82 = new byte[2 + var74.length * 4 + var86])[0] = 0;
                     var82[1] = (byte)var74.length;
                     int var89 = 2 + var74.length * 4;

                     for(int var92 = 0; var92 < var74.length; ++var92) {
                        method_35(var82, 2 + var92 * 4, var74[var92].length);
                        System.arraycopy(var74[var92], 0, var82, var89, var74[var92].length);
                        var89 += var74[var92].length;
                     }

                     var71[var73] = var82;
                     var76 = 0;
                     var74 = (byte[][])null;
                     ++var73;
                  }
               }

               this.field_42 = var71;
            }
         } while(!var4);

      } catch (Exception var39) {
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, java.lang.String, int, int, int, int) void
   private void method_32(Graphics var1, String var2, int var3, int var4, int var5, int var6) {
      int var7 = cGame.field_320[41]._nLineSpacing + (cGame.field_320[41]._modules[1] & 255);
      if (var6 > this.field_56) {
         var6 = this.field_56;
      }

      for(int var8 = var5; var8 < var6; ++var8) {
         ASprite._index1 = var8 > 0 ? this.field_55[var8 - 1] + 1 : 0;
         ASprite._index2 = this.field_55[var8];
         cGame.field_320[41].DrawString(var1, var2, var3, var4 + (var8 - var5) * var7, 4);
      }

      ASprite._index1 = -1;
      ASprite._index2 = -1;
   }

   // $FF: renamed from: a (java.lang.String, int) void
   private void method_33(String var1, int var2) {
      this.field_56 = 0;
      int var3 = var1.length();
      int var4 = 0;
      int var5 = 0;

      for(int var6 = 0; var6 < var3; ++var6) {
         label60: {
            char var7;
            if ((var7 = var1.charAt(var6)) > ' ') {
               int var8 = ASprite._pMapChar[var7] & 255;
               int var12 = (cGame.field_320[41]._fmodules[var8 << 2] & 255) << 1;
               var4 += (cGame.field_320[41]._modules[var12] & 255) - cGame.field_320[41]._fmodules[(var8 << 2) + 1] + cGame.field_320[41]._fmodules[1];
            } else {
               if (var7 != ' ' || var6 + 1 >= var3 || var1.charAt(var6 + 1) != '?' && var1.charAt(var6 + 1) != '!' && var1.charAt(var6 + 1) != ':') {
                  if (var7 != ' ') {
                     if (var7 == '\n') {
                        var4 = 0;
                        this.field_55[this.field_56++] = (short)var6;
                     }
                     continue;
                  }

                  var4 += (cGame.field_320[41]._modules[0] & 255) + cGame.field_320[41]._fmodules[1];
                  break label60;
               }

               var4 += (cGame.field_320[41]._modules[0] & 255) + cGame.field_320[41]._fmodules[1];
               int var9 = ASprite._pMapChar[var1.charAt(var6 + 1)] & 255;
               int var10 = (cGame.field_320[41]._fmodules[var9 << 2] & 255) << 1;
               var4 += (cGame.field_320[41]._modules[var10] & 255) - cGame.field_320[41]._fmodules[(var9 << 2) + 1] + cGame.field_320[41]._fmodules[1];
            }

            if (var4 > var2) {
               var6 = var5 - 1;
               this.field_55[this.field_56++] = (short)var6;
               var4 = 0;
            }

            if (var1.charAt(var6) != ' ') {
               continue;
            }
         }

         var5 = var6 + 1;
      }

      this.field_55[this.field_56++] = (short)var3;
   }

   // $FF: renamed from: a (byte[], int, short) void
   private static void method_34(byte[] var0, int var1, short var2) {
      var0[var1] = (byte)(var2 & 255);
      var0[var1 + 1] = (byte)(var2 >> 8 & 255);
   }

   // $FF: renamed from: a (byte[], int, int) void
   private static void method_35(byte[] var0, int var1, int var2) {
      var0[var1] = (byte)(var2 & 255);
      var0[var1 + 1] = (byte)(var2 >> 8 & 255);
      var0[var1 + 2] = (byte)(var2 >> 16 & 255);
      var0[var1 + 3] = (byte)(var2 >> 24 & 255);
   }
}
