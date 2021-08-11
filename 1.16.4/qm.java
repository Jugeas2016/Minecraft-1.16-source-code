/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class qm
/*    */   implements oj<om>
/*    */ {
/*    */   private int[] a;
/*    */   
/*    */   public qm() {}
/*    */   
/*    */   public qm(int... ☃) {
/* 18 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 23 */     this.a = new int[☃.i()];
/*    */     
/* 25 */     for (int i = 0; i < this.a.length; i++) {
/* 26 */       this.a[i] = ☃.i();
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 32 */     ☃.d(this.a.length);
/*    */     
/* 34 */     for (int i : this.a) {
/* 35 */       ☃.d(i);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 41 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public int[] b() {
/* 45 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\qm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */