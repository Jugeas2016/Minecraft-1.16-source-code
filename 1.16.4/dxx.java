/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dxx
/*    */   extends dzb
/*    */ {
/*    */   private dxx(dwt ☃, double d1, double d2, double d3) {
/*  9 */     super(☃, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/* 10 */     this.j *= 0.009999999776482582D;
/* 11 */     this.k *= 0.009999999776482582D;
/* 12 */     this.l *= 0.009999999776482582D;
/* 13 */     this.k += 0.1D;
/*    */     
/* 15 */     this.B *= 1.5F;
/* 16 */     this.t = 16;
/* 17 */     this.n = false;
/*    */   }
/*    */ 
/*    */   
/*    */   public dyk b() {
/* 22 */     return dyk.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public float b(float ☃) {
/* 27 */     return this.B * afm.a((this.s + ☃) / this.t * 32.0F, 0.0F, 1.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 32 */     this.d = this.g;
/* 33 */     this.e = this.h;
/* 34 */     this.f = this.i;
/*    */     
/* 36 */     if (this.s++ >= this.t) {
/* 37 */       j();
/*    */       
/*    */       return;
/*    */     } 
/* 41 */     a(this.j, this.k, this.l);
/* 42 */     if (this.h == this.e) {
/* 43 */       this.j *= 1.1D;
/* 44 */       this.l *= 1.1D;
/*    */     } 
/* 46 */     this.j *= 0.8600000143051147D;
/* 47 */     this.k *= 0.8600000143051147D;
/* 48 */     this.l *= 0.8600000143051147D;
/*    */     
/* 50 */     if (this.m) {
/* 51 */       this.j *= 0.699999988079071D;
/* 52 */       this.l *= 0.699999988079071D;
/*    */     } 
/*    */   }
/*    */   
/*    */   public static class b implements dyj<hi> {
/*    */     private final dyw a;
/*    */     
/*    */     public b(dyw ☃) {
/* 60 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 65 */       dxx dxx = new dxx(dwt1, d1, d2, d3);
/* 66 */       dxx.a(this.a);
/* 67 */       return dxx;
/*    */     }
/*    */   }
/*    */   
/*    */   public static class a implements dyj<hi> {
/*    */     private final dyw a;
/*    */     
/*    */     public a(dyw ☃) {
/* 75 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 80 */       dxx dxx = new dxx(dwt1, d1, d2 + 0.5D, d3);
/* 81 */       dxx.a(this.a);
/* 82 */       dxx.a(1.0F, 1.0F, 1.0F);
/* 83 */       return dxx;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dxx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */