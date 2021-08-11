/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aix
/*    */   extends DataFix
/*    */ {
/*    */   public aix(Schema ☃, boolean bool) {
/* 18 */     super(☃, bool);
/*    */   }
/*    */   
/*    */   private Dynamic<?> a(Dynamic<?> ☃) {
/* 22 */     Optional<? extends Dynamic<?>> optional = ☃.get("display").result();
/* 23 */     if (optional.isPresent()) {
/* 24 */       Dynamic<?> dynamic = optional.get();
/* 25 */       Optional<String> optional1 = dynamic.get("Name").asString().result();
/* 26 */       if (optional1.isPresent()) {
/* 27 */         dynamic = dynamic.set("Name", dynamic.createString(nr.a.a(new oe(optional1.get()))));
/*    */       } else {
/* 29 */         Optional<String> optional2 = dynamic.get("LocName").asString().result();
/* 30 */         if (optional2.isPresent()) {
/* 31 */           dynamic = dynamic.set("Name", dynamic.createString(nr.a.a(new of(optional2.get()))));
/* 32 */           dynamic = dynamic.remove("LocName");
/*    */         } 
/*    */       } 
/* 35 */       return ☃.set("display", dynamic);
/*    */     } 
/* 37 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 42 */     Type<?> ☃ = getInputSchema().getType(akn.l);
/* 43 */     OpticFinder<?> opticFinder = ☃.findField("tag");
/*    */     
/* 45 */     return fixTypeEverywhereTyped("ItemCustomNameToComponentFix", ☃, typed -> typed.updateTyped(☃, ()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aix.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */