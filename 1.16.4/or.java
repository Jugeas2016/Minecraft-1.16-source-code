/*    */ import java.io.IOException;
/*    */ import java.util.UUID;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class or
/*    */   implements oj<om>
/*    */ {
/*    */   private int a;
/*    */   private UUID b;
/*    */   private double c;
/*    */   private double d;
/*    */   private double e;
/*    */   private byte f;
/*    */   private byte g;
/*    */   
/*    */   public or() {}
/*    */   
/*    */   public or(bfw ☃) {
/* 24 */     this.a = ☃.Y();
/* 25 */     this.b = ☃.eA().getId();
/* 26 */     this.c = ☃.cD();
/* 27 */     this.d = ☃.cE();
/* 28 */     this.e = ☃.cH();
/* 29 */     this.f = (byte)(int)(☃.p * 256.0F / 360.0F);
/* 30 */     this.g = (byte)(int)(☃.q * 256.0F / 360.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 35 */     this.a = ☃.i();
/* 36 */     this.b = ☃.k();
/* 37 */     this.c = ☃.readDouble();
/* 38 */     this.d = ☃.readDouble();
/* 39 */     this.e = ☃.readDouble();
/* 40 */     this.f = ☃.readByte();
/* 41 */     this.g = ☃.readByte();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 46 */     ☃.d(this.a);
/* 47 */     ☃.a(this.b);
/* 48 */     ☃.writeDouble(this.c);
/* 49 */     ☃.writeDouble(this.d);
/* 50 */     ☃.writeDouble(this.e);
/* 51 */     ☃.writeByte(this.f);
/* 52 */     ☃.writeByte(this.g);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 57 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public int b() {
/* 61 */     return this.a;
/*    */   }
/*    */   
/*    */   public UUID c() {
/* 65 */     return this.b;
/*    */   }
/*    */   
/*    */   public double d() {
/* 69 */     return this.c;
/*    */   }
/*    */   
/*    */   public double e() {
/* 73 */     return this.d;
/*    */   }
/*    */   
/*    */   public double f() {
/* 77 */     return this.e;
/*    */   }
/*    */   
/*    */   public byte g() {
/* 81 */     return this.f;
/*    */   }
/*    */   
/*    */   public byte h() {
/* 85 */     return this.g;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\or.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */