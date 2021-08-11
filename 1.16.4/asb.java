/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ import java.util.function.BiPredicate;
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
/*    */ public class asb<E extends aqm, T extends aqa>
/*    */   extends arv<E>
/*    */ {
/*    */   private final int b;
/*    */   private final BiPredicate<E, aqa> c;
/*    */   
/*    */   public asb(int ☃, BiPredicate<E, aqa> biPredicate) {
/* 21 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.s, aye.c));
/*    */ 
/*    */     
/* 24 */     this.b = ☃;
/* 25 */     this.c = biPredicate;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, E e) {
/* 30 */     aqa aqa1 = e.ct();
/* 31 */     aqa aqa2 = e.cJ().<aqa>c(ayd.s).orElse(null);
/* 32 */     if (aqa1 == null && aqa2 == null) {
/* 33 */       return false;
/*    */     }
/* 35 */     aqa aqa3 = (aqa1 == null) ? aqa2 : aqa1;
/* 36 */     return (!a(e, aqa3) || this.c.test(e, aqa3));
/*    */   }
/*    */   
/*    */   private boolean a(E ☃, aqa aqa1) {
/* 40 */     return (aqa1.aX() && aqa1
/* 41 */       .a((aqa)☃, this.b) && aqa1.l == ((aqm)☃).l);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, E e, long l) {
/* 47 */     e.l();
/* 48 */     e.cJ().b(ayd.s);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\asb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */