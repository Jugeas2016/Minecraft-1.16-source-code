/*      */ import com.google.common.collect.Iterables;
/*      */ import com.google.common.collect.Lists;
/*      */ import com.google.common.collect.Maps;
/*      */ import com.google.common.collect.Ordering;
/*      */ import com.mojang.blaze3d.systems.RenderSystem;
/*      */ import com.mojang.datafixers.util.Pair;
/*      */ import java.util.Collection;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Random;
/*      */ import java.util.UUID;
/*      */ import java.util.stream.Collectors;
/*      */ import javax.annotation.Nullable;
/*      */ import org.apache.commons.lang3.StringUtils;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class dkv
/*      */   extends dkw
/*      */ {
/*   85 */   private static final vk b = new vk("textures/misc/vignette.png");
/*   86 */   private static final vk c = new vk("textures/gui/widgets.png");
/*   87 */   private static final vk d = new vk("textures/misc/pumpkinblur.png");
/*      */   
/*   89 */   private static final nr e = new of("demo.demoExpired");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*   99 */   private final Random i = new Random();
/*      */   
/*      */   private final djz j;
/*      */   private final efo k;
/*      */   private final dlk l;
/*      */   private int m;
/*      */   @Nullable
/*      */   private nr n;
/*      */   private int o;
/*      */   private boolean p;
/*  109 */   public float a = 1.0F;
/*      */   
/*      */   private int q;
/*  112 */   private bmb r = bmb.b;
/*      */   
/*      */   private final dlp s;
/*      */   
/*      */   private final dmb t;
/*      */   
/*      */   private final dml u;
/*      */   private final dly v;
/*      */   private final dli w;
/*      */   private int x;
/*      */   @Nullable
/*      */   private nr y;
/*      */   @Nullable
/*      */   private nr z;
/*      */   private int A;
/*      */   private int B;
/*      */   private int C;
/*      */   private int D;
/*      */   private int E;
/*      */   private long F;
/*      */   private long G;
/*      */   private int H;
/*      */   private int I;
/*  135 */   private final Map<no, List<dky>> J = Maps.newHashMap();
/*      */   
/*      */   public dkv(djz ☃) {
/*  138 */     this.j = ☃;
/*  139 */     this.k = ☃.ad();
/*  140 */     this.s = new dlp(☃);
/*  141 */     this.u = new dml(☃);
/*  142 */     this.l = new dlk(☃);
/*  143 */     this.v = new dly(☃, this);
/*  144 */     this.w = new dli(☃);
/*  145 */     this.t = new dmb(☃);
/*      */     
/*  147 */     for (no no : no.values()) {
/*  148 */       this.J.put(no, Lists.newArrayList());
/*      */     }
/*      */     
/*  151 */     dky dky = dkz.b;
/*  152 */     ((List<dlb>)this.J.get(no.a)).add(new dlb(☃));
/*  153 */     ((List<dky>)this.J.get(no.a)).add(dky);
/*  154 */     ((List<dlb>)this.J.get(no.b)).add(new dlb(☃));
/*  155 */     ((List<dky>)this.J.get(no.b)).add(dky);
/*  156 */     ((List<dla>)this.J.get(no.c)).add(new dla(☃));
/*      */     
/*  158 */     a();
/*      */   }
/*      */   
/*      */   public void a() {
/*  162 */     this.A = 10;
/*  163 */     this.B = 70;
/*  164 */     this.C = 20;
/*      */   }
/*      */   
/*      */   public void a(dfm ☃, float f) {
/*  168 */     this.H = this.j.aD().o();
/*  169 */     this.I = this.j.aD().p();
/*  170 */     dku dku = e();
/*      */     
/*  172 */     RenderSystem.enableBlend();
/*      */     
/*  174 */     if (djz.z()) {
/*  175 */       b(this.j.aa());
/*      */     } else {
/*  177 */       RenderSystem.enableDepthTest();
/*  178 */       RenderSystem.defaultBlendFunc();
/*      */     } 
/*      */ 
/*      */     
/*  182 */     bmb bmb1 = this.j.s.bm.e(3);
/*  183 */     if (this.j.k.g().a() && bmb1.b() == bup.cU.h()) {
/*  184 */       m();
/*      */     }
/*      */     
/*  187 */     float f1 = afm.g(f, this.j.s.bQ, this.j.s.bP);
/*  188 */     if (f1 > 0.0F && !this.j.s.a(apw.i)) {
/*  189 */       a(f1);
/*      */     }
/*      */     
/*  192 */     if (this.j.q.l() == bru.e) {
/*  193 */       this.u.a(☃, f);
/*  194 */     } else if (!this.j.k.aI) {
/*  195 */       a(f, ☃);
/*      */     } 
/*      */     
/*  198 */     if (!this.j.k.aI) {
/*  199 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  200 */       this.j.M().a(h);
/*  201 */       RenderSystem.enableBlend();
/*  202 */       RenderSystem.enableAlphaTest();
/*      */       
/*  204 */       d(☃);
/*      */       
/*  206 */       RenderSystem.defaultBlendFunc();
/*  207 */       this.j.au().a("bossHealth");
/*  208 */       this.w.a(☃);
/*  209 */       this.j.au().c();
/*      */       
/*  211 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  212 */       this.j.M().a(h);
/*      */       
/*  214 */       if (this.j.q.a()) {
/*  215 */         e(☃);
/*      */       }
/*      */       
/*  218 */       f(☃);
/*      */       
/*  220 */       RenderSystem.disableBlend();
/*      */       
/*  222 */       int i = this.H / 2 - 91;
/*      */       
/*  224 */       if (this.j.s.H()) {
/*  225 */         a(☃, i);
/*  226 */       } else if (this.j.q.e()) {
/*      */         
/*  228 */         b(☃, i);
/*      */       } 
/*      */       
/*  231 */       if (this.j.k.u && this.j.q.l() != bru.e) {
/*  232 */         b(☃);
/*  233 */       } else if (this.j.s.a_()) {
/*  234 */         this.u.a(☃);
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  239 */     if (this.j.s.eC() > 0) {
/*  240 */       this.j.au().a("sleep");
/*  241 */       RenderSystem.disableDepthTest();
/*  242 */       RenderSystem.disableAlphaTest();
/*      */       
/*  244 */       float f2 = this.j.s.eC();
/*  245 */       float f3 = f2 / 100.0F;
/*  246 */       if (f3 > 1.0F)
/*      */       {
/*  248 */         f3 = 1.0F - (f2 - 100.0F) / 10.0F;
/*      */       }
/*      */       
/*  251 */       int i = (int)(220.0F * f3) << 24 | 0x101020;
/*  252 */       a(☃, 0, 0, this.H, this.I, i);
/*  253 */       RenderSystem.enableAlphaTest();
/*  254 */       RenderSystem.enableDepthTest();
/*  255 */       this.j.au().c();
/*      */       
/*  257 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*      */     } 
/*      */     
/*  260 */     if (this.j.v()) {
/*  261 */       c(☃);
/*      */     }
/*      */     
/*  264 */     a(☃);
/*      */     
/*  266 */     if (this.j.k.aJ) {
/*  267 */       this.s.a(☃);
/*      */     }
/*      */     
/*  270 */     if (!this.j.k.aI) {
/*  271 */       if (this.n != null && this.o > 0) {
/*  272 */         this.j.au().a("overlayMessage");
/*  273 */         float f2 = this.o - f;
/*  274 */         int i = (int)(f2 * 255.0F / 20.0F);
/*  275 */         if (i > 255) {
/*  276 */           i = 255;
/*      */         }
/*  278 */         if (i > 8) {
/*  279 */           RenderSystem.pushMatrix();
/*  280 */           RenderSystem.translatef((this.H / 2), (this.I - 68), 0.0F);
/*  281 */           RenderSystem.enableBlend();
/*  282 */           RenderSystem.defaultBlendFunc();
/*      */           
/*  284 */           int j = 16777215;
/*  285 */           if (this.p) {
/*  286 */             j = afm.f(f2 / 50.0F, 0.7F, 0.6F) & 0xFFFFFF;
/*      */           }
/*  288 */           int k = i << 24 & 0xFF000000;
/*  289 */           int m = dku.a(this.n);
/*  290 */           a(☃, dku, -4, m, 0xFFFFFF | k);
/*  291 */           dku.b(☃, this.n, (-m / 2), -4.0F, j | k);
/*  292 */           RenderSystem.disableBlend();
/*  293 */           RenderSystem.popMatrix();
/*      */         } 
/*  295 */         this.j.au().c();
/*      */       } 
/*      */       
/*  298 */       if (this.y != null && this.x > 0) {
/*  299 */         this.j.au().a("titleAndSubtitle");
/*  300 */         float f2 = this.x - f;
/*  301 */         int i = 255;
/*  302 */         if (this.x > this.C + this.B) {
/*  303 */           float f3 = (this.A + this.B + this.C) - f2;
/*  304 */           i = (int)(f3 * 255.0F / this.A);
/*      */         } 
/*  306 */         if (this.x <= this.C) {
/*  307 */           i = (int)(f2 * 255.0F / this.C);
/*      */         }
/*  309 */         i = afm.a(i, 0, 255);
/*  310 */         if (i > 8) {
/*  311 */           RenderSystem.pushMatrix();
/*  312 */           RenderSystem.translatef((this.H / 2), (this.I / 2), 0.0F);
/*  313 */           RenderSystem.enableBlend();
/*  314 */           RenderSystem.defaultBlendFunc();
/*      */           
/*  316 */           RenderSystem.pushMatrix();
/*  317 */           RenderSystem.scalef(4.0F, 4.0F, 4.0F);
/*  318 */           int j = i << 24 & 0xFF000000;
/*  319 */           int k = dku.a(this.y);
/*  320 */           a(☃, dku, -10, k, 0xFFFFFF | j);
/*  321 */           dku.a(☃, this.y, (-k / 2), -10.0F, 0xFFFFFF | j);
/*  322 */           RenderSystem.popMatrix();
/*      */           
/*  324 */           if (this.z != null) {
/*  325 */             RenderSystem.pushMatrix();
/*  326 */             RenderSystem.scalef(2.0F, 2.0F, 2.0F);
/*  327 */             int m = dku.a(this.z);
/*  328 */             a(☃, dku, 5, m, 0xFFFFFF | j);
/*  329 */             dku.a(☃, this.z, (-m / 2), 5.0F, 0xFFFFFF | j);
/*  330 */             RenderSystem.popMatrix();
/*      */           } 
/*  332 */           RenderSystem.disableBlend();
/*  333 */           RenderSystem.popMatrix();
/*      */         } 
/*  335 */         this.j.au().c();
/*      */       } 
/*      */       
/*  338 */       this.t.a(☃);
/*      */       
/*  340 */       ddn ddn = this.j.r.G();
/*  341 */       ddk ddk1 = null;
/*  342 */       ddl ddl = ddn.i(this.j.s.bU());
/*  343 */       if (ddl != null) {
/*  344 */         int i = ddl.n().b();
/*  345 */         if (i >= 0) {
/*  346 */           ddk1 = ddn.a(3 + i);
/*      */         }
/*      */       } 
/*  349 */       ddk ddk2 = (ddk1 != null) ? ddk1 : ddn.a(1);
/*  350 */       if (ddk2 != null) {
/*  351 */         a(☃, ddk2);
/*      */       }
/*      */       
/*  354 */       RenderSystem.enableBlend();
/*  355 */       RenderSystem.defaultBlendFunc();
/*  356 */       RenderSystem.disableAlphaTest();
/*      */       
/*  358 */       RenderSystem.pushMatrix();
/*  359 */       RenderSystem.translatef(0.0F, (this.I - 48), 0.0F);
/*      */       
/*  361 */       this.j.au().a("chat");
/*  362 */       this.l.a(☃, this.m);
/*  363 */       this.j.au().c();
/*      */       
/*  365 */       RenderSystem.popMatrix();
/*      */       
/*  367 */       ddk2 = ddn.a(0);
/*  368 */       if (this.j.k.at.d() && (!this.j.F() || this.j.s.e.e().size() > 1 || ddk2 != null)) {
/*  369 */         this.v.a(true);
/*  370 */         this.v.a(☃, this.H, ddn, ddk2);
/*      */       } else {
/*  372 */         this.v.a(false);
/*      */       } 
/*      */     } 
/*      */     
/*  376 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  377 */     RenderSystem.enableAlphaTest();
/*      */   }
/*      */   
/*      */   private void a(dfm ☃, dku dku1, int i, int j, int k) {
/*  381 */     int m = this.j.k.b(0.0F);
/*  382 */     if (m != 0) {
/*  383 */       int n = -j / 2;
/*  384 */       dku1.getClass(); a(☃, n - 2, i - 2, n + j + 2, i + 9 + 2, aez.a.a(m, k));
/*      */     } 
/*      */   }
/*      */   
/*      */   private void d(dfm ☃) {
/*  389 */     dkd dkd = this.j.k;
/*      */     
/*  391 */     if (!dkd.g().a()) {
/*      */       return;
/*      */     }
/*      */     
/*  395 */     if (this.j.q.l() == bru.e && 
/*  396 */       !a(this.j.v)) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/*  401 */     if (dkd.aJ && !dkd.aI && !this.j.s.eO() && !dkd.U) {
/*  402 */       RenderSystem.pushMatrix();
/*  403 */       RenderSystem.translatef((this.H / 2), (this.I / 2), v());
/*  404 */       djk djk = this.j.h.k();
/*  405 */       RenderSystem.rotatef(djk.d(), -1.0F, 0.0F, 0.0F);
/*  406 */       RenderSystem.rotatef(djk.e(), 0.0F, 1.0F, 0.0F);
/*  407 */       RenderSystem.scalef(-1.0F, -1.0F, -1.0F);
/*  408 */       RenderSystem.renderCrosshair(10);
/*  409 */       RenderSystem.popMatrix();
/*      */     } else {
/*  411 */       RenderSystem.blendFuncSeparate(dem.r.i, dem.j.k, dem.r.e, dem.j.n);
/*  412 */       int i = 15;
/*  413 */       b(☃, (this.H - 15) / 2, (this.I - 15) / 2, 0, 0, 15, 15);
/*      */       
/*  415 */       if (this.j.k.C == dji.b) {
/*  416 */         float f = this.j.s.u(0.0F);
/*  417 */         boolean bool = false;
/*  418 */         if (this.j.u != null && this.j.u instanceof aqm && f >= 1.0F) {
/*  419 */           bool = (this.j.s.eR() > 5.0F);
/*  420 */           bool &= this.j.u.aX();
/*      */         } 
/*      */         
/*  423 */         int j = this.I / 2 - 7 + 16;
/*  424 */         int k = this.H / 2 - 8;
/*      */         
/*  426 */         if (bool) {
/*  427 */           b(☃, k, j, 68, 94, 16, 16);
/*  428 */         } else if (f < 1.0F) {
/*  429 */           int m = (int)(f * 17.0F);
/*      */           
/*  431 */           b(☃, k, j, 36, 94, 16, 4);
/*  432 */           b(☃, k, j, 52, 94, m, 4);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private boolean a(dcl ☃) {
/*  439 */     if (☃ == null) {
/*  440 */       return false;
/*      */     }
/*      */     
/*  443 */     if (☃.c() == dcl.a.c)
/*  444 */       return ((dck)☃).a() instanceof aox; 
/*  445 */     if (☃.c() == dcl.a.b) {
/*  446 */       fx fx = ((dcj)☃).a();
/*  447 */       brx brx = this.j.r;
/*  448 */       return (brx.d_(fx).b(brx, fx) != null);
/*      */     } 
/*      */     
/*  451 */     return false;
/*      */   }
/*      */   
/*      */   protected void a(dfm ☃) {
/*  455 */     Collection<apu> collection = this.j.s.dh();
/*      */     
/*  457 */     if (collection.isEmpty()) {
/*      */       return;
/*      */     }
/*      */     
/*  461 */     RenderSystem.enableBlend();
/*  462 */     int i = 0;
/*  463 */     int j = 0;
/*  464 */     ekp ekp = this.j.at();
/*      */ 
/*      */     
/*  467 */     List<Runnable> list = Lists.newArrayListWithExpectedSize(collection.size());
/*      */     
/*  469 */     this.j.M().a(dpp.a);
/*  470 */     for (apu apu : Ordering.natural().reverse().sortedCopy(collection)) {
/*  471 */       aps aps = apu.a();
/*      */       
/*  473 */       if (apu.f()) {
/*  474 */         int k = this.H;
/*  475 */         int m = 1;
/*  476 */         if (this.j.v()) {
/*  477 */           m += 15;
/*      */         }
/*      */         
/*  480 */         if (aps.h()) {
/*  481 */           i++;
/*  482 */           k -= 25 * i;
/*      */         } else {
/*  484 */           j++;
/*  485 */           k -= 25 * j;
/*  486 */           m += 26;
/*      */         } 
/*      */         
/*  489 */         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  490 */         float f1 = 1.0F;
/*  491 */         if (apu.d()) {
/*  492 */           b(☃, k, m, 165, 166, 24, 24);
/*      */         } else {
/*  494 */           b(☃, k, m, 141, 166, 24, 24);
/*      */           
/*  496 */           if (apu.b() <= 200) {
/*  497 */             int i2 = 10 - apu.b() / 20;
/*  498 */             f1 = afm.a(apu.b() / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F) + afm.b(apu.b() * 3.1415927F / 5.0F) * afm.a(i2 / 10.0F * 0.25F, 0.0F, 0.25F);
/*      */           } 
/*      */         } 
/*      */         
/*  502 */         ekc ekc = ekp.a(aps);
/*  503 */         int n = k;
/*  504 */         int i1 = m;
/*  505 */         float f2 = f1;
/*  506 */         list.add(() -> {
/*      */               this.j.M().a(☃.m().g());
/*      */               
/*      */               RenderSystem.color4f(1.0F, 1.0F, 1.0F, f);
/*      */               a(dfm1, i + 3, j + 3, v(), 18, 18, ☃);
/*      */             });
/*      */       } 
/*      */     } 
/*  514 */     list.forEach(Runnable::run);
/*      */   }
/*      */   
/*      */   protected void a(float ☃, dfm dfm1) {
/*  518 */     bfw bfw = k();
/*  519 */     if (bfw == null) {
/*      */       return;
/*      */     }
/*      */     
/*  523 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  524 */     this.j.M().a(c);
/*      */     
/*  526 */     bmb bmb1 = bfw.dE();
/*  527 */     aqi aqi = bfw.dV().a();
/*  528 */     int i = this.H / 2;
/*  529 */     int j = v();
/*  530 */     int k = 182;
/*  531 */     int m = 91;
/*      */     
/*  533 */     d(-90);
/*      */     
/*  535 */     b(dfm1, i - 91, this.I - 22, 0, 0, 182, 22);
/*  536 */     b(dfm1, i - 91 - 1 + bfw.bm.d * 20, this.I - 22 - 1, 0, 22, 24, 22);
/*      */     
/*  538 */     if (!bmb1.a()) {
/*  539 */       if (aqi == aqi.a) {
/*  540 */         b(dfm1, i - 91 - 29, this.I - 23, 24, 22, 29, 24);
/*      */       } else {
/*  542 */         b(dfm1, i + 91, this.I - 23, 53, 22, 29, 24);
/*      */       } 
/*      */     }
/*      */     
/*  546 */     d(j);
/*      */     
/*  548 */     RenderSystem.enableRescaleNormal();
/*  549 */     RenderSystem.enableBlend();
/*  550 */     RenderSystem.defaultBlendFunc();
/*      */     int n;
/*  552 */     for (n = 0; n < 9; n++) {
/*  553 */       int i1 = i - 90 + n * 20 + 2;
/*  554 */       int i2 = this.I - 16 - 3;
/*  555 */       a(i1, i2, ☃, bfw, bfw.bm.a.get(n));
/*      */     } 
/*      */     
/*  558 */     if (!bmb1.a()) {
/*  559 */       n = this.I - 16 - 3;
/*  560 */       if (aqi == aqi.a) {
/*  561 */         a(i - 91 - 26, n, ☃, bfw, bmb1);
/*      */       } else {
/*  563 */         a(i + 91 + 10, n, ☃, bfw, bmb1);
/*      */       } 
/*      */     } 
/*      */     
/*  567 */     if (this.j.k.C == dji.c) {
/*  568 */       float f = this.j.s.u(0.0F);
/*  569 */       if (f < 1.0F) {
/*  570 */         int i1 = this.I - 20;
/*  571 */         int i2 = i + 91 + 6;
/*  572 */         if (aqi == aqi.b) {
/*  573 */           i2 = i - 91 - 22;
/*      */         }
/*      */         
/*  576 */         this.j.M().a(dkw.h);
/*      */         
/*  578 */         int i3 = (int)(f * 19.0F);
/*      */         
/*  580 */         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  581 */         b(dfm1, i2, i1, 0, 94, 18, 18);
/*  582 */         b(dfm1, i2, i1 + 18 - i3, 18, 112 - i3, 18, i3);
/*      */       } 
/*      */     } 
/*      */     
/*  586 */     RenderSystem.disableRescaleNormal();
/*  587 */     RenderSystem.disableBlend();
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(dfm ☃, int i) {
/*  592 */     this.j.au().a("jumpBar");
/*  593 */     this.j.M().a(dkw.h);
/*  594 */     float f = this.j.s.I();
/*  595 */     int j = 182;
/*      */     
/*  597 */     int k = (int)(f * 183.0F);
/*      */     
/*  599 */     int m = this.I - 32 + 3;
/*  600 */     b(☃, i, m, 0, 84, 182, 5);
/*  601 */     if (k > 0) {
/*  602 */       b(☃, i, m, 0, 89, k, 5);
/*      */     }
/*  604 */     this.j.au().c();
/*      */   }
/*      */   
/*      */   public void b(dfm ☃, int i) {
/*  608 */     this.j.au().a("expBar");
/*  609 */     this.j.M().a(dkw.h);
/*  610 */     int j = this.j.s.eH();
/*  611 */     if (j > 0) {
/*  612 */       int k = 182;
/*      */       
/*  614 */       int m = (int)(this.j.s.bF * 183.0F);
/*      */       
/*  616 */       int n = this.I - 32 + 3;
/*  617 */       b(☃, i, n, 0, 64, 182, 5);
/*  618 */       if (m > 0) {
/*  619 */         b(☃, i, n, 0, 69, m, 5);
/*      */       }
/*      */     } 
/*  622 */     this.j.au().c();
/*      */     
/*  624 */     if (this.j.s.bD > 0) {
/*  625 */       this.j.au().a("expLevel");
/*      */       
/*  627 */       String str = "" + this.j.s.bD;
/*  628 */       int k = (this.H - e().b(str)) / 2;
/*  629 */       int m = this.I - 31 - 4;
/*      */       
/*  631 */       e().b(☃, str, (k + 1), m, 0);
/*  632 */       e().b(☃, str, (k - 1), m, 0);
/*  633 */       e().b(☃, str, k, (m + 1), 0);
/*  634 */       e().b(☃, str, k, (m - 1), 0);
/*  635 */       e().b(☃, str, k, m, 8453920);
/*  636 */       this.j.au().c();
/*      */     } 
/*      */   }
/*      */   
/*      */   public void b(dfm ☃) {
/*  641 */     this.j.au().a("selectedItemName");
/*      */     
/*  643 */     if (this.q > 0 && !this.r.a()) {
/*  644 */       nx nx = (new oe("")).a(this.r.r()).a((this.r.v()).e);
/*  645 */       if (this.r.t()) {
/*  646 */         nx.a(k.u);
/*      */       }
/*      */       
/*  649 */       int i = e().a(nx);
/*  650 */       int j = (this.H - i) / 2;
/*  651 */       int k = this.I - 59;
/*  652 */       if (!this.j.q.a())
/*      */       {
/*  654 */         k += 14;
/*      */       }
/*      */       
/*  657 */       int m = (int)(this.q * 256.0F / 10.0F);
/*  658 */       if (m > 255) {
/*  659 */         m = 255;
/*      */       }
/*  661 */       if (m > 0) {
/*  662 */         RenderSystem.pushMatrix();
/*  663 */         RenderSystem.enableBlend();
/*  664 */         RenderSystem.defaultBlendFunc();
/*  665 */         e().getClass(); a(☃, j - 2, k - 2, j + i + 2, k + 9 + 2, this.j.k.a(0));
/*  666 */         e().a(☃, nx, j, k, 16777215 + (m << 24));
/*  667 */         RenderSystem.disableBlend();
/*  668 */         RenderSystem.popMatrix();
/*      */       } 
/*      */     } 
/*      */     
/*  672 */     this.j.au().c();
/*      */   }
/*      */   public void c(dfm ☃) {
/*      */     nr nr1;
/*  676 */     this.j.au().a("demo");
/*      */ 
/*      */     
/*  679 */     if (this.j.r.T() >= 120500L) {
/*  680 */       nr1 = e;
/*      */     } else {
/*  682 */       nr1 = new of("demo.remainingTime", new Object[] { aft.a((int)(120500L - this.j.r.T())) });
/*      */     } 
/*      */     
/*  685 */     int i = e().a(nr1);
/*  686 */     e().a(☃, nr1, (this.H - i - 10), 5.0F, 16777215);
/*  687 */     this.j.au().c();
/*      */   }
/*      */   
/*      */   private void a(dfm ☃, ddk ddk1) {
/*  691 */     ddn ddn = ddk1.a();
/*  692 */     Collection<ddm> collection = ddn.i(ddk1);
/*  693 */     List<ddm> list = (List<ddm>)collection.stream().filter(☃ -> (☃.e() != null && !☃.e().startsWith("#"))).collect(Collectors.toList());
/*  694 */     if (list.size() > 15) {
/*  695 */       collection = Lists.newArrayList(Iterables.skip(list, collection.size() - 15));
/*      */     } else {
/*  697 */       collection = list;
/*      */     } 
/*      */     
/*  700 */     List<Pair<ddm, nr>> list1 = Lists.newArrayListWithCapacity(collection.size());
/*      */     
/*  702 */     nr nr1 = ddk1.d();
/*  703 */     int i = e().a(nr1);
/*  704 */     int j = i;
/*  705 */     int k = e().b(": ");
/*  706 */     for (ddm ddm : collection) {
/*  707 */       ddl ddl = ddn.i(ddm.e());
/*  708 */       nr nr2 = ddl.a(ddl, new oe(ddm.e()));
/*  709 */       list1.add(Pair.of(ddm, nr2));
/*  710 */       j = Math.max(j, e().a(nr2) + k + e().b(Integer.toString(ddm.b())));
/*      */     } 
/*      */     
/*  713 */     e().getClass(); int m = collection.size() * 9;
/*  714 */     int n = this.I / 2 + m / 3;
/*  715 */     int i1 = 3;
/*  716 */     int i2 = this.H - j - 3;
/*  717 */     int i3 = 0;
/*      */     
/*  719 */     int i4 = this.j.k.b(0.3F);
/*  720 */     int i5 = this.j.k.b(0.4F);
/*      */     
/*  722 */     for (Pair<ddm, nr> pair : list1) {
/*  723 */       i3++;
/*  724 */       ddm ddm = (ddm)pair.getFirst();
/*  725 */       nr nr2 = (nr)pair.getSecond();
/*  726 */       String str = k.m + "" + ddm.b();
/*  727 */       int i6 = i2;
/*  728 */       e().getClass(); int i7 = n - i3 * 9;
/*  729 */       int i8 = this.H - 3 + 2;
/*      */       
/*  731 */       e().getClass(); a(☃, i6 - 2, i7, i8, i7 + 9, i4);
/*  732 */       e().b(☃, nr2, i6, i7, -1);
/*  733 */       e().b(☃, str, (i8 - e().b(str)), i7, -1);
/*      */       
/*  735 */       if (i3 == collection.size()) {
/*  736 */         e().getClass(); a(☃, i6 - 2, i7 - 9 - 1, i8, i7 - 1, i5);
/*  737 */         a(☃, i6 - 2, i7 - 1, i8, i7, i4);
/*  738 */         e().getClass(); e().b(☃, nr1, (i6 + j / 2 - i / 2), (i7 - 9), -1);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private bfw k() {
/*  744 */     if (!(this.j.aa() instanceof bfw)) {
/*  745 */       return null;
/*      */     }
/*  747 */     return (bfw)this.j.aa();
/*      */   }
/*      */   
/*      */   private aqm l() {
/*  751 */     bfw ☃ = k();
/*  752 */     if (☃ != null) {
/*  753 */       aqa aqa = ☃.ct();
/*  754 */       if (aqa == null) {
/*  755 */         return null;
/*      */       }
/*  757 */       if (aqa instanceof aqm) {
/*  758 */         return (aqm)aqa;
/*      */       }
/*      */     } 
/*  761 */     return null;
/*      */   }
/*      */   
/*      */   private int a(aqm ☃) {
/*  765 */     if (☃ == null || !☃.bd()) {
/*  766 */       return 0;
/*      */     }
/*      */     
/*  769 */     float f = ☃.dx();
/*  770 */     int i = (int)(f + 0.5F) / 2;
/*  771 */     if (i > 30) {
/*  772 */       i = 30;
/*      */     }
/*  774 */     return i;
/*      */   }
/*      */   
/*      */   private int a(int ☃) {
/*  778 */     return (int)Math.ceil(☃ / 10.0D);
/*      */   }
/*      */   
/*      */   private void e(dfm ☃) {
/*  782 */     bfw bfw = k();
/*  783 */     if (bfw == null) {
/*      */       return;
/*      */     }
/*  786 */     int i = afm.f(bfw.dk());
/*      */     
/*  788 */     boolean bool = (this.G > this.m && (this.G - this.m) / 3L % 2L == 1L);
/*  789 */     long l = x.b();
/*  790 */     if (i < this.D && bfw.P > 0) {
/*  791 */       this.F = l;
/*  792 */       this.G = (this.m + 20);
/*  793 */     } else if (i > this.D && bfw.P > 0) {
/*  794 */       this.F = l;
/*  795 */       this.G = (this.m + 10);
/*      */     } 
/*  797 */     if (l - this.F > 1000L) {
/*  798 */       this.D = i;
/*  799 */       this.E = i;
/*  800 */       this.F = l;
/*      */     } 
/*  802 */     this.D = i;
/*  803 */     int j = this.E;
/*  804 */     this.i.setSeed((this.m * 312871));
/*      */     
/*  806 */     bhy bhy = bfw.eI();
/*  807 */     int k = bhy.a();
/*      */     
/*  809 */     int m = this.H / 2 - 91;
/*  810 */     int n = this.H / 2 + 91;
/*      */     
/*  812 */     int i1 = this.I - 39;
/*  813 */     float f = (float)bfw.b(arl.a);
/*  814 */     int i2 = afm.f(bfw.dT());
/*  815 */     int i3 = afm.f((f + i2) / 2.0F / 10.0F);
/*  816 */     int i4 = Math.max(10 - i3 - 2, 3);
/*  817 */     int i5 = i1 - (i3 - 1) * i4 - 10;
/*  818 */     int i6 = i1 - 10;
/*  819 */     int i7 = i2;
/*      */     
/*  821 */     int i8 = bfw.du();
/*  822 */     int i9 = -1;
/*  823 */     if (bfw.a(apw.j)) {
/*  824 */       i9 = this.m % afm.f(f + 5.0F);
/*      */     }
/*      */ 
/*      */     
/*  828 */     this.j.au().a("armor"); int i10;
/*  829 */     for (i10 = 0; i10 < 10; i10++) {
/*  830 */       if (i8 > 0) {
/*  831 */         int i14 = m + i10 * 8;
/*  832 */         if (i10 * 2 + 1 < i8) {
/*  833 */           b(☃, i14, i5, 34, 9, 9, 9);
/*      */         }
/*  835 */         if (i10 * 2 + 1 == i8) {
/*  836 */           b(☃, i14, i5, 25, 9, 9, 9);
/*      */         }
/*  838 */         if (i10 * 2 + 1 > i8) {
/*  839 */           b(☃, i14, i5, 16, 9, 9, 9);
/*      */         }
/*      */       } 
/*      */     } 
/*  843 */     this.j.au().b("health");
/*  844 */     for (i10 = afm.f((f + i2) / 2.0F) - 1; i10 >= 0; i10--) {
/*  845 */       int i14 = 16;
/*  846 */       if (bfw.a(apw.s)) {
/*  847 */         i14 += 36;
/*  848 */       } else if (bfw.a(apw.t)) {
/*  849 */         i14 += 72;
/*      */       } 
/*      */       
/*  852 */       int i15 = 0;
/*  853 */       if (bool) {
/*  854 */         i15 = 1;
/*      */       }
/*  856 */       int i16 = afm.f((i10 + 1) / 10.0F) - 1;
/*  857 */       int i17 = m + i10 % 10 * 8;
/*  858 */       int i18 = i1 - i16 * i4;
/*  859 */       if (i <= 4) {
/*  860 */         i18 += this.i.nextInt(2);
/*      */       }
/*      */       
/*  863 */       if (i7 <= 0 && i10 == i9) {
/*  864 */         i18 -= 2;
/*      */       }
/*      */       
/*  867 */       int i19 = 0;
/*  868 */       if (bfw.l.h().n()) {
/*  869 */         i19 = 5;
/*      */       }
/*      */       
/*  872 */       b(☃, i17, i18, 16 + i15 * 9, 9 * i19, 9, 9);
/*  873 */       if (bool) {
/*  874 */         if (i10 * 2 + 1 < j) {
/*  875 */           b(☃, i17, i18, i14 + 54, 9 * i19, 9, 9);
/*      */         }
/*  877 */         if (i10 * 2 + 1 == j) {
/*  878 */           b(☃, i17, i18, i14 + 63, 9 * i19, 9, 9);
/*      */         }
/*      */       } 
/*      */       
/*  882 */       if (i7 > 0) {
/*  883 */         if (i7 == i2 && i2 % 2 == 1) {
/*  884 */           b(☃, i17, i18, i14 + 153, 9 * i19, 9, 9);
/*  885 */           i7--;
/*      */         } else {
/*  887 */           b(☃, i17, i18, i14 + 144, 9 * i19, 9, 9);
/*  888 */           i7 -= 2;
/*      */         } 
/*      */       } else {
/*  891 */         if (i10 * 2 + 1 < i) {
/*  892 */           b(☃, i17, i18, i14 + 36, 9 * i19, 9, 9);
/*      */         }
/*  894 */         if (i10 * 2 + 1 == i) {
/*  895 */           b(☃, i17, i18, i14 + 45, 9 * i19, 9, 9);
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/*  900 */     aqm aqm = l();
/*  901 */     int i11 = a(aqm);
/*  902 */     if (i11 == 0) {
/*      */       
/*  904 */       this.j.au().b("food");
/*  905 */       for (int i14 = 0; i14 < 10; i14++) {
/*  906 */         int i15 = i1;
/*      */         
/*  908 */         int i16 = 16;
/*  909 */         int i17 = 0;
/*  910 */         if (bfw.a(apw.q)) {
/*  911 */           i16 += 36;
/*  912 */           i17 = 13;
/*      */         } 
/*      */         
/*  915 */         if (bfw.eI().e() <= 0.0F && 
/*  916 */           this.m % (k * 3 + 1) == 0) {
/*  917 */           i15 += this.i.nextInt(3) - 1;
/*      */         }
/*      */ 
/*      */         
/*  921 */         int i18 = n - i14 * 8 - 9;
/*  922 */         b(☃, i18, i15, 16 + i17 * 9, 27, 9, 9);
/*  923 */         if (i14 * 2 + 1 < k) {
/*  924 */           b(☃, i18, i15, i16 + 36, 27, 9, 9);
/*      */         }
/*  926 */         if (i14 * 2 + 1 == k) {
/*  927 */           b(☃, i18, i15, i16 + 45, 27, 9, 9);
/*      */         }
/*      */       } 
/*  930 */       i6 -= 10;
/*      */     } 
/*      */ 
/*      */     
/*  934 */     this.j.au().b("air");
/*      */     
/*  936 */     int i12 = bfw.bH();
/*  937 */     int i13 = Math.min(bfw.bI(), i12);
/*  938 */     if (bfw.a(aef.b) || i13 < i12) {
/*      */       
/*  940 */       int i14 = a(i11) - 1;
/*  941 */       i6 -= i14 * 10;
/*      */       
/*  943 */       int i15 = afm.f((i13 - 2) * 10.0D / i12);
/*  944 */       int i16 = afm.f(i13 * 10.0D / i12) - i15;
/*  945 */       for (int i17 = 0; i17 < i15 + i16; i17++) {
/*  946 */         if (i17 < i15) {
/*  947 */           b(☃, n - i17 * 8 - 9, i6, 16, 18, 9, 9);
/*      */         } else {
/*  949 */           b(☃, n - i17 * 8 - 9, i6, 25, 18, 9, 9);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  954 */     this.j.au().c();
/*      */   }
/*      */   
/*      */   private void f(dfm ☃) {
/*  958 */     aqm aqm = l();
/*  959 */     if (aqm == null) {
/*      */       return;
/*      */     }
/*  962 */     int i = a(aqm);
/*  963 */     if (i == 0) {
/*      */       return;
/*      */     }
/*  966 */     int j = (int)Math.ceil(aqm.dk());
/*      */ 
/*      */     
/*  969 */     this.j.au().b("mountHealth");
/*      */ 
/*      */     
/*  972 */     int k = this.I - 39;
/*  973 */     int m = this.H / 2 + 91;
/*  974 */     int n = k;
/*  975 */     int i1 = 0;
/*  976 */     boolean bool = false;
/*      */     
/*  978 */     while (i > 0) {
/*  979 */       int i2 = Math.min(i, 10);
/*  980 */       i -= i2;
/*      */       
/*  982 */       for (int i3 = 0; i3 < i2; i3++) {
/*  983 */         int i4 = 52;
/*  984 */         int i5 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  989 */         int i6 = m - i3 * 8 - 9;
/*  990 */         b(☃, i6, n, 52 + i5 * 9, 9, 9, 9);
/*  991 */         if (i3 * 2 + 1 + i1 < j) {
/*  992 */           b(☃, i6, n, 88, 9, 9, 9);
/*      */         }
/*  994 */         if (i3 * 2 + 1 + i1 == j) {
/*  995 */           b(☃, i6, n, 97, 9, 9, 9);
/*      */         }
/*      */       } 
/*  998 */       n -= 10;
/*  999 */       i1 += 20;
/*      */     } 
/*      */   }
/*      */   
/*      */   private void m() {
/* 1004 */     RenderSystem.disableDepthTest();
/* 1005 */     RenderSystem.depthMask(false);
/* 1006 */     RenderSystem.defaultBlendFunc();
/* 1007 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 1008 */     RenderSystem.disableAlphaTest();
/*      */     
/* 1010 */     this.j.M().a(d);
/* 1011 */     dfo ☃ = dfo.a();
/* 1012 */     dfh dfh = ☃.c();
/* 1013 */     dfh.a(7, dfk.n);
/* 1014 */     dfh.a(0.0D, this.I, -90.0D).a(0.0F, 1.0F).d();
/* 1015 */     dfh.a(this.H, this.I, -90.0D).a(1.0F, 1.0F).d();
/* 1016 */     dfh.a(this.H, 0.0D, -90.0D).a(1.0F, 0.0F).d();
/* 1017 */     dfh.a(0.0D, 0.0D, -90.0D).a(0.0F, 0.0F).d();
/* 1018 */     ☃.b();
/* 1019 */     RenderSystem.depthMask(true);
/* 1020 */     RenderSystem.enableDepthTest();
/* 1021 */     RenderSystem.enableAlphaTest();
/* 1022 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*      */   }
/*      */   
/*      */   private void a(aqa ☃) {
/* 1026 */     if (☃ == null) {
/*      */       return;
/*      */     }
/* 1029 */     float f = afm.a(1.0F - ☃.aR(), 0.0F, 1.0F);
/* 1030 */     this.a = (float)(this.a + (f - this.a) * 0.01D);
/*      */   }
/*      */   
/*      */   private void b(aqa ☃) {
/* 1034 */     cfu cfu = this.j.r.f();
/* 1035 */     float f = (float)cfu.a(☃);
/* 1036 */     double d1 = Math.min(cfu.p() * cfu.q() * 1000.0D, Math.abs(cfu.k() - cfu.i()));
/* 1037 */     double d2 = Math.max(cfu.r(), d1);
/*      */     
/* 1039 */     if (f < d2) {
/* 1040 */       f = 1.0F - (float)(f / d2);
/*      */     } else {
/* 1042 */       f = 0.0F;
/*      */     } 
/*      */     
/* 1045 */     RenderSystem.disableDepthTest();
/* 1046 */     RenderSystem.depthMask(false);
/* 1047 */     RenderSystem.blendFuncSeparate(dem.r.o, dem.j.k, dem.r.e, dem.j.n);
/*      */     
/* 1049 */     if (f > 0.0F) {
/* 1050 */       RenderSystem.color4f(0.0F, f, f, 1.0F);
/*      */     } else {
/* 1052 */       RenderSystem.color4f(this.a, this.a, this.a, 1.0F);
/*      */     } 
/*      */     
/* 1055 */     this.j.M().a(b);
/* 1056 */     dfo dfo = dfo.a();
/* 1057 */     dfh dfh = dfo.c();
/* 1058 */     dfh.a(7, dfk.n);
/* 1059 */     dfh.a(0.0D, this.I, -90.0D).a(0.0F, 1.0F).d();
/* 1060 */     dfh.a(this.H, this.I, -90.0D).a(1.0F, 1.0F).d();
/* 1061 */     dfh.a(this.H, 0.0D, -90.0D).a(1.0F, 0.0F).d();
/* 1062 */     dfh.a(0.0D, 0.0D, -90.0D).a(0.0F, 0.0F).d();
/* 1063 */     dfo.b();
/* 1064 */     RenderSystem.depthMask(true);
/* 1065 */     RenderSystem.enableDepthTest();
/* 1066 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 1067 */     RenderSystem.defaultBlendFunc();
/*      */   }
/*      */   
/*      */   private void a(float ☃) {
/* 1071 */     if (☃ < 1.0F) {
/* 1072 */       ☃ *= ☃;
/* 1073 */       ☃ *= ☃;
/* 1074 */       ☃ = ☃ * 0.8F + 0.2F;
/*      */     } 
/*      */     
/* 1077 */     RenderSystem.disableAlphaTest();
/* 1078 */     RenderSystem.disableDepthTest();
/* 1079 */     RenderSystem.depthMask(false);
/* 1080 */     RenderSystem.defaultBlendFunc();
/* 1081 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, ☃);
/*      */     
/* 1083 */     this.j.M().a(ekb.d);
/* 1084 */     ekc ekc = this.j.ab().a().a(bup.cT.n());
/*      */     
/* 1086 */     float f1 = ekc.h();
/* 1087 */     float f2 = ekc.j();
/* 1088 */     float f3 = ekc.i();
/* 1089 */     float f4 = ekc.k();
/* 1090 */     dfo dfo = dfo.a();
/* 1091 */     dfh dfh = dfo.c();
/* 1092 */     dfh.a(7, dfk.n);
/* 1093 */     dfh.a(0.0D, this.I, -90.0D).a(f1, f4).d();
/* 1094 */     dfh.a(this.H, this.I, -90.0D).a(f3, f4).d();
/* 1095 */     dfh.a(this.H, 0.0D, -90.0D).a(f3, f2).d();
/* 1096 */     dfh.a(0.0D, 0.0D, -90.0D).a(f1, f2).d();
/* 1097 */     dfo.b();
/* 1098 */     RenderSystem.depthMask(true);
/* 1099 */     RenderSystem.enableDepthTest();
/* 1100 */     RenderSystem.enableAlphaTest();
/* 1101 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*      */   }
/*      */   
/*      */   private void a(int ☃, int i, float f, bfw bfw1, bmb bmb1) {
/* 1105 */     if (bmb1.a()) {
/*      */       return;
/*      */     }
/*      */     
/* 1109 */     float f1 = bmb1.D() - f;
/* 1110 */     if (f1 > 0.0F) {
/* 1111 */       RenderSystem.pushMatrix();
/* 1112 */       float f2 = 1.0F + f1 / 5.0F;
/* 1113 */       RenderSystem.translatef((☃ + 8), (i + 12), 0.0F);
/* 1114 */       RenderSystem.scalef(1.0F / f2, (f2 + 1.0F) / 2.0F, 1.0F);
/* 1115 */       RenderSystem.translatef(-(☃ + 8), -(i + 12), 0.0F);
/*      */     } 
/*      */     
/* 1118 */     this.k.a(bfw1, bmb1, ☃, i);
/*      */     
/* 1120 */     if (f1 > 0.0F) {
/* 1121 */       RenderSystem.popMatrix();
/*      */     }
/*      */     
/* 1124 */     this.k.a(this.j.g, bmb1, ☃, i);
/*      */   }
/*      */   
/*      */   public void b() {
/* 1128 */     if (this.o > 0) {
/* 1129 */       this.o--;
/*      */     }
/* 1131 */     if (this.x > 0) {
/* 1132 */       this.x--;
/* 1133 */       if (this.x <= 0) {
/* 1134 */         this.y = null;
/* 1135 */         this.z = null;
/*      */       } 
/*      */     } 
/* 1138 */     this.m++;
/*      */     
/* 1140 */     aqa ☃ = this.j.aa();
/* 1141 */     if (☃ != null) {
/* 1142 */       a(☃);
/*      */     }
/*      */     
/* 1145 */     if (this.j.s != null) {
/* 1146 */       bmb bmb1 = this.j.s.bm.f();
/*      */       
/* 1148 */       if (bmb1.a()) {
/* 1149 */         this.q = 0;
/* 1150 */       } else if (this.r.a() || bmb1.b() != this.r.b() || !bmb1.r().equals(this.r.r())) {
/* 1151 */         this.q = 40;
/* 1152 */       } else if (this.q > 0) {
/* 1153 */         this.q--;
/*      */       } 
/* 1155 */       this.r = bmb1;
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a(nr ☃) {
/* 1160 */     a(new of("record.nowPlaying", new Object[] { ☃ }), true);
/*      */   }
/*      */   
/*      */   public void a(nr ☃, boolean bool) {
/* 1164 */     this.n = ☃;
/* 1165 */     this.o = 60;
/* 1166 */     this.p = bool;
/*      */   }
/*      */   
/*      */   public void a(@Nullable nr ☃, @Nullable nr nr1, int i, int j, int k) {
/* 1170 */     if (☃ == null && nr1 == null && i < 0 && j < 0 && k < 0) {
/* 1171 */       this.y = null;
/* 1172 */       this.z = null;
/* 1173 */       this.x = 0;
/*      */       
/*      */       return;
/*      */     } 
/* 1177 */     if (☃ != null) {
/* 1178 */       this.y = ☃;
/* 1179 */       this.x = this.A + this.B + this.C;
/*      */       return;
/*      */     } 
/* 1182 */     if (nr1 != null) {
/* 1183 */       this.z = nr1;
/*      */       
/*      */       return;
/*      */     } 
/* 1187 */     if (i >= 0) {
/* 1188 */       this.A = i;
/*      */     }
/* 1190 */     if (j >= 0) {
/* 1191 */       this.B = j;
/*      */     }
/* 1193 */     if (k >= 0) {
/* 1194 */       this.C = k;
/*      */     }
/* 1196 */     if (this.x > 0) {
/* 1197 */       this.x = this.A + this.B + this.C;
/*      */     }
/*      */   }
/*      */   
/*      */   public UUID b(nr ☃) {
/* 1202 */     String str1 = afr.a(☃);
/* 1203 */     String str2 = StringUtils.substringBetween(str1, "<", ">");
/* 1204 */     if (str2 == null) {
/* 1205 */       return x.b;
/*      */     }
/*      */     
/* 1208 */     return this.j.aB().a(str2);
/*      */   }
/*      */   
/*      */   public void a(no ☃, nr nr1, UUID uUID) {
/* 1212 */     if (this.j.a(uUID)) {
/*      */       return;
/*      */     }
/*      */     
/* 1216 */     if (this.j.k.ae && this.j.a(b(nr1))) {
/*      */       return;
/*      */     }
/*      */     
/* 1220 */     for (dky dky : this.J.get(☃)) {
/* 1221 */       dky.a(☃, nr1, uUID);
/*      */     }
/*      */   }
/*      */   
/*      */   public dlk c() {
/* 1226 */     return this.l;
/*      */   }
/*      */   
/*      */   public int d() {
/* 1230 */     return this.m;
/*      */   }
/*      */   
/*      */   public dku e() {
/* 1234 */     return this.j.g;
/*      */   }
/*      */   
/*      */   public dml f() {
/* 1238 */     return this.u;
/*      */   }
/*      */   
/*      */   public dly g() {
/* 1242 */     return this.v;
/*      */   }
/*      */   
/*      */   public void h() {
/* 1246 */     this.v.a();
/* 1247 */     this.w.a();
/* 1248 */     this.j.an().a();
/*      */   }
/*      */   
/*      */   public dli i() {
/* 1252 */     return this.w;
/*      */   }
/*      */   
/*      */   public void j() {
/* 1256 */     this.s.a();
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dkv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */