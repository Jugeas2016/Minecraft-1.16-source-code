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
/*    */ public class aur
/*    */   extends arv<bfj>
/*    */ {
/*    */   private long b;
/*    */   
/*    */   public aur() {
/* 25 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.c, aye.a, ayd.n, aye.c));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean b(aag ☃, bfj bfj1) {
/* 33 */     if (☃.T() - this.b < 300L) {
/* 34 */       return false;
/*    */     }
/*    */     
/* 37 */     if (☃.t.nextInt(2) != 0) {
/* 38 */       return false;
/*    */     }
/*    */     
/* 41 */     this.b = ☃.T();
/*    */     
/* 43 */     gf gf = bfj1.cJ().<gf>c(ayd.c).get();
/* 44 */     return (gf.a() == ☃.Y() && gf.b().a(bfj1.cA(), 1.73D));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, bfj bfj1, long l) {
/* 49 */     arf<bfj> arf = bfj1.cJ();
/* 50 */     arf.a(ayd.H, Long.valueOf(l));
/* 51 */     arf.<gf>c(ayd.c).ifPresent(gf1 -> ☃.a(ayd.n, new arx(gf1.b())));
/*    */ 
/*    */ 
/*    */     
/* 55 */     bfj1.fd();
/* 56 */     a(☃, bfj1);
/*    */     
/* 58 */     if (bfj1.fc()) {
/* 59 */       bfj1.fb();
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, bfj bfj1) {}
/*    */ 
/*    */   
/*    */   protected boolean b(aag ☃, bfj bfj1, long l) {
/* 69 */     Optional<gf> optional = bfj1.cJ().c(ayd.c);
/* 70 */     if (!optional.isPresent()) {
/* 71 */       return false;
/*    */     }
/*    */     
/* 74 */     gf gf = optional.get();
/* 75 */     return (gf.a() == ☃.Y() && gf
/* 76 */       .b().a(bfj1.cA(), 1.73D));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aur.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */