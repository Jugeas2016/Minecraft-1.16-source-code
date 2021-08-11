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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bde
/*     */   extends bej
/*     */   implements bdu
/*     */ {
/*     */   private boolean d;
/*     */   protected final ayl b;
/*     */   protected final ayi c;
/*     */   
/*     */   public bde(aqe<? extends bde> ☃, brx brx1) {
/*  67 */     super((aqe)☃, brx1);
/*  68 */     this.G = 1.0F;
/*  69 */     this.bh = new d(this);
/*     */     
/*  71 */     a(cwz.h, 0.0F);
/*  72 */     this.b = new ayl(this, brx1);
/*  73 */     this.c = new ayi(this, brx1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m() {
/*  78 */     this.bk.a(1, new c(this, 1.0D));
/*  79 */     this.bk.a(2, new f(this, 1.0D, 40, 10.0F));
/*  80 */     this.bk.a(2, new a(this, 1.0D, false));
/*  81 */     this.bk.a(5, new b(this, 1.0D));
/*  82 */     this.bk.a(6, new e(this, 1.0D, this.l.t_()));
/*  83 */     this.bk.a(7, new awt(this, 1.0D));
/*     */     
/*  85 */     this.bl.a(1, (new axp(this, new Class[] { bde.class })).a(new Class[] { bel.class }));
/*  86 */     this.bl.a(2, new axq<>(this, bfw.class, 10, true, false, this::i));
/*  87 */     this.bl.a(3, new axq<>(this, bfe.class, false));
/*  88 */     this.bl.a(3, new axq<>(this, bai.class, true));
/*  89 */     this.bl.a(5, new axq<>(this, bax.class, 10, true, false, bax.bo));
/*     */   }
/*     */ 
/*     */   
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/*  94 */     arc1 = super.a(☃, aos1, aqp1, arc1, md1);
/*     */     
/*  96 */     if (b(aqf.b).a() && 
/*  97 */       this.J.nextFloat() < 0.03F) {
/*  98 */       a(aqf.b, new bmb(bmd.qO));
/*  99 */       this.bm[aqf.b.b()] = 2.0F;
/*     */     } 
/*     */ 
/*     */     
/* 103 */     return arc1;
/*     */   }
/*     */   
/*     */   public static boolean a(aqe<bde> ☃, bsk bsk1, aqp aqp1, fx fx1, Random random) {
/* 107 */     Optional<vj<bsv>> optional = bsk1.i(fx1);
/*     */ 
/*     */     
/* 110 */     boolean bool = (bsk1.ad() != aor.a && a(bsk1, fx1, random) && (aqp1 == aqp.c || bsk1.b(fx1).a(aef.b)));
/*     */ 
/*     */     
/* 113 */     if (Objects.equals(optional, Optional.of(btb.h)) || Objects.equals(optional, Optional.of(btb.l))) {
/* 114 */       return (random.nextInt(15) == 0 && bool);
/*     */     }
/* 116 */     return (random.nextInt(40) == 0 && a(bsk1, fx1) && bool);
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean a(bry ☃, fx fx1) {
/* 121 */     return (fx1.v() < ☃.t_() - 5);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean eK() {
/* 126 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 131 */     if (aE()) {
/* 132 */       return adq.cU;
/*     */     }
/* 134 */     return adq.cT;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 139 */     if (aE()) {
/* 140 */       return adq.cY;
/*     */     }
/* 142 */     return adq.cX;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 147 */     if (aE()) {
/* 148 */       return adq.cW;
/*     */     }
/* 150 */     return adq.cV;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp eL() {
/* 155 */     return adq.da;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp av() {
/* 160 */     return adq.db;
/*     */   }
/*     */ 
/*     */   
/*     */   protected bmb eM() {
/* 165 */     return bmb.b;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(aos ☃) {
/* 170 */     if (this.J.nextFloat() > 0.9D) {
/* 171 */       int i = this.J.nextInt(16);
/* 172 */       if (i < 10) {
/* 173 */         a(aqf.a, new bmb(bmd.qM));
/*     */       } else {
/* 175 */         a(aqf.a, new bmb(bmd.mi));
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(bmb ☃, bmb bmb1) {
/* 182 */     if (bmb1.b() == bmd.qO) {
/* 183 */       return false;
/*     */     }
/*     */     
/* 186 */     if (bmb1.b() == bmd.qM) {
/* 187 */       if (☃.b() == bmd.qM) {
/* 188 */         return (☃.g() < bmb1.g());
/*     */       }
/*     */       
/* 191 */       return false;
/* 192 */     }  if (☃.b() == bmd.qM) {
/* 193 */       return true;
/*     */     }
/*     */     
/* 196 */     return super.a(☃, bmb1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean eN() {
/* 201 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brz ☃) {
/* 206 */     return ☃.j(this);
/*     */   }
/*     */   
/*     */   public boolean i(@Nullable aqm ☃) {
/* 210 */     if (☃ != null) {
/* 211 */       if (this.l.M() && !☃.aE()) {
/* 212 */         return false;
/*     */       }
/*     */       
/* 215 */       return true;
/*     */     } 
/* 217 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bV() {
/* 222 */     return !bB();
/*     */   }
/*     */   
/*     */   private boolean eW() {
/* 226 */     if (this.d) {
/* 227 */       return true;
/*     */     }
/*     */     
/* 230 */     aqm ☃ = A();
/* 231 */     if (☃ != null && ☃.aE()) {
/* 232 */       return true;
/*     */     }
/*     */     
/* 235 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void g(dcn ☃) {
/* 240 */     if (dS() && aE() && eW()) {
/* 241 */       a(0.01F, ☃);
/* 242 */       a(aqr.a, cC());
/*     */       
/* 244 */       f(cC().a(0.9D));
/*     */     } else {
/* 246 */       super.g(☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void aJ() {
/* 252 */     if (!this.l.v) {
/* 253 */       if (dS() && aE() && eW()) {
/* 254 */         this.bj = this.b;
/* 255 */         h(true);
/*     */       } else {
/* 257 */         this.bj = this.c;
/* 258 */         h(false);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   protected boolean eO() {
/* 264 */     cxd ☃ = x().k();
/* 265 */     if (☃ != null) {
/* 266 */       fx fx = ☃.m();
/* 267 */       if (fx != null) {
/* 268 */         double d = h(fx.u(), fx.v(), fx.w());
/* 269 */         if (d < 4.0D) {
/* 270 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/* 274 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqm ☃, float f) {
/* 279 */     bgy bgy = new bgy(this.l, this, new bmb(bmd.qM));
/*     */     
/* 281 */     double d1 = ☃.cD() - cD();
/* 282 */     double d2 = ☃.e(0.3333333333333333D) - bgy.cE();
/* 283 */     double d3 = ☃.cH() - cH();
/* 284 */     double d4 = afm.a(d1 * d1 + d3 * d3);
/* 285 */     bgy.c(d1, d2 + d4 * 0.20000000298023224D, d3, 1.6F, (14 - this.l.ad().a() * 4));
/* 286 */     a(adq.cZ, 1.0F, 1.0F / (cY().nextFloat() * 0.4F + 0.8F));
/* 287 */     this.l.c(bgy);
/*     */   }
/*     */   
/*     */   public void t(boolean ☃) {
/* 291 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   static class f extends awv {
/*     */     private final bde a;
/*     */     
/*     */     public f(bdu ☃, double d, int i, float f1) {
/* 298 */       super(☃, d, i, f1);
/* 299 */       this.a = (bde)☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 304 */       return (super.a() && this.a.dD().b() == bmd.qM);
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 309 */       super.c();
/* 310 */       this.a.s(true);
/* 311 */       this.a.c(aot.a);
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 316 */       super.d();
/* 317 */       this.a.ec();
/* 318 */       this.a.s(false);
/*     */     }
/*     */   }
/*     */   
/*     */   static class e extends avv {
/*     */     private final bde a;
/*     */     private final double b;
/*     */     private final int c;
/*     */     private boolean d;
/*     */     
/*     */     public e(bde ☃, double d, int i) {
/* 329 */       this.a = ☃;
/* 330 */       this.b = d;
/* 331 */       this.c = i;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 336 */       return (!this.a.l.M() && this.a.aE() && this.a.cE() < (this.c - 2));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 341 */       return (a() && !this.d);
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 346 */       if (this.a.cE() < (this.c - 1) && (this.a.x().m() || this.a.eO())) {
/*     */         
/* 348 */         dcn ☃ = azj.b(this.a, 4, 8, new dcn(this.a.cD(), (this.c - 1), this.a.cH()));
/*     */         
/* 350 */         if (☃ == null) {
/* 351 */           this.d = true;
/*     */           
/*     */           return;
/*     */         } 
/* 355 */         this.a.x().a(☃.b, ☃.c, ☃.d, this.b);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 361 */       this.a.t(true);
/* 362 */       this.d = false;
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 367 */       this.a.t(false);
/*     */     }
/*     */   }
/*     */   
/*     */   static class b
/*     */     extends awj {
/*     */     private final bde g;
/*     */     
/*     */     public b(bde ☃, double d) {
/* 376 */       super(☃, d, 8, 2);
/* 377 */       this.g = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 382 */       return (super.a() && !this.g.l.M() && this.g.aE() && this.g.cE() >= (this.g.l.t_() - 3));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 387 */       return super.b();
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean a(brz ☃, fx fx1) {
/* 392 */       fx fx2 = fx1.b();
/* 393 */       if (!☃.w(fx2) || !☃.w(fx2.b())) {
/* 394 */         return false;
/*     */       }
/*     */       
/* 397 */       return ☃.d_(fx1).a(☃, fx1, this.g);
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 402 */       this.g.t(false);
/* 403 */       bde.a(this.g, this.g.c);
/* 404 */       super.c();
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 409 */       super.d();
/*     */     }
/*     */   }
/*     */   
/*     */   static class c extends avv {
/*     */     private final aqu a;
/*     */     private double b;
/*     */     private double c;
/*     */     private double d;
/*     */     private final double e;
/*     */     private final brx f;
/*     */     
/*     */     public c(aqu ☃, double d) {
/* 422 */       this.a = ☃;
/* 423 */       this.e = d;
/* 424 */       this.f = ☃.l;
/* 425 */       a(EnumSet.of(avv.a.a));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 430 */       if (!this.f.M()) {
/* 431 */         return false;
/*     */       }
/* 433 */       if (this.a.aE()) {
/* 434 */         return false;
/*     */       }
/*     */       
/* 437 */       dcn ☃ = g();
/* 438 */       if (☃ == null) {
/* 439 */         return false;
/*     */       }
/* 441 */       this.b = ☃.b;
/* 442 */       this.c = ☃.c;
/* 443 */       this.d = ☃.d;
/* 444 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 449 */       return !this.a.x().m();
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 454 */       this.a.x().a(this.b, this.c, this.d, this.e);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     private dcn g() {
/* 459 */       Random ☃ = this.a.cY();
/* 460 */       fx fx = this.a.cB();
/*     */       
/* 462 */       for (int i = 0; i < 10; i++) {
/* 463 */         fx fx1 = fx.b(☃.nextInt(20) - 10, 2 - ☃.nextInt(8), ☃.nextInt(20) - 10);
/*     */         
/* 465 */         if (this.f.d_(fx1).a(bup.A)) {
/* 466 */           return dcn.c(fx1);
/*     */         }
/*     */       } 
/* 469 */       return null;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a extends axm {
/*     */     private final bde b;
/*     */     
/*     */     public a(bde ☃, double d, boolean bool) {
/* 477 */       super(☃, d, bool);
/* 478 */       this.b = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 483 */       return (super.a() && this.b.i(this.b.A()));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 488 */       return (super.b() && this.b.i(this.b.A()));
/*     */     }
/*     */   }
/*     */   
/*     */   static class d extends avb {
/*     */     private final bde i;
/*     */     
/*     */     public d(bde ☃) {
/* 496 */       super(☃);
/* 497 */       this.i = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 502 */       aqm ☃ = this.i.A();
/* 503 */       if (bde.a(this.i) && this.i.aE()) {
/* 504 */         if ((☃ != null && ☃.cE() > this.i.cE()) || bde.b(this.i))
/*     */         {
/* 506 */           this.i.f(this.i.cC().b(0.0D, 0.002D, 0.0D));
/*     */         }
/*     */         
/* 509 */         if (this.h != avb.a.b || this.i.x().m()) {
/* 510 */           this.i.q(0.0F);
/*     */           
/*     */           return;
/*     */         } 
/* 514 */         double d1 = this.b - this.i.cD();
/* 515 */         double d2 = this.c - this.i.cE();
/* 516 */         double d3 = this.d - this.i.cH();
/* 517 */         double d4 = afm.a(d1 * d1 + d2 * d2 + d3 * d3);
/* 518 */         d2 /= d4;
/*     */         
/* 520 */         float f1 = (float)(afm.d(d3, d1) * 57.2957763671875D) - 90.0F;
/* 521 */         this.i.p = a(this.i.p, f1, 90.0F);
/* 522 */         this.i.aA = this.i.p;
/*     */         
/* 524 */         float f2 = (float)(this.e * this.i.b(arl.d));
/* 525 */         float f3 = afm.g(0.125F, this.i.dN(), f2);
/* 526 */         this.i.q(f3);
/* 527 */         this.i.f(this.i.cC().b(f3 * d1 * 0.005D, f3 * d2 * 0.1D, f3 * d3 * 0.005D));
/*     */       
/*     */       }
/*     */       else {
/*     */ 
/*     */         
/* 533 */         if (!bde.c(this.i)) {
/* 534 */           this.i.f(this.i.cC().b(0.0D, -0.008D, 0.0D));
/*     */         }
/* 536 */         super.a();
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bde.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */