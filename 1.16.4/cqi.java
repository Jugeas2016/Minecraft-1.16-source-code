/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cqi
/*    */   extends cqc<cpn>
/*    */ {
/*    */   public cqi(Codec<cpn> ☃) {
/* 11 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Stream<fx> a(cpv ☃, Random random, cpn cpn1, fx fx1) {
/* 16 */     if (random.nextInt(cpn1.c / 10) == 0) {
/* 17 */       int i = random.nextInt(16) + fx1.u();
/* 18 */       int j = random.nextInt(16) + fx1.w();
/* 19 */       int k = random.nextInt(random.nextInt(☃.a() - 8) + 8);
/* 20 */       if (k < ☃.b() || random.nextInt(cpn1.c / 8) == 0) {
/* 21 */         return Stream.of(new fx(i, k, j));
/*    */       }
/*    */     } 
/*    */     
/* 25 */     return Stream.empty();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cqi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */