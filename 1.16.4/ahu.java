/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ public class ahu
/*    */   extends aie
/*    */ {
/*    */   public ahu(Schema ☃, boolean bool) {
/* 14 */     super("EntityHorseSplitFix", ☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Pair<String, Typed<?>> a(String ☃, Typed<?> typed) {
/* 19 */     Dynamic<?> dynamic = (Dynamic)typed.get(DSL.remainderFinder());
/* 20 */     if (Objects.equals("EntityHorse", ☃)) {
/*    */       
/* 22 */       int i = dynamic.get("Type").asInt(0);
/* 23 */       switch (i)
/*    */       
/*    */       { default:
/* 26 */           str = "Horse";
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 41 */           dynamic.remove("Type");
/*    */           
/* 43 */           type = (Type)getOutputSchema().findChoiceType(akn.p).types().get(str);
/* 44 */           return Pair.of(str, ((Pair)typed.write().flatMap(type::readTyped).result().orElseThrow(() -> new IllegalStateException("Could not parse the new horse"))).getFirst());case 1: str = "Donkey"; dynamic.remove("Type"); type = (Type)getOutputSchema().findChoiceType(akn.p).types().get(str); return Pair.of(str, ((Pair)typed.write().flatMap(type::readTyped).result().orElseThrow(() -> new IllegalStateException("Could not parse the new horse"))).getFirst());case 2: str = "Mule"; dynamic.remove("Type"); type = (Type)getOutputSchema().findChoiceType(akn.p).types().get(str); return Pair.of(str, ((Pair)typed.write().flatMap(type::readTyped).result().orElseThrow(() -> new IllegalStateException("Could not parse the new horse"))).getFirst());case 3: str = "ZombieHorse"; dynamic.remove("Type"); type = (Type)getOutputSchema().findChoiceType(akn.p).types().get(str); return Pair.of(str, ((Pair)typed.write().flatMap(type::readTyped).result().orElseThrow(() -> new IllegalStateException("Could not parse the new horse"))).getFirst());case 4: break; }  String str = "SkeletonHorse"; dynamic.remove("Type"); Type<?> type = (Type)getOutputSchema().findChoiceType(akn.p).types().get(str); return Pair.of(str, ((Pair)typed.write().flatMap(type::readTyped).result().orElseThrow(() -> new IllegalStateException("Could not parse the new horse"))).getFirst());
/*    */     } 
/* 46 */     return Pair.of(☃, typed);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ahu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */