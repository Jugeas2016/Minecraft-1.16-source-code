/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class rs
/*    */   implements oj<om>
/*    */ {
/*    */   private int a;
/*    */   private double b;
/*    */   private double c;
/*    */   private double d;
/*    */   private byte e;
/*    */   private byte f;
/*    */   private boolean g;
/*    */   
/*    */   public rs() {}
/*    */   
/*    */   public rs(aqa ☃) {
/* 22 */     this.a = ☃.Y();
/* 23 */     this.b = ☃.cD();
/* 24 */     this.c = ☃.cE();
/* 25 */     this.d = ☃.cH();
/* 26 */     this.e = (byte)(int)(☃.p * 256.0F / 360.0F);
/* 27 */     this.f = (byte)(int)(☃.q * 256.0F / 360.0F);
/* 28 */     this.g = ☃.ao();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 33 */     this.a = ☃.i();
/* 34 */     this.b = ☃.readDouble();
/* 35 */     this.c = ☃.readDouble();
/* 36 */     this.d = ☃.readDouble();
/* 37 */     this.e = ☃.readByte();
/* 38 */     this.f = ☃.readByte();
/* 39 */     this.g = ☃.readBoolean();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 44 */     ☃.d(this.a);
/* 45 */     ☃.writeDouble(this.b);
/* 46 */     ☃.writeDouble(this.c);
/* 47 */     ☃.writeDouble(this.d);
/* 48 */     ☃.writeByte(this.e);
/* 49 */     ☃.writeByte(this.f);
/* 50 */     ☃.writeBoolean(this.g);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 55 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public int b() {
/* 59 */     return this.a;
/*    */   }
/*    */   
/*    */   public double c() {
/* 63 */     return this.b;
/*    */   }
/*    */   
/*    */   public double d() {
/* 67 */     return this.c;
/*    */   }
/*    */   
/*    */   public double e() {
/* 71 */     return this.d;
/*    */   }
/*    */   
/*    */   public byte f() {
/* 75 */     return this.e;
/*    */   }
/*    */   
/*    */   public byte g() {
/* 79 */     return this.f;
/*    */   }
/*    */   
/*    */   public boolean h() {
/* 83 */     return this.g;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\rs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */