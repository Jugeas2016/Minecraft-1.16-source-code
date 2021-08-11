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
/*    */ public class alw
/*    */   extends aln
/*    */ {
/*    */   public alw(int ☃, Schema schema) {
/* 15 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema ☃) {
/* 20 */     Map<String, Supplier<TypeTemplate>> map = super.registerBlockEntities(☃);
/*    */     
/* 22 */     ☃.register(map, "minecraft:trapped_chest", () -> DSL.optionalFields("Items", DSL.list(akn.l.in(☃))));
/*    */ 
/*    */ 
/*    */     
/* 26 */     return map;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\alw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */