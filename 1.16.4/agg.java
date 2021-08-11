/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ public class agg extends DataFix {
/*    */   private final String a;
/*    */   private final Function<String, String> b;
/*    */   
/*    */   public agg(Schema ☃, boolean bool, String str, Function<String, String> function) {
/* 15 */     super(☃, bool);
/* 16 */     this.a = str;
/* 17 */     this.b = function;
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 22 */     return fixTypeEverywhereTyped(this.a, getInputSchema().getType(akn.i), ☃ -> ☃.update(DSL.remainderFinder(), ()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\agg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */