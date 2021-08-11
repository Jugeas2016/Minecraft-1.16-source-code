/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aji
/*    */   extends agd
/*    */ {
/*    */   public aji(Schema ☃) {
/* 15 */     super(☃, akn.l);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 20 */     OpticFinder<Pair<String, String>> ☃ = DSL.fieldFinder("id", DSL.named(akn.r.typeName(), aln.a()));
/*    */     
/* 22 */     return fixTypeEverywhereTyped("ItemStackUUIDFix", getInputSchema().getType(this.b), typed -> {
/*    */           OpticFinder<?> opticFinder = typed.getType().findField("tag");
/*    */           return typed.updateTyped(opticFinder, ());
/*    */         });
/*    */   }
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
/*    */   private Dynamic<?> b(Dynamic<?> ☃) {
/* 38 */     return ☃.update("AttributeModifiers", dynamic1 -> ☃.createList(dynamic1.asStream().map(())));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private Dynamic<?> c(Dynamic<?> ☃) {
/* 46 */     return ☃.update("SkullOwner", ☃ -> (Dynamic)a(☃, "Id", "Id").orElse(☃));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aji.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */