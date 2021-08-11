/*    */ import com.google.common.collect.AbstractIterator;
/*    */ import com.google.common.collect.Iterators;
/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.common.collect.PeekingIterator;
/*    */ import java.util.Comparator;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import java.util.Locale;
/*    */ import java.util.function.Function;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ena<T>
/*    */   extends emz<T>
/*    */ {
/* 17 */   protected end<T> c = new end<>();
/*    */   
/*    */   private final Function<T, Stream<String>> d;
/*    */   
/*    */   public ena(Function<T, Stream<String>> ☃, Function<T, Stream<vk>> function) {
/* 22 */     super(function);
/* 23 */     this.d = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b() {
/* 28 */     this.c = new end<>();
/* 29 */     super.b();
/* 30 */     this.c.a();
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b(T ☃) {
/* 35 */     super.b(☃);
/* 36 */     ((Stream)this.d.apply(☃)).forEach(str -> this.c.a((T)☃, str.toLowerCase(Locale.ROOT)));
/*    */   }
/*    */ 
/*    */   
/*    */   public List<T> a(String ☃) {
/* 41 */     int i = ☃.indexOf(':');
/* 42 */     if (i < 0) {
/* 43 */       return this.c.a(☃);
/*    */     }
/*    */     
/* 46 */     List<T> list1 = this.a.a(☃.substring(0, i).trim());
/* 47 */     String str = ☃.substring(i + 1).trim();
/* 48 */     List<T> list2 = this.b.a(str);
/* 49 */     List<T> list3 = this.c.a(str);
/*    */     
/* 51 */     return Lists.newArrayList((Iterator)new emz.a(list1.iterator(), (Iterator<?>)new a(list2.iterator(), list3.iterator(), this::a), this::a));
/*    */   }
/*    */   
/*    */   static class a<T> extends AbstractIterator<T> {
/*    */     private final PeekingIterator<T> a;
/*    */     private final PeekingIterator<T> b;
/*    */     private final Comparator<T> c;
/*    */     
/*    */     public a(Iterator<T> ☃, Iterator<T> iterator1, Comparator<T> comparator) {
/* 60 */       this.a = Iterators.peekingIterator(☃);
/* 61 */       this.b = Iterators.peekingIterator(iterator1);
/*    */       
/* 63 */       this.c = comparator;
/*    */     }
/*    */ 
/*    */     
/*    */     protected T computeNext() {
/* 68 */       boolean ☃ = !this.a.hasNext();
/* 69 */       boolean bool1 = !this.b.hasNext();
/* 70 */       if (☃ && bool1) {
/* 71 */         return (T)endOfData();
/*    */       }
/*    */       
/* 74 */       if (☃) {
/* 75 */         return (T)this.b.next();
/*    */       }
/* 77 */       if (bool1) {
/* 78 */         return (T)this.a.next();
/*    */       }
/*    */       
/* 81 */       int i = this.c.compare((T)this.a.peek(), (T)this.b.peek());
/* 82 */       if (i == 0) {
/* 83 */         this.b.next();
/*    */       }
/*    */       
/* 86 */       return (i <= 0) ? (T)this.a.next() : (T)this.b.next();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ena.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */