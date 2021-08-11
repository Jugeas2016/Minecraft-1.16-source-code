/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*    */ import java.util.Map;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ public class amy
/*    */   extends aln
/*    */ {
/*    */   public amy(int ☃, Schema schema) {
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
/* 21 */     map.remove("minecraft:zombie_pigman");
/* 22 */     a(☃, map, "minecraft:zombified_piglin");
/* 23 */     return map;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\amy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */