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
/*    */ public class rm
/*    */   implements oj<om>
/*    */ {
/*    */   private adp a;
/*    */   private adr b;
/*    */   private int c;
/*    */   private float d;
/*    */   private float e;
/*    */   
/*    */   public rm() {}
/*    */   
/*    */   public rm(adp ☃, adr adr1, aqa aqa1, float f1, float f2) {
/* 24 */     Validate.notNull(☃, "sound", new Object[0]);
/* 25 */     this.a = ☃;
/* 26 */     this.b = adr1;
/* 27 */     this.c = aqa1.Y();
/* 28 */     this.d = f1;
/* 29 */     this.e = f2;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 34 */     this.a = gm.N.a(☃.i());
/* 35 */     this.b = ☃.<adr>a(adr.class);
/* 36 */     this.c = ☃.i();
/* 37 */     this.d = ☃.readFloat();
/* 38 */     this.e = ☃.readFloat();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 43 */     ☃.d(gm.N.a(this.a));
/* 44 */     ☃.a(this.b);
/* 45 */     ☃.d(this.c);
/* 46 */     ☃.writeFloat(this.d);
/* 47 */     ☃.writeFloat(this.e);
/*    */   }
/*    */   
/*    */   public adp b() {
/* 51 */     return this.a;
/*    */   }
/*    */   
/*    */   public adr c() {
/* 55 */     return this.b;
/*    */   }
/*    */   
/*    */   public int d() {
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
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 72 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\rm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */