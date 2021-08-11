/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import com.google.common.collect.Lists;
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
/*    */ public class azd
/*    */   extends azb<aqm>
/*    */ {
/*    */   public Set<ayd<?>> a() {
/* 21 */     return (Set<ayd<?>>)ImmutableSet.of(ayd.i);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, aqm aqm1) {
/* 26 */     aqm1.cJ().a(ayd.i, a(aqm1));
/*    */   }
/*    */   
/*    */   private List<aqm> a(aqm ☃) {
/* 30 */     return (List<aqm>)c(☃).stream()
/* 31 */       .filter(this::b)
/* 32 */       .collect(Collectors.toList());
/*    */   }
/*    */   
/*    */   private boolean b(aqm ☃) {
/* 36 */     return (☃.X() == aqe.aP && ☃.w_());
/*    */   }
/*    */   
/*    */   private List<aqm> c(aqm ☃) {
/* 40 */     return ☃.cJ().<List<aqm>>c(ayd.h)
/* 41 */       .orElse(Lists.newArrayList());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\azd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */