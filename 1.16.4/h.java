/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class h
/*     */ {
/*     */   private float a;
/*     */   private float b;
/*     */   private float c;
/*     */   private float d;
/*     */   
/*     */   public h() {}
/*     */   
/*     */   public h(float ☃, float f1, float f2, float f3) {
/*  15 */     this.a = ☃;
/*  16 */     this.b = f1;
/*  17 */     this.c = f2;
/*  18 */     this.d = f3;
/*     */   }
/*     */   
/*     */   public h(g ☃) {
/*  22 */     this(☃.a(), ☃.b(), ☃.c(), 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  27 */     if (this == ☃) {
/*  28 */       return true;
/*     */     }
/*  30 */     if (☃ == null || getClass() != ☃.getClass()) {
/*  31 */       return false;
/*     */     }
/*     */     
/*  34 */     h h1 = (h)☃;
/*  35 */     if (Float.compare(h1.a, this.a) != 0) {
/*  36 */       return false;
/*     */     }
/*  38 */     if (Float.compare(h1.b, this.b) != 0) {
/*  39 */       return false;
/*     */     }
/*  41 */     if (Float.compare(h1.c, this.c) != 0) {
/*  42 */       return false;
/*     */     }
/*  44 */     return (Float.compare(h1.d, this.d) == 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  49 */     int ☃ = Float.floatToIntBits(this.a);
/*  50 */     ☃ = 31 * ☃ + Float.floatToIntBits(this.b);
/*  51 */     ☃ = 31 * ☃ + Float.floatToIntBits(this.c);
/*  52 */     ☃ = 31 * ☃ + Float.floatToIntBits(this.d);
/*  53 */     return ☃;
/*     */   }
/*     */   
/*     */   public float a() {
/*  57 */     return this.a;
/*     */   }
/*     */   
/*     */   public float b() {
/*  61 */     return this.b;
/*     */   }
/*     */   
/*     */   public float c() {
/*  65 */     return this.c;
/*     */   }
/*     */   
/*     */   public float d() {
/*  69 */     return this.d;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(g ☃) {
/*  80 */     this.a *= ☃.a();
/*  81 */     this.b *= ☃.b();
/*  82 */     this.c *= ☃.c();
/*     */   }
/*     */   
/*     */   public void a(float ☃, float f1, float f2, float f3) {
/*  86 */     this.a = ☃;
/*  87 */     this.b = f1;
/*  88 */     this.c = f2;
/*  89 */     this.d = f3;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float a(h ☃) {
/* 100 */     return this.a * ☃.a + this.b * ☃.b + this.c * ☃.c + this.d * ☃.d;
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 104 */     float ☃ = this.a * this.a + this.b * this.b + this.c * this.c + this.d * this.d;
/* 105 */     if (☃ < 1.0E-5D) {
/* 106 */       return false;
/*     */     }
/* 108 */     float f1 = afm.i(☃);
/* 109 */     this.a *= f1;
/* 110 */     this.b *= f1;
/* 111 */     this.c *= f1;
/* 112 */     this.d *= f1;
/*     */     
/* 114 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(b ☃) {
/* 121 */     float f1 = this.a;
/* 122 */     float f2 = this.b;
/* 123 */     float f3 = this.c;
/* 124 */     float f4 = this.d;
/* 125 */     this.a = ☃.a * f1 + ☃.b * f2 + ☃.c * f3 + ☃.d * f4;
/* 126 */     this.b = ☃.e * f1 + ☃.f * f2 + ☃.g * f3 + ☃.h * f4;
/* 127 */     this.c = ☃.i * f1 + ☃.j * f2 + ☃.k * f3 + ☃.l * f4;
/* 128 */     this.d = ☃.m * f1 + ☃.n * f2 + ☃.o * f3 + ☃.p * f4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(d ☃) {
/* 135 */     d d1 = new d(☃);
/* 136 */     d1.a(new d(a(), b(), c(), 0.0F));
/* 137 */     d d2 = new d(☃);
/*     */     
/* 139 */     d2.e();
/* 140 */     d1.a(d2);
/* 141 */     a(d1.a(), d1.b(), d1.c(), d());
/*     */   }
/*     */ 
/*     */   
/*     */   public void f() {
/* 146 */     this.a /= this.d;
/* 147 */     this.b /= this.d;
/* 148 */     this.c /= this.d;
/* 149 */     this.d = 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 162 */     return "[" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */