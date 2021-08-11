/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class pn
/*    */   implements oj<om>
/*    */ {
/*    */   private int a;
/*    */   private byte b;
/*    */   
/*    */   public pn() {}
/*    */   
/*    */   public pn(aqa ☃, byte b) {
/* 19 */     this.a = ☃.Y();
/* 20 */     this.b = b;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 25 */     this.a = ☃.readInt();
/* 26 */     this.b = ☃.readByte();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 31 */     ☃.writeInt(this.a);
/* 32 */     ☃.writeByte(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 37 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public aqa a(brx ☃) {
/* 41 */     return ☃.a(this.a);
/*    */   }
/*    */   
/*    */   public byte b() {
/* 45 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\pn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */