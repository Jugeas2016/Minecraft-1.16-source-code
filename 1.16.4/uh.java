/*    */ import java.io.IOException;
/*    */ import java.security.PrivateKey;
/*    */ import java.security.PublicKey;
/*    */ import javax.crypto.SecretKey;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class uh
/*    */   implements oj<ue>
/*    */ {
/* 14 */   private byte[] a = new byte[0];
/* 15 */   private byte[] b = new byte[0];
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public uh(SecretKey ☃, PublicKey publicKey, byte[] arrayOfByte) throws aev {
/* 21 */     this.a = aeu.a(publicKey, ☃.getEncoded());
/* 22 */     this.b = aeu.a(publicKey, arrayOfByte);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 27 */     this.a = ☃.a();
/* 28 */     this.b = ☃.a();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 33 */     ☃.a(this.a);
/* 34 */     ☃.a(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ue ☃) {
/* 39 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public SecretKey a(PrivateKey ☃) throws aev {
/* 43 */     return aeu.a(☃, this.a);
/*    */   }
/*    */   
/*    */   public byte[] b(PrivateKey ☃) throws aev {
/* 47 */     return aeu.b(☃, this.b);
/*    */   }
/*    */   
/*    */   public uh() {}
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip\\uh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */