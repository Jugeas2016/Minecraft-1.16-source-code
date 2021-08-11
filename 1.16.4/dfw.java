/*      */ import com.google.common.collect.ImmutableList;
/*      */ import com.google.common.collect.Lists;
/*      */ import com.google.common.util.concurrent.RateLimiter;
/*      */ import com.mojang.blaze3d.systems.RenderSystem;
/*      */ import java.util.Arrays;
/*      */ import java.util.Collection;
/*      */ import java.util.List;
/*      */ import java.util.concurrent.TimeUnit;
/*      */ import java.util.concurrent.locks.ReentrantLock;
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
/*      */ public class dfw
/*      */   extends eoo
/*      */ {
/*   63 */   private static final Logger a = LogManager.getLogger();
/*      */   
/*   65 */   private static final vk b = new vk("realms", "textures/gui/realms/on_icon.png");
/*   66 */   private static final vk c = new vk("realms", "textures/gui/realms/off_icon.png");
/*   67 */   private static final vk p = new vk("realms", "textures/gui/realms/expired_icon.png");
/*   68 */   private static final vk q = new vk("realms", "textures/gui/realms/expires_soon_icon.png");
/*   69 */   private static final vk r = new vk("realms", "textures/gui/realms/leave_icon.png");
/*   70 */   private static final vk s = new vk("realms", "textures/gui/realms/invitation_icons.png");
/*   71 */   private static final vk t = new vk("realms", "textures/gui/realms/invite_icon.png");
/*   72 */   private static final vk u = new vk("realms", "textures/gui/realms/world_icon.png");
/*   73 */   private static final vk v = new vk("realms", "textures/gui/title/realms.png");
/*   74 */   private static final vk w = new vk("realms", "textures/gui/realms/configure_icon.png");
/*   75 */   private static final vk x = new vk("realms", "textures/gui/realms/questionmark.png");
/*   76 */   private static final vk y = new vk("realms", "textures/gui/realms/news_icon.png");
/*   77 */   private static final vk z = new vk("realms", "textures/gui/realms/popup.png");
/*   78 */   private static final vk A = new vk("realms", "textures/gui/realms/darken.png");
/*   79 */   private static final vk B = new vk("realms", "textures/gui/realms/cross_icon.png");
/*   80 */   private static final vk C = new vk("realms", "textures/gui/realms/trial_icon.png");
/*   81 */   private static final vk D = new vk("minecraft", "textures/gui/widgets.png");
/*      */   
/*   83 */   private static final nr E = new of("mco.invites.nopending");
/*   84 */   private static final nr F = new of("mco.invites.pending");
/*   85 */   private static final List<nr> G = (List<nr>)ImmutableList.of(new of("mco.trial.message.line1"), new of("mco.trial.message.line2"));
/*   86 */   private static final nr H = new of("mco.selectServer.uninitialized");
/*   87 */   private static final nr I = new of("mco.selectServer.expiredList");
/*   88 */   private static final nr J = new of("mco.selectServer.expiredRenew");
/*   89 */   private static final nr K = new of("mco.selectServer.expiredTrial");
/*   90 */   private static final nr L = new of("mco.selectServer.expiredSubscribe");
/*   91 */   private static final nr M = (new of("mco.selectServer.minigame")).c(" ");
/*   92 */   private static final nr N = new of("mco.selectServer.popup");
/*   93 */   private static final nr O = new of("mco.selectServer.expired");
/*   94 */   private static final nr P = new of("mco.selectServer.expires.soon");
/*   95 */   private static final nr Q = new of("mco.selectServer.expires.day");
/*   96 */   private static final nr R = new of("mco.selectServer.open");
/*   97 */   private static final nr S = new of("mco.selectServer.closed");
/*   98 */   private static final nr T = new of("mco.selectServer.leave");
/*   99 */   private static final nr U = new of("mco.selectServer.configure");
/*  100 */   private static final nr V = new of("mco.selectServer.info");
/*  101 */   private static final nr W = new of("mco.news");
/*      */   
/*  103 */   private static List<vk> X = (List<vk>)ImmutableList.of();
/*      */   
/*  105 */   private static final dhl Y = new dhl();
/*      */   
/*      */   private static boolean Z;
/*  108 */   private static int aa = -1;
/*      */   
/*      */   private static volatile boolean ab;
/*      */   
/*      */   private static volatile boolean ac;
/*      */   
/*      */   private static volatile boolean ad;
/*      */   
/*      */   private static dot ae;
/*      */   
/*      */   private static boolean af;
/*      */   private final RateLimiter ag;
/*      */   private boolean ah;
/*      */   private final dot ai;
/*      */   private volatile f aj;
/*  123 */   private long ak = -1L;
/*      */   
/*      */   private dlj al;
/*      */   
/*      */   private dlj am;
/*      */   private dlj an;
/*      */   private dlj ao;
/*      */   private dlj ap;
/*      */   private List<nr> aq;
/*  132 */   private List<dgq> ar = Lists.newArrayList();
/*      */   
/*      */   private volatile int as;
/*      */   
/*      */   private int at;
/*      */   
/*      */   private boolean au;
/*      */   
/*      */   private boolean av;
/*      */   
/*      */   private boolean aw;
/*      */   
/*      */   private volatile boolean ax;
/*      */   private volatile boolean ay;
/*      */   private volatile boolean az;
/*      */   private volatile boolean aA;
/*      */   private volatile String aB;
/*      */   private int aC;
/*      */   private int aD;
/*      */   private boolean aE;
/*      */   private List<dfv> aF;
/*      */   private int aG;
/*  154 */   private ReentrantLock aH = new ReentrantLock(); private c aJ; private dlj aK; private dlj aL; private dlj aM;
/*  155 */   private dlu aI = dlu.a; private dlj aN; private dlj aO;
/*      */   private dlj aP;
/*      */   
/*  158 */   enum c { a,
/*  159 */     b,
/*  160 */     c,
/*  161 */     d; }
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
/*      */   public dfw(dot ☃) {
/*  175 */     this.ai = ☃;
/*  176 */     this.ag = RateLimiter.create(0.01666666753590107D);
/*      */   }
/*      */   
/*      */   private boolean B() {
/*  180 */     if (!C() || !this.au) {
/*  181 */       return false;
/*      */     }
/*      */     
/*  184 */     if (this.ax && !this.ay) {
/*  185 */       return true;
/*      */     }
/*      */     
/*  188 */     for (dgq ☃ : this.ar) {
/*  189 */       if (☃.g.equals(this.i.J().b())) {
/*  190 */         return false;
/*      */       }
/*      */     } 
/*      */     
/*  194 */     return true;
/*      */   }
/*      */   
/*      */   public boolean aq_() {
/*  198 */     if (!C() || !this.au) {
/*  199 */       return false;
/*      */     }
/*      */     
/*  202 */     if (this.av) {
/*  203 */       return true;
/*      */     }
/*      */     
/*  206 */     if (this.ax && !this.ay && this.ar.isEmpty()) {
/*  207 */       return true;
/*      */     }
/*      */     
/*  210 */     return this.ar.isEmpty();
/*      */   }
/*      */ 
/*      */   
/*      */   public void b() {
/*  215 */     this.aF = Lists.newArrayList((Object[])new dfv[] { new dfv(new char[] { '3', '2', '1', '4', '5', '6' }, () -> Z = !Z), new dfv(new char[] { '9', '8', '7', '1', '2', '3' }, () -> { if (dgb.a == dgb.b.b) { M(); } else { K(); }  }), new dfv(new char[] { '9', '8', '7', '4', '5', '6' }, () -> {
/*      */               if (dgb.a == dgb.b.c) {
/*      */                 M();
/*      */               } else {
/*      */                 L();
/*      */               } 
/*      */             }) });
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
/*  232 */     if (ae != null) {
/*  233 */       this.i.a(ae);
/*      */       
/*      */       return;
/*      */     } 
/*  237 */     this.aH = new ReentrantLock();
/*      */     
/*  239 */     if (ad && !C()) {
/*  240 */       J();
/*      */     }
/*      */     
/*  243 */     H();
/*  244 */     I();
/*      */     
/*  246 */     if (!this.ah) {
/*  247 */       this.i.d(false);
/*      */     }
/*      */     
/*  250 */     this.i.m.a(true);
/*      */     
/*  252 */     if (C()) {
/*  253 */       Y.e();
/*      */     }
/*      */     
/*  256 */     this.az = false;
/*      */     
/*  258 */     if (C() && this.au) {
/*  259 */       c();
/*      */     }
/*      */     
/*  262 */     this.aj = new f(this);
/*      */     
/*  264 */     if (aa != -1) {
/*  265 */       this.aj.a(aa);
/*      */     }
/*  267 */     d(this.aj);
/*  268 */     c(this.aj);
/*      */     
/*  270 */     this.aI = dlu.a(this.o, N, 100);
/*      */   }
/*      */   
/*      */   private static boolean C() {
/*  274 */     return (ac && ab);
/*      */   }
/*      */   
/*      */   public void c() {
/*  278 */     this.ap = a(new dlj(this.k / 2 - 202, this.l - 32, 90, 20, new of("mco.selectServer.leave"), ☃ -> g(a(this.ak))));
/*      */ 
/*      */     
/*  281 */     this.ao = a(new dlj(this.k / 2 - 190, this.l - 32, 90, 20, new of("mco.selectServer.configure"), ☃ -> f(a(this.ak))));
/*      */ 
/*      */     
/*  284 */     this.al = a(new dlj(this.k / 2 - 93, this.l - 32, 90, 20, new of("mco.selectServer.play"), ☃ -> {
/*      */             dgq dgq = a(this.ak);
/*      */             
/*      */             if (dgq == null) {
/*      */               return;
/*      */             }
/*      */             
/*      */             a(dgq, this);
/*      */           }));
/*      */     
/*  294 */     this.am = a(new dlj(this.k / 2 + 4, this.l - 32, 90, 20, nq.h, ☃ -> {
/*      */             if (!this.aw) {
/*      */               this.i.a(this.ai);
/*      */             }
/*      */           }));
/*      */     
/*  300 */     this.an = a(new dlj(this.k / 2 + 100, this.l - 32, 90, 20, new of("mco.selectServer.expiredRenew"), ☃ -> G()));
/*      */ 
/*      */     
/*  303 */     this.aL = a(new e(this));
/*  304 */     this.aM = a(new d(this));
/*  305 */     this.aK = a(new h(this));
/*  306 */     this.aP = a(new a(this));
/*  307 */     this.aN = a(new dlj(this.k / 2 + 52, R() + 137 - 20, 98, 20, new of("mco.selectServer.trial"), ☃ -> {
/*      */             if (!this.ax || this.ay) {
/*      */               return;
/*      */             }
/*      */             
/*      */             x.i().a("https://aka.ms/startjavarealmstrial");
/*      */             this.i.a(this.ai);
/*      */           }));
/*  315 */     this.aO = a(new dlj(this.k / 2 + 52, R() + 160 - 20, 98, 20, new of("mco.selectServer.buy"), ☃ -> x.i().a("https://aka.ms/BuyJavaRealms")));
/*      */ 
/*      */ 
/*      */     
/*  319 */     dgq ☃ = a(this.ak);
/*  320 */     a(☃);
/*      */   }
/*      */   
/*      */   private void a(@Nullable dgq ☃) {
/*  324 */     this.al.o = (b(☃) && !aq_());
/*  325 */     this.an.p = c(☃);
/*  326 */     this.ao.p = d(☃);
/*  327 */     this.ap.p = e(☃);
/*      */     
/*  329 */     boolean bool = (aq_() && this.ax && !this.ay);
/*  330 */     this.aN.p = bool;
/*  331 */     this.aN.o = bool;
/*      */     
/*  333 */     this.aO.p = aq_();
/*  334 */     this.aP.p = (aq_() && this.av);
/*      */     
/*  336 */     this.an.o = !aq_();
/*  337 */     this.ao.o = !aq_();
/*  338 */     this.ap.o = !aq_();
/*      */     
/*  340 */     this.aM.o = true;
/*  341 */     this.aL.o = true;
/*  342 */     this.am.o = true;
/*  343 */     this.aK.o = !aq_();
/*      */   }
/*      */   
/*      */   private boolean D() {
/*  347 */     return ((!aq_() || this.av) && C() && this.au);
/*      */   }
/*      */   
/*      */   private boolean b(@Nullable dgq ☃) {
/*  351 */     return (☃ != null && !☃.j && ☃.e == dgq.b.b);
/*      */   }
/*      */   
/*      */   private boolean c(@Nullable dgq ☃) {
/*  355 */     return (☃ != null && ☃.j && i(☃));
/*      */   }
/*      */   
/*      */   private boolean d(@Nullable dgq ☃) {
/*  359 */     return (☃ != null && i(☃));
/*      */   }
/*      */   
/*      */   private boolean e(@Nullable dgq ☃) {
/*  363 */     return (☃ != null && !i(☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public void d() {
/*  368 */     super.d();
/*  369 */     this.aw = false;
/*      */     
/*  371 */     this.at++;
/*      */     
/*  373 */     this.aG--;
/*      */     
/*  375 */     if (this.aG < 0) {
/*  376 */       this.aG = 0;
/*      */     }
/*      */     
/*  379 */     if (C()) {
/*  380 */       Y.b();
/*      */     } else {
/*      */       return;
/*      */     } 
/*      */     
/*  385 */     if (Y.a(dhl.d.a)) {
/*  386 */       List<dgq> ☃ = Y.f();
/*      */       
/*  388 */       this.aj.a();
/*      */       
/*  390 */       boolean bool = !this.au;
/*  391 */       if (bool) {
/*  392 */         this.au = true;
/*      */       }
/*      */       
/*  395 */       if (☃ != null) {
/*  396 */         boolean bool1 = false;
/*      */         
/*  398 */         for (dgq dgq : ☃) {
/*  399 */           if (j(dgq)) {
/*  400 */             bool1 = true;
/*      */           }
/*      */         } 
/*      */         
/*  404 */         this.ar = ☃;
/*  405 */         if (B()) {
/*  406 */           this.aj.a(new i());
/*      */         }
/*  408 */         for (dgq dgq : this.ar) {
/*  409 */           this.aj.a(new g(this, dgq));
/*      */         }
/*      */         
/*  412 */         if (!af && bool1) {
/*  413 */           af = true;
/*  414 */           E();
/*      */         } 
/*      */       } 
/*      */       
/*  418 */       if (bool) {
/*  419 */         c();
/*      */       }
/*      */     } 
/*      */     
/*  423 */     if (Y.a(dhl.d.b)) {
/*  424 */       this.as = Y.g();
/*  425 */       if (this.as > 0 && this.ag.tryAcquire(1)) {
/*  426 */         eoj.a(ekx.a("mco.configure.world.invite.narration", new Object[] { Integer.valueOf(this.as) }));
/*      */       }
/*      */     } 
/*      */     
/*  430 */     if (Y.a(dhl.d.c) && !this.ay) {
/*  431 */       boolean ☃ = Y.h();
/*      */       
/*  433 */       if (☃ != this.ax && aq_()) {
/*  434 */         this.ax = ☃;
/*  435 */         this.az = false;
/*      */       } else {
/*  437 */         this.ax = ☃;
/*      */       } 
/*      */     } 
/*      */     
/*  441 */     if (Y.a(dhl.d.d)) {
/*  442 */       dgv ☃ = Y.i();
/*      */       
/*  444 */       for (dgu dgu : ☃.a) {
/*  445 */         for (dgq dgq : this.ar) {
/*  446 */           if (dgq.a == dgu.a) {
/*  447 */             dgq.a(dgu);
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  454 */     if (Y.a(dhl.d.e)) {
/*  455 */       this.aA = Y.j();
/*  456 */       this.aB = Y.k();
/*      */     } 
/*      */     
/*  459 */     Y.d();
/*      */     
/*  461 */     if (aq_()) {
/*  462 */       this.aD++;
/*      */     }
/*      */     
/*  465 */     if (this.aK != null) {
/*  466 */       this.aK.p = D();
/*      */     }
/*      */   }
/*      */   
/*      */   private void E() {
/*  471 */     (new Thread(() -> {
/*      */           List<dgz> ☃ = dga.a();
/*      */           
/*      */           dgb dgb = dgb.a();
/*      */           dgm dgm = new dgm();
/*      */           dgm.a = ☃;
/*      */           dgm.b = F();
/*      */           try {
/*      */             dgb.a(dgm);
/*  480 */           } catch (Throwable throwable) {
/*      */             a.warn("Could not send ping result to Realms: ", throwable);
/*      */           } 
/*  483 */         })).start();
/*      */   }
/*      */   
/*      */   private List<Long> F() {
/*  487 */     List<Long> ☃ = Lists.newArrayList();
/*      */     
/*  489 */     for (dgq dgq : this.ar) {
/*  490 */       if (j(dgq)) {
/*  491 */         ☃.add(Long.valueOf(dgq.a));
/*      */       }
/*      */     } 
/*      */     
/*  495 */     return ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   public void e() {
/*  500 */     this.i.m.a(false);
/*  501 */     N();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void G() {
/*  509 */     dgq ☃ = a(this.ak);
/*      */     
/*  511 */     if (☃ == null) {
/*      */       return;
/*      */     }
/*      */     
/*  515 */     String str = "https://aka.ms/ExtendJavaRealms?subscriptionId=" + ☃.b + "&profileId=" + this.i.J().b() + "&ref=" + (☃.k ? "expiredTrial" : "expiredRealm");
/*  516 */     this.i.m.a(str);
/*  517 */     x.i().a(str);
/*      */   }
/*      */   
/*      */   private void H() {
/*  521 */     if (!ad) {
/*  522 */       ad = true;
/*      */       
/*  524 */       (new Thread(this, "MCO Compatability Checker #1")
/*      */         {
/*      */           public void run() {
/*  527 */             dgb ☃ = dgb.a();
/*      */             
/*      */             try {
/*  530 */               dgb.a a = ☃.i();
/*      */               
/*  532 */               if (a == dgb.a.b) {
/*  533 */                 dfw.a(new dhr(dfw.a(this.a), true));
/*  534 */                 dfw.b(this.a).execute(() -> dfw.j(this.a).a(dfw.i())); return;
/*      */               } 
/*  536 */               if (a == dgb.a.c) {
/*  537 */                 dfw.a(new dhr(dfw.a(this.a), false));
/*  538 */                 dfw.c(this.a).execute(() -> dfw.i(this.a).a(dfw.i()));
/*      */                 
/*      */                 return;
/*      */               } 
/*  542 */               dfw.d(this.a);
/*  543 */             } catch (dhi dhi) {
/*  544 */               dfw.a(false);
/*  545 */               dfw.h().error("Couldn't connect to realms", dhi);
/*      */               
/*  547 */               if (dhi.a == 401) {
/*  548 */                 dfw.a(new dhw(new of("mco.error.invalid.session.title"), new of("mco.error.invalid.session.message"), dfw.a(this.a)));
/*  549 */                 dfw.e(this.a).execute(() -> dfw.h(this.a).a(dfw.i()));
/*      */               } else {
/*  551 */                 dfw.f(this.a).execute(() -> dfw.g(this.a).a(new dhw(☃, dfw.a(this.a))));
/*      */               } 
/*      */             } 
/*      */           }
/*  555 */         }).start();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private void I() {}
/*      */   
/*      */   private void J() {
/*  563 */     (new Thread(this, "MCO Compatability Checker #1")
/*      */       {
/*      */         public void run() {
/*  566 */           dgb ☃ = dgb.a();
/*      */           try {
/*  568 */             Boolean bool = ☃.g();
/*      */             
/*  570 */             if (bool.booleanValue()) {
/*  571 */               dfw.h().info("Realms is available for this user");
/*  572 */               dfw.b(true);
/*      */             } else {
/*  574 */               dfw.h().info("Realms is not available for this user");
/*  575 */               dfw.b(false);
/*  576 */               dfw.k(this.a).execute(() -> dfw.n(this.a).a(new dib(dfw.a(this.a))));
/*      */             } 
/*      */             
/*  579 */             dfw.c(true);
/*  580 */           } catch (dhi dhi) {
/*  581 */             dfw.h().error("Couldn't connect to realms", dhi);
/*  582 */             dfw.l(this.a).execute(() -> dfw.m(this.a).a(new dhw(☃, dfw.a(this.a))));
/*      */           } 
/*      */         }
/*  585 */       }).start();
/*      */   }
/*      */   
/*      */   private void K() {
/*  589 */     if (dgb.a != dgb.b.b) {
/*  590 */       (new Thread(this, "MCO Stage Availability Checker #1")
/*      */         {
/*      */           public void run() {
/*  593 */             dgb ☃ = dgb.a();
/*      */             try {
/*  595 */               Boolean bool = ☃.h();
/*      */               
/*  597 */               if (bool.booleanValue()) {
/*  598 */                 dgb.b();
/*  599 */                 dfw.h().info("Switched to stage");
/*  600 */                 dfw.j().e();
/*      */               } 
/*  602 */             } catch (dhi dhi) {
/*  603 */               dfw.h().error("Couldn't connect to Realms: " + dhi);
/*      */             } 
/*      */           }
/*  606 */         }).start();
/*      */     }
/*      */   }
/*      */   
/*      */   private void L() {
/*  611 */     if (dgb.a != dgb.b.c) {
/*  612 */       (new Thread(this, "MCO Local Availability Checker #1")
/*      */         {
/*      */           public void run() {
/*  615 */             dgb ☃ = dgb.a();
/*      */             try {
/*  617 */               Boolean bool = ☃.h();
/*      */               
/*  619 */               if (bool.booleanValue()) {
/*  620 */                 dgb.d();
/*  621 */                 dfw.h().info("Switched to local");
/*  622 */                 dfw.j().e();
/*      */               } 
/*  624 */             } catch (dhi dhi) {
/*  625 */               dfw.h().error("Couldn't connect to Realms: " + dhi);
/*      */             } 
/*      */           }
/*  628 */         }).start();
/*      */     }
/*      */   }
/*      */   
/*      */   private void M() {
/*  633 */     dgb.c();
/*  634 */     Y.e();
/*      */   }
/*      */   
/*      */   private void N() {
/*  638 */     Y.l();
/*      */   }
/*      */   
/*      */   private void f(dgq ☃) {
/*  642 */     if (this.i.J().b().equals(☃.g) || Z) {
/*  643 */       O();
/*  644 */       this.i.a(new dhs(this, ☃.a));
/*      */     } 
/*      */   }
/*      */   
/*      */   private void g(@Nullable dgq ☃) {
/*  649 */     if (☃ != null && !this.i.J().b().equals(☃.g)) {
/*  650 */       O();
/*  651 */       nr nr1 = new of("mco.configure.world.leave.question.line1");
/*  652 */       nr nr2 = new of("mco.configure.world.leave.question.line2");
/*  653 */       this.i.a(new dhy(this::d, dhy.a.b, nr1, nr2, true));
/*      */     } 
/*      */   }
/*      */   
/*      */   private void O() {
/*  658 */     aa = (int)this.aj.m();
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   private dgq a(long ☃) {
/*  663 */     for (dgq dgq : this.ar) {
/*  664 */       if (dgq.a == ☃) {
/*  665 */         return dgq;
/*      */       }
/*      */     } 
/*      */     
/*  669 */     return null;
/*      */   }
/*      */   
/*      */   private void d(boolean ☃) {
/*  673 */     if (☃) {
/*  674 */       (new Thread(this, "Realms-leave-server")
/*      */         {
/*      */           public void run() {
/*      */             try {
/*  678 */               dgq ☃ = dfw.a(this.a, dfw.o(this.a));
/*      */               
/*  680 */               if (☃ != null) {
/*  681 */                 dgb dgb = dgb.a();
/*  682 */                 dgb.c(☃.a);
/*  683 */                 dfw.p(this.a).execute(() -> dfw.a(this.a, ☃));
/*      */               } 
/*  685 */             } catch (dhi ☃) {
/*  686 */               dfw.h().error("Couldn't configure world");
/*  687 */               dfw.q(this.a).execute(() -> dfw.r(this.a).a(new dhw(☃, this.a)));
/*      */             } 
/*      */           }
/*  690 */         }).start();
/*      */     }
/*      */     
/*  693 */     this.i.a(this);
/*      */   }
/*      */   
/*      */   private void h(dgq ☃) {
/*  697 */     Y.a(☃);
/*  698 */     this.ar.remove(☃);
/*  699 */     this.aj.au_().removeIf(☃ -> (☃ instanceof g && (g.a((g)☃)).a == this.ak));
/*  700 */     this.aj.b((b)null);
/*  701 */     a((dgq)null);
/*  702 */     this.ak = -1L;
/*  703 */     this.al.o = false;
/*      */   }
/*      */   
/*      */   public void ar_() {
/*  707 */     this.ak = -1L;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(int ☃, int i, int j) {
/*  712 */     if (☃ == 256) {
/*  713 */       this.aF.forEach(dfv::a);
/*      */       
/*  715 */       P();
/*      */       
/*  717 */       return true;
/*      */     } 
/*  719 */     return super.a(☃, i, j);
/*      */   }
/*      */   
/*      */   private void P() {
/*  723 */     if (aq_() && this.av) {
/*  724 */       this.av = false;
/*      */     } else {
/*  726 */       this.i.a(this.ai);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(char ☃, int i) {
/*  732 */     this.aF.forEach(dfv1 -> dfv1.a(☃));
/*  733 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(dfm ☃, int i, int j, float f1) {
/*  738 */     this.aJ = c.a;
/*      */     
/*  740 */     this.aq = null;
/*      */     
/*  742 */     a(☃);
/*      */     
/*  744 */     this.aj.a(☃, i, j, f1);
/*      */     
/*  746 */     a(☃, this.k / 2 - 50, 7);
/*      */     
/*  748 */     if (dgb.a == dgb.b.b) {
/*  749 */       c(☃);
/*      */     }
/*      */     
/*  752 */     if (dgb.a == dgb.b.c) {
/*  753 */       b(☃);
/*      */     }
/*      */     
/*  756 */     if (aq_()) {
/*  757 */       b(☃, i, j);
/*      */     } else {
/*  759 */       if (this.az) {
/*      */         
/*  761 */         a((dgq)null);
/*  762 */         if (!this.e.contains(this.aj))
/*      */         {
/*  764 */           this.e.add(this.aj);
/*      */         }
/*  766 */         dgq dgq = a(this.ak);
/*  767 */         this.al.o = b(dgq);
/*      */       } 
/*      */       
/*  770 */       this.az = false;
/*      */     } 
/*      */     
/*  773 */     super.a(☃, i, j, f1);
/*      */     
/*  775 */     if (this.aq != null) {
/*  776 */       a(☃, this.aq, i, j);
/*      */     }
/*      */     
/*  779 */     if (this.ax && !this.ay && aq_()) {
/*  780 */       this.i.M().a(C);
/*  781 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  782 */       int k = 8;
/*  783 */       int m = 8;
/*      */       
/*  785 */       int n = 0;
/*      */       
/*  787 */       if ((x.b() / 800L & 0x1L) == 1L) {
/*  788 */         n = 8;
/*      */       }
/*      */       
/*  791 */       dkw.a(☃, this.aN.l + this.aN.h() - 8 - 4, this.aN.m + this.aN.e() / 2 - 4, 0.0F, n, 8, 8, 8, 16);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void a(dfm ☃, int i, int j) {
/*  796 */     this.i.M().a(v);
/*  797 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  798 */     RenderSystem.pushMatrix();
/*  799 */     RenderSystem.scalef(0.5F, 0.5F, 0.5F);
/*  800 */     dkw.a(☃, i * 2, j * 2 - 5, 0.0F, 0.0F, 200, 50, 200, 50);
/*      */     
/*  802 */     RenderSystem.popMatrix();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(double ☃, double d1, int i) {
/*  807 */     if (a(☃, d1) && this.av) {
/*  808 */       this.av = false;
/*  809 */       this.aw = true;
/*  810 */       return true;
/*      */     } 
/*  812 */     return super.a(☃, d1, i);
/*      */   }
/*      */   
/*      */   private boolean a(double ☃, double d1) {
/*  816 */     int i = Q();
/*  817 */     int j = R();
/*      */     
/*  819 */     return (☃ < (i - 5) || ☃ > (i + 315) || d1 < (j - 5) || d1 > (j + 171));
/*      */   }
/*      */   
/*      */   private void b(dfm ☃, int i, int j) {
/*  823 */     int k = Q();
/*  824 */     int m = R();
/*      */     
/*  826 */     if (!this.az) {
/*      */       
/*  828 */       this.aC = 0;
/*  829 */       this.aD = 0;
/*  830 */       this.aE = true;
/*      */       
/*  832 */       a((dgq)null);
/*      */ 
/*      */       
/*  835 */       if (this.e.contains(this.aj)) {
/*  836 */         dmi dmi = this.aj;
/*  837 */         if (!this.e.remove(dmi)) {
/*  838 */           a.error("Unable to remove widget: " + dmi);
/*      */         }
/*      */       } 
/*      */       
/*  842 */       eoj.a(N.getString());
/*      */     } 
/*      */     
/*  845 */     if (this.au) {
/*  846 */       this.az = true;
/*      */     }
/*      */     
/*  849 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 0.7F);
/*  850 */     RenderSystem.enableBlend();
/*  851 */     this.i.M().a(A);
/*      */     
/*  853 */     int n = 0;
/*  854 */     int i1 = 32;
/*  855 */     dkw.a(☃, 0, 32, 0.0F, 0.0F, this.k, this.l - 40 - 32, 310, 166);
/*  856 */     RenderSystem.disableBlend();
/*      */     
/*  858 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  859 */     this.i.M().a(z);
/*  860 */     dkw.a(☃, k, m, 0.0F, 0.0F, 310, 166, 310, 166);
/*      */     
/*  862 */     if (!X.isEmpty()) {
/*  863 */       this.i.M().a(X.get(this.aC));
/*  864 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  865 */       dkw.a(☃, k + 7, m + 7, 0.0F, 0.0F, 195, 152, 195, 152);
/*      */       
/*  867 */       if (this.aD % 95 < 5) {
/*  868 */         if (!this.aE) {
/*  869 */           this.aC = (this.aC + 1) % X.size();
/*  870 */           this.aE = true;
/*      */         } 
/*      */       } else {
/*  873 */         this.aE = false;
/*      */       } 
/*      */     } 
/*      */     
/*  877 */     this.aI.c(☃, this.k / 2 + 52, m + 7, 10, 5000268);
/*      */   }
/*      */   
/*      */   private int Q() {
/*  881 */     return (this.k - 310) / 2;
/*      */   }
/*      */   
/*      */   private int R() {
/*  885 */     return this.l / 2 - 80;
/*      */   }
/*      */   
/*      */   private void a(dfm ☃, int i, int j, int k, int m, boolean bool1, boolean bool2) {
/*  889 */     int n = this.as;
/*  890 */     boolean bool3 = c(i, j);
/*      */     
/*  892 */     boolean bool4 = (bool2 && bool1);
/*  893 */     if (bool4) {
/*  894 */       float f2 = 0.25F + (1.0F + afm.a(this.at * 0.5F)) * 0.25F;
/*  895 */       int i3 = 0xFF000000 | (int)(f2 * 64.0F) << 16 | (int)(f2 * 64.0F) << 8 | (int)(f2 * 64.0F) << 0;
/*      */       
/*  897 */       a(☃, k - 2, m - 2, k + 18, m + 18, i3, i3);
/*      */       
/*  899 */       i3 = 0xFF000000 | (int)(f2 * 255.0F) << 16 | (int)(f2 * 255.0F) << 8 | (int)(f2 * 255.0F) << 0;
/*  900 */       a(☃, k - 2, m - 2, k + 18, m - 1, i3, i3);
/*  901 */       a(☃, k - 2, m - 2, k - 1, m + 18, i3, i3);
/*  902 */       a(☃, k + 17, m - 2, k + 18, m + 18, i3, i3);
/*  903 */       a(☃, k - 2, m + 17, k + 18, m + 18, i3, i3);
/*      */     } 
/*      */     
/*  906 */     this.i.M().a(t);
/*  907 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  908 */     boolean bool5 = (bool2 && bool1);
/*  909 */     float f1 = bool5 ? 16.0F : 0.0F;
/*  910 */     dkw.a(☃, k, m - 6, f1, 0.0F, 15, 25, 31, 25);
/*      */     
/*  912 */     boolean bool6 = (bool2 && n != 0);
/*  913 */     if (bool6) {
/*  914 */       int i3 = (Math.min(n, 6) - 1) * 8;
/*      */       
/*  916 */       int i4 = (int)(Math.max(0.0F, Math.max(afm.a((10 + this.at) * 0.57F), afm.b(this.at * 0.35F))) * -6.0F);
/*      */       
/*  918 */       this.i.M().a(s);
/*  919 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  920 */       float f2 = bool3 ? 8.0F : 0.0F;
/*  921 */       dkw.a(☃, k + 4, m + 4 + i4, i3, f2, 8, 8, 48, 16);
/*      */     } 
/*      */     
/*  924 */     int i1 = i + 12;
/*  925 */     int i2 = j;
/*      */     
/*  927 */     boolean bool7 = (bool2 && bool3);
/*  928 */     if (bool7) {
/*  929 */       nr nr1 = (n == 0) ? E : F;
/*  930 */       int i3 = this.o.a(nr1);
/*  931 */       a(☃, i1 - 3, i2 - 3, i1 + i3 + 3, i2 + 8 + 3, -1073741824, -1073741824);
/*  932 */       this.o.a(☃, nr1, i1, i2, -1);
/*      */     } 
/*      */   }
/*      */   
/*      */   private boolean c(double ☃, double d1) {
/*  937 */     int i = this.k / 2 + 50;
/*  938 */     int j = this.k / 2 + 66;
/*  939 */     int k = 11;
/*  940 */     int m = 23;
/*      */     
/*  942 */     if (this.as != 0) {
/*  943 */       i -= 3;
/*  944 */       j += 3;
/*  945 */       k -= 5;
/*  946 */       m += 5;
/*      */     } 
/*      */     
/*  949 */     return (i <= ☃ && ☃ <= j && k <= d1 && d1 <= m);
/*      */   }
/*      */   
/*      */   public void a(dgq ☃, dot dot1) {
/*  953 */     if (☃ != null) {
/*      */       try {
/*  955 */         if (!this.aH.tryLock(1L, TimeUnit.SECONDS)) {
/*      */           return;
/*      */         }
/*      */         
/*  959 */         if (this.aH.getHoldCount() > 1) {
/*      */           return;
/*      */         }
/*  962 */       } catch (InterruptedException interruptedException) {
/*      */         return;
/*      */       } 
/*      */       
/*  966 */       this.ah = true;
/*  967 */       this.i.a(new dhz(dot1, new diz(this, dot1, ☃, this.aH)));
/*      */     } 
/*      */   }
/*      */   
/*      */   class f extends eon<b> {
/*      */     private boolean o;
/*      */     
/*      */     public f(dfw this$0) {
/*  975 */       super(this$0.k, this$0.l, 32, this$0.l - 40, 36);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a() {
/*  980 */       super.a();
/*  981 */       this.o = false;
/*      */     }
/*      */     
/*      */     public int a(dfw.b ☃) {
/*  985 */       this.o = true;
/*  986 */       return a(☃);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean b() {
/*  991 */       return (this.a.aw_() == this);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(int ☃, int i, int j) {
/*  996 */       if (☃ == 257 || ☃ == 32 || ☃ == 335) {
/*  997 */         dlv.a a = h();
/*  998 */         if (a == null) {
/*  999 */           return super.a(☃, i, j);
/*      */         }
/* 1001 */         return a.a(0.0D, 0.0D, 0);
/*      */       } 
/* 1003 */       return super.a(☃, i, j);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(double ☃, double d1, int i) {
/* 1008 */       if (i == 0 && ☃ < e() && d1 >= this.i && d1 <= this.j) {
/* 1009 */         int j = dfw.s(this.a).q();
/* 1010 */         int k = e();
/*      */         
/* 1012 */         int m = (int)Math.floor(d1 - this.i) - this.n + (int)m() - 4;
/* 1013 */         int n = m / this.c;
/*      */         
/* 1015 */         if (☃ >= j && ☃ <= k && n >= 0 && m >= 0 && n < l()) {
/* 1016 */           a(m, n, ☃, d1, this.d);
/*      */           
/* 1018 */           dfw.a(this.a, dfw.t(this.a) + 7);
/* 1019 */           a(n);
/*      */         } 
/* 1021 */         return true;
/*      */       } 
/* 1023 */       return super.a(☃, d1, i);
/*      */     }
/*      */     
/*      */     public void a(int ☃) {
/*      */       dgq dgq;
/* 1028 */       j(☃);
/* 1029 */       if (☃ == -1) {
/*      */         return;
/*      */       }
/*      */       
/* 1033 */       if (this.o) {
/* 1034 */         if (☃ == 0) {
/* 1035 */           dgq = null;
/*      */         } else {
/* 1037 */           if (☃ - 1 >= dfw.u(this.a).size()) {
/* 1038 */             dfw.b(this.a, -1L);
/*      */             return;
/*      */           } 
/* 1041 */           dgq = dfw.u(this.a).get(☃ - 1);
/*      */         } 
/*      */       } else {
/* 1044 */         if (☃ >= dfw.u(this.a).size()) {
/* 1045 */           dfw.b(this.a, -1L);
/*      */           return;
/*      */         } 
/* 1048 */         dgq = dfw.u(this.a).get(☃);
/*      */       } 
/* 1050 */       dfw.b(this.a, dgq);
/* 1051 */       if (dgq == null) {
/* 1052 */         dfw.b(this.a, -1L);
/*      */         return;
/*      */       } 
/* 1055 */       if (dgq.e == dgq.b.c) {
/* 1056 */         dfw.b(this.a, -1L);
/*      */         return;
/*      */       } 
/* 1059 */       dfw.b(this.a, dgq.a);
/* 1060 */       if (dfw.t(this.a) >= 10 && (dfw.v(this.a)).o) {
/* 1061 */         this.a.a(dfw.a(this.a, dfw.o(this.a)), this.a);
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*      */     public void b(@Nullable dfw.b ☃) {
/* 1067 */       super.a(☃);
/* 1068 */       int i = au_().indexOf(☃);
/* 1069 */       if (this.o && i == 0) {
/* 1070 */         eoj.a(new String[] { ekx.a("mco.trial.message.line1", new Object[0]), ekx.a("mco.trial.message.line2", new Object[0]) });
/* 1071 */       } else if (!this.o || i > 0) {
/* 1072 */         dgq dgq = dfw.u(this.a).get(i - (this.o ? 1 : 0));
/* 1073 */         dfw.b(this.a, dgq.a);
/* 1074 */         dfw.b(this.a, dgq);
/* 1075 */         if (dgq.e == dgq.b.c) {
/* 1076 */           eoj.a(ekx.a("mco.selectServer.uninitialized", new Object[0]) + ekx.a("mco.gui.button", new Object[0]));
/*      */         } else {
/* 1078 */           eoj.a(ekx.a("narrator.select", new Object[] { dgq.c }));
/*      */         } 
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(int ☃, int i, double d1, double d2, int j) {
/* 1085 */       if (this.o) {
/* 1086 */         if (i == 0) {
/* 1087 */           dfw.a(this.a, true);
/*      */           return;
/*      */         } 
/* 1090 */         i--;
/*      */       } 
/*      */ 
/*      */       
/* 1094 */       if (i >= dfw.u(this.a).size()) {
/*      */         return;
/*      */       }
/*      */       
/* 1098 */       dgq dgq = dfw.u(this.a).get(i);
/*      */       
/* 1100 */       if (dgq == null) {
/*      */         return;
/*      */       }
/*      */       
/* 1104 */       if (dgq.e == dgq.b.c) {
/* 1105 */         dfw.b(this.a, -1L);
/* 1106 */         djz.C().a(new dhu(dgq, this.a));
/*      */       } else {
/* 1108 */         dfw.b(this.a, dgq.a);
/*      */       } 
/*      */       
/* 1111 */       if (dfw.w(this.a) == dfw.c.d) {
/* 1112 */         dfw.b(this.a, dgq.a);
/* 1113 */         dfw.c(this.a, dgq);
/* 1114 */       } else if (dfw.w(this.a) == dfw.c.c) {
/* 1115 */         dfw.b(this.a, dgq.a);
/* 1116 */         dfw.d(this.a, dgq);
/* 1117 */       } else if (dfw.w(this.a) == dfw.c.b) {
/* 1118 */         dfw.x(this.a);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public int c() {
/* 1124 */       return l() * 36;
/*      */     }
/*      */ 
/*      */     
/*      */     public int d() {
/* 1129 */       return 300;
/*      */     }
/*      */   }
/*      */   
/*      */   abstract class b extends dlv.a<b> { private b(dfw this$0) {} }
/*      */   
/*      */   class i extends b {
/*      */     private i(dfw this$0) {}
/*      */     
/*      */     public void a(dfm ☃, int j, int k, int m, int n, int i1, int i2, int i3, boolean bool, float f) {
/* 1139 */       a(☃, j, m, k, i2, i3);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(double ☃, double d1, int j) {
/* 1144 */       dfw.a(this.b, true);
/* 1145 */       return true;
/*      */     }
/*      */     
/*      */     private void a(dfm ☃, int j, int k, int m, int n, int i1) {
/* 1149 */       int i2 = m + 8;
/* 1150 */       int i3 = 0;
/*      */       
/* 1152 */       boolean bool = false;
/*      */       
/* 1154 */       if (k <= n && n <= (int)dfw.s(this.b).m() && m <= i1 && i1 <= m + 32) {
/* 1155 */         bool = true;
/*      */       }
/*      */       
/* 1158 */       int i4 = 8388479;
/*      */       
/* 1160 */       if (bool && !this.b.aq_()) {
/* 1161 */         i4 = 6077788;
/*      */       }
/*      */       
/* 1164 */       for (nr nr : dfw.k()) {
/* 1165 */         dkw.a(☃, dfw.y(this.b), nr, this.b.k / 2, i2 + i3, i4);
/* 1166 */         i3 += 10;
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   class g
/*      */     extends b {
/*      */     private final dgq c;
/*      */     
/*      */     public g(dfw this$0, dgq ☃) {
/* 1176 */       super(this$0);
/* 1177 */       this.c = ☃;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 1182 */       a(this.c, ☃, k, j, i1, i2);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a(double ☃, double d1, int i) {
/* 1187 */       if (this.c.e == dgq.b.c) {
/* 1188 */         dfw.b(this.b, -1L);
/* 1189 */         dfw.z(this.b).a(new dhu(this.c, this.b));
/*      */       } else {
/* 1191 */         dfw.b(this.b, this.c.a);
/*      */       } 
/* 1193 */       return true;
/*      */     }
/*      */     
/*      */     private void a(dgq ☃, dfm dfm1, int i, int j, int k, int m) {
/* 1197 */       b(☃, dfm1, i + 36, j, k, m);
/*      */     }
/*      */     
/*      */     private void b(dgq ☃, dfm dfm1, int i, int j, int k, int m) {
/* 1201 */       if (☃.e == dgq.b.c) {
/* 1202 */         dfw.A(this.b).M().a(dfw.l());
/* 1203 */         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 1204 */         RenderSystem.enableAlphaTest();
/* 1205 */         dkw.a(dfm1, i + 10, j + 6, 0.0F, 0.0F, 40, 20, 40, 20);
/*      */         
/* 1207 */         float f = 0.5F + (1.0F + afm.a(dfw.B(this.b) * 0.25F)) * 0.25F;
/* 1208 */         int i2 = 0xFF000000 | (int)(127.0F * f) << 16 | (int)(255.0F * f) << 8 | (int)(127.0F * f);
/* 1209 */         dkw.a(dfm1, dfw.C(this.b), dfw.m(), i + 10 + 40 + 75, j + 12, i2);
/*      */         
/*      */         return;
/*      */       } 
/*      */       
/* 1214 */       int n = 225;
/* 1215 */       int i1 = 2;
/*      */       
/* 1217 */       if (☃.j) {
/* 1218 */         dfw.a(this.b, dfm1, i + 225 - 14, j + 2, k, m);
/* 1219 */       } else if (☃.e == dgq.b.a) {
/* 1220 */         dfw.b(this.b, dfm1, i + 225 - 14, j + 2, k, m);
/* 1221 */       } else if (dfw.e(this.b, ☃) && ☃.l < 7) {
/* 1222 */         dfw.a(this.b, dfm1, i + 225 - 14, j + 2, k, m, ☃.l);
/* 1223 */       } else if (☃.e == dgq.b.b) {
/* 1224 */         dfw.c(this.b, dfm1, i + 225 - 14, j + 2, k, m);
/*      */       } 
/*      */       
/* 1227 */       if (!dfw.e(this.b, ☃) && !dfw.n()) {
/* 1228 */         dfw.d(this.b, dfm1, i + 225, j + 2, k, m);
/*      */       } else {
/* 1230 */         dfw.e(this.b, dfm1, i + 225, j + 2, k, m);
/*      */       } 
/*      */       
/* 1233 */       if (!"0".equals(☃.r.a)) {
/* 1234 */         String str = k.h + "" + ☃.r.a;
/* 1235 */         dfw.E(this.b).b(dfm1, str, (i + 207 - dfw.D(this.b).b(str)), (j + 3), 8421504);
/*      */         
/* 1237 */         if (k >= i + 207 - dfw.F(this.b).b(str) && k <= i + 207 && m >= j + 1 && m <= j + 10 && m < this.b.l - 40 && m > 32 && !this.b.aq_()) {
/* 1238 */           dfw.a(this.b, new nr[] { new oe(☃.r.b) });
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/* 1243 */       if (dfw.e(this.b, ☃) && ☃.j) {
/* 1244 */         nr nr1, nr2; RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 1245 */         RenderSystem.enableBlend();
/* 1246 */         dfw.G(this.b).M().a(dfw.o());
/*      */         
/* 1248 */         RenderSystem.blendFunc(dem.r.l, dem.j.j);
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1253 */         if (☃.k) {
/* 1254 */           nr1 = dfw.p();
/* 1255 */           nr2 = dfw.q();
/*      */         } else {
/* 1257 */           nr1 = dfw.r();
/* 1258 */           nr2 = dfw.s();
/*      */         } 
/*      */         
/* 1261 */         int i2 = dfw.H(this.b).a(nr2) + 17;
/* 1262 */         int i3 = 16;
/* 1263 */         int i4 = i + dfw.I(this.b).a(nr1) + 8;
/* 1264 */         int i5 = j + 13;
/*      */         
/* 1266 */         boolean bool = false;
/* 1267 */         if (k >= i4 && k < i4 + i2 && m > i5) if ((((m <= i5 + 16) ? 1 : 0) & ((m < this.b.l - 40) ? 1 : 0)) != 0 && m > 32 && !this.b.aq_()) {
/* 1268 */             bool = true;
/* 1269 */             dfw.a(this.b, dfw.c.b);
/*      */           } 
/*      */         
/* 1272 */         int i6 = bool ? 2 : 1;
/*      */         
/* 1274 */         dkw.a(dfm1, i4, i5, 0.0F, (46 + i6 * 20), i2 / 2, 8, 256, 256);
/* 1275 */         dkw.a(dfm1, i4 + i2 / 2, i5, (200 - i2 / 2), (46 + i6 * 20), i2 / 2, 8, 256, 256);
/* 1276 */         dkw.a(dfm1, i4, i5 + 8, 0.0F, (46 + i6 * 20 + 12), i2 / 2, 8, 256, 256);
/* 1277 */         dkw.a(dfm1, i4 + i2 / 2, i5 + 8, (200 - i2 / 2), (46 + i6 * 20 + 12), i2 / 2, 8, 256, 256);
/*      */         
/* 1279 */         RenderSystem.disableBlend();
/*      */         
/* 1281 */         int i7 = j + 11 + 5;
/* 1282 */         int i8 = bool ? 16777120 : 16777215;
/*      */         
/* 1284 */         dfw.J(this.b).b(dfm1, nr1, (i + 2), (i7 + 1), 15553363);
/* 1285 */         dkw.a(dfm1, dfw.K(this.b), nr2, i4 + i2 / 2, i7 + 1, i8);
/*      */       } else {
/*      */         
/* 1288 */         if (☃.m == dgq.c.b) {
/* 1289 */           int i2 = 13413468;
/* 1290 */           int i3 = dfw.L(this.b).a(dfw.t());
/* 1291 */           dfw.M(this.b).b(dfm1, dfw.t(), (i + 2), (j + 12), 13413468);
/* 1292 */           dfw.N(this.b).b(dfm1, ☃.c(), (i + 2 + i3), (j + 12), 7105644);
/*      */         } else {
/* 1294 */           dfw.O(this.b).b(dfm1, ☃.a(), (i + 2), (j + 12), 7105644);
/*      */         } 
/*      */ 
/*      */         
/* 1298 */         if (!dfw.e(this.b, ☃)) {
/* 1299 */           dfw.P(this.b).b(dfm1, ☃.f, (i + 2), (j + 12 + 11), 5000268);
/*      */         }
/*      */       } 
/*      */       
/* 1303 */       dfw.Q(this.b).b(dfm1, ☃.b(), (i + 2), (j + 1), 16777215);
/*      */ 
/*      */ 
/*      */       
/* 1307 */       dir.a(☃.g, () -> {
/*      */             RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*      */             dkw.a(☃, i - 36, j, 32, 32, 8.0F, 8.0F, 8, 8, 64, 64);
/*      */             dkw.a(☃, i - 36, j, 32, 32, 40.0F, 8.0F, 8, 8, 64, 64);
/*      */           });
/*      */     }
/*      */   }
/*      */   
/*      */   private boolean i(dgq ☃) {
/* 1316 */     return (☃.g != null && ☃.g.equals(this.i.J().b()));
/*      */   }
/*      */   
/*      */   private boolean j(dgq ☃) {
/* 1320 */     return (i(☃) && !☃.j);
/*      */   }
/*      */   
/*      */   private void c(dfm ☃, int i, int j, int k, int m) {
/* 1324 */     this.i.M().a(p);
/* 1325 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 1326 */     dkw.a(☃, i, j, 0.0F, 0.0F, 10, 28, 10, 28);
/*      */     
/* 1328 */     if (k >= i && k <= i + 9 && m >= j && m <= j + 27 && m < this.l - 40 && m > 32 && !aq_()) {
/* 1329 */       a(new nr[] { O });
/*      */     }
/*      */   }
/*      */   
/*      */   private void b(dfm ☃, int i, int j, int k, int m, int n) {
/* 1334 */     this.i.M().a(q);
/*      */     
/* 1336 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*      */     
/* 1338 */     if (this.at % 20 < 10) {
/* 1339 */       dkw.a(☃, i, j, 0.0F, 0.0F, 10, 28, 20, 28);
/*      */     } else {
/* 1341 */       dkw.a(☃, i, j, 10.0F, 0.0F, 10, 28, 20, 28);
/*      */     } 
/*      */     
/* 1344 */     if (k >= i && k <= i + 9 && m >= j && m <= j + 27 && m < this.l - 40 && m > 32 && !aq_()) {
/* 1345 */       if (n <= 0) {
/* 1346 */         a(new nr[] { P });
/* 1347 */       } else if (n == 1) {
/* 1348 */         a(new nr[] { Q });
/*      */       } else {
/* 1350 */         a(new nr[] { new of("mco.selectServer.expires.days", new Object[] { Integer.valueOf(n) }) });
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   private void d(dfm ☃, int i, int j, int k, int m) {
/* 1356 */     this.i.M().a(b);
/* 1357 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 1358 */     dkw.a(☃, i, j, 0.0F, 0.0F, 10, 28, 10, 28);
/*      */     
/* 1360 */     if (k >= i && k <= i + 9 && m >= j && m <= j + 27 && m < this.l - 40 && m > 32 && !aq_()) {
/* 1361 */       a(new nr[] { R });
/*      */     }
/*      */   }
/*      */   
/*      */   private void e(dfm ☃, int i, int j, int k, int m) {
/* 1366 */     this.i.M().a(c);
/* 1367 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 1368 */     dkw.a(☃, i, j, 0.0F, 0.0F, 10, 28, 10, 28);
/*      */     
/* 1370 */     if (k >= i && k <= i + 9 && m >= j && m <= j + 27 && m < this.l - 40 && m > 32 && !aq_()) {
/* 1371 */       a(new nr[] { S });
/*      */     }
/*      */   }
/*      */   
/*      */   private void f(dfm ☃, int i, int j, int k, int m) {
/* 1376 */     boolean bool = false;
/*      */     
/* 1378 */     if (k >= i && k <= i + 28 && m >= j && m <= j + 28 && m < this.l - 40 && m > 32 && !aq_()) {
/* 1379 */       bool = true;
/*      */     }
/*      */     
/* 1382 */     this.i.M().a(r);
/* 1383 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 1384 */     float f1 = bool ? 28.0F : 0.0F;
/* 1385 */     dkw.a(☃, i, j, f1, 0.0F, 28, 28, 56, 28);
/*      */     
/* 1387 */     if (bool) {
/* 1388 */       a(new nr[] { T });
/* 1389 */       this.aJ = c.c;
/*      */     } 
/*      */   }
/*      */   
/*      */   private void g(dfm ☃, int i, int j, int k, int m) {
/* 1394 */     boolean bool = false;
/*      */     
/* 1396 */     if (k >= i && k <= i + 28 && m >= j && m <= j + 28 && m < this.l - 40 && m > 32 && !aq_()) {
/* 1397 */       bool = true;
/*      */     }
/*      */     
/* 1400 */     this.i.M().a(w);
/* 1401 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 1402 */     float f1 = bool ? 28.0F : 0.0F;
/* 1403 */     dkw.a(☃, i, j, f1, 0.0F, 28, 28, 56, 28);
/*      */     
/* 1405 */     if (bool) {
/* 1406 */       a(new nr[] { U });
/* 1407 */       this.aJ = c.d;
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void a(dfm ☃, List<nr> list, int i, int j) {
/* 1412 */     if (list.isEmpty()) {
/*      */       return;
/*      */     }
/*      */     
/* 1416 */     int k = 0;
/* 1417 */     int m = 0;
/*      */     
/* 1419 */     for (nr nr1 : list) {
/* 1420 */       int i2 = this.o.a(nr1);
/* 1421 */       if (i2 > m) {
/* 1422 */         m = i2;
/*      */       }
/*      */     } 
/*      */     
/* 1426 */     int n = i - m - 5;
/*      */     
/* 1428 */     int i1 = j;
/*      */     
/* 1430 */     if (n < 0) {
/* 1431 */       n = i + 12;
/*      */     }
/*      */     
/* 1434 */     for (nr nr1 : list) {
/* 1435 */       int i2 = i1 - ((k == 0) ? 3 : 0) + k;
/* 1436 */       a(☃, n - 3, i2, n + m + 3, i1 + 8 + 3 + k, -1073741824, -1073741824);
/* 1437 */       this.o.a(☃, nr1, n, (i1 + k), 16777215);
/* 1438 */       k += 10;
/*      */     } 
/*      */   }
/*      */   
/*      */   private void a(dfm ☃, int i, int j, int k, int m, boolean bool) {
/* 1443 */     boolean bool1 = false;
/*      */     
/* 1445 */     if (i >= k && i <= k + 20 && j >= m && j <= m + 20) {
/* 1446 */       bool1 = true;
/*      */     }
/*      */     
/* 1449 */     this.i.M().a(x);
/* 1450 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 1451 */     float f1 = bool ? 20.0F : 0.0F;
/* 1452 */     dkw.a(☃, k, m, f1, 0.0F, 20, 20, 40, 20);
/*      */     
/* 1454 */     if (bool1) {
/* 1455 */       a(new nr[] { V });
/*      */     }
/*      */   }
/*      */   
/*      */   private void a(dfm ☃, int i, int j, boolean bool1, int k, int m, boolean bool2, boolean bool3) {
/* 1460 */     boolean bool4 = false;
/*      */     
/* 1462 */     if (i >= k && i <= k + 20 && j >= m && j <= m + 20) {
/* 1463 */       bool4 = true;
/*      */     }
/*      */     
/* 1466 */     this.i.M().a(y);
/* 1467 */     if (bool3) {
/* 1468 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*      */     } else {
/* 1470 */       RenderSystem.color4f(0.5F, 0.5F, 0.5F, 1.0F);
/*      */     } 
/* 1472 */     boolean bool5 = (bool3 && bool2);
/* 1473 */     float f1 = bool5 ? 20.0F : 0.0F;
/* 1474 */     dkw.a(☃, k, m, f1, 0.0F, 20, 20, 40, 20);
/*      */     
/* 1476 */     if (bool4 && bool3) {
/* 1477 */       a(new nr[] { W });
/*      */     }
/*      */     
/* 1480 */     if (bool1 && bool3) {
/* 1481 */       int n = bool4 ? 0 : (int)(Math.max(0.0F, Math.max(afm.a((10 + this.at) * 0.57F), afm.b(this.at * 0.35F))) * -6.0F);
/*      */       
/* 1483 */       this.i.M().a(s);
/* 1484 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 1485 */       dkw.a(☃, k + 10, m + 2 + n, 40.0F, 0.0F, 8, 8, 48, 16);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void b(dfm ☃) {
/* 1490 */     String str = "LOCAL!";
/*      */     
/* 1492 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 1493 */     RenderSystem.pushMatrix();
/*      */     
/* 1495 */     RenderSystem.translatef((this.k / 2 - 25), 20.0F, 0.0F);
/* 1496 */     RenderSystem.rotatef(-20.0F, 0.0F, 0.0F, 1.0F);
/* 1497 */     RenderSystem.scalef(1.5F, 1.5F, 1.5F);
/*      */     
/* 1499 */     this.o.b(☃, "LOCAL!", 0.0F, 0.0F, 8388479);
/*      */     
/* 1501 */     RenderSystem.popMatrix();
/*      */   }
/*      */   
/*      */   private void c(dfm ☃) {
/* 1505 */     String str = "STAGE!";
/*      */     
/* 1507 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 1508 */     RenderSystem.pushMatrix();
/*      */     
/* 1510 */     RenderSystem.translatef((this.k / 2 - 25), 20.0F, 0.0F);
/* 1511 */     RenderSystem.rotatef(-20.0F, 0.0F, 0.0F, 1.0F);
/* 1512 */     RenderSystem.scalef(1.5F, 1.5F, 1.5F);
/*      */     
/* 1514 */     this.o.b(☃, "STAGE!", 0.0F, 0.0F, -256);
/*      */     
/* 1516 */     RenderSystem.popMatrix();
/*      */   }
/*      */   
/*      */   public dfw g() {
/* 1520 */     dfw ☃ = new dfw(this.ai);
/* 1521 */     ☃.b(this.i, this.k, this.l);
/* 1522 */     return ☃;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void a(ach ☃) {
/* 1532 */     Collection<vk> collection = ☃.a("textures/gui/images", ☃ -> ☃.endsWith(".png"));
/* 1533 */     X = (List<vk>)collection.stream().filter(☃ -> ☃.b().equals("realms")).collect(ImmutableList.toImmutableList());
/*      */   }
/*      */   
/*      */   private void a(nr... ☃) {
/* 1537 */     this.aq = Arrays.asList(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   class e
/*      */     extends dlj
/*      */     implements dmc
/*      */   {
/*      */     public e(dfw this$0) {
/* 1546 */       super(this$0.k / 2 + 47, 6, 22, 22, oe.d, dlj1 -> dfw.a(☃, dlj1));
/*      */     }
/*      */ 
/*      */     
/*      */     public void d() {
/* 1551 */       a(new of((dfw.R(this.a) == 0) ? "mco.invites.nopending" : "mco.invites.pending"));
/*      */     }
/*      */ 
/*      */     
/*      */     public void b(dfm ☃, int i, int j, float f) {
/* 1556 */       dfw.a(this.a, ☃, i, j, this.l, this.m, g(), this.o);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   private void a(dlj ☃) {
/* 1562 */     this.i.a(new dic(this.ai));
/*      */   }
/*      */   
/*      */   class d extends dlj {
/*      */     public d(dfw this$0) {
/* 1567 */       super(this$0.k - 62, 6, 20, 20, oe.d, dlj1 -> {
/*      */             if (dfw.T(☃) == null) {
/*      */               return;
/*      */             }
/*      */             
/*      */             x.i().a(dfw.T(☃));
/*      */             
/*      */             if (dfw.S(☃)) {
/*      */               diq.a a = diq.a();
/*      */               a.b = false;
/*      */               dfw.b(☃, false);
/*      */               diq.a(a);
/*      */             } 
/*      */           });
/* 1581 */       a(new of("mco.news"));
/*      */     }
/*      */ 
/*      */     
/*      */     public void b(dfm ☃, int i, int j, float f) {
/* 1586 */       dfw.a(this.a, ☃, i, j, dfw.S(this.a), this.l, this.m, g(), this.o);
/*      */     }
/*      */   }
/*      */   
/*      */   class h extends dlj {
/*      */     public h(dfw this$0) {
/* 1592 */       super(this$0.k - 37, 6, 20, 20, new of("mco.selectServer.info"), dlj1 -> dfw.a(☃, !dfw.U(☃)));
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void b(dfm ☃, int i, int j, float f) {
/* 1599 */       dfw.a(this.a, ☃, i, j, this.l, this.m, g());
/*      */     }
/*      */   }
/*      */   
/*      */   class a extends dlj {
/*      */     public a(dfw this$0) {
/* 1605 */       super(dfw.V(this$0) + 4, dfw.W(this$0) + 4, 12, 12, new of("mco.selectServer.close"), dlj1 -> dfw.Y(☃));
/*      */     }
/*      */ 
/*      */     
/*      */     public void b(dfm ☃, int i, int j, float f) {
/* 1610 */       dfw.X(this.a).M().a(dfw.u());
/* 1611 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 1612 */       float f1 = g() ? 12.0F : 0.0F;
/* 1613 */       a(☃, this.l, this.m, 0.0F, f1, 12, 12, 12, 24);
/*      */       
/* 1615 */       if (b(i, j))
/* 1616 */         dfw.a(this.a, new nr[] { i() }); 
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dfw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */