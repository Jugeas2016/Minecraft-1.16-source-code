/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Objects;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class agj
/*    */   extends DataFix
/*    */ {
/*    */   public agj(Schema ☃, boolean bool) {
/* 18 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 23 */     OpticFinder<Pair<String, String>> ☃ = DSL.fieldFinder("id", DSL.named(akn.r.typeName(), aln.a()));
/*    */     
/* 25 */     return fixTypeEverywhereTyped("BedItemColorFix", getInputSchema().getType(akn.l), typed -> {
/*    */           Optional<Pair<String, String>> optional = typed.getOptional(☃);
/*    */           if (optional.isPresent() && Objects.equals(((Pair)optional.get()).getSecond(), "minecraft:bed")) {
/*    */             Dynamic<?> dynamic = (Dynamic)typed.get(DSL.remainderFinder());
/*    */             if (dynamic.get("Damage").asInt(0) == 0)
/*    */               return typed.set(DSL.remainderFinder(), dynamic.set("Damage", dynamic.createShort((short)14))); 
/*    */           } 
/*    */           return typed;
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\agj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */