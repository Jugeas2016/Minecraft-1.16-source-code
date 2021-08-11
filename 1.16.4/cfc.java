/*    */ 
/*    */ 
/*    */ public enum cfc
/*    */   implements afs
/*    */ {
/*  6 */   a,
/*  7 */   b;
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 12 */     return a();
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 17 */     return (this == a) ? "left" : "right";
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cfc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */