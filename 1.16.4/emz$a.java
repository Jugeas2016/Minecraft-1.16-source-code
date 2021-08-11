/*     */ import com.google.common.collect.AbstractIterator;
/*     */ import com.google.common.collect.Iterators;
/*     */ import com.google.common.collect.PeekingIterator;
/*     */ import java.util.Comparator;
/*     */ import java.util.Iterator;
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
/*     */ public class a<T>
/*     */   extends AbstractIterator<T>
/*     */ {
/*     */   private final PeekingIterator<T> a;
/*     */   private final PeekingIterator<T> b;
/*     */   private final Comparator<T> c;
/*     */   
/*     */   public a(Iterator<T> ☃, Iterator<T> iterator1, Comparator<T> comparator) {
/*  88 */     this.a = Iterators.peekingIterator(☃);
/*  89 */     this.b = Iterators.peekingIterator(iterator1);
/*     */     
/*  91 */     this.c = comparator;
/*     */   }
/*     */ 
/*     */   
/*     */   protected T computeNext() {
/*     */     while (true) {
/*  97 */       if (!this.a.hasNext() || !this.b.hasNext()) {
/*  98 */         return (T)endOfData();
/*     */       }
/*     */       
/* 101 */       int ☃ = this.c.compare((T)this.a.peek(), (T)this.b.peek());
/* 102 */       if (☃ == 0) {
/* 103 */         this.b.next();
/* 104 */         return (T)this.a.next();
/*     */       } 
/*     */       
/* 107 */       if (☃ < 0) {
/* 108 */         this.a.next(); continue;
/*     */       } 
/* 110 */       this.b.next();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\emz$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */