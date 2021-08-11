/*    */ import com.google.common.collect.Queues;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import java.util.Queue;
/*    */ import java.util.concurrent.ConcurrentLinkedQueue;
/*    */ import java.util.stream.Collectors;
/*    */ import java.util.stream.IntStream;
/*    */ import javax.annotation.Nullable;
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
/*    */ public final class a
/*    */   implements aog<aog.b, Runnable>
/*    */ {
/*    */   private final List<Queue<Runnable>> a;
/*    */   
/*    */   public a(int ☃) {
/* 66 */     this.a = (List<Queue<Runnable>>)IntStream.range(0, ☃).mapToObj(☃ -> Queues.newConcurrentLinkedQueue()).collect(Collectors.toList());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Runnable c() {
/* 73 */     for (Queue<Runnable> ☃ : this.a) {
/* 74 */       Runnable runnable = ☃.poll();
/* 75 */       if (runnable != null) {
/* 76 */         return runnable;
/*    */       }
/*    */     } 
/* 79 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(aog.b ☃) {
/* 84 */     int i = ☃.a();
/* 85 */     ((Queue<aog.b>)this.a.get(i)).add(☃);
/* 86 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 91 */     return this.a.stream().allMatch(Collection::isEmpty);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aog$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */