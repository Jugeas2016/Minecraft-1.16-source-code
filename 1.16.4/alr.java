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
/*    */ public class alr
/*    */   extends Schema
/*    */ {
/*    */   public alr(int ☃, Schema schema) {
/* 17 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 22 */     super.registerTypes(☃, map1, map2);
/*    */     
/* 24 */     ☃.registerType(true, akn.s, () -> DSL.optionalFields("SpawnPotentials", DSL.list(DSL.fields("Entity", akn.o.in(☃))), "SpawnData", akn.o.in(☃)));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\alr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */