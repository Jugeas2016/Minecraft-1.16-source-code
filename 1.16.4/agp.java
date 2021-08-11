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
/*    */ public class agp
/*    */   extends DataFix
/*    */ {
/*    */   public agp(Schema ☃, boolean bool) {
/* 16 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 21 */     OpticFinder<String> ☃ = DSL.fieldFinder("id", aln.a());
/* 22 */     return fixTypeEverywhereTyped("BlockEntityCustomNameToComponentFix", getInputSchema().getType(akn.k), typed -> typed.update(DSL.remainderFinder(), ()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\agp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */