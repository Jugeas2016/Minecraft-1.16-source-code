/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class qo
/*    */   implements oj<om>
/*    */ {
/*    */   private String a;
/*    */   private String b;
/*    */   
/*    */   public qo() {}
/*    */   
/*    */   public qo(String ☃, String str1) {
/* 19 */     this.a = ☃;
/* 20 */     this.b = str1;
/*    */     
/* 22 */     if (str1.length() > 40) {
/* 23 */       throw new IllegalArgumentException("Hash is too long (max 40, was " + str1.length() + ")");
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 29 */     this.a = ☃.e(32767);
/* 30 */     this.b = ☃.e(40);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 35 */     ☃.a(this.a);
/* 36 */     ☃.a(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 41 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public String b() {
/* 45 */     return this.a;
/*    */   }
/*    */   
/*    */   public String c() {
/* 49 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\qo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */