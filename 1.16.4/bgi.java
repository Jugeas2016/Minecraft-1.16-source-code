/*     */ import java.util.Collections;
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
/*     */ 
/*     */ public class bgi
/*     */   extends bgm
/*     */ {
/*     */   private boolean c;
/*  49 */   private final Random b = new Random();
/*     */   private int d;
/*     */   
/*     */   enum a {
/*  53 */     a, b, c;
/*     */   }
/*     */ 
/*     */   
/*  57 */   private static final us<Integer> e = uv.a((Class)bgi.class, uu.b);
/*  58 */   private static final us<Boolean> f = uv.a((Class)bgi.class, uu.i);
/*     */   
/*     */   private int g;
/*     */   
/*     */   private int ag;
/*     */   private int ah;
/*     */   private int ai;
/*     */   private float aj;
/*     */   private boolean ak = true;
/*     */   private aqa al;
/*  68 */   private a am = a.a;
/*     */   
/*     */   private final int an;
/*     */   private final int ao;
/*     */   
/*     */   private bgi(brx ☃, bfw bfw1, int i, int j) {
/*  74 */     super((aqe)aqe.bd, ☃);
/*  75 */     this.Y = true;
/*  76 */     b(bfw1);
/*  77 */     bfw1.bI = this;
/*  78 */     this.an = Math.max(0, i);
/*  79 */     this.ao = Math.max(0, j);
/*     */   }
/*     */   
/*     */   public bgi(brx ☃, bfw bfw1, double d1, double d2, double d3) {
/*  83 */     this(☃, bfw1, 0, 0);
/*  84 */     d(d1, d2, d3);
/*  85 */     this.m = cD();
/*  86 */     this.n = cE();
/*  87 */     this.o = cH();
/*     */   }
/*     */   
/*     */   public bgi(bfw ☃, brx brx1, int i, int j) {
/*  91 */     this(brx1, ☃, i, j);
/*  92 */     float f1 = ☃.q;
/*  93 */     float f2 = ☃.p;
/*     */     
/*  95 */     float f3 = afm.b(-f2 * 0.017453292F - 3.1415927F);
/*  96 */     float f4 = afm.a(-f2 * 0.017453292F - 3.1415927F);
/*  97 */     float f5 = -afm.b(-f1 * 0.017453292F);
/*  98 */     float f6 = afm.a(-f1 * 0.017453292F);
/*     */     
/* 100 */     double d1 = ☃.cD() - f4 * 0.3D;
/* 101 */     double d2 = ☃.cG();
/* 102 */     double d3 = ☃.cH() - f3 * 0.3D;
/*     */     
/* 104 */     b(d1, d2, d3, f2, f1);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 109 */     dcn dcn = new dcn(-f4, afm.a(-(f6 / f5), -5.0F, 5.0F), -f3);
/*     */ 
/*     */ 
/*     */     
/* 113 */     double d4 = dcn.f();
/* 114 */     dcn = dcn.d(0.6D / d4 + 0.5D + this.J
/* 115 */         .nextGaussian() * 0.0045D, 0.6D / d4 + 0.5D + this.J
/* 116 */         .nextGaussian() * 0.0045D, 0.6D / d4 + 0.5D + this.J
/* 117 */         .nextGaussian() * 0.0045D);
/*     */     
/* 119 */     f(dcn);
/*     */     
/* 121 */     this.p = (float)(afm.d(dcn.b, dcn.d) * 57.2957763671875D);
/* 122 */     this.q = (float)(afm.d(dcn.c, afm.a(c(dcn))) * 57.2957763671875D);
/* 123 */     this.r = this.p;
/* 124 */     this.s = this.q;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 129 */     ab().a(e, Integer.valueOf(0));
/* 130 */     ab().a(f, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(us<?> ☃) {
/* 135 */     if (e.equals(☃)) {
/* 136 */       int i = ((Integer)ab().<Integer>a(e)).intValue();
/* 137 */       this.al = (i > 0) ? this.l.a(i - 1) : null;
/*     */     } 
/*     */     
/* 140 */     if (f.equals(☃)) {
/* 141 */       this.c = ((Boolean)ab().<Boolean>a(f)).booleanValue();
/* 142 */       if (this.c) {
/* 143 */         n((cC()).b, (-0.4F * afm.a(this.b, 0.6F, 1.0F)), (cC()).d);
/*     */       }
/*     */     } 
/* 146 */     super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃) {
/* 151 */     double d = 64.0D;
/* 152 */     return (☃ < 4096.0D);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(double ☃, double d1, double d2, float f1, float f2, int i, boolean bool) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void j() {
/* 163 */     this.b.setSeed(bS().getLeastSignificantBits() ^ this.l.T());
/*     */     
/* 165 */     super.j();
/*     */     
/* 167 */     bfw ☃ = i();
/* 168 */     if (☃ == null) {
/* 169 */       ad();
/*     */       return;
/*     */     } 
/* 172 */     if (!this.l.v && 
/* 173 */       a(☃)) {
/*     */       return;
/*     */     }
/*     */     
/* 177 */     if (this.t) {
/* 178 */       this.g++;
/* 179 */       if (this.g >= 1200) {
/* 180 */         ad();
/*     */         return;
/*     */       } 
/*     */     } else {
/* 184 */       this.g = 0;
/*     */     } 
/*     */     
/* 187 */     float f = 0.0F;
/* 188 */     fx fx = cB();
/*     */     
/* 190 */     cux cux = this.l.b(fx);
/* 191 */     if (cux.a(aef.b)) {
/* 192 */       f = cux.a(this.l, fx);
/*     */     }
/*     */     
/* 195 */     boolean bool = (f > 0.0F);
/* 196 */     if (this.am == a.a)
/* 197 */     { if (this.al != null) {
/* 198 */         f(dcn.a);
/*     */         
/* 200 */         this.am = a.b;
/*     */         
/*     */         return;
/*     */       } 
/* 204 */       if (bool) {
/* 205 */         f(cC().d(0.3D, 0.2D, 0.3D));
/*     */         
/* 207 */         this.am = a.c;
/*     */         
/*     */         return;
/*     */       } 
/* 211 */       m(); }
/* 212 */     else { if (this.am == a.b) {
/* 213 */         if (this.al != null)
/* 214 */           if (this.al.y) {
/* 215 */             this.al = null;
/* 216 */             this.am = a.a;
/*     */           } else {
/* 218 */             d(this.al.cD(), this.al.e(0.8D), this.al.cH());
/*     */           }  
/*     */         return;
/*     */       } 
/* 222 */       if (this.am == a.c) {
/* 223 */         dcn dcn = cC();
/* 224 */         double d1 = cE() + dcn.c - fx.v() - f;
/* 225 */         if (Math.abs(d1) < 0.01D) {
/* 226 */           d1 += Math.signum(d1) * 0.1D;
/*     */         }
/*     */         
/* 229 */         n(dcn.b * 0.9D, dcn.c - d1 * this.J
/*     */ 
/*     */             
/* 232 */             .nextFloat() * 0.2D, dcn.d * 0.9D);
/*     */ 
/*     */         
/* 235 */         if (this.ag > 0 || this.ai > 0) {
/* 236 */           this.ak = (this.ak && this.d < 10 && b(fx));
/*     */         } else {
/* 238 */           this.ak = true;
/*     */         } 
/*     */         
/* 241 */         if (bool) {
/* 242 */           this.d = Math.max(0, this.d - 1);
/* 243 */           if (this.c) {
/* 244 */             f(cC().b(0.0D, -0.1D * this.b.nextFloat() * this.b.nextFloat(), 0.0D));
/*     */           }
/* 246 */           if (!this.l.v) {
/* 247 */             a(fx);
/*     */           }
/*     */         } else {
/* 250 */           this.d = Math.min(10, this.d + 1);
/*     */         } 
/*     */       }  }
/*     */     
/* 254 */     if (!cux.a(aef.b)) {
/* 255 */       f(cC().b(0.0D, -0.03D, 0.0D));
/*     */     }
/*     */     
/* 258 */     a(aqr.a, cC());
/* 259 */     x();
/*     */     
/* 261 */     if (this.am == a.a && (
/* 262 */       this.t || this.u)) {
/* 263 */       f(dcn.a);
/*     */     }
/*     */ 
/*     */     
/* 267 */     double d = 0.92D;
/* 268 */     f(cC().a(0.92D));
/*     */     
/* 270 */     af();
/*     */   }
/*     */   
/*     */   private boolean a(bfw ☃) {
/* 274 */     bmb bmb1 = ☃.dD();
/* 275 */     bmb bmb2 = ☃.dE();
/* 276 */     boolean bool1 = (bmb1.b() == bmd.mi);
/* 277 */     boolean bool2 = (bmb2.b() == bmd.mi);
/* 278 */     if (☃.y || !☃.aX() || (!bool1 && !bool2) || h(☃) > 1024.0D) {
/* 279 */       ad();
/* 280 */       return true;
/*     */     } 
/* 282 */     return false;
/*     */   }
/*     */   
/*     */   private void m() {
/* 286 */     dcl ☃ = bgn.a(this, this::a);
/* 287 */     a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(aqa ☃) {
/* 292 */     return (super.a(☃) || (☃.aX() && ☃ instanceof bcv));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dck ☃) {
/* 297 */     super.a(☃);
/* 298 */     if (!this.l.v) {
/* 299 */       this.al = ☃.a();
/* 300 */       n();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dcj ☃) {
/* 306 */     super.a(☃);
/* 307 */     f(cC().d().a(☃.a(this)));
/*     */   }
/*     */   
/*     */   private void n() {
/* 311 */     ab().b(e, Integer.valueOf(this.al.Y() + 1));
/*     */   }
/*     */   
/*     */   private void a(fx ☃) {
/* 315 */     aag aag = (aag)this.l;
/*     */     
/* 317 */     int i = 1;
/* 318 */     fx fx1 = ☃.b();
/* 319 */     if (this.J.nextFloat() < 0.25F && this.l.t(fx1)) {
/* 320 */       i++;
/*     */     }
/* 322 */     if (this.J.nextFloat() < 0.5F && !this.l.e(fx1)) {
/* 323 */       i--;
/*     */     }
/*     */     
/* 326 */     if (this.ag > 0) {
/* 327 */       this.ag--;
/*     */       
/* 329 */       if (this.ag <= 0) {
/* 330 */         this.ah = 0;
/* 331 */         this.ai = 0;
/* 332 */         ab().b(f, Boolean.valueOf(false));
/*     */       } 
/* 334 */     } else if (this.ai > 0) {
/* 335 */       this.ai -= i;
/*     */       
/* 337 */       if (this.ai > 0) {
/* 338 */         this.aj = (float)(this.aj + this.J.nextGaussian() * 4.0D);
/*     */         
/* 340 */         float f1 = this.aj * 0.017453292F;
/* 341 */         float f2 = afm.a(f1);
/* 342 */         float f3 = afm.b(f1);
/* 343 */         double d1 = cD() + (f2 * this.ai * 0.1F);
/* 344 */         double d2 = (afm.c(cE()) + 1.0F);
/* 345 */         double d3 = cH() + (f3 * this.ai * 0.1F);
/*     */         
/* 347 */         ceh ceh = aag.d_(new fx(d1, d2 - 1.0D, d3));
/* 348 */         if (ceh.a(bup.A)) {
/* 349 */           if (this.J.nextFloat() < 0.15F) {
/* 350 */             aag.a(hh.e, d1, d2 - 0.10000000149011612D, d3, 1, f2, 0.1D, f3, 0.0D);
/*     */           }
/*     */           
/* 353 */           float f4 = f2 * 0.04F;
/* 354 */           float f5 = f3 * 0.04F;
/*     */           
/* 356 */           aag.a(hh.z, d1, d2, d3, 0, f5, 0.01D, -f4, 1.0D);
/* 357 */           aag.a(hh.z, d1, d2, d3, 0, -f5, 0.01D, f4, 1.0D);
/*     */         } 
/*     */       } else {
/* 360 */         a(adq.em, 0.25F, 1.0F + (this.J.nextFloat() - this.J.nextFloat()) * 0.4F);
/* 361 */         double d = cE() + 0.5D;
/* 362 */         aag.a(hh.e, cD(), d, cH(), (int)(1.0F + cy() * 20.0F), cy(), 0.0D, cy(), 0.20000000298023224D);
/* 363 */         aag.a(hh.z, cD(), d, cH(), (int)(1.0F + cy() * 20.0F), cy(), 0.0D, cy(), 0.20000000298023224D);
/*     */         
/* 365 */         this.ag = afm.a(this.J, 20, 40);
/* 366 */         ab().b(f, Boolean.valueOf(true));
/*     */       } 
/* 368 */     } else if (this.ah > 0) {
/* 369 */       this.ah -= i;
/*     */       
/* 371 */       float f = 0.15F;
/* 372 */       if (this.ah < 20) {
/* 373 */         f = (float)(f + (20 - this.ah) * 0.05D);
/* 374 */       } else if (this.ah < 40) {
/* 375 */         f = (float)(f + (40 - this.ah) * 0.02D);
/* 376 */       } else if (this.ah < 60) {
/* 377 */         f = (float)(f + (60 - this.ah) * 0.01D);
/*     */       } 
/*     */       
/* 380 */       if (this.J.nextFloat() < f) {
/* 381 */         float f1 = afm.a(this.J, 0.0F, 360.0F) * 0.017453292F;
/* 382 */         float f2 = afm.a(this.J, 25.0F, 60.0F);
/* 383 */         double d1 = cD() + (afm.a(f1) * f2 * 0.1F);
/* 384 */         double d2 = (afm.c(cE()) + 1.0F);
/* 385 */         double d3 = cH() + (afm.b(f1) * f2 * 0.1F);
/* 386 */         ceh ceh = aag.d_(new fx(d1, d2 - 1.0D, d3));
/* 387 */         if (ceh.a(bup.A)) {
/* 388 */           aag.a(hh.Z, d1, d2, d3, 2 + this.J.nextInt(2), 0.10000000149011612D, 0.0D, 0.10000000149011612D, 0.0D);
/*     */         }
/*     */       } 
/*     */       
/* 392 */       if (this.ah <= 0) {
/* 393 */         this.aj = afm.a(this.J, 0.0F, 360.0F);
/* 394 */         this.ai = afm.a(this.J, 20, 80);
/*     */       } 
/*     */     } else {
/* 397 */       this.ah = afm.a(this.J, 100, 600);
/* 398 */       this.ah -= this.ao * 20 * 5;
/*     */     } 
/*     */   }
/*     */   
/*     */   enum b {
/* 403 */     a, b, c;
/*     */   }
/*     */   
/*     */   private boolean b(fx ☃) {
/* 407 */     b b = b.c;
/* 408 */     for (int i = -1; i <= 2; i++) {
/* 409 */       b b1 = a(☃.b(-2, i, -2), ☃.b(2, i, 2));
/* 410 */       switch (null.a[b1.ordinal()]) {
/*     */         case 1:
/* 412 */           return false;
/*     */         case 2:
/* 414 */           if (b == b.c) {
/* 415 */             return false;
/*     */           }
/*     */           break;
/*     */         case 3:
/* 419 */           if (b == b.a)
/* 420 */             return false; 
/*     */           break;
/*     */       } 
/* 423 */       b = b1;
/*     */     } 
/* 425 */     return true;
/*     */   }
/*     */   
/*     */   private b a(fx ☃, fx fx1) {
/* 429 */     return fx.b(☃, fx1).<b>map(this::c).reduce((☃, b1) -> (☃ == b1) ? ☃ : b.c).orElse(b.c);
/*     */   }
/*     */   
/*     */   private b c(fx ☃) {
/* 433 */     ceh ceh = this.l.d_(☃);
/* 434 */     if (ceh.g() || ceh.a(bup.dU)) {
/* 435 */       return b.a;
/*     */     }
/* 437 */     cux cux = ceh.m();
/* 438 */     if (cux.a(aef.b) && cux.b() && ceh.k(this.l, ☃).b()) {
/* 439 */       return b.b;
/*     */     }
/* 441 */     return b.c;
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 445 */     return this.ak;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(md ☃) {}
/*     */ 
/*     */   
/*     */   public void a(md ☃) {}
/*     */ 
/*     */   
/*     */   public int b(bmb ☃) {
/* 457 */     bfw bfw = i();
/* 458 */     if (this.l.v || bfw == null) {
/* 459 */       return 0;
/*     */     }
/*     */     
/* 462 */     int i = 0;
/* 463 */     if (this.al != null) {
/* 464 */       h();
/* 465 */       ac.D.a((aah)bfw, ☃, this, Collections.emptyList());
/* 466 */       this.l.a(this, (byte)31);
/* 467 */       i = (this.al instanceof bcv) ? 3 : 5;
/* 468 */     } else if (this.ag > 0) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 474 */       cyv.a a1 = (new cyv.a((aag)this.l)).<dcn>a(dbc.f, cA()).<bmb>a(dbc.i, ☃).<aqa>a(dbc.a, this).a(this.J).a(this.an + bfw.eU());
/* 475 */       cyy cyy = this.l.l().aJ().a(cyq.ag);
/* 476 */       List<bmb> list = cyy.a(a1.a(dbb.e));
/* 477 */       ac.D.a((aah)bfw, ☃, this, list);
/* 478 */       for (bmb bmb1 : list) {
/* 479 */         bcv bcv = new bcv(this.l, cD(), cE(), cH(), bmb1);
/* 480 */         double d1 = bfw.cD() - cD();
/* 481 */         double d2 = bfw.cE() - cE();
/* 482 */         double d3 = bfw.cH() - cH();
/*     */         
/* 484 */         double d4 = 0.1D;
/* 485 */         bcv.n(d1 * 0.1D, d2 * 0.1D + 
/*     */             
/* 487 */             Math.sqrt(Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3)) * 0.08D, d3 * 0.1D);
/*     */ 
/*     */         
/* 490 */         this.l.c(bcv);
/* 491 */         bfw.l.c(new aqg(bfw.l, bfw.cD(), bfw.cE() + 0.5D, bfw.cH() + 0.5D, this.J.nextInt(6) + 1));
/*     */         
/* 493 */         if (bmb1.b().a(aeg.T)) {
/* 494 */           bfw.a(aea.Q, 1);
/*     */         }
/*     */       } 
/* 497 */       i = 1;
/*     */     } 
/* 499 */     if (this.t) {
/* 500 */       i = 2;
/*     */     }
/*     */     
/* 503 */     ad();
/* 504 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(byte ☃) {
/* 509 */     if (☃ == 31 && 
/* 510 */       this.l.v && this.al instanceof bfw && ((bfw)this.al).ez()) {
/* 511 */       h();
/*     */     }
/*     */ 
/*     */     
/* 515 */     super.a(☃);
/*     */   }
/*     */   
/*     */   protected void h() {
/* 519 */     aqa ☃ = v();
/* 520 */     if (☃ == null) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 528 */     dcn dcn = (new dcn(☃.cD() - cD(), ☃.cE() - cE(), ☃.cH() - cH())).a(0.1D);
/*     */     
/* 530 */     this.al.f(this.al.cC().e(dcn));
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean aC() {
/* 535 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void ad() {
/* 540 */     super.ad();
/* 541 */     bfw ☃ = i();
/* 542 */     if (☃ != null) {
/* 543 */       ☃.bI = null;
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public bfw i() {
/* 549 */     aqa ☃ = v();
/* 550 */     return (☃ instanceof bfw) ? (bfw)☃ : null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aqa k() {
/* 555 */     return this.al;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bO() {
/* 560 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public oj<?> P() {
/* 565 */     aqa ☃ = v();
/* 566 */     return new on(this, (☃ == null) ? Y() : ☃.Y());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bgi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */