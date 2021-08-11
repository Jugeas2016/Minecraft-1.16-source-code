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
/*    */ class null
/*    */   implements acc.a
/*    */ {
/*    */   null(acl ☃, Executor paramExecutor, acc paramacc, CompletableFuture paramCompletableFuture) {}
/*    */   
/*    */   public <T> CompletableFuture<T> a(T ☃) {
/* 50 */     this.a.execute(() -> {
/*    */           acl.a(this.d).remove(☃);
/*    */           if (acl.a(this.d).isEmpty()) {
/*    */             this.d.b.complete(afx.a);
/*    */           }
/*    */         });
/* 56 */     return this.d.b.thenCombine(this.c, (afx1, object1) -> ☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\acl$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */