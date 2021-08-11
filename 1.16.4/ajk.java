/*    */ import com.google.gson.JsonParseException;
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
/*    */ import org.apache.commons.lang3.StringUtils;
/*    */ 
/*    */ 
/*    */ public class ajk
/*    */   extends DataFix
/*    */ {
/*    */   public ajk(Schema ☃, boolean bool) {
/* 19 */     super(☃, bool);
/*    */   }
/*    */   
/*    */   public Dynamic<?> a(Dynamic<?> ☃) {
/* 23 */     return ☃.update("pages", dynamic1 -> (Dynamic)DataFixUtils.orElse(dynamic1.asStreamOpt().map(()).map(☃::createList).result(), ☃.emptyList()));
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
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 72 */     Type<?> ☃ = getInputSchema().getType(akn.l);
/* 73 */     OpticFinder<?> opticFinder = ☃.findField("tag");
/*    */     
/* 75 */     return fixTypeEverywhereTyped("ItemWrittenBookPagesStrictJsonFix", ☃, typed -> typed.updateTyped(☃, ()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ajk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */