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
/*    */ public class os
/*    */   implements oj<om>
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   
/*    */   public os() {}
/*    */   
/*    */   public os(aqa ☃, int i) {
/* 25 */     this.a = ☃.Y();
/* 26 */     this.b = i;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 31 */     this.a = ☃.i();
/* 32 */     this.b = ☃.readUnsignedByte();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 37 */     ☃.d(this.a);
/* 38 */     ☃.writeByte(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 43 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public int b() {
/* 47 */     return this.a;
/*    */   }
/*    */   
/*    */   public int c() {
/* 51 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\os.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */