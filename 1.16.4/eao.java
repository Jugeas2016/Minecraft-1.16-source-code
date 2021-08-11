/*     */ import com.google.common.collect.ImmutableList;
/*     */ import it.unimi.dsi.fastutil.Hash;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.OptionalDouble;
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
/*     */ public abstract class eao
/*     */   extends ean
/*     */ {
/*     */   enum c
/*     */   {
/*  23 */     a("none"),
/*  24 */     b("is_outline"),
/*  25 */     c("affects_outline");
/*     */     
/*     */     private final String d;
/*     */ 
/*     */     
/*     */     c(String ☃) {
/*  31 */       this.d = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/*  36 */       return this.d;
/*     */     }
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
/*  49 */   private static final eao W = a("solid", dfk.h, 7, 2097152, true, false, b.a()
/*  50 */       .a(l)
/*  51 */       .a(t)
/*  52 */       .a(m)
/*  53 */       .a(true));
/*     */   
/*     */   public static eao c() {
/*  56 */     return W;
/*     */   }
/*     */   
/*  59 */   private static final eao X = a("cutout_mipped", dfk.h, 7, 131072, true, false, b.a()
/*  60 */       .a(l)
/*  61 */       .a(t)
/*  62 */       .a(m)
/*  63 */       .a(j)
/*  64 */       .a(true));
/*     */   
/*     */   public static eao d() {
/*  67 */     return X;
/*     */   }
/*     */   
/*  70 */   private static final eao Y = a("cutout", dfk.h, 7, 131072, true, false, b.a()
/*  71 */       .a(l)
/*  72 */       .a(t)
/*  73 */       .a(n)
/*  74 */       .a(j)
/*  75 */       .a(true));
/*     */   
/*     */   public static eao e() {
/*  78 */     return Y;
/*     */   }
/*     */   
/*     */   private static b C() {
/*  82 */     return b.a()
/*  83 */       .a(l)
/*  84 */       .a(t)
/*  85 */       .a(m)
/*  86 */       .a(g)
/*  87 */       .a(P)
/*  88 */       .a(true);
/*     */   }
/*     */   
/*  91 */   private static final eao Z = a("translucent", dfk.h, 7, 262144, true, true, C());
/*     */   
/*     */   public static eao f() {
/*  94 */     return Z;
/*     */   }
/*     */   
/*     */   private static b D() {
/*  98 */     return b.a()
/*  99 */       .a(l)
/* 100 */       .a(t)
/* 101 */       .a(m)
/* 102 */       .a(g)
/* 103 */       .a(T)
/* 104 */       .a(true);
/*     */   }
/*     */   
/* 107 */   private static final eao aa = a("translucent_moving_block", dfk.h, 7, 262144, false, true, D());
/*     */   
/*     */   public static eao g() {
/* 110 */     return aa;
/*     */   }
/*     */   
/* 113 */   private static final eao ab = a("translucent_no_crumbling", dfk.h, 7, 262144, false, true, C());
/*     */   
/*     */   public static eao h() {
/* 116 */     return ab;
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
/*     */   public static eao a(vk ☃) {
/* 129 */     b b = b.a().a(new ean.o(☃, false, false)).a(b).a(x).a(i).a(A).a(t).a(v).a(J).a(true);
/*     */     
/* 131 */     return a("armor_cutout_no_cull", dfk.i, 7, 256, true, false, b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static eao b(vk ☃) {
/* 141 */     b b = b.a().a(new ean.o(☃, false, false)).a(b).a(x).a(t).a(v).a(true);
/*     */     
/* 143 */     return a("entity_solid", dfk.i, 7, 256, true, false, b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static eao c(vk ☃) {
/* 154 */     b b = b.a().a(new ean.o(☃, false, false)).a(b).a(x).a(i).a(t).a(v).a(true);
/*     */     
/* 156 */     return a("entity_cutout", dfk.i, 7, 256, true, false, b);
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
/*     */   public static eao a(vk ☃, boolean bool) {
/* 168 */     b b = b.a().a(new ean.o(☃, false, false)).a(b).a(x).a(i).a(A).a(t).a(v).a(bool);
/*     */     
/* 170 */     return a("entity_cutout_no_cull", dfk.i, 7, 256, true, false, b);
/*     */   }
/*     */   
/*     */   public static eao d(vk ☃) {
/* 174 */     return a(☃, true);
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
/*     */   public static eao b(vk ☃, boolean bool) {
/* 187 */     b b = b.a().a(new ean.o(☃, false, false)).a(b).a(x).a(i).a(A).a(t).a(v).a(J).a(bool);
/*     */     
/* 189 */     return a("entity_cutout_no_cull_z_offset", dfk.i, 7, 256, true, false, b);
/*     */   }
/*     */   
/*     */   public static eao e(vk ☃) {
/* 193 */     return b(☃, true);
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
/*     */   public static eao f(vk ☃) {
/* 206 */     b b = b.a().a(new ean.o(☃, false, false)).a(g).a(T).a(x).a(i).a(t).a(v).a(ean.E).a(true);
/*     */     
/* 208 */     return a("item_entity_translucent_cull", dfk.i, 7, 256, true, true, b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static eao g(vk ☃) {
/* 219 */     b b = b.a().a(new ean.o(☃, false, false)).a(g).a(x).a(i).a(t).a(v).a(true);
/*     */     
/* 221 */     return a("entity_translucent_cull", dfk.i, 7, 256, true, true, b);
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
/*     */   public static eao c(vk ☃, boolean bool) {
/* 233 */     b b = b.a().a(new ean.o(☃, false, false)).a(g).a(x).a(i).a(A).a(t).a(v).a(bool);
/*     */     
/* 235 */     return a("entity_translucent", dfk.i, 7, 256, true, true, b);
/*     */   }
/*     */   
/*     */   public static eao h(vk ☃) {
/* 239 */     return c(☃, true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static eao i(vk ☃) {
/* 250 */     b b = b.a().a(new ean.o(☃, false, false)).a(j).a(x).a(l).a(A).a(t).a(true);
/*     */     
/* 252 */     return a("entity_smooth_cutout", dfk.i, 7, 256, b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static eao d(vk ☃, boolean bool) {
/* 261 */     b b = b.a().a(new ean.o(☃, false, false)).a(bool ? g : b).a(bool ? F : E).a(K).a(false);
/*     */     
/* 263 */     return a("beacon_beam", dfk.h, 7, 256, false, true, b);
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
/*     */   public static eao j(vk ☃) {
/* 275 */     b b = b.a().a(new ean.o(☃, false, false)).a(x).a(i).a(C).a(A).a(t).a(v).a(false);
/*     */     
/* 277 */     return a("entity_decal", dfk.i, 7, 256, b);
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
/*     */   public static eao k(vk ☃) {
/* 290 */     b b = b.a().a(new ean.o(☃, false, false)).a(g).a(x).a(i).a(A).a(t).a(v).a(F).a(false);
/*     */     
/* 292 */     return a("entity_no_outline", dfk.i, 7, 256, false, true, b);
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
/*     */   public static eao l(vk ☃) {
/* 307 */     b b = b.a().a(new ean.o(☃, false, false)).a(g).a(x).a(i).a(z).a(t).a(v).a(F).a(D).a(J).a(false);
/*     */     
/* 309 */     return a("entity_shadow", dfk.i, 7, 256, false, false, b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static eao a(vk ☃, float f) {
/* 317 */     b b = b.a().a(new ean.o(☃, false, false)).a(new ean.a(f)).a(A).a(true);
/*     */     
/* 319 */     return a("entity_alpha", dfk.i, 7, 256, b);
/*     */   }
/*     */   
/*     */   public static eao m(vk ☃) {
/* 323 */     ean.o o = new ean.o(☃, false, false);
/* 324 */     return a("eyes", dfk.i, 7, 256, false, true, b.a()
/* 325 */         .a(o)
/* 326 */         .a(c)
/* 327 */         .a(F)
/* 328 */         .a(M)
/* 329 */         .a(false));
/*     */   }
/*     */   
/*     */   public static eao a(vk ☃, float f1, float f2) {
/* 333 */     return a("energy_swirl", dfk.i, 7, 256, false, true, b.a()
/* 334 */         .a(new ean.o(☃, false, false))
/* 335 */         .a(new ean.j(f1, f2))
/* 336 */         .a(M)
/* 337 */         .a(c)
/* 338 */         .a(x)
/* 339 */         .a(i)
/* 340 */         .a(A)
/* 341 */         .a(t)
/* 342 */         .a(v)
/* 343 */         .a(false));
/*     */   }
/*     */   
/* 346 */   private static final eao ac = a("leash", dfk.m, 7, 256, b.a()
/* 347 */       .a(o)
/* 348 */       .a(A)
/* 349 */       .a(t)
/* 350 */       .a(false));
/*     */   
/*     */   public static eao i() {
/* 353 */     return ac;
/*     */   }
/*     */   
/* 356 */   private static final eao ad = a("water_mask", dfk.k, 7, 256, b.a()
/* 357 */       .a(o)
/* 358 */       .a(G)
/* 359 */       .a(false));
/*     */   
/*     */   public static eao j() {
/* 362 */     return ad;
/*     */   }
/*     */   
/*     */   public static eao n(vk ☃) {
/* 366 */     return a(☃, A);
/*     */   }
/*     */   
/*     */   public static eao a(vk ☃, ean.c c1) {
/* 370 */     return a("outline", dfk.o, 7, 256, b.a()
/* 371 */         .a(new ean.o(☃, false, false))
/* 372 */         .a(c1)
/* 373 */         .a(B)
/* 374 */         .a(i)
/* 375 */         .a(q)
/* 376 */         .a(K)
/* 377 */         .a(O)
/* 378 */         .a(c.b));
/*     */   }
/*     */   
/* 381 */   private static final eao ae = a("armor_glint", dfk.n, 7, 256, b.a()
/* 382 */       .a(new ean.o(efo.a, true, false))
/* 383 */       .a(F)
/* 384 */       .a(A)
/* 385 */       .a(C)
/* 386 */       .a(e)
/* 387 */       .a(r)
/* 388 */       .a(J)
/* 389 */       .a(false));
/*     */   
/*     */   public static eao k() {
/* 392 */     return ae;
/*     */   }
/*     */   
/* 395 */   private static final eao af = a("armor_entity_glint", dfk.n, 7, 256, b.a()
/* 396 */       .a(new ean.o(efo.a, true, false))
/* 397 */       .a(F)
/* 398 */       .a(A)
/* 399 */       .a(C)
/* 400 */       .a(e)
/* 401 */       .a(s)
/* 402 */       .a(J)
/* 403 */       .a(false));
/*     */   
/*     */   public static eao l() {
/* 406 */     return af;
/*     */   }
/*     */   
/* 409 */   private static final eao ag = a("glint_translucent", dfk.n, 7, 256, b.a()
/* 410 */       .a(new ean.o(efo.a, true, false))
/* 411 */       .a(F)
/* 412 */       .a(A)
/* 413 */       .a(C)
/* 414 */       .a(e)
/* 415 */       .a(r)
/* 416 */       .a(T)
/* 417 */       .a(false));
/*     */   
/*     */   public static eao m() {
/* 420 */     return ag;
/*     */   }
/*     */   
/* 423 */   private static final eao ah = a("glint", dfk.n, 7, 256, b.a()
/* 424 */       .a(new ean.o(efo.a, true, false))
/* 425 */       .a(F)
/* 426 */       .a(A)
/* 427 */       .a(C)
/* 428 */       .a(e)
/* 429 */       .a(r)
/* 430 */       .a(false));
/*     */   
/*     */   public static eao n() {
/* 433 */     return ah;
/*     */   }
/*     */   
/* 436 */   private static final eao ai = a("glint_direct", dfk.n, 7, 256, b.a()
/* 437 */       .a(new ean.o(efo.a, true, false))
/* 438 */       .a(F)
/* 439 */       .a(A)
/* 440 */       .a(C)
/* 441 */       .a(e)
/* 442 */       .a(r)
/* 443 */       .a(false));
/*     */   
/*     */   public static eao o() {
/* 446 */     return ai;
/*     */   }
/*     */   
/* 449 */   private static final eao aj = a("entity_glint", dfk.n, 7, 256, b.a()
/* 450 */       .a(new ean.o(efo.a, true, false))
/* 451 */       .a(F)
/* 452 */       .a(A)
/* 453 */       .a(C)
/* 454 */       .a(e)
/* 455 */       .a(T)
/* 456 */       .a(s)
/* 457 */       .a(false));
/*     */   
/*     */   public static eao p() {
/* 460 */     return aj;
/*     */   }
/*     */   
/* 463 */   private static final eao ak = a("entity_glint_direct", dfk.n, 7, 256, b.a()
/* 464 */       .a(new ean.o(efo.a, true, false))
/* 465 */       .a(F)
/* 466 */       .a(A)
/* 467 */       .a(C)
/* 468 */       .a(e)
/* 469 */       .a(s)
/* 470 */       .a(false));
/*     */   
/*     */   public static eao q() {
/* 473 */     return ak;
/*     */   }
/*     */   
/*     */   public static eao o(vk ☃) {
/* 477 */     ean.o o = new ean.o(☃, false, false);
/* 478 */     return a("crumbling", dfk.h, 7, 256, false, true, b.a()
/* 479 */         .a(o)
/* 480 */         .a(i)
/* 481 */         .a(f)
/* 482 */         .a(F)
/* 483 */         .a(I)
/* 484 */         .a(false));
/*     */   }
/*     */   
/*     */   public static eao p(vk ☃) {
/* 488 */     return a("text", dfk.q, 7, 256, false, true, b.a()
/* 489 */         .a(new ean.o(☃, false, false))
/* 490 */         .a(i)
/* 491 */         .a(g)
/* 492 */         .a(t)
/* 493 */         .a(false));
/*     */   }
/*     */   
/*     */   public static eao q(vk ☃) {
/* 497 */     return a("text_see_through", dfk.q, 7, 256, false, true, b.a()
/* 498 */         .a(new ean.o(☃, false, false))
/* 499 */         .a(i)
/* 500 */         .a(g)
/* 501 */         .a(t)
/* 502 */         .a(B)
/* 503 */         .a(F)
/* 504 */         .a(false));
/*     */   }
/*     */   
/* 507 */   private static final eao al = a("lightning", dfk.l, 7, 256, false, true, b.a()
/* 508 */       .a(E)
/* 509 */       .a(d)
/* 510 */       .a(R)
/* 511 */       .a(l)
/* 512 */       .a(false));
/*     */   
/*     */   public static eao r() {
/* 515 */     return al;
/*     */   }
/*     */   
/*     */   private static b E() {
/* 519 */     return b.a()
/* 520 */       .a(l)
/* 521 */       .a(t)
/* 522 */       .a(m)
/* 523 */       .a(g)
/* 524 */       .a(R)
/* 525 */       .a(true);
/*     */   }
/*     */   
/* 528 */   private static final eao am = a("tripwire", dfk.h, 7, 262144, true, true, E());
/*     */   
/*     */   public static eao s() {
/* 531 */     return am;
/*     */   }
/*     */ 
/*     */   
/*     */   public static eao a(int ☃) {
/*     */     ean.q q;
/*     */     ean.o o;
/* 538 */     if (☃ <= 1) {
/* 539 */       q = g;
/* 540 */       o = new ean.o(ecs.a, false, false);
/*     */     } else {
/* 542 */       q = c;
/* 543 */       o = new ean.o(ecs.c, false, false);
/*     */     } 
/*     */     
/* 546 */     return a("end_portal", dfk.l, 7, 256, false, true, b.a()
/* 547 */         .a(q)
/* 548 */         .a(o)
/* 549 */         .a(new ean.m(☃))
/* 550 */         .a(M)
/* 551 */         .a(false));
/*     */   }
/*     */   
/* 554 */   public static final a V = a("lines", dfk.l, 1, 256, b.a()
/* 555 */       .a(new ean.i(OptionalDouble.empty()))
/* 556 */       .a(J)
/* 557 */       .a(g)
/* 558 */       .a(T)
/* 559 */       .a(E)
/* 560 */       .a(false)); private final dfr an; private final int ao; private final int ap; private final boolean aq; private final boolean ar; private final Optional<eao> as;
/*     */   
/*     */   public static eao t() {
/* 563 */     return V;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public eao(String ☃, dfr dfr1, int i, int j, boolean bool1, boolean bool2, Runnable runnable1, Runnable runnable2) {
/* 574 */     super(☃, runnable1, runnable2);
/* 575 */     this.an = dfr1;
/* 576 */     this.ao = i;
/* 577 */     this.ap = j;
/* 578 */     this.aq = bool1;
/* 579 */     this.ar = bool2;
/* 580 */     this.as = Optional.of(this);
/*     */   }
/*     */   
/*     */   public static a a(String ☃, dfr dfr1, int i, int j, b b1) {
/* 584 */     return a(☃, dfr1, i, j, false, false, b1);
/*     */   }
/*     */   
/*     */   public static a a(String ☃, dfr dfr1, int i, int j, boolean bool1, boolean bool2, b b1) {
/* 588 */     return a.b(☃, dfr1, i, j, bool1, bool2, b1);
/*     */   }
/*     */   
/*     */   public void a(dfh ☃, int i, int j, int k) {
/* 592 */     if (!☃.j()) {
/*     */       return;
/*     */     }
/* 595 */     if (this.ar) {
/* 596 */       ☃.a(i, j, k);
/*     */     }
/* 598 */     ☃.c();
/* 599 */     a();
/* 600 */     dfi.a(☃);
/* 601 */     b();
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 606 */     return this.a;
/*     */   }
/*     */   
/*     */   public static List<eao> u() {
/* 610 */     return (List<eao>)ImmutableList.of(c(), d(), e(), f(), s());
/*     */   }
/*     */   
/*     */   public int v() {
/* 614 */     return this.ap;
/*     */   }
/*     */   
/*     */   public dfr w() {
/* 618 */     return this.an;
/*     */   }
/*     */   
/*     */   public int x() {
/* 622 */     return this.ao;
/*     */   }
/*     */   
/*     */   public Optional<eao> y() {
/* 626 */     return Optional.empty();
/*     */   }
/*     */   
/*     */   public boolean z() {
/* 630 */     return false;
/*     */   }
/*     */   
/*     */   public boolean A() {
/* 634 */     return this.aq;
/*     */   }
/*     */   
/*     */   public Optional<eao> B() {
/* 638 */     return this.as;
/*     */   }
/*     */   
/*     */   public static final class b
/*     */   {
/*     */     private final ean.o a;
/*     */     private final ean.q b;
/*     */     private final ean.e c;
/*     */     private final ean.n d;
/*     */     private final ean.a e;
/*     */     private final ean.d f;
/*     */     private final ean.c g;
/*     */     private final ean.h h;
/*     */     private final ean.l i;
/*     */     private final ean.f j;
/*     */     private final ean.g k;
/*     */     private final ean.k l;
/*     */     private final ean.p m;
/*     */     private final ean.r n;
/*     */     private final ean.i o;
/*     */     private final eao.c p;
/*     */     private final ImmutableList<ean> q;
/*     */     
/*     */     private b(ean.o ☃, ean.q q1, ean.e e1, ean.n n1, ean.a a1, ean.d d1, ean.c c1, ean.h h1, ean.l l1, ean.f f1, ean.g g1, ean.k k1, ean.p p1, ean.r r1, ean.i i1, eao.c c2) {
/* 662 */       this.a = ☃;
/* 663 */       this.b = q1;
/* 664 */       this.c = e1;
/* 665 */       this.d = n1;
/* 666 */       this.e = a1;
/* 667 */       this.f = d1;
/* 668 */       this.g = c1;
/* 669 */       this.h = h1;
/* 670 */       this.i = l1;
/* 671 */       this.j = f1;
/* 672 */       this.k = g1;
/* 673 */       this.l = k1;
/* 674 */       this.m = p1;
/* 675 */       this.n = r1;
/* 676 */       this.o = i1;
/* 677 */       this.p = c2;
/*     */       
/* 679 */       this.q = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (Object[])new ean[] { this.m, this.n, this.o });
/*     */     }
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
/*     */     public boolean equals(Object ☃) {
/* 700 */       if (this == ☃) {
/* 701 */         return true;
/*     */       }
/* 703 */       if (☃ == null || getClass() != ☃.getClass()) {
/* 704 */         return false;
/*     */       }
/* 706 */       b b1 = (b)☃;
/* 707 */       return (this.p == b1.p && this.q.equals(b1.q));
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 712 */       return Objects.hash(new Object[] { this.q, this.p });
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 717 */       return "CompositeState[" + this.q + ", outlineProperty=" + this.p + ']';
/*     */     }
/*     */     
/*     */     public static a a() {
/* 721 */       return new a();
/*     */     }
/*     */     
/*     */     public static class a {
/* 725 */       private ean.o a = ean.o;
/* 726 */       private ean.q b = ean.b;
/* 727 */       private ean.e c = ean.y;
/* 728 */       private ean.n d = ean.k;
/* 729 */       private ean.a e = ean.h;
/* 730 */       private ean.d f = ean.D;
/* 731 */       private ean.c g = ean.z;
/* 732 */       private ean.h h = ean.u;
/* 733 */       private ean.l i = ean.w;
/* 734 */       private ean.f j = ean.L;
/* 735 */       private ean.g k = ean.H;
/* 736 */       private ean.k l = ean.N;
/* 737 */       private ean.p m = ean.p;
/* 738 */       private ean.r n = ean.E;
/* 739 */       private ean.i o = ean.U;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public a a(ean.o ☃) {
/* 745 */         this.a = ☃;
/* 746 */         return this;
/*     */       }
/*     */       
/*     */       public a a(ean.q ☃) {
/* 750 */         this.b = ☃;
/* 751 */         return this;
/*     */       }
/*     */       
/*     */       public a a(ean.e ☃) {
/* 755 */         this.c = ☃;
/* 756 */         return this;
/*     */       }
/*     */       
/*     */       public a a(ean.n ☃) {
/* 760 */         this.d = ☃;
/* 761 */         return this;
/*     */       }
/*     */       
/*     */       public a a(ean.a ☃) {
/* 765 */         this.e = ☃;
/* 766 */         return this;
/*     */       }
/*     */       
/*     */       public a a(ean.d ☃) {
/* 770 */         this.f = ☃;
/* 771 */         return this;
/*     */       }
/*     */       
/*     */       public a a(ean.c ☃) {
/* 775 */         this.g = ☃;
/* 776 */         return this;
/*     */       }
/*     */       
/*     */       public a a(ean.h ☃) {
/* 780 */         this.h = ☃;
/* 781 */         return this;
/*     */       }
/*     */       
/*     */       public a a(ean.l ☃) {
/* 785 */         this.i = ☃;
/* 786 */         return this;
/*     */       }
/*     */       
/*     */       public a a(ean.f ☃) {
/* 790 */         this.j = ☃;
/* 791 */         return this;
/*     */       }
/*     */       
/*     */       public a a(ean.g ☃) {
/* 795 */         this.k = ☃;
/* 796 */         return this;
/*     */       }
/*     */       
/*     */       public a a(ean.k ☃) {
/* 800 */         this.l = ☃;
/* 801 */         return this;
/*     */       }
/*     */       
/*     */       public a a(ean.p ☃) {
/* 805 */         this.m = ☃;
/* 806 */         return this;
/*     */       }
/*     */       
/*     */       public a a(ean.r ☃) {
/* 810 */         this.n = ☃;
/* 811 */         return this;
/*     */       }
/*     */       
/*     */       public a a(ean.i ☃) {
/* 815 */         this.o = ☃;
/* 816 */         return this;
/*     */       }
/*     */       
/*     */       public eao.b a(boolean ☃) {
/* 820 */         return a(☃ ? eao.c.c : eao.c.a);
/*     */       }
/*     */       
/*     */       public eao.b a(eao.c ☃) {
/* 824 */         return new eao.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, ☃); } private a() {} } } public static class a { private ean.o a = ean.o; private ean.q b = ean.b; private ean.e c = ean.y; private ean.n d = ean.k; private ean.a e = ean.h; private ean.d f = ean.D; private ean.c g = ean.z; private ean.h h = ean.u; private ean.l i = ean.w; private ean.f j = ean.L; private ean.g k = ean.H; private ean.k l = ean.N; private ean.p m = ean.p; private ean.r n = ean.E; private ean.i o = ean.U; public eao.b a(eao.c ☃) { return new eao.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, ☃); }
/*     */     public a a(ean.o ☃) { this.a = ☃; return this; }
/*     */     public a a(ean.q ☃) { this.b = ☃; return this; }
/*     */     public a a(ean.e ☃) { this.c = ☃; return this; } public a a(ean.n ☃) { this.d = ☃; return this; } public a a(ean.a ☃) { this.e = ☃; return this; } public a a(ean.d ☃) { this.f = ☃; return this; } public a a(ean.c ☃) { this.g = ☃; return this; } public a a(ean.h ☃) { this.h = ☃; return this; } public a a(ean.l ☃) { this.i = ☃; return this; } public a a(ean.f ☃) { this.j = ☃; return this; } public a a(ean.g ☃) { this.k = ☃; return this; } public a a(ean.k ☃) { this.l = ☃; return this; } public a a(ean.p ☃) { this.m = ☃; return this; } public a a(ean.r ☃) { this.n = ☃; return this; } public a a(ean.i ☃) { this.o = ☃; return this; } public eao.b a(boolean ☃) { return a(☃ ? eao.c.c : eao.c.a); } private a() {} }
/*     */    static final class a extends eao
/*     */   {
/* 830 */     private static final ObjectOpenCustomHashSet<a> W = new ObjectOpenCustomHashSet(a.a);
/*     */     
/*     */     private final eao.b X;
/*     */     private final int Y;
/*     */     private final Optional<eao> Z;
/*     */     private final boolean aa;
/*     */     
/*     */     private a(String ☃, dfr dfr1, int i, int j, boolean bool1, boolean bool2, eao.b b1) {
/* 838 */       super(☃, dfr1, i, j, bool1, bool2, () -> eao.b.d(☃).forEach(ean::a), () -> eao.b.d(☃).forEach(ean::b));
/* 839 */       this.X = b1;
/* 840 */       this.Z = (eao.b.a(b1) == eao.c.c) ? eao.b.b(b1).c().<eao>map(vk1 -> a(vk1, eao.b.c(☃))) : Optional.<eao>empty();
/* 841 */       this.aa = (eao.b.a(b1) == eao.c.b);
/* 842 */       this.Y = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), b1 });
/*     */     }
/*     */     
/*     */     private static a c(String ☃, dfr dfr1, int i, int j, boolean bool1, boolean bool2, eao.b b1) {
/* 846 */       return (a)W.addOrGet(new a(☃, dfr1, i, j, bool1, bool2, b1));
/*     */     }
/*     */ 
/*     */     
/*     */     public Optional<eao> y() {
/* 851 */       return this.Z;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean z() {
/* 856 */       return this.aa;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean equals(@Nullable Object ☃) {
/* 865 */       return (this == ☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 870 */       return this.Y;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 875 */       return "RenderType[" + this.X + ']';
/*     */     }
/*     */     
/*     */     enum a implements Hash.Strategy<a> {
/* 879 */       a;
/*     */ 
/*     */       
/*     */       public int a(@Nullable eao.a ☃) {
/* 883 */         if (☃ == null) {
/* 884 */           return 0;
/*     */         }
/* 886 */         return eao.a.a(☃);
/*     */       }
/*     */ 
/*     */       
/*     */       public boolean a(@Nullable eao.a ☃, @Nullable eao.a a1) {
/* 891 */         if (☃ == a1) {
/* 892 */           return true;
/*     */         }
/* 894 */         if (☃ == null || a1 == null) {
/* 895 */           return false;
/*     */         }
/*     */         
/* 898 */         return Objects.equals(eao.a.b(☃), eao.a.b(a1));
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */