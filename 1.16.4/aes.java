/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.google.common.collect.Iterators;
/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.AbstractCollection;
/*    */ import java.util.Collection;
/*    */ import java.util.Collections;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.stream.Collectors;
/*    */ 
/*    */ 
/*    */ public class aes<T>
/*    */   extends AbstractCollection<T>
/*    */ {
/* 17 */   private final Map<Class<?>, List<T>> a = Maps.newHashMap();
/*    */   
/*    */   private final Class<T> b;
/* 20 */   private final List<T> c = Lists.newArrayList();
/*    */   
/*    */   public aes(Class<T> ☃) {
/* 23 */     this.b = ☃;
/* 24 */     this.a.put(☃, this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean add(T ☃) {
/* 29 */     boolean bool = false;
/* 30 */     for (Map.Entry<Class<?>, List<T>> entry : this.a.entrySet()) {
/* 31 */       if (((Class)entry.getKey()).isInstance(☃)) {
/* 32 */         bool |= ((List<T>)entry.getValue()).add(☃);
/*    */       }
/*    */     } 
/* 35 */     return bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean remove(Object ☃) {
/* 40 */     boolean bool = false;
/* 41 */     for (Map.Entry<Class<?>, List<T>> entry : this.a.entrySet()) {
/* 42 */       if (((Class)entry.getKey()).isInstance(☃)) {
/* 43 */         List<T> list = entry.getValue();
/* 44 */         bool |= list.remove(☃);
/*    */       } 
/*    */     } 
/* 47 */     return bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean contains(Object ☃) {
/* 52 */     return a(☃.getClass()).contains(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> Collection<S> a(Class<S> ☃) {
/* 57 */     if (!this.b.isAssignableFrom(☃)) {
/* 58 */       throw new IllegalArgumentException("Don't know how to search for " + ☃);
/*    */     }
/* 60 */     List<T> list = this.a.computeIfAbsent(☃, ☃ -> (List)this.c.stream().filter(☃::isInstance).collect(Collectors.toList()));
/* 61 */     return Collections.unmodifiableCollection(list);
/*    */   }
/*    */ 
/*    */   
/*    */   public Iterator<T> iterator() {
/* 66 */     if (this.c.isEmpty()) {
/* 67 */       return Collections.emptyIterator();
/*    */     }
/* 69 */     return (Iterator<T>)Iterators.unmodifiableIterator(this.c.iterator());
/*    */   }
/*    */   
/*    */   public List<T> a() {
/* 73 */     return (List<T>)ImmutableList.copyOf(this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public int size() {
/* 78 */     return this.c.size();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */