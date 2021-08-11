/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class d
/*     */ {
/*   8 */   public static final d a = new d(0.0F, 0.0F, 0.0F, 1.0F);
/*     */   
/*     */   private float b;
/*     */   private float c;
/*     */   private float d;
/*     */   private float e;
/*     */   
/*     */   public d(float ☃, float f1, float f2, float f3) {
/*  16 */     this.b = ☃;
/*  17 */     this.c = f1;
/*  18 */     this.d = f2;
/*  19 */     this.e = f3;
/*     */   }
/*     */   
/*     */   public d(g ☃, float f, boolean bool) {
/*  23 */     if (bool) {
/*  24 */       f *= 0.017453292F;
/*     */     }
/*  26 */     float f1 = c(f / 2.0F);
/*  27 */     this.b = ☃.a() * f1;
/*  28 */     this.c = ☃.b() * f1;
/*  29 */     this.d = ☃.c() * f1;
/*  30 */     this.e = b(f / 2.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public d(float ☃, float f1, float f2, boolean bool) {
/*  38 */     if (bool) {
/*  39 */       ☃ *= 0.017453292F;
/*  40 */       f1 *= 0.017453292F;
/*  41 */       f2 *= 0.017453292F;
/*     */     } 
/*     */     
/*  44 */     float f3 = c(0.5F * ☃);
/*  45 */     float f4 = b(0.5F * ☃);
/*  46 */     float f5 = c(0.5F * f1);
/*  47 */     float f6 = b(0.5F * f1);
/*  48 */     float f7 = c(0.5F * f2);
/*  49 */     float f8 = b(0.5F * f2);
/*     */     
/*  51 */     this.b = f3 * f6 * f8 + f4 * f5 * f7;
/*  52 */     this.c = f4 * f5 * f8 - f3 * f6 * f7;
/*  53 */     this.d = f3 * f5 * f8 + f4 * f6 * f7;
/*  54 */     this.e = f4 * f6 * f8 - f3 * f5 * f7;
/*     */   }
/*     */   
/*     */   public d(d ☃) {
/*  58 */     this.b = ☃.b;
/*  59 */     this.c = ☃.c;
/*  60 */     this.d = ☃.d;
/*  61 */     this.e = ☃.e;
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
/*     */   public boolean equals(Object ☃) {
/* 144 */     if (this == ☃) {
/* 145 */       return true;
/*     */     }
/* 147 */     if (☃ == null || getClass() != ☃.getClass()) {
/* 148 */       return false;
/*     */     }
/* 150 */     d d1 = (d)☃;
/* 151 */     if (Float.compare(d1.b, this.b) != 0) {
/* 152 */       return false;
/*     */     }
/* 154 */     if (Float.compare(d1.c, this.c) != 0) {
/* 155 */       return false;
/*     */     }
/* 157 */     if (Float.compare(d1.d, this.d) != 0) {
/* 158 */       return false;
/*     */     }
/* 160 */     return (Float.compare(d1.e, this.e) == 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 165 */     int ☃ = Float.floatToIntBits(this.b);
/* 166 */     ☃ = 31 * ☃ + Float.floatToIntBits(this.c);
/* 167 */     ☃ = 31 * ☃ + Float.floatToIntBits(this.d);
/* 168 */     ☃ = 31 * ☃ + Float.floatToIntBits(this.e);
/* 169 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 174 */     StringBuilder ☃ = new StringBuilder();
/* 175 */     ☃.append("Quaternion[").append(d()).append(" + ");
/* 176 */     ☃.append(a()).append("i + ");
/* 177 */     ☃.append(b()).append("j + ");
/* 178 */     ☃.append(c()).append("k]");
/* 179 */     return ☃.toString();
/*     */   }
/*     */   
/*     */   public float a() {
/* 183 */     return this.b;
/*     */   }
/*     */   
/*     */   public float b() {
/* 187 */     return this.c;
/*     */   }
/*     */   
/*     */   public float c() {
/* 191 */     return this.d;
/*     */   }
/*     */   
/*     */   public float d() {
/* 195 */     return this.e;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(d ☃) {
/* 202 */     float f1 = a();
/* 203 */     float f2 = b();
/* 204 */     float f3 = c();
/* 205 */     float f4 = d();
/*     */     
/* 207 */     float f5 = ☃.a();
/* 208 */     float f6 = ☃.b();
/* 209 */     float f7 = ☃.c();
/* 210 */     float f8 = ☃.d();
/*     */     
/* 212 */     this.b = f4 * f5 + f1 * f8 + f2 * f7 - f3 * f6;
/* 213 */     this.c = f4 * f6 - f1 * f7 + f2 * f8 + f3 * f5;
/* 214 */     this.d = f4 * f7 + f1 * f6 - f2 * f5 + f3 * f8;
/* 215 */     this.e = f4 * f8 - f1 * f5 - f2 * f6 - f3 * f7;
/*     */   }
/*     */   
/*     */   public void a(float ☃) {
/* 219 */     this.b *= ☃;
/* 220 */     this.c *= ☃;
/* 221 */     this.d *= ☃;
/* 222 */     this.e *= ☃;
/*     */   }
/*     */   
/*     */   public void e() {
/* 226 */     this.b = -this.b;
/* 227 */     this.c = -this.c;
/* 228 */     this.d = -this.d;
/*     */   }
/*     */   
/*     */   public void a(float ☃, float f1, float f2, float f3) {
/* 232 */     this.b = ☃;
/* 233 */     this.c = f1;
/* 234 */     this.d = f2;
/* 235 */     this.e = f3;
/*     */   }
/*     */   
/*     */   private static float b(float ☃) {
/* 239 */     return (float)Math.cos(☃);
/*     */   }
/*     */   
/*     */   private static float c(float ☃) {
/* 243 */     return (float)Math.sin(☃);
/*     */   }
/*     */   
/*     */   public void f() {
/* 247 */     float ☃ = a() * a() + b() * b() + c() * c() + d() * d();
/* 248 */     if (☃ > 1.0E-6F) {
/* 249 */       float f = afm.i(☃);
/* 250 */       this.b *= f;
/* 251 */       this.c *= f;
/* 252 */       this.d *= f;
/* 253 */       this.e *= f;
/*     */     } else {
/* 255 */       this.b = 0.0F;
/* 256 */       this.c = 0.0F;
/* 257 */       this.d = 0.0F;
/* 258 */       this.e = 0.0F;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public d g() {
/* 267 */     return new d(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */