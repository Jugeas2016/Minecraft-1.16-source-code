/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cqa
/*    */   extends cqc<cmg>
/*    */ {
/*    */   public cqa(Codec<cmg> ☃) {
/* 13 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Stream<fx> a(cpv ☃, Random random, cmg cmg1, fx fx1) {
/* 18 */     if (random.nextInt(700) == 0) {
/* 19 */       int i = random.nextInt(16) + fx1.u();
/* 20 */       int j = random.nextInt(16) + fx1.w();
/* 21 */       int k = ☃.a(chn.a.e, i, j);
/* 22 */       if (k > 0) {
/* 23 */         int m = k + 3 + random.nextInt(7);
/* 24 */         return Stream.of(new fx(i, m, j));
/*    */       } 
/*    */     } 
/*    */     
/* 28 */     return Stream.empty();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cqa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */