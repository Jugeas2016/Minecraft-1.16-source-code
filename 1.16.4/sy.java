/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class sy
/*    */   implements oj<sa>
/*    */ {
/*    */   private boolean a;
/*    */   
/*    */   public sy() {}
/*    */   
/*    */   public sy(bft ☃) {
/* 18 */     this.a = ☃.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 23 */     byte b = ☃.readByte();
/* 24 */     this.a = ((b & 0x2) != 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 29 */     byte b = 0;
/* 30 */     if (this.a) {
/* 31 */       b = (byte)(b | 0x2);
/*    */     }
/* 33 */     ☃.writeByte(b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(sa ☃) {
/* 38 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 42 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\sy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */