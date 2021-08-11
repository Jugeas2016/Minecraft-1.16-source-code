/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bfb<E extends bes>
/*    */   extends arv<E>
/*    */ {
/*    */   private final int b;
/*    */   private final int c;
/*    */   
/*    */   public bfb(int ☃, int i) {
/* 17 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.N, aye.a, ayd.J, aye.a, ayd.O, aye.c, ayd.P, aye.c));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 23 */     this.b = ☃;
/* 24 */     this.c = i;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, E e) {
/* 29 */     return e.dE().a();
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, E e, long l) {
/* 34 */     arf<bes> arf = e.cJ();
/* 35 */     Optional<Integer> optional = arf.c(ayd.O);
/* 36 */     if (!optional.isPresent()) {
/* 37 */       arf.a(ayd.O, Integer.valueOf(0));
/*    */     } else {
/* 39 */       int i = ((Integer)optional.get()).intValue();
/* 40 */       if (i > this.b) {
/* 41 */         arf.b(ayd.N);
/* 42 */         arf.b(ayd.O);
/* 43 */         arf.a(ayd.P, Boolean.valueOf(true), this.c);
/*    */       } else {
/* 45 */         arf.a(ayd.O, Integer.valueOf(i + 1));
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bfb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */