/*    */ import java.io.IOException;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class rh
/*    */   implements oj<om>
/*    */ {
/*    */   private int a;
/*    */   private int[] b;
/*    */   
/*    */   public rh() {}
/*    */   
/*    */   public rh(aqa ☃) {
/* 18 */     this.a = ☃.Y();
/* 19 */     List<aqa> list = ☃.cn();
/* 20 */     this.b = new int[list.size()];
/*    */     
/* 22 */     for (int i = 0; i < list.size(); i++) {
/* 23 */       this.b[i] = ((aqa)list.get(i)).Y();
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 29 */     this.a = ☃.i();
/* 30 */     this.b = ☃.b();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 35 */     ☃.d(this.a);
/* 36 */     ☃.a(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 41 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public int[] b() {
/* 45 */     return this.b;
/*    */   }
/*    */   
/*    */   public int c() {
/* 49 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\rh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */