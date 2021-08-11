/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import com.mojang.serialization.OptionalDynamic;
/*    */ import java.util.List;
/*    */ 
/*    */ public class aid
/*    */   extends DataFix {
/* 13 */   private static final Codec<List<Float>> a = Codec.FLOAT.listOf();
/*    */   
/*    */   public aid(Schema ☃, boolean bool) {
/* 16 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 22 */     return fixTypeEverywhereTyped("EntityRedundantChanceTagsFix", getInputSchema().getType(akn.p), ☃ -> ☃.update(DSL.remainderFinder(), ()));
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
/*    */   private static boolean a(OptionalDynamic<?> ☃, int i) {
/* 35 */     return ((Boolean)☃.flatMap(a::parse).map(list -> Boolean.valueOf((list.size() == ☃ && list.stream().allMatch(())))).result().orElse(Boolean.valueOf(false))).booleanValue();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aid.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */