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
/*    */ public class alx
/*    */   extends aln
/*    */ {
/*    */   public alx(int ☃, Schema schema) {
/* 20 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 25 */     super.registerTypes(☃, map1, map2);
/*    */     
/* 27 */     ☃.registerType(false, akn.c, () -> DSL.fields("Level", DSL.optionalFields("Entities", DSL.list(akn.o.in(☃)), "TileEntities", DSL.list(akn.k.in(☃)), "TileTicks", DSL.list(DSL.fields("i", akn.q.in(☃))), "Sections", DSL.list(DSL.optionalFields("Palette", DSL.list(akn.m.in(☃)))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\alx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */