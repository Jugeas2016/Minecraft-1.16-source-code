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
/*    */ 
/*    */ 
/*    */ public class tv
/*    */   implements oj<tw>
/*    */ {
/*    */   private int a;
/*    */   private String b;
/*    */   private int c;
/*    */   private ne d;
/*    */   
/*    */   public tv() {}
/*    */   
/*    */   public tv(String ☃, int i, ne ne1) {
/* 24 */     this.a = w.a().getProtocolVersion();
/* 25 */     this.b = ☃;
/* 26 */     this.c = i;
/* 27 */     this.d = ne1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 32 */     this.a = ☃.i();
/* 33 */     this.b = ☃.e(255);
/* 34 */     this.c = ☃.readUnsignedShort();
/* 35 */     this.d = ne.a(☃.i());
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 40 */     ☃.d(this.a);
/* 41 */     ☃.a(this.b);
/* 42 */     ☃.writeShort(this.c);
/* 43 */     ☃.d(this.d.a());
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(tw ☃) {
/* 48 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public ne b() {
/* 52 */     return this.d;
/*    */   }
/*    */   
/*    */   public int c() {
/* 56 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\tv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */