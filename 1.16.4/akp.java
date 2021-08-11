/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.DynamicOps;
/*    */ import java.util.Map;
/*    */ import java.util.Objects;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ public class akp
/*    */   extends DataFix
/*    */ {
/*    */   private final String a;
/*    */   private final Map<String, String> b;
/*    */   
/*    */   public akp(Schema ☃, boolean bool, String str, Map<String, String> map) {
/* 20 */     super(☃, bool);
/* 21 */     this.b = map;
/* 22 */     this.a = str;
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 27 */     Type<Pair<String, String>> ☃ = DSL.named(akn.x.typeName(), aln.a());
/* 28 */     if (!Objects.equals(☃, getInputSchema().getType(akn.x))) {
/* 29 */       throw new IllegalStateException("Biome type is not what was expected.");
/*    */     }
/* 31 */     return fixTypeEverywhere(this.a, ☃, ☃ -> ());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\akp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */