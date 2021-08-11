/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.function.Predicate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class atn
/*    */   extends arv<aqm>
/*    */ {
/*    */   private final aqe<?> b;
/*    */   private final int c;
/*    */   private final Predicate<aqm> d;
/*    */   private final Predicate<aqm> e;
/*    */   
/*    */   public atn(aqe<?> ☃, int i, Predicate<aqm> predicate1, Predicate<aqm> predicate2) {
/* 21 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.n, aye.c, ayd.q, aye.b, ayd.h, aye.a));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 27 */     this.b = ☃;
/* 28 */     this.c = i * i;
/* 29 */     this.d = predicate2;
/* 30 */     this.e = predicate1;
/*    */   }
/*    */   
/*    */   public atn(aqe<?> ☃, int i) {
/* 34 */     this(☃, i, ☃ -> true, ☃ -> true);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(aag ☃, aqm aqm1) {
/* 39 */     return (this.e.test(aqm1) && b(aqm1).stream().anyMatch(this::a));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(aag ☃, aqm aqm1, long l) {
/* 44 */     super.a(☃, aqm1, l);
/* 45 */     arf<?> arf = aqm1.cJ();
/*    */     
/* 47 */     arf.<List<aqm>>c(ayd.h).ifPresent(list -> list.stream().filter(()).filter(this::a).findFirst().ifPresent(()));
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
/*    */   private boolean a(aqm ☃) {
/* 60 */     return (this.b.equals(☃.X()) && this.d.test(☃));
/*    */   }
/*    */   
/*    */   private List<aqm> b(aqm ☃) {
/* 64 */     return ☃.cJ().<List<aqm>>c(ayd.h).get();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\atn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */