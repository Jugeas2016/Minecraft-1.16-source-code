/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import java.util.Comparator;
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
/*    */ public class ayu
/*    */   extends azb<aqn>
/*    */ {
/*    */   public Set<ayd<?>> a() {
/* 22 */     return (Set<ayd<?>>)ImmutableSet.of(ayd.J);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, aqn aqn1) {
/* 28 */     arf<?> arf = aqn1.cJ();
/*    */     
/* 30 */     List<bcv> list = ☃.a(bcv.class, aqn1.cc().c(8.0D, 4.0D, 8.0D), ☃ -> true);
/* 31 */     list.sort(Comparator.comparingDouble(aqn1::h));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 37 */     Optional<bcv> optional = list.stream().filter(bcv1 -> ☃.i(bcv1.g())).filter(bcv1 -> bcv1.a(☃, 9.0D)).filter(aqn1::D).findFirst();
/* 38 */     arf.a(ayd.J, optional);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ayu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */