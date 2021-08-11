/*    */ import com.google.common.collect.ImmutableSet;
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
/*    */ public class ayo
/*    */   extends azb<apy>
/*    */ {
/*    */   public Set<ayd<?>> a() {
/* 20 */     return (Set<ayd<?>>)ImmutableSet.of(ayd.I, ayd.h);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, apy apy1) {
/* 27 */     apy1.cJ().<List<aqm>>c(ayd.h).ifPresent(list -> a(☃, list));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private void a(apy ☃, List<aqm> list) {
/* 37 */     Optional<apy> optional = list.stream().filter(aqm1 -> (aqm1.X() == ☃.X())).map(☃ -> (apy)☃).filter(☃ -> !☃.w_()).findFirst();
/* 38 */     ☃.cJ().a(ayd.I, optional);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ayo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */