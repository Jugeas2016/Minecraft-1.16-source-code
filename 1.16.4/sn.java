/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class sn
/*    */   implements oj<sa>
/*    */ {
/*    */   private bmb a;
/*    */   private boolean b;
/*    */   private int c;
/*    */   
/*    */   public sn() {}
/*    */   
/*    */   public sn(bmb ☃, boolean bool, int i) {
/* 19 */     this.a = ☃.i();
/* 20 */     this.b = bool;
/* 21 */     this.c = i;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 26 */     this.a = ☃.n();
/* 27 */     this.b = ☃.readBoolean();
/* 28 */     this.c = ☃.i();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 33 */     ☃.a(this.a);
/* 34 */     ☃.writeBoolean(this.b);
/* 35 */     ☃.d(this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(sa ☃) {
/* 40 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public bmb b() {
/* 44 */     return this.a;
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 48 */     return this.b;
/*    */   }
/*    */   
/*    */   public int d() {
/* 52 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\sn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */