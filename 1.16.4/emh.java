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
/*    */ public abstract class emh
/*    */   extends emd
/*    */ {
/*    */   protected final baa n;
/*    */   private boolean o;
/*    */   
/*    */   public emh(baa ☃, adp adp1, adr adr1) {
/* 19 */     super(adp1, adr1);
/* 20 */     this.n = ☃;
/* 21 */     this.f = (float)☃.cD();
/* 22 */     this.g = (float)☃.cE();
/* 23 */     this.h = (float)☃.cH();
/* 24 */     this.i = true;
/* 25 */     this.j = 0;
/* 26 */     this.d = 0.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public void r() {
/* 31 */     boolean ☃ = q();
/* 32 */     if (☃ && !n()) {
/*    */       
/* 34 */       djz.C().W().a(p());
/* 35 */       this.o = true;
/*    */     } 
/*    */     
/* 38 */     if (this.n.y || this.o) {
/* 39 */       o();
/*    */       
/*    */       return;
/*    */     } 
/* 43 */     this.f = (float)this.n.cD();
/* 44 */     this.g = (float)this.n.cE();
/* 45 */     this.h = (float)this.n.cH();
/*    */     
/* 47 */     float f = afm.a(aqa.c(this.n.cC()));
/* 48 */     if (f >= 0.01D) {
/* 49 */       this.e = afm.g(afm.a(f, u(), v()), u(), v());
/*    */       
/* 51 */       this.d = afm.g(afm.a(f, 0.0F, 0.5F), 0.0F, 1.2F);
/*    */     } else {
/* 53 */       this.e = 0.0F;
/* 54 */       this.d = 0.0F;
/*    */     } 
/*    */   }
/*    */   
/*    */   private float u() {
/* 59 */     if (this.n.w_()) {
/* 60 */       return 1.1F;
/*    */     }
/* 62 */     return 0.7F;
/*    */   }
/*    */ 
/*    */   
/*    */   private float v() {
/* 67 */     if (this.n.w_()) {
/* 68 */       return 1.5F;
/*    */     }
/* 70 */     return 1.1F;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean s() {
/* 76 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean t() {
/* 81 */     return !this.n.aA();
/*    */   }
/*    */   
/*    */   protected abstract emd p();
/*    */   
/*    */   protected abstract boolean q();
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\emh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */