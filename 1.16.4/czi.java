/*    */ import java.util.Objects;
/*    */ import java.util.function.Consumer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @FunctionalInterface
/*    */ interface czi
/*    */ {
/*    */   public static final czi a = (☃, consumer) -> false;
/*    */   public static final czi b = (☃, consumer) -> true;
/*    */   
/*    */   default czi a(czi ☃) {
/* 16 */     Objects.requireNonNull(☃);
/* 17 */     return (cyv1, consumer) -> (expand(cyv1, consumer) && ☃.expand(cyv1, consumer));
/*    */   }
/*    */   
/*    */   default czi b(czi ☃) {
/* 21 */     Objects.requireNonNull(☃);
/* 22 */     return (cyv1, consumer) -> (expand(cyv1, consumer) || ☃.expand(cyv1, consumer));
/*    */   }
/*    */   
/*    */   boolean expand(cyv paramcyv, Consumer<czp> paramConsumer);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */