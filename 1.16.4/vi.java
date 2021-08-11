/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.DataResult;
/*    */ import com.mojang.serialization.DynamicOps;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class vi<T>
/*    */   extends vd<T>
/*    */ {
/*    */   private final gn b;
/*    */   
/*    */   public static <T> vi<T> a(DynamicOps<T> ☃, gn gn1) {
/* 16 */     return new vi<>(☃, gn1);
/*    */   }
/*    */   
/*    */   private vi(DynamicOps<T> ☃, gn gn1) {
/* 20 */     super(☃);
/* 21 */     this.b = gn1;
/*    */   }
/*    */   
/*    */   protected <E> DataResult<T> a(E ☃, T t, vj<? extends gm<E>> vj1, Codec<E> codec) {
/* 25 */     Optional<gs<E>> optional = this.b.a(vj1);
/* 26 */     if (optional.isPresent()) {
/* 27 */       gs<E> gs = optional.get();
/* 28 */       Optional<vj<E>> optional1 = gs.c(☃);
/* 29 */       if (optional1.isPresent()) {
/* 30 */         vj<E> vj2 = optional1.get();
/* 31 */         return vk.a.encode(vj2.a(), this.a, t);
/*    */       } 
/*    */     } 
/*    */     
/* 35 */     return codec.encode(☃, this, t);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\vi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */