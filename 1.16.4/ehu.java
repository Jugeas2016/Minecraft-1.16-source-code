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
/*    */ public class ehu
/*    */   extends eit<dzj, dvd<dzj>>
/*    */ {
/*    */   public ehu(egk<dzj, dvd<dzj>> ☃) {
/* 20 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, eag eag1, int i, dzj dzj1, float f1, float f2, float f3, float f4, float f5, float f6) {
/* 25 */     if (!dzj1.c() || dzj1.bF() || !dzj1.a(bfx.a) || dzj1.p() == null) {
/*    */       return;
/*    */     }
/* 28 */     bmb bmb = dzj1.b(aqf.e);
/* 29 */     if (bmb.b() == bmd.qo) {
/*    */       return;
/*    */     }
/*    */     
/* 33 */     ☃.a();
/* 34 */     ☃.a(0.0D, 0.0D, 0.125D);
/*    */     
/* 36 */     double d1 = afm.d(f3, dzj1.bv, dzj1.by) - afm.d(f3, dzj1.m, dzj1.cD());
/* 37 */     double d2 = afm.d(f3, dzj1.bw, dzj1.bz) - afm.d(f3, dzj1.n, dzj1.cE());
/* 38 */     double d3 = afm.d(f3, dzj1.bx, dzj1.bA) - afm.d(f3, dzj1.o, dzj1.cH());
/*    */     
/* 40 */     float f7 = dzj1.aB + dzj1.aA - dzj1.aB;
/*    */     
/* 42 */     double d4 = afm.a(f7 * 0.017453292F);
/* 43 */     double d5 = -afm.b(f7 * 0.017453292F);
/*    */     
/* 45 */     float f8 = (float)d2 * 10.0F;
/* 46 */     f8 = afm.a(f8, -6.0F, 32.0F);
/* 47 */     float f9 = (float)(d1 * d4 + d3 * d5) * 100.0F;
/* 48 */     f9 = afm.a(f9, 0.0F, 150.0F);
/* 49 */     float f10 = (float)(d1 * d5 - d3 * d4) * 100.0F;
/* 50 */     f10 = afm.a(f10, -20.0F, 20.0F);
/* 51 */     if (f9 < 0.0F) {
/* 52 */       f9 = 0.0F;
/*    */     }
/*    */     
/* 55 */     float f11 = afm.g(f3, dzj1.bs, dzj1.bt);
/*    */     
/* 57 */     f8 += afm.a(afm.g(f3, dzj1.z, dzj1.A) * 6.0F) * 32.0F * f11;
/* 58 */     if (dzj1.bz()) {
/* 59 */       f8 += 25.0F;
/*    */     }
/*    */     
/* 62 */     ☃.a(g.b.a(6.0F + f9 / 2.0F + f8));
/* 63 */     ☃.a(g.f.a(f10 / 2.0F));
/* 64 */     ☃.a(g.d.a(180.0F - f10 / 2.0F));
/* 65 */     dfq dfq = eag1.getBuffer(eao.b(dzj1.p()));
/* 66 */     aC_().b(☃, dfq, i, ejw.a);
/* 67 */     ☃.b();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ehu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */