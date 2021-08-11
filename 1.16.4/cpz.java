/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.stream.IntStream;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cpz
/*    */   extends cqo<cmg>
/*    */ {
/*    */   public cpz(Codec<cmg> ☃) {
/* 13 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Stream<fx> a(Random ☃, cmg cmg1, fx fx1) {
/* 18 */     int i = 3 + ☃.nextInt(6);
/* 19 */     return IntStream.range(0, i).mapToObj(i -> {
/*    */           int j = ☃.nextInt(16) + fx1.u();
/*    */           int k = ☃.nextInt(16) + fx1.w();
/*    */           int m = ☃.nextInt(28) + 4;
/*    */           return new fx(j, m, k);
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cpz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */