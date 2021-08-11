/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ import java.util.function.Predicate;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class auh
/*    */   extends arv<aqm>
/*    */ {
/*    */   private final ayd<gf> b;
/*    */   private final Predicate<azr> c;
/*    */   
/*    */   public auh(azr ☃, ayd<gf> ayd1) {
/* 29 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd1, aye.a));
/*    */ 
/*    */ 
/*    */     
/* 33 */     this.c = ☃.c();
/* 34 */     this.b = ayd1;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, aqm aqm1) {
/* 39 */     gf gf = aqm1.cJ().<gf>c(this.b).get();
/* 40 */     return (☃.Y() == gf.a() && gf
/* 41 */       .b().a(aqm1.cA(), 16.0D));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, aqm aqm1, long l) {
/* 46 */     arf<?> arf = aqm1.cJ();
/* 47 */     gf gf = arf.<gf>c(this.b).get();
/* 48 */     fx fx = gf.b();
/* 49 */     aag aag1 = ☃.l().a(gf.a());
/* 50 */     if (aag1 == null || a(aag1, fx)) {
/* 51 */       arf.b(this.b);
/* 52 */     } else if (a(aag1, fx, aqm1)) {
/* 53 */       arf.b(this.b);
/* 54 */       ☃.y().b(fx);
/* 55 */       rz.c(☃, fx);
/*    */     } 
/*    */   }
/*    */   
/*    */   private boolean a(aag ☃, fx fx1, aqm aqm1) {
/* 60 */     ceh ceh = ☃.d_(fx1);
/* 61 */     return (ceh.b().a(aed.L) && ((Boolean)ceh.c(buj.b)).booleanValue() && !aqm1.em());
/*    */   }
/*    */   
/*    */   private boolean a(aag ☃, fx fx1) {
/* 65 */     return !☃.y().a(fx1, this.c);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\auh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */