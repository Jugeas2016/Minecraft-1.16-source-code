/*    */ import com.google.common.collect.Lists;
/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Either;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.datafixers.util.Unit;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.List;
/*    */ import java.util.Optional;
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
/*    */ public class ais
/*    */   extends DataFix
/*    */ {
/*    */   public ais(Schema ☃, boolean bool) {
/* 29 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 34 */     return a(getOutputSchema().getTypeRaw(akn.w));
/*    */   }
/*    */   
/*    */   private <R> TypeRewriteRule a(Type<R> ☃) {
/* 38 */     Type<Pair<Either<Pair<List<Pair<R, Integer>>, Dynamic<?>>, Unit>, Dynamic<?>>> type = DSL.and(
/* 39 */         DSL.optional((Type)DSL.field("RecipesUsed", DSL.and((Type)DSL.compoundList(☃, DSL.intType()), DSL.remainderType()))), 
/* 40 */         DSL.remainderType());
/*    */ 
/*    */     
/* 43 */     OpticFinder<?> opticFinder1 = DSL.namedChoice("minecraft:furnace", getInputSchema().getChoiceType(akn.k, "minecraft:furnace"));
/* 44 */     OpticFinder<?> opticFinder2 = DSL.namedChoice("minecraft:blast_furnace", getInputSchema().getChoiceType(akn.k, "minecraft:blast_furnace"));
/* 45 */     OpticFinder<?> opticFinder3 = DSL.namedChoice("minecraft:smoker", getInputSchema().getChoiceType(akn.k, "minecraft:smoker"));
/*    */     
/* 47 */     Type<?> type1 = getOutputSchema().getChoiceType(akn.k, "minecraft:furnace");
/* 48 */     Type<?> type2 = getOutputSchema().getChoiceType(akn.k, "minecraft:blast_furnace");
/* 49 */     Type<?> type3 = getOutputSchema().getChoiceType(akn.k, "minecraft:smoker");
/*    */     
/* 51 */     Type<?> type4 = getInputSchema().getType(akn.k);
/* 52 */     Type<?> type5 = getOutputSchema().getType(akn.k);
/* 53 */     return fixTypeEverywhereTyped("FurnaceRecipesFix", type4, type5, typed -> typed.updateTyped(☃, type1, ()).updateTyped(opticFinder1, type4, ()).updateTyped(opticFinder2, type5, ()));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private <R> Typed<?> a(Type<R> ☃, Type<Pair<Either<Pair<List<Pair<R, Integer>>, Dynamic<?>>, Unit>, Dynamic<?>>> type, Typed<?> typed) {
/* 62 */     Dynamic<?> dynamic = (Dynamic)typed.getOrCreate(DSL.remainderFinder());
/*    */     
/* 64 */     int i = dynamic.get("RecipesUsedSize").asInt(0);
/* 65 */     dynamic = dynamic.remove("RecipesUsedSize");
/*    */     
/* 67 */     List<Pair<R, Integer>> list = Lists.newArrayList();
/* 68 */     for (int j = 0; j < i; j++) {
/* 69 */       String str1 = "RecipeLocation" + j;
/* 70 */       String str2 = "RecipeAmount" + j;
/*    */       
/* 72 */       Optional<? extends Dynamic<?>> optional = dynamic.get(str1).result();
/* 73 */       int k = dynamic.get(str2).asInt(0);
/* 74 */       if (k > 0) {
/* 75 */         optional.ifPresent(dynamic -> {
/*    */               Optional<? extends Pair<R, ? extends Dynamic<?>>> optional = ☃.read(dynamic).result();
/*    */               
/*    */               optional.ifPresent(());
/*    */             });
/*    */       }
/* 81 */       dynamic = dynamic.remove(str1).remove(str2);
/*    */     } 
/*    */     
/* 84 */     return typed.set(DSL.remainderFinder(), type, Pair.of(Either.left(Pair.of(list, dynamic.emptyMap())), dynamic));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ais.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */