/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ask
/*    */   extends arv<bfj>
/*    */ {
/*    */   final float b;
/*    */   
/*    */   public ask(float ☃) {
/* 29 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.d, aye.a), 1200);
/*    */ 
/*    */     
/* 32 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, bfj bfj1) {
/* 37 */     return ((Boolean)bfj1.cJ().f().<Boolean>map(☃ -> Boolean.valueOf((☃ == bhf.b || ☃ == bhf.c || ☃ == bhf.d))).orElse(Boolean.valueOf(true))).booleanValue();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, bfj bfj1, long l) {
/* 43 */     return bfj1.cJ().a(ayd.d);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b(aag ☃, bfj bfj1, long l) {
/* 48 */     arw.a(bfj1, ((gf)bfj1.cJ().<gf>c(ayd.d).get()).b(), this.b, 1);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void c(aag ☃, bfj bfj1, long l) {
/* 53 */     Optional<gf> optional = bfj1.cJ().c(ayd.d);
/* 54 */     optional.ifPresent(gf1 -> {
/*    */           fx fx = gf1.b();
/*    */           aag aag1 = ☃.l().a(gf1.a());
/*    */           if (aag1 == null) {
/*    */             return;
/*    */           }
/*    */           azo azo = aag1.y();
/*    */           if (azo.a(fx, ())) {
/*    */             azo.b(fx);
/*    */           }
/*    */           rz.c(☃, fx);
/*    */         });
/* 66 */     bfj1.cJ().b(ayd.d);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ask.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */