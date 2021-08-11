/*     */ 
/*     */ 
/*     */ 
/*     */ public class dxr
/*     */   extends dzb
/*     */ {
/*     */   private final double a;
/*     */   private final double b;
/*     */   private final double D;
/*     */   
/*     */   private dxr(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6) {
/*  12 */     super(☃, d1, d2, d3);
/*     */     
/*  14 */     this.j = d4;
/*  15 */     this.k = d5;
/*  16 */     this.l = d6;
/*  17 */     this.a = d1;
/*  18 */     this.b = d2;
/*  19 */     this.D = d3;
/*  20 */     this.d = d1 + d4;
/*  21 */     this.e = d2 + d5;
/*  22 */     this.f = d3 + d6;
/*  23 */     this.g = this.d;
/*  24 */     this.h = this.e;
/*  25 */     this.i = this.f;
/*     */     
/*  27 */     this.B = 0.1F * (this.r.nextFloat() * 0.5F + 0.2F);
/*     */     
/*  29 */     float f = this.r.nextFloat() * 0.6F + 0.4F;
/*  30 */     this.v = 0.9F * f;
/*  31 */     this.w = 0.9F * f;
/*  32 */     this.x = f;
/*     */     
/*  34 */     this.n = false;
/*     */     
/*  36 */     this.t = (int)(Math.random() * 10.0D) + 30;
/*     */   }
/*     */ 
/*     */   
/*     */   public dyk b() {
/*  41 */     return dyk.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(double ☃, double d1, double d2) {
/*  46 */     a(m().d(☃, d1, d2));
/*  47 */     k();
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(float ☃) {
/*  52 */     int i = super.a(☃);
/*     */     
/*  54 */     float f = this.s / this.t;
/*  55 */     f *= f;
/*  56 */     f *= f;
/*     */     
/*  58 */     int j = i & 0xFF;
/*  59 */     int k = i >> 16 & 0xFF;
/*  60 */     k += (int)(f * 15.0F * 16.0F);
/*  61 */     if (k > 240) {
/*  62 */       k = 240;
/*     */     }
/*  64 */     return j | k << 16;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/*  69 */     this.d = this.g;
/*  70 */     this.e = this.h;
/*  71 */     this.f = this.i;
/*     */     
/*  73 */     if (this.s++ >= this.t) {
/*  74 */       j();
/*     */       
/*     */       return;
/*     */     } 
/*  78 */     float ☃ = this.s / this.t;
/*  79 */     ☃ = 1.0F - ☃;
/*     */     
/*  81 */     float f1 = 1.0F - ☃;
/*  82 */     f1 *= f1;
/*  83 */     f1 *= f1;
/*  84 */     this.g = this.a + this.j * ☃;
/*  85 */     this.h = this.b + this.k * ☃ - (f1 * 1.2F);
/*  86 */     this.i = this.D + this.l * ☃;
/*     */   }
/*     */   
/*     */   public static class b implements dyj<hi> {
/*     */     private final dyw a;
/*     */     
/*     */     public b(dyw ☃) {
/*  93 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/*  98 */       dxr dxr = new dxr(dwt1, d1, d2, d3, d4, d5, d6);
/*  99 */       dxr.a(this.a);
/* 100 */       return dxr;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class a implements dyj<hi> {
/*     */     private final dyw a;
/*     */     
/*     */     public a(dyw ☃) {
/* 108 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 113 */       dxr dxr = new dxr(dwt1, d1, d2, d3, d4, d5, d6);
/* 114 */       dxr.a(this.a);
/* 115 */       return dxr;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dxr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */