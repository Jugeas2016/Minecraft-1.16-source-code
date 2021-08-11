/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
/*    */ 
/*    */ public class ajr
/*    */   extends DataFix {
/*    */   public ajr(Schema ☃, boolean bool) {
/* 16 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 21 */     Type<?> ☃ = getInputSchema().getType(akn.h);
/* 22 */     OpticFinder<?> opticFinder = ☃.findField("data");
/* 23 */     return fixTypeEverywhereTyped("Map id fix", ☃, typed -> {
/*    */           Optional<? extends Typed<?>> optional = typed.getOptionalTyped(☃);
/*    */           return optional.isPresent() ? typed : typed.update(DSL.remainderFinder(), ());
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ajr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */