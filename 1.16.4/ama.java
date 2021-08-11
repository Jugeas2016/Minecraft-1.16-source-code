/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*    */ import java.util.Map;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ama
/*    */   extends aln
/*    */ {
/*    */   public ama(int ☃, Schema schema) {
/* 14 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 19 */     super.registerTypes(☃, map1, map2);
/*    */     
/* 21 */     ☃.registerType(false, akn.q, () -> DSL.constType(a()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ama.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */