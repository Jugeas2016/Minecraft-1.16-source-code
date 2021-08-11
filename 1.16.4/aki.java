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
/*    */ import java.util.Optional;
/*    */ import java.util.function.Function;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ public abstract class aki
/*    */   extends DataFix
/*    */ {
/*    */   public aki(Schema ☃, boolean bool) {
/* 19 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 24 */     Type<Pair<String, Dynamic<?>>> ☃ = DSL.named(akn.j.typeName(), DSL.remainderType());
/*    */     
/* 26 */     if (!Objects.equals(☃, getInputSchema().getType(akn.j))) {
/* 27 */       throw new IllegalStateException("Poi type is not what was expected.");
/*    */     }
/* 29 */     return fixTypeEverywhere("POI rename", ☃, ☃ -> ());
/*    */   }
/*    */   
/*    */   private <T> Dynamic<T> a(Dynamic<T> ☃) {
/* 33 */     return ☃.update("Sections", ☃ -> ☃.updateMapValues(()));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private <T> Optional<Dynamic<T>> b(Dynamic<T> ☃) {
/* 39 */     return ☃.asStreamOpt().map(stream -> ☃.createList(stream.map(())))
/*    */ 
/*    */       
/* 42 */       .result();
/*    */   }
/*    */   
/*    */   protected abstract String a(String paramString);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aki.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */