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
/*    */ public class pl
/*    */   implements oj<om>
/*    */ {
/*    */   private vk a;
/*    */   private adr b;
/*    */   private int c;
/* 17 */   private int d = Integer.MAX_VALUE;
/*    */   
/*    */   private int e;
/*    */   
/*    */   private float f;
/*    */   
/*    */   private float g;
/*    */   
/*    */   public pl(vk ☃, adr adr1, dcn dcn1, float f1, float f2) {
/* 26 */     this.a = ☃;
/* 27 */     this.b = adr1;
/* 28 */     this.c = (int)(dcn1.b * 8.0D);
/* 29 */     this.d = (int)(dcn1.c * 8.0D);
/* 30 */     this.e = (int)(dcn1.d * 8.0D);
/* 31 */     this.f = f1;
/* 32 */     this.g = f2;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 37 */     this.a = ☃.p();
/* 38 */     this.b = ☃.<adr>a(adr.class);
/* 39 */     this.c = ☃.readInt();
/* 40 */     this.d = ☃.readInt();
/* 41 */     this.e = ☃.readInt();
/* 42 */     this.f = ☃.readFloat();
/* 43 */     this.g = ☃.readFloat();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 48 */     ☃.a(this.a);
/* 49 */     ☃.a(this.b);
/* 50 */     ☃.writeInt(this.c);
/* 51 */     ☃.writeInt(this.d);
/* 52 */     ☃.writeInt(this.e);
/* 53 */     ☃.writeFloat(this.f);
/* 54 */     ☃.writeFloat(this.g);
/*    */   }
/*    */   
/*    */   public vk b() {
/* 58 */     return this.a;
/*    */   }
/*    */   
/*    */   public adr c() {
/* 62 */     return this.b;
/*    */   }
/*    */   
/*    */   public double d() {
/* 66 */     return (this.c / 8.0F);
/*    */   }
/*    */   
/*    */   public double e() {
/* 70 */     return (this.d / 8.0F);
/*    */   }
/*    */   
/*    */   public double f() {
/* 74 */     return (this.e / 8.0F);
/*    */   }
/*    */   
/*    */   public float g() {
/* 78 */     return this.f;
/*    */   }
/*    */   
/*    */   public float h() {
/* 82 */     return this.g;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 87 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public pl() {}
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\pl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */