/*    */ import java.util.Queue;
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
/*    */ public final class c<T>
/*    */   implements aog<T, T>
/*    */ {
/*    */   private final Queue<T> a;
/*    */   
/*    */   public c(Queue<T> ☃) {
/* 23 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public T a() {
/* 29 */     return this.a.poll();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(T ☃) {
/* 34 */     return this.a.add(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 39 */     return this.a.isEmpty();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aog$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */