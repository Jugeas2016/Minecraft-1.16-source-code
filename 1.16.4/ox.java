/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ox
/*    */   implements oj<om>
/*    */ {
/*    */   private fx a;
/*    */   private int b;
/*    */   private int c;
/*    */   private buo d;
/*    */   
/*    */   public ox() {}
/*    */   
/*    */   public ox(fx ☃, buo buo1, int i, int j) {
/* 21 */     this.a = ☃;
/* 22 */     this.d = buo1;
/* 23 */     this.b = i;
/* 24 */     this.c = j;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 29 */     this.a = ☃.e();
/* 30 */     this.b = ☃.readUnsignedByte();
/* 31 */     this.c = ☃.readUnsignedByte();
/*    */     
/* 33 */     this.d = gm.Q.a(☃.i());
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 38 */     ☃.a(this.a);
/* 39 */     ☃.writeByte(this.b);
/* 40 */     ☃.writeByte(this.c);
/* 41 */     ☃.d(gm.Q.a(this.d));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 46 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public fx b() {
/* 50 */     return this.a;
/*    */   }
/*    */   
/*    */   public int c() {
/* 54 */     return this.b;
/*    */   }
/*    */   
/*    */   public int d() {
/* 58 */     return this.c;
/*    */   }
/*    */   
/*    */   public buo e() {
/* 62 */     return this.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ox.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */