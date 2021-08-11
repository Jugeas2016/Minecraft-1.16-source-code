/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.CompletionException;
/*     */ import java.util.concurrent.CompletionStage;
/*     */ import java.util.concurrent.atomic.AtomicBoolean;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cgv
/*     */   implements AutoCloseable
/*     */ {
/*  40 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   enum b {
/*  43 */     a, b;
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private md a;
/*  48 */     private final CompletableFuture<Void> b = new CompletableFuture<>();
/*     */     
/*     */     public a(md ☃) {
/*  51 */       this.a = ☃;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*  56 */   private final AtomicBoolean b = new AtomicBoolean();
/*     */   
/*     */   private final aoe<aog.b> c;
/*     */   
/*     */   private final cgz d;
/*  61 */   private final Map<brd, a> e = Maps.newLinkedHashMap();
/*     */   
/*     */   protected cgv(File ☃, boolean bool, String str) {
/*  64 */     this.d = new cgz(☃, bool);
/*  65 */     this.c = new aoe<>(new aog.a((b.values()).length), x.g(), "IOWorker-" + str);
/*     */   }
/*     */   
/*     */   public CompletableFuture<Void> a(brd ☃, md md1) {
/*  69 */     return a(() -> {
/*     */           a a = this.e.computeIfAbsent(☃, ());
/*     */           a.a(a, md1);
/*     */           return Either.left(a.b(a));
/*  73 */         }).thenCompose(Function.identity());
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public md a(brd ☃) throws IOException {
/*  79 */     CompletableFuture<md> completableFuture = a(() -> {
/*     */           a a = this.e.get(☃);
/*     */           if (a != null) {
/*     */             return Either.left(a.a(a));
/*     */           }
/*     */           try {
/*     */             md md = this.d.a(☃);
/*     */             return Either.left(md);
/*  87 */           } catch (Exception exception) {
/*     */             a.warn("Failed to read chunk {}", ☃, exception);
/*     */             
/*     */             return Either.right(exception);
/*     */           } 
/*     */         });
/*     */     
/*     */     try {
/*  95 */       return completableFuture.join();
/*  96 */     } catch (CompletionException completionException) {
/*  97 */       if (completionException.getCause() instanceof IOException) {
/*  98 */         throw (IOException)completionException.getCause();
/*     */       }
/* 100 */       throw completionException;
/*     */     } 
/*     */   }
/*     */   
/*     */   public CompletableFuture<Void> a() {
/* 105 */     CompletableFuture<Void> ☃ = a(() -> Either.left(CompletableFuture.allOf((CompletableFuture<?>[])this.e.values().stream().map(()).toArray(())))).thenCompose(Function.identity());
/* 106 */     return ☃.thenCompose(☃ -> a(()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private <T> CompletableFuture<T> a(Supplier<Either<T, Exception>> ☃) {
/* 118 */     return this.c.c(aod1 -> new aog.b(b.a.ordinal(), ()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void b() {
/* 127 */     Iterator<Map.Entry<brd, a>> ☃ = this.e.entrySet().iterator();
/* 128 */     if (!☃.hasNext()) {
/*     */       return;
/*     */     }
/*     */     
/* 132 */     Map.Entry<brd, a> entry = ☃.next();
/* 133 */     ☃.remove();
/* 134 */     a(entry.getKey(), entry.getValue());
/* 135 */     c();
/*     */   }
/*     */   
/*     */   private void c() {
/* 139 */     this.c.a(new aog.b(b.b.ordinal(), this::b));
/*     */   }
/*     */   
/*     */   private void a(brd ☃, a a1) {
/*     */     try {
/* 144 */       this.d.a(☃, a.a(a1));
/* 145 */       a.b(a1).complete(null);
/* 146 */     } catch (Exception exception) {
/* 147 */       a.error("Failed to store chunk {}", ☃, exception);
/* 148 */       a.b(a1).completeExceptionally(exception);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() throws IOException {
/* 154 */     if (!this.b.compareAndSet(false, true)) {
/*     */       return;
/*     */     }
/*     */     
/* 158 */     CompletableFuture<afx> ☃ = this.c.b(☃ -> new aog.b(b.a.ordinal(), ()));
/*     */     try {
/* 160 */       ☃.join();
/* 161 */     } catch (CompletionException completionException) {
/* 162 */       if (completionException.getCause() instanceof IOException) {
/* 163 */         throw (IOException)completionException.getCause();
/*     */       }
/* 165 */       throw completionException;
/*     */     } 
/*     */     
/* 168 */     this.c.close();
/* 169 */     this.e.forEach(this::a);
/* 170 */     this.e.clear();
/*     */     try {
/* 172 */       this.d.close();
/* 173 */     } catch (Exception exception) {
/* 174 */       a.error("Failed to close storage", exception);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cgv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */