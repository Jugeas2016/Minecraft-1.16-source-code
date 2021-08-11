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
/*    */ public class bbz
/*    */   extends bbt
/*    */ {
/* 17 */   private static final azg b = (new azg()).a(128.0D);
/*    */   
/*    */   private cxd c;
/*    */   private dcn d;
/*    */   
/*    */   public bbz(bbr ☃) {
/* 23 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public bch<bbz> i() {
/* 28 */     return bch.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 33 */     this.c = null;
/* 34 */     this.d = null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 39 */     double ☃ = (this.d == null) ? 0.0D : this.d.c(this.a.cD(), this.a.cE(), this.a.cH());
/* 40 */     if (☃ < 100.0D || ☃ > 22500.0D || this.a.u || this.a.v) {
/* 41 */       j();
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public dcn g() {
/* 48 */     return this.d;
/*    */   }
/*    */   
/*    */   private void j() {
/* 52 */     if (this.c == null || this.c.c()) {
/* 53 */       int i, ☃ = this.a.eI();
/* 54 */       fx fx = this.a.l.a(chn.a.f, cjk.a);
/* 55 */       bfw bfw = this.a.l.a(b, fx.u(), fx.v(), fx.w());
/*    */ 
/*    */       
/* 58 */       if (bfw != null) {
/* 59 */         dcn dcn1 = (new dcn(bfw.cD(), 0.0D, bfw.cH())).d();
/* 60 */         i = this.a.p(-dcn1.b * 40.0D, 105.0D, -dcn1.d * 40.0D);
/*    */       } else {
/* 62 */         i = this.a.p(40.0D, fx.v(), 0.0D);
/*    */       } 
/*    */       
/* 65 */       cxb cxb = new cxb(fx.u(), fx.v(), fx.w());
/*    */       
/* 67 */       this.c = this.a.a(☃, i, cxb);
/*    */       
/* 69 */       if (this.c != null) {
/* 70 */         this.c.a();
/*    */       }
/*    */     } 
/*    */     
/* 74 */     k();
/*    */     
/* 76 */     if (this.c != null && this.c.c()) {
/* 77 */       this.a.eK().a(bch.d);
/*    */     }
/*    */   }
/*    */   
/*    */   private void k() {
/* 82 */     if (this.c != null && !this.c.c()) {
/* 83 */       double d3; gr ☃ = this.c.g();
/*    */       
/* 85 */       this.c.a();
/* 86 */       double d1 = ☃.u();
/* 87 */       double d2 = ☃.w();
/*    */ 
/*    */       
/*    */       do {
/* 91 */         d3 = (☃.v() + this.a.cY().nextFloat() * 20.0F);
/* 92 */       } while (d3 < ☃.v());
/*    */       
/* 94 */       this.d = new dcn(d1, d3, d2);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bbz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */