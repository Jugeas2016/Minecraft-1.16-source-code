/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ 
/*    */ public abstract class ajv
/*    */   extends DataFix
/*    */ {
/*    */   private final String a;
/*    */   private final String b;
/*    */   private final DSL.TypeReference c;
/*    */   
/*    */   public ajv(Schema ☃, boolean bool, String str1, DSL.TypeReference typeReference, String str2) {
/* 16 */     super(☃, bool);
/* 17 */     this.a = str1;
/* 18 */     this.c = typeReference;
/* 19 */     this.b = str2;
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 24 */     OpticFinder<?> ☃ = DSL.namedChoice(this.b, getInputSchema().getChoiceType(this.c, this.b));
/*    */     
/* 26 */     return fixTypeEverywhereTyped(this.a, getInputSchema().getType(this.c), getOutputSchema().getType(this.c), typed -> typed.updateTyped(☃, getOutputSchema().getChoiceType(this.c, this.b), this::a));
/*    */   }
/*    */   
/*    */   protected abstract Typed<?> a(Typed<?> paramTyped);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ajv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */