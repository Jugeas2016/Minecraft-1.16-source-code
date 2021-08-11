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
/*    */ public class amf
/*    */   extends aln
/*    */ {
/*    */   public amf(int ☃, Schema schema) {
/* 24 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 29 */     super.registerTypes(☃, map1, map2);
/*    */     
/* 31 */     ☃.registerType(false, akn.c, () -> DSL.fields("Level", DSL.optionalFields("Entities", DSL.list(akn.o.in(☃)), "TileEntities", DSL.list(akn.k.in(☃)), "TileTicks", DSL.list(DSL.fields("i", akn.q.in(☃))), "Sections", DSL.list(DSL.optionalFields("Palette", DSL.list(akn.m.in(☃)))), "Structures", DSL.optionalFields("Starts", DSL.compoundList(akn.t.in(☃))))));
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
/* 44 */     ☃.registerType(false, akn.t, () -> DSL.optionalFields("Children", DSL.list(DSL.optionalFields("CA", akn.m.in(☃), "CB", akn.m.in(☃), "CC", akn.m.in(☃), "CD", akn.m.in(☃))), "biome", akn.x.in(☃)));
/*    */   }
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
/*    */   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema ☃) {
/* 57 */     Map<String, Supplier<TypeTemplate>> map = super.registerBlockEntities(☃);
/*    */     
/* 59 */     map.put("DUMMY", DSL::remainder);
/*    */     
/* 61 */     return map;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\amf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */