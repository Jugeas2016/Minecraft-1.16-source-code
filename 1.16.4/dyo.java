/*    */ 
/*    */ 
/*    */ public abstract class dyo
/*    */   extends dzb
/*    */ {
/*    */   protected dyo(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6) {
/*  7 */     super(☃, d1, d2, d3, d4, d5, d6);
/*  8 */     this.j = this.j * 0.009999999776482582D + d4;
/*  9 */     this.k = this.k * 0.009999999776482582D + d5;
/* 10 */     this.l = this.l * 0.009999999776482582D + d6;
/* 11 */     this.g += ((this.r.nextFloat() - this.r.nextFloat()) * 0.05F);
/* 12 */     this.h += ((this.r.nextFloat() - this.r.nextFloat()) * 0.05F);
/* 13 */     this.i += ((this.r.nextFloat() - this.r.nextFloat()) * 0.05F);
/*    */     
/* 15 */     this.t = (int)(8.0D / (Math.random() * 0.8D + 0.2D)) + 4;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 20 */     this.d = this.g;
/* 21 */     this.e = this.h;
/* 22 */     this.f = this.i;
/*    */     
/* 24 */     if (this.s++ >= this.t) {
/* 25 */       j();
/*    */       
/*    */       return;
/*    */     } 
/* 29 */     a(this.j, this.k, this.l);
/* 30 */     this.j *= 0.9599999785423279D;
/* 31 */     this.k *= 0.9599999785423279D;
/* 32 */     this.l *= 0.9599999785423279D;
/*    */     
/* 34 */     if (this.m) {
/* 35 */       this.j *= 0.699999988079071D;
/* 36 */       this.l *= 0.699999988079071D;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dyo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */