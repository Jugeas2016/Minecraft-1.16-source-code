/*    */ public abstract class aof<R extends Runnable>
/*    */   extends aob<R>
/*    */ {
/*    */   private int b;
/*    */   
/*    */   public aof(String ☃) {
/*  7 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean av() {
/* 12 */     return (bn() || super.av());
/*    */   }
/*    */   
/*    */   protected boolean bn() {
/* 16 */     return (this.b != 0);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void c(R ☃) {
/* 21 */     this.b++;
/*    */     try {
/* 23 */       super.c(☃);
/*    */     } finally {
/* 25 */       this.b--;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aof.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */