/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.world.level.ColorResolver;
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
/*     */ public interface brz
/*     */   extends bra, brg, bsx.a
/*     */ {
/*     */   @Nullable
/*     */   cfw a(int paramInt1, int paramInt2, cga paramcga, boolean paramBoolean);
/*     */   
/*     */   @Deprecated
/*     */   boolean b(int paramInt1, int paramInt2);
/*     */   
/*     */   int a(chn.a parama, int paramInt1, int paramInt2);
/*     */   
/*     */   int c();
/*     */   
/*     */   bsx d();
/*     */   
/*     */   default bsv v(fx ☃) {
/*  37 */     return d().a(☃);
/*     */   }
/*     */   
/*     */   default Stream<ceh> c(dci ☃) {
/*  41 */     int i = afm.c(☃.a);
/*  42 */     int j = afm.c(☃.d);
/*  43 */     int k = afm.c(☃.b);
/*  44 */     int m = afm.c(☃.e);
/*  45 */     int n = afm.c(☃.c);
/*  46 */     int i1 = afm.c(☃.f);
/*     */     
/*  48 */     if (a(i, k, n, j, m, i1)) {
/*  49 */       return a(☃);
/*     */     }
/*  51 */     return Stream.empty();
/*     */   }
/*     */ 
/*     */   
/*     */   default int a(fx ☃, ColorResolver colorResolver) {
/*  56 */     return colorResolver.getColor(v(☃), ☃.u(), ☃.w());
/*     */   }
/*     */ 
/*     */   
/*     */   default bsv b(int ☃, int i, int j) {
/*  61 */     cfw cfw = a(☃ >> 2, j >> 2, cga.d, false);
/*  62 */     if (cfw != null && cfw.i() != null) {
/*  63 */       return cfw.i().b(☃, i, j);
/*     */     }
/*  65 */     return a(☃, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   bsv a(int paramInt1, int paramInt2, int paramInt3);
/*     */ 
/*     */   
/*     */   boolean s_();
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   int t_();
/*     */   
/*     */   chd k();
/*     */   
/*     */   default fx a(chn.a ☃, fx fx1) {
/*  81 */     return new fx(fx1.u(), a(☃, fx1.u(), fx1.w()), fx1.w());
/*     */   }
/*     */   
/*     */   default boolean w(fx ☃) {
/*  85 */     return d_(☃).g();
/*     */   }
/*     */   
/*     */   default boolean x(fx ☃) {
/*  89 */     if (☃.v() >= t_()) {
/*  90 */       return e(☃);
/*     */     }
/*  92 */     fx fx1 = new fx(☃.u(), t_(), ☃.w());
/*  93 */     if (!e(fx1)) {
/*  94 */       return false;
/*     */     }
/*  96 */     fx1 = fx1.c();
/*  97 */     while (fx1.v() > ☃.v()) {
/*  98 */       ceh ceh = d_(fx1);
/*  99 */       if (ceh.b(this, fx1) > 0 && !ceh.c().a()) {
/* 100 */         return false;
/*     */       }
/* 102 */       fx1 = fx1.c();
/*     */     } 
/* 104 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   default float y(fx ☃) {
/* 112 */     return k().a(B(☃));
/*     */   }
/*     */   
/*     */   default int c(fx ☃, gc gc1) {
/* 116 */     return d_(☃).c(this, ☃, gc1);
/*     */   }
/*     */   
/*     */   default cfw z(fx ☃) {
/* 120 */     return a(☃.u() >> 4, ☃.w() >> 4);
/*     */   }
/*     */   
/*     */   default cfw a(int ☃, int i) {
/* 124 */     return a(☃, i, cga.m, true);
/*     */   }
/*     */   
/*     */   default cfw a(int ☃, int i, cga cga1) {
/* 128 */     return a(☃, i, cga1, true);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   default brc c(int ☃, int i) {
/* 134 */     return a(☃, i, cga.a, false);
/*     */   }
/*     */   
/*     */   default boolean A(fx ☃) {
/* 138 */     return b(☃).a(aef.b);
/*     */   }
/*     */   
/*     */   default boolean d(dci ☃) {
/* 142 */     int i = afm.c(☃.a);
/* 143 */     int j = afm.f(☃.d);
/* 144 */     int k = afm.c(☃.b);
/* 145 */     int m = afm.f(☃.e);
/* 146 */     int n = afm.c(☃.c);
/* 147 */     int i1 = afm.f(☃.f);
/*     */     
/* 149 */     fx.a a1 = new fx.a();
/* 150 */     for (int i2 = i; i2 < j; i2++) {
/* 151 */       for (int i3 = k; i3 < m; i3++) {
/* 152 */         for (int i4 = n; i4 < i1; i4++) {
/* 153 */           ceh ceh = d_(a1.d(i2, i3, i4));
/* 154 */           if (!ceh.m().c()) {
/* 155 */             return true;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 160 */     return false;
/*     */   }
/*     */   
/*     */   default int B(fx ☃) {
/* 164 */     return c(☃, c());
/*     */   }
/*     */   
/*     */   default int c(fx ☃, int i) {
/* 168 */     if (☃.u() < -30000000 || ☃.w() < -30000000 || ☃.u() >= 30000000 || ☃.w() >= 30000000) {
/* 169 */       return 15;
/*     */     }
/*     */     
/* 172 */     return b(☃, i);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   default boolean C(fx ☃) {
/* 180 */     return b(☃.u() >> 4, ☃.w() >> 4);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   default boolean a(fx ☃, fx fx1) {
/* 188 */     return a(☃.u(), ☃.v(), ☃.w(), fx1.u(), fx1.v(), fx1.w());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   default boolean a(int ☃, int i, int j, int k, int m, int n) {
/* 196 */     if (m < 0 || i >= 256) {
/* 197 */       return false;
/*     */     }
/*     */     
/* 200 */     ☃ >>= 4;
/* 201 */     j >>= 4;
/* 202 */     k >>= 4;
/* 203 */     n >>= 4;
/*     */     
/* 205 */     for (int i1 = ☃; i1 <= k; i1++) {
/* 206 */       for (int i2 = j; i2 <= n; i2++) {
/* 207 */         if (!b(i1, i2)) {
/* 208 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 213 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\brz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */