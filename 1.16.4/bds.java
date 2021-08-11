/*     */ import java.util.Comparator;
/*     */ import java.util.EnumSet;
/*     */ import java.util.List;
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
/*     */ public class bds
/*     */   extends aqh
/*     */   implements bdi
/*     */ {
/*  49 */   private static final us<Integer> b = uv.a((Class)bds.class, uu.b);
/*     */   
/*  51 */   private dcn c = dcn.a;
/*  52 */   private fx d = fx.b;
/*     */   
/*     */   enum a {
/*  55 */     a,
/*  56 */     b;
/*     */   }
/*     */   
/*  59 */   private a bo = a.a;
/*     */   
/*     */   public bds(aqe<? extends bds> ☃, brx brx1) {
/*  62 */     super((aqe)☃, brx1);
/*  63 */     this.f = 5;
/*     */     
/*  65 */     this.bh = new g(this, this);
/*  66 */     this.g = new f(this, this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected auu r() {
/*  71 */     return new d(this, this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  76 */     this.bk.a(1, new c());
/*  77 */     this.bk.a(2, new i());
/*  78 */     this.bk.a(3, new e());
/*     */     
/*  80 */     this.bl.a(1, new b());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  85 */     super.e();
/*     */     
/*  87 */     this.R.a(b, Integer.valueOf(0));
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/*  91 */     this.R.b(b, Integer.valueOf(afm.a(☃, 0, 64)));
/*     */   }
/*     */   
/*     */   private void eJ() {
/*  95 */     x_();
/*  96 */     a(arl.f).a((6 + m()));
/*     */   }
/*     */   
/*     */   public int m() {
/* 100 */     return ((Integer)this.R.<Integer>a(b)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected float b(aqx ☃, aqb aqb1) {
/* 105 */     return aqb1.b * 0.35F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(us<?> ☃) {
/* 110 */     if (b.equals(☃)) {
/* 111 */       eJ();
/*     */     }
/*     */     
/* 114 */     super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean L() {
/* 119 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 124 */     super.j();
/*     */     
/* 126 */     if (this.l.v) {
/* 127 */       float ☃ = afm.b((Y() * 3 + this.K) * 0.13F + 3.1415927F);
/* 128 */       float f1 = afm.b((Y() * 3 + this.K + 1) * 0.13F + 3.1415927F);
/* 129 */       if (☃ > 0.0F && f1 <= 0.0F) {
/* 130 */         this.l.a(cD(), cE(), cH(), adq.kK, cu(), 0.95F + this.J.nextFloat() * 0.05F, 0.95F + this.J.nextFloat() * 0.05F, false);
/*     */       }
/*     */       
/* 133 */       int i = m();
/* 134 */       float f2 = afm.b(this.p * 0.017453292F) * (1.3F + 0.21F * i);
/* 135 */       float f3 = afm.a(this.p * 0.017453292F) * (1.3F + 0.21F * i);
/* 136 */       float f4 = (0.3F + ☃ * 0.45F) * (i * 0.2F + 1.0F);
/* 137 */       this.l.a(hh.N, cD() + f2, cE() + f4, cH() + f3, 0.0D, 0.0D, 0.0D);
/* 138 */       this.l.a(hh.N, cD() - f2, cE() + f4, cH() - f3, 0.0D, 0.0D, 0.0D);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 144 */     if (aX() && eG()) {
/* 145 */       f(8);
/*     */     }
/* 147 */     super.k();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void N() {
/* 152 */     super.N();
/*     */   }
/*     */ 
/*     */   
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/* 157 */     this.d = cB().b(5);
/* 158 */     a(0);
/* 159 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 164 */     super.a(☃);
/*     */     
/* 166 */     if (☃.e("AX")) {
/* 167 */       this.d = new fx(☃.h("AX"), ☃.h("AY"), ☃.h("AZ"));
/*     */     }
/* 169 */     a(☃.h("Size"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 174 */     super.b(☃);
/*     */     
/* 176 */     ☃.b("AX", this.d.u());
/* 177 */     ☃.b("AY", this.d.v());
/* 178 */     ☃.b("AZ", this.d.w());
/* 179 */     ☃.b("Size", m());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃) {
/* 184 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public adr cu() {
/* 189 */     return adr.f;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 194 */     return adq.kH;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 199 */     return adq.kL;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 204 */     return adq.kJ;
/*     */   }
/*     */ 
/*     */   
/*     */   public aqq dC() {
/* 209 */     return aqq.b;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float dG() {
/* 214 */     return 1.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aqe<?> ☃) {
/* 219 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public aqb a(aqx ☃) {
/* 228 */     int i = m();
/*     */     
/* 230 */     aqb aqb = super.a(☃);
/* 231 */     float f = (aqb.a + 0.2F * i) / aqb.a;
/* 232 */     return aqb.a(f);
/*     */   }
/*     */   
/*     */   class g extends avb {
/* 236 */     private float j = 0.1F;
/*     */     
/*     */     public g(bds this$0, aqn ☃) {
/* 239 */       super(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 244 */       if (this.i.u) {
/*     */         
/* 246 */         this.i.p += 180.0F;
/* 247 */         this.j = 0.1F;
/*     */       } 
/*     */ 
/*     */       
/* 251 */       float ☃ = (float)((bds.a(this.i)).b - this.i.cD());
/* 252 */       float f1 = (float)((bds.a(this.i)).c - this.i.cE());
/* 253 */       float f2 = (float)((bds.a(this.i)).d - this.i.cH());
/* 254 */       double d1 = afm.c(☃ * ☃ + f2 * f2);
/* 255 */       double d2 = 1.0D - afm.e(f1 * 0.7F) / d1;
/* 256 */       ☃ = (float)(☃ * d2);
/* 257 */       f2 = (float)(f2 * d2);
/* 258 */       d1 = afm.c(☃ * ☃ + f2 * f2);
/* 259 */       double d3 = afm.c(☃ * ☃ + f2 * f2 + f1 * f1);
/*     */ 
/*     */       
/* 262 */       float f3 = this.i.p;
/* 263 */       float f4 = (float)afm.d(f2, ☃);
/* 264 */       float f5 = afm.g(this.i.p + 90.0F);
/* 265 */       float f6 = afm.g(f4 * 57.295776F);
/* 266 */       this.i.p = afm.d(f5, f6, 4.0F) - 90.0F;
/* 267 */       this.i.aA = this.i.p;
/*     */       
/* 269 */       if (afm.d(f3, this.i.p) < 3.0F) {
/* 270 */         this.j = afm.c(this.j, 1.8F, 0.005F * 1.8F / this.j);
/*     */       } else {
/* 272 */         this.j = afm.c(this.j, 0.2F, 0.025F);
/*     */       } 
/*     */       
/* 275 */       float f7 = (float)-(afm.d(-f1, d1) * 57.2957763671875D);
/* 276 */       this.i.q = f7;
/*     */       
/* 278 */       float f8 = this.i.p + 90.0F;
/* 279 */       double d4 = (this.j * afm.b(f8 * 0.017453292F)) * Math.abs(☃ / d3);
/* 280 */       double d5 = (this.j * afm.a(f8 * 0.017453292F)) * Math.abs(f2 / d3);
/* 281 */       double d6 = (this.j * afm.a(f7 * 0.017453292F)) * Math.abs(f1 / d3);
/*     */       
/* 283 */       dcn dcn = this.i.cC();
/* 284 */       this.i.f(dcn.e((new dcn(d4, d6, d5)).d(dcn).a(0.2D)));
/*     */     }
/*     */   }
/*     */   
/*     */   class d extends auu {
/*     */     public d(bds this$0, aqn ☃) {
/* 290 */       super(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 295 */       this.a.aC = this.a.aA;
/* 296 */       this.a.aA = this.a.p;
/*     */     }
/*     */   }
/*     */   
/*     */   class f extends ava {
/*     */     public f(bds this$0, aqn ☃) {
/* 302 */       super(☃);
/*     */     }
/*     */     
/*     */     public void a() {}
/*     */   }
/*     */   
/*     */   abstract class h
/*     */     extends avv
/*     */   {
/*     */     public h(bds this$0) {
/* 312 */       a(EnumSet.of(avv.a.a));
/*     */     }
/*     */     
/*     */     protected boolean g() {
/* 316 */       return (bds.a(this.b).c(this.b.cD(), this.b.cE(), this.b.cH()) < 4.0D);
/*     */     } }
/*     */   
/*     */   class e extends h {
/*     */     private float c;
/*     */     private float d;
/*     */     private float e;
/*     */     private float f;
/*     */     
/*     */     private e(bds this$0) {}
/*     */     
/*     */     public boolean a() {
/* 328 */       return (this.a.A() == null || bds.b(this.a) == bds.a.a);
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 333 */       this.d = 5.0F + bds.c(this.a).nextFloat() * 10.0F;
/* 334 */       this.e = -4.0F + bds.d(this.a).nextFloat() * 9.0F;
/* 335 */       this.f = bds.e(this.a).nextBoolean() ? 1.0F : -1.0F;
/* 336 */       h();
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 341 */       if (bds.f(this.a).nextInt(350) == 0) {
/* 342 */         this.e = -4.0F + bds.g(this.a).nextFloat() * 9.0F;
/*     */       }
/* 344 */       if (bds.h(this.a).nextInt(250) == 0) {
/* 345 */         this.d++;
/* 346 */         if (this.d > 15.0F) {
/* 347 */           this.d = 5.0F;
/* 348 */           this.f = -this.f;
/*     */         } 
/*     */       } 
/* 351 */       if (bds.i(this.a).nextInt(450) == 0) {
/* 352 */         this.c = bds.j(this.a).nextFloat() * 2.0F * 3.1415927F;
/* 353 */         h();
/*     */       } 
/* 355 */       if (g()) {
/* 356 */         h();
/*     */       }
/*     */       
/* 359 */       if ((bds.a(this.a)).c < this.a.cE() && !this.a.l.w(this.a.cB().c(1))) {
/* 360 */         this.e = Math.max(1.0F, this.e);
/* 361 */         h();
/*     */       } 
/*     */       
/* 364 */       if ((bds.a(this.a)).c > this.a.cE() && !this.a.l.w(this.a.cB().b(1))) {
/* 365 */         this.e = Math.min(-1.0F, this.e);
/* 366 */         h();
/*     */       } 
/*     */     }
/*     */     
/*     */     private void h() {
/* 371 */       if (fx.b.equals(bds.k(this.a))) {
/* 372 */         bds.a(this.a, this.a.cB());
/*     */       }
/* 374 */       this.c += this.f * 15.0F * 0.017453292F;
/* 375 */       bds.a(this.a, dcn.b(bds.k(this.a)).b((this.d * afm.b(this.c)), (-4.0F + this.e), (this.d * afm.a(this.c))));
/*     */     }
/*     */   }
/*     */   
/*     */   class i
/*     */     extends h {
/*     */     public boolean a() {
/* 382 */       return (this.a.A() != null && bds.b(this.a) == bds.a.b);
/*     */     }
/*     */     private i(bds this$0) {}
/*     */     
/*     */     public boolean b() {
/* 387 */       aqm ☃ = this.a.A();
/* 388 */       if (☃ == null) {
/* 389 */         return false;
/*     */       }
/* 391 */       if (!☃.aX()) {
/* 392 */         return false;
/*     */       }
/* 394 */       if (☃ instanceof bfw && (((bfw)☃).a_() || ((bfw)☃).b_())) {
/* 395 */         return false;
/*     */       }
/*     */       
/* 398 */       if (!a()) {
/* 399 */         return false;
/*     */       }
/*     */       
/* 402 */       if (this.a.K % 20 == 0) {
/* 403 */         List<bab> list = (List)this.a.l.a((Class)bab.class, this.a.cc().g(16.0D), aqd.a);
/* 404 */         if (!list.isEmpty()) {
/* 405 */           for (bab bab : list) {
/* 406 */             bab.eZ();
/*     */           }
/* 408 */           return false;
/*     */         } 
/*     */       } 
/*     */       
/* 412 */       return true;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void c() {}
/*     */ 
/*     */     
/*     */     public void d() {
/* 421 */       this.a.h((aqm)null);
/* 422 */       bds.a(this.a, bds.a.a);
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 427 */       aqm ☃ = this.a.A();
/* 428 */       bds.a(this.a, new dcn(☃.cD(), ☃.e(0.5D), ☃.cH()));
/*     */       
/* 430 */       if (this.a.cc().g(0.20000000298023224D).c(☃.cc())) {
/* 431 */         this.a.B(☃);
/* 432 */         bds.a(this.a, bds.a.a);
/* 433 */         if (!this.a.aA()) {
/* 434 */           this.a.l.c(1039, this.a.cB(), 0);
/*     */         }
/* 436 */       } else if (this.a.u || this.a.an > 0) {
/* 437 */         bds.a(this.a, bds.a.a);
/*     */       } 
/*     */     } }
/*     */   
/*     */   class c extends avv {
/*     */     private int b;
/*     */     
/*     */     private c(bds this$0) {}
/*     */     
/*     */     public boolean a() {
/* 447 */       aqm ☃ = this.a.A();
/* 448 */       if (☃ != null) {
/* 449 */         return this.a.a(this.a.A(), azg.a);
/*     */       }
/* 451 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 456 */       this.b = 10;
/* 457 */       bds.a(this.a, bds.a.a);
/* 458 */       g();
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 463 */       bds.a(this.a, this.a.l.a(chn.a.e, bds.k(this.a)).b(10 + bds.l(this.a).nextInt(20)));
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 468 */       if (bds.b(this.a) == bds.a.a) {
/* 469 */         this.b--;
/* 470 */         if (this.b <= 0) {
/* 471 */           bds.a(this.a, bds.a.b);
/* 472 */           g();
/* 473 */           this.b = (8 + bds.m(this.a).nextInt(4)) * 20;
/*     */           
/* 475 */           this.a.a(adq.kM, 10.0F, 0.95F + bds.n(this.a).nextFloat() * 0.1F);
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     private void g() {
/* 481 */       bds.a(this.a, this.a.A().cB().b(20 + bds.o(this.a).nextInt(20)));
/* 482 */       if (bds.k(this.a).v() < this.a.l.t_())
/* 483 */         bds.a(this.a, new fx(bds.k(this.a).u(), this.a.l.t_() + 1, bds.k(this.a).w())); 
/*     */     }
/*     */   }
/*     */   
/*     */   class b
/*     */     extends avv
/*     */   {
/* 490 */     private final azg b = (new azg()).a(64.0D);
/*     */     
/* 492 */     private int c = 20;
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 496 */       if (this.c > 0) {
/* 497 */         this.c--;
/* 498 */         return false;
/*     */       } 
/* 500 */       this.c = 60;
/*     */       
/* 502 */       List<bfw> ☃ = this.a.l.a(this.b, this.a, this.a.cc().c(16.0D, 64.0D, 16.0D));
/* 503 */       if (!☃.isEmpty()) {
/*     */         
/* 505 */         ☃.sort(Comparator.<bfw, Comparable>comparing(aqa::cE).reversed());
/* 506 */         for (bfw bfw : ☃) {
/* 507 */           if (this.a.a(bfw, azg.a)) {
/* 508 */             this.a.h(bfw);
/* 509 */             return true;
/*     */           } 
/*     */         } 
/*     */       } 
/* 513 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 518 */       aqm ☃ = this.a.A();
/* 519 */       if (☃ != null) {
/* 520 */         return this.a.a(☃, azg.a);
/*     */       }
/*     */       
/* 523 */       return false;
/*     */     }
/*     */     
/*     */     private b(bds this$0) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bds.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */