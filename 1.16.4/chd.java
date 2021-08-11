/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.datafixers.util.Function14;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import com.mojang.serialization.Lifecycle;
/*     */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*     */ import java.io.File;
/*     */ import java.util.Optional;
/*     */ import java.util.OptionalLong;
/*     */ import java.util.function.Supplier;
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
/*     */ public class chd
/*     */ {
/*  36 */   public static final vk a = new vk("overworld");
/*  37 */   public static final vk b = new vk("the_nether");
/*  38 */   public static final vk c = new vk("the_end");
/*     */   static {
/*  40 */     d = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.LONG.optionalFieldOf("fixed_time").xmap((), ()).forGetter(()), (App)Codec.BOOL.fieldOf("has_skylight").forGetter(chd::b), (App)Codec.BOOL.fieldOf("has_ceiling").forGetter(chd::c), (App)Codec.BOOL.fieldOf("ultrawarm").forGetter(chd::d), (App)Codec.BOOL.fieldOf("natural").forGetter(chd::e), (App)Codec.doubleRange(9.999999747378752E-6D, 3.0E7D).fieldOf("coordinate_scale").forGetter(chd::f), (App)Codec.BOOL.fieldOf("piglin_safe").forGetter(chd::g), (App)Codec.BOOL.fieldOf("bed_works").forGetter(chd::h), (App)Codec.BOOL.fieldOf("respawn_anchor_works").forGetter(chd::i), (App)Codec.BOOL.fieldOf("has_raids").forGetter(chd::j), (App)Codec.intRange(0, 256).fieldOf("logical_height").forGetter(chd::k), (App)vk.a.fieldOf("infiniburn").forGetter(()), (App)vk.a.fieldOf("effects").orElse(a).forGetter(()), (App)Codec.FLOAT.fieldOf("ambient_light").forGetter(())).apply((Applicative)☃, chd::new));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final Codec<chd> d;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  58 */   public static final float[] e = new float[] { 1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F };
/*     */ 
/*     */ 
/*     */   
/*  62 */   public static final vj<chd> f = vj.a(gm.K, new vk("overworld"));
/*  63 */   public static final vj<chd> g = vj.a(gm.K, new vk("the_nether"));
/*  64 */   public static final vj<chd> h = vj.a(gm.K, new vk("the_end"));
/*     */ 
/*     */   
/*  67 */   protected static final chd i = new chd(OptionalLong.empty(), true, false, false, true, 1.0D, false, false, true, false, true, 256, btf.a, aed.aE.a(), a, 0.0F);
/*  68 */   protected static final chd j = new chd(OptionalLong.of(18000L), false, true, true, false, 8.0D, false, true, false, true, false, 128, bte.a, aed.aF.a(), b, 0.1F);
/*  69 */   protected static final chd k = new chd(OptionalLong.of(6000L), false, false, false, false, 1.0D, true, false, false, false, true, 256, bte.a, aed.aG.a(), c, 0.0F);
/*     */   
/*  71 */   public static final vj<chd> l = vj.a(gm.K, new vk("overworld_caves"));
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  76 */   protected static final chd m = new chd(OptionalLong.empty(), true, true, false, true, 1.0D, false, false, true, false, true, 256, btf.a, aed.aE.a(), a, 0.0F);
/*     */   
/*  78 */   public static final Codec<Supplier<chd>> n = vf.a(gm.K, d);
/*     */   
/*     */   private final OptionalLong o;
/*     */   
/*     */   private final boolean p;
/*     */   
/*     */   private final boolean q;
/*     */   private final boolean r;
/*     */   private final boolean s;
/*     */   private final double t;
/*     */   private final boolean u;
/*     */   private final boolean v;
/*     */   private final boolean w;
/*     */   private final boolean x;
/*     */   private final boolean y;
/*     */   private final int z;
/*     */   private final bta A;
/*     */   private final vk B;
/*     */   private final vk C;
/*     */   private final float D;
/*     */   private final transient float[] E;
/*     */   
/*     */   protected chd(OptionalLong ☃, boolean bool1, boolean bool2, boolean bool3, boolean bool4, double d, boolean bool5, boolean bool6, boolean bool7, boolean bool8, int i, vk vk1, vk vk2, float f) {
/* 101 */     this(☃, bool1, bool2, bool3, bool4, d, false, bool5, bool6, bool7, bool8, i, bte.a, vk1, vk2, f);
/*     */   }
/*     */   
/*     */   protected chd(OptionalLong ☃, boolean bool1, boolean bool2, boolean bool3, boolean bool4, double d, boolean bool5, boolean bool6, boolean bool7, boolean bool8, boolean bool9, int i, bta bta1, vk vk1, vk vk2, float f) {
/* 105 */     this.o = ☃;
/* 106 */     this.p = bool1;
/* 107 */     this.q = bool2;
/* 108 */     this.r = bool3;
/* 109 */     this.s = bool4;
/* 110 */     this.t = d;
/* 111 */     this.u = bool5;
/* 112 */     this.v = bool6;
/* 113 */     this.w = bool7;
/* 114 */     this.x = bool8;
/* 115 */     this.y = bool9;
/* 116 */     this.z = i;
/* 117 */     this.A = bta1;
/* 118 */     this.B = vk1;
/* 119 */     this.C = vk2;
/* 120 */     this.D = f;
/* 121 */     this.E = a(f);
/*     */   }
/*     */   
/*     */   private static float[] a(float ☃) {
/* 125 */     float[] arrayOfFloat = new float[16];
/* 126 */     for (int i = 0; i <= 15; i++) {
/*     */       
/* 128 */       float f1 = i / 15.0F;
/*     */       
/* 130 */       float f2 = f1 / (4.0F - 3.0F * f1);
/* 131 */       arrayOfFloat[i] = afm.g(☃, f2, 1.0F);
/*     */     } 
/* 133 */     return arrayOfFloat;
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public static DataResult<vj<brx>> a(Dynamic<?> ☃) {
/* 139 */     Optional<Number> optional = ☃.asNumber().result();
/* 140 */     if (optional.isPresent()) {
/* 141 */       int i = ((Number)optional.get()).intValue();
/* 142 */       if (i == -1)
/* 143 */         return DataResult.success(brx.h); 
/* 144 */       if (i == 0)
/* 145 */         return DataResult.success(brx.g); 
/* 146 */       if (i == 1) {
/* 147 */         return DataResult.success(brx.i);
/*     */       }
/*     */     } 
/*     */     
/* 151 */     return brx.f.parse(☃);
/*     */   }
/*     */   
/*     */   public static gn.b a(gn.b ☃) {
/* 155 */     gs<chd> gs = ☃.b(gm.K);
/* 156 */     gs.a(f, i, Lifecycle.stable());
/* 157 */     gs.a(l, m, Lifecycle.stable());
/* 158 */     gs.a(g, j, Lifecycle.stable());
/* 159 */     gs.a(h, k, Lifecycle.stable());
/* 160 */     return ☃;
/*     */   }
/*     */   
/*     */   private static cfy a(gm<bsv> ☃, gm<chp> gm1, long l) {
/* 164 */     return new cho(new btk(☃, l), l, () -> (chp)☃.d(chp.f));
/*     */   }
/*     */   
/*     */   private static cfy b(gm<bsv> ☃, gm<chp> gm1, long l) {
/* 168 */     return new cho(bth.b.a.a(☃, l), l, () -> (chp)☃.d(chp.e));
/*     */   }
/*     */   
/*     */   public static gi<che> a(gm<chd> ☃, gm<bsv> gm1, gm<chp> gm2, long l) {
/* 172 */     gi<che> gi = new gi<>(gm.M, Lifecycle.experimental());
/*     */     
/* 174 */     gi.a(che.c, new che(() -> (chd)☃.d(g), b(gm1, gm2, l)), Lifecycle.stable());
/* 175 */     gi.a(che.d, new che(() -> (chd)☃.d(h), a(gm1, gm2, l)), Lifecycle.stable());
/* 176 */     return gi;
/*     */   }
/*     */   
/*     */   public static double a(chd ☃, chd chd1) {
/* 180 */     double d1 = ☃.f();
/* 181 */     double d2 = chd1.f();
/*     */     
/* 183 */     return d1 / d2;
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public String a() {
/* 188 */     if (a(k)) {
/* 189 */       return "_end";
/*     */     }
/* 191 */     return "";
/*     */   }
/*     */   
/*     */   public static File a(vj<brx> ☃, File file) {
/* 195 */     if (☃ == brx.g) {
/* 196 */       return file;
/*     */     }
/* 198 */     if (☃ == brx.i) {
/* 199 */       return new File(file, "DIM1");
/*     */     }
/* 201 */     if (☃ == brx.h) {
/* 202 */       return new File(file, "DIM-1");
/*     */     }
/* 204 */     return new File(file, "dimensions/" + ☃.a().b() + "/" + ☃.a().a());
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 208 */     return this.p;
/*     */   }
/*     */   
/*     */   public boolean c() {
/* 212 */     return this.q;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 216 */     return this.r;
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 220 */     return this.s;
/*     */   }
/*     */   
/*     */   public double f() {
/* 224 */     return this.t;
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 228 */     return this.v;
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 232 */     return this.w;
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 236 */     return this.x;
/*     */   }
/*     */   
/*     */   public boolean j() {
/* 240 */     return this.y;
/*     */   }
/*     */   
/*     */   public int k() {
/* 244 */     return this.z;
/*     */   }
/*     */   
/*     */   public boolean l() {
/* 248 */     return this.u;
/*     */   }
/*     */   
/*     */   public bta m() {
/* 252 */     return this.A;
/*     */   }
/*     */   
/*     */   public boolean n() {
/* 256 */     return this.o.isPresent();
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(long ☃) {
/* 261 */     double d1 = afm.h(this.o.orElse(☃) / 24000.0D - 0.25D);
/*     */ 
/*     */     
/* 264 */     double d2 = 0.5D - Math.cos(d1 * Math.PI) / 2.0D;
/*     */     
/* 266 */     return (float)(d1 * 2.0D + d2) / 3.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(long ☃) {
/* 271 */     return (int)(☃ / 24000L % 8L + 8L) % 8;
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(int ☃) {
/* 276 */     return this.E[☃];
/*     */   }
/*     */   
/*     */   public ael<buo> o() {
/* 280 */     ael<buo> ☃ = aed.a().a(this.B);
/* 281 */     return (☃ != null) ? ☃ : aed.aE;
/*     */   }
/*     */   
/*     */   public vk p() {
/* 285 */     return this.C;
/*     */   }
/*     */   
/*     */   public boolean a(chd ☃) {
/* 289 */     if (this == ☃) {
/* 290 */       return true;
/*     */     }
/* 292 */     return (this.p == ☃.p && this.q == ☃.q && this.r == ☃.r && this.s == ☃.s && this.t == ☃.t && this.u == ☃.u && this.v == ☃.v && this.w == ☃.w && this.x == ☃.x && this.y == ☃.y && this.z == ☃.z && 
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
/* 303 */       Float.compare(☃.D, this.D) == 0 && this.o
/* 304 */       .equals(☃.o) && this.A
/* 305 */       .equals(☃.A) && this.B
/* 306 */       .equals(☃.B) && this.C
/* 307 */       .equals(☃.C));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\chd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */