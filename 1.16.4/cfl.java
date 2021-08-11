/*    */ 
/*    */ 
/*    */ public enum cfl
/*    */   implements afs
/*    */ {
/*  6 */   a("up"),
/*  7 */   b("side"),
/*  8 */   c("none");
/*    */   
/*    */   private final String d;
/*    */ 
/*    */   
/*    */   cfl(String ☃) {
/* 14 */     this.d = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 19 */     return a();
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 24 */     return this.d;
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 28 */     return (this != c);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cfl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */