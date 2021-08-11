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
/*    */ public class amo
/*    */   extends aln
/*    */ {
/*    */   public amo(int ☃, Schema schema) {
/* 15 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema ☃) {
/* 20 */     Map<String, Supplier<TypeTemplate>> map = super.registerBlockEntities(☃);
/*    */     
/* 22 */     a(☃, map, "minecraft:barrel");
/* 23 */     a(☃, map, "minecraft:smoker");
/* 24 */     a(☃, map, "minecraft:blast_furnace");
/*    */     
/* 26 */     ☃.register(map, "minecraft:lectern", str -> DSL.optionalFields("Book", akn.l.in(☃)));
/*    */ 
/*    */ 
/*    */     
/* 30 */     ☃.registerSimple(map, "minecraft:bell");
/*    */     
/* 32 */     return map;
/*    */   }
/*    */   
/*    */   protected static void a(Schema ☃, Map<String, Supplier<TypeTemplate>> map, String str) {
/* 36 */     ☃.register(map, str, () -> DSL.optionalFields("Items", DSL.list(akn.l.in(☃))));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\amo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */