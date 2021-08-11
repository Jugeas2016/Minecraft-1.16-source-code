/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ 
/*    */ public class alj
/*    */   extends DataFix
/*    */ {
/*    */   private final String a;
/*    */   private final DSL.TypeReference b;
/*    */   
/*    */   public alj(Schema ☃, String str, DSL.TypeReference typeReference) {
/* 13 */     super(☃, true);
/* 14 */     this.a = str;
/* 15 */     this.b = typeReference;
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 20 */     return writeAndRead(this.a, getInputSchema().getType(this.b), getOutputSchema().getType(this.b));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\alj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */