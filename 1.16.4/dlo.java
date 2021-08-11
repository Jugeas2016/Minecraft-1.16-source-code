/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class dlo<E extends dlo.a<E>>
/*    */   extends dlf<E>
/*    */ {
/*    */   public dlo(djz ☃, int i, int j, int k, int m, int n) {
/* 12 */     super(☃, i, j, k, m, n);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean c_(boolean ☃) {
/* 17 */     boolean bool = super.c_(☃);
/* 18 */     if (bool) {
/* 19 */       d(i());
/*    */     }
/* 21 */     return bool;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean f(int ☃) {
/* 26 */     return false;
/*    */   }
/*    */   
/*    */   public static abstract class a<E extends a<E>>
/*    */     extends dlf.a<E>
/*    */     implements dmh {
/*    */     @Nullable
/*    */     private dmi a;
/*    */     private boolean b;
/*    */     
/*    */     public boolean av_() {
/* 37 */       return this.b;
/*    */     }
/*    */ 
/*    */     
/*    */     public void b_(boolean ☃) {
/* 42 */       this.b = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(@Nullable dmi ☃) {
/* 47 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     @Nullable
/*    */     public dmi aw_() {
/* 53 */       return this.a;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dlo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */