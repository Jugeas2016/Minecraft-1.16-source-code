/*    */ import com.google.common.base.Predicates;
/*    */ import com.google.common.collect.Iterators;
/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.IdentityHashMap;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gh<T>
/*    */   implements gg<T>
/*    */ {
/*    */   private int a;
/*    */   private final IdentityHashMap<T, Integer> b;
/*    */   private final List<T> c;
/*    */   
/*    */   public gh() {
/* 20 */     this(512);
/*    */   }
/*    */   
/*    */   public gh(int ☃) {
/* 24 */     this.c = Lists.newArrayListWithExpectedSize(☃);
/* 25 */     this.b = new IdentityHashMap<>(☃);
/*    */   }
/*    */   
/*    */   public void a(T ☃, int i) {
/* 29 */     this.b.put(☃, Integer.valueOf(i));
/*    */ 
/*    */     
/* 32 */     while (this.c.size() <= i) {
/* 33 */       this.c.add(null);
/*    */     }
/*    */     
/* 36 */     this.c.set(i, ☃);
/*    */     
/* 38 */     if (this.a <= i) {
/* 39 */       this.a = i + 1;
/*    */     }
/*    */   }
/*    */   
/*    */   public void b(T ☃) {
/* 44 */     a(☃, this.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(T ☃) {
/* 49 */     Integer integer = this.b.get(☃);
/* 50 */     return (integer == null) ? -1 : integer.intValue();
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final T a(int ☃) {
/* 56 */     if (☃ >= 0 && ☃ < this.c.size()) {
/* 57 */       return this.c.get(☃);
/*    */     }
/*    */     
/* 60 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public Iterator<T> iterator() {
/* 65 */     return (Iterator<T>)Iterators.filter(this.c.iterator(), Predicates.notNull());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int a() {
/* 73 */     return this.b.size();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\gh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */