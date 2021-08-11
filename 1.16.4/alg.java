/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.types.templates.List;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Objects;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class alg
/*    */   extends ajv
/*    */ {
/*    */   public alg(Schema ☃, boolean bool) {
/* 18 */     super(☃, bool, "Villager trade fix", akn.p, "minecraft:villager");
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 23 */     OpticFinder<?> opticFinder1 = ☃.getType().findField("Offers");
/* 24 */     OpticFinder<?> opticFinder2 = opticFinder1.type().findField("Recipes");
/* 25 */     Type<?> type1 = opticFinder2.type();
/* 26 */     if (!(type1 instanceof List.ListType)) {
/* 27 */       throw new IllegalStateException("Recipes are expected to be a list.");
/*    */     }
/* 29 */     List.ListType<?> listType = (List.ListType)type1;
/* 30 */     Type<?> type2 = listType.getElement();
/* 31 */     OpticFinder<?> opticFinder3 = DSL.typeFinder(type2);
/* 32 */     OpticFinder<?> opticFinder4 = type2.findField("buy");
/* 33 */     OpticFinder<?> opticFinder5 = type2.findField("buyB");
/* 34 */     OpticFinder<?> opticFinder6 = type2.findField("sell");
/*    */     
/* 36 */     OpticFinder<Pair<String, String>> opticFinder = DSL.fieldFinder("id", DSL.named(akn.r.typeName(), aln.a()));
/* 37 */     Function<Typed<?>, Typed<?>> function = typed -> a(☃, typed);
/*    */     
/* 39 */     return ☃.updateTyped(opticFinder1, typed -> typed.updateTyped(☃, ()));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private Typed<?> a(OpticFinder<Pair<String, String>> ☃, Typed<?> typed) {
/* 48 */     return typed.update(☃, ☃ -> ☃.mapSecond(()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\alg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */