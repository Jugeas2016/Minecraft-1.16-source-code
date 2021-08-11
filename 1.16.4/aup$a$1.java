/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import com.mojang.serialization.DynamicOps;
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
/*     */   implements Codec<aup.a<E>>
/*     */ {
/*     */   null(Codec paramCodec) {}
/*     */   
/*     */   public <T> DataResult<Pair<aup.a<E>, T>> decode(DynamicOps<T> ☃, T t) {
/*  98 */     Dynamic<T> dynamic = new Dynamic(☃, t);
/*  99 */     return dynamic.get("data")
/* 100 */       .flatMap(this.a::parse)
/* 101 */       .map(object -> new aup.a(object, ☃.get("weight").asInt(1), null))
/* 102 */       .map(a1 -> Pair.of(a1, ☃.empty()));
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> DataResult<T> a(aup.a<E> ☃, DynamicOps<T> dynamicOps, T t) {
/* 107 */     return dynamicOps.mapBuilder()
/* 108 */       .add("weight", dynamicOps.createInt(aup.a.b(☃)))
/* 109 */       .add("data", this.a.encodeStart(dynamicOps, aup.a.a(☃)))
/* 110 */       .build(t);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aup$a$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */