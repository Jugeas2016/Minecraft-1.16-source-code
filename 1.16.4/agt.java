/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ 
/*    */ public class agt
/*    */   extends ajv {
/*    */   public agt(Schema ☃, boolean bool) {
/*  9 */     super(☃, bool, "BlockEntityShulkerBoxColorFix", akn.k, "minecraft:shulker_box");
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 14 */     return ☃.update(DSL.remainderFinder(), ☃ -> ☃.remove("Color"));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\agt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */