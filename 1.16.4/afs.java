/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.DataResult;
/*    */ import com.mojang.serialization.DynamicOps;
/*    */ import com.mojang.serialization.Keyable;
/*    */ import java.util.Arrays;
/*    */ import java.util.Optional;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.IntFunction;
/*    */ import java.util.function.Supplier;
/*    */ import java.util.function.ToIntFunction;
/*    */ import java.util.stream.IntStream;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface afs
/*    */ {
/*    */   static <E extends Enum<E> & afs> Codec<E> a(Supplier<E[]> ☃, Function<? super String, ? extends E> function) {
/* 22 */     Enum[] arrayOfEnum = (Enum[])☃.get();
/* 23 */     return (Codec)a(Enum::ordinal, i -> ☃[i], function);
/*    */   }
/*    */   
/*    */   static <E extends afs> Codec<E> a(ToIntFunction<E> ☃, IntFunction<E> intFunction, Function<? super String, ? extends E> function) {
/* 27 */     return new Codec<E>(☃, intFunction, function)
/*    */       {
/*    */         public <T> DataResult<T> a(E ☃, DynamicOps<T> dynamicOps, T t) {
/* 30 */           if (dynamicOps.compressMaps()) {
/* 31 */             return dynamicOps.mergeToPrimitive(t, dynamicOps.createInt(this.a.applyAsInt(☃)));
/*    */           }
/* 33 */           return dynamicOps.mergeToPrimitive(t, dynamicOps.createString(☃.a()));
/*    */         }
/*    */ 
/*    */         
/*    */         public <T> DataResult<Pair<E, T>> decode(DynamicOps<T> ☃, T t) {
/* 38 */           if (☃.compressMaps()) {
/* 39 */             return ☃.getNumberValue(t).flatMap(number -> (DataResult)Optional.ofNullable(☃.apply(number.intValue())).map(DataResult::success).orElseGet(()))
/*    */ 
/*    */               
/* 42 */               .map(afs1 -> Pair.of(afs1, ☃.empty()));
/*    */           }
/* 44 */           return ☃.getStringValue(t).flatMap(str -> (DataResult)Optional.ofNullable(☃.apply(str)).map(DataResult::success).orElseGet(()))
/*    */ 
/*    */             
/* 47 */             .map(afs1 -> Pair.of(afs1, ☃.empty()));
/*    */         }
/*    */ 
/*    */         
/*    */         public String toString() {
/* 52 */           return "StringRepresentable[" + this.a + "]";
/*    */         }
/*    */       };
/*    */   }
/*    */   
/*    */   static Keyable a(afs[] ☃) {
/* 58 */     return new Keyable(☃)
/*    */       {
/*    */         public <T> Stream<T> keys(DynamicOps<T> ☃) {
/* 61 */           if (☃.compressMaps()) {
/* 62 */             return IntStream.range(0, this.a.length).mapToObj(☃::createInt);
/*    */           }
/* 64 */           return Arrays.<afs>stream(this.a).map(afs::a).map(☃::createString);
/*    */         }
/*    */       };
/*    */   }
/*    */   
/*    */   String a();
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\afs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */