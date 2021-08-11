/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Map;
/*    */ import java.util.Objects;
/*    */ import java.util.Optional;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aiw
/*    */   extends DataFix
/*    */ {
/*    */   public aiw(Schema ☃, boolean bool) {
/* 22 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 27 */     Type<?> ☃ = getInputSchema().getType(akn.l);
/*    */     
/* 29 */     OpticFinder<Pair<String, String>> opticFinder = DSL.fieldFinder("id", DSL.named(akn.r.typeName(), aln.a()));
/* 30 */     OpticFinder<?> opticFinder1 = ☃.findField("tag");
/* 31 */     OpticFinder<?> opticFinder2 = opticFinder1.type().findField("BlockEntityTag");
/*    */     
/* 33 */     return fixTypeEverywhereTyped("ItemBannerColorFix", ☃, typed -> {
/*    */           Optional<Pair<String, String>> optional = typed.getOptional(☃);
/*    */           if (optional.isPresent() && Objects.equals(((Pair)optional.get()).getSecond(), "minecraft:banner")) {
/*    */             Dynamic<?> dynamic = (Dynamic)typed.get(DSL.remainderFinder());
/*    */             Optional<? extends Typed<?>> optional1 = typed.getOptionalTyped(opticFinder1);
/*    */             if (optional1.isPresent()) {
/*    */               Typed<?> typed1 = optional1.get();
/*    */               Optional<? extends Typed<?>> optional2 = typed1.getOptionalTyped(opticFinder2);
/*    */               if (optional2.isPresent()) {
/*    */                 Typed<?> typed2 = optional2.get();
/*    */                 Dynamic<?> dynamic1 = (Dynamic)typed1.get(DSL.remainderFinder());
/*    */                 Dynamic<?> dynamic2 = (Dynamic)typed2.getOrCreate(DSL.remainderFinder());
/*    */                 if (dynamic2.get("Base").asNumber().result().isPresent()) {
/*    */                   dynamic = dynamic.set("Damage", dynamic.createShort((short)(dynamic2.get("Base").asInt(0) & 0xF)));
/*    */                   Optional<? extends Dynamic<?>> optional3 = dynamic1.get("display").result();
/*    */                   if (optional3.isPresent()) {
/*    */                     Dynamic<?> dynamic3 = optional3.get();
/*    */                     Dynamic<?> dynamic4 = dynamic3.createMap((Map)ImmutableMap.of(dynamic3.createString("Lore"), dynamic3.createList(Stream.of(dynamic3.createString("(+NBT")))));
/*    */                     if (Objects.equals(dynamic3, dynamic4))
/*    */                       return typed.set(DSL.remainderFinder(), dynamic); 
/*    */                   } 
/*    */                   dynamic2.remove("Base");
/*    */                   return typed.set(DSL.remainderFinder(), dynamic).set(opticFinder1, typed1.set(opticFinder2, typed2.set(DSL.remainderFinder(), dynamic2)));
/*    */                 } 
/*    */               } 
/*    */             } 
/*    */             return typed.set(DSL.remainderFinder(), dynamic);
/*    */           } 
/*    */           return typed;
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aiw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */