/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ public class afi<T>
/*    */ {
/*    */   private Supplier<T> a;
/*    */   private T b;
/*    */   
/*    */   public afi(Supplier<T> ☃) {
/* 10 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public T a() {
/* 14 */     Supplier<T> ☃ = this.a;
/* 15 */     if (☃ != null) {
/* 16 */       this.b = ☃.get();
/* 17 */       this.a = null;
/*    */     } 
/*    */     
/* 20 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\afi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */