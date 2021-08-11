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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ow
/*    */   implements oj<om>
/*    */ {
/*    */   private fx a;
/*    */   private int b;
/*    */   private md c;
/*    */   
/*    */   public ow() {}
/*    */   
/*    */   public ow(fx ☃, int i, md md1) {
/* 34 */     this.a = ☃;
/* 35 */     this.b = i;
/* 36 */     this.c = md1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 41 */     this.a = ☃.e();
/* 42 */     this.b = ☃.readUnsignedByte();
/* 43 */     this.c = ☃.l();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 48 */     ☃.a(this.a);
/* 49 */     ☃.writeByte((byte)this.b);
/* 50 */     ☃.a(this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 55 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public fx b() {
/* 59 */     return this.a;
/*    */   }
/*    */   
/*    */   public int c() {
/* 63 */     return this.b;
/*    */   }
/*    */   
/*    */   public md d() {
/* 67 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */