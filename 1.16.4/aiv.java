/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ public class aiv
/*    */   extends DataFix {
/*    */   public aiv(Schema ☃, boolean bool) {
/* 11 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 16 */     Type<?> ☃ = getInputSchema().getType(akn.t);
/* 17 */     Type<?> type1 = getOutputSchema().getType(akn.t);
/*    */     
/* 19 */     return writeFixAndRead("IglooMetadataRemovalFix", ☃, type1, aiv::a);
/*    */   }
/*    */   
/*    */   private static <T> Dynamic<T> a(Dynamic<T> ☃) {
/* 23 */     boolean bool = ((Boolean)☃.get("Children").asStreamOpt().map(☃ -> Boolean.valueOf(☃.allMatch(aiv::c))).result().orElse(Boolean.valueOf(false))).booleanValue();
/*    */     
/* 25 */     if (bool) {
/* 26 */       return ☃.set("id", ☃.createString("Igloo")).remove("Children");
/*    */     }
/* 28 */     return ☃.update("Children", aiv::b);
/*    */   }
/*    */ 
/*    */   
/*    */   private static <T> Dynamic<T> b(Dynamic<T> ☃) {
/* 33 */     return ☃.asStreamOpt().map(☃ -> ☃.filter(())).map(☃::createList).result().orElse(☃);
/*    */   }
/*    */   
/*    */   private static boolean c(Dynamic<?> ☃) {
/* 37 */     return ☃.get("id").asString("").equals("Iglu");
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aiv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */