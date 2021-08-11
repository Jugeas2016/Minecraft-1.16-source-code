/*    */ import java.util.Collection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class eon<E extends dlv.a<E>>
/*    */   extends dlv<E>
/*    */ {
/*    */   protected eon(int ☃, int i, int j, int k, int m) {
/* 10 */     super(djz.C(), ☃, i, j, k, m);
/*    */   }
/*    */   
/*    */   public void j(int ☃) {
/* 14 */     if (☃ == -1) {
/* 15 */       a((E)null);
/* 16 */     } else if (super.l() != 0) {
/* 17 */       a(e(☃));
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a(int ☃) {
/* 22 */     j(☃);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(int ☃, int i, double d1, double d2, int j) {}
/*    */ 
/*    */   
/*    */   public int c() {
/* 31 */     return 0;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int e() {
/* 37 */     return q() + d();
/*    */   }
/*    */ 
/*    */   
/*    */   public int d() {
/* 42 */     return (int)(this.d * 0.6D);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(Collection<E> ☃) {
/* 48 */     super.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public int l() {
/* 53 */     return super.l();
/*    */   }
/*    */ 
/*    */   
/*    */   public int h(int ☃) {
/* 58 */     return super.h(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public int q() {
/* 63 */     return super.q();
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(E ☃) {
/* 68 */     return super.b(☃);
/*    */   }
/*    */   
/*    */   public void a() {
/* 72 */     k();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eon.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */