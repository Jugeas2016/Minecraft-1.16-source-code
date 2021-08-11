/*    */ import java.util.Objects;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class adx<T>
/*    */   extends ddq
/*    */ {
/*    */   private final ady o;
/*    */   private final T p;
/*    */   private final adz<T> q;
/*    */   
/*    */   protected adx(adz<T> ☃, T t, ady ady1) {
/* 16 */     super(a(☃, t));
/* 17 */     this.q = ☃;
/* 18 */     this.o = ady1;
/* 19 */     this.p = t;
/*    */   }
/*    */   
/*    */   public static <T> String a(adz<T> ☃, T t) {
/* 23 */     return a(gm.ag.b(☃)) + ":" + a(☃.a().b(t));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static <T> String a(@Nullable vk ☃) {
/* 29 */     return ☃.toString().replace(':', '.');
/*    */   }
/*    */   
/*    */   public adz<T> a() {
/* 33 */     return this.q;
/*    */   }
/*    */   
/*    */   public T b() {
/* 37 */     return this.p;
/*    */   }
/*    */   
/*    */   public String a(int ☃) {
/* 41 */     return this.o.format(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 46 */     return (this == ☃ || (☃ instanceof adx && Objects.equals(c(), ((adx)☃).c())));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 51 */     return c().hashCode();
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 56 */     return "Stat{name=" + 
/* 57 */       c() + ", formatter=" + this.o + '}';
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\adx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */