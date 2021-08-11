/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ public class aih
/*    */   extends ajv
/*    */ {
/*    */   public aih(Schema ☃) {
/* 12 */     super(☃, false, "EntityShulkerRotationFix", akn.p, "minecraft:shulker");
/*    */   }
/*    */   
/*    */   public Dynamic<?> a(Dynamic<?> ☃) {
/* 16 */     List<Double> list = ☃.get("Rotation").asList(☃ -> Double.valueOf(☃.asDouble(180.0D)));
/* 17 */     if (!list.isEmpty()) {
/* 18 */       list.set(0, Double.valueOf(((Double)list.get(0)).doubleValue() - 180.0D));
/* 19 */       return ☃.set("Rotation", ☃.createList(list.stream().map(☃::createDouble)));
/*    */     } 
/* 21 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 26 */     return ☃.update(DSL.remainderFinder(), this::a);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aih.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */