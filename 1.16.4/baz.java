/*     */ import java.util.Random;
/*     */ import java.util.UUID;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class baz
/*     */   extends are
/*     */   implements aqs
/*     */ {
/*  69 */   private static final us<Boolean> br = uv.a((Class)baz.class, uu.i);
/*  70 */   private static final us<Integer> bs = uv.a((Class)baz.class, uu.b);
/*  71 */   private static final us<Integer> bt = uv.a((Class)baz.class, uu.b);
/*     */   static {
/*  73 */     bq = (☃ -> {
/*     */         aqe<?> aqe = ☃.X();
/*  75 */         return (aqe == aqe.ar || aqe == aqe.ao || aqe == aqe.C);
/*     */       });
/*     */   }
/*     */ 
/*     */   
/*     */   public static final Predicate<aqm> bq;
/*     */   
/*     */   private float bu;
/*     */   private float bv;
/*     */   private boolean bw;
/*     */   private boolean bx;
/*     */   private float by;
/*     */   private float bz;
/*  88 */   private static final afh bA = afu.a(20, 39);
/*     */   private UUID bB;
/*     */   
/*     */   public baz(aqe<? extends baz> ☃, brx brx1) {
/*  92 */     super((aqe)☃, brx1);
/*     */     
/*  94 */     u(false);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  99 */     this.bk.a(1, new avp(this));
/* 100 */     this.bk.a(2, new axb(this));
/* 101 */     this.bk.a(3, new a<>(this, this, bbe.class, 24.0F, 1.5D, 1.5D));
/* 102 */     this.bk.a(4, new awb(this, 0.4F));
/* 103 */     this.bk.a(5, new awf(this, 1.0D, true));
/* 104 */     this.bk.a(6, new avt(this, 1.0D, 10.0F, 2.0F, false));
/* 105 */     this.bk.a(7, new avi(this, 1.0D));
/* 106 */     this.bk.a(8, new axk(this, 1.0D));
/* 107 */     this.bk.a(9, new ave(this, 8.0F));
/* 108 */     this.bk.a(10, new awd(this, (Class)bfw.class, 8.0F));
/* 109 */     this.bk.a(10, new aws(this));
/*     */     
/* 111 */     this.bl.a(1, new axu(this));
/* 112 */     this.bl.a(2, new axv(this));
/* 113 */     this.bl.a(3, (new axp(this, new Class[0])).a(new Class[0]));
/* 114 */     this.bl.a(4, new axq<>(this, bfw.class, 10, true, false, this::a_));
/* 115 */     this.bl.a(5, new axt<>(this, azz.class, false, bq));
/* 116 */     this.bl.a(6, new axt<>(this, bax.class, false, bax.bo));
/* 117 */     this.bl.a(7, new axq<>(this, bcz.class, false));
/* 118 */     this.bl.a(8, new axw<>(this, true));
/*     */   }
/*     */   
/*     */   public static ark.a eU() {
/* 122 */     return aqn.p()
/* 123 */       .a(arl.d, 0.30000001192092896D)
/* 124 */       .a(arl.a, 8.0D)
/* 125 */       .a(arl.f, 2.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 130 */     super.e();
/* 131 */     this.R.a(br, Boolean.valueOf(false));
/* 132 */     this.R.a(bs, Integer.valueOf(bkx.o.b()));
/* 133 */     this.R.a(bt, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(fx ☃, ceh ceh1) {
/* 138 */     a(adq.rh, 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 143 */     super.b(☃);
/*     */     
/* 145 */     ☃.a("CollarColor", (byte)eX().b());
/* 146 */     c(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 151 */     super.a(☃);
/*     */     
/* 153 */     if (☃.c("CollarColor", 99)) {
/* 154 */       a(bkx.a(☃.h("CollarColor")));
/*     */     }
/* 156 */     a((aag)this.l, ☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 162 */     if (H_()) {
/* 163 */       return adq.rc;
/*     */     }
/* 165 */     if (this.J.nextInt(3) == 0) {
/* 166 */       if (eK() && dk() < 10.0F) {
/* 167 */         return adq.ri;
/*     */       }
/* 169 */       return adq.rf;
/*     */     } 
/* 171 */     return adq.ra;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 176 */     return adq.re;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 181 */     return adq.rb;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float dG() {
/* 186 */     return 0.4F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 191 */     super.k();
/*     */     
/* 193 */     if (!this.l.v && this.bw && !this.bx && !eI() && this.t) {
/* 194 */       this.bx = true;
/* 195 */       this.by = 0.0F;
/* 196 */       this.bz = 0.0F;
/* 197 */       this.l.a(this, (byte)8);
/*     */     } 
/* 199 */     if (!this.l.v) {
/* 200 */       a((aag)this.l, true);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 206 */     super.j();
/*     */     
/* 208 */     if (!aX()) {
/*     */       return;
/*     */     }
/*     */     
/* 212 */     this.bv = this.bu;
/* 213 */     if (eY()) {
/* 214 */       this.bu += (1.0F - this.bu) * 0.4F;
/*     */     } else {
/* 216 */       this.bu += (0.0F - this.bu) * 0.4F;
/*     */     } 
/*     */     
/* 219 */     if (aG()) {
/* 220 */       this.bw = true;
/* 221 */       if (this.bx && !this.l.v) {
/* 222 */         this.l.a(this, (byte)56);
/* 223 */         eZ();
/*     */       } 
/* 225 */     } else if ((this.bw || this.bx) && 
/* 226 */       this.bx) {
/* 227 */       if (this.by == 0.0F) {
/* 228 */         a(adq.rg, dG(), (this.J.nextFloat() - this.J.nextFloat()) * 0.2F + 1.0F);
/*     */       }
/*     */       
/* 231 */       this.bz = this.by;
/* 232 */       this.by += 0.05F;
/*     */       
/* 234 */       if (this.bz >= 2.0F) {
/* 235 */         this.bw = false;
/* 236 */         this.bx = false;
/* 237 */         this.bz = 0.0F;
/* 238 */         this.by = 0.0F;
/*     */       } 
/*     */       
/* 241 */       if (this.by > 0.4F) {
/* 242 */         float ☃ = (float)cE();
/* 243 */         int i = (int)(afm.a((this.by - 0.4F) * 3.1415927F) * 7.0F);
/* 244 */         dcn dcn = cC();
/* 245 */         for (int j = 0; j < i; j++) {
/* 246 */           float f1 = (this.J.nextFloat() * 2.0F - 1.0F) * cy() * 0.5F;
/* 247 */           float f2 = (this.J.nextFloat() * 2.0F - 1.0F) * cy() * 0.5F;
/* 248 */           this.l.a(hh.Z, cD() + f1, (☃ + 0.8F), cH() + f2, dcn.b, dcn.c, dcn.d);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void eZ() {
/* 256 */     this.bx = false;
/* 257 */     this.by = 0.0F;
/* 258 */     this.bz = 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(apk ☃) {
/* 263 */     this.bw = false;
/* 264 */     this.bx = false;
/* 265 */     this.bz = 0.0F;
/* 266 */     this.by = 0.0F;
/*     */     
/* 268 */     super.a(☃);
/*     */   }
/*     */   
/*     */   public boolean eV() {
/* 272 */     return this.bw;
/*     */   }
/*     */   
/*     */   public float y(float ☃) {
/* 276 */     return Math.min(0.5F + afm.g(☃, this.bz, this.by) / 2.0F * 0.5F, 1.0F);
/*     */   }
/*     */   
/*     */   public float g(float ☃, float f1) {
/* 280 */     float f = (afm.g(☃, this.bz, this.by) + f1) / 1.8F;
/* 281 */     if (f < 0.0F) {
/* 282 */       f = 0.0F;
/* 283 */     } else if (f > 1.0F) {
/* 284 */       f = 1.0F;
/*     */     } 
/* 286 */     return afm.a(f * 3.1415927F) * afm.a(f * 3.1415927F * 11.0F) * 0.15F * 3.1415927F;
/*     */   }
/*     */   
/*     */   public float z(float ☃) {
/* 290 */     return afm.g(☃, this.bv, this.bu) * 0.15F * 3.1415927F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float b(aqx ☃, aqb aqb1) {
/* 295 */     return aqb1.b * 0.8F;
/*     */   }
/*     */ 
/*     */   
/*     */   public int O() {
/* 300 */     if (eM()) {
/* 301 */       return 20;
/*     */     }
/* 303 */     return super.O();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 308 */     if (b(☃)) {
/* 309 */       return false;
/*     */     }
/* 311 */     aqa aqa = ☃.k();
/*     */     
/* 313 */     w(false);
/*     */     
/* 315 */     if (aqa != null && !(aqa instanceof bfw) && !(aqa instanceof bga))
/*     */     {
/* 317 */       f = (f + 1.0F) / 2.0F;
/*     */     }
/* 319 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean B(aqa ☃) {
/* 324 */     boolean bool = ☃.a(apk.c(this), (int)b(arl.f));
/* 325 */     if (bool) {
/* 326 */       a(this, ☃);
/*     */     }
/* 328 */     return bool;
/*     */   }
/*     */ 
/*     */   
/*     */   public void u(boolean ☃) {
/* 333 */     super.u(☃);
/*     */     
/* 335 */     if (☃) {
/* 336 */       a(arl.a).a(20.0D);
/* 337 */       c(20.0F);
/*     */     } else {
/* 339 */       a(arl.a).a(8.0D);
/*     */     } 
/*     */     
/* 342 */     a(arl.f).a(4.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public aou b(bfw ☃, aot aot1) {
/* 347 */     bmb bmb = ☃.b(aot1);
/* 348 */     blx blx = bmb.b();
/*     */     
/* 350 */     if (this.l.v) {
/* 351 */       boolean bool = (i(☃) || eK() || (blx == bmd.mL && !eK() && !H_()));
/* 352 */       return bool ? aou.b : aou.c;
/*     */     } 
/*     */     
/* 355 */     if (eK()) {
/* 356 */       if (k(bmb) && dk() < dx()) {
/* 357 */         if (!☃.bC.d) {
/* 358 */           bmb.g(1);
/*     */         }
/* 360 */         b(blx.t().a());
/* 361 */         return aou.a;
/* 362 */       }  if (blx instanceof bky) {
/* 363 */         bkx bkx = ((bky)blx).d();
/* 364 */         if (bkx != eX()) {
/* 365 */           a(bkx);
/*     */           
/* 367 */           if (!☃.bC.d) {
/* 368 */             bmb.g(1);
/*     */           }
/*     */           
/* 371 */           return aou.a;
/*     */         } 
/*     */       } else {
/*     */         
/* 375 */         aou aou = super.b(☃, aot1);
/* 376 */         if ((!aou.a() || w_()) && 
/* 377 */           i(☃)) {
/* 378 */           w(!eO());
/* 379 */           this.aQ = false;
/* 380 */           this.bj.o();
/* 381 */           h((aqm)null);
/* 382 */           return aou.a;
/*     */         } 
/*     */         
/* 385 */         return aou;
/*     */       }
/*     */     
/* 388 */     } else if (blx == bmd.mL && !H_()) {
/* 389 */       if (!☃.bC.d) {
/* 390 */         bmb.g(1);
/*     */       }
/* 392 */       if (this.J.nextInt(3) == 0) {
/* 393 */         f(☃);
/* 394 */         this.bj.o();
/* 395 */         h((aqm)null);
/* 396 */         w(true);
/* 397 */         this.l.a(this, (byte)7);
/*     */       } else {
/* 399 */         this.l.a(this, (byte)6);
/*     */       } 
/*     */       
/* 402 */       return aou.a;
/*     */     } 
/*     */ 
/*     */     
/* 406 */     return super.b(☃, aot1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(byte ☃) {
/* 411 */     if (☃ == 8) {
/* 412 */       this.bx = true;
/* 413 */       this.by = 0.0F;
/* 414 */       this.bz = 0.0F;
/* 415 */     } else if (☃ == 56) {
/* 416 */       eZ();
/*     */     } else {
/* 418 */       super.a(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public float eW() {
/* 423 */     if (H_())
/* 424 */       return 1.5393804F; 
/* 425 */     if (eK()) {
/* 426 */       return (0.55F - (dx() - dk()) * 0.02F) * 3.1415927F;
/*     */     }
/* 428 */     return 0.62831855F;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean k(bmb ☃) {
/* 433 */     blx blx = ☃.b();
/* 434 */     return (blx.s() && blx.t().c());
/*     */   }
/*     */ 
/*     */   
/*     */   public int eq() {
/* 439 */     return 8;
/*     */   }
/*     */ 
/*     */   
/*     */   public int E_() {
/* 444 */     return ((Integer)this.R.<Integer>a(bt)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a_(int ☃) {
/* 449 */     this.R.b(bt, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public void G_() {
/* 454 */     a_(bA.a(this.J));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public UUID F_() {
/* 460 */     return this.bB;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(@Nullable UUID ☃) {
/* 465 */     this.bB = ☃;
/*     */   }
/*     */   
/*     */   public bkx eX() {
/* 469 */     return bkx.a(((Integer)this.R.<Integer>a(bs)).intValue());
/*     */   }
/*     */   
/*     */   public void a(bkx ☃) {
/* 473 */     this.R.b(bs, Integer.valueOf(☃.b()));
/*     */   }
/*     */ 
/*     */   
/*     */   public baz b(aag ☃, apy apy1) {
/* 478 */     baz baz1 = aqe.aW.a(☃);
/* 479 */     UUID uUID = A_();
/* 480 */     if (uUID != null) {
/* 481 */       baz1.b(uUID);
/* 482 */       baz1.u(true);
/*     */     } 
/* 484 */     return baz1;
/*     */   }
/*     */   
/*     */   public void x(boolean ☃) {
/* 488 */     this.R.b(br, Boolean.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(azz ☃) {
/* 493 */     if (☃ == this) {
/* 494 */       return false;
/*     */     }
/* 496 */     if (!eK()) {
/* 497 */       return false;
/*     */     }
/* 499 */     if (!(☃ instanceof baz)) {
/* 500 */       return false;
/*     */     }
/*     */     
/* 503 */     baz baz1 = (baz)☃;
/* 504 */     if (!baz1.eK()) {
/* 505 */       return false;
/*     */     }
/* 507 */     if (baz1.eM()) {
/* 508 */       return false;
/*     */     }
/*     */     
/* 511 */     return (eS() && baz1.eS());
/*     */   }
/*     */   
/*     */   public boolean eY() {
/* 515 */     return ((Boolean)this.R.<Boolean>a(br)).booleanValue();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(aqm ☃, aqm aqm1) {
/* 521 */     if (☃ instanceof bdc || ☃ instanceof bdk) {
/* 522 */       return false;
/*     */     }
/*     */     
/* 525 */     if (☃ instanceof baz) {
/* 526 */       baz baz1 = (baz)☃;
/* 527 */       return (!baz1.eK() || baz1.eN() != aqm1);
/*     */     } 
/* 529 */     if (☃ instanceof bfw && aqm1 instanceof bfw && !((bfw)aqm1).a((bfw)☃))
/*     */     {
/* 531 */       return false;
/*     */     }
/*     */     
/* 534 */     if (☃ instanceof bbb && ((bbb)☃).eW()) {
/* 535 */       return false;
/*     */     }
/*     */     
/* 538 */     return (!(☃ instanceof are) || !((are)☃).eK());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/* 543 */     return (!H_() && super.a(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public dcn cf() {
/* 548 */     return new dcn(0.0D, (0.6F * ce()), (cy() * 0.4F));
/*     */   }
/*     */ 
/*     */   
/*     */   class a<T extends aqm>
/*     */     extends avd<T>
/*     */   {
/*     */     private final baz j;
/*     */     
/*     */     public a(baz this$0, baz ☃, Class<T> clazz, float f, double d1, double d2) {
/* 558 */       super(☃, clazz, f, d1, d2);
/* 559 */       this.j = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 564 */       if (super.a() && 
/* 565 */         this.b instanceof bbe) {
/* 566 */         return (!this.j.eK() && a((bbe)this.b));
/*     */       }
/*     */ 
/*     */       
/* 570 */       return false;
/*     */     }
/*     */     
/*     */     private boolean a(bbe ☃) {
/* 574 */       return (☃.fv() >= baz.a(this.i).nextInt(5));
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 579 */       this.i.h((aqm)null);
/* 580 */       super.c();
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 585 */       this.i.h((aqm)null);
/* 586 */       super.e();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\baz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */