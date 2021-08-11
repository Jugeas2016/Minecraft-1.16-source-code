/*    */ import com.google.common.collect.Queues;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import java.util.Queue;
/*    */ import java.util.concurrent.ConcurrentLinkedQueue;
/*    */ import java.util.stream.Collectors;
/*    */ import java.util.stream.IntStream;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ public interface aog<T, F> {
/*    */   @Nullable
/*    */   F a();
/*    */   
/*    */   boolean a(T paramT);
/*    */   
/*    */   boolean b();
/*    */   
/*    */   public static final class c<T>
/*    */     implements aog<T, T> {
/*    */     private final Queue<T> a;
/*    */     
/*    */     public c(Queue<T> ☃) {
/* 23 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     @Nullable
/*    */     public T a() {
/* 29 */       return this.a.poll();
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean a(T ☃) {
/* 34 */       return this.a.add(☃);
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean b() {
/* 39 */       return this.a.isEmpty();
/*    */     }
/*    */   }
/*    */   
/*    */   public static final class b implements Runnable {
/*    */     private final int a;
/*    */     private final Runnable b;
/*    */     
/*    */     public b(int ☃, Runnable runnable) {
/* 48 */       this.a = ☃;
/* 49 */       this.b = runnable;
/*    */     }
/*    */ 
/*    */     
/*    */     public void run() {
/* 54 */       this.b.run();
/*    */     }
/*    */     
/*    */     public int a() {
/* 58 */       return this.a;
/*    */     }
/*    */   }
/*    */   
/*    */   public static final class a implements aog<b, Runnable> {
/*    */     private final List<Queue<Runnable>> a;
/*    */     
/*    */     public a(int ☃) {
/* 66 */       this.a = (List<Queue<Runnable>>)IntStream.range(0, ☃).mapToObj(☃ -> Queues.newConcurrentLinkedQueue()).collect(Collectors.toList());
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     @Nullable
/*    */     public Runnable c() {
/* 73 */       for (Queue<Runnable> ☃ : this.a) {
/* 74 */         Runnable runnable = ☃.poll();
/* 75 */         if (runnable != null) {
/* 76 */           return runnable;
/*    */         }
/*    */       } 
/* 79 */       return null;
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean a(aog.b ☃) {
/* 84 */       int i = ☃.a();
/* 85 */       ((Queue<aog.b>)this.a.get(i)).add(☃);
/* 86 */       return true;
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean b() {
/* 91 */       return this.a.stream().allMatch(Collection::isEmpty);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */