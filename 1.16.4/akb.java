/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.DataFixUtils;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ 
/*    */ public class akb extends DataFix {
/*    */   public akb(Schema ☃, boolean bool) {
/* 11 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 16 */     return fixTypeEverywhereTyped("OptionsAddTextBackgroundFix", getInputSchema().getType(akn.e), ☃ -> ☃.update(DSL.remainderFinder(), ()));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private double a(String ☃) {
/*    */     try {
/* 23 */       double d = 0.9D * Double.parseDouble(☃) + 0.1D;
/* 24 */       return d / 2.0D;
/* 25 */     } catch (NumberFormatException numberFormatException) {
/* 26 */       return 0.5D;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\akb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */