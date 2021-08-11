/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*    */ import java.util.Map;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aly
/*    */   extends aln
/*    */ {
/*    */   public aly(int ☃, Schema schema) {
/* 14 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema ☃) {
/* 19 */     Map<String, Supplier<TypeTemplate>> map = super.registerBlockEntities(☃);
/*    */     
/* 21 */     ☃.register(map, "minecraft:piston", str -> DSL.optionalFields("blockState", akn.m.in(☃)));
/*    */ 
/*    */ 
/*    */     
/* 25 */     return map;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aly.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */