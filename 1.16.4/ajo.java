/*     */ import com.google.common.base.Splitter;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.mojang.datafixers.DataFix;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import com.mojang.serialization.DynamicOps;
/*     */ import com.mojang.serialization.JsonOps;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.stream.Collectors;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ public class ajo
/*     */   extends DataFix {
/*     */   static {
/*  29 */     a = x.<Map<String, String>>a(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put("0", "minecraft:ocean");
/*     */           ☃.put("1", "minecraft:plains");
/*     */           ☃.put("2", "minecraft:desert");
/*     */           ☃.put("3", "minecraft:mountains");
/*     */           ☃.put("4", "minecraft:forest");
/*     */           ☃.put("5", "minecraft:taiga");
/*     */           ☃.put("6", "minecraft:swamp");
/*     */           ☃.put("7", "minecraft:river");
/*     */           ☃.put("8", "minecraft:nether");
/*     */           ☃.put("9", "minecraft:the_end");
/*     */           ☃.put("10", "minecraft:frozen_ocean");
/*     */           ☃.put("11", "minecraft:frozen_river");
/*     */           ☃.put("12", "minecraft:snowy_tundra");
/*     */           ☃.put("13", "minecraft:snowy_mountains");
/*     */           ☃.put("14", "minecraft:mushroom_fields");
/*     */           ☃.put("15", "minecraft:mushroom_field_shore");
/*     */           ☃.put("16", "minecraft:beach");
/*     */           ☃.put("17", "minecraft:desert_hills");
/*     */           ☃.put("18", "minecraft:wooded_hills");
/*     */           ☃.put("19", "minecraft:taiga_hills");
/*     */           ☃.put("20", "minecraft:mountain_edge");
/*     */           ☃.put("21", "minecraft:jungle");
/*     */           ☃.put("22", "minecraft:jungle_hills");
/*     */           ☃.put("23", "minecraft:jungle_edge");
/*     */           ☃.put("24", "minecraft:deep_ocean");
/*     */           ☃.put("25", "minecraft:stone_shore");
/*     */           ☃.put("26", "minecraft:snowy_beach");
/*     */           ☃.put("27", "minecraft:birch_forest");
/*     */           ☃.put("28", "minecraft:birch_forest_hills");
/*     */           ☃.put("29", "minecraft:dark_forest");
/*     */           ☃.put("30", "minecraft:snowy_taiga");
/*     */           ☃.put("31", "minecraft:snowy_taiga_hills");
/*     */           ☃.put("32", "minecraft:giant_tree_taiga");
/*     */           ☃.put("33", "minecraft:giant_tree_taiga_hills");
/*     */           ☃.put("34", "minecraft:wooded_mountains");
/*     */           ☃.put("35", "minecraft:savanna");
/*     */           ☃.put("36", "minecraft:savanna_plateau");
/*     */           ☃.put("37", "minecraft:badlands");
/*     */           ☃.put("38", "minecraft:wooded_badlands_plateau");
/*     */           ☃.put("39", "minecraft:badlands_plateau");
/*     */           ☃.put("40", "minecraft:small_end_islands");
/*     */           ☃.put("41", "minecraft:end_midlands");
/*     */           ☃.put("42", "minecraft:end_highlands");
/*     */           ☃.put("43", "minecraft:end_barrens");
/*     */           ☃.put("44", "minecraft:warm_ocean");
/*     */           ☃.put("45", "minecraft:lukewarm_ocean");
/*     */           ☃.put("46", "minecraft:cold_ocean");
/*     */           ☃.put("47", "minecraft:deep_warm_ocean");
/*     */           ☃.put("48", "minecraft:deep_lukewarm_ocean");
/*     */           ☃.put("49", "minecraft:deep_cold_ocean");
/*     */           ☃.put("50", "minecraft:deep_frozen_ocean");
/*     */           ☃.put("127", "minecraft:the_void");
/*     */           ☃.put("129", "minecraft:sunflower_plains");
/*     */           ☃.put("130", "minecraft:desert_lakes");
/*     */           ☃.put("131", "minecraft:gravelly_mountains");
/*     */           ☃.put("132", "minecraft:flower_forest");
/*     */           ☃.put("133", "minecraft:taiga_mountains");
/*     */           ☃.put("134", "minecraft:swamp_hills");
/*     */           ☃.put("140", "minecraft:ice_spikes");
/*     */           ☃.put("149", "minecraft:modified_jungle");
/*     */           ☃.put("151", "minecraft:modified_jungle_edge");
/*     */           ☃.put("155", "minecraft:tall_birch_forest");
/*     */           ☃.put("156", "minecraft:tall_birch_hills");
/*     */           ☃.put("157", "minecraft:dark_forest_hills");
/*     */           ☃.put("158", "minecraft:snowy_taiga_mountains");
/*     */           ☃.put("160", "minecraft:giant_spruce_taiga");
/*     */           ☃.put("161", "minecraft:giant_spruce_taiga_hills");
/*     */           ☃.put("162", "minecraft:modified_gravelly_mountains");
/*     */           ☃.put("163", "minecraft:shattered_savanna");
/*     */           ☃.put("164", "minecraft:shattered_savanna_plateau");
/*     */           ☃.put("165", "minecraft:eroded_badlands");
/*     */           ☃.put("166", "minecraft:modified_wooded_badlands_plateau");
/*     */           ☃.put("167", "minecraft:modified_badlands_plateau");
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   static final Map<String, String> a;
/*     */   
/*     */   public ajo(Schema ☃, boolean bool) {
/* 110 */     super(☃, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   protected TypeRewriteRule makeRule() {
/* 115 */     Type<?> ☃ = getOutputSchema().getType(akn.a);
/* 116 */     return fixTypeEverywhereTyped("LevelDataGeneratorOptionsFix", getInputSchema().getType(akn.a), ☃, typed -> (Typed)typed.write().flatMap(()).map(Pair::getFirst).result().orElseThrow(()));
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
/*     */   private static <T> Dynamic<T> a(String ☃, DynamicOps<T> dynamicOps) {
/*     */     List<Pair<Integer, String>> list;
/* 135 */     Iterator<String> iterator = Splitter.on(';').split(☃).iterator();
/*     */ 
/*     */     
/* 138 */     String str = "minecraft:plains";
/* 139 */     Map<String, Map<String, String>> map = Maps.newHashMap();
/*     */     
/* 141 */     if (!☃.isEmpty() && iterator.hasNext()) {
/* 142 */       list = b(iterator.next());
/*     */       
/* 144 */       if (!list.isEmpty()) {
/* 145 */         if (iterator.hasNext()) {
/* 146 */           str = a.getOrDefault(iterator.next(), "minecraft:plains");
/*     */         }
/*     */         
/* 149 */         if (iterator.hasNext()) {
/* 150 */           String[] arrayOfString = ((String)iterator.next()).toLowerCase(Locale.ROOT).split(",");
/*     */           
/* 152 */           for (String str1 : arrayOfString) {
/* 153 */             String[] arrayOfString1 = str1.split("\\(", 2);
/*     */             
/* 155 */             if (!arrayOfString1[0].isEmpty()) {
/* 156 */               map.put(arrayOfString1[0], Maps.newHashMap());
/*     */               
/* 158 */               if (arrayOfString1.length > 1 && arrayOfString1[1].endsWith(")") && arrayOfString1[1].length() > 1) {
/* 159 */                 String[] arrayOfString2 = arrayOfString1[1].substring(0, arrayOfString1[1].length() - 1).split(" ");
/*     */                 
/* 161 */                 for (String str2 : arrayOfString2) {
/* 162 */                   String[] arrayOfString3 = str2.split("=", 2);
/* 163 */                   if (arrayOfString3.length == 2) {
/* 164 */                     ((Map<String, String>)map.get(arrayOfString1[0])).put(arrayOfString3[0], arrayOfString3[1]);
/*     */                   }
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } else {
/* 171 */           map.put("village", Maps.newHashMap());
/*     */         } 
/*     */       } 
/*     */     } else {
/* 175 */       list = Lists.newArrayList();
/* 176 */       list.add(Pair.of(Integer.valueOf(1), "minecraft:bedrock"));
/* 177 */       list.add(Pair.of(Integer.valueOf(2), "minecraft:dirt"));
/* 178 */       list.add(Pair.of(Integer.valueOf(1), "minecraft:grass_block"));
/* 179 */       map.put("village", Maps.newHashMap());
/*     */     } 
/*     */     
/* 182 */     T t1 = (T)dynamicOps.createList(list.stream().map(pair -> ☃.createMap((Map)ImmutableMap.of(☃.createString("height"), ☃.createInt(((Integer)pair.getFirst()).intValue()), ☃.createString("block"), ☃.createString((String)pair.getSecond())))));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 187 */     T t2 = (T)dynamicOps.createMap((Map)map.entrySet().stream().map(entry -> Pair.of(☃.createString(((String)entry.getKey()).toLowerCase(Locale.ROOT)), ☃.createMap((Map)((Map)entry.getValue()).entrySet().stream().map(()).collect(Collectors.toMap(Pair::getFirst, Pair::getSecond)))))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 194 */         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond)));
/*     */     
/* 196 */     return new Dynamic(dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps
/* 197 */             .createString("layers"), t1, dynamicOps
/* 198 */             .createString("biome"), dynamicOps.createString(str), dynamicOps
/* 199 */             .createString("structures"), t2)));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static Pair<Integer, String> a(String ☃) {
/*     */     int i;
/* 205 */     String[] arrayOfString = ☃.split("\\*", 2);
/*     */ 
/*     */     
/* 208 */     if (arrayOfString.length == 2) {
/*     */       try {
/* 210 */         i = Integer.parseInt(arrayOfString[0]);
/* 211 */       } catch (NumberFormatException numberFormatException) {
/* 212 */         return null;
/*     */       } 
/*     */     } else {
/* 215 */       i = 1;
/*     */     } 
/*     */     
/* 218 */     String str = arrayOfString[arrayOfString.length - 1];
/* 219 */     return Pair.of(Integer.valueOf(i), str);
/*     */   }
/*     */   
/*     */   private static List<Pair<Integer, String>> b(String ☃) {
/* 223 */     List<Pair<Integer, String>> list = Lists.newArrayList();
/* 224 */     String[] arrayOfString = ☃.split(",");
/*     */     
/* 226 */     for (String str : arrayOfString) {
/* 227 */       Pair<Integer, String> pair = a(str);
/* 228 */       if (pair == null) {
/* 229 */         return Collections.emptyList();
/*     */       }
/* 231 */       list.add(pair);
/*     */     } 
/*     */     
/* 234 */     return list;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ajo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */