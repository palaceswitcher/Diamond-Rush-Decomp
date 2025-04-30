import java.util.Random;

// $FF: renamed from: d
public final class Utils {
   // $FF: renamed from: a java.util.Random
   public static Random random = new Random(System.currentTimeMillis());

   // $FF: renamed from: a (int, int) int
   public static int getRandomInt(int min, int max) {
      return min + Math.abs(random.nextInt()) % (max - min);
   }
}
