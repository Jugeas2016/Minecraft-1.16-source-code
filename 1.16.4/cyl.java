/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.datafixers.DataFixer;
/*     */ import com.mojang.serialization.Decoder;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import com.mojang.serialization.DynamicLike;
/*     */ import com.mojang.serialization.Lifecycle;
/*     */ import java.util.LinkedHashSet;
/*     */ import java.util.Set;
/*     */ import java.util.UUID;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class cyl
/*     */   implements cym, cyn
/*     */ {
/*  42 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */   
/*     */   private bsa b;
/*     */ 
/*     */   
/*     */   private final chw c;
/*     */ 
/*     */   
/*     */   private final Lifecycle d;
/*     */ 
/*     */   
/*     */   private int e;
/*     */ 
/*     */   
/*     */   private int f;
/*     */ 
/*     */   
/*     */   private int g;
/*     */ 
/*     */   
/*     */   private float h;
/*     */ 
/*     */   
/*     */   private long i;
/*     */ 
/*     */   
/*     */   private long j;
/*     */   
/*     */   @Nullable
/*     */   private final DataFixer k;
/*     */   
/*     */   private final int l;
/*     */   
/*     */   private boolean m;
/*     */   
/*     */   @Nullable
/*     */   private md n;
/*     */   
/*     */   private final int o;
/*     */   
/*     */   private int p;
/*     */   
/*     */   private boolean q;
/*     */   
/*     */   private int r;
/*     */   
/*     */   private boolean s;
/*     */   
/*     */   private int t;
/*     */   
/*     */   private boolean u;
/*     */   
/*     */   private boolean v;
/*     */   
/*     */   private cfu.c w;
/*     */   
/*     */   private md x;
/*     */   
/*     */   @Nullable
/*     */   private md y;
/*     */   
/*     */   private int z;
/*     */   
/*     */   private int A;
/*     */   
/*     */   @Nullable
/*     */   private UUID B;
/*     */   
/*     */   private final Set<String> C;
/*     */   
/*     */   private boolean D;
/*     */   
/*     */   private final dcf<MinecraftServer> E;
/*     */ 
/*     */   
/*     */   private cyl(@Nullable DataFixer ☃, int i, @Nullable md md1, boolean bool1, int j, int k, int m, float f, long l1, long l2, int n, int i1, int i2, boolean bool2, int i3, boolean bool3, boolean bool4, boolean bool5, cfu.c c1, int i4, int i5, @Nullable UUID uUID, LinkedHashSet<String> linkedHashSet, dcf<MinecraftServer> dcf1, @Nullable md md2, md md3, bsa bsa1, chw chw1, Lifecycle lifecycle) {
/* 119 */     this.k = ☃;
/* 120 */     this.D = bool1;
/* 121 */     this.e = j;
/* 122 */     this.f = k;
/* 123 */     this.g = m;
/* 124 */     this.h = f;
/* 125 */     this.i = l1;
/* 126 */     this.j = l2;
/* 127 */     this.o = n;
/* 128 */     this.p = i1;
/* 129 */     this.r = i2;
/* 130 */     this.q = bool2;
/* 131 */     this.t = i3;
/* 132 */     this.s = bool3;
/* 133 */     this.u = bool4;
/* 134 */     this.v = bool5;
/* 135 */     this.w = c1;
/* 136 */     this.z = i4;
/* 137 */     this.A = i5;
/* 138 */     this.B = uUID;
/* 139 */     this.C = linkedHashSet;
/* 140 */     this.n = md1;
/* 141 */     this.l = i;
/* 142 */     this.E = dcf1;
/* 143 */     this.y = md2;
/* 144 */     this.x = md3;
/* 145 */     this.b = bsa1;
/* 146 */     this.c = chw1;
/* 147 */     this.d = lifecycle;
/*     */   }
/*     */   
/*     */   public cyl(bsa ☃, chw chw1, Lifecycle lifecycle) {
/* 151 */     this(null, 
/* 152 */         w.a().getWorldVersion(), null, false, 0, 0, 0, 0.0F, 0L, 0L, 19133, 0, 0, false, 0, false, false, false, cfu.c, 0, 0, null, 
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
/* 173 */         Sets.newLinkedHashSet(), new dcf<>(dce.a), null, new md(), ☃
/*     */ 
/*     */ 
/*     */         
/* 177 */         .h(), chw1, lifecycle);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static cyl a(Dynamic<mt> ☃, DataFixer dataFixer, int i, @Nullable md md1, bsa bsa1, cyi cyi1, chw chw1, Lifecycle lifecycle) {
/* 184 */     long l = ☃.get("Time").asLong(0L);
/*     */ 
/*     */     
/* 187 */     md md2 = ☃.get("DragonFight").result().map(Dynamic::getValue).orElseGet(() -> (mt)☃.get("DimensionData").get("1").get("DragonFight").orElseEmptyMap().getValue());
/*     */ 
/*     */ 
/*     */     
/* 191 */     return new cyl(dataFixer, i, md1, ☃
/*     */ 
/*     */ 
/*     */         
/* 195 */         .get("WasModded").asBoolean(false), ☃
/* 196 */         .get("SpawnX").asInt(0), ☃
/* 197 */         .get("SpawnY").asInt(0), ☃
/* 198 */         .get("SpawnZ").asInt(0), ☃
/* 199 */         .get("SpawnAngle").asFloat(0.0F), l, ☃
/*     */         
/* 201 */         .get("DayTime").asLong(l), cyi1
/* 202 */         .a(), ☃
/* 203 */         .get("clearWeatherTime").asInt(0), ☃
/* 204 */         .get("rainTime").asInt(0), ☃
/* 205 */         .get("raining").asBoolean(false), ☃
/* 206 */         .get("thunderTime").asInt(0), ☃
/* 207 */         .get("thundering").asBoolean(false), ☃
/* 208 */         .get("initialized").asBoolean(true), ☃
/* 209 */         .get("DifficultyLocked").asBoolean(false), 
/* 210 */         cfu.c.a((DynamicLike<?>)☃, cfu.c), ☃
/* 211 */         .get("WanderingTraderSpawnDelay").asInt(0), ☃
/* 212 */         .get("WanderingTraderSpawnChance").asInt(0), ☃
/* 213 */         .get("WanderingTraderId").read((Decoder)gq.a).result().orElse(null), (LinkedHashSet<String>)☃
/* 214 */         .get("ServerBrands").asStream().flatMap(☃ -> x.a(☃.asString().result())).collect(Collectors.toCollection(Sets::newLinkedHashSet)), new dcf<>(dce.a, ☃
/* 215 */           .get("ScheduledEvents").asStream()), (md)☃
/* 216 */         .get("CustomBossEvents").orElseEmptyMap().getValue(), md2, bsa1, chw1, lifecycle);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public md a(gn ☃, @Nullable md md1) {
/* 226 */     J();
/* 227 */     if (md1 == null) {
/* 228 */       md1 = this.n;
/*     */     }
/* 230 */     md md2 = new md();
/* 231 */     a(☃, md2, md1);
/* 232 */     return md2;
/*     */   }
/*     */   
/*     */   private void a(gn ☃, md md1, @Nullable md md2) {
/* 236 */     mj mj = new mj();
/* 237 */     this.C.stream().map(ms::a).forEach(mj::add);
/* 238 */     md1.a("ServerBrands", mj);
/* 239 */     md1.a("WasModded", this.D);
/* 240 */     md md3 = new md();
/* 241 */     md3.a("Name", w.a().getName());
/* 242 */     md3.b("Id", w.a().getWorldVersion());
/* 243 */     md3.a("Snapshot", !w.a().isStable());
/* 244 */     md1.a("Version", md3);
/*     */     
/* 246 */     md1.b("DataVersion", w.a().getWorldVersion());
/*     */     
/* 248 */     vi<mt> vi = vi.a(mo.a, ☃);
/* 249 */     chw.a
/* 250 */       .encodeStart(vi, this.c)
/* 251 */       .resultOrPartial(x.a("WorldGenSettings: ", a::error))
/* 252 */       .ifPresent(mt1 -> ☃.a("WorldGenSettings", mt1));
/*     */     
/* 254 */     md1.b("GameType", this.b.b().a());
/* 255 */     md1.b("SpawnX", this.e);
/* 256 */     md1.b("SpawnY", this.f);
/* 257 */     md1.b("SpawnZ", this.g);
/* 258 */     md1.a("SpawnAngle", this.h);
/* 259 */     md1.a("Time", this.i);
/* 260 */     md1.a("DayTime", this.j);
/* 261 */     md1.a("LastPlayed", x.d());
/* 262 */     md1.a("LevelName", this.b.a());
/* 263 */     md1.b("version", 19133);
/* 264 */     md1.b("clearWeatherTime", this.p);
/* 265 */     md1.b("rainTime", this.r);
/* 266 */     md1.a("raining", this.q);
/* 267 */     md1.b("thunderTime", this.t);
/* 268 */     md1.a("thundering", this.s);
/* 269 */     md1.a("hardcore", this.b.c());
/* 270 */     md1.a("allowCommands", this.b.e());
/* 271 */     md1.a("initialized", this.u);
/* 272 */     this.w.a(md1);
/* 273 */     md1.a("Difficulty", (byte)this.b.d().a());
/* 274 */     md1.a("DifficultyLocked", this.v);
/* 275 */     md1.a("GameRules", this.b.f().a());
/*     */     
/* 277 */     md1.a("DragonFight", this.x);
/*     */     
/* 279 */     if (md2 != null) {
/* 280 */       md1.a("Player", md2);
/*     */     }
/*     */     
/* 283 */     brk.b.encodeStart(mo.a, this.b.g()).result().ifPresent(mt1 -> ☃.a("DataPacks", mt1));
/*     */     
/* 285 */     if (this.y != null) {
/* 286 */       md1.a("CustomBossEvents", this.y);
/*     */     }
/*     */     
/* 289 */     md1.a("ScheduledEvents", this.E.b());
/*     */     
/* 291 */     md1.b("WanderingTraderSpawnDelay", this.z);
/* 292 */     md1.b("WanderingTraderSpawnChance", this.A);
/* 293 */     if (this.B != null) {
/* 294 */       md1.a("WanderingTraderId", this.B);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int a() {
/* 300 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b() {
/* 305 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c() {
/* 310 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public float d() {
/* 315 */     return this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   public long e() {
/* 320 */     return this.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public long f() {
/* 325 */     return this.j;
/*     */   }
/*     */   
/*     */   private void J() {
/* 329 */     if (this.m || this.n == null) {
/*     */       return;
/*     */     }
/* 332 */     if (this.l < w.a().getWorldVersion()) {
/* 333 */       if (this.k == null) {
/* 334 */         throw (NullPointerException)x.c(new NullPointerException("Fixer Upper not set inside LevelData, and the player tag is not upgraded."));
/*     */       }
/* 336 */       this.n = mp.a(this.k, aga.b, this.n, this.l);
/*     */     } 
/* 338 */     this.m = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public md y() {
/* 343 */     J();
/* 344 */     return this.n;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(int ☃) {
/* 349 */     this.e = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(int ☃) {
/* 354 */     this.f = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d(int ☃) {
/* 359 */     this.g = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float ☃) {
/* 364 */     this.h = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(long ☃) {
/* 369 */     this.i = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(long ☃) {
/* 374 */     this.j = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(fx ☃, float f) {
/* 379 */     this.e = ☃.u();
/* 380 */     this.f = ☃.v();
/* 381 */     this.g = ☃.w();
/* 382 */     this.h = f;
/*     */   }
/*     */ 
/*     */   
/*     */   public String g() {
/* 387 */     return this.b.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public int z() {
/* 392 */     return this.o;
/*     */   }
/*     */ 
/*     */   
/*     */   public int h() {
/* 397 */     return this.p;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃) {
/* 402 */     this.p = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i() {
/* 407 */     return this.s;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(boolean ☃) {
/* 412 */     this.s = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int j() {
/* 417 */     return this.t;
/*     */   }
/*     */ 
/*     */   
/*     */   public void e(int ☃) {
/* 422 */     this.t = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean k() {
/* 427 */     return this.q;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(boolean ☃) {
/* 432 */     this.q = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int l() {
/* 437 */     return this.r;
/*     */   }
/*     */ 
/*     */   
/*     */   public void f(int ☃) {
/* 442 */     this.r = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public bru m() {
/* 447 */     return this.b.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bru ☃) {
/* 452 */     this.b = this.b.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean n() {
/* 457 */     return this.b.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean o() {
/* 462 */     return this.b.e();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean p() {
/* 467 */     return this.u;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(boolean ☃) {
/* 472 */     this.u = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public brt q() {
/* 477 */     return this.b.f();
/*     */   }
/*     */ 
/*     */   
/*     */   public cfu.c r() {
/* 482 */     return this.w;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(cfu.c ☃) {
/* 487 */     this.w = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public aor s() {
/* 492 */     return this.b.d();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aor ☃) {
/* 497 */     this.b = this.b.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean t() {
/* 502 */     return this.v;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d(boolean ☃) {
/* 507 */     this.v = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public dcf<MinecraftServer> u() {
/* 512 */     return this.E;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(m ☃) {
/* 517 */     super.a(☃);
/* 518 */     super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public chw A() {
/* 523 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public Lifecycle B() {
/* 528 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public md C() {
/* 533 */     return this.x;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 538 */     this.x = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public brk D() {
/* 543 */     return this.b.g();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brk ☃) {
/* 548 */     this.b = this.b.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public md E() {
/* 554 */     return this.y;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(@Nullable md ☃) {
/* 559 */     this.y = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int v() {
/* 564 */     return this.z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void g(int ☃) {
/* 569 */     this.z = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int w() {
/* 574 */     return this.A;
/*     */   }
/*     */ 
/*     */   
/*     */   public void h(int ☃) {
/* 579 */     this.A = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(UUID ☃) {
/* 591 */     this.B = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(String ☃, boolean bool) {
/* 596 */     this.C.add(☃);
/* 597 */     this.D |= bool;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean F() {
/* 602 */     return this.D;
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<String> G() {
/* 607 */     return (Set<String>)ImmutableSet.copyOf(this.C);
/*     */   }
/*     */ 
/*     */   
/*     */   public cym H() {
/* 612 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public bsa I() {
/* 617 */     return this.b.h();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cyl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */