/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import java.util.concurrent.Executor;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface acc
/*    */ {
/*    */   CompletableFuture<Void> a(a parama, ach paramach, anw paramanw1, anw paramanw2, Executor paramExecutor1, Executor paramExecutor2);
/*    */   
/*    */   default String c() {
/* 16 */     return getClass().getSimpleName();
/*    */   }
/*    */   
/*    */   public static interface a {
/*    */     <T> CompletableFuture<T> a(T param1T);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\acc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */