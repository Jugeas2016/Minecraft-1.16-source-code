/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
/*    */ import java.util.Optional;
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
/*    */ 
/*    */ public class ayr
/*    */   extends azb<bem>
/*    */ {
/*    */   public Set<ayd<?>> a() {
/* 25 */     return (Set<ayd<?>>)ImmutableSet.of(ayd.h, ayd.ag, ayd.aa, ayd.Z, ayd.ac, ayd.ad, (Object[])new ayd[0]);
/*    */   }
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
/*    */   protected void a(aag ☃, bem bem1) {
/* 40 */     arf<?> arf = bem1.cJ();
/*    */     
/* 42 */     arf.a(ayd.ag, b(☃, bem1));
/*    */     
/* 44 */     Optional<bes> optional = Optional.empty();
/* 45 */     int i = 0;
/*    */     
/* 47 */     List<bem> list = Lists.newArrayList();
/*    */ 
/*    */     
/* 50 */     List<aqm> list1 = arf.<List<aqm>>c(ayd.h).orElse(Lists.newArrayList());
/* 51 */     for (aqm aqm : list1) {
/* 52 */       if (aqm instanceof bes && !aqm.w_()) {
/* 53 */         i++;
/* 54 */         if (!optional.isPresent()) {
/* 55 */           optional = Optional.of((bes)aqm);
/*    */         }
/*    */       } 
/*    */       
/* 59 */       if (aqm instanceof bem && !aqm.w_()) {
/* 60 */         list.add((bem)aqm);
/*    */       }
/*    */     } 
/*    */     
/* 64 */     arf.a(ayd.aa, (Optional)optional);
/* 65 */     arf.a(ayd.Z, list);
/* 66 */     arf.a(ayd.ac, Integer.valueOf(i));
/* 67 */     arf.a(ayd.ad, Integer.valueOf(list.size()));
/*    */   }
/*    */   
/*    */   private Optional<fx> b(aag ☃, bem bem1) {
/* 71 */     return fx.a(bem1
/* 72 */         .cB(), 8, 4, fx1 -> ☃.d_(fx1).a(aed.av));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ayr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */