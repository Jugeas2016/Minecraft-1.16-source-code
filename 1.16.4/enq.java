/*    */ import com.google.common.collect.Maps;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.util.Collection;
/*    */ import java.util.Map;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import java.util.concurrent.CompletionException;
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
/*    */ public class enq
/*    */ {
/*    */   private final ach a;
/* 23 */   private final Map<vk, CompletableFuture<ddz>> b = Maps.newHashMap();
/*    */   
/*    */   public enq(ach ☃) {
/* 26 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public CompletableFuture<ddz> a(vk ☃) {
/* 30 */     return this.b.computeIfAbsent(☃, ☃ -> CompletableFuture.supplyAsync((), x.f()));
/*    */   }
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
/*    */   public CompletableFuture<enm> a(vk ☃, boolean bool) {
/* 44 */     return CompletableFuture.supplyAsync(() -> {
/*    */           try {
/*    */             acg acg = this.a.a(☃);
/*    */             InputStream inputStream = acg.b();
/*    */             return bool ? new eno(ddx::new, inputStream) : new ddx(inputStream);
/* 49 */           } catch (IOException iOException) {
/*    */             throw new CompletionException(iOException);
/*    */           } 
/* 52 */         }x.f());
/*    */   }
/*    */   
/*    */   public void a() {
/* 56 */     this.b.values().forEach(☃ -> ☃.thenAccept(ddz::b));
/* 57 */     this.b.clear();
/*    */   }
/*    */   
/*    */   public CompletableFuture<?> a(Collection<emq> ☃) {
/* 61 */     return CompletableFuture.allOf((CompletableFuture<?>[])☃.stream().map(☃ -> a(☃.b())).toArray(☃ -> new CompletableFuture[☃]));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\enq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */