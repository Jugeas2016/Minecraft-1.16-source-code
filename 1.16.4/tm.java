/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class tm
/*    */   implements oj<sa>
/*    */ {
/*    */   private int a;
/* 11 */   private bmb b = bmb.b;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public tm(int ☃, bmb bmb1) {
/* 17 */     this.a = ☃;
/* 18 */     this.b = bmb1.i();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(sa ☃) {
/* 23 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 28 */     this.a = ☃.readShort();
/* 29 */     this.b = ☃.n();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 34 */     ☃.writeShort(this.a);
/* 35 */     ☃.a(this.b);
/*    */   }
/*    */   
/*    */   public int b() {
/* 39 */     return this.a;
/*    */   }
/*    */   
/*    */   public bmb c() {
/* 43 */     return this.b;
/*    */   }
/*    */   
/*    */   public tm() {}
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\tm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */