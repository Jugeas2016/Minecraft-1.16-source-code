/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ public class aku
/*    */   extends DataFix
/*    */ {
/*    */   public aku(Schema ☃, boolean bool) {
/* 12 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 17 */     return writeFixAndRead("SavedDataVillageCropFix", getInputSchema().getType(akn.t), getOutputSchema().getType(akn.t), this::a);
/*    */   }
/*    */   
/*    */   private <T> Dynamic<T> a(Dynamic<T> ☃) {
/* 21 */     return ☃.update("Children", aku::b);
/*    */   }
/*    */   
/*    */   private static <T> Dynamic<T> b(Dynamic<T> ☃) {
/* 25 */     return ☃.asStreamOpt().map(aku::a).map(☃::createList).result().orElse(☃);
/*    */   }
/*    */   
/*    */   private static Stream<? extends Dynamic<?>> a(Stream<? extends Dynamic<?>> ☃) {
/* 29 */     return ☃.map(☃ -> {
/*    */           String str = ☃.get("id").asString("");
/*    */           return "ViF".equals(str) ? c(☃) : ("ViDF".equals(str) ? d(☃) : ☃);
/*    */         });
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static <T> Dynamic<T> c(Dynamic<T> ☃) {
/* 43 */     ☃ = a(☃, "CA");
/* 44 */     return a(☃, "CB");
/*    */   }
/*    */   
/*    */   private static <T> Dynamic<T> d(Dynamic<T> ☃) {
/* 48 */     ☃ = a(☃, "CA");
/* 49 */     ☃ = a(☃, "CB");
/* 50 */     ☃ = a(☃, "CC");
/* 51 */     return a(☃, "CD");
/*    */   }
/*    */   
/*    */   private static <T> Dynamic<T> a(Dynamic<T> ☃, String str) {
/* 55 */     if (☃.get(str).asNumber().result().isPresent()) {
/* 56 */       return ☃.set(str, agz.b(☃.get(str).asInt(0) << 4));
/*    */     }
/* 58 */     return ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aku.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */