/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class oo
/*    */   implements oj<om>
/*    */ {
/*    */   private int a;
/*    */   private double b;
/*    */   private double c;
/*    */   private double d;
/*    */   private int e;
/*    */   
/*    */   public oo() {}
/*    */   
/*    */   public oo(aqg ☃) {
/* 21 */     this.a = ☃.Y();
/* 22 */     this.b = ☃.cD();
/* 23 */     this.c = ☃.cE();
/* 24 */     this.d = ☃.cH();
/* 25 */     this.e = ☃.g();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 30 */     this.a = ☃.i();
/* 31 */     this.b = ☃.readDouble();
/* 32 */     this.c = ☃.readDouble();
/* 33 */     this.d = ☃.readDouble();
/* 34 */     this.e = ☃.readShort();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 39 */     ☃.d(this.a);
/* 40 */     ☃.writeDouble(this.b);
/* 41 */     ☃.writeDouble(this.c);
/* 42 */     ☃.writeDouble(this.d);
/* 43 */     ☃.writeShort(this.e);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 48 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public int b() {
/* 52 */     return this.a;
/*    */   }
/*    */   
/*    */   public double c() {
/* 56 */     return this.b;
/*    */   }
/*    */   
/*    */   public double d() {
/* 60 */     return this.c;
/*    */   }
/*    */   
/*    */   public double e() {
/* 64 */     return this.d;
/*    */   }
/*    */   
/*    */   public int f() {
/* 68 */     return this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\oo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */