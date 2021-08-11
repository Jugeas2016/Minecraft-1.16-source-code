/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import java.util.stream.Collector;
/*    */ import java.util.stream.Collectors;
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
/*    */ public class edg
/*    */   implements edh.a
/*    */ {
/*    */   private final djz a;
/* 19 */   private double b = Double.MIN_VALUE;
/* 20 */   private List<ddh> c = Collections.emptyList();
/*    */   
/*    */   public edg(djz ☃) {
/* 23 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, eag eag1, double d1, double d2, double d3) {
/* 28 */     double d = x.c();
/* 29 */     if (d - this.b > 1.0E8D) {
/* 30 */       this.b = d;
/* 31 */       aqa aqa = this.a.h.k().g();
/* 32 */       this.c = aqa.l.d(aqa, aqa.cc().g(6.0D), ☃ -> true).collect((Collector)Collectors.toList());
/*    */     } 
/*    */     
/* 35 */     dfq dfq = eag1.getBuffer(eao.t());
/* 36 */     for (ddh ddh : this.c)
/* 37 */       eae.a(☃, dfq, ddh, -d1, -d2, -d3, 1.0F, 1.0F, 1.0F, 1.0F); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\edg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */