/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ public class agl
/*    */   extends akp
/*    */ {
/*  9 */   public static final Map<String, String> a = (Map<String, String>)ImmutableMap.builder()
/* 10 */     .put("minecraft:extreme_hills", "minecraft:mountains")
/* 11 */     .put("minecraft:swampland", "minecraft:swamp")
/* 12 */     .put("minecraft:hell", "minecraft:nether_wastes")
/* 13 */     .put("minecraft:sky", "minecraft:the_end")
/* 14 */     .put("minecraft:ice_flats", "minecraft:snowy_tundra")
/* 15 */     .put("minecraft:ice_mountains", "minecraft:snowy_mountains")
/* 16 */     .put("minecraft:mushroom_island", "minecraft:mushroom_fields")
/* 17 */     .put("minecraft:mushroom_island_shore", "minecraft:mushroom_field_shore")
/* 18 */     .put("minecraft:beaches", "minecraft:beach")
/* 19 */     .put("minecraft:forest_hills", "minecraft:wooded_hills")
/* 20 */     .put("minecraft:smaller_extreme_hills", "minecraft:mountain_edge")
/* 21 */     .put("minecraft:stone_beach", "minecraft:stone_shore")
/* 22 */     .put("minecraft:cold_beach", "minecraft:snowy_beach")
/* 23 */     .put("minecraft:roofed_forest", "minecraft:dark_forest")
/* 24 */     .put("minecraft:taiga_cold", "minecraft:snowy_taiga")
/* 25 */     .put("minecraft:taiga_cold_hills", "minecraft:snowy_taiga_hills")
/* 26 */     .put("minecraft:redwood_taiga", "minecraft:giant_tree_taiga")
/* 27 */     .put("minecraft:redwood_taiga_hills", "minecraft:giant_tree_taiga_hills")
/* 28 */     .put("minecraft:extreme_hills_with_trees", "minecraft:wooded_mountains")
/* 29 */     .put("minecraft:savanna_rock", "minecraft:savanna_plateau")
/* 30 */     .put("minecraft:mesa", "minecraft:badlands")
/* 31 */     .put("minecraft:mesa_rock", "minecraft:wooded_badlands_plateau")
/* 32 */     .put("minecraft:mesa_clear_rock", "minecraft:badlands_plateau")
/* 33 */     .put("minecraft:sky_island_low", "minecraft:small_end_islands")
/* 34 */     .put("minecraft:sky_island_medium", "minecraft:end_midlands")
/* 35 */     .put("minecraft:sky_island_high", "minecraft:end_highlands")
/* 36 */     .put("minecraft:sky_island_barren", "minecraft:end_barrens")
/* 37 */     .put("minecraft:void", "minecraft:the_void")
/* 38 */     .put("minecraft:mutated_plains", "minecraft:sunflower_plains")
/* 39 */     .put("minecraft:mutated_desert", "minecraft:desert_lakes")
/* 40 */     .put("minecraft:mutated_extreme_hills", "minecraft:gravelly_mountains")
/* 41 */     .put("minecraft:mutated_forest", "minecraft:flower_forest")
/* 42 */     .put("minecraft:mutated_taiga", "minecraft:taiga_mountains")
/* 43 */     .put("minecraft:mutated_swampland", "minecraft:swamp_hills")
/* 44 */     .put("minecraft:mutated_ice_flats", "minecraft:ice_spikes")
/* 45 */     .put("minecraft:mutated_jungle", "minecraft:modified_jungle")
/* 46 */     .put("minecraft:mutated_jungle_edge", "minecraft:modified_jungle_edge")
/* 47 */     .put("minecraft:mutated_birch_forest", "minecraft:tall_birch_forest")
/* 48 */     .put("minecraft:mutated_birch_forest_hills", "minecraft:tall_birch_hills")
/* 49 */     .put("minecraft:mutated_roofed_forest", "minecraft:dark_forest_hills")
/* 50 */     .put("minecraft:mutated_taiga_cold", "minecraft:snowy_taiga_mountains")
/* 51 */     .put("minecraft:mutated_redwood_taiga", "minecraft:giant_spruce_taiga")
/* 52 */     .put("minecraft:mutated_redwood_taiga_hills", "minecraft:giant_spruce_taiga_hills")
/* 53 */     .put("minecraft:mutated_extreme_hills_with_trees", "minecraft:modified_gravelly_mountains")
/* 54 */     .put("minecraft:mutated_savanna", "minecraft:shattered_savanna")
/* 55 */     .put("minecraft:mutated_savanna_rock", "minecraft:shattered_savanna_plateau")
/* 56 */     .put("minecraft:mutated_mesa", "minecraft:eroded_badlands")
/* 57 */     .put("minecraft:mutated_mesa_rock", "minecraft:modified_wooded_badlands_plateau")
/* 58 */     .put("minecraft:mutated_mesa_clear_rock", "minecraft:modified_badlands_plateau")
/*    */     
/* 60 */     .put("minecraft:warm_deep_ocean", "minecraft:deep_warm_ocean")
/* 61 */     .put("minecraft:lukewarm_deep_ocean", "minecraft:deep_lukewarm_ocean")
/* 62 */     .put("minecraft:cold_deep_ocean", "minecraft:deep_cold_ocean")
/* 63 */     .put("minecraft:frozen_deep_ocean", "minecraft:deep_frozen_ocean")
/* 64 */     .build();
/*    */   
/*    */   public agl(Schema ☃, boolean bool) {
/* 67 */     super(☃, bool, "Biomes fix", a);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\agl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */