/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import it.unimi.dsi.fastutil.ints.IntArrayList;
/*     */ import it.unimi.dsi.fastutil.ints.IntList;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.StringUtils;
/*     */ import org.apache.commons.lang3.mutable.MutableBoolean;
/*     */ import org.apache.commons.lang3.mutable.MutableInt;
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
/*     */ public class dpu
/*     */   extends dot
/*     */ {
/*  57 */   private static final nr a = new of("book.editTitle");
/*  58 */   private static final nr b = new of("book.finalizeWarning");
/*  59 */   private static final afa c = afa.a("_", ob.a.a(k.a));
/*  60 */   private static final afa p = afa.a("_", ob.a.a(k.h));
/*     */   
/*     */   private final bfw q;
/*     */   
/*     */   private final bmb r;
/*     */   
/*     */   private boolean s;
/*     */   private boolean t;
/*     */   private int u;
/*     */   private int v;
/*  70 */   private final List<String> w = Lists.newArrayList();
/*  71 */   private String x = "";
/*     */ 
/*     */   
/*     */   private final dmy y;
/*     */ 
/*     */   
/*     */   private final dmy z;
/*     */   
/*     */   private long A;
/*     */   
/*     */   private int B;
/*     */   
/*     */   private dqt C;
/*     */   
/*     */   private dqt D;
/*     */   
/*     */   private dlj E;
/*     */   
/*     */   private dlj F;
/*     */   
/*     */   private dlj G;
/*     */   
/*     */   private dlj H;
/*     */   
/*     */   private final aot I;
/*     */   
/*     */   @Nullable
/*     */   private a J;
/*     */   
/*     */   private nr K;
/*     */   
/*     */   private final nr L;
/*     */ 
/*     */   
/*     */   public dpu(bfw ☃, bmb bmb1, aot aot1) {
/* 106 */     super(dkz.a); this.y = new dmy(this::u, this::c, this::h, this::b, ☃ -> (☃.length() < 1024 && this.o.b(☃, 114) <= 128)); this.z = new dmy(() -> this.x, ☃ -> this.x = ☃, this::h, this::b, ☃ -> (☃.length() < 16)); this.B = -1; this.J = a.a(); this.K = oe.d;
/* 107 */     this.q = ☃;
/* 108 */     this.r = bmb1;
/* 109 */     this.I = aot1;
/*     */     
/* 111 */     md md = bmb1.o();
/* 112 */     if (md != null) {
/* 113 */       mj mj = md.d("pages", 8).d();
/* 114 */       for (int i = 0; i < mj.size(); i++) {
/* 115 */         this.w.add(mj.j(i));
/*     */       }
/*     */     } 
/*     */     
/* 119 */     if (this.w.isEmpty()) {
/* 120 */       this.w.add("");
/*     */     }
/*     */     
/* 123 */     this.L = (new of("book.byAuthor", new Object[] { ☃.R() })).a(k.i);
/*     */   }
/*     */   
/*     */   private void b(String ☃) {
/* 127 */     if (this.i != null) {
/* 128 */       dmy.a(this.i, ☃);
/*     */     }
/*     */   }
/*     */   
/*     */   private String h() {
/* 133 */     return (this.i != null) ? dmy.b(this.i) : "";
/*     */   }
/*     */   
/*     */   private int i() {
/* 137 */     return this.w.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/* 142 */     super.d();
/* 143 */     this.u++;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/* 148 */     B();
/* 149 */     this.i.m.a(true);
/*     */     
/* 151 */     this.F = a(new dlj(this.k / 2 - 100, 196, 98, 20, new of("book.signButton"), ☃ -> {
/*     */             this.t = true;
/*     */             m();
/*     */           }));
/* 155 */     this.E = a(new dlj(this.k / 2 + 2, 196, 98, 20, nq.c, ☃ -> {
/*     */             this.i.a((dot)null);
/*     */             
/*     */             c(false);
/*     */           }));
/* 160 */     this.G = a(new dlj(this.k / 2 - 100, 196, 98, 20, new of("book.finalizeButton"), ☃ -> {
/*     */             if (this.t) {
/*     */               c(true);
/*     */               this.i.a((dot)null);
/*     */             } 
/*     */           }));
/* 166 */     this.H = a(new dlj(this.k / 2 + 2, 196, 98, 20, nq.d, ☃ -> {
/*     */             if (this.t) {
/*     */               this.t = false;
/*     */             }
/*     */             
/*     */             m();
/*     */           }));
/* 173 */     int ☃ = (this.k - 192) / 2;
/* 174 */     int i = 2;
/*     */     
/* 176 */     this.C = a(new dqt(☃ + 116, 159, true, ☃ -> l(), true));
/* 177 */     this.D = a(new dqt(☃ + 43, 159, false, ☃ -> k(), true));
/*     */     
/* 179 */     m();
/*     */   }
/*     */   
/*     */   private void k() {
/* 183 */     if (this.v > 0) {
/* 184 */       this.v--;
/*     */     }
/* 186 */     m();
/* 187 */     C();
/*     */   }
/*     */   
/*     */   private void l() {
/* 191 */     if (this.v < i() - 1) {
/* 192 */       this.v++;
/*     */     } else {
/* 194 */       o();
/* 195 */       if (this.v < i() - 1) {
/* 196 */         this.v++;
/*     */       }
/*     */     } 
/* 199 */     m();
/* 200 */     C();
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 205 */     this.i.m.a(false);
/*     */   }
/*     */   
/*     */   private void m() {
/* 209 */     this.D.p = (!this.t && this.v > 0);
/* 210 */     this.C.p = !this.t;
/*     */     
/* 212 */     this.E.p = !this.t;
/* 213 */     this.F.p = !this.t;
/* 214 */     this.H.p = this.t;
/* 215 */     this.G.p = this.t;
/* 216 */     this.G.o = !this.x.trim().isEmpty();
/*     */   }
/*     */   
/*     */   private void n() {
/* 220 */     ListIterator<String> ☃ = this.w.listIterator(this.w.size());
/* 221 */     while (☃.hasPrevious() && ((String)☃.previous()).isEmpty()) {
/* 222 */       ☃.remove();
/*     */     }
/*     */   }
/*     */   
/*     */   private void c(boolean ☃) {
/* 227 */     if (!this.s) {
/*     */       return;
/*     */     }
/*     */     
/* 231 */     n();
/*     */     
/* 233 */     mj mj = new mj();
/* 234 */     this.w.stream().map(ms::a).forEach(mj::add);
/* 235 */     if (!this.w.isEmpty()) {
/* 236 */       this.r.a("pages", mj);
/*     */     }
/*     */     
/* 239 */     if (☃) {
/* 240 */       this.r.a("author", ms.a(this.q.eA().getName()));
/* 241 */       this.r.a("title", ms.a(this.x.trim()));
/*     */     } 
/*     */     
/* 244 */     int i = (this.I == aot.a) ? this.q.bm.d : 40;
/* 245 */     this.i.w().a(new sn(this.r, ☃, i));
/*     */   }
/*     */   
/*     */   private void o() {
/* 249 */     if (i() >= 100) {
/*     */       return;
/*     */     }
/* 252 */     this.w.add("");
/* 253 */     this.s = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 258 */     if (super.a(☃, i, j)) {
/* 259 */       return true;
/*     */     }
/*     */     
/* 262 */     if (this.t) {
/* 263 */       return d(☃, i, j);
/*     */     }
/* 265 */     boolean bool = c(☃, i, j);
/* 266 */     if (bool) {
/* 267 */       B();
/* 268 */       return true;
/*     */     } 
/* 270 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(char ☃, int i) {
/* 276 */     if (super.a(☃, i)) {
/* 277 */       return true;
/*     */     }
/*     */     
/* 280 */     if (this.t) {
/* 281 */       boolean bool = this.z.a(☃);
/* 282 */       if (bool) {
/* 283 */         m();
/* 284 */         this.s = true;
/* 285 */         return true;
/*     */       } 
/* 287 */       return false;
/*     */     } 
/* 289 */     if (w.a(☃)) {
/* 290 */       this.y.a(Character.toString(☃));
/* 291 */       B();
/* 292 */       return true;
/*     */     } 
/* 294 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean c(int ☃, int i, int j) {
/* 300 */     if (dot.i(☃)) {
/* 301 */       this.y.d();
/* 302 */       return true;
/* 303 */     }  if (dot.h(☃)) {
/* 304 */       this.y.c();
/* 305 */       return true;
/* 306 */     }  if (dot.g(☃)) {
/* 307 */       this.y.b();
/* 308 */       return true;
/* 309 */     }  if (dot.f(☃)) {
/* 310 */       this.y.a();
/* 311 */       return true;
/*     */     } 
/*     */     
/* 314 */     switch (☃) {
/*     */       case 259:
/* 316 */         this.y.d(-1);
/* 317 */         return true;
/*     */       case 261:
/* 319 */         this.y.d(1);
/* 320 */         return true;
/*     */       case 257:
/*     */       case 335:
/* 323 */         this.y.a("\n");
/* 324 */         return true;
/*     */       case 263:
/* 326 */         this.y.a(-1, dot.y());
/* 327 */         return true;
/*     */       case 262:
/* 329 */         this.y.a(1, dot.y());
/* 330 */         return true;
/*     */       case 265:
/* 332 */         p();
/* 333 */         return true;
/*     */       case 264:
/* 335 */         q();
/* 336 */         return true;
/*     */       case 266:
/* 338 */         this.D.b();
/* 339 */         return true;
/*     */       case 267:
/* 341 */         this.C.b();
/* 342 */         return true;
/*     */       case 268:
/* 344 */         r();
/* 345 */         return true;
/*     */       case 269:
/* 347 */         t();
/* 348 */         return true;
/*     */     } 
/*     */ 
/*     */     
/* 352 */     return false;
/*     */   }
/*     */   
/*     */   private void p() {
/* 356 */     a(-1);
/*     */   }
/*     */   
/*     */   private void q() {
/* 360 */     a(1);
/*     */   }
/*     */   
/*     */   private void a(int ☃) {
/* 364 */     int i = this.y.g();
/* 365 */     int j = A().a(i, ☃);
/* 366 */     this.y.c(j, dot.y());
/*     */   }
/*     */   
/*     */   private void r() {
/* 370 */     int ☃ = this.y.g();
/* 371 */     int i = A().a(☃);
/* 372 */     this.y.c(i, dot.y());
/*     */   }
/*     */   
/*     */   private void t() {
/* 376 */     a ☃ = A();
/* 377 */     int i = this.y.g();
/* 378 */     int j = ☃.b(i);
/* 379 */     this.y.c(j, dot.y());
/*     */   }
/*     */   
/*     */   private boolean d(int ☃, int i, int j) {
/* 383 */     switch (☃) {
/*     */       case 259:
/* 385 */         this.z.d(-1);
/* 386 */         m();
/* 387 */         this.s = true;
/* 388 */         return true;
/*     */       case 257:
/*     */       case 335:
/* 391 */         if (!this.x.isEmpty()) {
/* 392 */           c(true);
/* 393 */           this.i.a((dot)null);
/*     */         } 
/* 395 */         return true;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 400 */     return false;
/*     */   }
/*     */   
/*     */   private String u() {
/* 404 */     if (this.v >= 0 && this.v < this.w.size()) {
/* 405 */       return this.w.get(this.v);
/*     */     }
/* 407 */     return "";
/*     */   }
/*     */   
/*     */   private void c(String ☃) {
/* 411 */     if (this.v >= 0 && this.v < this.w.size()) {
/* 412 */       this.w.set(this.v, ☃);
/* 413 */       this.s = true;
/* 414 */       B();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 420 */     a(☃);
/*     */ 
/*     */     
/* 423 */     a((dmi)null);
/*     */     
/* 425 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 426 */     this.i.M().a(dpv.b);
/* 427 */     int k = (this.k - 192) / 2;
/* 428 */     int m = 2;
/* 429 */     b(☃, k, 2, 0, 0, 192, 192);
/*     */     
/* 431 */     if (this.t) {
/* 432 */       boolean bool = (this.u / 6 % 2 == 0);
/* 433 */       afa afa1 = afa.a(afa.a(this.x, ob.a), bool ? c : p);
/*     */       
/* 435 */       int n = this.o.a(a);
/* 436 */       this.o.b(☃, a, (k + 36 + (114 - n) / 2), 34.0F, 0);
/*     */       
/* 438 */       int i1 = this.o.a(afa1);
/* 439 */       this.o.b(☃, afa1, (k + 36 + (114 - i1) / 2), 50.0F, 0);
/* 440 */       int i2 = this.o.a(this.L);
/* 441 */       this.o.b(☃, this.L, (k + 36 + (114 - i2) / 2), 60.0F, 0);
/*     */       
/* 443 */       this.o.a(b, k + 36, 82, 114, 0);
/*     */     } else {
/* 445 */       int n = this.o.a(this.K);
/* 446 */       this.o.b(☃, this.K, (k - n + 192 - 44), 18.0F, 0);
/*     */       
/* 448 */       a a1 = A();
/* 449 */       for (b b : a.a(a1)) {
/* 450 */         this.o.b(☃, b.a(b), b.b(b), b.c(b), -16777216);
/*     */       }
/* 452 */       a(a.b(a1));
/* 453 */       a(☃, a.c(a1), a.d(a1));
/*     */     } 
/*     */     
/* 456 */     super.a(☃, i, j, f);
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, c c1, boolean bool) {
/* 460 */     if (this.u / 6 % 2 == 0) {
/* 461 */       c1 = b(c1);
/* 462 */       if (!bool) {
/* 463 */         this.o.getClass(); dkw.a(☃, c1.a, c1.b - 1, c1.a + 1, c1.b + 9, -16777216);
/*     */       } else {
/* 465 */         this.o.b(☃, "_", c1.a, c1.b, 0);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(eal[] ☃) {
/* 471 */     dfo dfo = dfo.a();
/* 472 */     dfh dfh = dfo.c();
/*     */     
/* 474 */     RenderSystem.color4f(0.0F, 0.0F, 255.0F, 255.0F);
/* 475 */     RenderSystem.disableTexture();
/* 476 */     RenderSystem.enableColorLogicOp();
/* 477 */     RenderSystem.logicOp(dem.o.n);
/*     */     
/* 479 */     dfh.a(7, dfk.k);
/*     */     
/* 481 */     for (eal eal1 : ☃) {
/* 482 */       int i = eal1.a();
/* 483 */       int j = eal1.b();
/* 484 */       int k = i + eal1.c();
/* 485 */       int m = j + eal1.d();
/* 486 */       dfh.a(i, m, 0.0D).d();
/* 487 */       dfh.a(k, m, 0.0D).d();
/* 488 */       dfh.a(k, j, 0.0D).d();
/* 489 */       dfh.a(i, j, 0.0D).d();
/*     */     } 
/*     */     
/* 492 */     dfo.b();
/*     */     
/* 494 */     RenderSystem.disableColorLogicOp();
/* 495 */     RenderSystem.enableTexture();
/*     */   }
/*     */   
/*     */   private c a(c ☃) {
/* 499 */     return new c(☃.a - (this.k - 192) / 2 - 36, ☃.b - 32);
/*     */   }
/*     */   
/*     */   private c b(c ☃) {
/* 503 */     return new c(☃.a + (this.k - 192) / 2 + 36, ☃.b + 32);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/* 508 */     if (super.a(☃, d1, i)) {
/* 509 */       return true;
/*     */     }
/*     */     
/* 512 */     if (i == 0) {
/* 513 */       long l = x.b();
/*     */       
/* 515 */       a a1 = A();
/* 516 */       int j = a1.a(this.o, a(new c((int)☃, (int)d1)));
/* 517 */       if (j >= 0) {
/* 518 */         if (j == this.B && l - this.A < 250L) {
/* 519 */           if (!this.y.i()) {
/* 520 */             b(j);
/*     */           } else {
/* 522 */             this.y.d();
/*     */           } 
/*     */         } else {
/* 525 */           this.y.c(j, dot.y());
/*     */         } 
/* 527 */         B();
/*     */       } 
/* 529 */       this.B = j;
/* 530 */       this.A = l;
/*     */     } 
/*     */     
/* 533 */     return true;
/*     */   }
/*     */   
/*     */   private void b(int ☃) {
/* 537 */     String str = u();
/* 538 */     this.y.a(
/* 539 */         dkj.a(str, -1, ☃, false), 
/* 540 */         dkj.a(str, 1, ☃, false));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i, double d2, double d3) {
/* 546 */     if (super.a(☃, d1, i, d2, d3)) {
/* 547 */       return true;
/*     */     }
/*     */     
/* 550 */     if (i == 0) {
/* 551 */       a a1 = A();
/* 552 */       int j = a1.a(this.o, a(new c((int)☃, (int)d1)));
/* 553 */       this.y.c(j, true);
/* 554 */       B();
/*     */     } 
/* 556 */     return true;
/*     */   }
/*     */   
/*     */   private a A() {
/* 560 */     if (this.J == null) {
/* 561 */       this.J = D();
/* 562 */       this.K = new of("book.pageIndicator", new Object[] { Integer.valueOf(this.v + 1), Integer.valueOf(i()) });
/*     */     } 
/*     */     
/* 565 */     return this.J;
/*     */   }
/*     */   
/*     */   private void B() {
/* 569 */     this.J = null;
/*     */   }
/*     */   
/*     */   private void C() {
/* 573 */     this.y.f();
/* 574 */     B();
/*     */   }
/*     */   private a D() {
/*     */     c c;
/* 578 */     String ☃ = u();
/* 579 */     if (☃.isEmpty()) {
/* 580 */       return a.a();
/*     */     }
/* 582 */     int i = this.y.g();
/* 583 */     int j = this.y.h();
/*     */     
/* 585 */     IntArrayList intArrayList = new IntArrayList();
/* 586 */     List<b> list = Lists.newArrayList();
/* 587 */     MutableInt mutableInt = new MutableInt();
/* 588 */     MutableBoolean mutableBoolean = new MutableBoolean();
/* 589 */     dkj dkj = this.o.b();
/* 590 */     dkj.a(☃, 114, ob.a, true, (ob1, i, j) -> {
/*     */           int k = ☃.getAndIncrement();
/*     */           String str1 = str.substring(i, j);
/*     */           mutableBoolean.setValue(str1.endsWith("\n"));
/*     */           String str2 = StringUtils.stripEnd(str1, " \n");
/*     */           this.o.getClass();
/*     */           int m = k * 9;
/*     */           c c = b(new c(0, m));
/*     */           intList.add(i);
/*     */           list.add(new b(ob1, str2, c.a, c.b));
/*     */         });
/* 601 */     int[] arrayOfInt = intArrayList.toIntArray();
/*     */     
/* 603 */     boolean bool = (i == ☃.length());
/*     */ 
/*     */     
/* 606 */     if (bool && mutableBoolean.isTrue()) {
/* 607 */       this.o.getClass(); c = new c(0, list.size() * 9);
/*     */     } else {
/* 609 */       int k = b(arrayOfInt, i);
/* 610 */       int m = this.o.b(☃.substring(arrayOfInt[k], i));
/* 611 */       this.o.getClass(); c = new c(m, k * 9);
/*     */     } 
/*     */     
/* 614 */     List<eal> list1 = Lists.newArrayList();
/*     */     
/* 616 */     if (i != j) {
/* 617 */       int k = Math.min(i, j);
/* 618 */       int m = Math.max(i, j);
/*     */       
/* 620 */       int n = b(arrayOfInt, k);
/* 621 */       int i1 = b(arrayOfInt, m);
/* 622 */       if (n == i1) {
/* 623 */         this.o.getClass(); int i2 = n * 9;
/* 624 */         int i3 = arrayOfInt[n];
/* 625 */         list1.add(a(☃, dkj, k, m, i2, i3));
/*     */       } else {
/* 627 */         int i2 = (n + 1 > arrayOfInt.length) ? ☃.length() : arrayOfInt[n + 1];
/* 628 */         this.o.getClass(); list1.add(a(☃, dkj, k, i2, n * 9, arrayOfInt[n]));
/* 629 */         for (int i3 = n + 1; i3 < i1; i3++) {
/* 630 */           this.o.getClass(); int i4 = i3 * 9;
/* 631 */           String str = ☃.substring(arrayOfInt[i3], arrayOfInt[i3 + 1]);
/* 632 */           int i5 = (int)dkj.a(str);
/* 633 */           this.o.getClass(); list1.add(a(new c(0, i4), new c(i5, i4 + 9)));
/*     */         } 
/* 635 */         this.o.getClass(); list1.add(a(☃, dkj, arrayOfInt[i1], m, i1 * 9, arrayOfInt[i1]));
/*     */       } 
/*     */     } 
/*     */     
/* 639 */     return new a(☃, c, bool, arrayOfInt, list.<b>toArray(new b[0]), list1.<eal>toArray(new eal[0]));
/*     */   }
/*     */   
/*     */   private static int b(int[] ☃, int i) {
/* 643 */     int j = Arrays.binarySearch(☃, i);
/* 644 */     if (j < 0) {
/* 645 */       return -(j + 2);
/*     */     }
/* 647 */     return j;
/*     */   }
/*     */ 
/*     */   
/*     */   private eal a(String ☃, dkj dkj1, int i, int j, int k, int m) {
/* 652 */     String str1 = ☃.substring(m, i);
/* 653 */     String str2 = ☃.substring(m, j);
/*     */     
/* 655 */     c c1 = new c((int)dkj1.a(str1), k);
/* 656 */     this.o.getClass(); c c2 = new c((int)dkj1.a(str2), k + 9);
/*     */     
/* 658 */     return a(c1, c2);
/*     */   }
/*     */   
/*     */   private eal a(c ☃, c c1) {
/* 662 */     c c2 = b(☃);
/* 663 */     c c3 = b(c1);
/*     */     
/* 665 */     int i = Math.min(c2.a, c3.a);
/* 666 */     int j = Math.max(c2.a, c3.a);
/*     */     
/* 668 */     int k = Math.min(c2.b, c3.b);
/* 669 */     int m = Math.max(c2.b, c3.b);
/*     */     
/* 671 */     return new eal(i, k, j - i, m - k);
/*     */   }
/*     */   
/*     */   static class c {
/*     */     public final int a;
/*     */     public final int b;
/*     */     
/*     */     c(int ☃, int i) {
/* 679 */       this.a = ☃;
/* 680 */       this.b = i;
/*     */     }
/*     */   }
/*     */   
/*     */   static class b {
/*     */     private final ob a;
/*     */     private final String b;
/*     */     private final nr c;
/*     */     private final int d;
/*     */     private final int e;
/*     */     
/*     */     public b(ob ☃, String str, int i, int j) {
/* 692 */       this.a = ☃;
/* 693 */       this.b = str;
/* 694 */       this.d = i;
/* 695 */       this.e = j;
/* 696 */       this.c = (new oe(str)).a(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/* 701 */     private static final a a = new a("", new dpu.c(0, 0), true, new int[] { 0 }, new dpu.b[] { new dpu.b(ob.a, "", 0, 0) }new eal[0]);
/*     */     
/*     */     private final String b;
/*     */     
/*     */     private final dpu.c c;
/*     */     private final boolean d;
/*     */     private final int[] e;
/*     */     private final dpu.b[] f;
/*     */     private final eal[] g;
/*     */     
/*     */     public a(String ☃, dpu.c c1, boolean bool, int[] arrayOfInt, dpu.b[] arrayOfB, eal[] arrayOfEal) {
/* 712 */       this.b = ☃;
/* 713 */       this.c = c1;
/* 714 */       this.d = bool;
/* 715 */       this.e = arrayOfInt;
/* 716 */       this.f = arrayOfB;
/* 717 */       this.g = arrayOfEal;
/*     */     }
/*     */     
/*     */     public int a(dku ☃, dpu.c c1) {
/* 721 */       ☃.getClass(); int i = c1.b / 9;
/* 722 */       if (i < 0) {
/* 723 */         return 0;
/*     */       }
/* 725 */       if (i >= this.f.length) {
/* 726 */         return this.b.length();
/*     */       }
/* 728 */       dpu.b b1 = this.f[i];
/* 729 */       return this.e[i] + ☃.b().a(dpu.b.d(b1), c1.a, dpu.b.e(b1));
/*     */     }
/*     */     
/*     */     public int a(int ☃, int i) {
/* 733 */       int m, j = dpu.a(this.e, ☃);
/* 734 */       int k = j + i;
/*     */       
/* 736 */       if (0 <= k && k < this.e.length) {
/* 737 */         int n = ☃ - this.e[j];
/* 738 */         int i1 = dpu.b.d(this.f[k]).length();
/* 739 */         m = this.e[k] + Math.min(n, i1);
/*     */       } else {
/* 741 */         m = ☃;
/*     */       } 
/* 743 */       return m;
/*     */     }
/*     */     
/*     */     public int a(int ☃) {
/* 747 */       int i = dpu.a(this.e, ☃);
/* 748 */       return this.e[i];
/*     */     }
/*     */     
/*     */     public int b(int ☃) {
/* 752 */       int i = dpu.a(this.e, ☃);
/* 753 */       return this.e[i] + dpu.b.d(this.f[i]).length();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dpu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */