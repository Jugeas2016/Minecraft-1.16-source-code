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
/*     */ public class byh
/*     */   extends buu
/*     */   implements buq
/*     */ {
/*  19 */   protected static final ddh a = buo.a(5.0D, 0.0D, 5.0D, 11.0D, 6.0D, 11.0D);
/*     */   
/*     */   public byh(ceg.c ☃) {
/*  22 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  27 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/*  32 */     if (random.nextInt(25) == 0) {
/*  33 */       int i = 5;
/*  34 */       int j = 4;
/*  35 */       for (fx fx3 : fx.a(fx1.b(-4, -1, -4), fx1.b(4, 1, 4))) {
/*  36 */         if (aag1.d_(fx3).a(this) && --i <= 0) {
/*     */           return;
/*     */         }
/*     */       } 
/*     */ 
/*     */       
/*  42 */       fx fx2 = fx1.b(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
/*  43 */       for (int k = 0; k < 4; k++) {
/*  44 */         if (aag1.w(fx2) && ☃.a(aag1, fx2)) {
/*  45 */           fx1 = fx2;
/*     */         }
/*  47 */         fx2 = fx1.b(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
/*     */       } 
/*     */       
/*  50 */       if (aag1.w(fx2) && ☃.a(aag1, fx2)) {
/*  51 */         aag1.a(fx2, ☃, 2);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean c(ceh ☃, brc brc1, fx fx1) {
/*  58 */     return ☃.i(brc1, fx1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/*  63 */     fx fx2 = fx1.c();
/*  64 */     ceh ceh1 = brz1.d_(fx2);
/*  65 */     if (ceh1.a(aed.aD)) {
/*  66 */       return true;
/*     */     }
/*     */     
/*  69 */     return (brz1.b(fx1, 0) < 13 && c(ceh1, brz1, fx2));
/*     */   }
/*     */   public boolean a(aag ☃, fx fx1, ceh ceh1, Random random) {
/*     */     civ<?, ?> civ;
/*  73 */     ☃.a(fx1, false);
/*     */ 
/*     */     
/*  76 */     if (this == bup.bC) {
/*  77 */       civ = kh.bF;
/*  78 */     } else if (this == bup.bD) {
/*  79 */       civ = kh.bG;
/*     */     } else {
/*  81 */       ☃.a(fx1, ceh1, 3);
/*  82 */       return false;
/*     */     } 
/*     */     
/*  85 */     if (civ.a(☃, ☃.i().g(), random, fx1)) {
/*  86 */       return true;
/*     */     }
/*     */     
/*  89 */     ☃.a(fx1, ceh1, 3);
/*  90 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brc ☃, fx fx1, ceh ceh1, boolean bool) {
/*  95 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brx ☃, Random random, fx fx1, ceh ceh1) {
/* 100 */     return (random.nextFloat() < 0.4D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aag ☃, Random random, fx fx1, ceh ceh1) {
/* 105 */     a(☃, fx1, ceh1, random);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\byh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */