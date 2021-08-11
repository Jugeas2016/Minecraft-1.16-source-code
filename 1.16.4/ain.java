/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ 
/*    */ public class ain
/*    */   extends ajv
/*    */ {
/*    */   public ain(Schema ☃, boolean bool) {
/* 10 */     super(☃, bool, "EntityWolfColorFix", akn.p, "minecraft:wolf");
/*    */   }
/*    */   
/*    */   public Dynamic<?> a(Dynamic<?> ☃) {
/* 14 */     return ☃.update("CollarColor", ☃ -> ☃.createByte((byte)(15 - ☃.asInt(0))));
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 19 */     return ☃.update(DSL.remainderFinder(), this::a);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ain.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */