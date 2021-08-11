/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class re
/*    */   implements oj<om>
/*    */ {
/*    */   private float a;
/*    */   private int b;
/*    */   private int c;
/*    */   
/*    */   public re() {}
/*    */   
/*    */   public re(float ☃, int i, int j) {
/* 17 */     this.a = ☃;
/* 18 */     this.b = i;
/* 19 */     this.c = j;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 24 */     this.a = ☃.readFloat();
/* 25 */     this.c = ☃.i();
/* 26 */     this.b = ☃.i();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 31 */     ☃.writeFloat(this.a);
/* 32 */     ☃.d(this.c);
/* 33 */     ☃.d(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 38 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public float b() {
/* 42 */     return this.a;
/*    */   }
/*    */   
/*    */   public int c() {
/* 46 */     return this.b;
/*    */   }
/*    */   
/*    */   public int d() {
/* 50 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\re.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */