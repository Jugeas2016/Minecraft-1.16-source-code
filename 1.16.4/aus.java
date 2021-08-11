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
/*    */ public class aus
/*    */   extends arv<bfj>
/*    */ {
/*    */   private final float b;
/*    */   
/*    */   public aus(float ☃) {
/* 25 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.d, aye.a, ayd.c, aye.b, ayd.g, aye.a));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 30 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, bfj bfj1) {
/* 35 */     if (bfj1.w_()) {
/* 36 */       return false;
/*    */     }
/*    */     
/* 39 */     return (bfj1.eX().b() == bfm.a);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, bfj bfj1, long l) {
/* 44 */     fx fx = ((gf)bfj1.cJ().<gf>c(ayd.d).get()).b();
/*    */     
/* 46 */     Optional<azr> optional = ☃.y().c(fx);
/* 47 */     if (!optional.isPresent()) {
/*    */       return;
/*    */     }
/*    */     
/* 51 */     arw.a(bfj1, bfj1 -> a(☃.get(), bfj1, fx1))
/* 52 */       .findFirst()
/* 53 */       .ifPresent(bfj2 -> a(☃, bfj1, bfj2, fx1, bfj2.cJ().<gf>c(ayd.c).isPresent()));
/*    */   }
/*    */ 
/*    */   
/*    */   private boolean a(azr ☃, bfj bfj1, fx fx1) {
/* 58 */     boolean bool = bfj1.cJ().<gf>c(ayd.d).isPresent();
/* 59 */     if (bool) {
/* 60 */       return false;
/*    */     }
/*    */     
/* 63 */     Optional<gf> optional = bfj1.cJ().c(ayd.c);
/* 64 */     bfm bfm = bfj1.eX().b();
/*    */ 
/*    */     
/* 67 */     if (bfj1.eX().b() != bfm.a && bfm.b().c().test(☃)) {
/* 68 */       if (!optional.isPresent()) {
/* 69 */         return a(bfj1, fx1, ☃);
/*    */       }
/* 71 */       return ((gf)optional.get()).b().equals(fx1);
/*    */     } 
/* 73 */     return false;
/*    */   }
/*    */   
/*    */   private void a(aag ☃, bfj bfj1, bfj bfj2, fx fx1, boolean bool) {
/* 77 */     a(bfj1);
/*    */     
/* 79 */     if (!bool) {
/* 80 */       arw.a(bfj2, fx1, this.b, 1);
/* 81 */       bfj2.cJ().a(ayd.d, gf.a(☃.Y(), fx1));
/* 82 */       rz.c(☃, fx1);
/*    */     } 
/*    */   }
/*    */   
/*    */   private boolean a(bfj ☃, fx fx1, azr azr1) {
/* 87 */     cxd cxd = ☃.x().a(fx1, azr1.d());
/* 88 */     return (cxd != null && cxd.j());
/*    */   }
/*    */   
/*    */   private void a(bfj ☃) {
/* 92 */     ☃.cJ().b(ayd.m);
/* 93 */     ☃.cJ().b(ayd.n);
/* 94 */     ☃.cJ().b(ayd.d);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */