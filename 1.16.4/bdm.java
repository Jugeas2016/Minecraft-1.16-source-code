/*     */ import java.util.EnumSet;
/*     */ import java.util.Random;
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
/*     */ public class bdm
/*     */   extends bdq
/*     */ {
/*  52 */   private static final us<Boolean> b = uv.a((Class)bdm.class, uu.i);
/*  53 */   private static final us<Integer> d = uv.a((Class)bdm.class, uu.b);
/*     */   
/*     */   private float bo;
/*     */   private float bp;
/*     */   private float bq;
/*     */   private float br;
/*     */   private float bs;
/*     */   private aqm bt;
/*     */   private int bu;
/*     */   private boolean bv;
/*     */   protected awt c;
/*     */   
/*     */   public bdm(aqe<? extends bdm> ☃, brx brx1) {
/*  66 */     super((aqe)☃, brx1);
/*     */     
/*  68 */     this.f = 10;
/*     */     
/*  70 */     a(cwz.h, 0.0F);
/*  71 */     this.bh = new c(this);
/*     */     
/*  73 */     this.bo = this.J.nextFloat();
/*  74 */     this.bp = this.bo;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  79 */     awk ☃ = new awk(this, 1.0D);
/*  80 */     this.c = new awt(this, 1.0D, 80);
/*     */     
/*  82 */     this.bk.a(4, new a(this));
/*  83 */     this.bk.a(5, ☃);
/*  84 */     this.bk.a(7, this.c);
/*  85 */     this.bk.a(8, new awd(this, (Class)bfw.class, 8.0F));
/*     */     
/*  87 */     this.bk.a(8, new awd(this, (Class)bdm.class, 12.0F, 0.01F));
/*  88 */     this.bk.a(9, new aws(this));
/*     */ 
/*     */     
/*  91 */     this.c.a(EnumSet.of(avv.a.a, avv.a.b));
/*  92 */     ☃.a(EnumSet.of(avv.a.a, avv.a.b));
/*     */     
/*  94 */     this.bl.a(1, new axq<>(this, aqm.class, 10, true, false, new b(this)));
/*     */   }
/*     */   
/*     */   public static ark.a eM() {
/*  98 */     return bdq.eR()
/*  99 */       .a(arl.f, 6.0D)
/* 100 */       .a(arl.d, 0.5D)
/* 101 */       .a(arl.b, 16.0D)
/* 102 */       .a(arl.a, 30.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ayj b(brx ☃) {
/* 107 */     return new ayl(this, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 112 */     super.e();
/*     */     
/* 114 */     this.R.a(b, Boolean.valueOf(false));
/* 115 */     this.R.a(d, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean cM() {
/* 120 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public aqq dC() {
/* 125 */     return aqq.e;
/*     */   }
/*     */   
/*     */   public boolean eN() {
/* 129 */     return ((Boolean)this.R.<Boolean>a(b)).booleanValue();
/*     */   }
/*     */   
/*     */   private void t(boolean ☃) {
/* 133 */     this.R.b(b, Boolean.valueOf(☃));
/*     */   }
/*     */   
/*     */   public int eK() {
/* 137 */     return 80;
/*     */   }
/*     */   
/*     */   private void a(int ☃) {
/* 141 */     this.R.b(d, Integer.valueOf(☃));
/*     */   }
/*     */   
/*     */   public boolean eO() {
/* 145 */     return (((Integer)this.R.<Integer>a(d)).intValue() != 0);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aqm eP() {
/* 150 */     if (!eO()) {
/* 151 */       return null;
/*     */     }
/* 153 */     if (this.l.v) {
/* 154 */       if (this.bt != null) {
/* 155 */         return this.bt;
/*     */       }
/* 157 */       aqa ☃ = this.l.a(((Integer)this.R.<Integer>a(d)).intValue());
/* 158 */       if (☃ instanceof aqm) {
/* 159 */         this.bt = (aqm)☃;
/* 160 */         return this.bt;
/*     */       } 
/* 162 */       return null;
/*     */     } 
/* 164 */     return A();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(us<?> ☃) {
/* 169 */     super.a(☃);
/*     */     
/* 171 */     if (d.equals(☃)) {
/* 172 */       this.bu = 0;
/* 173 */       this.bt = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int D() {
/* 179 */     return 160;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 184 */     return aH() ? adq.fs : adq.ft;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 189 */     return aH() ? adq.fy : adq.fz;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 194 */     return aH() ? adq.fv : adq.fw;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean aC() {
/* 199 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float b(aqx ☃, aqb aqb1) {
/* 204 */     return aqb1.b * 0.5F;
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(fx ☃, brz brz1) {
/* 209 */     if (brz1.b(☃).a(aef.b)) {
/* 210 */       return 10.0F + brz1.y(☃) - 0.5F;
/*     */     }
/* 212 */     return super.a(☃, brz1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 217 */     if (aX()) {
/* 218 */       if (this.l.v) {
/*     */         
/* 220 */         this.bp = this.bo;
/* 221 */         if (!aE()) {
/* 222 */           this.bq = 2.0F;
/* 223 */           dcn ☃ = cC();
/* 224 */           if (☃.c > 0.0D && this.bv && !aA()) {
/* 225 */             this.l.a(cD(), cE(), cH(), eL(), cu(), 1.0F, 1.0F, false);
/*     */           }
/* 227 */           this.bv = (☃.c < 0.0D && this.l.a(cB().c(), this));
/* 228 */         } else if (eN()) {
/* 229 */           if (this.bq < 0.5F) {
/* 230 */             this.bq = 4.0F;
/*     */           } else {
/* 232 */             this.bq += (0.5F - this.bq) * 0.1F;
/*     */           } 
/*     */         } else {
/* 235 */           this.bq += (0.125F - this.bq) * 0.2F;
/*     */         } 
/* 237 */         this.bo += this.bq;
/*     */ 
/*     */         
/* 240 */         this.bs = this.br;
/* 241 */         if (!aH()) {
/* 242 */           this.br = this.J.nextFloat();
/* 243 */         } else if (eN()) {
/* 244 */           this.br += (0.0F - this.br) * 0.25F;
/*     */         } else {
/* 246 */           this.br += (1.0F - this.br) * 0.06F;
/*     */         } 
/*     */         
/* 249 */         if (eN() && aE()) {
/* 250 */           dcn ☃ = f(0.0F);
/* 251 */           for (int i = 0; i < 2; i++) {
/* 252 */             this.l.a(hh.e, d(0.5D) - ☃.b * 1.5D, cF() - ☃.c * 1.5D, g(0.5D) - ☃.d * 1.5D, 0.0D, 0.0D, 0.0D);
/*     */           }
/*     */         } 
/*     */         
/* 256 */         if (eO()) {
/* 257 */           if (this.bu < eK()) {
/* 258 */             this.bu++;
/*     */           }
/* 260 */           aqm ☃ = eP();
/* 261 */           if (☃ != null) {
/* 262 */             t().a(☃, 90.0F, 90.0F);
/* 263 */             t().a();
/*     */             
/* 265 */             double d1 = A(0.0F);
/* 266 */             double d2 = ☃.cD() - cD();
/* 267 */             double d3 = ☃.e(0.5D) - cG();
/* 268 */             double d4 = ☃.cH() - cH();
/* 269 */             double d5 = Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
/* 270 */             d2 /= d5;
/* 271 */             d3 /= d5;
/* 272 */             d4 /= d5;
/* 273 */             double d6 = this.J.nextDouble();
/* 274 */             while (d6 < d5) {
/* 275 */               d6 += 1.8D - d1 + this.J.nextDouble() * (1.7D - d1);
/* 276 */               this.l.a(hh.e, cD() + d2 * d6, cG() + d3 * d6, cH() + d4 * d6, 0.0D, 0.0D, 0.0D);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 282 */       if (aH()) {
/* 283 */         j(300);
/*     */       }
/* 285 */       else if (this.t) {
/* 286 */         f(cC().b(((this.J
/* 287 */               .nextFloat() * 2.0F - 1.0F) * 0.4F), 0.5D, ((this.J
/*     */               
/* 289 */               .nextFloat() * 2.0F - 1.0F) * 0.4F)));
/*     */         
/* 291 */         this.p = this.J.nextFloat() * 360.0F;
/* 292 */         this.t = false;
/* 293 */         this.Z = true;
/*     */       } 
/*     */ 
/*     */       
/* 297 */       if (eO()) {
/* 298 */         this.p = this.aC;
/*     */       }
/*     */     } 
/*     */     
/* 302 */     super.k();
/*     */   }
/*     */   
/*     */   protected adp eL() {
/* 306 */     return adq.fx;
/*     */   }
/*     */   
/*     */   public float y(float ☃) {
/* 310 */     return afm.g(☃, this.bp, this.bo);
/*     */   }
/*     */   
/*     */   public float z(float ☃) {
/* 314 */     return afm.g(☃, this.bs, this.br);
/*     */   }
/*     */   
/*     */   public float A(float ☃) {
/* 318 */     return (this.bu + ☃) / eK();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brz ☃) {
/* 323 */     return ☃.j(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean b(aqe<? extends bdm> ☃, bry bry1, aqp aqp1, fx fx1, Random random) {
/* 328 */     return ((random.nextInt(20) == 0 || !bry1.x(fx1)) && bry1
/* 329 */       .ad() != aor.a && (aqp1 == aqp.c || bry1
/* 330 */       .b(fx1).a(aef.b)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 335 */     if (!eN() && !☃.t() && ☃.j() instanceof aqm) {
/* 336 */       aqm aqm1 = (aqm)☃.j();
/*     */ 
/*     */       
/* 339 */       if (!☃.d()) {
/* 340 */         aqm1.a(apk.a(this), 2.0F);
/*     */       }
/*     */     } 
/*     */     
/* 344 */     if (this.c != null) {
/* 345 */       this.c.h();
/*     */     }
/*     */     
/* 348 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public int O() {
/* 353 */     return 180;
/*     */   }
/*     */ 
/*     */   
/*     */   public void g(dcn ☃) {
/* 358 */     if (dS() && aE()) {
/* 359 */       a(0.1F, ☃);
/* 360 */       a(aqr.a, cC());
/*     */       
/* 362 */       f(cC().a(0.9D));
/*     */       
/* 364 */       if (!eN() && A() == null) {
/* 365 */         f(cC().b(0.0D, -0.005D, 0.0D));
/*     */       }
/*     */     } else {
/* 368 */       super.g(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   static class b implements Predicate<aqm> {
/*     */     private final bdm a;
/*     */     
/*     */     public b(bdm ☃) {
/* 376 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(@Nullable aqm ☃) {
/* 381 */       return ((☃ instanceof bfw || ☃ instanceof bav) && ☃.h(this.a) > 9.0D);
/*     */     }
/*     */   }
/*     */   
/*     */   static class a extends avv {
/*     */     private final bdm a;
/*     */     private int b;
/*     */     private final boolean c;
/*     */     
/*     */     public a(bdm ☃) {
/* 391 */       this.a = ☃;
/*     */ 
/*     */       
/* 394 */       this.c = ☃ instanceof bdf;
/*     */       
/* 396 */       a(EnumSet.of(avv.a.a, avv.a.b));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 401 */       aqm ☃ = this.a.A();
/* 402 */       return (☃ != null && ☃.aX());
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 407 */       return (super.b() && (this.c || this.a.h(this.a.A()) > 9.0D));
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 412 */       this.b = -10;
/* 413 */       this.a.x().o();
/* 414 */       this.a.t().a(this.a.A(), 90.0F, 90.0F);
/*     */ 
/*     */       
/* 417 */       this.a.Z = true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 422 */       bdm.a(this.a, 0);
/* 423 */       this.a.h((aqm)null);
/*     */       
/* 425 */       this.a.c.h();
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 430 */       aqm ☃ = this.a.A();
/*     */       
/* 432 */       this.a.x().o();
/* 433 */       this.a.t().a(☃, 90.0F, 90.0F);
/*     */       
/* 435 */       if (!this.a.D(☃)) {
/* 436 */         this.a.h((aqm)null);
/*     */         
/*     */         return;
/*     */       } 
/* 440 */       this.b++;
/* 441 */       if (this.b == 0) {
/*     */         
/* 443 */         bdm.a(this.a, this.a.A().Y());
/* 444 */         if (!this.a.aA()) {
/* 445 */           this.a.l.a(this.a, (byte)21);
/*     */         }
/* 447 */       } else if (this.b >= this.a.eK()) {
/* 448 */         float f = 1.0F;
/* 449 */         if (this.a.l.ad() == aor.d) {
/* 450 */           f += 2.0F;
/*     */         }
/* 452 */         if (this.c) {
/* 453 */           f += 2.0F;
/*     */         }
/* 455 */         ☃.a(apk.c(this.a, this.a), f);
/* 456 */         ☃.a(apk.c(this.a), (float)this.a.b(arl.f));
/* 457 */         this.a.h((aqm)null);
/*     */       } 
/*     */       
/* 460 */       super.e();
/*     */     }
/*     */   }
/*     */   
/*     */   static class c extends avb {
/*     */     private final bdm i;
/*     */     
/*     */     public c(bdm ☃) {
/* 468 */       super(☃);
/* 469 */       this.i = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 474 */       if (this.h != avb.a.b || this.i.x().m()) {
/*     */         
/* 476 */         this.i.q(0.0F);
/* 477 */         bdm.a(this.i, false);
/*     */ 
/*     */ 
/*     */         
/*     */         return;
/*     */       } 
/*     */ 
/*     */       
/* 485 */       dcn ☃ = new dcn(this.b - this.i.cD(), this.c - this.i.cE(), this.d - this.i.cH());
/*     */       
/* 487 */       double d1 = ☃.f();
/*     */       
/* 489 */       double d2 = ☃.b / d1;
/* 490 */       double d3 = ☃.c / d1;
/* 491 */       double d4 = ☃.d / d1;
/*     */       
/* 493 */       float f1 = (float)(afm.d(☃.d, ☃.b) * 57.2957763671875D) - 90.0F;
/*     */       
/* 495 */       this.i.p = a(this.i.p, f1, 90.0F);
/* 496 */       this.i.aA = this.i.p;
/*     */       
/* 498 */       float f2 = (float)(this.e * this.i.b(arl.d));
/* 499 */       float f3 = afm.g(0.125F, this.i.dN(), f2);
/* 500 */       this.i.q(f3);
/* 501 */       double d5 = Math.sin((this.i.K + this.i.Y()) * 0.5D) * 0.05D;
/* 502 */       double d6 = Math.cos((this.i.p * 0.017453292F));
/* 503 */       double d7 = Math.sin((this.i.p * 0.017453292F));
/* 504 */       double d8 = Math.sin((this.i.K + this.i.Y()) * 0.75D) * 0.05D;
/*     */       
/* 506 */       this.i.f(this.i.cC().b(d5 * d6, d8 * (d7 + d6) * 0.25D + f3 * d3 * 0.1D, d5 * d7));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 512 */       ava ava = this.i.t();
/* 513 */       double d9 = this.i.cD() + d2 * 2.0D;
/* 514 */       double d10 = this.i.cG() + d3 / d1;
/* 515 */       double d11 = this.i.cH() + d4 * 2.0D;
/* 516 */       double d12 = ava.d();
/* 517 */       double d13 = ava.e();
/* 518 */       double d14 = ava.f();
/* 519 */       if (!ava.c()) {
/* 520 */         d12 = d9;
/* 521 */         d13 = d10;
/* 522 */         d14 = d11;
/*     */       } 
/* 524 */       this.i.t().a(afm.d(0.125D, d12, d9), afm.d(0.125D, d13, d10), afm.d(0.125D, d14, d11), 10.0F, 40.0F);
/* 525 */       bdm.a(this.i, true);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bdm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */