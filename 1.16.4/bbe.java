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
/*     */ public class bbe
/*     */   extends bba
/*     */   implements bdu
/*     */ {
/*  63 */   private static final bon bw = bon.a(new brw[] { bmd.kW, bup.gA.h() });
/*     */   
/*  65 */   private static final us<Integer> bx = uv.a((Class)bbe.class, uu.b);
/*  66 */   private static final us<Integer> by = uv.a((Class)bbe.class, uu.b);
/*  67 */   private static final us<Integer> bz = uv.a((Class)bbe.class, uu.b);
/*     */   
/*     */   private boolean bA;
/*     */   
/*     */   @Nullable
/*     */   private bbe bB;
/*     */   @Nullable
/*     */   private bbe bC;
/*     */   
/*     */   public bbe(aqe<? extends bbe> ☃, brx brx1) {
/*  77 */     super((aqe)☃, brx1);
/*     */   }
/*     */   
/*     */   public boolean fu() {
/*  81 */     return false;
/*     */   }
/*     */   
/*     */   private void x(int ☃) {
/*  85 */     this.R.b(bx, Integer.valueOf(Math.max(1, Math.min(5, ☃))));
/*     */   }
/*     */   
/*     */   private void fE() {
/*  89 */     int ☃ = (this.J.nextFloat() < 0.04F) ? 5 : 3;
/*     */     
/*  91 */     x(1 + this.J.nextInt(☃));
/*     */   }
/*     */   
/*     */   public int fv() {
/*  95 */     return ((Integer)this.R.<Integer>a(bx)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 100 */     super.b(☃);
/*     */     
/* 102 */     ☃.b("Variant", fx());
/* 103 */     ☃.b("Strength", fv());
/*     */     
/* 105 */     if (!this.br.a(1).a()) {
/* 106 */       ☃.a("DecorItem", this.br.a(1).b(new md()));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 112 */     x(☃.h("Strength"));
/*     */     
/* 114 */     super.a(☃);
/* 115 */     w(☃.h("Variant"));
/*     */     
/* 117 */     if (☃.c("DecorItem", 10)) {
/* 118 */       this.br.a(1, bmb.a(☃.p("DecorItem")));
/*     */     }
/*     */     
/* 121 */     fe();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/* 126 */     this.bk.a(0, new avp(this));
/* 127 */     this.bk.a(1, new axa(this, 1.2D));
/* 128 */     this.bk.a(2, new awc(this, 2.0999999046325684D));
/* 129 */     this.bk.a(3, new awv(this, 1.25D, 40, 20.0F));
/* 130 */     this.bk.a(3, new awp(this, 1.2D));
/* 131 */     this.bk.a(4, new avi(this, 1.0D));
/* 132 */     this.bk.a(5, new avu(this, 1.0D));
/* 133 */     this.bk.a(6, new axk(this, 0.7D));
/* 134 */     this.bk.a(7, new awd(this, (Class)bfw.class, 6.0F));
/* 135 */     this.bk.a(8, new aws(this));
/*     */     
/* 137 */     this.bl.a(1, new c(this));
/* 138 */     this.bl.a(2, new a(this));
/*     */   }
/*     */   
/*     */   public static ark.a fw() {
/* 142 */     return eL()
/* 143 */       .a(arl.b, 40.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 148 */     super.e();
/*     */     
/* 150 */     this.R.a(bx, Integer.valueOf(0));
/* 151 */     this.R.a(by, Integer.valueOf(-1));
/* 152 */     this.R.a(bz, Integer.valueOf(0));
/*     */   }
/*     */   
/*     */   public int fx() {
/* 156 */     return afm.a(((Integer)this.R.<Integer>a(bz)).intValue(), 0, 3);
/*     */   }
/*     */   
/*     */   public void w(int ☃) {
/* 160 */     this.R.b(bz, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   protected int eN() {
/* 165 */     if (eM()) {
/* 166 */       return 2 + 3 * eU();
/*     */     }
/* 168 */     return super.eN();
/*     */   }
/*     */ 
/*     */   
/*     */   public void k(aqa ☃) {
/* 173 */     if (!w(☃)) {
/*     */       return;
/*     */     }
/* 176 */     float f1 = afm.b(this.aA * 0.017453292F);
/* 177 */     float f2 = afm.a(this.aA * 0.017453292F);
/* 178 */     float f3 = 0.3F;
/* 179 */     ☃.d(cD() + (0.3F * f2), cE() + bc() + ☃.bb(), cH() - (0.3F * f1));
/*     */   }
/*     */ 
/*     */   
/*     */   public double bc() {
/* 184 */     return cz() * 0.67D;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean er() {
/* 189 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean k(bmb ☃) {
/* 196 */     return bw.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean c(bfw ☃, bmb bmb1) {
/* 201 */     int i = 0;
/* 202 */     int j = 0;
/* 203 */     float f = 0.0F;
/* 204 */     boolean bool = false;
/*     */     
/* 206 */     blx blx = bmb1.b();
/* 207 */     if (blx == bmd.kW) {
/* 208 */       i = 10;
/* 209 */       j = 3;
/* 210 */       f = 2.0F;
/* 211 */     } else if (blx == bup.gA.h()) {
/* 212 */       i = 90;
/* 213 */       j = 6;
/* 214 */       f = 10.0F;
/* 215 */       if (eW() && i() == 0 && eP()) {
/* 216 */         bool = true;
/* 217 */         g(☃);
/*     */       } 
/*     */     } 
/* 220 */     if (dk() < dx() && f > 0.0F) {
/* 221 */       b(f);
/* 222 */       bool = true;
/*     */     } 
/* 224 */     if (w_() && i > 0) {
/* 225 */       this.l.a(hh.E, d(1.0D), cF() + 0.5D, g(1.0D), 0.0D, 0.0D, 0.0D);
/* 226 */       if (!this.l.v) {
/* 227 */         a(i);
/*     */       }
/* 229 */       bool = true;
/*     */     } 
/* 231 */     if (j > 0 && (bool || !eW()) && fc() < fj()) {
/* 232 */       bool = true;
/* 233 */       if (!this.l.v) {
/* 234 */         v(j);
/*     */       }
/*     */     } 
/* 237 */     if (bool && !aA()) {
/* 238 */       adp adp = fg();
/* 239 */       if (adp != null) {
/* 240 */         this.l.a((bfw)null, cD(), cE(), cH(), fg(), cu(), 1.0F, 1.0F + (this.J.nextFloat() - this.J.nextFloat()) * 0.2F);
/*     */       }
/*     */     } 
/*     */     
/* 244 */     return bool;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean dI() {
/* 249 */     return (dl() || eZ());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/*     */     int i;
/* 255 */     fE();
/*     */ 
/*     */     
/* 258 */     if (arc1 instanceof b) {
/* 259 */       i = ((b)arc1).a;
/*     */     } else {
/* 261 */       i = this.J.nextInt(4);
/* 262 */       arc1 = new b(i);
/*     */     } 
/* 264 */     w(i);
/*     */     
/* 266 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*     */   }
/*     */   
/*     */   static class b extends apy.a {
/*     */     public final int a;
/*     */     
/*     */     private b(int ☃) {
/* 273 */       super(true);
/* 274 */       this.a = ☃;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp fh() {
/* 280 */     return adq.hg;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 285 */     return adq.hf;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 290 */     return adq.hk;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 295 */     return adq.hi;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected adp fg() {
/* 301 */     return adq.hj;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(fx ☃, ceh ceh1) {
/* 306 */     a(adq.hm, 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void eO() {
/* 311 */     a(adq.hh, 1.0F, (this.J.nextFloat() - this.J.nextFloat()) * 0.2F + 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void fm() {
/* 316 */     adp ☃ = fh();
/* 317 */     if (☃ != null) {
/* 318 */       a(☃, dG(), dH());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int eU() {
/* 324 */     return fv();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean fs() {
/* 329 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean ft() {
/* 334 */     return !this.br.a(1).a();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean l(bmb ☃) {
/* 339 */     blx blx = ☃.b();
/* 340 */     return aeg.g.a(blx);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean L_() {
/* 345 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aon ☃) {
/* 350 */     bkx bkx1 = fy();
/* 351 */     super.a(☃);
/*     */     
/* 353 */     bkx bkx2 = fy();
/* 354 */     if (this.K > 20 && bkx2 != null && bkx2 != bkx1) {
/* 355 */       a(adq.hn, 0.5F, 1.0F);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fe() {
/* 361 */     if (this.l.v) {
/*     */       return;
/*     */     }
/*     */     
/* 365 */     super.fe();
/*     */     
/* 367 */     a(m(this.br.a(1)));
/*     */   }
/*     */   
/*     */   private void a(@Nullable bkx ☃) {
/* 371 */     this.R.b(by, Integer.valueOf((☃ == null) ? -1 : ☃.b()));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static bkx m(bmb ☃) {
/* 376 */     buo buo = buo.a(☃.b());
/* 377 */     if (buo instanceof cby) {
/* 378 */       return ((cby)buo).c();
/*     */     }
/* 380 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public bkx fy() {
/* 385 */     int ☃ = ((Integer)this.R.<Integer>a(by)).intValue();
/* 386 */     return (☃ == -1) ? null : bkx.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public int fj() {
/* 391 */     return 30;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(azz ☃) {
/* 396 */     return (☃ != this && ☃ instanceof bbe && fo() && ((bbe)☃).fo());
/*     */   }
/*     */ 
/*     */   
/*     */   public bbe b(aag ☃, apy apy1) {
/* 401 */     bbe bbe1 = fz();
/*     */     
/* 403 */     a(apy1, bbe1);
/*     */     
/* 405 */     bbe bbe2 = (bbe)apy1;
/*     */     
/* 407 */     int i = this.J.nextInt(Math.max(fv(), bbe2.fv())) + 1;
/* 408 */     if (this.J.nextFloat() < 0.03F) {
/* 409 */       i++;
/*     */     }
/* 411 */     bbe1.x(i);
/*     */     
/* 413 */     bbe1.w(this.J.nextBoolean() ? fx() : bbe2.fx());
/*     */     
/* 415 */     return bbe1;
/*     */   }
/*     */   
/*     */   protected bbe fz() {
/* 419 */     return aqe.Q.a(this.l);
/*     */   }
/*     */   
/*     */   private void i(aqm ☃) {
/* 423 */     bgl bgl = new bgl(this.l, this);
/* 424 */     double d1 = ☃.cD() - cD();
/* 425 */     double d2 = ☃.e(0.3333333333333333D) - bgl.cE();
/* 426 */     double d3 = ☃.cH() - cH();
/* 427 */     float f = afm.a(d1 * d1 + d3 * d3) * 0.2F;
/* 428 */     bgl.c(d1, d2 + f, d3, 1.5F, 10.0F);
/* 429 */     if (!aA()) {
/* 430 */       this.l.a((bfw)null, cD(), cE(), cH(), adq.hl, cu(), 1.0F, 1.0F + (this.J.nextFloat() - this.J.nextFloat()) * 0.2F);
/*     */     }
/*     */     
/* 433 */     this.l.c(bgl);
/* 434 */     this.bA = true;
/*     */   }
/*     */   
/*     */   private void A(boolean ☃) {
/* 438 */     this.bA = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(float ☃, float f1) {
/* 443 */     int i = e(☃, f1);
/* 444 */     if (i <= 0) {
/* 445 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 449 */     if (☃ >= 6.0F) {
/* 450 */       a(apk.k, i);
/*     */       
/* 452 */       if (bs()) {
/* 453 */         for (aqa aqa : co()) {
/* 454 */           aqa.a(apk.k, i);
/*     */         }
/*     */       }
/*     */     } 
/*     */     
/* 459 */     dt();
/* 460 */     return true;
/*     */   }
/*     */   
/*     */   public void fA() {
/* 464 */     if (this.bB != null) {
/* 465 */       this.bB.bC = null;
/*     */     }
/* 467 */     this.bB = null;
/*     */   }
/*     */   
/*     */   public void a(bbe ☃) {
/* 471 */     this.bB = ☃;
/* 472 */     this.bB.bC = this;
/*     */   }
/*     */   
/*     */   public boolean fB() {
/* 476 */     return (this.bC != null);
/*     */   }
/*     */   
/*     */   public boolean fC() {
/* 480 */     return (this.bB != null);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public bbe fD() {
/* 485 */     return this.bB;
/*     */   }
/*     */ 
/*     */   
/*     */   protected double eJ() {
/* 490 */     return 2.0D;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fk() {
/* 495 */     if (!fC() && w_()) {
/* 496 */       super.fk();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean fl() {
/* 502 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqm ☃, float f) {
/* 507 */     i(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public dcn cf() {
/* 512 */     return new dcn(0.0D, 0.75D * ce(), cy() * 0.5D);
/*     */   }
/*     */   
/*     */   static class c extends axp {
/*     */     public c(bbe ☃) {
/* 517 */       super(☃, new Class[0]);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 522 */       if (this.e instanceof bbe) {
/* 523 */         bbe ☃ = (bbe)this.e;
/* 524 */         if (bbe.b(☃)) {
/* 525 */           bbe.a(☃, false);
/* 526 */           return false;
/*     */         } 
/*     */       } 
/* 529 */       return super.b();
/*     */     }
/*     */   }
/*     */   
/*     */   static class a extends axq<baz> {
/*     */     public a(bbe ☃) {
/* 535 */       super(☃, baz.class, 16, false, true, ☃ -> !((baz)☃).eK());
/*     */     }
/*     */ 
/*     */     
/*     */     protected double k() {
/* 540 */       return super.k() * 0.25D;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bbe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */