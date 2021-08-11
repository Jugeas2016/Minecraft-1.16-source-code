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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bms
/*    */   extends bkh
/*    */ {
/*    */   public bms(buo ☃, blx.a a1) {
/* 22 */     super(☃, a1);
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public bny b(bny ☃) {
/* 28 */     fx fx = ☃.a();
/* 29 */     brx brx = ☃.p();
/*    */     
/* 31 */     ceh ceh = brx.d_(fx);
/* 32 */     buo buo = e();
/* 33 */     if (ceh.a(buo)) {
/*    */       gc gc;
/* 35 */       if (☃.g()) {
/* 36 */         gc = ☃.l() ? ☃.j().f() : ☃.j();
/*    */       } else {
/* 38 */         gc = (☃.j() == gc.b) ? ☃.f() : gc.b;
/*    */       } 
/*    */       
/* 41 */       int i = 0;
/* 42 */       fx.a a = fx.i().c(gc);
/* 43 */       while (i < 7) {
/* 44 */         if (!brx.v && !brx.k(a)) {
/*    */           
/* 46 */           bfw bfw = ☃.n();
/* 47 */           int j = brx.L();
/* 48 */           if (bfw instanceof aah && a.v() >= j) {
/* 49 */             pb pb = new pb((new of("build.tooHigh", new Object[] { Integer.valueOf(j) })).a(k.m), no.c, x.b);
/* 50 */             ((aah)bfw).b.a(pb);
/*    */           } 
/*    */           
/*    */           break;
/*    */         } 
/* 55 */         ceh = brx.d_(a);
/*    */         
/* 57 */         if (!ceh.a(e())) {
/* 58 */           if (ceh.a(☃)) {
/* 59 */             return bny.a(☃, a, gc);
/*    */           }
/*    */           
/*    */           break;
/*    */         } 
/* 64 */         a.c(gc);
/* 65 */         if (gc.n().d()) {
/* 66 */           i++;
/*    */         }
/*    */       } 
/*    */       
/* 70 */       return null;
/*    */     } 
/*    */     
/* 73 */     if (bzp.a(brx, fx) == 7) {
/* 74 */       return null;
/*    */     }
/*    */     
/* 77 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean d() {
/* 82 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bms.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */