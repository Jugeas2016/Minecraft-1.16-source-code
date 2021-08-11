/*    */ import java.util.Optional;
/*    */ import java.util.Random;
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
/*    */ public abstract class bxg
/*    */   extends bxf
/*    */   implements buq
/*    */ {
/*    */   protected bxg(ceg.c ☃, gc gc1, ddh ddh1, boolean bool) {
/* 20 */     super(☃, gc1, ddh1, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 25 */     if (gc1 == this.a.f() && !☃.a(bry1, fx1)) {
/* 26 */       bry1.J().a(fx1, this, 1);
/*    */     }
/*    */     
/* 29 */     bxh bxh = c();
/* 30 */     if (gc1 == this.a) {
/* 31 */       buo buo = ceh1.b();
/* 32 */       if (buo != this && buo != bxh) {
/* 33 */         return bxh.a(bry1);
/*    */       }
/*    */     } 
/*    */     
/* 37 */     if (this.b) {
/* 38 */       bry1.I().a(fx1, cuy.c, cuy.c.a(bry1));
/*    */     }
/*    */     
/* 41 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public bmb a(brc ☃, fx fx1, ceh ceh1) {
/* 47 */     return new bmb(c());
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(brc ☃, fx fx1, ceh ceh1, boolean bool) {
/* 52 */     Optional<fx> optional = b(☃, fx1, ceh1);
/* 53 */     return (optional.isPresent() && c().h(☃.d_(((fx)optional.get()).a(this.a))));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(brx ☃, Random random, fx fx1, ceh ceh1) {
/* 58 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(aag ☃, Random random, fx fx1, ceh ceh1) {
/* 63 */     Optional<fx> optional = b(☃, fx1, ceh1);
/*    */     
/* 65 */     if (optional.isPresent()) {
/* 66 */       ceh ceh2 = ☃.d_(optional.get());
/* 67 */       ((bxh)ceh2.b()).a(☃, random, optional.get(), ceh2);
/*    */     } 
/*    */   }
/*    */   private Optional<fx> b(brc ☃, fx fx1, ceh ceh1) {
/*    */     buo buo;
/* 72 */     fx fx2 = fx1;
/*    */     
/*    */     do {
/* 75 */       fx2 = fx2.a(this.a);
/* 76 */       buo = ☃.d_(fx2).b();
/* 77 */     } while (buo == ceh1.b());
/*    */     
/* 79 */     if (buo == c()) {
/* 80 */       return Optional.of(fx2);
/*    */     }
/* 82 */     return Optional.empty();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(ceh ☃, bny bny1) {
/* 88 */     boolean bool = super.a(☃, bny1);
/* 89 */     if (bool && bny1.m().b() == c().h()) {
/* 90 */       return false;
/*    */     }
/* 92 */     return bool;
/*    */   }
/*    */ 
/*    */   
/*    */   protected buo d() {
/* 97 */     return this;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bxg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */