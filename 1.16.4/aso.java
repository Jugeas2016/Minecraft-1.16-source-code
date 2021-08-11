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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aso<E extends aqm, T extends aqm>
/*    */   extends arv<E>
/*    */ {
/*    */   private final int b;
/*    */   private final float c;
/*    */   private final aqe<? extends T> d;
/*    */   private final int e;
/*    */   private final Predicate<T> f;
/*    */   private final Predicate<E> g;
/*    */   private final ayd<T> h;
/*    */   
/*    */   public aso(aqe<? extends T> ☃, int i, Predicate<E> predicate, Predicate<T> predicate1, ayd<T> ayd1, float f, int j) {
/* 28 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.n, aye.c, ayd.m, aye.b, ayd.h, aye.a));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 34 */     this.d = ☃;
/* 35 */     this.c = f;
/* 36 */     this.e = i * i;
/* 37 */     this.b = j;
/* 38 */     this.f = predicate1;
/* 39 */     this.g = predicate;
/* 40 */     this.h = ayd1;
/*    */   }
/*    */   
/*    */   public static <T extends aqm> aso<aqm, T> a(aqe<? extends T> ☃, int i, ayd<T> ayd1, float f, int j) {
/* 44 */     return new aso<>(☃, i, ☃ -> true, ☃ -> true, ayd1, f, j);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, E e) {
/* 53 */     return (this.g.test(e) && a(e));
/*    */   }
/*    */   
/*    */   private boolean a(E ☃) {
/* 57 */     List<aqm> list = ☃.cJ().<List<aqm>>c(ayd.h).get();
/* 58 */     return list.stream().anyMatch(this::b);
/*    */   }
/*    */   
/*    */   private boolean b(aqm ☃) {
/* 62 */     return (this.d.equals(☃.X()) && this.f.test((T)☃));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, E e, long l) {
/* 67 */     arf<?> arf = e.cJ();
/* 68 */     arf.<List<aqm>>c(ayd.h).ifPresent(list -> list.stream().filter(()).map(()).filter(()).filter(this.f).findFirst().ifPresent(()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aso.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */