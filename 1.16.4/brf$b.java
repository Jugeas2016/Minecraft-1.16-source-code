/*    */ import java.util.function.Predicate;
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
/*    */ public enum b
/*    */ {
/* 68 */   a(☃ -> false),
/* 69 */   b(cux::b), c(cux::b); static {
/* 70 */     c = new b("ANY", 2, ☃ -> !☃.c());
/*    */   }
/*    */   
/*    */   private final Predicate<cux> d;
/*    */   
/*    */   b(Predicate<cux> ☃) {
/* 76 */     this.d = ☃;
/*    */   }
/*    */   
/*    */   public boolean a(cux ☃) {
/* 80 */     return this.d.test(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\brf$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */