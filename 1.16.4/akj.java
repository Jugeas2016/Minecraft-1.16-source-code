/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ public class akj
/*    */   extends akk
/*    */ {
/*  9 */   private static final Map<String, String> a = (Map<String, String>)ImmutableMap.builder()
/* 10 */     .put("minecraft:acacia_wooden_slab", "minecraft:acacia_slab")
/* 11 */     .put("minecraft:birch_wooden_slab", "minecraft:birch_slab")
/* 12 */     .put("minecraft:black_stained_hardened_clay", "minecraft:black_terracotta")
/* 13 */     .put("minecraft:blue_stained_hardened_clay", "minecraft:blue_terracotta")
/* 14 */     .put("minecraft:boat", "minecraft:oak_boat")
/* 15 */     .put("minecraft:bone_meal_from_block", "minecraft:bone_meal_from_bone_block")
/* 16 */     .put("minecraft:bone_meal_from_bone", "minecraft:bone_meal")
/* 17 */     .put("minecraft:brick_block", "minecraft:bricks")
/* 18 */     .put("minecraft:brown_stained_hardened_clay", "minecraft:brown_terracotta")
/* 19 */     .put("minecraft:chiseled_stonebrick", "minecraft:chiseled_stone_bricks")
/* 20 */     .put("minecraft:cyan_stained_hardened_clay", "minecraft:cyan_terracotta")
/* 21 */     .put("minecraft:dark_oak_wooden_slab", "minecraft:dark_oak_slab")
/* 22 */     .put("minecraft:end_bricks", "minecraft:end_stone_bricks")
/* 23 */     .put("minecraft:fence_gate", "minecraft:oak_fence_gate")
/* 24 */     .put("minecraft:fence", "minecraft:oak_fence")
/* 25 */     .put("minecraft:golden_rail", "minecraft:powered_rail")
/* 26 */     .put("minecraft:gold_ingot_from_block", "minecraft:gold_ingot_from_gold_block")
/* 27 */     .put("minecraft:gray_stained_hardened_clay", "minecraft:gray_terracotta")
/* 28 */     .put("minecraft:green_stained_hardened_clay", "minecraft:green_terracotta")
/* 29 */     .put("minecraft:iron_ingot_from_block", "minecraft:iron_ingot_from_iron_block")
/* 30 */     .put("minecraft:jungle_wooden_slab", "minecraft:jungle_slab")
/* 31 */     .put("minecraft:light_blue_stained_hardened_clay", "minecraft:light_blue_terracotta")
/* 32 */     .put("minecraft:light_gray_stained_hardened_clay", "minecraft:light_gray_terracotta")
/* 33 */     .put("minecraft:lime_stained_hardened_clay", "minecraft:lime_terracotta")
/* 34 */     .put("minecraft:lit_pumpkin", "minecraft:jack_o_lantern")
/* 35 */     .put("minecraft:magenta_stained_hardened_clay", "minecraft:magenta_terracotta")
/* 36 */     .put("minecraft:magma", "minecraft:magma_block")
/* 37 */     .put("minecraft:melon_block", "minecraft:melon")
/* 38 */     .put("minecraft:mossy_stonebrick", "minecraft:mossy_stone_bricks")
/* 39 */     .put("minecraft:noteblock", "minecraft:note_block")
/* 40 */     .put("minecraft:oak_wooden_slab", "minecraft:oak_slab")
/* 41 */     .put("minecraft:orange_stained_hardened_clay", "minecraft:orange_terracotta")
/* 42 */     .put("minecraft:pillar_quartz_block", "minecraft:quartz_pillar")
/* 43 */     .put("minecraft:pink_stained_hardened_clay", "minecraft:pink_terracotta")
/* 44 */     .put("minecraft:purple_shulker_box", "minecraft:shulker_box")
/* 45 */     .put("minecraft:purple_stained_hardened_clay", "minecraft:purple_terracotta")
/* 46 */     .put("minecraft:red_nether_brick", "minecraft:red_nether_bricks")
/* 47 */     .put("minecraft:red_stained_hardened_clay", "minecraft:red_terracotta")
/* 48 */     .put("minecraft:slime", "minecraft:slime_block")
/* 49 */     .put("minecraft:smooth_red_sandstone", "minecraft:cut_red_sandstone")
/* 50 */     .put("minecraft:smooth_sandstone", "minecraft:cut_sandstone")
/* 51 */     .put("minecraft:snow_layer", "minecraft:snow")
/* 52 */     .put("minecraft:snow", "minecraft:snow_block")
/* 53 */     .put("minecraft:speckled_melon", "minecraft:glistering_melon_slice")
/* 54 */     .put("minecraft:spruce_wooden_slab", "minecraft:spruce_slab")
/* 55 */     .put("minecraft:stonebrick", "minecraft:stone_bricks")
/* 56 */     .put("minecraft:stone_stairs", "minecraft:cobblestone_stairs")
/* 57 */     .put("minecraft:string_to_wool", "minecraft:white_wool_from_string")
/* 58 */     .put("minecraft:trapdoor", "minecraft:oak_trapdoor")
/* 59 */     .put("minecraft:white_stained_hardened_clay", "minecraft:white_terracotta")
/* 60 */     .put("minecraft:wooden_button", "minecraft:oak_button")
/* 61 */     .put("minecraft:wooden_door", "minecraft:oak_door")
/* 62 */     .put("minecraft:wooden_pressure_plate", "minecraft:oak_pressure_plate")
/* 63 */     .put("minecraft:yellow_stained_hardened_clay", "minecraft:yellow_terracotta")
/* 64 */     .build();
/*    */   
/*    */   public akj(Schema ☃, boolean bool) {
/* 67 */     super(☃, bool, "Recipes fix", ☃ -> (String)a.getOrDefault(☃, ☃));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\akj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */