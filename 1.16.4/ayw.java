/*    */ import com.google.common.collect.ImmutableList;
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
/*    */ public class ayw
/*    */   extends azb<aqm>
/*    */ {
/*    */   public Set<ayd<?>> a() {
/* 22 */     return (Set<ayd<?>>)ImmutableSet.of(ayd.h, ayd.K, ayd.X);
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
/*    */   protected void a(aag ☃, aqm aqm1) {
/* 34 */     arf<?> arf = aqm1.cJ();
/*    */     
/* 36 */     Optional<aqn> optional = Optional.empty();
/* 37 */     List<ber> list = Lists.newArrayList();
/*    */ 
/*    */     
/* 40 */     List<aqm> list1 = (List<aqm>)arf.c(ayd.h).orElse(ImmutableList.of());
/* 41 */     for (aqm aqm2 : list1) {
/* 42 */       if (aqm2 instanceof beh || aqm2 instanceof bcl) {
/* 43 */         optional = Optional.of((aqn)aqm2);
/*    */         
/*    */         break;
/*    */       } 
/*    */     } 
/* 48 */     List<aqm> list2 = (List<aqm>)arf.c(ayd.g).orElse(ImmutableList.of());
/* 49 */     for (aqm aqm2 : list2) {
/* 50 */       if (aqm2 instanceof ber && ((ber)aqm2).eM()) {
/* 51 */         list.add((ber)aqm2);
/*    */       }
/*    */     } 
/*    */     
/* 55 */     arf.a(ayd.K, optional);
/* 56 */     arf.a(ayd.X, list);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ayw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */