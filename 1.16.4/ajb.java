/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.DynamicOps;
/*    */ import java.util.Objects;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ajb
/*    */   extends DataFix
/*    */ {
/*    */   private final String a;
/*    */   
/*    */   public ajb(Schema ☃, String str) {
/* 19 */     super(☃, false);
/* 20 */     this.a = str;
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 25 */     Type<Pair<String, String>> ☃ = DSL.named(akn.r.typeName(), aln.a());
/* 26 */     if (!Objects.equals(getInputSchema().getType(akn.r), ☃)) {
/* 27 */       throw new IllegalStateException("item name type is not what was expected.");
/*    */     }
/* 29 */     return fixTypeEverywhere(this.a, ☃, ☃ -> ());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static DataFix a(Schema ☃, String str, Function<String, String> function) {
/* 35 */     return new ajb(☃, str, function)
/*    */       {
/*    */         protected String a(String ☃) {
/* 38 */           return this.a.apply(☃);
/*    */         }
/*    */       };
/*    */   }
/*    */   
/*    */   protected abstract String a(String paramString);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ajb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */