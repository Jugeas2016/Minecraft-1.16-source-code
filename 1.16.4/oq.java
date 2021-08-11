/*    */ import java.io.IOException;
/*    */ import java.util.UUID;
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
/*    */ 
/*    */ public class oq
/*    */   implements oj<om>
/*    */ {
/*    */   private int a;
/*    */   private UUID b;
/*    */   private fx c;
/*    */   private gc d;
/*    */   private int e;
/*    */   
/*    */   public oq() {}
/*    */   
/*    */   public oq(bcs ☃) {
/* 26 */     this.a = ☃.Y();
/* 27 */     this.b = ☃.bS();
/* 28 */     this.c = ☃.n();
/* 29 */     this.d = ☃.bZ();
/* 30 */     this.e = gm.X.a(☃.e);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 35 */     this.a = ☃.i();
/* 36 */     this.b = ☃.k();
/* 37 */     this.e = ☃.i();
/* 38 */     this.c = ☃.e();
/* 39 */     this.d = gc.b(☃.readUnsignedByte());
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 44 */     ☃.d(this.a);
/* 45 */     ☃.a(this.b);
/* 46 */     ☃.d(this.e);
/* 47 */     ☃.a(this.c);
/* 48 */     ☃.writeByte(this.d.d());
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
/*    */   public UUID c() {
/* 61 */     return this.b;
/*    */   }
/*    */   
/*    */   public fx d() {
/* 65 */     return this.c;
/*    */   }
/*    */   
/*    */   public gc e() {
/* 69 */     return this.d;
/*    */   }
/*    */   
/*    */   public bcr f() {
/* 73 */     return gm.X.a(this.e);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\oq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */