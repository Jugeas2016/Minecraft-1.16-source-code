/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Objects;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ajf
/*    */   extends DataFix
/*    */ {
/*    */   public ajf(Schema ☃, boolean bool) {
/* 20 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 25 */     Type<?> ☃ = getInputSchema().getType(akn.l);
/*    */     
/* 27 */     OpticFinder<Pair<String, String>> opticFinder = DSL.fieldFinder("id", DSL.named(akn.r.typeName(), aln.a()));
/* 28 */     OpticFinder<?> opticFinder1 = ☃.findField("tag");
/*    */     
/* 30 */     return fixTypeEverywhereTyped("ItemInstanceMapIdFix", ☃, typed -> {
/*    */           Optional<Pair<String, String>> optional = typed.getOptional(☃);
/*    */           if (optional.isPresent() && Objects.equals(((Pair)optional.get()).getSecond(), "minecraft:filled_map")) {
/*    */             Dynamic<?> dynamic1 = (Dynamic)typed.get(DSL.remainderFinder());
/*    */             Typed<?> typed1 = typed.getOrCreateTyped(opticFinder1);
/*    */             Dynamic<?> dynamic2 = (Dynamic)typed1.get(DSL.remainderFinder());
/*    */             dynamic2 = dynamic2.set("map", dynamic2.createInt(dynamic1.get("Damage").asInt(0)));
/*    */             return typed.set(opticFinder1, typed1.set(DSL.remainderFinder(), dynamic2));
/*    */           } 
/*    */           return typed;
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ajf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */