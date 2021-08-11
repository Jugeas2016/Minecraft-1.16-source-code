/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ 
/*    */ public class akz
/*    */   extends DataFix {
/*    */   public akz(Schema ☃, boolean bool) {
/* 12 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 17 */     Type<?> ☃ = getInputSchema().getType(akn.t);
/* 18 */     return fixTypeEverywhereTyped("Structure Reference Fix", ☃, ☃ -> ☃.update(DSL.remainderFinder(), akz::a));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static <T> Dynamic<T> a(Dynamic<T> ☃) {
/* 24 */     return ☃.update("references", ☃ -> ☃.createInt(((Integer)☃.asNumber().map(Number::intValue).result().filter(()).orElse(Integer.valueOf(1))).intValue()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\akz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */