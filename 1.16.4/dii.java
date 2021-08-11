/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class dii
/*     */   extends eoo
/*     */ {
/*  44 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*  46 */   private static final vk b = new vk("realms", "textures/gui/realms/link_icons.png");
/*  47 */   private static final vk c = new vk("realms", "textures/gui/realms/trailer_icons.png");
/*  48 */   private static final vk p = new vk("realms", "textures/gui/realms/slot_frame.png");
/*     */   
/*  50 */   private static final nr q = new of("mco.template.info.tooltip");
/*  51 */   private static final nr r = new of("mco.template.trailer.tooltip");
/*     */   
/*     */   private final dig s;
/*     */   
/*     */   private b t;
/*     */   
/*  57 */   private int u = -1;
/*     */   
/*     */   private nr v;
/*     */   
/*     */   private dlj w;
/*     */   
/*     */   private dlj x;
/*     */   
/*     */   private dlj y;
/*     */   
/*     */   @Nullable
/*     */   private nr z;
/*     */   
/*     */   private String A;
/*     */   
/*     */   private final dgq.c B;
/*     */   
/*     */   private int C;
/*     */   @Nullable
/*     */   private nr[] D;
/*     */   private String E;
/*     */   private boolean F;
/*     */   private boolean G;
/*     */   @Nullable
/*     */   private List<diu.a> H;
/*     */   
/*     */   public dii(dig ☃, dgq.c c1) {
/*  84 */     this(☃, c1, (dhf)null);
/*     */   }
/*     */   
/*     */   public dii(dig ☃, dgq.c c1, @Nullable dhf dhf1) {
/*  88 */     this.s = ☃;
/*  89 */     this.B = c1;
/*  90 */     if (dhf1 == null) {
/*     */       
/*  92 */       this.t = new b();
/*  93 */       a(new dhf(10));
/*     */     } else {
/*     */       
/*  96 */       this.t = new b(Lists.newArrayList(dhf1.a));
/*  97 */       a(dhf1);
/*     */     } 
/*  99 */     this.v = new of("mco.template.title");
/*     */   }
/*     */   
/*     */   public void a(nr ☃) {
/* 103 */     this.v = ☃;
/*     */   }
/*     */   
/*     */   public void a(nr... ☃) {
/* 107 */     this.D = ☃;
/* 108 */     this.F = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/* 113 */     if (this.G && this.E != null) {
/* 114 */       x.i().a("https://www.minecraft.net/realms/adventure-maps-in-1-9");
/* 115 */       return true;
/*     */     } 
/* 117 */     return super.a(☃, d1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/* 122 */     this.i.m.a(true);
/*     */     
/* 124 */     this.t = new b(this.t.g());
/*     */     
/* 126 */     this.x = a(new dlj(this.k / 2 - 206, this.l - 32, 100, 20, new of("mco.template.button.trailer"), ☃ -> t()));
/* 127 */     this.w = a(new dlj(this.k / 2 - 100, this.l - 32, 100, 20, new of("mco.template.button.select"), ☃ -> q()));
/* 128 */     nr ☃ = (this.B == dgq.c.b) ? nq.d : nq.h;
/* 129 */     dlj dlj1 = new dlj(this.k / 2 + 6, this.l - 32, 100, 20, ☃, ☃ -> p());
/* 130 */     a(dlj1);
/* 131 */     this.y = a(new dlj(this.k / 2 + 112, this.l - 32, 100, 20, new of("mco.template.button.publisher"), ☃ -> u()));
/*     */     
/* 133 */     this.w.o = false;
/* 134 */     this.x.p = false;
/* 135 */     this.y.p = false;
/*     */     
/* 137 */     d(this.t);
/* 138 */     c(this.t);
/*     */     
/* 140 */     Stream<nr> stream = Stream.of(this.v);
/* 141 */     if (this.D != null) {
/* 142 */       stream = Stream.concat(Stream.of(this.D), stream);
/*     */     }
/* 144 */     eoj.a((Iterable<String>)stream.filter(Objects::nonNull).map(nr::getString).collect(Collectors.toList()));
/*     */   }
/*     */   
/*     */   private void k() {
/* 148 */     this.y.p = m();
/* 149 */     this.x.p = o();
/* 150 */     this.w.o = l();
/*     */   }
/*     */   
/*     */   private boolean l() {
/* 154 */     return (this.u != -1);
/*     */   }
/*     */   
/*     */   private boolean m() {
/* 158 */     return (this.u != -1 && !(n()).e.isEmpty());
/*     */   }
/*     */   
/*     */   private dhe n() {
/* 162 */     return this.t.b(this.u);
/*     */   }
/*     */   
/*     */   private boolean o() {
/* 166 */     return (this.u != -1 && !(n()).g.isEmpty());
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/* 171 */     super.d();
/*     */     
/* 173 */     this.C--;
/* 174 */     if (this.C < 0) {
/* 175 */       this.C = 0;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 181 */     if (☃ == 256) {
/* 182 */       p();
/* 183 */       return true;
/*     */     } 
/* 185 */     return super.a(☃, i, j);
/*     */   }
/*     */   
/*     */   private void p() {
/* 189 */     this.s.a(null);
/* 190 */     this.i.a(this.s);
/*     */   }
/*     */   
/*     */   private void q() {
/* 194 */     if (r()) {
/* 195 */       this.s.a(n());
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean r() {
/* 200 */     return (this.u >= 0 && this.u < this.t.l());
/*     */   }
/*     */   
/*     */   private void t() {
/* 204 */     if (r()) {
/* 205 */       dhe ☃ = n();
/* 206 */       if (!"".equals(☃.g)) {
/* 207 */         x.i().a(☃.g);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void u() {
/* 213 */     if (r()) {
/* 214 */       dhe ☃ = n();
/* 215 */       if (!"".equals(☃.e)) {
/* 216 */         x.i().a(☃.e);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(dhf ☃) {
/* 222 */     (new Thread(this, "realms-template-fetcher", ☃)
/*     */       {
/*     */         public void run() {
/* 225 */           dhf ☃ = this.a;
/* 226 */           dgb dgb = dgb.a();
/* 227 */           while (☃ != null) {
/*     */             
/* 229 */             Either<dhf, String> either = dii.a(this.b, ☃, dgb);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 255 */             ☃ = dii.a(this.b).a(() -> { if (☃.right().isPresent()) { dii.a().error("Couldn't fetch templates: {}", ☃.right().get()); if (dii.b(this.b).f()) dii.a(this.b, diu.a(ekx.a("mco.template.select.failure", new Object[0]), new diu.b[0]));  return null; }  dhf dhf1 = ☃.left().get(); for (dhe dhe : dhf1.a) dii.b(this.b).a(dhe);  if (dhf1.a.isEmpty()) { if (dii.b(this.b).f()) { String str = ekx.a("mco.template.select.none", new Object[] { "%link" }); diu.b b = diu.b.a(ekx.a("mco.template.select.none.linkTitle", new Object[0]), "https://aka.ms/MinecraftRealmsContentCreator"); dii.a(this.b, diu.a(str, new diu.b[] { b })); }  return null; }  return dhf1; }).join();
/*     */           } 
/*     */         }
/* 258 */       }).start();
/*     */   }
/*     */   
/*     */   private Either<dhf, String> a(dhf ☃, dgb dgb1) {
/*     */     try {
/* 263 */       return Either.left(dgb1.a(☃.b + 1, ☃.c, this.B));
/* 264 */     } catch (dhi dhi) {
/* 265 */       return Either.right(dhi.getMessage());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 271 */     this.z = null;
/* 272 */     this.A = null;
/* 273 */     this.G = false;
/*     */     
/* 275 */     a(☃);
/*     */     
/* 277 */     this.t.a(☃, i, j, f);
/* 278 */     if (this.H != null) {
/* 279 */       a(☃, i, j, this.H);
/*     */     }
/*     */     
/* 282 */     a(☃, this.o, this.v, this.k / 2, 13, 16777215);
/*     */     
/* 284 */     if (this.F) {
/* 285 */       nr[] arrayOfNr = this.D;
/*     */       int k;
/* 287 */       for (k = 0; k < arrayOfNr.length; k++) {
/* 288 */         int m = this.o.a(arrayOfNr[k]);
/*     */         
/* 290 */         int n = this.k / 2 - m / 2;
/* 291 */         int i1 = j(-1 + k);
/*     */         
/* 293 */         this.o.getClass(); if (i >= n && i <= n + m && j >= i1 && j <= i1 + 9) {
/* 294 */           this.G = true;
/*     */         }
/*     */       } 
/*     */       
/* 298 */       for (k = 0; k < arrayOfNr.length; k++) {
/* 299 */         nr nr1 = arrayOfNr[k];
/* 300 */         int m = 10526880;
/*     */         
/* 302 */         if (this.E != null) {
/* 303 */           if (this.G) {
/* 304 */             m = 7107012;
/* 305 */             nr1 = nr1.e().a(k.s);
/*     */           } else {
/* 307 */             m = 3368635;
/*     */           } 
/*     */         }
/*     */         
/* 311 */         a(☃, this.o, nr1, this.k / 2, j(-1 + k), m);
/*     */       } 
/*     */     } 
/*     */     
/* 315 */     super.a(☃, i, j, f);
/*     */     
/* 317 */     a(☃, this.z, i, j);
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, int i, int j, List<diu.a> list) {
/* 321 */     for (int k = 0; k < list.size(); k++) {
/* 322 */       diu.a a = list.get(k);
/* 323 */       int m = j(4 + k);
/* 324 */       int n = a.a.stream().mapToInt(☃ -> this.o.b(☃.a())).sum();
/* 325 */       int i1 = this.k / 2 - n / 2;
/* 326 */       for (diu.b b1 : a.a) {
/* 327 */         int i2 = b1.b() ? 3368635 : 16777215;
/* 328 */         int i3 = this.o.a(☃, b1.a(), i1, m, i2);
/* 329 */         if (b1.b() && i > i1 && i < i3 && j > m - 3 && j < m + 8) {
/* 330 */           this.z = new oe(b1.c());
/* 331 */           this.A = b1.c();
/*     */         } 
/* 333 */         i1 = i3;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   class b extends eon<a> {
/*     */     public b() {
/* 340 */       this(Collections.emptyList());
/*     */     }
/*     */     
/*     */     public b(Iterable<dhe> ☃) {
/* 344 */       super(dii.this.k, dii.this.l, dii.c(dii.this) ? dii.a(1) : 32, dii.this.l - 40, 46);
/* 345 */       ☃.forEach(this::a);
/*     */     }
/*     */     
/*     */     public void a(dhe ☃) {
/* 349 */       a(new dii.a(this.a, ☃));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(double ☃, double d1, int i) {
/* 354 */       if (i == 0 && d1 >= this.i && d1 <= this.j) {
/* 355 */         int j = this.d / 2 - 150;
/*     */         
/* 357 */         if (dii.d(this.a) != null) {
/* 358 */           x.i().a(dii.d(this.a));
/*     */         }
/*     */         
/* 361 */         int k = (int)Math.floor(d1 - this.i) - this.n + (int)m() - 4;
/* 362 */         int m = k / this.c;
/*     */         
/* 364 */         if (☃ >= j && ☃ < e() && m >= 0 && k >= 0 && m < l()) {
/* 365 */           a(m);
/* 366 */           a(k, m, ☃, d1, this.d);
/*     */           
/* 368 */           if (m >= dii.b(this.a).l()) {
/* 369 */             return super.a(☃, d1, i);
/*     */           }
/*     */           
/* 372 */           dii.a(this.a, dii.e(this.a) + 7);
/*     */           
/* 374 */           if (dii.e(this.a) >= 10) {
/* 375 */             dii.f(this.a);
/*     */           }
/* 377 */           return true;
/*     */         } 
/*     */       } 
/* 380 */       return super.a(☃, d1, i);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(int ☃) {
/* 385 */       j(☃);
/* 386 */       if (☃ != -1) {
/* 387 */         dhe dhe = dii.b(this.a).b(☃);
/* 388 */         String str1 = ekx.a("narrator.select.list.position", new Object[] { Integer.valueOf(☃ + 1), Integer.valueOf(dii.b(this.a).l()) });
/* 389 */         String str2 = ekx.a("mco.template.select.narrate.version", new Object[] { dhe.c });
/* 390 */         String str3 = ekx.a("mco.template.select.narrate.authors", new Object[] { dhe.d });
/* 391 */         String str4 = eoj.b(Arrays.asList(new String[] { dhe.b, str3, dhe.h, str2, str1 }));
/* 392 */         eoj.a(ekx.a("narrator.select", new Object[] { str4 }));
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(@Nullable dii.a ☃) {
/* 398 */       super.a(☃);
/* 399 */       dii.b(this.a, au_().indexOf(☃));
/* 400 */       dii.g(this.a);
/*     */     }
/*     */ 
/*     */     
/*     */     public int c() {
/* 405 */       return l() * 46;
/*     */     }
/*     */ 
/*     */     
/*     */     public int d() {
/* 410 */       return 300;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃) {
/* 415 */       this.a.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 420 */       return (this.a.aw_() == this);
/*     */     }
/*     */     
/*     */     public boolean f() {
/* 424 */       return (l() == 0);
/*     */     }
/*     */     
/*     */     public dhe b(int ☃) {
/* 428 */       return dii.a.a(au_().get(☃));
/*     */     }
/*     */     
/*     */     public List<dhe> g() {
/* 432 */       return (List<dhe>)au_().stream().map(☃ -> dii.a.a(☃)).collect(Collectors.toList());
/*     */     }
/*     */   }
/*     */   
/*     */   class a extends dlv.a<a> {
/*     */     private final dhe b;
/*     */     
/*     */     public a(dii this$0, dhe ☃) {
/* 440 */       this.b = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 445 */       a(☃, this.b, k, j, i1, i2);
/*     */     }
/*     */     
/*     */     private void a(dfm ☃, dhe dhe1, int i, int j, int k, int m) {
/* 449 */       int n = i + 45 + 20;
/* 450 */       dii.h(this.a).b(☃, dhe1.b, n, (j + 2), 16777215);
/* 451 */       dii.i(this.a).b(☃, dhe1.d, n, (j + 15), 7105644);
/* 452 */       dii.k(this.a).b(☃, dhe1.c, (n + 227 - dii.j(this.a).b(dhe1.c)), (j + 1), 7105644);
/*     */       
/* 454 */       if (!"".equals(dhe1.e) || !"".equals(dhe1.g) || !"".equals(dhe1.h)) {
/* 455 */         a(☃, n - 1, j + 25, k, m, dhe1.e, dhe1.g, dhe1.h);
/*     */       }
/*     */       
/* 458 */       a(☃, i, j + 1, k, m, dhe1);
/*     */     }
/*     */     
/*     */     private void a(dfm ☃, int i, int j, int k, int m, dhe dhe1) {
/* 462 */       dir.a(dhe1.a, dhe1.f);
/* 463 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 464 */       dkw.a(☃, i + 1, j + 1, 0.0F, 0.0F, 38, 38, 38, 38);
/*     */       
/* 466 */       dii.l(this.a).M().a(dii.c());
/* 467 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 468 */       dkw.a(☃, i, j, 0.0F, 0.0F, 40, 40, 40, 40);
/*     */     }
/*     */     
/*     */     private void a(dfm ☃, int i, int j, int k, int m, String str1, String str2, String str3) {
/* 472 */       if (!"".equals(str3)) {
/* 473 */         dii.m(this.a).b(☃, str3, i, (j + 4), 5000268);
/*     */       }
/*     */       
/* 476 */       int n = "".equals(str3) ? 0 : (dii.n(this.a).b(str3) + 2);
/*     */       
/* 478 */       boolean bool1 = false;
/* 479 */       boolean bool2 = false;
/*     */       
/* 481 */       boolean bool3 = "".equals(str1);
/*     */       
/* 483 */       if (k >= i + n && k <= i + n + 32 && m >= j && m <= j + 15 && m < this.a.l - 15 && m > 32) {
/* 484 */         if (k <= i + 15 + n && k > n) {
/* 485 */           if (bool3) {
/* 486 */             bool2 = true;
/*     */           } else {
/* 488 */             bool1 = true;
/*     */           } 
/* 490 */         } else if (!bool3) {
/* 491 */           bool2 = true;
/*     */         } 
/*     */       }
/*     */       
/* 495 */       if (!bool3) {
/* 496 */         dii.o(this.a).M().a(dii.f());
/* 497 */         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 498 */         RenderSystem.pushMatrix();
/* 499 */         RenderSystem.scalef(1.0F, 1.0F, 1.0F);
/* 500 */         float f = bool1 ? 15.0F : 0.0F;
/* 501 */         dkw.a(☃, i + n, j, f, 0.0F, 15, 15, 30, 15);
/* 502 */         RenderSystem.popMatrix();
/*     */       } 
/*     */       
/* 505 */       if (!"".equals(str2)) {
/* 506 */         dii.p(this.a).M().a(dii.g());
/* 507 */         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 508 */         RenderSystem.pushMatrix();
/* 509 */         RenderSystem.scalef(1.0F, 1.0F, 1.0F);
/* 510 */         int i1 = i + n + (bool3 ? 0 : 17);
/* 511 */         float f = bool2 ? 15.0F : 0.0F;
/* 512 */         dkw.a(☃, i1, j, f, 0.0F, 15, 15, 30, 15);
/* 513 */         RenderSystem.popMatrix();
/*     */       } 
/*     */       
/* 516 */       if (bool1) {
/* 517 */         dii.a(this.a, dii.h());
/* 518 */         dii.a(this.a, str1);
/* 519 */       } else if (bool2 && !"".equals(str2)) {
/* 520 */         dii.a(this.a, dii.i());
/* 521 */         dii.a(this.a, str2);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(dfm ☃, @Nullable nr nr1, int i, int j) {
/* 527 */     if (nr1 == null) {
/*     */       return;
/*     */     }
/*     */     
/* 531 */     int k = i + 12;
/* 532 */     int m = j - 12;
/* 533 */     int n = this.o.a(nr1);
/* 534 */     a(☃, k - 3, m - 3, k + n + 3, m + 8 + 3, -1073741824, -1073741824);
/* 535 */     this.o.a(☃, nr1, k, m, 16777215);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dii.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */