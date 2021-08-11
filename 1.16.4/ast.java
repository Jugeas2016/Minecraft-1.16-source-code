/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ast
/*    */   extends arv<bfj>
/*    */ {
/*    */   private final float b;
/*    */   
/*    */   public ast(float ☃) {
/* 16 */     super(
/* 17 */         (Map<ayd<?>, aye>)ImmutableMap.of(ayd.m, aye.c, ayd.n, aye.c), 2147483647);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 23 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, bfj bfj1) {
/* 28 */     bfw bfw = bfj1.eM();
/*    */     
/* 30 */     return (bfj1.aX() && bfw != null && 
/*    */       
/* 32 */       !bfj1.aE() && !bfj1.w && bfj1
/*    */       
/* 34 */       .h(bfw) <= 16.0D && bfw.bp != null);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, bfj bfj1, long l) {
/* 41 */     return a(☃, bfj1);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b(aag ☃, bfj bfj1, long l) {
/* 46 */     a(bfj1);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void c(aag ☃, bfj bfj1, long l) {
/* 51 */     arf<?> arf = bfj1.cJ();
/* 52 */     arf.b(ayd.m);
/* 53 */     arf.b(ayd.n);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void d(aag ☃, bfj bfj1, long l) {
/* 58 */     a(bfj1);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(long ☃) {
/* 63 */     return false;
/*    */   }
/*    */   
/*    */   private void a(bfj ☃) {
/* 67 */     arf<?> arf = ☃.cJ();
/* 68 */     arf.a(ayd.m, new ayf(new asd(☃.eM(), false), this.b, 2));
/* 69 */     arf.a(ayd.n, new asd(☃.eM(), true));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ast.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */