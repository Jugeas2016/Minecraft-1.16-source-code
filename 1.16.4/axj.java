/*    */ import javax.annotation.Nullable;
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
/*    */ public class axj
/*    */   extends axk
/*    */ {
/*    */   public axj(aqu ☃, double d) {
/* 17 */     super(☃, d);
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   protected dcn g() {
/* 23 */     dcn ☃ = null;
/* 24 */     if (this.a.aE()) {
/* 25 */       ☃ = azj.b(this.a, 15, 15);
/*    */     }
/* 27 */     if (this.a.cY().nextFloat() >= this.h) {
/* 28 */       ☃ = j();
/*    */     }
/* 30 */     return (☃ == null) ? super.g() : ☃;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   private dcn j() {
/* 35 */     fx ☃ = this.a.cB();
/*    */     
/* 37 */     fx.a a1 = new fx.a();
/* 38 */     fx.a a2 = new fx.a();
/* 39 */     Iterable<fx> iterable = fx.b(
/* 40 */         afm.c(this.a.cD() - 3.0D), 
/* 41 */         afm.c(this.a.cE() - 6.0D), 
/* 42 */         afm.c(this.a.cH() - 3.0D), 
/* 43 */         afm.c(this.a.cD() + 3.0D), 
/* 44 */         afm.c(this.a.cE() + 6.0D), 
/* 45 */         afm.c(this.a.cH() + 3.0D));
/*    */ 
/*    */     
/* 48 */     for (fx fx : iterable) {
/* 49 */       if (☃.equals(fx)) {
/*    */         continue;
/*    */       }
/*    */       
/* 53 */       buo buo = this.a.l.d_(a2.a(fx, gc.a)).b();
/* 54 */       boolean bool = (buo instanceof bxx || buo.a(aed.s));
/* 55 */       if (bool && this.a.l.w(fx) && this.a.l.w(a1.a(fx, gc.b))) {
/* 56 */         return dcn.c(fx);
/*    */       }
/*    */     } 
/*    */     
/* 60 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\axj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */