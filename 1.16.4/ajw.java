/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.DataFixUtils;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.types.templates.CompoundList;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.List;
/*    */ import java.util.Objects;
/*    */ import java.util.Optional;
/*    */ import java.util.stream.Collectors;
/*    */ 
/*    */ 
/*    */ public class ajw
/*    */   extends DataFix
/*    */ {
/*    */   public ajw(Schema ☃, boolean bool) {
/* 22 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 27 */     CompoundList.CompoundListType<String, ?> ☃ = DSL.compoundList(DSL.string(), getInputSchema().getType(akn.t));
/* 28 */     OpticFinder<? extends List<? extends Pair<String, ?>>> opticFinder = ☃.finder();
/*    */     
/* 30 */     return a(☃);
/*    */   }
/*    */   
/*    */   private <SF> TypeRewriteRule a(CompoundList.CompoundListType<String, SF> ☃) {
/* 34 */     Type<?> type1 = getInputSchema().getType(akn.c);
/* 35 */     Type<?> type2 = getInputSchema().getType(akn.t);
/* 36 */     OpticFinder<?> opticFinder1 = type1.findField("Level");
/* 37 */     OpticFinder<?> opticFinder2 = opticFinder1.type().findField("Structures");
/* 38 */     OpticFinder<?> opticFinder3 = opticFinder2.type().findField("Starts");
/* 39 */     OpticFinder<List<Pair<String, SF>>> opticFinder = ☃.finder();
/* 40 */     return TypeRewriteRule.seq(
/* 41 */         fixTypeEverywhereTyped("NewVillageFix", type1, typed -> typed.updateTyped(☃, ())), 
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
/* 57 */         fixTypeEverywhereTyped("NewVillageStartFix", type2, ☃ -> ☃.update(DSL.remainderFinder(), ())));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ajw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */