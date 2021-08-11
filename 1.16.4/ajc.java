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
/*    */ public class ajc
/*    */   extends DataFix
/*    */ {
/*    */   public ajc(Schema ☃, boolean bool) {
/* 20 */     super(☃, bool);
/*    */   }
/*    */   
/* 23 */   public static final String[] a = new String[] { "minecraft:white_shulker_box", "minecraft:orange_shulker_box", "minecraft:magenta_shulker_box", "minecraft:light_blue_shulker_box", "minecraft:yellow_shulker_box", "minecraft:lime_shulker_box", "minecraft:pink_shulker_box", "minecraft:gray_shulker_box", "minecraft:silver_shulker_box", "minecraft:cyan_shulker_box", "minecraft:purple_shulker_box", "minecraft:blue_shulker_box", "minecraft:brown_shulker_box", "minecraft:green_shulker_box", "minecraft:red_shulker_box", "minecraft:black_shulker_box" };
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
/*    */   public TypeRewriteRule makeRule() {
/* 44 */     Type<?> ☃ = getInputSchema().getType(akn.l);
/*    */     
/* 46 */     OpticFinder<Pair<String, String>> opticFinder = DSL.fieldFinder("id", DSL.named(akn.r.typeName(), aln.a()));
/* 47 */     OpticFinder<?> opticFinder1 = ☃.findField("tag");
/* 48 */     OpticFinder<?> opticFinder2 = opticFinder1.type().findField("BlockEntityTag");
/*    */     
/* 50 */     return fixTypeEverywhereTyped("ItemShulkerBoxColorFix", ☃, typed -> {
/*    */           Optional<Pair<String, String>> optional = typed.getOptional(☃);
/*    */           if (optional.isPresent() && Objects.equals(((Pair)optional.get()).getSecond(), "minecraft:shulker_box")) {
/*    */             Optional<? extends Typed<?>> optional1 = typed.getOptionalTyped(opticFinder1);
/*    */             if (optional1.isPresent()) {
/*    */               Typed<?> typed1 = optional1.get();
/*    */               Optional<? extends Typed<?>> optional2 = typed1.getOptionalTyped(opticFinder2);
/*    */               if (optional2.isPresent()) {
/*    */                 Typed<?> typed2 = optional2.get();
/*    */                 Dynamic<?> dynamic = (Dynamic)typed2.get(DSL.remainderFinder());
/*    */                 int i = dynamic.get("Color").asInt(0);
/*    */                 dynamic.remove("Color");
/*    */                 return typed.set(opticFinder1, typed1.set(opticFinder2, typed2.set(DSL.remainderFinder(), dynamic))).set(☃, Pair.of(akn.r.typeName(), a[i % 16]));
/*    */               } 
/*    */             } 
/*    */           } 
/*    */           return typed;
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ajc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */