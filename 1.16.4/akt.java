/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ 
/*    */ public class akt
/*    */   extends agd {
/*    */   public akt(Schema ☃) {
/* 10 */     super(☃, akn.h);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 15 */     return fixTypeEverywhereTyped("SavedDataUUIDFix", getInputSchema().getType(this.b), ☃ -> ☃.updateTyped(☃.getType().findField("data"), ()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\akt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */