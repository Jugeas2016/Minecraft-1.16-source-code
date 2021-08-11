/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Objects;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ahp
/*    */   extends DataFix
/*    */ {
/*    */   public ahp(Schema ☃, boolean bool) {
/* 19 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 24 */     OpticFinder<String> ☃ = DSL.fieldFinder("id", aln.a());
/* 25 */     return fixTypeEverywhereTyped("EntityCustomNameToComponentFix", getInputSchema().getType(akn.p), typed -> typed.update(DSL.remainderFinder(), ()));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static Dynamic<?> a(Dynamic<?> ☃) {
/* 35 */     String str = ☃.get("CustomName").asString("");
/* 36 */     if (str.isEmpty()) {
/* 37 */       return ☃.remove("CustomName");
/*    */     }
/* 39 */     return ☃.set("CustomName", ☃.createString(nr.a.a(new oe(str))));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ahp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */