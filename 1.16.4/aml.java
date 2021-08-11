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
/*    */ public class aml
/*    */   extends aln
/*    */ {
/*    */   public aml(int ☃, Schema schema) {
/* 15 */     super(☃, schema);
/*    */   }
/*    */   
/*    */   protected static void a(Schema ☃, Map<String, Supplier<TypeTemplate>> map, String str) {
/* 19 */     ☃.register(map, str, () -> alo.a(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema ☃) {
/* 24 */     Map<String, Supplier<TypeTemplate>> map = super.registerEntities(☃);
/*    */     
/* 26 */     a(☃, map, "minecraft:panda");
/* 27 */     ☃.register(map, "minecraft:pillager", str -> DSL.optionalFields("Inventory", DSL.list(akn.l.in(☃)), alo.a(☃)));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 32 */     return map;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aml.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */