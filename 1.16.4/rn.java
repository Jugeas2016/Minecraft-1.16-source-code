/*    */ import java.io.IOException;
/*    */ import org.apache.commons.lang3.Validate;
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
/*    */ public class rn
/*    */   implements oj<om>
/*    */ {
/*    */   private adp a;
/*    */   private adr b;
/*    */   private int c;
/*    */   private int d;
/*    */   private int e;
/*    */   private float f;
/*    */   private float g;
/*    */   
/*    */   public rn() {}
/*    */   
/*    */   public rn(adp ☃, adr adr1, double d1, double d2, double d3, float f1, float f2) {
/* 27 */     Validate.notNull(☃, "sound", new Object[0]);
/* 28 */     this.a = ☃;
/* 29 */     this.b = adr1;
/* 30 */     this.c = (int)(d1 * 8.0D);
/* 31 */     this.d = (int)(d2 * 8.0D);
/* 32 */     this.e = (int)(d3 * 8.0D);
/* 33 */     this.f = f1;
/* 34 */     this.g = f2;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 39 */     this.a = gm.N.a(☃.i());
/* 40 */     this.b = ☃.<adr>a(adr.class);
/* 41 */     this.c = ☃.readInt();
/* 42 */     this.d = ☃.readInt();
/* 43 */     this.e = ☃.readInt();
/* 44 */     this.f = ☃.readFloat();
/* 45 */     this.g = ☃.readFloat();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 50 */     ☃.d(gm.N.a(this.a));
/* 51 */     ☃.a(this.b);
/* 52 */     ☃.writeInt(this.c);
/* 53 */     ☃.writeInt(this.d);
/* 54 */     ☃.writeInt(this.e);
/* 55 */     ☃.writeFloat(this.f);
/* 56 */     ☃.writeFloat(this.g);
/*    */   }
/*    */   
/*    */   public adp b() {
/* 60 */     return this.a;
/*    */   }
/*    */   
/*    */   public adr c() {
/* 64 */     return this.b;
/*    */   }
/*    */   
/*    */   public double d() {
/* 68 */     return (this.c / 8.0F);
/*    */   }
/*    */   
/*    */   public double e() {
/* 72 */     return (this.d / 8.0F);
/*    */   }
/*    */   
/*    */   public double f() {
/* 76 */     return (this.e / 8.0F);
/*    */   }
/*    */   
/*    */   public float g() {
/* 80 */     return this.f;
/*    */   }
/*    */   
/*    */   public float h() {
/* 84 */     return this.g;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 89 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\rn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */