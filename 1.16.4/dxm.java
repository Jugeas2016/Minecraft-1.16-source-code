/*    */ 
/*    */ 
/*    */ 
/*    */ public class dxm
/*    */   extends dzb
/*    */ {
/*    */   private dxm(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6, boolean bool) {
/*  8 */     super(☃, d1, d2, d3);
/*  9 */     d(3.0F);
/* 10 */     a(0.25F, 0.25F);
/* 11 */     if (bool) {
/* 12 */       this.t = this.r.nextInt(50) + 280;
/*    */     } else {
/* 14 */       this.t = this.r.nextInt(50) + 80;
/*    */     } 
/* 16 */     this.u = 3.0E-6F;
/* 17 */     this.j = d4;
/* 18 */     this.k = d5 + (this.r.nextFloat() / 500.0F);
/* 19 */     this.l = d6;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 24 */     this.d = this.g;
/* 25 */     this.e = this.h;
/* 26 */     this.f = this.i;
/*    */     
/* 28 */     if (this.s++ >= this.t || this.y <= 0.0F) {
/* 29 */       j();
/*    */       
/*    */       return;
/*    */     } 
/* 33 */     this.j += (this.r.nextFloat() / 5000.0F * (this.r.nextBoolean() ? true : -1));
/* 34 */     this.l += (this.r.nextFloat() / 5000.0F * (this.r.nextBoolean() ? true : -1));
/* 35 */     this.k -= this.u;
/*    */     
/* 37 */     a(this.j, this.k, this.l);
/*    */     
/* 39 */     if (this.s >= this.t - 60 && this.y > 0.01F) {
/* 40 */       this.y -= 0.015F;
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public dyk b() {
/* 46 */     return dyk.c;
/*    */   }
/*    */   
/*    */   public static class a implements dyj<hi> {
/*    */     private final dyw a;
/*    */     
/*    */     public a(dyw ☃) {
/* 53 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 58 */       dxm dxm = new dxm(dwt1, d1, d2, d3, d4, d5, d6, false);
/* 59 */       dxm.e(0.9F);
/* 60 */       dxm.a(this.a);
/* 61 */       return dxm;
/*    */     }
/*    */   }
/*    */   
/*    */   public static class b implements dyj<hi> {
/*    */     private final dyw a;
/*    */     
/*    */     public b(dyw ☃) {
/* 69 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 74 */       dxm dxm = new dxm(dwt1, d1, d2, d3, d4, d5, d6, true);
/* 75 */       dxm.e(0.95F);
/* 76 */       dxm.a(this.a);
/* 77 */       return dxm;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dxm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */