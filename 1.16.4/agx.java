/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import com.mojang.serialization.DynamicOps;
/*    */ import java.util.Objects;
/*    */ import java.util.Optional;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ public abstract class agx
/*    */   extends DataFix
/*    */ {
/*    */   private final String a;
/*    */   
/*    */   public agx(Schema ☃, String str) {
/* 20 */     super(☃, false);
/* 21 */     this.a = str;
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 26 */     Type<?> ☃ = getInputSchema().getType(akn.q);
/* 27 */     Type<Pair<String, String>> type = DSL.named(akn.q.typeName(), aln.a());
/* 28 */     if (!Objects.equals(☃, type)) {
/* 29 */       throw new IllegalStateException("block type is not what was expected.");
/*    */     }
/*    */     
/* 32 */     TypeRewriteRule typeRewriteRule1 = fixTypeEverywhere(this.a + " for block", type, ☃ -> ());
/*    */     
/* 34 */     TypeRewriteRule typeRewriteRule2 = fixTypeEverywhereTyped(this.a + " for block_state", getInputSchema().getType(akn.m), ☃ -> ☃.update(DSL.remainderFinder(), ()));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 42 */     return TypeRewriteRule.seq(typeRewriteRule1, typeRewriteRule2);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static DataFix a(Schema ☃, String str, Function<String, String> function) {
/* 48 */     return new agx(☃, str, function)
/*    */       {
/*    */         protected String a(String ☃) {
/* 51 */           return this.a.apply(☃);
/*    */         }
/*    */       };
/*    */   }
/*    */   
/*    */   protected abstract String a(String paramString);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\agx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */