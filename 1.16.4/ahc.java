/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Arrays;
/*    */ import java.util.Optional;
/*    */ import java.util.stream.IntStream;
/*    */ 
/*    */ public class ahc
/*    */   extends DataFix {
/*    */   public ahc(Schema ☃, boolean bool) {
/* 16 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 21 */     Type<?> ☃ = getInputSchema().getType(akn.c);
/* 22 */     OpticFinder<?> opticFinder = ☃.findField("Level");
/*    */     
/* 24 */     return fixTypeEverywhereTyped("Leaves fix", ☃, typed -> typed.updateTyped(☃, ()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ahc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */