/*    */ import java.io.IOException;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class qd
/*    */   implements oj<om>
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private nr c;
/*    */   
/*    */   public qd() {}
/*    */   
/*    */   public qd(int ☃, bje<?> bje1, nr nr1) {
/* 21 */     this.a = ☃;
/* 22 */     this.b = gm.ac.a(bje1);
/* 23 */     this.c = nr1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 28 */     this.a = ☃.i();
/* 29 */     this.b = ☃.i();
/* 30 */     this.c = ☃.h();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 35 */     ☃.d(this.a);
/* 36 */     ☃.d(this.b);
/* 37 */     ☃.a(this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 42 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public int b() {
/* 46 */     return this.a;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public bje<?> c() {
/* 51 */     return gm.ac.a(this.b);
/*    */   }
/*    */   
/*    */   public nr d() {
/* 55 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\qd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */