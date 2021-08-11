/*     */ import java.util.EnumSet;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dcn
/*     */   implements gk
/*     */ {
/*  12 */   public static final dcn a = new dcn(0.0D, 0.0D, 0.0D);
/*     */   public final double b;
/*     */   public final double c;
/*     */   public final double d;
/*     */   
/*     */   public static dcn a(int ☃) {
/*  18 */     double d1 = (☃ >> 16 & 0xFF) / 255.0D;
/*  19 */     double d2 = (☃ >> 8 & 0xFF) / 255.0D;
/*  20 */     double d3 = (☃ & 0xFF) / 255.0D;
/*  21 */     return new dcn(d1, d2, d3);
/*     */   }
/*     */   
/*     */   public static dcn a(gr ☃) {
/*  25 */     return new dcn(☃.u() + 0.5D, ☃.v() + 0.5D, ☃.w() + 0.5D);
/*     */   }
/*     */   
/*     */   public static dcn b(gr ☃) {
/*  29 */     return new dcn(☃.u(), ☃.v(), ☃.w());
/*     */   }
/*     */   
/*     */   public static dcn c(gr ☃) {
/*  33 */     return new dcn(☃.u() + 0.5D, ☃.v(), ☃.w() + 0.5D);
/*     */   }
/*     */   
/*     */   public static dcn a(gr ☃, double d) {
/*  37 */     return new dcn(☃.u() + 0.5D, ☃.v() + d, ☃.w() + 0.5D);
/*     */   }
/*     */   
/*     */   public dcn(double ☃, double d1, double d2) {
/*  41 */     this.b = ☃;
/*  42 */     this.c = d1;
/*  43 */     this.d = d2;
/*     */   }
/*     */   
/*     */   public dcn(g ☃) {
/*  47 */     this(☃.a(), ☃.b(), ☃.c());
/*     */   }
/*     */   
/*     */   public dcn a(dcn ☃) {
/*  51 */     return new dcn(☃.b - this.b, ☃.c - this.c, ☃.d - this.d);
/*     */   }
/*     */   
/*     */   public dcn d() {
/*  55 */     double ☃ = afm.a(this.b * this.b + this.c * this.c + this.d * this.d);
/*  56 */     if (☃ < 1.0E-4D) {
/*  57 */       return a;
/*     */     }
/*  59 */     return new dcn(this.b / ☃, this.c / ☃, this.d / ☃);
/*     */   }
/*     */   
/*     */   public double b(dcn ☃) {
/*  63 */     return this.b * ☃.b + this.c * ☃.c + this.d * ☃.d;
/*     */   }
/*     */   
/*     */   public dcn c(dcn ☃) {
/*  67 */     return new dcn(this.c * ☃.d - this.d * ☃.c, this.d * ☃.b - this.b * ☃.d, this.b * ☃.c - this.c * ☃.b);
/*     */   }
/*     */   
/*     */   public dcn d(dcn ☃) {
/*  71 */     return a(☃.b, ☃.c, ☃.d);
/*     */   }
/*     */   
/*     */   public dcn a(double ☃, double d1, double d2) {
/*  75 */     return b(-☃, -d1, -d2);
/*     */   }
/*     */   
/*     */   public dcn e(dcn ☃) {
/*  79 */     return b(☃.b, ☃.c, ☃.d);
/*     */   }
/*     */   
/*     */   public dcn b(double ☃, double d1, double d2) {
/*  83 */     return new dcn(this.b + ☃, this.c + d1, this.d + d2);
/*     */   }
/*     */   
/*     */   public boolean a(gk ☃, double d) {
/*  87 */     return (c(☃.a(), ☃.b(), ☃.c()) < d * d);
/*     */   }
/*     */   
/*     */   public double f(dcn ☃) {
/*  91 */     double d1 = ☃.b - this.b;
/*  92 */     double d2 = ☃.c - this.c;
/*  93 */     double d3 = ☃.d - this.d;
/*  94 */     return afm.a(d1 * d1 + d2 * d2 + d3 * d3);
/*     */   }
/*     */   
/*     */   public double g(dcn ☃) {
/*  98 */     double d1 = ☃.b - this.b;
/*  99 */     double d2 = ☃.c - this.c;
/* 100 */     double d3 = ☃.d - this.d;
/* 101 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*     */   }
/*     */   
/*     */   public double c(double ☃, double d1, double d2) {
/* 105 */     double d3 = ☃ - this.b;
/* 106 */     double d4 = d1 - this.c;
/* 107 */     double d5 = d2 - this.d;
/* 108 */     return d3 * d3 + d4 * d4 + d5 * d5;
/*     */   }
/*     */   
/*     */   public dcn a(double ☃) {
/* 112 */     return d(☃, ☃, ☃);
/*     */   }
/*     */   
/*     */   public dcn e() {
/* 116 */     return a(-1.0D);
/*     */   }
/*     */   
/*     */   public dcn h(dcn ☃) {
/* 120 */     return d(☃.b, ☃.c, ☃.d);
/*     */   }
/*     */   
/*     */   public dcn d(double ☃, double d1, double d2) {
/* 124 */     return new dcn(this.b * ☃, this.c * d1, this.d * d2);
/*     */   }
/*     */   
/*     */   public double f() {
/* 128 */     return afm.a(this.b * this.b + this.c * this.c + this.d * this.d);
/*     */   }
/*     */   
/*     */   public double g() {
/* 132 */     return this.b * this.b + this.c * this.c + this.d * this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 137 */     if (this == ☃) {
/* 138 */       return true;
/*     */     }
/* 140 */     if (!(☃ instanceof dcn)) {
/* 141 */       return false;
/*     */     }
/*     */     
/* 144 */     dcn dcn1 = (dcn)☃;
/*     */     
/* 146 */     if (Double.compare(dcn1.b, this.b) != 0) {
/* 147 */       return false;
/*     */     }
/* 149 */     if (Double.compare(dcn1.c, this.c) != 0) {
/* 150 */       return false;
/*     */     }
/* 152 */     return (Double.compare(dcn1.d, this.d) == 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 159 */     long l = Double.doubleToLongBits(this.b);
/* 160 */     int ☃ = (int)(l ^ l >>> 32L);
/* 161 */     l = Double.doubleToLongBits(this.c);
/* 162 */     ☃ = 31 * ☃ + (int)(l ^ l >>> 32L);
/* 163 */     l = Double.doubleToLongBits(this.d);
/* 164 */     ☃ = 31 * ☃ + (int)(l ^ l >>> 32L);
/* 165 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 170 */     return "(" + this.b + ", " + this.c + ", " + this.d + ")";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public dcn a(float ☃) {
/* 178 */     float f1 = afm.b(☃);
/* 179 */     float f2 = afm.a(☃);
/*     */     
/* 181 */     double d1 = this.b;
/* 182 */     double d2 = this.c * f1 + this.d * f2;
/* 183 */     double d3 = this.d * f1 - this.c * f2;
/*     */     
/* 185 */     return new dcn(d1, d2, d3);
/*     */   }
/*     */   
/*     */   public dcn b(float ☃) {
/* 189 */     float f1 = afm.b(☃);
/* 190 */     float f2 = afm.a(☃);
/*     */     
/* 192 */     double d1 = this.b * f1 + this.d * f2;
/* 193 */     double d2 = this.c;
/* 194 */     double d3 = this.d * f1 - this.b * f2;
/*     */     
/* 196 */     return new dcn(d1, d2, d3);
/*     */   }
/*     */   
/*     */   public dcn c(float ☃) {
/* 200 */     float f1 = afm.b(☃);
/* 201 */     float f2 = afm.a(☃);
/*     */     
/* 203 */     double d1 = this.b * f1 + this.c * f2;
/* 204 */     double d2 = this.c * f1 - this.b * f2;
/* 205 */     double d3 = this.d;
/*     */     
/* 207 */     return new dcn(d1, d2, d3);
/*     */   }
/*     */   
/*     */   public static dcn a(dcm ☃) {
/* 211 */     return a(☃.i, ☃.j);
/*     */   }
/*     */ 
/*     */   
/*     */   public static dcn a(float ☃, float f1) {
/* 216 */     float f2 = afm.b(-f1 * 0.017453292F - 3.1415927F);
/* 217 */     float f3 = afm.a(-f1 * 0.017453292F - 3.1415927F);
/* 218 */     float f4 = -afm.b(-☃ * 0.017453292F);
/* 219 */     float f5 = afm.a(-☃ * 0.017453292F);
/*     */     
/* 221 */     return new dcn((f3 * f4), f5, (f2 * f4));
/*     */   }
/*     */   
/*     */   public dcn a(EnumSet<gc.a> ☃) {
/* 225 */     double d1 = ☃.contains(gc.a.a) ? afm.c(this.b) : this.b;
/* 226 */     double d2 = ☃.contains(gc.a.b) ? afm.c(this.c) : this.c;
/* 227 */     double d3 = ☃.contains(gc.a.c) ? afm.c(this.d) : this.d;
/* 228 */     return new dcn(d1, d2, d3);
/*     */   }
/*     */   
/*     */   public double a(gc.a ☃) {
/* 232 */     return ☃.a(this.b, this.c, this.d);
/*     */   }
/*     */ 
/*     */   
/*     */   public final double a() {
/* 237 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public final double b() {
/* 242 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public final double c() {
/* 247 */     return this.d;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dcn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */