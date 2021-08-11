/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
/*    */ 
/*    */ public class ajm
/*    */   extends DataFix
/*    */ {
/* 14 */   private static final Map<String, String> a = (Map<String, String>)ImmutableMap.builder()
/* 15 */     .put("down", "down_south")
/* 16 */     .put("up", "up_north")
/* 17 */     .put("north", "north_up")
/* 18 */     .put("south", "south_up")
/* 19 */     .put("west", "west_up")
/* 20 */     .put("east", "east_up")
/* 21 */     .build();
/*    */   
/*    */   public ajm(Schema ☃, boolean bool) {
/* 24 */     super(☃, bool);
/*    */   }
/*    */   
/*    */   private static Dynamic<?> a(Dynamic<?> ☃) {
/* 28 */     Optional<String> optional = ☃.get("Name").asString().result();
/* 29 */     if (optional.equals(Optional.of("minecraft:jigsaw"))) {
/* 30 */       return ☃.update("Properties", ☃ -> {
/*    */             String str = ☃.get("facing").asString("north");
/*    */             
/*    */             return ☃.remove("facing").set("orientation", ☃.createString(a.getOrDefault(str, str)));
/*    */           });
/*    */     }
/*    */     
/* 37 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 42 */     return fixTypeEverywhereTyped("jigsaw_rotation_fix", getInputSchema().getType(akn.m), ☃ -> ☃.update(DSL.remainderFinder(), ajm::a));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ajm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */