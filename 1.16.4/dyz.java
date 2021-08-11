/*     */ 
/*     */ 
/*     */ 
/*     */ public class dyz
/*     */   extends dzb
/*     */ {
/*     */   private dyz(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6) {
/*   8 */     super(☃, d1, d2, d3, d4, d5, d6);
/*     */     
/*  10 */     float f = this.r.nextFloat() * 0.1F + 0.2F;
/*  11 */     this.v = f;
/*  12 */     this.w = f;
/*  13 */     this.x = f;
/*  14 */     a(0.02F, 0.02F);
/*     */     
/*  16 */     this.B *= this.r.nextFloat() * 0.6F + 0.5F;
/*     */     
/*  18 */     this.j *= 0.019999999552965164D;
/*  19 */     this.k *= 0.019999999552965164D;
/*  20 */     this.l *= 0.019999999552965164D;
/*     */     
/*  22 */     this.t = (int)(20.0D / (Math.random() * 0.8D + 0.2D));
/*     */   }
/*     */ 
/*     */   
/*     */   public dyk b() {
/*  27 */     return dyk.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(double ☃, double d1, double d2) {
/*  32 */     a(m().d(☃, d1, d2));
/*  33 */     k();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/*  38 */     this.d = this.g;
/*  39 */     this.e = this.h;
/*  40 */     this.f = this.i;
/*     */     
/*  42 */     if (this.t-- <= 0) {
/*  43 */       j();
/*     */       
/*     */       return;
/*     */     } 
/*  47 */     a(this.j, this.k, this.l);
/*  48 */     this.j *= 0.99D;
/*  49 */     this.k *= 0.99D;
/*  50 */     this.l *= 0.99D;
/*     */   }
/*     */   
/*     */   public static class d implements dyj<hi> {
/*     */     private final dyw a;
/*     */     
/*     */     public d(dyw ☃) {
/*  57 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/*  62 */       dyz dyz = new dyz(dwt1, d1, d2, d3, d4, d5, d6);
/*  63 */       dyz.a(this.a);
/*  64 */       return dyz;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class c implements dyj<hi> {
/*     */     private final dyw a;
/*     */     
/*     */     public c(dyw ☃) {
/*  72 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/*  77 */       dyz dyz = new dyz(dwt1, d1, d2, d3, d4, d5, d6);
/*  78 */       dyz.a(this.a);
/*  79 */       dyz.a(1.0F, 1.0F, 1.0F);
/*  80 */       return dyz;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class a implements dyj<hi> {
/*     */     private final dyw a;
/*     */     
/*     */     public a(dyw ☃) {
/*  88 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/*  93 */       dyz dyz = new dyz(dwt1, d1, d2, d3, d4, d5, d6);
/*  94 */       dyz.a(this.a);
/*  95 */       dyz.a(1.0F, 1.0F, 1.0F);
/*  96 */       dyz.a(3 + dwt1.u_().nextInt(5));
/*  97 */       return dyz;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class b implements dyj<hi> {
/*     */     private final dyw a;
/*     */     
/*     */     public b(dyw ☃) {
/* 105 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 110 */       dyz dyz = new dyz(dwt1, d1, d2, d3, d4, d5, d6);
/* 111 */       dyz.a(0.3F, 0.5F, 1.0F);
/* 112 */       dyz.a(this.a);
/* 113 */       dyz.e(1.0F - dwt1.t.nextFloat() * 0.7F);
/* 114 */       dyz.a(dyz.i() / 2);
/* 115 */       return dyz;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dyz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */