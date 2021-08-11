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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class atm
/*    */   extends arv<aqm>
/*    */ {
/*    */   private final int b;
/*    */   private final int c;
/*    */   private int d;
/*    */   
/*    */   public atm(int ☃, int i) {
/* 29 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.B, aye.a, ayd.C, aye.a));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 34 */     this.c = ☃ * 20;
/* 35 */     this.d = 0;
/* 36 */     this.b = i;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, aqm aqm1, long l) {
/* 41 */     arf<?> arf = aqm1.cJ();
/* 42 */     Optional<Long> optional = arf.c(ayd.C);
/* 43 */     boolean bool = (((Long)optional.get()).longValue() + 300L <= l);
/*    */     
/* 45 */     if (this.d > this.c || bool) {
/* 46 */       arf.b(ayd.C);
/* 47 */       arf.b(ayd.B);
/* 48 */       arf.a(☃.U(), ☃.T());
/* 49 */       this.d = 0;
/*    */       
/*    */       return;
/*    */     } 
/* 53 */     fx fx = ((gf)arf.<gf>c(ayd.B).get()).b();
/* 54 */     if (fx.a(aqm1.cB(), this.b))
/* 55 */       this.d++; 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\atm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */