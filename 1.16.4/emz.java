/*     */ import com.google.common.collect.AbstractIterator;
/*     */ import com.google.common.collect.Iterators;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.PeekingIterator;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
/*     */ import java.util.Comparator;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.function.Function;
/*     */ import java.util.stream.Stream;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class emz<T>
/*     */   implements emy<T>
/*     */ {
/*  19 */   protected end<T> a = new end<>();
/*  20 */   protected end<T> b = new end<>();
/*     */   
/*     */   private final Function<T, Stream<vk>> c;
/*     */   
/*  24 */   private final List<T> d = Lists.newArrayList();
/*  25 */   private final Object2IntMap<T> e = (Object2IntMap<T>)new Object2IntOpenHashMap();
/*     */   
/*     */   public emz(Function<T, Stream<vk>> ☃) {
/*  28 */     this.c = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  33 */     this.a = new end<>();
/*  34 */     this.b = new end<>();
/*     */     
/*  36 */     for (T ☃ : this.d) {
/*  37 */       b(☃);
/*     */     }
/*     */     
/*  40 */     this.a.a();
/*  41 */     this.b.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃) {
/*  46 */     this.e.put(☃, this.d.size());
/*  47 */     this.d.add(☃);
/*  48 */     b(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/*  53 */     this.d.clear();
/*  54 */     this.e.clear();
/*     */   }
/*     */   
/*     */   protected void b(T ☃) {
/*  58 */     ((Stream)this.c.apply(☃)).forEach(vk1 -> {
/*     */           this.a.a((T)☃, vk1.b().toLowerCase(Locale.ROOT));
/*     */           this.b.a((T)☃, vk1.a().toLowerCase(Locale.ROOT));
/*     */         });
/*     */   }
/*     */   
/*     */   protected int a(T ☃, T t1) {
/*  65 */     return Integer.compare(this.e.getInt(☃), this.e.getInt(t1));
/*     */   }
/*     */ 
/*     */   
/*     */   public List<T> a(String ☃) {
/*  70 */     int i = ☃.indexOf(':');
/*  71 */     if (i == -1) {
/*  72 */       return this.b.a(☃);
/*     */     }
/*     */     
/*  75 */     List<T> list1 = this.a.a(☃.substring(0, i).trim());
/*  76 */     String str = ☃.substring(i + 1).trim();
/*  77 */     List<T> list2 = this.b.a(str);
/*     */     
/*  79 */     return Lists.newArrayList((Iterator)new a(list1.iterator(), list2.iterator(), this::a));
/*     */   }
/*     */   
/*     */   public static class a<T> extends AbstractIterator<T> {
/*     */     private final PeekingIterator<T> a;
/*     */     private final PeekingIterator<T> b;
/*     */     private final Comparator<T> c;
/*     */     
/*     */     public a(Iterator<T> ☃, Iterator<T> iterator1, Comparator<T> comparator) {
/*  88 */       this.a = Iterators.peekingIterator(☃);
/*  89 */       this.b = Iterators.peekingIterator(iterator1);
/*     */       
/*  91 */       this.c = comparator;
/*     */     }
/*     */ 
/*     */     
/*     */     protected T computeNext() {
/*     */       while (true) {
/*  97 */         if (!this.a.hasNext() || !this.b.hasNext()) {
/*  98 */           return (T)endOfData();
/*     */         }
/*     */         
/* 101 */         int ☃ = this.c.compare((T)this.a.peek(), (T)this.b.peek());
/* 102 */         if (☃ == 0) {
/* 103 */           this.b.next();
/* 104 */           return (T)this.a.next();
/*     */         } 
/*     */         
/* 107 */         if (☃ < 0) {
/* 108 */           this.a.next(); continue;
/*     */         } 
/* 110 */         this.b.next();
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\emz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */