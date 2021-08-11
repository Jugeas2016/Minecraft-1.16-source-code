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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */   extends cru
/*    */ {
/*    */   public a(fx ☃) {
/* 23 */     super(clb.aa, 0);
/* 24 */     this.n = new cra(☃.u(), ☃.v(), ☃.w(), ☃.u(), ☃.v(), ☃.w());
/*    */   }
/*    */   
/*    */   public a(csw ☃, md md1) {
/* 28 */     super(clb.aa, md1);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(md ☃) {}
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 37 */     int i = ☃.a(chn.a.c, this.n.a, this.n.c);
/* 38 */     fx.a a1 = new fx.a(this.n.a, i, this.n.c);
/*    */     
/* 40 */     while (a1.v() > 0) {
/* 41 */       ceh ceh1 = ☃.d_(a1);
/* 42 */       ceh ceh2 = ☃.d_(a1.c());
/*    */       
/* 44 */       if (ceh2 == bup.at.n() || ceh2 == bup.b
/* 45 */         .n() || ceh2 == bup.g
/* 46 */         .n() || ceh2 == bup.c
/* 47 */         .n() || ceh2 == bup.e
/* 48 */         .n()) {
/*    */         
/* 50 */         ceh ceh = (ceh1.g() || a(ceh1)) ? bup.C.n() : ceh1;
/*    */         
/* 52 */         for (gc gc : gc.values()) {
/* 53 */           fx fx2 = a1.a(gc);
/* 54 */           ceh ceh3 = ☃.d_(fx2);
/*    */           
/* 56 */           if (ceh3.g() || a(ceh3)) {
/* 57 */             fx fx3 = fx2.c();
/* 58 */             ceh ceh4 = ☃.d_(fx3);
/*    */             
/* 60 */             if ((ceh4.g() || a(ceh4)) && gc != gc.b) {
/* 61 */               ☃.a(fx2, ceh2, 3);
/*    */             } else {
/* 63 */               ☃.a(fx2, ceh, 3);
/*    */             } 
/*    */           } 
/*    */         } 
/* 67 */         this.n = new cra(a1.u(), a1.v(), a1.w(), a1.u(), a1.v(), a1.w());
/* 68 */         return a(☃, cra1, random, a1, cyq.G, (ceh)null);
/*    */       } 
/*    */       
/* 71 */       a1.e(0, -1, 0);
/*    */     } 
/* 73 */     return false;
/*    */   }
/*    */   
/*    */   private boolean a(ceh ☃) {
/* 77 */     return (☃ == bup.A.n() || ☃ == bup.B
/* 78 */       .n());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crb$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */