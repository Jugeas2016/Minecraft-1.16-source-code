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
/*    */ public class ams
/*    */   extends aln
/*    */ {
/*    */   public ams(int ☃, Schema schema) {
/* 15 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema ☃) {
/* 20 */     Map<String, Supplier<TypeTemplate>> map = super.registerEntities(☃);
/* 21 */     ☃.register(map, "minecraft:wandering_trader", str -> DSL.optionalFields("Inventory", DSL.list(akn.l.in(☃)), "Offers", DSL.optionalFields("Recipes", DSL.list(DSL.optionalFields("buy", akn.l.in(☃), "buyB", akn.l.in(☃), "sell", akn.l.in(☃)))), alo.a(☃)));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 35 */     ☃.register(map, "minecraft:trader_llama", str -> DSL.optionalFields("Items", DSL.list(akn.l.in(☃)), "SaddleItem", akn.l.in(☃), "DecorItem", akn.l.in(☃), alo.a(☃)));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 42 */     return map;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ams.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */