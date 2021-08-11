/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class asi<E extends aqn>
/*    */   extends arv<E>
/*    */ {
/*    */   private final int b;
/*    */   private final float c;
/*    */   
/*    */   public asi(int ☃, float f) {
/* 17 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.S, aye.a, ayd.o, aye.b, ayd.m, aye.b, ayd.n, aye.c));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 23 */     this.b = ☃;
/* 24 */     this.c = f;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, aqn aqn1, long l) {
/* 29 */     fx fx = a(aqn1);
/* 30 */     boolean bool = fx.a(aqn1.cB(), this.b);
/* 31 */     if (!bool) {
/* 32 */       arw.a(aqn1, a(aqn1, fx), this.c, this.b);
/*    */     }
/*    */   }
/*    */   
/*    */   private static fx a(aqn ☃, fx fx1) {
/* 37 */     Random random = ☃.l.t;
/* 38 */     return fx1.b(a(random), 0, a(random));
/*    */   }
/*    */   
/*    */   private static int a(Random ☃) {
/* 42 */     return ☃.nextInt(3) - 1;
/*    */   }
/*    */   
/*    */   private static fx a(aqn ☃) {
/* 46 */     return ☃.cJ().<fx>c(ayd.S).get();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\asi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */