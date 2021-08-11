/*    */ 
/*    */ public class aov<T>
/*    */ {
/*    */   private final aou a;
/*    */   private final T b;
/*    */   
/*    */   public aov(aou ☃, T t) {
/*  8 */     this.a = ☃;
/*  9 */     this.b = t;
/*    */   }
/*    */   
/*    */   public aou a() {
/* 13 */     return this.a;
/*    */   }
/*    */   
/*    */   public T b() {
/* 17 */     return this.b;
/*    */   }
/*    */   
/*    */   public static <T> aov<T> a(T ☃) {
/* 21 */     return new aov<>(aou.a, ☃);
/*    */   }
/*    */   
/*    */   public static <T> aov<T> b(T ☃) {
/* 25 */     return new aov<>(aou.b, ☃);
/*    */   }
/*    */   
/*    */   public static <T> aov<T> c(T ☃) {
/* 29 */     return new aov<>(aou.c, ☃);
/*    */   }
/*    */   
/*    */   public static <T> aov<T> d(T ☃) {
/* 33 */     return new aov<>(aou.d, ☃);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static <T> aov<T> a(T ☃, boolean bool) {
/* 41 */     return bool ? a(☃) : b(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aov.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */