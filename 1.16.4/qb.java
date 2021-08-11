/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class qb
/*    */   implements oj<om>
/*    */ {
/*    */   private double a;
/*    */   private double b;
/*    */   private double c;
/*    */   private float d;
/*    */   private float e;
/*    */   
/*    */   public qb() {}
/*    */   
/*    */   public qb(aqa ☃) {
/* 20 */     this.a = ☃.cD();
/* 21 */     this.b = ☃.cE();
/* 22 */     this.c = ☃.cH();
/* 23 */     this.d = ☃.p;
/* 24 */     this.e = ☃.q;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 29 */     this.a = ☃.readDouble();
/* 30 */     this.b = ☃.readDouble();
/* 31 */     this.c = ☃.readDouble();
/* 32 */     this.d = ☃.readFloat();
/* 33 */     this.e = ☃.readFloat();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 38 */     ☃.writeDouble(this.a);
/* 39 */     ☃.writeDouble(this.b);
/* 40 */     ☃.writeDouble(this.c);
/* 41 */     ☃.writeFloat(this.d);
/* 42 */     ☃.writeFloat(this.e);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 47 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public double b() {
/* 51 */     return this.a;
/*    */   }
/*    */   
/*    */   public double c() {
/* 55 */     return this.b;
/*    */   }
/*    */   
/*    */   public double d() {
/* 59 */     return this.c;
/*    */   }
/*    */   
/*    */   public float e() {
/* 63 */     return this.d;
/*    */   }
/*    */   
/*    */   public float f() {
/* 67 */     return this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\qb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */