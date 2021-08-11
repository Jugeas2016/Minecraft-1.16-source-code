/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.Executor;
/*     */ import java.util.concurrent.atomic.AtomicInteger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class acl<S>
/*     */   implements ace
/*     */ {
/*     */   protected final ach a;
/*  21 */   protected final CompletableFuture<afx> b = new CompletableFuture<>();
/*     */   
/*     */   protected final CompletableFuture<List<S>> c;
/*     */   
/*     */   private final Set<acc> d;
/*     */   private final int e;
/*     */   private int f;
/*     */   private int g;
/*  29 */   private final AtomicInteger h = new AtomicInteger();
/*  30 */   private final AtomicInteger i = new AtomicInteger();
/*     */   
/*     */   public static acl<Void> a(ach ☃, List<acc> list, Executor executor1, Executor executor2, CompletableFuture<afx> completableFuture) {
/*  33 */     return new acl<>(executor1, executor2, ☃, list, (a1, ach1, acc1, executor1, executor2) -> acc1.a(a1, ach1, ant.a, ant.a, ☃, executor2), completableFuture);
/*     */   }
/*     */   
/*     */   protected acl(Executor ☃, Executor executor1, ach ach1, List<acc> list, a<S> a1, CompletableFuture<afx> completableFuture) {
/*  37 */     this.a = ach1;
/*  38 */     this.e = list.size();
/*  39 */     this.h.incrementAndGet();
/*  40 */     completableFuture.thenRun(this.i::incrementAndGet);
/*  41 */     List<CompletableFuture<S>> list1 = Lists.newArrayList();
/*  42 */     CompletableFuture<?> completableFuture1 = completableFuture;
/*  43 */     this.d = Sets.newHashSet(list);
/*  44 */     for (acc acc : list) {
/*  45 */       CompletableFuture<?> completableFuture2 = completableFuture1;
/*  46 */       CompletableFuture<S> completableFuture3 = a1.create(new acc.a(this, executor1, acc, completableFuture2)
/*     */           {
/*     */             public <T> CompletableFuture<T> a(T ☃)
/*     */             {
/*  50 */               this.a.execute(() -> {
/*     */                     acl.a(this.d).remove(☃);
/*     */                     if (acl.a(this.d).isEmpty()) {
/*     */                       this.d.b.complete(afx.a);
/*     */                     }
/*     */                   });
/*  56 */               return this.d.b.thenCombine(this.c, (afx1, object1) -> ☃);
/*     */             }
/*     */           }ach1, acc, runnable -> {
/*     */             this.h.incrementAndGet();
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             ☃.execute(());
/*     */           }runnable -> {
/*     */             this.f++;
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             ☃.execute(());
/*     */           });
/*     */ 
/*     */ 
/*     */       
/*  76 */       list1.add(completableFuture3);
/*  77 */       completableFuture1 = completableFuture3;
/*     */     } 
/*  79 */     this.c = x.b(list1);
/*     */   }
/*     */ 
/*     */   
/*     */   public CompletableFuture<afx> a() {
/*  84 */     return this.c.thenApply(☃ -> afx.a);
/*     */   }
/*     */   public static interface a<S> {
/*     */     CompletableFuture<S> create(acc.a param1a, ach param1ach, acc param1acc, Executor param1Executor1, Executor param1Executor2); }
/*     */   public float b() {
/*  89 */     int ☃ = this.e - this.d.size();
/*  90 */     float f1 = (this.i.get() * 2 + this.g * 2 + ☃ * 1);
/*  91 */     float f2 = (this.h.get() * 2 + this.f * 2 + this.e * 1);
/*  92 */     return f1 / f2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 101 */     return this.b.isDone();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 106 */     return this.c.isDone();
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 111 */     if (this.c.isCompletedExceptionally())
/* 112 */       this.c.join(); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\acl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */