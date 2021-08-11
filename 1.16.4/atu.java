/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
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
/*    */ 
/*    */ public class atu
/*    */   extends arv<aqm>
/*    */ {
/*    */   private long b;
/*    */   
/*    */   public atu() {
/* 24 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.b, aye.a, ayd.G, aye.c));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, aqm aqm1) {
/* 32 */     if (aqm1.br()) {
/* 33 */       return false;
/*    */     }
/* 35 */     arf<?> arf = aqm1.cJ();
/*    */     
/* 37 */     gf gf = arf.<gf>c(ayd.b).get();
/* 38 */     if (☃.Y() != gf.a()) {
/* 39 */       return false;
/*    */     }
/*    */     
/* 42 */     Optional<Long> optional = arf.c(ayd.G);
/* 43 */     if (optional.isPresent()) {
/* 44 */       long l = ☃.T() - ((Long)optional.get()).longValue();
/* 45 */       if (l > 0L && l < 100L)
/*    */       {
/* 47 */         return false;
/*    */       }
/*    */     } 
/*    */     
/* 51 */     ceh ceh = ☃.d_(gf.b());
/* 52 */     return (gf.b().a(aqm1.cA(), 2.0D) && ceh.b().a(aed.L) && !((Boolean)ceh.c(buj.b)).booleanValue());
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean b(aag ☃, aqm aqm1, long l) {
/* 57 */     Optional<gf> optional = aqm1.cJ().c(ayd.b);
/*    */     
/* 59 */     if (!optional.isPresent()) {
/* 60 */       return false;
/*    */     }
/*    */     
/* 63 */     fx fx = ((gf)optional.get()).b();
/* 64 */     return (aqm1.cJ().c(bhf.e) && aqm1.cE() > fx.v() + 0.4D && fx.a(aqm1.cA(), 1.14D));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, aqm aqm1, long l) {
/* 69 */     if (l > this.b) {
/* 70 */       asp.a(☃, aqm1, null, null);
/* 71 */       aqm1.b(((gf)aqm1.cJ().<gf>c(ayd.b).get()).b());
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(long ☃) {
/* 77 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void c(aag ☃, aqm aqm1, long l) {
/* 82 */     if (aqm1.em()) {
/* 83 */       aqm1.en();
/* 84 */       this.b = l + 40L;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\atu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */