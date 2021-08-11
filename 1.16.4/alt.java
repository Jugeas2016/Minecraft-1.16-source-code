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
/*    */ public class alt
/*    */   extends aln
/*    */ {
/*    */   public alt(int ☃, Schema schema) {
/* 19 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema ☃) {
/* 24 */     Map<String, Supplier<TypeTemplate>> map = super.registerBlockEntities(☃);
/*    */     
/* 26 */     ☃.registerSimple(map, "minecraft:bed");
/*    */     
/* 28 */     return map;
/*    */   }
/*    */ 
/*    */   
/*    */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 33 */     super.registerTypes(☃, map1, map2);
/* 34 */     ☃.registerType(false, akn.i, () -> DSL.optionalFields("minecraft:adventure/adventuring_time", DSL.optionalFields("criteria", DSL.compoundList(akn.x.in(☃), DSL.constType(DSL.string()))), "minecraft:adventure/kill_a_mob", DSL.optionalFields("criteria", DSL.compoundList(akn.n.in(☃), DSL.constType(DSL.string()))), "minecraft:adventure/kill_all_mobs", DSL.optionalFields("criteria", DSL.compoundList(akn.n.in(☃), DSL.constType(DSL.string()))), "minecraft:husbandry/bred_all_animals", DSL.optionalFields("criteria", DSL.compoundList(akn.n.in(☃), DSL.constType(DSL.string())))));
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
/* 48 */     ☃.registerType(false, akn.x, () -> DSL.constType(a()));
/* 49 */     ☃.registerType(false, akn.n, () -> DSL.constType(a()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\alt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */