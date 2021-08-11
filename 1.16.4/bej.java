/*     */ import java.time.LocalDate;
/*     */ import java.time.temporal.ChronoField;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.UUID;
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
/*     */ public class bej
/*     */   extends bdq
/*     */ {
/*  73 */   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
/*  74 */   private static final arj c = new arj(b, "Baby speed boost", 0.5D, arj.a.b);
/*     */   
/*  76 */   private static final us<Boolean> d = uv.a((Class)bej.class, uu.i);
/*  77 */   private static final us<Integer> bo = uv.a((Class)bej.class, uu.b);
/*  78 */   private static final us<Boolean> bp = uv.a((Class)bej.class, uu.i);
/*     */ 
/*     */   
/*     */   private static final Predicate<aor> bq;
/*     */ 
/*     */   
/*     */   static {
/*  85 */     bq = (☃ -> (☃ == aor.d));
/*  86 */   } private final avg br = new avg(this, bq);
/*     */   
/*     */   private boolean bs;
/*     */   private int bt;
/*     */   private int bu;
/*     */   
/*     */   public bej(aqe<? extends bej> ☃, brx brx1) {
/*  93 */     super((aqe)☃, brx1);
/*     */   }
/*     */   
/*     */   public bej(brx ☃) {
/*  97 */     this(aqe.aY, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/* 102 */     this.bk.a(4, new a(this, this, 1.0D, 3));
/* 103 */     this.bk.a(8, new awd(this, (Class)bfw.class, 8.0F));
/* 104 */     this.bk.a(8, new aws(this));
/*     */     
/* 106 */     m();
/*     */   }
/*     */   
/*     */   protected void m() {
/* 110 */     this.bk.a(2, new axm(this, 1.0D, false));
/* 111 */     this.bk.a(6, new awi(this, 1.0D, true, 4, this::eU));
/* 112 */     this.bk.a(7, new axk(this, 1.0D));
/*     */     
/* 114 */     this.bl.a(1, (new axp(this, new Class[0])).a(new Class[] { bel.class }));
/* 115 */     this.bl.a(2, new axq<>(this, bfw.class, true));
/* 116 */     this.bl.a(3, new axq<>(this, bfe.class, false));
/* 117 */     this.bl.a(3, new axq<>(this, bai.class, true));
/* 118 */     this.bl.a(5, new axq<>(this, bax.class, 10, true, false, bax.bo));
/*     */   }
/*     */   
/*     */   public static ark.a eS() {
/* 122 */     return bdq.eR()
/* 123 */       .a(arl.b, 35.0D)
/* 124 */       .a(arl.d, 0.23000000417232513D)
/* 125 */       .a(arl.f, 3.0D)
/* 126 */       .a(arl.i, 2.0D)
/* 127 */       .a(arl.l);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 132 */     super.e();
/*     */     
/* 134 */     ab().a(d, Boolean.valueOf(false));
/* 135 */     ab().a(bo, Integer.valueOf(0));
/* 136 */     ab().a(bp, Boolean.valueOf(false));
/*     */   }
/*     */   
/*     */   public boolean eT() {
/* 140 */     return ((Boolean)ab().<Boolean>a(bp)).booleanValue();
/*     */   }
/*     */   
/*     */   public boolean eU() {
/* 144 */     return this.bs;
/*     */   }
/*     */   
/*     */   public void u(boolean ☃) {
/* 148 */     if (eK() && azi.a(this)) {
/* 149 */       if (this.bs != ☃) {
/* 150 */         this.bs = ☃;
/* 151 */         ((ayi)x()).a(☃);
/*     */         
/* 153 */         if (☃) {
/* 154 */           this.bk.a(1, this.br);
/*     */         } else {
/* 156 */           this.bk.a(this.br);
/*     */         }
/*     */       
/*     */       } 
/* 160 */     } else if (this.bs) {
/* 161 */       this.bk.a(this.br);
/* 162 */       this.bs = false;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean eK() {
/* 168 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean w_() {
/* 173 */     return ((Boolean)ab().<Boolean>a(d)).booleanValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected int d(bfw ☃) {
/* 178 */     if (w_()) {
/* 179 */       this.f = (int)(this.f * 2.5F);
/*     */     }
/*     */     
/* 182 */     return super.d(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(boolean ☃) {
/* 187 */     ab().b(d, Boolean.valueOf(☃));
/*     */     
/* 189 */     if (this.l != null && !this.l.v) {
/* 190 */       arh arh = a(arl.d);
/* 191 */       arh.d(c);
/* 192 */       if (☃) {
/* 193 */         arh.b(c);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(us<?> ☃) {
/* 200 */     if (d.equals(☃)) {
/* 201 */       x_();
/*     */     }
/*     */     
/* 204 */     super.a(☃);
/*     */   }
/*     */   
/*     */   protected boolean eN() {
/* 208 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 213 */     if (!this.l.v && aX() && !eD()) {
/* 214 */       if (eT()) {
/* 215 */         this.bu--;
/*     */         
/* 217 */         if (this.bu < 0) {
/* 218 */           eP();
/*     */         }
/* 220 */       } else if (eN()) {
/* 221 */         if (a(aef.b)) {
/* 222 */           this.bt++;
/*     */           
/* 224 */           if (this.bt >= 600) {
/* 225 */             a(300);
/*     */           }
/*     */         } else {
/* 228 */           this.bt = -1;
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 233 */     super.j();
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 238 */     if (aX()) {
/* 239 */       boolean ☃ = (T_() && eG());
/* 240 */       if (☃) {
/* 241 */         bmb bmb = b(aqf.f);
/* 242 */         if (!bmb.a()) {
/* 243 */           if (bmb.e()) {
/* 244 */             bmb.b(bmb.g() + this.J.nextInt(2));
/* 245 */             if (bmb.g() >= bmb.h()) {
/* 246 */               c(aqf.f);
/* 247 */               a(aqf.f, bmb.b);
/*     */             } 
/*     */           } 
/*     */           
/* 251 */           ☃ = false;
/*     */         } 
/*     */         
/* 254 */         if (☃) {
/* 255 */           f(8);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 260 */     super.k();
/*     */   }
/*     */   
/*     */   private void a(int ☃) {
/* 264 */     this.bu = ☃;
/* 265 */     ab().b(bp, Boolean.valueOf(true));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void eP() {
/* 270 */     b((aqe)aqe.q);
/* 271 */     if (!aA()) {
/* 272 */       this.l.a((bfw)null, 1040, cB(), 0);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void b(aqe<? extends bej> ☃) {
/* 277 */     bej bej1 = a((aqe)☃, true);
/* 278 */     if (bej1 != null) {
/* 279 */       bej1.y(bej1.l.d(bej1.cB()).d());
/* 280 */       bej1.u((bej1.eK() && eU()));
/*     */     } 
/*     */   }
/*     */   
/*     */   protected boolean T_() {
/* 285 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 290 */     if (!super.a(☃, f)) {
/* 291 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 295 */     if (!(this.l instanceof aag)) {
/* 296 */       return false;
/*     */     }
/*     */     
/* 299 */     aag aag = (aag)this.l;
/*     */     
/* 301 */     aqm aqm = A();
/* 302 */     if (aqm == null && ☃.k() instanceof aqm) {
/* 303 */       aqm = (aqm)☃.k();
/*     */     }
/*     */     
/* 306 */     if (aqm != null && this.l.ad() == aor.d && this.J.nextFloat() < b(arl.l) && this.l.V().b(brt.d)) {
/* 307 */       int i = afm.c(cD());
/* 308 */       int j = afm.c(cE());
/* 309 */       int k = afm.c(cH());
/* 310 */       bej bej1 = new bej(this.l);
/*     */       
/* 312 */       for (int m = 0; m < 50; m++) {
/* 313 */         int n = i + afm.a(this.J, 7, 40) * afm.a(this.J, -1, 1);
/* 314 */         int i1 = j + afm.a(this.J, 7, 40) * afm.a(this.J, -1, 1);
/* 315 */         int i2 = k + afm.a(this.J, 7, 40) * afm.a(this.J, -1, 1);
/*     */         
/* 317 */         fx fx = new fx(n, i1, i2);
/* 318 */         aqe<?> aqe = bej1.X();
/* 319 */         ard.c c = ard.a(aqe);
/*     */         
/* 321 */         if (bsg.a(c, this.l, fx, aqe) && 
/* 322 */           ard.a(aqe, aag, aqp.j, fx, this.l.t)) {
/* 323 */           bej1.d(n, i1, i2);
/*     */ 
/*     */           
/* 326 */           if (!this.l.a(n, i1, i2, 7.0D) && this.l.j(bej1) && this.l.k(bej1) && !this.l.d(bej1.cc())) {
/* 327 */             bej1.h(aqm);
/* 328 */             bej1.a(aag, this.l.d(bej1.cB()), aqp.j, (arc)null, (md)null);
/* 329 */             aag.l(bej1);
/*     */             
/* 331 */             a(arl.l).c(new arj("Zombie reinforcement caller charge", -0.05000000074505806D, arj.a.a));
/* 332 */             bej1.a(arl.l).c(new arj("Zombie reinforcement callee charge", -0.05000000074505806D, arj.a.a));
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 339 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean B(aqa ☃) {
/* 344 */     boolean bool = super.B(☃);
/*     */     
/* 346 */     if (bool) {
/* 347 */       float f = this.l.d(cB()).b();
/*     */ 
/*     */       
/* 350 */       if (dD().a() && 
/* 351 */         bq() && this.J.nextFloat() < f * 0.3F) {
/* 352 */         ☃.f(2 * (int)f);
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 357 */     return bool;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 362 */     return adq.rH;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 367 */     return adq.rR;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 372 */     return adq.rM;
/*     */   }
/*     */   
/*     */   protected adp eL() {
/* 376 */     return adq.rX;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(fx ☃, ceh ceh1) {
/* 381 */     a(eL(), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public aqq dC() {
/* 386 */     return aqq.b;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(aos ☃) {
/* 391 */     super.a(☃);
/*     */     
/* 393 */     if (this.J.nextFloat() < ((this.l.ad() == aor.d) ? 0.05F : 0.01F)) {
/* 394 */       int i = this.J.nextInt(3);
/* 395 */       if (i == 0) {
/* 396 */         a(aqf.a, new bmb(bmd.kA));
/*     */       } else {
/* 398 */         a(aqf.a, new bmb(bmd.kB));
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 405 */     super.b(☃);
/*     */     
/* 407 */     ☃.a("IsBaby", w_());
/* 408 */     ☃.a("CanBreakDoors", eU());
/*     */     
/* 410 */     ☃.b("InWaterTime", aE() ? this.bt : -1);
/* 411 */     ☃.b("DrownedConversionTime", eT() ? this.bu : -1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 416 */     super.a(☃);
/*     */     
/* 418 */     a(☃.q("IsBaby"));
/* 419 */     u(☃.q("CanBreakDoors"));
/*     */     
/* 421 */     this.bt = ☃.h("InWaterTime");
/*     */     
/* 423 */     if (☃.c("DrownedConversionTime", 99) && ☃.h("DrownedConversionTime") > -1) {
/* 424 */       a(☃.h("DrownedConversionTime"));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aag ☃, aqm aqm1) {
/* 430 */     super.a(☃, aqm1);
/*     */     
/* 432 */     if ((☃.ad() == aor.c || ☃.ad() == aor.d) && aqm1 instanceof bfj) {
/* 433 */       if (☃.ad() != aor.d && this.J.nextBoolean()) {
/*     */         return;
/*     */       }
/*     */       
/* 437 */       bfj bfj = (bfj)aqm1;
/* 438 */       bek bek = bfj.<bek>a(aqe.ba, false);
/* 439 */       bek.a(☃, ☃.d(bek.cB()), aqp.i, new b(false, true), null);
/* 440 */       bek.a(bfj.eX());
/* 441 */       bek.a((mt)bfj.fj().<T>a(mo.a).getValue());
/* 442 */       bek.g(bfj.eO().a());
/* 443 */       bek.a(bfj.eL());
/*     */       
/* 445 */       if (!aA()) {
/* 446 */         ☃.a((bfw)null, 1026, cB(), 0);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected float b(aqx ☃, aqb aqb1) {
/* 453 */     return w_() ? 0.93F : 1.74F;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean h(bmb ☃) {
/* 458 */     if (☃.b() == bmd.mg && w_() && br()) {
/* 459 */       return false;
/*     */     }
/* 461 */     return super.h(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/* 467 */     arc1 = super.a(☃, aos1, aqp1, arc1, md1);
/* 468 */     float f = aos1.d();
/*     */     
/* 470 */     p((this.J.nextFloat() < 0.55F * f));
/*     */     
/* 472 */     if (arc1 == null) {
/* 473 */       arc1 = new b(a(☃.u_()), true);
/*     */     }
/*     */     
/* 476 */     if (arc1 instanceof b) {
/* 477 */       b b = (b)arc1;
/*     */       
/* 479 */       if (b.a) {
/* 480 */         a(true);
/*     */         
/* 482 */         if (b.b) {
/* 483 */           if (☃.u_().nextFloat() < 0.05D) {
/* 484 */             List<bac> list = (List)☃.a((Class)bac.class, cc().c(5.0D, 3.0D, 5.0D), aqd.c);
/*     */             
/* 486 */             if (!list.isEmpty()) {
/* 487 */               bac bac = list.get(0);
/* 488 */               bac.t(true);
/* 489 */               m(bac);
/*     */             } 
/* 491 */           } else if (☃.u_().nextFloat() < 0.05D) {
/* 492 */             bac bac = aqe.j.a(this.l);
/* 493 */             bac.b(cD(), cE(), cH(), this.p, 0.0F);
/* 494 */             bac.a(☃, aos1, aqp.g, (arc)null, (md)null);
/* 495 */             bac.t(true);
/* 496 */             m(bac);
/*     */ 
/*     */ 
/*     */             
/* 500 */             ☃.c(bac);
/*     */           } 
/*     */         }
/*     */       } 
/*     */       
/* 505 */       u((eK() && this.J.nextFloat() < f * 0.1F));
/*     */       
/* 507 */       a(aos1);
/* 508 */       b(aos1);
/*     */     } 
/*     */     
/* 511 */     if (b(aqf.f).a()) {
/* 512 */       LocalDate localDate = LocalDate.now();
/* 513 */       int i = localDate.get(ChronoField.DAY_OF_MONTH);
/* 514 */       int j = localDate.get(ChronoField.MONTH_OF_YEAR);
/*     */ 
/*     */       
/* 517 */       if (j == 10 && i == 31 && this.J.nextFloat() < 0.25F) {
/*     */         
/* 519 */         a(aqf.f, new bmb((this.J.nextFloat() < 0.1F) ? bup.cV : bup.cU));
/* 520 */         this.bn[aqf.f.b()] = 0.0F;
/*     */       } 
/*     */     } 
/*     */     
/* 524 */     y(f);
/*     */     
/* 526 */     return arc1;
/*     */   }
/*     */   
/*     */   public static boolean a(Random ☃) {
/* 530 */     return (☃.nextFloat() < 0.05F);
/*     */   }
/*     */   
/*     */   protected void y(float ☃) {
/* 534 */     eV();
/* 535 */     a(arl.c).c(new arj("Random spawn bonus", this.J.nextDouble() * 0.05000000074505806D, arj.a.a));
/* 536 */     double d = this.J.nextDouble() * 1.5D * ☃;
/* 537 */     if (d > 1.0D) {
/* 538 */       a(arl.b).c(new arj("Random zombie-spawn bonus", d, arj.a.c));
/*     */     }
/*     */     
/* 541 */     if (this.J.nextFloat() < ☃ * 0.05F) {
/* 542 */       a(arl.l).c(new arj("Leader zombie bonus", this.J.nextDouble() * 0.25D + 0.5D, arj.a.a));
/* 543 */       a(arl.a).c(new arj("Leader zombie bonus", this.J.nextDouble() * 3.0D + 1.0D, arj.a.c));
/* 544 */       u(eK());
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void eV() {
/* 549 */     a(arl.l).a(this.J.nextDouble() * 0.10000000149011612D);
/*     */   }
/*     */   
/*     */   public static class b implements arc {
/*     */     public final boolean a;
/*     */     public final boolean b;
/*     */     
/*     */     public b(boolean ☃, boolean bool1) {
/* 557 */       this.a = ☃;
/* 558 */       this.b = bool1;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public double bb() {
/* 564 */     return w_() ? 0.0D : -0.45D;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(apk ☃, int i, boolean bool) {
/* 569 */     super.a(☃, i, bool);
/* 570 */     aqa aqa = ☃.k();
/* 571 */     if (aqa instanceof bdc) {
/* 572 */       bdc bdc = (bdc)aqa;
/* 573 */       if (bdc.eN()) {
/* 574 */         bmb bmb = eM();
/* 575 */         if (!bmb.a()) {
/* 576 */           bdc.eO();
/* 577 */           a(bmb);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected bmb eM() {
/* 584 */     return new bmb(bmd.ph);
/*     */   }
/*     */   
/*     */   class a extends awy {
/*     */     a(bej this$0, aqu ☃, double d, int i) {
/* 589 */       super(bup.kf, ☃, d, i);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(bry ☃, fx fx1) {
/* 594 */       ☃.a((bfw)null, fx1, adq.rN, adr.f, 0.5F, 0.9F + bej.a(this.g).nextFloat() * 0.2F);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(brx ☃, fx fx1) {
/* 599 */       ☃.a((bfw)null, fx1, adq.pw, adr.e, 0.7F, 0.9F + ☃.t.nextFloat() * 0.2F);
/*     */     }
/*     */ 
/*     */     
/*     */     public double h() {
/* 604 */       return 1.14D;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bej.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */