/*    */ import java.util.Objects;
/*    */ 
/*    */ public final class aak<T>
/*    */   implements Comparable<aak<?>>
/*    */ {
/*    */   private final aal<T> a;
/*    */   private final int b;
/*    */   private final T c;
/*    */   private long d;
/*    */   
/*    */   protected aak(aal<T> ☃, int i, T t) {
/* 12 */     this.a = ☃;
/* 13 */     this.b = i;
/* 14 */     this.c = t;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int a(aak<?> ☃) {
/* 20 */     int i = Integer.compare(this.b, ☃.b);
/* 21 */     if (i != 0) {
/* 22 */       return i;
/*    */     }
/*    */     
/* 25 */     int j = Integer.compare(System.identityHashCode(this.a), System.identityHashCode(☃.a));
/* 26 */     if (j != 0) {
/* 27 */       return j;
/*    */     }
/*    */     
/* 30 */     return this.a.a().compare(this.c, ☃.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 35 */     if (this == ☃) {
/* 36 */       return true;
/*    */     }
/* 38 */     if (!(☃ instanceof aak)) {
/* 39 */       return false;
/*    */     }
/* 41 */     aak<?> aak1 = (aak)☃;
/* 42 */     return (this.b == aak1.b && Objects.equals(this.a, aak1.a) && Objects.equals(this.c, aak1.c));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 47 */     return Objects.hash(new Object[] { this.a, Integer.valueOf(this.b), this.c });
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 52 */     return "Ticket[" + this.a + " " + this.b + " (" + this.c + ")] at " + this.d;
/*    */   }
/*    */   
/*    */   public aal<T> a() {
/* 56 */     return this.a;
/*    */   }
/*    */   
/*    */   public int b() {
/* 60 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(long ☃) {
/* 65 */     this.d = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean b(long ☃) {
/* 70 */     long l = this.a.b();
/* 71 */     return (l != 0L && ☃ - this.d > l);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */