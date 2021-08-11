/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ 
/*    */ 
/*    */ public class ako
/*    */   extends ajv
/*    */ {
/*    */   public ako(Schema ☃, boolean bool) {
/* 11 */     super(☃, bool, "Remove Golem Gossip Fix", akn.p, "minecraft:villager");
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 16 */     return ☃.update(DSL.remainderFinder(), ako::a);
/*    */   }
/*    */   
/*    */   private static Dynamic<?> a(Dynamic<?> ☃) {
/* 20 */     return ☃.update("Gossips", dynamic1 -> ☃.createList(dynamic1.asStream().filter(())));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ako.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */