/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class se
/*    */   implements oj<sa>
/*    */ {
/*    */   private String a;
/*    */   
/*    */   public se() {}
/*    */   
/*    */   public se(String ☃) {
/* 17 */     if (☃.length() > 256) {
/* 18 */       ☃ = ☃.substring(0, 256);
/*    */     }
/*    */     
/* 21 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 26 */     this.a = ☃.e(256);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 31 */     ☃.a(this.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(sa ☃) {
/* 36 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public String b() {
/* 40 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\se.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */