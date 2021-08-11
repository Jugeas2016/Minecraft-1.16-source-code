/*    */ import com.mojang.serialization.DataResult;
/*    */ import com.mojang.serialization.DynamicOps;
/*    */ import com.mojang.serialization.MapCodec;
/*    */ import com.mojang.serialization.MapLike;
/*    */ import com.mojang.serialization.RecordBuilder;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class vg<E>
/*    */   extends MapCodec<gm<E>>
/*    */ {
/*    */   private final vj<? extends gm<E>> a;
/*    */   
/*    */   public static <E> vg<E> a(vj<? extends gm<E>> ☃) {
/* 16 */     return new vg<>(☃);
/*    */   }
/*    */   
/*    */   private vg(vj<? extends gm<E>> ☃) {
/* 20 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public <T> RecordBuilder<T> a(gm<E> ☃, DynamicOps<T> dynamicOps, RecordBuilder<T> recordBuilder) {
/* 25 */     return recordBuilder;
/*    */   }
/*    */ 
/*    */   
/*    */   public <T> DataResult<gm<E>> decode(DynamicOps<T> ☃, MapLike<T> mapLike) {
/* 30 */     if (☃ instanceof vh) {
/* 31 */       return ((vh)☃).a(this.a);
/*    */     }
/* 33 */     return DataResult.error("Not a registry ops");
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 38 */     return "RegistryLookupCodec[" + this.a + "]";
/*    */   }
/*    */ 
/*    */   
/*    */   public <T> Stream<T> keys(DynamicOps<T> ☃) {
/* 43 */     return Stream.empty();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\vg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */