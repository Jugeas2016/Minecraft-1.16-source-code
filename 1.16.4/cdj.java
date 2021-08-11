/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.Random;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.Collectors;
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
/*     */ public class cdj
/*     */   extends ccj
/*     */ {
/*     */   private vk a;
/*  46 */   private String b = "";
/*  47 */   private String c = "";
/*  48 */   private fx g = new fx(0, 1, 0);
/*  49 */   private fx h = fx.b;
/*  50 */   private byg i = byg.a;
/*  51 */   private bzm j = bzm.a;
/*  52 */   private cfo k = cfo.d;
/*     */   private boolean l = true;
/*     */   private boolean m;
/*     */   private boolean n;
/*     */   private boolean o = true;
/*  57 */   private float p = 1.0F;
/*     */   private long q;
/*     */   
/*     */   public cdj() {
/*  61 */     super(cck.t);
/*     */   }
/*     */ 
/*     */   
/*     */   public double i() {
/*  66 */     return 96.0D;
/*     */   }
/*     */ 
/*     */   
/*     */   public md a(md ☃) {
/*  71 */     super.a(☃);
/*  72 */     ☃.a("name", d());
/*  73 */     ☃.a("author", this.b);
/*  74 */     ☃.a("metadata", this.c);
/*  75 */     ☃.b("posX", this.g.u());
/*  76 */     ☃.b("posY", this.g.v());
/*  77 */     ☃.b("posZ", this.g.w());
/*  78 */     ☃.b("sizeX", this.h.u());
/*  79 */     ☃.b("sizeY", this.h.v());
/*  80 */     ☃.b("sizeZ", this.h.w());
/*  81 */     ☃.a("rotation", this.j.toString());
/*  82 */     ☃.a("mirror", this.i.toString());
/*  83 */     ☃.a("mode", this.k.toString());
/*  84 */     ☃.a("ignoreEntities", this.l);
/*  85 */     ☃.a("powered", this.m);
/*  86 */     ☃.a("showair", this.n);
/*  87 */     ☃.a("showboundingbox", this.o);
/*  88 */     ☃.a("integrity", this.p);
/*  89 */     ☃.a("seed", this.q);
/*  90 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, md md1) {
/*  95 */     super.a(☃, md1);
/*  96 */     a(md1.l("name"));
/*  97 */     this.b = md1.l("author");
/*  98 */     this.c = md1.l("metadata");
/*  99 */     int i = afm.a(md1.h("posX"), -48, 48);
/* 100 */     int j = afm.a(md1.h("posY"), -48, 48);
/* 101 */     int k = afm.a(md1.h("posZ"), -48, 48);
/* 102 */     this.g = new fx(i, j, k);
/* 103 */     int m = afm.a(md1.h("sizeX"), 0, 48);
/* 104 */     int n = afm.a(md1.h("sizeY"), 0, 48);
/* 105 */     int i1 = afm.a(md1.h("sizeZ"), 0, 48);
/* 106 */     this.h = new fx(m, n, i1);
/*     */     try {
/* 108 */       this.j = bzm.valueOf(md1.l("rotation"));
/* 109 */     } catch (IllegalArgumentException illegalArgumentException) {
/* 110 */       this.j = bzm.a;
/*     */     } 
/*     */     try {
/* 113 */       this.i = byg.valueOf(md1.l("mirror"));
/* 114 */     } catch (IllegalArgumentException illegalArgumentException) {
/* 115 */       this.i = byg.a;
/*     */     } 
/*     */     try {
/* 118 */       this.k = cfo.valueOf(md1.l("mode"));
/* 119 */     } catch (IllegalArgumentException illegalArgumentException) {
/* 120 */       this.k = cfo.d;
/*     */     } 
/* 122 */     this.l = md1.q("ignoreEntities");
/* 123 */     this.m = md1.q("powered");
/* 124 */     this.n = md1.q("showair");
/* 125 */     this.o = md1.q("showboundingbox");
/* 126 */     if (md1.e("integrity")) {
/* 127 */       this.p = md1.j("integrity");
/*     */     } else {
/* 129 */       this.p = 1.0F;
/*     */     } 
/* 131 */     this.q = md1.i("seed");
/* 132 */     K();
/*     */   }
/*     */   
/*     */   private void K() {
/* 136 */     if (this.d == null) {
/*     */       return;
/*     */     }
/* 139 */     fx ☃ = o();
/* 140 */     ceh ceh = this.d.d_(☃);
/* 141 */     if (ceh.a(bup.mY)) {
/* 142 */       this.d.a(☃, ceh.a(caq.a, this.k), 2);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ow a() {
/* 149 */     return new ow(this.e, 7, b());
/*     */   }
/*     */ 
/*     */   
/*     */   public md b() {
/* 154 */     return a(new md());
/*     */   }
/*     */   
/*     */   public boolean a(bfw ☃) {
/* 158 */     if (!☃.eV()) {
/* 159 */       return false;
/*     */     }
/* 161 */     if ((☃.cg()).v) {
/* 162 */       ☃.a(this);
/*     */     }
/* 164 */     return true;
/*     */   }
/*     */   
/*     */   public String d() {
/* 168 */     return (this.a == null) ? "" : this.a.toString();
/*     */   }
/*     */   
/*     */   public String f() {
/* 172 */     return (this.a == null) ? "" : this.a.a();
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 176 */     return (this.a != null);
/*     */   }
/*     */   
/*     */   public void a(@Nullable String ☃) {
/* 180 */     a(aft.b(☃) ? null : vk.a(☃));
/*     */   }
/*     */   
/*     */   public void a(@Nullable vk ☃) {
/* 184 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public void a(aqm ☃) {
/* 188 */     this.b = ☃.R().getString();
/*     */   }
/*     */   
/*     */   public fx h() {
/* 192 */     return this.g;
/*     */   }
/*     */   
/*     */   public void b(fx ☃) {
/* 196 */     this.g = ☃;
/*     */   }
/*     */   
/*     */   public fx j() {
/* 200 */     return this.h;
/*     */   }
/*     */   
/*     */   public void c(fx ☃) {
/* 204 */     this.h = ☃;
/*     */   }
/*     */   
/*     */   public byg k() {
/* 208 */     return this.i;
/*     */   }
/*     */   
/*     */   public void b(byg ☃) {
/* 212 */     this.i = ☃;
/*     */   }
/*     */   
/*     */   public bzm l() {
/* 216 */     return this.j;
/*     */   }
/*     */   
/*     */   public void b(bzm ☃) {
/* 220 */     this.j = ☃;
/*     */   }
/*     */   
/*     */   public String m() {
/* 224 */     return this.c;
/*     */   }
/*     */   
/*     */   public void b(String ☃) {
/* 228 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public cfo x() {
/* 232 */     return this.k;
/*     */   }
/*     */   
/*     */   public void a(cfo ☃) {
/* 236 */     this.k = ☃;
/* 237 */     ceh ceh = this.d.d_(o());
/* 238 */     if (ceh.a(bup.mY)) {
/* 239 */       this.d.a(o(), ceh.a(caq.a, ☃), 2);
/*     */     }
/*     */   }
/*     */   
/*     */   public void y() {
/* 244 */     switch (null.a[x().ordinal()]) {
/*     */       case 1:
/* 246 */         a(cfo.b);
/*     */         break;
/*     */       case 2:
/* 249 */         a(cfo.c);
/*     */         break;
/*     */       case 3:
/* 252 */         a(cfo.d);
/*     */         break;
/*     */       case 4:
/* 255 */         a(cfo.a);
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean z() {
/* 261 */     return this.l;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 265 */     this.l = ☃;
/*     */   }
/*     */   
/*     */   public float A() {
/* 269 */     return this.p;
/*     */   }
/*     */   
/*     */   public void a(float ☃) {
/* 273 */     this.p = ☃;
/*     */   }
/*     */   
/*     */   public long B() {
/* 277 */     return this.q;
/*     */   }
/*     */   
/*     */   public void a(long ☃) {
/* 281 */     this.q = ☃;
/*     */   }
/*     */   
/*     */   public boolean C() {
/* 285 */     if (this.k != cfo.a) {
/* 286 */       return false;
/*     */     }
/* 288 */     fx ☃ = o();
/* 289 */     int i = 80;
/* 290 */     fx fx1 = new fx(☃.u() - 80, 0, ☃.w() - 80);
/* 291 */     fx fx2 = new fx(☃.u() + 80, 255, ☃.w() + 80);
/*     */     
/* 293 */     List<cdj> list1 = a(fx1, fx2);
/* 294 */     List<cdj> list2 = a(list1);
/* 295 */     if (list2.size() < 1) {
/* 296 */       return false;
/*     */     }
/*     */     
/* 299 */     cra cra = a(☃, list2);
/* 300 */     if (cra.d - cra.a > 1 && cra.e - cra.b > 1 && cra.f - cra.c > 1) {
/* 301 */       this.g = new fx(cra.a - ☃.u() + 1, cra.b - ☃.v() + 1, cra.c - ☃.w() + 1);
/* 302 */       this.h = new fx(cra.d - cra.a - 1, cra.e - cra.b - 1, cra.f - cra.c - 1);
/* 303 */       X_();
/* 304 */       ceh ceh = this.d.d_(☃);
/* 305 */       this.d.a(☃, ceh, ceh, 3);
/* 306 */       return true;
/*     */     } 
/* 308 */     return false;
/*     */   }
/*     */   
/*     */   private List<cdj> a(List<cdj> ☃) {
/* 312 */     Predicate<cdj> predicate = ☃ -> (☃.k == cfo.c && Objects.equals(this.a, ☃.a));
/* 313 */     return (List<cdj>)☃.stream().filter(predicate).collect(Collectors.toList());
/*     */   }
/*     */   
/*     */   private List<cdj> a(fx ☃, fx fx1) {
/* 317 */     List<cdj> list = Lists.newArrayList();
/* 318 */     for (fx fx2 : fx.a(☃, fx1)) {
/* 319 */       ceh ceh = this.d.d_(fx2);
/* 320 */       if (!ceh.a(bup.mY)) {
/*     */         continue;
/*     */       }
/* 323 */       ccj ccj1 = this.d.c(fx2);
/* 324 */       if (ccj1 != null && ccj1 instanceof cdj) {
/* 325 */         list.add((cdj)ccj1);
/*     */       }
/*     */     } 
/* 328 */     return list;
/*     */   }
/*     */   
/*     */   private cra a(fx ☃, List<cdj> list) {
/*     */     cra cra;
/* 333 */     if (list.size() > 1) {
/* 334 */       fx fx1 = ((cdj)list.get(0)).o();
/* 335 */       cra = new cra(fx1, fx1);
/*     */     } else {
/* 337 */       cra = new cra(☃, ☃);
/*     */     } 
/*     */     
/* 340 */     for (cdj cdj1 : list) {
/* 341 */       fx fx1 = cdj1.o();
/* 342 */       if (fx1.u() < cra.a) {
/* 343 */         cra.a = fx1.u();
/* 344 */       } else if (fx1.u() > cra.d) {
/* 345 */         cra.d = fx1.u();
/*     */       } 
/* 347 */       if (fx1.v() < cra.b) {
/* 348 */         cra.b = fx1.v();
/* 349 */       } else if (fx1.v() > cra.e) {
/* 350 */         cra.e = fx1.v();
/*     */       } 
/* 352 */       if (fx1.w() < cra.c) {
/* 353 */         cra.c = fx1.w(); continue;
/* 354 */       }  if (fx1.w() > cra.f) {
/* 355 */         cra.f = fx1.w();
/*     */       }
/*     */     } 
/* 358 */     return cra;
/*     */   }
/*     */   
/*     */   public boolean D() {
/* 362 */     return b(true);
/*     */   }
/*     */   public boolean b(boolean ☃) {
/*     */     ctb ctb;
/* 366 */     if (this.k != cfo.a || this.d.v || this.a == null) {
/* 367 */       return false;
/*     */     }
/* 369 */     fx fx1 = o().a(this.g);
/*     */     
/* 371 */     aag aag = (aag)this.d;
/* 372 */     csw csw = aag.n();
/*     */     
/*     */     try {
/* 375 */       ctb = csw.a(this.a);
/* 376 */     } catch (v v) {
/* 377 */       return false;
/*     */     } 
/*     */     
/* 380 */     ctb.a(this.d, fx1, this.h, !this.l, bup.iN);
/* 381 */     ctb.a(this.b);
/* 382 */     if (☃) {
/*     */       try {
/* 384 */         return csw.c(this.a);
/* 385 */       } catch (v v) {
/* 386 */         return false;
/*     */       } 
/*     */     }
/* 389 */     return true;
/*     */   }
/*     */   
/*     */   public boolean a(aag ☃) {
/* 393 */     return a(☃, true);
/*     */   }
/*     */   
/*     */   private static Random b(long ☃) {
/* 397 */     if (☃ == 0L) {
/* 398 */       return new Random(x.b());
/*     */     }
/* 400 */     return new Random(☃);
/*     */   }
/*     */   public boolean a(aag ☃, boolean bool) {
/*     */     ctb ctb;
/* 404 */     if (this.k != cfo.b || this.a == null) {
/* 405 */       return false;
/*     */     }
/* 407 */     csw csw = ☃.n();
/*     */     
/*     */     try {
/* 410 */       ctb = csw.b(this.a);
/* 411 */     } catch (v v) {
/* 412 */       return false;
/*     */     } 
/*     */     
/* 415 */     if (ctb == null) {
/* 416 */       return false;
/*     */     }
/*     */     
/* 419 */     return a(☃, bool, ctb);
/*     */   }
/*     */   
/*     */   public boolean a(aag ☃, boolean bool, ctb ctb1) {
/* 423 */     fx fx1 = o();
/*     */     
/* 425 */     if (!aft.b(ctb1.b())) {
/* 426 */       this.b = ctb1.b();
/*     */     }
/*     */     
/* 429 */     fx fx2 = ctb1.a();
/* 430 */     boolean bool1 = this.h.equals(fx2);
/*     */     
/* 432 */     if (!bool1) {
/* 433 */       this.h = fx2;
/* 434 */       X_();
/* 435 */       ceh ceh = ☃.d_(fx1);
/* 436 */       ☃.a(fx1, ceh, ceh, 3);
/*     */     } 
/*     */     
/* 439 */     if (!bool || bool1) {
/* 440 */       csx csx = (new csx()).a(this.i).a(this.j).a(this.l).a((brd)null);
/* 441 */       if (this.p < 1.0F) {
/* 442 */         csx.b().a(new csg(afm.a(this.p, 0.0F, 1.0F))).a(b(this.q));
/*     */       }
/* 444 */       fx fx3 = fx1.a(this.g);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 458 */       ctb1.a(☃, fx3, csx, b(this.q));
/* 459 */       return true;
/*     */     } 
/* 461 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void E() {
/* 466 */     if (this.a == null) {
/*     */       return;
/*     */     }
/* 469 */     aag ☃ = (aag)this.d;
/* 470 */     csw csw = ☃.n();
/* 471 */     csw.d(this.a);
/*     */   }
/*     */   
/*     */   public boolean F() {
/* 475 */     if (this.k != cfo.b || this.d.v || this.a == null) {
/* 476 */       return false;
/*     */     }
/* 478 */     aag ☃ = (aag)this.d;
/* 479 */     csw csw = ☃.n();
/*     */     try {
/* 481 */       return (csw.b(this.a) != null);
/* 482 */     } catch (v v) {
/* 483 */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean G() {
/* 488 */     return this.m;
/*     */   }
/*     */   
/*     */   public void c(boolean ☃) {
/* 492 */     this.m = ☃;
/*     */   }
/*     */   
/*     */   public boolean H() {
/* 496 */     return this.n;
/*     */   }
/*     */   
/*     */   public void d(boolean ☃) {
/* 500 */     this.n = ☃;
/*     */   }
/*     */   
/*     */   public boolean I() {
/* 504 */     return this.o;
/*     */   }
/*     */   
/*     */   public void e(boolean ☃) {
/* 508 */     this.o = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum a
/*     */   {
/* 516 */     a,
/* 517 */     b,
/* 518 */     c,
/* 519 */     d;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cdj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */