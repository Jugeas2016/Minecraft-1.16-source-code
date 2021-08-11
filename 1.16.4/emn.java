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
/*    */ public class emn
/*    */   extends emd
/*    */ {
/*    */   private final bhl n;
/* 17 */   private float o = 0.0F;
/*    */   
/*    */   public emn(bhl ☃) {
/* 20 */     super(adq.hJ, adr.g);
/* 21 */     this.n = ☃;
/* 22 */     this.i = true;
/* 23 */     this.j = 0;
/* 24 */     this.d = 0.0F;
/* 25 */     this.f = (float)☃.cD();
/* 26 */     this.g = (float)☃.cE();
/* 27 */     this.h = (float)☃.cH();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean t() {
/* 32 */     return !this.n.aA();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean s() {
/* 37 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void r() {
/* 42 */     if (this.n.y) {
/* 43 */       o();
/*    */       
/*    */       return;
/*    */     } 
/* 47 */     this.f = (float)this.n.cD();
/* 48 */     this.g = (float)this.n.cE();
/* 49 */     this.h = (float)this.n.cH();
/*    */     
/* 51 */     float ☃ = afm.a(aqa.c(this.n.cC()));
/* 52 */     if (☃ >= 0.01D) {
/* 53 */       this.o = afm.a(this.o + 0.0025F, 0.0F, 1.0F);
/*    */       
/* 55 */       this.d = afm.g(afm.a(☃, 0.0F, 0.5F), 0.0F, 0.7F);
/*    */     } else {
/* 57 */       this.o = 0.0F;
/* 58 */       this.d = 0.0F;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\emn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */