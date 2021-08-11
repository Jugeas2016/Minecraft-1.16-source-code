/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ 
/*    */ public class aky
/*    */   extends ajv
/*    */ {
/*    */   public aky(Schema ☃, boolean bool) {
/* 10 */     super(☃, bool, "StriderGravityFix", akn.p, "minecraft:strider");
/*    */   }
/*    */   
/*    */   public Dynamic<?> a(Dynamic<?> ☃) {
/* 14 */     if (☃.get("NoGravity").asBoolean(false)) {
/* 15 */       return ☃.set("NoGravity", ☃.createBoolean(false));
/*    */     }
/* 17 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 22 */     return ☃.update(DSL.remainderFinder(), this::a);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aky.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */