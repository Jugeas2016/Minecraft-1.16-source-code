/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dlj
/*    */   extends dld
/*    */ {
/*    */   public static final b s = (☃, dfm1, i, j) -> {
/*    */     
/*    */     };
/*    */   protected final a t;
/*    */   protected final b u;
/*    */   
/*    */   public dlj(int ☃, int i, int j, int k, nr nr1, a a1) {
/* 21 */     this(☃, i, j, k, nr1, a1, s);
/*    */   }
/*    */   
/*    */   public dlj(int ☃, int i, int j, int k, nr nr1, a a1, b b1) {
/* 25 */     super(☃, i, j, k, nr1);
/*    */     
/* 27 */     this.t = a1;
/* 28 */     this.u = b1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b() {
/* 33 */     this.t.onPress(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(dfm ☃, int i, int j, float f) {
/* 38 */     super.b(☃, i, j, f);
/*    */     
/* 40 */     if (g()) {
/* 41 */       a(☃, i, j);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j) {
/* 47 */     this.u.onTooltip(this, ☃, i, j);
/*    */   }
/*    */   
/*    */   public static interface b {
/*    */     void onTooltip(dlj param1dlj, dfm param1dfm, int param1Int1, int param1Int2);
/*    */   }
/*    */   
/*    */   public static interface a {
/*    */     void onPress(dlj param1dlj);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dlj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */