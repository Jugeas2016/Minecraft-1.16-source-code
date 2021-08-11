/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bfa<E extends bes>
/*    */   extends arv<E>
/*    */ {
/*    */   private final int b;
/*    */   
/*    */   public bfa(int ☃) {
/* 16 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.N, aye.a, ayd.J, aye.c));
/*    */ 
/*    */ 
/*    */     
/* 20 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, E e) {
/* 25 */     if (!e.dE().a())
/*    */     {
/* 27 */       return false;
/*    */     }
/* 29 */     Optional<bcv> optional = e.cJ().c(ayd.J);
/* 30 */     if (!optional.isPresent()) {
/* 31 */       return true;
/*    */     }
/* 33 */     return !((bcv)optional.get()).a((aqa)e, this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, E e, long l) {
/* 38 */     e.cJ().b(ayd.N);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bfa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */