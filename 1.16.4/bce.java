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
/*    */ public class bce
/*    */   extends bbu
/*    */ {
/* 15 */   private static final azg b = (new azg()).a(150.0D);
/*    */   
/*    */   private final azg c;
/*    */   private int d;
/*    */   
/*    */   public bce(bbr ☃) {
/* 21 */     super(☃);
/*    */     
/* 23 */     this.c = (new azg()).a(20.0D).a(aqm1 -> (Math.abs(aqm1.cE() - ☃.cE()) <= 10.0D));
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 28 */     this.d++;
/* 29 */     aqm ☃ = this.a.l.a(this.c, this.a, this.a.cD(), this.a.cE(), this.a.cH());
/*    */     
/* 31 */     if (☃ != null) {
/* 32 */       if (this.d > 25) {
/* 33 */         this.a.eK().a(bch.h);
/*    */       } else {
/* 35 */         dcn dcn1 = (new dcn(☃.cD() - this.a.cD(), 0.0D, ☃.cH() - this.a.cH())).d();
/* 36 */         dcn dcn2 = (new dcn(afm.a(this.a.p * 0.017453292F), 0.0D, -afm.b(this.a.p * 0.017453292F))).d();
/* 37 */         float f1 = (float)dcn2.b(dcn1);
/* 38 */         float f2 = (float)(Math.acos(f1) * 57.2957763671875D) + 0.5F;
/*    */         
/* 40 */         if (f2 < 0.0F || f2 > 10.0F) {
/* 41 */           double d1 = ☃.cD() - this.a.bo.cD();
/* 42 */           double d2 = ☃.cH() - this.a.bo.cH();
/* 43 */           double d3 = afm.a(afm.g(180.0D - afm.d(d1, d2) * 57.2957763671875D - this.a.p), -100.0D, 100.0D);
/*    */           
/* 45 */           this.a.bt *= 0.8F;
/*    */           
/* 47 */           float f3 = afm.a(d1 * d1 + d2 * d2) + 1.0F;
/* 48 */           float f4 = f3;
/* 49 */           if (f3 > 40.0F) {
/* 50 */             f3 = 40.0F;
/*    */           }
/* 52 */           this.a.bt = (float)(this.a.bt + d3 * (0.7F / f3 / f4));
/* 53 */           this.a.p += this.a.bt;
/*    */         } 
/*    */       } 
/* 56 */     } else if (this.d >= 100) {
/* 57 */       ☃ = this.a.l.a(b, this.a, this.a.cD(), this.a.cE(), this.a.cH());
/* 58 */       this.a.eK().a(bch.e);
/* 59 */       if (☃ != null) {
/* 60 */         this.a.eK().a(bch.i);
/* 61 */         ((bbv)this.a.eK().<bbv>b(bch.i)).a(new dcn(☃.cD(), ☃.cE(), ☃.cH()));
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 68 */     this.d = 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public bch<bce> i() {
/* 73 */     return bch.g;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bce.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */