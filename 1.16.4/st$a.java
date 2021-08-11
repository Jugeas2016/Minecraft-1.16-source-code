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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */   extends st
/*    */ {
/*    */   public a() {
/* 58 */     this.g = true;
/*    */   }
/*    */   
/*    */   public a(double ☃, double d1, double d2, boolean bool) {
/* 62 */     this.a = ☃;
/* 63 */     this.b = d1;
/* 64 */     this.c = d2;
/* 65 */     this.f = bool;
/* 66 */     this.g = true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 71 */     this.a = ☃.readDouble();
/* 72 */     this.b = ☃.readDouble();
/* 73 */     this.c = ☃.readDouble();
/* 74 */     super.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 79 */     ☃.writeDouble(this.a);
/* 80 */     ☃.writeDouble(this.b);
/* 81 */     ☃.writeDouble(this.c);
/* 82 */     super.b(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\st$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */