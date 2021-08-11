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
/*    */ public class anh
/*    */   extends Schema
/*    */ {
/*    */   public anh(int ☃, Schema schema) {
/* 15 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema ☃) {
/* 20 */     Map<String, Supplier<TypeTemplate>> map = super.registerEntities(☃);
/*    */     
/* 22 */     map.remove("EntityHorse");
/* 23 */     ☃.register(map, "Horse", () -> DSL.optionalFields("ArmorItem", akn.l.in(☃), "SaddleItem", akn.l.in(☃), alo.a(☃)));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 28 */     ☃.register(map, "Donkey", () -> DSL.optionalFields("Items", DSL.list(akn.l.in(☃)), "SaddleItem", akn.l.in(☃), alo.a(☃)));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 33 */     ☃.register(map, "Mule", () -> DSL.optionalFields("Items", DSL.list(akn.l.in(☃)), "SaddleItem", akn.l.in(☃), alo.a(☃)));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 38 */     ☃.register(map, "ZombieHorse", () -> DSL.optionalFields("SaddleItem", akn.l.in(☃), alo.a(☃)));
/*    */ 
/*    */ 
/*    */     
/* 42 */     ☃.register(map, "SkeletonHorse", () -> DSL.optionalFields("SaddleItem", akn.l.in(☃), alo.a(☃)));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 47 */     return map;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\anh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */