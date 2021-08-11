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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class buw
/*     */   extends buo
/*     */ {
/*  25 */   public static final cfg a = cex.aj;
/*     */ 
/*     */ 
/*     */   
/*  29 */   protected static final ddh b = buo.a(1.0D, 0.0D, 1.0D, 15.0D, 15.0D, 15.0D);
/*  30 */   protected static final ddh c = buo.a(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
/*     */   
/*     */   protected buw(ceg.c ☃) {
/*  33 */     super(☃);
/*  34 */     j(((ceh)this.n.b()).a(a, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/*  39 */     if (!☃.a(aag1, fx1)) {
/*  40 */       aag1.b(fx1, true);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/*  46 */     fx fx2 = fx1.b();
/*  47 */     if (!aag1.w(fx2)) {
/*     */       return;
/*     */     }
/*     */     
/*  51 */     int i = 1;
/*  52 */     while (aag1.d_(fx1.c(i)).a(this)) {
/*  53 */       i++;
/*     */     }
/*     */ 
/*     */     
/*  57 */     if (i >= 3) {
/*     */       return;
/*     */     }
/*     */     
/*  61 */     int j = ((Integer)☃.c(a)).intValue();
/*  62 */     if (j == 15) {
/*  63 */       aag1.a(fx2, n());
/*  64 */       ceh ceh1 = ☃.a(a, Integer.valueOf(0));
/*  65 */       aag1.a(fx1, ceh1, 4);
/*  66 */       ceh1.a(aag1, fx2, this, fx1, false);
/*     */     } else {
/*  68 */       aag1.a(fx1, ☃.a(a, Integer.valueOf(j + 1)), 4);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh c(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  74 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  79 */     return c;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/*  84 */     if (!☃.a(bry1, fx1)) {
/*  85 */       bry1.J().a(fx1, this, 1);
/*     */     }
/*     */     
/*  88 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/*  93 */     for (gc gc : gc.c.a) {
/*  94 */       ceh ceh2 = brz1.d_(fx1.a(gc));
/*  95 */       cva cva = ceh2.c();
/*     */       
/*  97 */       if (cva.b() || brz1.b(fx1.a(gc)).a(aef.c)) {
/*  98 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 102 */     ceh ceh1 = brz1.d_(fx1.c());
/* 103 */     return ((ceh1.a(bup.cF) || ceh1.a(bup.C) || ceh1.a(bup.D)) && !brz1.d_(fx1.b()).c().a());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, aqa aqa1) {
/* 108 */     aqa1.a(apk.j, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 113 */     ☃.a((cfj<?>[])new cfj[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 118 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\buw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */