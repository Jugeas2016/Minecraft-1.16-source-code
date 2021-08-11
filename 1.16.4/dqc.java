/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
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
/*     */ public class dqc
/*     */   extends dqe<dqc.b>
/*     */ {
/*  52 */   private static final vk B = new vk("textures/gui/container/creative_inventory/tabs.png");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  62 */   private static final apa C = new apa(45);
/*  63 */   private static final nr D = new of("inventory.binSlot");
/*     */   
/*  65 */   private static int E = bks.b.a();
/*     */   
/*     */   private float F;
/*     */   private boolean G;
/*     */   private dlq H;
/*     */   @Nullable
/*     */   private List<bjr> I;
/*     */   @Nullable
/*     */   private bjr J;
/*     */   private dqb K;
/*     */   private boolean L;
/*     */   private boolean M;
/*  77 */   private final Map<vk, ael<blx>> N = Maps.newTreeMap();
/*     */   
/*     */   public static class b extends bic {
/*  80 */     public final gj<bmb> c = gj.a();
/*     */ 
/*     */     
/*     */     public b(bfw ☃) {
/*  84 */       super(null, 0);
/*  85 */       bfv bfv = ☃.bm; int i;
/*  86 */       for (i = 0; i < 5; i++) {
/*  87 */         for (int j = 0; j < 9; j++) {
/*  88 */           a(new dqc.a(dqc.l(), i * 9 + j, 9 + j * 18, 18 + i * 18));
/*     */         }
/*     */       } 
/*     */       
/*  92 */       for (i = 0; i < 9; i++) {
/*  93 */         a(new bjr(bfv, i, 9 + i * 18, 112));
/*     */       }
/*     */       
/*  96 */       a(0.0F);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(bfw ☃) {
/* 101 */       return true;
/*     */     }
/*     */     
/*     */     public void a(float ☃) {
/* 105 */       int i = (this.c.size() + 9 - 1) / 9 - 5;
/*     */       
/* 107 */       int j = (int)((☃ * i) + 0.5D);
/* 108 */       if (j < 0) {
/* 109 */         j = 0;
/*     */       }
/* 111 */       for (int k = 0; k < 5; k++) {
/* 112 */         for (int m = 0; m < 9; m++) {
/* 113 */           int n = m + (k + j) * 9;
/* 114 */           if (n >= 0 && n < this.c.size()) {
/* 115 */             dqc.l().a(m + k * 9, this.c.get(n));
/*     */           } else {
/* 117 */             dqc.l().a(m + k * 9, bmb.b);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     public boolean e() {
/* 124 */       return (this.c.size() > 45);
/*     */     }
/*     */ 
/*     */     
/*     */     public bmb b(bfw ☃, int i) {
/* 129 */       if (i >= this.a.size() - 9 && i < this.a.size()) {
/* 130 */         bjr bjr = this.a.get(i);
/*     */         
/* 132 */         if (bjr != null && bjr.f()) {
/* 133 */           bjr.d(bmb.b);
/*     */         }
/*     */       } 
/*     */       
/* 137 */       return bmb.b;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(bmb ☃, bjr bjr1) {
/* 142 */       return (bjr1.c != dqc.l());
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b(bjr ☃) {
/* 147 */       return (☃.c != dqc.l());
/*     */     }
/*     */   }
/*     */   
/*     */   public dqc(bfw ☃) {
/* 152 */     super(new b(☃), ☃.bm, oe.d);
/* 153 */     ☃.bp = this.t;
/* 154 */     this.n = true;
/* 155 */     this.c = 136;
/* 156 */     this.b = 195;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/* 161 */     if (!this.i.q.g()) {
/* 162 */       this.i.a(new dql(this.i.s));
/* 163 */     } else if (this.H != null) {
/* 164 */       this.H.a();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(@Nullable bjr ☃, int i, int j, bik bik1) {
/* 170 */     if (a(☃)) {
/* 171 */       this.H.l();
/* 172 */       this.H.n(0);
/*     */     } 
/*     */     
/* 175 */     boolean bool = (bik1 == bik.b);
/* 176 */     bik1 = (i == -999 && bik1 == bik.a) ? bik.e : bik1;
/*     */     
/* 178 */     if (☃ != null || E == bks.n.a() || bik1 == bik.f) {
/* 179 */       if (☃ != null && !☃.a(this.i.s)) {
/*     */         return;
/*     */       }
/* 182 */       if (☃ == this.J && bool) {
/* 183 */         for (int k = 0; k < this.i.s.bo.b().size(); k++) {
/* 184 */           this.i.q.a(bmb.b, k);
/*     */         }
/* 186 */       } else if (E == bks.n.a()) {
/*     */         
/* 188 */         if (☃ == this.J) {
/* 189 */           this.i.s.bm.g(bmb.b);
/* 190 */         } else if (bik1 == bik.e && ☃ != null && ☃.f()) {
/* 191 */           bmb bmb1 = ☃.a((j == 0) ? 1 : ☃.e().c());
/* 192 */           bmb bmb2 = ☃.e();
/* 193 */           this.i.s.a(bmb1, true);
/* 194 */           this.i.q.a(bmb1);
/*     */           
/* 196 */           this.i.q.a(bmb2, (c.a((c)☃)).d);
/* 197 */         } else if (bik1 == bik.e && !this.i.s.bm.m().a()) {
/* 198 */           this.i.s.a(this.i.s.bm.m(), true);
/* 199 */           this.i.q.a(this.i.s.bm.m());
/* 200 */           this.i.s.bm.g(bmb.b);
/*     */         } else {
/* 202 */           this.i.s.bo.a((☃ == null) ? i : (c.a((c)☃)).d, j, bik1, this.i.s);
/* 203 */           this.i.s.bo.c();
/*     */         }
/*     */       
/* 206 */       } else if (bik1 != bik.f && ☃.c == C) {
/*     */         
/* 208 */         bfv bfv = this.i.s.bm;
/* 209 */         bmb bmb1 = bfv.m();
/* 210 */         bmb bmb2 = ☃.e();
/*     */         
/* 212 */         if (bik1 == bik.c) {
/* 213 */           if (!bmb2.a()) {
/* 214 */             bmb bmb = bmb2.i();
/* 215 */             bmb.e(bmb.c());
/* 216 */             this.i.s.bm.a(j, bmb);
/* 217 */             this.i.s.bo.c();
/*     */           } 
/*     */           return;
/*     */         } 
/* 221 */         if (bik1 == bik.d) {
/* 222 */           if (bfv.m().a() && ☃.f()) {
/* 223 */             bmb bmb = ☃.e().i();
/* 224 */             bmb.e(bmb.c());
/* 225 */             bfv.g(bmb);
/*     */           } 
/*     */           return;
/*     */         } 
/* 229 */         if (bik1 == bik.e) {
/* 230 */           if (!bmb2.a()) {
/* 231 */             bmb bmb = bmb2.i();
/* 232 */             bmb.e((j == 0) ? 1 : bmb.c());
/* 233 */             this.i.s.a(bmb, true);
/* 234 */             this.i.q.a(bmb);
/*     */           } 
/*     */           
/*     */           return;
/*     */         } 
/*     */         
/* 240 */         if (!bmb1.a() && !bmb2.a() && bmb1.a(bmb2) && bmb.a(bmb1, bmb2)) {
/*     */           
/* 242 */           if (j == 0) {
/* 243 */             if (bool) {
/* 244 */               bmb1.e(bmb1.c());
/*     */             }
/* 246 */             else if (bmb1.E() < bmb1.c()) {
/* 247 */               bmb1.f(1);
/*     */             } 
/*     */           } else {
/*     */             
/* 251 */             bmb1.g(1);
/*     */           } 
/* 253 */         } else if (bmb2.a() || !bmb1.a()) {
/*     */           
/* 255 */           if (j == 0) {
/* 256 */             bfv.g(bmb.b);
/*     */           } else {
/* 258 */             bfv.m().g(1);
/*     */           } 
/*     */         } else {
/*     */           
/* 262 */           bfv.g(bmb2.i());
/* 263 */           bmb1 = bfv.m();
/* 264 */           if (bool) {
/* 265 */             bmb1.e(bmb1.c());
/*     */           }
/*     */         } 
/* 268 */       } else if (this.t != null) {
/* 269 */         bmb bmb = (☃ == null) ? bmb.b : this.t.a(☃.d).e();
/* 270 */         this.t.a((☃ == null) ? i : ☃.d, j, bik1, this.i.s);
/*     */         
/* 272 */         if (bic.c(j) == 2) {
/* 273 */           for (int k = 0; k < 9; k++) {
/* 274 */             this.i.q.a(this.t.a(45 + k).e(), 36 + k);
/*     */           }
/* 276 */         } else if (☃ != null) {
/* 277 */           bmb bmb1 = this.t.a(☃.d).e();
/* 278 */           this.i.q.a(bmb1, ☃.d - this.t.a.size() + 9 + 36);
/* 279 */           int k = 45 + j;
/* 280 */           if (bik1 == bik.c) {
/* 281 */             this.i.q.a(bmb, k - this.t.a.size() + 9 + 36);
/* 282 */           } else if (bik1 == bik.e && !bmb.a()) {
/* 283 */             bmb bmb2 = bmb.i();
/* 284 */             bmb2.e((j == 0) ? 1 : bmb2.c());
/* 285 */             this.i.s.a(bmb2, true);
/* 286 */             this.i.q.a(bmb2);
/*     */           } 
/* 288 */           this.i.s.bo.c();
/*     */         } 
/*     */       } 
/*     */     } else {
/*     */       
/* 293 */       bfv bfv = this.i.s.bm;
/* 294 */       if (!bfv.m().a() && this.M) {
/* 295 */         if (j == 0) {
/* 296 */           this.i.s.a(bfv.m(), true);
/* 297 */           this.i.q.a(bfv.m());
/* 298 */           bfv.g(bmb.b);
/*     */         } 
/* 300 */         if (j == 1) {
/* 301 */           bmb bmb = bfv.m().a(1);
/* 302 */           this.i.s.a(bmb, true);
/* 303 */           this.i.q.a(bmb);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean a(@Nullable bjr ☃) {
/* 310 */     return (☃ != null && ☃.c == C);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void i() {
/* 315 */     int ☃ = this.w;
/* 316 */     super.i();
/* 317 */     if (this.H != null && this.w != ☃) {
/* 318 */       this.H.p(this.w + 82);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/* 324 */     if (this.i.q.g()) {
/* 325 */       super.b();
/*     */       
/* 327 */       this.i.m.a(true);
/*     */       
/* 329 */       this.o.getClass(); this.H = new dlq(this.o, this.w + 82, this.x + 6, 80, 9, new of("itemGroup.search"));
/* 330 */       this.H.k(50);
/* 331 */       this.H.f(false);
/* 332 */       this.H.i(false);
/* 333 */       this.H.l(16777215);
/* 334 */       this.e.add(this.H);
/*     */       
/* 336 */       int ☃ = E;
/* 337 */       E = -1;
/* 338 */       a(bks.a[☃]);
/*     */       
/* 340 */       this.i.s.bo.b(this.K);
/* 341 */       this.K = new dqb(this.i);
/* 342 */       this.i.s.bo.a(this.K);
/*     */     } else {
/* 344 */       this.i.a(new dql(this.i.s));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(djz ☃, int i, int j) {
/* 350 */     String str = this.H.b();
/* 351 */     b(☃, i, j);
/* 352 */     this.H.a(str);
/*     */     
/* 354 */     if (!this.H.b().isEmpty()) {
/* 355 */       m();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 361 */     super.e();
/*     */     
/* 363 */     if (this.i.s != null && this.i.s.bm != null) {
/* 364 */       this.i.s.bo.b(this.K);
/*     */     }
/*     */     
/* 367 */     this.i.m.a(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(char ☃, int i) {
/* 372 */     if (this.L) {
/* 373 */       return false;
/*     */     }
/* 375 */     if (E != bks.g.a()) {
/* 376 */       return false;
/*     */     }
/* 378 */     String str = this.H.b();
/* 379 */     if (this.H.a(☃, i)) {
/* 380 */       if (!Objects.equals(str, this.H.b())) {
/* 381 */         m();
/*     */       }
/* 383 */       return true;
/*     */     } 
/* 385 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 390 */     this.L = false;
/* 391 */     if (E != bks.g.a()) {
/* 392 */       if (this.i.k.as.a(☃, i)) {
/* 393 */         this.L = true;
/* 394 */         a(bks.g);
/* 395 */         return true;
/*     */       } 
/* 397 */       return super.a(☃, i, j);
/*     */     } 
/*     */ 
/*     */     
/* 401 */     boolean bool1 = (!a(this.v) || this.v.f());
/* 402 */     boolean bool2 = deo.a(☃, i).e().isPresent();
/* 403 */     if (bool1 && bool2 && b(☃, i)) {
/*     */ 
/*     */       
/* 406 */       this.L = true;
/* 407 */       return true;
/*     */     } 
/*     */     
/* 410 */     String str = this.H.b();
/* 411 */     if (this.H.a(☃, i, j)) {
/* 412 */       if (!Objects.equals(str, this.H.b())) {
/* 413 */         m();
/*     */       }
/*     */       
/* 416 */       return true;
/*     */     } 
/* 418 */     if (this.H.j() && this.H.p() && ☃ != 256)
/*     */     {
/* 420 */       return true;
/*     */     }
/* 422 */     return super.a(☃, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, int i, int j) {
/* 427 */     this.L = false;
/* 428 */     return super.b(☃, i, j);
/*     */   }
/*     */   
/*     */   private void m() {
/* 432 */     this.t.c.clear();
/* 433 */     this.N.clear();
/*     */     
/* 435 */     String ☃ = this.H.b();
/* 436 */     if (☃.isEmpty()) {
/* 437 */       for (blx blx : gm.T) {
/* 438 */         blx.a(bks.g, this.t.c);
/*     */       }
/*     */     } else {
/*     */       enc<bmb> enc;
/* 442 */       if (☃.startsWith("#")) {
/* 443 */         ☃ = ☃.substring(1);
/* 444 */         enc = this.i.a(enb.b);
/* 445 */         b(☃);
/*     */       } else {
/* 447 */         enc = this.i.a(enb.a);
/*     */       } 
/* 449 */       this.t.c.addAll(enc.a(☃.toLowerCase(Locale.ROOT)));
/*     */     } 
/*     */     
/* 452 */     this.F = 0.0F;
/* 453 */     this.t.a(0.0F);
/*     */   }
/*     */   private void b(String ☃) {
/*     */     Predicate<vk> predicate;
/* 457 */     int i = ☃.indexOf(':');
/*     */ 
/*     */     
/* 460 */     if (i == -1) {
/* 461 */       predicate = (vk1 -> vk1.a().contains(☃));
/*     */     } else {
/* 463 */       String str1 = ☃.substring(0, i).trim();
/* 464 */       String str2 = ☃.substring(i + 1).trim();
/* 465 */       predicate = (vk1 -> (vk1.b().contains(☃) && vk1.a().contains(str1)));
/*     */     } 
/*     */     
/* 468 */     aem<blx> aem = aeg.a();
/* 469 */     aem.b().stream().filter(predicate).forEach(vk1 -> (ael)this.N.put(vk1, ☃.a(vk1)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(dfm ☃, int i, int j) {
/* 474 */     bks bks = bks.a[E];
/*     */     
/* 476 */     if (bks.g()) {
/* 477 */       RenderSystem.disableBlend();
/* 478 */       this.o.b(☃, bks.c(), 8.0F, 6.0F, 4210752);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/* 484 */     if (i == 0) {
/* 485 */       double d2 = ☃ - this.w;
/* 486 */       double d3 = d1 - this.x;
/*     */       
/* 488 */       for (bks bks : bks.a) {
/* 489 */         if (a(bks, d2, d3)) {
/* 490 */           return true;
/*     */         }
/*     */       } 
/*     */       
/* 494 */       if (E != bks.n.a() && a(☃, d1)) {
/* 495 */         this.G = n();
/* 496 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/* 500 */     return super.a(☃, d1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(double ☃, double d1, int i) {
/* 505 */     if (i == 0) {
/* 506 */       double d2 = ☃ - this.w;
/* 507 */       double d3 = d1 - this.x;
/*     */       
/* 509 */       this.G = false;
/*     */       
/* 511 */       for (bks bks : bks.a) {
/* 512 */         if (a(bks, d2, d3)) {
/* 513 */           a(bks);
/* 514 */           return true;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 519 */     return super.c(☃, d1, i);
/*     */   }
/*     */   
/*     */   private boolean n() {
/* 523 */     return (E != bks.n.a() && bks.a[E].i() && this.t.e());
/*     */   }
/*     */   
/*     */   private void a(bks ☃) {
/* 527 */     int i = E;
/* 528 */     E = ☃.a();
/*     */     
/* 530 */     this.y.clear();
/* 531 */     this.t.c.clear();
/* 532 */     if (☃ == bks.m) {
/* 533 */       djv djv = this.i.aq();
/* 534 */       for (int j = 0; j < 9; j++) {
/* 535 */         dzo dzo = djv.a(j);
/* 536 */         if (dzo.isEmpty()) {
/* 537 */           for (int k = 0; k < 9; k++) {
/* 538 */             if (k == j) {
/* 539 */               bmb bmb = new bmb(bmd.mb);
/* 540 */               bmb.a("CustomCreativeLock");
/*     */               
/* 542 */               nr nr1 = this.i.k.aC[j].j();
/* 543 */               nr nr2 = this.i.k.aD.j();
/* 544 */               bmb.a(new of("inventory.hotbarInfo", new Object[] { nr2, nr1 }));
/* 545 */               this.t.c.add(bmb);
/*     */             } else {
/* 547 */               this.t.c.add(bmb.b);
/*     */             } 
/*     */           } 
/*     */         } else {
/* 551 */           this.t.c.addAll((Collection<? extends bmb>)dzo);
/*     */         } 
/*     */       } 
/* 554 */     } else if (☃ != bks.g) {
/* 555 */       ☃.a(this.t.c);
/*     */     } 
/*     */     
/* 558 */     if (☃ == bks.n) {
/* 559 */       bic bic = this.i.s.bo;
/*     */       
/* 561 */       if (this.I == null) {
/* 562 */         this.I = (List<bjr>)ImmutableList.copyOf(this.t.a);
/*     */       }
/* 564 */       this.t.a.clear();
/* 565 */       for (int j = 0; j < bic.a.size(); j++) {
/*     */         int k, m;
/*     */         
/* 568 */         if (j >= 5 && j < 9) {
/* 569 */           int n = j - 5;
/* 570 */           int i1 = n / 2;
/* 571 */           int i2 = n % 2;
/*     */           
/* 573 */           k = 54 + i1 * 54;
/* 574 */           m = 6 + i2 * 27;
/* 575 */         } else if (j >= 0 && j < 5) {
/* 576 */           k = -2000;
/* 577 */           m = -2000;
/* 578 */         } else if (j == 45) {
/* 579 */           k = 35;
/* 580 */           m = 20;
/*     */         } else {
/* 582 */           int n = j - 9;
/* 583 */           int i1 = n % 9;
/* 584 */           int i2 = n / 9;
/*     */           
/* 586 */           k = 9 + i1 * 18;
/*     */           
/* 588 */           if (j >= 36) {
/* 589 */             m = 112;
/*     */           } else {
/* 591 */             m = 54 + i2 * 18;
/*     */           } 
/*     */         } 
/*     */         
/* 595 */         bjr bjr1 = new c(bic.a.get(j), j, k, m);
/* 596 */         this.t.a.add(bjr1);
/*     */       } 
/*     */       
/* 599 */       this.J = new bjr(C, 0, 173, 112);
/* 600 */       this.t.a.add(this.J);
/* 601 */     } else if (i == bks.n.a()) {
/* 602 */       this.t.a.clear();
/* 603 */       this.t.a.addAll(this.I);
/* 604 */       this.I = null;
/*     */     } 
/*     */     
/* 607 */     if (this.H != null) {
/* 608 */       if (☃ == bks.g) {
/* 609 */         this.H.i(true);
/* 610 */         this.H.h(false);
/* 611 */         this.H.e(true);
/* 612 */         if (i != ☃.a()) {
/* 613 */           this.H.a("");
/*     */         }
/* 615 */         m();
/*     */       } else {
/* 617 */         this.H.i(false);
/* 618 */         this.H.h(true);
/* 619 */         this.H.e(false);
/* 620 */         this.H.a("");
/*     */       } 
/*     */     }
/*     */     
/* 624 */     this.F = 0.0F;
/* 625 */     this.t.a(0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, double d2) {
/* 630 */     if (!n()) {
/* 631 */       return false;
/*     */     }
/* 633 */     int i = (this.t.c.size() + 9 - 1) / 9 - 5;
/* 634 */     this.F = (float)(this.F - d2 / i);
/* 635 */     this.F = afm.a(this.F, 0.0F, 1.0F);
/* 636 */     this.t.a(this.F);
/* 637 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(double ☃, double d1, int i, int j, int k) {
/* 642 */     boolean bool = (☃ < i || d1 < j || ☃ >= (i + this.b) || d1 >= (j + this.c));
/* 643 */     this.M = (bool && !a(bks.a[E], ☃, d1));
/* 644 */     return this.M;
/*     */   }
/*     */   
/*     */   protected boolean a(double ☃, double d1) {
/* 648 */     int i = this.w;
/* 649 */     int j = this.x;
/*     */     
/* 651 */     int k = i + 175;
/* 652 */     int m = j + 18;
/* 653 */     int n = k + 14;
/* 654 */     int i1 = m + 112;
/* 655 */     return (☃ >= k && d1 >= m && ☃ < n && d1 < i1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i, double d2, double d3) {
/* 661 */     if (this.G) {
/* 662 */       int j = this.x + 18;
/* 663 */       int k = j + 112;
/*     */       
/* 665 */       this.F = ((float)d1 - j - 7.5F) / ((k - j) - 15.0F);
/* 666 */       this.F = afm.a(this.F, 0.0F, 1.0F);
/* 667 */       this.t.a(this.F);
/*     */       
/* 669 */       return true;
/*     */     } 
/* 671 */     return super.a(☃, d1, i, d2, d3);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 676 */     a(☃);
/* 677 */     super.a(☃, i, j, f);
/*     */     
/* 679 */     for (bks bks : bks.a) {
/* 680 */       if (a(☃, bks, i, j)) {
/*     */         break;
/*     */       }
/*     */     } 
/*     */     
/* 685 */     if (this.J != null && E == bks.n.a() && a(this.J.e, this.J.f, 16, 16, i, j)) {
/* 686 */       b(☃, D, i, j);
/*     */     }
/*     */     
/* 689 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 690 */     a(☃, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dfm ☃, bmb bmb1, int i, int j) {
/* 695 */     if (E == bks.g.a()) {
/* 696 */       List<nr> list1 = bmb1.a(this.i.s, this.i.k.p ? bnl.a.b : bnl.a.a);
/* 697 */       List<nr> list2 = Lists.newArrayList(list1);
/*     */       
/* 699 */       blx blx = bmb1.b();
/* 700 */       bks bks = blx.q();
/*     */       
/* 702 */       if (bks == null && blx == bmd.pq) {
/* 703 */         Map<bps, Integer> map = bpu.a(bmb1);
/*     */         
/* 705 */         if (map.size() == 1) {
/* 706 */           bps bps = map.keySet().iterator().next();
/*     */           
/* 708 */           for (bks bks1 : bks.a) {
/* 709 */             if (bks1.a(bps.b)) {
/* 710 */               bks = bks1;
/*     */               
/*     */               break;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 717 */       this.N.forEach((vk1, ael1) -> {
/*     */             if (ael1.a(☃)) {
/*     */               list.add(1, (new oe("#" + vk1)).a(k.f));
/*     */             }
/*     */           });
/*     */       
/* 723 */       if (bks != null) {
/* 724 */         list2.add(1, bks.c().e().a(k.j));
/*     */       }
/*     */       
/* 727 */       b(☃, list2, i, j);
/*     */     } else {
/* 729 */       super.a(☃, bmb1, i, j);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dfm ☃, float f, int i, int j) {
/* 735 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 736 */     bks bks = bks.a[E];
/*     */     
/* 738 */     for (bks bks1 : bks.a) {
/* 739 */       this.i.M().a(B);
/* 740 */       if (bks1.a() != E) {
/* 741 */         a(☃, bks1);
/*     */       }
/*     */     } 
/*     */     
/* 745 */     this.i.M().a(new vk("textures/gui/container/creative_inventory/tab_" + bks.f()));
/* 746 */     b(☃, this.w, this.x, 0, 0, this.b, this.c);
/*     */     
/* 748 */     this.H.a(☃, i, j, f);
/* 749 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */     
/* 751 */     int k = this.w + 175;
/* 752 */     int m = this.x + 18;
/* 753 */     int n = m + 112;
/* 754 */     this.i.M().a(B);
/*     */     
/* 756 */     if (bks.i()) {
/* 757 */       b(☃, k, m + (int)((n - m - 17) * this.F), 232 + (n() ? 0 : 12), 0, 12, 15);
/*     */     }
/*     */     
/* 760 */     a(☃, bks);
/*     */     
/* 762 */     if (bks == bks.n) {
/* 763 */       dql.a(this.w + 88, this.x + 45, 20, (this.w + 88 - i), (this.x + 45 - 30 - j), this.i.s);
/*     */     }
/*     */   }
/*     */   
/*     */   protected boolean a(bks ☃, double d1, double d2) {
/* 768 */     int i = ☃.k();
/* 769 */     int j = 28 * i;
/* 770 */     int k = 0;
/*     */     
/* 772 */     if (☃.m()) {
/* 773 */       j = this.b - 28 * (6 - i) + 2;
/* 774 */     } else if (i > 0) {
/* 775 */       j += i;
/*     */     } 
/*     */     
/* 778 */     if (☃.l()) {
/* 779 */       k -= 32;
/*     */     } else {
/* 781 */       k += this.c;
/*     */     } 
/*     */     
/* 784 */     return (d1 >= j && d1 <= (j + 28) && d2 >= k && d2 <= (k + 32));
/*     */   }
/*     */   
/*     */   protected boolean a(dfm ☃, bks bks1, int i, int j) {
/* 788 */     int k = bks1.k();
/* 789 */     int m = 28 * k;
/* 790 */     int n = 0;
/*     */     
/* 792 */     if (bks1.m()) {
/* 793 */       m = this.b - 28 * (6 - k) + 2;
/* 794 */     } else if (k > 0) {
/* 795 */       m += k;
/*     */     } 
/*     */     
/* 798 */     if (bks1.l()) {
/* 799 */       n -= 32;
/*     */     } else {
/* 801 */       n += this.c;
/*     */     } 
/*     */     
/* 804 */     if (a(m + 3, n + 3, 23, 27, i, j)) {
/* 805 */       b(☃, bks1.c(), i, j);
/* 806 */       return true;
/*     */     } 
/*     */     
/* 809 */     return false;
/*     */   }
/*     */   
/*     */   protected void a(dfm ☃, bks bks1) {
/* 813 */     boolean bool1 = (bks1.a() == E);
/* 814 */     boolean bool2 = bks1.l();
/* 815 */     int i = bks1.k();
/* 816 */     int j = i * 28;
/* 817 */     int k = 0;
/* 818 */     int m = this.w + 28 * i;
/* 819 */     int n = this.x;
/* 820 */     int i1 = 32;
/*     */     
/* 822 */     if (bool1) {
/* 823 */       k += 32;
/*     */     }
/*     */     
/* 826 */     if (bks1.m()) {
/* 827 */       m = this.w + this.b - 28 * (6 - i);
/* 828 */     } else if (i > 0) {
/* 829 */       m += i;
/*     */     } 
/*     */     
/* 832 */     if (bool2) {
/* 833 */       n -= 28;
/*     */     } else {
/* 835 */       k += 64;
/* 836 */       n += this.c - 4;
/*     */     } 
/*     */     
/* 839 */     b(☃, m, n, j, k, 28, 32);
/*     */     
/* 841 */     this.j.b = 100.0F;
/* 842 */     m += 6;
/* 843 */     n += 8 + (bool2 ? 1 : -1);
/*     */     
/* 845 */     RenderSystem.enableRescaleNormal();
/* 846 */     bmb bmb = bks1.d();
/* 847 */     this.j.b(bmb, m, n);
/* 848 */     this.j.a(this.o, bmb, m, n);
/*     */     
/* 850 */     this.j.b = 0.0F;
/*     */   }
/*     */   
/*     */   public int k() {
/* 854 */     return E;
/*     */   }
/*     */   
/*     */   static class c
/*     */     extends bjr {
/*     */     private final bjr a;
/*     */     
/*     */     public c(bjr ☃, int i, int j, int k) {
/* 862 */       super(☃.c, i, j, k);
/* 863 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public bmb a(bfw ☃, bmb bmb1) {
/* 873 */       return this.a.a(☃, bmb1);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(bmb ☃) {
/* 878 */       return this.a.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public bmb e() {
/* 883 */       return this.a.e();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean f() {
/* 888 */       return this.a.f();
/*     */     }
/*     */ 
/*     */     
/*     */     public void d(bmb ☃) {
/* 893 */       this.a.d(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 898 */       this.a.d();
/*     */     }
/*     */ 
/*     */     
/*     */     public int a() {
/* 903 */       return this.a.a();
/*     */     }
/*     */ 
/*     */     
/*     */     public int b(bmb ☃) {
/* 908 */       return this.a.b(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public Pair<vk, vk> c() {
/* 914 */       return this.a.c();
/*     */     }
/*     */ 
/*     */     
/*     */     public bmb a(int ☃) {
/* 919 */       return this.a.a(☃);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 929 */       return this.a.b();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(bfw ☃) {
/* 934 */       return this.a.a(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   static class a extends bjr {
/*     */     public a(aon ☃, int i, int j, int k) {
/* 940 */       super(☃, i, j, k);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(bfw ☃) {
/* 945 */       if (super.a(☃) && f()) {
/* 946 */         return (e().b("CustomCreativeLock") == null);
/*     */       }
/* 948 */       return !f();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void a(djz ☃, int i, boolean bool1, boolean bool2) {
/* 953 */     dzm dzm = ☃.s;
/* 954 */     djv djv = ☃.aq();
/* 955 */     dzo dzo = djv.a(i);
/*     */     
/* 957 */     if (bool1) {
/* 958 */       for (int j = 0; j < bfv.g(); j++) {
/* 959 */         bmb bmb = ((bmb)dzo.get(j)).i();
/* 960 */         dzm.bm.a(j, bmb);
/* 961 */         ☃.q.a(bmb, 36 + j);
/*     */       } 
/* 963 */       dzm.bo.c();
/* 964 */     } else if (bool2) {
/* 965 */       for (int j = 0; j < bfv.g(); j++) {
/* 966 */         dzo.set(j, dzm.bm.a(j).i());
/*     */       }
/* 968 */       nr nr1 = ☃.k.aC[i].j();
/* 969 */       nr nr2 = ☃.k.aE.j();
/* 970 */       ☃.j.a(new of("inventory.hotbarSaved", new Object[] { nr2, nr1 }), false);
/*     */       
/* 972 */       djv.a();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dqc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */