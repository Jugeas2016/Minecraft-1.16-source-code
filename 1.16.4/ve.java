/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.DataResult;
/*    */ import com.mojang.serialization.DynamicOps;
/*    */ import com.mojang.serialization.Lifecycle;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class ve<E>
/*    */   implements Codec<gi<E>>
/*    */ {
/*    */   private final Codec<gi<E>> a;
/*    */   private final vj<? extends gm<E>> b;
/*    */   private final Codec<E> c;
/*    */   
/*    */   public static <E> ve<E> a(vj<? extends gm<E>> ☃, Lifecycle lifecycle, Codec<E> codec) {
/* 17 */     return new ve<>(☃, lifecycle, codec);
/*    */   }
/*    */   
/*    */   private ve(vj<? extends gm<E>> ☃, Lifecycle lifecycle, Codec<E> codec) {
/* 21 */     this.a = gi.c(☃, lifecycle, codec);
/* 22 */     this.b = ☃;
/* 23 */     this.c = codec;
/*    */   }
/*    */ 
/*    */   
/*    */   public <T> DataResult<T> a(gi<E> ☃, DynamicOps<T> dynamicOps, T t) {
/* 28 */     return this.a.encode(☃, dynamicOps, t);
/*    */   }
/*    */ 
/*    */   
/*    */   public <T> DataResult<Pair<gi<E>, T>> decode(DynamicOps<T> ☃, T t) {
/* 33 */     DataResult<Pair<gi<E>, T>> dataResult = this.a.decode(☃, t);
/* 34 */     if (☃ instanceof vh) {
/* 35 */       return dataResult.flatMap(pair -> ((vh)☃).a((gi)pair.getFirst(), this.b, this.c).map(()));
/*    */     }
/* 37 */     return dataResult;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 42 */     return "RegistryDataPackCodec[" + this.a + " " + this.b + " " + this.c + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ve.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */