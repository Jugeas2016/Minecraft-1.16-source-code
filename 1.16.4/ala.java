/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ 
/*    */ 
/*    */ public class ala
/*    */   extends DataFix
/*    */ {
/*    */   public ala(Schema ☃, boolean bool) {
/* 13 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 18 */     Type<?> ☃ = getOutputSchema().getType(akn.g);
/* 19 */     Type<?> type1 = getInputSchema().getType(akn.g);
/* 20 */     OpticFinder<?> opticFinder1 = type1.findField("stats");
/* 21 */     OpticFinder<?> opticFinder2 = opticFinder1.type().findField("minecraft:custom");
/* 22 */     OpticFinder<String> opticFinder = aln.a().finder();
/* 23 */     return fixTypeEverywhereTyped("SwimStatsRenameFix", type1, ☃, typed -> typed.updateTyped(☃, ()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ala.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */