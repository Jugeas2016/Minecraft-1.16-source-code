/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dyf
/*    */   extends dzb
/*    */ {
/*    */   private dyf(dwt ☃, double d1, double d2, double d3, double d4) {
/*  9 */     super(☃, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/* 10 */     this.j *= 0.009999999776482582D;
/* 11 */     this.k *= 0.009999999776482582D;
/* 12 */     this.l *= 0.009999999776482582D;
/* 13 */     this.k += 0.2D;
/*    */     
/* 15 */     this.v = Math.max(0.0F, afm.a(((float)d4 + 0.0F) * 6.2831855F) * 0.65F + 0.35F);
/* 16 */     this.w = Math.max(0.0F, afm.a(((float)d4 + 0.33333334F) * 6.2831855F) * 0.65F + 0.35F);
/* 17 */     this.x = Math.max(0.0F, afm.a(((float)d4 + 0.6666667F) * 6.2831855F) * 0.65F + 0.35F);
/*    */     
/* 19 */     this.B *= 1.5F;
/* 20 */     this.t = 6;
/*    */   }
/*    */ 
/*    */   
/*    */   public dyk b() {
/* 25 */     return dyk.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public float b(float ☃) {
/* 30 */     return this.B * afm.a((this.s + ☃) / this.t * 32.0F, 0.0F, 1.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 35 */     this.d = this.g;
/* 36 */     this.e = this.h;
/* 37 */     this.f = this.i;
/*    */     
/* 39 */     if (this.s++ >= this.t) {
/* 40 */       j();
/*    */       
/*    */       return;
/*    */     } 
/* 44 */     a(this.j, this.k, this.l);
/* 45 */     if (this.h == this.e) {
/* 46 */       this.j *= 1.1D;
/* 47 */       this.l *= 1.1D;
/*    */     } 
/* 49 */     this.j *= 0.6600000262260437D;
/* 50 */     this.k *= 0.6600000262260437D;
/* 51 */     this.l *= 0.6600000262260437D;
/*    */     
/* 53 */     if (this.m) {
/* 54 */       this.j *= 0.699999988079071D;
/* 55 */       this.l *= 0.699999988079071D;
/*    */     } 
/*    */   }
/*    */   
/*    */   public static class a implements dyj<hi> {
/*    */     private final dyw a;
/*    */     
/*    */     public a(dyw ☃) {
/* 63 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 68 */       dyf dyf = new dyf(dwt1, d1, d2, d3, d4);
/* 69 */       dyf.a(this.a);
/* 70 */       return dyf;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dyf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */