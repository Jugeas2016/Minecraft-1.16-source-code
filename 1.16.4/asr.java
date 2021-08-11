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
/*    */ public class asr
/*    */   extends arv<aqm>
/*    */ {
/*    */   private final float b;
/*    */   private final int c;
/*    */   private final int d;
/* 21 */   private Optional<fx> e = Optional.empty();
/*    */   
/*    */   public asr(int ☃, float f, int i) {
/* 24 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.m, aye.b, ayd.b, aye.c, ayd.B, aye.c));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 30 */     this.c = ☃;
/* 31 */     this.b = f;
/* 32 */     this.d = i;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, aqm aqm1) {
/* 37 */     Optional<fx> optional = ☃.y().c(☃ -> (☃ == azr.r), ☃ -> true, aqm1.cB(), this.d + 1, azo.b.c);
/*    */     
/* 39 */     if (optional.isPresent() && ((fx)optional.get()).a(aqm1.cA(), this.d)) {
/* 40 */       this.e = optional;
/*    */     } else {
/* 42 */       this.e = Optional.empty();
/*    */     } 
/*    */     
/* 45 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, aqm aqm1, long l) {
/* 50 */     arf<?> arf = aqm1.cJ();
/*    */     
/* 52 */     Optional<fx> optional = this.e;
/*    */     
/* 54 */     if (!optional.isPresent()) {
/* 55 */       optional = ☃.y().a(☃ -> (☃ == azr.r), ☃ -> true, azo.b.c, aqm1.cB(), this.c, aqm1.cY());
/* 56 */       if (!optional.isPresent()) {
/* 57 */         Optional<gf> optional1 = arf.c(ayd.b);
/* 58 */         if (optional1.isPresent()) {
/* 59 */           optional = Optional.of(((gf)optional1.get()).b());
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 64 */     if (optional.isPresent()) {
/* 65 */       arf.b(ayd.t);
/* 66 */       arf.b(ayd.n);
/* 67 */       arf.b(ayd.r);
/* 68 */       arf.b(ayd.q);
/* 69 */       arf.a(ayd.B, gf.a(☃.Y(), optional.get()));
/* 70 */       if (!((fx)optional.get()).a(aqm1.cA(), this.d))
/* 71 */         arf.a(ayd.m, new ayf(optional.get(), this.b, this.d)); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\asr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */