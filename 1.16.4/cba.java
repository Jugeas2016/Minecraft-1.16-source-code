/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cba
/*    */   extends buo
/*    */ {
/* 19 */   protected static final ddh d = buo.a(6.0D, 0.0D, 6.0D, 10.0D, 10.0D, 10.0D);
/*    */   protected final hf e;
/*    */   
/*    */   protected cba(ceg.c ☃, hf hf1) {
/* 23 */     super(☃);
/* 24 */     this.e = hf1;
/*    */   }
/*    */ 
/*    */   
/*    */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 29 */     return d;
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 34 */     if (gc1 == gc.a && !a(☃, bry1, fx1)) {
/* 35 */       return bup.a.n();
/*    */     }
/* 37 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/* 42 */     return a(brz1, fx1.c(), gc.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/* 47 */     double d1 = fx1.u() + 0.5D;
/* 48 */     double d2 = fx1.v() + 0.7D;
/* 49 */     double d3 = fx1.w() + 0.5D;
/* 50 */     brx1.a(hh.S, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/* 51 */     brx1.a(this.e, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cba.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */