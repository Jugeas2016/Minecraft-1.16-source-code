/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import java.util.Comparator;
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import java.util.stream.Collectors;
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
/*    */ public class ayv
/*    */   extends azb<aqm>
/*    */ {
/*    */   protected void a(aag ☃, aqm aqm1) {
/* 22 */     dci dci = aqm1.cc().c(16.0D, 16.0D, 16.0D);
/* 23 */     List<aqm> list = ☃.a(aqm.class, dci, aqm1 -> (aqm1 != ☃ && aqm1.aX()));
/* 24 */     list.sort(Comparator.comparingDouble(aqm1::h));
/*    */     
/* 26 */     arf<?> arf = aqm1.cJ();
/* 27 */     arf.a(ayd.g, list);
/* 28 */     arf.a(ayd.h, (List<aqm>)list.stream()
/* 29 */         .filter(aqm1 -> a(☃, aqm1))
/* 30 */         .collect(Collectors.toList()));
/*    */   }
/*    */ 
/*    */   
/*    */   public Set<ayd<?>> a() {
/* 35 */     return (Set<ayd<?>>)ImmutableSet.of(ayd.g, ayd.h);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ayv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */