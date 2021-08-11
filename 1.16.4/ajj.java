/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ajj
/*    */   extends DataFix
/*    */ {
/*    */   public ajj(Schema ☃, boolean bool) {
/* 19 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 24 */     Type<?> ☃ = getInputSchema().getType(akn.l);
/*    */     
/* 26 */     OpticFinder<Pair<String, String>> opticFinder = DSL.fieldFinder("id", DSL.named(akn.r.typeName(), aln.a()));
/* 27 */     OpticFinder<?> opticFinder1 = ☃.findField("tag");
/*    */     
/* 29 */     return fixTypeEverywhereTyped("ItemWaterPotionFix", ☃, typed -> {
/*    */           Optional<Pair<String, String>> optional = typed.getOptional(☃);
/*    */           if (optional.isPresent()) {
/*    */             String str = (String)((Pair)optional.get()).getSecond();
/*    */             if ("minecraft:potion".equals(str) || "minecraft:splash_potion".equals(str) || "minecraft:lingering_potion".equals(str) || "minecraft:tipped_arrow".equals(str)) {
/*    */               Typed<?> typed1 = typed.getOrCreateTyped(opticFinder1);
/*    */               Dynamic<?> dynamic = (Dynamic)typed1.get(DSL.remainderFinder());
/*    */               if (!dynamic.get("Potion").asString().result().isPresent())
/*    */                 dynamic = dynamic.set("Potion", dynamic.createString("minecraft:water")); 
/*    */               return typed.set(opticFinder1, typed1.set(DSL.remainderFinder(), dynamic));
/*    */             } 
/*    */           } 
/*    */           return typed;
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ajj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */