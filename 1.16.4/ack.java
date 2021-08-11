/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import java.util.concurrent.Executor;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ack<T>
/*    */   implements acc
/*    */ {
/*    */   public final CompletableFuture<Void> a(acc.a ☃, ach ach1, anw anw1, anw anw2, Executor executor1, Executor executor2) {
/* 11 */     return CompletableFuture.supplyAsync(() -> b(☃, anw1), executor1)
/* 12 */       .thenCompose(☃::a)
/* 13 */       .thenAcceptAsync(object -> a((T)object, ☃, anw1), executor2);
/*    */   }
/*    */   
/*    */   protected abstract T b(ach paramach, anw paramanw);
/*    */   
/*    */   protected abstract void a(T paramT, ach paramach, anw paramanw);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ack.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */