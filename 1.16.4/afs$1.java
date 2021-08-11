/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.DataResult;
/*    */ import com.mojang.serialization.DynamicOps;
/*    */ import java.util.Optional;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.IntFunction;
/*    */ import java.util.function.ToIntFunction;
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
/*    */ 
/*    */ final class null
/*    */   implements Codec<E>
/*    */ {
/*    */   null(ToIntFunction paramToIntFunction, IntFunction paramIntFunction, Function paramFunction) {}
/*    */   
/*    */   public <T> DataResult<T> a(E ☃, DynamicOps<T> dynamicOps, T t) {
/* 30 */     if (dynamicOps.compressMaps()) {
/* 31 */       return dynamicOps.mergeToPrimitive(t, dynamicOps.createInt(this.a.applyAsInt(☃)));
/*    */     }
/* 33 */     return dynamicOps.mergeToPrimitive(t, dynamicOps.createString(☃.a()));
/*    */   }
/*    */ 
/*    */   
/*    */   public <T> DataResult<Pair<E, T>> decode(DynamicOps<T> ☃, T t) {
/* 38 */     if (☃.compressMaps()) {
/* 39 */       return ☃.getNumberValue(t).flatMap(number -> (DataResult)Optional.ofNullable(☃.apply(number.intValue())).map(DataResult::success).orElseGet(()))
/*    */ 
/*    */         
/* 42 */         .map(afs1 -> Pair.of(afs1, ☃.empty()));
/*    */     }
/* 44 */     return ☃.getStringValue(t).flatMap(str -> (DataResult)Optional.ofNullable(☃.apply(str)).map(DataResult::success).orElseGet(()))
/*    */ 
/*    */       
/* 47 */       .map(afs1 -> Pair.of(afs1, ☃.empty()));
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 52 */     return "StringRepresentable[" + this.a + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\afs$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */