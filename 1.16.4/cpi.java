/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class cpi<DC extends clw>
/*    */   extends cpy<DC>
/*    */ {
/*    */   public cpi(Codec<DC> ☃) {
/* 12 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Stream<fx> a(cpv ☃, Random random, DC dC, fx fx1) {
/* 17 */     int i = fx1.u();
/* 18 */     int j = fx1.w();
/* 19 */     int k = ☃.a(a(dC), i, j);
/* 20 */     if (k > 0) {
/* 21 */       return Stream.of(new fx(i, k, j));
/*    */     }
/* 23 */     return Stream.of(new fx[0]);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */