/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ale
/*    */   extends ajv
/*    */ {
/*    */   public ale(Schema ☃) {
/* 17 */     super(☃, false, "Villager Follow Range Fix", akn.p, "minecraft:villager");
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 22 */     return ☃.update(DSL.remainderFinder(), ale::a);
/*    */   }
/*    */   
/*    */   private static Dynamic<?> a(Dynamic<?> ☃) {
/* 26 */     return ☃.update("Attributes", dynamic1 -> ☃.createList(dynamic1.asStream().map(())));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ale.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */