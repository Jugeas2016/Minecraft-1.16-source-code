/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Collection;
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
/*    */ 
/*    */ public final class b<E extends aqm>
/*    */ {
/*    */   private final Collection<? extends ayd<?>> a;
/*    */   private final Collection<? extends azc<? extends azb<? super E>>> b;
/*    */   private final Codec<arf<E>> c;
/*    */   
/*    */   private b(Collection<? extends ayd<?>> ☃, Collection<? extends azc<? extends azb<? super E>>> collection) {
/* 58 */     this.a = ☃;
/* 59 */     this.b = collection;
/* 60 */     this.c = arf.b(☃, collection);
/*    */   }
/*    */   
/*    */   public arf<E> a(Dynamic<?> ☃) {
/* 64 */     return this.c.parse(☃).resultOrPartial(arf.i()::error).orElseGet(() -> new arf<>(this.a, this.b, ImmutableList.of(), ()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\arf$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */