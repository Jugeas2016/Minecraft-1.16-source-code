/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class sk
/*    */   implements oj<sa>
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   private short d;
/* 15 */   private bmb e = bmb.b;
/*    */ 
/*    */   
/*    */   private bik f;
/*    */ 
/*    */   
/*    */   public sk(int ☃, int i, int j, bik bik1, bmb bmb1, short s) {
/* 22 */     this.a = ☃;
/* 23 */     this.b = i;
/* 24 */     this.c = j;
/* 25 */     this.e = bmb1.i();
/* 26 */     this.d = s;
/* 27 */     this.f = bik1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(sa ☃) {
/* 32 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 37 */     this.a = ☃.readByte();
/* 38 */     this.b = ☃.readShort();
/* 39 */     this.c = ☃.readByte();
/* 40 */     this.d = ☃.readShort();
/* 41 */     this.f = ☃.<bik>a(bik.class);
/*    */     
/* 43 */     this.e = ☃.n();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 48 */     ☃.writeByte(this.a);
/* 49 */     ☃.writeShort(this.b);
/* 50 */     ☃.writeByte(this.c);
/* 51 */     ☃.writeShort(this.d);
/* 52 */     ☃.a(this.f);
/*    */     
/* 54 */     ☃.a(this.e);
/*    */   }
/*    */   
/*    */   public int b() {
/* 58 */     return this.a;
/*    */   }
/*    */   
/*    */   public int c() {
/* 62 */     return this.b;
/*    */   }
/*    */   
/*    */   public int d() {
/* 66 */     return this.c;
/*    */   }
/*    */   
/*    */   public short e() {
/* 70 */     return this.d;
/*    */   }
/*    */   
/*    */   public bmb f() {
/* 74 */     return this.e;
/*    */   }
/*    */   
/*    */   public bik g() {
/* 78 */     return this.f;
/*    */   }
/*    */   
/*    */   public sk() {}
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\sk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */