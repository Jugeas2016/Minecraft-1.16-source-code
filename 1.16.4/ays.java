/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import java.util.Set;
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
/*    */ public class ays
/*    */   extends azb<aqm>
/*    */ {
/*    */   public Set<ayd<?>> a() {
/* 21 */     return (Set<ayd<?>>)ImmutableSet.of(ayd.x, ayd.y);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, aqm aqm1) {
/* 26 */     arf<?> arf = aqm1.cJ();
/* 27 */     apk apk = aqm1.dm();
/* 28 */     if (apk != null) {
/* 29 */       arf.a(ayd.x, aqm1.dm());
/* 30 */       aqa aqa = apk.k();
/* 31 */       if (aqa instanceof aqm) {
/* 32 */         arf.a(ayd.y, (aqm)aqa);
/*    */       }
/*    */     } else {
/* 35 */       arf.b(ayd.x);
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 41 */     arf.<aqm>c(ayd.y).ifPresent(aqm1 -> {
/*    */           if (!aqm1.aX() || aqm1.l != ☃)
/*    */             arf1.b(ayd.y); 
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ays.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */