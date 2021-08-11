/*    */ import com.google.common.annotations.VisibleForTesting;
/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aei<T>
/*    */   implements ael<T>
/*    */ {
/*    */   private final ImmutableList<T> b;
/*    */   private final Set<T> c;
/*    */   @VisibleForTesting
/*    */   protected final Class<?> a;
/*    */   
/*    */   protected aei(Set<T> ☃, Class<?> clazz) {
/* 22 */     this.a = clazz;
/* 23 */     this.c = ☃;
/* 24 */     this.b = ImmutableList.copyOf(☃);
/*    */   }
/*    */   
/*    */   public static <T> aei<T> a() {
/* 28 */     return new aei<>((Set<T>)ImmutableSet.of(), Void.class);
/*    */   }
/*    */   
/*    */   public static <T> aei<T> a(Set<T> ☃) {
/* 32 */     return new aei<>(☃, c(☃));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(T ☃) {
/* 38 */     return (this.a.isInstance(☃) && this.c.contains(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public List<T> b() {
/* 43 */     return (List<T>)this.b;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static <T> Class<?> c(Set<T> ☃) {
/* 54 */     if (☃.isEmpty()) {
/* 55 */       return Void.class;
/*    */     }
/*    */     
/* 58 */     Class<?> clazz = null;
/* 59 */     for (T t : ☃) {
/* 60 */       if (clazz == null) {
/* 61 */         clazz = t.getClass(); continue;
/*    */       } 
/* 63 */       clazz = a(clazz, t.getClass());
/*    */     } 
/*    */     
/* 66 */     return clazz;
/*    */   }
/*    */   
/*    */   private static Class<?> a(Class<?> ☃, Class<?> clazz1) {
/* 70 */     while (!☃.isAssignableFrom(clazz1)) {
/* 71 */       ☃ = ☃.getSuperclass();
/*    */     }
/* 73 */     return ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aei.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */