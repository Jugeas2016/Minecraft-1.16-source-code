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
/*    */ public class bzz
/*    */   extends bto
/*    */ {
/*    */   protected bzz(ceg.c ☃) {
/* 20 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public ccj a(brc ☃) {
/* 25 */     return new cdh();
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(brx ☃, fx fx1, bfw bfw1) {
/* 30 */     ccj ccj = ☃.c(fx1);
/* 31 */     if (ccj instanceof cdh) {
/* 32 */       bfw1.a((aox)ccj);
/* 33 */       bfw1.a(aea.as);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/* 39 */     if (!((Boolean)☃.c(b)).booleanValue()) {
/*    */       return;
/*    */     }
/*    */     
/* 43 */     double d1 = fx1.u() + 0.5D;
/* 44 */     double d2 = fx1.v();
/* 45 */     double d3 = fx1.w() + 0.5D;
/*    */     
/* 47 */     if (random.nextDouble() < 0.1D) {
/* 48 */       brx1.a(d1, d2, d3, adq.oo, adr.e, 1.0F, 1.0F, false);
/*    */     }
/*    */     
/* 51 */     brx1.a(hh.S, d1, d2 + 1.1D, d3, 0.0D, 0.0D, 0.0D);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bzz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */