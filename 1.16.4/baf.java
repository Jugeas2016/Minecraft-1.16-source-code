/*     */ import java.util.EnumSet;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.Random;
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
/*     */ public class baf
/*     */   extends bay
/*     */ {
/*  75 */   private static final us<fx> c = uv.a((Class)baf.class, uu.l);
/*  76 */   private static final us<Boolean> d = uv.a((Class)baf.class, uu.i);
/*  77 */   private static final us<Integer> bo = uv.a((Class)baf.class, uu.b);
/*     */   
/*  79 */   private static final azg bp = (new azg()).a(10.0D).b().a().c();
/*     */   public static final Predicate<bcv> b;
/*     */   
/*     */   static {
/*  83 */     b = (☃ -> (!☃.p() && ☃.aX() && ☃.aE()));
/*     */   }
/*     */   public baf(aqe<? extends baf> ☃, brx brx1) {
/*  86 */     super((aqe)☃, brx1);
/*     */     
/*  88 */     this.bh = new a(this);
/*  89 */     this.g = new auw(this, 10);
/*     */     
/*  91 */     p(true);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/*  97 */     j(bH());
/*  98 */     this.q = 0.0F;
/*     */     
/* 100 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean cM() {
/* 105 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(int ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void g(fx ☃) {
/* 115 */     this.R.b(c, ☃);
/*     */   }
/*     */   
/*     */   public fx m() {
/* 119 */     return this.R.<fx>a(c);
/*     */   }
/*     */   
/*     */   public boolean eK() {
/* 123 */     return ((Boolean)this.R.<Boolean>a(d)).booleanValue();
/*     */   }
/*     */   
/*     */   public void t(boolean ☃) {
/* 127 */     this.R.b(d, Boolean.valueOf(☃));
/*     */   }
/*     */   
/*     */   public int eL() {
/* 131 */     return ((Integer)this.R.<Integer>a(bo)).intValue();
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/* 135 */     this.R.b(bo, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 140 */     super.e();
/* 141 */     this.R.a(c, fx.b);
/* 142 */     this.R.a(d, Boolean.valueOf(false));
/* 143 */     this.R.a(bo, Integer.valueOf(2400));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 148 */     super.b(☃);
/*     */     
/* 150 */     ☃.b("TreasurePosX", m().u());
/* 151 */     ☃.b("TreasurePosY", m().v());
/* 152 */     ☃.b("TreasurePosZ", m().w());
/* 153 */     ☃.a("GotFish", eK());
/* 154 */     ☃.b("Moistness", eL());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 159 */     int i = ☃.h("TreasurePosX");
/* 160 */     int j = ☃.h("TreasurePosY");
/* 161 */     int k = ☃.h("TreasurePosZ");
/* 162 */     g(new fx(i, j, k));
/*     */     
/* 164 */     super.a(☃);
/* 165 */     t(☃.q("GotFish"));
/* 166 */     b(☃.h("Moistness"));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/* 171 */     this.bk.a(0, new avh(this));
/* 172 */     this.bk.a(0, new axh(this));
/* 173 */     this.bk.a(1, new b(this));
/* 174 */     this.bk.a(2, new c(this, 4.0D));
/* 175 */     this.bk.a(4, new awu(this, 1.0D, 10));
/* 176 */     this.bk.a(4, new aws(this));
/* 177 */     this.bk.a(5, new awd(this, (Class)bfw.class, 6.0F));
/* 178 */     this.bk.a(5, new avl(this, 10));
/* 179 */     this.bk.a(6, new awf(this, 1.2000000476837158D, true));
/* 180 */     this.bk.a(8, new d());
/* 181 */     this.bk.a(8, new avq(this));
/* 182 */     this.bk.a(9, new avd<>(this, bdm.class, 8.0F, 1.0D, 1.0D));
/*     */     
/* 184 */     this.bl.a(1, (new axp(this, new Class[] { bdm.class })).a(new Class[0]));
/*     */   }
/*     */   
/*     */   public static ark.a eM() {
/* 188 */     return aqn.p()
/* 189 */       .a(arl.a, 10.0D)
/* 190 */       .a(arl.d, 1.2000000476837158D)
/* 191 */       .a(arl.f, 3.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ayj b(brx ☃) {
/* 196 */     return new ayl(this, ☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean B(aqa ☃) {
/* 202 */     boolean bool = ☃.a(apk.c(this), (int)b(arl.f));
/* 203 */     if (bool) {
/* 204 */       a(this, ☃);
/* 205 */       a(adq.cF, 1.0F, 1.0F);
/*     */     } 
/* 207 */     return bool;
/*     */   }
/*     */ 
/*     */   
/*     */   public int bH() {
/* 212 */     return 4800;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int m(int ☃) {
/* 217 */     return bH();
/*     */   }
/*     */ 
/*     */   
/*     */   protected float b(aqx ☃, aqb aqb1) {
/* 222 */     return 0.3F;
/*     */   }
/*     */ 
/*     */   
/*     */   public int O() {
/* 227 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int Q() {
/* 232 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean n(aqa ☃) {
/* 237 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean e(bmb ☃) {
/* 242 */     aqf aqf = aqn.j(☃);
/* 243 */     if (!b(aqf).a()) {
/* 244 */       return false;
/*     */     }
/* 246 */     return (aqf == aqf.a && super.e(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(bcv ☃) {
/* 251 */     if (b(aqf.a).a()) {
/* 252 */       bmb bmb = ☃.g();
/* 253 */       if (h(bmb)) {
/* 254 */         a(☃);
/* 255 */         a(aqf.a, bmb);
/* 256 */         this.bm[aqf.a.b()] = 2.0F;
/* 257 */         a(☃, bmb.E());
/* 258 */         ☃.ad();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 265 */     super.j();
/*     */     
/* 267 */     if (eD()) {
/*     */       
/* 269 */       j(bH());
/*     */       
/*     */       return;
/*     */     } 
/* 273 */     if (aG()) {
/* 274 */       b(2400);
/*     */     } else {
/* 276 */       b(eL() - 1);
/*     */       
/* 278 */       if (eL() <= 0) {
/* 279 */         a(apk.t, 1.0F);
/*     */       }
/*     */       
/* 282 */       if (this.t) {
/* 283 */         f(cC().b(((this.J
/* 284 */               .nextFloat() * 2.0F - 1.0F) * 0.2F), 0.5D, ((this.J
/*     */               
/* 286 */               .nextFloat() * 2.0F - 1.0F) * 0.2F)));
/*     */         
/* 288 */         this.p = this.J.nextFloat() * 360.0F;
/* 289 */         this.t = false;
/* 290 */         this.Z = true;
/*     */       } 
/*     */     } 
/*     */     
/* 294 */     if (this.l.v && aE() && cC().g() > 0.03D) {
/* 295 */       dcn ☃ = f(0.0F);
/* 296 */       float f1 = afm.b(this.p * 0.017453292F) * 0.3F;
/* 297 */       float f2 = afm.a(this.p * 0.017453292F) * 0.3F;
/* 298 */       float f3 = 1.2F - this.J.nextFloat() * 0.7F;
/* 299 */       for (int i = 0; i < 2; i++) {
/* 300 */         this.l.a(hh.af, cD() - ☃.b * f3 + f1, cE() - ☃.c, cH() - ☃.d * f3 + f2, 0.0D, 0.0D, 0.0D);
/* 301 */         this.l.a(hh.af, cD() - ☃.b * f3 - f1, cE() - ☃.c, cH() - ☃.d * f3 - f2, 0.0D, 0.0D, 0.0D);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(byte ☃) {
/* 308 */     if (☃ == 38) {
/* 309 */       a(hh.E);
/*     */     } else {
/* 311 */       super.a(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(hf ☃) {
/* 316 */     for (int i = 0; i < 7; i++) {
/* 317 */       double d1 = this.J.nextGaussian() * 0.01D;
/* 318 */       double d2 = this.J.nextGaussian() * 0.01D;
/* 319 */       double d3 = this.J.nextGaussian() * 0.01D;
/* 320 */       this.l.a(☃, d(1.0D), cF() + 0.2D, g(1.0D), d1, d2, d3);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected aou b(bfw ☃, aot aot1) {
/* 326 */     bmb bmb = ☃.b(aot1);
/*     */     
/* 328 */     if (!bmb.a() && bmb.b().a(aeg.T)) {
/* 329 */       if (!this.l.v) {
/* 330 */         a(adq.cH, 1.0F, 1.0F);
/*     */       }
/*     */       
/* 333 */       t(true);
/*     */       
/* 335 */       if (!☃.bC.d) {
/* 336 */         bmb.g(1);
/*     */       }
/*     */       
/* 339 */       return aou.a(this.l.v);
/*     */     } 
/*     */     
/* 342 */     return super.b(☃, aot1);
/*     */   }
/*     */   
/*     */   public static boolean b(aqe<baf> ☃, bry bry1, aqp aqp1, fx fx1, Random random) {
/* 346 */     if (fx1.v() <= 45 || fx1.v() >= bry1.t_()) {
/* 347 */       return false;
/*     */     }
/*     */     
/* 350 */     Optional<vj<bsv>> optional = bry1.i(fx1);
/* 351 */     return ((!Objects.equals(optional, Optional.of(btb.a)) || !Objects.equals(optional, Optional.of(btb.y))) && bry1.b(fx1).a(aef.b));
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 356 */     return adq.cI;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected adp dq() {
/* 362 */     return adq.cG;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected adp I() {
/* 368 */     return aE() ? adq.cE : adq.cD;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp aw() {
/* 373 */     return adq.cL;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp av() {
/* 378 */     return adq.cM;
/*     */   }
/*     */   
/*     */   protected boolean eN() {
/* 382 */     fx ☃ = x().h();
/* 383 */     if (☃ != null) {
/* 384 */       return ☃.a(cA(), 12.0D);
/*     */     }
/* 386 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void g(dcn ☃) {
/* 391 */     if (dS() && aE()) {
/* 392 */       a(dN(), ☃);
/* 393 */       a(aqr.a, cC());
/*     */       
/* 395 */       f(cC().a(0.9D));
/*     */       
/* 397 */       if (A() == null) {
/* 398 */         f(cC().b(0.0D, -0.005D, 0.0D));
/*     */       }
/*     */     } else {
/* 401 */       super.g(☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/* 407 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   static class a
/*     */     extends avb
/*     */   {
/*     */     private final baf i;
/*     */     
/*     */     public a(baf ☃) {
/* 417 */       super(☃);
/* 418 */       this.i = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 423 */       if (this.i.aE())
/*     */       {
/* 425 */         this.i.f(this.i.cC().b(0.0D, 0.005D, 0.0D));
/*     */       }
/*     */       
/* 428 */       if (this.h != avb.a.b || this.i.x().m()) {
/*     */         
/* 430 */         this.i.q(0.0F);
/* 431 */         this.i.v(0.0F);
/* 432 */         this.i.u(0.0F);
/* 433 */         this.i.t(0.0F);
/*     */         
/*     */         return;
/*     */       } 
/* 437 */       double ☃ = this.b - this.i.cD();
/* 438 */       double d1 = this.c - this.i.cE();
/* 439 */       double d2 = this.d - this.i.cH();
/* 440 */       double d3 = ☃ * ☃ + d1 * d1 + d2 * d2;
/*     */       
/* 442 */       if (d3 < 2.500000277905201E-7D) {
/* 443 */         this.a.t(0.0F);
/*     */         
/*     */         return;
/*     */       } 
/* 447 */       float f1 = (float)(afm.d(d2, ☃) * 57.2957763671875D) - 90.0F;
/* 448 */       this.i.p = a(this.i.p, f1, 10.0F);
/* 449 */       this.i.aA = this.i.p;
/* 450 */       this.i.aC = this.i.p;
/*     */       
/* 452 */       float f2 = (float)(this.e * this.i.b(arl.d));
/* 453 */       if (this.i.aE()) {
/* 454 */         this.i.q(f2 * 0.02F);
/* 455 */         float f3 = -((float)(afm.d(d1, afm.a(☃ * ☃ + d2 * d2)) * 57.2957763671875D));
/* 456 */         f3 = afm.a(afm.g(f3), -85.0F, 85.0F);
/*     */         
/* 458 */         this.i.q = a(this.i.q, f3, 5.0F);
/*     */         
/* 460 */         float f4 = afm.b(this.i.q * 0.017453292F);
/* 461 */         float f5 = afm.a(this.i.q * 0.017453292F);
/* 462 */         this.i.aT = f4 * f2;
/* 463 */         this.i.aS = -f5 * f2;
/*     */       } else {
/* 465 */         this.i.q(f2 * 0.1F);
/*     */       } 
/*     */     } }
/*     */   
/*     */   class d extends avv {
/*     */     private int b;
/*     */     
/*     */     private d(baf this$0) {}
/*     */     
/*     */     public boolean a() {
/* 475 */       if (this.b > this.a.K) {
/* 476 */         return false;
/*     */       }
/* 478 */       List<bcv> ☃ = this.a.l.a(bcv.class, this.a.cc().c(8.0D, 8.0D, 8.0D), baf.b);
/* 479 */       return (!☃.isEmpty() || !this.a.b(aqf.a).a());
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 484 */       List<bcv> ☃ = this.a.l.a(bcv.class, this.a.cc().c(8.0D, 8.0D, 8.0D), baf.b);
/* 485 */       if (!☃.isEmpty()) {
/* 486 */         this.a.x().a(☃.get(0), 1.2000000476837158D);
/* 487 */         this.a.a(adq.cK, 1.0F, 1.0F);
/*     */       } 
/* 489 */       this.b = 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 494 */       bmb ☃ = this.a.b(aqf.a);
/* 495 */       if (!☃.a()) {
/* 496 */         a(☃);
/* 497 */         this.a.a(aqf.a, bmb.b);
/* 498 */         this.b = this.a.K + baf.a(this.a).nextInt(100);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 504 */       List<bcv> ☃ = this.a.l.a(bcv.class, this.a.cc().c(8.0D, 8.0D, 8.0D), baf.b);
/*     */       
/* 506 */       bmb bmb = this.a.b(aqf.a);
/* 507 */       if (!bmb.a()) {
/* 508 */         a(bmb);
/* 509 */         this.a.a(aqf.a, bmb.b);
/* 510 */       } else if (!☃.isEmpty()) {
/* 511 */         this.a.x().a(☃.get(0), 1.2000000476837158D);
/*     */       } 
/*     */     }
/*     */     
/*     */     private void a(bmb ☃) {
/* 516 */       if (☃.a()) {
/*     */         return;
/*     */       }
/*     */       
/* 520 */       double d1 = this.a.cG() - 0.30000001192092896D;
/* 521 */       bcv bcv = new bcv(this.a.l, this.a.cD(), d1, this.a.cH(), ☃);
/* 522 */       bcv.a(40);
/*     */       
/* 524 */       bcv.c(this.a.bS());
/*     */       
/* 526 */       float f1 = 0.3F;
/* 527 */       float f2 = baf.b(this.a).nextFloat() * 6.2831855F;
/* 528 */       float f3 = 0.02F * baf.c(this.a).nextFloat();
/* 529 */       bcv.n((0.3F * 
/* 530 */           -afm.a(this.a.p * 0.017453292F) * afm.b(this.a.q * 0.017453292F) + afm.b(f2) * f3), (0.3F * 
/* 531 */           afm.a(this.a.q * 0.017453292F) * 1.5F), (0.3F * 
/* 532 */           afm.b(this.a.p * 0.017453292F) * afm.b(this.a.q * 0.017453292F) + afm.a(f2) * f3));
/*     */ 
/*     */       
/* 535 */       this.a.l.c(bcv);
/*     */     }
/*     */   }
/*     */   
/*     */   static class c extends avv {
/*     */     private final baf a;
/*     */     private final double b;
/*     */     private bfw c;
/*     */     
/*     */     c(baf ☃, double d) {
/* 545 */       this.a = ☃;
/* 546 */       this.b = d;
/* 547 */       a(EnumSet.of(avv.a.a, avv.a.b));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 552 */       this.c = this.a.l.a(baf.eO(), this.a);
/* 553 */       if (this.c == null) {
/* 554 */         return false;
/*     */       }
/* 556 */       return (this.c.bB() && this.a.A() != this.c);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 561 */       return (this.c != null && this.c.bB() && this.a.h(this.c) < 256.0D);
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 566 */       this.c.c(new apu(apw.D, 100));
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 571 */       this.c = null;
/* 572 */       this.a.x().o();
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 577 */       this.a.t().a(this.c, (this.a.Q() + 20), this.a.O());
/* 578 */       if (this.a.h(this.c) < 6.25D) {
/* 579 */         this.a.x().o();
/*     */       } else {
/* 581 */         this.a.x().a(this.c, this.b);
/*     */       } 
/*     */       
/* 584 */       if (this.c.bB() && this.c.l.t.nextInt(6) == 0)
/* 585 */         this.c.c(new apu(apw.D, 100)); 
/*     */     }
/*     */   }
/*     */   
/*     */   static class b
/*     */     extends avv {
/*     */     private final baf a;
/*     */     private boolean b;
/*     */     
/*     */     b(baf ☃) {
/* 595 */       this.a = ☃;
/* 596 */       a(EnumSet.of(avv.a.a, avv.a.b));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean C_() {
/* 601 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 606 */       return (this.a.eK() && this.a.bI() >= 100);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 611 */       fx ☃ = this.a.m(); return (
/* 612 */         !(new fx(☃.u(), this.a.cE(), ☃.w())).a(this.a.cA(), 4.0D) && !this.b && this.a.bI() >= 100);
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 617 */       if (!(this.a.l instanceof aag)) {
/*     */         return;
/*     */       }
/* 620 */       aag ☃ = (aag)this.a.l;
/* 621 */       this.b = false;
/* 622 */       this.a.x().o();
/*     */       
/* 624 */       fx fx1 = this.a.cB();
/*     */       
/* 626 */       cla<?> cla = (☃.t.nextFloat() >= 0.5D) ? cla.m : cla.i;
/* 627 */       fx fx2 = ☃.a(cla, fx1, 50, false);
/* 628 */       if (fx2 == null) {
/* 629 */         cla<?> cla1 = cla.equals(cla.m) ? cla.i : cla.m;
/* 630 */         fx fx = ☃.a(cla1, fx1, 50, false);
/* 631 */         if (fx != null) {
/* 632 */           this.a.g(fx);
/*     */         } else {
/*     */           
/* 635 */           this.b = true;
/*     */           return;
/*     */         } 
/*     */       } else {
/* 639 */         this.a.g(fx2);
/*     */       } 
/*     */       
/* 642 */       ☃.a(this.a, (byte)38);
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 647 */       fx ☃ = this.a.m();
/* 648 */       if ((new fx(☃.u(), this.a.cE(), ☃.w())).a(this.a.cA(), 4.0D) || this.b) {
/* 649 */         this.a.t(false);
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 655 */       brx ☃ = this.a.l;
/*     */       
/* 657 */       if (this.a.eN() || this.a.x().m()) {
/* 658 */         dcn dcn1 = dcn.a(this.a.m());
/* 659 */         dcn dcn2 = azj.a(this.a, 16, 1, dcn1, 0.39269909262657166D);
/* 660 */         if (dcn2 == null) {
/* 661 */           dcn2 = azj.b(this.a, 8, 4, dcn1);
/*     */         }
/*     */         
/* 664 */         if (dcn2 != null) {
/* 665 */           fx fx = new fx(dcn2);
/* 666 */           if (!☃.b(fx).a(aef.b) || !☃.d_(fx).a(☃, fx, cxe.b)) {
/* 667 */             dcn2 = azj.b(this.a, 8, 5, dcn1);
/*     */           }
/*     */         } 
/*     */         
/* 671 */         if (dcn2 == null) {
/* 672 */           this.b = true;
/*     */           
/*     */           return;
/*     */         } 
/* 676 */         this.a.t().a(dcn2.b, dcn2.c, dcn2.d, (this.a.Q() + 20), this.a.O());
/* 677 */         this.a.x().a(dcn2.b, dcn2.c, dcn2.d, 1.3D);
/*     */         
/* 679 */         if (☃.t.nextInt(80) == 0)
/* 680 */           ☃.a(this.a, (byte)38); 
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\baf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */