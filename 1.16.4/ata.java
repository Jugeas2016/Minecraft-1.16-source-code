/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
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
/*    */ public class ata
/*    */   extends arv<bfj>
/*    */ {
/*    */   final bfm b;
/*    */   
/*    */   public ata(bfm ☃) {
/* 22 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.c, aye.a, ayd.g, aye.a));
/*    */ 
/*    */ 
/*    */     
/* 26 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, bfj bfj1, long l) {
/* 31 */     gf gf = bfj1.cJ().<gf>c(ayd.c).get();
/*    */     
/* 33 */     ☃.y().c(gf.b()).ifPresent(azr1 -> arw.a(☃, ()).reduce(☃, ata::a));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static bfj a(bfj ☃, bfj bfj1) {
/*    */     bfj bfj2, bfj3;
/* 42 */     if (☃.eL() > bfj1.eL()) {
/* 43 */       bfj2 = ☃;
/* 44 */       bfj3 = bfj1;
/*    */     } else {
/* 46 */       bfj2 = bfj1;
/* 47 */       bfj3 = ☃;
/*    */     } 
/*    */     
/* 50 */     bfj3.cJ().b(ayd.c);
/* 51 */     return bfj2;
/*    */   }
/*    */   
/*    */   private boolean a(gf ☃, azr azr1, bfj bfj1) {
/* 55 */     return (a(bfj1) && ☃
/* 56 */       .equals(bfj1.cJ().<gf>c(ayd.c).get()) && 
/* 57 */       a(azr1, bfj1.eX().b()));
/*    */   }
/*    */   
/*    */   private boolean a(azr ☃, bfm bfm1) {
/* 61 */     return bfm1.b().c().test(☃);
/*    */   }
/*    */   
/*    */   private boolean a(bfj ☃) {
/* 65 */     return ☃.cJ().<gf>c(ayd.c).isPresent();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ata.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */