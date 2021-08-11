/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.types.templates.TaggedChoice;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.DynamicOps;
/*    */ import java.util.Objects;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ public abstract class akw
/*    */   extends DataFix
/*    */ {
/*    */   private final String a;
/*    */   
/*    */   public akw(String ☃, Schema schema, boolean bool) {
/* 19 */     super(schema, bool);
/* 20 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 26 */     TaggedChoice.TaggedChoiceType<String> ☃ = getInputSchema().findChoiceType(akn.p);
/* 27 */     TaggedChoice.TaggedChoiceType<String> taggedChoiceType1 = getOutputSchema().findChoiceType(akn.p);
/*    */     
/* 29 */     Type<Pair<String, String>> type = DSL.named(akn.n.typeName(), aln.a());
/* 30 */     if (!Objects.equals(getOutputSchema().getType(akn.n), type)) {
/* 31 */       throw new IllegalStateException("Entity name type is not what was expected.");
/*    */     }
/*    */     
/* 34 */     return TypeRewriteRule.seq(
/* 35 */         fixTypeEverywhere(this.a, (Type)☃, (Type)taggedChoiceType1, dynamicOps -> ()), 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 47 */         fixTypeEverywhere(this.a + " for entity name", type, ☃ -> ()));
/*    */   }
/*    */   
/*    */   protected abstract String a(String paramString);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\akw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */