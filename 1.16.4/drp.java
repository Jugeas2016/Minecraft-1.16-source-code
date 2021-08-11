/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
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
/*     */ public class drp
/*     */   extends dkw
/*     */   implements dmf, dmi, dru, uz<bon>
/*     */ {
/*  41 */   protected static final vk a = new vk("textures/gui/recipe_book.png");
/*  42 */   private static final nr i = (new of("gui.recipebook.search_hint")).a(k.u).a(k.h);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  47 */   private static final nr j = new of("gui.recipebook.toggleRecipes.craftable");
/*  48 */   private static final nr k = new of("gui.recipebook.toggleRecipes.all");
/*     */   
/*     */   private int l;
/*     */   
/*     */   private int m;
/*     */   private int n;
/*  54 */   protected final drn b = new drn();
/*  55 */   private final List<drr> o = Lists.newArrayList();
/*     */   
/*     */   private drr p;
/*     */   
/*     */   protected dma c;
/*     */   protected bjj<?> d;
/*     */   protected djz e;
/*     */   private dlq q;
/*  63 */   private String r = "";
/*     */   
/*     */   private djm s;
/*  66 */   private final drq t = new drq();
/*     */   
/*  68 */   private final bfy u = new bfy();
/*     */   
/*     */   private int v;
/*     */   private boolean w;
/*     */   
/*     */   public void a(int ☃, int i, djz djz1, boolean bool, bjj<?> bjj1) {
/*  74 */     this.e = djz1;
/*  75 */     this.m = ☃;
/*  76 */     this.n = i;
/*  77 */     this.d = bjj1;
/*  78 */     djz1.s.bp = bjj1;
/*  79 */     this.s = djz1.s.F();
/*     */     
/*  81 */     this.v = djz1.s.bm.l();
/*     */     
/*  83 */     if (f()) {
/*  84 */       a(bool);
/*     */     }
/*     */     
/*  87 */     djz1.m.a(true);
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/*  91 */     this.l = ☃ ? 0 : 86;
/*  92 */     int i = (this.m - 147) / 2 - this.l;
/*  93 */     int j = (this.n - 166) / 2;
/*     */     
/*  95 */     this.u.a();
/*  96 */     this.e.s.bm.a(this.u);
/*  97 */     this.d.a(this.u);
/*     */     
/*  99 */     String str = (this.q != null) ? this.q.b() : "";
/* 100 */     this.e.g.getClass(); this.q = new dlq(this.e.g, i + 25, j + 14, 80, 9 + 5, new of("itemGroup.search"));
/* 101 */     this.q.k(50);
/* 102 */     this.q.f(false);
/* 103 */     this.q.i(true);
/* 104 */     this.q.l(16777215);
/* 105 */     this.q.a(str);
/*     */     
/* 107 */     this.t.a(this.e, i, j);
/* 108 */     this.t.a(this);
/*     */     
/* 110 */     this.c = new dma(i + 110, j + 12, 26, 16, this.s.a(this.d));
/* 111 */     a();
/*     */     
/* 113 */     this.o.clear();
/*     */     
/* 115 */     for (dkg dkg : dkg.a(this.d.m())) {
/* 116 */       this.o.add(new drr(dkg));
/*     */     }
/*     */     
/* 119 */     if (this.p != null) {
/* 120 */       this.p = this.o.stream().filter(☃ -> ☃.b().equals(this.p.b())).findFirst().orElse(null);
/*     */     }
/* 122 */     if (this.p == null) {
/* 123 */       this.p = this.o.get(0);
/*     */     }
/* 125 */     this.p.e(true);
/*     */     
/* 127 */     d(false);
/* 128 */     b();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c_(boolean ☃) {
/* 133 */     return false;
/*     */   }
/*     */   
/*     */   protected void a() {
/* 137 */     this.c.a(152, 41, 28, 18, a);
/*     */   }
/*     */   
/*     */   public void d() {
/* 141 */     this.q = null;
/* 142 */     this.p = null;
/* 143 */     this.e.m.a(false);
/*     */   }
/*     */   
/*     */   public int a(boolean ☃, int i, int j) {
/*     */     int k;
/* 148 */     if (f() && !☃) {
/* 149 */       k = 177 + (i - j - 200) / 2;
/*     */     } else {
/* 151 */       k = (i - j) / 2;
/*     */     } 
/*     */     
/* 154 */     return k;
/*     */   }
/*     */   
/*     */   public void e() {
/* 158 */     c(!f());
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 162 */     return this.s.a(this.d.m());
/*     */   }
/*     */   
/*     */   protected void c(boolean ☃) {
/* 166 */     this.s.a(this.d.m(), ☃);
/* 167 */     if (!☃) {
/* 168 */       this.t.c();
/*     */     }
/* 170 */     i();
/*     */   }
/*     */   
/*     */   public void a(@Nullable bjr ☃) {
/* 174 */     if (☃ != null && ☃.d < this.d.i()) {
/* 175 */       this.b.a();
/*     */       
/* 177 */       if (f()) {
/* 178 */         j();
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void d(boolean ☃) {
/* 184 */     List<drt> list1 = this.s.a(this.p.b());
/*     */ 
/*     */     
/* 187 */     list1.forEach(☃ -> ☃.a(this.u, this.d.g(), this.d.h(), this.s));
/*     */     
/* 189 */     List<drt> list2 = Lists.newArrayList(list1);
/*     */ 
/*     */     
/* 192 */     list2.removeIf(☃ -> !☃.a());
/*     */ 
/*     */     
/* 195 */     list2.removeIf(☃ -> !☃.c());
/*     */ 
/*     */     
/* 198 */     String str = this.q.b();
/* 199 */     if (!str.isEmpty()) {
/* 200 */       ObjectLinkedOpenHashSet objectLinkedOpenHashSet = new ObjectLinkedOpenHashSet(this.e.<drt>a(enb.c).a(str.toLowerCase(Locale.ROOT)));
/*     */       
/* 202 */       list2.removeIf(drt1 -> !☃.contains(drt1));
/*     */     } 
/*     */ 
/*     */     
/* 206 */     if (this.s.a(this.d)) {
/* 207 */       list2.removeIf(☃ -> !☃.b());
/*     */     }
/*     */     
/* 210 */     this.t.a(list2, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   private void b() {
/* 215 */     int ☃ = (this.m - 147) / 2 - this.l - 30;
/* 216 */     int i = (this.n - 166) / 2 + 3;
/* 217 */     int j = 27;
/*     */     
/* 219 */     int k = 0;
/* 220 */     for (drr drr1 : this.o) {
/* 221 */       dkg dkg = drr1.b();
/* 222 */       if (dkg == dkg.a || dkg == dkg.f) {
/* 223 */         drr1.p = true;
/* 224 */         drr1.a(☃, i + 27 * k++);
/*     */         
/*     */         continue;
/*     */       } 
/* 228 */       if (drr1.a(this.s)) {
/* 229 */         drr1.a(☃, i + 27 * k++);
/* 230 */         drr1.a(this.e);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void g() {
/* 236 */     if (!f()) {
/*     */       return;
/*     */     }
/*     */     
/* 240 */     if (this.v != this.e.s.bm.l()) {
/* 241 */       j();
/* 242 */       this.v = this.e.s.bm.l();
/*     */     } 
/* 244 */     this.q.a();
/*     */   }
/*     */   
/*     */   private void j() {
/* 248 */     this.u.a();
/* 249 */     this.e.s.bm.a(this.u);
/* 250 */     this.d.a(this.u);
/*     */     
/* 252 */     d(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 257 */     if (!f()) {
/*     */       return;
/*     */     }
/*     */     
/* 261 */     RenderSystem.pushMatrix();
/* 262 */     RenderSystem.translatef(0.0F, 0.0F, 100.0F);
/*     */     
/* 264 */     this.e.M().a(a);
/* 265 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 266 */     int k = (this.m - 147) / 2 - this.l;
/* 267 */     int m = (this.n - 166) / 2;
/* 268 */     b(☃, k, m, 1, 1, 147, 166);
/*     */     
/* 270 */     if (!this.q.j() && this.q.b().isEmpty()) {
/* 271 */       b(☃, this.e.g, i, k + 25, m + 14, -1);
/*     */     } else {
/* 273 */       this.q.a(☃, i, j, f);
/*     */     } 
/*     */     
/* 276 */     for (drr drr1 : this.o) {
/* 277 */       drr1.a(☃, i, j, f);
/*     */     }
/*     */     
/* 280 */     this.c.a(☃, i, j, f);
/*     */     
/* 282 */     this.t.a(☃, k, m, i, j, f);
/* 283 */     RenderSystem.popMatrix();
/*     */   }
/*     */   
/*     */   public void c(dfm ☃, int i, int j, int k, int m) {
/* 287 */     if (!f()) {
/*     */       return;
/*     */     }
/*     */     
/* 291 */     this.t.a(☃, k, m);
/*     */     
/* 293 */     if (this.c.g()) {
/* 294 */       nr nr1 = k();
/*     */       
/* 296 */       if (this.e.y != null) {
/* 297 */         this.e.y.b(☃, nr1, k, m);
/*     */       }
/*     */     } 
/*     */     
/* 301 */     d(☃, i, j, k, m);
/*     */   }
/*     */   
/*     */   private nr k() {
/* 305 */     return this.c.a() ? c() : k;
/*     */   }
/*     */   
/*     */   protected nr c() {
/* 309 */     return j;
/*     */   }
/*     */   
/*     */   private void d(dfm ☃, int i, int j, int k, int m) {
/* 313 */     bmb bmb = null;
/*     */     
/* 315 */     for (int n = 0; n < this.b.b(); n++) {
/* 316 */       drn.a a = this.b.a(n);
/*     */       
/* 318 */       int i1 = a.a() + i;
/* 319 */       int i2 = a.b() + j;
/*     */       
/* 321 */       if (k >= i1 && m >= i2 && k < i1 + 16 && m < i2 + 16) {
/* 322 */         bmb = a.c();
/*     */       }
/*     */     } 
/*     */     
/* 326 */     if (bmb != null && this.e.y != null) {
/* 327 */       this.e.y.b(☃, this.e.y.a(bmb), k, m);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(dfm ☃, int i, int j, boolean bool, float f) {
/* 332 */     this.b.a(☃, this.e, i, j, bool, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/* 337 */     if (!f() || this.e.s.a_()) {
/* 338 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 342 */     if (this.t.a(☃, d1, i, (this.m - 147) / 2 - this.l, (this.n - 166) / 2, 147, 166)) {
/* 343 */       boq<?> boq = this.t.a();
/* 344 */       drt drt = this.t.b();
/*     */       
/* 346 */       if (boq != null && drt != null) {
/* 347 */         if (!drt.a(boq) && this.b.c() == boq) {
/* 348 */           return false;
/*     */         }
/*     */         
/* 351 */         this.b.a();
/*     */         
/* 353 */         this.e.q.a(this.e.s.bp.b, boq, dot.y());
/*     */         
/* 355 */         if (!n()) {
/* 356 */           c(false);
/*     */         }
/*     */       } 
/*     */       
/* 360 */       return true;
/*     */     } 
/*     */     
/* 363 */     if (this.q.a(☃, d1, i)) {
/* 364 */       return true;
/*     */     }
/*     */     
/* 367 */     if (this.c.a(☃, d1, i)) {
/* 368 */       boolean bool = l();
/* 369 */       this.c.e(bool);
/*     */       
/* 371 */       i();
/*     */       
/* 373 */       d(false);
/*     */       
/* 375 */       return true;
/*     */     } 
/*     */     
/* 378 */     for (drr drr1 : this.o) {
/* 379 */       if (drr1.a(☃, d1, i)) {
/* 380 */         if (this.p != drr1) {
/* 381 */           this.p.e(false);
/* 382 */           this.p = drr1;
/* 383 */           this.p.e(true);
/*     */           
/* 385 */           d(true);
/*     */         } 
/*     */         
/* 388 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/* 392 */     return false;
/*     */   }
/*     */   
/*     */   private boolean l() {
/* 396 */     bjk ☃ = this.d.m();
/* 397 */     boolean bool = !this.s.b(☃);
/* 398 */     this.s.b(☃, bool);
/* 399 */     return bool;
/*     */   }
/*     */   
/*     */   public boolean a(double ☃, double d1, int i, int j, int k, int m, int n) {
/* 403 */     if (!f()) {
/* 404 */       return true;
/*     */     }
/*     */     
/* 407 */     boolean bool1 = (☃ < i || d1 < j || ☃ >= (i + k) || d1 >= (j + m));
/* 408 */     boolean bool2 = ((i - 147) < ☃ && ☃ < i && j < d1 && d1 < (j + m));
/*     */     
/* 410 */     return (bool1 && !bool2 && !this.p.g());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 415 */     this.w = false;
/* 416 */     if (!f() || this.e.s.a_()) {
/* 417 */       return false;
/*     */     }
/*     */     
/* 420 */     if (☃ == 256 && !n()) {
/* 421 */       c(false);
/* 422 */       return true;
/*     */     } 
/*     */     
/* 425 */     if (this.q.a(☃, i, j)) {
/* 426 */       m();
/* 427 */       return true;
/*     */     } 
/* 429 */     if (this.q.j() && this.q.p() && ☃ != 256)
/*     */     {
/* 431 */       return true;
/*     */     }
/*     */     
/* 434 */     if (this.e.k.as.a(☃, i) && !this.q.j()) {
/* 435 */       this.w = true;
/* 436 */       this.q.e(true);
/*     */       
/* 438 */       return true;
/*     */     } 
/*     */     
/* 441 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, int i, int j) {
/* 446 */     this.w = false;
/* 447 */     return super.b(☃, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(char ☃, int i) {
/* 452 */     if (this.w) {
/* 453 */       return false;
/*     */     }
/* 455 */     if (!f() || this.e.s.a_()) {
/* 456 */       return false;
/*     */     }
/*     */     
/* 459 */     if (this.q.a(☃, i)) {
/* 460 */       m();
/* 461 */       return true;
/*     */     } 
/*     */     
/* 464 */     return super.a(☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(double ☃, double d1) {
/* 469 */     return false;
/*     */   }
/*     */   
/*     */   private void m() {
/* 473 */     String ☃ = this.q.b().toLowerCase(Locale.ROOT);
/* 474 */     a(☃);
/*     */     
/* 476 */     if (!☃.equals(this.r)) {
/* 477 */       d(false);
/* 478 */       this.r = ☃;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(String ☃) {
/* 483 */     if ("excitedze".equals(☃)) {
/* 484 */       ekz ekz = this.e.R();
/* 485 */       eky eky = ekz.a("en_pt");
/* 486 */       if (ekz.b().a(eky) == 0) {
/*     */         return;
/*     */       }
/* 489 */       ekz.a(eky);
/* 490 */       this.e.k.aV = eky.getCode();
/* 491 */       this.e.j();
/* 492 */       this.e.k.b();
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean n() {
/* 497 */     return (this.l == 86);
/*     */   }
/*     */   
/*     */   public void h() {
/* 501 */     b();
/*     */     
/* 503 */     if (f())
/*     */     {
/* 505 */       d(false);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(List<boq<?>> ☃) {
/* 511 */     for (boq<?> boq : ☃) {
/* 512 */       this.e.s.a(boq);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(boq<?> ☃, List<bjr> list) {
/* 517 */     bmb bmb = ☃.c();
/* 518 */     this.b.a(☃);
/* 519 */     this.b.a(bon.a(new bmb[] { bmb }, ), ((bjr)list.get(0)).e, ((bjr)list.get(0)).f);
/*     */     
/* 521 */     a(this.d.g(), this.d.h(), this.d.f(), ☃, ☃.a().iterator(), 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(Iterator<bon> ☃, int i, int j, int k, int m) {
/* 526 */     bon bon = ☃.next();
/* 527 */     if (!bon.d()) {
/* 528 */       bjr bjr = this.d.a.get(i);
/* 529 */       this.b.a(bon, bjr.e, bjr.f);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void i() {
/* 534 */     if (this.e.w() != null) {
/* 535 */       bjk ☃ = this.d.m();
/* 536 */       boolean bool1 = this.s.a().a(☃);
/* 537 */       boolean bool2 = this.s.a().b(☃);
/* 538 */       this.e.w().a(new tc(☃, bool1, bool2));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\drp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */