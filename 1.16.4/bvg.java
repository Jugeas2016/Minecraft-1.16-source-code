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
/*    */ public class bvg
/*    */   extends bys
/*    */ {
/*    */   protected bvg(ceg.c ☃) {
/* 18 */     super(0.3125F, ☃);
/*    */     
/* 20 */     j(((ceh)this.n.b()).a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(bny ☃) {
/* 25 */     return a(☃.p(), ☃.a());
/*    */   }
/*    */   
/*    */   public ceh a(brc ☃, fx fx1) {
/* 29 */     buo buo1 = ☃.d_(fx1.c()).b();
/* 30 */     buo buo2 = ☃.d_(fx1.b()).b();
/* 31 */     buo buo3 = ☃.d_(fx1.d()).b();
/* 32 */     buo buo4 = ☃.d_(fx1.g()).b();
/* 33 */     buo buo5 = ☃.d_(fx1.e()).b();
/* 34 */     buo buo6 = ☃.d_(fx1.f()).b();
/*    */     
/* 36 */     return n()
/* 37 */       .a(f, Boolean.valueOf((buo1 == this || buo1 == bup.iy || buo1 == bup.ee)))
/* 38 */       .a(e, Boolean.valueOf((buo2 == this || buo2 == bup.iy)))
/* 39 */       .a(a, Boolean.valueOf((buo3 == this || buo3 == bup.iy)))
/* 40 */       .a(b, Boolean.valueOf((buo4 == this || buo4 == bup.iy)))
/* 41 */       .a(c, Boolean.valueOf((buo5 == this || buo5 == bup.iy)))
/* 42 */       .a(d, Boolean.valueOf((buo6 == this || buo6 == bup.iy)));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 48 */     if (!☃.a(bry1, fx1)) {
/* 49 */       bry1.J().a(fx1, this, 1);
/* 50 */       return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*    */     } 
/*    */     
/* 53 */     boolean bool = (ceh1.b() == this || ceh1.a(bup.iy) || (gc1 == gc.a && ceh1.a(bup.ee)));
/*    */     
/* 55 */     return ☃.a(g.get(gc1), Boolean.valueOf(bool));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/* 60 */     if (!☃.a(aag1, fx1)) {
/* 61 */       aag1.b(fx1, true);
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/* 70 */     ceh ceh1 = brz1.d_(fx1.c());
/* 71 */     boolean bool = (!brz1.d_(fx1.b()).g() && !ceh1.g());
/*    */     
/* 73 */     for (gc gc : gc.c.a) {
/* 74 */       fx fx2 = fx1.a(gc);
/* 75 */       buo buo1 = brz1.d_(fx2).b();
/* 76 */       if (buo1 == this) {
/* 77 */         if (bool) {
/* 78 */           return false;
/*    */         }
/* 80 */         buo buo2 = brz1.d_(fx2.c()).b();
/* 81 */         if (buo2 == this || buo2 == bup.ee) {
/* 82 */           return true;
/*    */         }
/*    */       } 
/*    */     } 
/* 86 */     buo buo = ceh1.b();
/* 87 */     return (buo == this || buo == bup.ee);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(cei.a<buo, ceh> ☃) {
/* 92 */     ☃.a((cfj<?>[])new cfj[] { a, b, c, d, e, f });
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 97 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bvg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */