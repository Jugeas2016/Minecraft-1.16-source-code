/*    */ import com.google.common.collect.ImmutableMap;
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
/*    */ 
/*    */ 
/*    */ public class anb
/*    */   extends aln
/*    */ {
/*    */   public anb(int ☃, Schema schema) {
/* 25 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 30 */     super.registerTypes(☃, map1, map2);
/*    */     
/* 32 */     ☃.registerType(false, akn.y, () -> DSL.fields("dimensions", DSL.compoundList(DSL.constType(a()), DSL.fields("generator", (TypeTemplate)DSL.taggedChoiceLazy("type", DSL.string(), (Map)ImmutableMap.of("minecraft:debug", DSL::remainder, "minecraft:flat", (), "minecraft:noise", ()))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\anb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */