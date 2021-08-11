/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.List;
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
/*    */ public class atv
/*    */   extends arv<aqm>
/*    */ {
/*    */   public atv() {
/* 19 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.m, aye.c, ayd.n, aye.c, ayd.e, aye.a, ayd.h, aye.a, ayd.q, aye.b));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, aqm aqm1) {
/* 30 */     arf<?> arf = aqm1.cJ();
/* 31 */     Optional<gf> optional = arf.c(ayd.e);
/* 32 */     return (☃.u_().nextInt(100) == 0 && optional
/* 33 */       .isPresent() && ☃
/* 34 */       .Y() == ((gf)optional.get()).a() && ((gf)optional
/* 35 */       .get()).b().a(aqm1.cA(), 4.0D) && ((List)arf
/* 36 */       .<List>c((ayd)ayd.h).get()).stream().anyMatch(☃ -> aqe.aP.equals(☃.X())));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, aqm aqm1, long l) {
/* 41 */     arf<?> arf = aqm1.cJ();
/* 42 */     arf.<List<aqm>>c(ayd.h).ifPresent(list -> list.stream().filter(()).filter(()).findFirst().ifPresent(()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\atv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */