/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class byq
/*     */   extends bvz
/*     */ {
/*  19 */   public static final cey b = cex.w;
/*     */   
/*     */   public byq(ceg.c ☃) {
/*  22 */     super(☃);
/*     */     
/*  24 */     j(((ceh)this.n.b()).a(a, gc.d).a(b, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/*  29 */     ☃.a((cfj<?>[])new cfj[] { a, b });
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/*  34 */     return ☃.a(a, bzm1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/*  39 */     return ☃.a(byg1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/*  44 */     if (((Boolean)☃.c(b)).booleanValue()) {
/*  45 */       aag1.a(fx1, ☃.a(b, Boolean.valueOf(false)), 2);
/*     */     } else {
/*  47 */       aag1.a(fx1, ☃.a(b, Boolean.valueOf(true)), 2);
/*  48 */       aag1.j().a(fx1, this, 2);
/*     */     } 
/*  50 */     a(aag1, fx1, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/*  55 */     if (☃.c(a) == gc1 && !((Boolean)☃.c(b)).booleanValue()) {
/*  56 */       a(bry1, fx1);
/*     */     }
/*     */     
/*  59 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */   
/*     */   private void a(bry ☃, fx fx1) {
/*  63 */     if (!☃.s_() && !☃.J().a(fx1, this)) {
/*  64 */       ☃.J().a(fx1, this, 2);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(brx ☃, fx fx1, ceh ceh1) {
/*  69 */     gc gc = (gc)ceh1.c(a);
/*  70 */     fx fx2 = fx1.a(gc.f());
/*     */     
/*  72 */     ☃.a(fx2, this, fx1);
/*  73 */     ☃.a(fx2, this, gc);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b_(ceh ☃) {
/*  78 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(ceh ☃, brc brc1, fx fx1, gc gc1) {
/*  83 */     return ☃.b(brc1, fx1, gc1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brc brc1, fx fx1, gc gc1) {
/*  88 */     if (((Boolean)☃.c(b)).booleanValue() && ☃.c(a) == gc1) {
/*  89 */       return 15;
/*     */     }
/*  91 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/*  96 */     if (☃.a(ceh1.b())) {
/*     */       return;
/*     */     }
/*     */     
/* 100 */     if (!brx1.s_() && ((Boolean)☃.c(b)).booleanValue() && !brx1.J().a(fx1, this)) {
/* 101 */       ceh ceh2 = ☃.a(b, Boolean.valueOf(false));
/*     */       
/* 103 */       brx1.a(fx1, ceh2, 18);
/* 104 */       a(brx1, fx1, ceh2);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 110 */     if (☃.a(ceh1.b())) {
/*     */       return;
/*     */     }
/* 113 */     if (!brx1.v && ((Boolean)☃.c(b)).booleanValue() && brx1.J().a(fx1, this))
/*     */     {
/* 115 */       a(brx1, fx1, ☃.a(b, Boolean.valueOf(false)));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/* 121 */     return n().a(a, ☃.d().f().f());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\byq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */