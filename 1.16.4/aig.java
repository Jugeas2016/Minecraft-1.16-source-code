/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ 
/*    */ public class aig
/*    */   extends ajv
/*    */ {
/*    */   public aig(Schema ☃, boolean bool) {
/* 10 */     super(☃, bool, "EntityShulkerColorFix", akn.p, "minecraft:shulker");
/*    */   }
/*    */   
/*    */   public Dynamic<?> a(Dynamic<?> ☃) {
/* 14 */     if (!☃.get("Color").map(Dynamic::asNumber).result().isPresent()) {
/* 15 */       return ☃.set("Color", ☃.createByte((byte)10));
/*    */     }
/* 17 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 22 */     return ☃.update(DSL.remainderFinder(), this::a);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */