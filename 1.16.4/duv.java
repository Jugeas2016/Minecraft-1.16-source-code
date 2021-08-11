/*    */ import java.util.function.Consumer;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class duv
/*    */   implements Consumer<dwn>
/*    */ {
/*    */   protected final Function<vk, eao> q;
/* 14 */   public int r = 64;
/* 15 */   public int s = 32;
/*    */   
/*    */   public duv(Function<vk, eao> ☃) {
/* 18 */     this.q = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(dwn ☃) {}
/*    */ 
/*    */   
/*    */   public final eao a(vk ☃) {
/* 26 */     return this.q.apply(☃);
/*    */   }
/*    */   
/*    */   public abstract void a(dfm paramdfm, dfq paramdfq, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\duv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */