/*      */ import com.google.common.collect.Lists;
/*      */ import com.google.common.primitives.Doubles;
/*      */ import com.google.common.primitives.Floats;
/*      */ import com.mojang.brigadier.ParseResults;
/*      */ import com.mojang.brigadier.StringReader;
/*      */ import com.mojang.brigadier.suggestion.Suggestions;
/*      */ import io.netty.util.concurrent.Future;
/*      */ import io.netty.util.concurrent.GenericFutureListener;
/*      */ import it.unimi.dsi.fastutil.ints.Int2ShortMap;
/*      */ import it.unimi.dsi.fastutil.ints.Int2ShortOpenHashMap;
/*      */ import java.util.Collections;
/*      */ import java.util.List;
/*      */ import java.util.Optional;
/*      */ import java.util.Set;
/*      */ import java.util.concurrent.CompletableFuture;
/*      */ import java.util.concurrent.Executor;
/*      */ import java.util.function.BiFunction;
/*      */ import java.util.function.Consumer;
/*      */ import java.util.stream.Collectors;
/*      */ import java.util.stream.Stream;
/*      */ import javax.annotation.Nullable;
/*      */ import net.minecraft.server.MinecraftServer;
/*      */ import org.apache.commons.lang3.StringUtils;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class aay
/*      */   implements sa
/*      */ {
/*  163 */   private static final Logger c = LogManager.getLogger();
/*      */   
/*      */   public final nd a;
/*      */   
/*      */   private final MinecraftServer d;
/*      */   
/*      */   public aah b;
/*      */   
/*      */   private int e;
/*      */   private long f;
/*      */   private boolean g;
/*      */   private long h;
/*      */   private int i;
/*      */   private int j;
/*  177 */   private final Int2ShortMap k = (Int2ShortMap)new Int2ShortOpenHashMap();
/*      */   private double l;
/*      */   private double m;
/*      */   private double n;
/*      */   private double o;
/*      */   private double p;
/*      */   private double q;
/*      */   private aqa r;
/*      */   private double s;
/*      */   private double t;
/*      */   private double u;
/*      */   private double v;
/*      */   private double w;
/*      */   private double x;
/*      */   private dcn y;
/*      */   private int z;
/*      */   private int A;
/*      */   private boolean B;
/*      */   private int C;
/*      */   private boolean D;
/*      */   private int E;
/*      */   private int F;
/*      */   private int G;
/*      */   
/*      */   public aay(MinecraftServer ☃, nd nd1, aah aah1) {
/*  202 */     this.d = ☃;
/*  203 */     this.a = nd1;
/*  204 */     nd1.a(this);
/*  205 */     this.b = aah1;
/*  206 */     aah1.b = this;
/*      */     
/*  208 */     abc abc = aah1.Q();
/*  209 */     if (abc != null) {
/*  210 */       abc.a();
/*      */     }
/*      */   }
/*      */   
/*      */   public void b() {
/*  215 */     c();
/*  216 */     this.b.m = this.b.cD();
/*  217 */     this.b.n = this.b.cE();
/*  218 */     this.b.o = this.b.cH();
/*  219 */     this.b.v_();
/*  220 */     this.b.a(this.l, this.m, this.n, this.b.p, this.b.q);
/*  221 */     this.e++;
/*  222 */     this.G = this.F;
/*      */     
/*  224 */     if (this.B && !this.b.em()) {
/*  225 */       if (++this.C > 80) {
/*  226 */         c.warn("{} was kicked for floating too long!", this.b.R().getString());
/*  227 */         b(new of("multiplayer.disconnect.flying"));
/*      */         return;
/*      */       } 
/*      */     } else {
/*  231 */       this.B = false;
/*  232 */       this.C = 0;
/*      */     } 
/*      */     
/*  235 */     this.r = this.b.cr();
/*  236 */     if (this.r == this.b || this.r.cm() != this.b) {
/*  237 */       this.r = null;
/*  238 */       this.D = false;
/*  239 */       this.E = 0;
/*      */     } else {
/*  241 */       this.s = this.r.cD();
/*  242 */       this.t = this.r.cE();
/*  243 */       this.u = this.r.cH();
/*  244 */       this.v = this.r.cD();
/*  245 */       this.w = this.r.cE();
/*  246 */       this.x = this.r.cH();
/*  247 */       if (this.D && this.b.cr().cm() == this.b) {
/*  248 */         if (++this.E > 80) {
/*  249 */           c.warn("{} was kicked for floating a vehicle too long!", this.b.R().getString());
/*  250 */           b(new of("multiplayer.disconnect.flying"));
/*      */           return;
/*      */         } 
/*      */       } else {
/*  254 */         this.D = false;
/*  255 */         this.E = 0;
/*      */       } 
/*      */     } 
/*      */     
/*  259 */     this.d.aQ().a("keepAlive");
/*  260 */     long ☃ = x.b();
/*  261 */     if (☃ - this.f >= 15000L) {
/*  262 */       if (this.g) {
/*  263 */         b(new of("disconnect.timeout"));
/*      */       } else {
/*  265 */         this.g = true;
/*  266 */         this.f = ☃;
/*  267 */         this.h = ☃;
/*  268 */         a(new ps(this.h));
/*      */       } 
/*      */     }
/*  271 */     this.d.aQ().c();
/*      */     
/*  273 */     if (this.i > 0) {
/*  274 */       this.i--;
/*      */     }
/*  276 */     if (this.j > 0) {
/*  277 */       this.j--;
/*      */     }
/*      */     
/*  280 */     if (this.b.F() > 0L && this.d.ao() > 0 && x.b() - this.b.F() > (this.d.ao() * 1000 * 60)) {
/*  281 */       b(new of("multiplayer.disconnect.idling"));
/*      */     }
/*      */   }
/*      */   
/*      */   public void c() {
/*  286 */     this.l = this.b.cD();
/*  287 */     this.m = this.b.cE();
/*  288 */     this.n = this.b.cH();
/*  289 */     this.o = this.b.cD();
/*  290 */     this.p = this.b.cE();
/*  291 */     this.q = this.b.cH();
/*      */   }
/*      */ 
/*      */   
/*      */   public nd a() {
/*  296 */     return this.a;
/*      */   }
/*      */   
/*      */   private boolean d() {
/*  300 */     return this.d.a(this.b.eA());
/*      */   }
/*      */   
/*      */   public void b(nr ☃) {
/*  304 */     this.a.a(new pm(☃), future -> this.a.a(☃));
/*  305 */     this.a.l();
/*  306 */     this.d.g(this.a::m);
/*      */   }
/*      */   
/*      */   private <T> void a(T ☃, Consumer<T> consumer, BiFunction<abc, T, CompletableFuture<Optional<T>>> biFunction) {
/*  310 */     MinecraftServer minecraftServer = this.b.u().l();
/*      */     
/*  312 */     Consumer<T> consumer1 = object -> {
/*      */         if (a().h()) {
/*      */           ☃.accept(object);
/*      */         } else {
/*      */           c.debug("Ignoring packet due to disconnection");
/*      */         } 
/*      */       };
/*      */     
/*  320 */     abc abc = this.b.Q();
/*  321 */     if (abc != null) {
/*  322 */       ((CompletableFuture)biFunction.apply(abc, ☃)).thenAcceptAsync(optional -> optional.ifPresent(☃), (Executor)minecraftServer);
/*      */     } else {
/*  324 */       minecraftServer.execute(() -> ☃.accept(object));
/*      */     } 
/*      */   }
/*      */   
/*      */   private void a(String ☃, Consumer<String> consumer) {
/*  329 */     a(☃, consumer, abc::a);
/*      */   }
/*      */   
/*      */   private void a(List<String> ☃, Consumer<List<String>> consumer) {
/*  333 */     a(☃, consumer, abc::a);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(tb ☃) {
/*  338 */     ol.a(☃, this, this.b.u());
/*  339 */     this.b.a(☃.b(), ☃.c(), ☃.d(), ☃.e());
/*      */   }
/*      */   
/*      */   private static boolean b(st ☃) {
/*  343 */     if (!Doubles.isFinite(☃.a(0.0D)) || !Doubles.isFinite(☃.b(0.0D)) || !Doubles.isFinite(☃.c(0.0D)) || !Floats.isFinite(☃.b(0.0F)) || !Floats.isFinite(☃.a(0.0F))) {
/*  344 */       return true;
/*      */     }
/*  346 */     if (Math.abs(☃.a(0.0D)) > 3.0E7D || Math.abs(☃.b(0.0D)) > 3.0E7D || Math.abs(☃.c(0.0D)) > 3.0E7D) {
/*  347 */       return true;
/*      */     }
/*  349 */     return false;
/*      */   }
/*      */   
/*      */   private static boolean b(su ☃) {
/*  353 */     return (!Doubles.isFinite(☃.b()) || !Doubles.isFinite(☃.c()) || !Doubles.isFinite(☃.d()) || !Floats.isFinite(☃.f()) || !Floats.isFinite(☃.e()));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(su ☃) {
/*  358 */     ol.a(☃, this, this.b.u());
/*  359 */     if (b(☃)) {
/*  360 */       b(new of("multiplayer.disconnect.invalid_vehicle_movement"));
/*      */       
/*      */       return;
/*      */     } 
/*  364 */     aqa aqa1 = this.b.cr();
/*  365 */     if (aqa1 != this.b && aqa1.cm() == this.b && aqa1 == this.r) {
/*  366 */       aag aag = this.b.u();
/*  367 */       double d1 = aqa1.cD();
/*  368 */       double d2 = aqa1.cE();
/*  369 */       double d3 = aqa1.cH();
/*      */       
/*  371 */       double d4 = ☃.b();
/*  372 */       double d5 = ☃.c();
/*  373 */       double d6 = ☃.d();
/*      */       
/*  375 */       float f1 = ☃.e();
/*  376 */       float f2 = ☃.f();
/*      */       
/*  378 */       double d7 = d4 - this.s;
/*  379 */       double d8 = d5 - this.t;
/*  380 */       double d9 = d6 - this.u;
/*      */       
/*  382 */       double d10 = aqa1.cC().g();
/*  383 */       double d11 = d7 * d7 + d8 * d8 + d9 * d9;
/*      */       
/*  385 */       if (d11 - d10 > 100.0D && !d()) {
/*  386 */         c.warn("{} (vehicle of {}) moved too quickly! {},{},{}", aqa1.R().getString(), this.b.R().getString(), Double.valueOf(d7), Double.valueOf(d8), Double.valueOf(d9));
/*  387 */         this.a.a(new qb(aqa1));
/*      */         
/*      */         return;
/*      */       } 
/*  391 */       boolean bool1 = aag.a_(aqa1, aqa1.cc().h(0.0625D));
/*      */ 
/*      */       
/*  394 */       d7 = d4 - this.v;
/*  395 */       d8 = d5 - this.w - 1.0E-6D;
/*  396 */       d9 = d6 - this.x;
/*      */       
/*  398 */       aqa1.a(aqr.b, new dcn(d7, d8, d9));
/*      */       
/*  400 */       double d12 = d8;
/*      */       
/*  402 */       d7 = d4 - aqa1.cD();
/*  403 */       d8 = d5 - aqa1.cE();
/*  404 */       if (d8 > -0.5D || d8 < 0.5D) {
/*  405 */         d8 = 0.0D;
/*      */       }
/*  407 */       d9 = d6 - aqa1.cH();
/*  408 */       d11 = d7 * d7 + d8 * d8 + d9 * d9;
/*  409 */       boolean bool2 = false;
/*  410 */       if (d11 > 0.0625D) {
/*  411 */         bool2 = true;
/*  412 */         c.warn("{} (vehicle of {}) moved wrongly! {}", aqa1.R().getString(), this.b.R().getString(), Double.valueOf(Math.sqrt(d11)));
/*      */       } 
/*  414 */       aqa1.a(d4, d5, d6, f1, f2);
/*      */       
/*  416 */       boolean bool3 = aag.a_(aqa1, aqa1.cc().h(0.0625D));
/*  417 */       if (bool1 && (bool2 || !bool3)) {
/*  418 */         aqa1.a(d1, d2, d3, f1, f2);
/*  419 */         this.a.a(new qb(aqa1));
/*      */         
/*      */         return;
/*      */       } 
/*  423 */       this.b.u().i().a(this.b);
/*  424 */       this.b.p(this.b.cD() - d1, this.b.cE() - d2, this.b.cH() - d3);
/*  425 */       this.D = (d12 >= -0.03125D && !this.d.aa() && a(aqa1));
/*      */       
/*  427 */       this.v = aqa1.cD();
/*  428 */       this.w = aqa1.cE();
/*  429 */       this.x = aqa1.cH();
/*      */     } 
/*      */   }
/*      */   
/*      */   private boolean a(aqa ☃) {
/*  434 */     return ☃.l.a(☃.cc().g(0.0625D).b(0.0D, -0.55D, 0.0D)).allMatch(ceg.a::g);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(sb ☃) {
/*  439 */     ol.a(☃, this, this.b.u());
/*  440 */     if (☃.b() == this.z) {
/*  441 */       this.b.a(this.y.b, this.y.c, this.y.d, this.b.p, this.b.q);
/*      */       
/*  443 */       this.o = this.y.b;
/*  444 */       this.p = this.y.c;
/*  445 */       this.q = this.y.d;
/*  446 */       if (this.b.H()) {
/*  447 */         this.b.I();
/*      */       }
/*      */       
/*  450 */       this.y = null;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(td ☃) {
/*  456 */     ol.a(☃, this, this.b.u());
/*  457 */     this.d.aF().a(☃.b()).ifPresent(this.b.B()::e);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(tc ☃) {
/*  462 */     ol.a(☃, this, this.b.u());
/*  463 */     this.b.B().a(☃.b(), ☃.c(), ☃.d());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(tg ☃) {
/*  468 */     ol.a(☃, this, this.b.u());
/*  469 */     if (☃.c() == tg.a.a) {
/*  470 */       vk vk = ☃.d();
/*  471 */       y y = this.d.aA().a(vk);
/*  472 */       if (y != null) {
/*  473 */         this.b.J().a(y);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(sh ☃) {
/*  480 */     ol.a(☃, this, this.b.u());
/*  481 */     StringReader stringReader = new StringReader(☃.c());
/*  482 */     if (stringReader.canRead() && stringReader.peek() == '/') {
/*  483 */       stringReader.skip();
/*      */     }
/*  485 */     ParseResults<db> parseResults = this.d.aD().a().parse(stringReader, this.b.cw());
/*  486 */     this.d.aD().a().getCompletionSuggestions(parseResults).thenAccept(suggestions -> this.a.a(new pc(☃.b(), suggestions)));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(tk ☃) {
/*  491 */     ol.a(☃, this, this.b.u());
/*  492 */     if (!this.d.m()) {
/*  493 */       this.b.a(new of("advMode.notEnabled"), x.b);
/*      */       return;
/*      */     } 
/*  496 */     if (!this.b.eV()) {
/*  497 */       this.b.a(new of("advMode.notAllowed"), x.b);
/*      */       return;
/*      */     } 
/*  500 */     bqy bqy = null;
/*  501 */     cco cco = null;
/*  502 */     fx fx = ☃.b();
/*  503 */     ccj ccj = this.b.l.c(fx);
/*  504 */     if (ccj instanceof cco) {
/*  505 */       cco = (cco)ccj;
/*  506 */       bqy = cco.d();
/*      */     } 
/*      */     
/*  509 */     String str = ☃.c();
/*  510 */     boolean bool = ☃.d();
/*      */     
/*  512 */     if (bqy != null) {
/*  513 */       ceh ceh; cco.a a = cco.m();
/*      */       
/*  515 */       gc gc = (gc)this.b.l.d_(fx).c(bvi.a);
/*      */       
/*  517 */       switch (null.a[☃.g().ordinal()]) {
/*      */         case 1:
/*  519 */           ceh = bup.iH.n();
/*  520 */           this.b.l.a(fx, ceh.a(bvi.a, gc).a(bvi.b, Boolean.valueOf(☃.e())), 2);
/*      */           break;
/*      */         case 2:
/*  523 */           ceh = bup.iG.n();
/*  524 */           this.b.l.a(fx, ceh.a(bvi.a, gc).a(bvi.b, Boolean.valueOf(☃.e())), 2);
/*      */           break;
/*      */         
/*      */         default:
/*  528 */           ceh = bup.er.n();
/*  529 */           this.b.l.a(fx, ceh.a(bvi.a, gc).a(bvi.b, Boolean.valueOf(☃.e())), 2);
/*      */           break;
/*      */       } 
/*  532 */       ccj.r();
/*  533 */       this.b.l.a(fx, ccj);
/*      */       
/*  535 */       bqy.a(str);
/*  536 */       bqy.a(bool);
/*  537 */       if (!bool) {
/*  538 */         bqy.b((nr)null);
/*      */       }
/*  540 */       cco.b(☃.f());
/*  541 */       if (a != ☃.g()) {
/*  542 */         cco.h();
/*      */       }
/*  544 */       bqy.e();
/*  545 */       if (!aft.b(str)) {
/*  546 */         this.b.a(new of("advMode.setCommand.success", new Object[] { str }), x.b);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(tl ☃) {
/*  553 */     ol.a(☃, this, this.b.u());
/*  554 */     if (!this.d.m()) {
/*  555 */       this.b.a(new of("advMode.notEnabled"), x.b);
/*      */       return;
/*      */     } 
/*  558 */     if (!this.b.eV()) {
/*  559 */       this.b.a(new of("advMode.notAllowed"), x.b);
/*      */       return;
/*      */     } 
/*  562 */     bqy bqy = ☃.a(this.b.l);
/*      */     
/*  564 */     if (bqy != null) {
/*  565 */       bqy.a(☃.b());
/*  566 */       bqy.a(☃.c());
/*  567 */       if (!☃.c()) {
/*  568 */         bqy.b((nr)null);
/*      */       }
/*  570 */       bqy.e();
/*  571 */       this.b.a(new of("advMode.setCommand.success", new Object[] { ☃.b() }), x.b);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(sw ☃) {
/*  577 */     ol.a(☃, this, this.b.u());
/*  578 */     this.b.bm.c(☃.b());
/*  579 */     this.b.b.a(new pi(-2, this.b.bm.d, this.b.bm.a(this.b.bm.d)));
/*  580 */     this.b.b.a(new pi(-2, ☃.b(), this.b.bm.a(☃.b())));
/*  581 */     this.b.b.a(new qv(this.b.bm.d));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(te ☃) {
/*  586 */     ol.a(☃, this, this.b.u());
/*  587 */     if (this.b.bp instanceof bie) {
/*  588 */       bie bie = (bie)this.b.bp;
/*  589 */       String str = w.a(☃.b());
/*  590 */       if (str.length() <= 35) {
/*  591 */         bie.a(str);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ti ☃) {
/*  598 */     ol.a(☃, this, this.b.u());
/*  599 */     if (this.b.bp instanceof bif) {
/*  600 */       ((bif)this.b.bp).c(☃.b(), ☃.c());
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(to ☃) {
/*  606 */     ol.a(☃, this, this.b.u());
/*  607 */     if (!this.b.eV()) {
/*      */       return;
/*      */     }
/*  610 */     fx fx = ☃.b();
/*  611 */     ceh ceh = this.b.l.d_(fx);
/*  612 */     ccj ccj = this.b.l.c(fx);
/*  613 */     if (ccj instanceof cdj) {
/*  614 */       cdj cdj = (cdj)ccj;
/*      */       
/*  616 */       cdj.a(☃.d());
/*  617 */       cdj.a(☃.e());
/*  618 */       cdj.b(☃.f());
/*  619 */       cdj.c(☃.g());
/*  620 */       cdj.b(☃.h());
/*  621 */       cdj.b(☃.i());
/*  622 */       cdj.b(☃.j());
/*  623 */       cdj.a(☃.k());
/*  624 */       cdj.d(☃.l());
/*  625 */       cdj.e(☃.m());
/*  626 */       cdj.a(☃.n());
/*  627 */       cdj.a(☃.o());
/*      */       
/*  629 */       if (cdj.g()) {
/*  630 */         String str = cdj.d();
/*  631 */         if (☃.c() == cdj.a.b) {
/*  632 */           if (cdj.D()) {
/*  633 */             this.b.a(new of("structure_block.save_success", new Object[] { str }), false);
/*      */           } else {
/*  635 */             this.b.a(new of("structure_block.save_failure", new Object[] { str }), false);
/*      */           } 
/*  637 */         } else if (☃.c() == cdj.a.c) {
/*  638 */           if (!cdj.F()) {
/*  639 */             this.b.a(new of("structure_block.load_not_found", new Object[] { str }), false);
/*  640 */           } else if (cdj.a(this.b.u())) {
/*  641 */             this.b.a(new of("structure_block.load_success", new Object[] { str }), false);
/*      */           } else {
/*  643 */             this.b.a(new of("structure_block.load_prepare", new Object[] { str }), false);
/*      */           } 
/*  645 */         } else if (☃.c() == cdj.a.d) {
/*  646 */           if (cdj.C()) {
/*  647 */             this.b.a(new of("structure_block.size_success", new Object[] { str }), false);
/*      */           } else {
/*  649 */             this.b.a(new of("structure_block.size_failure"), false);
/*      */           } 
/*      */         } 
/*      */       } else {
/*  653 */         this.b.a(new of("structure_block.invalid_structure_name", new Object[] { ☃.e() }), false);
/*      */       } 
/*      */       
/*  656 */       cdj.X_();
/*  657 */       this.b.l.a(fx, ceh, ceh, 3);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(tn ☃) {
/*  663 */     ol.a(☃, this, this.b.u());
/*  664 */     if (!this.b.eV()) {
/*      */       return;
/*      */     }
/*  667 */     fx fx = ☃.b();
/*  668 */     ceh ceh = this.b.l.d_(fx);
/*  669 */     ccj ccj = this.b.l.c(fx);
/*  670 */     if (ccj instanceof ccz) {
/*  671 */       ccz ccz = (ccz)ccj;
/*  672 */       ccz.a(☃.c());
/*  673 */       ccz.b(☃.d());
/*  674 */       ccz.c(☃.e());
/*  675 */       ccz.a(☃.f());
/*  676 */       ccz.a(☃.g());
/*  677 */       ccz.X_();
/*  678 */       this.b.l.a(fx, ceh, ceh, 3);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(sq ☃) {
/*  684 */     ol.a(☃, this, this.b.u());
/*  685 */     if (!this.b.eV()) {
/*      */       return;
/*      */     }
/*  688 */     fx fx = ☃.b();
/*  689 */     ccj ccj = this.b.l.c(fx);
/*  690 */     if (ccj instanceof ccz) {
/*  691 */       ccz ccz = (ccz)ccj;
/*  692 */       ccz.a(this.b.u(), ☃.c(), ☃.d());
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(th ☃) {
/*  698 */     ol.a(☃, this, this.b.u());
/*  699 */     int i = ☃.b();
/*  700 */     bic bic = this.b.bp;
/*  701 */     if (bic instanceof bjg) {
/*  702 */       bjg bjg = (bjg)bic;
/*  703 */       bjg.d(i);
/*  704 */       bjg.g(i);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(sn ☃) {
/*  710 */     bmb bmb = ☃.b();
/*  711 */     if (bmb.b() != bmd.oT) {
/*      */       return;
/*      */     }
/*      */     
/*  715 */     md md = bmb.o();
/*  716 */     if (!bnr.a(md)) {
/*      */       return;
/*      */     }
/*      */     
/*  720 */     List<String> list = Lists.newArrayList();
/*  721 */     boolean bool = ☃.c();
/*  722 */     if (bool) {
/*  723 */       list.add(md.l("title"));
/*      */     }
/*      */     
/*  726 */     mj mj = md.d("pages", 8); int i;
/*  727 */     for (i = 0; i < mj.size(); i++) {
/*  728 */       list.add(mj.j(i));
/*      */     }
/*      */     
/*  731 */     i = ☃.d();
/*  732 */     if (!bfv.d(i) && i != 40) {
/*      */       return;
/*      */     }
/*      */     
/*  736 */     a(list, bool ? (list -> a(list.get(0), list.subList(1, list.size()), ☃)) : (list -> a(list, ☃)));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void a(List<String> ☃, int i) {
/*  743 */     bmb bmb = this.b.bm.a(i);
/*  744 */     if (bmb.b() != bmd.oT) {
/*      */       return;
/*      */     }
/*  747 */     mj mj = new mj();
/*  748 */     ☃.stream().map(ms::a).forEach(mj::add);
/*  749 */     bmb.a("pages", mj);
/*      */   }
/*      */   
/*      */   private void a(String ☃, List<String> list, int i) {
/*  753 */     bmb bmb1 = this.b.bm.a(i);
/*  754 */     if (bmb1.b() != bmd.oT) {
/*      */       return;
/*      */     }
/*      */     
/*  758 */     bmb bmb2 = new bmb(bmd.oU);
/*  759 */     md md = bmb1.o();
/*  760 */     if (md != null) {
/*  761 */       bmb2.c(md.g());
/*      */     }
/*  763 */     bmb2.a("author", ms.a(this.b.R().getString()));
/*  764 */     bmb2.a("title", ms.a(☃));
/*      */     
/*  766 */     mj mj = new mj();
/*  767 */     for (String str1 : list) {
/*  768 */       nr nr = new oe(str1);
/*  769 */       String str2 = nr.a.a(nr);
/*  770 */       mj.add(ms.a(str2));
/*      */     } 
/*  772 */     bmb2.a("pages", mj);
/*  773 */     this.b.bm.a(i, bmb2);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(so ☃) {
/*  778 */     ol.a(☃, this, this.b.u());
/*      */     
/*  780 */     if (!this.b.k(2)) {
/*      */       return;
/*      */     }
/*      */     
/*  784 */     aqa aqa1 = this.b.u().a(☃.c());
/*  785 */     if (aqa1 != null) {
/*  786 */       md md = aqa1.e(new md());
/*  787 */       this.b.b.a(new rq(☃.b(), md));
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(sc ☃) {
/*  793 */     ol.a(☃, this, this.b.u());
/*      */     
/*  795 */     if (!this.b.k(2)) {
/*      */       return;
/*      */     }
/*      */     
/*  799 */     ccj ccj = this.b.u().c(☃.c());
/*  800 */     md md = (ccj != null) ? ccj.a(new md()) : null;
/*  801 */     this.b.b.a(new rq(☃.b(), md));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(st ☃) {
/*  806 */     ol.a(☃, this, this.b.u());
/*  807 */     if (b(☃)) {
/*  808 */       b(new of("multiplayer.disconnect.invalid_player_movement"));
/*      */       return;
/*      */     } 
/*  811 */     aag aag = this.b.u();
/*      */     
/*  813 */     if (this.b.g) {
/*      */       return;
/*      */     }
/*      */     
/*  817 */     if (this.e == 0) {
/*  818 */       c();
/*      */     }
/*      */     
/*  821 */     if (this.y != null) {
/*      */       
/*  823 */       if (this.e - this.A > 20) {
/*  824 */         this.A = this.e;
/*  825 */         a(this.y.b, this.y.c, this.y.d, this.b.p, this.b.q);
/*      */       } 
/*      */       
/*      */       return;
/*      */     } 
/*  830 */     this.A = this.e;
/*  831 */     if (this.b.br()) {
/*  832 */       this.b.a(this.b.cD(), this.b.cE(), this.b.cH(), ☃.a(this.b.p), ☃.b(this.b.q));
/*  833 */       this.b.u().i().a(this.b);
/*      */       
/*      */       return;
/*      */     } 
/*  837 */     double d1 = this.b.cD();
/*  838 */     double d2 = this.b.cE();
/*  839 */     double d3 = this.b.cH();
/*      */     
/*  841 */     double d4 = this.b.cE();
/*      */     
/*  843 */     double d5 = ☃.a(this.b.cD());
/*  844 */     double d6 = ☃.b(this.b.cE());
/*  845 */     double d7 = ☃.c(this.b.cH());
/*      */     
/*  847 */     float f1 = ☃.a(this.b.p);
/*  848 */     float f2 = ☃.b(this.b.q);
/*      */     
/*  850 */     double d8 = d5 - this.l;
/*  851 */     double d9 = d6 - this.m;
/*  852 */     double d10 = d7 - this.n;
/*      */     
/*  854 */     double d11 = this.b.cC().g();
/*  855 */     double d12 = d8 * d8 + d9 * d9 + d10 * d10;
/*      */     
/*  857 */     if (this.b.em()) {
/*  858 */       if (d12 > 1.0D) {
/*  859 */         a(this.b.cD(), this.b.cE(), this.b.cH(), ☃.a(this.b.p), ☃.b(this.b.q));
/*      */       }
/*      */       
/*      */       return;
/*      */     } 
/*  864 */     this.F++;
/*  865 */     int i = this.F - this.G;
/*  866 */     if (i > 5) {
/*  867 */       c.debug("{} is sending move packets too frequently ({} packets since last tick)", this.b.R().getString(), Integer.valueOf(i));
/*  868 */       i = 1;
/*      */     } 
/*      */     
/*  871 */     if (!this.b.H() && (
/*  872 */       !this.b.u().V().b(brt.r) || !this.b.ef())) {
/*      */ 
/*      */       
/*  875 */       float f = this.b.ef() ? 300.0F : 100.0F;
/*  876 */       if (d12 - d11 > (f * i) && !d()) {
/*  877 */         c.warn("{} moved too quickly! {},{},{}", this.b.R().getString(), Double.valueOf(d8), Double.valueOf(d9), Double.valueOf(d10));
/*  878 */         a(this.b.cD(), this.b.cE(), this.b.cH(), this.b.p, this.b.q);
/*      */         
/*      */         return;
/*      */       } 
/*      */     } 
/*      */     
/*  884 */     dci dci = this.b.cc();
/*      */     
/*  886 */     d8 = d5 - this.o;
/*  887 */     d9 = d6 - this.p;
/*  888 */     d10 = d7 - this.q;
/*      */     
/*  890 */     boolean bool1 = (d9 > 0.0D);
/*      */     
/*  892 */     if (this.b.ao() && !☃.b() && bool1)
/*      */     {
/*  894 */       this.b.dK();
/*      */     }
/*      */     
/*  897 */     this.b.a(aqr.b, new dcn(d8, d9, d10));
/*      */     
/*  899 */     double d13 = d9;
/*      */     
/*  901 */     d8 = d5 - this.b.cD();
/*  902 */     d9 = d6 - this.b.cE();
/*  903 */     if (d9 > -0.5D || d9 < 0.5D) {
/*  904 */       d9 = 0.0D;
/*      */     }
/*  906 */     d10 = d7 - this.b.cH();
/*  907 */     d12 = d8 * d8 + d9 * d9 + d10 * d10;
/*  908 */     boolean bool2 = false;
/*  909 */     if (!this.b.H() && d12 > 0.0625D && !this.b.em() && !this.b.d.e() && this.b.d.b() != bru.e) {
/*  910 */       bool2 = true;
/*  911 */       c.warn("{} moved wrongly!", this.b.R().getString());
/*      */     } 
/*      */     
/*  914 */     this.b.a(d5, d6, d7, f1, f2);
/*      */     
/*  916 */     if (!this.b.H && !this.b.em() && ((
/*  917 */       bool2 && aag.a_(this.b, dci)) || a(aag, dci))) {
/*  918 */       a(d1, d2, d3, f1, f2);
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/*  923 */     this
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  929 */       .B = (d13 >= -0.03125D && this.b.d.b() != bru.e && !this.d.aa() && !this.b.bC.c && !this.b.a(apw.y) && !this.b.ef() && a(this.b));
/*      */     
/*  931 */     this.b.u().i().a(this.b);
/*  932 */     this.b.a(this.b.cE() - d4, ☃.b());
/*  933 */     this.b.c(☃.b());
/*      */ 
/*      */     
/*  936 */     if (bool1) {
/*  937 */       this.b.C = 0.0F;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  942 */     this.b.p(this.b.cD() - d1, this.b.cE() - d2, this.b.cH() - d3);
/*      */     
/*  944 */     this.o = this.b.cD();
/*  945 */     this.p = this.b.cE();
/*  946 */     this.q = this.b.cH();
/*      */   }
/*      */   
/*      */   private boolean a(brz ☃, dci dci1) {
/*  950 */     Stream<ddh> stream = ☃.d(this.b, this.b.cc().h(9.999999747378752E-6D), ☃ -> true);
/*  951 */     ddh ddh = dde.a(dci1.h(9.999999747378752E-6D));
/*  952 */     return stream.anyMatch(ddh1 -> !dde.c(ddh1, ☃, dcr.i));
/*      */   }
/*      */   
/*      */   public void a(double ☃, double d1, double d2, float f1, float f2) {
/*  956 */     a(☃, d1, d2, f1, f2, Collections.emptySet());
/*      */   }
/*      */   
/*      */   public void a(double ☃, double d1, double d2, float f1, float f2, Set<qk.a> set) {
/*  960 */     double d3 = set.contains(qk.a.a) ? this.b.cD() : 0.0D;
/*  961 */     double d4 = set.contains(qk.a.b) ? this.b.cE() : 0.0D;
/*  962 */     double d5 = set.contains(qk.a.c) ? this.b.cH() : 0.0D;
/*  963 */     float f3 = set.contains(qk.a.d) ? this.b.p : 0.0F;
/*  964 */     float f4 = set.contains(qk.a.e) ? this.b.q : 0.0F;
/*  965 */     this.y = new dcn(☃, d1, d2);
/*      */     
/*  967 */     if (++this.z == Integer.MAX_VALUE) {
/*  968 */       this.z = 0;
/*      */     }
/*  970 */     this.A = this.e;
/*  971 */     this.b.a(☃, d1, d2, f1, f2);
/*  972 */     this.b.b.a(new qk(☃ - d3, d1 - d4, d2 - d5, f1 - f3, f2 - f4, set, this.z));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(sz ☃) {
/*  977 */     ol.a(☃, this, this.b.u());
/*  978 */     fx fx = ☃.b();
/*  979 */     this.b.z();
/*      */     
/*  981 */     sz.a a = ☃.d();
/*      */     
/*  983 */     switch (null.b[a.ordinal()]) {
/*      */       case 1:
/*  985 */         if (!this.b.a_()) {
/*  986 */           bmb bmb = this.b.b(aot.b);
/*  987 */           this.b.a(aot.b, this.b.b(aot.a));
/*  988 */           this.b.a(aot.a, bmb);
/*  989 */           this.b.ec();
/*      */         } 
/*      */         return;
/*      */       case 2:
/*  993 */         if (!this.b.a_()) {
/*  994 */           this.b.a(false);
/*      */         }
/*      */         return;
/*      */       case 3:
/*  998 */         if (!this.b.a_()) {
/*  999 */           this.b.a(true);
/*      */         }
/*      */         return;
/*      */       case 4:
/* 1003 */         this.b.eb();
/*      */         return;
/*      */       case 5:
/*      */       case 6:
/*      */       case 7:
/* 1008 */         this.b.d.a(fx, a, ☃.c(), this.d.ac());
/*      */         return;
/*      */     } 
/* 1011 */     throw new IllegalArgumentException("Invalid player action");
/*      */   }
/*      */ 
/*      */   
/*      */   private static boolean a(aah ☃, bmb bmb1) {
/* 1016 */     if (bmb1.a()) {
/* 1017 */       return false;
/*      */     }
/*      */     
/* 1020 */     blx blx = bmb1.b();
/* 1021 */     return ((blx instanceof bkh || blx instanceof bko) && !☃.eT().a(blx));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ts ☃) {
/* 1026 */     ol.a(☃, this, this.b.u());
/*      */     
/* 1028 */     aag aag = this.b.u();
/* 1029 */     aot aot = ☃.b();
/* 1030 */     bmb bmb = this.b.b(aot);
/*      */     
/* 1032 */     dcj dcj = ☃.c();
/* 1033 */     fx fx = dcj.a();
/* 1034 */     gc gc = dcj.b();
/* 1035 */     this.b.z();
/*      */     
/* 1037 */     if (fx.v() < this.d.ac()) {
/* 1038 */       if (this.y == null && this.b.h(fx.u() + 0.5D, fx.v() + 0.5D, fx.w() + 0.5D) < 64.0D && 
/* 1039 */         aag.a(this.b, fx)) {
/* 1040 */         aou aou = this.b.d.a(this.b, aag, bmb, aot, dcj);
/*      */         
/* 1042 */         if (gc == gc.b && !aou.a() && fx.v() >= this.d.ac() - 1 && a(this.b, bmb)) {
/*      */           
/* 1044 */           nr nr = (new of("build.tooHigh", new Object[] { Integer.valueOf(this.d.ac()) })).a(k.m);
/* 1045 */           this.b.b.a(new pb(nr, no.c, x.b));
/* 1046 */         } else if (aou.b()) {
/* 1047 */           this.b.a(aot, true);
/*      */         } 
/*      */       } 
/*      */     } else {
/*      */       
/* 1052 */       nr nr = (new of("build.tooHigh", new Object[] { Integer.valueOf(this.d.ac()) })).a(k.m);
/* 1053 */       this.b.b.a(new pb(nr, no.c, x.b));
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1059 */     this.b.b.a(new oy(aag, fx));
/* 1060 */     this.b.b.a(new oy(aag, fx.a(gc)));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(tt ☃) {
/* 1065 */     ol.a(☃, this, this.b.u());
/*      */     
/* 1067 */     aag aag = this.b.u();
/* 1068 */     aot aot = ☃.b();
/* 1069 */     bmb bmb = this.b.b(aot);
/* 1070 */     this.b.z();
/*      */     
/* 1072 */     if (bmb.a()) {
/*      */       return;
/*      */     }
/*      */     
/* 1076 */     aou aou = this.b.d.a(this.b, aag, bmb, aot);
/* 1077 */     if (aou.b()) {
/* 1078 */       this.b.a(aot, true);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(tr ☃) {
/* 1084 */     ol.a(☃, this, this.b.u());
/* 1085 */     if (this.b.a_()) {
/* 1086 */       for (aag aag : this.d.G()) {
/* 1087 */         aqa aqa1 = ☃.a(aag);
/*      */         
/* 1089 */         if (aqa1 != null) {
/* 1090 */           this.b.a(aag, aqa1.cD(), aqa1.cE(), aqa1.cH(), aqa1.p, aqa1.q);
/*      */           return;
/*      */         } 
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(tf ☃) {}
/*      */ 
/*      */   
/*      */   public void a(sv ☃) {
/* 1103 */     ol.a(☃, this, this.b.u());
/* 1104 */     aqa aqa1 = this.b.ct();
/* 1105 */     if (aqa1 instanceof bhn) {
/* 1106 */       ((bhn)aqa1).a(☃.b(), ☃.c());
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(nr ☃) {
/* 1112 */     c.info("{} lost connection: {}", this.b.R().getString(), ☃.getString());
/* 1113 */     this.d.at();
/* 1114 */     this.d.ae().a((new of("multiplayer.player.left", new Object[] { this.b.d() })).a(k.o), no.b, x.b);
/* 1115 */     this.b.p();
/* 1116 */     this.d.ae().c(this.b);
/*      */     
/* 1118 */     abc abc = this.b.Q();
/* 1119 */     if (abc != null) {
/* 1120 */       abc.b();
/*      */     }
/*      */     
/* 1123 */     if (d()) {
/* 1124 */       c.info("Stopping singleplayer server as player logged out");
/* 1125 */       this.d.a(false);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a(oj<?> ☃) {
/* 1130 */     a(☃, (GenericFutureListener<? extends Future<? super Void>>)null);
/*      */   }
/*      */   
/*      */   public void a(oj<?> ☃, @Nullable GenericFutureListener<? extends Future<? super Void>> genericFutureListener) {
/* 1134 */     if (☃ instanceof pb) {
/* 1135 */       pb pb = (pb)☃;
/* 1136 */       bfu bfu = this.b.x();
/*      */       
/* 1138 */       if (bfu == bfu.c && pb.d() != no.c) {
/*      */         return;
/*      */       }
/* 1141 */       if (bfu == bfu.b && !pb.c()) {
/*      */         return;
/*      */       }
/*      */     } 
/*      */     
/*      */     try {
/* 1147 */       this.a.a(☃, genericFutureListener);
/* 1148 */     } catch (Throwable throwable) {
/* 1149 */       l l = l.a(throwable, "Sending packet");
/* 1150 */       m m = l.a("Packet being sent");
/*      */       
/* 1152 */       m.a("Packet class", () -> ☃.getClass().getCanonicalName());
/*      */       
/* 1154 */       throw new u(l);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(tj ☃) {
/* 1160 */     ol.a(☃, this, this.b.u());
/* 1161 */     if (☃.b() < 0 || ☃.b() >= bfv.g()) {
/* 1162 */       c.warn("{} tried to set an invalid carried item", this.b.R().getString());
/*      */       return;
/*      */     } 
/* 1165 */     if (this.b.bm.d != ☃.b() && this.b.dX() == aot.a) {
/* 1166 */       this.b.ec();
/*      */     }
/* 1168 */     this.b.bm.d = ☃.b();
/* 1169 */     this.b.z();
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(se ☃) {
/* 1174 */     String str = StringUtils.normalizeSpace(☃.b());
/* 1175 */     if (str.startsWith("/")) {
/* 1176 */       ol.a(☃, this, this.b.u());
/* 1177 */       c(str);
/*      */     } else {
/* 1179 */       a(str, this::c);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void c(String ☃) {
/* 1184 */     if (this.b.x() == bfu.c) {
/* 1185 */       a(new pb((new of("chat.cannotSend")).a(k.m), no.b, x.b));
/*      */       return;
/*      */     } 
/* 1188 */     this.b.z();
/*      */     
/* 1190 */     for (int i = 0; i < ☃.length(); i++) {
/* 1191 */       if (!w.a(☃.charAt(i))) {
/* 1192 */         b(new of("multiplayer.disconnect.illegal_characters"));
/*      */         
/*      */         return;
/*      */       } 
/*      */     } 
/* 1197 */     if (☃.startsWith("/")) {
/* 1198 */       d(☃);
/*      */     } else {
/* 1200 */       nr nr = new of("chat.type.text", new Object[] { this.b.d(), ☃ });
/* 1201 */       this.d.ae().a(nr, no.a, this.b.bS());
/*      */     } 
/*      */     
/* 1204 */     this.i += 20;
/* 1205 */     if (this.i > 200 && !this.d.ae().h(this.b.eA())) {
/* 1206 */       b(new of("disconnect.spam"));
/*      */     }
/*      */   }
/*      */   
/*      */   private void d(String ☃) {
/* 1211 */     this.d.aD().a(this.b.cw(), ☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(tq ☃) {
/* 1216 */     ol.a(☃, this, this.b.u());
/* 1217 */     this.b.z();
/* 1218 */     this.b.a(☃.b());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ta ☃) {
/* 1223 */     ol.a(☃, this, this.b.u());
/* 1224 */     this.b.z();
/* 1225 */     switch (null.c[☃.c().ordinal()]) {
/*      */       case 1:
/* 1227 */         this.b.f(true);
/*      */         return;
/*      */       case 2:
/* 1230 */         this.b.f(false);
/*      */         return;
/*      */       case 3:
/* 1233 */         this.b.g(true);
/*      */         return;
/*      */       case 4:
/* 1236 */         this.b.g(false);
/*      */         return;
/*      */       case 5:
/* 1239 */         if (this.b.em()) {
/* 1240 */           this.b.a(false, true);
/* 1241 */           this.y = this.b.cA();
/*      */         } 
/*      */         return;
/*      */       case 6:
/* 1245 */         if (this.b.ct() instanceof aqw) {
/* 1246 */           aqw aqw = (aqw)this.b.ct();
/* 1247 */           int i = ☃.d();
/* 1248 */           if (aqw.P_() && i > 0) {
/* 1249 */             aqw.b(i);
/*      */           }
/*      */         } 
/*      */         return;
/*      */       case 7:
/* 1254 */         if (this.b.ct() instanceof aqw) {
/* 1255 */           aqw aqw = (aqw)this.b.ct();
/* 1256 */           aqw.c();
/*      */         } 
/*      */         return;
/*      */       
/*      */       case 8:
/* 1261 */         if (this.b.ct() instanceof bbb) {
/* 1262 */           ((bbb)this.b.ct()).f(this.b);
/*      */         }
/*      */         return;
/*      */       case 9:
/* 1266 */         if (!this.b.eD())
/*      */         {
/* 1268 */           this.b.eF();
/*      */         }
/*      */         return;
/*      */     } 
/* 1272 */     throw new IllegalArgumentException("Invalid client command!");
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
/*      */   public void a(sp ☃) {
/* 1288 */     ol.a(☃, this, this.b.u());
/* 1289 */     aag aag = this.b.u();
/* 1290 */     aqa aqa1 = ☃.a(aag);
/* 1291 */     this.b.z();
/*      */     
/* 1293 */     this.b.f(☃.e());
/*      */     
/* 1295 */     if (aqa1 != null) {
/* 1296 */       double d = 36.0D;
/*      */       
/* 1298 */       if (this.b.h(aqa1) < 36.0D) {
/*      */         
/* 1300 */         aot aot = ☃.c();
/* 1301 */         bmb bmb = (aot != null) ? this.b.b(aot).i() : bmb.b;
/* 1302 */         Optional<aou> optional = Optional.empty();
/* 1303 */         if (☃.b() == sp.a.a) {
/* 1304 */           optional = Optional.of(this.b.a(aqa1, aot));
/* 1305 */         } else if (☃.b() == sp.a.c) {
/* 1306 */           optional = Optional.of(aqa1.a(this.b, ☃.d(), aot));
/* 1307 */         } else if (☃.b() == sp.a.b) {
/* 1308 */           if (aqa1 instanceof bcv || aqa1 instanceof aqg || aqa1 instanceof bga || aqa1 == this.b) {
/* 1309 */             b(new of("multiplayer.disconnect.invalid_entity_attacked"));
/* 1310 */             c.warn("Player {} tried to attack an invalid entity", this.b.R().getString());
/*      */             
/*      */             return;
/*      */           } 
/* 1314 */           this.b.f(aqa1);
/*      */         } 
/*      */         
/* 1317 */         if (optional.isPresent() && ((aou)optional.get()).a()) {
/* 1318 */           ac.P.a(this.b, bmb, aqa1);
/* 1319 */           if (((aou)optional.get()).b()) {
/* 1320 */             this.b.a(aot, true);
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(sf ☃) {
/* 1329 */     ol.a(☃, this, this.b.u());
/* 1330 */     this.b.z();
/* 1331 */     sf.a a = ☃.b();
/* 1332 */     switch (null.d[a.ordinal()]) {
/*      */       case 1:
/* 1334 */         if (this.b.g) {
/* 1335 */           this.b.g = false;
/* 1336 */           this.b = this.d.ae().a(this.b, true);
/* 1337 */           ac.v.a(this.b, brx.i, brx.g); break;
/*      */         } 
/* 1339 */         if (this.b.dk() > 0.0F) {
/*      */           return;
/*      */         }
/* 1342 */         this.b = this.d.ae().a(this.b, false);
/* 1343 */         if (this.d.f()) {
/* 1344 */           this.b.a(bru.e);
/* 1345 */           ((brt.a)this.b.u().V().<brt.a>a(brt.p)).a(false, this.d);
/*      */         } 
/*      */         break;
/*      */       
/*      */       case 2:
/* 1350 */         this.b.A().a(this.b);
/*      */         break;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(sl ☃) {
/* 1357 */     ol.a(☃, this, this.b.u());
/* 1358 */     this.b.o();
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(sk ☃) {
/* 1363 */     ol.a(☃, this, this.b.u());
/* 1364 */     this.b.z();
/* 1365 */     if (this.b.bp.b == ☃.b() && this.b.bp.c(this.b)) {
/* 1366 */       if (this.b.a_()) {
/* 1367 */         gj<bmb> gj = gj.a();
/* 1368 */         for (int i = 0; i < this.b.bp.a.size(); i++) {
/* 1369 */           gj.add(((bjr)this.b.bp.a.get(i)).e());
/*      */         }
/* 1371 */         this.b.a(this.b.bp, gj);
/*      */       } else {
/* 1373 */         bmb bmb = this.b.bp.a(☃.c(), ☃.d(), ☃.g(), this.b);
/*      */         
/* 1375 */         if (bmb.b(☃.f(), bmb)) {
/*      */           
/* 1377 */           this.b.b.a(new pe(☃.b(), ☃.e(), true));
/* 1378 */           this.b.e = true;
/* 1379 */           this.b.bp.c();
/* 1380 */           this.b.n();
/* 1381 */           this.b.e = false;
/*      */         } else {
/*      */           
/* 1384 */           this.k.put(this.b.bp.b, ☃.e());
/* 1385 */           this.b.b.a(new pe(☃.b(), ☃.e(), false));
/* 1386 */           this.b.bp.a(this.b, false);
/*      */           
/* 1388 */           gj<bmb> gj = gj.a();
/* 1389 */           for (int i = 0; i < this.b.bp.a.size(); i++) {
/* 1390 */             bmb bmb1 = ((bjr)this.b.bp.a.get(i)).e();
/* 1391 */             gj.add(bmb1.a() ? bmb.b : bmb1);
/*      */           } 
/* 1393 */           this.b.a(this.b.bp, gj);
/*      */         } 
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(sx ☃) {
/* 1401 */     ol.a(☃, this, this.b.u());
/* 1402 */     this.b.z();
/*      */     
/* 1404 */     if (this.b.a_() || this.b.bp.b != ☃.b() || !this.b.bp.c(this.b) || !(this.b.bp instanceof bjj)) {
/*      */       return;
/*      */     }
/*      */     
/* 1408 */     this.d.aF().a(☃.c()).ifPresent(boq1 -> ((bjj)this.b.bp).a(☃.d(), boq1, this.b));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(sj ☃) {
/* 1413 */     ol.a(☃, this, this.b.u());
/* 1414 */     this.b.z();
/* 1415 */     if (this.b.bp.b == ☃.b() && this.b.bp.c(this.b) && !this.b.a_()) {
/* 1416 */       this.b.bp.a(this.b, ☃.c());
/* 1417 */       this.b.bp.c();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(tm ☃) {
/* 1423 */     ol.a(☃, this, this.b.u());
/* 1424 */     if (this.b.d.e()) {
/* 1425 */       boolean bool1 = (☃.b() < 0);
/* 1426 */       bmb bmb = ☃.c();
/*      */       
/* 1428 */       md md = bmb.b("BlockEntityTag");
/* 1429 */       if (!bmb.a() && md != null && 
/* 1430 */         md.e("x") && md.e("y") && md.e("z")) {
/* 1431 */         fx fx = new fx(md.h("x"), md.h("y"), md.h("z"));
/* 1432 */         ccj ccj = this.b.l.c(fx);
/* 1433 */         if (ccj != null) {
/* 1434 */           md md1 = ccj.a(new md());
/* 1435 */           md1.r("x");
/* 1436 */           md1.r("y");
/* 1437 */           md1.r("z");
/* 1438 */           bmb.a("BlockEntityTag", md1);
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 1443 */       boolean bool2 = (☃.b() >= 1 && ☃.b() <= 45);
/* 1444 */       boolean bool3 = (bmb.a() || (bmb.g() >= 0 && bmb.E() <= 64 && !bmb.a()));
/*      */       
/* 1446 */       if (bool2 && bool3) {
/* 1447 */         if (bmb.a()) {
/* 1448 */           this.b.bo.a(☃.b(), bmb.b);
/*      */         } else {
/* 1450 */           this.b.bo.a(☃.b(), bmb);
/*      */         } 
/* 1452 */         this.b.bo.a(this.b, true);
/* 1453 */         this.b.bo.c();
/* 1454 */       } else if (bool1 && bool3 && 
/* 1455 */         this.j < 200) {
/* 1456 */         this.j += 20;
/*      */         
/* 1458 */         this.b.a(bmb, true);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(si ☃) {
/* 1466 */     ol.a(☃, this, this.b.u());
/* 1467 */     int i = this.b.bp.b;
/* 1468 */     if (i == ☃.b() && this.k.getOrDefault(i, (short)(☃.c() + 1)) == ☃.c() && !this.b.bp.c(this.b) && !this.b.a_()) {
/* 1469 */       this.b.bp.a(this.b, true);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(tp ☃) {
/* 1475 */     List<String> list = (List<String>)Stream.<String>of(☃.c()).map(k::a).collect(Collectors.toList());
/* 1476 */     a(list, list -> a(☃, list));
/*      */   }
/*      */   
/*      */   private void a(tp ☃, List<String> list) {
/* 1480 */     this.b.z();
/* 1481 */     aag aag = this.b.u();
/* 1482 */     fx fx = ☃.b();
/* 1483 */     if (aag.C(fx)) {
/* 1484 */       ceh ceh = aag.d_(fx);
/* 1485 */       ccj ccj = aag.c(fx);
/*      */       
/* 1487 */       if (!(ccj instanceof cdf)) {
/*      */         return;
/*      */       }
/*      */       
/* 1491 */       cdf cdf = (cdf)ccj;
/* 1492 */       if (!cdf.d() || cdf.f() != this.b) {
/* 1493 */         c.warn("Player {} just tried to change non-editable sign", this.b.R().getString());
/*      */         
/*      */         return;
/*      */       } 
/* 1497 */       for (int i = 0; i < list.size(); i++) {
/* 1498 */         cdf.a(i, new oe(list.get(i)));
/*      */       }
/*      */       
/* 1501 */       cdf.X_();
/* 1502 */       aag.a(fx, ceh, ceh, 3);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(sr ☃) {
/* 1508 */     if (this.g && ☃.b() == this.h) {
/* 1509 */       int i = (int)(x.b() - this.f);
/* 1510 */       this.b.f = (this.b.f * 3 + i) / 4;
/* 1511 */       this.g = false;
/*      */     }
/* 1513 */     else if (!d()) {
/* 1514 */       b(new of("disconnect.timeout"));
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(sy ☃) {
/* 1521 */     ol.a(☃, this, this.b.u());
/* 1522 */     this.b.bC.b = (☃.b() && this.b.bC.c);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(sg ☃) {
/* 1527 */     ol.a(☃, this, this.b.u());
/* 1528 */     this.b.a(☃);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(sm ☃) {}
/*      */ 
/*      */   
/*      */   public void a(sd ☃) {
/* 1537 */     ol.a(☃, this, this.b.u());
/*      */     
/* 1539 */     if (!this.b.k(2) && !d()) {
/*      */       return;
/*      */     }
/*      */     
/* 1543 */     this.d.a(☃.b(), false);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ss ☃) {
/* 1548 */     ol.a(☃, this, this.b.u());
/*      */     
/* 1550 */     if (!this.b.k(2) && !d()) {
/*      */       return;
/*      */     }
/*      */     
/* 1554 */     this.d.b(☃.b());
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */