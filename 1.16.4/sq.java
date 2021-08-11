/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class sq
/*    */   implements oj<sa>
/*    */ {
/*    */   private fx a;
/*    */   private int b;
/*    */   private boolean c;
/*    */   
/*    */   public sq() {}
/*    */   
/*    */   public sq(fx ☃, int i, boolean bool) {
/* 18 */     this.a = ☃;
/* 19 */     this.b = i;
/* 20 */     this.c = bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 25 */     this.a = ☃.e();
/* 26 */     this.b = ☃.i();
/* 27 */     this.c = ☃.readBoolean();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 32 */     ☃.a(this.a);
/* 33 */     ☃.d(this.b);
/* 34 */     ☃.writeBoolean(this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(sa ☃) {
/* 39 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public fx b() {
/* 43 */     return this.a;
/*    */   }
/*    */   
/*    */   public int c() {
/* 47 */     return this.b;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 51 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\sq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */