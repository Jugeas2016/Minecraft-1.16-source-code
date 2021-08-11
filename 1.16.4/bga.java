/*     */ import com.google.common.collect.Lists;
/*     */ import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
/*     */ import java.util.Arrays;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class bga
/*     */   extends bgm
/*     */ {
/*     */   public enum a
/*     */   {
/*  55 */     a, b, c;
/*     */     
/*     */     public static a a(int ☃) {
/*  58 */       if (☃ < 0 || ☃ > (values()).length) {
/*  59 */         ☃ = 0;
/*     */       }
/*     */       
/*  62 */       return values()[☃];
/*     */     }
/*     */   }
/*     */   
/*  66 */   private static final us<Byte> f = uv.a((Class)bga.class, uu.a);
/*  67 */   private static final us<Byte> g = uv.a((Class)bga.class, uu.a);
/*     */   
/*     */   @Nullable
/*     */   private ceh ag;
/*     */   
/*     */   protected boolean b;
/*     */   
/*     */   protected int c;
/*     */   
/*  76 */   public a d = a.a;
/*     */   public int e;
/*     */   private int ah;
/*  79 */   private double ai = 2.0D;
/*     */   
/*     */   private int aj;
/*     */   private adp ak;
/*     */   private IntOpenHashSet al;
/*     */   private List<aqa> am;
/*     */   
/*     */   protected bga(aqe<? extends bga> ☃, brx brx1) {
/*  87 */     super((aqe)☃, brx1);
/*     */     
/*  89 */     this.ak = i();
/*     */   }
/*     */   
/*     */   protected bga(aqe<? extends bga> ☃, double d1, double d2, double d3, brx brx1) {
/*  93 */     this(☃, brx1);
/*     */     
/*  95 */     d(d1, d2, d3);
/*     */   }
/*     */   
/*     */   protected bga(aqe<? extends bga> ☃, aqm aqm1, brx brx1) {
/*  99 */     this(☃, aqm1.cD(), aqm1.cG() - 0.10000000149011612D, aqm1.cH(), brx1);
/*     */     
/* 101 */     b(aqm1);
/*     */     
/* 103 */     if (aqm1 instanceof bfw) {
/* 104 */       this.d = a.b;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(adp ☃) {
/* 113 */     this.ak = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃) {
/* 118 */     double d = cc().a() * 10.0D;
/* 119 */     if (Double.isNaN(d)) {
/* 120 */       d = 1.0D;
/*     */     }
/* 122 */     d *= 64.0D * bW();
/* 123 */     return (☃ < d * d);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 128 */     this.R.a(f, Byte.valueOf((byte)0));
/* 129 */     this.R.a(g, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(double ☃, double d1, double d2, float f1, float f2) {
/* 134 */     super.c(☃, d1, d2, f1, f2);
/* 135 */     this.ah = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(double ☃, double d1, double d2, float f1, float f2, int i, boolean bool) {
/* 140 */     d(☃, d1, d2);
/* 141 */     a(f1, f2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void k(double ☃, double d1, double d2) {
/* 146 */     super.k(☃, d1, d2);
/* 147 */     this.ah = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 152 */     super.j();
/*     */     
/* 154 */     boolean ☃ = t();
/*     */     
/* 156 */     dcn dcn1 = cC();
/* 157 */     if (this.s == 0.0F && this.r == 0.0F) {
/* 158 */       float f = afm.a(c(dcn1));
/* 159 */       this.p = (float)(afm.d(dcn1.b, dcn1.d) * 57.2957763671875D);
/* 160 */       this.q = (float)(afm.d(dcn1.c, f) * 57.2957763671875D);
/* 161 */       this.r = this.p;
/* 162 */       this.s = this.q;
/*     */     } 
/*     */     
/* 165 */     fx fx = cB();
/* 166 */     ceh ceh1 = this.l.d_(fx);
/* 167 */     if (!ceh1.g() && !☃) {
/* 168 */       ddh ddh = ceh1.k(this.l, fx);
/* 169 */       if (!ddh.b()) {
/* 170 */         dcn dcn = cA();
/* 171 */         for (dci dci : ddh.d()) {
/* 172 */           if (dci.a(fx).d(dcn)) {
/* 173 */             this.b = true;
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 180 */     if (this.e > 0) {
/* 181 */       this.e--;
/*     */     }
/*     */     
/* 184 */     if (aF()) {
/* 185 */       am();
/*     */     }
/*     */     
/* 188 */     if (this.b && !☃) {
/* 189 */       if (this.ag != ceh1 && u()) {
/* 190 */         z();
/* 191 */       } else if (!this.l.v) {
/* 192 */         h();
/*     */       } 
/*     */       
/* 195 */       this.c++;
/*     */       return;
/*     */     } 
/* 198 */     this.c = 0;
/*     */ 
/*     */     
/* 201 */     dcn dcn2 = cA();
/* 202 */     dcn dcn3 = dcn2.e(dcn1);
/* 203 */     dcl dcl = this.l.a(new brf(dcn2, dcn3, brf.a.a, brf.b.a, this));
/*     */     
/* 205 */     if (dcl.c() != dcl.a.a) {
/* 206 */       dcn3 = dcl.e();
/*     */     }
/*     */ 
/*     */     
/* 210 */     while (!this.y) {
/* 211 */       dck dck = a(dcn2, dcn3);
/*     */       
/* 213 */       if (dck != null) {
/* 214 */         dcl = dck;
/*     */       }
/*     */       
/* 217 */       if (dcl != null && dcl.c() == dcl.a.c) {
/* 218 */         aqa aqa1 = ((dck)dcl).a();
/* 219 */         aqa aqa2 = v();
/* 220 */         if (aqa1 instanceof bfw && aqa2 instanceof bfw && !((bfw)aqa2).a((bfw)aqa1)) {
/* 221 */           dcl = null;
/* 222 */           dck = null;
/*     */         } 
/*     */       } 
/*     */       
/* 226 */       if (dcl != null && !☃) {
/* 227 */         a(dcl);
/* 228 */         this.Z = true;
/*     */       } 
/*     */       
/* 231 */       if (dck == null || r() <= 0) {
/*     */         break;
/*     */       }
/* 234 */       dcl = null;
/*     */     } 
/*     */     
/* 237 */     dcn1 = cC();
/* 238 */     double d1 = dcn1.b;
/* 239 */     double d2 = dcn1.c;
/* 240 */     double d3 = dcn1.d;
/*     */     
/* 242 */     if (p()) {
/* 243 */       for (int i = 0; i < 4; i++) {
/* 244 */         this.l.a(hh.g, cD() + d1 * i / 4.0D, cE() + d2 * i / 4.0D, cH() + d3 * i / 4.0D, -d1, -d2 + 0.2D, -d3);
/*     */       }
/*     */     }
/*     */     
/* 248 */     double d4 = cD() + d1;
/* 249 */     double d5 = cE() + d2;
/* 250 */     double d6 = cH() + d3;
/*     */     
/* 252 */     float f1 = afm.a(c(dcn1));
/* 253 */     if (☃) {
/* 254 */       this.p = (float)(afm.d(-d1, -d3) * 57.2957763671875D);
/*     */     } else {
/* 256 */       this.p = (float)(afm.d(d1, d3) * 57.2957763671875D);
/*     */     } 
/* 258 */     this.q = (float)(afm.d(d2, f1) * 57.2957763671875D);
/*     */     
/* 260 */     this.q = e(this.s, this.q);
/* 261 */     this.p = e(this.r, this.p);
/*     */     
/* 263 */     float f2 = 0.99F;
/* 264 */     float f3 = 0.05F;
/*     */     
/* 266 */     if (aE()) {
/* 267 */       for (int i = 0; i < 4; i++) {
/* 268 */         float f = 0.25F;
/* 269 */         this.l.a(hh.e, d4 - d1 * 0.25D, d5 - d2 * 0.25D, d6 - d3 * 0.25D, d1, d2, d3);
/*     */       } 
/* 271 */       f2 = s();
/*     */     } 
/*     */     
/* 274 */     f(dcn1.a(f2));
/*     */     
/* 276 */     if (!aB() && !☃) {
/* 277 */       dcn dcn = cC();
/* 278 */       n(dcn.b, dcn.c - 0.05000000074505806D, dcn.d);
/*     */     } 
/*     */     
/* 281 */     d(d4, d5, d6);
/*     */     
/* 283 */     ay();
/*     */   }
/*     */   
/*     */   private boolean u() {
/* 287 */     return (this.b && this.l.b((new dci(cA(), cA())).g(0.06D)));
/*     */   }
/*     */   
/*     */   private void z() {
/* 291 */     this.b = false;
/* 292 */     dcn ☃ = cC();
/* 293 */     f(☃.d((this.J
/* 294 */           .nextFloat() * 0.2F), (this.J
/* 295 */           .nextFloat() * 0.2F), (this.J
/* 296 */           .nextFloat() * 0.2F)));
/*     */     
/* 298 */     this.ah = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqr ☃, dcn dcn1) {
/* 303 */     super.a(☃, dcn1);
/* 304 */     if (☃ != aqr.a && u()) {
/* 305 */       z();
/*     */     }
/*     */   }
/*     */   
/*     */   protected void h() {
/* 310 */     this.ah++;
/* 311 */     if (this.ah >= 1200) {
/* 312 */       ad();
/*     */     }
/*     */   }
/*     */   
/*     */   private void A() {
/* 317 */     if (this.am != null) {
/* 318 */       this.am.clear();
/*     */     }
/* 320 */     if (this.al != null) {
/* 321 */       this.al.clear();
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(dck ☃) {
/*     */     apk apk;
/* 327 */     super.a(☃);
/* 328 */     aqa aqa1 = ☃.a();
/* 329 */     float f = (float)cC().f();
/* 330 */     int i = afm.f(afm.a(f * this.ai, 0.0D, 2.147483647E9D));
/*     */     
/* 332 */     if (r() > 0) {
/* 333 */       if (this.al == null) {
/* 334 */         this.al = new IntOpenHashSet(5);
/*     */       }
/*     */       
/* 337 */       if (this.am == null) {
/* 338 */         this.am = Lists.newArrayListWithCapacity(5);
/*     */       }
/*     */ 
/*     */       
/* 342 */       if (this.al.size() < r() + 1) {
/* 343 */         this.al.add(aqa1.Y());
/*     */       } else {
/* 345 */         ad();
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/* 350 */     if (p()) {
/* 351 */       long l = this.J.nextInt(i / 2 + 2);
/* 352 */       i = (int)Math.min(l + i, 2147483647L);
/*     */     } 
/*     */ 
/*     */     
/* 356 */     aqa aqa2 = v();
/* 357 */     if (aqa2 == null) {
/* 358 */       apk = apk.a(this, this);
/*     */     } else {
/* 360 */       apk = apk.a(this, aqa2);
/* 361 */       if (aqa2 instanceof aqm) {
/* 362 */         ((aqm)aqa2).z(aqa1);
/*     */       }
/*     */     } 
/*     */     
/* 366 */     boolean bool = (aqa1.X() == aqe.u);
/* 367 */     int j = aqa1.al();
/*     */ 
/*     */     
/* 370 */     if (bq() && !bool) {
/* 371 */       aqa1.f(5);
/*     */     }
/*     */     
/* 374 */     if (aqa1.a(apk, i)) {
/*     */       
/* 376 */       if (bool) {
/*     */         return;
/*     */       }
/* 379 */       if (aqa1 instanceof aqm) {
/* 380 */         aqm aqm = (aqm)aqa1;
/*     */         
/* 382 */         if (!this.l.v && r() <= 0) {
/* 383 */           aqm.p(aqm.dy() + 1);
/*     */         }
/*     */         
/* 386 */         if (this.aj > 0) {
/* 387 */           dcn dcn = cC().d(1.0D, 0.0D, 1.0D).d().a(this.aj * 0.6D);
/* 388 */           if (dcn.g() > 0.0D) {
/* 389 */             aqm.i(dcn.b, 0.1D, dcn.d);
/*     */           }
/*     */         } 
/*     */         
/* 393 */         if (!this.l.v && aqa2 instanceof aqm) {
/* 394 */           bpu.a(aqm, aqa2);
/* 395 */           bpu.b((aqm)aqa2, aqm);
/*     */         } 
/*     */         
/* 398 */         a(aqm);
/*     */         
/* 400 */         if (aqa2 != null && aqm != aqa2 && aqm instanceof bfw && aqa2 instanceof aah && !aA()) {
/* 401 */           ((aah)aqa2).b.a(new pq(pq.g, 0.0F));
/*     */         }
/*     */         
/* 404 */         if (!aqa1.aX() && this.am != null) {
/* 405 */           this.am.add(aqm);
/*     */         }
/*     */         
/* 408 */         if (!this.l.v && aqa2 instanceof aah) {
/* 409 */           aah aah = (aah)aqa2;
/* 410 */           if (this.am != null && q()) {
/* 411 */             ac.G.a(aah, this.am);
/*     */           }
/* 413 */           else if (!aqa1.aX() && q()) {
/* 414 */             ac.G.a(aah, Arrays.asList(new aqa[] { aqa1 }));
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 419 */       a(this.ak, 1.0F, 1.2F / (this.J.nextFloat() * 0.2F + 0.9F));
/* 420 */       if (r() <= 0) {
/* 421 */         ad();
/*     */       }
/*     */     } else {
/*     */       
/* 425 */       aqa1.g(j);
/*     */       
/* 427 */       f(cC().a(-0.1D));
/* 428 */       this.p += 180.0F;
/* 429 */       this.r += 180.0F;
/*     */       
/* 431 */       if (!this.l.v && cC().g() < 1.0E-7D) {
/* 432 */         if (this.d == a.b) {
/* 433 */           a(m(), 0.1F);
/*     */         }
/* 435 */         ad();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dcj ☃) {
/* 442 */     this.ag = this.l.d_(☃.a());
/* 443 */     super.a(☃);
/*     */     
/* 445 */     dcn dcn1 = ☃.e().a(cD(), cE(), cH());
/* 446 */     f(dcn1);
/*     */     
/* 448 */     dcn dcn2 = dcn1.d().a(0.05000000074505806D);
/* 449 */     o(cD() - dcn2.b, cE() - dcn2.c, cH() - dcn2.d);
/*     */     
/* 451 */     a(k(), 1.0F, 1.2F / (this.J.nextFloat() * 0.2F + 0.9F));
/* 452 */     this.b = true;
/* 453 */     this.e = 7;
/* 454 */     a(false);
/* 455 */     b((byte)0);
/* 456 */     a(adq.W);
/* 457 */     p(false);
/* 458 */     A();
/*     */   }
/*     */   
/*     */   protected adp i() {
/* 462 */     return adq.W;
/*     */   }
/*     */   
/*     */   protected final adp k() {
/* 466 */     return this.ak;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(aqm ☃) {}
/*     */   
/*     */   @Nullable
/*     */   protected dck a(dcn ☃, dcn dcn1) {
/* 474 */     return bgn.a(this.l, this, ☃, dcn1, cc().b(cC()).g(1.0D), this::a);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(aqa ☃) {
/* 479 */     return (super.a(☃) && (this.al == null || !this.al.contains(☃.Y())));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 484 */     super.b(☃);
/*     */     
/* 486 */     ☃.a("life", (short)this.ah);
/*     */     
/* 488 */     if (this.ag != null) {
/* 489 */       ☃.a("inBlockState", mp.a(this.ag));
/*     */     }
/*     */     
/* 492 */     ☃.a("shake", (byte)this.e);
/* 493 */     ☃.a("inGround", this.b);
/* 494 */     ☃.a("pickup", (byte)this.d.ordinal());
/* 495 */     ☃.a("damage", this.ai);
/* 496 */     ☃.a("crit", p());
/* 497 */     ☃.a("PierceLevel", r());
/* 498 */     ☃.a("SoundEvent", gm.N.b(this.ak).toString());
/* 499 */     ☃.a("ShotFromCrossbow", q());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 504 */     super.a(☃);
/*     */     
/* 506 */     this.ah = ☃.g("life");
/* 507 */     if (☃.c("inBlockState", 10)) {
/* 508 */       this.ag = mp.c(☃.p("inBlockState"));
/*     */     }
/* 510 */     this.e = ☃.f("shake") & 0xFF;
/* 511 */     this.b = ☃.q("inGround");
/* 512 */     if (☃.c("damage", 99)) {
/* 513 */       this.ai = ☃.k("damage");
/*     */     }
/*     */     
/* 516 */     if (☃.c("pickup", 99)) {
/* 517 */       this.d = a.a(☃.f("pickup"));
/* 518 */     } else if (☃.c("player", 99)) {
/* 519 */       this.d = ☃.q("player") ? a.b : a.a;
/*     */     } 
/* 521 */     a(☃.q("crit"));
/* 522 */     b(☃.f("PierceLevel"));
/*     */     
/* 524 */     if (☃.c("SoundEvent", 8)) {
/* 525 */       this.ak = gm.N.b(new vk(☃.l("SoundEvent"))).orElse(i());
/*     */     }
/*     */     
/* 528 */     p(☃.q("ShotFromCrossbow"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(@Nullable aqa ☃) {
/* 533 */     super.b(☃);
/*     */     
/* 535 */     if (☃ instanceof bfw) {
/* 536 */       this.d = ((bfw)☃).bC.d ? a.c : a.b;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a_(bfw ☃) {
/* 542 */     if (this.l.v || (!this.b && !t()) || this.e > 0) {
/*     */       return;
/*     */     }
/*     */     
/* 546 */     boolean bool = (this.d == a.b || (this.d == a.c && ☃.bC.d) || (t() && v().bS() == ☃.bS()));
/*     */     
/* 548 */     if (this.d == a.b && 
/* 549 */       !☃.bm.e(m())) {
/* 550 */       bool = false;
/*     */     }
/*     */ 
/*     */     
/* 554 */     if (bool) {
/* 555 */       ☃.a(this, 1);
/* 556 */       ad();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract bmb m();
/*     */   
/*     */   protected boolean aC() {
/* 564 */     return false;
/*     */   }
/*     */   
/*     */   public void h(double ☃) {
/* 568 */     this.ai = ☃;
/*     */   }
/*     */   
/*     */   public double n() {
/* 572 */     return this.ai;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 576 */     this.aj = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean bL() {
/* 585 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float a(aqx ☃, aqb aqb1) {
/* 590 */     return 0.13F;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 594 */     a(1, ☃);
/*     */   }
/*     */   
/*     */   public void b(byte ☃) {
/* 598 */     this.R.b(g, Byte.valueOf(☃));
/*     */   }
/*     */   
/*     */   private void a(int ☃, boolean bool) {
/* 602 */     byte b = ((Byte)this.R.<Byte>a(f)).byteValue();
/* 603 */     if (bool) {
/* 604 */       this.R.b(f, Byte.valueOf((byte)(b | ☃)));
/*     */     } else {
/* 606 */       this.R.b(f, Byte.valueOf((byte)(b & (☃ ^ 0xFFFFFFFF))));
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean p() {
/* 611 */     byte ☃ = ((Byte)this.R.<Byte>a(f)).byteValue();
/* 612 */     return ((☃ & 0x1) != 0);
/*     */   }
/*     */   
/*     */   public boolean q() {
/* 616 */     byte ☃ = ((Byte)this.R.<Byte>a(f)).byteValue();
/* 617 */     return ((☃ & 0x4) != 0);
/*     */   }
/*     */   
/*     */   public byte r() {
/* 621 */     return ((Byte)this.R.<Byte>a(g)).byteValue();
/*     */   }
/*     */   
/*     */   public void a(aqm ☃, float f) {
/* 625 */     int i = bpu.a(bpw.x, ☃);
/* 626 */     int j = bpu.a(bpw.y, ☃);
/* 627 */     h((f * 2.0F) + this.J.nextGaussian() * 0.25D + (this.l.ad().a() * 0.11F));
/*     */     
/* 629 */     if (i > 0) {
/* 630 */       h(n() + i * 0.5D + 0.5D);
/*     */     }
/* 632 */     if (j > 0) {
/* 633 */       a(j);
/*     */     }
/* 635 */     if (bpu.a(bpw.z, ☃) > 0) {
/* 636 */       f(100);
/*     */     }
/*     */   }
/*     */   
/*     */   protected float s() {
/* 641 */     return 0.6F;
/*     */   }
/*     */   
/*     */   public void o(boolean ☃) {
/* 645 */     this.H = ☃;
/* 646 */     a(2, ☃);
/*     */   }
/*     */   
/*     */   public boolean t() {
/* 650 */     if (!this.l.v) {
/* 651 */       return this.H;
/*     */     }
/* 653 */     return ((((Byte)this.R.<Byte>a(f)).byteValue() & 0x2) != 0);
/*     */   }
/*     */   
/*     */   public void p(boolean ☃) {
/* 657 */     a(4, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public oj<?> P() {
/* 662 */     aqa ☃ = v();
/* 663 */     return new on(this, (☃ == null) ? 0 : ☃.Y());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bga.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */