/*     */ import com.google.common.annotations.VisibleForTesting;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.Set;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.Executor;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.IntConsumer;
/*     */ import java.util.function.IntSupplier;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
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
/*     */ public class zu
/*     */   implements AutoCloseable, zr.c
/*     */ {
/*  29 */   private static final Logger a = LogManager.getLogger();
/*     */   private final Map<aod<?>, zt<? extends Function<aod<afx>, ?>>> b;
/*     */   private final Set<aod<?>> c;
/*     */   private final aoe<aog.b> d;
/*     */   
/*     */   public zu(List<aod<?>> ☃, Executor executor, int i) {
/*  35 */     this.b = (Map<aod<?>, zt<? extends Function<aod<afx>, ?>>>)☃.stream().collect(Collectors.toMap(Function.identity(), aod1 -> new zt(aod1.bj() + "_queue", ☃)));
/*  36 */     this.c = Sets.newHashSet(☃);
/*  37 */     this.d = new aoe<>(new aog.a(4), executor, "sorter");
/*     */   }
/*     */   
/*     */   public static final class a<T> {
/*     */     private final Function<aod<afx>, T> a;
/*     */     private final long b;
/*     */     private final IntSupplier c;
/*     */     
/*     */     private a(Function<aod<afx>, T> ☃, long l, IntSupplier intSupplier) {
/*  46 */       this.a = ☃;
/*  47 */       this.b = l;
/*  48 */       this.c = intSupplier;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static a<Runnable> a(Runnable ☃, long l, IntSupplier intSupplier) {
/*  57 */     return new a<>(aod1 -> (), l, intSupplier);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static a<Runnable> a(zr ☃, Runnable runnable) {
/*  64 */     return a(runnable, ☃.i().a(), ☃::k);
/*     */   }
/*     */ 
/*     */   
/*     */   public static final class b
/*     */   {
/*     */     private final Runnable a;
/*     */     
/*     */     private final long b;
/*     */     
/*     */     private final boolean c;
/*     */     
/*     */     private b(Runnable ☃, long l, boolean bool) {
/*  77 */       this.a = ☃;
/*  78 */       this.b = l;
/*  79 */       this.c = bool;
/*     */     }
/*     */   }
/*     */   
/*     */   public static b a(Runnable ☃, long l, boolean bool) {
/*  84 */     return new b(☃, l, bool);
/*     */   }
/*     */   
/*     */   public <T> aod<a<T>> a(aod<T> ☃, boolean bool) {
/*  88 */     return this.d.b(aod1 -> new aog.b(0, ()))
/*     */ 
/*     */ 
/*     */       
/*  92 */       .join();
/*     */   }
/*     */   
/*     */   public aod<b> a(aod<Runnable> ☃) {
/*  96 */     return this.d.b(aod1 -> new aog.b(0, ()))
/*     */       
/*  98 */       .join();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brd ☃, IntSupplier intSupplier, int i, IntConsumer intConsumer) {
/* 103 */     this.d.a(new aog.b(0, () -> {
/*     */             int j = ☃.getAsInt();
/*     */             this.b.values().forEach(());
/*     */             intConsumer.accept(i);
/*     */           }));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private <T> void a(aod<T> ☃, long l, Runnable runnable, boolean bool) {
/* 114 */     this.d.a(new aog.b(1, () -> {
/*     */             zt<Function<aod<afx>, T>> zt = b(☃);
/*     */             zt.a(l, bool);
/*     */             if (this.c.remove(☃)) {
/*     */               a(zt, ☃);
/*     */             }
/*     */             runnable.run();
/*     */           }));
/*     */   }
/*     */   
/*     */   private <T> void a(aod<T> ☃, Function<aod<afx>, T> function, long l, IntSupplier intSupplier, boolean bool) {
/* 125 */     this.d.a(new aog.b(2, () -> {
/*     */             zt<Function<aod<afx>, T>> zt = b(☃);
/*     */             int i = intSupplier.getAsInt();
/*     */             zt.a(Optional.of(function), l, i);
/*     */             if (bool) {
/*     */               zt.a(Optional.empty(), l, i);
/*     */             }
/*     */             if (this.c.remove(☃)) {
/*     */               a(zt, ☃);
/*     */             }
/*     */           }));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private <T> void a(zt<Function<aod<afx>, T>> ☃, aod<T> aod1) {
/* 142 */     this.d.a(new aog.b(3, () -> {
/*     */             Stream<Either<Function<aod<afx>, T>, Runnable>> stream = ☃.a();
/*     */             if (stream == null) {
/*     */               this.c.add(aod1);
/*     */             } else {
/*     */               x.b((List<? extends CompletableFuture<?>>)stream.map(()).collect(Collectors.toList())).thenAccept(());
/*     */             } 
/*     */           }));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private <T> zt<Function<aod<afx>, T>> b(aod<T> ☃) {
/* 157 */     zt<? extends Function<aod<afx>, ?>> zt = this.b.get(☃);
/* 158 */     if (zt == null) {
/* 159 */       throw (IllegalArgumentException)x.c(new IllegalArgumentException("No queue for: " + ☃));
/*     */     }
/* 161 */     return (zt)zt;
/*     */   }
/*     */   
/*     */   @VisibleForTesting
/*     */   public String a() {
/* 166 */     return (String)this.b.entrySet().stream()
/* 167 */       .map(☃ -> ((aod)☃.getKey()).bj() + "=[" + (String)((zt)☃.getValue()).b().stream().map(()).collect(Collectors.joining(",")) + "]")
/* 168 */       .collect(Collectors.joining(",")) + ", s=" + this.c.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() {
/* 173 */     this.b.keySet().forEach(aod::close);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\zu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */