/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Objects;
/*    */ 
/*    */ public class ahf
/*    */   extends DataFix
/*    */ {
/*    */   public ahf(Schema ☃, boolean bool) {
/* 15 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 20 */     Type<?> ☃ = getInputSchema().getType(akn.c);
/* 21 */     Type<?> type1 = ☃.findFieldType("Level");
/*    */     
/* 23 */     OpticFinder<?> opticFinder = DSL.fieldFinder("Level", type1);
/*    */     
/* 25 */     return fixTypeEverywhereTyped("ChunkStatusFix", ☃, getOutputSchema().getType(akn.c), typed -> typed.updateTyped(☃, ()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ahf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */