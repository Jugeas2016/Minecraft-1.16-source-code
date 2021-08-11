/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ 
/*    */ public class agr
/*    */   extends ajv {
/*    */   public agr(Schema ☃, boolean bool) {
/* 12 */     super(☃, bool, "BlockEntityJukeboxFix", akn.k, "minecraft:jukebox");
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 17 */     Type<?> type1 = getInputSchema().getChoiceType(akn.k, "minecraft:jukebox");
/* 18 */     Type<?> type2 = type1.findFieldType("RecordItem");
/* 19 */     OpticFinder<?> opticFinder = DSL.fieldFinder("RecordItem", type2);
/* 20 */     Dynamic<?> dynamic = (Dynamic)☃.get(DSL.remainderFinder());
/* 21 */     int i = dynamic.get("Record").asInt(0);
/* 22 */     if (i > 0) {
/* 23 */       dynamic.remove("Record");
/*    */       
/* 25 */       String str = ajh.a(aiy.a(i), 0);
/* 26 */       if (str != null) {
/* 27 */         Dynamic<?> dynamic1 = dynamic.emptyMap();
/* 28 */         dynamic1 = dynamic1.set("id", dynamic1.createString(str));
/* 29 */         dynamic1 = dynamic1.set("Count", dynamic1.createByte((byte)1));
/* 30 */         return ☃.set(opticFinder, (Typed)((Pair)type2.readTyped(dynamic1).result().orElseThrow(() -> new IllegalStateException("Could not create record item stack."))).getFirst()).set(DSL.remainderFinder(), dynamic);
/*    */       } 
/*    */     } 
/* 33 */     return ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\agr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */