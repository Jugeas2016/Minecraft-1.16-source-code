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
/*    */ public class amd
/*    */   extends aln
/*    */ {
/*    */   public amd(int ☃, Schema schema) {
/* 16 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 21 */     super.registerTypes(☃, map1, map2);
/*    */     
/* 23 */     ☃.registerType(false, akn.t, () -> DSL.optionalFields("Children", DSL.list(DSL.optionalFields("CA", akn.m.in(☃), "CB", akn.m.in(☃), "CC", akn.m.in(☃), "CD", akn.m.in(☃)))));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\amd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */