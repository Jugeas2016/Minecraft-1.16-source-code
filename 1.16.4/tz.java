/*    */ import java.io.IOException;
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
/*    */ public class tz
/*    */   implements oj<ty>
/*    */ {
/*    */   private int a;
/*    */   private vk b;
/*    */   private nf c;
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 27 */     this.a = ☃.i();
/* 28 */     this.b = ☃.p();
/* 29 */     int i = ☃.readableBytes();
/* 30 */     if (i < 0 || i > 1048576) {
/* 31 */       throw new IOException("Payload may not be larger than 1048576 bytes");
/*    */     }
/* 33 */     this.c = new nf(☃.readBytes(i));
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 38 */     ☃.d(this.a);
/* 39 */     ☃.a(this.b);
/* 40 */     ☃.writeBytes(this.c.copy());
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ty ☃) {
/* 45 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public int b() {
/* 49 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\tz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */