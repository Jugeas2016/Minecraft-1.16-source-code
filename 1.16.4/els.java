/*     */ import com.google.common.annotations.VisibleForTesting;
/*     */ import com.google.common.base.Splitter;
/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.Reader;
/*     */ import java.io.StringReader;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.Collection;
/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.Set;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.IntStream;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ import org.apache.commons.lang3.tuple.Triple;
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
/*     */ public class els
/*     */ {
/*  69 */   public static final elr a = new elr(ekb.d, new vk("block/fire_0"));
/*  70 */   public static final elr b = new elr(ekb.d, new vk("block/fire_1"));
/*  71 */   public static final elr c = new elr(ekb.d, new vk("block/lava_flow"));
/*  72 */   public static final elr d = new elr(ekb.d, new vk("block/water_flow"));
/*  73 */   public static final elr e = new elr(ekb.d, new vk("block/water_overlay"));
/*     */   
/*  75 */   public static final elr f = new elr(ekb.d, new vk("entity/banner_base"));
/*  76 */   public static final elr g = new elr(ekb.d, new vk("entity/shield_base"));
/*  77 */   public static final elr h = new elr(ekb.d, new vk("entity/shield_base_nopattern")); public static final List<vk> i; public static final List<vk> j;
/*     */   
/*     */   static {
/*  80 */     i = (List<vk>)IntStream.range(0, 10).mapToObj(☃ -> new vk("block/destroy_stage_" + ☃)).collect(Collectors.toList());
/*     */ 
/*     */ 
/*     */     
/*  84 */     j = (List<vk>)i.stream().map(☃ -> new vk("textures/" + ☃.a() + ".png")).collect(Collectors.toList());
/*     */   }
/*  86 */   public static final List<eao> k = (List<eao>)j.stream().map(eao::o).collect(Collectors.toList()); private static final Set<elr> p;
/*     */   static {
/*  88 */     p = x.<Set<elr>>a(Sets.newHashSet(), ☃ -> {
/*     */           ☃.add(d);
/*     */           ☃.add(c);
/*     */           ☃.add(e);
/*     */           ☃.add(a);
/*     */           ☃.add(b);
/*     */           ☃.add(ecc.a);
/*     */           ☃.add(eci.a);
/*     */           ☃.add(eci.c);
/*     */           ☃.add(eci.d);
/*     */           ☃.add(eci.e);
/*     */           ☃.add(eci.f);
/*     */           ☃.add(eci.g);
/*     */           ☃.add(ecj.a);
/*     */           ☃.add(f);
/*     */           ☃.add(g);
/*     */           ☃.add(h);
/*     */           for (vk vk : i) {
/*     */             ☃.add(new elr(ekb.d, vk));
/*     */           }
/*     */           ☃.add(new elr(ekb.d, biz.d));
/*     */           ☃.add(new elr(ekb.d, biz.e));
/*     */           ☃.add(new elr(ekb.d, biz.f));
/*     */           ☃.add(new elr(ekb.d, biz.g));
/*     */           ☃.add(new elr(ekb.d, biz.h));
/*     */           ear.a(☃::add);
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 122 */   private static final Logger q = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 128 */   public static final elu l = new elu("builtin/missing", "missing");
/* 129 */   private static final String r = l.toString();
/*     */   
/*     */   @VisibleForTesting
/* 132 */   public static final String m = ("{    'textures': {       'particle': '" + 
/*     */ 
/*     */     
/* 135 */     ejv.a().a() + "',       'missingno': '" + 
/* 136 */     ejv.a().a() + "'    },    'elements': [         {  'from': [ 0, 0, 0 ],            'to': [ 16, 16, 16 ],            'faces': {                'down':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'down',  'texture': '#missingno' },                'up':    { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'up',    'texture': '#missingno' },                'north': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'north', 'texture': '#missingno' },                'south': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'south', 'texture': '#missingno' },                'west':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'west',  'texture': '#missingno' },                'east':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'east',  'texture': '#missingno' }            }        }    ]}")
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
/* 151 */     .replace('\'', '"');
/*     */   
/* 153 */   private static final Map<String, String> s = Maps.newHashMap((Map)ImmutableMap.of("missing", m));
/*     */   
/* 155 */   private static final Splitter t = Splitter.on(',');
/* 156 */   private static final Splitter u = Splitter.on('=').limit(2); public static final ebf n; public static final ebf o;
/*     */   static {
/* 158 */     n = x.<ebf>a(ebf.a("{\"gui_light\": \"front\"}"), ☃ -> ☃.b = "generation marker");
/* 159 */     o = x.<ebf>a(ebf.a("{\"gui_light\": \"side\"}"), ☃ -> ☃.b = "block entity marker");
/* 160 */   } private static final cei<buo, ceh> v = (new cei.a<>(bup.a)).a((cfj<?>[])new cfj[] { cey.a("map") }).a(buo::n, ceh::new);
/* 161 */   private static final ebi w = new ebi();
/* 162 */   private static final Map<vk, cei<buo, ceh>> x = (Map<vk, cei<buo, ceh>>)ImmutableMap.of(new vk("item_frame"), v);
/*     */   
/*     */   private final ach y;
/*     */   
/*     */   @Nullable
/*     */   private ejr z;
/*     */   private final dko A;
/* 169 */   private final Set<vk> B = Sets.newHashSet();
/* 170 */   private final ebg.a C = new ebg.a();
/*     */   
/* 172 */   private final Map<vk, ely> D = Maps.newHashMap();
/* 173 */   private final Map<Triple<vk, f, Boolean>, elo> E = Maps.newHashMap();
/*     */   
/* 175 */   private final Map<vk, ely> F = Maps.newHashMap();
/* 176 */   private final Map<vk, elo> G = Maps.newHashMap();
/*     */   
/*     */   private final Map<vk, Pair<ekb, ekb.a>> H;
/*     */   
/* 180 */   private int I = 1; private final Object2IntMap<ceh> J; public els(ach ☃, dko dko1, anw anw1, int i) {
/* 181 */     this.J = (Object2IntMap<ceh>)x.a(new Object2IntOpenHashMap(), ☃ -> ☃.defaultReturnValue(-1));
/*     */ 
/*     */     
/* 184 */     this.y = ☃;
/* 185 */     this.A = dko1;
/*     */     
/* 187 */     anw1.a("missing_model");
/*     */     try {
/* 189 */       this.D.put(l, c(l));
/* 190 */       a(l);
/* 191 */     } catch (IOException iOException) {
/* 192 */       q.error("Error loading missing model, should never happen :(", iOException);
/* 193 */       throw new RuntimeException(iOException);
/*     */     } 
/*     */     
/* 196 */     anw1.b("static_definitions");
/* 197 */     x.forEach((☃, cei1) -> cei1.a().forEach(()));
/*     */     
/* 199 */     anw1.b("blocks");
/* 200 */     for (buo buo : gm.Q) {
/* 201 */       buo.m().a().forEach(☃ -> a(eaw.c(☃)));
/*     */     }
/*     */     
/* 204 */     anw1.b("items");
/* 205 */     for (vk vk : gm.T.c()) {
/* 206 */       a(new elu(vk, "inventory"));
/*     */     }
/*     */     
/* 209 */     anw1.b("special");
/* 210 */     a(new elu("minecraft:trident_in_hand#inventory"));
/*     */ 
/*     */     
/* 213 */     anw1.b("textures");
/* 214 */     Set<Pair<String, String>> set = Sets.newLinkedHashSet();
/* 215 */     Set<elr> set1 = (Set<elr>)this.F.values().stream().flatMap(ely1 -> ely1.a(this::a, ☃).stream()).collect(Collectors.toSet());
/* 216 */     set1.addAll(p);
/*     */     
/* 218 */     set.stream().filter(☃ -> !((String)☃.getSecond()).equals(r)).forEach(☃ -> q.warn("Unable to resolve texture reference: {} in {}", ☃.getFirst(), ☃.getSecond()));
/*     */     
/* 220 */     Map<vk, List<elr>> map = (Map<vk, List<elr>>)set1.stream().collect(Collectors.groupingBy(elr::a));
/*     */     
/* 222 */     anw1.b("stitching");
/* 223 */     this.H = Maps.newHashMap();
/* 224 */     for (Map.Entry<vk, List<elr>> entry : map.entrySet()) {
/* 225 */       ekb ekb = new ekb(entry.getKey());
/* 226 */       ekb.a a1 = ekb.a(this.y, ((List)entry.getValue()).stream().map(elr::b), anw1, i);
/* 227 */       this.H.put(entry.getKey(), Pair.of(ekb, a1));
/*     */     } 
/* 229 */     anw1.c();
/*     */   }
/*     */   
/*     */   public ejr a(ekd ☃, anw anw1) {
/* 233 */     anw1.a("atlas");
/* 234 */     for (Pair<ekb, ekb.a> pair : this.H.values()) {
/* 235 */       ekb ekb = (ekb)pair.getFirst();
/* 236 */       ekb.a a1 = (ekb.a)pair.getSecond();
/* 237 */       ekb.a(a1);
/* 238 */       ☃.a(ekb.g(), ekb);
/* 239 */       ☃.a(ekb.g());
/* 240 */       ekb.b(a1);
/*     */     } 
/*     */     
/* 243 */     this.z = new ejr((Collection<ekb>)this.H.values().stream().map(Pair::getFirst).collect(Collectors.toList()));
/*     */     
/* 245 */     anw1.b("baking");
/* 246 */     this.F.keySet().forEach(☃ -> {
/*     */           elo elo = null;
/*     */           try {
/*     */             elo = a(☃, elp.a);
/* 250 */           } catch (Exception exception) {
/*     */             q.warn("Unable to bake model: '{}': {}", ☃, exception);
/*     */           } 
/*     */           
/*     */           if (elo != null) {
/*     */             this.G.put(☃, elo);
/*     */           }
/*     */         });
/* 258 */     anw1.c();
/* 259 */     return this.z;
/*     */   }
/*     */   
/*     */   private static Predicate<ceh> a(cei<buo, ceh> ☃, String str) {
/* 263 */     Map<cfj<?>, Comparable<?>> map = Maps.newHashMap();
/* 264 */     for (String str1 : t.split(str)) {
/* 265 */       Iterator<String> iterator = u.split(str1).iterator();
/* 266 */       if (iterator.hasNext()) {
/* 267 */         String str2 = iterator.next();
/* 268 */         cfj<?> cfj = ☃.a(str2);
/* 269 */         if (cfj != null && iterator.hasNext()) {
/* 270 */           String str3 = iterator.next();
/* 271 */           Comparable<?> comparable = (Comparable<?>)a(cfj, str3);
/* 272 */           if (comparable != null) {
/* 273 */             map.put(cfj, comparable); continue;
/*     */           } 
/* 275 */           throw new RuntimeException("Unknown value: '" + str3 + "' for blockstate property: '" + str2 + "' " + cfj.a());
/*     */         } 
/* 277 */         if (!str2.isEmpty()) {
/* 278 */           throw new RuntimeException("Unknown blockstate property: '" + str2 + "'");
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 283 */     buo buo = ☃.c();
/*     */     
/* 285 */     return ceh1 -> {
/*     */         if (ceh1 == null || ☃ != ceh1.b()) {
/*     */           return false;
/*     */         }
/*     */         for (Map.Entry<cfj<?>, Comparable<?>> entry : (Iterable<Map.Entry<cfj<?>, Comparable<?>>>)map.entrySet()) {
/*     */           if (!Objects.equals(ceh1.c(entry.getKey()), entry.getValue())) {
/*     */             return false;
/*     */           }
/*     */         } 
/*     */         return true;
/*     */       };
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   static <T extends Comparable<T>> T a(cfj<T> ☃, String str) {
/* 302 */     return (T)☃.b(str).orElse(null);
/*     */   }
/*     */   
/*     */   public ely a(vk ☃) {
/* 306 */     if (this.D.containsKey(☃)) {
/* 307 */       return this.D.get(☃);
/*     */     }
/* 309 */     if (this.B.contains(☃)) {
/* 310 */       throw new IllegalStateException("Circular reference while loading " + ☃);
/*     */     }
/* 312 */     this.B.add(☃);
/*     */     
/* 314 */     ely ely = this.D.get(l);
/* 315 */     while (!this.B.isEmpty()) {
/* 316 */       vk vk1 = this.B.iterator().next();
/*     */       try {
/* 318 */         if (!this.D.containsKey(vk1)) {
/* 319 */           b(vk1);
/*     */         }
/* 321 */       } catch (a a1) {
/* 322 */         q.warn(a1.getMessage());
/* 323 */         this.D.put(vk1, ely);
/* 324 */       } catch (Exception exception) {
/* 325 */         q.warn("Unable to load model: '{}' referenced from: {}: {}", vk1, ☃, exception);
/* 326 */         this.D.put(vk1, ely);
/*     */       } finally {
/* 328 */         this.B.remove(vk1);
/*     */       } 
/*     */     } 
/*     */     
/* 332 */     return this.D.getOrDefault(☃, ely);
/*     */   }
/*     */   
/*     */   private void b(vk ☃) throws Exception {
/* 336 */     if (!(☃ instanceof elu)) {
/* 337 */       a(☃, c(☃));
/*     */       
/*     */       return;
/*     */     } 
/* 341 */     elu elu1 = (elu)☃;
/* 342 */     if (Objects.equals(elu1.d(), "inventory")) {
/* 343 */       vk vk1 = new vk(☃.b(), "item/" + ☃.a());
/* 344 */       ebf ebf1 = c(vk1);
/* 345 */       a(elu1, ebf1);
/* 346 */       this.D.put(vk1, ebf1);
/*     */     } else {
/* 348 */       vk vk1 = new vk(☃.b(), ☃.a());
/*     */       
/* 350 */       cei<buo, ceh> cei1 = Optional.<cei<buo, ceh>>ofNullable(x.get(vk1)).orElseGet(() -> ((buo)gm.Q.a(☃)).m());
/* 351 */       this.C.a(cei1);
/*     */       
/* 353 */       ImmutableList immutableList = ImmutableList.copyOf(this.A.a(cei1.c()));
/*     */       
/* 355 */       ImmutableList<ceh> immutableList1 = cei1.a();
/*     */       
/* 357 */       Map<elu, ceh> map = Maps.newHashMap();
/* 358 */       immutableList1.forEach(ceh1 -> (ceh)☃.put(eaw.a(vk1, ceh1), ceh1));
/*     */       
/* 360 */       Map<ceh, Pair<ely, Supplier<b>>> map1 = Maps.newHashMap();
/*     */       
/* 362 */       vk vk2 = new vk(☃.b(), "blockstates/" + ☃.a() + ".json");
/* 363 */       ely ely = this.D.get(l);
/* 364 */       b b = new b((List<ely>)ImmutableList.of(ely), (List<Object>)ImmutableList.of());
/* 365 */       Pair<ely, Supplier<b>> pair = Pair.of(ely, () -> ☃);
/*     */ 
/*     */ 
/*     */       
/*     */       try {
/*     */         List<Pair<String, ebg>> list;
/*     */ 
/*     */ 
/*     */         
/*     */         Map<b, Set<ceh>> map2;
/*     */ 
/*     */         
/*     */         try {
/* 378 */           list = (List<Pair<String, ebg>>)this.y.c(vk2).stream().map(☃ -> { try (InputStream ☃ = ☃.b()) { return Pair.of(☃.d(), ebg.a(this.C, new InputStreamReader(inputStream, StandardCharsets.UTF_8))); } catch (Exception exception) { throw new a(String.format("Exception loading blockstate definition: '%s' in resourcepack: '%s': %s", new Object[] { ☃.a(), ☃.d(), exception.getMessage() })); }  }).collect(Collectors.toList());
/* 379 */         } catch (IOException iOException) {
/* 380 */           Map<b, Set<ceh>> map3; q.warn("Exception loading blockstate definition: {}: {}", vk2, iOException);
/*     */           
/*     */           return;
/*     */         } 
/* 384 */         for (Pair<String, ebg> pair1 : list) {
/* 385 */           ebs ebs; ebg ebg = (ebg)pair1.getSecond();
/* 386 */           Map<ceh, Pair<ely, Supplier<b>>> map3 = Maps.newIdentityHashMap();
/*     */ 
/*     */           
/* 389 */           if (ebg.c()) {
/* 390 */             ebs = ebg.d();
/* 391 */             immutableList1.forEach(ceh1 -> (Pair)☃.put(ceh1, Pair.of(ebs1, ())));
/*     */           } else {
/* 393 */             ebs = null;
/*     */           } 
/*     */           
/* 396 */           ebg.a().forEach((str, ebn1) -> {
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*     */                 try {
/*     */ 
/*     */                   
/*     */                   ☃.stream().filter(a(cei1, str)).forEach(());
/* 405 */                 } catch (Exception exception) {
/*     */                   q.warn("Exception loading blockstate definition: '{}' in resourcepack: '{}' for variant: '{}': {}", vk1, pair2.getFirst(), str, exception.getMessage());
/*     */                 } 
/*     */               });
/*     */           
/* 410 */           map1.putAll(map3);
/*     */         } 
/* 412 */       } catch (a a1) {
/* 413 */         List<Pair<String, ebg>> list; throw list;
/* 414 */       } catch (Exception exception) {
/* 415 */         throw new a(String.format("Exception loading blockstate definition: '%s': %s", new Object[] { vk2, exception }));
/*     */       } finally {
/* 417 */         Map<b, Set<ceh>> map2 = Maps.newHashMap();
/* 418 */         map.forEach((elu1, ceh1) -> {
/*     */               Pair<ely, Supplier<b>> pair1 = (Pair<ely, Supplier<b>>)☃.get(ceh1);
/*     */               
/*     */               if (pair1 == null) {
/*     */                 q.warn("Exception loading blockstate definition: '{}' missing model for variant: '{}'", vk1, elu1);
/*     */                 pair1 = pair;
/*     */               } 
/*     */               a(elu1, (ely)pair1.getFirst());
/*     */               try {
/*     */                 b b = ((Supplier<b>)pair1.getSecond()).get();
/*     */                 ((Set<ceh>)map.computeIfAbsent(b, ())).add(ceh1);
/* 429 */               } catch (Exception exception) {
/*     */                 q.warn("Exception evaluating model definition: '{}'", elu1, exception);
/*     */               } 
/*     */             });
/*     */         
/* 434 */         map2.forEach((☃, set) -> {
/*     */               Iterator<ceh> iterator = set.iterator();
/*     */               while (iterator.hasNext()) {
/*     */                 ceh ceh = iterator.next();
/*     */                 if (ceh.h() != bzh.c) {
/*     */                   iterator.remove();
/*     */                   this.J.put(ceh, 0);
/*     */                 } 
/*     */               } 
/*     */               if (set.size() > 1) {
/*     */                 a(set);
/*     */               }
/*     */             });
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(vk ☃, ely ely1) {
/* 453 */     this.D.put(☃, ely1);
/* 454 */     this.B.addAll(ely1.f());
/*     */   }
/*     */   
/*     */   private void a(elu ☃) {
/* 458 */     ely ely = a(☃);
/* 459 */     this.D.put(☃, ely);
/* 460 */     this.F.put(☃, ely);
/*     */   }
/*     */   
/*     */   private void a(Iterable<ceh> ☃) {
/* 464 */     int i = this.I++;
/* 465 */     ☃.forEach(ceh1 -> this.J.put(ceh1, ☃));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public elo a(vk ☃, elv elv1) {
/* 470 */     Triple<vk, f, Boolean> triple = Triple.of(☃, elv1.b(), Boolean.valueOf(elv1.c()));
/* 471 */     if (this.E.containsKey(triple)) {
/* 472 */       return this.E.get(triple);
/*     */     }
/*     */     
/* 475 */     if (this.z == null) {
/* 476 */       throw new IllegalStateException("bake called too early");
/*     */     }
/*     */     
/* 479 */     ely ely = a(☃);
/* 480 */     if (ely instanceof ebf) {
/* 481 */       ebf ebf1 = (ebf)ely;
/* 482 */       if (ebf1.g() == n) {
/* 483 */         return w.a(this.z::a, ebf1).a(this, ebf1, this.z::a, elv1, ☃, false);
/*     */       }
/*     */     } 
/* 486 */     elo elo = ely.a(this, this.z::a, elv1, ☃);
/* 487 */     this.E.put(triple, elo);
/* 488 */     return elo;
/*     */   }
/*     */   
/*     */   private ebf c(vk ☃) throws IOException {
/* 492 */     Reader reader = null;
/* 493 */     acg acg = null;
/*     */     
/*     */     try {
/* 496 */       String str = ☃.a();
/*     */       
/* 498 */       if ("builtin/generated".equals(str))
/* 499 */         return n; 
/* 500 */       if ("builtin/entity".equals(str))
/* 501 */         return o; 
/* 502 */       if (str.startsWith("builtin/")) {
/*     */         
/* 504 */         String str1 = str.substring("builtin/".length());
/* 505 */         String str2 = s.get(str1);
/* 506 */         if (str2 == null) {
/* 507 */           throw new FileNotFoundException(☃.toString());
/*     */         }
/*     */         
/* 510 */         reader = new StringReader(str2);
/*     */       } else {
/* 512 */         acg = this.y.a(new vk(☃.b(), "models/" + ☃.a() + ".json"));
/* 513 */         reader = new InputStreamReader(acg.b(), StandardCharsets.UTF_8);
/*     */       } 
/*     */       
/* 516 */       ebf ebf1 = ebf.a(reader);
/* 517 */       ebf1.b = ☃.toString();
/* 518 */       return ebf1;
/*     */     } finally {
/* 520 */       IOUtils.closeQuietly(reader);
/* 521 */       IOUtils.closeQuietly(acg);
/*     */     } 
/*     */   }
/*     */   
/*     */   public Map<vk, elo> a() {
/* 526 */     return this.G;
/*     */   }
/*     */   
/*     */   public Object2IntMap<ceh> b() {
/* 530 */     return this.J;
/*     */   }
/*     */   
/*     */   static class a extends RuntimeException {
/*     */     public a(String ☃) {
/* 535 */       super(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   static class b {
/*     */     private final List<ely> a;
/*     */     private final List<Object> b;
/*     */     
/*     */     public b(List<ely> ☃, List<Object> list) {
/* 544 */       this.a = ☃;
/* 545 */       this.b = list;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object ☃) {
/* 550 */       if (this == ☃) return true; 
/* 551 */       if (☃ instanceof b) {
/* 552 */         b b1 = (b)☃;
/* 553 */         return (Objects.equals(this.a, b1.a) && Objects.equals(this.b, b1.b));
/*     */       } 
/*     */       
/* 556 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 561 */       return 31 * this.a.hashCode() + this.b.hashCode();
/*     */     }
/*     */     
/*     */     public static b a(ceh ☃, ebs ebs1, Collection<cfj<?>> collection) {
/* 565 */       cei<buo, ceh> cei = ☃.b().m();
/*     */ 
/*     */ 
/*     */       
/* 569 */       List<ely> list = (List<ely>)ebs1.a().stream().filter(ebu1 -> ebu1.a(☃).test(ceh1)).map(ebu::a).collect(ImmutableList.toImmutableList());
/* 570 */       List<Object> list1 = a(☃, collection);
/* 571 */       return new b(list, list1);
/*     */     }
/*     */     
/*     */     public static b a(ceh ☃, ely ely1, Collection<cfj<?>> collection) {
/* 575 */       List<Object> list = a(☃, collection);
/* 576 */       return new b((List<ely>)ImmutableList.of(ely1), list);
/*     */     }
/*     */     
/*     */     private static List<Object> a(ceh ☃, Collection<cfj<?>> collection) {
/* 580 */       return (List<Object>)collection.stream().map(☃::c).collect(ImmutableList.toImmutableList());
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\els.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */