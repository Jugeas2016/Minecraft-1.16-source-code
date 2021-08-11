/*    */ import java.io.IOException;
/*    */ import java.security.PublicKey;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ub
/*    */   implements oj<ty>
/*    */ {
/*    */   private String a;
/*    */   private byte[] b;
/*    */   private byte[] c;
/*    */   
/*    */   public ub() {}
/*    */   
/*    */   public ub(String ☃, byte[] arrayOfByte1, byte[] arrayOfByte2) {
/* 20 */     this.a = ☃;
/* 21 */     this.b = arrayOfByte1;
/* 22 */     this.c = arrayOfByte2;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 27 */     this.a = ☃.e(20);
/* 28 */     this.b = ☃.a();
/* 29 */     this.c = ☃.a();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 34 */     ☃.a(this.a);
/* 35 */     ☃.a(this.b);
/* 36 */     ☃.a(this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ty ☃) {
/* 41 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public String b() {
/* 45 */     return this.a;
/*    */   }
/*    */   
/*    */   public PublicKey c() throws aev {
/* 49 */     return aeu.a(this.b);
/*    */   }
/*    */   
/*    */   public byte[] d() {
/* 53 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip\\ub.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */