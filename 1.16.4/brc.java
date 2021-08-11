/*     */ import java.util.function.BiFunction;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Stream;
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
/*     */ public interface brc
/*     */ {
/*     */   default int g(fx ☃) {
/*  42 */     return d_(☃).f();
/*     */   }
/*     */   
/*     */   default int K() {
/*  46 */     return 15;
/*     */   }
/*     */   
/*     */   default int L() {
/*  50 */     return 256;
/*     */   }
/*     */   
/*     */   default Stream<ceh> a(dci ☃) {
/*  54 */     return fx.a(☃).map(this::d_);
/*     */   }
/*     */   
/*     */   default dcj a(brf ☃) {
/*  58 */     return a(☃, (☃, fx1) -> {
/*     */           ceh ceh = d_(fx1);
/*     */           cux cux = b(fx1);
/*     */           dcn dcn1 = ☃.b();
/*     */           dcn dcn2 = ☃.a();
/*     */           ddh ddh1 = ☃.a(ceh, this, fx1);
/*     */           dcj dcj1 = a(dcn1, dcn2, fx1, ddh1, ceh);
/*     */           ddh ddh2 = ☃.a(cux, this, fx1);
/*     */           dcj dcj2 = ddh2.a(dcn1, dcn2, fx1);
/*     */           double d1 = (dcj1 == null) ? Double.MAX_VALUE : ☃.b().g(dcj1.e());
/*     */           double d2 = (dcj2 == null) ? Double.MAX_VALUE : ☃.b().g(dcj2.e());
/*     */           return (d1 <= d2) ? dcj1 : dcj2;
/*     */         }☃ -> {
/*     */           dcn dcn = ☃.b().d(☃.a());
/*     */           return dcj.a(☃.a(), gc.a(dcn.b, dcn.c, dcn.d), new fx(☃.a()));
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   default dcj a(dcn ☃, dcn dcn1, fx fx1, ddh ddh1, ceh ceh1) {
/*  84 */     dcj dcj = ddh1.a(☃, dcn1, fx1);
/*  85 */     if (dcj != null) {
/*     */       
/*  87 */       dcj dcj1 = ceh1.m(this, fx1).a(☃, dcn1, fx1);
/*  88 */       if (dcj1 != null && dcj1.e().d(☃).g() < dcj.e().d(☃).g()) {
/*  89 */         return dcj.a(dcj1.b());
/*     */       }
/*     */     } 
/*  92 */     return dcj;
/*     */   }
/*     */   
/*     */   default double a(ddh ☃, Supplier<ddh> supplier) {
/*  96 */     if (!☃.b()) {
/*  97 */       return ☃.c(gc.a.b);
/*     */     }
/*     */ 
/*     */     
/* 101 */     double d = ((ddh)supplier.get()).c(gc.a.b);
/* 102 */     if (d >= 1.0D) {
/* 103 */       return d - 1.0D;
/*     */     }
/*     */     
/* 106 */     return Double.NEGATIVE_INFINITY;
/*     */   }
/*     */   
/*     */   default double h(fx ☃) {
/* 110 */     return a(d_(☃).k(this, ☃), () -> {
/*     */           fx fx1 = ☃.c();
/*     */           return d_(fx1).k(this, fx1);
/*     */         });
/*     */   }
/*     */   
/*     */   static <T> T a(brf ☃, BiFunction<brf, fx, T> biFunction, Function<brf, T> function) {
/* 117 */     dcn dcn1 = ☃.b();
/* 118 */     dcn dcn2 = ☃.a();
/*     */     
/* 120 */     if (dcn1.equals(dcn2)) {
/* 121 */       return function.apply(☃);
/*     */     }
/*     */ 
/*     */     
/* 125 */     double d1 = afm.d(-1.0E-7D, dcn2.b, dcn1.b);
/* 126 */     double d2 = afm.d(-1.0E-7D, dcn2.c, dcn1.c);
/* 127 */     double d3 = afm.d(-1.0E-7D, dcn2.d, dcn1.d);
/*     */     
/* 129 */     double d4 = afm.d(-1.0E-7D, dcn1.b, dcn2.b);
/* 130 */     double d5 = afm.d(-1.0E-7D, dcn1.c, dcn2.c);
/* 131 */     double d6 = afm.d(-1.0E-7D, dcn1.d, dcn2.d);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 136 */     int i = afm.c(d4);
/* 137 */     int j = afm.c(d5);
/* 138 */     int k = afm.c(d6);
/*     */     
/* 140 */     fx.a a = new fx.a(i, j, k);
/* 141 */     T t = biFunction.apply(☃, a);
/* 142 */     if (t != null) {
/* 143 */       return t;
/*     */     }
/*     */     
/* 146 */     double d7 = d1 - d4;
/* 147 */     double d8 = d2 - d5;
/* 148 */     double d9 = d3 - d6;
/*     */     
/* 150 */     int m = afm.k(d7);
/* 151 */     int n = afm.k(d8);
/* 152 */     int i1 = afm.k(d9);
/*     */     
/* 154 */     double d10 = (m == 0) ? Double.MAX_VALUE : (m / d7);
/* 155 */     double d11 = (n == 0) ? Double.MAX_VALUE : (n / d8);
/* 156 */     double d12 = (i1 == 0) ? Double.MAX_VALUE : (i1 / d9);
/*     */     
/* 158 */     double d13 = d10 * ((m > 0) ? (1.0D - afm.h(d4)) : afm.h(d4));
/* 159 */     double d14 = d11 * ((n > 0) ? (1.0D - afm.h(d5)) : afm.h(d5));
/* 160 */     double d15 = d12 * ((i1 > 0) ? (1.0D - afm.h(d6)) : afm.h(d6));
/*     */     
/* 162 */     while (d13 <= 1.0D || d14 <= 1.0D || d15 <= 1.0D) {
/* 163 */       if (d13 < d14) {
/* 164 */         if (d13 < d15) {
/* 165 */           i += m;
/* 166 */           d13 += d10;
/*     */         } else {
/* 168 */           k += i1;
/* 169 */           d15 += d12;
/*     */         }
/*     */       
/* 172 */       } else if (d14 < d15) {
/* 173 */         j += n;
/* 174 */         d14 += d11;
/*     */       } else {
/* 176 */         k += i1;
/* 177 */         d15 += d12;
/*     */       } 
/*     */ 
/*     */       
/* 181 */       T t1 = biFunction.apply(☃, a.d(i, j, k));
/* 182 */       if (t1 != null) {
/* 183 */         return t1;
/*     */       }
/*     */     } 
/*     */     
/* 187 */     return function.apply(☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   ccj c(fx paramfx);
/*     */   
/*     */   ceh d_(fx paramfx);
/*     */   
/*     */   cux b(fx paramfx);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\brc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */