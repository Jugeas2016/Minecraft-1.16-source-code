/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class dlv<E extends dlf.a<E>>
/*    */   extends dlf<E>
/*    */ {
/*    */   private boolean a;
/*    */   
/*    */   public dlv(djz ☃, int i, int j, int k, int m, int n) {
/* 10 */     super(☃, i, j, k, m, n);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean c_(boolean ☃) {
/* 15 */     if (!this.a && l() == 0)
/*    */     {
/* 17 */       return false;
/*    */     }
/* 19 */     this.a = !this.a;
/*    */     
/* 21 */     if (this.a && h() == null && l() > 0) {
/* 22 */       a(dlf.b.b);
/* 23 */     } else if (this.a && h() != null) {
/* 24 */       p();
/*    */     } 
/* 26 */     return this.a;
/*    */   }
/*    */   
/*    */   public static abstract class a<E extends a<E>>
/*    */     extends dlf.a<E> {
/*    */     public boolean c_(boolean ☃) {
/* 32 */       return false;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dlv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */