/*     */ import com.google.common.collect.ImmutableList;
/*     */ import java.util.List;
/*     */ import java.util.function.Predicate;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bfv
/*     */   implements aon, aoy
/*     */ {
/*  37 */   public final gj<bmb> a = gj.a(36, bmb.b);
/*  38 */   public final gj<bmb> b = gj.a(4, bmb.b);
/*  39 */   public final gj<bmb> c = gj.a(1, bmb.b);
/*  40 */   private final List<gj<bmb>> f = (List<gj<bmb>>)ImmutableList.of(this.a, this.b, this.c);
/*     */   
/*     */   public int d;
/*     */   public final bfw e;
/*  44 */   private bmb g = bmb.b;
/*     */   
/*     */   private int h;
/*     */   
/*     */   public bfv(bfw ☃) {
/*  49 */     this.e = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public bmb f() {
/*  55 */     if (d(this.d)) {
/*  56 */       return this.a.get(this.d);
/*     */     }
/*  58 */     return bmb.b;
/*     */   }
/*     */   
/*     */   public static int g() {
/*  62 */     return 9;
/*     */   }
/*     */   
/*     */   private boolean a(bmb ☃, bmb bmb1) {
/*  66 */     return (!☃.a() && 
/*  67 */       b(☃, bmb1) && ☃
/*  68 */       .d() && ☃
/*  69 */       .E() < ☃.c() && ☃
/*  70 */       .E() < V_());
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean b(bmb ☃, bmb bmb1) {
/*  75 */     return (☃.b() == bmb1.b() && bmb.a(☃, bmb1));
/*     */   }
/*     */   
/*     */   public int h() {
/*  79 */     for (int ☃ = 0; ☃ < this.a.size(); ☃++) {
/*  80 */       if (((bmb)this.a.get(☃)).a()) {
/*  81 */         return ☃;
/*     */       }
/*     */     } 
/*  84 */     return -1;
/*     */   }
/*     */   
/*     */   public void a(bmb ☃) {
/*  88 */     int i = b(☃);
/*  89 */     if (d(i)) {
/*  90 */       this.d = i;
/*     */       
/*     */       return;
/*     */     } 
/*  94 */     if (i == -1) {
/*  95 */       this.d = i();
/*     */ 
/*     */       
/*  98 */       if (!((bmb)this.a.get(this.d)).a()) {
/*  99 */         int j = h();
/* 100 */         if (j != -1) {
/* 101 */           this.a.set(j, this.a.get(this.d));
/*     */         }
/*     */       } 
/*     */       
/* 105 */       this.a.set(this.d, ☃);
/*     */     } else {
/* 107 */       c(i);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void c(int ☃) {
/* 112 */     this.d = i();
/*     */ 
/*     */     
/* 115 */     bmb bmb1 = this.a.get(this.d);
/* 116 */     this.a.set(this.d, this.a.get(☃));
/* 117 */     this.a.set(☃, bmb1);
/*     */   }
/*     */   
/*     */   public static boolean d(int ☃) {
/* 121 */     return (☃ >= 0 && ☃ < 9);
/*     */   }
/*     */   
/*     */   public int b(bmb ☃) {
/* 125 */     for (int i = 0; i < this.a.size(); i++) {
/* 126 */       if (!((bmb)this.a.get(i)).a() && b(☃, this.a.get(i))) {
/* 127 */         return i;
/*     */       }
/*     */     } 
/* 130 */     return -1;
/*     */   }
/*     */   
/*     */   public int c(bmb ☃) {
/* 134 */     for (int i = 0; i < this.a.size(); i++) {
/* 135 */       bmb bmb1 = this.a.get(i);
/* 136 */       if (!((bmb)this.a.get(i)).a() && 
/* 137 */         b(☃, this.a.get(i)) && 
/* 138 */         !((bmb)this.a.get(i)).f() && 
/* 139 */         !bmb1.x() && 
/* 140 */         !bmb1.t())
/*     */       {
/* 142 */         return i;
/*     */       }
/*     */     } 
/* 145 */     return -1;
/*     */   }
/*     */   
/*     */   public int i() {
/*     */     int ☃;
/* 150 */     for (☃ = 0; ☃ < 9; ☃++) {
/* 151 */       int i = (this.d + ☃) % 9;
/*     */       
/* 153 */       if (((bmb)this.a.get(i)).a()) {
/* 154 */         return i;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 159 */     for (☃ = 0; ☃ < 9; ☃++) {
/* 160 */       int i = (this.d + ☃) % 9;
/*     */       
/* 162 */       if (!((bmb)this.a.get(i)).x()) {
/* 163 */         return i;
/*     */       }
/*     */     } 
/*     */     
/* 167 */     return this.d;
/*     */   }
/*     */   
/*     */   public void a(double ☃) {
/* 171 */     if (☃ > 0.0D) {
/* 172 */       ☃ = 1.0D;
/*     */     }
/* 174 */     if (☃ < 0.0D) {
/* 175 */       ☃ = -1.0D;
/*     */     }
/*     */     
/* 178 */     this.d = (int)(this.d - ☃);
/*     */     
/* 180 */     while (this.d < 0) {
/* 181 */       this.d += 9;
/*     */     }
/* 183 */     while (this.d >= 9) {
/* 184 */       this.d -= 9;
/*     */     }
/*     */   }
/*     */   
/*     */   public int a(Predicate<bmb> ☃, int i, aon aon1) {
/* 189 */     int j = 0;
/* 190 */     boolean bool = (i == 0);
/*     */     
/* 192 */     j += aoo.a(this, ☃, i - j, bool);
/* 193 */     j += aoo.a(aon1, ☃, i - j, bool);
/* 194 */     j += aoo.a(this.g, ☃, i - j, bool);
/* 195 */     if (this.g.a()) {
/* 196 */       this.g = bmb.b;
/*     */     }
/* 198 */     return j;
/*     */   }
/*     */   
/*     */   private int i(bmb ☃) {
/* 202 */     int i = d(☃);
/* 203 */     if (i == -1) {
/* 204 */       i = h();
/*     */     }
/* 206 */     if (i == -1) {
/* 207 */       return ☃.E();
/*     */     }
/* 209 */     return d(i, ☃);
/*     */   }
/*     */   
/*     */   private int d(int ☃, bmb bmb1) {
/* 213 */     blx blx = bmb1.b();
/* 214 */     int i = bmb1.E();
/*     */     
/* 216 */     bmb bmb2 = a(☃);
/* 217 */     if (bmb2.a()) {
/* 218 */       bmb2 = new bmb(blx, 0);
/* 219 */       if (bmb1.n()) {
/* 220 */         bmb2.c(bmb1.o().g());
/*     */       }
/* 222 */       a(☃, bmb2);
/*     */     } 
/*     */     
/* 225 */     int j = i;
/* 226 */     if (j > bmb2.c() - bmb2.E()) {
/* 227 */       j = bmb2.c() - bmb2.E();
/*     */     }
/* 229 */     if (j > V_() - bmb2.E()) {
/* 230 */       j = V_() - bmb2.E();
/*     */     }
/*     */     
/* 233 */     if (j == 0) {
/* 234 */       return i;
/*     */     }
/*     */     
/* 237 */     i -= j;
/* 238 */     bmb2.f(j);
/* 239 */     bmb2.d(5);
/*     */     
/* 241 */     return i;
/*     */   }
/*     */   
/*     */   public int d(bmb ☃) {
/* 245 */     if (a(a(this.d), ☃)) {
/* 246 */       return this.d;
/*     */     }
/* 248 */     if (a(a(40), ☃)) {
/* 249 */       return 40;
/*     */     }
/* 251 */     for (int i = 0; i < this.a.size(); i++) {
/* 252 */       if (a(this.a.get(i), ☃)) {
/* 253 */         return i;
/*     */       }
/*     */     } 
/* 256 */     return -1;
/*     */   }
/*     */   
/*     */   public void j() {
/* 260 */     for (gj<bmb> ☃ : this.f) {
/* 261 */       for (int i = 0; i < ☃.size(); i++) {
/* 262 */         if (!((bmb)☃.get(i)).a()) {
/* 263 */           ((bmb)☃.get(i)).a(this.e.l, this.e, i, (this.d == i));
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean e(bmb ☃) {
/* 270 */     return c(-1, ☃);
/*     */   }
/*     */   
/*     */   public boolean c(int ☃, bmb bmb1) {
/* 274 */     if (bmb1.a()) {
/* 275 */       return false;
/*     */     }
/*     */     
/*     */     try {
/* 279 */       if (!bmb1.f()) {
/*     */         int i;
/*     */         do {
/* 282 */           i = bmb1.E();
/* 283 */           if (☃ == -1) {
/* 284 */             bmb1.e(i(bmb1));
/*     */           } else {
/* 286 */             bmb1.e(d(☃, bmb1));
/*     */           } 
/* 288 */         } while (!bmb1.a() && bmb1.E() < i);
/* 289 */         if (bmb1.E() == i && this.e.bC.d) {
/*     */           
/* 291 */           bmb1.e(0);
/* 292 */           return true;
/*     */         } 
/* 294 */         return (bmb1.E() < i);
/*     */       } 
/*     */       
/* 297 */       if (☃ == -1) {
/* 298 */         ☃ = h();
/*     */       }
/* 300 */       if (☃ >= 0) {
/* 301 */         this.a.set(☃, bmb1.i());
/* 302 */         ((bmb)this.a.get(☃)).d(5);
/* 303 */         bmb1.e(0);
/* 304 */         return true;
/* 305 */       }  if (this.e.bC.d) {
/*     */         
/* 307 */         bmb1.e(0);
/* 308 */         return true;
/*     */       } 
/* 310 */       return false;
/* 311 */     } catch (Throwable throwable) {
/* 312 */       l l = l.a(throwable, "Adding item to inventory");
/* 313 */       m m = l.a("Item being added");
/*     */       
/* 315 */       m.a("Item ID", Integer.valueOf(blx.a(bmb1.b())));
/* 316 */       m.a("Item data", Integer.valueOf(bmb1.g()));
/* 317 */       m.a("Item name", () -> ☃.r().getString());
/*     */       
/* 319 */       throw new u(l);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(brx ☃, bmb bmb1) {
/* 324 */     if (☃.v) {
/*     */       return;
/*     */     }
/*     */     
/* 328 */     while (!bmb1.a()) {
/* 329 */       int i = d(bmb1);
/* 330 */       if (i == -1) {
/* 331 */         i = h();
/*     */       }
/*     */       
/* 334 */       if (i == -1) {
/* 335 */         this.e.a(bmb1, false);
/*     */         
/*     */         break;
/*     */       } 
/* 339 */       int j = bmb1.c() - a(i).E();
/*     */       
/* 341 */       if (c(i, bmb1.a(j))) {
/* 342 */         ((aah)this.e).b.a(new pi(-2, i, a(i)));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(int ☃, int i) {
/* 349 */     List<bmb> list = null;
/*     */     
/* 351 */     for (gj<bmb> gj1 : this.f) {
/* 352 */       if (☃ < gj1.size()) {
/* 353 */         list = gj1;
/*     */         break;
/*     */       } 
/* 356 */       ☃ -= gj1.size();
/*     */     } 
/*     */ 
/*     */     
/* 360 */     if (list != null && !((bmb)list.get(☃)).a()) {
/* 361 */       return aoo.a(list, ☃, i);
/*     */     }
/* 363 */     return bmb.b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void f(bmb ☃) {
/* 372 */     for (gj<bmb> gj1 : this.f) {
/* 373 */       for (int i = 0; i < gj1.size(); i++) {
/* 374 */         if (gj1.get(i) == ☃) {
/* 375 */           gj1.set(i, bmb.b);
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb b(int ☃) {
/* 384 */     gj<bmb> gj1 = null;
/*     */     
/* 386 */     for (gj<bmb> gj2 : this.f) {
/* 387 */       if (☃ < gj2.size()) {
/* 388 */         gj1 = gj2;
/*     */         break;
/*     */       } 
/* 391 */       ☃ -= gj2.size();
/*     */     } 
/*     */     
/* 394 */     if (gj1 != null && !((bmb)gj1.get(☃)).a()) {
/* 395 */       bmb bmb1 = gj1.get(☃);
/* 396 */       gj1.set(☃, bmb.b);
/* 397 */       return bmb1;
/*     */     } 
/* 399 */     return bmb.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, bmb bmb1) {
/* 404 */     gj<bmb> gj1 = null;
/*     */     
/* 406 */     for (gj<bmb> gj2 : this.f) {
/* 407 */       if (☃ < gj2.size()) {
/* 408 */         gj1 = gj2;
/*     */         break;
/*     */       } 
/* 411 */       ☃ -= gj2.size();
/*     */     } 
/*     */ 
/*     */     
/* 415 */     if (gj1 != null) {
/* 416 */       gj1.set(☃, bmb1);
/*     */     }
/*     */   }
/*     */   
/*     */   public float a(ceh ☃) {
/* 421 */     return ((bmb)this.a.get(this.d)).a(☃);
/*     */   }
/*     */   
/*     */   public mj a(mj ☃) {
/*     */     int i;
/* 426 */     for (i = 0; i < this.a.size(); i++) {
/* 427 */       if (!((bmb)this.a.get(i)).a()) {
/* 428 */         md md = new md();
/* 429 */         md.a("Slot", (byte)i);
/* 430 */         ((bmb)this.a.get(i)).b(md);
/* 431 */         ☃.add(md);
/*     */       } 
/*     */     } 
/* 434 */     for (i = 0; i < this.b.size(); i++) {
/* 435 */       if (!((bmb)this.b.get(i)).a()) {
/* 436 */         md md = new md();
/* 437 */         md.a("Slot", (byte)(i + 100));
/* 438 */         ((bmb)this.b.get(i)).b(md);
/* 439 */         ☃.add(md);
/*     */       } 
/*     */     } 
/* 442 */     for (i = 0; i < this.c.size(); i++) {
/* 443 */       if (!((bmb)this.c.get(i)).a()) {
/* 444 */         md md = new md();
/* 445 */         md.a("Slot", (byte)(i + 150));
/* 446 */         ((bmb)this.c.get(i)).b(md);
/* 447 */         ☃.add(md);
/*     */       } 
/*     */     } 
/* 450 */     return ☃;
/*     */   }
/*     */   
/*     */   public void b(mj ☃) {
/* 454 */     this.a.clear();
/* 455 */     this.b.clear();
/* 456 */     this.c.clear();
/* 457 */     for (int i = 0; i < ☃.size(); i++) {
/* 458 */       md md = ☃.a(i);
/* 459 */       int j = md.f("Slot") & 0xFF;
/* 460 */       bmb bmb1 = bmb.a(md);
/* 461 */       if (!bmb1.a()) {
/* 462 */         if (j >= 0 && j < this.a.size()) {
/* 463 */           this.a.set(j, bmb1);
/* 464 */         } else if (j >= 100 && j < this.b.size() + 100) {
/* 465 */           this.b.set(j - 100, bmb1);
/* 466 */         } else if (j >= 150 && j < this.c.size() + 150) {
/* 467 */           this.c.set(j - 150, bmb1);
/*     */         } 
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int Z_() {
/* 475 */     return this.a.size() + this.b.size() + this.c.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 480 */     for (bmb ☃ : this.a) {
/* 481 */       if (!☃.a()) {
/* 482 */         return false;
/*     */       }
/*     */     } 
/* 485 */     for (bmb ☃ : this.b) {
/* 486 */       if (!☃.a()) {
/* 487 */         return false;
/*     */       }
/*     */     } 
/* 490 */     for (bmb ☃ : this.c) {
/* 491 */       if (!☃.a()) {
/* 492 */         return false;
/*     */       }
/*     */     } 
/* 495 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(int ☃) {
/* 500 */     List<bmb> list = null;
/*     */     
/* 502 */     for (gj<bmb> gj1 : this.f) {
/* 503 */       if (☃ < gj1.size()) {
/* 504 */         list = gj1;
/*     */         break;
/*     */       } 
/* 507 */       ☃ -= gj1.size();
/*     */     } 
/*     */ 
/*     */     
/* 511 */     return (list == null) ? bmb.b : list.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public nr R() {
/* 516 */     return new of("container.inventory");
/*     */   }
/*     */   
/*     */   public bmb e(int ☃) {
/* 520 */     return this.b.get(☃);
/*     */   }
/*     */   
/*     */   public void a(apk ☃, float f) {
/* 524 */     if (f <= 0.0F) {
/*     */       return;
/*     */     }
/*     */     
/* 528 */     f /= 4.0F;
/* 529 */     if (f < 1.0F) {
/* 530 */       f = 1.0F;
/*     */     }
/* 532 */     for (int i = 0; i < this.b.size(); i++) {
/* 533 */       bmb bmb1 = this.b.get(i);
/* 534 */       if (!☃.p() || !bmb1.b().u())
/*     */       {
/*     */         
/* 537 */         if (bmb1.b() instanceof bjy) {
/* 538 */           int j = i;
/* 539 */           bmb1.a((int)f, this.e, bfw1 -> bfw1.c(aqf.a(aqf.a.b, ☃)));
/*     */         }  } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void k() {
/* 545 */     for (List<bmb> ☃ : this.f) {
/* 546 */       for (int i = 0; i < ☃.size(); i++) {
/* 547 */         bmb bmb1 = ☃.get(i);
/* 548 */         if (!bmb1.a()) {
/* 549 */           this.e.a(bmb1, true, false);
/* 550 */           ☃.set(i, bmb.b);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void X_() {
/* 558 */     this.h++;
/*     */   }
/*     */   
/*     */   public int l() {
/* 562 */     return this.h;
/*     */   }
/*     */   
/*     */   public void g(bmb ☃) {
/* 566 */     this.g = ☃;
/*     */   }
/*     */   
/*     */   public bmb m() {
/* 570 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/* 575 */     if (this.e.y) {
/* 576 */       return false;
/*     */     }
/* 578 */     if (☃.h(this.e) > 64.0D) {
/* 579 */       return false;
/*     */     }
/* 581 */     return true;
/*     */   }
/*     */   
/*     */   public boolean h(bmb ☃) {
/* 585 */     for (List<bmb> list : this.f) {
/* 586 */       for (bmb bmb1 : list) {
/* 587 */         if (!bmb1.a() && bmb1.a(☃)) {
/* 588 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/* 592 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(ael<blx> ☃) {
/* 596 */     for (List<bmb> list : this.f) {
/* 597 */       for (bmb bmb1 : list) {
/* 598 */         if (!bmb1.a() && ☃.a(bmb1.b())) {
/* 599 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/* 603 */     return false;
/*     */   }
/*     */   
/*     */   public void a(bfv ☃) {
/* 607 */     for (int i = 0; i < Z_(); i++) {
/* 608 */       a(i, ☃.a(i));
/*     */     }
/* 610 */     this.d = ☃.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public void Y_() {
/* 615 */     for (List<bmb> ☃ : this.f) {
/* 616 */       ☃.clear();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(bfy ☃) {
/* 621 */     for (bmb bmb1 : this.a)
/* 622 */       ☃.a(bmb1); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bfv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */