/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ 
/*    */ public class aha
/*    */   extends DataFix {
/*    */   public aha(Schema ☃, boolean bool) {
/* 10 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 15 */     return fixTypeEverywhereTyped("BlockStateStructureTemplateFix", getInputSchema().getType(akn.m), ☃ -> ☃.update(DSL.remainderFinder(), agz::a));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aha.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */