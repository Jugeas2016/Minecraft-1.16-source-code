/*     */ import com.google.common.collect.ImmutableList;
/*     */ import java.util.EnumSet;
/*     */ import java.util.List;
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
/*     */ public class bcl
/*     */   extends bdq
/*     */   implements aqy, bdu
/*     */ {
/*  61 */   private static final us<Integer> b = uv.a((Class)bcl.class, uu.b);
/*  62 */   private static final us<Integer> c = uv.a((Class)bcl.class, uu.b);
/*  63 */   private static final us<Integer> d = uv.a((Class)bcl.class, uu.b);
/*  64 */   private static final List<us<Integer>> bo = (List<us<Integer>>)ImmutableList.of(b, c, d);
/*  65 */   private static final us<Integer> bp = uv.a((Class)bcl.class, uu.b);
/*     */   
/*  67 */   private final float[] bq = new float[2];
/*  68 */   private final float[] br = new float[2];
/*  69 */   private final float[] bs = new float[2];
/*  70 */   private final float[] bt = new float[2];
/*  71 */   private final int[] bu = new int[2];
/*  72 */   private final int[] bv = new int[2]; private int bw;
/*     */   private static final Predicate<aqm> by;
/*  74 */   private final aad bx = (aad)(new aad(d(), aok.a.f, aok.b.a)).a(true);
/*     */   static {
/*  76 */     by = (☃ -> (☃.dC() != aqq.b && ☃.ei()));
/*  77 */   } private static final azg bz = (new azg()).a(20.0D).a(by);
/*     */   
/*     */   public bcl(aqe<? extends bcl> ☃, brx brx1) {
/*  80 */     super((aqe)☃, brx1);
/*     */     
/*  82 */     c(dx());
/*     */     
/*  84 */     x().d(true);
/*     */     
/*  86 */     this.f = 50;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  91 */     this.bk.a(0, new a(this));
/*  92 */     this.bk.a(2, new awv(this, 1.0D, 40, 20.0F));
/*     */     
/*  94 */     this.bk.a(5, new axk(this, 1.0D));
/*  95 */     this.bk.a(6, new awd(this, (Class)bfw.class, 8.0F));
/*  96 */     this.bk.a(7, new aws(this));
/*     */     
/*  98 */     this.bl.a(1, new axp(this, new Class[0]));
/*  99 */     this.bl.a(2, new axq<>(this, aqn.class, 0, false, false, by));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 104 */     super.e();
/*     */     
/* 106 */     this.R.a(b, Integer.valueOf(0));
/* 107 */     this.R.a(c, Integer.valueOf(0));
/* 108 */     this.R.a(d, Integer.valueOf(0));
/* 109 */     this.R.a(bp, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 114 */     super.b(☃);
/*     */     
/* 116 */     ☃.b("Invul", eL());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 121 */     super.a(☃);
/*     */     
/* 123 */     s(☃.h("Invul"));
/* 124 */     if (S()) {
/* 125 */       this.bx.a(d());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(@Nullable nr ☃) {
/* 131 */     super.a(☃);
/* 132 */     this.bx.a(d());
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 137 */     return adq.qQ;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 142 */     return adq.qT;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 147 */     return adq.qS;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 152 */     dcn ☃ = cC().d(1.0D, 0.6D, 1.0D);
/*     */     
/* 154 */     if (!this.l.v && t(0) > 0) {
/* 155 */       aqa aqa = this.l.a(t(0));
/* 156 */       if (aqa != null) {
/* 157 */         double d = ☃.c;
/* 158 */         if (cE() < aqa.cE() || (!S_() && cE() < aqa.cE() + 5.0D)) {
/* 159 */           d = Math.max(0.0D, d);
/*     */           
/* 161 */           d += 0.3D - d * 0.6000000238418579D;
/*     */         } 
/* 163 */         ☃ = new dcn(☃.b, d, ☃.d);
/*     */         
/* 165 */         dcn dcn = new dcn(aqa.cD() - cD(), 0.0D, aqa.cH() - cH());
/* 166 */         if (c(dcn) > 9.0D) {
/* 167 */           dcn dcn1 = dcn.d();
/* 168 */           ☃ = ☃.b(dcn1.b * 0.3D - ☃.b * 0.6D, 0.0D, dcn1.d * 0.3D - ☃.d * 0.6D);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 177 */     f(☃);
/* 178 */     if (c(☃) > 0.05D) {
/* 179 */       this.p = (float)afm.d(☃.d, ☃.b) * 57.295776F - 90.0F;
/*     */     }
/* 181 */     super.k();
/*     */     int i;
/* 183 */     for (i = 0; i < 2; i++) {
/* 184 */       this.bt[i] = this.br[i];
/* 185 */       this.bs[i] = this.bq[i];
/*     */     } 
/*     */     
/* 188 */     for (i = 0; i < 2; i++) {
/* 189 */       int k = t(i + 1);
/* 190 */       aqa aqa = null;
/* 191 */       if (k > 0) {
/* 192 */         aqa = this.l.a(k);
/*     */       }
/* 194 */       if (aqa != null) {
/* 195 */         double d1 = u(i + 1);
/* 196 */         double d2 = v(i + 1);
/* 197 */         double d3 = w(i + 1);
/*     */         
/* 199 */         double d4 = aqa.cD() - d1;
/* 200 */         double d5 = aqa.cG() - d2;
/* 201 */         double d6 = aqa.cH() - d3;
/* 202 */         double d7 = afm.a(d4 * d4 + d6 * d6);
/*     */         
/* 204 */         float f1 = (float)(afm.d(d6, d4) * 57.2957763671875D) - 90.0F;
/* 205 */         float f2 = (float)-(afm.d(d5, d7) * 57.2957763671875D);
/* 206 */         this.bq[i] = a(this.bq[i], f2, 40.0F);
/* 207 */         this.br[i] = a(this.br[i], f1, 10.0F);
/*     */       } else {
/* 209 */         this.br[i] = a(this.br[i], this.aA, 10.0F);
/*     */       } 
/*     */     } 
/* 212 */     boolean bool = S_(); int j;
/* 213 */     for (j = 0; j < 3; j++) {
/* 214 */       double d1 = u(j);
/* 215 */       double d2 = v(j);
/* 216 */       double d3 = w(j);
/*     */       
/* 218 */       this.l.a(hh.S, d1 + this.J.nextGaussian() * 0.30000001192092896D, d2 + this.J.nextGaussian() * 0.30000001192092896D, d3 + this.J.nextGaussian() * 0.30000001192092896D, 0.0D, 0.0D, 0.0D);
/* 219 */       if (bool && this.l.t.nextInt(4) == 0) {
/* 220 */         this.l.a(hh.u, d1 + this.J.nextGaussian() * 0.30000001192092896D, d2 + this.J.nextGaussian() * 0.30000001192092896D, d3 + this.J.nextGaussian() * 0.30000001192092896D, 0.699999988079071D, 0.699999988079071D, 0.5D);
/*     */       }
/*     */     } 
/* 223 */     if (eL() > 0) {
/* 224 */       for (j = 0; j < 3; j++) {
/* 225 */         this.l.a(hh.u, cD() + this.J.nextGaussian(), cE() + (this.J.nextFloat() * 3.3F), cH() + this.J.nextGaussian(), 0.699999988079071D, 0.699999988079071D, 0.8999999761581421D);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void N() {
/* 232 */     if (eL() > 0) {
/* 233 */       int i = eL() - 1;
/*     */       
/* 235 */       if (i <= 0) {
/* 236 */         brp.a a = this.l.V().b(brt.b) ? brp.a.c : brp.a.a;
/* 237 */         this.l.a(this, cD(), cG(), cH(), 7.0F, false, a);
/* 238 */         if (!aA()) {
/* 239 */           this.l.b(1023, cB(), 0);
/*     */         }
/*     */       } 
/*     */       
/* 243 */       s(i);
/* 244 */       if (this.K % 10 == 0) {
/* 245 */         b(10.0F);
/*     */       }
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 251 */     super.N();
/*     */     int ☃;
/* 253 */     for (☃ = 1; ☃ < 3; ☃++) {
/* 254 */       if (this.K >= this.bu[☃ - 1]) {
/* 255 */         this.bu[☃ - 1] = this.K + 10 + this.J.nextInt(10);
/*     */         
/* 257 */         this.bv[☃ - 1] = this.bv[☃ - 1] + 1; if ((this.l.ad() == aor.c || this.l.ad() == aor.d) && this.bv[☃ - 1] > 15) {
/* 258 */           float f1 = 10.0F;
/* 259 */           float f2 = 5.0F;
/* 260 */           double d1 = afm.a(this.J, cD() - 10.0D, cD() + 10.0D);
/* 261 */           double d2 = afm.a(this.J, cE() - 5.0D, cE() + 5.0D);
/* 262 */           double d3 = afm.a(this.J, cH() - 10.0D, cH() + 10.0D);
/* 263 */           a(☃ + 1, d1, d2, d3, true);
/* 264 */           this.bv[☃ - 1] = 0;
/*     */         } 
/*     */         
/* 267 */         int i = t(☃);
/* 268 */         if (i > 0) {
/* 269 */           aqa aqa = this.l.a(i);
/* 270 */           if (aqa == null || !aqa.aX() || h(aqa) > 900.0D || !D(aqa)) {
/* 271 */             a(☃, 0);
/*     */           }
/* 273 */           else if (aqa instanceof bfw && ((bfw)aqa).bC.a) {
/* 274 */             a(☃, 0);
/*     */           } else {
/* 276 */             a(☃ + 1, (aqm)aqa);
/* 277 */             this.bu[☃ - 1] = this.K + 40 + this.J.nextInt(20);
/* 278 */             this.bv[☃ - 1] = 0;
/*     */           } 
/*     */         } else {
/*     */           
/* 282 */           List<aqm> list = this.l.a(aqm.class, bz, this, cc().c(20.0D, 8.0D, 20.0D));
/*     */           
/* 284 */           for (int j = 0; j < 10 && !list.isEmpty(); j++) {
/* 285 */             aqm aqm = list.get(this.J.nextInt(list.size()));
/*     */             
/* 287 */             if (aqm != this && aqm.aX() && D(aqm)) {
/* 288 */               if (aqm instanceof bfw) {
/* 289 */                 if (!((bfw)aqm).bC.a) {
/* 290 */                   a(☃, aqm.Y());
/*     */                 }
/*     */                 break;
/*     */               } 
/* 294 */               a(☃, aqm.Y());
/*     */               
/*     */               break;
/*     */             } 
/*     */             
/* 299 */             list.remove(aqm);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 304 */     if (A() != null) {
/* 305 */       a(0, A().Y());
/*     */     } else {
/* 307 */       a(0, 0);
/*     */     } 
/*     */     
/* 310 */     if (this.bw > 0) {
/* 311 */       this.bw--;
/*     */       
/* 313 */       if (this.bw == 0 && this.l.V().b(brt.b)) {
/*     */ 
/*     */ 
/*     */         
/* 317 */         ☃ = afm.c(cE());
/* 318 */         int i = afm.c(cD());
/* 319 */         int j = afm.c(cH());
/* 320 */         boolean bool = false;
/*     */         
/* 322 */         for (int k = -1; k <= 1; k++) {
/* 323 */           for (int m = -1; m <= 1; m++) {
/* 324 */             for (int n = 0; n <= 3; n++) {
/* 325 */               int i1 = i + k;
/* 326 */               int i2 = ☃ + n;
/* 327 */               int i3 = j + m;
/* 328 */               fx fx = new fx(i1, i2, i3);
/* 329 */               ceh ceh = this.l.d_(fx);
/* 330 */               if (c(ceh)) {
/* 331 */                 bool = (this.l.a(fx, true, this) || bool);
/*     */               }
/*     */             } 
/*     */           } 
/*     */         } 
/* 336 */         if (bool) {
/* 337 */           this.l.a((bfw)null, 1022, cB(), 0);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 342 */     if (this.K % 20 == 0) {
/* 343 */       b(1.0F);
/*     */     }
/*     */     
/* 346 */     this.bx.a(dk() / dx());
/*     */   }
/*     */   
/*     */   public static boolean c(ceh ☃) {
/* 350 */     return (!☃.g() && !aed.ah.a(☃.b()));
/*     */   }
/*     */   
/*     */   public void m() {
/* 354 */     s(220);
/* 355 */     c(dx() / 3.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, dcn dcn1) {}
/*     */ 
/*     */   
/*     */   public void b(aah ☃) {
/* 364 */     super.b(☃);
/* 365 */     this.bx.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(aah ☃) {
/* 370 */     super.c(☃);
/* 371 */     this.bx.b(☃);
/*     */   }
/*     */   
/*     */   private double u(int ☃) {
/* 375 */     if (☃ <= 0) {
/* 376 */       return cD();
/*     */     }
/* 378 */     float f1 = (this.aA + (180 * (☃ - 1))) * 0.017453292F;
/* 379 */     float f2 = afm.b(f1);
/* 380 */     return cD() + f2 * 1.3D;
/*     */   }
/*     */   
/*     */   private double v(int ☃) {
/* 384 */     if (☃ <= 0) {
/* 385 */       return cE() + 3.0D;
/*     */     }
/* 387 */     return cE() + 2.2D;
/*     */   }
/*     */ 
/*     */   
/*     */   private double w(int ☃) {
/* 392 */     if (☃ <= 0) {
/* 393 */       return cH();
/*     */     }
/* 395 */     float f1 = (this.aA + (180 * (☃ - 1))) * 0.017453292F;
/* 396 */     float f2 = afm.a(f1);
/* 397 */     return cH() + f2 * 1.3D;
/*     */   }
/*     */   
/*     */   private float a(float ☃, float f1, float f2) {
/* 401 */     float f = afm.g(f1 - ☃);
/* 402 */     if (f > f2) {
/* 403 */       f = f2;
/*     */     }
/* 405 */     if (f < -f2) {
/* 406 */       f = -f2;
/*     */     }
/* 408 */     return ☃ + f;
/*     */   }
/*     */   
/*     */   private void a(int ☃, aqm aqm1) {
/* 412 */     a(☃, aqm1.cD(), aqm1.cE() + aqm1.ce() * 0.5D, aqm1.cH(), (☃ == 0 && this.J.nextFloat() < 0.001F));
/*     */   }
/*     */   
/*     */   private void a(int ☃, double d1, double d2, double d3, boolean bool) {
/* 416 */     if (!aA()) {
/* 417 */       this.l.a((bfw)null, 1024, cB(), 0);
/*     */     }
/*     */     
/* 420 */     double d4 = u(☃);
/* 421 */     double d5 = v(☃);
/* 422 */     double d6 = w(☃);
/*     */     
/* 424 */     double d7 = d1 - d4;
/* 425 */     double d8 = d2 - d5;
/* 426 */     double d9 = d3 - d6;
/*     */     
/* 428 */     bgz bgz = new bgz(this.l, this, d7, d8, d9);
/* 429 */     bgz.b(this);
/* 430 */     if (bool) {
/* 431 */       bgz.a(true);
/*     */     }
/*     */     
/* 434 */     bgz.o(d4, d5, d6);
/* 435 */     this.l.c(bgz);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqm ☃, float f) {
/* 440 */     a(0, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 445 */     if (b(☃)) {
/* 446 */       return false;
/*     */     }
/* 448 */     if (☃ == apk.h || ☃.k() instanceof bcl) {
/* 449 */       return false;
/*     */     }
/* 451 */     if (eL() > 0 && ☃ != apk.m) {
/* 452 */       return false;
/*     */     }
/*     */     
/* 455 */     if (S_()) {
/* 456 */       aqa aqa1 = ☃.j();
/* 457 */       if (aqa1 instanceof bga) {
/* 458 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 462 */     aqa aqa = ☃.k();
/* 463 */     if (aqa != null && 
/* 464 */       !(aqa instanceof bfw) && 
/* 465 */       aqa instanceof aqm && ((aqm)aqa).dC() == dC())
/*     */     {
/* 467 */       return false;
/*     */     }
/*     */     
/* 470 */     if (this.bw <= 0) {
/* 471 */       this.bw = 20;
/*     */     }
/*     */     
/* 474 */     for (int i = 0; i < this.bv.length; i++) {
/* 475 */       this.bv[i] = this.bv[i] + 3;
/*     */     }
/*     */     
/* 478 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(apk ☃, int i, boolean bool) {
/* 483 */     super.a(☃, i, bool);
/* 484 */     bcv bcv = a(bmd.pm);
/* 485 */     if (bcv != null) {
/* 486 */       bcv.r();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void cI() {
/* 492 */     if (this.l.ad() == aor.a && L()) {
/* 493 */       ad();
/*     */       
/*     */       return;
/*     */     } 
/* 497 */     this.aI = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(float ☃, float f1) {
/* 502 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(apu ☃) {
/* 507 */     return false;
/*     */   }
/*     */   
/*     */   public static ark.a eK() {
/* 511 */     return bdq.eR()
/* 512 */       .a(arl.a, 300.0D)
/* 513 */       .a(arl.d, 0.6000000238418579D)
/* 514 */       .a(arl.b, 40.0D)
/* 515 */       .a(arl.i, 4.0D);
/*     */   }
/*     */   
/*     */   public float a(int ☃) {
/* 519 */     return this.br[☃];
/*     */   }
/*     */   
/*     */   public float b(int ☃) {
/* 523 */     return this.bq[☃];
/*     */   }
/*     */   
/*     */   public int eL() {
/* 527 */     return ((Integer)this.R.<Integer>a(bp)).intValue();
/*     */   }
/*     */   
/*     */   public void s(int ☃) {
/* 531 */     this.R.b(bp, Integer.valueOf(☃));
/*     */   }
/*     */   
/*     */   public int t(int ☃) {
/* 535 */     return ((Integer)this.R.<Integer>a(bo.get(☃))).intValue();
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i) {
/* 539 */     this.R.b(bo.get(☃), Integer.valueOf(i));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean S_() {
/* 544 */     return (dk() <= dx() / 2.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public aqq dC() {
/* 549 */     return aqq.b;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean n(aqa ☃) {
/* 554 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bO() {
/* 559 */     return false;
/*     */   }
/*     */   
/*     */   class a extends avv {
/*     */     public a(bcl this$0) {
/* 564 */       a(EnumSet.of(avv.a.a, avv.a.c, avv.a.b));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 569 */       return (this.a.eL() > 0);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(apu ☃) {
/* 575 */     if (☃.a() == apw.t) {
/* 576 */       return false;
/*     */     }
/* 578 */     return super.d(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bcl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */