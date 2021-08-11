/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.DataFixUtils;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.DataResult;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Optional;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ public class aju
/*    */   extends DataFix
/*    */ {
/*    */   public aju(Schema ☃, boolean bool) {
/* 19 */     super(☃, bool);
/*    */   }
/*    */   
/*    */   private Dynamic<?> a(Dynamic<?> ☃) {
/* 23 */     if (!"MobSpawner".equals(☃.get("id").asString(""))) {
/* 24 */       return ☃;
/*    */     }
/*    */     
/* 27 */     Optional<String> optional = ☃.get("EntityId").asString().result();
/* 28 */     if (optional.isPresent()) {
/* 29 */       Dynamic<?> dynamic = (Dynamic)DataFixUtils.orElse(☃.get("SpawnData").result(), ☃.emptyMap());
/* 30 */       dynamic = dynamic.set("id", dynamic.createString(((String)optional.get()).isEmpty() ? "Pig" : optional.get()));
/* 31 */       ☃ = ☃.set("SpawnData", dynamic);
/*    */       
/* 33 */       ☃ = ☃.remove("EntityId");
/*    */     } 
/*    */     
/* 36 */     Optional<? extends Stream<? extends Dynamic<?>>> optional1 = ☃.get("SpawnPotentials").asStreamOpt().result();
/* 37 */     if (optional1.isPresent()) {
/* 38 */       ☃ = ☃.set("SpawnPotentials", ☃.createList(((Stream)optional1.get()).map(☃ -> {
/*    */                 Optional<String> optional = ☃.get("Type").asString().result();
/*    */                 
/*    */                 if (optional.isPresent()) {
/*    */                   Dynamic<?> dynamic = ((Dynamic)DataFixUtils.orElse(☃.get("Properties").result(), ☃.emptyMap())).set("id", ☃.createString(optional.get()));
/*    */                   
/*    */                   return ☃.set("Entity", dynamic).remove("Type").remove("Properties");
/*    */                 } 
/*    */                 
/*    */                 return ☃;
/*    */               })));
/*    */     }
/*    */     
/* 51 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 56 */     Type<?> ☃ = getOutputSchema().getType(akn.s);
/* 57 */     return fixTypeEverywhereTyped("MobSpawnerEntityIdentifiersFix", getInputSchema().getType(akn.s), ☃, typed -> {
/*    */           Dynamic<?> dynamic = (Dynamic)typed.get(DSL.remainderFinder());
/*    */           dynamic = dynamic.set("id", dynamic.createString("MobSpawner"));
/*    */           DataResult<? extends Pair<? extends Typed<?>, ?>> dataResult = ☃.readTyped(a(dynamic));
/*    */           return !dataResult.result().isPresent() ? typed : (Typed)((Pair)dataResult.result().get()).getFirst();
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aju.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */