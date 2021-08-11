/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ import java.util.function.BiPredicate;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class atx
/*    */   extends arv<aqm>
/*    */ {
/*    */   private final int b;
/*    */   private final BiPredicate<aqm, aqm> c;
/*    */   
/*    */   public atx(int ☃, BiPredicate<aqm, aqm> biPredicate) {
/* 24 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.o, aye.a, ayd.L, aye.c, ayd.S, aye.b, ayd.T, aye.c));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 30 */     this.b = ☃;
/* 31 */     this.c = biPredicate;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, aqm aqm1) {
/* 36 */     return a(aqm1).dl();
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, aqm aqm1, long l) {
/* 41 */     aqm aqm2 = a(aqm1);
/* 42 */     if (this.c.test(aqm1, aqm2)) {
/* 43 */       aqm1.cJ().a(ayd.T, Boolean.valueOf(true), this.b);
/*    */     }
/* 45 */     aqm1.cJ().a(ayd.S, aqm2.cB(), this.b);
/*    */     
/* 47 */     if (aqm2.X() != aqe.bc || ☃.V().b(brt.F)) {
/* 48 */       aqm1.cJ().b(ayd.o);
/* 49 */       aqm1.cJ().b(ayd.L);
/*    */     } 
/*    */   }
/*    */   
/*    */   private aqm a(aqm ☃) {
/* 54 */     return ☃.cJ().<aqm>c(ayd.o).get();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\atx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */