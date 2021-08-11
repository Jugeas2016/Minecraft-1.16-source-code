/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ 
/*    */ public class ajq
/*    */   extends agd
/*    */ {
/*    */   public ajq(Schema ☃) {
/* 12 */     super(☃, akn.a);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 17 */     return fixTypeEverywhereTyped("LevelUUIDFix", getInputSchema().getType(this.b), ☃ -> ☃.updateTyped(DSL.remainderFinder(), ()));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private Dynamic<?> b(Dynamic<?> ☃) {
/* 28 */     return a(☃, "WanderingTraderId", "WanderingTraderId").orElse(☃);
/*    */   }
/*    */   
/*    */   private Dynamic<?> c(Dynamic<?> ☃) {
/* 32 */     return ☃.update("DimensionData", ☃ -> ☃.updateMapValues(()));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private Dynamic<?> d(Dynamic<?> ☃) {
/* 42 */     return ☃.update("CustomBossEvents", ☃ -> ☃.updateMapValues(()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ajq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */