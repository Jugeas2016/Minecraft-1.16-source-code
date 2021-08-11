/*     */ import java.util.List;
/*     */ import java.util.Objects;
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
/*     */ public class bcv
/*     */   extends aqa
/*     */ {
/*  35 */   private static final us<bmb> c = uv.a((Class)bcv.class, uu.g);
/*     */ 
/*     */   
/*     */   private int d;
/*     */ 
/*     */   
/*     */   private int e;
/*     */   
/*  43 */   private int f = 5;
/*     */   private UUID g;
/*     */   private UUID ag;
/*     */   public final float b;
/*     */   
/*     */   public bcv(aqe<? extends bcv> ☃, brx brx1) {
/*  49 */     super(☃, brx1);
/*  50 */     this.b = (float)(Math.random() * Math.PI * 2.0D);
/*     */   }
/*     */   
/*     */   public bcv(brx ☃, double d1, double d2, double d3) {
/*  54 */     this(aqe.L, ☃);
/*  55 */     d(d1, d2, d3);
/*     */     
/*  57 */     this.p = this.J.nextFloat() * 360.0F;
/*     */     
/*  59 */     n(this.J
/*  60 */         .nextDouble() * 0.2D - 0.1D, 0.2D, this.J
/*     */         
/*  62 */         .nextDouble() * 0.2D - 0.1D);
/*     */   }
/*     */ 
/*     */   
/*     */   public bcv(brx ☃, double d1, double d2, double d3, bmb bmb1) {
/*  67 */     this(☃, d1, d2, d3);
/*  68 */     b(bmb1);
/*     */   }
/*     */   
/*     */   private bcv(bcv ☃) {
/*  72 */     super(☃.X(), ☃.l);
/*  73 */     b(☃.g().i());
/*  74 */     u(☃);
/*  75 */     this.d = ☃.d;
/*  76 */     this.b = ☃.b;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean aC() {
/*  81 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  86 */     ab().a(c, bmb.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/*  91 */     if (g().a()) {
/*  92 */       ad();
/*     */       return;
/*     */     } 
/*  95 */     super.j();
/*  96 */     if (this.e > 0 && this.e != 32767) {
/*  97 */       this.e--;
/*     */     }
/*  99 */     this.m = cD();
/* 100 */     this.n = cE();
/* 101 */     this.o = cH();
/*     */     
/* 103 */     dcn ☃ = cC();
/*     */ 
/*     */     
/* 106 */     float f = ce() - 0.11111111F;
/* 107 */     if (aE() && b(aef.b) > f) {
/* 108 */       u();
/* 109 */     } else if (aQ() && b(aef.c) > f) {
/* 110 */       v();
/* 111 */     } else if (!aB()) {
/* 112 */       f(cC().b(0.0D, -0.04D, 0.0D));
/*     */     } 
/*     */     
/* 115 */     if (this.l.v) {
/* 116 */       this.H = false;
/*     */     } else {
/* 118 */       this.H = !this.l.k(this);
/* 119 */       if (this.H) {
/* 120 */         l(cD(), ((cc()).b + (cc()).e) / 2.0D, cH());
/*     */       }
/*     */     } 
/* 123 */     if (!this.t || c(cC()) > 9.999999747378752E-6D || (this.K + Y()) % 4 == 0) {
/* 124 */       a(aqr.a, cC());
/*     */       
/* 126 */       float f1 = 0.98F;
/* 127 */       if (this.t) {
/* 128 */         f1 = this.l.d_(new fx(cD(), cE() - 1.0D, cH())).b().j() * 0.98F;
/*     */       }
/*     */       
/* 131 */       f(cC().d(f1, 0.98D, f1));
/*     */ 
/*     */       
/* 134 */       if (this.t) {
/* 135 */         dcn dcn = cC();
/* 136 */         if (dcn.c < 0.0D) {
/* 137 */           f(dcn.d(1.0D, -0.5D, 1.0D));
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 142 */     boolean bool = (afm.c(this.m) != afm.c(cD()) || afm.c(this.n) != afm.c(cE()) || afm.c(this.o) != afm.c(cH()));
/* 143 */     int i = bool ? 2 : 40;
/*     */     
/* 145 */     if (this.K % i == 0) {
/* 146 */       if (this.l.b(cB()).a(aef.c) && !aD()) {
/* 147 */         a(adq.eH, 0.4F, 2.0F + this.J.nextFloat() * 0.4F);
/*     */       }
/*     */       
/* 150 */       if (!this.l.v && z()) {
/* 151 */         x();
/*     */       }
/*     */     } 
/*     */     
/* 155 */     if (this.d != -32768) {
/* 156 */       this.d++;
/*     */     }
/*     */ 
/*     */     
/* 160 */     this.Z |= aK();
/*     */     
/* 162 */     if (!this.l.v) {
/*     */ 
/*     */ 
/*     */       
/* 166 */       double d = cC().d(☃).g();
/* 167 */       if (d > 0.01D) {
/* 168 */         this.Z = true;
/*     */       }
/*     */     } 
/*     */     
/* 172 */     if (!this.l.v && this.d >= 6000) {
/* 173 */       ad();
/*     */     }
/*     */   }
/*     */   
/*     */   private void u() {
/* 178 */     dcn ☃ = cC();
/*     */ 
/*     */     
/* 181 */     n(☃.b * 0.9900000095367432D, ☃.c + ((☃.c < 0.05999999865889549D) ? 5.0E-4F : 0.0F), ☃.d * 0.9900000095367432D);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void v() {
/* 189 */     dcn ☃ = cC();
/*     */ 
/*     */     
/* 192 */     n(☃.b * 0.949999988079071D, ☃.c + ((☃.c < 0.05999999865889549D) ? 5.0E-4F : 0.0F), ☃.d * 0.949999988079071D);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void x() {
/* 200 */     if (!z()) {
/*     */       return;
/*     */     }
/* 203 */     List<bcv> ☃ = this.l.a(bcv.class, cc().c(0.5D, 0.0D, 0.5D), ☃ -> (☃ != this && ☃.z()));
/* 204 */     for (bcv bcv1 : ☃) {
/* 205 */       if (bcv1.z()) {
/* 206 */         a(bcv1);
/* 207 */         if (this.y) {
/*     */           break;
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean z() {
/* 215 */     bmb ☃ = g();
/* 216 */     return (aX() && this.e != 32767 && this.d != -32768 && this.d < 6000 && ☃.E() < ☃.c());
/*     */   }
/*     */   
/*     */   private void a(bcv ☃) {
/* 220 */     bmb bmb1 = g();
/* 221 */     bmb bmb2 = ☃.g();
/*     */     
/* 223 */     if (!Objects.equals(h(), ☃.h()) || !a(bmb1, bmb2)) {
/*     */       return;
/*     */     }
/*     */     
/* 227 */     if (bmb2.E() < bmb1.E()) {
/* 228 */       a(this, bmb1, ☃, bmb2);
/*     */     } else {
/* 230 */       a(☃, bmb2, this, bmb1);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean a(bmb ☃, bmb bmb1) {
/* 235 */     if (bmb1.b() != ☃.b()) {
/* 236 */       return false;
/*     */     }
/* 238 */     if (bmb1.E() + ☃.E() > bmb1.c()) {
/* 239 */       return false;
/*     */     }
/* 241 */     if ((bmb1.n() ^ ☃.n()) != 0) {
/* 242 */       return false;
/*     */     }
/* 244 */     if (bmb1.n() && !bmb1.o().equals(☃.o())) {
/* 245 */       return false;
/*     */     }
/* 247 */     return true;
/*     */   }
/*     */   
/*     */   public static bmb a(bmb ☃, bmb bmb1, int i) {
/* 251 */     int j = Math.min(Math.min(☃.c(), i) - ☃.E(), bmb1.E());
/* 252 */     bmb bmb2 = ☃.i();
/* 253 */     bmb2.f(j);
/* 254 */     bmb1.g(j);
/* 255 */     return bmb2;
/*     */   }
/*     */   
/*     */   private static void a(bcv ☃, bmb bmb1, bmb bmb2) {
/* 259 */     bmb bmb3 = a(bmb1, bmb2, 64);
/* 260 */     ☃.b(bmb3);
/*     */   }
/*     */   
/*     */   private static void a(bcv ☃, bmb bmb1, bcv bcv1, bmb bmb2) {
/* 264 */     a(☃, bmb1, bmb2);
/* 265 */     ☃.e = Math.max(☃.e, bcv1.e);
/* 266 */     ☃.d = Math.min(☃.d, bcv1.d);
/*     */     
/* 268 */     if (bmb2.a()) {
/* 269 */       bcv1.ad();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aD() {
/* 275 */     return (g().b().u() || super.aD());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 285 */     if (b(☃)) {
/* 286 */       return false;
/*     */     }
/* 288 */     if (!g().a() && g().b() == bmd.pm && ☃.d()) {
/* 289 */       return false;
/*     */     }
/* 291 */     if (!g().b().a(☃)) {
/* 292 */       return false;
/*     */     }
/* 294 */     aS();
/* 295 */     this.f = (int)(this.f - f);
/* 296 */     if (this.f <= 0) {
/* 297 */       ad();
/*     */     }
/* 299 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 304 */     ☃.a("Health", (short)this.f);
/* 305 */     ☃.a("Age", (short)this.d);
/* 306 */     ☃.a("PickupDelay", (short)this.e);
/* 307 */     if (i() != null) {
/* 308 */       ☃.a("Thrower", i());
/*     */     }
/* 310 */     if (h() != null) {
/* 311 */       ☃.a("Owner", h());
/*     */     }
/* 313 */     if (!g().a()) {
/* 314 */       ☃.a("Item", g().b(new md()));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 320 */     this.f = ☃.g("Health");
/* 321 */     this.d = ☃.g("Age");
/* 322 */     if (☃.e("PickupDelay")) {
/* 323 */       this.e = ☃.g("PickupDelay");
/*     */     }
/* 325 */     if (☃.b("Owner")) {
/* 326 */       this.ag = ☃.a("Owner");
/*     */     }
/* 328 */     if (☃.b("Thrower")) {
/* 329 */       this.g = ☃.a("Thrower");
/*     */     }
/* 331 */     md md1 = ☃.p("Item");
/* 332 */     b(bmb.a(md1));
/* 333 */     if (g().a()) {
/* 334 */       ad();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a_(bfw ☃) {
/* 340 */     if (this.l.v) {
/*     */       return;
/*     */     }
/*     */     
/* 344 */     bmb bmb = g();
/* 345 */     blx blx = bmb.b();
/* 346 */     int i = bmb.E();
/* 347 */     if (this.e == 0 && (this.ag == null || this.ag.equals(☃.bS())) && ☃.bm.e(bmb)) {
/* 348 */       ☃.a(this, i);
/* 349 */       if (bmb.a()) {
/* 350 */         ad();
/*     */ 
/*     */         
/* 353 */         bmb.e(i);
/*     */       } 
/* 355 */       ☃.a(aea.e.b(blx), i);
/* 356 */       ☃.a(this);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public nr R() {
/* 362 */     nr ☃ = T();
/* 363 */     if (☃ != null) {
/* 364 */       return ☃;
/*     */     }
/*     */     
/* 367 */     return new of(g().j());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bL() {
/* 372 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public aqa b(aag ☃) {
/* 378 */     aqa aqa1 = super.b(☃);
/*     */     
/* 380 */     if (!this.l.v && aqa1 instanceof bcv) {
/* 381 */       ((bcv)aqa1).x();
/*     */     }
/* 383 */     return aqa1;
/*     */   }
/*     */   
/*     */   public bmb g() {
/* 387 */     return ab().<bmb>a(c);
/*     */   }
/*     */   
/*     */   public void b(bmb ☃) {
/* 391 */     ab().b(c, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(us<?> ☃) {
/* 396 */     super.a(☃);
/* 397 */     if (c.equals(☃)) {
/* 398 */       g().a(this);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public UUID h() {
/* 404 */     return this.ag;
/*     */   }
/*     */   
/*     */   public void b(@Nullable UUID ☃) {
/* 408 */     this.ag = ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public UUID i() {
/* 413 */     return this.g;
/*     */   }
/*     */   
/*     */   public void c(@Nullable UUID ☃) {
/* 417 */     this.g = ☃;
/*     */   }
/*     */   
/*     */   public int k() {
/* 421 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m() {
/* 426 */     this.e = 10;
/*     */   }
/*     */   
/*     */   public void n() {
/* 430 */     this.e = 0;
/*     */   }
/*     */   
/*     */   public void o() {
/* 434 */     this.e = 32767;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 438 */     this.e = ☃;
/*     */   }
/*     */   
/*     */   public boolean p() {
/* 442 */     return (this.e > 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void r() {
/* 450 */     this.d = -6000;
/*     */   }
/*     */   
/*     */   public void s() {
/* 454 */     o();
/* 455 */     this.d = 5999;
/*     */   }
/*     */   
/*     */   public float a(float ☃) {
/* 459 */     return (k() + ☃) / 20.0F + this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public oj<?> P() {
/* 464 */     return new on(this);
/*     */   }
/*     */   
/*     */   public bcv t() {
/* 468 */     return new bcv(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bcv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */