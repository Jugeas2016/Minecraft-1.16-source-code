/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bab
/*     */   extends are
/*     */ {
/*  80 */   private static final bon br = bon.a(new brw[] { bmd.ml, bmd.mm });
/*     */   
/*  82 */   private static final us<Integer> bs = uv.a((Class)bab.class, uu.b);
/*  83 */   private static final us<Boolean> bt = uv.a((Class)bab.class, uu.i);
/*  84 */   private static final us<Boolean> bu = uv.a((Class)bab.class, uu.i);
/*  85 */   private static final us<Integer> bv = uv.a((Class)bab.class, uu.b);
/*     */   
/*     */   public static final Map<Integer, vk> bq;
/*     */   
/*     */   private a<bfw> bw;
/*     */   
/*     */   private axf bx;
/*     */   
/*     */   private float by;
/*     */   
/*     */   private float bz;
/*     */   private float bA;
/*     */   private float bB;
/*     */   private float bC;
/*     */   private float bD;
/*     */   
/*     */   static {
/* 102 */     bq = x.<Map<Integer, vk>>a(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put(Integer.valueOf(0), new vk("textures/entity/cat/tabby.png"));
/*     */           ☃.put(Integer.valueOf(1), new vk("textures/entity/cat/black.png"));
/*     */           ☃.put(Integer.valueOf(2), new vk("textures/entity/cat/red.png"));
/*     */           ☃.put(Integer.valueOf(3), new vk("textures/entity/cat/siamese.png"));
/*     */           ☃.put(Integer.valueOf(4), new vk("textures/entity/cat/british_shorthair.png"));
/*     */           ☃.put(Integer.valueOf(5), new vk("textures/entity/cat/calico.png"));
/*     */           ☃.put(Integer.valueOf(6), new vk("textures/entity/cat/persian.png"));
/*     */           ☃.put(Integer.valueOf(7), new vk("textures/entity/cat/ragdoll.png"));
/*     */           ☃.put(Integer.valueOf(8), new vk("textures/entity/cat/white.png"));
/*     */           ☃.put(Integer.valueOf(9), new vk("textures/entity/cat/jellie.png"));
/*     */           ☃.put(Integer.valueOf(10), new vk("textures/entity/cat/all_black.png"));
/*     */         });
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
/*     */   public bab(aqe<? extends bab> ☃, brx brx1) {
/* 127 */     super((aqe)☃, brx1);
/*     */   }
/*     */   
/*     */   public vk eU() {
/* 131 */     return bq.getOrDefault(Integer.valueOf(eV()), bq.get(Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/* 136 */     this.bx = new c(this, 0.6D, br, true);
/*     */     
/* 138 */     this.bk.a(1, new avp(this));
/* 139 */     this.bk.a(1, new axb(this));
/* 140 */     this.bk.a(2, new b(this));
/* 141 */     this.bk.a(3, this.bx);
/* 142 */     this.bk.a(5, new avj(this, 1.1D, 8));
/* 143 */     this.bk.a(6, new avt(this, 1.0D, 10.0F, 5.0F, false));
/* 144 */     this.bk.a(7, new avk(this, 0.8D));
/* 145 */     this.bk.a(8, new awb(this, 0.3F));
/* 146 */     this.bk.a(9, new awm(this));
/* 147 */     this.bk.a(10, new avi(this, 0.8D));
/* 148 */     this.bk.a(11, new axk(this, 0.8D, 1.0000001E-5F));
/* 149 */     this.bk.a(12, new awd(this, (Class)bfw.class, 10.0F));
/*     */     
/* 151 */     this.bl.a(1, new axt<>(this, baq.class, false, null));
/* 152 */     this.bl.a(1, new axt<>(this, bax.class, false, bax.bo));
/*     */   }
/*     */   
/*     */   public int eV() {
/* 156 */     return ((Integer)this.R.<Integer>a(bs)).intValue();
/*     */   }
/*     */   
/*     */   public void t(int ☃) {
/* 160 */     if (☃ < 0 || ☃ >= 11) {
/* 161 */       ☃ = this.J.nextInt(10);
/*     */     }
/*     */     
/* 164 */     this.R.b(bs, Integer.valueOf(☃));
/*     */   }
/*     */   
/*     */   public void x(boolean ☃) {
/* 168 */     this.R.b(bt, Boolean.valueOf(☃));
/*     */   }
/*     */   
/*     */   public boolean eW() {
/* 172 */     return ((Boolean)this.R.<Boolean>a(bt)).booleanValue();
/*     */   }
/*     */   
/*     */   public void y(boolean ☃) {
/* 176 */     this.R.b(bu, Boolean.valueOf(☃));
/*     */   }
/*     */   
/*     */   public boolean eX() {
/* 180 */     return ((Boolean)this.R.<Boolean>a(bu)).booleanValue();
/*     */   }
/*     */   
/*     */   public bkx eY() {
/* 184 */     return bkx.a(((Integer)this.R.<Integer>a(bv)).intValue());
/*     */   }
/*     */   
/*     */   public void a(bkx ☃) {
/* 188 */     this.R.b(bv, Integer.valueOf(☃.b()));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 193 */     super.e();
/*     */     
/* 195 */     this.R.a(bs, Integer.valueOf(1));
/* 196 */     this.R.a(bt, Boolean.valueOf(false));
/* 197 */     this.R.a(bu, Boolean.valueOf(false));
/* 198 */     this.R.a(bv, Integer.valueOf(bkx.o.b()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 203 */     super.b(☃);
/* 204 */     ☃.b("CatType", eV());
/* 205 */     ☃.a("CollarColor", (byte)eY().b());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 210 */     super.a(☃);
/* 211 */     t(☃.h("CatType"));
/* 212 */     if (☃.c("CollarColor", 99)) {
/* 213 */       a(bkx.a(☃.h("CollarColor")));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void N() {
/* 219 */     if (u().b()) {
/* 220 */       double ☃ = u().c();
/* 221 */       if (☃ == 0.6D) {
/* 222 */         b(aqx.f);
/* 223 */         g(false);
/* 224 */       } else if (☃ == 1.33D) {
/* 225 */         b(aqx.a);
/* 226 */         g(true);
/*     */       } else {
/* 228 */         b(aqx.a);
/* 229 */         g(false);
/*     */       } 
/*     */     } else {
/* 232 */       b(aqx.a);
/* 233 */       g(false);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected adp I() {
/* 240 */     if (eK()) {
/* 241 */       if (eS()) {
/* 242 */         return adq.bx;
/*     */       }
/* 244 */       if (this.J.nextInt(4) == 0) {
/* 245 */         return adq.by;
/*     */       }
/* 247 */       return adq.bq;
/*     */     } 
/*     */     
/* 250 */     return adq.br;
/*     */   }
/*     */ 
/*     */   
/*     */   public int D() {
/* 255 */     return 120;
/*     */   }
/*     */   
/*     */   public void eZ() {
/* 259 */     a(adq.bu, dG(), dH());
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 264 */     return adq.bw;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 269 */     return adq.bs;
/*     */   }
/*     */   
/*     */   public static ark.a fa() {
/* 273 */     return aqn.p()
/* 274 */       .a(arl.a, 10.0D)
/* 275 */       .a(arl.d, 0.30000001192092896D)
/* 276 */       .a(arl.f, 3.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(float ☃, float f1) {
/* 281 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(bfw ☃, bmb bmb1) {
/* 286 */     if (k(bmb1)) {
/* 287 */       a(adq.bt, 1.0F, 1.0F);
/*     */     }
/* 289 */     super.a(☃, bmb1);
/*     */   }
/*     */   
/*     */   private float fb() {
/* 293 */     return (float)b(arl.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean B(aqa ☃) {
/* 298 */     return ☃.a(apk.c(this), fb());
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 303 */     super.j();
/*     */     
/* 305 */     if (this.bx != null && this.bx.h() && !eK() && this.K % 100 == 0) {
/* 306 */       a(adq.bv, 1.0F, 1.0F);
/*     */     }
/* 308 */     fc();
/*     */   }
/*     */   
/*     */   private void fc() {
/* 312 */     if ((eW() || eX()) && this.K % 5 == 0) {
/* 313 */       a(adq.bx, 0.6F + 0.4F * (this.J.nextFloat() - this.J.nextFloat()), 1.0F);
/*     */     }
/* 315 */     fd();
/* 316 */     fe();
/*     */   }
/*     */   
/*     */   private void fd() {
/* 320 */     this.bz = this.by;
/* 321 */     this.bB = this.bA;
/* 322 */     if (eW()) {
/* 323 */       this.by = Math.min(1.0F, this.by + 0.15F);
/* 324 */       this.bA = Math.min(1.0F, this.bA + 0.08F);
/*     */     } else {
/* 326 */       this.by = Math.max(0.0F, this.by - 0.22F);
/* 327 */       this.bA = Math.max(0.0F, this.bA - 0.13F);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void fe() {
/* 332 */     this.bD = this.bC;
/* 333 */     if (eX()) {
/* 334 */       this.bC = Math.min(1.0F, this.bC + 0.1F);
/*     */     } else {
/* 336 */       this.bC = Math.max(0.0F, this.bC - 0.13F);
/*     */     } 
/*     */   }
/*     */   
/*     */   public float y(float ☃) {
/* 341 */     return afm.g(☃, this.bz, this.by);
/*     */   }
/*     */   
/*     */   public float z(float ☃) {
/* 345 */     return afm.g(☃, this.bB, this.bA);
/*     */   }
/*     */   
/*     */   public float A(float ☃) {
/* 349 */     return afm.g(☃, this.bD, this.bC);
/*     */   }
/*     */ 
/*     */   
/*     */   public bab b(aag ☃, apy apy1) {
/* 354 */     bab bab1 = aqe.h.a(☃);
/* 355 */     if (apy1 instanceof bab) {
/* 356 */       if (this.J.nextBoolean()) {
/* 357 */         bab1.t(eV());
/*     */       } else {
/* 359 */         bab1.t(((bab)apy1).eV());
/*     */       } 
/*     */       
/* 362 */       if (eK()) {
/* 363 */         bab1.b(A_());
/* 364 */         bab1.u(true);
/* 365 */         if (this.J.nextBoolean()) {
/* 366 */           bab1.a(eY());
/*     */         } else {
/* 368 */           bab1.a(((bab)apy1).eY());
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 373 */     return bab1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(azz ☃) {
/* 378 */     if (!eK()) {
/* 379 */       return false;
/*     */     }
/*     */     
/* 382 */     if (!(☃ instanceof bab)) {
/* 383 */       return false;
/*     */     }
/*     */     
/* 386 */     bab bab1 = (bab)☃;
/* 387 */     return (bab1.eK() && super.a(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/* 393 */     arc1 = super.a(☃, aos1, aqp1, arc1, md1);
/*     */     
/* 395 */     if (☃.af() > 0.9F) {
/*     */       
/* 397 */       t(this.J.nextInt(11));
/*     */     } else {
/* 399 */       t(this.J.nextInt(10));
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 405 */     brx brx = ☃.E();
/* 406 */     if (brx instanceof aag && (
/* 407 */       (aag)brx).a().a(cB(), true, cla.j).e()) {
/* 408 */       t(10);
/* 409 */       es();
/*     */     } 
/*     */ 
/*     */     
/* 413 */     return arc1;
/*     */   }
/*     */ 
/*     */   
/*     */   public aou b(bfw ☃, aot aot1) {
/* 418 */     bmb bmb = ☃.b(aot1);
/* 419 */     blx blx = bmb.b();
/*     */     
/* 421 */     if (this.l.v) {
/* 422 */       if (eK() && i(☃)) {
/* 423 */         return aou.a;
/*     */       }
/* 425 */       if (k(bmb) && (dk() < dx() || !eK())) {
/* 426 */         return aou.a;
/*     */       }
/* 428 */       return aou.c;
/*     */     } 
/*     */     
/* 431 */     if (eK()) {
/* 432 */       if (i(☃)) {
/* 433 */         if (blx instanceof bky)
/* 434 */         { bkx bkx = ((bky)blx).d();
/* 435 */           if (bkx != eY()) {
/* 436 */             a(bkx);
/*     */             
/* 438 */             if (!☃.bC.d) {
/* 439 */               bmb.g(1);
/*     */             }
/*     */             
/* 442 */             es();
/* 443 */             return aou.b;
/*     */           }  }
/* 445 */         else { if (blx.s() && k(bmb) && dk() < dx()) {
/* 446 */             a(☃, bmb);
/* 447 */             b(blx.t().a());
/* 448 */             return aou.b;
/*     */           } 
/*     */           
/* 451 */           aou aou1 = super.b(☃, aot1);
/* 452 */           if (!aou1.a() || w_()) {
/* 453 */             w(!eO());
/*     */           }
/* 455 */           return aou1; }
/*     */ 
/*     */       
/*     */       }
/* 459 */     } else if (k(bmb)) {
/* 460 */       a(☃, bmb);
/*     */       
/* 462 */       if (this.J.nextInt(3) == 0) {
/* 463 */         f(☃);
/* 464 */         w(true);
/* 465 */         this.l.a(this, (byte)7);
/*     */       } else {
/* 467 */         this.l.a(this, (byte)6);
/*     */       } 
/*     */       
/* 470 */       es();
/* 471 */       return aou.b;
/*     */     } 
/*     */ 
/*     */     
/* 475 */     aou aou = super.b(☃, aot1);
/*     */     
/* 477 */     if (aou.a()) {
/* 478 */       es();
/*     */     }
/*     */     
/* 481 */     return aou;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean k(bmb ☃) {
/* 486 */     return br.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected float b(aqx ☃, aqb aqb1) {
/* 491 */     return aqb1.b * 0.5F;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean h(double ☃) {
/* 496 */     return (!eK() && this.K > 2400);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void eL() {
/* 501 */     if (this.bw == null) {
/* 502 */       this.bw = new a<>(this, bfw.class, 16.0F, 0.8D, 1.33D);
/*     */     }
/*     */     
/* 505 */     this.bk.a(this.bw);
/*     */     
/* 507 */     if (!eK())
/* 508 */       this.bk.a(4, this.bw); 
/*     */   }
/*     */   
/*     */   static class a<T extends aqm>
/*     */     extends avd<T> {
/*     */     private final bab i;
/*     */     
/*     */     public a(bab ☃, Class<T> clazz, float f, double d1, double d2) {
/* 516 */       super(☃, clazz, f, d1, d2, aqd.e::test);
/* 517 */       this.i = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 522 */       return (!this.i.eK() && super.a());
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 527 */       return (!this.i.eK() && super.b());
/*     */     }
/*     */   }
/*     */   
/*     */   static class c extends axf {
/*     */     @Nullable
/*     */     private bfw c;
/*     */     private final bab d;
/*     */     
/*     */     public c(bab ☃, double d, bon bon1, boolean bool) {
/* 537 */       super(☃, d, bon1, bool);
/* 538 */       this.d = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 543 */       super.e();
/*     */       
/* 545 */       if (this.c == null && this.a.cY().nextInt(600) == 0) {
/* 546 */         this.c = this.b;
/* 547 */       } else if (this.a.cY().nextInt(500) == 0) {
/* 548 */         this.c = null;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean g() {
/* 554 */       if (this.c != null && this.c.equals(this.b)) {
/* 555 */         return false;
/*     */       }
/*     */       
/* 558 */       return super.g();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 563 */       return (super.a() && !this.d.eK());
/*     */     }
/*     */   }
/*     */   
/*     */   static class b extends avv {
/*     */     private final bab a;
/*     */     private bfw b;
/*     */     private fx c;
/*     */     private int d;
/*     */     
/*     */     public b(bab ☃) {
/* 574 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 579 */       if (!this.a.eK()) {
/* 580 */         return false;
/*     */       }
/*     */       
/* 583 */       if (this.a.eO()) {
/* 584 */         return false;
/*     */       }
/*     */       
/* 587 */       aqm ☃ = this.a.eN();
/* 588 */       if (☃ instanceof bfw) {
/* 589 */         this.b = (bfw)☃;
/*     */         
/* 591 */         if (!☃.em()) {
/* 592 */           return false;
/*     */         }
/*     */         
/* 595 */         if (this.a.h(this.b) > 100.0D) {
/* 596 */           return false;
/*     */         }
/*     */         
/* 599 */         fx fx1 = this.b.cB();
/* 600 */         ceh ceh = this.a.l.d_(fx1);
/* 601 */         if (ceh.b().a(aed.L)) {
/* 602 */           this.c = ceh.d(buj.aq).map(gc1 -> ☃.a(gc1.f())).orElseGet(() -> new fx(☃));
/* 603 */           return !g();
/*     */         } 
/*     */       } 
/*     */       
/* 607 */       return false;
/*     */     }
/*     */     
/*     */     private boolean g() {
/* 611 */       List<bab> ☃ = this.a.l.a(bab.class, (new dci(this.c)).g(2.0D));
/* 612 */       for (bab bab1 : ☃) {
/* 613 */         if (bab1 != this.a && (bab1.eW() || bab1.eX())) {
/* 614 */           return true;
/*     */         }
/*     */       } 
/*     */       
/* 618 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 623 */       return (this.a.eK() && !this.a.eO() && this.b != null && this.b.em() && this.c != null && !g());
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 628 */       if (this.c != null) {
/* 629 */         this.a.v(false);
/* 630 */         this.a.x().a(this.c.u(), this.c.v(), this.c.w(), 1.100000023841858D);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 636 */       this.a.x(false);
/*     */       
/* 638 */       float ☃ = this.a.l.f(1.0F);
/* 639 */       if (this.b.eC() >= 100 && ☃ > 0.77D && ☃ < 0.8D && this.a.l.u_().nextFloat() < 0.7D) {
/* 640 */         h();
/*     */       }
/*     */       
/* 643 */       this.d = 0;
/* 644 */       this.a.y(false);
/* 645 */       this.a.x().o();
/*     */     }
/*     */     
/*     */     private void h() {
/* 649 */       Random ☃ = this.a.cY();
/* 650 */       fx.a a = new fx.a();
/* 651 */       a.g(this.a.cB());
/*     */       
/* 653 */       this.a.a((a.u() + ☃.nextInt(11) - 5), (a.v() + ☃.nextInt(5) - 2), (a.w() + ☃.nextInt(11) - 5), false);
/*     */       
/* 655 */       a.g(this.a.cB());
/* 656 */       cyy cyy = this.a.l.l().aJ().a(cyq.ak);
/*     */ 
/*     */ 
/*     */       
/* 660 */       cyv.a a1 = (new cyv.a((aag)this.a.l)).<dcn>a(dbc.f, this.a.cA()).<aqa>a(dbc.a, this.a).a(☃);
/* 661 */       List<bmb> list = cyy.a(a1.a(dbb.g));
/* 662 */       for (bmb bmb : list) {
/* 663 */         this.a.l.c(new bcv(this.a.l, a.u() - afm.a(this.a.aA * 0.017453292F), a.v(), a.w() + afm.b(this.a.aA * 0.017453292F), bmb));
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 669 */       if (this.b != null && this.c != null) {
/* 670 */         this.a.v(false);
/* 671 */         this.a.x().a(this.c.u(), this.c.v(), this.c.w(), 1.100000023841858D);
/* 672 */         if (this.a.h(this.b) < 2.5D) {
/* 673 */           this.d++;
/* 674 */           if (this.d > 16) {
/* 675 */             this.a.x(true);
/* 676 */             this.a.y(false);
/*     */           } else {
/* 678 */             this.a.a(this.b, 45.0F, 45.0F);
/* 679 */             this.a.y(true);
/*     */           } 
/*     */         } else {
/* 682 */           this.a.x(false);
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */