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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class amv
/*    */   extends aln
/*    */ {
/*    */   public amv(int ☃, Schema schema) {
/* 19 */     super(☃, schema);
/*    */   }
/*    */   
/*    */   private static void a(Schema ☃, Map<String, Supplier<TypeTemplate>> map, String str) {
/* 23 */     ☃.register(map, str, () -> DSL.optionalFields("Items", DSL.list(akn.l.in(☃)), "RecipesUsed", DSL.compoundList(akn.w.in(☃), DSL.constType(DSL.intType()))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema ☃) {
/* 31 */     Map<String, Supplier<TypeTemplate>> map = super.registerBlockEntities(☃);
/* 32 */     a(☃, map, "minecraft:furnace");
/* 33 */     a(☃, map, "minecraft:smoker");
/* 34 */     a(☃, map, "minecraft:blast_furnace");
/* 35 */     return map;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\amv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */