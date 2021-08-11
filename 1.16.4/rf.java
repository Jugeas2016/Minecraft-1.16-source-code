/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class rf
/*    */   implements oj<om>
/*    */ {
/*    */   private float a;
/*    */   private int b;
/*    */   private float c;
/*    */   
/*    */   public rf() {}
/*    */   
/*    */   public rf(float ☃, int i, float f1) {
/* 17 */     this.a = ☃;
/* 18 */     this.b = i;
/* 19 */     this.c = f1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 24 */     this.a = ☃.readFloat();
/* 25 */     this.b = ☃.i();
/* 26 */     this.c = ☃.readFloat();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 31 */     ☃.writeFloat(this.a);
/* 32 */     ☃.d(this.b);
/* 33 */     ☃.writeFloat(this.c);
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
/*    */   public float d() {
/* 50 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\rf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */