/*     */ import java.util.List;
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
/*     */ public class bcn
/*     */   extends aqm
/*     */ {
/*  52 */   private static final go bj = new go(0.0F, 0.0F, 0.0F);
/*  53 */   private static final go bk = new go(0.0F, 0.0F, 0.0F);
/*  54 */   private static final go bl = new go(-10.0F, 0.0F, -10.0F);
/*  55 */   private static final go bm = new go(-15.0F, 0.0F, 10.0F);
/*  56 */   private static final go bn = new go(-1.0F, 0.0F, -1.0F);
/*  57 */   private static final go bo = new go(1.0F, 0.0F, 1.0F);
/*     */   
/*  59 */   private static final aqb bp = new aqb(0.0F, 0.0F, true);
/*  60 */   private static final aqb bq = aqe.b.l().a(0.5F);
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
/*  75 */   public static final us<Byte> b = uv.a((Class)bcn.class, uu.a);
/*  76 */   public static final us<go> c = uv.a((Class)bcn.class, uu.k);
/*  77 */   public static final us<go> d = uv.a((Class)bcn.class, uu.k);
/*  78 */   public static final us<go> e = uv.a((Class)bcn.class, uu.k);
/*  79 */   public static final us<go> f = uv.a((Class)bcn.class, uu.k);
/*  80 */   public static final us<go> g = uv.a((Class)bcn.class, uu.k); private static final Predicate<aqa> br;
/*  81 */   public static final us<go> bh = uv.a((Class)bcn.class, uu.k);
/*     */   static {
/*  83 */     br = (☃ -> (☃ instanceof bhl && ((bhl)☃).o() == bhl.a.a));
/*     */   }
/*  85 */   private final gj<bmb> bs = gj.a(2, bmb.b);
/*  86 */   private final gj<bmb> bt = gj.a(4, bmb.b);
/*     */   
/*     */   private boolean bu;
/*     */   public long bi;
/*     */   private int bv;
/*  91 */   private go bw = bj;
/*  92 */   private go bx = bk;
/*  93 */   private go by = bl;
/*  94 */   private go bz = bm;
/*  95 */   private go bA = bn;
/*  96 */   private go bB = bo;
/*     */   
/*     */   public bcn(aqe<? extends bcn> ☃, brx brx1) {
/*  99 */     super((aqe)☃, brx1);
/* 100 */     this.G = 0.0F;
/*     */   }
/*     */   
/*     */   public bcn(brx ☃, double d1, double d2, double d3) {
/* 104 */     this(aqe.b, ☃);
/* 105 */     d(d1, d2, d3);
/*     */   }
/*     */ 
/*     */   
/*     */   public void x_() {
/* 110 */     double ☃ = cD();
/* 111 */     double d1 = cE();
/* 112 */     double d2 = cH();
/* 113 */     super.x_();
/* 114 */     d(☃, d1, d2);
/*     */   }
/*     */   
/*     */   private boolean A() {
/* 118 */     return (!q() && !aB());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean dS() {
/* 123 */     return (super.dS() && A());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 128 */     super.e();
/* 129 */     this.R.a(b, Byte.valueOf((byte)0));
/* 130 */     this.R.a(c, bj);
/* 131 */     this.R.a(d, bk);
/* 132 */     this.R.a(e, bl);
/* 133 */     this.R.a(f, bm);
/* 134 */     this.R.a(g, bn);
/* 135 */     this.R.a(bh, bo);
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterable<bmb> bn() {
/* 140 */     return this.bs;
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterable<bmb> bo() {
/* 145 */     return this.bt;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb b(aqf ☃) {
/* 150 */     switch (null.a[☃.a().ordinal()]) {
/*     */       case 1:
/* 152 */         return this.bs.get(☃.b());
/*     */       case 2:
/* 154 */         return this.bt.get(☃.b());
/*     */     } 
/* 156 */     return bmb.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqf ☃, bmb bmb1) {
/* 161 */     switch (null.a[☃.a().ordinal()]) {
/*     */       case 1:
/* 163 */         b(bmb1);
/* 164 */         this.bs.set(☃.b(), bmb1);
/*     */         break;
/*     */       case 2:
/* 167 */         b(bmb1);
/* 168 */         this.bt.set(☃.b(), bmb1);
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a_(int ☃, bmb bmb1) {
/*     */     aqf aqf;
/* 176 */     if (☃ == 98) {
/* 177 */       aqf = aqf.a;
/* 178 */     } else if (☃ == 99) {
/* 179 */       aqf = aqf.b;
/*     */     }
/* 181 */     else if (☃ == 100 + aqf.f.b()) {
/* 182 */       aqf = aqf.f;
/* 183 */     } else if (☃ == 100 + aqf.e.b()) {
/* 184 */       aqf = aqf.e;
/* 185 */     } else if (☃ == 100 + aqf.d.b()) {
/* 186 */       aqf = aqf.d;
/* 187 */     } else if (☃ == 100 + aqf.c.b()) {
/* 188 */       aqf = aqf.c;
/*     */     } else {
/* 190 */       return false;
/*     */     } 
/*     */     
/* 193 */     if (bmb1.a() || aqn.c(aqf, bmb1) || aqf == aqf.f) {
/* 194 */       a(aqf, bmb1);
/* 195 */       return true;
/*     */     } 
/* 197 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean e(bmb ☃) {
/* 202 */     aqf aqf = aqn.j(☃);
/* 203 */     return (b(aqf).a() && !d(aqf));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 208 */     super.b(☃);
/*     */     
/* 210 */     mj mj1 = new mj();
/* 211 */     for (bmb bmb : this.bt) {
/* 212 */       md md1 = new md();
/* 213 */       if (!bmb.a()) {
/* 214 */         bmb.b(md1);
/*     */       }
/* 216 */       mj1.add(md1);
/*     */     } 
/* 218 */     ☃.a("ArmorItems", mj1);
/*     */     
/* 220 */     mj mj2 = new mj();
/* 221 */     for (bmb bmb : this.bs) {
/* 222 */       md md1 = new md();
/* 223 */       if (!bmb.a()) {
/* 224 */         bmb.b(md1);
/*     */       }
/* 226 */       mj2.add(md1);
/*     */     } 
/* 228 */     ☃.a("HandItems", mj2);
/*     */     
/* 230 */     ☃.a("Invisible", bF());
/* 231 */     ☃.a("Small", m());
/*     */     
/* 233 */     ☃.a("ShowArms", o());
/*     */     
/* 235 */     ☃.b("DisabledSlots", this.bv);
/* 236 */     ☃.a("NoBasePlate", p());
/* 237 */     if (q()) {
/* 238 */       ☃.a("Marker", q());
/*     */     }
/* 240 */     ☃.a("Pose", B());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 245 */     super.a(☃);
/*     */     
/* 247 */     if (☃.c("ArmorItems", 9)) {
/* 248 */       mj mj = ☃.d("ArmorItems", 10);
/*     */       
/* 250 */       for (int i = 0; i < this.bt.size(); i++) {
/* 251 */         this.bt.set(i, bmb.a(mj.a(i)));
/*     */       }
/*     */     } 
/* 254 */     if (☃.c("HandItems", 9)) {
/* 255 */       mj mj = ☃.d("HandItems", 10);
/*     */       
/* 257 */       for (int i = 0; i < this.bs.size(); i++) {
/* 258 */         this.bs.set(i, bmb.a(mj.a(i)));
/*     */       }
/*     */     } 
/*     */     
/* 262 */     j(☃.q("Invisible"));
/*     */     
/* 264 */     a(☃.q("Small"));
/*     */     
/* 266 */     p(☃.q("ShowArms"));
/*     */     
/* 268 */     this.bv = ☃.h("DisabledSlots");
/* 269 */     q(☃.q("NoBasePlate"));
/* 270 */     r(☃.q("Marker"));
/* 271 */     this.H = !A();
/* 272 */     md md1 = ☃.p("Pose");
/* 273 */     g(md1);
/*     */   }
/*     */   
/*     */   private void g(md ☃) {
/* 277 */     mj mj1 = ☃.d("Head", 5);
/* 278 */     a(mj1.isEmpty() ? bj : new go(mj1));
/*     */     
/* 280 */     mj mj2 = ☃.d("Body", 5);
/* 281 */     b(mj2.isEmpty() ? bk : new go(mj2));
/*     */     
/* 283 */     mj mj3 = ☃.d("LeftArm", 5);
/* 284 */     c(mj3.isEmpty() ? bl : new go(mj3));
/*     */     
/* 286 */     mj mj4 = ☃.d("RightArm", 5);
/* 287 */     d(mj4.isEmpty() ? bm : new go(mj4));
/*     */     
/* 289 */     mj mj5 = ☃.d("LeftLeg", 5);
/* 290 */     e(mj5.isEmpty() ? bn : new go(mj5));
/*     */     
/* 292 */     mj mj6 = ☃.d("RightLeg", 5);
/* 293 */     f(mj6.isEmpty() ? bo : new go(mj6));
/*     */   }
/*     */   
/*     */   private md B() {
/* 297 */     md ☃ = new md();
/* 298 */     if (!bj.equals(this.bw)) {
/* 299 */       ☃.a("Head", this.bw.a());
/*     */     }
/* 301 */     if (!bk.equals(this.bx)) {
/* 302 */       ☃.a("Body", this.bx.a());
/*     */     }
/* 304 */     if (!bl.equals(this.by)) {
/* 305 */       ☃.a("LeftArm", this.by.a());
/*     */     }
/* 307 */     if (!bm.equals(this.bz)) {
/* 308 */       ☃.a("RightArm", this.bz.a());
/*     */     }
/* 310 */     if (!bn.equals(this.bA)) {
/* 311 */       ☃.a("LeftLeg", this.bA.a());
/*     */     }
/* 313 */     if (!bo.equals(this.bB)) {
/* 314 */       ☃.a("RightLeg", this.bB.a());
/*     */     }
/* 316 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean aU() {
/* 322 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void C(aqa ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected void dQ() {
/* 333 */     List<aqa> ☃ = this.l.a(this, cc(), br);
/* 334 */     for (int i = 0; i < ☃.size(); i++) {
/* 335 */       aqa aqa = ☃.get(i);
/*     */       
/* 337 */       if (h(aqa) <= 0.2D) {
/* 338 */         aqa.i(this);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(bfw ☃, dcn dcn1, aot aot1) {
/* 345 */     bmb bmb = ☃.b(aot1);
/* 346 */     if (q() || bmb.b() == bmd.pI) {
/* 347 */       return aou.c;
/*     */     }
/* 349 */     if (☃.a_()) {
/* 350 */       return aou.a;
/*     */     }
/*     */     
/* 353 */     if (☃.l.v) {
/* 354 */       return aou.b;
/*     */     }
/*     */     
/* 357 */     aqf aqf = aqn.j(bmb);
/* 358 */     if (bmb.a()) {
/* 359 */       aqf aqf1 = i(dcn1);
/* 360 */       aqf aqf2 = d(aqf1) ? aqf : aqf1;
/* 361 */       if (a(aqf2) && a(☃, aqf2, bmb, aot1)) {
/* 362 */         return aou.a;
/*     */       }
/*     */     } else {
/* 365 */       if (d(aqf)) {
/* 366 */         return aou.d;
/*     */       }
/* 368 */       if (aqf.a() == aqf.a.a && !o()) {
/* 369 */         return aou.d;
/*     */       }
/* 371 */       if (a(☃, aqf, bmb, aot1)) {
/* 372 */         return aou.a;
/*     */       }
/*     */     } 
/* 375 */     return aou.c;
/*     */   }
/*     */   
/*     */   private aqf i(dcn ☃) {
/* 379 */     aqf aqf1 = aqf.a;
/* 380 */     boolean bool = m();
/* 381 */     double d = bool ? (☃.c * 2.0D) : ☃.c;
/* 382 */     aqf aqf2 = aqf.c;
/* 383 */     if (d >= 0.1D && d < 0.1D + (bool ? 0.8D : 0.45D) && a(aqf2)) {
/* 384 */       aqf1 = aqf.c;
/* 385 */     } else if (d >= 0.9D + (bool ? 0.3D : 0.0D) && d < 0.9D + (bool ? 1.0D : 0.7D) && a(aqf.e)) {
/* 386 */       aqf1 = aqf.e;
/* 387 */     } else if (d >= 0.4D && d < 0.4D + (bool ? 1.0D : 0.8D) && a(aqf.d)) {
/* 388 */       aqf1 = aqf.d;
/* 389 */     } else if (d >= 1.6D && a(aqf.f)) {
/* 390 */       aqf1 = aqf.f;
/* 391 */     } else if (!a(aqf.a) && a(aqf.b)) {
/* 392 */       aqf1 = aqf.b;
/*     */     } 
/*     */     
/* 395 */     return aqf1;
/*     */   }
/*     */   
/*     */   private boolean d(aqf ☃) {
/* 399 */     return ((this.bv & 1 << ☃.c()) != 0 || (☃.a() == aqf.a.a && !o()));
/*     */   }
/*     */   
/*     */   private boolean a(bfw ☃, aqf aqf1, bmb bmb1, aot aot1) {
/* 403 */     bmb bmb2 = b(aqf1);
/*     */     
/* 405 */     if (!bmb2.a() && (this.bv & 1 << aqf1.c() + 8) != 0) {
/* 406 */       return false;
/*     */     }
/*     */     
/* 409 */     if (bmb2.a() && (this.bv & 1 << aqf1.c() + 16) != 0) {
/* 410 */       return false;
/*     */     }
/*     */     
/* 413 */     if (☃.bC.d && bmb2.a() && !bmb1.a()) {
/* 414 */       bmb bmb3 = bmb1.i();
/* 415 */       bmb3.e(1);
/* 416 */       a(aqf1, bmb3);
/* 417 */       return true;
/*     */     } 
/*     */     
/* 420 */     if (!bmb1.a() && bmb1.E() > 1) {
/* 421 */       if (!bmb2.a()) {
/* 422 */         return false;
/*     */       }
/*     */ 
/*     */       
/* 426 */       bmb bmb3 = bmb1.i();
/* 427 */       bmb3.e(1);
/* 428 */       a(aqf1, bmb3);
/* 429 */       bmb1.g(1);
/*     */       
/* 431 */       return true;
/*     */     } 
/*     */     
/* 434 */     a(aqf1, bmb1);
/* 435 */     ☃.a(aot1, bmb2);
/* 436 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 441 */     if (this.l.v || this.y) {
/* 442 */       return false;
/*     */     }
/*     */     
/* 445 */     if (apk.m.equals(☃)) {
/* 446 */       ad();
/* 447 */       return false;
/*     */     } 
/* 449 */     if (b(☃) || this.bu || q()) {
/* 450 */       return false;
/*     */     }
/* 452 */     if (☃.d()) {
/* 453 */       g(☃);
/* 454 */       ad();
/* 455 */       return false;
/*     */     } 
/* 457 */     if (apk.a.equals(☃)) {
/* 458 */       if (bq()) {
/* 459 */         f(☃, 0.15F);
/*     */       } else {
/* 461 */         f(5);
/*     */       } 
/* 463 */       return false;
/*     */     } 
/* 465 */     if (apk.c.equals(☃) && dk() > 0.5F) {
/* 466 */       f(☃, 4.0F);
/* 467 */       return false;
/*     */     } 
/*     */ 
/*     */     
/* 471 */     boolean bool1 = ☃.j() instanceof bga;
/* 472 */     boolean bool2 = (bool1 && ((bga)☃.j()).r() > 0);
/* 473 */     boolean bool3 = "player".equals(☃.q());
/* 474 */     if (!bool3 && !bool1) {
/* 475 */       return false;
/*     */     }
/* 477 */     if (☃.k() instanceof bfw && !((bfw)☃.k()).bC.e) {
/* 478 */       return false;
/*     */     }
/* 480 */     if (☃.v()) {
/* 481 */       F();
/* 482 */       D();
/* 483 */       ad();
/* 484 */       return bool2;
/*     */     } 
/*     */     
/* 487 */     long l = this.l.T();
/* 488 */     if (l - this.bi <= 5L || bool1) {
/* 489 */       f(☃);
/* 490 */       D();
/* 491 */       ad();
/*     */     } else {
/* 493 */       this.l.a(this, (byte)32);
/* 494 */       this.bi = l;
/*     */     } 
/* 496 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(byte ☃) {
/* 501 */     if (☃ == 32) {
/* 502 */       if (this.l.v) {
/* 503 */         this.l.a(cD(), cE(), cH(), adq.U, cu(), 0.3F, 1.0F, false);
/* 504 */         this.bi = this.l.T();
/*     */       } 
/*     */     } else {
/* 507 */       super.a(☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃) {
/* 513 */     double d = cc().a() * 4.0D;
/* 514 */     if (Double.isNaN(d) || d == 0.0D) {
/* 515 */       d = 4.0D;
/*     */     }
/* 517 */     d *= 64.0D;
/* 518 */     return (☃ < d * d);
/*     */   }
/*     */   
/*     */   private void D() {
/* 522 */     if (this.l instanceof aag) {
/* 523 */       ((aag)this.l).a(new hc(hh.d, bup.n.n()), cD(), e(0.6666666666666666D), cH(), 10, (cy() / 4.0F), (cz() / 4.0F), (cy() / 4.0F), 0.05D);
/*     */     }
/*     */   }
/*     */   
/*     */   private void f(apk ☃, float f) {
/* 528 */     float f1 = dk();
/* 529 */     f1 -= f;
/* 530 */     if (f1 <= 0.5F) {
/* 531 */       g(☃);
/* 532 */       ad();
/*     */     } else {
/* 534 */       c(f1);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void f(apk ☃) {
/* 539 */     buo.a(this.l, cB(), new bmb(bmd.pC));
/* 540 */     g(☃);
/*     */   }
/*     */   
/*     */   private void g(apk ☃) {
/* 544 */     F();
/* 545 */     d(☃); int i;
/* 546 */     for (i = 0; i < this.bs.size(); i++) {
/* 547 */       bmb bmb = this.bs.get(i);
/* 548 */       if (!bmb.a()) {
/* 549 */         buo.a(this.l, cB().b(), bmb);
/* 550 */         this.bs.set(i, bmb.b);
/*     */       } 
/*     */     } 
/* 553 */     for (i = 0; i < this.bt.size(); i++) {
/* 554 */       bmb bmb = this.bt.get(i);
/* 555 */       if (!bmb.a()) {
/* 556 */         buo.a(this.l, cB().b(), bmb);
/* 557 */         this.bt.set(i, bmb.b);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void F() {
/* 563 */     this.l.a((bfw)null, cD(), cE(), cH(), adq.S, cu(), 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected float f(float ☃, float f1) {
/* 568 */     this.aB = this.r;
/* 569 */     this.aA = this.p;
/* 570 */     return 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float b(aqx ☃, aqb aqb1) {
/* 575 */     return aqb1.b * (w_() ? 0.5F : 0.9F);
/*     */   }
/*     */ 
/*     */   
/*     */   public double bb() {
/* 580 */     return q() ? 0.0D : 0.10000000149011612D;
/*     */   }
/*     */ 
/*     */   
/*     */   public void g(dcn ☃) {
/* 585 */     if (!A()) {
/*     */       return;
/*     */     }
/* 588 */     super.g(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void n(float ☃) {
/* 593 */     this.aB = this.r = ☃;
/* 594 */     this.aD = this.aC = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m(float ☃) {
/* 599 */     this.aB = this.r = ☃;
/* 600 */     this.aD = this.aC = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 605 */     super.j();
/*     */     
/* 607 */     go ☃ = this.R.<go>a(c);
/* 608 */     if (!this.bw.equals(☃)) {
/* 609 */       a(☃);
/*     */     }
/* 611 */     go go1 = this.R.<go>a(d);
/* 612 */     if (!this.bx.equals(go1)) {
/* 613 */       b(go1);
/*     */     }
/* 615 */     go go2 = this.R.<go>a(e);
/* 616 */     if (!this.by.equals(go2)) {
/* 617 */       c(go2);
/*     */     }
/* 619 */     go go3 = this.R.<go>a(f);
/* 620 */     if (!this.bz.equals(go3)) {
/* 621 */       d(go3);
/*     */     }
/* 623 */     go go4 = this.R.<go>a(g);
/* 624 */     if (!this.bA.equals(go4)) {
/* 625 */       e(go4);
/*     */     }
/* 627 */     go go5 = this.R.<go>a(bh);
/* 628 */     if (!this.bB.equals(go5)) {
/* 629 */       f(go5);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void C() {
/* 635 */     j(this.bu);
/*     */   }
/*     */ 
/*     */   
/*     */   public void j(boolean ☃) {
/* 640 */     this.bu = ☃;
/* 641 */     super.j(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean w_() {
/* 646 */     return m();
/*     */   }
/*     */ 
/*     */   
/*     */   public void aa() {
/* 651 */     ad();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean ci() {
/* 656 */     return bF();
/*     */   }
/*     */ 
/*     */   
/*     */   public cvc y_() {
/* 661 */     if (q()) {
/* 662 */       return cvc.d;
/*     */     }
/* 664 */     return super.y_();
/*     */   }
/*     */   
/*     */   private void a(boolean ☃) {
/* 668 */     this.R.b(b, Byte.valueOf(a(((Byte)this.R.<Byte>a(b)).byteValue(), 1, ☃)));
/*     */   }
/*     */   
/*     */   public boolean m() {
/* 672 */     return ((((Byte)this.R.<Byte>a(b)).byteValue() & 0x1) != 0);
/*     */   }
/*     */   
/*     */   private void p(boolean ☃) {
/* 676 */     this.R.b(b, Byte.valueOf(a(((Byte)this.R.<Byte>a(b)).byteValue(), 4, ☃)));
/*     */   }
/*     */   
/*     */   public boolean o() {
/* 680 */     return ((((Byte)this.R.<Byte>a(b)).byteValue() & 0x4) != 0);
/*     */   }
/*     */   
/*     */   private void q(boolean ☃) {
/* 684 */     this.R.b(b, Byte.valueOf(a(((Byte)this.R.<Byte>a(b)).byteValue(), 8, ☃)));
/*     */   }
/*     */   
/*     */   public boolean p() {
/* 688 */     return ((((Byte)this.R.<Byte>a(b)).byteValue() & 0x8) != 0);
/*     */   }
/*     */   
/*     */   private void r(boolean ☃) {
/* 692 */     this.R.b(b, Byte.valueOf(a(((Byte)this.R.<Byte>a(b)).byteValue(), 16, ☃)));
/*     */   }
/*     */   
/*     */   public boolean q() {
/* 696 */     return ((((Byte)this.R.<Byte>a(b)).byteValue() & 0x10) != 0);
/*     */   }
/*     */   
/*     */   private byte a(byte ☃, int i, boolean bool) {
/* 700 */     if (bool) {
/* 701 */       ☃ = (byte)(☃ | i);
/*     */     } else {
/* 703 */       ☃ = (byte)(☃ & (i ^ 0xFFFFFFFF));
/*     */     } 
/* 705 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(go ☃) {
/* 709 */     this.bw = ☃;
/* 710 */     this.R.b(c, ☃);
/*     */   }
/*     */   
/*     */   public void b(go ☃) {
/* 714 */     this.bx = ☃;
/* 715 */     this.R.b(d, ☃);
/*     */   }
/*     */   
/*     */   public void c(go ☃) {
/* 719 */     this.by = ☃;
/* 720 */     this.R.b(e, ☃);
/*     */   }
/*     */   
/*     */   public void d(go ☃) {
/* 724 */     this.bz = ☃;
/* 725 */     this.R.b(f, ☃);
/*     */   }
/*     */   
/*     */   public void e(go ☃) {
/* 729 */     this.bA = ☃;
/* 730 */     this.R.b(g, ☃);
/*     */   }
/*     */   
/*     */   public void f(go ☃) {
/* 734 */     this.bB = ☃;
/* 735 */     this.R.b(bh, ☃);
/*     */   }
/*     */   
/*     */   public go r() {
/* 739 */     return this.bw;
/*     */   }
/*     */   
/*     */   public go t() {
/* 743 */     return this.bx;
/*     */   }
/*     */   
/*     */   public go u() {
/* 747 */     return this.by;
/*     */   }
/*     */   
/*     */   public go v() {
/* 751 */     return this.bz;
/*     */   }
/*     */   
/*     */   public go x() {
/* 755 */     return this.bA;
/*     */   }
/*     */   
/*     */   public go z() {
/* 759 */     return this.bB;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aT() {
/* 764 */     return (super.aT() && !q());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean t(aqa ☃) {
/* 769 */     return (☃ instanceof bfw && !this.l.a((bfw)☃, cB()));
/*     */   }
/*     */ 
/*     */   
/*     */   public aqi dV() {
/* 774 */     return aqi.b;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp o(int ☃) {
/* 779 */     return adq.T;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected adp e(apk ☃) {
/* 785 */     return adq.U;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected adp dq() {
/* 791 */     return adq.S;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(aag ☃, aql aql1) {}
/*     */ 
/*     */   
/*     */   public boolean eh() {
/* 800 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(us<?> ☃) {
/* 805 */     if (b.equals(☃)) {
/* 806 */       x_();
/* 807 */       this.i = !q();
/*     */     } 
/* 809 */     super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean ei() {
/* 814 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public aqb a(aqx ☃) {
/* 819 */     return s(q());
/*     */   }
/*     */   
/*     */   private aqb s(boolean ☃) {
/* 823 */     if (☃) {
/* 824 */       return bp;
/*     */     }
/* 826 */     return w_() ? bq : X().l();
/*     */   }
/*     */ 
/*     */   
/*     */   public dcn k(float ☃) {
/* 831 */     if (q()) {
/* 832 */       dci dci = s(false).a(cA());
/*     */       
/* 834 */       fx fx = cB();
/* 835 */       int i = Integer.MIN_VALUE;
/* 836 */       for (fx fx1 : fx.a(new fx(dci.a, dci.b, dci.c), new fx(dci.d, dci.e, dci.f))) {
/* 837 */         int j = Math.max(this.l.a(bsf.b, fx1), this.l.a(bsf.a, fx1));
/* 838 */         if (j == 15) {
/* 839 */           return dcn.a(fx1);
/*     */         }
/*     */         
/* 842 */         if (j > i) {
/* 843 */           i = j;
/* 844 */           fx = fx1.h();
/*     */         } 
/*     */       } 
/*     */       
/* 848 */       return dcn.a(fx);
/*     */     } 
/*     */     
/* 851 */     return super.k(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bcn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */