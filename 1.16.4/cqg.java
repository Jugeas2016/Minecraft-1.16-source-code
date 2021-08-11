/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cqg<DC extends clw>
/*    */   extends cpy<DC>
/*    */ {
/*    */   public cqg(Codec<DC> ☃) {
/* 13 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected chn.a a(DC ☃) {
/* 18 */     return chn.a.e;
/*    */   }
/*    */ 
/*    */   
/*    */   public Stream<fx> a(cpv ☃, Random random, DC dC, fx fx1) {
/* 23 */     int i = fx1.u();
/* 24 */     int j = fx1.w();
/* 25 */     int k = ☃.a(a(dC), i, j);
/* 26 */     if (k == 0) {
/* 27 */       return Stream.of(new fx[0]);
/*    */     }
/* 29 */     return Stream.of(new fx(i, random.nextInt(k * 2), j));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cqg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */