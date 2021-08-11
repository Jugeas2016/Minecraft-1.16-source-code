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
/*    */ public class alu
/*    */   extends Schema
/*    */ {
/*    */   public alu(int ☃, Schema schema) {
/* 18 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 23 */     super.registerTypes(☃, map1, map2);
/*    */     
/* 25 */     ☃.registerType(false, akn.b, () -> DSL.optionalFields("RootVehicle", DSL.optionalFields("Entity", akn.o.in(☃)), "Inventory", DSL.list(akn.l.in(☃)), "EnderItems", DSL.list(akn.l.in(☃))));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 32 */     ☃.registerType(true, akn.o, () -> DSL.optionalFields("Passengers", DSL.list(akn.o.in(☃)), akn.p.in(☃)));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\alu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */