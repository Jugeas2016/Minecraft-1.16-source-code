/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class art<E extends aqn>
/*    */   extends arv<E>
/*    */ {
/*    */   private final int b;
/*    */   private final float c;
/*    */   
/*    */   public art(int ☃, float f) {
/* 19 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.m, aye.b, ayd.n, aye.c, ayd.o, aye.a, ayd.h, aye.a));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 25 */     this.b = ☃;
/* 26 */     this.c = f;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, E e) {
/* 31 */     return (a(e) && b(e));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, E e, long l) {
/* 36 */     e.cJ().a(ayd.n, new asd(c(e), true));
/* 37 */     e.u().a(-this.c, 0.0F);
/*    */ 
/*    */ 
/*    */     
/* 41 */     ((aqn)e).p = afm.b(((aqn)e).p, ((aqn)e).aC, 0.0F);
/*    */   }
/*    */   
/*    */   private boolean a(E ☃) {
/* 45 */     return ((List)☃.cJ().<List>c((ayd)ayd.h).get()).contains(c(☃));
/*    */   }
/*    */   
/*    */   private boolean b(E ☃) {
/* 49 */     return c(☃).a((aqa)☃, this.b);
/*    */   }
/*    */   
/*    */   private aqm c(E ☃) {
/* 53 */     return ☃.cJ().<aqm>c(ayd.o).get();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\art.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */