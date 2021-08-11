/*    */ import com.google.common.collect.AbstractIterator;
/*    */ import com.google.common.collect.Iterators;
/*    */ import com.google.common.collect.PeekingIterator;
/*    */ import java.util.Comparator;
/*    */ import java.util.Iterator;
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
/*    */ class a<T>
/*    */   extends AbstractIterator<T>
/*    */ {
/*    */   private final PeekingIterator<T> a;
/*    */   private final PeekingIterator<T> b;
/*    */   private final Comparator<T> c;
/*    */   
/*    */   public a(Iterator<T> ☃, Iterator<T> iterator1, Comparator<T> comparator) {
/* 60 */     this.a = Iterators.peekingIterator(☃);
/* 61 */     this.b = Iterators.peekingIterator(iterator1);
/*    */     
/* 63 */     this.c = comparator;
/*    */   }
/*    */ 
/*    */   
/*    */   protected T computeNext() {
/* 68 */     boolean ☃ = !this.a.hasNext();
/* 69 */     boolean bool1 = !this.b.hasNext();
/* 70 */     if (☃ && bool1) {
/* 71 */       return (T)endOfData();
/*    */     }
/*    */     
/* 74 */     if (☃) {
/* 75 */       return (T)this.b.next();
/*    */     }
/* 77 */     if (bool1) {
/* 78 */       return (T)this.a.next();
/*    */     }
/*    */     
/* 81 */     int i = this.c.compare((T)this.a.peek(), (T)this.b.peek());
/* 82 */     if (i == 0) {
/* 83 */       this.b.next();
/*    */     }
/*    */     
/* 86 */     return (i <= 0) ? (T)this.a.next() : (T)this.b.next();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ena$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */