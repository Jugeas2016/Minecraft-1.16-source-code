/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ 
/*    */ public class ahj
/*    */   extends ajv {
/*    */   public ahj(Schema ☃, boolean bool) {
/*  9 */     super(☃, bool, "Colorless shulker entity fix", akn.p, "minecraft:shulker");
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 14 */     return ☃.update(DSL.remainderFinder(), ☃ -> (☃.get("Color").asInt(0) == 10) ? ☃.set("Color", ☃.createByte((byte)16)) : ☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ahj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */