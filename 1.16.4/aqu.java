/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class aqu
/*    */   extends aqn
/*    */ {
/*    */   protected aqu(aqe<? extends aqu> ☃, brx brx1) {
/* 12 */     super((aqe)☃, brx1);
/*    */   }
/*    */   
/*    */   public float f(fx ☃) {
/* 16 */     return a(☃, this.l);
/*    */   }
/*    */   
/*    */   public float a(fx ☃, brz brz1) {
/* 20 */     return 0.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bry ☃, aqp aqp1) {
/* 25 */     return (a(cB(), ☃) >= 0.0F);
/*    */   }
/*    */   
/*    */   public boolean eI() {
/* 29 */     return !x().m();
/*    */   }
/*    */ 
/*    */   
/*    */   protected void eA() {
/* 34 */     super.eA();
/*    */     
/* 36 */     aqa ☃ = eC();
/* 37 */     if (☃ != null && ☃.l == this.l) {
/*    */       
/* 39 */       a(☃.cB(), 5);
/*    */       
/* 41 */       float f = g(☃);
/*    */       
/* 43 */       if (this instanceof are && ((are)this).eM()) {
/* 44 */         if (f > 10.0F) {
/* 45 */           a(true, true);
/*    */         }
/*    */         
/*    */         return;
/*    */       } 
/* 50 */       x(f);
/*    */       
/* 52 */       if (f > 10.0F) {
/* 53 */         a(true, true);
/* 54 */         this.bk.a(avv.a.a);
/* 55 */       } else if (f > 6.0F) {
/*    */         
/* 57 */         double d1 = (☃.cD() - cD()) / f;
/* 58 */         double d2 = (☃.cE() - cE()) / f;
/* 59 */         double d3 = (☃.cH() - cH()) / f;
/*    */         
/* 61 */         f(cC().b(
/* 62 */               Math.copySign(d1 * d1 * 0.4D, d1), 
/* 63 */               Math.copySign(d2 * d2 * 0.4D, d2), 
/* 64 */               Math.copySign(d3 * d3 * 0.4D, d3)));
/*    */       } else {
/*    */         
/* 67 */         this.bk.b(avv.a.a);
/* 68 */         float f1 = 2.0F;
/*    */         
/* 70 */         dcn dcn = (new dcn(☃.cD() - cD(), ☃.cE() - cE(), ☃.cH() - cH())).d().a(Math.max(f - 2.0F, 0.0F));
/* 71 */         x().a(cD() + dcn.b, cE() + dcn.c, cH() + dcn.d, eJ());
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   protected double eJ() {
/* 77 */     return 1.0D;
/*    */   }
/*    */   
/*    */   protected void x(float ☃) {}
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aqu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */