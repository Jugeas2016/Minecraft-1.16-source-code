/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class rc
/*    */   implements oj<om>
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   private int d;
/*    */   
/*    */   public rc() {}
/*    */   
/*    */   public rc(aqa ☃) {
/* 21 */     this(☃.Y(), ☃.cC());
/*    */   }
/*    */   
/*    */   public rc(int ☃, dcn dcn1) {
/* 25 */     this.a = ☃;
/* 26 */     double d1 = 3.9D;
/* 27 */     double d2 = afm.a(dcn1.b, -3.9D, 3.9D);
/* 28 */     double d3 = afm.a(dcn1.c, -3.9D, 3.9D);
/* 29 */     double d4 = afm.a(dcn1.d, -3.9D, 3.9D);
/* 30 */     this.b = (int)(d2 * 8000.0D);
/* 31 */     this.c = (int)(d3 * 8000.0D);
/* 32 */     this.d = (int)(d4 * 8000.0D);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 37 */     this.a = ☃.i();
/* 38 */     this.b = ☃.readShort();
/* 39 */     this.c = ☃.readShort();
/* 40 */     this.d = ☃.readShort();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 45 */     ☃.d(this.a);
/* 46 */     ☃.writeShort(this.b);
/* 47 */     ☃.writeShort(this.c);
/* 48 */     ☃.writeShort(this.d);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 53 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public int b() {
/* 57 */     return this.a;
/*    */   }
/*    */   
/*    */   public int c() {
/* 61 */     return this.b;
/*    */   }
/*    */   
/*    */   public int d() {
/* 65 */     return this.c;
/*    */   }
/*    */   
/*    */   public int e() {
/* 69 */     return this.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\rc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */