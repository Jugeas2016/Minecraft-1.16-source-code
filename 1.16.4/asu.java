/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class asu
/*    */   extends arv<aqn>
/*    */ {
/*    */   public asu(int ☃, int i) {
/* 11 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.n, aye.a), ☃, i);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, aqn aqn1, long l) {
/* 16 */     return aqn1.cJ().<atb>c(ayd.n)
/* 17 */       .filter(atb1 -> atb1.a(☃))
/* 18 */       .isPresent();
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b(aag ☃, aqn aqn1, long l) {
/* 23 */     aqn1.cJ().b(ayd.n);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void c(aag ☃, aqn aqn1, long l) {
/* 28 */     aqn1.cJ().<atb>c(ayd.n).ifPresent(atb1 -> ☃.t().a(atb1.a()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\asu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */