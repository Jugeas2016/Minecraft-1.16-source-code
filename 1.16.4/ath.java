/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.google.common.collect.Maps;
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
/*    */ 
/*    */ 
/*    */ public class ath<E extends aqm>
/*    */   extends arv<E>
/*    */ {
/*    */   private final Predicate<E> b;
/*    */   private final arv<? super E> c;
/*    */   private final boolean d;
/*    */   
/*    */   public ath(Map<ayd<?>, aye> ☃, Predicate<E> predicate, arv<? super E> arv1, boolean bool) {
/* 26 */     super(a(☃, arv1.a));
/* 27 */     this.b = predicate;
/* 28 */     this.c = arv1;
/* 29 */     this.d = bool;
/*    */   }
/*    */   
/*    */   private static Map<ayd<?>, aye> a(Map<ayd<?>, aye> ☃, Map<ayd<?>, aye> map1) {
/* 33 */     Map<ayd<?>, aye> map = Maps.newHashMap();
/* 34 */     map.putAll(☃);
/* 35 */     map.putAll(map1);
/* 36 */     return map;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ath(Predicate<E> ☃, arv<? super E> arv1) {
/* 44 */     this((Map<ayd<?>, aye>)ImmutableMap.of(), ☃, arv1, false);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, E e) {
/* 53 */     return (this.b.test(e) && this.c.a(☃, e));
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean b(aag ☃, E e, long l) {
/* 58 */     return (this.d && this.b.test(e) && this.c.b(☃, e, l));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean a(long ☃) {
/* 64 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, E e, long l) {
/* 69 */     this.c.a(☃, e, l);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void d(aag ☃, E e, long l) {
/* 74 */     this.c.d(☃, e, l);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void c(aag ☃, E e, long l) {
/* 79 */     this.c.c(☃, e, l);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 84 */     return "RunIf: " + this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ath.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */