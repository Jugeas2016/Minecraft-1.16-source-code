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
/*    */ public class bkp
/*    */   extends blx
/*    */ {
/*    */   public bkp(blx.a ☃) {
/* 15 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(bmb ☃, brx brx1, aqm aqm1) {
/* 20 */     bmb bmb1 = super.a(☃, brx1, aqm1);
/*    */     
/* 22 */     if (!brx1.v) {
/* 23 */       double d1 = aqm1.cD();
/* 24 */       double d2 = aqm1.cE();
/* 25 */       double d3 = aqm1.cH();
/*    */       
/* 27 */       for (int i = 0; i < 16; i++) {
/* 28 */         double d4 = aqm1.cD() + (aqm1.cY().nextDouble() - 0.5D) * 16.0D;
/* 29 */         double d5 = afm.a(aqm1.cE() + (aqm1.cY().nextInt(16) - 8), 0.0D, (brx1.ae() - 1));
/* 30 */         double d6 = aqm1.cH() + (aqm1.cY().nextDouble() - 0.5D) * 16.0D;
/* 31 */         if (aqm1.br()) {
/* 32 */           aqm1.l();
/*    */         }
/* 34 */         if (aqm1.a(d4, d5, d6, true)) {
/*    */           
/* 36 */           adp adp = (aqm1 instanceof bah) ? adq.ez : adq.bO;
/* 37 */           brx1.a((bfw)null, d1, d2, d3, adp, adr.h, 1.0F, 1.0F);
/* 38 */           aqm1.a(adp, 1.0F, 1.0F);
/*    */           
/*    */           break;
/*    */         } 
/*    */       } 
/*    */       
/* 44 */       if (aqm1 instanceof bfw) {
/* 45 */         ((bfw)aqm1).eT().a(this, 20);
/*    */       }
/*    */     } 
/*    */     
/* 49 */     return bmb1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bkp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */