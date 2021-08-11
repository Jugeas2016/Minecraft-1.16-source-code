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
/*    */ public class bwf
/*    */   extends bwa
/*    */ {
/* 18 */   private static final gw c = new gv();
/*    */   
/*    */   public bwf(ceg.c ☃) {
/* 21 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected gw a(bmb ☃) {
/* 26 */     return c;
/*    */   }
/*    */ 
/*    */   
/*    */   public ccj a(brc ☃) {
/* 31 */     return new cct();
/*    */   }
/*    */   
/*    */   protected void a(aag ☃, fx fx1) {
/*    */     bmb bmb2;
/* 36 */     fz fz = new fz(☃, fx1);
/* 37 */     ccs ccs = fz.<ccs>g();
/*    */     
/* 39 */     int i = ccs.h();
/* 40 */     if (i < 0) {
/* 41 */       ☃.c(1001, fx1, 0);
/*    */       
/*    */       return;
/*    */     } 
/* 45 */     bmb bmb1 = ccs.a(i);
/* 46 */     if (bmb1.a()) {
/*    */       return;
/*    */     }
/*    */     
/* 50 */     gc gc = (gc)☃.d_(fx1).c(a);
/* 51 */     aon aon = ccy.b(☃, fx1.a(gc));
/*    */ 
/*    */     
/* 54 */     if (aon == null) {
/* 55 */       bmb2 = c.dispense(fz, bmb1);
/*    */     } else {
/* 57 */       bmb2 = ccy.a(ccs, aon, bmb1.i().a(1), gc.f());
/*    */       
/* 59 */       if (bmb2.a()) {
/* 60 */         bmb2 = bmb1.i();
/* 61 */         bmb2.g(1);
/*    */       } else {
/*    */         
/* 64 */         bmb2 = bmb1.i();
/*    */       } 
/*    */     } 
/*    */     
/* 68 */     ccs.a(i, bmb2);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bwf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */