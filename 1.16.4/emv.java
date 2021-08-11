/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class emv
/*    */   implements eme
/*    */ {
/*    */   private final dzm a;
/*    */   private final enu b;
/* 15 */   private int c = 0;
/*    */   
/*    */   public emv(dzm ☃, enu enu1) {
/* 18 */     this.a = ☃;
/* 19 */     this.b = enu1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 24 */     this.c--;
/*    */     
/* 26 */     if (this.c <= 0 && this.a.aI()) {
/* 27 */       float ☃ = this.a.l.t.nextFloat();
/* 28 */       if (☃ < 1.0E-4F) {
/* 29 */         this.c = 0;
/* 30 */         this.b.a(new emw.a(this.a, adq.v));
/* 31 */       } else if (☃ < 0.001F) {
/* 32 */         this.c = 0;
/* 33 */         this.b.a(new emw.a(this.a, adq.u));
/* 34 */       } else if (☃ < 0.01F) {
/* 35 */         this.c = 0;
/* 36 */         this.b.a(new emw.a(this.a, adq.t));
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\emv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */