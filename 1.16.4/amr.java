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
/*    */ public class amr
/*    */   extends aln
/*    */ {
/*    */   public amr(int ☃, Schema schema) {
/* 15 */     super(☃, schema);
/*    */   }
/*    */   
/*    */   protected static TypeTemplate a(Schema ☃) {
/* 19 */     return DSL.optionalFields("ArmorItems", 
/* 20 */         DSL.list(akn.l.in(☃)), "HandItems", 
/* 21 */         DSL.list(akn.l.in(☃)));
/*    */   }
/*    */ 
/*    */   
/*    */   protected static void a(Schema ☃, Map<String, Supplier<TypeTemplate>> map, String str) {
/* 26 */     ☃.register(map, str, () -> a(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema ☃) {
/* 31 */     Map<String, Supplier<TypeTemplate>> map = super.registerEntities(☃);
/*    */     
/* 33 */     map.remove("minecraft:illager_beast");
/* 34 */     a(☃, map, "minecraft:ravager");
/*    */     
/* 36 */     return map;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\amr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */