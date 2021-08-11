/*    */ import java.io.IOException;
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
/*    */ abstract class a
/*    */   implements AutoCloseable
/*    */ {
/*    */   protected boolean a;
/*    */   
/*    */   private a() {}
/*    */   
/*    */   int a(long ☃, long l1, int i) {
/*    */     try {
/* 53 */       return b(l1, i);
/* 54 */     } catch (IOException iOException) {
/* 55 */       this.a = true;
/* 56 */       return 0;
/*    */     } 
/*    */   }
/*    */   
/*    */   void a(long ☃, int i) {
/*    */     try {
/* 62 */       a(i);
/* 63 */     } catch (IOException iOException) {
/* 64 */       this.a = true;
/*    */     } 
/*    */   }
/*    */   
/*    */   int a(long ☃) {
/* 69 */     return this.a ? 1 : 0;
/*    */   }
/*    */   
/*    */   protected abstract int b(long paramLong, int paramInt) throws IOException;
/*    */   
/*    */   protected abstract void a(int paramInt) throws IOException;
/*    */   
/*    */   public abstract void close() throws IOException;
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\deu$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */