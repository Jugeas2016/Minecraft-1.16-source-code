/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import java.util.Comparator;
/*    */ import java.util.List;
/*    */ import java.util.Optional;
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
/*    */ public class ayy
/*    */   extends azb<aqm>
/*    */ {
/*    */   public Set<ayd<?>> a() {
/* 20 */     return (Set<ayd<?>>)ImmutableSet.of(ayd.j, ayd.k, ayd.l);
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
/*    */   protected void a(aag ☃, aqm aqm1) {
/* 33 */     List<bfw> list1 = (List<bfw>)☃.x().stream().filter(aqd.g).filter(aah1 -> ☃.a(aah1, 16.0D)).sorted(Comparator.comparingDouble(aqm1::h)).collect(Collectors.toList());
/*    */     
/* 35 */     arf<?> arf = aqm1.cJ();
/* 36 */     arf.a(ayd.j, list1);
/*    */ 
/*    */     
/* 39 */     List<bfw> list2 = (List<bfw>)list1.stream().filter(bfw1 -> a(☃, bfw1)).collect(Collectors.toList());
/* 40 */     arf.a(ayd.k, list2.isEmpty() ? null : list2.get(0));
/* 41 */     Optional<bfw> optional = list2.stream().filter(aqd.f).findFirst();
/* 42 */     arf.a(ayd.l, optional);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ayy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */