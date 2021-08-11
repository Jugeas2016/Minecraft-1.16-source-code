/*    */ import java.util.Optional;
/*    */ import java.util.function.BiConsumer;
/*    */ import java.util.function.BiFunction;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface bim
/*    */ {
/* 11 */   public static final bim a = new bim()
/*    */     {
/*    */       public <T> Optional<T> a(BiFunction<brx, fx, T> ☃) {
/* 14 */         return Optional.empty();
/*    */       }
/*    */     };
/*    */   
/*    */   static bim a(brx ☃, fx fx1) {
/* 19 */     return new bim(☃, fx1)
/*    */       {
/*    */         public <T> Optional<T> a(BiFunction<brx, fx, T> ☃) {
/* 22 */           return Optional.of(☃.apply(this.b, this.c));
/*    */         }
/*    */       };
/*    */   }
/*    */   
/*    */   <T> Optional<T> a(BiFunction<brx, fx, T> paramBiFunction);
/*    */   
/*    */   default <T> T a(BiFunction<brx, fx, T> ☃, T t) {
/* 30 */     return a(☃).orElse(t);
/*    */   }
/*    */   
/*    */   default void a(BiConsumer<brx, fx> ☃) {
/* 34 */     a((brx1, fx1) -> {
/*    */           ☃.accept(brx1, fx1);
/*    */           return Optional.empty();
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bim.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */