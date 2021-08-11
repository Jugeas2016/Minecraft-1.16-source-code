/*     */ import com.google.common.collect.Iterators;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.util.concurrent.ListeningExecutorService;
/*     */ import com.google.common.util.concurrent.MoreExecutors;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import it.unimi.dsi.fastutil.Hash;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.lang.management.ManagementFactory;
/*     */ import java.lang.management.RuntimeMXBean;
/*     */ import java.net.MalformedURLException;
/*     */ import java.net.URI;
/*     */ import java.net.URISyntaxException;
/*     */ import java.net.URL;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Path;
/*     */ import java.security.AccessController;
/*     */ import java.security.PrivilegedActionException;
/*     */ import java.time.Instant;
/*     */ import java.util.Arrays;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.Random;
/*     */ import java.util.UUID;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.Executor;
/*     */ import java.util.concurrent.ExecutorService;
/*     */ import java.util.concurrent.Executors;
/*     */ import java.util.concurrent.ForkJoinPool;
/*     */ import java.util.concurrent.ForkJoinWorkerThread;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ import java.util.concurrent.atomic.AtomicInteger;
/*     */ import java.util.function.BooleanSupplier;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.function.LongSupplier;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Collector;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.IntStream;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.io.IOUtils;
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
/*     */ public class x
/*     */ {
/*  62 */   private static final AtomicInteger c = new AtomicInteger(1);
/*  63 */   private static final ExecutorService d = a("Bootstrap");
/*  64 */   private static final ExecutorService e = a("Main");
/*  65 */   private static final ExecutorService f = n();
/*     */   
/*  67 */   public static LongSupplier a = System::nanoTime;
/*  68 */   public static final UUID b = new UUID(0L, 0L);
/*     */   
/*  70 */   private static final Logger g = LogManager.getLogger();
/*     */   
/*     */   public static <K, V> Collector<Map.Entry<? extends K, ? extends V>, ?, Map<K, V>> a() {
/*  73 */     return Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue);
/*     */   }
/*     */ 
/*     */   
/*     */   public static <T extends Comparable<T>> String a(cfj<T> ☃, Object object) {
/*  78 */     return ☃.a((T)object);
/*     */   }
/*     */   
/*     */   public static String a(String ☃, @Nullable vk vk1) {
/*  82 */     if (vk1 == null) {
/*  83 */       return ☃ + ".unregistered_sadface";
/*     */     }
/*  85 */     return ☃ + '.' + vk1.b() + '.' + vk1.a().replace('/', '.');
/*     */   }
/*     */   
/*     */   public static long b() {
/*  89 */     return c() / 1000000L;
/*     */   }
/*     */   
/*     */   public static long c() {
/*  93 */     return a.getAsLong();
/*     */   }
/*     */   
/*     */   public static long d() {
/*  97 */     return Instant.now().toEpochMilli();
/*     */   }
/*     */   private static ExecutorService a(String ☃) {
/*     */     ExecutorService executorService;
/* 101 */     int i = afm.a(Runtime.getRuntime().availableProcessors() - 1, 1, 7);
/*     */     
/* 103 */     if (i <= 0) {
/* 104 */       ListeningExecutorService listeningExecutorService = MoreExecutors.newDirectExecutorService();
/*     */     } else {
/* 106 */       executorService = new ForkJoinPool(i, forkJoinPool -> {
/*     */             ForkJoinWorkerThread forkJoinWorkerThread = new ForkJoinWorkerThread(forkJoinPool)
/*     */               {
/*     */                 protected void onTermination(Throwable ☃) {
/* 110 */                   if (☃ != null) {
/* 111 */                     x.m().warn("{} died", getName(), ☃);
/*     */                   } else {
/* 113 */                     x.m().debug("{} shutdown", getName());
/*     */                   } 
/* 115 */                   super.onTermination(☃);
/*     */                 }
/*     */               };
/*     */             forkJoinWorkerThread.setName("Worker-" + ☃ + "-" + c.getAndIncrement());
/*     */             return forkJoinWorkerThread;
/*     */           }x::a, true);
/*     */     } 
/* 122 */     return executorService;
/*     */   }
/*     */ 
/*     */   
/*     */   public static Executor e() {
/* 127 */     return d;
/*     */   }
/*     */   
/*     */   public static Executor f() {
/* 131 */     return e;
/*     */   }
/*     */   
/*     */   public static Executor g() {
/* 135 */     return f;
/*     */   }
/*     */   
/*     */   public static void h() {
/* 139 */     a(e);
/* 140 */     a(f);
/*     */   }
/*     */   private static void a(ExecutorService ☃) {
/*     */     boolean bool;
/* 144 */     ☃.shutdown();
/*     */     
/*     */     try {
/* 147 */       bool = ☃.awaitTermination(3L, TimeUnit.SECONDS);
/* 148 */     } catch (InterruptedException interruptedException) {
/* 149 */       bool = false;
/*     */     } 
/* 151 */     if (!bool) {
/* 152 */       ☃.shutdownNow();
/*     */     }
/*     */   }
/*     */   
/*     */   private static ExecutorService n() {
/* 157 */     return Executors.newCachedThreadPool(☃ -> {
/*     */           Thread thread = new Thread(☃);
/*     */           thread.setName("IO-Worker-" + c.getAndIncrement());
/*     */           thread.setUncaughtExceptionHandler(x::a);
/*     */           return thread;
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public static <T> CompletableFuture<T> a(Throwable ☃) {
/* 167 */     CompletableFuture<T> completableFuture = new CompletableFuture<>();
/* 168 */     completableFuture.completeExceptionally(☃);
/* 169 */     return completableFuture;
/*     */   }
/*     */   
/*     */   public static void b(Throwable ☃) {
/* 173 */     throw (☃ instanceof RuntimeException) ? (RuntimeException)☃ : new RuntimeException(☃);
/*     */   }
/*     */   
/*     */   private static void a(Thread ☃, Throwable throwable) {
/* 177 */     c(throwable);
/* 178 */     if (throwable instanceof java.util.concurrent.CompletionException) {
/* 179 */       throwable = throwable.getCause();
/*     */     }
/* 181 */     if (throwable instanceof u) {
/* 182 */       vm.a(((u)throwable).a().e());
/* 183 */       System.exit(-1);
/*     */     } 
/* 185 */     g.error(String.format("Caught exception in thread %s", new Object[] { ☃ }), throwable);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static Type<?> a(DSL.TypeReference ☃, String str) {
/* 190 */     if (!w.c) {
/* 191 */       return null;
/*     */     }
/* 193 */     return b(☃, str);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static Type<?> b(DSL.TypeReference ☃, String str) {
/* 198 */     Type<?> type = null;
/*     */     try {
/* 200 */       type = agb.a().getSchema(DataFixUtils.makeKey(w.a().getWorldVersion())).getChoiceType(☃, str);
/* 201 */     } catch (IllegalArgumentException illegalArgumentException) {
/* 202 */       g.error("No data fixer registered for {}", str);
/* 203 */       if (w.d) {
/* 204 */         throw illegalArgumentException;
/*     */       }
/*     */     } 
/* 207 */     return type;
/*     */   }
/*     */   
/*     */   public enum b {
/* 211 */     a,
/* 212 */     b,
/* 213 */     c
/*     */     {
/*     */       protected String[] b(URL ☃) {
/* 216 */         return new String[] { "rundll32", "url.dll,FileProtocolHandler", ☃.toString() };
/*     */       }
/*     */     },
/* 219 */     d
/*     */     {
/*     */       protected String[] b(URL ☃) {
/* 222 */         return new String[] { "open", ☃.toString() };
/*     */       }
/*     */     },
/* 225 */     e;
/*     */     
/*     */     public void a(URL ☃) {
/*     */       try {
/* 229 */         Process process = AccessController.<Process>doPrivileged(() -> Runtime.getRuntime().exec(b(☃)));
/* 230 */         for (String str : IOUtils.readLines(process.getErrorStream())) {
/* 231 */           x.m().error(str);
/*     */         }
/* 233 */         process.getInputStream().close();
/* 234 */         process.getErrorStream().close();
/* 235 */         process.getOutputStream().close();
/* 236 */       } catch (PrivilegedActionException|IOException exception) {
/* 237 */         x.m().error("Couldn't open url '{}'", ☃, exception);
/*     */       } 
/*     */     }
/*     */     
/*     */     public void a(URI ☃) {
/*     */       try {
/* 243 */         a(☃.toURL());
/* 244 */       } catch (MalformedURLException malformedURLException) {
/* 245 */         x.m().error("Couldn't open uri '{}'", ☃, malformedURLException);
/*     */       } 
/*     */     }
/*     */     
/*     */     public void a(File ☃) {
/*     */       try {
/* 251 */         a(☃.toURI().toURL());
/* 252 */       } catch (MalformedURLException malformedURLException) {
/* 253 */         x.m().error("Couldn't open file '{}'", ☃, malformedURLException);
/*     */       } 
/*     */     }
/*     */     
/*     */     protected String[] b(URL ☃) {
/* 258 */       String str = ☃.toString();
/* 259 */       if ("file".equals(☃.getProtocol()))
/*     */       {
/* 261 */         str = str.replace("file:", "file://");
/*     */       }
/* 263 */       return new String[] { "xdg-open", str };
/*     */     }
/*     */     
/*     */     public void a(String ☃) {
/*     */       try {
/* 268 */         a((new URI(☃)).toURL());
/*     */       }
/* 270 */       catch (URISyntaxException|MalformedURLException|IllegalArgumentException exception) {
/* 271 */         x.m().error("Couldn't open uri '{}'", ☃, exception);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public static b i() {
/* 277 */     String ☃ = System.getProperty("os.name").toLowerCase(Locale.ROOT);
/* 278 */     if (☃.contains("win")) {
/* 279 */       return b.c;
/*     */     }
/* 281 */     if (☃.contains("mac")) {
/* 282 */       return b.d;
/*     */     }
/* 284 */     if (☃.contains("solaris")) {
/* 285 */       return b.b;
/*     */     }
/* 287 */     if (☃.contains("sunos")) {
/* 288 */       return b.b;
/*     */     }
/* 290 */     if (☃.contains("linux")) {
/* 291 */       return b.a;
/*     */     }
/* 293 */     if (☃.contains("unix")) {
/* 294 */       return b.a;
/*     */     }
/* 296 */     return b.e;
/*     */   }
/*     */   
/*     */   public static Stream<String> j() {
/* 300 */     RuntimeMXBean ☃ = ManagementFactory.getRuntimeMXBean();
/* 301 */     return ☃.getInputArguments().stream().filter(☃ -> ☃.startsWith("-X"));
/*     */   }
/*     */   
/*     */   public static <T> T a(List<T> ☃) {
/* 305 */     return ☃.get(☃.size() - 1);
/*     */   }
/*     */   
/*     */   public static <T> T a(Iterable<T> ☃, @Nullable T t) {
/* 309 */     Iterator<T> iterator = ☃.iterator();
/* 310 */     T t1 = iterator.next();
/*     */     
/* 312 */     if (t != null) {
/* 313 */       T t2 = t1;
/*     */       while (true) {
/* 315 */         if (t2 == t) {
/* 316 */           if (iterator.hasNext()) {
/* 317 */             return iterator.next();
/*     */           }
/*     */           
/*     */           break;
/*     */         } 
/* 322 */         if (iterator.hasNext()) {
/* 323 */           t2 = iterator.next();
/*     */         }
/*     */       } 
/*     */     } 
/* 327 */     return t1;
/*     */   }
/*     */   
/*     */   public static <T> T b(Iterable<T> ☃, @Nullable T t) {
/* 331 */     Iterator<T> iterator = ☃.iterator();
/* 332 */     T t1 = null;
/* 333 */     while (iterator.hasNext()) {
/* 334 */       T t2 = iterator.next();
/* 335 */       if (t2 == t) {
/* 336 */         if (t1 == null) {
/* 337 */           t1 = iterator.hasNext() ? (T)Iterators.getLast(iterator) : t;
/*     */         }
/*     */         break;
/*     */       } 
/* 341 */       t1 = t2;
/*     */     } 
/* 343 */     return t1;
/*     */   }
/*     */   
/*     */   public static <T> T a(Supplier<T> ☃) {
/* 347 */     return ☃.get();
/*     */   }
/*     */   
/*     */   public static <T> T a(T ☃, Consumer<T> consumer) {
/* 351 */     consumer.accept(☃);
/* 352 */     return ☃;
/*     */   }
/*     */   
/*     */   enum a implements Hash.Strategy<Object> {
/* 356 */     a;
/*     */ 
/*     */     
/*     */     public int hashCode(Object ☃) {
/* 360 */       return System.identityHashCode(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object ☃, Object object1) {
/* 365 */       return (☃ == object1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static <K> Hash.Strategy<K> k() {
/* 371 */     return a.a;
/*     */   }
/*     */   
/*     */   public static <V> CompletableFuture<List<V>> b(List<? extends CompletableFuture<? extends V>> ☃) {
/* 375 */     List<V> list = Lists.newArrayListWithCapacity(☃.size());
/* 376 */     CompletableFuture[] arrayOfCompletableFuture = new CompletableFuture[☃.size()];
/*     */     
/* 378 */     CompletableFuture<Void> completableFuture = new CompletableFuture<>();
/*     */     
/* 380 */     ☃.forEach(completableFuture2 -> {
/*     */           int i = ☃.size();
/*     */ 
/*     */ 
/*     */           
/*     */           ☃.add(null);
/*     */ 
/*     */           
/*     */           arrayOfCompletableFuture[i] = completableFuture2.whenComplete(());
/*     */         });
/*     */ 
/*     */     
/* 392 */     return CompletableFuture.allOf((CompletableFuture<?>[])arrayOfCompletableFuture).applyToEither(completableFuture, void_ -> ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public static <T> Stream<T> a(Optional<? extends T> ☃) {
/* 397 */     return (Stream<T>)DataFixUtils.orElseGet(☃.map(Stream::of), Stream::empty);
/*     */   }
/*     */   
/*     */   public static <T> Optional<T> a(Optional<T> ☃, Consumer<T> consumer, Runnable runnable) {
/* 401 */     if (☃.isPresent()) {
/* 402 */       consumer.accept(☃.get());
/*     */     } else {
/* 404 */       runnable.run();
/*     */     } 
/* 406 */     return ☃;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Runnable a(Runnable ☃, Supplier<String> supplier) {
/* 424 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public static <T extends Throwable> T c(T ☃) {
/* 429 */     if (w.d) {
/* 430 */       g.error("Trying to throw a fatal exception, pausing in IDE", (Throwable)☃);
/*     */       try {
/*     */         while (true)
/* 433 */         { Thread.sleep(1000L);
/* 434 */           g.error("paused"); } 
/* 435 */       } catch (InterruptedException interruptedException) {
/* 436 */         return ☃;
/*     */       } 
/*     */     } 
/*     */     
/* 440 */     return ☃;
/*     */   }
/*     */   
/*     */   public static String d(Throwable ☃) {
/* 444 */     if (☃.getCause() != null)
/* 445 */       return d(☃.getCause()); 
/* 446 */     if (☃.getMessage() != null) {
/* 447 */       return ☃.getMessage();
/*     */     }
/* 449 */     return ☃.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public static <T> T a(T[] ☃, Random random) {
/* 454 */     return ☃[random.nextInt(☃.length)];
/*     */   }
/*     */ 
/*     */   
/*     */   public static int a(int[] ☃, Random random) {
/* 459 */     return ☃[random.nextInt(☃.length)];
/*     */   }
/*     */   
/*     */   private static BooleanSupplier a(Path ☃, Path path1) {
/* 463 */     return new BooleanSupplier(☃, path1)
/*     */       {
/*     */         public boolean getAsBoolean() {
/*     */           try {
/* 467 */             Files.move(this.a, this.b, new java.nio.file.CopyOption[0]);
/* 468 */             return true;
/* 469 */           } catch (IOException ☃) {
/* 470 */             x.m().error("Failed to rename", ☃);
/* 471 */             return false;
/*     */           } 
/*     */         }
/*     */ 
/*     */         
/*     */         public String toString() {
/* 477 */           return "rename " + this.a + " to " + this.b;
/*     */         }
/*     */       };
/*     */   }
/*     */   
/*     */   private static BooleanSupplier a(Path ☃) {
/* 483 */     return new BooleanSupplier(☃)
/*     */       {
/*     */         public boolean getAsBoolean() {
/*     */           try {
/* 487 */             Files.deleteIfExists(this.a);
/* 488 */             return true;
/* 489 */           } catch (IOException ☃) {
/* 490 */             x.m().warn("Failed to delete", ☃);
/* 491 */             return false;
/*     */           } 
/*     */         }
/*     */ 
/*     */         
/*     */         public String toString() {
/* 497 */           return "delete old " + this.a;
/*     */         }
/*     */       };
/*     */   }
/*     */   
/*     */   private static BooleanSupplier b(Path ☃) {
/* 503 */     return new BooleanSupplier(☃)
/*     */       {
/*     */         public boolean getAsBoolean() {
/* 506 */           return !Files.exists(this.a, new java.nio.file.LinkOption[0]);
/*     */         }
/*     */ 
/*     */         
/*     */         public String toString() {
/* 511 */           return "verify that " + this.a + " is deleted";
/*     */         }
/*     */       };
/*     */   }
/*     */   
/*     */   private static BooleanSupplier c(Path ☃) {
/* 517 */     return new BooleanSupplier(☃)
/*     */       {
/*     */         public boolean getAsBoolean() {
/* 520 */           return Files.isRegularFile(this.a, new java.nio.file.LinkOption[0]);
/*     */         }
/*     */ 
/*     */         
/*     */         public String toString() {
/* 525 */           return "verify that " + this.a + " is present";
/*     */         }
/*     */       };
/*     */   }
/*     */   
/*     */   private static boolean a(BooleanSupplier... ☃) {
/* 531 */     for (BooleanSupplier booleanSupplier : ☃) {
/* 532 */       if (!booleanSupplier.getAsBoolean()) {
/* 533 */         g.warn("Failed to execute {}", booleanSupplier);
/* 534 */         return false;
/*     */       } 
/*     */     } 
/* 537 */     return true;
/*     */   }
/*     */   
/*     */   private static boolean a(int ☃, String str, BooleanSupplier... arrayOfBooleanSupplier) {
/* 541 */     for (int i = 0; i < ☃; i++) {
/* 542 */       if (a(arrayOfBooleanSupplier)) {
/* 543 */         return true;
/*     */       }
/* 545 */       g.error("Failed to {}, retrying {}/{}", str, Integer.valueOf(i), Integer.valueOf(☃));
/*     */     } 
/* 547 */     g.error("Failed to {}, aborting, progress might be lost", str);
/* 548 */     return false;
/*     */   }
/*     */   
/*     */   public static void a(File ☃, File file1, File file2) {
/* 552 */     a(☃.toPath(), file1.toPath(), file2.toPath());
/*     */   }
/*     */   
/*     */   public static void a(Path ☃, Path path1, Path path2) {
/* 556 */     int i = 10;
/*     */     
/* 558 */     if (Files.exists(☃, new java.nio.file.LinkOption[0]) && 
/* 559 */       !a(10, "create backup " + path2, new BooleanSupplier[] {
/* 560 */           a(path2), 
/* 561 */           a(☃, path2), 
/* 562 */           c(path2)
/*     */         })) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 569 */     if (!a(10, "remove old " + ☃, new BooleanSupplier[] {
/* 570 */           a(☃), 
/* 571 */           b(☃)
/*     */         })) {
/*     */       return;
/*     */     }
/*     */     
/* 576 */     if (!a(10, "replace " + ☃ + " with " + path1, new BooleanSupplier[] {
/* 577 */           a(path1, ☃), 
/* 578 */           c(☃)
/*     */         })) {
/* 580 */       a(10, "restore " + ☃ + " from " + path2, new BooleanSupplier[] {
/* 581 */             a(path2, ☃), 
/* 582 */             c(☃)
/*     */           });
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static int a(String ☃, int i, int j) {
/* 589 */     int k = ☃.length();
/* 590 */     if (j >= 0) {
/* 591 */       for (int m = 0; i < k && m < j; m++) {
/* 592 */         if (Character.isHighSurrogate(☃.charAt(i++)) && i < k && 
/* 593 */           Character.isLowSurrogate(☃.charAt(i))) {
/* 594 */           i++;
/*     */         }
/*     */       } 
/*     */     } else {
/* 598 */       for (int m = j; i > 0 && m < 0; m++) {
/* 599 */         if (Character.isLowSurrogate(☃.charAt(--i)) && i > 0 && 
/* 600 */           Character.isHighSurrogate(☃.charAt(i - 1))) {
/* 601 */           i--;
/*     */         }
/*     */       } 
/*     */     } 
/* 605 */     return i;
/*     */   }
/*     */   
/*     */   public static Consumer<String> a(String ☃, Consumer<String> consumer) {
/* 609 */     return str2 -> ☃.accept(str1 + str2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static DataResult<int[]> a(IntStream ☃, int i) {
/* 616 */     int[] arrayOfInt = ☃.limit((i + 1)).toArray();
/* 617 */     if (arrayOfInt.length != i) {
/* 618 */       String str = "Input is not a list of " + i + " ints";
/* 619 */       if (arrayOfInt.length >= i) {
/* 620 */         return DataResult.error(str, Arrays.copyOf(arrayOfInt, i));
/*     */       }
/* 622 */       return DataResult.error(str);
/*     */     } 
/*     */     
/* 625 */     return DataResult.success(arrayOfInt);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void l() {
/* 631 */     Thread ☃ = new Thread("Timer hack thread")
/*     */       {
/*     */         public void run() {
/*     */           try {
/*     */             while (true)
/* 636 */               Thread.sleep(2147483647L); 
/* 637 */           } catch (InterruptedException ☃) {
/* 638 */             x.m().warn("Timer hack thread interrupted, that really should not happen");
/*     */             
/*     */             return;
/*     */           } 
/*     */         }
/*     */       };
/* 644 */     ☃.setDaemon(true);
/* 645 */     ☃.setUncaughtExceptionHandler(new o(g));
/* 646 */     ☃.start();
/*     */   }
/*     */   
/*     */   public static void b(Path ☃, Path path1, Path path2) throws IOException {
/* 650 */     Path path3 = ☃.relativize(path2);
/* 651 */     Path path4 = path1.resolve(path3);
/* 652 */     Files.copy(path2, path4, new java.nio.file.CopyOption[0]);
/*     */   }
/*     */   
/*     */   public static String a(String ☃, j j1) {
/* 656 */     return ☃.toLowerCase(Locale.ROOT).chars().<CharSequence>mapToObj(i -> ☃.test((char)i) ? Character.toString((char)i) : "_").collect(Collectors.joining());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */