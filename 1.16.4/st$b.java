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
/*    */ public class b
/*    */   extends st
/*    */ {
/*    */   public b() {
/* 20 */     this.g = true;
/* 21 */     this.h = true;
/*    */   }
/*    */   
/*    */   public b(double ☃, double d1, double d2, float f1, float f2, boolean bool) {
/* 25 */     this.a = ☃;
/* 26 */     this.b = d1;
/* 27 */     this.c = d2;
/* 28 */     this.d = f1;
/* 29 */     this.e = f2;
/* 30 */     this.f = bool;
/* 31 */     this.h = true;
/* 32 */     this.g = true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 37 */     this.a = ☃.readDouble();
/* 38 */     this.b = ☃.readDouble();
/* 39 */     this.c = ☃.readDouble();
/* 40 */     this.d = ☃.readFloat();
/* 41 */     this.e = ☃.readFloat();
/* 42 */     super.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 47 */     ☃.writeDouble(this.a);
/* 48 */     ☃.writeDouble(this.b);
/* 49 */     ☃.writeDouble(this.c);
/* 50 */     ☃.writeFloat(this.d);
/* 51 */     ☃.writeFloat(this.e);
/* 52 */     super.b(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\st$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */