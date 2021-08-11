/*     */ import java.util.EnumSet;
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import java.util.Random;
/*     */ import java.util.UUID;
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
/*     */ public class bdw
/*     */   extends azx
/*     */   implements bdi
/*     */ {
/*  53 */   private static final UUID bp = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
/*  54 */   private static final arj bq = new arj(bp, "Covered armor bonus", 20.0D, arj.a.a);
/*     */   
/*  56 */   protected static final us<gc> b = uv.a((Class)bdw.class, uu.n);
/*  57 */   protected static final us<Optional<fx>> c = uv.a((Class)bdw.class, uu.m);
/*  58 */   protected static final us<Byte> d = uv.a((Class)bdw.class, uu.a);
/*  59 */   protected static final us<Byte> bo = uv.a((Class)bdw.class, uu.a);
/*     */   
/*     */   private float br;
/*     */   
/*     */   private float bs;
/*     */   
/*     */   private fx bt;
/*     */   
/*     */   private int bu;
/*     */ 
/*     */   
/*     */   public bdw(aqe<? extends bdw> ☃, brx brx1) {
/*  71 */     super((aqe)☃, brx1);
/*     */     
/*  73 */     this.bt = null;
/*  74 */     this.f = 5;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  79 */     this.bk.a(1, new awd(this, (Class)bfw.class, 8.0F));
/*  80 */     this.bk.a(4, new a(this));
/*  81 */     this.bk.a(7, new e());
/*  82 */     this.bk.a(8, new aws(this));
/*     */     
/*  84 */     this.bl.a(1, (new axp(this, new Class[0])).a(new Class[0]));
/*  85 */     this.bl.a(2, new d(this, this));
/*  86 */     this.bl.a(3, new c(this));
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean aC() {
/*  91 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public adr cu() {
/*  96 */     return adr.f;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 101 */     return adq.nc;
/*     */   }
/*     */ 
/*     */   
/*     */   public void F() {
/* 106 */     if (!eT()) {
/* 107 */       super.F();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 113 */     return adq.ni;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 118 */     if (eT()) {
/* 119 */       return adq.nk;
/*     */     }
/* 121 */     return adq.nj;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 126 */     super.e();
/*     */     
/* 128 */     this.R.a(b, gc.a);
/* 129 */     this.R.a(c, Optional.empty());
/* 130 */     this.R.a(d, Byte.valueOf((byte)0));
/* 131 */     this.R.a(bo, Byte.valueOf((byte)16));
/*     */   }
/*     */   
/*     */   public static ark.a m() {
/* 135 */     return aqn.p()
/* 136 */       .a(arl.a, 30.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected auu r() {
/* 141 */     return new b(this, this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 146 */     super.a(☃);
/*     */     
/* 148 */     this.R.b(b, gc.a(☃.f("AttachFace")));
/* 149 */     this.R.b(d, Byte.valueOf(☃.f("Peek")));
/* 150 */     this.R.b(bo, Byte.valueOf(☃.f("Color")));
/* 151 */     if (☃.e("APX")) {
/* 152 */       int i = ☃.h("APX");
/* 153 */       int j = ☃.h("APY");
/* 154 */       int k = ☃.h("APZ");
/* 155 */       this.R.b(c, Optional.of(new fx(i, j, k)));
/*     */     } else {
/* 157 */       this.R.b(c, Optional.empty());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 163 */     super.b(☃);
/*     */     
/* 165 */     ☃.a("AttachFace", (byte)((gc)this.R.<gc>a(b)).c());
/* 166 */     ☃.a("Peek", ((Byte)this.R.<Byte>a(d)).byteValue());
/* 167 */     ☃.a("Color", ((Byte)this.R.<Byte>a(bo)).byteValue());
/* 168 */     fx fx1 = eM();
/* 169 */     if (fx1 != null) {
/* 170 */       ☃.b("APX", fx1.u());
/* 171 */       ☃.b("APY", fx1.v());
/* 172 */       ☃.b("APZ", fx1.w());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 178 */     super.j();
/*     */     
/* 180 */     fx ☃ = ((Optional<fx>)this.R.<Optional<fx>>a(c)).orElse(null);
/* 181 */     if (☃ == null && !this.l.v) {
/* 182 */       ☃ = cB();
/* 183 */       this.R.b(c, Optional.of(☃));
/*     */     } 
/*     */     
/* 186 */     if (br()) {
/* 187 */       ☃ = null;
/* 188 */       float f1 = (ct()).p;
/* 189 */       this.p = f1;
/* 190 */       this.aA = f1;
/* 191 */       this.aB = f1;
/* 192 */       this.bu = 0;
/*     */     }
/* 194 */     else if (!this.l.v) {
/* 195 */       ceh ceh = this.l.d_(☃);
/* 196 */       if (!ceh.g()) {
/* 197 */         if (ceh.a(bup.bo)) {
/* 198 */           gc gc1 = (gc)ceh.c(cea.a);
/* 199 */           if (this.l.w(☃.a(gc1))) {
/* 200 */             ☃ = ☃.a(gc1);
/* 201 */             this.R.b(c, Optional.of(☃));
/*     */           } else {
/* 203 */             eK();
/*     */           } 
/* 205 */         } else if (ceh.a(bup.aX)) {
/* 206 */           gc gc1 = (gc)ceh.c(ceb.a);
/* 207 */           if (this.l.w(☃.a(gc1))) {
/* 208 */             ☃ = ☃.a(gc1);
/* 209 */             this.R.b(c, Optional.of(☃));
/*     */           } else {
/* 211 */             eK();
/*     */           } 
/*     */         } else {
/* 214 */           eK();
/*     */         } 
/*     */       }
/*     */ 
/*     */       
/* 219 */       gc gc = eL();
/* 220 */       if (!a(☃, gc)) {
/*     */         
/* 222 */         gc gc1 = g(☃);
/* 223 */         if (gc1 != null) {
/* 224 */           this.R.b(b, gc1);
/*     */         } else {
/*     */           
/* 227 */           eK();
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 233 */     float f = eN() * 0.01F;
/*     */     
/* 235 */     this.br = this.bs;
/* 236 */     if (this.bs > f) {
/* 237 */       this.bs = afm.a(this.bs - 0.05F, f, 1.0F);
/* 238 */     } else if (this.bs < f) {
/* 239 */       this.bs = afm.a(this.bs + 0.05F, 0.0F, f);
/*     */     } 
/*     */     
/* 242 */     if (☃ != null) {
/* 243 */       if (this.l.v) {
/* 244 */         if (this.bu > 0 && this.bt != null) {
/* 245 */           this.bu--;
/*     */         } else {
/* 247 */           this.bt = ☃;
/*     */         } 
/*     */       }
/*     */       
/* 251 */       g(☃.u() + 0.5D, ☃.v(), ☃.w() + 0.5D);
/*     */       
/* 253 */       double d1 = 0.5D - afm.a((0.5F + this.bs) * 3.1415927F) * 0.5D;
/* 254 */       double d2 = 0.5D - afm.a((0.5F + this.br) * 3.1415927F) * 0.5D;
/*     */       
/* 256 */       gc gc = eL().f();
/* 257 */       a((new dci(cD() - 0.5D, cE(), cH() - 0.5D, cD() + 0.5D, cE() + 1.0D, cH() + 0.5D)).b(gc.i() * d1, gc.j() * d1, gc.k() * d1));
/*     */       
/* 259 */       double d3 = d1 - d2;
/* 260 */       if (d3 > 0.0D) {
/* 261 */         List<aqa> list = this.l.a(this, cc());
/* 262 */         if (!list.isEmpty()) {
/* 263 */           for (aqa aqa : list) {
/* 264 */             if (!(aqa instanceof bdw) && !aqa.H) {
/* 265 */               aqa.a(aqr.e, new dcn(d3 * gc
/* 266 */                     .i(), d3 * gc
/* 267 */                     .j(), d3 * gc
/* 268 */                     .k()));
/*     */             }
/*     */           } 
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(aqr ☃, dcn dcn1) {
/* 279 */     if (☃ == aqr.d) {
/* 280 */       eK();
/*     */     } else {
/* 282 */       super.a(☃, dcn1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void d(double ☃, double d1, double d2) {
/* 288 */     super.d(☃, d1, d2);
/* 289 */     if (this.R == null || this.K == 0) {
/*     */       return;
/*     */     }
/*     */     
/* 293 */     Optional<fx> optional1 = this.R.<Optional<fx>>a(c);
/* 294 */     Optional<fx> optional2 = Optional.of(new fx(☃, d1, d2));
/* 295 */     if (!optional2.equals(optional1)) {
/* 296 */       this.R.b(c, optional2);
/* 297 */       this.R.b(d, Byte.valueOf((byte)0));
/* 298 */       this.Z = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected gc g(fx ☃) {
/* 304 */     for (gc gc : gc.values()) {
/*     */       
/* 306 */       if (a(☃, gc)) {
/* 307 */         return gc;
/*     */       }
/*     */     } 
/* 310 */     return null;
/*     */   }
/*     */   
/*     */   private boolean a(fx ☃, gc gc1) {
/* 314 */     return (this.l.a(☃.a(gc1), this, gc1.f()) && this.l.a_(this, aoz.a(☃, gc1.f())));
/*     */   }
/*     */   
/*     */   protected boolean eK() {
/* 318 */     if (eD() || !aX()) {
/* 319 */       return true;
/*     */     }
/* 321 */     fx ☃ = cB();
/* 322 */     for (int i = 0; i < 5; i++) {
/* 323 */       fx fx1 = ☃.b(8 - this.J.nextInt(17), 8 - this.J.nextInt(17), 8 - this.J.nextInt(17));
/* 324 */       if (fx1.v() > 0 && this.l.w(fx1) && this.l.f().a(fx1) && this.l.a_(this, new dci(fx1))) {
/* 325 */         gc gc = g(fx1);
/* 326 */         if (gc != null) {
/*     */           
/* 328 */           this.R.b(b, gc);
/*     */           
/* 330 */           a(adq.nn, 1.0F, 1.0F);
/* 331 */           this.R.b(c, Optional.of(fx1));
/* 332 */           this.R.b(d, Byte.valueOf((byte)0));
/* 333 */           h((aqm)null);
/* 334 */           return true;
/*     */         } 
/*     */       } 
/*     */     } 
/* 338 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 343 */     super.k();
/*     */     
/* 345 */     f(dcn.a);
/*     */     
/* 347 */     if (!eD()) {
/* 348 */       this.aB = 0.0F;
/* 349 */       this.aA = 0.0F;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(us<?> ☃) {
/* 355 */     if (c.equals(☃) && 
/* 356 */       this.l.v && !br()) {
/*     */ 
/*     */ 
/*     */       
/* 360 */       fx fx1 = eM();
/* 361 */       if (fx1 != null) {
/* 362 */         if (this.bt == null) {
/* 363 */           this.bt = fx1;
/*     */         } else {
/* 365 */           this.bu = 6;
/*     */         } 
/* 367 */         g(fx1.u() + 0.5D, fx1.v(), fx1.w() + 0.5D);
/*     */       } 
/*     */     } 
/*     */     
/* 371 */     super.a(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(double ☃, double d1, double d2, float f1, float f2, int i, boolean bool) {
/* 378 */     this.aU = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 383 */     if (eT()) {
/* 384 */       aqa aqa = ☃.j();
/* 385 */       if (aqa instanceof bga) {
/* 386 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 390 */     if (super.a(☃, f)) {
/* 391 */       if (dk() < dx() * 0.5D && this.J.nextInt(4) == 0) {
/* 392 */         eK();
/*     */       }
/*     */       
/* 395 */       return true;
/*     */     } 
/* 397 */     return false;
/*     */   }
/*     */   
/*     */   private boolean eT() {
/* 401 */     return (eN() == 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aZ() {
/* 406 */     return aX();
/*     */   }
/*     */   
/*     */   public gc eL() {
/* 410 */     return this.R.<gc>a(b);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public fx eM() {
/* 415 */     return ((Optional<fx>)this.R.<Optional<fx>>a(c)).orElse(null);
/*     */   }
/*     */   
/*     */   public void h(@Nullable fx ☃) {
/* 419 */     this.R.b(c, Optional.ofNullable(☃));
/*     */   }
/*     */   
/*     */   public int eN() {
/* 423 */     return ((Byte)this.R.<Byte>a(d)).byteValue();
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 427 */     if (!this.l.v) {
/* 428 */       a(arl.i).d(bq);
/* 429 */       if (☃ == 0) {
/* 430 */         a(arl.i).c(bq);
/* 431 */         a(adq.nh, 1.0F, 1.0F);
/*     */       } else {
/* 433 */         a(adq.nl, 1.0F, 1.0F);
/*     */       } 
/*     */     } 
/*     */     
/* 437 */     this.R.b(d, Byte.valueOf((byte)☃));
/*     */   }
/*     */   
/*     */   public float y(float ☃) {
/* 441 */     return afm.g(☃, this.br, this.bs);
/*     */   }
/*     */   
/*     */   public int eO() {
/* 445 */     return this.bu;
/*     */   }
/*     */   
/*     */   public fx eP() {
/* 449 */     return this.bt;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float b(aqx ☃, aqb aqb1) {
/* 454 */     return 0.5F;
/*     */   }
/*     */ 
/*     */   
/*     */   public int O() {
/* 459 */     return 180;
/*     */   }
/*     */ 
/*     */   
/*     */   public int Q() {
/* 464 */     return 180;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void i(aqa ☃) {}
/*     */ 
/*     */   
/*     */   public float bg() {
/* 473 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public boolean eQ() {
/* 477 */     return (this.bt != null && eM() != null);
/*     */   }
/*     */   
/*     */   class b extends auu {
/*     */     public b(bdw this$0, aqn ☃) {
/* 482 */       super(☃);
/*     */     }
/*     */     
/*     */     public void a() {}
/*     */   }
/*     */   
/*     */   class e
/*     */     extends avv
/*     */   {
/*     */     private int b;
/*     */     
/*     */     private e(bdw this$0) {}
/*     */     
/*     */     public boolean a() {
/* 496 */       return (this.a.A() == null && bdw.a(this.a).nextInt(40) == 0);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 501 */       return (this.a.A() == null && this.b > 0);
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 506 */       this.b = 20 * (1 + bdw.b(this.a).nextInt(3));
/* 507 */       this.a.a(30);
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 512 */       if (this.a.A() == null) {
/* 513 */         this.a.a(0);
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 519 */       this.b--;
/*     */     }
/*     */   }
/*     */   
/*     */   class a extends avv {
/*     */     private int b;
/*     */     
/*     */     public a(bdw this$0) {
/* 527 */       a(EnumSet.of(avv.a.a, avv.a.b));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 532 */       aqm ☃ = this.a.A();
/* 533 */       if (☃ == null || !☃.aX()) {
/* 534 */         return false;
/*     */       }
/* 536 */       if (this.a.l.ad() == aor.a) {
/* 537 */         return false;
/*     */       }
/*     */       
/* 540 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 545 */       this.b = 20;
/* 546 */       this.a.a(100);
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 551 */       this.a.a(0);
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 556 */       if (this.a.l.ad() == aor.a) {
/*     */         return;
/*     */       }
/* 559 */       this.b--;
/*     */       
/* 561 */       aqm ☃ = this.a.A();
/* 562 */       this.a.t().a(☃, 180.0F, 180.0F);
/*     */       
/* 564 */       double d = this.a.h(☃);
/*     */       
/* 566 */       if (d < 400.0D) {
/* 567 */         if (this.b <= 0) {
/* 568 */           this.b = 20 + bdw.c(this.a).nextInt(10) * 20 / 2;
/*     */           
/* 570 */           this.a.l.c(new bgo(this.a.l, this.a, ☃, this.a.eL().n()));
/* 571 */           this.a.a(adq.nm, 2.0F, (bdw.d(this.a).nextFloat() - bdw.e(this.a).nextFloat()) * 0.2F + 1.0F);
/*     */         } 
/*     */       } else {
/* 574 */         this.a.h((aqm)null);
/*     */       } 
/*     */       
/* 577 */       super.e();
/*     */     }
/*     */   }
/*     */   
/*     */   class d extends axq<bfw> {
/*     */     public d(bdw this$0, bdw ☃) {
/* 583 */       super(☃, bfw.class, true);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 588 */       if (this.i.l.ad() == aor.a) {
/* 589 */         return false;
/*     */       }
/* 591 */       return super.a();
/*     */     }
/*     */ 
/*     */     
/*     */     protected dci a(double ☃) {
/* 596 */       gc gc = ((bdw)this.e).eL();
/* 597 */       if (gc.n() == gc.a.a) {
/* 598 */         return this.e.cc().c(4.0D, ☃, ☃);
/*     */       }
/* 600 */       if (gc.n() == gc.a.c) {
/* 601 */         return this.e.cc().c(☃, ☃, 4.0D);
/*     */       }
/* 603 */       return this.e.cc().c(☃, 4.0D, ☃);
/*     */     }
/*     */   }
/*     */   
/*     */   static class c extends axq<aqm> {
/*     */     public c(bdw ☃) {
/* 609 */       super(☃, aqm.class, 10, true, false, ☃ -> ☃ instanceof bdi);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 614 */       if (this.e.bG() == null) {
/* 615 */         return false;
/*     */       }
/* 617 */       return super.a();
/*     */     }
/*     */ 
/*     */     
/*     */     protected dci a(double ☃) {
/* 622 */       gc gc = ((bdw)this.e).eL();
/* 623 */       if (gc.n() == gc.a.a) {
/* 624 */         return this.e.cc().c(4.0D, ☃, ☃);
/*     */       }
/* 626 */       if (gc.n() == gc.a.c) {
/* 627 */         return this.e.cc().c(☃, ☃, 4.0D);
/*     */       }
/* 629 */       return this.e.cc().c(☃, 4.0D, ☃);
/*     */     }
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
/*     */   @Nullable
/*     */   public bkx eS() {
/* 643 */     Byte ☃ = this.R.<Byte>a(bo);
/* 644 */     if (☃.byteValue() == 16 || ☃.byteValue() > 15) {
/* 645 */       return null;
/*     */     }
/* 647 */     return bkx.a(☃.byteValue());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bdw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */