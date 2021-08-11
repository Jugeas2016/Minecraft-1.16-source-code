/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.DataFixUtils;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aiz
/*    */   extends DataFix
/*    */ {
/*    */   public aiz(Schema ☃, boolean bool) {
/* 18 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 23 */     Type<?> ☃ = getInputSchema().getType(akn.l);
/* 24 */     OpticFinder<?> opticFinder = ☃.findField("tag");
/*    */     
/* 26 */     return fixTypeEverywhereTyped("Item Lore componentize", ☃, typed -> typed.updateTyped(☃, ()));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static <T> Stream<Dynamic<T>> a(Stream<Dynamic<T>> ☃) {
/* 40 */     return ☃.map(☃ -> (Dynamic)DataFixUtils.orElse(☃.asString().map(aiz::a).map(☃::createString).result(), ☃));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static String a(String ☃) {
/* 46 */     return nr.a.a(new oe(☃));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aiz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */