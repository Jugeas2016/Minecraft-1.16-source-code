/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
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
/*    */ public class air
/*    */   extends DataFix
/*    */ {
/*    */   public air(Schema ☃, boolean bool) {
/* 18 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 23 */     Type<Pair<String, Dynamic<?>>> ☃ = DSL.named(akn.j.typeName(), DSL.remainderType());
/*    */     
/* 25 */     if (!Objects.equals(☃, getInputSchema().getType(akn.j))) {
/* 26 */       throw new IllegalStateException("Poi type is not what was expected.");
/*    */     }
/* 28 */     return fixTypeEverywhere("POI rebuild", ☃, ☃ -> ());
/*    */   }
/*    */   
/*    */   private static <T> Dynamic<T> a(Dynamic<T> ☃) {
/* 32 */     return ☃.update("Sections", ☃ -> ☃.updateMapValues(()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\air.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */