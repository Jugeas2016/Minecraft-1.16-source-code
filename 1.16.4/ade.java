/*    */ import java.io.ByteArrayOutputStream;
/*    */ import java.io.DataOutputStream;
/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ public class ade
/*    */ {
/*    */   private final ByteArrayOutputStream a;
/*    */   private final DataOutputStream b;
/*    */   
/*    */   public ade(int ☃) {
/* 12 */     this.a = new ByteArrayOutputStream(☃);
/* 13 */     this.b = new DataOutputStream(this.a);
/*    */   }
/*    */   
/*    */   public void a(byte[] ☃) throws IOException {
/* 17 */     this.b.write(☃, 0, ☃.length);
/*    */   }
/*    */   
/*    */   public void a(String ☃) throws IOException {
/* 21 */     this.b.writeBytes(☃);
/* 22 */     this.b.write(0);
/*    */   }
/*    */   
/*    */   public void a(int ☃) throws IOException {
/* 26 */     this.b.write(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(short ☃) throws IOException {
/* 31 */     this.b.writeShort(Short.reverseBytes(☃));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public byte[] a() {
/* 43 */     return this.a.toByteArray();
/*    */   }
/*    */   
/*    */   public void b() {
/* 47 */     this.a.reset();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ade.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */