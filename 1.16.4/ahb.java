/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ 
/*    */ public class ahb
/*    */   extends ajv
/*    */ {
/*    */   public ahb(Schema ☃, boolean bool) {
/* 10 */     super(☃, bool, "CatTypeFix", akn.p, "minecraft:cat");
/*    */   }
/*    */   
/*    */   public Dynamic<?> a(Dynamic<?> ☃) {
/* 14 */     if (☃.get("CatType").asInt(0) == 9) {
/* 15 */       return ☃.set("CatType", ☃.createInt(10));
/*    */     }
/* 17 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 22 */     return ☃.update(DSL.remainderFinder(), this::a);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ahb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */