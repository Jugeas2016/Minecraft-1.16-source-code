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
/*    */ public class akk
/*    */   extends DataFix
/*    */ {
/*    */   private final String a;
/*    */   private final Function<String, String> b;
/*    */   
/*    */   public akk(Schema ☃, boolean bool, String str, Function<String, String> function) {
/* 20 */     super(☃, bool);
/* 21 */     this.a = str;
/* 22 */     this.b = function;
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 27 */     Type<Pair<String, String>> ☃ = DSL.named(akn.w.typeName(), aln.a());
/* 28 */     if (!Objects.equals(☃, getInputSchema().getType(akn.w))) {
/* 29 */       throw new IllegalStateException("Recipe type is not what was expected.");
/*    */     }
/* 31 */     return fixTypeEverywhere(this.a, ☃, ☃ -> ());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\akk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */