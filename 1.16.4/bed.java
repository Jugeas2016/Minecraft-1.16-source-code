/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
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
/*     */ public class bed
/*     */   extends azz
/*     */   implements aqk, ara
/*     */ {
/*  77 */   private static final bon bo = bon.a(new brw[] { bmd.bx });
/*  78 */   private static final bon bp = bon.a(new brw[] { bmd.bx, bmd.pl });
/*     */   
/*  80 */   private static final us<Integer> bq = uv.a((Class)bed.class, uu.b);
/*  81 */   private static final us<Boolean> br = uv.a((Class)bed.class, uu.i);
/*  82 */   private static final us<Boolean> bs = uv.a((Class)bed.class, uu.i);
/*     */   
/*     */   private final aqj bt;
/*     */   
/*     */   private axf bu;
/*     */   private awp bv;
/*     */   
/*     */   public bed(aqe<? extends bed> ☃, brx brx1) {
/*  90 */     super((aqe)☃, brx1);
/*  91 */     this.bt = new aqj(this.R, bq, bs);
/*     */     
/*  93 */     this.i = true;
/*     */     
/*  95 */     a(cwz.h, -1.0F);
/*  96 */     a(cwz.g, 0.0F);
/*  97 */     a(cwz.l, 0.0F);
/*  98 */     a(cwz.m, 0.0F);
/*     */   }
/*     */   
/*     */   public static boolean c(aqe<bed> ☃, bry bry1, aqp aqp1, fx fx1, Random random) {
/* 102 */     fx.a a = fx1.i();
/*     */     do {
/* 104 */       a.c(gc.b);
/* 105 */     } while (bry1.b(a).a(aef.c));
/*     */     
/* 107 */     return bry1.d_(a).g();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(us<?> ☃) {
/* 112 */     if (bq.equals(☃) && this.l.v) {
/* 113 */       this.bt.a();
/*     */     }
/* 115 */     super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 120 */     super.e();
/* 121 */     this.R.a(bq, Integer.valueOf(0));
/* 122 */     this.R.a(br, Boolean.valueOf(false));
/* 123 */     this.R.a(bs, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 128 */     super.b(☃);
/* 129 */     this.bt.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 134 */     super.a(☃);
/* 135 */     this.bt.b(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean M_() {
/* 140 */     return this.bt.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean L_() {
/* 145 */     return (aX() && !w_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(@Nullable adr ☃) {
/* 150 */     this.bt.a(true);
/* 151 */     if (☃ != null) {
/* 152 */       this.l.a((bfw)null, this, adq.oi, ☃, 0.5F, 1.0F);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/* 158 */     this.bv = new awp(this, 1.65D);
/* 159 */     this.bk.a(1, this.bv);
/* 160 */     this.bk.a(2, new avi(this, 1.0D));
/* 161 */     this.bu = new axf(this, 1.4D, false, bp);
/* 162 */     this.bk.a(3, this.bu);
/* 163 */     this.bk.a(4, new a(this, 1.5D));
/* 164 */     this.bk.a(5, new avu(this, 1.1D));
/* 165 */     this.bk.a(7, new awt(this, 1.0D, 60));
/* 166 */     this.bk.a(8, new awd(this, (Class)bfw.class, 8.0F));
/* 167 */     this.bk.a(8, new aws(this));
/* 168 */     this.bk.a(9, new awd(this, (Class)bed.class, 8.0F));
/*     */   }
/*     */   
/*     */   public void t(boolean ☃) {
/* 172 */     this.R.b(br, Boolean.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean eK() {
/* 177 */     if (ct() instanceof bed) {
/* 178 */       return ((bed)ct()).eK();
/*     */     }
/*     */     
/* 181 */     return ((Boolean)this.R.<Boolean>a(br)).booleanValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(cuw ☃) {
/* 186 */     return ☃.a(aef.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public double bc() {
/* 191 */     float ☃ = Math.min(0.25F, this.av);
/* 192 */     float f1 = this.aw;
/*     */     
/* 194 */     return cz() - 0.19D + (0.12F * afm.b(f1 * 1.5F) * 2.0F * ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean er() {
/* 199 */     aqa ☃ = cm();
/* 200 */     if (!(☃ instanceof bfw)) {
/* 201 */       return false;
/*     */     }
/*     */     
/* 204 */     bfw bfw = (bfw)☃;
/*     */     
/* 206 */     return (bfw.dD().b() == bmd.pl || bfw.dE().b() == bmd.pl);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brz ☃) {
/* 211 */     return ☃.j(this);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public aqa cm() {
/* 217 */     if (cn().isEmpty()) {
/* 218 */       return null;
/*     */     }
/* 220 */     return cn().get(0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public dcn b(aqm ☃) {
/* 230 */     dcn[] arrayOfDcn = { a(cy(), ☃.cy(), ☃.p), a(cy(), ☃.cy(), ☃.p - 22.5F), a(cy(), ☃.cy(), ☃.p + 22.5F), a(cy(), ☃.cy(), ☃.p - 45.0F), a(cy(), ☃.cy(), ☃.p + 45.0F) };
/*     */ 
/*     */     
/* 233 */     Set<fx> set = Sets.newLinkedHashSet();
/* 234 */     double d1 = (cc()).e;
/* 235 */     double d2 = (cc()).b - 0.5D;
/*     */     
/* 237 */     fx.a a = new fx.a();
/* 238 */     for (dcn dcn : arrayOfDcn) {
/* 239 */       a.c(cD() + dcn.b, d1, cH() + dcn.d);
/*     */       
/*     */       double d;
/* 242 */       for (d = d1; d > d2; d--) {
/* 243 */         set.add(a.h());
/* 244 */         a.c(gc.a);
/*     */       } 
/*     */     } 
/*     */     
/* 248 */     for (fx fx : set) {
/* 249 */       if (this.l.b(fx).a(aef.c)) {
/*     */         continue;
/*     */       }
/*     */       
/* 253 */       double d = this.l.h(fx);
/* 254 */       if (bho.a(d)) {
/* 255 */         dcn dcn = dcn.a(fx, d);
/*     */         
/* 257 */         for (UnmodifiableIterator<aqx> unmodifiableIterator = ☃.ej().iterator(); unmodifiableIterator.hasNext(); ) { aqx aqx = unmodifiableIterator.next();
/* 258 */           dci dci = ☃.f(aqx);
/*     */           
/* 260 */           if (bho.a(this.l, ☃, dci.c(dcn))) {
/* 261 */             ☃.b(aqx);
/* 262 */             return dcn;
/*     */           }  }
/*     */       
/*     */       } 
/*     */     } 
/*     */     
/* 268 */     return new dcn(cD(), (cc()).e, cH());
/*     */   }
/*     */ 
/*     */   
/*     */   public void g(dcn ☃) {
/* 273 */     q(eL());
/* 274 */     a(this, this.bt, ☃);
/*     */   }
/*     */   
/*     */   public float eL() {
/* 278 */     return (float)b(arl.d) * (eK() ? 0.66F : 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public float N_() {
/* 283 */     return (float)b(arl.d) * (eK() ? 0.23F : 0.55F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a_(dcn ☃) {
/* 288 */     super.g(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected float at() {
/* 293 */     return this.B + 0.6F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(fx ☃, ceh ceh1) {
/* 298 */     a(aQ() ? adq.og : adq.of, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean O_() {
/* 303 */     return this.bt.a(cY());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(double ☃, boolean bool, ceh ceh1, fx fx1) {
/* 308 */     ay();
/*     */     
/* 310 */     if (aQ()) {
/* 311 */       this.C = 0.0F;
/*     */       
/*     */       return;
/*     */     } 
/* 315 */     super.a(☃, bool, ceh1, fx1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 320 */     if (eO() && this.J.nextInt(140) == 0) {
/* 321 */       a(adq.ob, 1.0F, dH());
/* 322 */     } else if (eN() && this.J.nextInt(60) == 0) {
/* 323 */       a(adq.oc, 1.0F, dH());
/*     */     } 
/*     */     
/* 326 */     ceh ☃ = this.l.d_(cB());
/* 327 */     ceh ceh1 = aN();
/*     */     
/* 329 */     boolean bool = (☃.a(aed.ax) || ceh1.a(aed.ax) || b(aef.c) > 0.0D);
/*     */ 
/*     */     
/* 332 */     t(!bool);
/*     */     
/* 334 */     super.j();
/*     */     
/* 336 */     eU();
/* 337 */     ay();
/*     */   }
/*     */   
/*     */   private boolean eN() {
/* 341 */     return (this.bv != null && this.bv.h());
/*     */   }
/*     */   
/*     */   private boolean eO() {
/* 345 */     return (this.bu != null && this.bu.h());
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean q() {
/* 350 */     return true;
/*     */   }
/*     */   
/*     */   private void eU() {
/* 354 */     if (aQ()) {
/* 355 */       dcs ☃ = dcs.a(this);
/* 356 */       if (!☃.a(byb.c, cB(), true) || this.l.b(cB().b()).a(aef.c)) {
/* 357 */         f(cC().a(0.5D).b(0.0D, 0.05D, 0.0D));
/*     */       } else {
/* 359 */         this.t = true;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static ark.a eM() {
/* 365 */     return aqn.p()
/* 366 */       .a(arl.d, 0.17499999701976776D)
/* 367 */       .a(arl.b, 16.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 372 */     if (eN() || eO()) {
/* 373 */       return null;
/*     */     }
/* 375 */     return adq.oa;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 380 */     return adq.oe;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 385 */     return adq.od;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean q(aqa ☃) {
/* 390 */     return (cn().isEmpty() && !a(aef.c));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean dO() {
/* 395 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bq() {
/* 400 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ayj b(brx ☃) {
/* 405 */     return new b(this, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(fx ☃, brz brz1) {
/* 410 */     if (brz1.d_(☃).m().a(aef.c)) {
/* 411 */       return 10.0F;
/*     */     }
/*     */ 
/*     */     
/* 415 */     return aQ() ? Float.NEGATIVE_INFINITY : 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public bed b(aag ☃, apy apy1) {
/* 420 */     return aqe.aF.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean k(bmb ☃) {
/* 425 */     return bo.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void dn() {
/* 430 */     super.dn();
/* 431 */     if (M_()) {
/* 432 */       a(bmd.lO);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public aou b(bfw ☃, aot aot1) {
/* 438 */     boolean bool = k(☃.b(aot1));
/*     */     
/* 440 */     if (!bool && M_() && !bs() && !☃.eq()) {
/* 441 */       if (!this.l.v) {
/* 442 */         ☃.m(this);
/*     */       }
/* 444 */       return aou.a(this.l.v);
/*     */     } 
/*     */     
/* 447 */     aou aou = super.b(☃, aot1);
/* 448 */     if (!aou.a()) {
/* 449 */       bmb bmb = ☃.b(aot1);
/* 450 */       if (bmb.b() == bmd.lO) {
/* 451 */         return bmb.a(☃, this, aot1);
/*     */       }
/* 453 */       return aou.c;
/* 454 */     }  if (bool && !aA()) {
/* 455 */       this.l.a((bfw)null, cD(), cE(), cH(), adq.oh, cu(), 1.0F, 1.0F + (this.J.nextFloat() - this.J.nextFloat()) * 0.2F);
/*     */     }
/*     */     
/* 458 */     return aou;
/*     */   }
/*     */ 
/*     */   
/*     */   public dcn cf() {
/* 463 */     return new dcn(0.0D, (0.6F * ce()), (cy() * 0.4F));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/* 470 */     if (w_()) {
/* 471 */       return super.a(☃, aos1, aqp1, arc1, md1);
/*     */     }
/*     */     
/* 474 */     if (this.J.nextInt(30) == 0) {
/* 475 */       aqn aqn = aqe.bb.a(☃.E());
/* 476 */       arc1 = a(☃, aos1, aqn, new bej.b(bej.a(this.J), false));
/*     */       
/* 478 */       aqn.a(aqf.a, new bmb(bmd.pl));
/* 479 */       a((adr)null);
/* 480 */     } else if (this.J.nextInt(10) == 0) {
/* 481 */       apy apy = aqe.aF.a(☃.E());
/* 482 */       apy.c_(-24000);
/*     */       
/* 484 */       arc1 = a(☃, aos1, apy, (arc)null);
/*     */     } else {
/* 486 */       arc1 = new apy.a(0.5F);
/*     */     } 
/*     */     
/* 489 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*     */   }
/*     */   
/*     */   private arc a(bsk ☃, aos aos1, aqn aqn1, @Nullable arc arc1) {
/* 493 */     aqn1.b(cD(), cE(), cH(), this.p, 0.0F);
/* 494 */     aqn1.a(☃, aos1, aqp.g, arc1, (md)null);
/* 495 */     aqn1.a(this, true);
/*     */     
/* 497 */     return new apy.a(0.0F);
/*     */   }
/*     */   
/*     */   static class b extends ayi {
/*     */     b(bed ☃, brx brx1) {
/* 502 */       super(☃, brx1);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     protected cxf a(int ☃) {
/* 508 */       this.o = new cxj();
/* 509 */       return new cxf(this.o, ☃);
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean a(cwz ☃) {
/* 514 */       if (☃ == cwz.g || ☃ == cwz.m || ☃ == cwz.l) {
/* 515 */         return true;
/*     */       }
/*     */       
/* 518 */       return super.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(fx ☃) {
/* 523 */       return (this.b.d_(☃).a(bup.B) || super.a(☃));
/*     */     }
/*     */   }
/*     */   
/*     */   static class a extends awj {
/*     */     private final bed g;
/*     */     
/*     */     private a(bed ☃, double d) {
/* 531 */       super(☃, d, 8, 2);
/* 532 */       this.g = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public fx j() {
/* 537 */       return this.e;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 542 */       return (!this.g.aQ() && a(this.g.l, this.e));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 547 */       return (!this.g.aQ() && super.a());
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean k() {
/* 552 */       return (this.d % 20 == 0);
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean a(brz ☃, fx fx1) {
/* 557 */       return (☃.d_(fx1).a(bup.B) && ☃.d_(fx1.b()).a(☃, fx1, cxe.a));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bed.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */