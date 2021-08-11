/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dty<T extends bej>
/*    */   extends dwj<T>
/*    */ {
/*    */   public dty(float ☃, float f1, int i, int j) {
/* 13 */     super(☃, f1, i, j);
/*    */     
/* 15 */     this.i = new dwn(this, 32, 48);
/* 16 */     this.i.a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, ☃);
/* 17 */     this.i.a(-5.0F, 2.0F + f1, 0.0F);
/*    */     
/* 19 */     this.k = new dwn(this, 16, 48);
/* 20 */     this.k.a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, ☃);
/* 21 */     this.k.a(-1.9F, 12.0F + f1, 0.0F);
/*    */   }
/*    */   
/*    */   public dty(float ☃, boolean bool) {
/* 25 */     super(☃, 0.0F, 64, bool ? 32 : 64);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3) {
/* 30 */     this.n = dum.a.a;
/* 31 */     this.m = dum.a.a;
/*    */     
/* 33 */     bmb bmb = ☃.b(aot.a);
/* 34 */     if (bmb.b() == bmd.qM && ☃.eF()) {
/* 35 */       if (☃.dV() == aqi.b) {
/* 36 */         this.n = dum.a.e;
/*    */       } else {
/* 38 */         this.m = dum.a.e;
/*    */       } 
/*    */     }
/*    */     
/* 42 */     super.a(☃, f1, f2, f3);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 47 */     super.a(☃, f1, f2, f3, f4, f5);
/*    */     
/* 49 */     if (this.m == dum.a.e) {
/* 50 */       this.j.d = this.j.d * 0.5F - 3.1415927F;
/* 51 */       this.j.e = 0.0F;
/*    */     } 
/*    */     
/* 54 */     if (this.n == dum.a.e) {
/* 55 */       this.i.d = this.i.d * 0.5F - 3.1415927F;
/* 56 */       this.i.e = 0.0F;
/*    */     } 
/*    */     
/* 59 */     if (this.p > 0.0F) {
/* 60 */       this.i.d = a(this.p, this.i.d, -2.5132742F) + this.p * 0.35F * afm.a(0.1F * f3);
/* 61 */       this.j.d = a(this.p, this.j.d, -2.5132742F) - this.p * 0.35F * afm.a(0.1F * f3);
/* 62 */       this.i.f = a(this.p, this.i.f, -0.15F);
/* 63 */       this.j.f = a(this.p, this.j.f, 0.15F);
/*    */       
/* 65 */       this.l.d -= this.p * 0.55F * afm.a(0.1F * f3);
/* 66 */       this.k.d += this.p * 0.55F * afm.a(0.1F * f3);
/* 67 */       this.f.d = 0.0F;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dty.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */