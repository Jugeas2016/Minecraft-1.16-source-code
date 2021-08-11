/*    */ public interface cfs
/*    */ {
/*    */   void a(cfu paramcfu, double paramDouble);
/*    */   
/*    */   void a(cfu paramcfu, double paramDouble1, double paramDouble2, long paramLong);
/*    */   
/*    */   void a(cfu paramcfu, double paramDouble1, double paramDouble2);
/*    */   
/*    */   void a(cfu paramcfu, int paramInt);
/*    */   
/*    */   void b(cfu paramcfu, int paramInt);
/*    */   
/*    */   void b(cfu paramcfu, double paramDouble);
/*    */   
/*    */   void c(cfu paramcfu, double paramDouble);
/*    */   
/*    */   public static class a
/*    */     implements cfs {
/*    */     private final cfu a;
/*    */     
/*    */     public a(cfu ☃) {
/* 22 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(cfu ☃, double d) {
/* 27 */       this.a.a(d);
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(cfu ☃, double d1, double d2, long l) {
/* 32 */       this.a.a(d1, d2, l);
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(cfu ☃, double d1, double d2) {
/* 37 */       this.a.c(d1, d2);
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(cfu ☃, int i) {
/* 42 */       this.a.b(i);
/*    */     }
/*    */ 
/*    */     
/*    */     public void b(cfu ☃, int i) {
/* 47 */       this.a.c(i);
/*    */     }
/*    */ 
/*    */     
/*    */     public void b(cfu ☃, double d) {
/* 52 */       this.a.c(d);
/*    */     }
/*    */ 
/*    */     
/*    */     public void c(cfu ☃, double d) {
/* 57 */       this.a.b(d);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cfs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */