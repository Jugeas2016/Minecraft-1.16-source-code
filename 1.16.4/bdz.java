/*     */ import java.util.EnumSet;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
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
/*     */ public class bdz
/*     */   extends aqn
/*     */   implements bdi
/*     */ {
/*  51 */   private static final us<Integer> bo = uv.a((Class)bdz.class, uu.b);
/*     */   
/*     */   public float b;
/*     */   public float c;
/*     */   public float d;
/*     */   private boolean bp;
/*     */   
/*     */   public bdz(aqe<? extends bdz> ☃, brx brx1) {
/*  59 */     super((aqe)☃, brx1);
/*     */     
/*  61 */     this.bh = new d(this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  66 */     this.bk.a(1, new b(this));
/*     */     
/*  68 */     this.bk.a(2, new a(this));
/*  69 */     this.bk.a(3, new e(this));
/*     */     
/*  71 */     this.bk.a(5, new c(this));
/*     */ 
/*     */     
/*  74 */     this.bl.a(1, new axq<>(this, bfw.class, 10, true, false, ☃ -> (Math.abs(☃.cE() - cE()) <= 4.0D)));
/*  75 */     this.bl.a(3, new axq<>(this, bai.class, true));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  80 */     super.e();
/*     */     
/*  82 */     this.R.a(bo, Integer.valueOf(1));
/*     */   }
/*     */   
/*     */   protected void a(int ☃, boolean bool) {
/*  86 */     this.R.b(bo, Integer.valueOf(☃));
/*  87 */     af();
/*     */     
/*  89 */     x_();
/*     */     
/*  91 */     a(arl.a).a((☃ * ☃));
/*  92 */     a(arl.d).a((0.2F + 0.1F * ☃));
/*  93 */     a(arl.f).a(☃);
/*  94 */     if (bool) {
/*  95 */       c(dx());
/*     */     }
/*  97 */     this.f = ☃;
/*     */   }
/*     */   
/*     */   public int eP() {
/* 101 */     return ((Integer)this.R.<Integer>a(bo)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 106 */     super.b(☃);
/* 107 */     ☃.b("Size", eP() - 1);
/* 108 */     ☃.a("wasOnGround", this.bp);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 113 */     int i = ☃.h("Size");
/* 114 */     if (i < 0) {
/* 115 */       i = 0;
/*     */     }
/* 117 */     a(i + 1, false);
/* 118 */     super.a(☃);
/* 119 */     this.bp = ☃.q("wasOnGround");
/*     */   }
/*     */   
/*     */   public boolean eQ() {
/* 123 */     return (eP() <= 1);
/*     */   }
/*     */   
/*     */   protected hf eI() {
/* 127 */     return hh.J;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean L() {
/* 132 */     return (eP() > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 137 */     this.c += (this.b - this.c) * 0.5F;
/* 138 */     this.d = this.c;
/* 139 */     super.j();
/*     */     
/* 141 */     if (this.t && !this.bp) {
/* 142 */       int ☃ = eP();
/* 143 */       for (int i = 0; i < ☃ * 8; i++) {
/* 144 */         float f1 = this.J.nextFloat() * 6.2831855F;
/* 145 */         float f2 = this.J.nextFloat() * 0.5F + 0.5F;
/* 146 */         float f3 = afm.a(f1) * ☃ * 0.5F * f2;
/* 147 */         float f4 = afm.b(f1) * ☃ * 0.5F * f2;
/* 148 */         this.l.a(eI(), cD() + f3, cE(), cH() + f4, 0.0D, 0.0D, 0.0D);
/*     */       } 
/*     */       
/* 151 */       a(eN(), dG(), ((this.J.nextFloat() - this.J.nextFloat()) * 0.2F + 1.0F) / 0.8F);
/* 152 */       this.b = -0.5F;
/* 153 */     } else if (!this.t && this.bp) {
/* 154 */       this.b = 1.0F;
/*     */     } 
/* 156 */     this.bp = this.t;
/* 157 */     eK();
/*     */   }
/*     */   
/*     */   protected void eK() {
/* 161 */     this.b *= 0.6F;
/*     */   }
/*     */   
/*     */   protected int eJ() {
/* 165 */     return this.J.nextInt(20) + 10;
/*     */   }
/*     */ 
/*     */   
/*     */   public void x_() {
/* 170 */     double ☃ = cD();
/* 171 */     double d1 = cE();
/* 172 */     double d2 = cH();
/* 173 */     super.x_();
/* 174 */     d(☃, d1, d2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(us<?> ☃) {
/* 179 */     if (bo.equals(☃)) {
/* 180 */       x_();
/* 181 */       this.p = this.aC;
/* 182 */       this.aA = this.aC;
/*     */       
/* 184 */       if (aE() && 
/* 185 */         this.J.nextInt(20) == 0) {
/* 186 */         aM();
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 191 */     super.a(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aqe<? extends bdz> X() {
/* 197 */     return (aqe)super.X();
/*     */   }
/*     */ 
/*     */   
/*     */   public void ad() {
/* 202 */     int ☃ = eP();
/* 203 */     if (!this.l.v && ☃ > 1 && dl()) {
/* 204 */       nr nr = T();
/* 205 */       boolean bool = eD();
/* 206 */       float f = ☃ / 4.0F;
/* 207 */       int i = ☃ / 2;
/*     */       
/* 209 */       int j = 2 + this.J.nextInt(3);
/* 210 */       for (int k = 0; k < j; k++) {
/* 211 */         float f1 = ((k % 2) - 0.5F) * f;
/* 212 */         float f2 = ((k / 2) - 0.5F) * f;
/* 213 */         bdz bdz1 = X().a(this.l);
/*     */         
/* 215 */         if (eu()) {
/* 216 */           bdz1.es();
/*     */         }
/* 218 */         bdz1.a(nr);
/* 219 */         bdz1.q(bool);
/* 220 */         bdz1.m(bM());
/*     */         
/* 222 */         bdz1.a(i, true);
/* 223 */         bdz1.b(cD() + f1, cE() + 0.5D, cH() + f2, this.J.nextFloat() * 360.0F, 0.0F);
/* 224 */         this.l.c(bdz1);
/*     */       } 
/*     */     } 
/* 227 */     super.ad();
/*     */   }
/*     */ 
/*     */   
/*     */   public void i(aqa ☃) {
/* 232 */     super.i(☃);
/* 233 */     if (☃ instanceof bai && eL()) {
/* 234 */       i((aqm)☃);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a_(bfw ☃) {
/* 240 */     if (eL()) {
/* 241 */       i(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void i(aqm ☃) {
/* 246 */     if (aX()) {
/* 247 */       int i = eP();
/* 248 */       if (h(☃) < 0.6D * i * 0.6D * i && D(☃) && 
/* 249 */         ☃.a(apk.c(this), eM())) {
/* 250 */         a(adq.nF, 1.0F, (this.J.nextFloat() - this.J.nextFloat()) * 0.2F + 1.0F);
/* 251 */         a(this, ☃);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected float b(aqx ☃, aqb aqb1) {
/* 259 */     return 0.625F * aqb1.b;
/*     */   }
/*     */   
/*     */   protected boolean eL() {
/* 263 */     return (!eQ() && dS());
/*     */   }
/*     */   
/*     */   protected float eM() {
/* 267 */     return (float)b(arl.f);
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 272 */     if (eQ()) {
/* 273 */       return adq.ok;
/*     */     }
/* 275 */     return adq.nH;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 281 */     if (eQ()) {
/* 282 */       return adq.oj;
/*     */     }
/* 284 */     return adq.nG;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp eN() {
/* 289 */     if (eQ()) {
/* 290 */       return adq.om;
/*     */     }
/* 292 */     return adq.nJ;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected vk J() {
/* 298 */     return (eP() == 1) ? X().i() : cyq.a;
/*     */   }
/*     */   
/*     */   public static boolean c(aqe<bdz> ☃, bry bry1, aqp aqp1, fx fx1, Random random) {
/* 302 */     if (bry1.ad() != aor.a) {
/*     */ 
/*     */ 
/*     */       
/* 306 */       if (Objects.equals(bry1.i(fx1), Optional.of(btb.g)) && fx1.v() > 50 && fx1.v() < 70 && random.nextFloat() < 0.5F && 
/* 307 */         random.nextFloat() < bry1.af() && bry1.B(fx1) <= random.nextInt(8)) {
/* 308 */         return a((aqe)☃, bry1, aqp1, fx1, random);
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 313 */       if (!(bry1 instanceof bsr)) {
/* 314 */         return false;
/*     */       }
/* 316 */       brd brd = new brd(fx1);
/* 317 */       boolean bool = (chx.a(brd.b, brd.c, ((bsr)bry1).C(), 987234911L).nextInt(10) == 0);
/* 318 */       if (random.nextInt(10) == 0 && bool && fx1.v() < 40) {
/* 319 */         return a((aqe)☃, bry1, aqp1, fx1, random);
/*     */       }
/*     */     } 
/* 322 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float dG() {
/* 327 */     return 0.4F * eP();
/*     */   }
/*     */ 
/*     */   
/*     */   public int O() {
/* 332 */     return 0;
/*     */   }
/*     */   
/*     */   protected boolean eR() {
/* 336 */     return (eP() > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void dK() {
/* 341 */     dcn ☃ = cC();
/* 342 */     n(☃.b, dJ(), ☃.d);
/* 343 */     this.Z = true;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/* 349 */     int i = this.J.nextInt(3);
/* 350 */     if (i < 2 && this.J.nextFloat() < 0.5F * aos1.d()) {
/* 351 */       i++;
/*     */     }
/* 353 */     int j = 1 << i;
/* 354 */     a(j, true);
/*     */     
/* 356 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*     */   }
/*     */   
/*     */   static class d extends avb {
/*     */     private float i;
/*     */     private int j;
/*     */     private final bdz k;
/*     */     private boolean l;
/*     */     
/*     */     public d(bdz ☃) {
/* 366 */       super(☃);
/* 367 */       this.k = ☃;
/* 368 */       this.i = 180.0F * ☃.p / 3.1415927F;
/*     */     }
/*     */     
/*     */     public void a(float ☃, boolean bool) {
/* 372 */       this.i = ☃;
/* 373 */       this.l = bool;
/*     */     }
/*     */     
/*     */     public void a(double ☃) {
/* 377 */       this.e = ☃;
/* 378 */       this.h = avb.a.b;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 383 */       this.a.p = a(this.a.p, this.i, 90.0F);
/* 384 */       this.a.aC = this.a.p;
/* 385 */       this.a.aA = this.a.p;
/*     */       
/* 387 */       if (this.h != avb.a.b) {
/* 388 */         this.a.t(0.0F);
/*     */         return;
/*     */       } 
/* 391 */       this.h = avb.a.a;
/*     */       
/* 393 */       if (this.a.ao()) {
/* 394 */         this.a.q((float)(this.e * this.a.b(arl.d)));
/* 395 */         if (this.j-- <= 0) {
/* 396 */           this.j = this.k.eJ();
/* 397 */           if (this.l) {
/* 398 */             this.j /= 3;
/*     */           }
/* 400 */           this.k.v().a();
/* 401 */           if (this.k.eR()) {
/* 402 */             this.k.a(this.k.eO(), this.k.dG(), bdz.a(this.k));
/*     */           }
/*     */         } else {
/* 405 */           this.k.aR = 0.0F;
/* 406 */           this.k.aT = 0.0F;
/* 407 */           this.a.q(0.0F);
/*     */         } 
/*     */       } else {
/* 410 */         this.a.q((float)(this.e * this.a.b(arl.d)));
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private float m() {
/* 416 */     float ☃ = eQ() ? 1.4F : 0.8F;
/* 417 */     return ((this.J.nextFloat() - this.J.nextFloat()) * 0.2F + 1.0F) * ☃;
/*     */   }
/*     */   
/*     */   protected adp eO() {
/* 421 */     return eQ() ? adq.ol : adq.nI;
/*     */   }
/*     */ 
/*     */   
/*     */   public aqb a(aqx ☃) {
/* 426 */     return super.a(☃).a(0.255F * eP());
/*     */   }
/*     */   
/*     */   static class a extends avv {
/*     */     private final bdz a;
/*     */     private int b;
/*     */     
/*     */     public a(bdz ☃) {
/* 434 */       this.a = ☃;
/* 435 */       a(EnumSet.of(avv.a.b));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 440 */       aqm ☃ = this.a.A();
/*     */       
/* 442 */       if (☃ == null) {
/* 443 */         return false;
/*     */       }
/* 445 */       if (!☃.aX()) {
/* 446 */         return false;
/*     */       }
/*     */       
/* 449 */       if (☃ instanceof bfw && ((bfw)☃).bC.a) {
/* 450 */         return false;
/*     */       }
/*     */       
/* 453 */       return this.a.u() instanceof bdz.d;
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 458 */       this.b = 300;
/* 459 */       super.c();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 464 */       aqm ☃ = this.a.A();
/*     */       
/* 466 */       if (☃ == null) {
/* 467 */         return false;
/*     */       }
/* 469 */       if (!☃.aX()) {
/* 470 */         return false;
/*     */       }
/* 472 */       if (☃ instanceof bfw && ((bfw)☃).bC.a) {
/* 473 */         return false;
/*     */       }
/*     */       
/* 476 */       if (--this.b <= 0) {
/* 477 */         return false;
/*     */       }
/*     */       
/* 480 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 485 */       this.a.a(this.a.A(), 10.0F, 10.0F);
/* 486 */       ((bdz.d)this.a.u()).a(this.a.p, this.a.eL());
/*     */     }
/*     */   }
/*     */   
/*     */   static class e
/*     */     extends avv {
/*     */     private final bdz a;
/*     */     private float b;
/*     */     private int c;
/*     */     
/*     */     public e(bdz ☃) {
/* 497 */       this.a = ☃;
/* 498 */       a(EnumSet.of(avv.a.b));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 503 */       return (this.a.A() == null && (bdz.b(this.a) || this.a.aE() || this.a.aQ() || this.a.a(apw.y)) && this.a.u() instanceof bdz.d);
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 508 */       if (--this.c <= 0) {
/* 509 */         this.c = 40 + this.a.cY().nextInt(60);
/* 510 */         this.b = this.a.cY().nextInt(360);
/*     */       } 
/* 512 */       ((bdz.d)this.a.u()).a(this.b, false);
/*     */     }
/*     */   }
/*     */   
/*     */   static class b extends avv {
/*     */     private final bdz a;
/*     */     
/*     */     public b(bdz ☃) {
/* 520 */       this.a = ☃;
/* 521 */       a(EnumSet.of(avv.a.c, avv.a.a));
/* 522 */       ☃.x().d(true);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 527 */       return ((this.a.aE() || this.a.aQ()) && this.a.u() instanceof bdz.d);
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 532 */       if (this.a.cY().nextFloat() < 0.8F) {
/* 533 */         this.a.v().a();
/*     */       }
/* 535 */       ((bdz.d)this.a.u()).a(1.2D);
/*     */     }
/*     */   }
/*     */   
/*     */   static class c extends avv {
/*     */     private final bdz a;
/*     */     
/*     */     public c(bdz ☃) {
/* 543 */       this.a = ☃;
/* 544 */       a(EnumSet.of(avv.a.c, avv.a.a));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 549 */       return !this.a.br();
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 554 */       ((bdz.d)this.a.u()).a(1.0D);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bdz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */