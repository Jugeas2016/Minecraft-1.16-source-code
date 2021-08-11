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
/*    */ public class bvn
/*    */   extends buo
/*    */ {
/*    */   private final buo a;
/*    */   
/*    */   public bvn(buo ☃, ceg.c c1) {
/* 20 */     super(c1);
/* 21 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/* 26 */     if (!a(aag1, fx1)) {
/* 27 */       aag1.a(fx1, this.a.n(), 2);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 33 */     if (!a(bry1, fx1)) {
/* 34 */       bry1.J().a(fx1, this, 60 + bry1.u_().nextInt(40));
/*    */     }
/* 36 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*    */   }
/*    */   
/*    */   protected boolean a(brc ☃, fx fx1) {
/* 40 */     for (gc gc : gc.values()) {
/* 41 */       cux cux = ☃.b(fx1.a(gc));
/* 42 */       if (cux.a(aef.b)) {
/* 43 */         return true;
/*    */       }
/*    */     } 
/* 46 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public ceh a(bny ☃) {
/* 52 */     if (!a(☃.p(), ☃.a())) {
/* 53 */       ☃.p().J().a(☃.a(), this, 60 + ☃.p().u_().nextInt(40));
/*    */     }
/* 55 */     return n();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bvn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */