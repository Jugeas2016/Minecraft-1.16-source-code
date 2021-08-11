/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class atj<E extends aqm>
/*    */   extends arv<E>
/*    */ {
/*    */   private boolean b;
/*    */   private boolean c;
/*    */   private final afh d;
/*    */   private final arv<? super E> e;
/*    */   private int f;
/*    */   
/*    */   public atj(arv<? super E> ☃, afh afh1) {
/* 19 */     this(☃, false, afh1);
/*    */   }
/*    */   
/*    */   public atj(arv<? super E> ☃, boolean bool, afh afh1) {
/* 23 */     super(☃.a);
/*    */     
/* 25 */     this.e = ☃;
/* 26 */     this.b = !bool;
/* 27 */     this.d = afh1;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, E e) {
/* 32 */     if (!this.e.a(☃, e)) {
/* 33 */       return false;
/*    */     }
/*    */ 
/*    */     
/* 37 */     if (this.b) {
/* 38 */       a(☃);
/* 39 */       this.b = false;
/*    */     } 
/*    */     
/* 42 */     if (this.f > 0) {
/* 43 */       this.f--;
/*    */     }
/*    */     
/* 46 */     return (!this.c && this.f == 0);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, E e, long l) {
/* 51 */     this.e.a(☃, e, l);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean b(aag ☃, E e, long l) {
/* 56 */     return this.e.b(☃, e, l);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void d(aag ☃, E e, long l) {
/* 61 */     this.e.d(☃, e, l);
/*    */     
/* 63 */     this.c = (this.e.a() == arv.a.b);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void c(aag ☃, E e, long l) {
/* 68 */     a(☃);
/* 69 */     this.e.c(☃, e, l);
/*    */   }
/*    */   
/*    */   private void a(aag ☃) {
/* 73 */     this.f = this.d.a(☃.t);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(long ☃) {
/* 78 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 83 */     return "RunSometimes: " + this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\atj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */