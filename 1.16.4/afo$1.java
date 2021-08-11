/*    */ import java.util.Spliterators;
/*    */ import java.util.function.Consumer;
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
/*    */ class null
/*    */   extends Spliterators.AbstractSpliterator<T>
/*    */ {
/*    */   private int b;
/*    */   
/*    */   null(afo ☃, long l, int i) {
/* 25 */     super(l, i);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean tryAdvance(Consumer<? super T> ☃) {
/* 30 */     while (this.b >= afo.a(this.a).size()) {
/* 31 */       if (!afo.b(this.a).tryAdvance(afo.a(this.a)::add)) {
/* 32 */         return false;
/*    */       }
/*    */     } 
/* 35 */     ☃.accept(afo.a(this.a).get(this.b++));
/* 36 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\afo$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */