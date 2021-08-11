/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*    */ import java.util.Map;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ public class anf
/*    */   extends Schema
/*    */ {
/*    */   public anf(int ☃, Schema schema) {
/* 11 */     super(☃, schema);
/*    */   }
/*    */   
/*    */   protected static void a(Schema ☃, Map<String, Supplier<TypeTemplate>> map, String str) {
/* 15 */     ☃.register(map, str, () -> alo.a(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema ☃) {
/* 20 */     Map<String, Supplier<TypeTemplate>> map = super.registerEntities(☃);
/*    */     
/* 22 */     a(☃, map, "WitherSkeleton");
/* 23 */     a(☃, map, "Stray");
/*    */     
/* 25 */     return map;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\anf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */