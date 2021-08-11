/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class emk
/*    */   extends emd
/*    */ {
/*    */   private final dzm n;
/*    */   private int o;
/*    */   
/*    */   public emk(dzm ☃) {
/* 17 */     super(adq.dl, adr.h);
/*    */     
/* 19 */     this.n = ☃;
/* 20 */     this.i = true;
/* 21 */     this.j = 0;
/* 22 */     this.d = 0.1F;
/*    */   }
/*    */ 
/*    */   
/*    */   public void r() {
/* 27 */     this.o++;
/* 28 */     if (this.n.y || (this.o > 20 && !this.n.ef())) {
/* 29 */       o();
/*    */       
/*    */       return;
/*    */     } 
/* 33 */     this.f = (float)this.n.cD();
/* 34 */     this.g = (float)this.n.cE();
/* 35 */     this.h = (float)this.n.cH();
/*    */     
/* 37 */     float ☃ = (float)this.n.cC().g();
/* 38 */     if (☃ >= 1.0E-7D) {
/* 39 */       this.d = afm.a(☃ / 4.0F, 0.0F, 1.0F);
/*    */     } else {
/* 41 */       this.d = 0.0F;
/*    */     } 
/*    */ 
/*    */     
/* 45 */     if (this.o < 20) {
/* 46 */       this.d = 0.0F;
/* 47 */     } else if (this.o < 40) {
/* 48 */       this.d = (float)(this.d * (this.o - 20) / 20.0D);
/*    */     } 
/*    */     
/* 51 */     float f1 = 0.8F;
/* 52 */     if (this.d > 0.8F) {
/* 53 */       this.e = 1.0F + this.d - 0.8F;
/*    */     } else {
/* 55 */       this.e = 1.0F;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\emk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */