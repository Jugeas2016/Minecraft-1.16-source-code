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
/*    */ class b
/*    */   extends dxp
/*    */ {
/*    */   private final hf b;
/*    */   
/*    */   private b(dwt ☃, double d1, double d2, double d3, cuw cuw1, hf hf1) {
/* 19 */     super(☃, d1, d2, d3, cuw1);
/* 20 */     this.b = hf1;
/* 21 */     this.u *= 0.02F;
/* 22 */     this.t = 40;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void g() {
/* 27 */     if (this.t-- <= 0) {
/* 28 */       j();
/* 29 */       this.c.a(this.b, this.g, this.h, this.i, this.j, this.k, this.l);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected void h() {
/* 35 */     this.j *= 0.02D;
/* 36 */     this.k *= 0.02D;
/* 37 */     this.l *= 0.02D;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dxp$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */