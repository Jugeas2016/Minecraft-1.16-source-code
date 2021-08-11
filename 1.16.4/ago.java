/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ 
/*    */ public class ago
/*    */   extends ajv {
/*    */   public ago(Schema ☃, boolean bool) {
/* 12 */     super(☃, bool, "BlockEntityBlockStateFix", akn.k, "minecraft:piston");
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 17 */     Type<?> type1 = getOutputSchema().getChoiceType(akn.k, "minecraft:piston");
/*    */     
/* 19 */     Type<?> type2 = type1.findFieldType("blockState");
/* 20 */     OpticFinder<?> opticFinder = DSL.fieldFinder("blockState", type2);
/* 21 */     Dynamic<?> dynamic1 = (Dynamic)☃.get(DSL.remainderFinder());
/*    */     
/* 23 */     int i = dynamic1.get("blockId").asInt(0);
/* 24 */     dynamic1 = dynamic1.remove("blockId");
/* 25 */     int j = dynamic1.get("blockData").asInt(0) & 0xF;
/* 26 */     dynamic1 = dynamic1.remove("blockData");
/*    */     
/* 28 */     Dynamic<?> dynamic2 = agz.b(i << 4 | j);
/* 29 */     Typed<?> typed = (Typed)type1.pointTyped(☃.getOps()).orElseThrow(() -> new IllegalStateException("Could not create new piston block entity."));
/* 30 */     return typed.set(DSL.remainderFinder(), dynamic1).set(opticFinder, (Typed)((Pair)type2.readTyped(dynamic2).result().orElseThrow(() -> new IllegalStateException("Could not parse newly created block state tag."))).getFirst());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ago.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */