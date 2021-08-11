/*    */ import java.util.List;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import java.util.concurrent.Executor;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface acf
/*    */   extends ach, AutoCloseable
/*    */ {
/*    */   default CompletableFuture<afx> a(Executor ☃, Executor executor1, List<abj> list, CompletableFuture<afx> completableFuture) {
/* 12 */     return a(☃, executor1, completableFuture, list).a();
/*    */   }
/*    */   
/*    */   ace a(Executor paramExecutor1, Executor paramExecutor2, CompletableFuture<afx> paramCompletableFuture, List<abj> paramList);
/*    */   
/*    */   void a(acc paramacc);
/*    */   
/*    */   void close();
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\acf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */