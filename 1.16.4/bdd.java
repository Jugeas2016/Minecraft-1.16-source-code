/*    */ import javax.annotation.Nullable;
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
/*    */ public interface bdd
/*    */   extends bdu
/*    */ {
/*    */   void b(boolean paramBoolean);
/*    */   
/*    */   void a(aqm paramaqm, bmb parambmb, bgm parambgm, float paramFloat);
/*    */   
/*    */   @Nullable
/*    */   aqm A();
/*    */   
/*    */   void U_();
/*    */   
/*    */   default void b(aqm ☃, float f) {
/* 30 */     aot aot = bgn.a(☃, bmd.qQ);
/* 31 */     bmb bmb = ☃.b(aot);
/* 32 */     if (☃.a(bmd.qQ)) {
/* 33 */       bkt.a(☃.l, ☃, aot, bmb, f, (14 - ☃.l.ad().a() * 4));
/*    */     }
/* 35 */     U_();
/*    */   }
/*    */   
/*    */   default void a(aqm ☃, aqm aqm1, bgm bgm1, float f1, float f2) {
/* 39 */     aqa aqa = bgm1;
/* 40 */     double d1 = aqm1.cD() - ☃.cD();
/* 41 */     double d2 = aqm1.cH() - ☃.cH();
/* 42 */     double d3 = afm.a(d1 * d1 + d2 * d2);
/* 43 */     double d4 = aqm1.e(0.3333333333333333D) - aqa.cE() + d3 * 0.20000000298023224D;
/*    */     
/* 45 */     g g = a(☃, new dcn(d1, d4, d2), f1);
/* 46 */     bgm1.c(g.a(), g.b(), g.c(), f2, (14 - ☃.l.ad().a() * 4));
/* 47 */     ☃.a(adq.cz, 1.0F, 1.0F / (☃.cY().nextFloat() * 0.4F + 0.8F));
/*    */   }
/*    */   
/*    */   default g a(aqm ☃, dcn dcn1, float f) {
/* 51 */     dcn dcn2 = dcn1.d();
/* 52 */     dcn dcn3 = dcn2.c(new dcn(0.0D, 1.0D, 0.0D));
/* 53 */     if (dcn3.g() <= 1.0E-7D) {
/* 54 */       dcn3 = dcn2.c(☃.i(1.0F));
/*    */     }
/*    */     
/* 57 */     d d1 = new d(new g(dcn3), 90.0F, true);
/* 58 */     g g1 = new g(dcn2);
/* 59 */     g1.a(d1);
/*    */     
/* 61 */     d d2 = new d(g1, f, true);
/* 62 */     g g2 = new g(dcn2);
/* 63 */     g2.a(d2);
/* 64 */     return g2;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bdd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */