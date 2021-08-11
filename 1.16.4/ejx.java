/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import java.util.concurrent.Executor;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ejx
/*    */   extends ejy
/*    */ {
/*    */   @Nullable
/*    */   private CompletableFuture<ejy.a> e;
/*    */   
/*    */   public ejx(ach ☃, vk vk1, Executor executor) {
/* 17 */     super(vk1);
/* 18 */     this.e = CompletableFuture.supplyAsync(() -> ejy.a.a(☃, vk1), executor);
/*    */   }
/*    */ 
/*    */   
/*    */   protected ejy.a b(ach ☃) {
/* 23 */     if (this.e != null) {
/* 24 */       ejy.a a = this.e.join();
/* 25 */       this.e = null;
/* 26 */       return a;
/*    */     } 
/* 28 */     return ejy.a.a(☃, this.d);
/*    */   }
/*    */   
/*    */   public CompletableFuture<Void> a() {
/* 32 */     return (this.e == null) ? CompletableFuture.<Void>completedFuture(null) : this.e.<Void>thenApply(☃ -> null);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ekd ☃, ach ach1, vk vk1, Executor executor) {
/* 37 */     this.e = CompletableFuture.supplyAsync(() -> ejy.a.a(☃, this.d), x.f());
/* 38 */     this.e.thenRunAsync(() -> ☃.a(this.d, this), a(executor));
/*    */   }
/*    */   
/*    */   private static Executor a(Executor ☃) {
/* 42 */     return runnable -> ☃.execute(());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ejx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */