/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.Validate;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bcp
/*     */   extends bco
/*     */ {
/*  40 */   private static final Logger e = LogManager.getLogger();
/*     */   
/*  42 */   private static final us<bmb> f = uv.a((Class)bcp.class, uu.g);
/*  43 */   private static final us<Integer> g = uv.a((Class)bcp.class, uu.b);
/*     */ 
/*     */   
/*  46 */   private float ag = 1.0F;
/*     */   private boolean ah;
/*     */   
/*     */   public bcp(aqe<? extends bcp> ☃, brx brx1) {
/*  50 */     super((aqe)☃, brx1);
/*     */   }
/*     */   
/*     */   public bcp(brx ☃, fx fx1, gc gc1) {
/*  54 */     super((aqe)aqe.M, ☃, fx1);
/*  55 */     a(gc1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected float a(aqx ☃, aqb aqb1) {
/*  60 */     return 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  65 */     ab().a(f, bmb.b);
/*  66 */     ab().a(g, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gc ☃) {
/*  71 */     Validate.notNull(☃);
/*     */     
/*  73 */     this.d = ☃;
/*  74 */     if (☃.n().d()) {
/*  75 */       this.q = 0.0F;
/*  76 */       this.p = (this.d.d() * 90);
/*     */     } else {
/*  78 */       this.q = (-90 * ☃.e().a());
/*  79 */       this.p = 0.0F;
/*     */     } 
/*  81 */     this.s = this.q;
/*  82 */     this.r = this.p;
/*     */     
/*  84 */     g();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void g() {
/*  89 */     if (this.d == null) {
/*     */       return;
/*     */     }
/*     */     
/*  93 */     double ☃ = 0.46875D;
/*  94 */     double d1 = this.c.u() + 0.5D - this.d.i() * 0.46875D;
/*  95 */     double d2 = this.c.v() + 0.5D - this.d.j() * 0.46875D;
/*  96 */     double d3 = this.c.w() + 0.5D - this.d.k() * 0.46875D;
/*  97 */     o(d1, d2, d3);
/*     */     
/*  99 */     double d4 = i();
/* 100 */     double d5 = k();
/* 101 */     double d6 = i();
/*     */     
/* 103 */     gc.a a = this.d.n();
/* 104 */     switch (null.a[a.ordinal()]) {
/*     */       case 1:
/* 106 */         d4 = 1.0D;
/*     */         break;
/*     */       case 2:
/* 109 */         d5 = 1.0D;
/*     */         break;
/*     */       case 3:
/* 112 */         d6 = 1.0D;
/*     */         break;
/*     */     } 
/*     */     
/* 116 */     d4 /= 32.0D;
/* 117 */     d5 /= 32.0D;
/* 118 */     d6 /= 32.0D;
/* 119 */     a(new dci(d1 - d4, d2 - d5, d3 - d6, d1 + d4, d2 + d5, d3 + d6));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean h() {
/* 124 */     if (this.ah) {
/* 125 */       return true;
/*     */     }
/*     */     
/* 128 */     if (!this.l.k(this)) {
/* 129 */       return false;
/*     */     }
/*     */     
/* 132 */     ceh ☃ = this.l.d_(this.c.a(this.d.f()));
/* 133 */     if (!☃.c().b() && (!this.d.n().d() || !bvy.l(☃))) {
/* 134 */       return false;
/*     */     }
/*     */     
/* 137 */     return this.l.a(this, cc(), b).isEmpty();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqr ☃, dcn dcn1) {
/* 142 */     if (!this.ah) {
/* 143 */       super.a(☃, dcn1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void i(double ☃, double d1, double d2) {
/* 149 */     if (!this.ah) {
/* 150 */       super.i(☃, d1, d2);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public float bg() {
/* 156 */     return 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void aa() {
/* 161 */     c(o());
/* 162 */     super.aa();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 167 */     if (this.ah) {
/* 168 */       if (☃ == apk.m || ☃.v()) {
/* 169 */         return super.a(☃, f);
/*     */       }
/* 171 */       return false;
/*     */     } 
/*     */     
/* 174 */     if (b(☃)) {
/* 175 */       return false;
/*     */     }
/*     */     
/* 178 */     if (!☃.d() && !o().a()) {
/* 179 */       if (!this.l.v) {
/* 180 */         b(☃.k(), false);
/* 181 */         a(adq.gI, 1.0F, 1.0F);
/*     */       } 
/* 183 */       return true;
/*     */     } 
/* 185 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public int i() {
/* 190 */     return 12;
/*     */   }
/*     */ 
/*     */   
/*     */   public int k() {
/* 195 */     return 12;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃) {
/* 200 */     double d = 16.0D;
/* 201 */     d *= 64.0D * bW();
/* 202 */     return (☃ < d * d);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(@Nullable aqa ☃) {
/* 207 */     a(adq.gG, 1.0F, 1.0F);
/* 208 */     b(☃, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m() {
/* 213 */     a(adq.gH, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   private void b(@Nullable aqa ☃, boolean bool) {
/* 217 */     if (this.ah) {
/*     */       return;
/*     */     }
/*     */     
/* 221 */     bmb bmb = o();
/* 222 */     b(bmb.b);
/*     */     
/* 224 */     if (!this.l.V().b(brt.g)) {
/* 225 */       if (☃ == null) {
/* 226 */         c(bmb);
/*     */       }
/*     */       
/*     */       return;
/*     */     } 
/* 231 */     if (☃ instanceof bfw) {
/* 232 */       bfw bfw = (bfw)☃;
/*     */       
/* 234 */       if (bfw.bC.d) {
/* 235 */         c(bmb);
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/* 240 */     if (bool) {
/* 241 */       a(bmd.oW);
/*     */     }
/* 243 */     if (!bmb.a()) {
/* 244 */       bmb = bmb.i();
/* 245 */       c(bmb);
/* 246 */       if (this.J.nextFloat() < this.ag) {
/* 247 */         a(bmb);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void c(bmb ☃) {
/* 253 */     if (☃.b() == bmd.nf) {
/* 254 */       cxx cxx = bmh.b(☃, this.l);
/* 255 */       cxx.a(this.c, Y());
/* 256 */       cxx.a(true);
/*     */     } 
/* 258 */     ☃.a((aqa)null);
/*     */   }
/*     */   
/*     */   public bmb o() {
/* 262 */     return ab().<bmb>a(f);
/*     */   }
/*     */   
/*     */   public void b(bmb ☃) {
/* 266 */     a(☃, true);
/*     */   }
/*     */   
/*     */   public void a(bmb ☃, boolean bool) {
/* 270 */     if (!☃.a()) {
/* 271 */       ☃ = ☃.i();
/* 272 */       ☃.e(1);
/* 273 */       ☃.a(this);
/*     */     } 
/* 275 */     ab().b(f, ☃);
/* 276 */     if (!☃.a()) {
/* 277 */       a(adq.gF, 1.0F, 1.0F);
/*     */     }
/*     */     
/* 280 */     if (bool && this.c != null) {
/* 281 */       this.l.c(this.c, bup.a);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a_(int ☃, bmb bmb1) {
/* 287 */     if (☃ == 0) {
/* 288 */       b(bmb1);
/* 289 */       return true;
/*     */     } 
/*     */     
/* 292 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(us<?> ☃) {
/* 297 */     if (☃.equals(f)) {
/* 298 */       bmb bmb = o();
/* 299 */       if (!bmb.a() && bmb.z() != this) {
/* 300 */         bmb.a(this);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public int p() {
/* 306 */     return ((Integer)ab().<Integer>a(g)).intValue();
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 310 */     a(☃, true);
/*     */   }
/*     */   
/*     */   private void a(int ☃, boolean bool) {
/* 314 */     ab().b(g, Integer.valueOf(☃ % 8));
/*     */     
/* 316 */     if (bool && this.c != null) {
/* 317 */       this.l.c(this.c, bup.a);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 323 */     super.b(☃);
/*     */     
/* 325 */     if (!o().a()) {
/* 326 */       ☃.a("Item", o().b(new md()));
/* 327 */       ☃.a("ItemRotation", (byte)p());
/* 328 */       ☃.a("ItemDropChance", this.ag);
/*     */     } 
/*     */     
/* 331 */     ☃.a("Facing", (byte)this.d.c());
/* 332 */     ☃.a("Invisible", bF());
/* 333 */     ☃.a("Fixed", this.ah);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 338 */     super.a(☃);
/* 339 */     md md1 = ☃.p("Item");
/* 340 */     if (md1 != null && !md1.isEmpty()) {
/* 341 */       bmb bmb1 = bmb.a(md1);
/* 342 */       if (bmb1.a()) {
/* 343 */         e.warn("Unable to load item from: {}", md1);
/*     */       }
/*     */ 
/*     */       
/* 347 */       bmb bmb2 = o();
/* 348 */       if (!bmb2.a() && 
/* 349 */         !bmb.b(bmb1, bmb2)) {
/* 350 */         c(bmb2);
/*     */       }
/*     */ 
/*     */       
/* 354 */       a(bmb1, false);
/* 355 */       a(☃.f("ItemRotation"), false);
/*     */       
/* 357 */       if (☃.c("ItemDropChance", 99)) {
/* 358 */         this.ag = ☃.j("ItemDropChance");
/*     */       }
/*     */     } 
/* 361 */     a(gc.a(☃.f("Facing")));
/* 362 */     j(☃.q("Invisible"));
/* 363 */     this.ah = ☃.q("Fixed");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aou a(bfw ☃, aot aot1) {
/* 369 */     bmb bmb = ☃.b(aot1);
/* 370 */     boolean bool1 = !o().a();
/* 371 */     boolean bool2 = !bmb.a();
/*     */ 
/*     */     
/* 374 */     if (this.ah) {
/* 375 */       return aou.c;
/*     */     }
/*     */     
/* 378 */     if (this.l.v) {
/* 379 */       return (bool1 || bool2) ? aou.a : aou.c;
/*     */     }
/*     */     
/* 382 */     if (!bool1) {
/* 383 */       if (bool2 && !this.y) {
/* 384 */         b(bmb);
/*     */         
/* 386 */         if (!☃.bC.d) {
/* 387 */           bmb.g(1);
/*     */         }
/*     */       } 
/*     */     } else {
/* 391 */       a(adq.gJ, 1.0F, 1.0F);
/* 392 */       a(p() + 1);
/*     */     } 
/*     */     
/* 395 */     return aou.b;
/*     */   }
/*     */   
/*     */   public int q() {
/* 399 */     if (o().a()) {
/* 400 */       return 0;
/*     */     }
/*     */     
/* 403 */     return p() % 8 + 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public oj<?> P() {
/* 408 */     return new on(this, X(), this.d.c(), n());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bcp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */