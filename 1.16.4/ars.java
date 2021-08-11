/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ars<E extends apy>
/*    */   extends arv<E>
/*    */ {
/*    */   private final afh b;
/*    */   private final float c;
/*    */   
/*    */   public ars(afh ☃, float f) {
/* 15 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.I, aye.a, ayd.m, aye.b));
/*    */ 
/*    */ 
/*    */     
/* 19 */     this.b = ☃;
/* 20 */     this.c = f;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, E e) {
/* 25 */     if (!e.w_()) {
/* 26 */       return false;
/*    */     }
/* 28 */     apy apy = a(e);
/* 29 */     return (e.a(apy, (this.b.b() + 1)) && 
/* 30 */       !e.a(apy, this.b.a()));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, E e, long l) {
/* 35 */     arw.a((aqm)e, a(e), this.c, this.b.a() - 1);
/*    */   }
/*    */   
/*    */   private apy a(E ☃) {
/* 39 */     return ☃.cJ().<apy>c(ayd.I).get();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ars.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */