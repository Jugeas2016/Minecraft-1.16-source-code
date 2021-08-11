/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import com.mojang.datafixers.util.Function3;
/*     */ import com.mojang.datafixers.util.Function6;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import com.mojang.serialization.MapCodec;
/*     */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*     */ import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
/*     */ import it.unimi.dsi.fastutil.doubles.DoubleList;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.function.BiFunction;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
/*     */ 
/*     */ public class bth
/*     */   extends bsy
/*     */ {
/*     */   static class a {
/*     */     private final int b;
/*     */     private final DoubleList c;
/*     */     public static final Codec<a> a;
/*     */     
/*     */     static {
/*  33 */       a = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.INT.fieldOf("firstOctave").forGetter(a::a), (App)Codec.DOUBLE.listOf().fieldOf("amplitudes").forGetter(a::b)).apply((Applicative)☃, a::new));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public a(int ☃, List<Double> list) {
/*  39 */       this.b = ☃;
/*  40 */       this.c = (DoubleList)new DoubleArrayList(list);
/*     */     }
/*     */     
/*     */     public int a() {
/*  44 */       return this.b;
/*     */     }
/*     */     
/*     */     public DoubleList b() {
/*  48 */       return this.c;
/*     */     }
/*     */   }
/*     */   
/*  52 */   private static final a g = new a(-7, (List<Double>)ImmutableList.of(Double.valueOf(1.0D), Double.valueOf(1.0D)));
/*     */   static {
/*  54 */     e = RecordCodecBuilder.mapCodec(☃ -> ☃.group((App)Codec.LONG.fieldOf("seed").forGetter(()), (App)RecordCodecBuilder.create(()).listOf().fieldOf("biomes").forGetter(()), (App)a.a.fieldOf("temperature_noise").forGetter(()), (App)a.a.fieldOf("humidity_noise").forGetter(()), (App)a.a.fieldOf("altitude_noise").forGetter(()), (App)a.a.fieldOf("weirdness_noise").forGetter(())).apply((Applicative)☃, bth::new));
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
/*  72 */     f = Codec.mapEither(c.a, e).xmap(☃ -> (bth)☃.map(c::d, Function.identity()), ☃ -> (Either)☃.d().<Either>map(Either::left).orElseGet(())).codec();
/*     */   }
/*     */ 
/*     */   
/*     */   public static final MapCodec<bth> e;
/*     */   
/*     */   public static final Codec<bth> f;
/*     */   private final a h;
/*     */   private final a i;
/*     */   private final a j;
/*     */   private final a k;
/*     */   private final cua l;
/*     */   private final cua m;
/*     */   private final cua n;
/*     */   private final cua o;
/*     */   private final List<Pair<bsv.c, Supplier<bsv>>> p;
/*     */   private final boolean q;
/*     */   private final long r;
/*     */   private final Optional<Pair<gm<bsv>, b>> s;
/*     */   
/*     */   private bth(long ☃, List<Pair<bsv.c, Supplier<bsv>>> list, Optional<Pair<gm<bsv>, b>> optional) {
/*  93 */     this(☃, list, g, g, g, g, optional);
/*     */   }
/*     */   
/*     */   private bth(long ☃, List<Pair<bsv.c, Supplier<bsv>>> list, a a1, a a2, a a3, a a4) {
/*  97 */     this(☃, list, a1, a2, a3, a4, Optional.empty());
/*     */   }
/*     */   
/*     */   private bth(long ☃, List<Pair<bsv.c, Supplier<bsv>>> list, a a1, a a2, a a3, a a4, Optional<Pair<gm<bsv>, b>> optional) {
/* 101 */     super(list.stream().map(Pair::getSecond));
/* 102 */     this.r = ☃;
/* 103 */     this.s = optional;
/*     */     
/* 105 */     this.h = a1;
/* 106 */     this.i = a2;
/* 107 */     this.j = a3;
/* 108 */     this.k = a4;
/*     */     
/* 110 */     this.l = cua.a(new chx(☃), a1.a(), a1.b());
/* 111 */     this.m = cua.a(new chx(☃ + 1L), a2.a(), a2.b());
/* 112 */     this.n = cua.a(new chx(☃ + 2L), a3.a(), a3.b());
/* 113 */     this.o = cua.a(new chx(☃ + 3L), a4.a(), a4.b());
/* 114 */     this.p = list;
/* 115 */     this.q = false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected Codec<? extends bsy> a() {
/* 120 */     return (Codec)f;
/*     */   }
/*     */ 
/*     */   
/*     */   public bsy a(long ☃) {
/* 125 */     return new bth(☃, this.p, this.h, this.i, this.j, this.k, this.s);
/*     */   }
/*     */   
/*     */   private Optional<c> d() {
/* 129 */     return this.s.map(☃ -> new c((b)☃.getSecond(), (gm)☃.getFirst(), this.r));
/*     */   }
/*     */ 
/*     */   
/*     */   public bsv b(int ☃, int i, int j) {
/* 134 */     int k = this.q ? i : 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 140 */     bsv.c c = new bsv.c((float)this.l.a(☃, k, j), (float)this.m.a(☃, k, j), (float)this.n.a(☃, k, j), (float)this.o.a(☃, k, j), 0.0F);
/*     */ 
/*     */ 
/*     */     
/* 144 */     return this.p.stream()
/* 145 */       .min(Comparator.comparing(pair -> Float.valueOf(((bsv.c)pair.getFirst()).a(☃))))
/* 146 */       .map(Pair::getSecond)
/* 147 */       .map(Supplier::get)
/* 148 */       .orElse(kt.b);
/*     */   }
/*     */   
/*     */   public boolean b(long ☃) {
/* 152 */     return (this.r == ☃ && this.s.isPresent() && Objects.equals(((Pair)this.s.get()).getSecond(), b.a));
/*     */   }
/*     */   
/*     */   static final class c { static {
/* 156 */       a = RecordCodecBuilder.mapCodec(☃ -> ☃.group((App)vk.a.flatXmap((), ()).fieldOf("preset").stable().forGetter(c::a), (App)vg.<bsv>a(gm.ay).forGetter(c::b), (App)Codec.LONG.fieldOf("seed").stable().forGetter(c::c)).apply((Applicative)☃, ☃.stable(c::new)));
/*     */     }
/*     */ 
/*     */     
/*     */     public static final MapCodec<c> a;
/*     */     
/*     */     private final bth.b b;
/*     */     
/*     */     private final gm<bsv> c;
/*     */     
/*     */     private final long d;
/*     */ 
/*     */     
/*     */     private c(bth.b ☃, gm<bsv> gm1, long l) {
/* 170 */       this.b = ☃;
/* 171 */       this.c = gm1;
/* 172 */       this.d = l;
/*     */     }
/*     */     
/*     */     public bth.b a() {
/* 176 */       return this.b;
/*     */     }
/*     */     
/*     */     public gm<bsv> b() {
/* 180 */       return this.c;
/*     */     }
/*     */     
/*     */     public long c() {
/* 184 */       return this.d;
/*     */     }
/*     */     
/*     */     public bth d() {
/* 188 */       return this.b.a(this.c, this.d);
/*     */     } }
/*     */ 
/*     */   
/*     */   public static class b {
/* 193 */     private static final Map<vk, b> b = Maps.newHashMap();
/*     */     static {
/* 195 */       a = new b(new vk("nether"), (☃, gm1, long_) -> new bth(long_.longValue(), (List)ImmutableList.of(Pair.of(new bsv.c(0.0F, 0.0F, 0.0F, 0.0F, 0.0F), ()), Pair.of(new bsv.c(0.0F, -0.5F, 0.0F, 0.0F, 0.0F), ()), Pair.of(new bsv.c(0.4F, 0.0F, 0.0F, 0.0F, 0.0F), ()), Pair.of(new bsv.c(0.0F, 0.5F, 0.0F, 0.0F, 0.375F), ()), Pair.of(new bsv.c(-0.5F, 0.0F, 0.0F, 0.0F, 0.175F), ())), Optional.of(Pair.of(gm1, ☃))));
/*     */     }
/*     */ 
/*     */     
/*     */     public static final b a;
/*     */     
/*     */     private final vk c;
/*     */     
/*     */     private final Function3<b, gm<bsv>, Long, bth> d;
/*     */ 
/*     */     
/*     */     public b(vk ☃, Function3<b, gm<bsv>, Long, bth> function3) {
/* 207 */       this.c = ☃;
/* 208 */       this.d = function3;
/* 209 */       b.put(☃, this);
/*     */     }
/*     */     
/*     */     public bth a(gm<bsv> ☃, long l) {
/* 213 */       return (bth)this.d.apply(this, ☃, Long.valueOf(l));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bth.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */