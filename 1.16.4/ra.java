/*    */ import java.io.IOException;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ra
/*    */   implements oj<om>
/*    */ {
/*    */   private int a;
/*    */   private List<uv.a<?>> b;
/*    */   
/*    */   public ra() {}
/*    */   
/*    */   public ra(int ☃, uv uv1, boolean bool) {
/* 19 */     this.a = ☃;
/* 20 */     if (bool) {
/* 21 */       this.b = uv1.c();
/* 22 */       uv1.e();
/*    */     } else {
/* 24 */       this.b = uv1.b();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 30 */     this.a = ☃.i();
/* 31 */     this.b = uv.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 36 */     ☃.d(this.a);
/* 37 */     uv.a(this.b, ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 42 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public List<uv.a<?>> b() {
/* 46 */     return this.b;
/*    */   }
/*    */   
/*    */   public int c() {
/* 50 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ra.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */