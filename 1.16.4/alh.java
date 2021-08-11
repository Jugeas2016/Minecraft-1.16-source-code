/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.DataFixUtils;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class alh
/*    */   extends DataFix
/*    */ {
/* 14 */   private static final Set<String> a = (Set<String>)ImmutableSet.of("minecraft:andesite_wall", "minecraft:brick_wall", "minecraft:cobblestone_wall", "minecraft:diorite_wall", "minecraft:end_stone_brick_wall", "minecraft:granite_wall", (Object[])new String[] { "minecraft:mossy_cobblestone_wall", "minecraft:mossy_stone_brick_wall", "minecraft:nether_brick_wall", "minecraft:prismarine_wall", "minecraft:red_nether_brick_wall", "minecraft:red_sandstone_wall", "minecraft:sandstone_wall", "minecraft:stone_brick_wall" });
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
/*    */ 
/*    */ 
/*    */   
/*    */   public alh(Schema ☃, boolean bool) {
/* 33 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 38 */     return fixTypeEverywhereTyped("WallPropertyFix", getInputSchema().getType(akn.m), ☃ -> ☃.update(DSL.remainderFinder(), alh::a));
/*    */   }
/*    */   
/*    */   private static String a(String ☃) {
/* 42 */     return "true".equals(☃) ? "low" : "none";
/*    */   }
/*    */   
/*    */   private static <T> Dynamic<T> a(Dynamic<T> ☃, String str) {
/* 46 */     return ☃.update(str, ☃ -> (Dynamic)DataFixUtils.orElse(☃.asString().result().map(alh::a).map(☃::createString), ☃));
/*    */   }
/*    */   
/*    */   private static <T> Dynamic<T> a(Dynamic<T> ☃) {
/* 50 */     boolean bool = ☃.get("Name").asString().result().filter(a::contains).isPresent();
/* 51 */     if (!bool) {
/* 52 */       return ☃;
/*    */     }
/*    */     
/* 55 */     return ☃.update("Properties", ☃ -> {
/*    */           Dynamic<?> dynamic = a(☃, "east");
/*    */           dynamic = a(dynamic, "west");
/*    */           dynamic = a(dynamic, "north");
/*    */           return a(dynamic, "south");
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\alh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */