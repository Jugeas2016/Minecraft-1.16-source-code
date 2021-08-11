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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aka
/*    */   extends DataFix
/*    */ {
/*    */   public aka(Schema ☃, boolean bool) {
/* 23 */     super(☃, bool);
/*    */   }
/*    */   
/*    */   private Dynamic<?> a(Dynamic<?> ☃) {
/* 27 */     Optional<? extends Dynamic<?>> optional = ☃.get("display").result();
/* 28 */     if (optional.isPresent()) {
/* 29 */       Dynamic<?> dynamic = optional.get();
/* 30 */       Optional<String> optional1 = dynamic.get("Name").asString().result();
/* 31 */       if (optional1.isPresent()) {
/* 32 */         String str = optional1.get();
/* 33 */         str = str.replace("\"translate\":\"block.minecraft.illager_banner\"", "\"translate\":\"block.minecraft.ominous_banner\"");
/* 34 */         dynamic = dynamic.set("Name", dynamic.createString(str));
/*    */       } 
/* 36 */       return ☃.set("display", dynamic);
/*    */     } 
/* 38 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 43 */     Type<?> ☃ = getInputSchema().getType(akn.l);
/* 44 */     OpticFinder<Pair<String, String>> opticFinder = DSL.fieldFinder("id", DSL.named(akn.r.typeName(), aln.a()));
/* 45 */     OpticFinder<?> opticFinder1 = ☃.findField("tag");
/*    */     
/* 47 */     return fixTypeEverywhereTyped("OminousBannerRenameFix", ☃, typed -> {
/*    */           Optional<Pair<String, String>> optional = typed.getOptional(☃);
/*    */           if (optional.isPresent() && Objects.equals(((Pair)optional.get()).getSecond(), "minecraft:white_banner")) {
/*    */             Optional<? extends Typed<?>> optional1 = typed.getOptionalTyped(opticFinder1);
/*    */             if (optional1.isPresent()) {
/*    */               Typed<?> typed1 = optional1.get();
/*    */               Dynamic<?> dynamic = (Dynamic)typed1.get(DSL.remainderFinder());
/*    */               return typed.set(opticFinder1, typed1.set(DSL.remainderFinder(), a(dynamic)));
/*    */             } 
/*    */           } 
/*    */           return typed;
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aka.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */