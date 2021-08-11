/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.math.DoubleMath;
/*     */ import it.unimi.dsi.fastutil.doubles.DoubleList;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
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
/*     */ public abstract class ddh
/*     */ {
/*     */   protected final dcw a;
/*     */   @Nullable
/*     */   private ddh[] b;
/*     */   
/*     */   ddh(dcw ☃) {
/*  25 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public double b(gc.a ☃) {
/*  29 */     int i = this.a.a(☃);
/*  30 */     if (i >= this.a.c(☃)) {
/*  31 */       return Double.POSITIVE_INFINITY;
/*     */     }
/*  33 */     return a(☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public double c(gc.a ☃) {
/*  38 */     int i = this.a.b(☃);
/*  39 */     if (i <= 0) {
/*  40 */       return Double.NEGATIVE_INFINITY;
/*     */     }
/*  42 */     return a(☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public dci a() {
/*  47 */     if (b()) {
/*  48 */       throw (UnsupportedOperationException)x.c(new UnsupportedOperationException("No bounds for empty shape."));
/*     */     }
/*  50 */     return new dci(b(gc.a.a), b(gc.a.b), b(gc.a.c), c(gc.a.a), c(gc.a.b), c(gc.a.c));
/*     */   }
/*     */   
/*     */   protected double a(gc.a ☃, int i) {
/*  54 */     return a(☃).getDouble(i);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  60 */     return this.a.a();
/*     */   }
/*     */   
/*     */   public ddh a(double ☃, double d1, double d2) {
/*  64 */     if (b()) {
/*  65 */       return dde.a();
/*     */     }
/*  67 */     return new dcp(this.a, (DoubleList)new ddd(
/*     */           
/*  69 */           a(gc.a.a), ☃), (DoubleList)new ddd(
/*  70 */           a(gc.a.b), d1), (DoubleList)new ddd(
/*  71 */           a(gc.a.c), d2));
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh c() {
/*  76 */     ddh[] ☃ = { dde.a() };
/*  77 */     b((d1, d2, d3, d4, d5, d6) -> ☃[0] = dde.b(☃[0], dde.a(d1, d2, d3, d4, d5, d6), dcr.o));
/*     */ 
/*     */     
/*  80 */     return ☃[0];
/*     */   }
/*     */   
/*     */   public void a(dde.a ☃) {
/*  84 */     this.a.a((i, j, k, m, n, i1) -> ☃.consume(a(gc.a.a, i), a(gc.a.b, j), a(gc.a.c, k), a(gc.a.a, m), a(gc.a.b, n), a(gc.a.c, i1)), true);
/*     */   }
/*     */   
/*     */   public void b(dde.a ☃) {
/*  88 */     DoubleList doubleList1 = a(gc.a.a);
/*  89 */     DoubleList doubleList2 = a(gc.a.b);
/*  90 */     DoubleList doubleList3 = a(gc.a.c);
/*     */     
/*  92 */     this.a.b((i, j, k, m, n, i1) -> ☃.consume(doubleList1.getDouble(i), doubleList2.getDouble(j), doubleList3.getDouble(k), doubleList1.getDouble(m), doubleList2.getDouble(n), doubleList3.getDouble(i1)), true);
/*     */   }
/*     */   
/*     */   public List<dci> d() {
/*  96 */     List<dci> ☃ = Lists.newArrayList();
/*  97 */     b((d1, d2, d3, d4, d5, d6) -> ☃.add(new dci(d1, d2, d3, d4, d5, d6)));
/*  98 */     return ☃;
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
/*     */   public double b(gc.a ☃, double d1, double d2) {
/* 115 */     gc.a a1 = fv.b.a(☃);
/* 116 */     gc.a a2 = fv.c.a(☃);
/* 117 */     int i = a(a1, d1);
/* 118 */     int j = a(a2, d2);
/* 119 */     int k = this.a.b(☃, i, j);
/* 120 */     if (k <= 0) {
/* 121 */       return Double.NEGATIVE_INFINITY;
/*     */     }
/* 123 */     return a(☃, k);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected int a(gc.a ☃, double d) {
/* 129 */     return afm.a(0, this.a.c(☃) + 1, i -> (i < 0) ? false : ((i > this.a.c(☃)) ? true : ((d < a(☃, i))))) - 1;
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
/*     */   protected boolean b(double ☃, double d1, double d2) {
/* 144 */     return this.a.c(a(gc.a.a, ☃), a(gc.a.b, d1), a(gc.a.c, d2));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public dcj a(dcn ☃, dcn dcn1, fx fx1) {
/* 149 */     if (b()) {
/* 150 */       return null;
/*     */     }
/*     */ 
/*     */     
/* 154 */     dcn dcn2 = dcn1.d(☃);
/* 155 */     if (dcn2.g() < 1.0E-7D) {
/* 156 */       return null;
/*     */     }
/*     */     
/* 159 */     dcn dcn3 = ☃.e(dcn2.a(0.001D));
/*     */ 
/*     */     
/* 162 */     if (b(dcn3.b - fx1.u(), dcn3.c - fx1.v(), dcn3.d - fx1.w())) {
/* 163 */       return new dcj(dcn3, gc.a(dcn2.b, dcn2.c, dcn2.d).f(), fx1, true);
/*     */     }
/*     */ 
/*     */     
/* 167 */     return dci.a(d(), ☃, dcn1, fx1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ddh a(gc ☃) {
/* 174 */     if (b() || this == dde.b()) {
/* 175 */       return this;
/*     */     }
/*     */     
/* 178 */     if (this.b != null) {
/* 179 */       ddh ddh2 = this.b[☃.ordinal()];
/* 180 */       if (ddh2 != null) {
/* 181 */         return ddh2;
/*     */       }
/*     */     } else {
/* 184 */       this.b = new ddh[6];
/*     */     } 
/*     */     
/* 187 */     ddh ddh1 = b(☃);
/* 188 */     this.b[☃.ordinal()] = ddh1;
/* 189 */     return ddh1;
/*     */   }
/*     */   
/*     */   private ddh b(gc ☃) {
/* 193 */     gc.a a = ☃.n();
/* 194 */     gc.b b = ☃.e();
/* 195 */     DoubleList doubleList = a(a);
/* 196 */     if (doubleList.size() == 2 && DoubleMath.fuzzyEquals(doubleList.getDouble(0), 0.0D, 1.0E-7D) && DoubleMath.fuzzyEquals(doubleList.getDouble(1), 1.0D, 1.0E-7D)) {
/* 197 */       return this;
/*     */     }
/* 199 */     int i = a(a, (b == gc.b.a) ? 0.9999999D : 1.0E-7D);
/* 200 */     return new ddf(this, a, i);
/*     */   }
/*     */   
/*     */   public double a(gc.a ☃, dci dci1, double d) {
/* 204 */     return a(fv.a(☃, gc.a.a), dci1, d);
/*     */   }
/*     */   
/*     */   protected double a(fv ☃, dci dci1, double d) {
/* 208 */     if (b()) {
/* 209 */       return d;
/*     */     }
/* 211 */     if (Math.abs(d) < 1.0E-7D) {
/* 212 */       return 0.0D;
/*     */     }
/*     */     
/* 215 */     fv fv1 = ☃.a();
/* 216 */     gc.a a1 = fv1.a(gc.a.a);
/* 217 */     gc.a a2 = fv1.a(gc.a.b);
/* 218 */     gc.a a3 = fv1.a(gc.a.c);
/*     */     
/* 220 */     double d1 = dci1.b(a1);
/* 221 */     double d2 = dci1.a(a1);
/*     */     
/* 223 */     int i = a(a1, d2 + 1.0E-7D);
/* 224 */     int j = a(a1, d1 - 1.0E-7D);
/*     */     
/* 226 */     int k = Math.max(0, a(a2, dci1.a(a2) + 1.0E-7D));
/* 227 */     int m = Math.min(this.a.c(a2), a(a2, dci1.b(a2) - 1.0E-7D) + 1);
/*     */     
/* 229 */     int n = Math.max(0, a(a3, dci1.a(a3) + 1.0E-7D));
/* 230 */     int i1 = Math.min(this.a.c(a3), a(a3, dci1.b(a3) - 1.0E-7D) + 1);
/*     */     
/* 232 */     int i2 = this.a.c(a1);
/*     */     
/* 234 */     if (d > 0.0D) {
/* 235 */       for (int i3 = j + 1; i3 < i2; i3++) {
/* 236 */         for (int i4 = k; i4 < m; i4++) {
/* 237 */           for (int i5 = n; i5 < i1; i5++) {
/* 238 */             if (this.a.a(fv1, i3, i4, i5)) {
/* 239 */               double d3 = a(a1, i3) - d1;
/* 240 */               if (d3 >= -1.0E-7D) {
/* 241 */                 d = Math.min(d, d3);
/*     */               }
/* 243 */               return d;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 248 */     } else if (d < 0.0D) {
/* 249 */       for (int i3 = i - 1; i3 >= 0; i3--) {
/* 250 */         for (int i4 = k; i4 < m; i4++) {
/* 251 */           for (int i5 = n; i5 < i1; i5++) {
/* 252 */             if (this.a.a(fv1, i3, i4, i5)) {
/* 253 */               double d3 = a(a1, i3 + 1) - d2;
/* 254 */               if (d3 <= 1.0E-7D) {
/* 255 */                 d = Math.max(d, d3);
/*     */               }
/* 257 */               return d;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 263 */     return d;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 268 */     return b() ? "EMPTY" : ("VoxelShape[" + a() + "]");
/*     */   }
/*     */   
/*     */   protected abstract DoubleList a(gc.a parama);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ddh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */