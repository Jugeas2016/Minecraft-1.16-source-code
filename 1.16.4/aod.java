/*    */ import com.mojang.datafixers.util.Either;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import java.util.function.Consumer;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface aod<Msg>
/*    */   extends AutoCloseable
/*    */ {
/*    */   default void close() {}
/*    */   
/*    */   default <Source> CompletableFuture<Source> b(Function<? super aod<Source>, ? extends Msg> ☃) {
/* 19 */     CompletableFuture<Source> completableFuture = new CompletableFuture<>();
/* 20 */     Msg msg = ☃.apply(a("ask future procesor handle", completableFuture::complete));
/* 21 */     a(msg);
/* 22 */     return completableFuture;
/*    */   }
/*    */   
/*    */   default <Source> CompletableFuture<Source> c(Function<? super aod<Either<Source, Exception>>, ? extends Msg> ☃) {
/* 26 */     CompletableFuture<Source> completableFuture = new CompletableFuture<>();
/* 27 */     Msg msg = ☃.apply(a("ask future procesor handle", either -> {
/*    */             either.ifLeft(☃::complete);
/*    */             either.ifRight(☃::completeExceptionally);
/*    */           }));
/* 31 */     a(msg);
/* 32 */     return completableFuture;
/*    */   }
/*    */   
/*    */   static <Msg> aod<Msg> a(String ☃, Consumer<Msg> consumer) {
/* 36 */     return new aod<Msg>(☃, consumer)
/*    */       {
/*    */         public String bj() {
/* 39 */           return this.a;
/*    */         }
/*    */ 
/*    */         
/*    */         public void a(Msg ☃) {
/* 44 */           this.b.accept(☃);
/*    */         }
/*    */ 
/*    */         
/*    */         public String toString() {
/* 49 */           return this.a;
/*    */         }
/*    */       };
/*    */   }
/*    */   
/*    */   String bj();
/*    */   
/*    */   void a(Msg paramMsg);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */