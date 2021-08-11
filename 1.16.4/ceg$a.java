/*      */ import com.google.common.collect.ImmutableMap;
/*      */ import com.mojang.serialization.MapCodec;
/*      */ import java.util.Arrays;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import java.util.function.Predicate;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public abstract class a
/*      */   extends cej<buo, ceh>
/*      */ {
/*      */   private final int b;
/*      */   private final boolean e;
/*      */   private final boolean f;
/*      */   private final cva g;
/*      */   private final cvb h;
/*      */   private final float i;
/*      */   private final boolean j;
/*      */   private final boolean k;
/*      */   private final ceg.e l;
/*      */   private final ceg.e m;
/*      */   private final ceg.e n;
/*      */   private final ceg.e o;
/*      */   private final ceg.e p;
/*      */   @Nullable
/*      */   protected a a;
/*      */   
/*      */   protected a(buo ☃, ImmutableMap<cfj<?>, Comparable<?>> immutableMap, MapCodec<ceh> mapCodec) {
/*  623 */     super(☃, immutableMap, mapCodec);
/*  624 */     ceg.c c = ☃.aB;
/*      */     
/*  626 */     this.b = ceg.c.l(c).applyAsInt(p());
/*  627 */     this.e = ☃.c_(p());
/*  628 */     this.f = ceg.c.m(c);
/*  629 */     this.g = ceg.c.a(c);
/*  630 */     this.h = ceg.c.k(c).apply(p());
/*  631 */     this.i = ceg.c.n(c);
/*  632 */     this.j = ceg.c.o(c);
/*  633 */     this.k = ceg.c.p(c);
/*  634 */     this.l = ceg.c.q(c);
/*  635 */     this.m = ceg.c.r(c);
/*  636 */     this.n = ceg.c.s(c);
/*  637 */     this.o = ceg.c.t(c);
/*  638 */     this.p = ceg.c.u(c);
/*      */   }
/*      */   
/*      */   public void a() {
/*  642 */     if (!b().o()) {
/*  643 */       this.a = new a(p());
/*      */     }
/*      */   }
/*      */   
/*      */   public buo b() {
/*  648 */     return this.c;
/*      */   }
/*      */   
/*      */   public cva c() {
/*  652 */     return this.g;
/*      */   }
/*      */   
/*      */   public boolean a(brc ☃, fx fx1, aqe<?> aqe1) {
/*  656 */     return ceg.c.v((b()).aB).test(p(), ☃, fx1, aqe1);
/*      */   }
/*      */   
/*      */   public boolean a(brc ☃, fx fx1) {
/*  660 */     if (this.a != null) {
/*  661 */       return a.a(this.a);
/*      */     }
/*  663 */     return b().b(p(), ☃, fx1);
/*      */   }
/*      */   
/*      */   public int b(brc ☃, fx fx1) {
/*  667 */     if (this.a != null) {
/*  668 */       return a.b(this.a);
/*      */     }
/*  670 */     return b().f(p(), ☃, fx1);
/*      */   }
/*      */   
/*      */   public ddh a(brc ☃, fx fx1, gc gc1) {
/*  674 */     if (this.a != null && a.c(this.a) != null) {
/*  675 */       return a.c(this.a)[gc1.ordinal()];
/*      */     }
/*      */     
/*  678 */     return dde.a(c(☃, fx1), gc1);
/*      */   }
/*      */   
/*      */   public ddh c(brc ☃, fx fx1) {
/*  682 */     return b().d(p(), ☃, fx1);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean d() {
/*  687 */     return (this.a == null || this.a.c);
/*      */   }
/*      */   
/*      */   public boolean e() {
/*  691 */     return this.e;
/*      */   }
/*      */   
/*      */   public int f() {
/*  695 */     return this.b;
/*      */   }
/*      */   
/*      */   public boolean g() {
/*  699 */     return this.f;
/*      */   }
/*      */   
/*      */   public cvb d(brc ☃, fx fx1) {
/*  703 */     return this.h;
/*      */   }
/*      */   
/*      */   public ceh a(bzm ☃) {
/*  707 */     return b().a(p(), ☃);
/*      */   }
/*      */   
/*      */   public ceh a(byg ☃) {
/*  711 */     return b().a(p(), ☃);
/*      */   }
/*      */   
/*      */   public bzh h() {
/*  715 */     return b().b(p());
/*      */   }
/*      */   
/*      */   public boolean e(brc ☃, fx fx1) {
/*  719 */     return this.p.test(p(), ☃, fx1);
/*      */   }
/*      */   
/*      */   public float f(brc ☃, fx fx1) {
/*  723 */     return b().a(p(), ☃, fx1);
/*      */   }
/*      */   
/*      */   public boolean g(brc ☃, fx fx1) {
/*  727 */     return this.l.test(p(), ☃, fx1);
/*      */   }
/*      */   
/*      */   public boolean i() {
/*  731 */     return b().b_(p());
/*      */   }
/*      */   
/*      */   public int b(brc ☃, fx fx1, gc gc1) {
/*  735 */     return b().a(p(), ☃, fx1, gc1);
/*      */   }
/*      */   
/*      */   public boolean j() {
/*  739 */     return b().a(p());
/*      */   }
/*      */   
/*      */   public int a(brx ☃, fx fx1) {
/*  743 */     return b().a(p(), ☃, fx1);
/*      */   }
/*      */   
/*      */   public float h(brc ☃, fx fx1) {
/*  747 */     return this.i;
/*      */   }
/*      */   
/*      */   public float a(bfw ☃, brc brc1, fx fx1) {
/*  751 */     return b().a(p(), ☃, brc1, fx1);
/*      */   }
/*      */   
/*      */   public int c(brc ☃, fx fx1, gc gc1) {
/*  755 */     return b().b(p(), ☃, fx1, gc1);
/*      */   }
/*      */   
/*      */   public cvc k() {
/*  759 */     return b().f(p());
/*      */   }
/*      */   
/*      */   public boolean i(brc ☃, fx fx1) {
/*  763 */     if (this.a != null) {
/*  764 */       return this.a.a;
/*      */     }
/*  766 */     ceh ceh = p();
/*  767 */     if (ceh.l()) {
/*  768 */       return buo.a(ceh.c(☃, fx1));
/*      */     }
/*  770 */     return false;
/*      */   }
/*      */   
/*      */   public boolean l() {
/*  774 */     return this.k;
/*      */   }
/*      */   
/*      */   public boolean a(ceh ☃, gc gc1) {
/*  778 */     return b().a(p(), ☃, gc1);
/*      */   }
/*      */   
/*      */   public ddh j(brc ☃, fx fx1) {
/*  782 */     return a(☃, fx1, dcs.a());
/*      */   }
/*      */   
/*      */   public ddh a(brc ☃, fx fx1, dcs dcs1) {
/*  786 */     return b().b(p(), ☃, fx1, dcs1);
/*      */   }
/*      */   
/*      */   public ddh k(brc ☃, fx fx1) {
/*  790 */     if (this.a != null) {
/*  791 */       return this.a.b;
/*      */     }
/*  793 */     return b(☃, fx1, dcs.a());
/*      */   }
/*      */   
/*      */   public ddh b(brc ☃, fx fx1, dcs dcs1) {
/*  797 */     return b().c(p(), ☃, fx1, dcs1);
/*      */   }
/*      */   
/*      */   public ddh l(brc ☃, fx fx1) {
/*  801 */     return b().e(p(), ☃, fx1);
/*      */   }
/*      */   
/*      */   public ddh c(brc ☃, fx fx1, dcs dcs1) {
/*  805 */     return b().a(p(), ☃, fx1, dcs1);
/*      */   }
/*      */   
/*      */   public ddh m(brc ☃, fx fx1) {
/*  809 */     return b().a_(p(), ☃, fx1);
/*      */   }
/*      */   
/*      */   public final boolean a(brc ☃, fx fx1, aqa aqa1) {
/*  813 */     return a(☃, fx1, aqa1, gc.b);
/*      */   }
/*      */   
/*      */   public final boolean a(brc ☃, fx fx1, aqa aqa1, gc gc1) {
/*  817 */     return buo.a(b(☃, fx1, dcs.a(aqa1)), gc1);
/*      */   }
/*      */   
/*      */   public dcn n(brc ☃, fx fx1) {
/*  821 */     ceg.b b = b().ah_();
/*  822 */     if (b == ceg.b.a) {
/*  823 */       return dcn.a;
/*      */     }
/*      */     
/*  826 */     long l = afm.c(fx1.u(), 0, fx1.w());
/*  827 */     return new dcn((((float)(l & 0xFL) / 15.0F) - 0.5D) * 0.5D, (b == ceg.b.c) ? ((((float)(l >> 4L & 0xFL) / 15.0F) - 1.0D) * 0.2D) : 0.0D, (((float)(l >> 8L & 0xFL) / 15.0F) - 0.5D) * 0.5D);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(brx ☃, fx fx1, int i, int j) {
/*  835 */     return b().a(p(), ☃, fx1, i, j);
/*      */   }
/*      */   
/*      */   public void a(brx ☃, fx fx1, buo buo1, fx fx2, boolean bool) {
/*  839 */     b().a(p(), ☃, fx1, buo1, fx2, bool);
/*      */   }
/*      */   
/*      */   public final void a(bry ☃, fx fx1, int i) {
/*  843 */     a(☃, fx1, i, 512);
/*      */   }
/*      */   
/*      */   public final void a(bry ☃, fx fx1, int i, int j) {
/*  847 */     b();
/*  848 */     fx.a a1 = new fx.a();
/*  849 */     for (gc gc : ceg.ar) {
/*  850 */       a1.a(fx1, gc);
/*  851 */       ceh ceh1 = ☃.d_(a1);
/*  852 */       ceh ceh2 = ceh1.a(gc.f(), p(), ☃, a1, fx1);
/*  853 */       buo.a(ceh1, ceh2, ☃, a1, i, j);
/*      */     } 
/*      */   }
/*      */   
/*      */   public final void b(bry ☃, fx fx1, int i) {
/*  858 */     b(☃, fx1, i, 512);
/*      */   }
/*      */   
/*      */   public void b(bry ☃, fx fx1, int i, int j) {
/*  862 */     b().a(p(), ☃, fx1, i, j);
/*      */   }
/*      */   
/*      */   public void a(brx ☃, fx fx1, ceh ceh1, boolean bool) {
/*  866 */     b().b(p(), ☃, fx1, ceh1, bool);
/*      */   }
/*      */   
/*      */   public void b(brx ☃, fx fx1, ceh ceh1, boolean bool) {
/*  870 */     b().a(p(), ☃, fx1, ceh1, bool);
/*      */   }
/*      */   
/*      */   public void a(aag ☃, fx fx1, Random random) {
/*  874 */     b().a(p(), ☃, fx1, random);
/*      */   }
/*      */   
/*      */   public void b(aag ☃, fx fx1, Random random) {
/*  878 */     b().b(p(), ☃, fx1, random);
/*      */   }
/*      */   
/*      */   public void a(brx ☃, fx fx1, aqa aqa1) {
/*  882 */     b().a(p(), ☃, fx1, aqa1);
/*      */   }
/*      */   
/*      */   public void a(aag ☃, fx fx1, bmb bmb1) {
/*  886 */     b().a(p(), ☃, fx1, bmb1);
/*      */   }
/*      */   
/*      */   public List<bmb> a(cyv.a ☃) {
/*  890 */     return b().a(p(), ☃);
/*      */   }
/*      */   
/*      */   public aou a(brx ☃, bfw bfw1, aot aot1, dcj dcj1) {
/*  894 */     return b().a(p(), ☃, dcj1.a(), bfw1, aot1, dcj1);
/*      */   }
/*      */   
/*      */   public void a(brx ☃, fx fx1, bfw bfw1) {
/*  898 */     b().a(p(), ☃, fx1, bfw1);
/*      */   }
/*      */   
/*      */   public boolean o(brc ☃, fx fx1) {
/*  902 */     return this.m.test(p(), ☃, fx1);
/*      */   }
/*      */   
/*      */   public boolean p(brc ☃, fx fx1) {
/*  906 */     return this.n.test(p(), ☃, fx1);
/*      */   }
/*      */   
/*      */   public ceh a(gc ☃, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/*  910 */     return b().a(p(), ☃, ceh1, bry1, fx1, fx2);
/*      */   }
/*      */   
/*      */   public boolean a(brc ☃, fx fx1, cxe cxe1) {
/*  914 */     return b().a(p(), ☃, fx1, cxe1);
/*      */   }
/*      */   
/*      */   public boolean a(bny ☃) {
/*  918 */     return b().a(p(), ☃);
/*      */   }
/*      */   
/*      */   public boolean a(cuw ☃) {
/*  922 */     return b().a(p(), ☃);
/*      */   }
/*      */   
/*      */   public boolean a(brz ☃, fx fx1) {
/*  926 */     return b().a(p(), ☃, fx1);
/*      */   }
/*      */   
/*      */   public boolean q(brc ☃, fx fx1) {
/*  930 */     return this.o.test(p(), ☃, fx1);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aox b(brx ☃, fx fx1) {
/*  935 */     return b().b(p(), ☃, fx1);
/*      */   }
/*      */   
/*      */   public boolean a(ael<buo> ☃) {
/*  939 */     return b().a(☃);
/*      */   }
/*      */   
/*      */   public boolean a(ael<buo> ☃, Predicate<a> predicate) {
/*  943 */     return (b().a(☃) && predicate.test(this));
/*      */   }
/*      */   
/*      */   public boolean a(buo ☃) {
/*  947 */     return b().a(☃);
/*      */   }
/*      */   
/*      */   public cux m() {
/*  951 */     return b().d(p());
/*      */   }
/*      */   
/*      */   public boolean n() {
/*  955 */     return b().a_(p());
/*      */   }
/*      */   
/*      */   public long a(fx ☃) {
/*  959 */     return b().a(p(), ☃);
/*      */   }
/*      */   
/*      */   public cae o() {
/*  963 */     return b().k(p());
/*      */   }
/*      */   
/*      */   public void a(brx ☃, ceh ceh1, dcj dcj1, bgm bgm1) {
/*  967 */     b().a(☃, ceh1, dcj1, bgm1);
/*      */   }
/*      */   
/*      */   public boolean d(brc ☃, fx fx1, gc gc1) {
/*  971 */     return a(☃, fx1, gc1, cat.a);
/*      */   }
/*      */   
/*      */   public boolean a(brc ☃, fx fx1, gc gc1, cat cat1) {
/*  975 */     if (this.a != null) {
/*  976 */       return this.a.a(gc1, cat1);
/*      */     }
/*  978 */     return cat1.a(p(), ☃, fx1, gc1);
/*      */   }
/*      */   
/*      */   public boolean r(brc ☃, fx fx1) {
/*  982 */     if (this.a != null) {
/*  983 */       return this.a.d;
/*      */     }
/*  985 */     return buo.a(k(☃, fx1));
/*      */   }
/*      */   
/*      */   protected abstract ceh p();
/*      */   
/*      */   public boolean q() {
/*  991 */     return this.j;
/*      */   }
/*      */   
/*      */   static final class a {
/*  995 */     private static final gc[] e = gc.values();
/*  996 */     private static final int f = (cat.values()).length;
/*      */     protected final boolean a;
/*      */     private final boolean g;
/*      */     private final int h;
/*      */     @Nullable
/*      */     private final ddh[] i;
/*      */     protected final ddh b;
/*      */     protected final boolean c;
/*      */     private final boolean[] j;
/*      */     protected final boolean d;
/*      */     
/*      */     private a(ceh ☃) {
/* 1008 */       buo buo = ☃.b();
/* 1009 */       this.a = ☃.i(brl.a, fx.b);
/* 1010 */       this.g = buo.b(☃, brl.a, fx.b);
/* 1011 */       this.h = buo.f(☃, brl.a, fx.b);
/* 1012 */       if (!☃.l()) {
/* 1013 */         this.i = null;
/*      */       } else {
/* 1015 */         this.i = new ddh[e.length];
/* 1016 */         ddh ddh1 = buo.d(☃, brl.a, fx.b);
/* 1017 */         for (gc gc1 : e) {
/* 1018 */           this.i[gc1.ordinal()] = dde.a(ddh1, gc1);
/*      */         }
/*      */       } 
/*      */       
/* 1022 */       this.b = buo.c(☃, brl.a, fx.b, dcs.a());
/* 1023 */       this.c = Arrays.<gc.a>stream(gc.a.values()).anyMatch(☃ -> (this.b.b(☃) < 0.0D || this.b.c(☃) > 1.0D));
/* 1024 */       this.j = new boolean[e.length * f];
/* 1025 */       for (gc gc1 : e) {
/* 1026 */         for (cat cat : cat.values()) {
/* 1027 */           this.j[b(gc1, cat)] = cat.a(☃, brl.a, fx.b, gc1);
/*      */         }
/*      */       } 
/* 1030 */       this.d = buo.a(☃.k(brl.a, fx.b));
/*      */     }
/*      */     
/*      */     public boolean a(gc ☃, cat cat1) {
/* 1034 */       return this.j[b(☃, cat1)];
/*      */     }
/*      */     
/*      */     private static int b(gc ☃, cat cat1) {
/* 1038 */       return ☃.ordinal() * f + cat1.ordinal();
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ceg$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */