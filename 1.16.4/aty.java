/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
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
/*    */ public class aty<E extends aqn>
/*    */   extends arv<E>
/*    */ {
/*    */   private final Predicate<aqm> b;
/*    */   
/*    */   public aty(Predicate<aqm> ☃) {
/* 24 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.o, aye.a, ayd.D, aye.c));
/*    */ 
/*    */ 
/*    */     
/* 28 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public aty() {
/* 36 */     this(☃ -> false);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, E e, long l) {
/* 42 */     if (a((aqm)e)) {
/*    */       
/* 44 */       d(e);
/*    */       
/*    */       return;
/*    */     } 
/* 48 */     if (c(e)) {
/*    */       
/* 50 */       d(e);
/*    */       
/*    */       return;
/*    */     } 
/* 54 */     if (a(e)) {
/*    */       
/* 56 */       d(e);
/*    */       
/*    */       return;
/*    */     } 
/* 60 */     if (!aqd.f.test(b(e))) {
/*    */       
/* 62 */       d(e);
/*    */       
/*    */       return;
/*    */     } 
/* 66 */     if (this.b.test(b(e))) {
/*    */       
/* 68 */       d(e);
/*    */       return;
/*    */     } 
/*    */   }
/*    */   
/*    */   private boolean a(E ☃) {
/* 74 */     return ((b(☃)).l != ((aqn)☃).l);
/*    */   }
/*    */   
/*    */   private aqm b(E ☃) {
/* 78 */     return ☃.cJ().<aqm>c(ayd.o).get();
/*    */   }
/*    */   
/*    */   private static <E extends aqm> boolean a(E ☃) {
/* 82 */     Optional<Long> optional = ☃.cJ().c(ayd.D);
/* 83 */     return (optional.isPresent() && ((aqm)☃).l.T() - ((Long)optional.get()).longValue() > 200L);
/*    */   }
/*    */   
/*    */   private boolean c(E ☃) {
/* 87 */     Optional<aqm> optional = ☃.cJ().c(ayd.o);
/* 88 */     return (optional.isPresent() && !((aqm)optional.get()).aX());
/*    */   }
/*    */   
/*    */   private void d(E ☃) {
/* 92 */     ☃.cJ().b(ayd.o);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aty.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */