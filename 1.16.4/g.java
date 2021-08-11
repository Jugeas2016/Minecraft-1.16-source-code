/*     */ import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class g
/*     */ {
/*   8 */   public static g a = new g(-1.0F, 0.0F, 0.0F);
/*   9 */   public static g b = new g(1.0F, 0.0F, 0.0F);
/*  10 */   public static g c = new g(0.0F, -1.0F, 0.0F);
/*  11 */   public static g d = new g(0.0F, 1.0F, 0.0F);
/*  12 */   public static g e = new g(0.0F, 0.0F, -1.0F);
/*  13 */   public static g f = new g(0.0F, 0.0F, 1.0F);
/*     */   
/*     */   private float g;
/*     */   
/*     */   private float h;
/*     */   private float i;
/*     */   
/*     */   public g() {}
/*     */   
/*     */   public g(float ☃, float f1, float f2) {
/*  23 */     this.g = ☃;
/*  24 */     this.h = f1;
/*  25 */     this.i = f2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public g(dcn ☃) {
/*  33 */     this((float)☃.b, (float)☃.c, (float)☃.d);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  38 */     if (this == ☃) {
/*  39 */       return true;
/*     */     }
/*  41 */     if (☃ == null || getClass() != ☃.getClass()) {
/*  42 */       return false;
/*     */     }
/*     */     
/*  45 */     g g1 = (g)☃;
/*  46 */     if (Float.compare(g1.g, this.g) != 0) {
/*  47 */       return false;
/*     */     }
/*  49 */     if (Float.compare(g1.h, this.h) != 0) {
/*  50 */       return false;
/*     */     }
/*  52 */     return (Float.compare(g1.i, this.i) == 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  57 */     int ☃ = Float.floatToIntBits(this.g);
/*  58 */     ☃ = 31 * ☃ + Float.floatToIntBits(this.h);
/*  59 */     ☃ = 31 * ☃ + Float.floatToIntBits(this.i);
/*  60 */     return ☃;
/*     */   }
/*     */   
/*     */   public float a() {
/*  64 */     return this.g;
/*     */   }
/*     */   
/*     */   public float b() {
/*  68 */     return this.h;
/*     */   }
/*     */   
/*     */   public float c() {
/*  72 */     return this.i;
/*     */   }
/*     */   
/*     */   public void b(float ☃) {
/*  76 */     this.g *= ☃;
/*  77 */     this.h *= ☃;
/*  78 */     this.i *= ☃;
/*     */   }
/*     */   
/*     */   public void b(float ☃, float f1, float f2) {
/*  82 */     this.g *= ☃;
/*  83 */     this.h *= f1;
/*  84 */     this.i *= f2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float ☃, float f1) {
/*  94 */     this.g = afm.a(this.g, ☃, f1);
/*  95 */     this.h = afm.a(this.h, ☃, f1);
/*  96 */     this.i = afm.a(this.i, ☃, f1);
/*     */   }
/*     */   
/*     */   public void a(float ☃, float f1, float f2) {
/* 100 */     this.g = ☃;
/* 101 */     this.h = f1;
/* 102 */     this.i = f2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(float ☃, float f1, float f2) {
/* 112 */     this.g += ☃;
/* 113 */     this.h += f1;
/* 114 */     this.i += f2;
/*     */   }
/*     */   
/*     */   public void a(g ☃) {
/* 118 */     this.g += ☃.g;
/* 119 */     this.h += ☃.h;
/* 120 */     this.i += ☃.i;
/*     */   }
/*     */   
/*     */   public void b(g ☃) {
/* 124 */     this.g -= ☃.g;
/* 125 */     this.h -= ☃.h;
/* 126 */     this.i -= ☃.i;
/*     */   }
/*     */   
/*     */   public float c(g ☃) {
/* 130 */     return this.g * ☃.g + this.h * ☃.h + this.i * ☃.i;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 134 */     float ☃ = this.g * this.g + this.h * this.h + this.i * this.i;
/* 135 */     if (☃ < 1.0E-5D) {
/* 136 */       return false;
/*     */     }
/* 138 */     float f1 = afm.i(☃);
/* 139 */     this.g *= f1;
/* 140 */     this.h *= f1;
/* 141 */     this.i *= f1;
/*     */     
/* 143 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void d(g ☃) {
/* 150 */     float f1 = this.g;
/* 151 */     float f2 = this.h;
/* 152 */     float f3 = this.i;
/*     */     
/* 154 */     float f4 = ☃.a();
/* 155 */     float f5 = ☃.b();
/* 156 */     float f6 = ☃.c();
/*     */     
/* 158 */     this.g = f2 * f6 - f3 * f5;
/* 159 */     this.h = f3 * f4 - f1 * f6;
/* 160 */     this.i = f1 * f5 - f2 * f4;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(a ☃) {
/* 167 */     float f1 = this.g;
/* 168 */     float f2 = this.h;
/* 169 */     float f3 = this.i;
/*     */     
/* 171 */     this.g = ☃.a * f1 + ☃.b * f2 + ☃.c * f3;
/* 172 */     this.h = ☃.d * f1 + ☃.e * f2 + ☃.f * f3;
/* 173 */     this.i = ☃.g * f1 + ☃.h * f2 + ☃.i * f3;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(d ☃) {
/* 180 */     d d1 = new d(☃);
/* 181 */     d1.a(new d(a(), b(), c(), 0.0F));
/* 182 */     d d2 = new d(☃);
/*     */     
/* 184 */     d2.e();
/* 185 */     d1.a(d2);
/* 186 */     a(d1.a(), d1.b(), d1.c());
/*     */   }
/*     */   
/*     */   public void a(g ☃, float f) {
/* 190 */     float f1 = 1.0F - f;
/* 191 */     this.g = this.g * f1 + ☃.g * f;
/* 192 */     this.h = this.h * f1 + ☃.h * f;
/* 193 */     this.i = this.i * f1 + ☃.i * f;
/*     */   }
/*     */   
/*     */   public d c(float ☃) {
/* 197 */     return new d(this, ☃, false);
/*     */   }
/*     */   
/*     */   public d a(float ☃) {
/* 201 */     return new d(this, ☃, true);
/*     */   }
/*     */   
/*     */   public g e() {
/* 205 */     return new g(this.g, this.h, this.i);
/*     */   }
/*     */   
/*     */   public void a(Float2FloatFunction ☃) {
/* 209 */     this.g = ☃.get(this.g);
/* 210 */     this.h = ☃.get(this.h);
/* 211 */     this.i = ☃.get(this.i);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 216 */     return "[" + this.g + ", " + this.h + ", " + this.i + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */