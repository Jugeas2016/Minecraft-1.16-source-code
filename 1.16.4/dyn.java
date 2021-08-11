/*    */ 
/*    */ 
/*    */ 
/*    */ public class dyn
/*    */   extends dym
/*    */ {
/*    */   private dyn(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6) {
/*  8 */     super(☃, d1, d2, d3, d4, d5, d6);
/*    */     
/* 10 */     this.B = (float)(this.B * 1.5D);
/* 11 */     this.t = (int)(Math.random() * 2.0D) + 60;
/*    */   }
/*    */ 
/*    */   
/*    */   public float b(float ☃) {
/* 16 */     float f = 1.0F - (this.s + ☃) / this.t * 1.5F;
/* 17 */     return this.B * f;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 22 */     this.d = this.g;
/* 23 */     this.e = this.h;
/* 24 */     this.f = this.i;
/*    */     
/* 26 */     if (this.s++ >= this.t) {
/* 27 */       j();
/*    */       
/*    */       return;
/*    */     } 
/* 31 */     float ☃ = this.s / this.t;
/*    */     
/* 33 */     this.g += this.j * ☃;
/* 34 */     this.h += this.k * ☃;
/* 35 */     this.i += this.l * ☃;
/*    */   }
/*    */   
/*    */   public static class a implements dyj<hi> {
/*    */     private final dyw a;
/*    */     
/*    */     public a(dyw ☃) {
/* 42 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 47 */       dyn dyn = new dyn(dwt1, d1, d2, d3, d4, d5, d6);
/* 48 */       dyn.a(this.a);
/* 49 */       return dyn;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dyn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */