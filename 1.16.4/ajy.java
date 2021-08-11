/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import com.mojang.serialization.DynamicOps;
/*    */ import java.util.Objects;
/*    */ import java.util.Optional;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ajy
/*    */   extends DataFix
/*    */ {
/*    */   public ajy(Schema ☃, boolean bool) {
/* 19 */     super(☃, bool);
/*    */   }
/*    */   
/*    */   private static ddq.a a(String ☃) {
/* 23 */     return ☃.equals("health") ? ddq.a.b : ddq.a.a;
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 28 */     Type<Pair<String, Dynamic<?>>> ☃ = DSL.named(akn.u.typeName(), DSL.remainderType());
/*    */     
/* 30 */     if (!Objects.equals(☃, getInputSchema().getType(akn.u))) {
/* 31 */       throw new IllegalStateException("Objective type is not what was expected.");
/*    */     }
/*    */     
/* 34 */     return fixTypeEverywhere("ObjectiveRenderTypeFix", ☃, ☃ -> ());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ajy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */