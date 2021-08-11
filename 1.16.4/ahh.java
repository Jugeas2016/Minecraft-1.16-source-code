/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFix;
/*     */ import com.mojang.datafixers.OpticFinder;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ 
/*     */ public class ahh
/*     */   extends DataFix {
/*  14 */   private static final ImmutableMap<String, Pair<String, ImmutableMap<String, String>>> a = ImmutableMap.builder()
/*  15 */     .put("EndCity", Pair.of("ECP", ImmutableMap.builder()
/*  16 */         .put("second_floor", "second_floor_1")
/*  17 */         .put("third_floor", "third_floor_1")
/*  18 */         .put("third_floor_c", "third_floor_2")
/*  19 */         .build()))
/*     */     
/*  21 */     .put("Mansion", Pair.of("WMP", ImmutableMap.builder()
/*  22 */         .put("carpet_south", "carpet_south_1")
/*  23 */         .put("carpet_west", "carpet_west_1")
/*  24 */         .put("indoors_door", "indoors_door_1")
/*  25 */         .put("indoors_wall", "indoors_wall_1")
/*  26 */         .build()))
/*     */     
/*  28 */     .put("Igloo", Pair.of("Iglu", ImmutableMap.builder()
/*  29 */         .put("minecraft:igloo/igloo_bottom", "minecraft:igloo/bottom")
/*  30 */         .put("minecraft:igloo/igloo_middle", "minecraft:igloo/middle")
/*  31 */         .put("minecraft:igloo/igloo_top", "minecraft:igloo/top")
/*  32 */         .build()))
/*     */     
/*  34 */     .put("Ocean_Ruin", Pair.of("ORP", ImmutableMap.builder()
/*  35 */         .put("minecraft:ruin/big_ruin1_brick", "minecraft:underwater_ruin/big_brick_1")
/*  36 */         .put("minecraft:ruin/big_ruin2_brick", "minecraft:underwater_ruin/big_brick_2")
/*  37 */         .put("minecraft:ruin/big_ruin3_brick", "minecraft:underwater_ruin/big_brick_3")
/*  38 */         .put("minecraft:ruin/big_ruin8_brick", "minecraft:underwater_ruin/big_brick_8")
/*  39 */         .put("minecraft:ruin/big_ruin1_cracked", "minecraft:underwater_ruin/big_cracked_1")
/*  40 */         .put("minecraft:ruin/big_ruin2_cracked", "minecraft:underwater_ruin/big_cracked_2")
/*  41 */         .put("minecraft:ruin/big_ruin3_cracked", "minecraft:underwater_ruin/big_cracked_3")
/*  42 */         .put("minecraft:ruin/big_ruin8_cracked", "minecraft:underwater_ruin/big_cracked_8")
/*  43 */         .put("minecraft:ruin/big_ruin1_mossy", "minecraft:underwater_ruin/big_mossy_1")
/*  44 */         .put("minecraft:ruin/big_ruin2_mossy", "minecraft:underwater_ruin/big_mossy_2")
/*  45 */         .put("minecraft:ruin/big_ruin3_mossy", "minecraft:underwater_ruin/big_mossy_3")
/*  46 */         .put("minecraft:ruin/big_ruin8_mossy", "minecraft:underwater_ruin/big_mossy_8")
/*  47 */         .put("minecraft:ruin/big_ruin_warm4", "minecraft:underwater_ruin/big_warm_4")
/*  48 */         .put("minecraft:ruin/big_ruin_warm5", "minecraft:underwater_ruin/big_warm_5")
/*  49 */         .put("minecraft:ruin/big_ruin_warm6", "minecraft:underwater_ruin/big_warm_6")
/*  50 */         .put("minecraft:ruin/big_ruin_warm7", "minecraft:underwater_ruin/big_warm_7")
/*  51 */         .put("minecraft:ruin/ruin1_brick", "minecraft:underwater_ruin/brick_1")
/*  52 */         .put("minecraft:ruin/ruin2_brick", "minecraft:underwater_ruin/brick_2")
/*  53 */         .put("minecraft:ruin/ruin3_brick", "minecraft:underwater_ruin/brick_3")
/*  54 */         .put("minecraft:ruin/ruin4_brick", "minecraft:underwater_ruin/brick_4")
/*  55 */         .put("minecraft:ruin/ruin5_brick", "minecraft:underwater_ruin/brick_5")
/*  56 */         .put("minecraft:ruin/ruin6_brick", "minecraft:underwater_ruin/brick_6")
/*  57 */         .put("minecraft:ruin/ruin7_brick", "minecraft:underwater_ruin/brick_7")
/*  58 */         .put("minecraft:ruin/ruin8_brick", "minecraft:underwater_ruin/brick_8")
/*  59 */         .put("minecraft:ruin/ruin1_cracked", "minecraft:underwater_ruin/cracked_1")
/*  60 */         .put("minecraft:ruin/ruin2_cracked", "minecraft:underwater_ruin/cracked_2")
/*  61 */         .put("minecraft:ruin/ruin3_cracked", "minecraft:underwater_ruin/cracked_3")
/*  62 */         .put("minecraft:ruin/ruin4_cracked", "minecraft:underwater_ruin/cracked_4")
/*  63 */         .put("minecraft:ruin/ruin5_cracked", "minecraft:underwater_ruin/cracked_5")
/*  64 */         .put("minecraft:ruin/ruin6_cracked", "minecraft:underwater_ruin/cracked_6")
/*  65 */         .put("minecraft:ruin/ruin7_cracked", "minecraft:underwater_ruin/cracked_7")
/*  66 */         .put("minecraft:ruin/ruin8_cracked", "minecraft:underwater_ruin/cracked_8")
/*  67 */         .put("minecraft:ruin/ruin1_mossy", "minecraft:underwater_ruin/mossy_1")
/*  68 */         .put("minecraft:ruin/ruin2_mossy", "minecraft:underwater_ruin/mossy_2")
/*  69 */         .put("minecraft:ruin/ruin3_mossy", "minecraft:underwater_ruin/mossy_3")
/*  70 */         .put("minecraft:ruin/ruin4_mossy", "minecraft:underwater_ruin/mossy_4")
/*  71 */         .put("minecraft:ruin/ruin5_mossy", "minecraft:underwater_ruin/mossy_5")
/*  72 */         .put("minecraft:ruin/ruin6_mossy", "minecraft:underwater_ruin/mossy_6")
/*  73 */         .put("minecraft:ruin/ruin7_mossy", "minecraft:underwater_ruin/mossy_7")
/*  74 */         .put("minecraft:ruin/ruin8_mossy", "minecraft:underwater_ruin/mossy_8")
/*  75 */         .put("minecraft:ruin/ruin_warm1", "minecraft:underwater_ruin/warm_1")
/*  76 */         .put("minecraft:ruin/ruin_warm2", "minecraft:underwater_ruin/warm_2")
/*  77 */         .put("minecraft:ruin/ruin_warm3", "minecraft:underwater_ruin/warm_3")
/*  78 */         .put("minecraft:ruin/ruin_warm4", "minecraft:underwater_ruin/warm_4")
/*  79 */         .put("minecraft:ruin/ruin_warm5", "minecraft:underwater_ruin/warm_5")
/*  80 */         .put("minecraft:ruin/ruin_warm6", "minecraft:underwater_ruin/warm_6")
/*  81 */         .put("minecraft:ruin/ruin_warm7", "minecraft:underwater_ruin/warm_7")
/*  82 */         .put("minecraft:ruin/ruin_warm8", "minecraft:underwater_ruin/warm_8")
/*     */         
/*  84 */         .put("minecraft:ruin/big_brick_1", "minecraft:underwater_ruin/big_brick_1")
/*  85 */         .put("minecraft:ruin/big_brick_2", "minecraft:underwater_ruin/big_brick_2")
/*  86 */         .put("minecraft:ruin/big_brick_3", "minecraft:underwater_ruin/big_brick_3")
/*  87 */         .put("minecraft:ruin/big_brick_8", "minecraft:underwater_ruin/big_brick_8")
/*  88 */         .put("minecraft:ruin/big_mossy_1", "minecraft:underwater_ruin/big_mossy_1")
/*  89 */         .put("minecraft:ruin/big_mossy_2", "minecraft:underwater_ruin/big_mossy_2")
/*  90 */         .put("minecraft:ruin/big_mossy_3", "minecraft:underwater_ruin/big_mossy_3")
/*  91 */         .put("minecraft:ruin/big_mossy_8", "minecraft:underwater_ruin/big_mossy_8")
/*  92 */         .put("minecraft:ruin/big_cracked_1", "minecraft:underwater_ruin/big_cracked_1")
/*  93 */         .put("minecraft:ruin/big_cracked_2", "minecraft:underwater_ruin/big_cracked_2")
/*  94 */         .put("minecraft:ruin/big_cracked_3", "minecraft:underwater_ruin/big_cracked_3")
/*  95 */         .put("minecraft:ruin/big_cracked_8", "minecraft:underwater_ruin/big_cracked_8")
/*  96 */         .put("minecraft:ruin/big_warm_4", "minecraft:underwater_ruin/big_warm_4")
/*  97 */         .put("minecraft:ruin/big_warm_5", "minecraft:underwater_ruin/big_warm_5")
/*  98 */         .put("minecraft:ruin/big_warm_6", "minecraft:underwater_ruin/big_warm_6")
/*  99 */         .put("minecraft:ruin/big_warm_7", "minecraft:underwater_ruin/big_warm_7")
/* 100 */         .build()))
/*     */     
/* 102 */     .build();
/*     */   
/*     */   public ahh(Schema ☃, boolean bool) {
/* 105 */     super(☃, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public TypeRewriteRule makeRule() {
/* 110 */     Type<?> ☃ = getInputSchema().getType(akn.t);
/* 111 */     OpticFinder<?> opticFinder = ☃.findField("Children");
/* 112 */     return fixTypeEverywhereTyped("ChunkStructuresTemplateRenameFix", ☃, typed -> typed.updateTyped(☃, ()));
/*     */   }
/*     */   
/*     */   private Dynamic<?> a(Dynamic<?> ☃, Dynamic<?> dynamic1) {
/* 116 */     String str = ☃.get("id").asString("");
/* 117 */     if (a.containsKey(str)) {
/* 118 */       Pair<String, ImmutableMap<String, String>> pair = (Pair<String, ImmutableMap<String, String>>)a.get(str);
/* 119 */       if (((String)pair.getFirst()).equals(dynamic1.get("id").asString(""))) {
/* 120 */         String str1 = dynamic1.get("Template").asString("");
/* 121 */         dynamic1 = dynamic1.set("Template", dynamic1.createString((String)((ImmutableMap)pair.getSecond()).getOrDefault(str1, str1)));
/*     */       } 
/*     */     } 
/* 124 */     return dynamic1;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ahh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */