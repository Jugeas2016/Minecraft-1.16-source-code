/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.util.Function3;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import com.mojang.serialization.DynamicLike;
/*     */ import com.mojang.serialization.DynamicOps;
/*     */ import com.mojang.serialization.OptionalDynamic;
/*     */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
/*     */ import org.apache.commons.lang3.math.NumberUtils;
/*     */ import org.apache.commons.lang3.mutable.MutableBoolean;
/*     */ import org.apache.commons.lang3.mutable.MutableInt;
/*     */ 
/*     */ public class ali extends DataFix {
/*     */   public ali(Schema ☃) {
/*  28 */     super(☃, true);
/*     */   }
/*     */ 
/*     */   
/*     */   protected TypeRewriteRule makeRule() {
/*  33 */     return fixTypeEverywhereTyped("WorldGenSettings building", getInputSchema().getType(akn.y), ☃ -> ☃.update(DSL.remainderFinder(), ali::a));
/*     */   }
/*     */   
/*     */   private static <T> Dynamic<T> a(long ☃, DynamicLike<T> dynamicLike, Dynamic<T> dynamic1, Dynamic<T> dynamic2) {
/*  37 */     return dynamicLike.createMap((Map)ImmutableMap.of(dynamicLike
/*  38 */           .createString("type"), dynamicLike.createString("minecraft:noise"), dynamicLike
/*  39 */           .createString("biome_source"), dynamic2, dynamicLike
/*  40 */           .createString("seed"), dynamicLike.createLong(☃), dynamicLike
/*  41 */           .createString("settings"), dynamic1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static <T> Dynamic<T> a(Dynamic<T> ☃, long l, boolean bool1, boolean bool2) {
/*  49 */     ImmutableMap.Builder<Dynamic<T>, Dynamic<T>> builder = ImmutableMap.builder().put(☃.createString("type"), ☃.createString("minecraft:vanilla_layered")).put(☃.createString("seed"), ☃.createLong(l)).put(☃.createString("large_biomes"), ☃.createBoolean(bool2));
/*     */     
/*  51 */     if (bool1) {
/*  52 */       builder.put(☃.createString("legacy_biome_init_layer"), ☃.createBoolean(bool1));
/*     */     }
/*     */     
/*  55 */     return ☃.createMap((Map)builder.build());
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
/*  68 */   private static final ImmutableMap<String, a> a = ImmutableMap.builder()
/*  69 */     .put("minecraft:village", new a(32, 8, 10387312))
/*  70 */     .put("minecraft:desert_pyramid", new a(32, 8, 14357617))
/*  71 */     .put("minecraft:igloo", new a(32, 8, 14357618))
/*  72 */     .put("minecraft:jungle_pyramid", new a(32, 8, 14357619))
/*  73 */     .put("minecraft:swamp_hut", new a(32, 8, 14357620))
/*  74 */     .put("minecraft:pillager_outpost", new a(32, 8, 165745296))
/*  75 */     .put("minecraft:monument", new a(32, 5, 10387313))
/*  76 */     .put("minecraft:endcity", new a(20, 11, 10387313))
/*  77 */     .put("minecraft:mansion", new a(80, 20, 10387319))
/*  78 */     .build();
/*     */   static final class a { public static final Codec<a> a; private final int b; private final int c; private final int d;
/*     */     static {
/*  81 */       a = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.INT.fieldOf("spacing").forGetter(()), (App)Codec.INT.fieldOf("separation").forGetter(()), (App)Codec.INT.fieldOf("salt").forGetter(())).apply((Applicative)☃, a::new));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public a(int ☃, int i, int j) {
/*  92 */       this.b = ☃;
/*  93 */       this.c = i;
/*  94 */       this.d = j;
/*     */     }
/*     */     
/*     */     public <T> Dynamic<T> a(DynamicOps<T> ☃) {
/*  98 */       return new Dynamic(☃, a.encodeStart(☃, this).result().orElse(☃.emptyMap()));
/*     */     } }
/*     */   
/*     */   private static <T> Dynamic<T> a(Dynamic<T> ☃) {
/*     */     Dynamic<T> dynamic;
/* 103 */     DynamicOps<T> dynamicOps = ☃.getOps();
/*     */     
/* 105 */     long l = ☃.get("RandomSeed").asLong(0L);
/*     */     
/* 107 */     Optional<String> optional1 = ☃.get("generatorName").asString().map(☃ -> ☃.toLowerCase(Locale.ROOT)).result();
/*     */     
/* 109 */     Optional<String> optional2 = ☃.get("legacy_custom_options").asString().result().map(Optional::of).orElseGet(() -> ☃.equals(Optional.of("customized")) ? dynamic.get("generatorOptions").asString().result() : Optional.empty());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 116 */     boolean bool1 = false;
/* 117 */     if (optional1.equals(Optional.of("customized")))
/* 118 */     { dynamic = a(☃, l); }
/* 119 */     else if (!optional1.isPresent())
/* 120 */     { dynamic = a(☃, l); }
/*     */     else
/* 122 */     { String str; boolean bool4; byte b; boolean bool5; OptionalDynamic<T> optionalDynamic1; ImmutableMap.Builder<T, T> builder1; Map<Dynamic<T>, Dynamic<T>> map; OptionalDynamic<T> optionalDynamic2; OptionalDynamic<?> optionalDynamic; Optional<String> optional; Dynamic<T> dynamic1, dynamic2, dynamic3; switch ((String)optional1.get())
/*     */       { case "flat":
/* 124 */           optionalDynamic1 = ☃.get("generatorOptions");
/* 125 */           map = a(dynamicOps, optionalDynamic1);
/*     */           
/* 127 */           dynamic = ☃.createMap((Map)ImmutableMap.of(☃
/* 128 */                 .createString("type"), ☃.createString("minecraft:flat"), ☃
/* 129 */                 .createString("settings"), ☃.createMap((Map)ImmutableMap.of(☃
/* 130 */                     .createString("structures"), ☃.createMap(map), ☃
/* 131 */                     .createString("layers"), optionalDynamic1.get("layers").result().orElseGet(() -> ☃.createList(Stream.of(new Dynamic[] { ☃.createMap((Map)ImmutableMap.of(☃.createString("height"), ☃.createInt(1), ☃.createString("block"), ☃.createString("minecraft:bedrock"))), ☃.createMap((Map)ImmutableMap.of(☃.createString("height"), ☃.createInt(2), ☃.createString("block"), ☃.createString("minecraft:dirt"))), ☃.createMap((Map)ImmutableMap.of(☃.createString("height"), ☃.createInt(1), ☃.createString("block"), ☃.createString("minecraft:grass_block"))) }))), ☃
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
/* 145 */                     .createString("biome"), ☃.createString(optionalDynamic1.get("biome").asString("minecraft:plains"))))));
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
/* 201 */           bool4 = ☃.get("MapFeatures").asBoolean(true);
/* 202 */           bool5 = ☃.get("BonusChest").asBoolean(false);
/*     */           
/* 204 */           builder1 = ImmutableMap.builder();
/* 205 */           builder1.put(dynamicOps.createString("seed"), dynamicOps.createLong(l));
/* 206 */           builder1.put(dynamicOps.createString("generate_features"), dynamicOps.createBoolean(bool4));
/* 207 */           builder1.put(dynamicOps.createString("bonus_chest"), dynamicOps.createBoolean(bool5));
/* 208 */           builder1.put(dynamicOps.createString("dimensions"), a(☃, l, dynamic, bool1));
/* 209 */           optional2.ifPresent(str -> ☃.put(dynamicOps.createString("legacy_custom_options"), dynamicOps.createString(str)));
/*     */           
/* 211 */           return new Dynamic(dynamicOps, dynamicOps.createMap((Map)builder1.build()));case "debug_all_block_states": dynamic = ☃.createMap((Map)ImmutableMap.of(☃.createString("type"), ☃.createString("minecraft:debug"))); bool4 = ☃.get("MapFeatures").asBoolean(true); bool5 = ☃.get("BonusChest").asBoolean(false); builder1 = ImmutableMap.builder(); builder1.put(dynamicOps.createString("seed"), dynamicOps.createLong(l)); builder1.put(dynamicOps.createString("generate_features"), dynamicOps.createBoolean(bool4)); builder1.put(dynamicOps.createString("bonus_chest"), dynamicOps.createBoolean(bool5)); builder1.put(dynamicOps.createString("dimensions"), a(☃, l, dynamic, bool1)); optional2.ifPresent(str -> ☃.put(dynamicOps.createString("legacy_custom_options"), dynamicOps.createString(str))); return new Dynamic(dynamicOps, dynamicOps.createMap((Map)builder1.build()));case "buffet": optionalDynamic2 = ☃.get("generatorOptions"); optionalDynamic = optionalDynamic2.get("chunk_generator"); optional = optionalDynamic.get("type").asString().result(); if (Objects.equals(optional, Optional.of("minecraft:caves"))) { dynamic1 = ☃.createString("minecraft:caves"); bool1 = true; } else if (Objects.equals(optional, Optional.of("minecraft:floating_islands"))) { dynamic1 = ☃.createString("minecraft:floating_islands"); } else { dynamic1 = ☃.createString("minecraft:overworld"); }  dynamic2 = optionalDynamic2.get("biome_source").result().orElseGet(() -> ☃.createMap((Map)ImmutableMap.of(☃.createString("type"), ☃.createString("minecraft:fixed")))); if (dynamic2.get("type").asString().result().equals(Optional.of("minecraft:fixed"))) { String str1 = dynamic2.get("options").get("biomes").asStream().findFirst().flatMap(☃ -> ☃.asString().result()).orElse("minecraft:ocean"); dynamic3 = dynamic2.remove("options").set("biome", ☃.createString(str1)); } else { dynamic3 = dynamic2; }  dynamic = a(l, (DynamicLike<T>)☃, dynamic1, dynamic3); bool4 = ☃.get("MapFeatures").asBoolean(true); bool5 = ☃.get("BonusChest").asBoolean(false); builder1 = ImmutableMap.builder(); builder1.put(dynamicOps.createString("seed"), dynamicOps.createLong(l)); builder1.put(dynamicOps.createString("generate_features"), dynamicOps.createBoolean(bool4)); builder1.put(dynamicOps.createString("bonus_chest"), dynamicOps.createBoolean(bool5)); builder1.put(dynamicOps.createString("dimensions"), a(☃, l, dynamic, bool1)); optional2.ifPresent(str -> ☃.put(dynamicOps.createString("legacy_custom_options"), dynamicOps.createString(str))); return new Dynamic(dynamicOps, dynamicOps.createMap((Map)builder1.build())); }  boolean bool6 = ((String)optional1.get()).equals("default"); boolean bool7 = (((String)optional1.get()).equals("default_1_1") || (bool6 && ☃.get("generatorVersion").asInt(0) == 0)); boolean bool8 = ((String)optional1.get()).equals("amplified"); boolean bool9 = ((String)optional1.get()).equals("largebiomes"); dynamic = a(l, (DynamicLike<T>)☃, ☃.createString(bool8 ? "minecraft:amplified" : "minecraft:overworld"), a(☃, l, bool7, bool9)); }  boolean bool2 = ☃.get("MapFeatures").asBoolean(true); boolean bool3 = ☃.get("BonusChest").asBoolean(false); ImmutableMap.Builder builder = ImmutableMap.builder(); builder.put(dynamicOps.createString("seed"), dynamicOps.createLong(l)); builder.put(dynamicOps.createString("generate_features"), dynamicOps.createBoolean(bool2)); builder.put(dynamicOps.createString("bonus_chest"), dynamicOps.createBoolean(bool3)); builder.put(dynamicOps.createString("dimensions"), a(☃, l, dynamic, bool1)); optional2.ifPresent(str -> ☃.put(dynamicOps.createString("legacy_custom_options"), dynamicOps.createString(str))); return new Dynamic(dynamicOps, dynamicOps.createMap((Map)builder.build()));
/*     */   }
/*     */   
/*     */   protected static <T> Dynamic<T> a(Dynamic<T> ☃, long l) {
/* 215 */     return a(l, (DynamicLike<T>)☃, ☃.createString("minecraft:overworld"), a(☃, l, false, false));
/*     */   }
/*     */   
/*     */   protected static <T> T a(Dynamic<T> ☃, long l, Dynamic<T> dynamic1, boolean bool) {
/* 219 */     DynamicOps<T> dynamicOps = ☃.getOps();
/* 220 */     return (T)dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps
/* 221 */           .createString("minecraft:overworld"), dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps
/* 222 */               .createString("type"), dynamicOps.createString("minecraft:overworld" + (bool ? "_caves" : "")), dynamicOps
/* 223 */               .createString("generator"), dynamic1.getValue())), dynamicOps
/*     */           
/* 225 */           .createString("minecraft:the_nether"), dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps
/* 226 */               .createString("type"), dynamicOps.createString("minecraft:the_nether"), dynamicOps
/* 227 */               .createString("generator"), a(l, (DynamicLike<T>)☃, ☃.createString("minecraft:nether"), ☃.createMap((Map)ImmutableMap.of(☃
/* 228 */                     .createString("type"), ☃.createString("minecraft:multi_noise"), ☃
/* 229 */                     .createString("seed"), ☃.createLong(l), ☃
/* 230 */                     .createString("preset"), ☃.createString("minecraft:nether"))))
/* 231 */               .getValue())), dynamicOps
/*     */           
/* 233 */           .createString("minecraft:the_end"), dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps
/* 234 */               .createString("type"), dynamicOps.createString("minecraft:the_end"), dynamicOps
/* 235 */               .createString("generator"), a(l, (DynamicLike<T>)☃, ☃.createString("minecraft:end"), ☃.createMap((Map)ImmutableMap.of(☃
/* 236 */                     .createString("type"), ☃.createString("minecraft:the_end"), ☃
/* 237 */                     .createString("seed"), ☃.createLong(l))))
/* 238 */               .getValue()))));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static <T> Map<Dynamic<T>, Dynamic<T>> a(DynamicOps<T> ☃, OptionalDynamic<T> optionalDynamic) {
/* 244 */     MutableInt mutableInt1 = new MutableInt(32);
/* 245 */     MutableInt mutableInt2 = new MutableInt(3);
/* 246 */     MutableInt mutableInt3 = new MutableInt(128);
/* 247 */     MutableBoolean mutableBoolean = new MutableBoolean(false);
/* 248 */     Map<String, a> map = Maps.newHashMap();
/*     */     
/* 250 */     if (!optionalDynamic.result().isPresent()) {
/* 251 */       mutableBoolean.setTrue();
/* 252 */       map.put("minecraft:village", a.get("minecraft:village"));
/*     */     } 
/*     */     
/* 255 */     optionalDynamic.get("structures").flatMap(Dynamic::getMapValues).result().ifPresent(map2 -> map2.forEach(()));
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
/* 318 */     ImmutableMap.Builder<Dynamic<T>, Dynamic<T>> builder = ImmutableMap.builder();
/* 319 */     builder.put(optionalDynamic.createString("structures"), optionalDynamic.createMap((Map)map.entrySet().stream().collect(Collectors.toMap(entry -> ☃.createString((String)entry.getKey()), entry -> ((a)entry.getValue()).a(☃)))));
/*     */ 
/*     */ 
/*     */     
/* 323 */     if (mutableBoolean.isTrue()) {
/* 324 */       builder.put(optionalDynamic.createString("stronghold"), optionalDynamic.createMap((Map)ImmutableMap.of(optionalDynamic
/* 325 */               .createString("distance"), optionalDynamic.createInt(mutableInt1.getValue().intValue()), optionalDynamic
/* 326 */               .createString("spread"), optionalDynamic.createInt(mutableInt2.getValue().intValue()), optionalDynamic
/* 327 */               .createString("count"), optionalDynamic.createInt(mutableInt3.getValue().intValue()))));
/*     */     }
/*     */     
/* 330 */     return (Map<Dynamic<T>, Dynamic<T>>)builder.build();
/*     */   }
/*     */   
/*     */   private static int a(String ☃, int i) {
/* 334 */     return NumberUtils.toInt(☃, i);
/*     */   }
/*     */   
/*     */   private static int a(String ☃, int i, int j) {
/* 338 */     return Math.max(j, a(☃, i));
/*     */   }
/*     */   
/*     */   private static void a(Map<String, a> ☃, String str1, String str2, int i) {
/* 342 */     a a = (a)☃.getOrDefault(str1, a.get(str1));
/* 343 */     int j = a(str2, a.a(a), i);
/* 344 */     ☃.put(str1, new a(j, a.b(a), a.c(a)));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ali.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */