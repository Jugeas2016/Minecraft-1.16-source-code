/*     */ import com.google.common.base.MoreObjects;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import java.util.stream.IntStream;
/*     */ import javax.annotation.concurrent.Immutable;
/*     */ 
/*     */ @Immutable
/*     */ public class gr
/*     */   implements Comparable<gr> {
/*     */   public static final Codec<gr> c;
/*     */   
/*     */   static {
/*  13 */     c = Codec.INT_STREAM.comapFlatMap(☃ -> x.a(☃, 3).map(()), ☃ -> IntStream.of(new int[] { ☃.u(), ☃.v(), ☃.w() }));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*  18 */   public static final gr d = new gr(0, 0, 0);
/*     */   
/*     */   private int a;
/*     */   private int b;
/*     */   private int e;
/*     */   
/*     */   public gr(int ☃, int i, int j) {
/*  25 */     this.a = ☃;
/*  26 */     this.b = i;
/*  27 */     this.e = j;
/*     */   }
/*     */   
/*     */   public gr(double ☃, double d1, double d2) {
/*  31 */     this(afm.c(☃), afm.c(d1), afm.c(d2));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  36 */     if (this == ☃) {
/*  37 */       return true;
/*     */     }
/*  39 */     if (!(☃ instanceof gr)) {
/*  40 */       return false;
/*     */     }
/*     */     
/*  43 */     gr gr1 = (gr)☃;
/*     */     
/*  45 */     if (u() != gr1.u()) {
/*  46 */       return false;
/*     */     }
/*  48 */     if (v() != gr1.v()) {
/*  49 */       return false;
/*     */     }
/*  51 */     if (w() != gr1.w()) {
/*  52 */       return false;
/*     */     }
/*     */     
/*  55 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  60 */     return (v() + w() * 31) * 31 + u();
/*     */   }
/*     */ 
/*     */   
/*     */   public int i(gr ☃) {
/*  65 */     if (v() == ☃.v()) {
/*  66 */       if (w() == ☃.w()) {
/*  67 */         return u() - ☃.u();
/*     */       }
/*  69 */       return w() - ☃.w();
/*     */     } 
/*  71 */     return v() - ☃.v();
/*     */   }
/*     */   
/*     */   public int u() {
/*  75 */     return this.a;
/*     */   }
/*     */   
/*     */   public int v() {
/*  79 */     return this.b;
/*     */   }
/*     */   
/*     */   public int w() {
/*  83 */     return this.e;
/*     */   }
/*     */   
/*     */   protected void o(int ☃) {
/*  87 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   protected void p(int ☃) {
/*  91 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   protected void q(int ☃) {
/*  95 */     this.e = ☃;
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
/*     */   public gr o() {
/* 130 */     return m(1);
/*     */   }
/*     */   
/*     */   public gr m(int ☃) {
/* 134 */     return b(gc.b, ☃);
/*     */   }
/*     */   
/*     */   public gr n() {
/* 138 */     return l(1);
/*     */   }
/*     */   
/*     */   public gr l(int ☃) {
/* 142 */     return b(gc.a, ☃);
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
/*     */   public gr b(gc ☃, int i) {
/* 182 */     if (i == 0) {
/* 183 */       return this;
/*     */     }
/* 185 */     return new gr(u() + ☃.i() * i, v() + ☃.j() * i, w() + ☃.k() * i);
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
/*     */   public gr d(gr ☃) {
/* 199 */     return new gr(v() * ☃.w() - w() * ☃.v(), w() * ☃.u() - u() * ☃.w(), u() * ☃.v() - v() * ☃.u());
/*     */   }
/*     */   
/*     */   public boolean a(gr ☃, double d) {
/* 203 */     return (a(☃.u(), ☃.v(), ☃.w(), false) < d * d);
/*     */   }
/*     */   
/*     */   public boolean a(gk ☃, double d) {
/* 207 */     return (a(☃.a(), ☃.b(), ☃.c(), true) < d * d);
/*     */   }
/*     */   
/*     */   public double j(gr ☃) {
/* 211 */     return a(☃.u(), ☃.v(), ☃.w(), true);
/*     */   }
/*     */   
/*     */   public double a(gk ☃, boolean bool) {
/* 215 */     return a(☃.a(), ☃.b(), ☃.c(), bool);
/*     */   }
/*     */   
/*     */   public double a(double ☃, double d1, double d2, boolean bool) {
/* 219 */     double d3 = bool ? 0.5D : 0.0D;
/* 220 */     double d4 = u() + d3 - ☃;
/* 221 */     double d5 = v() + d3 - d1;
/* 222 */     double d6 = w() + d3 - d2;
/* 223 */     return d4 * d4 + d5 * d5 + d6 * d6;
/*     */   }
/*     */   
/*     */   public int k(gr ☃) {
/* 227 */     float f1 = Math.abs(☃.u() - u());
/* 228 */     float f2 = Math.abs(☃.v() - v());
/* 229 */     float f3 = Math.abs(☃.w() - w());
/* 230 */     return (int)(f1 + f2 + f3);
/*     */   }
/*     */   
/*     */   public int a(gc.a ☃) {
/* 234 */     return ☃.a(this.a, this.b, this.e);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 239 */     return MoreObjects.toStringHelper(this)
/* 240 */       .add("x", u())
/* 241 */       .add("y", v())
/* 242 */       .add("z", w())
/* 243 */       .toString();
/*     */   }
/*     */   
/*     */   public String x() {
/* 247 */     return "" + u() + ", " + v() + ", " + w();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\gr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */