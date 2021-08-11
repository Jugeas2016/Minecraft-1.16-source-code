/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Map;
/*    */ import java.util.Objects;
/*    */ 
/*    */ public class ahg
/*    */   extends DataFix
/*    */ {
/* 16 */   private static final Map<String, String> a = (Map<String, String>)ImmutableMap.builder()
/* 17 */     .put("structure_references", "empty")
/* 18 */     .put("biomes", "empty")
/* 19 */     .put("base", "surface")
/* 20 */     .put("carved", "carvers")
/* 21 */     .put("liquid_carved", "liquid_carvers")
/* 22 */     .put("decorated", "features")
/* 23 */     .put("lighted", "light")
/* 24 */     .put("mobs_spawned", "spawn")
/* 25 */     .put("finalized", "heightmaps")
/* 26 */     .put("fullchunk", "full")
/* 27 */     .build();
/*    */   
/*    */   public ahg(Schema ☃, boolean bool) {
/* 30 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 35 */     Type<?> ☃ = getInputSchema().getType(akn.c);
/* 36 */     Type<?> type1 = ☃.findFieldType("Level");
/*    */     
/* 38 */     OpticFinder<?> opticFinder = DSL.fieldFinder("Level", type1);
/*    */     
/* 40 */     return fixTypeEverywhereTyped("ChunkStatusFix2", ☃, getOutputSchema().getType(akn.c), typed -> typed.updateTyped(☃, ()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ahg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */