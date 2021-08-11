/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ov
/*    */   implements oj<om>
/*    */ {
/*    */   private int a;
/*    */   private fx b;
/*    */   private int c;
/*    */   
/*    */   public ov() {}
/*    */   
/*    */   public ov(int ☃, fx fx1, int i) {
/* 18 */     this.a = ☃;
/* 19 */     this.b = fx1;
/* 20 */     this.c = i;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 25 */     this.a = ☃.i();
/* 26 */     this.b = ☃.e();
/* 27 */     this.c = ☃.readUnsignedByte();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 32 */     ☃.d(this.a);
/* 33 */     ☃.a(this.b);
/* 34 */     ☃.writeByte(this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 39 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public int b() {
/* 43 */     return this.a;
/*    */   }
/*    */   
/*    */   public fx c() {
/* 47 */     return this.b;
/*    */   }
/*    */   
/*    */   public int d() {
/* 51 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ov.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */