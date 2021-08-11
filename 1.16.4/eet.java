/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
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
/*     */ public class eet
/*     */ {
/*  51 */   private static final eao e = eao.l(new vk("textures/misc/shadow.png"));
/*     */   
/*  53 */   private final Map<aqe<?>, eeu<?>> f = Maps.newHashMap();
/*  54 */   private final Map<String, ejk> g = Maps.newHashMap();
/*     */   
/*     */   private final ejk h;
/*     */   
/*     */   private final dku i;
/*     */   
/*     */   public final ekd a;
/*     */   private brx j;
/*     */   public djk b;
/*     */   private d k;
/*     */   public aqa c;
/*     */   public final dkd d;
/*     */   private boolean l = true;
/*     */   private boolean m;
/*     */   
/*     */   public <E extends aqa> int a(E ☃, float f) {
/*  70 */     return a(☃).b(☃, f);
/*     */   }
/*     */   
/*     */   private <T extends aqa> void a(aqe<T> ☃, eeu<? super T> eeu1) {
/*  74 */     this.f.put(☃, eeu1);
/*     */   }
/*     */   
/*     */   private void a(efo ☃, acf acf1) {
/*  78 */     a(aqe.a, new edx(this));
/*  79 */     a(aqe.b, new edy(this));
/*  80 */     a(aqe.c, new eha(this));
/*  81 */     a(aqe.d, new eea(this));
/*  82 */     a(aqe.e, new eeb(this));
/*  83 */     a(aqe.f, new eec(this));
/*  84 */     a(aqe.g, new eed(this));
/*  85 */     a(aqe.h, new eee(this));
/*  86 */     a(aqe.i, new eef(this));
/*  87 */     a(aqe.U, new efv<>(this));
/*  88 */     a(aqe.j, new eeh(this));
/*  89 */     a(aqe.k, new eei(this));
/*  90 */     a(aqe.V, new efv<>(this));
/*  91 */     a(aqe.l, new eej(this));
/*  92 */     a(aqe.m, new eek(this));
/*  93 */     a(aqe.n, new eel(this));
/*  94 */     a(aqe.o, new eeg<>(this, 0.87F));
/*  95 */     a(aqe.p, new eem(this));
/*  96 */     a(aqe.q, new een(this));
/*  97 */     a(aqe.aG, new egy<>(this, ☃));
/*  98 */     a(aqe.r, new eeo(this));
/*  99 */     a(aqe.s, new eep(this));
/* 100 */     a(aqe.t, new eeq(this));
/* 101 */     a(aqe.u, new eer(this));
/* 102 */     a(aqe.v, new ees(this));
/* 103 */     a(aqe.aH, new egy<>(this, ☃));
/* 104 */     a(aqe.x, new eev(this));
/* 105 */     a(aqe.w, new eew<>(this));
/* 106 */     a(aqe.aI, new egy<>(this, ☃));
/* 107 */     a(aqe.y, new eex(this));
/* 108 */     a(aqe.z, new egy<>(this, ☃, 1.0F, true));
/* 109 */     a(aqe.A, new eey(this));
/* 110 */     a(aqe.N, new egy<>(this, ☃, 3.0F, true));
/* 111 */     a(aqe.B, new eez(this, ☃));
/* 112 */     a(aqe.bd, new efa(this));
/* 113 */     a(aqe.C, new efb(this));
/* 114 */     a(aqe.W, new efv<>(this));
/* 115 */     a(aqe.D, new efc(this));
/* 116 */     a(aqe.E, new efd(this, 6.0F));
/* 117 */     a(aqe.F, new efe(this));
/* 118 */     a(aqe.G, new eff(this));
/* 119 */     a(aqe.X, new efv<>(this));
/* 120 */     a(aqe.H, new efg(this));
/* 121 */     a(aqe.I, new efi(this));
/* 122 */     a(aqe.J, new efk(this));
/* 123 */     a(aqe.K, new efl(this));
/* 124 */     a(aqe.L, new efm(this, ☃));
/* 125 */     a(aqe.M, new efn(this, ☃));
/* 126 */     a(aqe.O, new efp(this));
/* 127 */     a(aqe.P, new efq(this));
/* 128 */     a(aqe.Q, new efs(this));
/* 129 */     a(aqe.R, new eft(this));
/* 130 */     a(aqe.S, new efu(this));
/* 131 */     a(aqe.T, new efv<>(this));
/* 132 */     a(aqe.ab, new efx(this));
/* 133 */     a(aqe.aa, new eeg<>(this, 0.92F));
/* 134 */     a(aqe.ac, new efy(this));
/* 135 */     a(aqe.ad, new efz(this));
/* 136 */     a(aqe.ae, new ega(this));
/* 137 */     a(aqe.af, new egb(this));
/* 138 */     a(aqe.ag, new egc(this));
/* 139 */     a(aqe.ah, new egd(this));
/* 140 */     a(aqe.ai, new ege(this, false));
/* 141 */     a(aqe.aj, new ege(this, false));
/* 142 */     a(aqe.ak, new egf(this));
/* 143 */     a(aqe.al, new egg(this));
/* 144 */     a(aqe.aJ, new egy<>(this, ☃));
/* 145 */     a(aqe.an, new egh(this));
/* 146 */     a(aqe.ao, new egi(this));
/* 147 */     a(aqe.ap, new egj(this));
/* 148 */     a(aqe.aq, new egl(this));
/* 149 */     a(aqe.ar, new egm(this));
/* 150 */     a(aqe.at, new egn(this));
/* 151 */     a(aqe.as, new ego(this));
/* 152 */     a(aqe.au, new egp(this));
/* 153 */     a(aqe.aw, new ehf(this));
/* 154 */     a(aqe.av, new egq(this));
/* 155 */     a(aqe.ax, new egr(this));
/* 156 */     a(aqe.ay, new egy<>(this, ☃, 0.75F, true));
/* 157 */     a(aqe.aA, new egy<>(this, ☃));
/* 158 */     a(aqe.az, new egs(this));
/* 159 */     a(aqe.Y, new efv<>(this));
/* 160 */     a(aqe.aB, new egt(this));
/* 161 */     a(aqe.aC, new egu<>(this));
/* 162 */     a(aqe.aD, new egv(this));
/* 163 */     a(aqe.aE, new egw(this));
/* 164 */     a(aqe.Z, new ehb(this));
/* 165 */     a(aqe.am, new ehc(this));
/* 166 */     a(aqe.aL, new efs(this));
/* 167 */     a(aqe.aK, new egz(this));
/* 168 */     a(aqe.aM, new ehd(this));
/* 169 */     a(aqe.aN, new ehe(this));
/* 170 */     a(aqe.aO, new ehg(this));
/* 171 */     a(aqe.aP, new ehh(this, acf1));
/* 172 */     a(aqe.aQ, new ehi(this));
/* 173 */     a(aqe.aR, new ehj(this));
/* 174 */     a(aqe.aS, new ehk(this));
/* 175 */     a(aqe.aT, new ehl(this));
/* 176 */     a(aqe.aU, new ehm(this));
/* 177 */     a(aqe.aV, new ehn(this));
/* 178 */     a(aqe.aW, new eho(this));
/* 179 */     a(aqe.aX, new ehp(this));
/* 180 */     a(aqe.aZ, new ehf(this));
/* 181 */     a(aqe.aY, new ehq(this));
/* 182 */     a(aqe.bb, new ege(this, true));
/* 183 */     a(aqe.ba, new ehr(this, acf1));
/* 184 */     a(aqe.aF, new egx(this));
/*     */   }
/*     */   
/*     */   public eet(ekd ☃, efo efo1, acf acf1, dku dku1, dkd dkd1) {
/* 188 */     this.a = ☃;
/* 189 */     this.i = dku1;
/* 190 */     this.d = dkd1;
/*     */     
/* 192 */     a(efo1, acf1);
/*     */ 
/*     */     
/* 195 */     this.h = new ejk(this);
/* 196 */     this.g.put("default", this.h);
/* 197 */     this.g.put("slim", new ejk(this, true));
/*     */     
/* 199 */     for (aqe<?> aqe : gm.S) {
/* 200 */       if (aqe == aqe.bc) {
/*     */         continue;
/*     */       }
/* 203 */       if (!this.f.containsKey(aqe)) {
/* 204 */         throw new IllegalStateException("No renderer registered for " + gm.S.b(aqe));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public <T extends aqa> eeu<? super T> a(T ☃) {
/* 211 */     if (☃ instanceof dzj) {
/* 212 */       String str = ((dzj)☃).u();
/* 213 */       ejk ejk1 = this.g.get(str);
/* 214 */       if (ejk1 != null) {
/* 215 */         return ejk1;
/*     */       }
/* 217 */       return this.h;
/*     */     } 
/* 219 */     return (eeu<? super T>)this.f.get(☃.X());
/*     */   }
/*     */   
/*     */   public void a(brx ☃, djk djk1, aqa aqa1) {
/* 223 */     this.j = ☃;
/* 224 */     this.b = djk1;
/* 225 */     this.k = djk1.f();
/* 226 */     this.c = aqa1;
/*     */   }
/*     */   
/*     */   public void a(d ☃) {
/* 230 */     this.k = ☃;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 234 */     this.l = ☃;
/*     */   }
/*     */   
/*     */   public void b(boolean ☃) {
/* 238 */     this.m = ☃;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 242 */     return this.m;
/*     */   }
/*     */   
/*     */   public <E extends aqa> boolean a(E ☃, ecz ecz1, double d1, double d2, double d3) {
/* 246 */     eeu<? super E> eeu = a(☃);
/* 247 */     return eeu.a(☃, ecz1, d1, d2, d3);
/*     */   }
/*     */   
/*     */   public <E extends aqa> void a(E ☃, double d1, double d2, double d3, float f1, float f2, dfm dfm1, eag eag1, int i) {
/* 251 */     eeu<? super E> eeu = a(☃);
/*     */     
/*     */     try {
/* 254 */       dcn dcn = eeu.a(☃, f2);
/* 255 */       double d4 = d1 + dcn.a();
/* 256 */       double d5 = d2 + dcn.b();
/* 257 */       double d6 = d3 + dcn.c();
/*     */       
/* 259 */       dfm1.a();
/* 260 */       dfm1.a(d4, d5, d6);
/* 261 */       eeu.a(☃, f1, f2, dfm1, eag1, i);
/*     */       
/* 263 */       if (☃.bR()) {
/* 264 */         a(dfm1, eag1, (aqa)☃);
/*     */       }
/*     */       
/* 267 */       dfm1.a(-dcn.a(), -dcn.b(), -dcn.c());
/*     */       
/* 269 */       if (this.d.P && this.l && eeu.c > 0.0F && !☃.bF()) {
/* 270 */         double d7 = a(☃.cD(), ☃.cE(), ☃.cH());
/* 271 */         float f = (float)((1.0D - d7 / 256.0D) * eeu.d);
/* 272 */         if (f > 0.0F) {
/* 273 */           a(dfm1, eag1, (aqa)☃, f, f2, this.j, eeu.c);
/*     */         }
/*     */       } 
/*     */       
/* 277 */       if (this.m && !☃.bF() && !djz.C().am()) {
/* 278 */         a(dfm1, eag1.getBuffer(eao.t()), (aqa)☃, f2);
/*     */       }
/* 280 */       dfm1.b();
/* 281 */     } catch (Throwable throwable) {
/* 282 */       l l = l.a(throwable, "Rendering entity in world");
/* 283 */       m m1 = l.a("Entity being rendered");
/* 284 */       ☃.a(m1);
/*     */       
/* 286 */       m m2 = l.a("Renderer details");
/* 287 */       m2.a("Assigned renderer", eeu);
/* 288 */       m2.a("Location", m.a(d1, d2, d3));
/* 289 */       m2.a("Rotation", Float.valueOf(f1));
/* 290 */       m2.a("Delta", Float.valueOf(f2));
/*     */       
/* 292 */       throw new u(l);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, dfq dfq1, aqa aqa1, float f) {
/* 297 */     float f1 = aqa1.cy() / 2.0F;
/*     */     
/* 299 */     a(☃, dfq1, aqa1, 1.0F, 1.0F, 1.0F);
/* 300 */     if (aqa1 instanceof bbr) {
/* 301 */       double d1 = -afm.d(f, aqa1.D, aqa1.cD());
/* 302 */       double d2 = -afm.d(f, aqa1.E, aqa1.cE());
/* 303 */       double d3 = -afm.d(f, aqa1.F, aqa1.cH());
/*     */       
/* 305 */       for (bbp bbp : ((bbr)aqa1).eJ()) {
/* 306 */         ☃.a();
/* 307 */         double d4 = d1 + afm.d(f, bbp.D, bbp.cD());
/* 308 */         double d5 = d2 + afm.d(f, bbp.E, bbp.cE());
/* 309 */         double d6 = d3 + afm.d(f, bbp.F, bbp.cH());
/*     */         
/* 311 */         ☃.a(d4, d5, d6);
/* 312 */         a(☃, dfq1, bbp, 0.25F, 1.0F, 0.0F);
/* 313 */         ☃.b();
/*     */       } 
/*     */     } 
/* 316 */     if (aqa1 instanceof aqm) {
/* 317 */       float f2 = 0.01F;
/*     */       
/* 319 */       eae.a(☃, dfq1, -f1, (aqa1
/*     */ 
/*     */ 
/*     */           
/* 323 */           .ce() - 0.01F), -f1, f1, (aqa1
/*     */ 
/*     */           
/* 326 */           .ce() + 0.01F), f1, 1.0F, 0.0F, 0.0F, 1.0F);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 333 */     dcn dcn = aqa1.f(f);
/* 334 */     b b = ☃.c().a();
/* 335 */     dfq1.a(b, 0.0F, aqa1.ce(), 0.0F).a(0, 0, 255, 255).d();
/* 336 */     dfq1.a(b, (float)(dcn.b * 2.0D), (float)(aqa1.ce() + dcn.c * 2.0D), (float)(dcn.d * 2.0D)).a(0, 0, 255, 255).d();
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, dfq dfq1, aqa aqa1, float f1, float f2, float f3) {
/* 340 */     dci dci = aqa1.cc().d(-aqa1.cD(), -aqa1.cE(), -aqa1.cH());
/* 341 */     eae.a(☃, dfq1, dci, f1, f2, f3, 1.0F);
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, eag eag1, aqa aqa1) {
/* 345 */     ekc ekc1 = els.a.c();
/* 346 */     ekc ekc2 = els.b.c();
/*     */     
/* 348 */     ☃.a();
/*     */     
/* 350 */     float f1 = aqa1.cy() * 1.4F;
/* 351 */     ☃.a(f1, f1, f1);
/*     */     
/* 353 */     float f2 = 0.5F;
/* 354 */     float f3 = 0.0F;
/*     */     
/* 356 */     float f4 = aqa1.cz() / f1;
/* 357 */     float f5 = 0.0F;
/*     */     
/* 359 */     ☃.a(g.d.a(-this.b.e()));
/* 360 */     ☃.a(0.0D, 0.0D, (-0.3F + (int)f4 * 0.02F));
/* 361 */     float f6 = 0.0F;
/* 362 */     int i = 0;
/* 363 */     dfq dfq = eag1.getBuffer(ear.h());
/*     */     
/* 365 */     dfm.a a = ☃.c();
/*     */     
/* 367 */     while (f4 > 0.0F) {
/* 368 */       ekc ekc = (i % 2 == 0) ? ekc1 : ekc2;
/*     */       
/* 370 */       float f7 = ekc.h();
/* 371 */       float f8 = ekc.j();
/* 372 */       float f9 = ekc.i();
/* 373 */       float f10 = ekc.k();
/* 374 */       if (i / 2 % 2 == 0) {
/* 375 */         float f = f9;
/* 376 */         f9 = f7;
/* 377 */         f7 = f;
/*     */       } 
/* 379 */       a(a, dfq, f2 - 0.0F, 0.0F - f5, f6, f9, f10);
/* 380 */       a(a, dfq, -f2 - 0.0F, 0.0F - f5, f6, f7, f10);
/* 381 */       a(a, dfq, -f2 - 0.0F, 1.4F - f5, f6, f7, f8);
/* 382 */       a(a, dfq, f2 - 0.0F, 1.4F - f5, f6, f9, f8);
/* 383 */       f4 -= 0.45F;
/* 384 */       f5 -= 0.45F;
/* 385 */       f2 *= 0.9F;
/* 386 */       f6 += 0.03F;
/* 387 */       i++;
/*     */     } 
/* 389 */     ☃.b();
/*     */   }
/*     */   
/*     */   private static void a(dfm.a ☃, dfq dfq1, float f1, float f2, float f3, float f4, float f5) {
/* 393 */     dfq1.a(☃.a(), f1, f2, f3).a(255, 255, 255, 255).a(f4, f5).a(0, 10).a(240).a(☃.b(), 0.0F, 1.0F, 0.0F).d();
/*     */   }
/*     */   
/*     */   private static void a(dfm ☃, eag eag1, aqa aqa1, float f1, float f2, brz brz1, float f3) {
/* 397 */     float f = f3;
/* 398 */     if (aqa1 instanceof aqn) {
/* 399 */       aqn aqn = (aqn)aqa1;
/*     */       
/* 401 */       if (aqn.w_()) {
/* 402 */         f *= 0.5F;
/*     */       }
/*     */     } 
/*     */     
/* 406 */     double d1 = afm.d(f2, aqa1.D, aqa1.cD());
/* 407 */     double d2 = afm.d(f2, aqa1.E, aqa1.cE());
/* 408 */     double d3 = afm.d(f2, aqa1.F, aqa1.cH());
/*     */     
/* 410 */     int i = afm.c(d1 - f);
/* 411 */     int j = afm.c(d1 + f);
/* 412 */     int k = afm.c(d2 - f);
/* 413 */     int m = afm.c(d2);
/* 414 */     int n = afm.c(d3 - f);
/* 415 */     int i1 = afm.c(d3 + f);
/*     */     
/* 417 */     dfm.a a = ☃.c();
/*     */     
/* 419 */     dfq dfq = eag1.getBuffer(e);
/* 420 */     for (fx fx : fx.a(new fx(i, k, n), new fx(j, m, i1))) {
/* 421 */       a(a, dfq, brz1, fx, d1, d2, d3, f, f1);
/*     */     }
/*     */   }
/*     */   
/*     */   private static void a(dfm.a ☃, dfq dfq1, brz brz1, fx fx1, double d1, double d2, double d3, float f1, float f2) {
/* 426 */     fx fx2 = fx1.c();
/* 427 */     ceh ceh = brz1.d_(fx2);
/* 428 */     if (ceh.h() == bzh.a || brz1.B(fx1) <= 3) {
/*     */       return;
/*     */     }
/*     */     
/* 432 */     if (!ceh.r(brz1, fx2)) {
/*     */       return;
/*     */     }
/*     */     
/* 436 */     ddh ddh = ceh.j(brz1, fx1.c());
/* 437 */     if (ddh.b()) {
/*     */       return;
/*     */     }
/*     */     
/* 441 */     float f = (float)((f2 - (d2 - fx1.v()) / 2.0D) * 0.5D * brz1.y(fx1));
/* 442 */     if (f >= 0.0F) {
/* 443 */       if (f > 1.0F) {
/* 444 */         f = 1.0F;
/*     */       }
/*     */ 
/*     */       
/* 448 */       dci dci = ddh.a();
/*     */       
/* 450 */       double d4 = fx1.u() + dci.a;
/* 451 */       double d5 = fx1.u() + dci.d;
/* 452 */       double d6 = fx1.v() + dci.b;
/* 453 */       double d7 = fx1.w() + dci.c;
/* 454 */       double d8 = fx1.w() + dci.f;
/*     */       
/* 456 */       float f3 = (float)(d4 - d1);
/* 457 */       float f4 = (float)(d5 - d1);
/* 458 */       float f5 = (float)(d6 - d2);
/* 459 */       float f6 = (float)(d7 - d3);
/* 460 */       float f7 = (float)(d8 - d3);
/*     */       
/* 462 */       float f8 = -f3 / 2.0F / f1 + 0.5F;
/* 463 */       float f9 = -f4 / 2.0F / f1 + 0.5F;
/* 464 */       float f10 = -f6 / 2.0F / f1 + 0.5F;
/* 465 */       float f11 = -f7 / 2.0F / f1 + 0.5F;
/*     */       
/* 467 */       a(☃, dfq1, f, f3, f5, f6, f8, f10);
/* 468 */       a(☃, dfq1, f, f3, f5, f7, f8, f11);
/* 469 */       a(☃, dfq1, f, f4, f5, f7, f9, f11);
/* 470 */       a(☃, dfq1, f, f4, f5, f6, f9, f10);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void a(dfm.a ☃, dfq dfq1, float f1, float f2, float f3, float f4, float f5, float f6) {
/* 475 */     dfq1.a(☃.a(), f2, f3, f4).a(1.0F, 1.0F, 1.0F, f1).a(f5, f6).b(ejw.a).a(15728880).a(☃.b(), 0.0F, 1.0F, 0.0F).d();
/*     */   }
/*     */   
/*     */   public void a(@Nullable brx ☃) {
/* 479 */     this.j = ☃;
/* 480 */     if (☃ == null) {
/* 481 */       this.b = null;
/*     */     }
/*     */   }
/*     */   
/*     */   public double b(aqa ☃) {
/* 486 */     return this.b.b().g(☃.cA());
/*     */   }
/*     */   
/*     */   public double a(double ☃, double d1, double d2) {
/* 490 */     return this.b.b().c(☃, d1, d2);
/*     */   }
/*     */   
/*     */   public d b() {
/* 494 */     return this.k;
/*     */   }
/*     */   
/*     */   public dku c() {
/* 498 */     return this.i;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */