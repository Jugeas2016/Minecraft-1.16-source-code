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
/*    */ public class emo
/*    */   extends emd
/*    */ {
/*    */   private final bfw n;
/*    */   private final bhl o;
/*    */   
/*    */   public emo(bfw ☃, bhl bhl1) {
/* 18 */     super(adq.hI, adr.g);
/*    */     
/* 20 */     this.n = ☃;
/* 21 */     this.o = bhl1;
/*    */     
/* 23 */     this.k = emt.a.a;
/* 24 */     this.i = true;
/* 25 */     this.j = 0;
/* 26 */     this.d = 0.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean t() {
/* 31 */     return !this.o.aA();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean s() {
/* 36 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void r() {
/* 41 */     if (this.o.y || !this.n.br() || this.n.ct() != this.o) {
/* 42 */       o();
/*    */       
/*    */       return;
/*    */     } 
/* 46 */     float ☃ = afm.a(aqa.c(this.o.cC()));
/* 47 */     if (☃ >= 0.01D) {
/* 48 */       this.d = 0.0F + afm.a(☃, 0.0F, 1.0F) * 0.75F;
/*    */     } else {
/* 50 */       this.d = 0.0F;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\emo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */