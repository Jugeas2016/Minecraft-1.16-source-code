/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ 
/*    */ public class ahd extends DataFix {
/*    */   public ahd(Schema ☃, boolean bool) {
/* 12 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 17 */     Type<?> ☃ = getInputSchema().getType(akn.c);
/* 18 */     Type<?> type1 = ☃.findFieldType("Level");
/*    */     
/* 20 */     OpticFinder<?> opticFinder = DSL.fieldFinder("Level", type1);
/*    */     
/* 22 */     return fixTypeEverywhereTyped("ChunkLightRemoveFix", ☃, getOutputSchema().getType(akn.c), typed -> typed.updateTyped(☃, ()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ahd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */