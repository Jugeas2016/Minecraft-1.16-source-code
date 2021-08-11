/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*    */ import java.util.Map;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ public class amk
/*    */   extends aln
/*    */ {
/*    */   public amk(int ☃, Schema schema) {
/* 11 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema ☃) {
/* 16 */     Map<String, Supplier<TypeTemplate>> map = super.registerEntities(☃);
/*    */     
/* 18 */     map.put("minecraft:command_block_minecart", map.remove("minecraft:commandblock_minecart"));
/* 19 */     map.put("minecraft:end_crystal", map.remove("minecraft:ender_crystal"));
/* 20 */     map.put("minecraft:snow_golem", map.remove("minecraft:snowman"));
/* 21 */     map.put("minecraft:evoker", map.remove("minecraft:evocation_illager"));
/* 22 */     map.put("minecraft:evoker_fangs", map.remove("minecraft:evocation_fangs"));
/* 23 */     map.put("minecraft:illusioner", map.remove("minecraft:illusion_illager"));
/* 24 */     map.put("minecraft:vindicator", map.remove("minecraft:vindication_illager"));
/* 25 */     map.put("minecraft:iron_golem", map.remove("minecraft:villager_golem"));
/* 26 */     map.put("minecraft:experience_orb", map.remove("minecraft:xp_orb"));
/* 27 */     map.put("minecraft:experience_bottle", map.remove("minecraft:xp_bottle"));
/* 28 */     map.put("minecraft:eye_of_ender", map.remove("minecraft:eye_of_ender_signal"));
/* 29 */     map.put("minecraft:firework_rocket", map.remove("minecraft:fireworks_rocket"));
/*    */     
/* 31 */     return map;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\amk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */