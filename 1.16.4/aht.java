/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Optional;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aht
/*    */   extends ajv
/*    */ {
/*    */   public aht(Schema ☃, boolean bool) {
/* 17 */     super(☃, bool, "EntityHorseSaddleFix", akn.p, "EntityHorse");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 24 */     OpticFinder<Pair<String, String>> opticFinder = DSL.fieldFinder("id", DSL.named(akn.r.typeName(), aln.a()));
/* 25 */     Type<?> type = getInputSchema().getTypeRaw(akn.l);
/* 26 */     OpticFinder<?> opticFinder1 = DSL.fieldFinder("SaddleItem", type);
/*    */     
/* 28 */     Optional<? extends Typed<?>> optional = ☃.getOptionalTyped(opticFinder1);
/* 29 */     Dynamic<?> dynamic = (Dynamic)☃.get(DSL.remainderFinder());
/* 30 */     if (!optional.isPresent() && dynamic.get("Saddle").asBoolean(false)) {
/* 31 */       Typed<?> typed = (Typed)type.pointTyped(☃.getOps()).orElseThrow(IllegalStateException::new);
/* 32 */       typed = typed.set(opticFinder, Pair.of(akn.r.typeName(), "minecraft:saddle"));
/*    */       
/* 34 */       Dynamic<?> dynamic1 = dynamic.emptyMap();
/* 35 */       dynamic1 = dynamic1.set("Count", dynamic1.createByte((byte)1));
/* 36 */       dynamic1 = dynamic1.set("Damage", dynamic1.createShort((short)0));
/*    */       
/* 38 */       typed = typed.set(DSL.remainderFinder(), dynamic1);
/* 39 */       dynamic.remove("Saddle");
/*    */       
/* 41 */       return ☃.set(opticFinder1, typed).set(DSL.remainderFinder(), dynamic);
/*    */     } 
/* 43 */     return ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aht.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */