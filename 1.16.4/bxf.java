/*    */ import java.util.Random;
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
/*    */ 
/*    */ public abstract class bxf
/*    */   extends buo
/*    */ {
/*    */   protected final gc a;
/*    */   protected final boolean b;
/*    */   protected final ddh c;
/*    */   
/*    */   protected bxf(ceg.c ☃, gc gc1, ddh ddh1, boolean bool) {
/* 23 */     super(☃);
/* 24 */     this.a = gc1;
/* 25 */     this.c = ddh1;
/* 26 */     this.b = bool;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public ceh a(bny ☃) {
/* 32 */     ceh ceh = ☃.p().d_(☃.a().a(this.a));
/* 33 */     if (ceh.a(c()) || ceh.a(d())) {
/* 34 */       return d().n();
/*    */     }
/* 36 */     return a(☃.p());
/*    */   }
/*    */   
/*    */   public ceh a(bry ☃) {
/* 40 */     return n();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/* 45 */     fx fx2 = fx1.a(this.a.f());
/* 46 */     ceh ceh1 = brz1.d_(fx2);
/* 47 */     buo buo1 = ceh1.b();
/* 48 */     if (!c(buo1)) {
/* 49 */       return false;
/*    */     }
/*    */     
/* 52 */     return (buo1 == c() || buo1 == d() || ceh1.d(brz1, fx2, this.a));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/* 57 */     if (!☃.a(aag1, fx1)) {
/* 58 */       aag1.b(fx1, true);
/*    */     }
/*    */   }
/*    */   
/*    */   protected boolean c(buo ☃) {
/* 63 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 68 */     return this.c;
/*    */   }
/*    */   
/*    */   protected abstract bxh c();
/*    */   
/*    */   protected abstract buo d();
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bxf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */