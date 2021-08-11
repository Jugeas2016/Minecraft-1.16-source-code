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
/*    */ public class alz
/*    */   extends aln
/*    */ {
/*    */   public alz(int ☃, Schema schema) {
/* 18 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema ☃) {
/* 23 */     Map<String, Supplier<TypeTemplate>> map = super.registerEntities(☃);
/*    */ 
/*    */     
/* 26 */     ☃.registerSimple(map, "minecraft:egg");
/* 27 */     ☃.registerSimple(map, "minecraft:ender_pearl");
/* 28 */     ☃.registerSimple(map, "minecraft:fireball");
/* 29 */     ☃.register(map, "minecraft:potion", str -> DSL.optionalFields("Potion", akn.l.in(☃)));
/*    */ 
/*    */     
/* 32 */     ☃.registerSimple(map, "minecraft:small_fireball");
/* 33 */     ☃.registerSimple(map, "minecraft:snowball");
/* 34 */     ☃.registerSimple(map, "minecraft:wither_skull");
/* 35 */     ☃.registerSimple(map, "minecraft:xp_bottle");
/*    */     
/* 37 */     ☃.register(map, "minecraft:arrow", () -> DSL.optionalFields("inBlockState", akn.m.in(☃)));
/*    */ 
/*    */     
/* 40 */     ☃.register(map, "minecraft:enderman", () -> DSL.optionalFields("carriedBlockState", akn.m.in(☃), alo.a(☃)));
/*    */ 
/*    */ 
/*    */     
/* 44 */     ☃.register(map, "minecraft:falling_block", () -> DSL.optionalFields("BlockState", akn.m.in(☃), "TileEntityData", akn.k.in(☃)));
/*    */ 
/*    */ 
/*    */     
/* 48 */     ☃.register(map, "minecraft:spectral_arrow", () -> DSL.optionalFields("inBlockState", akn.m.in(☃)));
/*    */ 
/*    */     
/* 51 */     ☃.register(map, "minecraft:chest_minecart", () -> DSL.optionalFields("DisplayState", akn.m.in(☃), "Items", DSL.list(akn.l.in(☃))));
/*    */ 
/*    */ 
/*    */     
/* 55 */     ☃.register(map, "minecraft:commandblock_minecart", () -> DSL.optionalFields("DisplayState", akn.m.in(☃)));
/*    */ 
/*    */     
/* 58 */     ☃.register(map, "minecraft:furnace_minecart", () -> DSL.optionalFields("DisplayState", akn.m.in(☃)));
/*    */ 
/*    */     
/* 61 */     ☃.register(map, "minecraft:hopper_minecart", () -> DSL.optionalFields("DisplayState", akn.m.in(☃), "Items", DSL.list(akn.l.in(☃))));
/*    */ 
/*    */ 
/*    */     
/* 65 */     ☃.register(map, "minecraft:minecart", () -> DSL.optionalFields("DisplayState", akn.m.in(☃)));
/*    */ 
/*    */     
/* 68 */     ☃.register(map, "minecraft:spawner_minecart", () -> DSL.optionalFields("DisplayState", akn.m.in(☃), akn.s.in(☃)));
/*    */ 
/*    */ 
/*    */     
/* 72 */     ☃.register(map, "minecraft:tnt_minecart", () -> DSL.optionalFields("DisplayState", akn.m.in(☃)));
/*    */ 
/*    */ 
/*    */     
/* 76 */     return map;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\alz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */