/*      */ package net.minecraft.server;
/*      */ import aab;
/*      */ import aae;
/*      */ import aag;
/*      */ import aah;
/*      */ import aal;
/*      */ import aap;
/*      */ import aaq;
/*      */ import aax;
/*      */ import abc;
/*      */ import abu;
/*      */ import abw;
/*      */ import acq;
/*      */ import acu;
/*      */ import acw;
/*      */ import adb;
/*      */ import aed;
/*      */ import aen;
/*      */ import aeu;
/*      */ import aev;
/*      */ import afc;
/*      */ import afm;
/*      */ import afn;
/*      */ import anq;
/*      */ import anv;
/*      */ import anw;
/*      */ import anz;
/*      */ import aor;
/*      */ import apc;
/*      */ import apd;
/*      */ import azm;
/*      */ import bff;
/*      */ import bfq;
/*      */ import bfw;
/*      */ import bor;
/*      */ import brd;
/*      */ import brk;
/*      */ import brs;
/*      */ import brt;
/*      */ import bru;
/*      */ import brx;
/*      */ import bsa;
/*      */ import bsr;
/*      */ import bsv;
/*      */ import bsx;
/*      */ import bsy;
/*      */ import buo;
/*      */ import cfs;
/*      */ import cfu;
/*      */ import cfy;
/*      */ import chd;
/*      */ import che;
/*      */ import cho;
/*      */ import cht;
/*      */ import chu;
/*      */ import chw;
/*      */ import civ;
/*      */ import com.google.common.base.Splitter;
/*      */ import com.google.common.collect.ImmutableList;
/*      */ import com.google.common.collect.Lists;
/*      */ import com.google.common.collect.Maps;
/*      */ import com.google.common.collect.Sets;
/*      */ import com.mojang.authlib.GameProfile;
/*      */ import com.mojang.authlib.GameProfileRepository;
/*      */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*      */ import com.mojang.datafixers.DataFixer;
/*      */ import csw;
/*      */ import cxr;
/*      */ import cxs;
/*      */ import cya;
/*      */ import cyb;
/*      */ import cyc;
/*      */ import cyd;
/*      */ import cye;
/*      */ import cyg;
/*      */ import cyk;
/*      */ import cym;
/*      */ import cyn;
/*      */ import cyz;
/*      */ import cza;
/*      */ import da;
/*      */ import db;
/*      */ import dc;
/*      */ import dcm;
/*      */ import dcn;
/*      */ import ddo;
/*      */ import fx;
/*      */ import gi;
/*      */ import gm;
/*      */ import gn;
/*      */ import io.netty.buffer.ByteBuf;
/*      */ import io.netty.buffer.ByteBufOutputStream;
/*      */ import io.netty.buffer.Unpooled;
/*      */ import it.unimi.dsi.fastutil.longs.LongIterator;
/*      */ import java.awt.image.BufferedImage;
/*      */ import java.io.File;
/*      */ import java.io.IOException;
/*      */ import java.io.OutputStream;
/*      */ import java.io.UnsupportedEncodingException;
/*      */ import java.io.Writer;
/*      */ import java.lang.management.ManagementFactory;
/*      */ import java.lang.management.ThreadInfo;
/*      */ import java.lang.management.ThreadMXBean;
/*      */ import java.net.Proxy;
/*      */ import java.net.URLEncoder;
/*      */ import java.nio.ByteBuffer;
/*      */ import java.nio.charset.StandardCharsets;
/*      */ import java.nio.file.Files;
/*      */ import java.nio.file.Path;
/*      */ import java.nio.file.attribute.FileAttribute;
/*      */ import java.security.KeyPair;
/*      */ import java.util.Arrays;
/*      */ import java.util.Collection;
/*      */ import java.util.Collections;
/*      */ import java.util.Date;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Objects;
/*      */ import java.util.Optional;
/*      */ import java.util.Random;
/*      */ import java.util.Set;
/*      */ import java.util.UUID;
/*      */ import java.util.concurrent.CompletableFuture;
/*      */ import java.util.concurrent.CompletionStage;
/*      */ import java.util.concurrent.Executor;
/*      */ import java.util.concurrent.atomic.AtomicReference;
/*      */ import java.util.function.BooleanSupplier;
/*      */ import java.util.function.Function;
/*      */ import java.util.function.Supplier;
/*      */ import javax.annotation.Nullable;
/*      */ import javax.imageio.ImageIO;
/*      */ import kh;
/*      */ import l;
/*      */ import ll;
/*      */ import nr;
/*      */ import oe;
/*      */ import oj;
/*      */ import org.apache.commons.lang3.Validate;
/*      */ import org.apache.logging.log4j.LogManager;
/*      */ import org.apache.logging.log4j.Logger;
/*      */ import rk;
/*      */ import u;
/*      */ import un;
/*      */ import vj;
/*      */ import vk;
/*      */ import vv;
/*      */ import vx;
/*      */ import vz;
/*      */ import w;
/*      */ import wa;
/*      */ import wb;
/*      */ import wd;
/*      */ import x;
/*      */ 
/*      */ public abstract class MinecraftServer extends aof<wb> implements apd, da, AutoCloseable {
/*  156 */   private static final Logger j = LogManager.getLogger();
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
/*  168 */   public static final File b = new File("usercache.json");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  178 */   public static final bsa c = new bsa("Demo World", bru.b, false, aor.c, false, new brt(), brk.a);
/*      */   
/*      */   protected final cyg.a d;
/*      */   
/*      */   protected final cyk e;
/*  183 */   private final apc k = new apc("server", this, x.b());
/*      */   
/*  185 */   private final List<Runnable> l = Lists.newArrayList();
/*  186 */   private final anq m = new anq(x.a, this::ai);
/*  187 */   private anw n = (anw)ant.a;
/*      */   
/*      */   private final aax o;
/*      */   private final aaq p;
/*  191 */   private final un q = new un();
/*  192 */   private final Random r = new Random();
/*      */   
/*      */   private final DataFixer s;
/*      */   private String t;
/*  196 */   private int u = -1;
/*      */   protected final gn.b f;
/*  198 */   private final Map<vj<brx>, aag> v = Maps.newLinkedHashMap();
/*      */   
/*      */   private acu w;
/*      */   
/*      */   private volatile boolean x = true;
/*      */   private boolean y;
/*      */   private int z;
/*      */   protected final Proxy g;
/*      */   private boolean A;
/*      */   private boolean B;
/*      */   private boolean C;
/*      */   private boolean D;
/*      */   @Nullable
/*      */   private String E;
/*      */   private int F;
/*      */   private int G;
/*  214 */   public final long[] h = new long[100];
/*      */   
/*      */   @Nullable
/*      */   private KeyPair H;
/*      */   @Nullable
/*      */   private String I;
/*      */   private boolean J;
/*  221 */   private String K = "";
/*  222 */   private String L = "";
/*      */   private volatile boolean M;
/*      */   private long N;
/*      */   private boolean O;
/*      */   private boolean P;
/*      */   private final MinecraftSessionService Q;
/*      */   private final GameProfileRepository R;
/*      */   private final acq S;
/*      */   private long T;
/*      */   private final Thread U;
/*  232 */   private long V = x.b();
/*      */   private long W;
/*      */   private boolean X;
/*      */   private boolean Y;
/*      */   private final abw Z;
/*  237 */   private final wa aa = new wa(this);
/*      */   @Nullable
/*      */   private cya ab;
/*  240 */   private final wd ac = new wd();
/*      */   
/*      */   private final vx ad;
/*  243 */   private final afc ae = new afc();
/*      */   
/*      */   private boolean af;
/*      */   private float ag;
/*      */   private final Executor ah;
/*      */   @Nullable
/*      */   private String ai;
/*      */   private vz aj;
/*      */   private final csw ak;
/*      */   protected final cyn i;
/*      */   
/*      */   public static <S extends MinecraftServer> S a(Function<Thread, S> ☃) {
/*  255 */     AtomicReference<S> atomicReference = new AtomicReference<>();
/*      */     
/*  257 */     Thread thread = new Thread(() -> ((MinecraftServer)☃.get()).w(), "Server thread");
/*  258 */     thread.setUncaughtExceptionHandler((☃, throwable) -> j.error(throwable));
/*      */     
/*  260 */     MinecraftServer minecraftServer = (MinecraftServer)☃.apply(thread);
/*  261 */     atomicReference.set((S)minecraftServer);
/*  262 */     thread.start();
/*  263 */     return (S)minecraftServer;
/*      */   }
/*      */   
/*      */   public MinecraftServer(Thread ☃, gn.b b1, cyg.a a1, cyn cyn1, abw abw1, Proxy proxy, DataFixer dataFixer, vz vz1, MinecraftSessionService minecraftSessionService, GameProfileRepository gameProfileRepository, acq acq1, aaq aaq1) {
/*  267 */     super("Server");
/*  268 */     this.f = b1;
/*  269 */     this.i = cyn1;
/*  270 */     this.g = proxy;
/*  271 */     this.Z = abw1;
/*  272 */     this.aj = vz1;
/*  273 */     this.Q = minecraftSessionService;
/*  274 */     this.R = gameProfileRepository;
/*  275 */     this.S = acq1;
/*  276 */     this.o = new aax(this);
/*  277 */     this.p = aaq1;
/*  278 */     this.d = a1;
/*  279 */     this.e = a1.b();
/*  280 */     this.s = dataFixer;
/*  281 */     this.ad = new vx(this, vz1.a());
/*  282 */     this.ak = new csw(vz1.h(), a1, dataFixer);
/*  283 */     this.U = ☃;
/*  284 */     this.ah = x.f();
/*      */   }
/*      */   
/*      */   private void a(cyc ☃) {
/*  288 */     ddo ddo = (ddo)☃.a(ddo::new, "scoreboard");
/*  289 */     ddo.a((ddn)aH());
/*  290 */     aH().a((Runnable)new cxr((cxs)ddo));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static void a(cyg.a ☃) {
/*  296 */     if (☃.c()) {
/*  297 */       j.info("Converting map!");
/*  298 */       ☃.a(new afn() {
/*  299 */             private long a = x.b();
/*      */ 
/*      */ 
/*      */             
/*      */             public void a(nr ☃) {}
/*      */ 
/*      */ 
/*      */             
/*      */             public void b(nr ☃) {}
/*      */ 
/*      */             
/*      */             public void a(int ☃) {
/*  311 */               if (x.b() - this.a >= 1000L) {
/*  312 */                 this.a = x.b();
/*  313 */                 MinecraftServer.aZ().info("Converting... {}%", Integer.valueOf(☃));
/*      */               } 
/*      */             }
/*      */ 
/*      */ 
/*      */             
/*      */             public void a() {}
/*      */ 
/*      */             
/*      */             public void c(nr ☃) {}
/*      */           });
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void l_() {
/*  329 */     r();
/*      */     
/*  331 */     this.i.a(getServerModName(), o().isPresent());
/*      */     
/*  333 */     aap ☃ = this.p.create(11);
/*      */     
/*  335 */     a(☃);
/*      */     
/*  337 */     q();
/*  338 */     b(☃);
/*      */   }
/*      */   protected void q() {}
/*      */   
/*      */   protected void a(aap ☃) {
/*      */     cfy cfy;
/*      */     chd chd;
/*  345 */     cym cym = this.i.H();
/*  346 */     chw chw = this.i.A();
/*  347 */     boolean bool = chw.g();
/*  348 */     long l1 = chw.a();
/*  349 */     long l2 = bsx.a(l1);
/*  350 */     ImmutableList immutableList = ImmutableList.of(new chu(), new cht(), new bff(), new azm(), new bfq(cym));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  357 */     gi<che> gi = chw.d();
/*      */     
/*  359 */     che che = (che)gi.a(che.b);
/*      */     
/*  361 */     if (che == null) {
/*  362 */       chd = (chd)this.f.a().d(chd.f);
/*  363 */       cho cho = chw.a((gm)this.f.b(gm.ay), (gm)this.f.b(gm.ar), (new Random()).nextLong());
/*      */     } else {
/*  365 */       chd = che.b();
/*  366 */       cfy = che.c();
/*      */     } 
/*  368 */     aag aag = new aag(this, this.ah, this.d, cym, brx.g, chd, ☃, cfy, bool, l2, (List)immutableList, true);
/*  369 */     this.v.put(brx.g, aag);
/*  370 */     cyc cyc = aag.s();
/*  371 */     a(cyc);
/*  372 */     this.ab = new cya(cyc);
/*  373 */     cfu cfu = aag.f();
/*  374 */     cfu.a(cym.r());
/*      */     
/*  376 */     if (!cym.p()) {
/*      */       try {
/*  378 */         a(aag, cym, chw.c(), bool, true);
/*  379 */         cym.c(true);
/*  380 */         if (bool) {
/*  381 */           a(this.i);
/*      */         }
/*  383 */       } catch (Throwable throwable) {
/*  384 */         l l = l.a(throwable, "Exception initializing level");
/*      */         try {
/*  386 */           aag.a(l);
/*  387 */         } catch (Throwable throwable1) {}
/*      */ 
/*      */         
/*  390 */         throw new u(l);
/*      */       } 
/*  392 */       cym.c(true);
/*      */     } 
/*      */     
/*  395 */     ae().a(aag);
/*      */     
/*  397 */     if (this.i.E() != null) {
/*  398 */       aM().a(this.i.E());
/*      */     }
/*      */     
/*  401 */     for (Map.Entry<vj<che>, che> entry : (Iterable<Map.Entry<vj<che>, che>>)gi.d()) {
/*  402 */       vj<che> vj = entry.getKey();
/*  403 */       if (vj == che.b) {
/*      */         continue;
/*      */       }
/*  406 */       vj<brx> vj1 = vj.a(gm.L, vj.a());
/*  407 */       chd chd1 = ((che)entry.getValue()).b();
/*  408 */       cfy cfy1 = ((che)entry.getValue()).c();
/*  409 */       cyb cyb = new cyb(this.i, cym);
/*  410 */       aag aag1 = new aag(this, this.ah, this.d, (cym)cyb, vj1, chd1, ☃, cfy1, bool, l2, (List)ImmutableList.of(), false);
/*  411 */       cfu.a((cfs)new cfs.a(aag1.f()));
/*  412 */       this.v.put(vj1, aag1);
/*      */     } 
/*      */   }
/*      */   
/*      */   private static void a(aag ☃, cym cym1, boolean bool1, boolean bool2, boolean bool3) {
/*  417 */     cfy cfy = ☃.i().g();
/*  418 */     if (!bool3) {
/*  419 */       cym1.a(fx.b.b(cfy.c()), 0.0F);
/*      */       
/*      */       return;
/*      */     } 
/*  423 */     if (bool2) {
/*  424 */       cym1.a(fx.b.b(), 0.0F);
/*      */       
/*      */       return;
/*      */     } 
/*  428 */     bsy bsy = cfy.d();
/*  429 */     Random random = new Random(☃.C());
/*      */     
/*  431 */     fx fx = bsy.a(0, ☃.t_(), 0, 256, ☃ -> ☃.b().b(), random);
/*  432 */     brd brd = (fx == null) ? new brd(0, 0) : new brd(fx);
/*      */     
/*  434 */     if (fx == null) {
/*  435 */       j.warn("Unable to find spawn biome");
/*      */     }
/*      */     
/*  438 */     boolean bool = false;
/*  439 */     for (buo buo : aed.V.b()) {
/*  440 */       if (bsy.c().contains(buo.n())) {
/*  441 */         bool = true;
/*      */         
/*      */         break;
/*      */       } 
/*      */     } 
/*  446 */     cym1.a(brd.l().b(8, cfy.c(), 8), 0.0F);
/*      */     
/*  448 */     int i = 0;
/*  449 */     int j = 0;
/*  450 */     int k = 0;
/*  451 */     int m = -1;
/*  452 */     int n = 32;
/*  453 */     for (int i1 = 0; i1 < 1024; i1++) {
/*  454 */       if (i > -16 && i <= 16 && j > -16 && j <= 16) {
/*  455 */         fx fx1 = aab.a(☃, new brd(brd.b + i, brd.c + j), bool);
/*  456 */         if (fx1 != null) {
/*  457 */           cym1.a(fx1, 0.0F);
/*      */           break;
/*      */         } 
/*      */       } 
/*  461 */       if (i == j || (i < 0 && i == -j) || (i > 0 && i == 1 - j)) {
/*  462 */         int i2 = k;
/*  463 */         k = -m;
/*  464 */         m = i2;
/*      */       } 
/*  466 */       i += k;
/*  467 */       j += m;
/*      */     } 
/*      */     
/*  470 */     if (bool1) {
/*      */ 
/*      */       
/*  473 */       civ<?, ?> civ = kh.U;
/*  474 */       civ.a((bsr)☃, cfy, ☃.t, new fx(cym1.a(), cym1.b(), cym1.c()));
/*      */     } 
/*      */   }
/*      */   
/*      */   private void a(cyn ☃) {
/*  479 */     ☃.a(aor.a);
/*  480 */     ☃.d(true);
/*      */     
/*  482 */     cym cym = ☃.H();
/*  483 */     cym.b(false);
/*  484 */     cym.a(false);
/*  485 */     cym.a(1000000000);
/*  486 */     cym.b(6000L);
/*  487 */     cym.a(bru.e);
/*      */   }
/*      */   
/*      */   private void b(aap ☃) {
/*  491 */     aag aag = E();
/*  492 */     j.info("Preparing start region for dimension {}", aag.Y().a());
/*  493 */     fx fx = aag.u();
/*  494 */     ☃.a(new brd(fx));
/*      */     
/*  496 */     aae aae = aag.i();
/*      */     
/*  498 */     aae.a().a(500);
/*  499 */     this.V = x.b();
/*      */     
/*  501 */     aae.a(aal.a, new brd(fx), 11, afx.a);
/*      */     
/*  503 */     while (aae.b() != 441) {
/*  504 */       this.V = x.b() + 10L;
/*  505 */       x();
/*      */     } 
/*      */     
/*  508 */     this.V = x.b() + 10L;
/*  509 */     x();
/*      */     
/*  511 */     for (aag aag1 : this.v.values()) {
/*  512 */       brs brs = (brs)aag1.s().b(brs::new, "chunks");
/*  513 */       if (brs != null) {
/*  514 */         LongIterator longIterator = brs.a().iterator();
/*  515 */         while (longIterator.hasNext()) {
/*  516 */           long l = longIterator.nextLong();
/*  517 */           brd brd = new brd(l);
/*  518 */           aag1.i().a(brd, true);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  523 */     this.V = x.b() + 10L;
/*  524 */     x();
/*      */ 
/*      */     
/*  527 */     ☃.b();
/*      */ 
/*      */     
/*  530 */     aae.a().a(5);
/*      */     
/*  532 */     bc();
/*      */   }
/*      */   
/*      */   protected void r() {
/*  536 */     File ☃ = this.d.a(cye.h).toFile();
/*  537 */     if (☃.isFile()) {
/*  538 */       String str = this.d.a();
/*      */       try {
/*  540 */         a("level://" + URLEncoder.encode(str, StandardCharsets.UTF_8.toString()) + "/" + "resources.zip", "");
/*  541 */       } catch (UnsupportedEncodingException unsupportedEncodingException) {
/*  542 */         j.warn("Something went wrong url encoding {}", str);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public bru s() {
/*  548 */     return this.i.m();
/*      */   }
/*      */   
/*      */   public boolean f() {
/*  552 */     return this.i.n();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(boolean ☃, boolean bool1, boolean bool2) {
/*  562 */     boolean bool = false;
/*  563 */     for (aag aag1 : G()) {
/*  564 */       if (!☃) {
/*  565 */         j.info("Saving chunks for level '{}'/{}", aag1, aag1.Y().a());
/*      */       }
/*  567 */       aag1.a(null, bool1, (aag1.c && !bool2));
/*  568 */       bool = true;
/*      */     } 
/*  570 */     aag aag = E();
/*  571 */     cym cym = this.i.H();
/*  572 */     cym.a(aag.f().t());
/*  573 */     this.i.b(aM().c());
/*  574 */     this.d.a((gn)this.f, this.i, ae().q());
/*  575 */     return bool;
/*      */   }
/*      */ 
/*      */   
/*      */   public void close() {
/*  580 */     t();
/*      */   }
/*      */   
/*      */   protected void t() {
/*  584 */     j.info("Stopping server");
/*  585 */     if (af() != null) {
/*  586 */       af().b();
/*      */     }
/*  588 */     if (this.w != null) {
/*  589 */       j.info("Saving players");
/*  590 */       this.w.h();
/*  591 */       this.w.r();
/*      */     } 
/*  593 */     j.info("Saving worlds");
/*  594 */     for (aag ☃ : G()) {
/*  595 */       if (☃ != null) {
/*  596 */         ☃.c = false;
/*      */       }
/*      */     } 
/*  599 */     a(false, true, false);
/*  600 */     for (aag ☃ : G()) {
/*  601 */       if (☃ != null) {
/*      */         try {
/*  603 */           ☃.close();
/*  604 */         } catch (IOException iOException) {
/*  605 */           j.error("Exception closing the level", iOException);
/*      */         } 
/*      */       }
/*      */     } 
/*  609 */     if (this.k.d()) {
/*  610 */       this.k.e();
/*      */     }
/*  612 */     this.aj.close();
/*      */     try {
/*  614 */       this.d.close();
/*  615 */     } catch (IOException ☃) {
/*  616 */       j.error("Failed to unlock level {}", this.d.a(), ☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   public String u() {
/*  621 */     return this.t;
/*      */   }
/*      */   
/*      */   public void a_(String ☃) {
/*  625 */     this.t = ☃;
/*      */   }
/*      */   
/*      */   public boolean v() {
/*  629 */     return this.x;
/*      */   }
/*      */   
/*      */   public void a(boolean ☃) {
/*  633 */     this.x = false;
/*  634 */     if (☃) {
/*      */       try {
/*  636 */         this.U.join();
/*  637 */       } catch (InterruptedException interruptedException) {
/*  638 */         j.error("Error while shutting down", interruptedException);
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   protected void w() {
/*      */     try {
/*  645 */       if (d()) {
/*  646 */         this.V = x.b();
/*      */         
/*  648 */         this.q.a((nr)new oe(this.E));
/*  649 */         this.q.a(new un.c(w.a().getName(), w.a().getProtocolVersion()));
/*      */         
/*  651 */         a(this.q);
/*      */         
/*  653 */         while (this.x) {
/*  654 */           long ☃ = x.b() - this.V;
/*      */           
/*  656 */           if (☃ > 2000L && this.V - this.N >= 15000L) {
/*  657 */             long l = ☃ / 50L;
/*  658 */             j.warn("Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind", Long.valueOf(☃), Long.valueOf(l));
/*  659 */             this.V += l * 50L;
/*  660 */             this.N = this.V;
/*      */           } 
/*      */           
/*  663 */           this.V += 50L;
/*      */           
/*  665 */           anz anz = anz.a("Server");
/*  666 */           a(anz);
/*      */           
/*  668 */           this.n.a();
/*  669 */           this.n.a("tick");
/*  670 */           a(this::ba);
/*  671 */           this.n.b("nextTickWait");
/*  672 */           this.X = true;
/*  673 */           this.W = Math.max(x.b() + 50L, this.V);
/*  674 */           x();
/*  675 */           this.n.c();
/*  676 */           this.n.b();
/*      */           
/*  678 */           b(anz);
/*      */           
/*  680 */           this.M = true;
/*      */         } 
/*      */       } else {
/*  683 */         a((l)null);
/*      */       } 
/*  685 */     } catch (Throwable ☃) {
/*  686 */       l l; j.error("Encountered an unexpected exception", ☃);
/*      */ 
/*      */       
/*  689 */       if (☃ instanceof u) {
/*  690 */         l = b(((u)☃).a());
/*      */       } else {
/*  692 */         l = b(new l("Exception in server tick loop", ☃));
/*      */       } 
/*      */       
/*  695 */       File file = new File(new File(B(), "crash-reports"), "crash-" + (new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss")).format(new Date()) + "-server.txt");
/*      */       
/*  697 */       if (l.a(file)) {
/*  698 */         j.error("This crash report has been saved to: {}", file.getAbsolutePath());
/*      */       } else {
/*  700 */         j.error("We were unable to save this crash report to disk.");
/*      */       } 
/*      */       
/*  703 */       a(l);
/*      */     } finally {
/*      */       try {
/*  706 */         this.y = true;
/*  707 */         t();
/*  708 */       } catch (Throwable ☃) {
/*  709 */         j.error("Exception stopping the server", ☃);
/*      */       } finally {
/*  711 */         e();
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private boolean ba() {
/*  717 */     return (bn() || x.b() < (this.X ? this.W : this.V));
/*      */   }
/*      */   
/*      */   protected void x() {
/*  721 */     bl();
/*  722 */     c(() -> !ba());
/*      */   }
/*      */ 
/*      */   
/*      */   protected wb a(Runnable ☃) {
/*  727 */     return new wb(this.z, ☃);
/*      */   }
/*      */ 
/*      */   
/*      */   protected boolean a(wb ☃) {
/*  732 */     return (☃.a() + 3 < this.z || ba());
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean y() {
/*  737 */     boolean ☃ = bb();
/*  738 */     this.X = ☃;
/*  739 */     return ☃;
/*      */   }
/*      */   
/*      */   private boolean bb() {
/*  743 */     if (super.y()) {
/*  744 */       return true;
/*      */     }
/*      */     
/*  747 */     if (ba()) {
/*  748 */       for (aag ☃ : G()) {
/*  749 */         if (☃.i().d()) {
/*  750 */           return true;
/*      */         }
/*      */       } 
/*      */     }
/*      */     
/*  755 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void b(wb ☃) {
/*  760 */     aQ().c("runTask");
/*  761 */     super.c((Runnable)☃);
/*      */   }
/*      */   
/*      */   private void a(un ☃) {
/*  765 */     File file = c("server-icon.png");
/*  766 */     if (!file.exists()) {
/*  767 */       file = this.d.f();
/*      */     }
/*  769 */     if (file.isFile()) {
/*  770 */       ByteBuf byteBuf = Unpooled.buffer();
/*      */       
/*      */       try {
/*  773 */         BufferedImage bufferedImage = ImageIO.read(file);
/*  774 */         Validate.validState((bufferedImage.getWidth() == 64), "Must be 64 pixels wide", new Object[0]);
/*  775 */         Validate.validState((bufferedImage.getHeight() == 64), "Must be 64 pixels high", new Object[0]);
/*  776 */         ImageIO.write(bufferedImage, "PNG", (OutputStream)new ByteBufOutputStream(byteBuf));
/*  777 */         ByteBuffer byteBuffer = Base64.getEncoder().encode(byteBuf.nioBuffer());
/*  778 */         ☃.a("data:image/png;base64," + StandardCharsets.UTF_8.decode(byteBuffer));
/*  779 */       } catch (Exception exception) {
/*  780 */         j.error("Couldn't load server icon", exception);
/*      */       } finally {
/*  782 */         byteBuf.release();
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean z() {
/*  788 */     this.Y = (this.Y || A().isFile());
/*  789 */     return this.Y;
/*      */   }
/*      */   
/*      */   public File A() {
/*  793 */     return this.d.f();
/*      */   }
/*      */   
/*      */   public File B() {
/*  797 */     return new File(".");
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(l ☃) {}
/*      */ 
/*      */   
/*      */   protected void e() {}
/*      */   
/*      */   protected void a(BooleanSupplier ☃) {
/*  807 */     long l1 = x.c();
/*      */     
/*  809 */     this.z++;
/*      */     
/*  811 */     b(☃);
/*      */     
/*  813 */     if (l1 - this.T >= 5000000000L) {
/*  814 */       this.T = l1;
/*  815 */       this.q.a(new un.a(J(), I()));
/*      */       
/*  817 */       GameProfile[] arrayOfGameProfile = new GameProfile[Math.min(I(), 12)];
/*  818 */       int i = afm.a(this.r, 0, I() - arrayOfGameProfile.length);
/*  819 */       for (int j = 0; j < arrayOfGameProfile.length; j++) {
/*  820 */         arrayOfGameProfile[j] = ((aah)this.w.s().get(i + j)).eA();
/*      */       }
/*  822 */       Collections.shuffle(Arrays.asList((Object[])arrayOfGameProfile));
/*  823 */       this.q.b().a(arrayOfGameProfile);
/*      */     } 
/*      */     
/*  826 */     if (this.z % 6000 == 0) {
/*  827 */       j.debug("Autosave started");
/*  828 */       this.n.a("save");
/*  829 */       this.w.h();
/*  830 */       a(true, false, false);
/*  831 */       this.n.c();
/*  832 */       j.debug("Autosave finished");
/*      */     } 
/*      */     
/*  835 */     this.n.a("snooper");
/*  836 */     if (!this.k.d() && this.z > 100) {
/*  837 */       this.k.a();
/*      */     }
/*      */     
/*  840 */     if (this.z % 6000 == 0) {
/*  841 */       this.k.b();
/*      */     }
/*  843 */     this.n.c();
/*      */     
/*  845 */     this.n.a("tallying");
/*  846 */     long l2 = this.h[this.z % 100] = x.c() - l1;
/*  847 */     this.ag = this.ag * 0.8F + (float)l2 / 1000000.0F * 0.19999999F;
/*      */     
/*  849 */     long l3 = x.c();
/*  850 */     this.ae.a(l3 - l1);
/*      */     
/*  852 */     this.n.c();
/*      */   }
/*      */   
/*      */   protected void b(BooleanSupplier ☃) {
/*  856 */     this.n.a("commandFunctions");
/*  857 */     aB().d();
/*      */     
/*  859 */     this.n.b("levels");
/*  860 */     for (aag aag : G()) {
/*  861 */       this.n.a(() -> ☃ + " " + ☃.Y().a());
/*      */       
/*  863 */       if (this.z % 20 == 0) {
/*  864 */         this.n.a("timeSync");
/*  865 */         this.w.a((oj)new rk(aag.T(), aag.U(), aag.V().b(brt.j)), aag.Y());
/*  866 */         this.n.c();
/*      */       } 
/*      */       
/*  869 */       this.n.a("tick");
/*      */       try {
/*  871 */         aag.a(☃);
/*  872 */       } catch (Throwable throwable) {
/*  873 */         l l = l.a(throwable, "Exception ticking world");
/*  874 */         aag.a(l);
/*  875 */         throw new u(l);
/*      */       } 
/*  877 */       this.n.c();
/*  878 */       this.n.c();
/*      */     } 
/*      */     
/*  881 */     this.n.b("connection");
/*  882 */     af().c();
/*  883 */     this.n.b("players");
/*  884 */     this.w.d();
/*      */     
/*  886 */     if (w.d) {
/*  887 */       ll.a.b();
/*      */     }
/*  889 */     this.n.b("server gui refresh");
/*  890 */     for (int i = 0; i < this.l.size(); i++) {
/*  891 */       ((Runnable)this.l.get(i)).run();
/*      */     }
/*  893 */     this.n.c();
/*      */   }
/*      */   
/*      */   public boolean C() {
/*  897 */     return true;
/*      */   }
/*      */   
/*      */   public void b(Runnable ☃) {
/*  901 */     this.l.add(☃);
/*      */   }
/*      */   
/*      */   protected void b(String ☃) {
/*  905 */     this.ai = ☃;
/*      */   }
/*      */   
/*      */   public boolean D() {
/*  909 */     return !this.U.isAlive();
/*      */   }
/*      */   
/*      */   public File c(String ☃) {
/*  913 */     return new File(B(), ☃);
/*      */   }
/*      */   
/*      */   public final aag E() {
/*  917 */     return this.v.get(brx.g);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aag a(vj<brx> ☃) {
/*  922 */     return this.v.get(☃);
/*      */   }
/*      */   
/*      */   public Set<vj<brx>> F() {
/*  926 */     return this.v.keySet();
/*      */   }
/*      */   
/*      */   public Iterable<aag> G() {
/*  930 */     return this.v.values();
/*      */   }
/*      */   
/*      */   public String H() {
/*  934 */     return w.a().getName();
/*      */   }
/*      */   
/*      */   public int I() {
/*  938 */     return this.w.m();
/*      */   }
/*      */   
/*      */   public int J() {
/*  942 */     return this.w.n();
/*      */   }
/*      */   
/*      */   public String[] K() {
/*  946 */     return this.w.e();
/*      */   }
/*      */ 
/*      */   
/*      */   public String getServerModName() {
/*  951 */     return "vanilla";
/*      */   }
/*      */   
/*      */   public l b(l ☃) {
/*  955 */     if (this.w != null) {
/*  956 */       ☃.g().a("Player Count", () -> this.w.m() + " / " + this.w.n() + "; " + this.w.s());
/*      */     }
/*      */     
/*  959 */     ☃.g().a("Data Packs", () -> {
/*      */           StringBuilder ☃ = new StringBuilder();
/*      */           
/*      */           for (abu abu : this.Z.e()) {
/*      */             if (☃.length() > 0) {
/*      */               ☃.append(", ");
/*      */             }
/*      */             ☃.append(abu.e());
/*      */             if (!abu.c().a()) {
/*      */               ☃.append(" (incompatible)");
/*      */             }
/*      */           } 
/*      */           return ☃.toString();
/*      */         });
/*  973 */     if (this.ai != null) {
/*  974 */       ☃.g().a("Server Id", () -> this.ai);
/*      */     }
/*      */     
/*  977 */     return ☃;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(nr ☃, UUID uUID) {
/*  984 */     j.info(☃.getString());
/*      */   }
/*      */   
/*      */   public KeyPair L() {
/*  988 */     return this.H;
/*      */   }
/*      */   
/*      */   public int M() {
/*  992 */     return this.u;
/*      */   }
/*      */   
/*      */   public void a(int ☃) {
/*  996 */     this.u = ☃;
/*      */   }
/*      */   
/*      */   public String N() {
/* 1000 */     return this.I;
/*      */   }
/*      */   
/*      */   public void d(String ☃) {
/* 1004 */     this.I = ☃;
/*      */   }
/*      */   
/*      */   public boolean O() {
/* 1008 */     return (this.I != null);
/*      */   }
/*      */   
/*      */   protected void P() {
/* 1012 */     j.info("Generating keypair");
/*      */     try {
/* 1014 */       this.H = aeu.b();
/* 1015 */     } catch (aev ☃) {
/* 1016 */       throw new IllegalStateException("Failed to generate key pair", ☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a(aor ☃, boolean bool) {
/* 1021 */     if (!bool && this.i.t()) {
/*      */       return;
/*      */     }
/*      */     
/* 1025 */     this.i.a(this.i.n() ? aor.d : ☃);
/*      */     
/* 1027 */     bc();
/* 1028 */     ae().s().forEach(this::b);
/*      */   }
/*      */   
/*      */   public int b(int ☃) {
/* 1032 */     return ☃;
/*      */   }
/*      */   
/*      */   private void bc() {
/* 1036 */     for (aag ☃ : G()) {
/* 1037 */       ☃.b(Q(), X());
/*      */     }
/*      */   }
/*      */   
/*      */   public void b(boolean ☃) {
/* 1042 */     this.i.d(☃);
/* 1043 */     ae().s().forEach(this::b);
/*      */   }
/*      */   
/*      */   private void b(aah ☃) {
/* 1047 */     cyd cyd = ☃.u().h();
/* 1048 */     ☃.b.a((oj)new pa(cyd.s(), cyd.t()));
/*      */   }
/*      */   
/*      */   protected boolean Q() {
/* 1052 */     return (this.i.s() != aor.a);
/*      */   }
/*      */   
/*      */   public boolean R() {
/* 1056 */     return this.J;
/*      */   }
/*      */   
/*      */   public void c(boolean ☃) {
/* 1060 */     this.J = ☃;
/*      */   }
/*      */   
/*      */   public String S() {
/* 1064 */     return this.K;
/*      */   }
/*      */   
/*      */   public String T() {
/* 1068 */     return this.L;
/*      */   }
/*      */   
/*      */   public void a(String ☃, String str1) {
/* 1072 */     this.K = ☃;
/* 1073 */     this.L = str1;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(apc ☃) {
/* 1078 */     ☃.a("whitelist_enabled", Boolean.valueOf(false));
/* 1079 */     ☃.a("whitelist_count", Integer.valueOf(0));
/* 1080 */     if (this.w != null) {
/* 1081 */       ☃.a("players_current", Integer.valueOf(I()));
/* 1082 */       ☃.a("players_max", Integer.valueOf(J()));
/* 1083 */       ☃.a("players_seen", Integer.valueOf((this.e.a()).length));
/*      */     } 
/* 1085 */     ☃.a("uses_auth", Boolean.valueOf(this.A));
/* 1086 */     ☃.a("gui_state", ah() ? "enabled" : "disabled");
/* 1087 */     ☃.a("run_time", Long.valueOf((x.b() - ☃.g()) / 60L * 1000L));
/*      */     
/* 1089 */     ☃.a("avg_tick_ms", Integer.valueOf((int)(afm.a(this.h) * 1.0E-6D)));
/*      */     
/* 1091 */     int i = 0;
/* 1092 */     for (aag aag : G()) {
/* 1093 */       if (aag != null) {
/* 1094 */         ☃.a("world[" + i + "][dimension]", aag.Y().a());
/* 1095 */         ☃.a("world[" + i + "][mode]", this.i.m());
/* 1096 */         ☃.a("world[" + i + "][difficulty]", aag.ad());
/* 1097 */         ☃.a("world[" + i + "][hardcore]", Boolean.valueOf(this.i.n()));
/*      */ 
/*      */ 
/*      */         
/* 1101 */         ☃.a("world[" + i + "][height]", Integer.valueOf(this.F));
/* 1102 */         ☃.a("world[" + i + "][chunks_loaded]", Integer.valueOf(aag.i().h()));
/*      */         
/* 1104 */         i++;
/*      */       } 
/*      */     } 
/*      */     
/* 1108 */     ☃.a("worlds", Integer.valueOf(i));
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
/*      */   public boolean V() {
/* 1129 */     return this.A;
/*      */   }
/*      */   
/*      */   public void d(boolean ☃) {
/* 1133 */     this.A = ☃;
/*      */   }
/*      */   
/*      */   public boolean W() {
/* 1137 */     return this.B;
/*      */   }
/*      */   
/*      */   public void e(boolean ☃) {
/* 1141 */     this.B = ☃;
/*      */   }
/*      */   
/*      */   public boolean X() {
/* 1145 */     return true;
/*      */   }
/*      */   
/*      */   public boolean Y() {
/* 1149 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean Z() {
/* 1155 */     return this.C;
/*      */   }
/*      */   
/*      */   public void f(boolean ☃) {
/* 1159 */     this.C = ☃;
/*      */   }
/*      */   
/*      */   public boolean aa() {
/* 1163 */     return this.D;
/*      */   }
/*      */   
/*      */   public void g(boolean ☃) {
/* 1167 */     this.D = ☃;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String ab() {
/* 1173 */     return this.E;
/*      */   }
/*      */   
/*      */   public void e(String ☃) {
/* 1177 */     this.E = ☃;
/*      */   }
/*      */   
/*      */   public int ac() {
/* 1181 */     return this.F;
/*      */   }
/*      */   
/*      */   public void c(int ☃) {
/* 1185 */     this.F = ☃;
/*      */   }
/*      */   
/*      */   public boolean ad() {
/* 1189 */     return this.y;
/*      */   }
/*      */   
/*      */   public acu ae() {
/* 1193 */     return this.w;
/*      */   }
/*      */   
/*      */   public void a(acu ☃) {
/* 1197 */     this.w = ☃;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(bru ☃) {
/* 1203 */     this.i.a(☃);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aax af() {
/* 1208 */     return this.o;
/*      */   }
/*      */   
/*      */   public boolean ag() {
/* 1212 */     return this.M;
/*      */   }
/*      */   
/*      */   public boolean ah() {
/* 1216 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int ai() {
/* 1222 */     return this.z;
/*      */   }
/*      */   
/*      */   public apc aj() {
/* 1226 */     return this.k;
/*      */   }
/*      */   
/*      */   public int ak() {
/* 1230 */     return 16;
/*      */   }
/*      */   
/*      */   public boolean a(aag ☃, fx fx1, bfw bfw1) {
/* 1234 */     return false;
/*      */   }
/*      */   
/*      */   public void h(boolean ☃) {
/* 1238 */     this.P = ☃;
/*      */   }
/*      */   
/*      */   public boolean al() {
/* 1242 */     return this.P;
/*      */   }
/*      */   
/*      */   public boolean am() {
/* 1246 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int ao() {
/* 1254 */     return this.G;
/*      */   }
/*      */   
/*      */   public void d(int ☃) {
/* 1258 */     this.G = ☃;
/*      */   }
/*      */   
/*      */   public MinecraftSessionService ap() {
/* 1262 */     return this.Q;
/*      */   }
/*      */   
/*      */   public GameProfileRepository aq() {
/* 1266 */     return this.R;
/*      */   }
/*      */   
/*      */   public acq ar() {
/* 1270 */     return this.S;
/*      */   }
/*      */   
/*      */   public un as() {
/* 1274 */     return this.q;
/*      */   }
/*      */   
/*      */   public void at() {
/* 1278 */     this.T = 0L;
/*      */   }
/*      */   
/*      */   public int au() {
/* 1282 */     return 29999984;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean av() {
/* 1287 */     return (super.av() && !ad());
/*      */   }
/*      */ 
/*      */   
/*      */   public Thread aw() {
/* 1292 */     return this.U;
/*      */   }
/*      */   
/*      */   public int ax() {
/* 1296 */     return 256;
/*      */   }
/*      */   
/*      */   public long ay() {
/* 1300 */     return this.V;
/*      */   }
/*      */   
/*      */   public DataFixer az() {
/* 1304 */     return this.s;
/*      */   }
/*      */   
/*      */   public int a(@Nullable aag ☃) {
/* 1308 */     if (☃ != null) {
/* 1309 */       return ☃.V().c(brt.q);
/*      */     }
/* 1311 */     return 10;
/*      */   }
/*      */   
/*      */   public vv aA() {
/* 1315 */     return this.aj.g();
/*      */   }
/*      */   
/*      */   public vx aB() {
/* 1319 */     return this.ad;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CompletableFuture<Void> a(Collection<String> ☃) {
/* 1329 */     CompletableFuture<Void> completableFuture = CompletableFuture.supplyAsync(() -> (ImmutableList)☃.stream().map(this.Z::a).filter(Objects::nonNull).map(abu::d).collect(ImmutableList.toImmutableList()), (Executor)this).thenCompose(☃ -> vz.a((List)☃, j() ? dc.a.b : dc.a.c, h(), this.ah, (Executor)this)).thenAcceptAsync(vz1 -> {
/*      */           this.aj.close();
/*      */           
/*      */           this.aj = vz1;
/*      */           
/*      */           this.Z.a(☃);
/*      */           
/*      */           this.i.a(a(this.Z));
/*      */           vz1.i();
/*      */           ae().h();
/*      */           ae().t();
/*      */           this.ad.a(this.aj.a());
/*      */           this.ak.a(this.aj.h());
/*      */         }(Executor)this);
/* 1343 */     if (bh()) {
/* 1344 */       c(completableFuture::isDone);
/*      */     }
/* 1346 */     return completableFuture;
/*      */   }
/*      */   
/*      */   public static brk a(abw ☃, brk brk1, boolean bool) {
/* 1350 */     ☃.a();
/* 1351 */     if (bool) {
/* 1352 */       ☃.a(Collections.singleton("vanilla"));
/* 1353 */       return new brk((List)ImmutableList.of("vanilla"), (List)ImmutableList.of());
/*      */     } 
/*      */     
/* 1356 */     Set<String> set = Sets.newLinkedHashSet();
/*      */     
/* 1358 */     for (String str : brk1.a()) {
/* 1359 */       if (☃.b(str)) {
/* 1360 */         set.add(str); continue;
/*      */       } 
/* 1362 */       j.warn("Missing data pack {}", str);
/*      */     } 
/*      */ 
/*      */     
/* 1366 */     for (abu abu : ☃.c()) {
/* 1367 */       String str = abu.e();
/* 1368 */       if (!brk1.b().contains(str) && !set.contains(str)) {
/* 1369 */         j.info("Found new data pack {}, loading it automatically", str);
/* 1370 */         set.add(str);
/*      */       } 
/*      */     } 
/*      */     
/* 1374 */     if (set.isEmpty()) {
/* 1375 */       j.info("No datapacks selected, forcing vanilla");
/* 1376 */       set.add("vanilla");
/*      */     } 
/*      */     
/* 1379 */     ☃.a(set);
/*      */ 
/*      */     
/* 1382 */     return a(☃);
/*      */   }
/*      */   
/*      */   private static brk a(abw ☃) {
/* 1386 */     Collection<String> collection = ☃.d();
/* 1387 */     ImmutableList immutableList = ImmutableList.copyOf(collection);
/* 1388 */     List<String> list = (List<String>)☃.b().stream().filter(str -> !☃.contains(str)).collect(ImmutableList.toImmutableList());
/* 1389 */     return new brk((List)immutableList, list);
/*      */   }
/*      */   
/*      */   public void a(db ☃) {
/* 1393 */     if (!aN()) {
/*      */       return;
/*      */     }
/*      */     
/* 1397 */     acu acu1 = ☃.j().ae();
/* 1398 */     adb adb = acu1.i();
/*      */     
/* 1400 */     List<aah> list = Lists.newArrayList(acu1.s());
/* 1401 */     for (aah aah : list) {
/* 1402 */       if (!adb.a(aah.eA())) {
/* 1403 */         aah.b.b((nr)new of("multiplayer.disconnect.not_whitelisted"));
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public abw aC() {
/* 1409 */     return this.Z;
/*      */   }
/*      */   
/*      */   public dc aD() {
/* 1413 */     return this.aj.f();
/*      */   }
/*      */   
/*      */   public db aE() {
/* 1417 */     aag ☃ = E();
/* 1418 */     return new db(this, (☃ == null) ? dcn.a : dcn.b((gr)☃.u()), dcm.a, ☃, 4, "Server", (nr)new oe("Server"), this, null);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a() {
/* 1423 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean b() {
/* 1428 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public bor aF() {
/* 1435 */     return this.aj.e();
/*      */   }
/*      */   
/*      */   public aen aG() {
/* 1439 */     return this.aj.d();
/*      */   }
/*      */   
/*      */   public wa aH() {
/* 1443 */     return this.aa;
/*      */   }
/*      */   
/*      */   public cya aI() {
/* 1447 */     if (this.ab == null)
/*      */     {
/* 1449 */       throw new NullPointerException("Called before server init");
/*      */     }
/* 1451 */     return this.ab;
/*      */   }
/*      */   
/*      */   public cyz aJ() {
/* 1455 */     return this.aj.c();
/*      */   }
/*      */   
/*      */   public cza aK() {
/* 1459 */     return this.aj.b();
/*      */   }
/*      */   
/*      */   public brt aL() {
/* 1463 */     return E().V();
/*      */   }
/*      */   
/*      */   public wd aM() {
/* 1467 */     return this.ac;
/*      */   }
/*      */   
/*      */   public boolean aN() {
/* 1471 */     return this.af;
/*      */   }
/*      */   
/*      */   public void i(boolean ☃) {
/* 1475 */     this.af = ☃;
/*      */   }
/*      */   
/*      */   public float aO() {
/* 1479 */     return this.ag;
/*      */   }
/*      */   
/*      */   public int b(GameProfile ☃) {
/* 1483 */     if (ae().h(☃)) {
/* 1484 */       acw acw = (acw)ae().k().b(☃);
/* 1485 */       if (acw != null) {
/* 1486 */         return acw.a();
/*      */       }
/* 1488 */       if (a(☃)) {
/* 1489 */         return 4;
/*      */       }
/* 1491 */       if (O()) {
/* 1492 */         return ae().u() ? 4 : 0;
/*      */       }
/* 1494 */       return g();
/*      */     } 
/* 1496 */     return 0;
/*      */   }
/*      */   
/*      */   public afc aP() {
/* 1500 */     return this.ae;
/*      */   }
/*      */   
/*      */   public anw aQ() {
/* 1504 */     return this.n;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(Path ☃) throws IOException {
/* 1514 */     Path path = ☃.resolve("levels");
/* 1515 */     for (Map.Entry<vj<brx>, aag> entry : this.v.entrySet()) {
/* 1516 */       vk vk = ((vj)entry.getKey()).a();
/* 1517 */       Path path1 = path.resolve(vk.b()).resolve(vk.a());
/* 1518 */       Files.createDirectories(path1, (FileAttribute<?>[])new FileAttribute[0]);
/* 1519 */       ((aag)entry.getValue()).a(path1);
/*      */     } 
/*      */     
/* 1522 */     d(☃.resolve("gamerules.txt"));
/* 1523 */     e(☃.resolve("classpath.txt"));
/* 1524 */     c(☃.resolve("example_crash.txt"));
/* 1525 */     b(☃.resolve("stats.txt"));
/* 1526 */     f(☃.resolve("threads.txt"));
/*      */   }
/*      */   
/*      */   private void b(Path ☃) throws IOException {
/* 1530 */     try (Writer ☃ = Files.newBufferedWriter(☃, new java.nio.file.OpenOption[0])) {
/* 1531 */       writer.write(String.format("pending_tasks: %d\n", new Object[] { Integer.valueOf(bi()) }));
/* 1532 */       writer.write(String.format("average_tick_time: %f\n", new Object[] { Float.valueOf(aO()) }));
/* 1533 */       writer.write(String.format("tick_times: %s\n", new Object[] { Arrays.toString(this.h) }));
/* 1534 */       writer.write(String.format("queue: %s\n", new Object[] { x.f() }));
/*      */     } 
/*      */   }
/*      */   
/*      */   private void c(Path ☃) throws IOException {
/* 1539 */     l l = new l("Server dump", new Exception("dummy"));
/* 1540 */     b(l);
/* 1541 */     try (Writer ☃ = Files.newBufferedWriter(☃, new java.nio.file.OpenOption[0])) {
/* 1542 */       writer.write(l.e());
/*      */     } 
/*      */   }
/*      */   
/*      */   private void d(Path ☃) throws IOException {
/* 1547 */     try (Writer ☃ = Files.newBufferedWriter(☃, new java.nio.file.OpenOption[0])) {
/* 1548 */       List<String> list = Lists.newArrayList();
/* 1549 */       brt brt = aL();
/* 1550 */       brt.a(new brt.c(this, list, brt)
/*      */           {
/*      */             public <T extends brt.g<T>> void a(brt.e<T> ☃, brt.f<T> f1) {
/* 1553 */               this.a.add(String.format("%s=%s\n", new Object[] { ☃.a(), this.b.a(☃).toString() }));
/*      */             }
/*      */           });
/* 1556 */       for (String str : list) {
/* 1557 */         writer.write(str);
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   private void e(Path ☃) throws IOException {
/* 1563 */     try (Writer ☃ = Files.newBufferedWriter(☃, new java.nio.file.OpenOption[0])) {
/* 1564 */       String str1 = System.getProperty("java.class.path");
/* 1565 */       String str2 = System.getProperty("path.separator");
/* 1566 */       for (String str : Splitter.on(str2).split(str1)) {
/* 1567 */         writer.write(str);
/* 1568 */         writer.write("\n");
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private void f(Path ☃) throws IOException {
/* 1574 */     ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
/* 1575 */     ThreadInfo[] arrayOfThreadInfo = threadMXBean.dumpAllThreads(true, true);
/* 1576 */     Arrays.sort(arrayOfThreadInfo, Comparator.comparing(ThreadInfo::getThreadName));
/*      */     
/* 1578 */     try (Writer ☃ = Files.newBufferedWriter(☃, new java.nio.file.OpenOption[0])) {
/* 1579 */       for (ThreadInfo threadInfo : arrayOfThreadInfo) {
/* 1580 */         writer.write(threadInfo.toString());
/* 1581 */         writer.write(10);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private void a(@Nullable anz ☃) {
/* 1587 */     if (this.O) {
/* 1588 */       this.O = false;
/* 1589 */       this.m.c();
/*      */     } 
/* 1591 */     this.n = anz.a(this.m.d(), ☃);
/*      */   }
/*      */   
/*      */   private void b(@Nullable anz ☃) {
/* 1595 */     if (☃ != null) {
/* 1596 */       ☃.b();
/*      */     }
/* 1598 */     this.n = this.m.d();
/*      */   }
/*      */   
/*      */   public boolean aS() {
/* 1602 */     return this.m.a();
/*      */   }
/*      */   
/*      */   public void aT() {
/* 1606 */     this.O = true;
/*      */   }
/*      */   
/*      */   public anv aU() {
/* 1610 */     anv ☃ = this.m.e();
/* 1611 */     this.m.b();
/* 1612 */     return ☃;
/*      */   }
/*      */   
/*      */   public Path a(cye ☃) {
/* 1616 */     return this.d.a(☃);
/*      */   }
/*      */   
/*      */   public boolean aV() {
/* 1620 */     return true;
/*      */   }
/*      */   
/*      */   public csw aW() {
/* 1624 */     return this.ak;
/*      */   }
/*      */   
/*      */   public cyn aX() {
/* 1628 */     return this.i;
/*      */   }
/*      */   
/*      */   public gn aY() {
/* 1632 */     return (gn)this.f;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public abc a(aah ☃) {
/* 1637 */     return null;
/*      */   }
/*      */   
/*      */   protected abstract boolean d() throws IOException;
/*      */   
/*      */   public abstract int g();
/*      */   
/*      */   public abstract int h();
/*      */   
/*      */   public abstract boolean i();
/*      */   
/*      */   public abstract Optional<String> o();
/*      */   
/*      */   public abstract boolean j();
/*      */   
/*      */   public abstract int k();
/*      */   
/*      */   public abstract boolean l();
/*      */   
/*      */   public abstract boolean m();
/*      */   
/*      */   public abstract boolean n();
/*      */   
/*      */   public abstract boolean a(bru parambru, boolean paramBoolean, int paramInt);
/*      */   
/*      */   public abstract boolean a(GameProfile paramGameProfile);
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\net\minecraft\server\MinecraftServer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */