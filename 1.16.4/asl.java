/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ import java.util.function.Predicate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class asl<E extends aqm>
/*    */   extends arv<E>
/*    */ {
/*    */   private final Predicate<E> b;
/*    */   private final int c;
/*    */   private final float d;
/*    */   
/*    */   public asl(float ☃, boolean bool, int i) {
/* 18 */     this(☃ -> true, ☃, bool, i);
/*    */   }
/*    */   public asl(Predicate<E> ☃, float f, boolean bool, int i) {
/* 21 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.n, aye.c, ayd.m, bool ? aye.c : aye.b, ayd.J, aye.a));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 26 */     this.b = ☃;
/* 27 */     this.c = i;
/* 28 */     this.d = f;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, E e) {
/* 33 */     return (this.b.test(e) && a(e).a((aqa)e, this.c));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, E e, long l) {
/* 38 */     arw.a((aqm)e, a(e), this.d, 0);
/*    */   }
/*    */   
/*    */   private bcv a(E ☃) {
/* 42 */     return ☃.cJ().<bcv>c(ayd.J).get();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\asl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */