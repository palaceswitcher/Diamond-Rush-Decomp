import java.util.Random;

// $FF: renamed from: d
public final class class_4 {
   // $FF: renamed from: a java.util.Random
   public static Random field_57 = new Random(System.currentTimeMillis());

   // $FF: renamed from: a (int, int) int
   public static int method_36(int var0, int var1) {
      return var0 + Math.abs(field_57.nextInt()) % (var1 - var0);
   }
}
