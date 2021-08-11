/*    */ import com.google.common.collect.ImmutableMap;
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
/*    */ public class aze
/*    */   extends azb<aqm>
/*    */ {
/* 20 */   private static final ImmutableMap<aqe<?>, Float> a = ImmutableMap.builder()
/* 21 */     .put(aqe.q, Float.valueOf(8.0F))
/* 22 */     .put(aqe.w, Float.valueOf(12.0F))
/* 23 */     .put(aqe.I, Float.valueOf(8.0F))
/* 24 */     .put(aqe.J, Float.valueOf(12.0F))
/* 25 */     .put(aqe.ak, Float.valueOf(15.0F))
/* 26 */     .put(aqe.ap, Float.valueOf(12.0F))
/* 27 */     .put(aqe.aO, Float.valueOf(8.0F))
/* 28 */     .put(aqe.aQ, Float.valueOf(10.0F))
/* 29 */     .put(aqe.aX, Float.valueOf(10.0F))
/* 30 */     .put(aqe.aY, Float.valueOf(8.0F))
/* 31 */     .put(aqe.ba, Float.valueOf(8.0F))
/* 32 */     .build();
/*    */ 
/*    */   
/*    */   public Set<ayd<?>> a() {
/* 36 */     return (Set<ayd<?>>)ImmutableSet.of(ayd.A);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, aqm aqm1) {
/* 43 */     aqm1.cJ().a(ayd.A, a(aqm1));
/*    */   }
/*    */   
/*    */   private Optional<aqm> a(aqm ☃) {
/* 47 */     return b(☃).flatMap(list -> list.stream().filter(this::c).filter(()).min(()));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private Optional<List<aqm>> b(aqm ☃) {
/* 56 */     return ☃.cJ().c(ayd.h);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private int a(aqm ☃, aqm aqm1, aqm aqm2) {
/* 64 */     return afm.c(aqm1.h(☃) - aqm2.h(☃));
/*    */   }
/*    */   
/*    */   private boolean b(aqm ☃, aqm aqm1) {
/* 68 */     float f = ((Float)a.get(aqm1.X())).floatValue();
/* 69 */     return (aqm1.h(☃) <= (f * f));
/*    */   }
/*    */   
/*    */   private boolean c(aqm ☃) {
/* 73 */     return a.containsKey(☃.X());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aze.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */