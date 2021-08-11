/*    */ import java.util.Comparator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bsp<T>
/*    */ {
/*    */   private static long d;
/*    */   private final T e;
/*    */   public final fx a;
/*    */   public final long b;
/*    */   public final bsq c;
/* 13 */   private final long f = d++;
/*    */   
/*    */   public bsp(fx ☃, T t) {
/* 16 */     this(☃, t, 0L, bsq.d);
/*    */   }
/*    */   
/*    */   public bsp(fx ☃, T t, long l, bsq bsq1) {
/* 20 */     this.a = ☃.h();
/* 21 */     this.e = t;
/* 22 */     this.b = l;
/* 23 */     this.c = bsq1;
/*    */   }
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
/*    */   public boolean equals(Object ☃) {
/* 40 */     if (☃ instanceof bsp) {
/* 41 */       bsp<?> bsp1 = (bsp)☃;
/* 42 */       return (this.a.equals(bsp1.a) && this.e == bsp1.e);
/*    */     } 
/* 44 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 49 */     return this.a.hashCode();
/*    */   }
/*    */   
/*    */   public static <T> Comparator<bsp<T>> a() {
/* 53 */     return Comparator.comparingLong(☃ -> ☃.b).thenComparing(☃ -> ☃.c).thenComparingLong(☃ -> ☃.f);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 58 */     return (new StringBuilder()).append(this.e).append(": ").append(this.a).append(", ").append(this.b).append(", ").append(this.c).append(", ").append(this.f).toString();
/*    */   }
/*    */   
/*    */   public T b() {
/* 62 */     return this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bsp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */