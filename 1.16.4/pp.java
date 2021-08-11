/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class pp
/*    */   implements oj<om>
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   
/*    */   public pp() {}
/*    */   
/*    */   public pp(int ☃, int i) {
/* 16 */     this.a = ☃;
/* 17 */     this.b = i;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 22 */     this.a = ☃.readInt();
/* 23 */     this.b = ☃.readInt();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 28 */     ☃.writeInt(this.a);
/* 29 */     ☃.writeInt(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 34 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public int b() {
/* 38 */     return this.a;
/*    */   }
/*    */   
/*    */   public int c() {
/* 42 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\pp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */