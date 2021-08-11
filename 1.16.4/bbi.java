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
/*    */ public class bbi
/*    */   extends avv
/*    */ {
/*    */   private final bbh a;
/*    */   
/*    */   public bbi(bbh ☃) {
/* 21 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 26 */     return this.a.l.a(this.a.cD(), this.a.cE(), this.a.cH(), 10.0D);
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 31 */     aag ☃ = (aag)this.a.l;
/* 32 */     aos aos = ☃.d(this.a.cB());
/* 33 */     this.a.t(false);
/* 34 */     this.a.u(true);
/* 35 */     this.a.c_(0);
/* 36 */     aql aql = aqe.P.a(☃);
/* 37 */     aql.b(this.a.cD(), this.a.cE(), this.a.cH());
/* 38 */     aql.a(true);
/* 39 */     ☃.c(aql);
/* 40 */     bdy bdy = a(aos, this.a);
/* 41 */     bdy.m(this.a);
/*    */     
/* 43 */     ☃.l(bdy);
/*    */     
/* 45 */     for (int i = 0; i < 3; i++) {
/* 46 */       bbb bbb = a(aos);
/* 47 */       bdy bdy1 = a(aos, bbb);
/* 48 */       bdy1.m(bbb);
/* 49 */       bbb.i(this.a.cY().nextGaussian() * 0.5D, 0.0D, this.a.cY().nextGaussian() * 0.5D);
/* 50 */       ☃.l(bbb);
/*    */     } 
/*    */   }
/*    */   
/*    */   private bbb a(aos ☃) {
/* 55 */     bbh bbh1 = aqe.aw.a(this.a.l);
/* 56 */     bbh1.a((aag)this.a.l, ☃, aqp.k, (arc)null, (md)null);
/* 57 */     bbh1.d(this.a.cD(), this.a.cE(), this.a.cH());
/* 58 */     bbh1.P = 60;
/* 59 */     bbh1.es();
/* 60 */     bbh1.u(true);
/* 61 */     bbh1.c_(0);
/* 62 */     return bbh1;
/*    */   }
/*    */   
/*    */   private bdy a(aos ☃, bbb bbb1) {
/* 66 */     bdy bdy = aqe.av.a(bbb1.l);
/* 67 */     bdy.a((aag)bbb1.l, ☃, aqp.k, (arc)null, (md)null);
/* 68 */     bdy.d(bbb1.cD(), bbb1.cE(), bbb1.cH());
/* 69 */     bdy.P = 60;
/* 70 */     bdy.es();
/*    */     
/* 72 */     if (bdy.b(aqf.f).a()) {
/* 73 */       bdy.a(aqf.f, new bmb(bmd.lg));
/*    */     }
/*    */     
/* 76 */     bdy.a(aqf.a, bpu.a(bdy.cY(), a(bdy.dD()), (int)(5.0F + ☃.d() * bdy.cY().nextInt(18)), false));
/* 77 */     bdy.a(aqf.f, bpu.a(bdy.cY(), a(bdy.b(aqf.f)), (int)(5.0F + ☃.d() * bdy.cY().nextInt(18)), false));
/*    */     
/* 79 */     return bdy;
/*    */   }
/*    */   
/*    */   private bmb a(bmb ☃) {
/* 83 */     ☃.c("Enchantments");
/* 84 */     return ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bbi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */