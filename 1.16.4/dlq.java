/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Objects;
/*     */ import java.util.function.BiFunction;
/*     */ import java.util.function.Consumer;
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
/*     */ public class dlq
/*     */   extends dlh
/*     */   implements dmf, dmi
/*     */ {
/*     */   private final dku a;
/*  44 */   private String b = "";
/*  45 */   private int c = 32;
/*     */   private int d;
/*     */   private boolean e = true;
/*     */   private boolean s = true;
/*     */   private boolean t = true;
/*     */   private boolean u;
/*     */   private int v;
/*     */   private int w;
/*     */   private int x;
/*  54 */   private int y = 14737632;
/*  55 */   private int z = 7368816;
/*     */   private String A;
/*     */   private Consumer<String> B;
/*  58 */   private Predicate<String> C = Objects::nonNull;
/*     */   private BiFunction<String, Integer, afa> D;
/*     */   
/*     */   public dlq(dku ☃, int i, int j, int k, int m, nr nr1) {
/*  62 */     this(☃, i, j, k, m, (dlq)null, nr1);
/*     */   }
/*     */   
/*     */   public dlq(dku ☃, int i, int j, int k, int m, @Nullable dlq dlq1, nr nr1) {
/*  66 */     super(i, j, k, m, nr1); this.D = ((☃, integer) -> afa.a(☃, ob.a));
/*  67 */     this.a = ☃;
/*  68 */     if (dlq1 != null) {
/*  69 */       a(dlq1.b());
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(Consumer<String> ☃) {
/*  74 */     this.B = ☃;
/*     */   }
/*     */   
/*     */   public void a(BiFunction<String, Integer, afa> ☃) {
/*  78 */     this.D = ☃;
/*     */   }
/*     */   
/*     */   public void a() {
/*  82 */     this.d++;
/*     */   }
/*     */ 
/*     */   
/*     */   protected nx c() {
/*  87 */     nr ☃ = i();
/*  88 */     return new of("gui.narrate.editBox", new Object[] { ☃, this.b });
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/*  92 */     if (!this.C.test(☃)) {
/*     */       return;
/*     */     }
/*     */     
/*  96 */     if (☃.length() > this.c) {
/*  97 */       this.b = ☃.substring(0, this.c);
/*     */     } else {
/*  99 */       this.b = ☃;
/*     */     } 
/*     */     
/* 102 */     l();
/* 103 */     n(this.w);
/* 104 */     d(☃);
/*     */   }
/*     */   
/*     */   public String b() {
/* 108 */     return this.b;
/*     */   }
/*     */   
/*     */   public String d() {
/* 112 */     int ☃ = (this.w < this.x) ? this.w : this.x;
/* 113 */     int i = (this.w < this.x) ? this.x : this.w;
/*     */     
/* 115 */     return this.b.substring(☃, i);
/*     */   }
/*     */   
/*     */   public void a(Predicate<String> ☃) {
/* 119 */     this.C = ☃;
/*     */   }
/*     */   
/*     */   public void b(String ☃) {
/* 123 */     int i = (this.w < this.x) ? this.w : this.x;
/* 124 */     int j = (this.w < this.x) ? this.x : this.w;
/* 125 */     int k = this.c - this.b.length() - i - j;
/*     */     
/* 127 */     String str1 = w.a(☃);
/* 128 */     int m = str1.length();
/* 129 */     if (k < m) {
/* 130 */       str1 = str1.substring(0, k);
/* 131 */       m = k;
/*     */     } 
/*     */     
/* 134 */     String str2 = (new StringBuilder(this.b)).replace(i, j, str1).toString();
/* 135 */     if (!this.C.test(str2)) {
/*     */       return;
/*     */     }
/*     */     
/* 139 */     this.b = str2;
/* 140 */     j(i + m);
/* 141 */     n(this.w);
/*     */     
/* 143 */     d(this.b);
/*     */   }
/*     */   
/*     */   private void d(String ☃) {
/* 147 */     if (this.B != null) {
/* 148 */       this.B.accept(☃);
/*     */     }
/* 150 */     this.r = x.b() + 500L;
/*     */   }
/*     */   
/*     */   private void q(int ☃) {
/* 154 */     if (dot.x()) {
/* 155 */       e(☃);
/*     */     } else {
/* 157 */       f(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void e(int ☃) {
/* 162 */     if (this.b.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/* 166 */     if (this.x != this.w) {
/* 167 */       b("");
/*     */       
/*     */       return;
/*     */     } 
/* 171 */     f(g(☃) - this.w);
/*     */   }
/*     */   
/*     */   public void f(int ☃) {
/* 175 */     if (this.b.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/* 179 */     if (this.x != this.w) {
/* 180 */       b("");
/*     */       
/*     */       return;
/*     */     } 
/* 184 */     int i = r(☃);
/*     */     
/* 186 */     int j = Math.min(i, this.w);
/* 187 */     int k = Math.max(i, this.w);
/* 188 */     if (j == k) {
/*     */       return;
/*     */     }
/*     */     
/* 192 */     String str = (new StringBuilder(this.b)).delete(j, k).toString();
/*     */     
/* 194 */     if (!this.C.test(str)) {
/*     */       return;
/*     */     }
/*     */     
/* 198 */     this.b = str;
/* 199 */     i(j);
/*     */   }
/*     */   
/*     */   public int g(int ☃) {
/* 203 */     return a(☃, n());
/*     */   }
/*     */   
/*     */   private int a(int ☃, int i) {
/* 207 */     return a(☃, i, true);
/*     */   }
/*     */   
/*     */   private int a(int ☃, int i, boolean bool) {
/* 211 */     int j = i;
/* 212 */     boolean bool1 = (☃ < 0);
/* 213 */     int k = Math.abs(☃);
/*     */     
/* 215 */     for (int m = 0; m < k; m++) {
/* 216 */       if (bool1) {
/* 217 */         while (bool && j > 0 && this.b.charAt(j - 1) == ' ') {
/* 218 */           j--;
/*     */         }
/* 220 */         while (j > 0 && this.b.charAt(j - 1) != ' ') {
/* 221 */           j--;
/*     */         }
/*     */       } else {
/* 224 */         int n = this.b.length();
/*     */         
/* 226 */         j = this.b.indexOf(' ', j);
/* 227 */         if (j == -1) {
/* 228 */           j = n;
/*     */         } else {
/* 230 */           while (bool && j < n && this.b.charAt(j) == ' ') {
/* 231 */             j++;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 237 */     return j;
/*     */   }
/*     */   
/*     */   public void h(int ☃) {
/* 241 */     i(r(☃));
/*     */   }
/*     */   
/*     */   private int r(int ☃) {
/* 245 */     return x.a(this.b, this.w, ☃);
/*     */   }
/*     */   
/*     */   public void i(int ☃) {
/* 249 */     j(☃);
/*     */     
/* 251 */     if (!this.u) {
/* 252 */       n(this.w);
/*     */     }
/*     */     
/* 255 */     d(this.b);
/*     */   }
/*     */   
/*     */   public void j(int ☃) {
/* 259 */     this.w = afm.a(☃, 0, this.b.length());
/*     */   }
/*     */   
/*     */   public void k() {
/* 263 */     i(0);
/*     */   }
/*     */   
/*     */   public void l() {
/* 267 */     i(this.b.length());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 272 */     if (!m()) {
/* 273 */       return false;
/*     */     }
/*     */     
/* 276 */     this.u = dot.y();
/*     */     
/* 278 */     if (dot.i(☃)) {
/* 279 */       l();
/* 280 */       n(0);
/* 281 */       return true;
/* 282 */     }  if (dot.h(☃)) {
/* 283 */       (djz.C()).m.a(d());
/* 284 */       return true;
/* 285 */     }  if (dot.g(☃)) {
/* 286 */       if (this.t) {
/* 287 */         b((djz.C()).m.a());
/*     */       }
/* 289 */       return true;
/* 290 */     }  if (dot.f(☃)) {
/* 291 */       (djz.C()).m.a(d());
/* 292 */       if (this.t) {
/* 293 */         b("");
/*     */       }
/* 295 */       return true;
/*     */     } 
/*     */     
/* 298 */     switch (☃) {
/*     */       case 263:
/* 300 */         if (dot.x()) {
/* 301 */           i(g(-1));
/*     */         } else {
/* 303 */           h(-1);
/*     */         } 
/*     */         
/* 306 */         return true;
/*     */       case 262:
/* 308 */         if (dot.x()) {
/* 309 */           i(g(1));
/*     */         } else {
/* 311 */           h(1);
/*     */         } 
/*     */         
/* 314 */         return true;
/*     */       case 259:
/* 316 */         if (this.t) {
/* 317 */           this.u = false;
/* 318 */           q(-1);
/* 319 */           this.u = dot.y();
/*     */         } 
/*     */         
/* 322 */         return true;
/*     */       case 261:
/* 324 */         if (this.t) {
/* 325 */           this.u = false;
/* 326 */           q(1);
/* 327 */           this.u = dot.y();
/*     */         } 
/*     */         
/* 330 */         return true;
/*     */       case 268:
/* 332 */         k();
/*     */         
/* 334 */         return true;
/*     */       case 269:
/* 336 */         l();
/*     */         
/* 338 */         return true;
/*     */     } 
/*     */     
/* 341 */     return false;
/*     */   }
/*     */   
/*     */   public boolean m() {
/* 345 */     return (p() && j() && s());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(char ☃, int i) {
/* 350 */     if (!m()) {
/* 351 */       return false;
/*     */     }
/* 353 */     if (w.a(☃)) {
/* 354 */       if (this.t) {
/* 355 */         b(Character.toString(☃));
/*     */       }
/*     */       
/* 358 */       return true;
/*     */     } 
/*     */     
/* 361 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/* 367 */     if (!p()) {
/* 368 */       return false;
/*     */     }
/*     */     
/* 371 */     boolean bool = (☃ >= this.l && ☃ < (this.l + this.j) && d1 >= this.m && d1 < (this.m + this.k));
/*     */     
/* 373 */     if (this.s) {
/* 374 */       e(bool);
/*     */     }
/*     */     
/* 377 */     if (j() && bool && i == 0) {
/* 378 */       int j = afm.c(☃) - this.l;
/*     */       
/* 380 */       if (this.e) {
/* 381 */         j -= 4;
/*     */       }
/*     */       
/* 384 */       String str = this.a.a(this.b.substring(this.v), o());
/* 385 */       i(this.a.a(str, j).length() + this.v);
/* 386 */       return true;
/*     */     } 
/* 388 */     return false;
/*     */   }
/*     */   
/*     */   public void e(boolean ☃) {
/* 392 */     d(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(dfm ☃, int i, int j, float f) {
/* 397 */     if (!p()) {
/*     */       return;
/*     */     }
/*     */     
/* 401 */     if (r()) {
/* 402 */       int i5 = j() ? -1 : -6250336;
/* 403 */       a(☃, this.l - 1, this.m - 1, this.l + this.j + 1, this.m + this.k + 1, i5);
/* 404 */       a(☃, this.l, this.m, this.l + this.j, this.m + this.k, -16777216);
/*     */     } 
/*     */     
/* 407 */     int k = this.t ? this.y : this.z;
/* 408 */     int m = this.w - this.v;
/* 409 */     int n = this.x - this.v;
/* 410 */     String str = this.a.a(this.b.substring(this.v), o());
/* 411 */     boolean bool1 = (m >= 0 && m <= str.length());
/* 412 */     boolean bool2 = (j() && this.d / 6 % 2 == 0 && bool1);
/* 413 */     int i1 = this.e ? (this.l + 4) : this.l;
/* 414 */     int i2 = this.e ? (this.m + (this.k - 8) / 2) : this.m;
/* 415 */     int i3 = i1;
/*     */     
/* 417 */     if (n > str.length()) {
/* 418 */       n = str.length();
/*     */     }
/*     */     
/* 421 */     if (!str.isEmpty()) {
/* 422 */       String str1 = bool1 ? str.substring(0, m) : str;
/* 423 */       i3 = this.a.a(☃, this.D.apply(str1, Integer.valueOf(this.v)), i3, i2, k);
/*     */     } 
/*     */     
/* 426 */     boolean bool3 = (this.w < this.b.length() || this.b.length() >= q());
/* 427 */     int i4 = i3;
/*     */     
/* 429 */     if (!bool1) {
/* 430 */       i4 = (m > 0) ? (i1 + this.j) : i1;
/* 431 */     } else if (bool3) {
/* 432 */       i4--;
/* 433 */       i3--;
/*     */     } 
/*     */     
/* 436 */     if (!str.isEmpty() && bool1 && m < str.length()) {
/* 437 */       this.a.a(☃, this.D.apply(str.substring(m), Integer.valueOf(this.w)), i3, i2, k);
/*     */     }
/*     */     
/* 440 */     if (!bool3 && this.A != null) {
/* 441 */       this.a.a(☃, this.A, (i4 - 1), i2, -8355712);
/*     */     }
/*     */     
/* 444 */     if (bool2) {
/* 445 */       if (bool3) {
/* 446 */         this.a.getClass(); dkw.a(☃, i4, i2 - 1, i4 + 1, i2 + 1 + 9, -3092272);
/*     */       } else {
/* 448 */         this.a.a(☃, "_", i4, i2, k);
/*     */       } 
/*     */     }
/*     */     
/* 452 */     if (n != m) {
/* 453 */       int i5 = i1 + this.a.b(str.substring(0, n));
/* 454 */       this.a.getClass(); a(i4, i2 - 1, i5 - 1, i2 + 1 + 9);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(int ☃, int i, int j, int k) {
/* 459 */     if (☃ < j) {
/* 460 */       int m = ☃;
/* 461 */       ☃ = j;
/* 462 */       j = m;
/*     */     } 
/* 464 */     if (i < k) {
/* 465 */       int m = i;
/* 466 */       i = k;
/* 467 */       k = m;
/*     */     } 
/*     */     
/* 470 */     if (j > this.l + this.j) {
/* 471 */       j = this.l + this.j;
/*     */     }
/* 473 */     if (☃ > this.l + this.j) {
/* 474 */       ☃ = this.l + this.j;
/*     */     }
/*     */     
/* 477 */     dfo dfo = dfo.a();
/* 478 */     dfh dfh = dfo.c();
/*     */     
/* 480 */     RenderSystem.color4f(0.0F, 0.0F, 255.0F, 255.0F);
/* 481 */     RenderSystem.disableTexture();
/* 482 */     RenderSystem.enableColorLogicOp();
/* 483 */     RenderSystem.logicOp(dem.o.n);
/*     */     
/* 485 */     dfh.a(7, dfk.k);
/* 486 */     dfh.a(☃, k, 0.0D).d();
/* 487 */     dfh.a(j, k, 0.0D).d();
/* 488 */     dfh.a(j, i, 0.0D).d();
/* 489 */     dfh.a(☃, i, 0.0D).d();
/* 490 */     dfo.b();
/*     */     
/* 492 */     RenderSystem.disableColorLogicOp();
/* 493 */     RenderSystem.enableTexture();
/*     */   }
/*     */   
/*     */   public void k(int ☃) {
/* 497 */     this.c = ☃;
/*     */     
/* 499 */     if (this.b.length() > ☃) {
/* 500 */       this.b = this.b.substring(0, ☃);
/* 501 */       d(this.b);
/*     */     } 
/*     */   }
/*     */   
/*     */   private int q() {
/* 506 */     return this.c;
/*     */   }
/*     */   
/*     */   public int n() {
/* 510 */     return this.w;
/*     */   }
/*     */   
/*     */   private boolean r() {
/* 514 */     return this.e;
/*     */   }
/*     */   
/*     */   public void f(boolean ☃) {
/* 518 */     this.e = ☃;
/*     */   }
/*     */   
/*     */   public void l(int ☃) {
/* 522 */     this.y = ☃;
/*     */   }
/*     */   
/*     */   public void m(int ☃) {
/* 526 */     this.z = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c_(boolean ☃) {
/* 531 */     if (!this.p || !this.t) {
/* 532 */       return false;
/*     */     }
/* 534 */     return super.c_(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(double ☃, double d1) {
/* 539 */     return (this.p && ☃ >= this.l && ☃ < (this.l + this.j) && d1 >= this.m && d1 < (this.m + this.k));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void c(boolean ☃) {
/* 544 */     if (☃) {
/* 545 */       this.d = 0;
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean s() {
/* 550 */     return this.t;
/*     */   }
/*     */   
/*     */   public void g(boolean ☃) {
/* 554 */     this.t = ☃;
/*     */   }
/*     */   
/*     */   public int o() {
/* 558 */     return r() ? (this.j - 8) : this.j;
/*     */   }
/*     */   
/*     */   public void n(int ☃) {
/* 562 */     int i = this.b.length();
/*     */     
/* 564 */     this.x = afm.a(☃, 0, i);
/*     */     
/* 566 */     if (this.a != null) {
/* 567 */       if (this.v > i) {
/* 568 */         this.v = i;
/*     */       }
/* 570 */       int j = o();
/* 571 */       String str = this.a.a(this.b.substring(this.v), j);
/* 572 */       int k = str.length() + this.v;
/*     */       
/* 574 */       if (this.x == this.v) {
/* 575 */         this.v -= this.a.a(this.b, j, true).length();
/*     */       }
/* 577 */       if (this.x > k) {
/* 578 */         this.v += this.x - k;
/* 579 */       } else if (this.x <= this.v) {
/* 580 */         this.v -= this.v - this.x;
/*     */       } 
/*     */       
/* 583 */       this.v = afm.a(this.v, 0, i);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void h(boolean ☃) {
/* 588 */     this.s = ☃;
/*     */   }
/*     */   
/*     */   public boolean p() {
/* 592 */     return this.p;
/*     */   }
/*     */   
/*     */   public void i(boolean ☃) {
/* 596 */     this.p = ☃;
/*     */   }
/*     */   
/*     */   public void c(@Nullable String ☃) {
/* 600 */     this.A = ☃;
/*     */   }
/*     */   
/*     */   public int o(int ☃) {
/* 604 */     if (☃ > this.b.length()) {
/* 605 */       return this.l;
/*     */     }
/* 607 */     return this.l + this.a.b(this.b.substring(0, ☃));
/*     */   }
/*     */   
/*     */   public void p(int ☃) {
/* 611 */     this.l = ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dlq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */