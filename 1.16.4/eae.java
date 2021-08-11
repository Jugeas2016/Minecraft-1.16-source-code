/*      */ import com.google.common.collect.Lists;
/*      */ import com.google.common.collect.Maps;
/*      */ import com.google.common.collect.Queues;
/*      */ import com.google.common.collect.Sets;
/*      */ import com.google.gson.JsonSyntaxException;
/*      */ import com.mojang.blaze3d.systems.RenderSystem;
/*      */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*      */ import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
/*      */ import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
/*      */ import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
/*      */ import it.unimi.dsi.fastutil.objects.ObjectArrayList;
/*      */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*      */ import it.unimi.dsi.fastutil.objects.ObjectList;
/*      */ import it.unimi.dsi.fastutil.objects.ObjectListIterator;
/*      */ import java.io.IOException;
/*      */ import java.util.Collection;
/*      */ import java.util.Comparator;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Queue;
/*      */ import java.util.Random;
/*      */ import java.util.Set;
/*      */ import java.util.SortedSet;
/*      */ import javax.annotation.Nullable;
/*      */ import org.apache.logging.log4j.LogManager;
/*      */ import org.apache.logging.log4j.Logger;
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
/*      */ public class eae
/*      */   implements aci, AutoCloseable
/*      */ {
/*  128 */   private static final Logger b = LogManager.getLogger();
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
/*  141 */   private static final vk c = new vk("textures/environment/moon_phases.png");
/*  142 */   private static final vk d = new vk("textures/environment/sun.png");
/*  143 */   private static final vk e = new vk("textures/environment/clouds.png");
/*  144 */   private static final vk f = new vk("textures/environment/end_sky.png");
/*  145 */   private static final vk g = new vk("textures/misc/forcefield.png");
/*  146 */   private static final vk h = new vk("textures/environment/rain.png");
/*  147 */   private static final vk i = new vk("textures/environment/snow.png");
/*      */   
/*  149 */   public static final gc[] a = gc.values();
/*      */   
/*      */   private final djz j;
/*      */   
/*      */   private final ekd k;
/*      */   
/*      */   private final eet l;
/*      */   
/*      */   private final eam m;
/*      */   private dwt n;
/*  159 */   private Set<ecu.c> o = Sets.newLinkedHashSet();
/*  160 */   private final ObjectList<a> p = (ObjectList<a>)new ObjectArrayList(69696);
/*  161 */   private final Set<ccj> q = Sets.newHashSet();
/*      */   
/*      */   private eat r;
/*      */   
/*  165 */   private final dfr s = dfk.k;
/*      */   
/*      */   @Nullable
/*      */   private dfp t;
/*      */   
/*      */   @Nullable
/*      */   private dfp u;
/*      */   @Nullable
/*      */   private dfp v;
/*      */   private boolean w = true;
/*      */   @Nullable
/*      */   private dfp x;
/*  177 */   private final eap y = new eap(100);
/*      */   
/*      */   private int z;
/*      */   
/*  181 */   private final Int2ObjectMap<zq> A = (Int2ObjectMap<zq>)new Int2ObjectOpenHashMap();
/*  182 */   private final Long2ObjectMap<SortedSet<zq>> B = (Long2ObjectMap<SortedSet<zq>>)new Long2ObjectOpenHashMap();
/*      */   
/*  184 */   private final Map<fx, emt> C = Maps.newHashMap();
/*      */   
/*      */   @Nullable
/*      */   private deg D;
/*      */   
/*      */   @Nullable
/*      */   private eaj E;
/*      */   
/*      */   @Nullable
/*      */   private deg F;
/*      */   @Nullable
/*      */   private deg G;
/*      */   @Nullable
/*      */   private deg H;
/*      */   @Nullable
/*      */   private deg I;
/*      */   @Nullable
/*      */   private deg J;
/*      */   @Nullable
/*      */   private eaj K;
/*  204 */   private double L = Double.MIN_VALUE;
/*  205 */   private double M = Double.MIN_VALUE;
/*  206 */   private double N = Double.MIN_VALUE;
/*      */   
/*  208 */   private int O = Integer.MIN_VALUE;
/*  209 */   private int P = Integer.MIN_VALUE;
/*  210 */   private int Q = Integer.MIN_VALUE;
/*      */   
/*  212 */   private double R = Double.MIN_VALUE;
/*  213 */   private double S = Double.MIN_VALUE;
/*  214 */   private double T = Double.MIN_VALUE;
/*  215 */   private double U = Double.MIN_VALUE;
/*  216 */   private double V = Double.MIN_VALUE;
/*      */   
/*  218 */   private int W = Integer.MIN_VALUE;
/*  219 */   private int X = Integer.MIN_VALUE;
/*  220 */   private int Y = Integer.MIN_VALUE;
/*  221 */   private dcn Z = dcn.a;
/*      */   
/*      */   private djn aa;
/*      */   
/*      */   private ecu ab;
/*  226 */   private final dfr ac = dfk.h;
/*      */   
/*  228 */   private int ad = -1;
/*      */   
/*      */   private int ae;
/*      */   
/*      */   private int af;
/*      */   
/*      */   private boolean ag;
/*      */   @Nullable
/*      */   private ecz ah;
/*  237 */   private final h[] ai = new h[8];
/*  238 */   private final dfu aj = new dfu(0.0D, 0.0D, 0.0D);
/*      */   
/*      */   private double ak;
/*      */   
/*      */   private double al;
/*      */   
/*      */   private double am;
/*      */   
/*      */   private boolean an = true;
/*      */   
/*      */   private int ao;
/*      */   private int ap;
/*  250 */   private final float[] aq = new float[1024];
/*  251 */   private final float[] ar = new float[1024];
/*      */   
/*      */   public eae(djz ☃, eam eam1) {
/*  254 */     this.j = ☃;
/*  255 */     this.l = ☃.ac();
/*  256 */     this.m = eam1;
/*      */     
/*  258 */     this.k = ☃.M();
/*      */     
/*  260 */     for (int i = 0; i < 32; i++) {
/*  261 */       for (int j = 0; j < 32; j++) {
/*  262 */         float f1 = (j - 16);
/*  263 */         float f2 = (i - 16);
/*  264 */         float f3 = afm.c(f1 * f1 + f2 * f2);
/*  265 */         this.aq[i << 5 | j] = -f2 / f3;
/*  266 */         this.ar[i << 5 | j] = f1 / f3;
/*      */       } 
/*      */     } 
/*      */     
/*  270 */     z();
/*  271 */     y();
/*  272 */     x();
/*      */   }
/*      */   
/*      */   private void a(eaf ☃, float f, double d1, double d2, double d3) {
/*  276 */     float f1 = this.j.r.d(f);
/*  277 */     if (f1 <= 0.0F) {
/*      */       return;
/*      */     }
/*  280 */     ☃.c();
/*      */     
/*  282 */     brx brx = this.j.r;
/*      */     
/*  284 */     int i = afm.c(d1);
/*  285 */     int j = afm.c(d2);
/*  286 */     int k = afm.c(d3);
/*      */     
/*  288 */     dfo dfo = dfo.a();
/*  289 */     dfh dfh = dfo.c();
/*  290 */     RenderSystem.enableAlphaTest();
/*  291 */     RenderSystem.disableCull();
/*  292 */     RenderSystem.normal3f(0.0F, 1.0F, 0.0F);
/*  293 */     RenderSystem.enableBlend();
/*  294 */     RenderSystem.defaultBlendFunc();
/*  295 */     RenderSystem.defaultAlphaFunc();
/*  296 */     RenderSystem.enableDepthTest();
/*      */     
/*  298 */     int m = 5;
/*  299 */     if (djz.z()) {
/*  300 */       m = 10;
/*      */     }
/*      */     
/*  303 */     RenderSystem.depthMask(djz.A());
/*      */     
/*  305 */     int n = -1;
/*  306 */     float f2 = this.z + f;
/*      */     
/*  308 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  309 */     fx.a a = new fx.a();
/*  310 */     for (int i1 = k - m; i1 <= k + m; i1++) {
/*  311 */       for (int i2 = i - m; i2 <= i + m; i2++) {
/*  312 */         int i3 = (i1 - k + 16) * 32 + i2 - i + 16;
/*  313 */         double d4 = this.aq[i3] * 0.5D;
/*  314 */         double d5 = this.ar[i3] * 0.5D;
/*  315 */         a.d(i2, 0, i1);
/*  316 */         bsv bsv = brx.v(a);
/*  317 */         if (bsv.c() != bsv.e.a) {
/*      */ 
/*      */ 
/*      */           
/*  321 */           int i4 = brx.a(chn.a.e, a).v();
/*      */           
/*  323 */           int i5 = j - m;
/*  324 */           int i6 = j + m;
/*      */           
/*  326 */           if (i5 < i4) {
/*  327 */             i5 = i4;
/*      */           }
/*  329 */           if (i6 < i4) {
/*  330 */             i6 = i4;
/*      */           }
/*      */           
/*  333 */           int i7 = i4;
/*  334 */           if (i7 < j) {
/*  335 */             i7 = j;
/*      */           }
/*      */           
/*  338 */           if (i5 != i6) {
/*  339 */             Random random = new Random((i2 * i2 * 3121 + i2 * 45238971 ^ i1 * i1 * 418711 + i1 * 13761));
/*      */             
/*  341 */             a.d(i2, i5, i1);
/*  342 */             float f3 = bsv.a(a);
/*      */             
/*  344 */             if (f3 >= 0.15F) {
/*  345 */               if (n != 0) {
/*  346 */                 if (n >= 0) {
/*  347 */                   dfo.b();
/*      */                 }
/*  349 */                 n = 0;
/*  350 */                 this.j.M().a(h);
/*  351 */                 dfh.a(7, dfk.j);
/*      */               } 
/*      */               
/*  354 */               int i8 = this.z + i2 * i2 * 3121 + i2 * 45238971 + i1 * i1 * 418711 + i1 * 13761 & 0x1F;
/*      */               
/*  356 */               float f4 = -(i8 + f) / 32.0F * (3.0F + random.nextFloat());
/*      */               
/*  358 */               double d6 = (i2 + 0.5F) - d1;
/*  359 */               double d7 = (i1 + 0.5F) - d3;
/*  360 */               float f5 = afm.a(d6 * d6 + d7 * d7) / m;
/*      */               
/*  362 */               float f6 = ((1.0F - f5 * f5) * 0.5F + 0.5F) * f1;
/*      */               
/*  364 */               a.d(i2, i7, i1);
/*  365 */               int i9 = a(brx, a);
/*      */               
/*  367 */               dfh.a(i2 - d1 - d4 + 0.5D, i6 - d2, i1 - d3 - d5 + 0.5D).a(0.0F, i5 * 0.25F + f4).a(1.0F, 1.0F, 1.0F, f6).a(i9).d();
/*  368 */               dfh.a(i2 - d1 + d4 + 0.5D, i6 - d2, i1 - d3 + d5 + 0.5D).a(1.0F, i5 * 0.25F + f4).a(1.0F, 1.0F, 1.0F, f6).a(i9).d();
/*  369 */               dfh.a(i2 - d1 + d4 + 0.5D, i5 - d2, i1 - d3 + d5 + 0.5D).a(1.0F, i6 * 0.25F + f4).a(1.0F, 1.0F, 1.0F, f6).a(i9).d();
/*  370 */               dfh.a(i2 - d1 - d4 + 0.5D, i5 - d2, i1 - d3 - d5 + 0.5D).a(0.0F, i6 * 0.25F + f4).a(1.0F, 1.0F, 1.0F, f6).a(i9).d();
/*      */             } else {
/*  372 */               if (n != 1) {
/*  373 */                 if (n >= 0) {
/*  374 */                   dfo.b();
/*      */                 }
/*  376 */                 n = 1;
/*  377 */                 this.j.M().a(i);
/*      */                 
/*  379 */                 dfh.a(7, dfk.j);
/*      */               } 
/*  381 */               float f4 = -((this.z & 0x1FF) + f) / 512.0F;
/*      */               
/*  383 */               float f5 = (float)(random.nextDouble() + f2 * 0.01D * (float)random.nextGaussian());
/*  384 */               float f6 = (float)(random.nextDouble() + (f2 * (float)random.nextGaussian()) * 0.001D);
/*      */               
/*  386 */               double d6 = (i2 + 0.5F) - d1;
/*  387 */               double d7 = (i1 + 0.5F) - d3;
/*  388 */               float f7 = afm.a(d6 * d6 + d7 * d7) / m;
/*      */               
/*  390 */               float f8 = ((1.0F - f7 * f7) * 0.3F + 0.5F) * f1;
/*      */               
/*  392 */               a.d(i2, i7, i1);
/*  393 */               int i8 = a(brx, a);
/*      */               
/*  395 */               int i9 = i8 >> 16 & 0xFFFF;
/*  396 */               int i10 = (i8 & 0xFFFF) * 3;
/*      */               
/*  398 */               int i11 = (i9 * 3 + 240) / 4;
/*  399 */               int i12 = (i10 * 3 + 240) / 4;
/*      */               
/*  401 */               dfh.a(i2 - d1 - d4 + 0.5D, i6 - d2, i1 - d3 - d5 + 0.5D).a(0.0F + f5, i5 * 0.25F + f4 + f6).a(1.0F, 1.0F, 1.0F, f8).b(i12, i11).d();
/*  402 */               dfh.a(i2 - d1 + d4 + 0.5D, i6 - d2, i1 - d3 + d5 + 0.5D).a(1.0F + f5, i5 * 0.25F + f4 + f6).a(1.0F, 1.0F, 1.0F, f8).b(i12, i11).d();
/*  403 */               dfh.a(i2 - d1 + d4 + 0.5D, i5 - d2, i1 - d3 + d5 + 0.5D).a(1.0F + f5, i6 * 0.25F + f4 + f6).a(1.0F, 1.0F, 1.0F, f8).b(i12, i11).d();
/*  404 */               dfh.a(i2 - d1 - d4 + 0.5D, i5 - d2, i1 - d3 - d5 + 0.5D).a(0.0F + f5, i6 * 0.25F + f4 + f6).a(1.0F, 1.0F, 1.0F, f8).b(i12, i11).d();
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*  409 */     }  if (n >= 0) {
/*  410 */       dfo.b();
/*      */     }
/*      */     
/*  413 */     RenderSystem.enableCull();
/*  414 */     RenderSystem.disableBlend();
/*  415 */     RenderSystem.defaultAlphaFunc();
/*  416 */     RenderSystem.disableAlphaTest();
/*  417 */     ☃.b();
/*      */   }
/*      */   
/*      */   public void a(djk ☃) {
/*  421 */     float f = this.j.r.d(1.0F) / (djz.z() ? 1.0F : 2.0F);
/*  422 */     if (f <= 0.0F) {
/*      */       return;
/*      */     }
/*      */     
/*  426 */     Random random = new Random(this.z * 312987231L);
/*  427 */     brz brz = this.j.r;
/*  428 */     fx fx1 = new fx(☃.b());
/*      */     
/*  430 */     fx fx2 = null;
/*      */     
/*  432 */     int i = (int)(100.0F * f * f) / ((this.j.k.aT == dke.b) ? 2 : 1);
/*  433 */     for (int j = 0; j < i; j++) {
/*  434 */       int k = random.nextInt(21) - 10;
/*  435 */       int m = random.nextInt(21) - 10;
/*      */ 
/*      */       
/*  438 */       fx fx = brz.a(chn.a.e, fx1.b(k, 0, m)).c();
/*  439 */       bsv bsv = brz.v(fx);
/*  440 */       if (fx.v() > 0 && fx.v() <= fx1.v() + 10 && fx.v() >= fx1.v() - 10 && bsv.c() == bsv.e.b && bsv.a(fx) >= 0.15F) {
/*  441 */         fx2 = fx;
/*      */         
/*  443 */         if (this.j.k.aT == dke.c) {
/*      */           break;
/*      */         }
/*      */ 
/*      */         
/*  448 */         double d1 = random.nextDouble();
/*  449 */         double d2 = random.nextDouble();
/*      */         
/*  451 */         ceh ceh = brz.d_(fx2);
/*  452 */         cux cux = brz.b(fx2);
/*  453 */         ddh ddh = ceh.k(brz, fx2);
/*      */         
/*  455 */         double d3 = ddh.b(gc.a.b, d1, d2);
/*  456 */         double d4 = cux.a(brz, fx2);
/*  457 */         double d5 = Math.max(d3, d4);
/*      */         
/*  459 */         hf hf = (cux.a(aef.c) || ceh.a(bup.iJ) || buy.g(ceh)) ? hh.S : hh.R;
/*  460 */         this.j.r.a(hf, fx2.u() + d1, fx2.v() + d5, fx2.w() + d2, 0.0D, 0.0D, 0.0D);
/*      */       } 
/*      */     } 
/*      */     
/*  464 */     if (fx2 != null && random.nextInt(3) < this.ap++) {
/*  465 */       this.ap = 0;
/*  466 */       if (fx2.v() > fx1.v() + 1 && brz.a(chn.a.e, fx1).v() > afm.d(fx1.v())) {
/*      */         
/*  468 */         this.j.r.a(fx2, adq.qE, adr.d, 0.1F, 0.5F, false);
/*      */       } else {
/*  470 */         this.j.r.a(fx2, adq.qD, adr.d, 0.2F, 1.0F, false);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void close() {
/*  478 */     if (this.E != null) {
/*  479 */       this.E.close();
/*      */     }
/*      */     
/*  482 */     if (this.K != null) {
/*  483 */       this.K.close();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ach ☃) {
/*  489 */     this.k.a(g);
/*  490 */     RenderSystem.texParameter(3553, 10242, 10497);
/*  491 */     RenderSystem.texParameter(3553, 10243, 10497);
/*  492 */     RenderSystem.bindTexture(0);
/*      */     
/*  494 */     a();
/*  495 */     if (djz.A()) {
/*  496 */       v();
/*      */     }
/*      */   }
/*      */   
/*      */   public void a() {
/*  501 */     if (this.E != null) {
/*  502 */       this.E.close();
/*      */     }
/*  504 */     vk ☃ = new vk("shaders/post/entity_outline.json");
/*      */     try {
/*  506 */       this.E = new eaj(this.j.M(), this.j.N(), this.j.f(), ☃);
/*  507 */       this.E.a(this.j.aD().k(), this.j.aD().l());
/*  508 */       this.D = this.E.a("final");
/*  509 */     } catch (IOException iOException) {
/*  510 */       b.warn("Failed to load shader: {}", ☃, iOException);
/*  511 */       this.E = null;
/*  512 */       this.D = null;
/*  513 */     } catch (JsonSyntaxException jsonSyntaxException) {
/*  514 */       b.warn("Failed to parse shader: {}", ☃, jsonSyntaxException);
/*  515 */       this.E = null;
/*  516 */       this.D = null;
/*      */     } 
/*      */   }
/*      */   
/*      */   private void v() {
/*  521 */     w();
/*      */     
/*  523 */     vk ☃ = new vk("shaders/post/transparency.json");
/*      */     try {
/*  525 */       eaj eaj1 = new eaj(this.j.M(), this.j.N(), this.j.f(), ☃);
/*  526 */       eaj1.a(this.j.aD().k(), this.j.aD().l());
/*      */       
/*  528 */       deg deg1 = eaj1.a("translucent");
/*  529 */       deg deg2 = eaj1.a("itemEntity");
/*  530 */       deg deg3 = eaj1.a("particles");
/*  531 */       deg deg4 = eaj1.a("weather");
/*  532 */       deg deg5 = eaj1.a("clouds");
/*      */       
/*  534 */       this.K = eaj1;
/*  535 */       this.F = deg1;
/*  536 */       this.G = deg2;
/*  537 */       this.H = deg3;
/*  538 */       this.I = deg4;
/*  539 */       this.J = deg5;
/*  540 */     } catch (Exception exception) {
/*  541 */       String str1 = (exception instanceof JsonSyntaxException) ? "parse" : "load";
/*  542 */       String str2 = "Failed to " + str1 + " shader: " + ☃;
/*  543 */       b b = new b(str2, exception);
/*      */ 
/*      */       
/*  546 */       if (this.j.O().d().size() > 1) {
/*      */         nr nr;
/*      */         try {
/*  549 */           nr = new oe(this.j.N().a(☃).d());
/*  550 */         } catch (IOException iOException) {
/*  551 */           nr = null;
/*      */         } 
/*      */         
/*  554 */         this.j.k.f = djt.b;
/*  555 */         this.j.a(b, nr);
/*      */       } else {
/*  557 */         l l = this.j.c(new l(str2, b));
/*      */ 
/*      */         
/*  560 */         this.j.k.f = djt.b;
/*  561 */         this.j.k.b();
/*      */ 
/*      */         
/*  564 */         b.fatal(str2, b);
/*  565 */         this.j.m();
/*  566 */         djz.b(l);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private void w() {
/*  572 */     if (this.K != null) {
/*  573 */       this.K.close();
/*      */       
/*  575 */       this.F.a();
/*  576 */       this.G.a();
/*  577 */       this.H.a();
/*  578 */       this.I.a();
/*  579 */       this.J.a();
/*      */       
/*  581 */       this.K = null;
/*  582 */       this.F = null;
/*  583 */       this.G = null;
/*  584 */       this.H = null;
/*  585 */       this.I = null;
/*  586 */       this.J = null;
/*      */     } 
/*      */   }
/*      */   
/*      */   public void b() {
/*  591 */     if (d()) {
/*  592 */       RenderSystem.enableBlend();
/*  593 */       RenderSystem.blendFuncSeparate(dem.r.l, dem.j.j, dem.r.o, dem.j.e);
/*  594 */       this.D.c(this.j.aD().k(), this.j.aD().l(), false);
/*  595 */       RenderSystem.disableBlend();
/*      */     } 
/*      */   }
/*      */   
/*      */   protected boolean d() {
/*  600 */     return (this.D != null && this.E != null && this.j.s != null);
/*      */   }
/*      */   
/*      */   private void x() {
/*  604 */     dfo ☃ = dfo.a();
/*  605 */     dfh dfh = ☃.c();
/*      */     
/*  607 */     if (this.v != null) {
/*  608 */       this.v.close();
/*      */     }
/*      */     
/*  611 */     this.v = new dfp(this.s);
/*  612 */     a(dfh, -16.0F, true);
/*  613 */     dfh.c();
/*  614 */     this.v.a(dfh);
/*      */   }
/*      */   
/*      */   private void y() {
/*  618 */     dfo ☃ = dfo.a();
/*  619 */     dfh dfh = ☃.c();
/*      */     
/*  621 */     if (this.u != null) {
/*  622 */       this.u.close();
/*      */     }
/*      */     
/*  625 */     this.u = new dfp(this.s);
/*  626 */     a(dfh, 16.0F, false);
/*  627 */     dfh.c();
/*  628 */     this.u.a(dfh);
/*      */   }
/*      */   
/*      */   private void a(dfh ☃, float f, boolean bool) {
/*  632 */     int i = 64;
/*  633 */     int j = 6;
/*  634 */     ☃.a(7, dfk.k);
/*  635 */     for (int k = -384; k <= 384; k += 64) {
/*  636 */       for (int m = -384; m <= 384; m += 64) {
/*  637 */         float f1 = k;
/*  638 */         float f2 = (k + 64);
/*  639 */         if (bool) {
/*  640 */           f2 = k;
/*  641 */           f1 = (k + 64);
/*      */         } 
/*  643 */         ☃.a(f1, f, m).d();
/*  644 */         ☃.a(f2, f, m).d();
/*  645 */         ☃.a(f2, f, (m + 64)).d();
/*  646 */         ☃.a(f1, f, (m + 64)).d();
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private void z() {
/*  652 */     dfo ☃ = dfo.a();
/*  653 */     dfh dfh = ☃.c();
/*      */     
/*  655 */     if (this.t != null) {
/*  656 */       this.t.close();
/*      */     }
/*      */     
/*  659 */     this.t = new dfp(this.s);
/*  660 */     a(dfh);
/*  661 */     dfh.c();
/*  662 */     this.t.a(dfh);
/*      */   }
/*      */   
/*      */   private void a(dfh ☃) {
/*  666 */     Random random = new Random(10842L);
/*      */     
/*  668 */     ☃.a(7, dfk.k);
/*  669 */     for (int i = 0; i < 1500; i++) {
/*  670 */       double d1 = (random.nextFloat() * 2.0F - 1.0F);
/*  671 */       double d2 = (random.nextFloat() * 2.0F - 1.0F);
/*  672 */       double d3 = (random.nextFloat() * 2.0F - 1.0F);
/*  673 */       double d4 = (0.15F + random.nextFloat() * 0.1F);
/*  674 */       double d5 = d1 * d1 + d2 * d2 + d3 * d3;
/*  675 */       if (d5 < 1.0D && d5 > 0.01D) {
/*  676 */         d5 = 1.0D / Math.sqrt(d5);
/*  677 */         d1 *= d5;
/*  678 */         d2 *= d5;
/*  679 */         d3 *= d5;
/*  680 */         double d6 = d1 * 100.0D;
/*  681 */         double d7 = d2 * 100.0D;
/*  682 */         double d8 = d3 * 100.0D;
/*      */         
/*  684 */         double d9 = Math.atan2(d1, d3);
/*  685 */         double d10 = Math.sin(d9);
/*  686 */         double d11 = Math.cos(d9);
/*      */         
/*  688 */         double d12 = Math.atan2(Math.sqrt(d1 * d1 + d3 * d3), d2);
/*  689 */         double d13 = Math.sin(d12);
/*  690 */         double d14 = Math.cos(d12);
/*      */         
/*  692 */         double d15 = random.nextDouble() * Math.PI * 2.0D;
/*  693 */         double d16 = Math.sin(d15);
/*  694 */         double d17 = Math.cos(d15);
/*      */         
/*  696 */         for (int j = 0; j < 4; j++) {
/*  697 */           double d18 = 0.0D;
/*  698 */           double d19 = ((j & 0x2) - 1) * d4;
/*  699 */           double d20 = ((j + 1 & 0x2) - 1) * d4;
/*      */           
/*  701 */           double d21 = 0.0D;
/*  702 */           double d22 = d19 * d17 - d20 * d16;
/*  703 */           double d23 = d20 * d17 + d19 * d16;
/*      */           
/*  705 */           double d24 = d23;
/*  706 */           double d25 = d22 * d13 + 0.0D * d14;
/*  707 */           double d26 = 0.0D * d13 - d22 * d14;
/*      */           
/*  709 */           double d27 = d26 * d10 - d24 * d11;
/*  710 */           double d28 = d25;
/*  711 */           double d29 = d24 * d10 + d26 * d11;
/*      */           
/*  713 */           ☃.a(d6 + d27, d7 + d28, d8 + d29).d();
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a(@Nullable dwt ☃) {
/*  720 */     this.L = Double.MIN_VALUE;
/*  721 */     this.M = Double.MIN_VALUE;
/*  722 */     this.N = Double.MIN_VALUE;
/*  723 */     this.O = Integer.MIN_VALUE;
/*  724 */     this.P = Integer.MIN_VALUE;
/*  725 */     this.Q = Integer.MIN_VALUE;
/*      */     
/*  727 */     this.l.a(☃);
/*  728 */     this.n = ☃;
/*  729 */     if (☃ != null) {
/*  730 */       e();
/*      */     } else {
/*  732 */       this.o.clear();
/*  733 */       this.p.clear();
/*  734 */       if (this.r != null) {
/*  735 */         this.r.a();
/*  736 */         this.r = null;
/*      */       } 
/*  738 */       if (this.ab != null) {
/*  739 */         this.ab.g();
/*      */       }
/*  741 */       this.ab = null;
/*  742 */       this.q.clear();
/*      */     } 
/*      */   }
/*      */   
/*      */   public void e() {
/*  747 */     if (this.n == null) {
/*      */       return;
/*      */     }
/*      */     
/*  751 */     if (djz.A()) {
/*  752 */       v();
/*      */     } else {
/*  754 */       w();
/*      */     } 
/*      */     
/*  757 */     this.n.i();
/*      */     
/*  759 */     if (this.ab == null) {
/*  760 */       this.ab = new ecu(this.n, this, x.f(), this.j.S(), this.m.a());
/*      */     } else {
/*  762 */       this.ab.a(this.n);
/*      */     } 
/*  764 */     this.an = true;
/*  765 */     this.w = true;
/*      */     
/*  767 */     eab.a(djz.z());
/*      */     
/*  769 */     this.ad = this.j.k.b;
/*      */     
/*  771 */     if (this.r != null) {
/*  772 */       this.r.a();
/*      */     }
/*      */     
/*  775 */     f();
/*      */     
/*  777 */     synchronized (this.q) {
/*  778 */       this.q.clear();
/*      */     } 
/*      */     
/*  781 */     this.r = new eat(this.ab, this.n, this.j.k.b, this);
/*      */     
/*  783 */     if (this.n != null) {
/*  784 */       aqa ☃ = this.j.aa();
/*  785 */       if (☃ != null) {
/*  786 */         this.r.a(☃.cD(), ☃.cH());
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void f() {
/*  792 */     this.o.clear();
/*  793 */     this.ab.e();
/*      */   }
/*      */   
/*      */   public void a(int ☃, int i) {
/*  797 */     o();
/*      */     
/*  799 */     if (this.E != null) {
/*  800 */       this.E.a(☃, i);
/*      */     }
/*  802 */     if (this.K != null) {
/*  803 */       this.K.a(☃, i);
/*      */     }
/*      */   }
/*      */   
/*      */   public String g() {
/*  808 */     int ☃ = this.r.f.length;
/*  809 */     int i = h();
/*      */     
/*  811 */     return String.format("C: %d/%d %sD: %d, %s", new Object[] {
/*  812 */           Integer.valueOf(i), 
/*  813 */           Integer.valueOf(☃), this.j.E ? "(s) " : "", 
/*      */           
/*  815 */           Integer.valueOf(this.ad), (this.ab == null) ? "null" : this.ab
/*  816 */           .b()
/*      */         });
/*      */   }
/*      */   
/*      */   protected int h() {
/*  821 */     int ☃ = 0;
/*  822 */     for (ObjectListIterator<a> objectListIterator = this.p.iterator(); objectListIterator.hasNext(); ) { a a = objectListIterator.next();
/*  823 */       if (!a.a(a).c().a()) {
/*  824 */         ☃++;
/*      */       } }
/*      */     
/*  827 */     return ☃;
/*      */   }
/*      */   
/*      */   public String i() {
/*  831 */     return "E: " + this.ae + "/" + this.n.j() + ", B: " + this.af;
/*      */   }
/*      */   
/*      */   private void a(djk ☃, ecz ecz1, boolean bool1, int i, boolean bool2) {
/*  835 */     dcn dcn1 = ☃.b();
/*      */     
/*  837 */     if (this.j.k.b != this.ad) {
/*  838 */       e();
/*      */     }
/*      */     
/*  841 */     this.n.Z().a("camera");
/*  842 */     double d1 = this.j.s.cD() - this.L;
/*  843 */     double d2 = this.j.s.cE() - this.M;
/*  844 */     double d3 = this.j.s.cH() - this.N;
/*  845 */     if (this.O != this.j.s.V || this.P != this.j.s.W || this.Q != this.j.s.X || d1 * d1 + d2 * d2 + d3 * d3 > 16.0D) {
/*  846 */       this.L = this.j.s.cD();
/*  847 */       this.M = this.j.s.cE();
/*  848 */       this.N = this.j.s.cH();
/*  849 */       this.O = this.j.s.V;
/*  850 */       this.P = this.j.s.W;
/*  851 */       this.Q = this.j.s.X;
/*      */       
/*  853 */       this.r.a(this.j.s.cD(), this.j.s.cH());
/*      */     } 
/*      */     
/*  856 */     this.ab.a(dcn1);
/*      */     
/*  858 */     this.n.Z().b("cull");
/*      */     
/*  860 */     this.j.au().b("culling");
/*      */ 
/*      */     
/*  863 */     fx fx1 = ☃.c();
/*  864 */     ecu.c c = this.r.a(fx1);
/*  865 */     int j = 16;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  870 */     fx fx2 = new fx(afm.c(dcn1.b / 16.0D) * 16, afm.c(dcn1.c / 16.0D) * 16, afm.c(dcn1.d / 16.0D) * 16);
/*      */ 
/*      */     
/*  873 */     float f1 = ☃.d();
/*  874 */     float f2 = ☃.e();
/*      */     
/*  876 */     this.an = (this.an || !this.o.isEmpty() || dcn1.b != this.R || dcn1.c != this.S || dcn1.d != this.T || f1 != this.U || f2 != this.V);
/*      */     
/*  878 */     this.R = dcn1.b;
/*  879 */     this.S = dcn1.c;
/*  880 */     this.T = dcn1.d;
/*  881 */     this.U = f1;
/*  882 */     this.V = f2;
/*      */     
/*  884 */     this.j.au().b("update");
/*  885 */     if (!bool1 && this.an) {
/*  886 */       this.an = false;
/*  887 */       this.p.clear();
/*      */       
/*  889 */       Queue<a> queue = Queues.newArrayDeque();
/*      */       
/*  891 */       aqa.b(afm.a(this.j.k.b / 8.0D, 1.0D, 2.5D) * this.j.k.c);
/*  892 */       boolean bool = this.j.E;
/*      */ 
/*      */       
/*  895 */       if (c == null) {
/*      */         
/*  897 */         int k = (fx1.v() > 0) ? 248 : 8;
/*      */         
/*  899 */         int m = afm.c(dcn1.b / 16.0D) * 16;
/*  900 */         int n = afm.c(dcn1.d / 16.0D) * 16;
/*      */         
/*  902 */         List<a> list = Lists.newArrayList();
/*  903 */         for (int i1 = -this.ad; i1 <= this.ad; i1++) {
/*  904 */           for (int i2 = -this.ad; i2 <= this.ad; i2++) {
/*  905 */             ecu.c c1 = this.r.a(new fx(m + (i1 << 4) + 8, k, n + (i2 << 4) + 8));
/*  906 */             if (c1 != null && ecz1.a(c1.b)) {
/*  907 */               c1.a(i);
/*  908 */               list.add(new a(c1, null, 0));
/*      */             } 
/*      */           } 
/*      */         } 
/*      */         
/*  913 */         list.sort(Comparator.comparingDouble(a1 -> ☃.j(a.a(a1).e().b(8, 8, 8))));
/*  914 */         queue.addAll(list);
/*      */       } else {
/*  916 */         if (bool2 && this.n.d_(fx1).i(this.n, fx1)) {
/*  917 */           bool = false;
/*      */         }
/*      */         
/*  920 */         c.a(i);
/*  921 */         queue.add(new a(c, null, 0));
/*      */       } 
/*      */       
/*  924 */       this.j.au().a("iteration");
/*  925 */       while (!queue.isEmpty()) {
/*  926 */         a a = queue.poll();
/*  927 */         ecu.c c1 = a.a(a);
/*  928 */         gc gc1 = a.b(a);
/*      */         
/*  930 */         this.p.add(a);
/*      */         
/*  932 */         for (gc gc2 : a) {
/*  933 */           ecu.c c2 = a(fx2, c1, gc2);
/*  934 */           if (!bool || !a.a(gc2.f()))
/*      */           {
/*      */ 
/*      */             
/*  938 */             if (!bool || gc1 == null || c1.c().a(gc1.f(), gc2))
/*      */             {
/*      */ 
/*      */               
/*  942 */               if (c2 != null)
/*      */               {
/*      */ 
/*      */                 
/*  946 */                 if (c2.a())
/*      */                 {
/*      */ 
/*      */                   
/*  950 */                   if (c2.a(i))
/*      */                   {
/*      */ 
/*      */                     
/*  954 */                     if (ecz1.a(c2.b)) {
/*      */ 
/*      */ 
/*      */                       
/*  958 */                       a a1 = new a(c2, gc2, a.c(a) + 1);
/*  959 */                       a1.a(a.d(a), gc2);
/*      */                       
/*  961 */                       queue.add(a1);
/*      */                     }  }  }  }  }  } 
/*      */         } 
/*  964 */       }  this.j.au().c();
/*      */     } 
/*      */     
/*  967 */     this.j.au().b("rebuildNear");
/*  968 */     Set<ecu.c> set = this.o;
/*  969 */     this.o = Sets.newLinkedHashSet();
/*  970 */     for (ObjectListIterator<a> objectListIterator = this.p.iterator(); objectListIterator.hasNext(); ) { a a = objectListIterator.next();
/*  971 */       ecu.c c1 = a.a(a);
/*  972 */       if (c1.g() || set.contains(c1)) {
/*  973 */         this.an = true;
/*      */         
/*  975 */         fx fx = c1.e().b(8, 8, 8);
/*  976 */         boolean bool = (fx.j(fx1) < 768.0D);
/*  977 */         if (c1.h() || bool) {
/*  978 */           this.j.au().a("build near");
/*  979 */           this.ab.a(c1);
/*  980 */           c1.f();
/*  981 */           this.j.au().c(); continue;
/*      */         } 
/*  983 */         this.o.add(c1);
/*      */       }  }
/*      */ 
/*      */     
/*  987 */     this.o.addAll(set);
/*      */     
/*  989 */     this.j.au().c();
/*      */   }
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
/*      */   @Nullable
/*      */   private ecu.c a(fx ☃, ecu.c c1, gc gc1) {
/* 1005 */     fx fx1 = c1.a(gc1);
/*      */ 
/*      */     
/* 1008 */     if (afm.a(☃.u() - fx1.u()) > this.ad * 16) {
/* 1009 */       return null;
/*      */     }
/* 1011 */     if (fx1.v() < 0 || fx1.v() >= 256) {
/* 1012 */       return null;
/*      */     }
/* 1014 */     if (afm.a(☃.w() - fx1.w()) > this.ad * 16) {
/* 1015 */       return null;
/*      */     }
/*      */ 
/*      */     
/* 1019 */     return this.r.a(fx1);
/*      */   }
/*      */   
/*      */   private void a(b ☃, b b1, double d1, double d2, double d3, ecz ecz1) {
/* 1023 */     this.ah = ecz1;
/*      */     
/* 1025 */     b b2 = b1.d();
/* 1026 */     b2.a(☃);
/* 1027 */     b2.c();
/*      */     
/* 1029 */     this.aj.a = d1;
/* 1030 */     this.aj.b = d2;
/* 1031 */     this.aj.c = d3;
/*      */ 
/*      */     
/* 1034 */     this.ai[0] = new h(-1.0F, -1.0F, -1.0F, 1.0F);
/* 1035 */     this.ai[1] = new h(1.0F, -1.0F, -1.0F, 1.0F);
/* 1036 */     this.ai[2] = new h(1.0F, 1.0F, -1.0F, 1.0F);
/* 1037 */     this.ai[3] = new h(-1.0F, 1.0F, -1.0F, 1.0F);
/*      */ 
/*      */     
/* 1040 */     this.ai[4] = new h(-1.0F, -1.0F, 1.0F, 1.0F);
/* 1041 */     this.ai[5] = new h(1.0F, -1.0F, 1.0F, 1.0F);
/* 1042 */     this.ai[6] = new h(1.0F, 1.0F, 1.0F, 1.0F);
/* 1043 */     this.ai[7] = new h(-1.0F, 1.0F, 1.0F, 1.0F);
/*      */     
/* 1045 */     for (int i = 0; i < 8; i++) {
/* 1046 */       this.ai[i].a(b2);
/* 1047 */       this.ai[i].f();
/*      */     } 
/*      */   }
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
/*      */   public void a(dfm ☃, float f, long l, boolean bool, djk djk1, dzz dzz1, eaf eaf1, b b1) {
/*      */     ecz ecz1;
/*      */     long l2;
/* 1083 */     ecd.a.a(this.n, this.j.M(), this.j.g, djk1, this.j.v);
/* 1084 */     this.l.a(this.n, djk1, this.j.u);
/*      */     
/* 1086 */     anw anw = this.n.Z();
/* 1087 */     anw.b("light_updates");
/* 1088 */     this.j.r.n().l().a(2147483647, true, true);
/*      */     
/* 1090 */     dcn dcn1 = djk1.b();
/* 1091 */     double d1 = dcn1.a();
/* 1092 */     double d2 = dcn1.b();
/* 1093 */     double d3 = dcn1.c();
/*      */     
/* 1095 */     b b2 = ☃.c().a();
/*      */     
/* 1097 */     anw.b("culling");
/* 1098 */     boolean bool1 = (this.ah != null);
/*      */ 
/*      */     
/* 1101 */     if (bool1) {
/* 1102 */       ecz1 = this.ah;
/* 1103 */       ecz1.a(this.aj.a, this.aj.b, this.aj.c);
/*      */     } else {
/* 1105 */       ecz1 = new ecz(b2, b1);
/* 1106 */       ecz1.a(d1, d2, d3);
/*      */     } 
/*      */     
/* 1109 */     this.j.au().b("captureFrustum");
/* 1110 */     if (this.ag) {
/* 1111 */       a(b2, b1, dcn1.b, dcn1.c, dcn1.d, bool1 ? new ecz(b2, b1) : ecz1);
/* 1112 */       this.ag = false;
/*      */     } 
/*      */     
/* 1115 */     anw.b("clear");
/* 1116 */     dzy.a(djk1, f, this.j.r, this.j.k.b, dzz1.b(f));
/* 1117 */     RenderSystem.clear(16640, djz.a);
/*      */     
/* 1119 */     float f1 = dzz1.j();
/* 1120 */     boolean bool2 = (this.j.r.a().a(afm.c(d1), afm.c(d2)) || this.j.j.i().e());
/*      */     
/* 1122 */     if (this.j.k.b >= 4) {
/* 1123 */       dzy.a(djk1, dzy.a.a, f1, bool2);
/* 1124 */       anw.b("sky");
/* 1125 */       a(☃, f);
/*      */     } 
/* 1127 */     anw.b("fog");
/* 1128 */     dzy.a(djk1, dzy.a.b, Math.max(f1 - 16.0F, 32.0F), bool2);
/* 1129 */     anw.b("terrain_setup");
/*      */     
/* 1131 */     a(djk1, ecz1, bool1, this.ao++, this.j.s.a_());
/*      */     
/* 1133 */     anw.b("updatechunks");
/*      */     
/* 1135 */     int i = 30;
/* 1136 */     int j = this.j.k.d;
/* 1137 */     long l1 = 33333333L;
/*      */     
/* 1139 */     if (j == dkc.l.d()) {
/* 1140 */       l2 = 0L;
/*      */     } else {
/* 1142 */       l2 = (1000000000 / j);
/*      */     } 
/* 1144 */     long l3 = x.c() - l;
/* 1145 */     long l4 = this.y.a(l3);
/*      */     
/* 1147 */     long l5 = l4 * 3L / 2L;
/* 1148 */     long l6 = afm.a(l5, l2, 33333333L);
/* 1149 */     a(l + l6);
/*      */     
/* 1151 */     anw.b("terrain");
/*      */     
/* 1153 */     a(eao.c(), ☃, d1, d2, d3);
/* 1154 */     a(eao.d(), ☃, d1, d2, d3);
/* 1155 */     a(eao.e(), ☃, d1, d2, d3);
/*      */     
/* 1157 */     if (this.n.a().e()) {
/* 1158 */       dep.a(☃.c().a());
/*      */     } else {
/* 1160 */       dep.b(☃.c().a());
/*      */     } 
/*      */     
/* 1163 */     anw.b("entities");
/*      */     
/* 1165 */     this.ae = 0;
/* 1166 */     this.af = 0;
/*      */     
/* 1168 */     if (this.G != null) {
/* 1169 */       this.G.b(djz.a);
/* 1170 */       this.G.a(this.j.f());
/* 1171 */       this.j.f().a(false);
/*      */     } 
/*      */     
/* 1174 */     if (this.I != null) {
/* 1175 */       this.I.b(djz.a);
/*      */     }
/*      */     
/* 1178 */     if (d()) {
/* 1179 */       this.D.b(djz.a);
/* 1180 */       this.j.f().a(false);
/*      */     } 
/*      */     
/* 1183 */     boolean bool3 = false;
/*      */     
/* 1185 */     eag.a a = this.m.b();
/*      */     
/* 1187 */     for (aqa aqa : this.n.b()) {
/* 1188 */       eag eag; if (!this.l.a(aqa, ecz1, d1, d2, d3) && !aqa.y(this.j.s)) {
/*      */         continue;
/*      */       }
/* 1191 */       if (aqa == djk1.g() && !djk1.i() && (!(djk1.g() instanceof aqm) || !((aqm)djk1.g()).em())) {
/*      */         continue;
/*      */       }
/* 1194 */       if (aqa instanceof dzm && djk1.g() != aqa) {
/*      */         continue;
/*      */       }
/*      */       
/* 1198 */       this.ae++;
/* 1199 */       if (aqa.K == 0) {
/* 1200 */         aqa.D = aqa.cD();
/* 1201 */         aqa.E = aqa.cE();
/* 1202 */         aqa.F = aqa.cH();
/*      */       } 
/*      */ 
/*      */       
/* 1206 */       if (d() && this.j.b(aqa)) {
/* 1207 */         bool3 = true;
/* 1208 */         eah eah = this.m.d();
/* 1209 */         eag = eah;
/* 1210 */         int k = aqa.U();
/* 1211 */         int m = 255;
/* 1212 */         int n = k >> 16 & 0xFF;
/* 1213 */         int i1 = k >> 8 & 0xFF;
/* 1214 */         int i2 = k & 0xFF;
/* 1215 */         eah.a(n, i1, i2, 255);
/*      */       } else {
/* 1217 */         eag = a;
/*      */       } 
/* 1219 */       a(aqa, d1, d2, d3, f, ☃, eag);
/*      */     } 
/*      */     
/* 1222 */     a(☃);
/*      */     
/* 1224 */     a.a(eao.b(ekb.d));
/* 1225 */     a.a(eao.c(ekb.d));
/* 1226 */     a.a(eao.d(ekb.d));
/* 1227 */     a.a(eao.i(ekb.d));
/*      */     
/* 1229 */     anw.b("blockentities");
/*      */     
/* 1231 */     for (ObjectListIterator<a> objectListIterator = this.p.iterator(); objectListIterator.hasNext(); ) { a a1 = objectListIterator.next();
/* 1232 */       List<ccj> list = a.a(a1).c().b();
/* 1233 */       if (list.isEmpty()) {
/*      */         continue;
/*      */       }
/*      */       
/* 1237 */       for (ccj ccj : list) {
/* 1238 */         fx fx = ccj.o();
/* 1239 */         eag eag = a;
/*      */         
/* 1241 */         ☃.a();
/* 1242 */         ☃.a(fx.u() - d1, fx.v() - d2, fx.w() - d3);
/*      */         
/* 1244 */         SortedSet<zq> sortedSet = (SortedSet<zq>)this.B.get(fx.a());
/* 1245 */         if (sortedSet != null && !sortedSet.isEmpty()) {
/* 1246 */           int k = ((zq)sortedSet.last()).c();
/* 1247 */           if (k >= 0) {
/* 1248 */             dfm.a a2 = ☃.c();
/* 1249 */             dfq dfq = new dfn(this.m.c().getBuffer(els.k.get(k)), a2.a(), a2.b());
/* 1250 */             eag = (eao1 -> {
/*      */                 dfq dfq2 = ☃.getBuffer(eao1);
/*      */ 
/*      */                 
/*      */                 return eao1.A() ? dft.a(dfq1, dfq2) : dfq2;
/*      */               });
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/* 1260 */         ecd.a.a(ccj, f, ☃, eag);
/* 1261 */         ☃.b();
/*      */       }  }
/*      */ 
/*      */     
/* 1265 */     synchronized (this.q) {
/* 1266 */       for (ccj ccj : this.q) {
/* 1267 */         fx fx = ccj.o();
/* 1268 */         ☃.a();
/* 1269 */         ☃.a(fx.u() - d1, fx.v() - d2, fx.w() - d3);
/* 1270 */         ecd.a.a(ccj, f, ☃, a);
/* 1271 */         ☃.b();
/*      */       } 
/*      */     } 
/*      */     
/* 1275 */     a(☃);
/*      */ 
/*      */     
/* 1278 */     a.a(eao.c());
/* 1279 */     a.a(ear.g());
/* 1280 */     a.a(ear.h());
/* 1281 */     a.a(ear.c());
/* 1282 */     a.a(ear.d());
/* 1283 */     a.a(ear.e());
/* 1284 */     a.a(ear.f());
/*      */ 
/*      */     
/* 1287 */     this.m.d().a();
/*      */ 
/*      */     
/* 1290 */     if (bool3) {
/* 1291 */       this.E.a(f);
/* 1292 */       this.j.f().a(false);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1298 */     anw.b("destroyProgress");
/*      */     
/* 1300 */     for (ObjectIterator<Long2ObjectMap.Entry<SortedSet<zq>>> objectIterator = this.B.long2ObjectEntrySet().iterator(); objectIterator.hasNext(); ) { Long2ObjectMap.Entry<SortedSet<zq>> entry = objectIterator.next();
/* 1301 */       fx fx = fx.e(entry.getLongKey());
/*      */       
/* 1303 */       double d4 = fx.u() - d1;
/* 1304 */       double d5 = fx.v() - d2;
/* 1305 */       double d6 = fx.w() - d3;
/* 1306 */       if (d4 * d4 + d5 * d5 + d6 * d6 > 1024.0D) {
/*      */         continue;
/*      */       }
/*      */       
/* 1310 */       SortedSet<zq> sortedSet = (SortedSet<zq>)entry.getValue();
/* 1311 */       if (sortedSet == null || sortedSet.isEmpty()) {
/*      */         continue;
/*      */       }
/* 1314 */       int k = ((zq)sortedSet.last()).c();
/* 1315 */       ☃.a();
/* 1316 */       ☃.a(fx.u() - d1, fx.v() - d2, fx.w() - d3);
/* 1317 */       dfm.a a1 = ☃.c();
/* 1318 */       dfq dfq = new dfn(this.m.c().getBuffer(els.k.get(k)), a1.a(), a1.b());
/* 1319 */       this.j.ab().a(this.n.d_(fx), fx, this.n, ☃, dfq);
/* 1320 */       ☃.b(); }
/*      */ 
/*      */     
/* 1323 */     a(☃);
/*      */     
/* 1325 */     dcl dcl = this.j.v;
/*      */     
/* 1327 */     if (bool && dcl != null && dcl.c() == dcl.a.b) {
/* 1328 */       anw.b("outline");
/* 1329 */       fx fx = ((dcj)dcl).a();
/* 1330 */       ceh ceh = this.n.d_(fx);
/* 1331 */       if (!ceh.g() && this.n.f().a(fx)) {
/* 1332 */         dfq dfq = a.getBuffer(eao.t());
/* 1333 */         a(☃, dfq, djk1.g(), d1, d2, d3, fx, ceh);
/*      */       } 
/*      */     } 
/*      */     
/* 1337 */     RenderSystem.pushMatrix();
/* 1338 */     RenderSystem.multMatrix(☃.c().a());
/*      */     
/* 1340 */     this.j.i.a(☃, a, d1, d2, d3);
/*      */     
/* 1342 */     RenderSystem.popMatrix();
/*      */     
/* 1344 */     a.a(ear.j());
/* 1345 */     a.a(ear.a());
/* 1346 */     a.a(ear.b());
/*      */ 
/*      */     
/* 1349 */     a.a(eao.k());
/* 1350 */     a.a(eao.l());
/* 1351 */     a.a(eao.n());
/* 1352 */     a.a(eao.o());
/* 1353 */     a.a(eao.m());
/* 1354 */     a.a(eao.p());
/* 1355 */     a.a(eao.q());
/*      */ 
/*      */     
/* 1358 */     a.a(eao.j());
/*      */     
/* 1360 */     this.m.c().a();
/*      */     
/* 1362 */     if (this.K != null) {
/* 1363 */       a.a(eao.t());
/* 1364 */       a.a();
/*      */       
/* 1366 */       this.F.b(djz.a);
/* 1367 */       this.F.a(this.j.f());
/*      */       
/* 1369 */       anw.b("translucent");
/* 1370 */       a(eao.f(), ☃, d1, d2, d3);
/*      */       
/* 1372 */       anw.b("string");
/* 1373 */       a(eao.s(), ☃, d1, d2, d3);
/*      */       
/* 1375 */       this.H.b(djz.a);
/* 1376 */       this.H.a(this.j.f());
/* 1377 */       ean.Q.a();
/*      */       
/* 1379 */       anw.b("particles");
/* 1380 */       this.j.f.a(☃, a, eaf1, djk1, f);
/*      */       
/* 1382 */       ean.Q.b();
/*      */     } else {
/* 1384 */       anw.b("translucent");
/* 1385 */       a(eao.f(), ☃, d1, d2, d3);
/*      */       
/* 1387 */       a.a(eao.t());
/* 1388 */       a.a();
/*      */       
/* 1390 */       anw.b("string");
/* 1391 */       a(eao.s(), ☃, d1, d2, d3);
/*      */       
/* 1393 */       anw.b("particles");
/* 1394 */       this.j.f.a(☃, a, eaf1, djk1, f);
/*      */     } 
/*      */     
/* 1397 */     RenderSystem.pushMatrix();
/* 1398 */     RenderSystem.multMatrix(☃.c().a());
/*      */     
/* 1400 */     if (this.j.k.e() != djn.a) {
/* 1401 */       if (this.K != null) {
/* 1402 */         this.J.b(djz.a);
/* 1403 */         ean.S.a();
/*      */         
/* 1405 */         anw.b("clouds");
/* 1406 */         a(☃, f, d1, d2, d3);
/*      */         
/* 1408 */         ean.S.b();
/*      */       } else {
/* 1410 */         anw.b("clouds");
/* 1411 */         a(☃, f, d1, d2, d3);
/*      */       } 
/*      */     }
/*      */     
/* 1415 */     if (this.K != null) {
/* 1416 */       ean.R.a();
/*      */       
/* 1418 */       anw.b("weather");
/* 1419 */       a(eaf1, f, d1, d2, d3);
/* 1420 */       c(djk1);
/*      */       
/* 1422 */       ean.R.b();
/*      */       
/* 1424 */       this.K.a(f);
/* 1425 */       this.j.f().a(false);
/*      */     } else {
/* 1427 */       RenderSystem.depthMask(false);
/*      */       
/* 1429 */       anw.b("weather");
/* 1430 */       a(eaf1, f, d1, d2, d3);
/* 1431 */       c(djk1);
/*      */       
/* 1433 */       RenderSystem.depthMask(true);
/*      */     } 
/*      */     
/* 1436 */     b(djk1);
/*      */     
/* 1438 */     RenderSystem.shadeModel(7424);
/* 1439 */     RenderSystem.depthMask(true);
/* 1440 */     RenderSystem.disableBlend();
/*      */     
/* 1442 */     RenderSystem.popMatrix();
/*      */     
/* 1444 */     dzy.a();
/*      */   }
/*      */   
/*      */   private void a(dfm ☃) {
/* 1448 */     if (!☃.d()) {
/* 1449 */       throw new IllegalStateException("Pose stack not empty");
/*      */     }
/*      */   }
/*      */   
/*      */   private void a(aqa ☃, double d1, double d2, double d3, float f, dfm dfm1, eag eag1) {
/* 1454 */     double d4 = afm.d(f, ☃.D, ☃.cD());
/* 1455 */     double d5 = afm.d(f, ☃.E, ☃.cE());
/* 1456 */     double d6 = afm.d(f, ☃.F, ☃.cH());
/* 1457 */     float f1 = afm.g(f, ☃.r, ☃.p);
/*      */     
/* 1459 */     this.l.a(☃, d4 - d1, d5 - d2, d6 - d3, f1, f, dfm1, eag1, this.l.a(☃, f));
/*      */   }
/*      */   
/*      */   private void a(eao ☃, dfm dfm1, double d1, double d2, double d3) {
/* 1463 */     ☃.a();
/* 1464 */     if (☃ == eao.f()) {
/* 1465 */       this.j.au().a("translucent_sort");
/*      */       
/* 1467 */       double d4 = d1 - this.ak;
/* 1468 */       double d5 = d2 - this.al;
/* 1469 */       double d6 = d3 - this.am;
/* 1470 */       if (d4 * d4 + d5 * d5 + d6 * d6 > 1.0D) {
/* 1471 */         this.ak = d1;
/* 1472 */         this.al = d2;
/* 1473 */         this.am = d3;
/*      */         
/* 1475 */         int i = 0;
/* 1476 */         for (ObjectListIterator<a> objectListIterator1 = this.p.iterator(); objectListIterator1.hasNext(); ) { a a = objectListIterator1.next();
/* 1477 */           if (i < 15 && a.a(a).a(☃, this.ab)) {
/* 1478 */             i++;
/*      */           } }
/*      */       
/*      */       } 
/* 1482 */       this.j.au().c();
/*      */     } 
/*      */     
/* 1485 */     this.j.au().a("filterempty");
/*      */     
/* 1487 */     this.j.au().b(() -> "render_" + ☃);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1497 */     boolean bool = (☃ != eao.f());
/* 1498 */     ObjectListIterator<a> objectListIterator = this.p.listIterator(bool ? 0 : this.p.size());
/*      */     
/* 1500 */     while (bool ? objectListIterator.hasNext() : objectListIterator.hasPrevious()) {
/* 1501 */       a a = bool ? (a)objectListIterator.next() : (a)objectListIterator.previous();
/* 1502 */       ecu.c c = a.a(a);
/*      */       
/* 1504 */       if (c.c().a(☃)) {
/*      */         continue;
/*      */       }
/*      */       
/* 1508 */       dfp dfp1 = c.a(☃);
/*      */       
/* 1510 */       dfm1.a();
/* 1511 */       fx fx = c.e();
/* 1512 */       dfm1.a(fx.u() - d1, fx.v() - d2, fx.w() - d3);
/*      */       
/* 1514 */       dfp1.a();
/*      */       
/* 1516 */       this.ac.a(0L);
/*      */       
/* 1518 */       dfp1.a(dfm1.c().a(), 7);
/*      */       
/* 1520 */       dfm1.b();
/*      */     } 
/*      */     
/* 1523 */     dfp.b();
/*      */     
/* 1525 */     RenderSystem.clearCurrentColor();
/*      */     
/* 1527 */     this.ac.d();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1533 */     this.j.au().c();
/*      */     
/* 1535 */     ☃.b();
/*      */   }
/*      */   
/*      */   private void b(djk ☃) {
/* 1539 */     dfo dfo = dfo.a();
/* 1540 */     dfh dfh = dfo.c();
/*      */     
/* 1542 */     if (this.j.C || this.j.D) {
/* 1543 */       double d1 = ☃.b().a();
/* 1544 */       double d2 = ☃.b().b();
/* 1545 */       double d3 = ☃.b().c();
/*      */       
/* 1547 */       RenderSystem.depthMask(true);
/* 1548 */       RenderSystem.disableCull();
/* 1549 */       RenderSystem.enableBlend();
/* 1550 */       RenderSystem.defaultBlendFunc();
/* 1551 */       RenderSystem.disableTexture();
/* 1552 */       for (ObjectListIterator<a> objectListIterator = this.p.iterator(); objectListIterator.hasNext(); ) { a a = objectListIterator.next();
/* 1553 */         ecu.c c = a.a(a);
/* 1554 */         RenderSystem.pushMatrix();
/* 1555 */         fx fx = c.e();
/* 1556 */         RenderSystem.translated(fx.u() - d1, fx.v() - d2, fx.w() - d3);
/*      */         
/* 1558 */         if (this.j.C) {
/* 1559 */           dfh.a(1, dfk.l);
/* 1560 */           RenderSystem.lineWidth(10.0F);
/* 1561 */           int i = (a.c(a) == 0) ? 0 : afm.f(a.c(a) / 50.0F, 0.9F, 0.9F);
/* 1562 */           int j = i >> 16 & 0xFF;
/* 1563 */           int k = i >> 8 & 0xFF;
/* 1564 */           int m = i & 0xFF;
/* 1565 */           gc gc1 = a.b(a);
/* 1566 */           if (gc1 != null) {
/* 1567 */             dfh.a(8.0D, 8.0D, 8.0D).a(j, k, m, 255).d();
/* 1568 */             dfh.a((8 - 16 * gc1
/* 1569 */                 .i()), (8 - 16 * gc1
/* 1570 */                 .j()), (8 - 16 * gc1
/* 1571 */                 .k()))
/* 1572 */               .a(j, k, m, 255).d();
/*      */           } 
/* 1574 */           dfo.b();
/* 1575 */           RenderSystem.lineWidth(1.0F);
/*      */         } 
/*      */         
/* 1578 */         if (this.j.D && !c.c().a()) {
/* 1579 */           dfh.a(1, dfk.l);
/* 1580 */           RenderSystem.lineWidth(10.0F);
/*      */           
/* 1582 */           int i = 0;
/* 1583 */           for (gc gc1 : a) {
/* 1584 */             for (gc gc2 : a) {
/* 1585 */               boolean bool = c.c().a(gc1, gc2);
/*      */               
/* 1587 */               if (!bool) {
/* 1588 */                 i++;
/* 1589 */                 dfh.a((8 + 8 * gc1
/* 1590 */                     .i()), (8 + 8 * gc1
/* 1591 */                     .j()), (8 + 8 * gc1
/* 1592 */                     .k()))
/* 1593 */                   .a(1, 0, 0, 1).d();
/* 1594 */                 dfh.a((8 + 8 * gc2
/* 1595 */                     .i()), (8 + 8 * gc2
/* 1596 */                     .j()), (8 + 8 * gc2
/* 1597 */                     .k()))
/* 1598 */                   .a(1, 0, 0, 1).d();
/*      */               } 
/*      */             } 
/*      */           } 
/* 1602 */           dfo.b();
/* 1603 */           RenderSystem.lineWidth(1.0F);
/*      */           
/* 1605 */           if (i > 0) {
/* 1606 */             dfh.a(7, dfk.l);
/*      */             
/* 1608 */             float f1 = 0.5F;
/* 1609 */             float f2 = 0.2F;
/* 1610 */             dfh.a(0.5D, 15.5D, 0.5D).a(0.9F, 0.9F, 0.0F, 0.2F).d();
/* 1611 */             dfh.a(15.5D, 15.5D, 0.5D).a(0.9F, 0.9F, 0.0F, 0.2F).d();
/* 1612 */             dfh.a(15.5D, 15.5D, 15.5D).a(0.9F, 0.9F, 0.0F, 0.2F).d();
/* 1613 */             dfh.a(0.5D, 15.5D, 15.5D).a(0.9F, 0.9F, 0.0F, 0.2F).d();
/*      */             
/* 1615 */             dfh.a(0.5D, 0.5D, 15.5D).a(0.9F, 0.9F, 0.0F, 0.2F).d();
/* 1616 */             dfh.a(15.5D, 0.5D, 15.5D).a(0.9F, 0.9F, 0.0F, 0.2F).d();
/* 1617 */             dfh.a(15.5D, 0.5D, 0.5D).a(0.9F, 0.9F, 0.0F, 0.2F).d();
/* 1618 */             dfh.a(0.5D, 0.5D, 0.5D).a(0.9F, 0.9F, 0.0F, 0.2F).d();
/*      */             
/* 1620 */             dfh.a(0.5D, 15.5D, 0.5D).a(0.9F, 0.9F, 0.0F, 0.2F).d();
/* 1621 */             dfh.a(0.5D, 15.5D, 15.5D).a(0.9F, 0.9F, 0.0F, 0.2F).d();
/* 1622 */             dfh.a(0.5D, 0.5D, 15.5D).a(0.9F, 0.9F, 0.0F, 0.2F).d();
/* 1623 */             dfh.a(0.5D, 0.5D, 0.5D).a(0.9F, 0.9F, 0.0F, 0.2F).d();
/*      */             
/* 1625 */             dfh.a(15.5D, 0.5D, 0.5D).a(0.9F, 0.9F, 0.0F, 0.2F).d();
/* 1626 */             dfh.a(15.5D, 0.5D, 15.5D).a(0.9F, 0.9F, 0.0F, 0.2F).d();
/* 1627 */             dfh.a(15.5D, 15.5D, 15.5D).a(0.9F, 0.9F, 0.0F, 0.2F).d();
/* 1628 */             dfh.a(15.5D, 15.5D, 0.5D).a(0.9F, 0.9F, 0.0F, 0.2F).d();
/*      */             
/* 1630 */             dfh.a(0.5D, 0.5D, 0.5D).a(0.9F, 0.9F, 0.0F, 0.2F).d();
/* 1631 */             dfh.a(15.5D, 0.5D, 0.5D).a(0.9F, 0.9F, 0.0F, 0.2F).d();
/* 1632 */             dfh.a(15.5D, 15.5D, 0.5D).a(0.9F, 0.9F, 0.0F, 0.2F).d();
/* 1633 */             dfh.a(0.5D, 15.5D, 0.5D).a(0.9F, 0.9F, 0.0F, 0.2F).d();
/*      */             
/* 1635 */             dfh.a(0.5D, 15.5D, 15.5D).a(0.9F, 0.9F, 0.0F, 0.2F).d();
/* 1636 */             dfh.a(15.5D, 15.5D, 15.5D).a(0.9F, 0.9F, 0.0F, 0.2F).d();
/* 1637 */             dfh.a(15.5D, 0.5D, 15.5D).a(0.9F, 0.9F, 0.0F, 0.2F).d();
/* 1638 */             dfh.a(0.5D, 0.5D, 15.5D).a(0.9F, 0.9F, 0.0F, 0.2F).d();
/* 1639 */             dfo.b();
/*      */           } 
/*      */         } 
/*      */         
/* 1643 */         RenderSystem.popMatrix(); }
/*      */       
/* 1645 */       RenderSystem.depthMask(true);
/* 1646 */       RenderSystem.disableBlend();
/* 1647 */       RenderSystem.enableCull();
/* 1648 */       RenderSystem.enableTexture();
/*      */     } 
/*      */     
/* 1651 */     if (this.ah != null) {
/* 1652 */       RenderSystem.disableCull();
/* 1653 */       RenderSystem.disableTexture();
/* 1654 */       RenderSystem.enableBlend();
/* 1655 */       RenderSystem.defaultBlendFunc();
/* 1656 */       RenderSystem.lineWidth(10.0F);
/*      */       
/* 1658 */       RenderSystem.pushMatrix();
/* 1659 */       RenderSystem.translatef((float)(this.aj.a - (☃.b()).b), (float)(this.aj.b - (☃.b()).c), (float)(this.aj.c - (☃.b()).d));
/*      */       
/* 1661 */       RenderSystem.depthMask(true);
/*      */       
/* 1663 */       dfh.a(7, dfk.l);
/*      */ 
/*      */       
/* 1666 */       a(dfh, 0, 1, 2, 3, 0, 1, 1);
/*      */ 
/*      */       
/* 1669 */       a(dfh, 4, 5, 6, 7, 1, 0, 0);
/*      */ 
/*      */       
/* 1672 */       a(dfh, 0, 1, 5, 4, 1, 1, 0);
/*      */ 
/*      */       
/* 1675 */       a(dfh, 2, 3, 7, 6, 0, 0, 1);
/*      */ 
/*      */       
/* 1678 */       a(dfh, 0, 4, 7, 3, 0, 1, 0);
/*      */ 
/*      */       
/* 1681 */       a(dfh, 1, 5, 6, 2, 1, 0, 1);
/*      */       
/* 1683 */       dfo.b();
/*      */       
/* 1685 */       RenderSystem.depthMask(false);
/*      */       
/* 1687 */       dfh.a(1, dfk.k);
/*      */       
/* 1689 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 1690 */       a(dfh, 0);
/* 1691 */       a(dfh, 1);
/* 1692 */       a(dfh, 1);
/* 1693 */       a(dfh, 2);
/*      */       
/* 1695 */       a(dfh, 2);
/* 1696 */       a(dfh, 3);
/*      */       
/* 1698 */       a(dfh, 3);
/* 1699 */       a(dfh, 0);
/*      */ 
/*      */       
/* 1702 */       a(dfh, 4);
/* 1703 */       a(dfh, 5);
/*      */       
/* 1705 */       a(dfh, 5);
/* 1706 */       a(dfh, 6);
/*      */       
/* 1708 */       a(dfh, 6);
/* 1709 */       a(dfh, 7);
/*      */       
/* 1711 */       a(dfh, 7);
/* 1712 */       a(dfh, 4);
/*      */ 
/*      */       
/* 1715 */       a(dfh, 0);
/* 1716 */       a(dfh, 4);
/*      */       
/* 1718 */       a(dfh, 1);
/* 1719 */       a(dfh, 5);
/*      */       
/* 1721 */       a(dfh, 2);
/* 1722 */       a(dfh, 6);
/*      */       
/* 1724 */       a(dfh, 3);
/* 1725 */       a(dfh, 7);
/* 1726 */       dfo.b();
/*      */       
/* 1728 */       RenderSystem.popMatrix();
/* 1729 */       RenderSystem.depthMask(true);
/* 1730 */       RenderSystem.disableBlend();
/* 1731 */       RenderSystem.enableCull();
/* 1732 */       RenderSystem.enableTexture();
/*      */       
/* 1734 */       RenderSystem.lineWidth(1.0F);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void a(dfq ☃, int i) {
/* 1739 */     ☃.a(this.ai[i].a(), this.ai[i].b(), this.ai[i].c()).d();
/*      */   }
/*      */   
/*      */   private void a(dfq ☃, int i, int j, int k, int m, int n, int i1, int i2) {
/* 1743 */     float f = 0.25F;
/* 1744 */     ☃.a(this.ai[i].a(), this.ai[i].b(), this.ai[i].c()).a(n, i1, i2, 0.25F).d();
/* 1745 */     ☃.a(this.ai[j].a(), this.ai[j].b(), this.ai[j].c()).a(n, i1, i2, 0.25F).d();
/* 1746 */     ☃.a(this.ai[k].a(), this.ai[k].b(), this.ai[k].c()).a(n, i1, i2, 0.25F).d();
/* 1747 */     ☃.a(this.ai[m].a(), this.ai[m].b(), this.ai[m].c()).a(n, i1, i2, 0.25F).d();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void l() {
/* 1759 */     this.z++;
/*      */     
/* 1761 */     if (this.z % 20 != 0) {
/*      */       return;
/*      */     }
/*      */     
/* 1765 */     ObjectIterator<zq> objectIterator = this.A.values().iterator();
/* 1766 */     while (objectIterator.hasNext()) {
/* 1767 */       zq ☃ = objectIterator.next();
/*      */       
/* 1769 */       int i = ☃.d();
/*      */       
/* 1771 */       if (this.z - i > 400) {
/* 1772 */         objectIterator.remove();
/* 1773 */         a(☃);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private void a(zq ☃) {
/* 1779 */     long l = ☃.b().a();
/* 1780 */     Set<zq> set = (Set<zq>)this.B.get(l);
/* 1781 */     set.remove(☃);
/* 1782 */     if (set.isEmpty()) {
/* 1783 */       this.B.remove(l);
/*      */     }
/*      */   }
/*      */   
/*      */   private void b(dfm ☃) {
/* 1788 */     RenderSystem.disableAlphaTest();
/* 1789 */     RenderSystem.enableBlend();
/* 1790 */     RenderSystem.defaultBlendFunc();
/*      */     
/* 1792 */     RenderSystem.depthMask(false);
/* 1793 */     this.k.a(f);
/* 1794 */     dfo dfo = dfo.a();
/* 1795 */     dfh dfh = dfo.c();
/* 1796 */     for (int i = 0; i < 6; i++) {
/* 1797 */       ☃.a();
/* 1798 */       if (i == 1) {
/* 1799 */         ☃.a(g.b.a(90.0F));
/*      */       }
/* 1801 */       if (i == 2) {
/* 1802 */         ☃.a(g.b.a(-90.0F));
/*      */       }
/* 1804 */       if (i == 3) {
/* 1805 */         ☃.a(g.b.a(180.0F));
/*      */       }
/* 1807 */       if (i == 4) {
/* 1808 */         ☃.a(g.f.a(90.0F));
/*      */       }
/* 1810 */       if (i == 5) {
/* 1811 */         ☃.a(g.f.a(-90.0F));
/*      */       }
/*      */       
/* 1814 */       b b = ☃.c().a();
/*      */       
/* 1816 */       dfh.a(7, dfk.p);
/* 1817 */       dfh.a(b, -100.0F, -100.0F, -100.0F).a(0.0F, 0.0F).a(40, 40, 40, 255).d();
/* 1818 */       dfh.a(b, -100.0F, -100.0F, 100.0F).a(0.0F, 16.0F).a(40, 40, 40, 255).d();
/* 1819 */       dfh.a(b, 100.0F, -100.0F, 100.0F).a(16.0F, 16.0F).a(40, 40, 40, 255).d();
/* 1820 */       dfh.a(b, 100.0F, -100.0F, -100.0F).a(16.0F, 0.0F).a(40, 40, 40, 255).d();
/* 1821 */       dfo.b();
/*      */       
/* 1823 */       ☃.b();
/*      */     } 
/* 1825 */     RenderSystem.depthMask(true);
/* 1826 */     RenderSystem.enableTexture();
/* 1827 */     RenderSystem.disableBlend();
/* 1828 */     RenderSystem.enableAlphaTest();
/*      */   }
/*      */   
/*      */   public void a(dfm ☃, float f) {
/* 1832 */     if (this.j.r.a().c() == dzv.d.c) {
/* 1833 */       b(☃);
/*      */       return;
/*      */     } 
/* 1836 */     if (this.j.r.a().c() != dzv.d.b) {
/*      */       return;
/*      */     }
/*      */     
/* 1840 */     RenderSystem.disableTexture();
/*      */     
/* 1842 */     dcn dcn1 = this.n.a(this.j.h.k().c(), f);
/* 1843 */     float f1 = (float)dcn1.b;
/* 1844 */     float f2 = (float)dcn1.c;
/* 1845 */     float f3 = (float)dcn1.d;
/*      */     
/* 1847 */     dzy.b();
/*      */     
/* 1849 */     dfh dfh = dfo.a().c();
/*      */     
/* 1851 */     RenderSystem.depthMask(false);
/*      */     
/* 1853 */     RenderSystem.enableFog();
/* 1854 */     RenderSystem.color3f(f1, f2, f3);
/* 1855 */     this.u.a();
/* 1856 */     this.s.a(0L);
/* 1857 */     this.u.a(☃.c().a(), 7);
/* 1858 */     dfp.b();
/* 1859 */     this.s.d();
/*      */     
/* 1861 */     RenderSystem.disableFog();
/* 1862 */     RenderSystem.disableAlphaTest();
/* 1863 */     RenderSystem.enableBlend();
/* 1864 */     RenderSystem.defaultBlendFunc();
/*      */     
/* 1866 */     float[] arrayOfFloat = this.n.a().a(this.n.f(f), f);
/* 1867 */     if (arrayOfFloat != null) {
/* 1868 */       RenderSystem.disableTexture();
/* 1869 */       RenderSystem.shadeModel(7425);
/*      */       
/* 1871 */       ☃.a();
/* 1872 */       ☃.a(g.b.a(90.0F));
/* 1873 */       float f11 = (afm.a(this.n.a(f)) < 0.0F) ? 180.0F : 0.0F;
/* 1874 */       ☃.a(g.f.a(f11));
/* 1875 */       ☃.a(g.f.a(90.0F));
/*      */       
/* 1877 */       float f12 = arrayOfFloat[0];
/* 1878 */       float f13 = arrayOfFloat[1];
/* 1879 */       float f14 = arrayOfFloat[2];
/*      */       
/* 1881 */       b b1 = ☃.c().a();
/* 1882 */       dfh.a(6, dfk.l);
/* 1883 */       dfh.a(b1, 0.0F, 100.0F, 0.0F).a(f12, f13, f14, arrayOfFloat[3]).d();
/* 1884 */       int m = 16;
/* 1885 */       for (int n = 0; n <= 16; n++) {
/* 1886 */         float f15 = n * 6.2831855F / 16.0F;
/* 1887 */         float f16 = afm.a(f15);
/* 1888 */         float f17 = afm.b(f15);
/* 1889 */         dfh.a(b1, f16 * 120.0F, f17 * 120.0F, -f17 * 40.0F * arrayOfFloat[3]).a(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], 0.0F).d();
/*      */       } 
/* 1891 */       dfh.c();
/* 1892 */       dfi.a(dfh);
/* 1893 */       ☃.b();
/* 1894 */       RenderSystem.shadeModel(7424);
/*      */     } 
/*      */     
/* 1897 */     RenderSystem.enableTexture();
/* 1898 */     RenderSystem.blendFuncSeparate(dem.r.l, dem.j.e, dem.r.e, dem.j.n);
/* 1899 */     ☃.a();
/*      */     
/* 1901 */     float f4 = 1.0F - this.n.d(f);
/* 1902 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, f4);
/* 1903 */     ☃.a(g.d.a(-90.0F));
/* 1904 */     ☃.a(g.b.a(this.n.f(f) * 360.0F));
/*      */     
/* 1906 */     b b = ☃.c().a();
/* 1907 */     float f5 = 30.0F;
/* 1908 */     this.k.a(d);
/* 1909 */     dfh.a(7, dfk.n);
/* 1910 */     dfh.a(b, -f5, 100.0F, -f5).a(0.0F, 0.0F).d();
/* 1911 */     dfh.a(b, f5, 100.0F, -f5).a(1.0F, 0.0F).d();
/* 1912 */     dfh.a(b, f5, 100.0F, f5).a(1.0F, 1.0F).d();
/* 1913 */     dfh.a(b, -f5, 100.0F, f5).a(0.0F, 1.0F).d();
/* 1914 */     dfh.c();
/* 1915 */     dfi.a(dfh);
/*      */     
/* 1917 */     f5 = 20.0F;
/* 1918 */     this.k.a(c);
/* 1919 */     int i = this.n.ag();
/* 1920 */     int j = i % 4;
/* 1921 */     int k = i / 4 % 2;
/* 1922 */     float f6 = (j + 0) / 4.0F;
/* 1923 */     float f7 = (k + 0) / 2.0F;
/* 1924 */     float f8 = (j + 1) / 4.0F;
/* 1925 */     float f9 = (k + 1) / 2.0F;
/* 1926 */     dfh.a(7, dfk.n);
/* 1927 */     dfh.a(b, -f5, -100.0F, f5).a(f8, f9).d();
/* 1928 */     dfh.a(b, f5, -100.0F, f5).a(f6, f9).d();
/* 1929 */     dfh.a(b, f5, -100.0F, -f5).a(f6, f7).d();
/* 1930 */     dfh.a(b, -f5, -100.0F, -f5).a(f8, f7).d();
/* 1931 */     dfh.c();
/* 1932 */     dfi.a(dfh);
/*      */     
/* 1934 */     RenderSystem.disableTexture();
/* 1935 */     float f10 = this.n.i(f) * f4;
/* 1936 */     if (f10 > 0.0F) {
/* 1937 */       RenderSystem.color4f(f10, f10, f10, f10);
/* 1938 */       this.t.a();
/* 1939 */       this.s.a(0L);
/* 1940 */       this.t.a(☃.c().a(), 7);
/* 1941 */       dfp.b();
/* 1942 */       this.s.d();
/*      */     } 
/* 1944 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*      */     
/* 1946 */     RenderSystem.disableBlend();
/* 1947 */     RenderSystem.enableAlphaTest();
/* 1948 */     RenderSystem.enableFog();
/*      */     
/* 1950 */     ☃.b();
/* 1951 */     RenderSystem.disableTexture();
/* 1952 */     RenderSystem.color3f(0.0F, 0.0F, 0.0F);
/*      */     
/* 1954 */     double d = (this.j.s.j(f)).c - this.n.w().g();
/* 1955 */     if (d < 0.0D) {
/* 1956 */       ☃.a();
/* 1957 */       ☃.a(0.0D, 12.0D, 0.0D);
/* 1958 */       this.v.a();
/* 1959 */       this.s.a(0L);
/* 1960 */       this.v.a(☃.c().a(), 7);
/* 1961 */       dfp.b();
/* 1962 */       this.s.d();
/* 1963 */       ☃.b();
/*      */     } 
/*      */     
/* 1966 */     if (this.n.a().b()) {
/* 1967 */       RenderSystem.color3f(f1 * 0.2F + 0.04F, f2 * 0.2F + 0.04F, f3 * 0.6F + 0.1F);
/*      */     } else {
/* 1969 */       RenderSystem.color3f(f1, f2, f3);
/*      */     } 
/* 1971 */     RenderSystem.enableTexture();
/*      */     
/* 1973 */     RenderSystem.depthMask(true);
/* 1974 */     RenderSystem.disableFog();
/*      */   }
/*      */   
/*      */   public void a(dfm ☃, float f, double d1, double d2, double d3) {
/* 1978 */     float f1 = this.n.a().a();
/* 1979 */     if (Float.isNaN(f1)) {
/*      */       return;
/*      */     }
/*      */     
/* 1983 */     RenderSystem.disableCull();
/* 1984 */     RenderSystem.enableBlend();
/* 1985 */     RenderSystem.enableAlphaTest();
/* 1986 */     RenderSystem.enableDepthTest();
/* 1987 */     RenderSystem.defaultAlphaFunc();
/* 1988 */     RenderSystem.blendFuncSeparate(dem.r.l, dem.j.j, dem.r.e, dem.j.j);
/* 1989 */     RenderSystem.enableFog();
/* 1990 */     RenderSystem.depthMask(true);
/*      */     
/* 1992 */     float f2 = 12.0F;
/* 1993 */     float f3 = 4.0F;
/* 1994 */     double d4 = 2.0E-4D;
/*      */     
/* 1996 */     double d5 = ((this.z + f) * 0.03F);
/* 1997 */     double d6 = (d1 + d5) / 12.0D;
/* 1998 */     double d7 = (f1 - (float)d2 + 0.33F);
/* 1999 */     double d8 = d3 / 12.0D + 0.33000001311302185D;
/* 2000 */     d6 -= (afm.c(d6 / 2048.0D) * 2048);
/* 2001 */     d8 -= (afm.c(d8 / 2048.0D) * 2048);
/* 2002 */     float f4 = (float)(d6 - afm.c(d6));
/* 2003 */     float f5 = (float)(d7 / 4.0D - afm.c(d7 / 4.0D)) * 4.0F;
/* 2004 */     float f6 = (float)(d8 - afm.c(d8));
/* 2005 */     dcn dcn1 = this.n.h(f);
/*      */     
/* 2007 */     int i = (int)Math.floor(d6);
/* 2008 */     int j = (int)Math.floor(d7 / 4.0D);
/* 2009 */     int k = (int)Math.floor(d8);
/* 2010 */     if (i != this.W || j != this.X || k != this.Y || this.j.k
/*      */ 
/*      */       
/* 2013 */       .e() != this.aa || this.Z
/* 2014 */       .g(dcn1) > 2.0E-4D) {
/*      */       
/* 2016 */       this.W = i;
/* 2017 */       this.X = j;
/* 2018 */       this.Y = k;
/* 2019 */       this.Z = dcn1;
/* 2020 */       this.aa = this.j.k.e();
/* 2021 */       this.w = true;
/*      */     } 
/*      */     
/* 2024 */     if (this.w) {
/* 2025 */       this.w = false;
/*      */       
/* 2027 */       dfh dfh = dfo.a().c();
/*      */       
/* 2029 */       if (this.x != null) {
/* 2030 */         this.x.close();
/*      */       }
/*      */       
/* 2033 */       this.x = new dfp(dfk.s);
/* 2034 */       a(dfh, d6, d7, d8, dcn1);
/* 2035 */       dfh.c();
/* 2036 */       this.x.a(dfh);
/*      */     } 
/*      */     
/* 2039 */     this.k.a(e);
/*      */     
/* 2041 */     ☃.a();
/* 2042 */     ☃.a(12.0F, 1.0F, 12.0F);
/* 2043 */     ☃.a(-f4, f5, -f6);
/*      */     
/* 2045 */     if (this.x != null) {
/* 2046 */       this.x.a();
/* 2047 */       dfk.s.a(0L);
/*      */       
/* 2049 */       int m = (this.aa == djn.c) ? 0 : 1;
/* 2050 */       for (int n = m; n < 2; n++) {
/* 2051 */         if (n == 0) {
/* 2052 */           RenderSystem.colorMask(false, false, false, false);
/*      */         } else {
/* 2054 */           RenderSystem.colorMask(true, true, true, true);
/*      */         } 
/* 2056 */         this.x.a(☃.c().a(), 7);
/*      */       } 
/*      */       
/* 2059 */       dfp.b();
/*      */       
/* 2061 */       dfk.s.d();
/*      */     } 
/*      */     
/* 2064 */     ☃.b();
/*      */     
/* 2066 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 2067 */     RenderSystem.disableAlphaTest();
/* 2068 */     RenderSystem.enableCull();
/* 2069 */     RenderSystem.disableBlend();
/* 2070 */     RenderSystem.disableFog();
/*      */   }
/*      */   
/*      */   private void a(dfh ☃, double d1, double d2, double d3, dcn dcn1) {
/* 2074 */     float f1 = 4.0F;
/* 2075 */     float f2 = 0.00390625F;
/* 2076 */     int i = 8;
/* 2077 */     int j = 4;
/* 2078 */     float f3 = 9.765625E-4F;
/*      */ 
/*      */     
/* 2081 */     float f4 = afm.c(d1) * 0.00390625F;
/* 2082 */     float f5 = afm.c(d3) * 0.00390625F;
/*      */     
/* 2084 */     float f6 = (float)dcn1.b;
/* 2085 */     float f7 = (float)dcn1.c;
/* 2086 */     float f8 = (float)dcn1.d;
/*      */     
/* 2088 */     float f9 = f6 * 0.9F;
/* 2089 */     float f10 = f7 * 0.9F;
/* 2090 */     float f11 = f8 * 0.9F;
/*      */     
/* 2092 */     float f12 = f6 * 0.7F;
/* 2093 */     float f13 = f7 * 0.7F;
/* 2094 */     float f14 = f8 * 0.7F;
/*      */     
/* 2096 */     float f15 = f6 * 0.8F;
/* 2097 */     float f16 = f7 * 0.8F;
/* 2098 */     float f17 = f8 * 0.8F;
/*      */     
/* 2100 */     ☃.a(7, dfk.s);
/*      */     
/* 2102 */     float f18 = (float)Math.floor(d2 / 4.0D) * 4.0F;
/*      */     
/* 2104 */     if (this.aa == djn.c) {
/* 2105 */       for (int k = -3; k <= 4; k++) {
/* 2106 */         for (int m = -3; m <= 4; m++) {
/* 2107 */           float f19 = (k * 8);
/* 2108 */           float f20 = (m * 8);
/*      */           
/* 2110 */           if (f18 > -5.0F) {
/* 2111 */             ☃.a((f19 + 0.0F), (f18 + 0.0F), (f20 + 8.0F)).a((f19 + 0.0F) * 0.00390625F + f4, (f20 + 8.0F) * 0.00390625F + f5).a(f12, f13, f14, 0.8F).b(0.0F, -1.0F, 0.0F).d();
/* 2112 */             ☃.a((f19 + 8.0F), (f18 + 0.0F), (f20 + 8.0F)).a((f19 + 8.0F) * 0.00390625F + f4, (f20 + 8.0F) * 0.00390625F + f5).a(f12, f13, f14, 0.8F).b(0.0F, -1.0F, 0.0F).d();
/* 2113 */             ☃.a((f19 + 8.0F), (f18 + 0.0F), (f20 + 0.0F)).a((f19 + 8.0F) * 0.00390625F + f4, (f20 + 0.0F) * 0.00390625F + f5).a(f12, f13, f14, 0.8F).b(0.0F, -1.0F, 0.0F).d();
/* 2114 */             ☃.a((f19 + 0.0F), (f18 + 0.0F), (f20 + 0.0F)).a((f19 + 0.0F) * 0.00390625F + f4, (f20 + 0.0F) * 0.00390625F + f5).a(f12, f13, f14, 0.8F).b(0.0F, -1.0F, 0.0F).d();
/*      */           } 
/*      */           
/* 2117 */           if (f18 <= 5.0F) {
/* 2118 */             ☃.a((f19 + 0.0F), (f18 + 4.0F - 9.765625E-4F), (f20 + 8.0F)).a((f19 + 0.0F) * 0.00390625F + f4, (f20 + 8.0F) * 0.00390625F + f5).a(f6, f7, f8, 0.8F).b(0.0F, 1.0F, 0.0F).d();
/* 2119 */             ☃.a((f19 + 8.0F), (f18 + 4.0F - 9.765625E-4F), (f20 + 8.0F)).a((f19 + 8.0F) * 0.00390625F + f4, (f20 + 8.0F) * 0.00390625F + f5).a(f6, f7, f8, 0.8F).b(0.0F, 1.0F, 0.0F).d();
/* 2120 */             ☃.a((f19 + 8.0F), (f18 + 4.0F - 9.765625E-4F), (f20 + 0.0F)).a((f19 + 8.0F) * 0.00390625F + f4, (f20 + 0.0F) * 0.00390625F + f5).a(f6, f7, f8, 0.8F).b(0.0F, 1.0F, 0.0F).d();
/* 2121 */             ☃.a((f19 + 0.0F), (f18 + 4.0F - 9.765625E-4F), (f20 + 0.0F)).a((f19 + 0.0F) * 0.00390625F + f4, (f20 + 0.0F) * 0.00390625F + f5).a(f6, f7, f8, 0.8F).b(0.0F, 1.0F, 0.0F).d();
/*      */           } 
/*      */           
/* 2124 */           if (k > -1) {
/* 2125 */             for (int n = 0; n < 8; n++) {
/* 2126 */               ☃.a((f19 + n + 0.0F), (f18 + 0.0F), (f20 + 8.0F)).a((f19 + n + 0.5F) * 0.00390625F + f4, (f20 + 8.0F) * 0.00390625F + f5).a(f9, f10, f11, 0.8F).b(-1.0F, 0.0F, 0.0F).d();
/* 2127 */               ☃.a((f19 + n + 0.0F), (f18 + 4.0F), (f20 + 8.0F)).a((f19 + n + 0.5F) * 0.00390625F + f4, (f20 + 8.0F) * 0.00390625F + f5).a(f9, f10, f11, 0.8F).b(-1.0F, 0.0F, 0.0F).d();
/* 2128 */               ☃.a((f19 + n + 0.0F), (f18 + 4.0F), (f20 + 0.0F)).a((f19 + n + 0.5F) * 0.00390625F + f4, (f20 + 0.0F) * 0.00390625F + f5).a(f9, f10, f11, 0.8F).b(-1.0F, 0.0F, 0.0F).d();
/* 2129 */               ☃.a((f19 + n + 0.0F), (f18 + 0.0F), (f20 + 0.0F)).a((f19 + n + 0.5F) * 0.00390625F + f4, (f20 + 0.0F) * 0.00390625F + f5).a(f9, f10, f11, 0.8F).b(-1.0F, 0.0F, 0.0F).d();
/*      */             } 
/*      */           }
/*      */           
/* 2133 */           if (k <= 1) {
/* 2134 */             for (int n = 0; n < 8; n++) {
/* 2135 */               ☃.a((f19 + n + 1.0F - 9.765625E-4F), (f18 + 0.0F), (f20 + 8.0F)).a((f19 + n + 0.5F) * 0.00390625F + f4, (f20 + 8.0F) * 0.00390625F + f5).a(f9, f10, f11, 0.8F).b(1.0F, 0.0F, 0.0F).d();
/* 2136 */               ☃.a((f19 + n + 1.0F - 9.765625E-4F), (f18 + 4.0F), (f20 + 8.0F)).a((f19 + n + 0.5F) * 0.00390625F + f4, (f20 + 8.0F) * 0.00390625F + f5).a(f9, f10, f11, 0.8F).b(1.0F, 0.0F, 0.0F).d();
/* 2137 */               ☃.a((f19 + n + 1.0F - 9.765625E-4F), (f18 + 4.0F), (f20 + 0.0F)).a((f19 + n + 0.5F) * 0.00390625F + f4, (f20 + 0.0F) * 0.00390625F + f5).a(f9, f10, f11, 0.8F).b(1.0F, 0.0F, 0.0F).d();
/* 2138 */               ☃.a((f19 + n + 1.0F - 9.765625E-4F), (f18 + 0.0F), (f20 + 0.0F)).a((f19 + n + 0.5F) * 0.00390625F + f4, (f20 + 0.0F) * 0.00390625F + f5).a(f9, f10, f11, 0.8F).b(1.0F, 0.0F, 0.0F).d();
/*      */             } 
/*      */           }
/*      */           
/* 2142 */           if (m > -1) {
/* 2143 */             for (int n = 0; n < 8; n++) {
/* 2144 */               ☃.a((f19 + 0.0F), (f18 + 4.0F), (f20 + n + 0.0F)).a((f19 + 0.0F) * 0.00390625F + f4, (f20 + n + 0.5F) * 0.00390625F + f5).a(f15, f16, f17, 0.8F).b(0.0F, 0.0F, -1.0F).d();
/* 2145 */               ☃.a((f19 + 8.0F), (f18 + 4.0F), (f20 + n + 0.0F)).a((f19 + 8.0F) * 0.00390625F + f4, (f20 + n + 0.5F) * 0.00390625F + f5).a(f15, f16, f17, 0.8F).b(0.0F, 0.0F, -1.0F).d();
/* 2146 */               ☃.a((f19 + 8.0F), (f18 + 0.0F), (f20 + n + 0.0F)).a((f19 + 8.0F) * 0.00390625F + f4, (f20 + n + 0.5F) * 0.00390625F + f5).a(f15, f16, f17, 0.8F).b(0.0F, 0.0F, -1.0F).d();
/* 2147 */               ☃.a((f19 + 0.0F), (f18 + 0.0F), (f20 + n + 0.0F)).a((f19 + 0.0F) * 0.00390625F + f4, (f20 + n + 0.5F) * 0.00390625F + f5).a(f15, f16, f17, 0.8F).b(0.0F, 0.0F, -1.0F).d();
/*      */             } 
/*      */           }
/*      */           
/* 2151 */           if (m <= 1) {
/* 2152 */             for (int n = 0; n < 8; n++) {
/* 2153 */               ☃.a((f19 + 0.0F), (f18 + 4.0F), (f20 + n + 1.0F - 9.765625E-4F)).a((f19 + 0.0F) * 0.00390625F + f4, (f20 + n + 0.5F) * 0.00390625F + f5).a(f15, f16, f17, 0.8F).b(0.0F, 0.0F, 1.0F).d();
/* 2154 */               ☃.a((f19 + 8.0F), (f18 + 4.0F), (f20 + n + 1.0F - 9.765625E-4F)).a((f19 + 8.0F) * 0.00390625F + f4, (f20 + n + 0.5F) * 0.00390625F + f5).a(f15, f16, f17, 0.8F).b(0.0F, 0.0F, 1.0F).d();
/* 2155 */               ☃.a((f19 + 8.0F), (f18 + 0.0F), (f20 + n + 1.0F - 9.765625E-4F)).a((f19 + 8.0F) * 0.00390625F + f4, (f20 + n + 0.5F) * 0.00390625F + f5).a(f15, f16, f17, 0.8F).b(0.0F, 0.0F, 1.0F).d();
/* 2156 */               ☃.a((f19 + 0.0F), (f18 + 0.0F), (f20 + n + 1.0F - 9.765625E-4F)).a((f19 + 0.0F) * 0.00390625F + f4, (f20 + n + 0.5F) * 0.00390625F + f5).a(f15, f16, f17, 0.8F).b(0.0F, 0.0F, 1.0F).d();
/*      */             } 
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } else {
/* 2162 */       int k = 1;
/* 2163 */       int m = 32;
/* 2164 */       for (int n = -32; n < 32; n += 32) {
/* 2165 */         for (int i1 = -32; i1 < 32; i1 += 32) {
/* 2166 */           ☃.a((n + 0), f18, (i1 + 32)).a((n + 0) * 0.00390625F + f4, (i1 + 32) * 0.00390625F + f5).a(f6, f7, f8, 0.8F).b(0.0F, -1.0F, 0.0F).d();
/* 2167 */           ☃.a((n + 32), f18, (i1 + 32)).a((n + 32) * 0.00390625F + f4, (i1 + 32) * 0.00390625F + f5).a(f6, f7, f8, 0.8F).b(0.0F, -1.0F, 0.0F).d();
/* 2168 */           ☃.a((n + 32), f18, (i1 + 0)).a((n + 32) * 0.00390625F + f4, (i1 + 0) * 0.00390625F + f5).a(f6, f7, f8, 0.8F).b(0.0F, -1.0F, 0.0F).d();
/* 2169 */           ☃.a((n + 0), f18, (i1 + 0)).a((n + 0) * 0.00390625F + f4, (i1 + 0) * 0.00390625F + f5).a(f6, f7, f8, 0.8F).b(0.0F, -1.0F, 0.0F).d();
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private void a(long ☃) {
/* 2176 */     this.an |= this.ab.d();
/*      */     
/* 2178 */     long l = x.c();
/* 2179 */     int i = 0;
/* 2180 */     if (!this.o.isEmpty()) {
/* 2181 */       Iterator<ecu.c> iterator = this.o.iterator();
/*      */       
/* 2183 */       while (iterator.hasNext()) {
/* 2184 */         ecu.c c = iterator.next();
/*      */         
/* 2186 */         if (c.h()) {
/* 2187 */           this.ab.a(c);
/*      */         } else {
/* 2189 */           c.a(this.ab);
/*      */         } 
/*      */         
/* 2192 */         c.f();
/* 2193 */         iterator.remove();
/* 2194 */         i++;
/* 2195 */         long l1 = x.c();
/* 2196 */         long l2 = l1 - l;
/* 2197 */         long l3 = l2 / i;
/* 2198 */         long l4 = ☃ - l1;
/*      */         
/* 2200 */         if (l4 < l3) {
/*      */           break;
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private void c(djk ☃) {
/* 2208 */     dfh dfh = dfo.a().c();
/*      */     
/* 2210 */     cfu cfu = this.n.f();
/*      */     
/* 2212 */     double d1 = (this.j.k.b * 16);
/*      */     
/* 2214 */     if ((☃.b()).b < cfu.g() - d1 && (☃.b()).b > cfu.e() + d1 && (☃.b()).d < cfu.h() - d1 && (☃.b()).d > cfu.f() + d1) {
/*      */       return;
/*      */     }
/*      */     
/* 2218 */     double d2 = 1.0D - cfu.b((☃.b()).b, (☃.b()).d) / d1;
/* 2219 */     d2 = Math.pow(d2, 4.0D);
/*      */     
/* 2221 */     double d3 = (☃.b()).b;
/* 2222 */     double d4 = (☃.b()).c;
/* 2223 */     double d5 = (☃.b()).d;
/*      */     
/* 2225 */     RenderSystem.enableBlend();
/* 2226 */     RenderSystem.enableDepthTest();
/* 2227 */     RenderSystem.blendFuncSeparate(dem.r.l, dem.j.e, dem.r.e, dem.j.n);
/* 2228 */     this.k.a(g);
/*      */     
/* 2230 */     RenderSystem.depthMask(djz.A());
/* 2231 */     RenderSystem.pushMatrix();
/*      */     
/* 2233 */     int i = cfu.d().a();
/* 2234 */     float f1 = (i >> 16 & 0xFF) / 255.0F;
/* 2235 */     float f2 = (i >> 8 & 0xFF) / 255.0F;
/* 2236 */     float f3 = (i & 0xFF) / 255.0F;
/* 2237 */     RenderSystem.color4f(f1, f2, f3, (float)d2);
/* 2238 */     RenderSystem.polygonOffset(-3.0F, -3.0F);
/* 2239 */     RenderSystem.enablePolygonOffset();
/* 2240 */     RenderSystem.defaultAlphaFunc();
/* 2241 */     RenderSystem.enableAlphaTest();
/* 2242 */     RenderSystem.disableCull();
/*      */     
/* 2244 */     float f4 = (float)(x.b() % 3000L) / 3000.0F;
/* 2245 */     float f5 = 0.0F;
/* 2246 */     float f6 = 0.0F;
/* 2247 */     float f7 = 128.0F;
/* 2248 */     dfh.a(7, dfk.n);
/*      */     
/* 2250 */     double d6 = Math.max(afm.c(d5 - d1), cfu.f());
/* 2251 */     double d7 = Math.min(afm.f(d5 + d1), cfu.h());
/* 2252 */     if (d3 > cfu.g() - d1) {
/* 2253 */       float f = 0.0F;
/* 2254 */       for (double d = d6; d < d7; d++, f += 0.5F) {
/* 2255 */         double d8 = Math.min(1.0D, d7 - d);
/* 2256 */         float f8 = (float)d8 * 0.5F;
/* 2257 */         a(dfh, d3, d4, d5, cfu.g(), 256, d, f4 + f, f4 + 0.0F);
/* 2258 */         a(dfh, d3, d4, d5, cfu.g(), 256, d + d8, f4 + f8 + f, f4 + 0.0F);
/* 2259 */         a(dfh, d3, d4, d5, cfu.g(), 0, d + d8, f4 + f8 + f, f4 + 128.0F);
/* 2260 */         a(dfh, d3, d4, d5, cfu.g(), 0, d, f4 + f, f4 + 128.0F);
/*      */       } 
/*      */     } 
/* 2263 */     if (d3 < cfu.e() + d1) {
/* 2264 */       float f = 0.0F;
/* 2265 */       for (double d = d6; d < d7; d++, f += 0.5F) {
/* 2266 */         double d8 = Math.min(1.0D, d7 - d);
/* 2267 */         float f8 = (float)d8 * 0.5F;
/* 2268 */         a(dfh, d3, d4, d5, cfu.e(), 256, d, f4 + f, f4 + 0.0F);
/* 2269 */         a(dfh, d3, d4, d5, cfu.e(), 256, d + d8, f4 + f8 + f, f4 + 0.0F);
/* 2270 */         a(dfh, d3, d4, d5, cfu.e(), 0, d + d8, f4 + f8 + f, f4 + 128.0F);
/* 2271 */         a(dfh, d3, d4, d5, cfu.e(), 0, d, f4 + f, f4 + 128.0F);
/*      */       } 
/*      */     } 
/*      */     
/* 2275 */     d6 = Math.max(afm.c(d3 - d1), cfu.e());
/* 2276 */     d7 = Math.min(afm.f(d3 + d1), cfu.g());
/* 2277 */     if (d5 > cfu.h() - d1) {
/* 2278 */       float f = 0.0F;
/* 2279 */       for (double d = d6; d < d7; d++, f += 0.5F) {
/* 2280 */         double d8 = Math.min(1.0D, d7 - d);
/* 2281 */         float f8 = (float)d8 * 0.5F;
/* 2282 */         a(dfh, d3, d4, d5, d, 256, cfu.h(), f4 + f, f4 + 0.0F);
/* 2283 */         a(dfh, d3, d4, d5, d + d8, 256, cfu.h(), f4 + f8 + f, f4 + 0.0F);
/* 2284 */         a(dfh, d3, d4, d5, d + d8, 0, cfu.h(), f4 + f8 + f, f4 + 128.0F);
/* 2285 */         a(dfh, d3, d4, d5, d, 0, cfu.h(), f4 + f, f4 + 128.0F);
/*      */       } 
/*      */     } 
/* 2288 */     if (d5 < cfu.f() + d1) {
/* 2289 */       float f = 0.0F;
/* 2290 */       for (double d = d6; d < d7; d++, f += 0.5F) {
/* 2291 */         double d8 = Math.min(1.0D, d7 - d);
/* 2292 */         float f8 = (float)d8 * 0.5F;
/* 2293 */         a(dfh, d3, d4, d5, d, 256, cfu.f(), f4 + f, f4 + 0.0F);
/* 2294 */         a(dfh, d3, d4, d5, d + d8, 256, cfu.f(), f4 + f8 + f, f4 + 0.0F);
/* 2295 */         a(dfh, d3, d4, d5, d + d8, 0, cfu.f(), f4 + f8 + f, f4 + 128.0F);
/* 2296 */         a(dfh, d3, d4, d5, d, 0, cfu.f(), f4 + f, f4 + 128.0F);
/*      */       } 
/*      */     } 
/*      */     
/* 2300 */     dfh.c();
/* 2301 */     dfi.a(dfh);
/*      */     
/* 2303 */     RenderSystem.enableCull();
/* 2304 */     RenderSystem.disableAlphaTest();
/* 2305 */     RenderSystem.polygonOffset(0.0F, 0.0F);
/* 2306 */     RenderSystem.disablePolygonOffset();
/* 2307 */     RenderSystem.enableAlphaTest();
/* 2308 */     RenderSystem.disableBlend();
/*      */     
/* 2310 */     RenderSystem.popMatrix();
/* 2311 */     RenderSystem.depthMask(true);
/*      */   }
/*      */   
/*      */   private void a(dfh ☃, double d1, double d2, double d3, double d4, int i, double d5, float f1, float f2) {
/* 2315 */     ☃.a(d4 - d1, i - d2, d5 - d3).a(f1, f2).d();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void a(dfm ☃, dfq dfq1, aqa aqa1, double d1, double d2, double d3, fx fx1, ceh ceh1) {
/* 2325 */     b(☃, dfq1, ceh1.a(this.n, fx1, dcs.a(aqa1)), fx1.u() - d1, fx1.v() - d2, fx1.w() - d3, 0.0F, 0.0F, 0.0F, 0.4F);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void a(dfm ☃, dfq dfq1, ddh ddh1, double d1, double d2, double d3, float f1, float f2, float f3, float f4) {
/* 2330 */     List<dci> list = ddh1.d();
/* 2331 */     int i = afm.f(list.size() / 3.0D);
/* 2332 */     for (int j = 0; j < list.size(); j++) {
/* 2333 */       dci dci = list.get(j);
/* 2334 */       float f5 = (j % i + 1.0F) / i;
/* 2335 */       float f6 = (j / i);
/* 2336 */       float f7 = f5 * ((f6 == 0.0F) ? true : false);
/* 2337 */       float f8 = f5 * ((f6 == 1.0F) ? true : false);
/* 2338 */       float f9 = f5 * ((f6 == 2.0F) ? true : false);
/* 2339 */       b(☃, dfq1, dde.a(dci.d(0.0D, 0.0D, 0.0D)), d1, d2, d3, f7, f8, f9, 1.0F);
/*      */     } 
/*      */   }
/*      */   
/*      */   private static void b(dfm ☃, dfq dfq1, ddh ddh1, double d1, double d2, double d3, float f1, float f2, float f3, float f4) {
/* 2344 */     b b = ☃.c().a();
/* 2345 */     ddh1.a((d4, d5, d6, d7, d8, d9) -> {
/*      */           ☃.a(b1, (float)(d4 + d1), (float)(d5 + d2), (float)(d6 + d3)).a(f1, f2, f3, f4).d();
/*      */           ☃.a(b1, (float)(d7 + d1), (float)(d8 + d2), (float)(d9 + d3)).a(f1, f2, f3, f4).d();
/*      */         });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void a(dfm ☃, dfq dfq1, dci dci1, float f1, float f2, float f3, float f4) {
/* 2356 */     a(☃, dfq1, dci1.a, dci1.b, dci1.c, dci1.d, dci1.e, dci1.f, f1, f2, f3, f4, f1, f2, f3);
/*      */   }
/*      */   
/*      */   public static void a(dfm ☃, dfq dfq1, double d1, double d2, double d3, double d4, double d5, double d6, float f1, float f2, float f3, float f4) {
/* 2360 */     a(☃, dfq1, d1, d2, d3, d4, d5, d6, f1, f2, f3, f4, f1, f2, f3);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void a(dfm ☃, dfq dfq1, double d1, double d2, double d3, double d4, double d5, double d6, float f1, float f2, float f3, float f4, float f5, float f6, float f7) {
/* 2365 */     b b = ☃.c().a();
/* 2366 */     float f8 = (float)d1;
/* 2367 */     float f9 = (float)d2;
/* 2368 */     float f10 = (float)d3;
/* 2369 */     float f11 = (float)d4;
/* 2370 */     float f12 = (float)d5;
/* 2371 */     float f13 = (float)d6;
/* 2372 */     dfq1.a(b, f8, f9, f10).a(f1, f6, f7, f4).d();
/* 2373 */     dfq1.a(b, f11, f9, f10).a(f1, f6, f7, f4).d();
/*      */     
/* 2375 */     dfq1.a(b, f8, f9, f10).a(f5, f2, f7, f4).d();
/* 2376 */     dfq1.a(b, f8, f12, f10).a(f5, f2, f7, f4).d();
/*      */     
/* 2378 */     dfq1.a(b, f8, f9, f10).a(f5, f6, f3, f4).d();
/* 2379 */     dfq1.a(b, f8, f9, f13).a(f5, f6, f3, f4).d();
/*      */ 
/*      */     
/* 2382 */     dfq1.a(b, f11, f9, f10).a(f1, f2, f3, f4).d();
/* 2383 */     dfq1.a(b, f11, f12, f10).a(f1, f2, f3, f4).d();
/*      */     
/* 2385 */     dfq1.a(b, f11, f12, f10).a(f1, f2, f3, f4).d();
/* 2386 */     dfq1.a(b, f8, f12, f10).a(f1, f2, f3, f4).d();
/*      */     
/* 2388 */     dfq1.a(b, f8, f12, f10).a(f1, f2, f3, f4).d();
/* 2389 */     dfq1.a(b, f8, f12, f13).a(f1, f2, f3, f4).d();
/*      */     
/* 2391 */     dfq1.a(b, f8, f12, f13).a(f1, f2, f3, f4).d();
/* 2392 */     dfq1.a(b, f8, f9, f13).a(f1, f2, f3, f4).d();
/*      */     
/* 2394 */     dfq1.a(b, f8, f9, f13).a(f1, f2, f3, f4).d();
/* 2395 */     dfq1.a(b, f11, f9, f13).a(f1, f2, f3, f4).d();
/*      */     
/* 2397 */     dfq1.a(b, f11, f9, f13).a(f1, f2, f3, f4).d();
/* 2398 */     dfq1.a(b, f11, f9, f10).a(f1, f2, f3, f4).d();
/*      */ 
/*      */     
/* 2401 */     dfq1.a(b, f8, f12, f13).a(f1, f2, f3, f4).d();
/* 2402 */     dfq1.a(b, f11, f12, f13).a(f1, f2, f3, f4).d();
/*      */     
/* 2404 */     dfq1.a(b, f11, f9, f13).a(f1, f2, f3, f4).d();
/* 2405 */     dfq1.a(b, f11, f12, f13).a(f1, f2, f3, f4).d();
/*      */     
/* 2407 */     dfq1.a(b, f11, f12, f10).a(f1, f2, f3, f4).d();
/* 2408 */     dfq1.a(b, f11, f12, f13).a(f1, f2, f3, f4).d();
/*      */   }
/*      */   
/*      */   public static void a(dfh ☃, double d1, double d2, double d3, double d4, double d5, double d6, float f1, float f2, float f3, float f4) {
/* 2412 */     ☃.a(d1, d2, d3).a(f1, f2, f3, f4).d();
/* 2413 */     ☃.a(d1, d2, d3).a(f1, f2, f3, f4).d();
/*      */     
/* 2415 */     ☃.a(d1, d2, d3).a(f1, f2, f3, f4).d();
/* 2416 */     ☃.a(d1, d2, d6).a(f1, f2, f3, f4).d();
/* 2417 */     ☃.a(d1, d5, d3).a(f1, f2, f3, f4).d();
/* 2418 */     ☃.a(d1, d5, d6).a(f1, f2, f3, f4).d();
/*      */     
/* 2420 */     ☃.a(d1, d5, d6).a(f1, f2, f3, f4).d();
/* 2421 */     ☃.a(d1, d2, d6).a(f1, f2, f3, f4).d();
/* 2422 */     ☃.a(d4, d5, d6).a(f1, f2, f3, f4).d();
/* 2423 */     ☃.a(d4, d2, d6).a(f1, f2, f3, f4).d();
/*      */     
/* 2425 */     ☃.a(d4, d2, d6).a(f1, f2, f3, f4).d();
/* 2426 */     ☃.a(d4, d2, d3).a(f1, f2, f3, f4).d();
/* 2427 */     ☃.a(d4, d5, d6).a(f1, f2, f3, f4).d();
/* 2428 */     ☃.a(d4, d5, d3).a(f1, f2, f3, f4).d();
/*      */     
/* 2430 */     ☃.a(d4, d5, d3).a(f1, f2, f3, f4).d();
/* 2431 */     ☃.a(d4, d2, d3).a(f1, f2, f3, f4).d();
/* 2432 */     ☃.a(d1, d5, d3).a(f1, f2, f3, f4).d();
/* 2433 */     ☃.a(d1, d2, d3).a(f1, f2, f3, f4).d();
/*      */     
/* 2435 */     ☃.a(d1, d2, d3).a(f1, f2, f3, f4).d();
/* 2436 */     ☃.a(d4, d2, d3).a(f1, f2, f3, f4).d();
/* 2437 */     ☃.a(d1, d2, d6).a(f1, f2, f3, f4).d();
/* 2438 */     ☃.a(d4, d2, d6).a(f1, f2, f3, f4).d();
/*      */     
/* 2440 */     ☃.a(d4, d2, d6).a(f1, f2, f3, f4).d();
/* 2441 */     ☃.a(d1, d5, d3).a(f1, f2, f3, f4).d();
/*      */     
/* 2443 */     ☃.a(d1, d5, d3).a(f1, f2, f3, f4).d();
/* 2444 */     ☃.a(d1, d5, d6).a(f1, f2, f3, f4).d();
/* 2445 */     ☃.a(d4, d5, d3).a(f1, f2, f3, f4).d();
/* 2446 */     ☃.a(d4, d5, d6).a(f1, f2, f3, f4).d();
/*      */     
/* 2448 */     ☃.a(d4, d5, d6).a(f1, f2, f3, f4).d();
/* 2449 */     ☃.a(d4, d5, d6).a(f1, f2, f3, f4).d();
/*      */   }
/*      */   
/*      */   public void a(brc ☃, fx fx1, ceh ceh1, ceh ceh2, int i) {
/* 2453 */     a(fx1, ((i & 0x8) != 0));
/*      */   }
/*      */   
/*      */   private void a(fx ☃, boolean bool) {
/* 2457 */     for (int i = ☃.w() - 1; i <= ☃.w() + 1; i++) {
/* 2458 */       for (int j = ☃.u() - 1; j <= ☃.u() + 1; j++) {
/* 2459 */         for (int k = ☃.v() - 1; k <= ☃.v() + 1; k++) {
/* 2460 */           a(j >> 4, k >> 4, i >> 4, bool);
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a(int ☃, int i, int j, int k, int m, int n) {
/* 2467 */     for (int i1 = j - 1; i1 <= n + 1; i1++) {
/* 2468 */       for (int i2 = ☃ - 1; i2 <= k + 1; i2++) {
/* 2469 */         for (int i3 = i - 1; i3 <= m + 1; i3++) {
/* 2470 */           b(i2 >> 4, i3 >> 4, i1 >> 4);
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a(fx ☃, ceh ceh1, ceh ceh2) {
/* 2477 */     if (this.j.ar().a(ceh1, ceh2)) {
/* 2478 */       a(☃.u(), ☃.v(), ☃.w(), ☃.u(), ☃.v(), ☃.w());
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(int ☃, int i, int j) {
/* 2483 */     for (int k = j - 1; k <= j + 1; k++) {
/* 2484 */       for (int m = ☃ - 1; m <= ☃ + 1; m++) {
/* 2485 */         for (int n = i - 1; n <= i + 1; n++) {
/* 2486 */           b(m, n, k);
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public void b(int ☃, int i, int j) {
/* 2493 */     a(☃, i, j, false);
/*      */   }
/*      */   
/*      */   private void a(int ☃, int i, int j, boolean bool) {
/* 2497 */     this.r.a(☃, i, j, bool);
/*      */   }
/*      */   
/*      */   public void a(@Nullable adp ☃, fx fx1) {
/* 2501 */     emt emt = this.C.get(fx1);
/*      */     
/* 2503 */     if (emt != null) {
/* 2504 */       this.j.W().b(emt);
/* 2505 */       this.C.remove(fx1);
/*      */     } 
/*      */     
/* 2508 */     if (☃ != null) {
/* 2509 */       bmq bmq = bmq.a(☃);
/* 2510 */       if (bmq != null) {
/* 2511 */         this.j.j.a(bmq.g());
/*      */       }
/*      */       
/* 2514 */       emt = emp.a(☃, fx1.u(), fx1.v(), fx1.w());
/* 2515 */       this.C.put(fx1, emt);
/* 2516 */       this.j.W().a(emt);
/*      */     } 
/*      */     
/* 2519 */     a(this.n, fx1, (☃ != null));
/*      */   }
/*      */   
/*      */   private void a(brx ☃, fx fx1, boolean bool) {
/* 2523 */     List<aqm> list = ☃.a(aqm.class, (new dci(fx1)).g(3.0D));
/* 2524 */     for (aqm aqm : list) {
/* 2525 */       aqm.a(fx1, bool);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(hf ☃, boolean bool, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 2530 */     a(☃, bool, false, d1, d2, d3, d4, d5, d6);
/*      */   }
/*      */   
/*      */   public void a(hf ☃, boolean bool1, boolean bool2, double d1, double d2, double d3, double d4, double d5, double d6) {
/*      */     try {
/* 2535 */       b(☃, bool1, bool2, d1, d2, d3, d4, d5, d6);
/* 2536 */     } catch (Throwable throwable) {
/* 2537 */       l l = l.a(throwable, "Exception while adding particle");
/* 2538 */       m m = l.a("Particle being added");
/*      */       
/* 2540 */       m.a("ID", gm.V.b(☃.b()));
/* 2541 */       m.a("Parameters", ☃.a());
/* 2542 */       m.a("Position", () -> m.a(☃, d1, d2));
/*      */       
/* 2544 */       throw new u(l);
/*      */     } 
/*      */   }
/*      */   
/*      */   private <T extends hf> void a(T ☃, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 2549 */     a((hf)☃, ☃.b().c(), d1, d2, d3, d4, d5, d6);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   private dyg b(hf ☃, boolean bool, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 2554 */     return b(☃, bool, false, d1, d2, d3, d4, d5, d6);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   private dyg b(hf ☃, boolean bool1, boolean bool2, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 2559 */     djk djk = this.j.h.k();
/* 2560 */     if (this.j == null || !djk.h() || this.j.f == null) {
/* 2561 */       return null;
/*      */     }
/*      */     
/* 2564 */     dke dke = a(bool2);
/*      */     
/* 2566 */     if (bool1) {
/* 2567 */       return this.j.f.a(☃, d1, d2, d3, d4, d5, d6);
/*      */     }
/*      */     
/* 2570 */     if (djk.b().c(d1, d2, d3) > 1024.0D) {
/* 2571 */       return null;
/*      */     }
/*      */     
/* 2574 */     if (dke == dke.c)
/*      */     {
/* 2576 */       return null;
/*      */     }
/*      */     
/* 2579 */     return this.j.f.a(☃, d1, d2, d3, d4, d5, d6);
/*      */   }
/*      */   
/*      */   private dke a(boolean ☃) {
/* 2583 */     dke dke = this.j.k.aT;
/*      */     
/* 2585 */     if (☃ && dke == dke.c)
/*      */     {
/* 2587 */       if (this.n.t.nextInt(10) == 0) {
/* 2588 */         dke = dke.b;
/*      */       }
/*      */     }
/*      */     
/* 2592 */     if (dke == dke.b)
/*      */     {
/* 2594 */       if (this.n.t.nextInt(3) == 0) {
/* 2595 */         dke = dke.c;
/*      */       }
/*      */     }
/*      */     
/* 2599 */     return dke;
/*      */   }
/*      */   
/*      */   public void m() {}
/*      */   
/*      */   public void a(int ☃, fx fx1, int i) {
/*      */     djk djk;
/* 2606 */     switch (☃) {
/*      */       case 1023:
/*      */       case 1028:
/*      */       case 1038:
/* 2610 */         djk = this.j.h.k();
/* 2611 */         if (djk.h()) {
/*      */           
/* 2613 */           double d1 = fx1.u() - (djk.b()).b;
/* 2614 */           double d2 = fx1.v() - (djk.b()).c;
/* 2615 */           double d3 = fx1.w() - (djk.b()).d;
/*      */           
/* 2617 */           double d4 = Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3);
/* 2618 */           double d5 = (djk.b()).b;
/* 2619 */           double d6 = (djk.b()).c;
/* 2620 */           double d7 = (djk.b()).d;
/*      */           
/* 2622 */           if (d4 > 0.0D) {
/* 2623 */             d5 += d1 / d4 * 2.0D;
/* 2624 */             d6 += d2 / d4 * 2.0D;
/* 2625 */             d7 += d3 / d4 * 2.0D;
/*      */           } 
/*      */           
/* 2628 */           if (☃ == 1023) {
/* 2629 */             this.n.a(d5, d6, d7, adq.qZ, adr.f, 1.0F, 1.0F, false); break;
/* 2630 */           }  if (☃ == 1038) {
/* 2631 */             this.n.a(d5, d6, d7, adq.dL, adr.f, 1.0F, 1.0F, false); break;
/*      */           } 
/* 2633 */           this.n.a(d5, d6, d7, adq.dq, adr.f, 5.0F, 1.0F, false);
/*      */         }  break;
/*      */     }  } public void a(bfw ☃, int i, fx fx1, int j) { gc gc1; double d1; dcn dcn1; ceh ceh; int m; float f1; int k, n; double d2; float f2; int i1; float f3; double d3; hf hf;
/*      */     int i2;
/*      */     double d5;
/*      */     int i3;
/*      */     double d4, d6;
/*      */     int i4;
/* 2641 */     Random random = this.n.t;
/* 2642 */     switch (i) {
/*      */       case 1035:
/* 2644 */         this.n.a(fx1, adq.bd, adr.e, 1.0F, 1.0F, false);
/*      */         break;
/*      */       case 1033:
/* 2647 */         this.n.a(fx1, adq.bN, adr.e, 1.0F, 1.0F, false);
/*      */         break;
/*      */       case 1034:
/* 2650 */         this.n.a(fx1, adq.bM, adr.e, 1.0F, 1.0F, false);
/*      */         break;
/*      */       case 1032:
/* 2653 */         this.j.W().a(emp.b(adq.lO, random.nextFloat() * 0.4F + 0.8F, 0.25F));
/*      */         break;
/*      */       case 1001:
/* 2656 */         this.n.a(fx1, adq.cB, adr.e, 1.0F, 1.2F, false);
/*      */         break;
/*      */       case 1000:
/* 2659 */         this.n.a(fx1, adq.cA, adr.e, 1.0F, 1.0F, false);
/*      */         break;
/*      */       case 1003:
/* 2662 */         this.n.a(fx1, adq.dx, adr.g, 1.0F, 1.2F, false);
/*      */         break;
/*      */       case 1004:
/* 2665 */         this.n.a(fx1, adq.ef, adr.g, 1.0F, 1.2F, false);
/*      */         break;
/*      */       case 1002:
/* 2668 */         this.n.a(fx1, adq.cC, adr.e, 1.0F, 1.2F, false);
/*      */         break;
/*      */       case 2000:
/* 2671 */         gc1 = gc.a(j);
/* 2672 */         m = gc1.i();
/* 2673 */         n = gc1.j();
/* 2674 */         i1 = gc1.k();
/*      */         
/* 2676 */         d3 = fx1.u() + m * 0.6D + 0.5D;
/* 2677 */         d5 = fx1.v() + n * 0.6D + 0.5D;
/* 2678 */         d6 = fx1.w() + i1 * 0.6D + 0.5D;
/*      */         
/* 2680 */         for (i4 = 0; i4 < 10; i4++) {
/* 2681 */           double d7 = random.nextDouble() * 0.2D + 0.01D;
/* 2682 */           double d8 = d3 + m * 0.01D + (random.nextDouble() - 0.5D) * i1 * 0.5D;
/* 2683 */           double d9 = d5 + n * 0.01D + (random.nextDouble() - 0.5D) * n * 0.5D;
/* 2684 */           double d10 = d6 + i1 * 0.01D + (random.nextDouble() - 0.5D) * m * 0.5D;
/* 2685 */           double d11 = m * d7 + random.nextGaussian() * 0.01D;
/* 2686 */           double d12 = n * d7 + random.nextGaussian() * 0.01D;
/* 2687 */           double d13 = i1 * d7 + random.nextGaussian() * 0.01D;
/* 2688 */           a(hh.S, d8, d9, d10, d11, d12, d13);
/*      */         } 
/*      */         break;
/*      */       
/*      */       case 2003:
/* 2693 */         d1 = fx1.u() + 0.5D;
/* 2694 */         d2 = fx1.v();
/* 2695 */         d3 = fx1.w() + 0.5D;
/*      */         
/* 2697 */         for (i3 = 0; i3 < 8; i3++) {
/* 2698 */           a(new he(hh.I, new bmb(bmd.nD)), d1, d2, d3, random.nextGaussian() * 0.15D, random.nextDouble() * 0.2D, random.nextGaussian() * 0.15D);
/*      */         }
/* 2700 */         for (d4 = 0.0D; d4 < 6.283185307179586D; d4 += 0.15707963267948966D) {
/* 2701 */           a(hh.Q, d1 + Math.cos(d4) * 5.0D, d2 - 0.4D, d3 + Math.sin(d4) * 5.0D, Math.cos(d4) * -5.0D, 0.0D, Math.sin(d4) * -5.0D);
/* 2702 */           a(hh.Q, d1 + Math.cos(d4) * 5.0D, d2 - 0.4D, d3 + Math.sin(d4) * 5.0D, Math.cos(d4) * -7.0D, 0.0D, Math.sin(d4) * -7.0D);
/*      */         } 
/*      */         break;
/*      */       
/*      */       case 2002:
/*      */       case 2007:
/* 2708 */         dcn1 = dcn.c(fx1);
/*      */         
/* 2710 */         for (m = 0; m < 8; m++) {
/* 2711 */           a(new he(hh.I, new bmb(bmd.qj)), dcn1.b, dcn1.c, dcn1.d, random.nextGaussian() * 0.15D, random.nextDouble() * 0.2D, random.nextGaussian() * 0.15D);
/*      */         }
/*      */         
/* 2714 */         f1 = (j >> 16 & 0xFF) / 255.0F;
/* 2715 */         f2 = (j >> 8 & 0xFF) / 255.0F;
/* 2716 */         f3 = (j >> 0 & 0xFF) / 255.0F;
/*      */         
/* 2718 */         hf = (i == 2007) ? hh.H : hh.p;
/* 2719 */         for (i2 = 0; i2 < 100; i2++) {
/* 2720 */           d4 = random.nextDouble() * 4.0D;
/* 2721 */           d6 = random.nextDouble() * Math.PI * 2.0D;
/* 2722 */           double d7 = Math.cos(d6) * d4;
/* 2723 */           double d8 = 0.01D + random.nextDouble() * 0.5D;
/* 2724 */           double d9 = Math.sin(d6) * d4;
/*      */           
/* 2726 */           dyg dyg = b(hf, hf.b().c(), dcn1.b + d7 * 0.1D, dcn1.c + 0.3D, dcn1.d + d9 * 0.1D, d7, d8, d9);
/* 2727 */           if (dyg != null) {
/* 2728 */             float f = 0.75F + random.nextFloat() * 0.25F;
/* 2729 */             dyg.a(f1 * f, f2 * f, f3 * f);
/* 2730 */             dyg.c((float)d4);
/*      */           } 
/*      */         } 
/* 2733 */         this.n.a(fx1, adq.oE, adr.g, 1.0F, random.nextFloat() * 0.1F + 0.9F, false);
/*      */         break;
/*      */       
/*      */       case 2001:
/* 2737 */         ceh = buo.a(j);
/* 2738 */         if (!ceh.g()) {
/* 2739 */           cae cae = ceh.o();
/* 2740 */           this.n.a(fx1, cae.c(), adr.e, (cae.a() + 1.0F) / 2.0F, cae.b() * 0.8F, false);
/*      */         } 
/* 2742 */         this.j.f.a(fx1, ceh);
/*      */         break;
/*      */       case 2004:
/* 2745 */         for (k = 0; k < 20; k++) {
/* 2746 */           double d7 = fx1.u() + 0.5D + (random.nextDouble() - 0.5D) * 2.0D;
/* 2747 */           double d8 = fx1.v() + 0.5D + (random.nextDouble() - 0.5D) * 2.0D;
/* 2748 */           d4 = fx1.w() + 0.5D + (random.nextDouble() - 0.5D) * 2.0D;
/*      */           
/* 2750 */           this.n.a(hh.S, d7, d8, d4, 0.0D, 0.0D, 0.0D);
/* 2751 */           this.n.a(hh.A, d7, d8, d4, 0.0D, 0.0D, 0.0D);
/*      */         } 
/*      */         break;
/*      */       case 2005:
/* 2755 */         bkj.a(this.n, fx1, j);
/*      */         break;
/*      */       case 2008:
/* 2758 */         this.n.a(hh.w, fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D, 0.0D, 0.0D, 0.0D);
/*      */         break;
/*      */       case 1500:
/* 2761 */         bvk.a(this.n, fx1, (j > 0));
/*      */         break;
/*      */       case 1501:
/* 2764 */         this.n.a(fx1, adq.gX, adr.e, 0.5F, 2.6F + (random.nextFloat() - random.nextFloat()) * 0.8F, false);
/* 2765 */         for (k = 0; k < 8; k++) {
/* 2766 */           this.n.a(hh.L, fx1.u() + random.nextDouble(), fx1.v() + 1.2D, fx1.w() + random.nextDouble(), 0.0D, 0.0D, 0.0D);
/*      */         }
/*      */         break;
/*      */       case 1502:
/* 2770 */         this.n.a(fx1, adq.mw, adr.e, 0.5F, 2.6F + (random.nextFloat() - random.nextFloat()) * 0.8F, false);
/* 2771 */         for (k = 0; k < 5; k++) {
/* 2772 */           double d7 = fx1.u() + random.nextDouble() * 0.6D + 0.2D;
/* 2773 */           double d8 = fx1.v() + random.nextDouble() * 0.6D + 0.2D;
/* 2774 */           d4 = fx1.w() + random.nextDouble() * 0.6D + 0.2D;
/*      */           
/* 2776 */           this.n.a(hh.S, d7, d8, d4, 0.0D, 0.0D, 0.0D);
/*      */         } 
/*      */         break;
/*      */       case 1503:
/* 2780 */         this.n.a(fx1, adq.dK, adr.e, 1.0F, 1.0F, false);
/* 2781 */         for (k = 0; k < 16; k++) {
/* 2782 */           double d7 = fx1.u() + (5.0D + random.nextDouble() * 6.0D) / 16.0D;
/* 2783 */           double d8 = fx1.v() + 0.8125D;
/* 2784 */           d4 = fx1.w() + (5.0D + random.nextDouble() * 6.0D) / 16.0D;
/*      */           
/* 2786 */           this.n.a(hh.S, d7, d8, d4, 0.0D, 0.0D, 0.0D);
/*      */         } 
/*      */         break;
/*      */       
/*      */       case 2006:
/* 2791 */         for (k = 0; k < 200; k++) {
/* 2792 */           f2 = random.nextFloat() * 4.0F;
/* 2793 */           f3 = random.nextFloat() * 6.2831855F;
/* 2794 */           double d = (afm.b(f3) * f2);
/* 2795 */           d4 = 0.01D + random.nextDouble() * 0.5D;
/* 2796 */           d6 = (afm.a(f3) * f2);
/*      */           
/* 2798 */           dyg dyg = b(hh.i, false, fx1.u() + d * 0.1D, fx1.v() + 0.3D, fx1.w() + d6 * 0.1D, d, d4, d6);
/* 2799 */           if (dyg != null) {
/* 2800 */             dyg.c(f2);
/*      */           }
/*      */         } 
/*      */         
/* 2804 */         if (j == 1) {
/* 2805 */           this.n.a(fx1, adq.dr, adr.f, 1.0F, random.nextFloat() * 0.1F + 0.9F, false);
/*      */         }
/*      */         break;
/*      */       case 2009:
/* 2809 */         for (k = 0; k < 8; k++) {
/* 2810 */           this.n.a(hh.f, fx1.u() + random.nextDouble(), fx1.v() + 1.2D, fx1.w() + random.nextDouble(), 0.0D, 0.0D, 0.0D);
/*      */         }
/*      */         break;
/*      */       case 1012:
/* 2814 */         this.n.a(fx1, adq.rj, adr.e, 1.0F, random.nextFloat() * 0.1F + 0.9F, false);
/*      */         break;
/*      */       case 1036:
/* 2817 */         this.n.a(fx1, adq.gD, adr.e, 1.0F, random.nextFloat() * 0.1F + 0.9F, false);
/*      */         break;
/*      */       case 1013:
/* 2820 */         this.n.a(fx1, adq.rl, adr.e, 1.0F, random.nextFloat() * 0.1F + 0.9F, false);
/*      */         break;
/*      */       case 1014:
/* 2823 */         this.n.a(fx1, adq.dX, adr.e, 1.0F, random.nextFloat() * 0.1F + 0.9F, false);
/*      */         break;
/*      */       case 1011:
/* 2826 */         this.n.a(fx1, adq.gv, adr.e, 1.0F, random.nextFloat() * 0.1F + 0.9F, false);
/*      */         break;
/*      */       case 1006:
/* 2829 */         this.n.a(fx1, adq.rk, adr.e, 1.0F, random.nextFloat() * 0.1F + 0.9F, false);
/*      */         break;
/*      */       case 1007:
/* 2832 */         this.n.a(fx1, adq.rm, adr.e, 1.0F, random.nextFloat() * 0.1F + 0.9F, false);
/*      */         break;
/*      */       case 1037:
/* 2835 */         this.n.a(fx1, adq.gE, adr.e, 1.0F, random.nextFloat() * 0.1F + 0.9F, false);
/*      */         break;
/*      */       case 1008:
/* 2838 */         this.n.a(fx1, adq.dY, adr.e, 1.0F, random.nextFloat() * 0.1F + 0.9F, false);
/*      */         break;
/*      */       case 1005:
/* 2841 */         this.n.a(fx1, adq.gw, adr.e, 1.0F, random.nextFloat() * 0.1F + 0.9F, false);
/*      */         break;
/*      */       case 1009:
/* 2844 */         this.n.a(fx1, adq.ej, adr.e, 0.5F, 2.6F + (random.nextFloat() - random.nextFloat()) * 0.8F, false);
/*      */         break;
/*      */       case 1029:
/* 2847 */         this.n.a(fx1, adq.C, adr.e, 1.0F, random.nextFloat() * 0.1F + 0.9F, false);
/*      */         break;
/*      */       case 1030:
/* 2850 */         this.n.a(fx1, adq.I, adr.e, 1.0F, random.nextFloat() * 0.1F + 0.9F, false);
/*      */         break;
/*      */       case 1044:
/* 2853 */         this.n.a(fx1, adq.on, adr.e, 1.0F, this.n.t.nextFloat() * 0.1F + 0.9F, false);
/*      */         break;
/*      */       case 1031:
/* 2856 */         this.n.a(fx1, adq.F, adr.e, 0.3F, this.n.t.nextFloat() * 0.1F + 0.9F, false);
/*      */         break;
/*      */       case 1039:
/* 2859 */         this.n.a(fx1, adq.kI, adr.f, 0.3F, this.n.t.nextFloat() * 0.1F + 0.9F, false);
/*      */         break;
/*      */       case 1010:
/* 2862 */         if (blx.b(j) instanceof bmq) {
/* 2863 */           a(((bmq)blx.b(j)).v(), fx1); break;
/*      */         } 
/* 2865 */         a((adp)null, fx1);
/*      */         break;
/*      */       
/*      */       case 1015:
/* 2869 */         this.n.a(fx1, adq.eW, adr.f, 10.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F, false);
/*      */         break;
/*      */       case 1017:
/* 2872 */         this.n.a(fx1, adq.dv, adr.f, 10.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F, false);
/*      */         break;
/*      */       case 1016:
/* 2875 */         this.n.a(fx1, adq.eV, adr.f, 10.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F, false);
/*      */         break;
/*      */       case 1019:
/* 2878 */         this.n.a(fx1, adq.rI, adr.f, 2.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F, false);
/*      */         break;
/*      */       case 1022:
/* 2881 */         this.n.a(fx1, adq.qR, adr.f, 2.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F, false);
/*      */         break;
/*      */       case 1021:
/* 2884 */         this.n.a(fx1, adq.rK, adr.f, 2.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F, false);
/*      */         break;
/*      */       case 1020:
/* 2887 */         this.n.a(fx1, adq.rJ, adr.f, 2.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F, false);
/*      */         break;
/*      */       case 1018:
/* 2890 */         this.n.a(fx1, adq.aP, adr.f, 2.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F, false);
/*      */         break;
/*      */       case 1024:
/* 2893 */         this.n.a(fx1, adq.qU, adr.f, 2.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F, false);
/*      */         break;
/*      */       case 1026:
/* 2896 */         this.n.a(fx1, adq.rS, adr.f, 2.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F, false);
/*      */         break;
/*      */       case 1027:
/* 2899 */         this.n.a(fx1, adq.rZ, adr.g, 2.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F, false);
/*      */         break;
/*      */       case 1040:
/* 2902 */         this.n.a(fx1, adq.rL, adr.g, 2.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F, false);
/*      */         break;
/*      */       case 1041:
/* 2905 */         this.n.a(fx1, adq.gk, adr.g, 2.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F, false);
/*      */         break;
/*      */       case 1025:
/* 2908 */         this.n.a(fx1, adq.at, adr.g, 0.05F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F, false);
/*      */         break;
/*      */       case 1042:
/* 2911 */         this.n.a(fx1, adq.fr, adr.e, 1.0F, this.n.t.nextFloat() * 0.1F + 0.9F, false);
/*      */         break;
/*      */       case 1043:
/* 2914 */         this.n.a(fx1, adq.aX, adr.e, 1.0F, this.n.t.nextFloat() * 0.1F + 0.9F, false);
/*      */         break;
/*      */       case 3000:
/* 2917 */         this.n.a(hh.v, true, fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D, 0.0D, 0.0D, 0.0D);
/* 2918 */         this.n.a(fx1, adq.dJ, adr.e, 10.0F, (1.0F + (this.n.t.nextFloat() - this.n.t.nextFloat()) * 0.2F) * 0.7F, false);
/*      */         break;
/*      */       case 3001:
/* 2921 */         this.n.a(fx1, adq.dt, adr.f, 64.0F, 0.8F + this.n.t.nextFloat() * 0.3F, false);
/*      */         break;
/*      */     }  }
/*      */ 
/*      */   
/*      */   public void b(int ☃, fx fx1, int i) {
/* 2927 */     if (i < 0 || i >= 10) {
/* 2928 */       zq zq = (zq)this.A.remove(☃);
/* 2929 */       if (zq != null) {
/* 2930 */         a(zq);
/*      */       }
/*      */     } else {
/* 2933 */       zq zq = (zq)this.A.get(☃);
/* 2934 */       if (zq != null) {
/* 2935 */         a(zq);
/*      */       }
/*      */       
/* 2938 */       if (zq == null || zq.b().u() != fx1.u() || zq.b().v() != fx1.v() || zq.b().w() != fx1.w()) {
/* 2939 */         zq = new zq(☃, fx1);
/* 2940 */         this.A.put(☃, zq);
/*      */       } 
/*      */       
/* 2943 */       zq.a(i);
/* 2944 */       zq.b(this.z);
/* 2945 */       ((SortedSet<zq>)this.B.computeIfAbsent(zq.b().a(), ☃ -> Sets.newTreeSet())).add(zq);
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean n() {
/* 2950 */     return (this.o.isEmpty() && this.ab.f());
/*      */   }
/*      */   
/*      */   class a {
/*      */     private final ecu.c b;
/*      */     private final gc c;
/*      */     private byte d;
/*      */     private final int e;
/*      */     
/*      */     private a(eae this$0, ecu.c ☃, @Nullable gc gc1, int i) {
/* 2960 */       this.b = ☃;
/* 2961 */       this.c = gc1;
/* 2962 */       this.e = i;
/*      */     }
/*      */     
/*      */     public void a(byte ☃, gc gc1) {
/* 2966 */       this.d = (byte)(this.d | ☃ | 1 << gc1.ordinal());
/*      */     }
/*      */     
/*      */     public boolean a(gc ☃) {
/* 2970 */       return ((this.d & 1 << ☃.ordinal()) > 0);
/*      */     }
/*      */   }
/*      */   
/*      */   public void o() {
/* 2975 */     this.an = true;
/* 2976 */     this.w = true;
/*      */   }
/*      */   
/*      */   public void a(Collection<ccj> ☃, Collection<ccj> collection1) {
/* 2980 */     synchronized (this.q) {
/* 2981 */       this.q.removeAll(☃);
/* 2982 */       this.q.addAll(collection1);
/*      */     } 
/*      */   }
/*      */   
/*      */   public static int a(bra ☃, fx fx1) {
/* 2987 */     return a(☃, ☃.d_(fx1), fx1);
/*      */   }
/*      */   
/*      */   public static int a(bra ☃, ceh ceh1, fx fx1) {
/* 2991 */     if (ceh1.e(☃, fx1))
/*      */     {
/* 2993 */       return 15728880;
/*      */     }
/* 2995 */     int i = ☃.a(bsf.a, fx1);
/* 2996 */     int j = ☃.a(bsf.b, fx1);
/* 2997 */     int k = ceh1.f();
/* 2998 */     if (j < k) {
/* 2999 */       j = k;
/*      */     }
/* 3001 */     return i << 20 | j << 4;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public deg p() {
/* 3006 */     return this.D;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public deg q() {
/* 3011 */     return this.F;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public deg r() {
/* 3016 */     return this.G;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public deg s() {
/* 3021 */     return this.H;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public deg t() {
/* 3026 */     return this.I;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public deg u() {
/* 3031 */     return this.J;
/*      */   }
/*      */   
/*      */   public static class b extends RuntimeException {
/*      */     public b(String ☃, Throwable throwable) {
/* 3036 */       super(☃, throwable);
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eae.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */