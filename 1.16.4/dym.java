/*     */ 
/*     */ 
/*     */ 
/*     */ public class dym
/*     */   extends dzb
/*     */ {
/*     */   private final double a;
/*     */   private final double b;
/*     */   private final double D;
/*     */   
/*     */   protected dym(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6) {
/*  12 */     super(☃, d1, d2, d3);
/*     */     
/*  14 */     this.j = d4;
/*  15 */     this.k = d5;
/*  16 */     this.l = d6;
/*  17 */     this.g = d1;
/*  18 */     this.h = d2;
/*  19 */     this.i = d3;
/*  20 */     this.a = this.g;
/*  21 */     this.b = this.h;
/*  22 */     this.D = this.i;
/*     */     
/*  24 */     this.B = 0.1F * (this.r.nextFloat() * 0.2F + 0.5F);
/*     */     
/*  26 */     float f = this.r.nextFloat() * 0.6F + 0.4F;
/*  27 */     this.v = f * 0.9F;
/*  28 */     this.w = f * 0.3F;
/*  29 */     this.x = f;
/*     */     
/*  31 */     this.t = (int)(Math.random() * 10.0D) + 40;
/*     */   }
/*     */ 
/*     */   
/*     */   public dyk b() {
/*  36 */     return dyk.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(double ☃, double d1, double d2) {
/*  41 */     a(m().d(☃, d1, d2));
/*  42 */     k();
/*     */   }
/*     */ 
/*     */   
/*     */   public float b(float ☃) {
/*  47 */     float f = (this.s + ☃) / this.t;
/*  48 */     f = 1.0F - f;
/*  49 */     f *= f;
/*  50 */     f = 1.0F - f;
/*  51 */     return this.B * f;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(float ☃) {
/*  56 */     int i = super.a(☃);
/*     */     
/*  58 */     float f = this.s / this.t;
/*  59 */     f *= f;
/*  60 */     f *= f;
/*     */     
/*  62 */     int j = i & 0xFF;
/*  63 */     int k = i >> 16 & 0xFF;
/*  64 */     k += (int)(f * 15.0F * 16.0F);
/*  65 */     if (k > 240) {
/*  66 */       k = 240;
/*     */     }
/*  68 */     return j | k << 16;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/*  73 */     this.d = this.g;
/*  74 */     this.e = this.h;
/*  75 */     this.f = this.i;
/*     */     
/*  77 */     if (this.s++ >= this.t) {
/*  78 */       j();
/*     */       
/*     */       return;
/*     */     } 
/*  82 */     float ☃ = this.s / this.t;
/*  83 */     float f1 = ☃;
/*  84 */     ☃ = -☃ + ☃ * ☃ * 2.0F;
/*  85 */     ☃ = 1.0F - ☃;
/*     */     
/*  87 */     this.g = this.a + this.j * ☃;
/*  88 */     this.h = this.b + this.k * ☃ + (1.0F - f1);
/*  89 */     this.i = this.D + this.l * ☃;
/*     */   }
/*     */   
/*     */   public static class a implements dyj<hi> {
/*     */     private final dyw a;
/*     */     
/*     */     public a(dyw ☃) {
/*  96 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 101 */       dym dym = new dym(dwt1, d1, d2, d3, d4, d5, d6);
/* 102 */       dym.a(this.a);
/* 103 */       return dym;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dym.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */