/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Either;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.DynamicOps;
/*    */ import java.util.Objects;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class agw
/*    */   extends DataFix
/*    */ {
/*    */   public agw(Schema ☃, boolean bool) {
/* 18 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 23 */     Type<?> ☃ = getInputSchema().getType(akn.q);
/* 24 */     Type<?> type1 = getOutputSchema().getType(akn.q);
/*    */     
/* 26 */     Type<Pair<String, Either<Integer, String>>> type = DSL.named(akn.q.typeName(), DSL.or(DSL.intType(), aln.a()));
/* 27 */     Type<Pair<String, String>> type2 = DSL.named(akn.q.typeName(), aln.a());
/*    */     
/* 29 */     if (!Objects.equals(☃, type) || !Objects.equals(type1, type2)) {
/* 30 */       throw new IllegalStateException("Expected and actual types don't match.");
/*    */     }
/* 32 */     return fixTypeEverywhere("BlockNameFlatteningFix", type, type2, ☃ -> ());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\agw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */