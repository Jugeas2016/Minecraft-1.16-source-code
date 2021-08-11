/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import java.util.function.Function;
/*    */ import java.util.stream.Collectors;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aej<T>
/*    */ {
/* 15 */   private aem<T> a = aem.c();
/* 16 */   private final List<a<T>> b = Lists.newArrayList();
/*    */   private final Function<aen, aem<T>> c;
/*    */   
/*    */   public aej(Function<aen, aem<T>> ☃) {
/* 20 */     this.c = ☃;
/*    */   }
/*    */   
/*    */   public ael.e<T> a(String ☃) {
/* 24 */     a<T> a = new a<>(new vk(☃));
/* 25 */     this.b.add(a);
/* 26 */     return a;
/*    */   }
/*    */   
/*    */   public void a() {
/* 30 */     this.a = aem.c();
/* 31 */     ael<T> ☃ = aei.a();
/* 32 */     this.b.forEach(a1 -> a1.a(()));
/*    */   }
/*    */   
/*    */   public void a(aen ☃) {
/* 36 */     aem<T> aem1 = this.c.apply(☃);
/* 37 */     this.a = aem1;
/* 38 */     this.b.forEach(a1 -> a1.a(☃::a));
/*    */   }
/*    */   
/*    */   public aem<T> b() {
/* 42 */     return this.a;
/*    */   }
/*    */   
/*    */   public List<? extends ael.e<T>> c() {
/* 46 */     return (List)this.b;
/*    */   }
/*    */   
/*    */   public Set<vk> b(aen ☃) {
/* 50 */     aem<T> aem1 = this.c.apply(☃);
/* 51 */     Set<vk> set = (Set<vk>)this.b.stream().map(a::a).collect(Collectors.toSet());
/* 52 */     ImmutableSet<vk> immutableSet = ImmutableSet.copyOf(aem1.b());
/* 53 */     return (Set<vk>)Sets.difference(set, (Set)immutableSet);
/*    */   }
/*    */   
/*    */   static class a<T> implements ael.e<T> {
/*    */     @Nullable
/*    */     private ael<T> b;
/*    */     protected final vk a;
/*    */     
/*    */     private a(vk ☃) {
/* 62 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public vk a() {
/* 67 */       return this.a;
/*    */     }
/*    */     
/*    */     private ael<T> c() {
/* 71 */       if (this.b == null) {
/* 72 */         throw new IllegalStateException("Tag " + this.a + " used before it was bound");
/*    */       }
/* 74 */       return this.b;
/*    */     }
/*    */     
/*    */     void a(Function<vk, ael<T>> ☃) {
/* 78 */       this.b = ☃.apply(this.a);
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean a(T ☃) {
/* 83 */       return c().a(☃);
/*    */     }
/*    */ 
/*    */     
/*    */     public List<T> b() {
/* 88 */       return c().b();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aej.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */