/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*    */ import java.util.Map;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class amu
/*    */   extends aln
/*    */ {
/*    */   public amu(int ☃, Schema schema) {
/* 16 */     super(☃, schema);
/*    */   }
/*    */   
/*    */   protected static void a(Schema ☃, Map<String, Supplier<TypeTemplate>> map, String str) {
/* 20 */     ☃.register(map, str, () -> alo.a(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema ☃) {
/* 25 */     Map<String, Supplier<TypeTemplate>> map = super.registerEntities(☃);
/* 26 */     a(☃, map, "minecraft:bee");
/* 27 */     a(☃, map, "minecraft:bee_stinger");
/* 28 */     return map;
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema ☃) {
/* 33 */     Map<String, Supplier<TypeTemplate>> map = super.registerBlockEntities(☃);
/*    */     
/* 35 */     ☃.register(map, "minecraft:beehive", () -> DSL.optionalFields("Items", DSL.list(akn.l.in(☃)), "Bees", DSL.list(DSL.optionalFields("EntityData", akn.o.in(☃)))));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 43 */     return map;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\amu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */