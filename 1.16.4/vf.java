/*    */ import com.mojang.datafixers.util.Either;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.DataResult;
/*    */ import com.mojang.serialization.DynamicOps;
/*    */ import java.util.List;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class vf<E>
/*    */   implements Codec<Supplier<E>>
/*    */ {
/*    */   private final vj<? extends gm<E>> a;
/*    */   private final Codec<E> b;
/*    */   private final boolean c;
/*    */   
/*    */   public static <E> vf<E> a(vj<? extends gm<E>> ☃, Codec<E> codec) {
/* 19 */     return a(☃, codec, true);
/*    */   }
/*    */   
/*    */   public static <E> Codec<List<Supplier<E>>> b(vj<? extends gm<E>> ☃, Codec<E> codec) {
/* 23 */     return Codec.either(
/* 24 */         a(☃, codec, false).listOf(), codec
/* 25 */         .xmap(☃ -> (), Supplier::get).listOf())
/* 26 */       .xmap(☃ -> (List)☃.map((), ()), Either::left);
/*    */   }
/*    */   
/*    */   private static <E> vf<E> a(vj<? extends gm<E>> ☃, Codec<E> codec, boolean bool) {
/* 30 */     return new vf<>(☃, codec, bool);
/*    */   }
/*    */   
/*    */   private vf(vj<? extends gm<E>> ☃, Codec<E> codec, boolean bool) {
/* 34 */     this.a = ☃;
/* 35 */     this.b = codec;
/* 36 */     this.c = bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public <T> DataResult<T> a(Supplier<E> ☃, DynamicOps<T> dynamicOps, T t) {
/* 41 */     if (dynamicOps instanceof vi) {
/* 42 */       return ((vi<T>)dynamicOps).a(☃.get(), t, this.a, this.b);
/*    */     }
/* 44 */     return this.b.encode(☃.get(), dynamicOps, t);
/*    */   }
/*    */ 
/*    */   
/*    */   public <T> DataResult<Pair<Supplier<E>, T>> decode(DynamicOps<T> ☃, T t) {
/* 49 */     if (☃ instanceof vh) {
/* 50 */       return ((vh<T>)☃).a(t, this.a, this.b, this.c);
/*    */     }
/* 52 */     return this.b.decode(☃, t).map(☃ -> ☃.mapFirst(()));
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 57 */     return "RegistryFileCodec[" + this.a + " " + this.b + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\vf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */