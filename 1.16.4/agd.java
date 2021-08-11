/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Arrays;
/*    */ import java.util.Optional;
/*    */ import java.util.UUID;
/*    */ import java.util.function.Function;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class agd
/*    */   extends DataFix
/*    */ {
/* 20 */   protected static final Logger a = LogManager.getLogger();
/*    */   protected DSL.TypeReference b;
/*    */   
/*    */   public agd(Schema ☃, DSL.TypeReference typeReference) {
/* 24 */     super(☃, false);
/* 25 */     this.b = typeReference;
/*    */   }
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃, String str, Function<Dynamic<?>, Dynamic<?>> function) {
/* 29 */     Type<?> type1 = getInputSchema().getChoiceType(this.b, str);
/* 30 */     Type<?> type2 = getOutputSchema().getChoiceType(this.b, str);
/* 31 */     return ☃.updateTyped(DSL.namedChoice(str, type1), type2, typed -> typed.update(DSL.remainderFinder(), ☃));
/*    */   }
/*    */   
/*    */   protected static Optional<Dynamic<?>> a(Dynamic<?> ☃, String str1, String str2) {
/* 35 */     return a(☃, str1).map(dynamic1 -> ☃.remove(str1).set(str2, dynamic1));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected static Optional<Dynamic<?>> b(Dynamic<?> ☃, String str1, String str2) {
/* 41 */     return ☃.get(str1).result().flatMap(agd::a).map(dynamic1 -> ☃.remove(str1).set(str2, dynamic1));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected static Optional<Dynamic<?>> c(Dynamic<?> ☃, String str1, String str2) {
/* 47 */     String str3 = str1 + "Most";
/* 48 */     String str4 = str1 + "Least";
/* 49 */     return d(☃, str3, str4).map(dynamic1 -> ☃.remove(str1).remove(str2).set(str3, dynamic1));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected static Optional<Dynamic<?>> a(Dynamic<?> ☃, String str) {
/* 55 */     return ☃.get(str).result().flatMap(dynamic -> {
/*    */           String str = dynamic.asString(null);
/*    */           if (str != null) {
/*    */             try {
/*    */               UUID uUID = UUID.fromString(str);
/*    */               return a(☃, uUID.getMostSignificantBits(), uUID.getLeastSignificantBits());
/* 61 */             } catch (IllegalArgumentException illegalArgumentException) {}
/*    */           }
/*    */           return Optional.empty();
/*    */         });
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected static Optional<Dynamic<?>> a(Dynamic<?> ☃) {
/* 70 */     return d(☃, "M", "L");
/*    */   }
/*    */   
/*    */   protected static Optional<Dynamic<?>> d(Dynamic<?> ☃, String str1, String str2) {
/* 74 */     long l1 = ☃.get(str1).asLong(0L);
/* 75 */     long l2 = ☃.get(str2).asLong(0L);
/* 76 */     if (l1 == 0L || l2 == 0L) {
/* 77 */       return Optional.empty();
/*    */     }
/* 79 */     return a(☃, l1, l2);
/*    */   }
/*    */   
/*    */   protected static Optional<Dynamic<?>> a(Dynamic<?> ☃, long l1, long l2) {
/* 83 */     return Optional.of(☃.createIntList(Arrays.stream(new int[] { (int)(l1 >> 32L), (int)l1, (int)(l2 >> 32L), (int)l2 })));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\agd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */