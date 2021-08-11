/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import com.mojang.serialization.DynamicOps;
/*     */ import com.mojang.serialization.MapCodec;
/*     */ import com.mojang.serialization.MapLike;
/*     */ import com.mojang.serialization.RecordBuilder;
/*     */ import java.util.Collection;
/*     */ import java.util.Optional;
/*     */ import java.util.stream.Stream;
/*     */ import org.apache.commons.lang3.mutable.MutableObject;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class null
/*     */   extends MapCodec<arf<E>>
/*     */ {
/*     */   null(Collection paramCollection1, Collection paramCollection2, MutableObject paramMutableObject) {}
/*     */   
/*     */   public <T> Stream<T> keys(DynamicOps<T> ☃) {
/*  78 */     return this.a.stream().flatMap(☃ -> x.a(☃.a().map(()))).map(vk1 -> ☃.createString(vk1.toString()));
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> DataResult<arf<E>> decode(DynamicOps<T> ☃, MapLike<T> mapLike) {
/*  83 */     MutableObject<DataResult<ImmutableList.Builder<arf.a<?>>>> mutableObject = new MutableObject(DataResult.success(ImmutableList.builder()));
/*     */     
/*  85 */     mapLike.entries().forEach(pair -> {
/*     */           DataResult<ayd<?>> dataResult = gm.ak.parse(☃, pair.getFirst());
/*     */           
/*     */           DataResult<? extends arf.a<?>> dataResult1 = dataResult.flatMap(());
/*     */           mutableObject.setValue(((DataResult)mutableObject.getValue()).apply2(ImmutableList.Builder::add, dataResult1));
/*     */         });
/*  91 */     ImmutableList<arf.a<?>> immutableList = ((DataResult)mutableObject.getValue()).resultOrPartial(arf.i()::error).map(ImmutableList.Builder::build).orElseGet(ImmutableList::of);
/*  92 */     return DataResult.success(new arf<>(this.a, this.b, immutableList, this.c::getValue));
/*     */   }
/*     */   
/*     */   private <T, U> DataResult<arf.a<U>> a(ayd<U> ☃, DynamicOps<T> dynamicOps, T t) {
/*  96 */     return ((DataResult)☃.a().map(DataResult::success).orElseGet(() -> DataResult.error("No codec for memory: " + ☃)))
/*  97 */       .flatMap(codec -> codec.parse(☃, object))
/*  98 */       .map(ayc1 -> new arf.a(☃, Optional.of(ayc1), null));
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> RecordBuilder<T> a(arf<E> ☃, DynamicOps<T> dynamicOps, RecordBuilder<T> recordBuilder) {
/* 103 */     arf.a(☃).forEach(a1 -> a1.a(☃, recordBuilder));
/* 104 */     return recordBuilder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\arf$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */