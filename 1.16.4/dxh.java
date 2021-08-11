/*    */ 
/*    */ 
/*    */ 
/*    */ public class dxh
/*    */   extends dzb
/*    */ {
/*    */   private final dyw a;
/*    */   private final double b;
/*    */   
/*    */   protected dxh(dwt ☃, double d1, double d2, double d3, float f1, float f2, float f3, double d4, double d5, double d6, float f4, dyw dyw1, float f5, int i, double d7, boolean bool) {
/* 11 */     super(☃, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/* 12 */     this.b = d7;
/* 13 */     this.a = dyw1;
/* 14 */     this.j *= f1;
/* 15 */     this.k *= f2;
/* 16 */     this.l *= f3;
/* 17 */     this.j += d4;
/* 18 */     this.k += d5;
/* 19 */     this.l += d6;
/*    */     
/* 21 */     float f = ☃.t.nextFloat() * f5;
/* 22 */     this.v = f;
/* 23 */     this.w = f;
/* 24 */     this.x = f;
/* 25 */     this.B *= 0.75F * f4;
/*    */     
/* 27 */     this.t = (int)(i / (☃.t.nextFloat() * 0.8D + 0.2D));
/* 28 */     this.t = (int)(this.t * f4);
/* 29 */     this.t = Math.max(this.t, 1);
/* 30 */     b(dyw1);
/* 31 */     this.n = bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public dyk b() {
/* 36 */     return dyk.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public float b(float ☃) {
/* 41 */     return this.B * afm.a((this.s + ☃) / this.t * 32.0F, 0.0F, 1.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 46 */     this.d = this.g;
/* 47 */     this.e = this.h;
/* 48 */     this.f = this.i;
/*    */     
/* 50 */     if (this.s++ >= this.t) {
/* 51 */       j();
/*    */       
/*    */       return;
/*    */     } 
/* 55 */     b(this.a);
/*    */     
/* 57 */     this.k += this.b;
/* 58 */     a(this.j, this.k, this.l);
/* 59 */     if (this.h == this.e) {
/* 60 */       this.j *= 1.1D;
/* 61 */       this.l *= 1.1D;
/*    */     } 
/* 63 */     this.j *= 0.9599999785423279D;
/* 64 */     this.k *= 0.9599999785423279D;
/* 65 */     this.l *= 0.9599999785423279D;
/*    */     
/* 67 */     if (this.m) {
/* 68 */       this.j *= 0.699999988079071D;
/* 69 */       this.l *= 0.699999988079071D;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dxh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */