/*      */ import com.google.common.collect.HashMultimap;
/*      */ import com.google.common.collect.Lists;
/*      */ import com.google.common.collect.Multimap;
/*      */ import com.google.gson.JsonParseException;
/*      */ import com.mojang.brigadier.StringReader;
/*      */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*      */ import com.mojang.datafixers.kinds.App;
/*      */ import com.mojang.datafixers.kinds.Applicative;
/*      */ import com.mojang.datafixers.util.Function3;
/*      */ import com.mojang.serialization.Codec;
/*      */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*      */ import java.text.DecimalFormat;
/*      */ import java.text.DecimalFormatSymbols;
/*      */ import java.util.Collection;
/*      */ import java.util.List;
/*      */ import java.util.Locale;
/*      */ import java.util.Map;
/*      */ import java.util.Objects;
/*      */ import java.util.Optional;
/*      */ import java.util.Random;
/*      */ import java.util.function.Consumer;
/*      */ import java.util.function.Predicate;
/*      */ import java.util.stream.Collectors;
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
/*      */ public final class bmb
/*      */ {
/*      */   public static final Codec<bmb> a;
/*      */   
/*      */   static {
/*   74 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)gm.T.fieldOf("id").forGetter(()), (App)Codec.INT.fieldOf("Count").forGetter(()), (App)md.a.optionalFieldOf("tag").forGetter(())).apply((Applicative)☃, bmb::new));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*   80 */   private static final Logger d = LogManager.getLogger();
/*   81 */   public static final bmb b = new bmb((blx)null);
/*      */   static {
/*   83 */     c = x.<DecimalFormat>a(new DecimalFormat("#.##"), ☃ -> ☃.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));
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
/*      */   public static final DecimalFormat c;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public enum a
/*      */   {
/*  105 */     a,
/*  106 */     b,
/*  107 */     c,
/*  108 */     d,
/*  109 */     e,
/*  110 */     f,
/*  111 */     g;
/*      */     
/*      */     a() {
/*  114 */       this.h = 1 << ordinal();
/*      */     }
/*      */     public int a() {
/*  117 */       return this.h;
/*      */     }
/*      */ 
/*      */     
/*      */     private int h;
/*      */   }
/*  123 */   private static final ob e = ob.a.a(k.f).b(Boolean.valueOf(true));
/*      */   private int f;
/*      */   private int g;
/*      */   @Deprecated
/*      */   private final blx h;
/*      */   private md i;
/*      */   private boolean j;
/*      */   private aqa k;
/*      */   private cel l;
/*      */   private boolean m;
/*      */   private cel n;
/*      */   private boolean o;
/*      */   
/*      */   public bmb(brw ☃) {
/*  137 */     this(☃, 1);
/*      */   }
/*      */   
/*      */   private bmb(brw ☃, int i, Optional<md> optional) {
/*  141 */     this(☃, i);
/*  142 */     optional.ifPresent(this::c);
/*      */   }
/*      */   
/*      */   public bmb(brw ☃, int i) {
/*  146 */     this.h = (☃ == null) ? null : ☃.h();
/*  147 */     this.f = i;
/*      */     
/*  149 */     if (this.h != null && this.h.k()) {
/*  150 */       b(g());
/*      */     }
/*      */     
/*  153 */     I();
/*      */   }
/*      */   
/*      */   private void I() {
/*  157 */     this.j = false;
/*  158 */     this.j = a();
/*      */   }
/*      */   
/*      */   private bmb(md ☃) {
/*  162 */     this.h = gm.T.a(new vk(☃.l("id")));
/*  163 */     this.f = ☃.f("Count");
/*      */     
/*  165 */     if (☃.c("tag", 10)) {
/*  166 */       this.i = ☃.p("tag");
/*  167 */       b().b(☃);
/*      */     } 
/*      */     
/*  170 */     if (b().k()) {
/*  171 */       b(g());
/*      */     }
/*      */     
/*  174 */     I();
/*      */   }
/*      */   
/*      */   public static bmb a(md ☃) {
/*      */     try {
/*  179 */       return new bmb(☃);
/*  180 */     } catch (RuntimeException runtimeException) {
/*  181 */       d.debug("Tried to load invalid item: {}", ☃, runtimeException);
/*  182 */       return b;
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean a() {
/*  187 */     if (this == b) {
/*  188 */       return true;
/*      */     }
/*      */     
/*  191 */     if (b() == null || b() == bmd.a) {
/*  192 */       return true;
/*      */     }
/*  194 */     if (this.f <= 0) {
/*  195 */       return true;
/*      */     }
/*  197 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public bmb a(int ☃) {
/*  205 */     int i = Math.min(☃, this.f);
/*      */     
/*  207 */     bmb bmb1 = i();
/*  208 */     bmb1.e(i);
/*  209 */     g(i);
/*      */     
/*  211 */     return bmb1;
/*      */   }
/*      */   
/*      */   public blx b() {
/*  215 */     return this.j ? bmd.a : this.h;
/*      */   }
/*      */   
/*      */   public aou a(boa ☃) {
/*  219 */     bfw bfw = ☃.n();
/*  220 */     fx fx = ☃.a();
/*  221 */     cel cel1 = new cel(☃.p(), fx, false);
/*  222 */     if (bfw != null && !bfw.bC.e && !b(☃.p().p(), cel1)) {
/*  223 */       return aou.c;
/*      */     }
/*      */     
/*  226 */     blx blx1 = b();
/*  227 */     aou aou = blx1.a(☃);
/*  228 */     if (bfw != null && aou.a()) {
/*  229 */       bfw.b(aea.c.b(blx1));
/*      */     }
/*  231 */     return aou;
/*      */   }
/*      */   
/*      */   public float a(ceh ☃) {
/*  235 */     return b().a(this, ☃);
/*      */   }
/*      */   
/*      */   public aov<bmb> a(brx ☃, bfw bfw1, aot aot1) {
/*  239 */     return b().a(☃, bfw1, aot1);
/*      */   }
/*      */   
/*      */   public bmb a(brx ☃, aqm aqm1) {
/*  243 */     return b().a(this, ☃, aqm1);
/*      */   }
/*      */   
/*      */   public md b(md ☃) {
/*  247 */     vk vk = gm.T.b(b());
/*  248 */     ☃.a("id", (vk == null) ? "minecraft:air" : vk.toString());
/*  249 */     ☃.a("Count", (byte)this.f);
/*  250 */     if (this.i != null) {
/*  251 */       ☃.a("tag", this.i.g());
/*      */     }
/*  253 */     return ☃;
/*      */   }
/*      */   
/*      */   public int c() {
/*  257 */     return b().i();
/*      */   }
/*      */   
/*      */   public boolean d() {
/*  261 */     return (c() > 1 && (!e() || !f()));
/*      */   }
/*      */   
/*      */   public boolean e() {
/*  265 */     if (this.j || b().j() <= 0) {
/*  266 */       return false;
/*      */     }
/*  268 */     md ☃ = o();
/*  269 */     return (☃ == null || !☃.q("Unbreakable"));
/*      */   }
/*      */   
/*      */   public boolean f() {
/*  273 */     return (e() && g() > 0);
/*      */   }
/*      */   
/*      */   public int g() {
/*  277 */     return (this.i == null) ? 0 : this.i.h("Damage");
/*      */   }
/*      */   
/*      */   public void b(int ☃) {
/*  281 */     p().b("Damage", Math.max(0, ☃));
/*      */   }
/*      */   
/*      */   public int h() {
/*  285 */     return b().j();
/*      */   }
/*      */   
/*      */   public boolean a(int ☃, Random random, @Nullable aah aah1) {
/*  289 */     if (!e()) {
/*  290 */       return false;
/*      */     }
/*      */     
/*  293 */     if (☃ > 0) {
/*  294 */       int j = bpu.a(bpw.v, this);
/*      */       
/*  296 */       int k = 0;
/*  297 */       for (int m = 0; j > 0 && m < ☃; m++) {
/*  298 */         if (bpq.a(this, j, random)) {
/*  299 */           k++;
/*      */         }
/*      */       } 
/*  302 */       ☃ -= k;
/*      */       
/*  304 */       if (☃ <= 0) {
/*  305 */         return false;
/*      */       }
/*      */     } 
/*      */     
/*  309 */     if (aah1 != null && ☃ != 0) {
/*  310 */       ac.t.a(aah1, this, g() + ☃);
/*      */     }
/*      */     
/*  313 */     int i = g() + ☃;
/*      */     
/*  315 */     b(i);
/*      */     
/*  317 */     return (i >= h());
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public <T extends aqm> void a(int ☃, T t, Consumer<T> consumer) {
/*  323 */     if (((aqm)t).l.v || (t instanceof bfw && ((bfw)t).bC.d)) {
/*      */       return;
/*      */     }
/*  326 */     if (!e()) {
/*      */       return;
/*      */     }
/*      */     
/*  330 */     if (a(☃, t.cY(), (t instanceof aah) ? (aah)t : null)) {
/*  331 */       consumer.accept(t);
/*      */       
/*  333 */       blx blx1 = b();
/*  334 */       g(1);
/*  335 */       if (t instanceof bfw) {
/*  336 */         ((bfw)t).b(aea.d.b(blx1));
/*      */       }
/*      */ 
/*      */       
/*  340 */       b(0);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a(aqm ☃, bfw bfw1) {
/*  345 */     blx blx1 = b();
/*  346 */     if (blx1.a(this, ☃, bfw1)) {
/*  347 */       bfw1.b(aea.c.b(blx1));
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(brx ☃, ceh ceh1, fx fx1, bfw bfw1) {
/*  352 */     blx blx1 = b();
/*  353 */     if (blx1.a(this, ☃, ceh1, fx1, bfw1)) {
/*  354 */       bfw1.b(aea.c.b(blx1));
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean b(ceh ☃) {
/*  359 */     return b().b(☃);
/*      */   }
/*      */   
/*      */   public aou a(bfw ☃, aqm aqm1, aot aot1) {
/*  363 */     return b().a(this, ☃, aqm1, aot1);
/*      */   }
/*      */   
/*      */   public bmb i() {
/*  367 */     if (a()) {
/*  368 */       return b;
/*      */     }
/*  370 */     bmb ☃ = new bmb(b(), this.f);
/*  371 */     ☃.d(D());
/*  372 */     if (this.i != null) {
/*  373 */       ☃.i = this.i.g();
/*      */     }
/*  375 */     return ☃;
/*      */   }
/*      */   
/*      */   public static boolean a(bmb ☃, bmb bmb1) {
/*  379 */     if (☃.a() && bmb1.a()) {
/*  380 */       return true;
/*      */     }
/*  382 */     if (☃.a() || bmb1.a()) {
/*  383 */       return false;
/*      */     }
/*      */     
/*  386 */     if (☃.i == null && bmb1.i != null) {
/*  387 */       return false;
/*      */     }
/*  389 */     if (☃.i != null && !☃.i.equals(bmb1.i)) {
/*  390 */       return false;
/*      */     }
/*  392 */     return true;
/*      */   }
/*      */   
/*      */   public static boolean b(bmb ☃, bmb bmb1) {
/*  396 */     if (☃.a() && bmb1.a()) {
/*  397 */       return true;
/*      */     }
/*  399 */     if (☃.a() || bmb1.a()) {
/*  400 */       return false;
/*      */     }
/*  402 */     return ☃.c(bmb1);
/*      */   }
/*      */   
/*      */   private boolean c(bmb ☃) {
/*  406 */     if (this.f != ☃.f) {
/*  407 */       return false;
/*      */     }
/*  409 */     if (b() != ☃.b()) {
/*  410 */       return false;
/*      */     }
/*  412 */     if (this.i == null && ☃.i != null) {
/*  413 */       return false;
/*      */     }
/*  415 */     if (this.i != null && !this.i.equals(☃.i)) {
/*  416 */       return false;
/*      */     }
/*  418 */     return true;
/*      */   }
/*      */   
/*      */   public static boolean c(bmb ☃, bmb bmb1) {
/*  422 */     if (☃ == bmb1) {
/*  423 */       return true;
/*      */     }
/*  425 */     if (!☃.a() && !bmb1.a()) {
/*  426 */       return ☃.a(bmb1);
/*      */     }
/*  428 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean d(bmb ☃, bmb bmb1) {
/*  432 */     if (☃ == bmb1) {
/*  433 */       return true;
/*      */     }
/*  435 */     if (!☃.a() && !bmb1.a()) {
/*  436 */       return ☃.b(bmb1);
/*      */     }
/*  438 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(bmb ☃) {
/*  449 */     return (!☃.a() && b() == ☃.b());
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
/*      */   public boolean b(bmb ☃) {
/*  461 */     if (e()) {
/*  462 */       return (!☃.a() && b() == ☃.b());
/*      */     }
/*  464 */     return a(☃);
/*      */   }
/*      */   
/*      */   public String j() {
/*  468 */     return b().f(this);
/*      */   }
/*      */ 
/*      */   
/*      */   public String toString() {
/*  473 */     return this.f + " " + b();
/*      */   }
/*      */   
/*      */   public void a(brx ☃, aqa aqa1, int i, boolean bool) {
/*  477 */     if (this.g > 0) {
/*  478 */       this.g--;
/*      */     }
/*  480 */     if (b() != null) {
/*  481 */       b().a(this, ☃, aqa1, i, bool);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(brx ☃, bfw bfw1, int i) {
/*  486 */     bfw1.a(aea.b.b(b()), i);
/*  487 */     b().b(this, ☃, bfw1);
/*      */   }
/*      */   
/*      */   public int k() {
/*  491 */     return b().e_(this);
/*      */   }
/*      */   
/*      */   public bnn l() {
/*  495 */     return b().d_(this);
/*      */   }
/*      */   
/*      */   public void a(brx ☃, aqm aqm1, int i) {
/*  499 */     b().a(this, ☃, aqm1, i);
/*      */   }
/*      */   
/*      */   public boolean m() {
/*  503 */     return b().j(this);
/*      */   }
/*      */   
/*      */   public boolean n() {
/*  507 */     return (!this.j && this.i != null && !this.i.isEmpty());
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public md o() {
/*  512 */     return this.i;
/*      */   }
/*      */   
/*      */   public md p() {
/*  516 */     if (this.i == null) {
/*  517 */       c(new md());
/*      */     }
/*      */     
/*  520 */     return this.i;
/*      */   }
/*      */   
/*      */   public md a(String ☃) {
/*  524 */     if (this.i == null || !this.i.c(☃, 10)) {
/*  525 */       md md1 = new md();
/*  526 */       a(☃, md1);
/*  527 */       return md1;
/*      */     } 
/*  529 */     return this.i.p(☃);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public md b(String ☃) {
/*  534 */     if (this.i == null || !this.i.c(☃, 10)) {
/*  535 */       return null;
/*      */     }
/*  537 */     return this.i.p(☃);
/*      */   }
/*      */   
/*      */   public void c(String ☃) {
/*  541 */     if (this.i != null && this.i.e(☃)) {
/*  542 */       this.i.r(☃);
/*  543 */       if (this.i.isEmpty()) {
/*  544 */         this.i = null;
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public mj q() {
/*  550 */     if (this.i != null) {
/*  551 */       return this.i.d("Enchantments", 10);
/*      */     }
/*  553 */     return new mj();
/*      */   }
/*      */   
/*      */   public void c(@Nullable md ☃) {
/*  557 */     this.i = ☃;
/*      */     
/*  559 */     if (b().k()) {
/*  560 */       b(g());
/*      */     }
/*      */   }
/*      */   
/*      */   public nr r() {
/*  565 */     md ☃ = b("display");
/*  566 */     if (☃ != null && 
/*  567 */       ☃.c("Name", 8)) {
/*      */       try {
/*  569 */         nr nr = nr.a.a(☃.l("Name"));
/*  570 */         if (nr != null) {
/*  571 */           return nr;
/*      */         }
/*  573 */         ☃.r("Name");
/*      */       }
/*  575 */       catch (JsonParseException jsonParseException) {
/*  576 */         ☃.r("Name");
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*  581 */     return b().h(this);
/*      */   }
/*      */   
/*      */   public bmb a(@Nullable nr ☃) {
/*  585 */     md md1 = a("display");
/*  586 */     if (☃ != null) {
/*  587 */       md1.a("Name", nr.a.a(☃));
/*      */     } else {
/*  589 */       md1.r("Name");
/*      */     } 
/*  591 */     return this;
/*      */   }
/*      */   
/*      */   public void s() {
/*  595 */     md ☃ = b("display");
/*  596 */     if (☃ != null) {
/*  597 */       ☃.r("Name");
/*      */       
/*  599 */       if (☃.isEmpty()) {
/*  600 */         c("display");
/*      */       }
/*      */     } 
/*      */     
/*  604 */     if (this.i != null && this.i.isEmpty()) {
/*  605 */       this.i = null;
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean t() {
/*  610 */     md ☃ = b("display");
/*  611 */     return (☃ != null && ☃.c("Name", 8));
/*      */   }
/*      */ 
/*      */   
/*      */   public List<nr> a(@Nullable bfw ☃, bnl bnl1) {
/*  616 */     List<nr> list = Lists.newArrayList();
/*      */     
/*  618 */     nx nx = (new oe("")).a(r()).a((v()).e);
/*  619 */     if (t()) {
/*  620 */       nx.a(k.u);
/*      */     }
/*  622 */     list.add(nx);
/*      */     
/*  624 */     if (!bnl1.a() && !t() && b() == bmd.nf) {
/*  625 */       list.add((new oe("#" + bmh.d(this))).a(k.h));
/*      */     }
/*      */     
/*  628 */     int i = J();
/*      */     
/*  630 */     if (a(i, a.f)) {
/*  631 */       b().a(this, (☃ == null) ? null : ☃.l, list, bnl1);
/*      */     }
/*      */     
/*  634 */     if (n()) {
/*  635 */       if (a(i, a.a)) {
/*  636 */         a(list, q());
/*      */       }
/*      */       
/*  639 */       if (this.i.c("display", 10)) {
/*  640 */         md md1 = this.i.p("display");
/*      */         
/*  642 */         if (a(i, a.g) && md1.c("color", 99)) {
/*  643 */           if (bnl1.a()) {
/*  644 */             list.add((new of("item.color", new Object[] { String.format("#%06X", new Object[] { Integer.valueOf(md1.h("color")) }) })).a(k.h));
/*      */           } else {
/*  646 */             list.add((new of("item.dyed")).a(new k[] { k.h, k.u }));
/*      */           } 
/*      */         }
/*      */         
/*  650 */         if (md1.d("Lore") == 9) {
/*  651 */           mj mj = md1.d("Lore", 8);
/*  652 */           for (int j = 0; j < mj.size(); j++) {
/*  653 */             String str = mj.j(j);
/*      */             try {
/*  655 */               nx nx1 = nr.a.a(str);
/*  656 */               if (nx1 != null) {
/*  657 */                 list.add(ns.a(nx1, e));
/*      */               }
/*  659 */             } catch (JsonParseException jsonParseException) {
/*  660 */               md1.r("Lore");
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  667 */     if (a(i, a.b)) {
/*  668 */       for (aqf aqf : aqf.values()) {
/*      */         
/*  670 */         Multimap<arg, arj> multimap = a(aqf);
/*  671 */         if (!multimap.isEmpty()) {
/*  672 */           list.add(oe.d);
/*  673 */           list.add((new of("item.modifiers." + aqf.d())).a(k.h));
/*  674 */           for (Map.Entry<arg, arj> entry : (Iterable<Map.Entry<arg, arj>>)multimap.entries()) {
/*  675 */             double d2; arj arj = entry.getValue();
/*  676 */             double d1 = arj.d();
/*      */             
/*  678 */             boolean bool = false;
/*      */             
/*  680 */             if (☃ != null) {
/*  681 */               if (arj.a() == blx.f) {
/*  682 */                 d1 += ☃.c(arl.f);
/*  683 */                 d1 += bpu.a(this, aqq.a);
/*  684 */                 bool = true;
/*  685 */               } else if (arj.a() == blx.g) {
/*  686 */                 d1 += ☃.c(arl.h);
/*  687 */                 bool = true;
/*      */               } 
/*      */             }
/*      */             
/*  691 */             if (arj.c() == arj.a.b || arj.c() == arj.a.c) {
/*  692 */               d2 = d1 * 100.0D;
/*  693 */             } else if (((arg)entry.getKey()).equals(arl.c)) {
/*  694 */               d2 = d1 * 10.0D;
/*      */             } else {
/*  696 */               d2 = d1;
/*      */             } 
/*      */             
/*  699 */             if (bool) {
/*  700 */               list.add((new oe(" "))
/*  701 */                   .a(new of("attribute.modifier.equals." + arj
/*  702 */                       .c().a(), new Object[] { c
/*  703 */                         .format(d2), new of(((arg)entry
/*  704 */                           .getKey()).c())
/*      */                       
/*  706 */                       })).a(k.c)); continue;
/*      */             } 
/*  708 */             if (d1 > 0.0D) {
/*  709 */               list.add((new of("attribute.modifier.plus." + arj
/*  710 */                     .c().a(), new Object[] { c
/*  711 */                       .format(d2), new of(((arg)entry
/*  712 */                         .getKey()).c())
/*  713 */                     })).a(k.j)); continue;
/*      */             } 
/*  715 */             if (d1 < 0.0D) {
/*  716 */               d2 *= -1.0D;
/*  717 */               list.add((new of("attribute.modifier.take." + arj
/*  718 */                     .c().a(), new Object[] { c
/*  719 */                       .format(d2), new of(((arg)entry
/*  720 */                         .getKey()).c())
/*  721 */                     })).a(k.m));
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*  729 */     if (n()) {
/*  730 */       if (a(i, a.c) && this.i.q("Unbreakable")) {
/*  731 */         list.add((new of("item.unbreakable")).a(k.j));
/*      */       }
/*      */       
/*  734 */       if (a(i, a.d) && this.i.c("CanDestroy", 9)) {
/*  735 */         mj mj = this.i.d("CanDestroy", 8);
/*  736 */         if (!mj.isEmpty()) {
/*  737 */           list.add(oe.d);
/*  738 */           list.add((new of("item.canBreak")).a(k.h));
/*  739 */           for (int j = 0; j < mj.size(); j++) {
/*  740 */             list.addAll(d(mj.j(j)));
/*      */           }
/*      */         } 
/*      */       } 
/*      */       
/*  745 */       if (a(i, a.e) && this.i.c("CanPlaceOn", 9)) {
/*  746 */         mj mj = this.i.d("CanPlaceOn", 8);
/*  747 */         if (!mj.isEmpty()) {
/*  748 */           list.add(oe.d);
/*  749 */           list.add((new of("item.canPlace")).a(k.h));
/*  750 */           for (int j = 0; j < mj.size(); j++) {
/*  751 */             list.addAll(d(mj.j(j)));
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  757 */     if (bnl1.a()) {
/*  758 */       if (f()) {
/*  759 */         list.add(new of("item.durability", new Object[] { Integer.valueOf(h() - g()), Integer.valueOf(h()) }));
/*      */       }
/*  761 */       list.add((new oe(gm.T.b(b()).toString())).a(k.i));
/*  762 */       if (n()) {
/*  763 */         list.add((new of("item.nbt_tags", new Object[] { Integer.valueOf(this.i.d().size()) })).a(k.i));
/*      */       }
/*      */     } 
/*      */     
/*  767 */     return list;
/*      */   }
/*      */   
/*      */   private static boolean a(int ☃, a a1) {
/*  771 */     return ((☃ & a1.a()) == 0);
/*      */   }
/*      */   
/*      */   private int J() {
/*  775 */     if (n() && this.i.c("HideFlags", 99)) {
/*  776 */       return this.i.h("HideFlags");
/*      */     }
/*  778 */     return 0;
/*      */   }
/*      */   
/*      */   public void a(a ☃) {
/*  782 */     md md1 = p();
/*  783 */     md1.b("HideFlags", md1.h("HideFlags") | ☃.a());
/*      */   }
/*      */   
/*      */   public static void a(List<nr> ☃, mj mj1) {
/*  787 */     for (int i = 0; i < mj1.size(); i++) {
/*  788 */       md md1 = mj1.a(i);
/*      */       
/*  790 */       gm.R.b(vk.a(md1.l("id")))
/*  791 */         .ifPresent(bps1 -> ☃.add(bps1.d(md1.h("lvl"))));
/*      */     } 
/*      */   }
/*      */   
/*      */   private static Collection<nr> d(String ☃) {
/*      */     try {
/*  797 */       ei ei = (new ei(new StringReader(☃), true)).a(true);
/*  798 */       ceh ceh = ei.b();
/*  799 */       vk vk = ei.d();
/*      */       
/*  801 */       boolean bool1 = (ceh != null);
/*  802 */       boolean bool2 = (vk != null);
/*  803 */       if (bool1 || bool2) {
/*  804 */         if (bool1) {
/*  805 */           return Lists.newArrayList((Object[])new nr[] { ceh.b().g().a(k.i) });
/*      */         }
/*      */         
/*  808 */         ael<buo> ael = aed.a().a(vk);
/*  809 */         if (ael != null) {
/*  810 */           Collection<buo> collection = ael.b();
/*  811 */           if (!collection.isEmpty()) {
/*  812 */             return (Collection<nr>)collection.stream().map(buo::g).map(☃ -> ☃.a(k.i)).collect(Collectors.toList());
/*      */           }
/*      */         } 
/*      */       } 
/*  816 */     } catch (CommandSyntaxException commandSyntaxException) {}
/*      */     
/*  818 */     return Lists.newArrayList((Object[])new nr[] { (new oe("missingno")).a(k.i) });
/*      */   }
/*      */   
/*      */   public boolean u() {
/*  822 */     return b().e(this);
/*      */   }
/*      */   
/*      */   public bmp v() {
/*  826 */     return b().i(this);
/*      */   }
/*      */   
/*      */   public boolean w() {
/*  830 */     if (!b().f_(this)) {
/*  831 */       return false;
/*      */     }
/*  833 */     if (x()) {
/*  834 */       return false;
/*      */     }
/*  836 */     return true;
/*      */   }
/*      */   
/*      */   public void a(bps ☃, int i) {
/*  840 */     p();
/*  841 */     if (!this.i.c("Enchantments", 9)) {
/*  842 */       this.i.a("Enchantments", new mj());
/*      */     }
/*  844 */     mj mj = this.i.d("Enchantments", 10);
/*  845 */     md md1 = new md();
/*  846 */     md1.a("id", String.valueOf(gm.R.b(☃)));
/*  847 */     md1.a("lvl", (short)(byte)i);
/*  848 */     mj.add(md1);
/*      */   }
/*      */   
/*      */   public boolean x() {
/*  852 */     if (this.i != null && this.i.c("Enchantments", 9)) {
/*  853 */       return !this.i.d("Enchantments", 10).isEmpty();
/*      */     }
/*  855 */     return false;
/*      */   }
/*      */   
/*      */   public void a(String ☃, mt mt1) {
/*  859 */     p().a(☃, mt1);
/*      */   }
/*      */   
/*      */   public boolean y() {
/*  863 */     return this.k instanceof bcp;
/*      */   }
/*      */   
/*      */   public void a(@Nullable aqa ☃) {
/*  867 */     this.k = ☃;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public bcp z() {
/*  872 */     return (this.k instanceof bcp) ? (bcp)A() : null;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aqa A() {
/*  877 */     return !this.j ? this.k : null;
/*      */   }
/*      */   
/*      */   public int B() {
/*  881 */     if (n() && this.i.c("RepairCost", 3)) {
/*  882 */       return this.i.h("RepairCost");
/*      */     }
/*  884 */     return 0;
/*      */   }
/*      */   
/*      */   public void c(int ☃) {
/*  888 */     p().b("RepairCost", ☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public Multimap<arg, arj> a(aqf ☃) {
/*      */     Multimap<arg, arj> multimap;
/*  894 */     if (n() && this.i.c("AttributeModifiers", 9))
/*  895 */     { HashMultimap hashMultimap = HashMultimap.create();
/*  896 */       mj mj = this.i.d("AttributeModifiers", 10);
/*      */       
/*  898 */       for (int i = 0; i < mj.size(); i++) {
/*  899 */         md md1 = mj.a(i);
/*  900 */         if (!md1.c("Slot", 8) || 
/*  901 */           md1.l("Slot").equals(☃.d())) {
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  906 */           Optional<arg> optional = gm.af.b(vk.a(md1.l("AttributeName")));
/*  907 */           if (optional.isPresent()) {
/*      */ 
/*      */ 
/*      */             
/*  911 */             arj arj = arj.a(md1);
/*  912 */             if (arj != null)
/*      */             {
/*      */ 
/*      */               
/*  916 */               if (arj.a().getLeastSignificantBits() != 0L && arj.a().getMostSignificantBits() != 0L)
/*  917 */                 hashMultimap.put(optional.get(), arj);  } 
/*      */           } 
/*      */         } 
/*      */       }  }
/*  921 */     else { multimap = b().a(☃); }
/*      */ 
/*      */     
/*  924 */     return multimap;
/*      */   }
/*      */   
/*      */   public void a(arg ☃, arj arj1, @Nullable aqf aqf1) {
/*  928 */     p();
/*  929 */     if (!this.i.c("AttributeModifiers", 9)) {
/*  930 */       this.i.a("AttributeModifiers", new mj());
/*      */     }
/*  932 */     mj mj = this.i.d("AttributeModifiers", 10);
/*  933 */     md md1 = arj1.e();
/*  934 */     md1.a("AttributeName", gm.af.b(☃).toString());
/*  935 */     if (aqf1 != null) {
/*  936 */       md1.a("Slot", aqf1.d());
/*      */     }
/*  938 */     mj.add(md1);
/*      */   }
/*      */   
/*      */   public nr C() {
/*  942 */     nx ☃ = (new oe("")).a(r());
/*  943 */     if (t()) {
/*  944 */       ☃.a(k.u);
/*      */     }
/*      */     
/*  947 */     nx nx1 = ns.a(☃);
/*      */     
/*  949 */     if (!this.j) {
/*  950 */       nx1.a((v()).e).a(☃ -> ☃.a(new nv((nv.a)nv.a.b, (T)new nv.c(this))));
/*      */     }
/*      */     
/*  953 */     return nx1;
/*      */   }
/*      */   
/*      */   private static boolean a(cel ☃, @Nullable cel cel1) {
/*  957 */     if (cel1 == null || ☃.a() != cel1.a()) {
/*  958 */       return false;
/*      */     }
/*  960 */     if (☃.b() == null && cel1.b() == null) {
/*  961 */       return true;
/*      */     }
/*  963 */     if (☃.b() == null || cel1.b() == null) {
/*  964 */       return false;
/*      */     }
/*  966 */     return Objects.equals(☃.b().a(new md()), cel1.b().a(new md()));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(aen ☃, cel cel1) {
/*  974 */     if (a(cel1, this.l)) {
/*  975 */       return this.m;
/*      */     }
/*      */     
/*  978 */     this.l = cel1;
/*      */     
/*  980 */     if (n() && this.i.c("CanDestroy", 9)) {
/*  981 */       mj mj = this.i.d("CanDestroy", 8);
/*  982 */       for (int i = 0; i < mj.size(); i++) {
/*  983 */         String str = mj.j(i);
/*      */         try {
/*  985 */           Predicate<cel> predicate = eg.a().a(new StringReader(str)).create(☃);
/*  986 */           if (predicate.test(cel1)) {
/*  987 */             this.m = true;
/*  988 */             return true;
/*      */           } 
/*  990 */         } catch (CommandSyntaxException commandSyntaxException) {}
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  995 */     this.m = false;
/*  996 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean b(aen ☃, cel cel1) {
/* 1004 */     if (a(cel1, this.n)) {
/* 1005 */       return this.o;
/*      */     }
/*      */     
/* 1008 */     this.n = cel1;
/*      */     
/* 1010 */     if (n() && this.i.c("CanPlaceOn", 9)) {
/* 1011 */       mj mj = this.i.d("CanPlaceOn", 8);
/* 1012 */       for (int i = 0; i < mj.size(); i++) {
/* 1013 */         String str = mj.j(i);
/*      */         try {
/* 1015 */           Predicate<cel> predicate = eg.a().a(new StringReader(str)).create(☃);
/* 1016 */           if (predicate.test(cel1)) {
/* 1017 */             this.o = true;
/* 1018 */             return true;
/*      */           } 
/* 1020 */         } catch (CommandSyntaxException commandSyntaxException) {}
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 1025 */     this.o = false;
/* 1026 */     return false;
/*      */   }
/*      */   
/*      */   public int D() {
/* 1030 */     return this.g;
/*      */   }
/*      */   
/*      */   public void d(int ☃) {
/* 1034 */     this.g = ☃;
/*      */   }
/*      */   
/*      */   public int E() {
/* 1038 */     return this.j ? 0 : this.f;
/*      */   }
/*      */   
/*      */   public void e(int ☃) {
/* 1042 */     this.f = ☃;
/*      */     
/* 1044 */     I();
/*      */   }
/*      */   
/*      */   public void f(int ☃) {
/* 1048 */     e(this.f + ☃);
/*      */   }
/*      */   
/*      */   public void g(int ☃) {
/* 1052 */     f(-☃);
/*      */   }
/*      */   
/*      */   public void b(brx ☃, aqm aqm1, int i) {
/* 1056 */     b().a(☃, aqm1, this, i);
/*      */   }
/*      */   
/*      */   public boolean F() {
/* 1060 */     return b().s();
/*      */   }
/*      */   
/*      */   public adp G() {
/* 1064 */     return b().ae_();
/*      */   }
/*      */   
/*      */   public adp H() {
/* 1068 */     return b().ad_();
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bmb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */