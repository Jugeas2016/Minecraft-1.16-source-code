/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.stream.IntStream;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cps
/*    */   extends cpy<cmg>
/*    */ {
/*    */   public cps(Codec<cmg> ☃) {
/* 14 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected chn.a a(cmg ☃) {
/* 19 */     return chn.a.e;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Stream<fx> a(cpv ☃, Random random, cmg cmg1, fx fx1) {
/* 26 */     return IntStream.range(0, 16).mapToObj(i -> {
/*    */           int j = i / 4;
/*    */           int k = i % 4;
/*    */           int m = j * 4 + 1 + ☃.nextInt(3) + fx1.u();
/*    */           int n = k * 4 + 1 + ☃.nextInt(3) + fx1.w();
/*    */           int i1 = cpv1.a(a(cmg1), m, n);
/*    */           return new fx(m, i1, n);
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cps.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */