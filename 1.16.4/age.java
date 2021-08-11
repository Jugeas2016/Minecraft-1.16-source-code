/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.types.templates.TaggedChoice;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.DynamicOps;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ public class age extends DataFix {
/*    */   private final String a;
/*    */   
/*    */   public age(Schema ☃, String str, DSL.TypeReference typeReference) {
/* 14 */     super(☃, true);
/* 15 */     this.a = str;
/* 16 */     this.b = typeReference;
/*    */   }
/*    */   private final DSL.TypeReference b;
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 21 */     TaggedChoice.TaggedChoiceType<?> ☃ = getInputSchema().findChoiceType(this.b);
/* 22 */     TaggedChoice.TaggedChoiceType<?> taggedChoiceType1 = getOutputSchema().findChoiceType(this.b);
/* 23 */     return a(this.a, ☃, taggedChoiceType1);
/*    */   }
/*    */ 
/*    */   
/*    */   protected final <K> TypeRewriteRule a(String ☃, TaggedChoice.TaggedChoiceType<K> taggedChoiceType, TaggedChoice.TaggedChoiceType<?> taggedChoiceType1) {
/* 28 */     if (taggedChoiceType.getKeyType() != taggedChoiceType1.getKeyType()) {
/* 29 */       throw new IllegalStateException("Could not inject: key type is not the same");
/*    */     }
/* 31 */     TaggedChoice.TaggedChoiceType<K> taggedChoiceType2 = (TaggedChoice.TaggedChoiceType)taggedChoiceType1;
/* 32 */     return fixTypeEverywhere(☃, (Type)taggedChoiceType, (Type)taggedChoiceType2, dynamicOps -> ());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\age.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */