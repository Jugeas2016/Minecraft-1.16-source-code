/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
/*    */ import java.util.function.Function;
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
/*    */ public class atw<E extends aqn>
/*    */   extends arv<E>
/*    */ {
/*    */   private final Predicate<E> b;
/*    */   private final Function<E, Optional<? extends aqm>> c;
/*    */   
/*    */   public atw(Predicate<E> ☃, Function<E, Optional<? extends aqm>> function) {
/* 25 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.o, aye.b, ayd.D, aye.c));
/*    */ 
/*    */ 
/*    */     
/* 29 */     this.b = ☃;
/* 30 */     this.c = function;
/*    */   }
/*    */   
/*    */   public atw(Function<E, Optional<? extends aqm>> ☃) {
/* 34 */     this(☃ -> true, ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, E e) {
/* 39 */     if (!this.b.test(e)) {
/* 40 */       return false;
/*    */     }
/*    */     
/* 43 */     Optional<? extends aqm> optional = this.c.apply(e);
/* 44 */     return (optional.isPresent() && ((aqm)optional.get()).aX());
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, E e, long l) {
/* 49 */     ((Optional)this.c.apply(e)).ifPresent(aqm1 -> a((E)☃, aqm1));
/*    */   }
/*    */   
/*    */   private void a(E ☃, aqm aqm1) {
/* 53 */     ☃.cJ().a(ayd.o, aqm1);
/* 54 */     ☃.cJ().b(ayd.D);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\atw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */