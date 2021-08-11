/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.DataFixUtils;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Either;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.datafixers.util.Unit;
/*    */ import com.mojang.serialization.DynamicOps;
/*    */ import java.util.List;
/*    */ import java.util.Objects;
/*    */ import java.util.Optional;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ public class aif
/*    */   extends DataFix {
/*    */   public aif(Schema ☃, boolean bool) {
/* 22 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 27 */     Schema ☃ = getInputSchema();
/* 28 */     Schema schema1 = getOutputSchema();
/*    */     
/* 30 */     Type<?> type1 = ☃.getTypeRaw(akn.o);
/* 31 */     Type<?> type2 = schema1.getTypeRaw(akn.o);
/* 32 */     Type<?> type3 = ☃.getTypeRaw(akn.p);
/*    */     
/* 34 */     return a(☃, schema1, type1, type2, type3);
/*    */   }
/*    */   
/*    */   private <OldEntityTree, NewEntityTree, Entity> TypeRewriteRule a(Schema ☃, Schema schema1, Type<OldEntityTree> type, Type<NewEntityTree> type1, Type<Entity> type2) {
/* 38 */     Type<Pair<String, Pair<Either<OldEntityTree, Unit>, Entity>>> type3 = DSL.named(akn.o.typeName(), DSL.and(
/* 39 */           DSL.optional((Type)DSL.field("Riding", type)), type2));
/*    */ 
/*    */ 
/*    */     
/* 43 */     Type<Pair<String, Pair<Either<List<NewEntityTree>, Unit>, Entity>>> type4 = DSL.named(akn.o.typeName(), DSL.and(
/* 44 */           DSL.optional((Type)DSL.field("Passengers", (Type)DSL.list(type1))), type2));
/*    */ 
/*    */ 
/*    */     
/* 48 */     Type<?> type5 = ☃.getType(akn.o);
/* 49 */     Type<?> type6 = schema1.getType(akn.o);
/*    */     
/* 51 */     if (!Objects.equals(type5, type3)) {
/* 52 */       throw new IllegalStateException("Old entity type is not what was expected.");
/*    */     }
/*    */     
/* 55 */     if (!type6.equals(type4, true, true)) {
/* 56 */       throw new IllegalStateException("New entity type is not what was expected.");
/*    */     }
/*    */     
/* 59 */     OpticFinder<Pair<String, Pair<Either<OldEntityTree, Unit>, Entity>>> opticFinder = DSL.typeFinder(type3);
/* 60 */     OpticFinder<Pair<String, Pair<Either<List<NewEntityTree>, Unit>, Entity>>> opticFinder1 = DSL.typeFinder(type4);
/* 61 */     OpticFinder<NewEntityTree> opticFinder2 = DSL.typeFinder(type1);
/*    */     
/* 63 */     Type<?> type7 = ☃.getType(akn.b);
/* 64 */     Type<?> type8 = schema1.getType(akn.b);
/*    */     
/* 66 */     return TypeRewriteRule.seq(
/* 67 */         fixTypeEverywhere("EntityRidingToPassengerFix", type3, type4, dynamicOps -> ()), 
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
/* 90 */         writeAndRead("player RootVehicle injecter", type7, type8));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aif.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */