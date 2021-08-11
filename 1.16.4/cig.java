/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.mojang.serialization.Codec;
/*     */ import java.util.BitSet;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import java.util.function.Function;
/*     */ import org.apache.commons.lang3.mutable.MutableBoolean;
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
/*     */ public abstract class cig<C extends chz>
/*     */ {
/*  28 */   public static final cig<cmk> a = a("cave", new cia(cmk.b, 256));
/*  29 */   public static final cig<cmk> b = a("nether_cave", new cic(cmk.b));
/*  30 */   public static final cig<cmk> c = a("canyon", new chy(cmk.b));
/*  31 */   public static final cig<cmk> d = a("underwater_canyon", new cie(cmk.b));
/*  32 */   public static final cig<cmk> e = a("underwater_cave", new cif(cmk.b));
/*     */   
/*  34 */   protected static final ceh f = bup.a.n();
/*  35 */   protected static final ceh g = bup.lb.n();
/*  36 */   protected static final cux h = cuy.c.h();
/*  37 */   protected static final cux i = cuy.e.h();
/*     */   
/*     */   private static <C extends chz, F extends cig<C>> F a(String ☃, F f) {
/*  40 */     return (F)gm.<cig>a((gm)gm.aC, ☃, (cig)f);
/*     */   }
/*     */   
/*  43 */   protected Set<buo> j = (Set<buo>)ImmutableSet.of(bup.b, bup.c, bup.e, bup.g, bup.j, bup.k, (Object[])new buo[] { bup.l, bup.i, bup.gR, bup.fF, bup.fG, bup.fH, bup.fI, bup.fJ, bup.fK, bup.fL, bup.fM, bup.fN, bup.fO, bup.fP, bup.fQ, bup.fR, bup.fS, bup.fT, bup.fU, bup.at, bup.hG, bup.dT, bup.cC, bup.gT });
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  76 */   protected Set<cuw> k = (Set<cuw>)ImmutableSet.of(cuy.c);
/*     */   
/*     */   private final Codec<cib<C>> m;
/*     */   
/*     */   protected final int l;
/*     */ 
/*     */   
/*     */   public cig(Codec<C> ☃, int i) {
/*  84 */     this.l = i;
/*  85 */     this.m = ☃.fieldOf("config").xmap(this::a, cib::a).codec();
/*     */   }
/*     */   
/*     */   public cib<C> a(C ☃) {
/*  89 */     return new cib<>(this, ☃);
/*     */   }
/*     */   
/*     */   public Codec<cib<C>> c() {
/*  93 */     return this.m;
/*     */   }
/*     */   
/*     */   public int d() {
/*  97 */     return 4;
/*     */   }
/*     */   
/*     */   protected boolean a(cfw ☃, Function<fx, bsv> function, long l, int i, int j, int k, double d1, double d2, double d3, double d4, double d5, BitSet bitSet) {
/* 101 */     Random random = new Random(l + j + k);
/*     */     
/* 103 */     double d6 = (j * 16 + 8);
/* 104 */     double d7 = (k * 16 + 8);
/*     */     
/* 106 */     if (d1 < d6 - 16.0D - d4 * 2.0D || d3 < d7 - 16.0D - d4 * 2.0D || d1 > d6 + 16.0D + d4 * 2.0D || d3 > d7 + 16.0D + d4 * 2.0D) {
/* 107 */       return false;
/*     */     }
/*     */     
/* 110 */     int m = Math.max(afm.c(d1 - d4) - j * 16 - 1, 0);
/* 111 */     int n = Math.min(afm.c(d1 + d4) - j * 16 + 1, 16);
/*     */     
/* 113 */     int i1 = Math.max(afm.c(d2 - d5) - 1, 1);
/* 114 */     int i2 = Math.min(afm.c(d2 + d5) + 1, this.l - 8);
/*     */     
/* 116 */     int i3 = Math.max(afm.c(d3 - d4) - k * 16 - 1, 0);
/* 117 */     int i4 = Math.min(afm.c(d3 + d4) - k * 16 + 1, 16);
/*     */     
/* 119 */     if (a(☃, j, k, m, n, i1, i2, i3, i4)) {
/* 120 */       return false;
/*     */     }
/*     */     
/* 123 */     boolean bool = false;
/* 124 */     fx.a a1 = new fx.a();
/* 125 */     fx.a a2 = new fx.a();
/* 126 */     fx.a a3 = new fx.a();
/*     */     
/* 128 */     for (int i5 = m; i5 < n; i5++) {
/* 129 */       int i6 = i5 + j * 16;
/* 130 */       double d = (i6 + 0.5D - d1) / d4;
/* 131 */       for (int i7 = i3; i7 < i4; i7++) {
/* 132 */         int i8 = i7 + k * 16;
/* 133 */         double d8 = (i8 + 0.5D - d3) / d4;
/* 134 */         if (d * d + d8 * d8 < 1.0D) {
/*     */ 
/*     */ 
/*     */           
/* 138 */           MutableBoolean mutableBoolean = new MutableBoolean(false);
/*     */           
/* 140 */           for (int i9 = i2; i9 > i1; i9--) {
/* 141 */             double d9 = (i9 - 0.5D - d2) / d5;
/* 142 */             if (!a(d, d9, d8, i9))
/*     */             {
/*     */ 
/*     */               
/* 146 */               bool |= a(☃, function, bitSet, random, a1, a2, a3, i, j, k, i6, i8, i5, i9, i7, mutableBoolean); } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 151 */     return bool;
/*     */   }
/*     */   
/*     */   protected boolean a(cfw ☃, Function<fx, bsv> function, BitSet bitSet, Random random, fx.a a1, fx.a a2, fx.a a3, int i, int j, int k, int m, int n, int i1, int i2, int i3, MutableBoolean mutableBoolean) {
/* 155 */     int i4 = i1 | i3 << 4 | i2 << 8;
/* 156 */     if (bitSet.get(i4)) {
/* 157 */       return false;
/*     */     }
/* 159 */     bitSet.set(i4);
/*     */     
/* 161 */     a1.d(m, i2, n);
/*     */     
/* 163 */     ceh ceh1 = ☃.d_(a1);
/*     */     
/* 165 */     ceh ceh2 = ☃.d_(a2.a(a1, gc.b));
/* 166 */     if (ceh1.a(bup.i) || ceh1.a(bup.dT)) {
/* 167 */       mutableBoolean.setTrue();
/*     */     }
/* 169 */     if (!a(ceh1, ceh2)) {
/* 170 */       return false;
/*     */     }
/*     */     
/* 173 */     if (i2 < 11) {
/* 174 */       ☃.a(a1, i.g(), false);
/*     */     } else {
/* 176 */       ☃.a(a1, g, false);
/*     */ 
/*     */       
/* 179 */       if (mutableBoolean.isTrue()) {
/* 180 */         a3.a(a1, gc.a);
/* 181 */         if (☃.d_(a3).a(bup.j)) {
/* 182 */           ☃.a(a3, ((bsv)function.apply(a1)).e().e().a(), false);
/*     */         }
/*     */       } 
/*     */     } 
/* 186 */     return true;
/*     */   }
/*     */   
/*     */   public abstract boolean a(cfw paramcfw, Function<fx, bsv> paramFunction, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, BitSet paramBitSet, C paramC);
/*     */   
/*     */   public abstract boolean a(Random paramRandom, int paramInt1, int paramInt2, C paramC);
/*     */   
/*     */   protected boolean a(ceh ☃) {
/* 194 */     return this.j.contains(☃.b());
/*     */   }
/*     */   
/*     */   protected boolean a(ceh ☃, ceh ceh1) {
/* 198 */     return (a(☃) || ((☃.a(bup.C) || ☃.a(bup.E)) && !ceh1.m().a(aef.b)));
/*     */   }
/*     */   
/*     */   protected boolean a(cfw ☃, int i, int j, int k, int m, int n, int i1, int i2, int i3) {
/* 202 */     fx.a a = new fx.a();
/*     */     
/* 204 */     for (int i4 = k; i4 < m; i4++) {
/* 205 */       for (int i5 = i2; i5 < i3; i5++) {
/* 206 */         for (int i6 = n - 1; i6 <= i1 + 1; i6++) {
/* 207 */           if (this.k.contains(☃.b(a.d(i4 + i * 16, i6, i5 + j * 16)).a())) {
/* 208 */             return true;
/*     */           }
/*     */ 
/*     */           
/* 212 */           if (i6 != i1 + 1 && !a(k, m, i2, i3, i4, i5)) {
/* 213 */             i6 = i1;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 218 */     return false;
/*     */   }
/*     */   
/*     */   private boolean a(int ☃, int i, int j, int k, int m, int n) {
/* 222 */     return (m == ☃ || m == i - 1 || n == j || n == k - 1);
/*     */   }
/*     */   
/*     */   protected boolean a(int ☃, int i, double d1, double d2, int j, int k, float f) {
/* 226 */     double d3 = (☃ * 16 + 8);
/* 227 */     double d4 = (i * 16 + 8);
/*     */     
/* 229 */     double d5 = d1 - d3;
/* 230 */     double d6 = d2 - d4;
/* 231 */     double d7 = (k - j);
/* 232 */     double d8 = (f + 2.0F + 16.0F);
/*     */     
/* 234 */     return (d5 * d5 + d6 * d6 - d7 * d7 <= d8 * d8);
/*     */   }
/*     */   
/*     */   protected abstract boolean a(double paramDouble1, double paramDouble2, double paramDouble3, int paramInt);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */