/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ import java.util.function.Predicate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class arz<E extends aqn, T>
/*    */   extends arv<E>
/*    */ {
/*    */   private final Predicate<E> b;
/*    */   private final ayd<? extends T> c;
/*    */   private final ayd<T> d;
/*    */   private final afh e;
/*    */   
/*    */   public arz(Predicate<E> ☃, ayd<? extends T> ayd1, ayd<T> ayd2, afh afh1) {
/* 20 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd1, aye.a, ayd2, aye.b));
/*    */ 
/*    */ 
/*    */     
/* 24 */     this.b = ☃;
/* 25 */     this.c = ayd1;
/* 26 */     this.d = ayd2;
/* 27 */     this.e = afh1;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, E e) {
/* 32 */     return this.b.test(e);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, E e, long l) {
/* 37 */     arf<?> arf = e.cJ();
/* 38 */     arf.a(this.d, arf.<T>c((ayd)this.c).get(), this.e.a(☃.t));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\arz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */