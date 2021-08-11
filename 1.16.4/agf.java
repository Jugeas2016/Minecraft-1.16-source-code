/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ public class agf
/*    */   extends agg
/*    */ {
/*  9 */   private static final Map<String, String> a = (Map<String, String>)ImmutableMap.builder()
/* 10 */     .put("minecraft:recipes/brewing/speckled_melon", "minecraft:recipes/brewing/glistering_melon_slice")
/* 11 */     .put("minecraft:recipes/building_blocks/black_stained_hardened_clay", "minecraft:recipes/building_blocks/black_terracotta")
/* 12 */     .put("minecraft:recipes/building_blocks/blue_stained_hardened_clay", "minecraft:recipes/building_blocks/blue_terracotta")
/* 13 */     .put("minecraft:recipes/building_blocks/brown_stained_hardened_clay", "minecraft:recipes/building_blocks/brown_terracotta")
/* 14 */     .put("minecraft:recipes/building_blocks/cyan_stained_hardened_clay", "minecraft:recipes/building_blocks/cyan_terracotta")
/* 15 */     .put("minecraft:recipes/building_blocks/gray_stained_hardened_clay", "minecraft:recipes/building_blocks/gray_terracotta")
/* 16 */     .put("minecraft:recipes/building_blocks/green_stained_hardened_clay", "minecraft:recipes/building_blocks/green_terracotta")
/* 17 */     .put("minecraft:recipes/building_blocks/light_blue_stained_hardened_clay", "minecraft:recipes/building_blocks/light_blue_terracotta")
/* 18 */     .put("minecraft:recipes/building_blocks/light_gray_stained_hardened_clay", "minecraft:recipes/building_blocks/light_gray_terracotta")
/* 19 */     .put("minecraft:recipes/building_blocks/lime_stained_hardened_clay", "minecraft:recipes/building_blocks/lime_terracotta")
/* 20 */     .put("minecraft:recipes/building_blocks/magenta_stained_hardened_clay", "minecraft:recipes/building_blocks/magenta_terracotta")
/* 21 */     .put("minecraft:recipes/building_blocks/orange_stained_hardened_clay", "minecraft:recipes/building_blocks/orange_terracotta")
/* 22 */     .put("minecraft:recipes/building_blocks/pink_stained_hardened_clay", "minecraft:recipes/building_blocks/pink_terracotta")
/* 23 */     .put("minecraft:recipes/building_blocks/purple_stained_hardened_clay", "minecraft:recipes/building_blocks/purple_terracotta")
/* 24 */     .put("minecraft:recipes/building_blocks/red_stained_hardened_clay", "minecraft:recipes/building_blocks/red_terracotta")
/* 25 */     .put("minecraft:recipes/building_blocks/white_stained_hardened_clay", "minecraft:recipes/building_blocks/white_terracotta")
/* 26 */     .put("minecraft:recipes/building_blocks/yellow_stained_hardened_clay", "minecraft:recipes/building_blocks/yellow_terracotta")
/* 27 */     .put("minecraft:recipes/building_blocks/acacia_wooden_slab", "minecraft:recipes/building_blocks/acacia_slab")
/* 28 */     .put("minecraft:recipes/building_blocks/birch_wooden_slab", "minecraft:recipes/building_blocks/birch_slab")
/* 29 */     .put("minecraft:recipes/building_blocks/dark_oak_wooden_slab", "minecraft:recipes/building_blocks/dark_oak_slab")
/* 30 */     .put("minecraft:recipes/building_blocks/jungle_wooden_slab", "minecraft:recipes/building_blocks/jungle_slab")
/* 31 */     .put("minecraft:recipes/building_blocks/oak_wooden_slab", "minecraft:recipes/building_blocks/oak_slab")
/* 32 */     .put("minecraft:recipes/building_blocks/spruce_wooden_slab", "minecraft:recipes/building_blocks/spruce_slab")
/* 33 */     .put("minecraft:recipes/building_blocks/brick_block", "minecraft:recipes/building_blocks/bricks")
/* 34 */     .put("minecraft:recipes/building_blocks/chiseled_stonebrick", "minecraft:recipes/building_blocks/chiseled_stone_bricks")
/* 35 */     .put("minecraft:recipes/building_blocks/end_bricks", "minecraft:recipes/building_blocks/end_stone_bricks")
/* 36 */     .put("minecraft:recipes/building_blocks/lit_pumpkin", "minecraft:recipes/building_blocks/jack_o_lantern")
/* 37 */     .put("minecraft:recipes/building_blocks/magma", "minecraft:recipes/building_blocks/magma_block")
/* 38 */     .put("minecraft:recipes/building_blocks/melon_block", "minecraft:recipes/building_blocks/melon")
/* 39 */     .put("minecraft:recipes/building_blocks/mossy_stonebrick", "minecraft:recipes/building_blocks/mossy_stone_bricks")
/* 40 */     .put("minecraft:recipes/building_blocks/nether_brick", "minecraft:recipes/building_blocks/nether_bricks")
/* 41 */     .put("minecraft:recipes/building_blocks/pillar_quartz_block", "minecraft:recipes/building_blocks/quartz_pillar")
/* 42 */     .put("minecraft:recipes/building_blocks/red_nether_brick", "minecraft:recipes/building_blocks/red_nether_bricks")
/* 43 */     .put("minecraft:recipes/building_blocks/snow", "minecraft:recipes/building_blocks/snow_block")
/* 44 */     .put("minecraft:recipes/building_blocks/smooth_red_sandstone", "minecraft:recipes/building_blocks/cut_red_sandstone")
/* 45 */     .put("minecraft:recipes/building_blocks/smooth_sandstone", "minecraft:recipes/building_blocks/cut_sandstone")
/* 46 */     .put("minecraft:recipes/building_blocks/stonebrick", "minecraft:recipes/building_blocks/stone_bricks")
/* 47 */     .put("minecraft:recipes/building_blocks/stone_stairs", "minecraft:recipes/building_blocks/cobblestone_stairs")
/* 48 */     .put("minecraft:recipes/building_blocks/string_to_wool", "minecraft:recipes/building_blocks/white_wool_from_string")
/* 49 */     .put("minecraft:recipes/decorations/fence", "minecraft:recipes/decorations/oak_fence")
/* 50 */     .put("minecraft:recipes/decorations/purple_shulker_box", "minecraft:recipes/decorations/shulker_box")
/* 51 */     .put("minecraft:recipes/decorations/slime", "minecraft:recipes/decorations/slime_block")
/* 52 */     .put("minecraft:recipes/decorations/snow_layer", "minecraft:recipes/decorations/snow")
/* 53 */     .put("minecraft:recipes/misc/bone_meal_from_block", "minecraft:recipes/misc/bone_meal_from_bone_block")
/* 54 */     .put("minecraft:recipes/misc/bone_meal_from_bone", "minecraft:recipes/misc/bone_meal")
/* 55 */     .put("minecraft:recipes/misc/gold_ingot_from_block", "minecraft:recipes/misc/gold_ingot_from_gold_block")
/* 56 */     .put("minecraft:recipes/misc/iron_ingot_from_block", "minecraft:recipes/misc/iron_ingot_from_iron_block")
/* 57 */     .put("minecraft:recipes/redstone/fence_gate", "minecraft:recipes/redstone/oak_fence_gate")
/* 58 */     .put("minecraft:recipes/redstone/noteblock", "minecraft:recipes/redstone/note_block")
/* 59 */     .put("minecraft:recipes/redstone/trapdoor", "minecraft:recipes/redstone/oak_trapdoor")
/* 60 */     .put("minecraft:recipes/redstone/wooden_button", "minecraft:recipes/redstone/oak_button")
/* 61 */     .put("minecraft:recipes/redstone/wooden_door", "minecraft:recipes/redstone/oak_door")
/* 62 */     .put("minecraft:recipes/redstone/wooden_pressure_plate", "minecraft:recipes/redstone/oak_pressure_plate")
/* 63 */     .put("minecraft:recipes/transportation/boat", "minecraft:recipes/transportation/oak_boat")
/* 64 */     .put("minecraft:recipes/transportation/golden_rail", "minecraft:recipes/transportation/powered_rail")
/* 65 */     .build();
/*    */   
/*    */   public agf(Schema ☃, boolean bool) {
/* 68 */     super(☃, bool, "AdvancementsFix", ☃ -> (String)a.getOrDefault(☃, ☃));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\agf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */