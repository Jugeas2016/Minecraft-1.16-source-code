/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ public class aik
/*    */   extends akw
/*    */ {
/*  9 */   public static final Map<String, String> a = (Map<String, String>)ImmutableMap.builder()
/* 10 */     .put("minecraft:commandblock_minecart", "minecraft:command_block_minecart")
/* 11 */     .put("minecraft:ender_crystal", "minecraft:end_crystal")
/* 12 */     .put("minecraft:snowman", "minecraft:snow_golem")
/* 13 */     .put("minecraft:evocation_illager", "minecraft:evoker")
/* 14 */     .put("minecraft:evocation_fangs", "minecraft:evoker_fangs")
/* 15 */     .put("minecraft:illusion_illager", "minecraft:illusioner")
/* 16 */     .put("minecraft:vindication_illager", "minecraft:vindicator")
/* 17 */     .put("minecraft:villager_golem", "minecraft:iron_golem")
/* 18 */     .put("minecraft:xp_orb", "minecraft:experience_orb")
/* 19 */     .put("minecraft:xp_bottle", "minecraft:experience_bottle")
/* 20 */     .put("minecraft:eye_of_ender_signal", "minecraft:eye_of_ender")
/* 21 */     .put("minecraft:fireworks_rocket", "minecraft:firework_rocket")
/* 22 */     .build();
/*    */   
/* 24 */   public static final Map<String, String> b = (Map<String, String>)ImmutableMap.builder()
/* 25 */     .put("minecraft:portal", "minecraft:nether_portal")
/* 26 */     .put("minecraft:oak_bark", "minecraft:oak_wood")
/* 27 */     .put("minecraft:spruce_bark", "minecraft:spruce_wood")
/* 28 */     .put("minecraft:birch_bark", "minecraft:birch_wood")
/* 29 */     .put("minecraft:jungle_bark", "minecraft:jungle_wood")
/* 30 */     .put("minecraft:acacia_bark", "minecraft:acacia_wood")
/* 31 */     .put("minecraft:dark_oak_bark", "minecraft:dark_oak_wood")
/* 32 */     .put("minecraft:stripped_oak_bark", "minecraft:stripped_oak_wood")
/* 33 */     .put("minecraft:stripped_spruce_bark", "minecraft:stripped_spruce_wood")
/* 34 */     .put("minecraft:stripped_birch_bark", "minecraft:stripped_birch_wood")
/* 35 */     .put("minecraft:stripped_jungle_bark", "minecraft:stripped_jungle_wood")
/* 36 */     .put("minecraft:stripped_acacia_bark", "minecraft:stripped_acacia_wood")
/* 37 */     .put("minecraft:stripped_dark_oak_bark", "minecraft:stripped_dark_oak_wood")
/* 38 */     .put("minecraft:mob_spawner", "minecraft:spawner")
/* 39 */     .build();
/*    */   
/* 41 */   public static final Map<String, String> c = (Map<String, String>)ImmutableMap.builder()
/* 42 */     .putAll(b)
/* 43 */     .put("minecraft:clownfish", "minecraft:tropical_fish")
/* 44 */     .put("minecraft:chorus_fruit_popped", "minecraft:popped_chorus_fruit")
/* 45 */     .put("minecraft:evocation_illager_spawn_egg", "minecraft:evoker_spawn_egg")
/* 46 */     .put("minecraft:vindication_illager_spawn_egg", "minecraft:vindicator_spawn_egg")
/* 47 */     .build();
/*    */ 
/*    */ 
/*    */   
/*    */   public aik(Schema ☃, boolean bool) {
/* 52 */     super("EntityTheRenameningBlock", ☃, bool);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected String a(String ☃) {
/* 58 */     if (☃.startsWith("minecraft:bred_")) {
/* 59 */       ☃ = "minecraft:" + ☃.substring("minecraft:bred_".length());
/*    */     }
/* 61 */     return a.getOrDefault(☃, ☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aik.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */