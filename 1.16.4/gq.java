/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.DataResult;
/*    */ import java.util.Arrays;
/*    */ import java.util.UUID;
/*    */ import java.util.stream.IntStream;
/*    */ 
/*    */ public final class gq {
/*    */   public static final Codec<UUID> a;
/*    */   
/*    */   static {
/* 11 */     a = Codec.INT_STREAM.comapFlatMap(☃ -> x.a(☃, 4).map(gq::a), ☃ -> Arrays.stream(a(☃)));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static UUID a(int[] ☃) {
/* 20 */     return new UUID(☃[0] << 32L | ☃[1] & 0xFFFFFFFFL, ☃[2] << 32L | ☃[3] & 0xFFFFFFFFL);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static int[] a(UUID ☃) {
/* 27 */     long l1 = ☃.getMostSignificantBits();
/* 28 */     long l2 = ☃.getLeastSignificantBits();
/* 29 */     return a(l1, l2);
/*    */   }
/*    */   
/*    */   private static int[] a(long ☃, long l1) {
/* 33 */     return new int[] { (int)(☃ >> 32L), (int)☃, (int)(l1 >> 32L), (int)l1 };
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\gq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */