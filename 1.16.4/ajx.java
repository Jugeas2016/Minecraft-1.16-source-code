/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.DataFixUtils;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import com.mojang.serialization.DynamicOps;
/*    */ import java.util.Objects;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ajx
/*    */   extends DataFix
/*    */ {
/*    */   public ajx(Schema ☃, boolean bool) {
/* 20 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 25 */     Type<Pair<String, Dynamic<?>>> ☃ = DSL.named(akn.u.typeName(), DSL.remainderType());
/*    */     
/* 27 */     if (!Objects.equals(☃, getInputSchema().getType(akn.u))) {
/* 28 */       throw new IllegalStateException("Objective type is not what was expected.");
/*    */     }
/*    */     
/* 31 */     return fixTypeEverywhere("ObjectiveDisplayNameFix", ☃, ☃ -> ());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ajx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */