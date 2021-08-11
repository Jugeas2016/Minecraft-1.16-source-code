/*    */ import java.util.Arrays;
/*    */ import java.util.Optional;
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
/*    */ public enum a
/*    */   implements afs
/*    */ {
/* 33 */   a("rollable"),
/* 34 */   b("aligned");
/*    */   
/*    */   private final String c;
/*    */   
/*    */   a(String ☃) {
/* 39 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 44 */     return this.c;
/*    */   }
/*    */   
/*    */   public static Optional<a> a(String ☃) {
/* 48 */     return Arrays.<a>stream(values()).filter(a1 -> a1.a().equals(☃)).findFirst();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ccz$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */