/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ public class aey<T extends Throwable>
/*    */ {
/*    */   @Nullable
/*    */   private T a;
/*    */   
/*    */   public void a(T ☃) {
/* 10 */     if (this.a == null) {
/* 11 */       this.a = ☃;
/*    */     } else {
/* 13 */       this.a.addSuppressed((Throwable)☃);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a() throws T {
/* 18 */     if (this.a != null)
/* 19 */       throw this.a; 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */