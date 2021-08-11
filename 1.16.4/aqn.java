/*      */ import com.google.common.collect.Maps;
/*      */ import java.util.Arrays;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Optional;
/*      */ import java.util.Random;
/*      */ import java.util.UUID;
/*      */ import javax.annotation.Nullable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public abstract class aqn
/*      */   extends aqm
/*      */ {
/*   80 */   private static final us<Byte> b = uv.a((Class)aqn.class, uu.a);
/*      */   
/*      */   public int e;
/*      */   
/*      */   protected int f;
/*      */   
/*      */   protected ava g;
/*      */   
/*      */   protected avb bh;
/*      */   
/*      */   protected auz bi;
/*      */   
/*      */   private final auu c;
/*      */   
/*      */   protected ayj bj;
/*      */   
/*      */   protected final avw bk;
/*      */   
/*      */   protected final avw bl;
/*      */   
/*      */   private aqm d;
/*      */   
/*      */   private final aza bo;
/*  103 */   private final gj<bmb> bp = gj.a(2, bmb.b);
/*  104 */   protected final float[] bm = new float[2];
/*  105 */   private final gj<bmb> bq = gj.a(4, bmb.b);
/*  106 */   protected final float[] bn = new float[4];
/*      */   private boolean br;
/*      */   private boolean bs;
/*  109 */   private final Map<cwz, Float> bt = Maps.newEnumMap(cwz.class);
/*      */   
/*      */   private vk bu;
/*      */   
/*      */   private long bv;
/*      */   
/*      */   @Nullable
/*      */   private aqa bw;
/*      */   
/*      */   private int bx;
/*      */   @Nullable
/*      */   private md by;
/*  121 */   private fx bz = fx.b;
/*  122 */   private float bA = -1.0F;
/*      */   
/*      */   protected aqn(aqe<? extends aqn> ☃, brx brx1) {
/*  125 */     super((aqe)☃, brx1);
/*      */     
/*  127 */     this.bk = new avw(brx1.aa());
/*  128 */     this.bl = new avw(brx1.aa());
/*  129 */     this.g = new ava(this);
/*  130 */     this.bh = new avb(this);
/*  131 */     this.bi = new auz(this);
/*  132 */     this.c = r();
/*  133 */     this.bj = b(brx1);
/*  134 */     this.bo = new aza(this);
/*      */     
/*  136 */     Arrays.fill(this.bn, 0.085F);
/*  137 */     Arrays.fill(this.bm, 0.085F);
/*      */     
/*  139 */     if (brx1 != null && !brx1.v) {
/*  140 */       o();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   protected void o() {}
/*      */   
/*      */   public static ark.a p() {
/*  148 */     return aqm.cL()
/*  149 */       .a(arl.b, 16.0D)
/*  150 */       .a(arl.g);
/*      */   }
/*      */   
/*      */   protected ayj b(brx ☃) {
/*  154 */     return new ayi(this, ☃);
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
/*      */   protected boolean q() {
/*  167 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float a(cwz ☃) {
/*      */     aqn aqn1;
/*  175 */     if (ct() instanceof aqn && ((aqn)ct()).q()) {
/*  176 */       aqn1 = (aqn)ct();
/*      */     } else {
/*  178 */       aqn1 = this;
/*      */     } 
/*      */     
/*  181 */     Float float_ = aqn1.bt.get(☃);
/*  182 */     return (float_ == null) ? ☃.a() : float_.floatValue();
/*      */   }
/*      */   
/*      */   public void a(cwz ☃, float f) {
/*  186 */     this.bt.put(☃, Float.valueOf(f));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean b(cwz ☃) {
/*  196 */     return (☃ != cwz.l && ☃ != cwz.n && ☃ != cwz.p && ☃ != cwz.d);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected auu r() {
/*  203 */     return new auu(this);
/*      */   }
/*      */   
/*      */   public ava t() {
/*  207 */     return this.g;
/*      */   }
/*      */   
/*      */   public avb u() {
/*  211 */     if (br() && ct() instanceof aqn) {
/*  212 */       aqn ☃ = (aqn)ct();
/*  213 */       return ☃.u();
/*      */     } 
/*  215 */     return this.bh;
/*      */   }
/*      */   
/*      */   public auz v() {
/*  219 */     return this.bi;
/*      */   }
/*      */   
/*      */   public ayj x() {
/*  223 */     if (br() && ct() instanceof aqn) {
/*  224 */       aqn ☃ = (aqn)ct();
/*  225 */       return ☃.x();
/*      */     } 
/*  227 */     return this.bj;
/*      */   }
/*      */   
/*      */   public aza z() {
/*  231 */     return this.bo;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aqm A() {
/*  236 */     return this.d;
/*      */   }
/*      */   
/*      */   public void h(@Nullable aqm ☃) {
/*  240 */     this.d = ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(aqe<?> ☃) {
/*  245 */     return (☃ != aqe.D);
/*      */   }
/*      */   
/*      */   public boolean a(bmo ☃) {
/*  249 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void B() {}
/*      */ 
/*      */   
/*      */   protected void e() {
/*  258 */     super.e();
/*  259 */     this.R.a(b, Byte.valueOf((byte)0));
/*      */   }
/*      */   
/*      */   public int D() {
/*  263 */     return 80;
/*      */   }
/*      */   
/*      */   public void F() {
/*  267 */     adp ☃ = I();
/*  268 */     if (☃ != null) {
/*  269 */       a(☃, dG(), dH());
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void ag() {
/*  275 */     super.ag();
/*      */     
/*  277 */     this.l.Z().a("mobBaseTick");
/*  278 */     if (aX() && this.J.nextInt(1000) < this.e++) {
/*  279 */       m();
/*  280 */       F();
/*      */     } 
/*  282 */     this.l.Z().c();
/*      */   }
/*      */ 
/*      */   
/*      */   protected void c(apk ☃) {
/*  287 */     m();
/*  288 */     super.c(☃);
/*      */   }
/*      */   
/*      */   private void m() {
/*  292 */     this.e = -D();
/*      */   }
/*      */ 
/*      */   
/*      */   protected int d(bfw ☃) {
/*  297 */     if (this.f > 0) {
/*  298 */       int i = this.f;
/*      */       int j;
/*  300 */       for (j = 0; j < this.bq.size(); j++) {
/*  301 */         if (!((bmb)this.bq.get(j)).a() && this.bn[j] <= 1.0F) {
/*  302 */           i += 1 + this.J.nextInt(3);
/*      */         }
/*      */       } 
/*  305 */       for (j = 0; j < this.bp.size(); j++) {
/*  306 */         if (!((bmb)this.bp.get(j)).a() && this.bm[j] <= 1.0F) {
/*  307 */           i += 1 + this.J.nextInt(3);
/*      */         }
/*      */       } 
/*      */       
/*  311 */       return i;
/*      */     } 
/*  313 */     return this.f;
/*      */   }
/*      */ 
/*      */   
/*      */   public void G() {
/*  318 */     if (this.l.v) {
/*  319 */       for (int ☃ = 0; ☃ < 20; ☃++) {
/*  320 */         double d1 = this.J.nextGaussian() * 0.02D;
/*  321 */         double d2 = this.J.nextGaussian() * 0.02D;
/*  322 */         double d3 = this.J.nextGaussian() * 0.02D;
/*  323 */         double d4 = 10.0D;
/*  324 */         this.l.a(hh.P, c(1.0D) - d1 * 10.0D, cF() - d2 * 10.0D, g(1.0D) - d3 * 10.0D, d1, d2, d3);
/*      */       } 
/*      */     } else {
/*  327 */       this.l.a(this, (byte)20);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(byte ☃) {
/*  333 */     if (☃ == 20) {
/*  334 */       G();
/*      */     } else {
/*  336 */       super.a(☃);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void j() {
/*  342 */     super.j();
/*      */     
/*  344 */     if (!this.l.v) {
/*  345 */       eA();
/*      */       
/*  347 */       if (this.K % 5 == 0) {
/*  348 */         H();
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void H() {
/*  357 */     boolean ☃ = !(cm() instanceof aqn);
/*  358 */     boolean bool1 = !(ct() instanceof bhn);
/*  359 */     this.bk.a(avv.a.a, ☃);
/*  360 */     this.bk.a(avv.a.c, (☃ && bool1));
/*  361 */     this.bk.a(avv.a.b, ☃);
/*      */   }
/*      */ 
/*      */   
/*      */   protected float f(float ☃, float f1) {
/*  366 */     this.c.a();
/*  367 */     return f1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   protected adp I() {
/*  377 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(md ☃) {
/*  382 */     super.b(☃);
/*  383 */     ☃.a("CanPickUpLoot", et());
/*  384 */     ☃.a("PersistenceRequired", this.bs);
/*      */     
/*  386 */     mj mj1 = new mj();
/*  387 */     for (bmb bmb : this.bq) {
/*  388 */       md md1 = new md();
/*  389 */       if (!bmb.a()) {
/*  390 */         bmb.b(md1);
/*      */       }
/*  392 */       mj1.add(md1);
/*      */     } 
/*  394 */     ☃.a("ArmorItems", mj1);
/*      */     
/*  396 */     mj mj2 = new mj();
/*  397 */     for (bmb bmb : this.bp) {
/*  398 */       md md1 = new md();
/*  399 */       if (!bmb.a()) {
/*  400 */         bmb.b(md1);
/*      */       }
/*  402 */       mj2.add(md1);
/*      */     } 
/*  404 */     ☃.a("HandItems", mj2);
/*      */     
/*  406 */     mj mj3 = new mj();
/*  407 */     for (float f : this.bn) {
/*  408 */       mj3.add(mg.a(f));
/*      */     }
/*  410 */     ☃.a("ArmorDropChances", mj3);
/*      */     
/*  412 */     mj mj4 = new mj();
/*  413 */     for (float f : this.bm) {
/*  414 */       mj4.add(mg.a(f));
/*      */     }
/*  416 */     ☃.a("HandDropChances", mj4);
/*      */     
/*  418 */     if (this.bw != null) {
/*  419 */       md md1 = new md();
/*  420 */       if (this.bw instanceof aqm) {
/*      */         
/*  422 */         UUID uUID = this.bw.bS();
/*  423 */         md1.a("UUID", uUID);
/*  424 */       } else if (this.bw instanceof bco) {
/*      */         
/*  426 */         fx fx1 = ((bco)this.bw).n();
/*  427 */         md1.b("X", fx1.u());
/*  428 */         md1.b("Y", fx1.v());
/*  429 */         md1.b("Z", fx1.w());
/*      */       } 
/*  431 */       ☃.a("Leash", md1);
/*  432 */     } else if (this.by != null) {
/*  433 */       ☃.a("Leash", this.by.g());
/*      */     } 
/*      */     
/*  436 */     ☃.a("LeftHanded", eE());
/*      */     
/*  438 */     if (this.bu != null) {
/*  439 */       ☃.a("DeathLootTable", this.bu.toString());
/*  440 */       if (this.bv != 0L) {
/*  441 */         ☃.a("DeathLootTableSeed", this.bv);
/*      */       }
/*      */     } 
/*      */     
/*  445 */     if (eD()) {
/*  446 */       ☃.a("NoAI", eD());
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(md ☃) {
/*  452 */     super.a(☃);
/*      */     
/*  454 */     if (☃.c("CanPickUpLoot", 1)) {
/*  455 */       p(☃.q("CanPickUpLoot"));
/*      */     }
/*  457 */     this.bs = ☃.q("PersistenceRequired");
/*      */     
/*  459 */     if (☃.c("ArmorItems", 9)) {
/*  460 */       mj mj = ☃.d("ArmorItems", 10);
/*      */       
/*  462 */       for (int i = 0; i < this.bq.size(); i++) {
/*  463 */         this.bq.set(i, bmb.a(mj.a(i)));
/*      */       }
/*      */     } 
/*  466 */     if (☃.c("HandItems", 9)) {
/*  467 */       mj mj = ☃.d("HandItems", 10);
/*      */       
/*  469 */       for (int i = 0; i < this.bp.size(); i++) {
/*  470 */         this.bp.set(i, bmb.a(mj.a(i)));
/*      */       }
/*      */     } 
/*      */     
/*  474 */     if (☃.c("ArmorDropChances", 9)) {
/*  475 */       mj mj = ☃.d("ArmorDropChances", 5);
/*  476 */       for (int i = 0; i < mj.size(); i++) {
/*  477 */         this.bn[i] = mj.i(i);
/*      */       }
/*      */     } 
/*  480 */     if (☃.c("HandDropChances", 9)) {
/*  481 */       mj mj = ☃.d("HandDropChances", 5);
/*  482 */       for (int i = 0; i < mj.size(); i++) {
/*  483 */         this.bm[i] = mj.i(i);
/*      */       }
/*      */     } 
/*      */     
/*  487 */     if (☃.c("Leash", 10)) {
/*  488 */       this.by = ☃.p("Leash");
/*      */     }
/*      */     
/*  491 */     r(☃.q("LeftHanded"));
/*      */     
/*  493 */     if (☃.c("DeathLootTable", 8)) {
/*  494 */       this.bu = new vk(☃.l("DeathLootTable"));
/*  495 */       this.bv = ☃.i("DeathLootTableSeed");
/*      */     } 
/*      */     
/*  498 */     q(☃.q("NoAI"));
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(apk ☃, boolean bool) {
/*  503 */     super.a(☃, bool);
/*  504 */     this.bu = null;
/*      */   }
/*      */ 
/*      */   
/*      */   protected cyv.a a(boolean ☃, apk apk1) {
/*  509 */     return super.a(☃, apk1)
/*  510 */       .a(this.bv, this.J);
/*      */   }
/*      */ 
/*      */   
/*      */   public final vk dp() {
/*  515 */     return (this.bu == null) ? J() : this.bu;
/*      */   }
/*      */   
/*      */   protected vk J() {
/*  519 */     return super.dp();
/*      */   }
/*      */   
/*      */   public void t(float ☃) {
/*  523 */     this.aT = ☃;
/*      */   }
/*      */   
/*      */   public void u(float ☃) {
/*  527 */     this.aS = ☃;
/*      */   }
/*      */   
/*      */   public void v(float ☃) {
/*  531 */     this.aR = ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   public void q(float ☃) {
/*  536 */     super.q(☃);
/*  537 */     t(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public void k() {
/*  542 */     super.k();
/*      */     
/*  544 */     this.l.Z().a("looting");
/*      */     
/*  546 */     if (!this.l.v && et() && aX() && !this.aH && this.l.V().b(brt.b)) {
/*  547 */       List<bcv> ☃ = this.l.a(bcv.class, cc().c(1.0D, 0.0D, 1.0D));
/*  548 */       for (bcv bcv : ☃) {
/*  549 */         if (bcv.y || bcv.g().a() || bcv.p()) {
/*      */           continue;
/*      */         }
/*  552 */         if (i(bcv.g())) {
/*  553 */           b(bcv);
/*      */         }
/*      */       } 
/*      */     } 
/*  557 */     this.l.Z().c();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void b(bcv ☃) {
/*  564 */     bmb bmb = ☃.g();
/*  565 */     if (g(bmb)) {
/*  566 */       a(☃);
/*  567 */       a(☃, bmb.E());
/*  568 */       ☃.ad();
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean g(bmb ☃) {
/*  573 */     aqf aqf = j(☃);
/*  574 */     bmb bmb1 = b(aqf);
/*  575 */     boolean bool = a(☃, bmb1);
/*      */     
/*  577 */     if (bool && h(☃)) {
/*  578 */       double d = e(aqf);
/*  579 */       if (!bmb1.a() && Math.max(this.J.nextFloat() - 0.1F, 0.0F) < d) {
/*  580 */         a(bmb1);
/*      */       }
/*  582 */       b(aqf, ☃);
/*  583 */       b(☃);
/*  584 */       return true;
/*      */     } 
/*  586 */     return false;
/*      */   }
/*      */   
/*      */   protected void b(aqf ☃, bmb bmb1) {
/*  590 */     a(☃, bmb1);
/*  591 */     d(☃);
/*  592 */     this.bs = true;
/*      */   }
/*      */   
/*      */   public void d(aqf ☃) {
/*  596 */     switch (null.a[☃.a().ordinal()]) {
/*      */       case 1:
/*  598 */         this.bm[☃.b()] = 2.0F;
/*      */         break;
/*      */       case 2:
/*  601 */         this.bn[☃.b()] = 2.0F;
/*      */         break;
/*      */     } 
/*      */   }
/*      */   
/*      */   protected boolean a(bmb ☃, bmb bmb1) {
/*  607 */     if (bmb1.a()) {
/*  608 */       return true;
/*      */     }
/*      */     
/*  611 */     if (☃.b() instanceof bnf) {
/*  612 */       if (!(bmb1.b() instanceof bnf)) {
/*  613 */         return true;
/*      */       }
/*  615 */       bnf bnf1 = (bnf)☃.b();
/*  616 */       bnf bnf2 = (bnf)bmb1.b();
/*  617 */       if (bnf1.f() != bnf2.f()) {
/*  618 */         return (bnf1.f() > bnf2.f());
/*      */       }
/*  620 */       return b(☃, bmb1);
/*      */     } 
/*  622 */     if (☃.b() instanceof bkm && bmb1.b() instanceof bkm)
/*  623 */       return b(☃, bmb1); 
/*  624 */     if (☃.b() instanceof bkt && bmb1.b() instanceof bkt)
/*  625 */       return b(☃, bmb1); 
/*  626 */     if (☃.b() instanceof bjy) {
/*  627 */       if (bpu.d(bmb1))
/*  628 */         return false; 
/*  629 */       if (!(bmb1.b() instanceof bjy)) {
/*  630 */         return true;
/*      */       }
/*  632 */       bjy bjy1 = (bjy)☃.b();
/*  633 */       bjy bjy2 = (bjy)bmb1.b();
/*  634 */       if (bjy1.e() != bjy2.e())
/*  635 */         return (bjy1.e() > bjy2.e()); 
/*  636 */       if (bjy1.f() != bjy2.f()) {
/*  637 */         return (bjy1.f() > bjy2.f());
/*      */       }
/*  639 */       return b(☃, bmb1);
/*      */     } 
/*  641 */     if (☃.b() instanceof bkv) {
/*  642 */       if (bmb1.b() instanceof bkh)
/*  643 */         return true; 
/*  644 */       if (bmb1.b() instanceof bkv) {
/*  645 */         bkv bkv1 = (bkv)☃.b();
/*  646 */         bkv bkv2 = (bkv)bmb1.b();
/*  647 */         if (bkv1.d() != bkv2.d()) {
/*  648 */           return (bkv1.d() > bkv2.d());
/*      */         }
/*  650 */         return b(☃, bmb1);
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  655 */     return false;
/*      */   }
/*      */   
/*      */   public boolean b(bmb ☃, bmb bmb1) {
/*  659 */     if (☃.g() < bmb1.g() || (☃.n() && !bmb1.n()))
/*  660 */       return true; 
/*  661 */     if (☃.n() && bmb1.n())
/*      */     {
/*  663 */       return (☃.o().d().stream().anyMatch(☃ -> !☃.equals("Damage")) && !bmb1.o().d().stream().anyMatch(☃ -> !☃.equals("Damage")));
/*      */     }
/*  665 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean h(bmb ☃) {
/*  670 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean i(bmb ☃) {
/*  675 */     return h(☃);
/*      */   }
/*      */   
/*      */   public boolean h(double ☃) {
/*  679 */     return true;
/*      */   }
/*      */   
/*      */   public boolean K() {
/*  683 */     return br();
/*      */   }
/*      */   
/*      */   protected boolean L() {
/*  687 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public void cI() {
/*  692 */     if (this.l.ad() == aor.a && L()) {
/*  693 */       ad();
/*      */       
/*      */       return;
/*      */     } 
/*  697 */     if (eu() || K()) {
/*  698 */       this.aI = 0;
/*      */       
/*      */       return;
/*      */     } 
/*  702 */     aqa ☃ = this.l.a(this, -1.0D);
/*  703 */     if (☃ != null) {
/*  704 */       double d = ☃.h(this);
/*  705 */       int i = X().e().f();
/*  706 */       int j = i * i;
/*      */       
/*  708 */       if (d > j && h(d)) {
/*  709 */         ad();
/*      */       }
/*      */       
/*  712 */       int k = X().e().g();
/*  713 */       int m = k * k;
/*  714 */       if (this.aI > 600 && this.J.nextInt(800) == 0 && d > m && h(d)) {
/*  715 */         ad();
/*  716 */       } else if (d < m) {
/*  717 */         this.aI = 0;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected final void dP() {
/*  725 */     this.aI++;
/*      */     
/*  727 */     this.l.Z().a("sensing");
/*  728 */     this.bo.a();
/*  729 */     this.l.Z().c();
/*      */     
/*  731 */     this.l.Z().a("targetSelector");
/*  732 */     this.bl.b();
/*  733 */     this.l.Z().c();
/*      */     
/*  735 */     this.l.Z().a("goalSelector");
/*  736 */     this.bk.b();
/*  737 */     this.l.Z().c();
/*      */     
/*  739 */     this.l.Z().a("navigation");
/*  740 */     this.bj.c();
/*  741 */     this.l.Z().c();
/*      */     
/*  743 */     this.l.Z().a("mob tick");
/*  744 */     N();
/*  745 */     this.l.Z().c();
/*      */     
/*  747 */     this.l.Z().a("controls");
/*  748 */     this.l.Z().a("move");
/*  749 */     this.bh.a();
/*  750 */     this.l.Z().b("look");
/*  751 */     this.g.a();
/*  752 */     this.l.Z().b("jump");
/*  753 */     this.bi.b();
/*  754 */     this.l.Z().c();
/*  755 */     this.l.Z().c();
/*      */     
/*  757 */     M();
/*      */   }
/*      */   
/*      */   protected void M() {
/*  761 */     rz.a(this.l, this, this.bk);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void N() {}
/*      */   
/*      */   public int O() {
/*  768 */     return 40;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int Q() {
/*  775 */     return 75;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int ep() {
/*  782 */     return 10;
/*      */   }
/*      */   
/*      */   public void a(aqa ☃, float f1, float f2) {
/*  786 */     double d2, d1 = ☃.cD() - cD();
/*      */     
/*  788 */     double d3 = ☃.cH() - cH();
/*      */     
/*  790 */     if (☃ instanceof aqm) {
/*  791 */       aqm aqm1 = (aqm)☃;
/*  792 */       d2 = aqm1.cG() - cG();
/*      */     } else {
/*  794 */       d2 = ((☃.cc()).b + (☃.cc()).e) / 2.0D - cG();
/*      */     } 
/*      */     
/*  797 */     double d4 = afm.a(d1 * d1 + d3 * d3);
/*      */     
/*  799 */     float f3 = (float)(afm.d(d3, d1) * 57.2957763671875D) - 90.0F;
/*  800 */     float f4 = (float)-(afm.d(d2, d4) * 57.2957763671875D);
/*  801 */     this.q = a(this.q, f4, f2);
/*  802 */     this.p = a(this.p, f3, f1);
/*      */   }
/*      */   
/*      */   private float a(float ☃, float f1, float f2) {
/*  806 */     float f = afm.g(f1 - ☃);
/*  807 */     if (f > f2) {
/*  808 */       f = f2;
/*      */     }
/*  810 */     if (f < -f2) {
/*  811 */       f = -f2;
/*      */     }
/*  813 */     return ☃ + f;
/*      */   }
/*      */   
/*      */   public static boolean a(aqe<? extends aqn> ☃, bry bry1, aqp aqp1, fx fx1, Random random) {
/*  817 */     fx fx2 = fx1.c();
/*  818 */     return (aqp1 == aqp.c || bry1.d_(fx2).a(bry1, fx2, ☃));
/*      */   }
/*      */   
/*      */   public boolean a(bry ☃, aqp aqp1) {
/*  822 */     return true;
/*      */   }
/*      */   
/*      */   public boolean a(brz ☃) {
/*  826 */     return (!☃.d(cc()) && ☃.j(this));
/*      */   }
/*      */   
/*      */   public int eq() {
/*  830 */     return 4;
/*      */   }
/*      */   
/*      */   public boolean c(int ☃) {
/*  834 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public int bP() {
/*  839 */     if (A() == null) {
/*  840 */       return 3;
/*      */     }
/*  842 */     int ☃ = (int)(dk() - dx() * 0.33F);
/*  843 */     ☃ -= (3 - this.l.ad().a()) * 4;
/*  844 */     if (☃ < 0) {
/*  845 */       ☃ = 0;
/*      */     }
/*  847 */     return ☃ + 3;
/*      */   }
/*      */ 
/*      */   
/*      */   public Iterable<bmb> bn() {
/*  852 */     return this.bp;
/*      */   }
/*      */ 
/*      */   
/*      */   public Iterable<bmb> bo() {
/*  857 */     return this.bq;
/*      */   }
/*      */ 
/*      */   
/*      */   public bmb b(aqf ☃) {
/*  862 */     switch (null.a[☃.a().ordinal()]) {
/*      */       case 1:
/*  864 */         return this.bp.get(☃.b());
/*      */       case 2:
/*  866 */         return this.bq.get(☃.b());
/*      */     } 
/*  868 */     return bmb.b;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aqf ☃, bmb bmb1) {
/*  873 */     switch (null.a[☃.a().ordinal()]) {
/*      */       case 1:
/*  875 */         this.bp.set(☃.b(), bmb1);
/*      */         break;
/*      */       case 2:
/*  878 */         this.bq.set(☃.b(), bmb1);
/*      */         break;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(apk ☃, int i, boolean bool) {
/*  885 */     super.a(☃, i, bool);
/*  886 */     for (aqf aqf : aqf.values()) {
/*  887 */       bmb bmb = b(aqf);
/*  888 */       float f = e(aqf);
/*  889 */       boolean bool1 = (f > 1.0F);
/*  890 */       if (!bmb.a() && !bpu.e(bmb) && (bool || bool1) && Math.max(this.J.nextFloat() - i * 0.01F, 0.0F) < f) {
/*  891 */         if (!bool1 && bmb.e()) {
/*  892 */           bmb.b(bmb.h() - this.J.nextInt(1 + this.J.nextInt(Math.max(bmb.h() - 3, 1))));
/*      */         }
/*  894 */         a(bmb);
/*  895 */         a(aqf, bmb.b);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected float e(aqf ☃) {
/*  902 */     switch (null.a[☃.a().ordinal()])
/*      */     { case 1:
/*  904 */         f = this.bm[☃.b()];
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  914 */         return f;case 2: f = this.bn[☃.b()]; return f; }  float f = 0.0F; return f;
/*      */   }
/*      */   
/*      */   protected void a(aos ☃) {
/*  918 */     if (this.J.nextFloat() < 0.15F * ☃.d()) {
/*  919 */       int i = this.J.nextInt(2);
/*  920 */       float f = (this.l.ad() == aor.d) ? 0.1F : 0.25F;
/*  921 */       if (this.J.nextFloat() < 0.095F) {
/*  922 */         i++;
/*      */       }
/*  924 */       if (this.J.nextFloat() < 0.095F) {
/*  925 */         i++;
/*      */       }
/*  927 */       if (this.J.nextFloat() < 0.095F) {
/*  928 */         i++;
/*      */       }
/*      */       
/*  931 */       boolean bool = true;
/*  932 */       for (aqf aqf : aqf.values()) {
/*  933 */         if (aqf.a() == aqf.a.b) {
/*      */ 
/*      */           
/*  936 */           bmb bmb = b(aqf);
/*  937 */           if (!bool && this.J.nextFloat() < f) {
/*      */             break;
/*      */           }
/*  940 */           bool = false;
/*  941 */           if (bmb.a()) {
/*  942 */             blx blx = a(aqf, i);
/*  943 */             if (blx != null)
/*  944 */               a(aqf, new bmb(blx)); 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public static aqf j(bmb ☃) {
/*  952 */     blx blx = ☃.b();
/*  953 */     if (blx == bup.cU.h() || (blx instanceof bkh && ((bkh)blx).e() instanceof btq)) {
/*  954 */       return aqf.f;
/*      */     }
/*      */     
/*  957 */     if (blx instanceof bjy) {
/*  958 */       return ((bjy)blx).b();
/*      */     }
/*      */     
/*  961 */     if (blx == bmd.qo) {
/*  962 */       return aqf.e;
/*      */     }
/*      */     
/*  965 */     if (blx == bmd.qn) {
/*  966 */       return aqf.b;
/*      */     }
/*      */     
/*  969 */     return aqf.a;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public static blx a(aqf ☃, int i) {
/*  974 */     switch (null.b[☃.ordinal()]) {
/*      */       case 1:
/*  976 */         if (i == 0) {
/*  977 */           return bmd.kY;
/*      */         }
/*  979 */         if (i == 1) {
/*  980 */           return bmd.lo;
/*      */         }
/*  982 */         if (i == 2) {
/*  983 */           return bmd.lc;
/*      */         }
/*  985 */         if (i == 3) {
/*  986 */           return bmd.lg;
/*      */         }
/*  988 */         if (i == 4) {
/*  989 */           return bmd.lk;
/*      */         }
/*      */       case 2:
/*  992 */         if (i == 0) {
/*  993 */           return bmd.kZ;
/*      */         }
/*  995 */         if (i == 1) {
/*  996 */           return bmd.lp;
/*      */         }
/*  998 */         if (i == 2) {
/*  999 */           return bmd.ld;
/*      */         }
/* 1001 */         if (i == 3) {
/* 1002 */           return bmd.lh;
/*      */         }
/* 1004 */         if (i == 4) {
/* 1005 */           return bmd.ll;
/*      */         }
/*      */       case 3:
/* 1008 */         if (i == 0) {
/* 1009 */           return bmd.la;
/*      */         }
/* 1011 */         if (i == 1) {
/* 1012 */           return bmd.lq;
/*      */         }
/* 1014 */         if (i == 2) {
/* 1015 */           return bmd.le;
/*      */         }
/* 1017 */         if (i == 3) {
/* 1018 */           return bmd.li;
/*      */         }
/* 1020 */         if (i == 4) {
/* 1021 */           return bmd.lm;
/*      */         }
/*      */       case 4:
/* 1024 */         if (i == 0) {
/* 1025 */           return bmd.lb;
/*      */         }
/* 1027 */         if (i == 1) {
/* 1028 */           return bmd.lr;
/*      */         }
/* 1030 */         if (i == 2) {
/* 1031 */           return bmd.lf;
/*      */         }
/* 1033 */         if (i == 3) {
/* 1034 */           return bmd.lj;
/*      */         }
/* 1036 */         if (i == 4) {
/* 1037 */           return bmd.ln;
/*      */         }
/*      */         break;
/*      */     } 
/* 1041 */     return null;
/*      */   }
/*      */   
/*      */   protected void b(aos ☃) {
/* 1045 */     float f = ☃.d();
/*      */     
/* 1047 */     w(f);
/*      */     
/* 1049 */     for (aqf aqf : aqf.values()) {
/* 1050 */       if (aqf.a() == aqf.a.b)
/*      */       {
/*      */         
/* 1053 */         a(f, aqf); } 
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void w(float ☃) {
/* 1058 */     if (!dD().a() && this.J.nextFloat() < 0.25F * ☃) {
/* 1059 */       a(aqf.a, bpu.a(this.J, dD(), (int)(5.0F + ☃ * this.J.nextInt(18)), false));
/*      */     }
/*      */   }
/*      */   
/*      */   protected void a(float ☃, aqf aqf1) {
/* 1064 */     bmb bmb = b(aqf1);
/* 1065 */     if (!bmb.a() && this.J.nextFloat() < 0.5F * ☃) {
/* 1066 */       a(aqf1, bpu.a(this.J, bmb, (int)(5.0F + ☃ * this.J.nextInt(18)), false));
/*      */     }
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/* 1072 */     a(arl.b).c(new arj("Random spawn bonus", this.J.nextGaussian() * 0.05D, arj.a.b));
/*      */     
/* 1074 */     if (this.J.nextFloat() < 0.05F) {
/* 1075 */       r(true);
/*      */     } else {
/* 1077 */       r(false);
/*      */     } 
/*      */     
/* 1080 */     return arc1;
/*      */   }
/*      */   
/*      */   public boolean er() {
/* 1084 */     return false;
/*      */   }
/*      */   
/*      */   public void es() {
/* 1088 */     this.bs = true;
/*      */   }
/*      */   
/*      */   public void a(aqf ☃, float f) {
/* 1092 */     switch (null.a[☃.a().ordinal()]) {
/*      */       case 1:
/* 1094 */         this.bm[☃.b()] = f;
/*      */         break;
/*      */       case 2:
/* 1097 */         this.bn[☃.b()] = f;
/*      */         break;
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean et() {
/* 1103 */     return this.br;
/*      */   }
/*      */   
/*      */   public void p(boolean ☃) {
/* 1107 */     this.br = ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean e(bmb ☃) {
/* 1112 */     aqf aqf = j(☃);
/* 1113 */     return (b(aqf).a() && et());
/*      */   }
/*      */   
/*      */   public boolean eu() {
/* 1117 */     return this.bs;
/*      */   }
/*      */ 
/*      */   
/*      */   public final aou a(bfw ☃, aot aot1) {
/* 1122 */     if (!aX()) {
/* 1123 */       return aou.c;
/*      */     }
/*      */     
/* 1126 */     if (eC() == ☃) {
/* 1127 */       a(true, !☃.bC.d);
/* 1128 */       return aou.a(this.l.v);
/*      */     } 
/*      */     
/* 1131 */     aou aou = c(☃, aot1);
/* 1132 */     if (aou.a()) {
/* 1133 */       return aou;
/*      */     }
/*      */     
/* 1136 */     aou = b(☃, aot1);
/* 1137 */     if (aou.a()) {
/* 1138 */       return aou;
/*      */     }
/*      */     
/* 1141 */     return super.a(☃, aot1);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private aou c(bfw ☃, aot aot1) {
/* 1147 */     bmb bmb = ☃.b(aot1);
/* 1148 */     if (bmb.b() == bmd.pH && a(☃)) {
/* 1149 */       b(☃, true);
/* 1150 */       bmb.g(1);
/* 1151 */       return aou.a(this.l.v);
/*      */     } 
/*      */ 
/*      */     
/* 1155 */     if (bmb.b() == bmd.pI) {
/* 1156 */       aou aou = bmb.a(☃, this, aot1);
/* 1157 */       if (aou.a()) {
/* 1158 */         return aou;
/*      */       }
/*      */     } 
/*      */     
/* 1162 */     if (bmb.b() instanceof bna) {
/* 1163 */       if (this.l instanceof aag) {
/* 1164 */         bna bna = (bna)bmb.b();
/* 1165 */         Optional<aqn> optional = bna.a(☃, this, (aqe)X(), (aag)this.l, cA(), bmb);
/* 1166 */         optional.ifPresent(aqn1 -> a(☃, aqn1));
/* 1167 */         return optional.isPresent() ? aou.a : aou.c;
/*      */       } 
/*      */       
/* 1170 */       return aou.b;
/*      */     } 
/* 1172 */     return aou.c;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(bfw ☃, aqn aqn1) {}
/*      */   
/*      */   protected aou b(bfw ☃, aot aot1) {
/* 1179 */     return aou.c;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean ev() {
/* 1184 */     return a(cB());
/*      */   }
/*      */   
/*      */   public boolean a(fx ☃) {
/* 1188 */     if (this.bA == -1.0F) {
/* 1189 */       return true;
/*      */     }
/* 1191 */     return (this.bz.j(☃) < (this.bA * this.bA));
/*      */   }
/*      */   
/*      */   public void a(fx ☃, int i) {
/* 1195 */     this.bz = ☃;
/* 1196 */     this.bA = i;
/*      */   }
/*      */   
/*      */   public fx ew() {
/* 1200 */     return this.bz;
/*      */   }
/*      */   
/*      */   public float ex() {
/* 1204 */     return this.bA;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean ez() {
/* 1212 */     return (this.bA != -1.0F);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public <T extends aqn> T a(aqe<T> ☃, boolean bool) {
/* 1217 */     if (this.y) {
/* 1218 */       return null;
/*      */     }
/*      */     
/* 1221 */     aqn aqn1 = (aqn)☃.a(this.l);
/*      */     
/* 1223 */     aqn1.u(this);
/* 1224 */     aqn1.a(w_());
/* 1225 */     aqn1.q(eD());
/* 1226 */     if (S()) {
/* 1227 */       aqn1.a(T());
/* 1228 */       aqn1.n(bX());
/*      */     } 
/* 1230 */     if (eu()) {
/* 1231 */       aqn1.es();
/*      */     }
/* 1233 */     aqn1.m(bM());
/* 1234 */     if (bool) {
/* 1235 */       aqn1.p(et());
/* 1236 */       for (aqf aqf : aqf.values()) {
/* 1237 */         bmb bmb = b(aqf);
/* 1238 */         if (!bmb.a()) {
/* 1239 */           aqn1.a(aqf, bmb.i());
/* 1240 */           aqn1.a(aqf, e(aqf));
/* 1241 */           bmb.e(0);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 1246 */     this.l.c(aqn1);
/*      */     
/* 1248 */     if (br()) {
/* 1249 */       aqa aqa1 = ct();
/* 1250 */       l();
/* 1251 */       aqn1.a(aqa1, true);
/*      */     } 
/*      */     
/* 1254 */     ad();
/* 1255 */     return (T)aqn1;
/*      */   }
/*      */   
/*      */   protected void eA() {
/* 1259 */     if (this.by != null) {
/* 1260 */       eI();
/*      */     }
/* 1262 */     if (this.bw == null) {
/*      */       return;
/*      */     }
/* 1265 */     if (!aX() || !this.bw.aX()) {
/* 1266 */       a(true, true);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(boolean ☃, boolean bool1) {
/* 1271 */     if (this.bw != null) {
/* 1272 */       this.k = false;
/* 1273 */       if (!(this.bw instanceof bfw)) {
/* 1274 */         this.bw.k = false;
/*      */       }
/*      */       
/* 1277 */       this.bw = null;
/* 1278 */       this.by = null;
/* 1279 */       if (!this.l.v && bool1) {
/* 1280 */         a(bmd.pH);
/*      */       }
/*      */       
/* 1283 */       if (!this.l.v && ☃ && this.l instanceof aag) {
/* 1284 */         ((aag)this.l).i().b(this, new rb(this, null));
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean a(bfw ☃) {
/* 1290 */     return (!eB() && !(this instanceof bdi));
/*      */   }
/*      */   
/*      */   public boolean eB() {
/* 1294 */     return (this.bw != null);
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public aqa eC() {
/* 1300 */     if (this.bw == null && this.bx != 0 && this.l.v) {
/* 1301 */       this.bw = this.l.a(this.bx);
/*      */     }
/* 1303 */     return this.bw;
/*      */   }
/*      */   
/*      */   public void b(aqa ☃, boolean bool) {
/* 1307 */     this.bw = ☃;
/* 1308 */     this.by = null;
/*      */     
/* 1310 */     this.k = true;
/* 1311 */     if (!(this.bw instanceof bfw)) {
/* 1312 */       this.bw.k = true;
/*      */     }
/*      */     
/* 1315 */     if (!this.l.v && bool && this.l instanceof aag) {
/* 1316 */       ((aag)this.l).i().b(this, new rb(this, this.bw));
/*      */     }
/*      */     
/* 1319 */     if (br()) {
/* 1320 */       l();
/*      */     }
/*      */   }
/*      */   
/*      */   public void d(int ☃) {
/* 1325 */     this.bx = ☃;
/* 1326 */     a(false, false);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(aqa ☃, boolean bool) {
/* 1331 */     boolean bool1 = super.a(☃, bool);
/* 1332 */     if (bool1 && eB()) {
/* 1333 */       a(true, true);
/*      */     }
/*      */     
/* 1336 */     return bool1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void eI() {
/* 1342 */     if (this.by != null && this.l instanceof aag) {
/* 1343 */       if (this.by.b("UUID")) {
/* 1344 */         UUID ☃ = this.by.a("UUID");
/* 1345 */         aqa aqa1 = ((aag)this.l).a(☃);
/* 1346 */         if (aqa1 != null) {
/* 1347 */           b(aqa1, true);
/*      */           return;
/*      */         } 
/* 1350 */       } else if (this.by.c("X", 99) && this.by.c("Y", 99) && this.by.c("Z", 99)) {
/* 1351 */         fx ☃ = new fx(this.by.h("X"), this.by.h("Y"), this.by.h("Z"));
/* 1352 */         b(bcq.a(this.l, ☃), true);
/*      */         
/*      */         return;
/*      */       } 
/* 1356 */       if (this.K > 100) {
/* 1357 */         a(bmd.pH);
/* 1358 */         this.by = null;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a_(int ☃, bmb bmb1) {
/*      */     aqf aqf;
/* 1366 */     if (☃ == 98) {
/* 1367 */       aqf = aqf.a;
/* 1368 */     } else if (☃ == 99) {
/* 1369 */       aqf = aqf.b;
/*      */     }
/* 1371 */     else if (☃ == 100 + aqf.f.b()) {
/* 1372 */       aqf = aqf.f;
/* 1373 */     } else if (☃ == 100 + aqf.e.b()) {
/* 1374 */       aqf = aqf.e;
/* 1375 */     } else if (☃ == 100 + aqf.d.b()) {
/* 1376 */       aqf = aqf.d;
/* 1377 */     } else if (☃ == 100 + aqf.c.b()) {
/* 1378 */       aqf = aqf.c;
/*      */     } else {
/* 1380 */       return false;
/*      */     } 
/*      */     
/* 1383 */     if (bmb1.a() || c(aqf, bmb1) || aqf == aqf.f) {
/* 1384 */       a(aqf, bmb1);
/* 1385 */       return true;
/*      */     } 
/* 1387 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean cs() {
/* 1392 */     return (er() && super.cs());
/*      */   }
/*      */   
/*      */   public static boolean c(aqf ☃, bmb bmb1) {
/* 1396 */     aqf aqf1 = j(bmb1);
/* 1397 */     return (aqf1 == ☃ || (aqf1 == aqf.a && ☃ == aqf.b) || (aqf1 == aqf.b && ☃ == aqf.a));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean dS() {
/* 1405 */     return (super.dS() && !eD());
/*      */   }
/*      */   
/*      */   public void q(boolean ☃) {
/* 1409 */     byte b = ((Byte)this.R.<Byte>a(b)).byteValue();
/* 1410 */     this.R.b(b, Byte.valueOf(☃ ? (byte)(b | 0x1) : (byte)(b & 0xFFFFFFFE)));
/*      */   }
/*      */   
/*      */   public void r(boolean ☃) {
/* 1414 */     byte b = ((Byte)this.R.<Byte>a(b)).byteValue();
/* 1415 */     this.R.b(b, Byte.valueOf(☃ ? (byte)(b | 0x2) : (byte)(b & 0xFFFFFFFD)));
/*      */   }
/*      */   
/*      */   public void s(boolean ☃) {
/* 1419 */     byte b = ((Byte)this.R.<Byte>a(b)).byteValue();
/* 1420 */     this.R.b(b, Byte.valueOf(☃ ? (byte)(b | 0x4) : (byte)(b & 0xFFFFFFFB)));
/*      */   }
/*      */   
/*      */   public boolean eD() {
/* 1424 */     return ((((Byte)this.R.<Byte>a(b)).byteValue() & 0x1) != 0);
/*      */   }
/*      */   
/*      */   public boolean eE() {
/* 1428 */     return ((((Byte)this.R.<Byte>a(b)).byteValue() & 0x2) != 0);
/*      */   }
/*      */   
/*      */   public boolean eF() {
/* 1432 */     return ((((Byte)this.R.<Byte>a(b)).byteValue() & 0x4) != 0);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(boolean ☃) {}
/*      */ 
/*      */   
/*      */   public aqi dV() {
/* 1441 */     return eE() ? aqi.a : aqi.b;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean c(aqm ☃) {
/* 1446 */     if (☃.X() == aqe.bc && ((bfw)☃).bC.a) {
/* 1447 */       return false;
/*      */     }
/*      */     
/* 1450 */     return super.c(☃);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean B(aqa ☃) {
/* 1461 */     float f1 = (float)b(arl.f);
/* 1462 */     float f2 = (float)b(arl.g);
/*      */     
/* 1464 */     if (☃ instanceof aqm) {
/* 1465 */       f1 += bpu.a(dD(), ((aqm)☃).dC());
/* 1466 */       f2 += bpu.b(this);
/*      */     } 
/*      */     
/* 1469 */     int i = bpu.c(this);
/* 1470 */     if (i > 0) {
/* 1471 */       ☃.f(i * 4);
/*      */     }
/*      */     
/* 1474 */     boolean bool = ☃.a(apk.c(this), f1);
/*      */     
/* 1476 */     if (bool) {
/* 1477 */       if (f2 > 0.0F && ☃ instanceof aqm) {
/* 1478 */         ((aqm)☃).a(f2 * 0.5F, afm.a(this.p * 0.017453292F), -afm.b(this.p * 0.017453292F));
/* 1479 */         f(cC().d(0.6D, 1.0D, 0.6D));
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1486 */       if (☃ instanceof bfw) {
/* 1487 */         bfw bfw = (bfw)☃;
/* 1488 */         a(bfw, dD(), bfw.dW() ? bfw.dY() : bmb.b);
/*      */       } 
/*      */       
/* 1491 */       a(this, ☃);
/* 1492 */       z(☃);
/*      */     } 
/*      */     
/* 1495 */     return bool;
/*      */   }
/*      */   
/*      */   private void a(bfw ☃, bmb bmb1, bmb bmb2) {
/* 1499 */     if (!bmb1.a() && !bmb2.a() && bmb1.b() instanceof bkd && bmb2.b() == bmd.qn) {
/* 1500 */       float f = 0.25F + bpu.f(this) * 0.05F;
/*      */       
/* 1502 */       if (this.J.nextFloat() < f) {
/* 1503 */         ☃.eT().a(bmd.qn, 100);
/* 1504 */         this.l.a(☃, (byte)30);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   protected boolean eG() {
/* 1510 */     if (this.l.M() && !this.l.v) {
/* 1511 */       float ☃ = aR();
/* 1512 */       fx fx1 = (ct() instanceof bhn) ? (new fx(cD(), Math.round(cE()), cH())).b() : new fx(cD(), Math.round(cE()), cH());
/* 1513 */       if (☃ > 0.5F && this.J.nextFloat() * 30.0F < (☃ - 0.4F) * 2.0F && this.l.e(fx1)) {
/* 1514 */         return true;
/*      */       }
/*      */     } 
/* 1517 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void c(ael<cuw> ☃) {
/* 1522 */     if (x().r()) {
/* 1523 */       super.c(☃);
/*      */     } else {
/* 1525 */       f(cC().b(0.0D, 0.3D, 0.0D));
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void bN() {
/* 1536 */     super.bN();
/*      */     
/* 1538 */     a(true, false);
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aqn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */