/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class tp
/*    */   implements oj<sa>
/*    */ {
/*    */   private fx a;
/*    */   private String[] b;
/*    */   
/*    */   public tp() {}
/*    */   
/*    */   public tp(fx ☃, String str1, String str2, String str3, String str4) {
/* 18 */     this.a = ☃;
/* 19 */     this.b = new String[] { str1, str2, str3, str4 };
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 24 */     this.a = ☃.e();
/* 25 */     this.b = new String[4];
/* 26 */     for (int i = 0; i < 4; i++) {
/* 27 */       this.b[i] = ☃.e(384);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 33 */     ☃.a(this.a);
/* 34 */     for (int i = 0; i < 4; i++) {
/* 35 */       ☃.a(this.b[i]);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(sa ☃) {
/* 41 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public fx b() {
/* 45 */     return this.a;
/*    */   }
/*    */   
/*    */   public String[] c() {
/* 49 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\tp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */