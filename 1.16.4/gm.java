/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import com.mojang.serialization.DynamicOps;
/*     */ import com.mojang.serialization.Keyable;
/*     */ import com.mojang.serialization.Lifecycle;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.Set;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Stream;
/*     */ import java.util.stream.StreamSupport;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.Validate;
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
/*     */ public abstract class gm<T>
/*     */   implements Codec<T>, Keyable, gg<T>
/*     */ {
/*  97 */   protected static final Logger c = LogManager.getLogger();
/*     */   
/*  99 */   private static final Map<vk, Supplier<?>> a = Maps.newLinkedHashMap();
/*     */   
/* 101 */   public static final vk d = new vk("root");
/* 102 */   protected static final gs<gs<?>> e = new gi(a("root"), Lifecycle.experimental());
/* 103 */   public static final gm<? extends gm<?>> f = (gm)e;
/*     */   
/* 105 */   public static final vj<gm<adp>> g = a("sound_event");
/* 106 */   public static final vj<gm<cuw>> h = a("fluid");
/* 107 */   public static final vj<gm<aps>> i = a("mob_effect");
/* 108 */   public static final vj<gm<buo>> j = a("block");
/* 109 */   public static final vj<gm<bps>> k = a("enchantment");
/* 110 */   public static final vj<gm<aqe<?>>> l = a("entity_type");
/* 111 */   public static final vj<gm<blx>> m = a("item");
/* 112 */   public static final vj<gm<bnt>> n = a("potion");
/* 113 */   public static final vj<gm<hg<?>>> o = a("particle_type");
/* 114 */   public static final vj<gm<cck<?>>> p = a("block_entity_type");
/* 115 */   public static final vj<gm<bcr>> q = a("motive");
/* 116 */   public static final vj<gm<vk>> r = a("custom_stat");
/* 117 */   public static final vj<gm<cga>> s = a("chunk_status");
/* 118 */   public static final vj<gm<csv<?>>> t = a("rule_test");
/* 119 */   public static final vj<gm<csp<?>>> u = a("pos_rule_test");
/* 120 */   public static final vj<gm<bje<?>>> v = a("menu");
/* 121 */   public static final vj<gm<bot<?>>> w = a("recipe_type");
/* 122 */   public static final vj<gm<bos<?>>> x = a("recipe_serializer");
/* 123 */   public static final vj<gm<arg>> y = a("attribute");
/*     */   
/* 125 */   public static final vj<gm<adz<?>>> z = a("stat_type");
/*     */   
/* 127 */   public static final vj<gm<bfo>> A = a("villager_type");
/* 128 */   public static final vj<gm<bfm>> B = a("villager_profession");
/* 129 */   public static final vj<gm<azr>> C = a("point_of_interest_type");
/* 130 */   public static final vj<gm<ayd<?>>> D = a("memory_module_type");
/* 131 */   public static final vj<gm<azc<?>>> E = a("sensor_type");
/*     */   
/* 133 */   public static final vj<gm<bhh>> F = a("schedule");
/* 134 */   public static final vj<gm<bhf>> G = a("activity");
/*     */   
/* 136 */   public static final vj<gm<czr>> H = a("loot_pool_entry_type");
/* 137 */   public static final vj<gm<dak>> I = a("loot_function_type");
/* 138 */   public static final vj<gm<dbp>> J = a("loot_condition_type");
/*     */   
/* 140 */   public static final vj<gm<chd>> K = a("dimension_type");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 145 */   public static final vj<gm<brx>> L = a("dimension");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 150 */   public static final vj<gm<che>> M = a("dimension");
/*     */   
/* 152 */   public static final gm<adp> N = a(g, () -> adq.gL);
/* 153 */   public static final gb<cuw> O = a(h, "empty", () -> cuy.a);
/* 154 */   public static final gm<aps> P = a(i, () -> apw.z);
/* 155 */   public static final gb<buo> Q = a(j, "air", () -> bup.a);
/* 156 */   public static final gm<bps> R = a(k, () -> bpw.w);
/* 157 */   public static final gb<aqe<?>> S = a(l, "pig", () -> aqe.ah);
/* 158 */   public static final gb<blx> T = a(m, "air", () -> bmd.a);
/* 159 */   public static final gb<bnt> U = a(n, "empty", () -> bnw.a);
/* 160 */   public static final gm<hg<?>> V = a(o, () -> hh.d);
/* 161 */   public static final gm<cck<?>> W = a(p, () -> cck.a);
/* 162 */   public static final gb<bcr> X = a(q, "kebab", () -> bcr.a);
/* 163 */   public static final gm<vk> Y = a(r, () -> aea.D);
/* 164 */   public static final gb<cga> Z = a(s, "empty", () -> cga.a);
/* 165 */   public static final gm<csv<?>> aa = a(t, () -> csv.a);
/* 166 */   public static final gm<csp<?>> ab = a(u, () -> csp.a);
/* 167 */   public static final gm<bje<?>> ac = a(v, () -> bje.h);
/* 168 */   public static final gm<bot<?>> ad = a(w, () -> bot.a);
/* 169 */   public static final gm<bos<?>> ae = a(x, () -> bos.b);
/* 170 */   public static final gm<arg> af = a(y, () -> arl.k);
/*     */   
/* 172 */   public static final gm<adz<?>> ag = a(z, () -> aea.c);
/*     */   
/* 174 */   public static final gb<bfo> ah = a(A, "plains", () -> bfo.c);
/* 175 */   public static final gb<bfm> ai = a(B, "none", () -> bfm.a);
/* 176 */   public static final gb<azr> aj = a(C, "unemployed", () -> azr.c);
/* 177 */   public static final gb<ayd<?>> ak = a(D, "dummy", () -> ayd.a);
/* 178 */   public static final gb<azc<?>> al = a(E, "dummy", () -> azc.a);
/*     */   
/* 180 */   public static final gm<bhh> am = a(F, () -> bhh.a);
/* 181 */   public static final gm<bhf> an = a(G, () -> bhf.b);
/*     */   
/* 183 */   public static final gm<czr> ao = a(H, () -> czo.a);
/* 184 */   public static final gm<dak> ap = a(I, () -> dal.b);
/* 185 */   public static final gm<dbp> aq = a(J, () -> dbq.a);
/*     */   
/* 187 */   public static final vj<gm<chp>> ar = a("worldgen/noise_settings");
/*     */   
/* 189 */   public static final vj<gm<ctg<?>>> as = a("worldgen/configured_surface_builder");
/* 190 */   public static final vj<gm<cib<?>>> at = a("worldgen/configured_carver");
/* 191 */   public static final vj<gm<civ<?, ?>>> au = a("worldgen/configured_feature");
/* 192 */   public static final vj<gm<ciw<?, ?>>> av = a("worldgen/configured_structure_feature");
/* 193 */   public static final vj<gm<csz>> aw = a("worldgen/processor_list");
/* 194 */   public static final vj<gm<cok>> ax = a("worldgen/template_pool");
/* 195 */   public static final vj<gm<bsv>> ay = a("worldgen/biome");
/*     */   
/* 197 */   public static final vj<gm<ctt<?>>> az = a("worldgen/surface_builder");
/* 198 */   public static final gm<ctt<?>> aA = a(az, () -> ctt.v);
/*     */   
/* 200 */   public static final vj<gm<cig<?>>> aB = a("worldgen/carver");
/* 201 */   public static final gm<cig<?>> aC = a(aB, () -> cig.a);
/*     */   
/* 203 */   public static final vj<gm<cjl<?>>> aD = a("worldgen/feature");
/* 204 */   public static final gm<cjl<?>> aE = a(aD, () -> cjl.A);
/*     */   
/* 206 */   public static final vj<gm<cla<?>>> aF = a("worldgen/structure_feature");
/* 207 */   public static final gm<cla<?>> aG = a(aF, () -> cla.c);
/*     */   
/* 209 */   public static final vj<gm<clb>> aH = a("worldgen/structure_piece");
/* 210 */   public static final gm<clb> aI = a(aH, () -> clb.c);
/* 211 */   public static final vj<gm<cqc<?>>> aJ = a("worldgen/decorator");
/* 212 */   public static final gm<cqc<?>> aK = a(aJ, () -> cqc.a);
/*     */   
/* 214 */   public static final vj<gm<cnu<?>>> aL = a("worldgen/block_state_provider_type");
/* 215 */   public static final vj<gm<clm<?>>> aM = a("worldgen/block_placer_type");
/* 216 */   public static final vj<gm<cnm<?>>> aN = a("worldgen/foliage_placer_type");
/* 217 */   public static final vj<gm<cpc<?>>> aO = a("worldgen/trunk_placer_type");
/* 218 */   public static final vj<gm<cos<?>>> aP = a("worldgen/tree_decorator_type");
/* 219 */   public static final vj<gm<cnc<?>>> aQ = a("worldgen/feature_size_type");
/* 220 */   public static final vj<gm<Codec<? extends bsy>>> aR = a("worldgen/biome_source");
/* 221 */   public static final vj<gm<Codec<? extends cfy>>> aS = a("worldgen/chunk_generator");
/* 222 */   public static final vj<gm<cta<?>>> aT = a("worldgen/structure_processor");
/* 223 */   public static final vj<gm<coj<?>>> aU = a("worldgen/structure_pool_element");
/*     */   
/* 225 */   public static final gm<cnu<?>> aV = a(aL, () -> cnu.a);
/* 226 */   public static final gm<clm<?>> aW = a(aM, () -> clm.a);
/* 227 */   public static final gm<cnm<?>> aX = a(aN, () -> cnm.a);
/* 228 */   public static final gm<cpc<?>> aY = a(aO, () -> cpc.a);
/* 229 */   public static final gm<cos<?>> aZ = a(aP, () -> cos.b);
/* 230 */   public static final gm<cnc<?>> ba = a(aQ, () -> cnc.a);
/* 231 */   public static final gm<Codec<? extends bsy>> bb = a(aR, Lifecycle.stable(), () -> bsy.a);
/* 232 */   public static final gm<Codec<? extends cfy>> bc = a(aS, Lifecycle.stable(), () -> cfy.a);
/* 233 */   public static final gm<cta<?>> bd = a(aT, () -> cta.a);
/* 234 */   public static final gm<coj<?>> be = a(aU, () -> coj.d); private final vj<? extends gm<T>> b;
/*     */   
/*     */   static {
/* 237 */     hk.a();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 245 */     a.forEach((☃, supplier) -> {
/*     */           if (supplier.get() == null) {
/*     */             c.error("Unable to bootstrap registry '{}'", ☃);
/*     */           }
/*     */         });
/*     */     
/* 251 */     a(e);
/*     */   }
/*     */   private final Lifecycle bf;
/*     */   public static <T extends gs<?>> void a(gs<T> ☃) {
/* 255 */     ☃.forEach(gs1 -> {
/*     */           if (gs1.c().isEmpty()) {
/*     */             c.error("Registry '{}' was empty after loading", ☃.b(gs1));
/*     */             if (w.d)
/*     */               throw new IllegalStateException("Registry: '" + ☃.b(gs1) + "' is empty, not allowed, fix me!"); 
/*     */           } 
/*     */           if (gs1 instanceof gb) {
/*     */             vk vk1 = ((gb)gs1).a();
/*     */             Validate.notNull(gs1.a(vk1), "Missing default of DefaultedMappedRegistry: " + vk1, new Object[0]);
/*     */           } 
/*     */         });
/*     */   }
/*     */   private static <T> vj<gm<T>> a(String ☃) {
/*     */     return vj.a(new vk(☃));
/*     */   }
/*     */   private static <T> gm<T> a(vj<? extends gm<T>> ☃, Supplier<T> supplier) {
/* 271 */     return a(☃, Lifecycle.experimental(), supplier);
/*     */   }
/*     */   
/*     */   private static <T> gb<T> a(vj<? extends gm<T>> ☃, String str, Supplier<T> supplier) {
/* 275 */     return a(☃, str, Lifecycle.experimental(), supplier);
/*     */   }
/*     */   
/*     */   private static <T> gm<T> a(vj<? extends gm<T>> ☃, Lifecycle lifecycle, Supplier<T> supplier) {
/* 279 */     return a(☃, new gi<>(☃, lifecycle), supplier, lifecycle);
/*     */   }
/*     */   
/*     */   private static <T> gb<T> a(vj<? extends gm<T>> ☃, String str, Lifecycle lifecycle, Supplier<T> supplier) {
/* 283 */     return a(☃, new gb<>(str, ☃, lifecycle), supplier, lifecycle);
/*     */   }
/*     */ 
/*     */   
/*     */   private static <T, R extends gs<T>> R a(vj<? extends gm<T>> ☃, R r, Supplier<T> supplier, Lifecycle lifecycle) {
/* 288 */     vk vk1 = ☃.a();
/* 289 */     a.put(vk1, supplier);
/*     */     
/* 291 */     gs<gs<?>> gs1 = e;
/* 292 */     return (R)gs1.<gs>a(☃, (gs)r, lifecycle);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected gm(vj<? extends gm<T>> ☃, Lifecycle lifecycle) {
/* 299 */     this.b = ☃;
/* 300 */     this.bf = lifecycle;
/*     */   }
/*     */   
/*     */   public vj<? extends gm<T>> f() {
/* 304 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 309 */     return "Registry[" + this.b + " (" + this.bf + ")]";
/*     */   }
/*     */ 
/*     */   
/*     */   public <U> DataResult<Pair<T, U>> decode(DynamicOps<U> ☃, U u) {
/* 314 */     if (☃.compressMaps()) {
/* 315 */       return ☃.getNumberValue(u).flatMap(☃ -> {
/*     */             T t = a(☃.intValue());
/*     */ 
/*     */ 
/*     */             
/*     */             return (t == null) ? DataResult.error("Unknown registry id: " + ☃) : DataResult.success(t, d(t));
/* 321 */           }).map(object -> Pair.of(object, ☃.empty()));
/*     */     }
/* 323 */     return vk.a.decode(☃, u).flatMap(☃ -> {
/*     */           T t = a((vk)☃.getFirst());
/*     */           return (t == null) ? DataResult.error("Unknown registry key: " + ☃.getFirst()) : DataResult.success(Pair.of(t, ☃.getSecond()), d(t));
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <U> DataResult<U> encode(T ☃, DynamicOps<U> dynamicOps, U u) {
/* 334 */     vk vk1 = b(☃);
/* 335 */     if (vk1 == null) {
/* 336 */       return DataResult.error("Unknown registry element " + ☃);
/*     */     }
/* 338 */     if (dynamicOps.compressMaps()) {
/* 339 */       return dynamicOps.mergeToPrimitive(u, dynamicOps.createInt(a(☃))).setLifecycle(this.bf);
/*     */     }
/* 341 */     return dynamicOps.mergeToPrimitive(u, dynamicOps.createString(vk1.toString())).setLifecycle(this.bf);
/*     */   }
/*     */ 
/*     */   
/*     */   public <U> Stream<U> keys(DynamicOps<U> ☃) {
/* 346 */     return c().stream().map(vk1 -> ☃.createString(vk1.toString()));
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
/*     */   public Optional<T> b(@Nullable vk ☃) {
/* 368 */     return Optional.ofNullable(a(☃));
/*     */   }
/*     */   
/*     */   public Optional<T> c(@Nullable vj<T> ☃) {
/* 372 */     return Optional.ofNullable(a(☃));
/*     */   }
/*     */   
/*     */   public T d(vj<T> ☃) {
/* 376 */     T t = a(☃);
/* 377 */     if (t == null) {
/* 378 */       throw new IllegalStateException("Missing: " + ☃);
/*     */     }
/* 380 */     return t;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Stream<T> g() {
/* 391 */     return StreamSupport.stream(spliterator(), false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <T> T a(gm<? super T> ☃, String str, T t) {
/* 399 */     return a(☃, new vk(str), t);
/*     */   }
/*     */   
/*     */   public static <V, T extends V> T a(gm<V> ☃, vk vk1, T t) {
/* 403 */     return (T)((gs)☃).a(vj.a(☃.b, vk1), t, Lifecycle.stable());
/*     */   }
/*     */   
/*     */   public static <V, T extends V> T a(gm<V> ☃, int i, String str, T t) {
/* 407 */     return (T)((gs)☃).a(i, vj.a(☃.b, new vk(str)), t, Lifecycle.stable());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public abstract vk b(T paramT);
/*     */   
/*     */   public abstract Optional<vj<T>> c(T paramT);
/*     */   
/*     */   public abstract int a(@Nullable T paramT);
/*     */   
/*     */   @Nullable
/*     */   public abstract T a(@Nullable vj<T> paramvj);
/*     */   
/*     */   @Nullable
/*     */   public abstract T a(@Nullable vk paramvk);
/*     */   
/*     */   protected abstract Lifecycle d(T paramT);
/*     */   
/*     */   public abstract Lifecycle b();
/*     */   
/*     */   public abstract Set<vk> c();
/*     */   
/*     */   public abstract Set<Map.Entry<vj<T>, T>> d();
/*     */   
/*     */   public abstract boolean c(vk paramvk);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\gm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */