/*      */ import com.google.common.collect.Lists;
/*      */ import com.mojang.authlib.GameProfile;
/*      */ import com.mojang.datafixers.util.Either;
/*      */ import io.netty.util.concurrent.Future;
/*      */ import java.util.Collection;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Optional;
/*      */ import java.util.OptionalInt;
/*      */ import java.util.Random;
/*      */ import java.util.UUID;
/*      */ import javax.annotation.Nullable;
/*      */ import net.minecraft.server.MinecraftServer;
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
/*      */ public class aah
/*      */   extends bfw
/*      */   implements bin
/*      */ {
/*  140 */   private static final Logger bJ = LogManager.getLogger();
/*      */   
/*      */   public aay b;
/*      */   
/*      */   public final MinecraftServer c;
/*      */   public final aai d;
/*  146 */   private final List<Integer> bK = Lists.newLinkedList();
/*      */   private final vt bL;
/*      */   private final adw bM;
/*  149 */   private float bN = Float.MIN_VALUE;
/*  150 */   private int bO = Integer.MIN_VALUE;
/*  151 */   private int bP = Integer.MIN_VALUE;
/*  152 */   private int bQ = Integer.MIN_VALUE;
/*  153 */   private int bR = Integer.MIN_VALUE;
/*  154 */   private int bS = Integer.MIN_VALUE;
/*  155 */   private float bT = -1.0E8F;
/*  156 */   private int bU = -99999999;
/*      */   private boolean bV = true;
/*  158 */   private int bW = -99999999;
/*  159 */   private int bX = 60;
/*      */   private bfu bY;
/*      */   private boolean bZ = true;
/*  162 */   private long ca = x.b();
/*      */   private aqa cb;
/*      */   private boolean cc;
/*      */   private boolean cd;
/*  166 */   private final adv ce = new adv();
/*      */   private dcn cf;
/*      */   private int cg;
/*      */   private boolean ch;
/*      */   @Nullable
/*      */   private dcn ci;
/*  172 */   private gp cj = gp.a(0, 0, 0);
/*      */   
/*  174 */   private vj<brx> ck = brx.g;
/*      */   
/*      */   @Nullable
/*      */   private fx cl;
/*      */   
/*      */   private boolean cm;
/*      */   private float cn;
/*      */   @Nullable
/*      */   private final abc co;
/*      */   
/*      */   public aah(MinecraftServer ☃, aag aag1, GameProfile gameProfile, aai aai1) {
/*  185 */     super(aag1, aag1.u(), aag1.v(), gameProfile);
/*  186 */     aai1.b = this;
/*  187 */     this.d = aai1;
/*      */     
/*  189 */     this.c = ☃;
/*  190 */     this.bM = ☃.ae().a(this);
/*  191 */     this.bL = ☃.ae().f(this);
/*  192 */     this.G = 1.0F;
/*      */     
/*  194 */     c(aag1);
/*      */     
/*  196 */     this.co = ☃.a(this);
/*      */   }
/*      */   private int cp; public boolean e; public int f; public boolean g;
/*      */   private void c(aag ☃) {
/*  200 */     fx fx1 = ☃.u();
/*      */ 
/*      */     
/*  203 */     if (☃.k().b() && ☃.l().aX().m() != bru.d) {
/*  204 */       int i = Math.max(0, this.c.a(☃));
/*  205 */       int j = afm.c(☃.f().b(fx1.u(), fx1.w()));
/*  206 */       if (j < i) {
/*  207 */         i = j;
/*      */       }
/*  209 */       if (j <= 1) {
/*  210 */         i = 1;
/*      */       }
/*      */       
/*  213 */       long l1 = (i * 2 + 1);
/*  214 */       long l2 = l1 * l1;
/*  215 */       int k = (l2 > 2147483647L) ? Integer.MAX_VALUE : (int)l2;
/*  216 */       int m = u(k);
/*  217 */       int n = (new Random()).nextInt(k);
/*      */       
/*  219 */       for (int i1 = 0; i1 < k; i1++) {
/*  220 */         int i2 = (n + m * i1) % k;
/*  221 */         int i3 = i2 % (i * 2 + 1);
/*  222 */         int i4 = i2 / (i * 2 + 1);
/*      */         
/*  224 */         fx fx2 = aab.a(☃, fx1.u() + i3 - i, fx1.w() + i4 - i, false);
/*      */         
/*  226 */         if (fx2 != null) {
/*  227 */           a(fx2, 0.0F, 0.0F);
/*  228 */           if (☃.k(this)) {
/*      */             break;
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } else {
/*  234 */       a(fx1, 0.0F, 0.0F);
/*  235 */       while (!☃.k(this) && cE() < 255.0D) {
/*  236 */         d(cD(), cE() + 1.0D, cH());
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private int u(int ☃) {
/*  243 */     return (☃ <= 16) ? (☃ - 1) : 17;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(md ☃) {
/*  248 */     super.a(☃);
/*      */     
/*  250 */     if (☃.c("playerGameType", 99)) {
/*  251 */       if (ch().al()) {
/*  252 */         this.d.a(ch().s(), bru.a);
/*      */       } else {
/*  254 */         this.d.a(bru.a(☃.h("playerGameType")), ☃.c("previousPlayerGameType", 3) ? bru.a(☃.h("previousPlayerGameType")) : bru.a);
/*      */       } 
/*      */     }
/*      */     
/*  258 */     if (☃.c("enteredNetherPosition", 10)) {
/*  259 */       md md1 = ☃.p("enteredNetherPosition");
/*  260 */       this.ci = new dcn(md1.k("x"), md1.k("y"), md1.k("z"));
/*      */     } 
/*      */     
/*  263 */     this.cd = ☃.q("seenCredits");
/*      */     
/*  265 */     if (☃.c("recipeBook", 10)) {
/*  266 */       this.ce.a(☃.p("recipeBook"), this.c.aF());
/*      */     }
/*      */     
/*  269 */     if (em()) {
/*  270 */       en();
/*      */     }
/*      */     
/*  273 */     if (☃.c("SpawnX", 99) && ☃.c("SpawnY", 99) && ☃.c("SpawnZ", 99)) {
/*  274 */       this.cl = new fx(☃.h("SpawnX"), ☃.h("SpawnY"), ☃.h("SpawnZ"));
/*  275 */       this.cm = ☃.q("SpawnForced");
/*  276 */       this.cn = ☃.j("SpawnAngle");
/*  277 */       if (☃.e("SpawnDimension")) {
/*  278 */         this.ck = brx.f.parse(mo.a, ☃.c("SpawnDimension")).resultOrPartial(bJ::error).orElse(brx.g);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(md ☃) {
/*  285 */     super.b(☃);
/*      */     
/*  287 */     ☃.b("playerGameType", this.d.b().a());
/*  288 */     ☃.b("previousPlayerGameType", this.d.c().a());
/*  289 */     ☃.a("seenCredits", this.cd);
/*      */     
/*  291 */     if (this.ci != null) {
/*  292 */       md md1 = new md();
/*  293 */       md1.a("x", this.ci.b);
/*  294 */       md1.a("y", this.ci.c);
/*  295 */       md1.a("z", this.ci.d);
/*  296 */       ☃.a("enteredNetherPosition", md1);
/*      */     } 
/*      */     
/*  299 */     aqa aqa1 = cr();
/*  300 */     aqa aqa2 = ct();
/*  301 */     if (aqa2 != null && aqa1 != this && aqa1.cq()) {
/*  302 */       md md1 = new md();
/*  303 */       md md2 = new md();
/*  304 */       aqa1.d(md2);
/*      */       
/*  306 */       md1.a("Attach", aqa2.bS());
/*  307 */       md1.a("Entity", md2);
/*  308 */       ☃.a("RootVehicle", md1);
/*      */     } 
/*      */     
/*  311 */     ☃.a("recipeBook", this.ce.b());
/*      */     
/*  313 */     ☃.a("Dimension", this.l.Y().a().toString());
/*      */     
/*  315 */     if (this.cl != null) {
/*  316 */       ☃.b("SpawnX", this.cl.u());
/*  317 */       ☃.b("SpawnY", this.cl.v());
/*  318 */       ☃.b("SpawnZ", this.cl.w());
/*  319 */       ☃.a("SpawnForced", this.cm);
/*  320 */       ☃.a("SpawnAngle", this.cn);
/*  321 */       vk.a.encodeStart(mo.a, this.ck.a()).resultOrPartial(bJ::error).ifPresent(mt1 -> ☃.a("SpawnDimension", mt1));
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a(int ☃) {
/*  326 */     float f1 = eH();
/*  327 */     float f2 = (f1 - 1.0F) / f1;
/*  328 */     this.bF = afm.a(☃ / f1, 0.0F, f2);
/*  329 */     this.bW = -1;
/*      */   }
/*      */   
/*      */   public void b(int ☃) {
/*  333 */     this.bD = ☃;
/*  334 */     this.bW = -1;
/*      */   }
/*      */ 
/*      */   
/*      */   public void c(int ☃) {
/*  339 */     super.c(☃);
/*  340 */     this.bW = -1;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(bmb ☃, int i) {
/*  345 */     super.a(☃, i);
/*  346 */     this.bW = -1;
/*      */   }
/*      */   
/*      */   public void f() {
/*  350 */     this.bp.a(this);
/*      */   }
/*      */ 
/*      */   
/*      */   public void g() {
/*  355 */     super.g();
/*      */     
/*  357 */     this.b.a(new qh(dv(), qh.a.a));
/*      */   }
/*      */ 
/*      */   
/*      */   public void h() {
/*  362 */     super.h();
/*      */     
/*  364 */     this.b.a(new qh(dv(), qh.a.b));
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(ceh ☃) {
/*  369 */     ac.d.a(this, ☃);
/*      */   }
/*      */ 
/*      */   
/*      */   protected bly i() {
/*  374 */     return new bmt(this);
/*      */   }
/*      */ 
/*      */   
/*      */   public void j() {
/*  379 */     this.d.a();
/*      */     
/*  381 */     this.bX--;
/*  382 */     if (this.P > 0) {
/*  383 */       this.P--;
/*      */     }
/*  385 */     this.bp.c();
/*      */     
/*  387 */     if (!this.l.v && 
/*  388 */       !this.bp.a(this)) {
/*  389 */       m();
/*  390 */       this.bp = this.bo;
/*      */     } 
/*      */ 
/*      */     
/*  394 */     while (!this.bK.isEmpty()) {
/*  395 */       int i = Math.min(this.bK.size(), 2147483647);
/*  396 */       int[] arrayOfInt = new int[i];
/*  397 */       Iterator<Integer> iterator = this.bK.iterator();
/*  398 */       int j = 0;
/*      */       
/*  400 */       while (iterator.hasNext() && j < i) {
/*  401 */         arrayOfInt[j++] = ((Integer)iterator.next()).intValue();
/*  402 */         iterator.remove();
/*      */       } 
/*      */       
/*  405 */       this.b.a(new qm(arrayOfInt));
/*      */     } 
/*      */     
/*  408 */     aqa ☃ = D();
/*  409 */     if (☃ != this) {
/*  410 */       if (☃.aX()) {
/*      */         
/*  412 */         a(☃.cD(), ☃.cE(), ☃.cH(), ☃.p, ☃.q);
/*  413 */         u().i().a(this);
/*  414 */         if (er())
/*      */         {
/*  416 */           e(this);
/*      */         }
/*      */       } else {
/*  419 */         e(this);
/*      */       } 
/*      */     }
/*      */     
/*  423 */     ac.w.a(this);
/*  424 */     if (this.cf != null) {
/*  425 */       ac.u.a(this, this.cf, this.K - this.cg);
/*      */     }
/*      */     
/*  428 */     this.bL.b(this);
/*      */   }
/*      */   
/*      */   public void v_() {
/*      */     try {
/*  433 */       if (!a_() || this.l.C(cB())) {
/*  434 */         super.j();
/*      */       }
/*      */       
/*  437 */       for (int ☃ = 0; ☃ < this.bm.Z_(); ☃++) {
/*  438 */         bmb bmb = this.bm.a(☃);
/*  439 */         if (bmb.b().ac_()) {
/*  440 */           oj<?> oj = ((bkr)bmb.b()).a(bmb, this.l, this);
/*  441 */           if (oj != null) {
/*  442 */             this.b.a(oj);
/*      */           }
/*      */         } 
/*      */       } 
/*      */       
/*  447 */       if (dk() != this.bT || this.bU != this.bq.a() || ((this.bq.e() == 0.0F)) != this.bV) {
/*  448 */         this.b.a(new rf(dk(), this.bq.a(), this.bq.e()));
/*  449 */         this.bT = dk();
/*  450 */         this.bU = this.bq.a();
/*  451 */         this.bV = (this.bq.e() == 0.0F);
/*      */       } 
/*      */       
/*  454 */       if (dk() + dT() != this.bN) {
/*  455 */         this.bN = dk() + dT();
/*  456 */         a(ddq.g, afm.f(this.bN));
/*      */       } 
/*      */       
/*  459 */       if (this.bq.a() != this.bO) {
/*  460 */         this.bO = this.bq.a();
/*  461 */         a(ddq.h, afm.f(this.bO));
/*      */       } 
/*      */       
/*  464 */       if (bI() != this.bP) {
/*  465 */         this.bP = bI();
/*  466 */         a(ddq.i, afm.f(this.bP));
/*      */       } 
/*      */       
/*  469 */       if (du() != this.bQ) {
/*  470 */         this.bQ = du();
/*  471 */         a(ddq.j, afm.f(this.bQ));
/*      */       } 
/*      */       
/*  474 */       if (this.bE != this.bS) {
/*  475 */         this.bS = this.bE;
/*  476 */         a(ddq.k, afm.f(this.bS));
/*      */       } 
/*      */       
/*  479 */       if (this.bD != this.bR) {
/*  480 */         this.bR = this.bD;
/*  481 */         a(ddq.l, afm.f(this.bR));
/*      */       } 
/*      */       
/*  484 */       if (this.bE != this.bW) {
/*  485 */         this.bW = this.bE;
/*  486 */         this.b.a(new re(this.bF, this.bE, this.bD));
/*      */       } 
/*      */       
/*  489 */       if (this.K % 20 == 0) {
/*  490 */         ac.p.a(this);
/*      */       }
/*  492 */     } catch (Throwable ☃) {
/*  493 */       l l = l.a(☃, "Ticking player");
/*  494 */       m m = l.a("Player being ticked");
/*      */       
/*  496 */       a(m);
/*      */       
/*  498 */       throw new u(l);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void a(ddq ☃, int i) {
/*  503 */     eN().a(☃, bU(), ddm1 -> ddm1.c(☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(apk ☃) {
/*  508 */     boolean bool = this.l.V().b(brt.l);
/*      */     
/*  510 */     if (bool) {
/*  511 */       nr nr = dv().b();
/*  512 */       this.b.a(new qh(dv(), qh.a.c, nr), future -> {
/*      */             if (!future.isSuccess()) {
/*      */               int i = 256;
/*      */               
/*      */               String str = ☃.a(256);
/*      */               
/*      */               nr nr1 = new of("death.attack.message_too_long", new Object[] { (new oe(str)).a(k.o) });
/*      */               nr nr2 = (new of("death.attack.even_more_magic", new Object[] { d() })).a(());
/*      */               this.b.a(new qh(dv(), qh.a.c, nr2));
/*      */             } 
/*      */           });
/*  523 */       ddp ddp = bG();
/*  524 */       if (ddp == null || ddp.k() == ddp.b.a) {
/*  525 */         this.c.ae().a(nr, no.b, x.b);
/*  526 */       } else if (ddp.k() == ddp.b.c) {
/*  527 */         this.c.ae().a(this, nr);
/*  528 */       } else if (ddp.k() == ddp.b.d) {
/*  529 */         this.c.ae().b(this, nr);
/*      */       } 
/*      */     } else {
/*  532 */       this.b.a(new qh(dv(), qh.a.c));
/*      */     } 
/*  534 */     eM();
/*  535 */     if (this.l.V().b(brt.F)) {
/*  536 */       eW();
/*      */     }
/*      */     
/*  539 */     if (!a_()) {
/*  540 */       d(☃);
/*      */     }
/*      */     
/*  543 */     eN().a(ddq.d, bU(), ddm::a);
/*      */     
/*  545 */     aqm aqm = dw();
/*  546 */     if (aqm != null) {
/*  547 */       b(aea.h.b(aqm.X()));
/*  548 */       aqm.a(this, this.aO, ☃);
/*      */       
/*  550 */       f(aqm);
/*      */     } 
/*      */     
/*  553 */     this.l.a(this, (byte)3);
/*      */     
/*  555 */     a(aea.M);
/*  556 */     a(aea.i.b(aea.l));
/*  557 */     a(aea.i.b(aea.m));
/*  558 */     am();
/*  559 */     b(0, false);
/*  560 */     dv().g();
/*      */   }
/*      */   
/*      */   private void eW() {
/*  564 */     dci ☃ = (new dci(cB())).c(32.0D, 10.0D, 32.0D);
/*  565 */     this.l.<aqn>b(aqn.class, ☃).stream()
/*  566 */       .filter(☃ -> ☃ instanceof aqs)
/*  567 */       .forEach(☃ -> ((aqs)☃).b(this));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aqa ☃, int i, apk apk1) {
/*  572 */     if (☃ == this) {
/*      */       return;
/*      */     }
/*  575 */     super.a(☃, i, apk1);
/*  576 */     t(i);
/*      */     
/*  578 */     String str1 = bU();
/*  579 */     String str2 = ☃.bU();
/*      */     
/*  581 */     eN().a(ddq.f, str1, ddm::a);
/*      */     
/*  583 */     if (☃ instanceof bfw) {
/*  584 */       a(aea.P);
/*  585 */       eN().a(ddq.e, str1, ddm::a);
/*      */     } else {
/*  587 */       a(aea.N);
/*      */     } 
/*      */     
/*  590 */     a(str1, str2, ddq.m);
/*  591 */     a(str2, str1, ddq.n);
/*      */     
/*  593 */     ac.b.a(this, ☃, apk1);
/*      */   }
/*      */   
/*      */   private void a(String ☃, String str1, ddq[] arrayOfDdq) {
/*  597 */     ddl ddl = eN().i(str1);
/*  598 */     if (ddl != null) {
/*  599 */       int i = ddl.n().b();
/*  600 */       if (i >= 0 && i < arrayOfDdq.length) {
/*  601 */         eN().a(arrayOfDdq[i], ☃, ddm::a);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(apk ☃, float f) {
/*  608 */     if (b(☃)) {
/*  609 */       return false;
/*      */     }
/*      */     
/*  612 */     boolean bool = (this.c.j() && eX() && "fall".equals(☃.v));
/*  613 */     if (!bool && this.bX > 0 && ☃ != apk.m) {
/*  614 */       return false;
/*      */     }
/*      */     
/*  617 */     if (☃ instanceof apl) {
/*  618 */       aqa aqa1 = ☃.k();
/*      */       
/*  620 */       if (aqa1 instanceof bfw && !a((bfw)aqa1)) {
/*  621 */         return false;
/*      */       }
/*  623 */       if (aqa1 instanceof bga) {
/*  624 */         bga bga = (bga)aqa1;
/*  625 */         aqa aqa2 = bga.v();
/*  626 */         if (aqa2 instanceof bfw && !a((bfw)aqa2)) {
/*  627 */           return false;
/*      */         }
/*      */       } 
/*      */     } 
/*  631 */     return super.a(☃, f);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(bfw ☃) {
/*  636 */     if (!eX()) {
/*  637 */       return false;
/*      */     }
/*  639 */     return super.a(☃);
/*      */   }
/*      */   
/*      */   private boolean eX() {
/*  643 */     return this.c.Z();
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   protected cxm a(aag ☃) {
/*  649 */     cxm cxm = super.a(☃);
/*      */     
/*  651 */     if (cxm != null && this.l.Y() == brx.g && ☃.Y() == brx.i) {
/*      */       
/*  653 */       dcn dcn1 = cxm.a.b(0.0D, -1.0D, 0.0D);
/*      */       
/*  655 */       return new cxm(dcn1, dcn.a, 90.0F, 0.0F);
/*      */     } 
/*      */     
/*  658 */     return cxm;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public aqa b(aag ☃) {
/*  664 */     this.cc = true;
/*  665 */     aag aag1 = u();
/*  666 */     vj<brx> vj1 = aag1.Y();
/*      */     
/*  668 */     if (vj1 == brx.i && ☃.Y() == brx.g) {
/*  669 */       V();
/*  670 */       u().e(this);
/*  671 */       if (!this.g) {
/*  672 */         this.g = true;
/*  673 */         this.b.a(new pq(pq.e, this.cd ? 0.0F : 1.0F));
/*  674 */         this.cd = true;
/*      */       } 
/*  676 */       return this;
/*      */     } 
/*      */ 
/*      */     
/*  680 */     cyd cyd = ☃.h();
/*  681 */     this.b.a(new qp(☃.k(), ☃.Y(), bsx.a(☃.C()), this.d.b(), this.d.c(), ☃.ab(), ☃.B(), true));
/*  682 */     this.b.a(new pa(cyd.s(), cyd.t()));
/*  683 */     acu acu = this.c.ae();
/*      */     
/*  685 */     acu.d(this);
/*      */     
/*  687 */     aag1.e(this);
/*      */     
/*  689 */     this.y = false;
/*      */     
/*  691 */     cxm cxm = a(☃);
/*  692 */     if (cxm != null) {
/*  693 */       aag1.Z().a("moving");
/*  694 */       if (vj1 == brx.g && ☃.Y() == brx.h) {
/*  695 */         this.ci = cA();
/*  696 */       } else if (☃.Y() == brx.i) {
/*  697 */         a(☃, new fx(cxm.a));
/*      */       } 
/*  699 */       aag1.Z().c();
/*      */       
/*  701 */       aag1.Z().a("placing");
/*      */       
/*  703 */       a_(☃);
/*  704 */       ☃.b(this);
/*      */       
/*  706 */       a(cxm.c, cxm.d);
/*  707 */       b(cxm.a.b, cxm.a.c, cxm.a.d);
/*  708 */       aag1.Z().c();
/*      */       
/*  710 */       d(aag1);
/*      */       
/*  712 */       this.d.a(☃);
/*  713 */       this.b.a(new qg(this.bC));
/*  714 */       acu.a(this, ☃);
/*  715 */       acu.e(this);
/*      */       
/*  717 */       for (apu apu : dh()) {
/*  718 */         this.b.a(new rv(Y(), apu));
/*      */       }
/*  720 */       this.b.a(new pu(1032, fx.b, 0, false));
/*      */       
/*  722 */       this.bW = -1;
/*  723 */       this.bT = -1.0F;
/*  724 */       this.bU = -1;
/*      */     } 
/*  726 */     return this;
/*      */   }
/*      */   
/*      */   private void a(aag ☃, fx fx1) {
/*  730 */     fx.a a = fx1.i();
/*      */     
/*  732 */     for (int i = -2; i <= 2; i++) {
/*  733 */       for (int j = -2; j <= 2; j++) {
/*  734 */         for (int k = -1; k < 3; k++) {
/*  735 */           ceh ceh = (k == -1) ? bup.bK.n() : bup.a.n();
/*  736 */           ☃.a(a.g(fx1).e(j, k, i), ceh);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Optional<i.a> a(aag ☃, fx fx1, boolean bool) {
/*  747 */     Optional<i.a> optional1 = super.a(☃, fx1, bool);
/*  748 */     if (optional1.isPresent()) {
/*  749 */       return optional1;
/*      */     }
/*      */     
/*  752 */     gc.a a = this.l.d_(this.ac).d(byj.a).orElse(gc.a.a);
/*  753 */     Optional<i.a> optional2 = ☃.m().a(fx1, a);
/*  754 */     if (!optional2.isPresent()) {
/*  755 */       bJ.error("Unable to create a portal, likely target out of worldborder");
/*      */     }
/*      */     
/*  758 */     return optional2;
/*      */   }
/*      */   
/*      */   private void d(aag ☃) {
/*  762 */     vj<brx> vj1 = ☃.Y();
/*  763 */     vj<brx> vj2 = this.l.Y();
/*  764 */     ac.v.a(this, vj1, vj2);
/*      */     
/*  766 */     if (vj1 == brx.h && vj2 == brx.g && this.ci != null) {
/*  767 */       ac.C.a(this, this.ci);
/*      */     }
/*  769 */     if (vj2 != brx.h) {
/*  770 */       this.ci = null;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(aah ☃) {
/*  776 */     if (☃.a_()) {
/*  777 */       return (D() == this);
/*      */     }
/*      */     
/*  780 */     if (a_()) {
/*  781 */       return false;
/*      */     }
/*      */     
/*  784 */     return super.a(☃);
/*      */   }
/*      */   
/*      */   private void a(ccj ☃) {
/*  788 */     if (☃ != null) {
/*  789 */       ow ow = ☃.a();
/*  790 */       if (ow != null) {
/*  791 */         this.b.a(ow);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aqa ☃, int i) {
/*  798 */     super.a(☃, i);
/*  799 */     this.bp.c();
/*      */   }
/*      */ 
/*      */   
/*      */   public Either<bfw.a, afx> a(fx ☃) {
/*  804 */     gc gc = (gc)this.l.d_(☃).c(bxm.aq);
/*  805 */     if (em() || !aX()) {
/*  806 */       return Either.left(bfw.a.e);
/*      */     }
/*      */     
/*  809 */     if (!this.l.k().e())
/*      */     {
/*  811 */       return Either.left(bfw.a.a);
/*      */     }
/*      */     
/*  814 */     if (!a(☃, gc)) {
/*  815 */       return Either.left(bfw.a.c);
/*      */     }
/*      */     
/*  818 */     if (b(☃, gc)) {
/*  819 */       return Either.left(bfw.a.d);
/*      */     }
/*      */ 
/*      */     
/*  823 */     a(this.l.Y(), ☃, this.p, false, true);
/*  824 */     if (this.l.M()) {
/*  825 */       return Either.left(bfw.a.b);
/*      */     }
/*      */     
/*  828 */     if (!b_()) {
/*  829 */       double d1 = 8.0D;
/*  830 */       double d2 = 5.0D;
/*  831 */       dcn dcn1 = dcn.c(☃);
/*  832 */       List<bdq> list = this.l.a(bdq.class, new dci(dcn1.a() - 8.0D, dcn1.b() - 5.0D, dcn1.c() - 8.0D, dcn1.a() + 8.0D, dcn1.b() + 5.0D, dcn1.c() + 8.0D), ☃ -> ☃.f(this));
/*  833 */       if (!list.isEmpty()) {
/*  834 */         return Either.left(bfw.a.f);
/*      */       }
/*      */     } 
/*      */     
/*  838 */     Either<bfw.a, afx> either = super.a(☃).ifRight(☃ -> {
/*      */           a(aea.ao);
/*      */           ac.q.a(this);
/*      */         });
/*  842 */     ((aag)this.l).n_();
/*  843 */     return either;
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(fx ☃) {
/*  848 */     a(aea.i.b(aea.m));
/*  849 */     super.b(☃);
/*      */   }
/*      */   
/*      */   private boolean a(fx ☃, gc gc1) {
/*  853 */     return (g(☃) || g(☃.a(gc1.f())));
/*      */   }
/*      */   
/*      */   private boolean g(fx ☃) {
/*  857 */     dcn dcn1 = dcn.c(☃);
/*  858 */     return (Math.abs(cD() - dcn1.a()) <= 3.0D && Math.abs(cE() - dcn1.b()) <= 2.0D && Math.abs(cH() - dcn1.c()) <= 3.0D);
/*      */   }
/*      */   
/*      */   private boolean b(fx ☃, gc gc1) {
/*  862 */     fx fx1 = ☃.b();
/*  863 */     return (!f(fx1) || !f(fx1.a(gc1.f())));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(boolean ☃, boolean bool1) {
/*  868 */     if (em()) {
/*  869 */       u().i().a(this, new os(this, 2));
/*      */     }
/*  871 */     super.a(☃, bool1);
/*  872 */     if (this.b != null) {
/*  873 */       this.b.a(cD(), cE(), cH(), this.p, this.q);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(aqa ☃, boolean bool) {
/*  879 */     aqa aqa1 = ct();
/*      */     
/*  881 */     if (!super.a(☃, bool)) {
/*  882 */       return false;
/*      */     }
/*      */     
/*  885 */     aqa aqa2 = ct();
/*  886 */     if (aqa2 != aqa1 && this.b != null) {
/*  887 */       this.b.a(cD(), cE(), cH(), this.p, this.q);
/*      */     }
/*      */     
/*  890 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public void l() {
/*  895 */     aqa ☃ = ct();
/*  896 */     super.l();
/*      */     
/*  898 */     aqa aqa1 = ct();
/*  899 */     if (aqa1 != ☃ && this.b != null) {
/*  900 */       this.b.a(cD(), cE(), cH(), this.p, this.q);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean b(apk ☃) {
/*  906 */     return (super.b(☃) || H() || (this.bC.a && ☃ == apk.p));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void a(double ☃, boolean bool, ceh ceh1, fx fx1) {}
/*      */ 
/*      */ 
/*      */   
/*      */   protected void c(fx ☃) {
/*  916 */     if (!a_()) {
/*  917 */       super.c(☃);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(double ☃, boolean bool) {
/*  922 */     fx fx1 = ap();
/*  923 */     if (!this.l.C(fx1)) {
/*      */       return;
/*      */     }
/*  926 */     super.a(☃, bool, this.l.d_(fx1), fx1);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(cdf ☃) {
/*  931 */     ☃.a(this);
/*  932 */     this.b.a(new qe(☃.o()));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void eY() {
/*  941 */     this.cp = this.cp % 100 + 1;
/*      */   }
/*      */ 
/*      */   
/*      */   public OptionalInt a(@Nullable aox ☃) {
/*  946 */     if (☃ == null) {
/*  947 */       return OptionalInt.empty();
/*      */     }
/*      */     
/*  950 */     if (this.bp != this.bo) {
/*  951 */       m();
/*      */     }
/*      */     
/*  954 */     eY();
/*      */     
/*  956 */     bic bic = ☃.createMenu(this.cp, this.bm, this);
/*  957 */     if (bic == null) {
/*  958 */       if (a_()) {
/*  959 */         a((new of("container.spectatorCantOpen")).a(k.m), true);
/*      */       }
/*  961 */       return OptionalInt.empty();
/*      */     } 
/*  963 */     this.b.a(new qd(bic.b, bic.a(), ☃.d()));
/*  964 */     bic.a(this);
/*  965 */     this.bp = bic;
/*  966 */     return OptionalInt.of(this.cp);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(int ☃, bqw bqw1, int i, int j, boolean bool1, boolean bool2) {
/*  971 */     this.b.a(new pz(☃, bqw1, i, j, bool1, bool2));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(bbb ☃, aon aon1) {
/*  976 */     if (this.bp != this.bo) {
/*  977 */       m();
/*      */     }
/*  979 */     eY();
/*  980 */     this.b.a(new pr(this.cp, aon1.Z_(), ☃.Y()));
/*  981 */     this.bp = new biy(this.cp, this.bm, aon1, ☃);
/*  982 */     this.bp.a(this);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(bmb ☃, aot aot1) {
/*  987 */     blx blx = ☃.b();
/*      */     
/*  989 */     if (blx == bmd.oU) {
/*      */ 
/*      */       
/*  992 */       if (bns.a(☃, cw(), this)) {
/*  993 */         this.bp.c();
/*      */       }
/*      */       
/*  996 */       this.b.a(new qc(aot1));
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(cco ☃) {
/* 1002 */     ☃.c(true);
/* 1003 */     a(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(bic ☃, int i, bmb bmb1) {
/* 1008 */     if (☃.a(i) instanceof bjn) {
/*      */       return;
/*      */     }
/*      */     
/* 1012 */     if (☃ == this.bo) {
/* 1013 */       ac.e.a(this, this.bm, bmb1);
/*      */     }
/*      */     
/* 1016 */     if (this.e) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1024 */     this.b.a(new pi(☃.b, i, bmb1));
/*      */   }
/*      */   
/*      */   public void a(bic ☃) {
/* 1028 */     a(☃, ☃.b());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(bic ☃, gj<bmb> gj1) {
/* 1033 */     this.b.a(new pg(☃.b, gj1));
/* 1034 */     this.b.a(new pi(-1, -1, this.bm.m()));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(bic ☃, int i, int j) {
/* 1039 */     this.b.a(new ph(☃.b, i, j));
/*      */   }
/*      */ 
/*      */   
/*      */   public void m() {
/* 1044 */     this.b.a(new pf(this.bp.b));
/* 1045 */     o();
/*      */   }
/*      */   
/*      */   public void n() {
/* 1049 */     if (this.e) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1056 */     this.b.a(new pi(-1, -1, this.bm.m()));
/*      */   }
/*      */   
/*      */   public void o() {
/* 1060 */     this.bp.b(this);
/* 1061 */     this.bp = this.bo;
/*      */   }
/*      */   
/*      */   public void a(float ☃, float f1, boolean bool1, boolean bool2) {
/* 1065 */     if (br()) {
/* 1066 */       if (☃ >= -1.0F && ☃ <= 1.0F) {
/* 1067 */         this.aR = ☃;
/*      */       }
/* 1069 */       if (f1 >= -1.0F && f1 <= 1.0F) {
/* 1070 */         this.aT = f1;
/*      */       }
/* 1072 */       this.aQ = bool1;
/* 1073 */       f(bool2);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(adx<?> ☃, int i) {
/* 1079 */     this.bM.b(this, ☃, i);
/* 1080 */     eN().a(☃, bU(), ddm1 -> ddm1.a(☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(adx<?> ☃) {
/* 1085 */     this.bM.a(this, ☃, 0);
/* 1086 */     eN().a(☃, bU(), ddm::c);
/*      */   }
/*      */ 
/*      */   
/*      */   public int a(Collection<boq<?>> ☃) {
/* 1091 */     return this.ce.a(☃, this);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(vk[] ☃) {
/* 1096 */     List<boq<?>> list = Lists.newArrayList();
/* 1097 */     for (vk vk1 : ☃) {
/* 1098 */       this.c.aF().a(vk1).ifPresent(list::add);
/*      */     }
/*      */     
/* 1101 */     a(list);
/*      */   }
/*      */ 
/*      */   
/*      */   public int b(Collection<boq<?>> ☃) {
/* 1106 */     return this.ce.b(☃, this);
/*      */   }
/*      */ 
/*      */   
/*      */   public void d(int ☃) {
/* 1111 */     super.d(☃);
/* 1112 */     this.bW = -1;
/*      */   }
/*      */   
/*      */   public void p() {
/* 1116 */     this.ch = true;
/* 1117 */     be();
/* 1118 */     if (em()) {
/* 1119 */       a(true, false);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean q() {
/* 1124 */     return this.ch;
/*      */   }
/*      */   
/*      */   public void r() {
/* 1128 */     this.bT = -1.0E8F;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(nr ☃, boolean bool) {
/* 1133 */     this.b.a(new pb(☃, bool ? no.c : no.a, x.b));
/*      */   }
/*      */ 
/*      */   
/*      */   protected void s() {
/* 1138 */     if (!this.bc.a() && dW()) {
/* 1139 */       this.b.a(new pn(this, (byte)9));
/* 1140 */       super.s();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(dj.a ☃, dcn dcn1) {
/* 1146 */     super.a(☃, dcn1);
/* 1147 */     this.b.a(new qj(☃, dcn1.b, dcn1.c, dcn1.d));
/*      */   }
/*      */   
/*      */   public void a(dj.a ☃, aqa aqa1, dj.a a1) {
/* 1151 */     dcn dcn1 = a1.a(aqa1);
/* 1152 */     super.a(☃, dcn1);
/* 1153 */     this.b.a(new qj(☃, aqa1, a1));
/*      */   }
/*      */   
/*      */   public void a(aah ☃, boolean bool) {
/* 1157 */     if (bool) {
/* 1158 */       this.bm.a(☃.bm);
/*      */       
/* 1160 */       c(☃.dk());
/* 1161 */       this.bq = ☃.bq;
/*      */       
/* 1163 */       this.bD = ☃.bD;
/* 1164 */       this.bE = ☃.bE;
/* 1165 */       this.bF = ☃.bF;
/*      */       
/* 1167 */       s(☃.ev());
/* 1168 */       this.ac = ☃.ac;
/* 1169 */     } else if (this.l.V().b(brt.c) || ☃.a_()) {
/* 1170 */       this.bm.a(☃.bm);
/*      */       
/* 1172 */       this.bD = ☃.bD;
/* 1173 */       this.bE = ☃.bE;
/* 1174 */       this.bF = ☃.bF;
/* 1175 */       s(☃.ev());
/*      */     } 
/*      */     
/* 1178 */     this.bG = ☃.bG;
/* 1179 */     this.bn = ☃.bn;
/* 1180 */     ab().b(bi, ☃.ab().a(bi));
/* 1181 */     this.bW = -1;
/* 1182 */     this.bT = -1.0F;
/* 1183 */     this.bU = -1;
/* 1184 */     this.ce.a(☃.ce);
/* 1185 */     this.bK.addAll(☃.bK);
/* 1186 */     this.cd = ☃.cd;
/* 1187 */     this.ci = ☃.ci;
/*      */     
/* 1189 */     h(☃.eP());
/* 1190 */     i(☃.eQ());
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(apu ☃) {
/* 1195 */     super.a(☃);
/* 1196 */     this.b.a(new rv(Y(), ☃));
/*      */     
/* 1198 */     if (☃.a() == apw.y) {
/* 1199 */       this.cg = this.K;
/* 1200 */       this.cf = cA();
/*      */     } 
/*      */     
/* 1203 */     ac.A.a(this);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(apu ☃, boolean bool) {
/* 1208 */     super.a(☃, bool);
/* 1209 */     this.b.a(new rv(Y(), ☃));
/*      */     
/* 1211 */     ac.A.a(this);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void b(apu ☃) {
/* 1216 */     super.b(☃);
/* 1217 */     this.b.a(new qn(Y(), ☃.a()));
/*      */     
/* 1219 */     if (☃.a() == apw.y) {
/* 1220 */       this.cf = null;
/*      */     }
/*      */     
/* 1223 */     ac.A.a(this);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(double ☃, double d1, double d2) {
/* 1228 */     this.b.a(☃, d1, d2, this.p, this.q);
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(double ☃, double d1, double d2) {
/* 1233 */     a(☃, d1, d2);
/* 1234 */     this.b.c();
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aqa ☃) {
/* 1239 */     u().i().a(this, new os(☃, 4));
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(aqa ☃) {
/* 1244 */     u().i().a(this, new os(☃, 5));
/*      */   }
/*      */ 
/*      */   
/*      */   public void t() {
/* 1249 */     if (this.b == null) {
/*      */       return;
/*      */     }
/* 1252 */     this.b.a(new qg(this.bC));
/* 1253 */     C();
/*      */   }
/*      */   
/*      */   public aag u() {
/* 1257 */     return (aag)this.l;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(bru ☃) {
/* 1262 */     this.d.a(☃);
/* 1263 */     this.b.a(new pq(pq.d, ☃.a()));
/*      */     
/* 1265 */     if (☃ == bru.e) {
/* 1266 */       eM();
/* 1267 */       l();
/*      */     } else {
/* 1269 */       e(this);
/*      */     } 
/*      */     
/* 1272 */     t();
/* 1273 */     dU();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a_() {
/* 1278 */     return (this.d.b() == bru.e);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean b_() {
/* 1283 */     return (this.d.b() == bru.c);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(nr ☃, UUID uUID) {
/* 1288 */     a(☃, no.b, uUID);
/*      */   }
/*      */   
/*      */   public void a(nr ☃, no no1, UUID uUID) {
/* 1292 */     this.b.a(new pb(☃, no1, uUID), future -> {
/*      */           if (!future.isSuccess() && (☃ == no.c || ☃ == no.b)) {
/*      */             int i = 256;
/*      */             String str = nr1.a(256);
/*      */             nr nr2 = (new oe(str)).a(k.o);
/*      */             this.b.a(new pb((new of("multiplayer.message_not_delivered", new Object[] { nr2 })).a(k.m), no.b, uUID));
/*      */           } 
/*      */         });
/*      */   }
/*      */ 
/*      */   
/*      */   public String v() {
/* 1304 */     String ☃ = this.b.a.c().toString();
/* 1305 */     ☃ = ☃.substring(☃.indexOf("/") + 1);
/* 1306 */     ☃ = ☃.substring(0, ☃.indexOf(":"));
/* 1307 */     return ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(sg ☃) {
/* 1312 */     this.bY = ☃.d();
/* 1313 */     this.bZ = ☃.e();
/*      */     
/* 1315 */     ab().b(bi, Byte.valueOf((byte)☃.f()));
/* 1316 */     ab().b(bj, Byte.valueOf((byte)((☃.g() == aqi.a) ? 0 : 1)));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public bfu x() {
/* 1324 */     return this.bY;
/*      */   }
/*      */   
/*      */   public void a(String ☃, String str1) {
/* 1328 */     this.b.a(new qo(☃, str1));
/*      */   }
/*      */ 
/*      */   
/*      */   protected int y() {
/* 1333 */     return this.c.b(eA());
/*      */   }
/*      */   
/*      */   public void z() {
/* 1337 */     this.ca = x.b();
/*      */   }
/*      */   
/*      */   public adw A() {
/* 1341 */     return this.bM;
/*      */   }
/*      */   
/*      */   public adv B() {
/* 1345 */     return this.ce;
/*      */   }
/*      */   
/*      */   public void c(aqa ☃) {
/* 1349 */     if (☃ instanceof bfw) {
/* 1350 */       this.b.a(new qm(new int[] { ☃.Y() }));
/*      */     } else {
/* 1352 */       this.bK.add(Integer.valueOf(☃.Y()));
/*      */     } 
/*      */   }
/*      */   
/*      */   public void d(aqa ☃) {
/* 1357 */     this.bK.remove(Integer.valueOf(☃.Y()));
/*      */   }
/*      */ 
/*      */   
/*      */   protected void C() {
/* 1362 */     if (a_()) {
/* 1363 */       df();
/* 1364 */       j(true);
/*      */     } else {
/* 1366 */       super.C();
/*      */     } 
/*      */   }
/*      */   
/*      */   public aqa D() {
/* 1371 */     return (this.cb == null) ? this : this.cb;
/*      */   }
/*      */   
/*      */   public void e(aqa ☃) {
/* 1375 */     aqa aqa1 = D();
/* 1376 */     this.cb = (☃ == null) ? this : ☃;
/*      */     
/* 1378 */     if (aqa1 != this.cb) {
/* 1379 */       this.b.a(new qu(this.cb));
/* 1380 */       a(this.cb.cD(), this.cb.cE(), this.cb.cH());
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void E() {
/* 1386 */     if (!this.cc) {
/* 1387 */       super.E();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void f(aqa ☃) {
/* 1393 */     if (this.d.b() == bru.e) {
/* 1394 */       e(☃);
/*      */     } else {
/* 1396 */       super.f(☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   public long F() {
/* 1401 */     return this.ca;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public nr G() {
/* 1406 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aot ☃) {
/* 1411 */     super.a(☃);
/* 1412 */     eS();
/*      */   }
/*      */   
/*      */   public boolean H() {
/* 1416 */     return this.cc;
/*      */   }
/*      */   
/*      */   public void I() {
/* 1420 */     this.cc = false;
/*      */   }
/*      */   
/*      */   public vt J() {
/* 1424 */     return this.bL;
/*      */   }
/*      */   
/*      */   public void a(aag ☃, double d1, double d2, double d3, float f1, float f2) {
/* 1428 */     e(this);
/* 1429 */     l();
/* 1430 */     if (☃ == this.l) {
/* 1431 */       this.b.a(d1, d2, d3, f1, f2);
/*      */     } else {
/* 1433 */       aag aag1 = u();
/*      */       
/* 1435 */       cyd cyd = ☃.h();
/* 1436 */       this.b.a(new qp(☃.k(), ☃.Y(), bsx.a(☃.C()), this.d.b(), this.d.c(), ☃.ab(), ☃.B(), true));
/* 1437 */       this.b.a(new pa(cyd.s(), cyd.t()));
/* 1438 */       this.c.ae().d(this);
/*      */       
/* 1440 */       aag1.e(this);
/*      */       
/* 1442 */       this.y = false;
/*      */       
/* 1444 */       b(d1, d2, d3, f1, f2);
/*      */       
/* 1446 */       a_(☃);
/* 1447 */       ☃.a(this);
/*      */       
/* 1449 */       d(aag1);
/*      */       
/* 1451 */       this.b.a(d1, d2, d3, f1, f2);
/* 1452 */       this.d.a(☃);
/* 1453 */       this.c.ae().a(this, ☃);
/* 1454 */       this.c.ae().e(this);
/*      */     } 
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public fx K() {
/* 1460 */     return this.cl;
/*      */   }
/*      */   
/*      */   public float L() {
/* 1464 */     return this.cn;
/*      */   }
/*      */   
/*      */   public vj<brx> M() {
/* 1468 */     return this.ck;
/*      */   }
/*      */   
/*      */   public boolean N() {
/* 1472 */     return this.cm;
/*      */   }
/*      */   
/*      */   public void a(vj<brx> ☃, @Nullable fx fx1, float f, boolean bool1, boolean bool2) {
/* 1476 */     if (fx1 != null) {
/* 1477 */       boolean bool = (fx1.equals(this.cl) && ☃.equals(this.ck));
/* 1478 */       if (bool2 && !bool) {
/* 1479 */         a(new of("block.minecraft.set_spawn"), x.b);
/*      */       }
/* 1481 */       this.cl = fx1;
/* 1482 */       this.ck = ☃;
/* 1483 */       this.cn = f;
/* 1484 */       this.cm = bool1;
/*      */     } else {
/* 1486 */       this.cl = null;
/* 1487 */       this.ck = brx.g;
/* 1488 */       this.cn = 0.0F;
/* 1489 */       this.cm = false;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(brd ☃, oj<?> oj1, oj<?> oj2) {
/* 1497 */     this.b.a(oj2);
/* 1498 */     this.b.a(oj1);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(brd ☃) {
/* 1503 */     if (aX()) {
/* 1504 */       this.b.a(new pp(☃.b, ☃.c));
/*      */     }
/*      */   }
/*      */   
/*      */   public gp O() {
/* 1509 */     return this.cj;
/*      */   }
/*      */   
/*      */   public void a(gp ☃) {
/* 1513 */     this.cj = ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(adp ☃, adr adr1, float f1, float f2) {
/* 1518 */     this.b.a(new rn(☃, adr1, cD(), cE(), cH(), f1, f2));
/*      */   }
/*      */ 
/*      */   
/*      */   public oj<?> P() {
/* 1523 */     return new or(this);
/*      */   }
/*      */ 
/*      */   
/*      */   public bcv a(bmb ☃, boolean bool1, boolean bool2) {
/* 1528 */     bcv bcv = super.a(☃, bool1, bool2);
/* 1529 */     if (bcv == null) {
/* 1530 */       return null;
/*      */     }
/*      */     
/* 1533 */     this.l.c(bcv);
/* 1534 */     bmb bmb1 = bcv.g();
/* 1535 */     if (bool2) {
/* 1536 */       if (!bmb1.a()) {
/* 1537 */         a(aea.f.b(bmb1.b()), ☃.E());
/*      */       }
/* 1539 */       a(aea.E);
/*      */     } 
/*      */     
/* 1542 */     return bcv;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public abc Q() {
/* 1547 */     return this.co;
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aah.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */