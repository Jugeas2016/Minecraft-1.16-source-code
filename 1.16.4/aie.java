/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.types.templates.TaggedChoice;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.DynamicOps;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ public abstract class aie
/*    */   extends DataFix {
/*    */   protected final String a;
/*    */   
/*    */   public aie(String ☃, Schema schema, boolean bool) {
/* 16 */     super(schema, bool);
/* 17 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 23 */     TaggedChoice.TaggedChoiceType<String> ☃ = getInputSchema().findChoiceType(akn.p);
/* 24 */     TaggedChoice.TaggedChoiceType<String> taggedChoiceType1 = getOutputSchema().findChoiceType(akn.p);
/*    */     
/* 26 */     return fixTypeEverywhere(this.a, (Type)☃, (Type)taggedChoiceType1, dynamicOps -> ());
/*    */   }
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
/*    */ 
/*    */ 
/*    */   
/*    */   private <A> Typed<A> a(Object ☃, DynamicOps<?> dynamicOps, Type<A> type) {
/* 43 */     return new Typed(type, dynamicOps, ☃);
/*    */   }
/*    */   
/*    */   protected abstract Pair<String, Typed<?>> a(String paramString, Typed<?> paramTyped);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aie.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */