/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bsj
/*    */ {
/*    */   static class a
/*    */   {
/*    */     private final fx a;
/*    */     private final double b;
/*    */     
/*    */     public a(fx ☃, double d) {
/* 15 */       this.a = ☃;
/* 16 */       this.b = d;
/*    */     }
/*    */     
/*    */     public double a(fx ☃) {
/* 20 */       double d = this.a.j(☃);
/* 21 */       if (d == 0.0D)
/*    */       {
/* 23 */         return Double.POSITIVE_INFINITY;
/*    */       }
/* 25 */       return this.b / Math.sqrt(d);
/*    */     }
/*    */   }
/*    */   
/* 29 */   private final List<a> a = Lists.newArrayList();
/*    */   
/*    */   public void a(fx ☃, double d) {
/* 32 */     if (d != 0.0D) {
/* 33 */       this.a.add(new a(☃, d));
/*    */     }
/*    */   }
/*    */   
/*    */   public double b(fx ☃, double d) {
/* 38 */     if (d == 0.0D) {
/* 39 */       return 0.0D;
/*    */     }
/* 41 */     double d1 = 0.0D;
/* 42 */     for (a a : this.a) {
/* 43 */       d1 += a.a(☃);
/*    */     }
/* 45 */     return d1 * d;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bsj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */