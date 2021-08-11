/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*    */ import java.util.Map;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class amg
/*    */   extends aln
/*    */ {
/*    */   public amg(int ☃, Schema schema) {
/* 14 */     super(☃, schema);
/*    */   }
/*    */   
/*    */   protected static void a(Schema ☃, Map<String, Supplier<TypeTemplate>> map, String str) {
/* 18 */     ☃.register(map, str, () -> alo.a(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema ☃) {
/* 23 */     Map<String, Supplier<TypeTemplate>> map = super.registerEntities(☃);
/*    */ 
/*    */     
/* 26 */     a(☃, map, "minecraft:turtle");
/* 27 */     a(☃, map, "minecraft:cod_mob");
/* 28 */     a(☃, map, "minecraft:tropical_fish");
/* 29 */     a(☃, map, "minecraft:salmon_mob");
/* 30 */     a(☃, map, "minecraft:puffer_fish");
/* 31 */     a(☃, map, "minecraft:phantom");
/* 32 */     a(☃, map, "minecraft:dolphin");
/* 33 */     a(☃, map, "minecraft:drowned");
/*    */     
/* 35 */     ☃.register(map, "minecraft:trident", str -> DSL.optionalFields("inBlockState", akn.m.in(☃)));
/*    */ 
/*    */ 
/*    */     
/* 39 */     return map;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\amg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */