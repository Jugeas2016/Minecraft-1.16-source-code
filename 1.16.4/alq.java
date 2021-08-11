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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class alq
/*    */   extends Schema
/*    */ {
/*    */   public alq(int ☃, Schema schema) {
/* 22 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 27 */     super.registerTypes(☃, map1, map2);
/*    */     
/* 29 */     ☃.registerType(false, akn.w, () -> DSL.constType(aln.a()));
/* 30 */     ☃.registerType(false, akn.b, () -> DSL.optionalFields("RootVehicle", DSL.optionalFields("Entity", akn.o.in(☃)), "Inventory", DSL.list(akn.l.in(☃)), "EnderItems", DSL.list(akn.l.in(☃)), DSL.optionalFields("ShoulderEntityLeft", akn.o.in(☃), "ShoulderEntityRight", akn.o.in(☃), "recipeBook", DSL.optionalFields("recipes", DSL.list(akn.w.in(☃)), "toBeDisplayed", DSL.list(akn.w.in(☃))))));
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
/*    */ 
/*    */     
/* 46 */     ☃.registerType(false, akn.d, () -> DSL.compoundList(DSL.list(akn.l.in(☃))));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\alq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */