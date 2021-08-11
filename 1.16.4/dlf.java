/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.AbstractList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.function.Predicate;
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
/*     */ public abstract class dlf<E extends dlf.a<E>>
/*     */   extends dmg
/*     */   implements dmf
/*     */ {
/*     */   protected final djz b;
/*     */   protected final int c;
/*  29 */   private final List<E> a = new c();
/*     */   protected int d;
/*     */   protected int e;
/*     */   protected int i;
/*     */   protected int j;
/*     */   protected int k;
/*     */   protected int l;
/*     */   protected boolean m = true;
/*     */   private double o;
/*     */   private boolean p = true;
/*     */   private boolean q;
/*     */   protected int n;
/*     */   private boolean r;
/*     */   private E s;
/*     */   private boolean t = true;
/*     */   private boolean u = true;
/*     */   
/*     */   public dlf(djz ☃, int i, int j, int k, int m, int n) {
/*  47 */     this.b = ☃;
/*  48 */     this.d = i;
/*  49 */     this.e = j;
/*  50 */     this.i = k;
/*  51 */     this.j = m;
/*  52 */     this.c = n;
/*  53 */     this.l = 0;
/*  54 */     this.k = i;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(boolean ☃) {
/*  59 */     this.p = ☃;
/*     */   }
/*     */   
/*     */   protected void a(boolean ☃, int i) {
/*  63 */     this.q = ☃;
/*  64 */     this.n = i;
/*     */     
/*  66 */     if (!☃) {
/*  67 */       this.n = 0;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/*  73 */     return 220;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public E h() {
/*  78 */     return this.s;
/*     */   }
/*     */   
/*     */   public void a(@Nullable E ☃) {
/*  82 */     this.s = ☃;
/*     */   }
/*     */   
/*     */   public void b(boolean ☃) {
/*  86 */     this.t = ☃;
/*     */   }
/*     */   
/*     */   public void c(boolean ☃) {
/*  90 */     this.u = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public E i() {
/*  97 */     return (E)super.aw_();
/*     */   }
/*     */ 
/*     */   
/*     */   public final List<E> au_() {
/* 102 */     return this.a;
/*     */   }
/*     */   
/*     */   protected final void k() {
/* 106 */     this.a.clear();
/*     */   }
/*     */   
/*     */   protected void a(Collection<E> ☃) {
/* 110 */     this.a.clear();
/* 111 */     this.a.addAll(☃);
/*     */   }
/*     */   
/*     */   protected E e(int ☃) {
/* 115 */     return au_().get(☃);
/*     */   }
/*     */   
/*     */   protected int b(E ☃) {
/* 119 */     this.a.add(☃);
/* 120 */     return this.a.size() - 1;
/*     */   }
/*     */   
/*     */   protected int l() {
/* 124 */     return au_().size();
/*     */   }
/*     */   
/*     */   protected boolean f(int ☃) {
/* 128 */     return Objects.equals(h(), au_().get(☃));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected final E a(double ☃, double d1) {
/* 133 */     int i = d() / 2;
/* 134 */     int j = this.l + this.d / 2;
/*     */     
/* 136 */     int k = j - i;
/* 137 */     int m = j + i;
/*     */     
/* 139 */     int n = afm.c(d1 - this.i) - this.n + (int)m() - 4;
/* 140 */     int i1 = n / this.c;
/* 141 */     if (☃ < e() && ☃ >= k && ☃ <= m && i1 >= 0 && n >= 0 && i1 < l()) {
/* 142 */       return au_().get(i1);
/*     */     }
/* 144 */     return null;
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i, int j, int k) {
/* 148 */     this.d = ☃;
/* 149 */     this.e = i;
/* 150 */     this.i = j;
/* 151 */     this.j = k;
/* 152 */     this.l = 0;
/* 153 */     this.k = ☃;
/*     */   }
/*     */   
/*     */   public void g(int ☃) {
/* 157 */     this.l = ☃;
/* 158 */     this.k = ☃ + this.d;
/*     */   }
/*     */   
/*     */   protected int c() {
/* 162 */     return l() * this.c + this.n;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(int ☃, int i) {}
/*     */ 
/*     */   
/*     */   protected void a(dfm ☃, int i, int j, dfo dfo1) {}
/*     */ 
/*     */   
/*     */   protected void a(dfm ☃) {}
/*     */ 
/*     */   
/*     */   protected void a(dfm ☃, int i, int j) {}
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 179 */     a(☃);
/*     */     
/* 181 */     int k = e();
/* 182 */     int m = k + 6;
/*     */     
/* 184 */     dfo dfo = dfo.a();
/* 185 */     dfh dfh = dfo.c();
/*     */     
/* 187 */     if (this.t) {
/* 188 */       this.b.M().a(dkw.f);
/* 189 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 190 */       float f1 = 32.0F;
/* 191 */       dfh.a(7, dfk.p);
/* 192 */       dfh.a(this.l, this.j, 0.0D).a(this.l / 32.0F, (this.j + (int)m()) / 32.0F).a(32, 32, 32, 255).d();
/* 193 */       dfh.a(this.k, this.j, 0.0D).a(this.k / 32.0F, (this.j + (int)m()) / 32.0F).a(32, 32, 32, 255).d();
/* 194 */       dfh.a(this.k, this.i, 0.0D).a(this.k / 32.0F, (this.i + (int)m()) / 32.0F).a(32, 32, 32, 255).d();
/* 195 */       dfh.a(this.l, this.i, 0.0D).a(this.l / 32.0F, (this.i + (int)m()) / 32.0F).a(32, 32, 32, 255).d();
/* 196 */       dfo.b();
/*     */     } 
/*     */     
/* 199 */     int n = q();
/* 200 */     int i1 = this.i + 4 - (int)m();
/*     */     
/* 202 */     if (this.q) {
/* 203 */       a(☃, n, i1, dfo);
/*     */     }
/*     */     
/* 206 */     a(☃, n, i1, i, j, f);
/*     */     
/* 208 */     if (this.u) {
/*     */ 
/*     */       
/* 211 */       this.b.M().a(dkw.f);
/* 212 */       RenderSystem.enableDepthTest();
/* 213 */       RenderSystem.depthFunc(519);
/* 214 */       float f1 = 32.0F;
/* 215 */       int i3 = -100;
/* 216 */       dfh.a(7, dfk.p);
/* 217 */       dfh.a(this.l, this.i, -100.0D).a(0.0F, this.i / 32.0F).a(64, 64, 64, 255).d();
/* 218 */       dfh.a((this.l + this.d), this.i, -100.0D).a(this.d / 32.0F, this.i / 32.0F).a(64, 64, 64, 255).d();
/* 219 */       dfh.a((this.l + this.d), 0.0D, -100.0D).a(this.d / 32.0F, 0.0F).a(64, 64, 64, 255).d();
/* 220 */       dfh.a(this.l, 0.0D, -100.0D).a(0.0F, 0.0F).a(64, 64, 64, 255).d();
/*     */       
/* 222 */       dfh.a(this.l, this.e, -100.0D).a(0.0F, this.e / 32.0F).a(64, 64, 64, 255).d();
/* 223 */       dfh.a((this.l + this.d), this.e, -100.0D).a(this.d / 32.0F, this.e / 32.0F).a(64, 64, 64, 255).d();
/* 224 */       dfh.a((this.l + this.d), this.j, -100.0D).a(this.d / 32.0F, this.j / 32.0F).a(64, 64, 64, 255).d();
/* 225 */       dfh.a(this.l, this.j, -100.0D).a(0.0F, this.j / 32.0F).a(64, 64, 64, 255).d();
/* 226 */       dfo.b();
/* 227 */       RenderSystem.depthFunc(515);
/* 228 */       RenderSystem.disableDepthTest();
/*     */       
/* 230 */       RenderSystem.enableBlend();
/* 231 */       RenderSystem.blendFuncSeparate(dem.r.l, dem.j.j, dem.r.o, dem.j.e);
/* 232 */       RenderSystem.disableAlphaTest();
/* 233 */       RenderSystem.shadeModel(7425);
/*     */       
/* 235 */       RenderSystem.disableTexture();
/*     */       
/* 237 */       int i4 = 4;
/*     */       
/* 239 */       dfh.a(7, dfk.p);
/* 240 */       dfh.a(this.l, (this.i + 4), 0.0D).a(0.0F, 1.0F).a(0, 0, 0, 0).d();
/* 241 */       dfh.a(this.k, (this.i + 4), 0.0D).a(1.0F, 1.0F).a(0, 0, 0, 0).d();
/* 242 */       dfh.a(this.k, this.i, 0.0D).a(1.0F, 0.0F).a(0, 0, 0, 255).d();
/* 243 */       dfh.a(this.l, this.i, 0.0D).a(0.0F, 0.0F).a(0, 0, 0, 255).d();
/*     */       
/* 245 */       dfh.a(this.l, this.j, 0.0D).a(0.0F, 1.0F).a(0, 0, 0, 255).d();
/* 246 */       dfh.a(this.k, this.j, 0.0D).a(1.0F, 1.0F).a(0, 0, 0, 255).d();
/* 247 */       dfh.a(this.k, (this.j - 4), 0.0D).a(1.0F, 0.0F).a(0, 0, 0, 0).d();
/* 248 */       dfh.a(this.l, (this.j - 4), 0.0D).a(0.0F, 0.0F).a(0, 0, 0, 0).d();
/* 249 */       dfo.b();
/*     */     } 
/*     */     
/* 252 */     int i2 = n();
/* 253 */     if (i2 > 0) {
/* 254 */       RenderSystem.disableTexture();
/* 255 */       int i3 = (int)(((this.j - this.i) * (this.j - this.i)) / c());
/* 256 */       i3 = afm.a(i3, 32, this.j - this.i - 8);
/*     */       
/* 258 */       int i4 = (int)m() * (this.j - this.i - i3) / i2 + this.i;
/* 259 */       if (i4 < this.i) {
/* 260 */         i4 = this.i;
/*     */       }
/*     */ 
/*     */       
/* 264 */       dfh.a(7, dfk.p);
/* 265 */       dfh.a(k, this.j, 0.0D).a(0.0F, 1.0F).a(0, 0, 0, 255).d();
/* 266 */       dfh.a(m, this.j, 0.0D).a(1.0F, 1.0F).a(0, 0, 0, 255).d();
/* 267 */       dfh.a(m, this.i, 0.0D).a(1.0F, 0.0F).a(0, 0, 0, 255).d();
/* 268 */       dfh.a(k, this.i, 0.0D).a(0.0F, 0.0F).a(0, 0, 0, 255).d();
/*     */       
/* 270 */       dfh.a(k, (i4 + i3), 0.0D).a(0.0F, 1.0F).a(128, 128, 128, 255).d();
/* 271 */       dfh.a(m, (i4 + i3), 0.0D).a(1.0F, 1.0F).a(128, 128, 128, 255).d();
/* 272 */       dfh.a(m, i4, 0.0D).a(1.0F, 0.0F).a(128, 128, 128, 255).d();
/* 273 */       dfh.a(k, i4, 0.0D).a(0.0F, 0.0F).a(128, 128, 128, 255).d();
/*     */       
/* 275 */       dfh.a(k, (i4 + i3 - 1), 0.0D).a(0.0F, 1.0F).a(192, 192, 192, 255).d();
/* 276 */       dfh.a((m - 1), (i4 + i3 - 1), 0.0D).a(1.0F, 1.0F).a(192, 192, 192, 255).d();
/* 277 */       dfh.a((m - 1), i4, 0.0D).a(1.0F, 0.0F).a(192, 192, 192, 255).d();
/* 278 */       dfh.a(k, i4, 0.0D).a(0.0F, 0.0F).a(192, 192, 192, 255).d();
/* 279 */       dfo.b();
/*     */     } 
/*     */     
/* 282 */     a(☃, i, j);
/*     */     
/* 284 */     RenderSystem.enableTexture();
/*     */     
/* 286 */     RenderSystem.shadeModel(7424);
/* 287 */     RenderSystem.enableAlphaTest();
/* 288 */     RenderSystem.disableBlend();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void c(E ☃) {
/* 293 */     a((au_().indexOf(☃) * this.c + this.c / 2 - (this.j - this.i) / 2));
/*     */   }
/*     */   
/*     */   protected void d(E ☃) {
/* 297 */     int i = h(au_().indexOf(☃));
/* 298 */     int j = i - this.i - 4 - this.c;
/* 299 */     if (j < 0) {
/* 300 */       a(j);
/*     */     }
/*     */     
/* 303 */     int k = this.j - i - this.c - this.c;
/* 304 */     if (k < 0) {
/* 305 */       a(-k);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(int ☃) {
/* 310 */     a(m() + ☃);
/*     */   }
/*     */   
/*     */   public double m() {
/* 314 */     return this.o;
/*     */   }
/*     */   
/*     */   public void a(double ☃) {
/* 318 */     this.o = afm.a(☃, 0.0D, n());
/*     */   }
/*     */   
/*     */   public int n() {
/* 322 */     return Math.max(0, c() - this.j - this.i - 4);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void b(double ☃, double d1, int i) {
/* 330 */     this.r = (i == 0 && ☃ >= e() && ☃ < (e() + 6));
/*     */   }
/*     */   
/*     */   protected int e() {
/* 334 */     return this.d / 2 + 124;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/* 339 */     b(☃, d1, i);
/* 340 */     if (!b(☃, d1)) {
/* 341 */       return false;
/*     */     }
/* 343 */     E e = a(☃, d1);
/* 344 */     if (e != null) {
/* 345 */       if (e.a(☃, d1, i)) {
/* 346 */         a((dmi)e);
/* 347 */         b_(true);
/* 348 */         return true;
/*     */       }
/*     */     
/* 351 */     } else if (i == 0) {
/* 352 */       a((int)(☃ - (this.l + this.d / 2 - d() / 2)), (int)(d1 - this.i) + (int)m() - 4);
/* 353 */       return true;
/*     */     } 
/*     */     
/* 356 */     return this.r;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(double ☃, double d1, int i) {
/* 361 */     if (i() != null) {
/* 362 */       i().c(☃, d1, i);
/*     */     }
/* 364 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i, double d2, double d3) {
/* 369 */     if (super.a(☃, d1, i, d2, d3)) {
/* 370 */       return true;
/*     */     }
/*     */     
/* 373 */     if (i != 0 || !this.r) {
/* 374 */       return false;
/*     */     }
/* 376 */     if (d1 < this.i) {
/* 377 */       a(0.0D);
/* 378 */     } else if (d1 > this.j) {
/* 379 */       a(n());
/*     */     } else {
/* 381 */       double d4 = Math.max(1, n());
/* 382 */       int j = this.j - this.i;
/* 383 */       int k = afm.a((int)((j * j) / c()), 32, j - 8);
/* 384 */       double d5 = Math.max(1.0D, d4 / (j - k));
/* 385 */       a(m() + d3 * d5);
/*     */     } 
/* 387 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, double d2) {
/* 392 */     a(m() - d2 * this.c / 2.0D);
/* 393 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 399 */     if (super.a(☃, i, j)) {
/* 400 */       return true;
/*     */     }
/* 402 */     if (☃ == 264) {
/* 403 */       a(b.b);
/* 404 */       return true;
/* 405 */     }  if (☃ == 265) {
/* 406 */       a(b.a);
/* 407 */       return true;
/*     */     } 
/* 409 */     return false;
/*     */   }
/*     */   
/*     */   protected void a(b ☃) {
/* 413 */     a(☃, ☃ -> true);
/*     */   }
/*     */   
/*     */   protected void p() {
/* 417 */     E ☃ = h();
/* 418 */     if (☃ != null) {
/* 419 */       a(☃);
/* 420 */       d(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public enum b {
/* 425 */     a,
/* 426 */     b;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(b ☃, Predicate<E> predicate) {
/* 431 */     int i = (☃ == b.a) ? -1 : 1;
/* 432 */     if (!au_().isEmpty()) {
/* 433 */       int j = au_().indexOf(h());
/*     */       while (true) {
/* 435 */         int k = afm.a(j + i, 0, l() - 1);
/*     */         
/* 437 */         if (j == k) {
/*     */           break;
/*     */         }
/*     */         
/* 441 */         a a1 = (a)au_().get(k);
/* 442 */         if (predicate.test((E)a1)) {
/* 443 */           a((E)a1);
/* 444 */           d((E)a1);
/*     */           
/*     */           break;
/*     */         } 
/* 448 */         j = k;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(double ☃, double d1) {
/* 455 */     return (d1 >= this.i && d1 <= this.j && ☃ >= this.l && ☃ <= this.k);
/*     */   }
/*     */   
/*     */   protected void a(dfm ☃, int i, int j, int k, int m, float f) {
/* 459 */     int n = l();
/* 460 */     dfo dfo = dfo.a();
/* 461 */     dfh dfh = dfo.c();
/*     */     
/* 463 */     for (int i1 = 0; i1 < n; i1++) {
/* 464 */       int i2 = h(i1);
/* 465 */       int i3 = b(i1);
/* 466 */       if (i3 >= this.i && i2 <= this.j) {
/*     */ 
/*     */ 
/*     */         
/* 470 */         int i4 = j + i1 * this.c + this.n;
/* 471 */         int i5 = this.c - 4;
/*     */         
/* 473 */         E e = e(i1);
/* 474 */         int i6 = d();
/* 475 */         if (this.p && f(i1)) {
/* 476 */           int i8 = this.l + this.d / 2 - i6 / 2;
/* 477 */           int i9 = this.l + this.d / 2 + i6 / 2;
/* 478 */           RenderSystem.disableTexture();
/* 479 */           float f1 = b() ? 1.0F : 0.5F;
/* 480 */           RenderSystem.color4f(f1, f1, f1, 1.0F);
/* 481 */           dfh.a(7, dfk.k);
/* 482 */           dfh.a(i8, (i4 + i5 + 2), 0.0D).d();
/* 483 */           dfh.a(i9, (i4 + i5 + 2), 0.0D).d();
/* 484 */           dfh.a(i9, (i4 - 2), 0.0D).d();
/* 485 */           dfh.a(i8, (i4 - 2), 0.0D).d();
/* 486 */           dfo.b();
/*     */           
/* 488 */           RenderSystem.color4f(0.0F, 0.0F, 0.0F, 1.0F);
/* 489 */           dfh.a(7, dfk.k);
/* 490 */           dfh.a((i8 + 1), (i4 + i5 + 1), 0.0D).d();
/* 491 */           dfh.a((i9 - 1), (i4 + i5 + 1), 0.0D).d();
/* 492 */           dfh.a((i9 - 1), (i4 - 1), 0.0D).d();
/* 493 */           dfh.a((i8 + 1), (i4 - 1), 0.0D).d();
/*     */           
/* 495 */           dfo.b();
/* 496 */           RenderSystem.enableTexture();
/*     */         } 
/*     */         
/* 499 */         int i7 = q();
/* 500 */         e.a(☃, i1, i2, i7, i6, i5, k, m, (b(k, m) && Objects.equals(a(k, m), e)), f);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   public int q() {
/* 505 */     return this.l + this.d / 2 - d() / 2 + 2;
/*     */   }
/*     */   
/*     */   public int r() {
/* 509 */     return q() + d();
/*     */   }
/*     */   
/*     */   protected int h(int ☃) {
/* 513 */     return this.i + 4 - (int)m() + ☃ * this.c + this.n;
/*     */   }
/*     */   
/*     */   private int b(int ☃) {
/* 517 */     return h(☃) + this.c;
/*     */   }
/*     */   
/*     */   protected boolean b() {
/* 521 */     return false;
/*     */   }
/*     */   
/*     */   protected E i(int ☃) {
/* 525 */     a a1 = (a)this.a.get(☃);
/* 526 */     if (e(this.a.get(☃))) {
/* 527 */       return (E)a1;
/*     */     }
/* 529 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean e(E ☃) {
/* 534 */     boolean bool = this.a.remove(☃);
/* 535 */     if (bool && ☃ == h()) {
/* 536 */       a((E)null);
/*     */     }
/* 538 */     return bool;
/*     */   }
/*     */   
/*     */   private void f(a<E> ☃) {
/* 542 */     a.a(☃, this);
/*     */   }
/*     */   
/*     */   public static abstract class a<E extends a<E>>
/*     */     implements dmi
/*     */   {
/*     */     @Deprecated
/*     */     private dlf<E> a;
/*     */     
/*     */     public abstract void a(dfm param1dfm, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, int param1Int7, boolean param1Boolean, float param1Float);
/*     */     
/*     */     public boolean b(double ☃, double d1) {
/* 554 */       return Objects.equals(this.a.a(☃, d1), this);
/*     */     }
/*     */   }
/*     */   
/*     */   class c extends AbstractList<E> {
/* 559 */     private final List<E> b = Lists.newArrayList();
/*     */ 
/*     */     
/*     */     public E a(int ☃) {
/* 563 */       return this.b.get(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public int size() {
/* 568 */       return this.b.size();
/*     */     }
/*     */ 
/*     */     
/*     */     public E a(int ☃, E e) {
/* 573 */       dlf.a a = (dlf.a)this.b.set(☃, e);
/* 574 */       dlf.a(this.a, (dlf.a)e);
/* 575 */       return (E)a;
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(int ☃, E e) {
/* 580 */       this.b.add(☃, e);
/* 581 */       dlf.a(this.a, (dlf.a)e);
/*     */     }
/*     */ 
/*     */     
/*     */     public E b(int ☃) {
/* 586 */       return this.b.remove(☃);
/*     */     }
/*     */     
/*     */     private c(dlf this$0) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dlf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */