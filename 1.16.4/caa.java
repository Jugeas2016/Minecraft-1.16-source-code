/*     */ import java.util.Random;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class caa
/*     */   extends buo
/*     */ {
/*  25 */   public static final cfg a = cex.aq;
/*     */   
/*  27 */   protected static final ddh[] b = new ddh[] {
/*  28 */       dde.a(), 
/*  29 */       buo.a(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), 
/*  30 */       buo.a(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), 
/*  31 */       buo.a(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), 
/*  32 */       buo.a(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), 
/*  33 */       buo.a(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D), 
/*  34 */       buo.a(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D), 
/*  35 */       buo.a(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D), 
/*  36 */       buo.a(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)
/*     */     };
/*     */ 
/*     */ 
/*     */   
/*     */   protected caa(ceg.c ☃) {
/*  42 */     super(☃);
/*  43 */     j(((ceh)this.n.b()).a(a, Integer.valueOf(1)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/*  48 */     switch (null.a[cxe1.ordinal()]) {
/*     */       case 1:
/*  50 */         return (((Integer)☃.c(a)).intValue() < 5);
/*     */       case 2:
/*  52 */         return false;
/*     */       case 3:
/*  54 */         return false;
/*     */     } 
/*  56 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  62 */     return b[((Integer)☃.c(a)).intValue()];
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh c(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  67 */     return b[((Integer)☃.c(a)).intValue() - 1];
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh e(ceh ☃, brc brc1, fx fx1) {
/*  72 */     return b[((Integer)☃.c(a)).intValue()];
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh a(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  77 */     return b[((Integer)☃.c(a)).intValue()];
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c_(ceh ☃) {
/*  82 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/*  87 */     ceh ceh1 = brz1.d_(fx1.c());
/*     */     
/*  89 */     if (ceh1.a(bup.cD) || ceh1.a(bup.gT) || ceh1.a(bup.go)) {
/*  90 */       return false;
/*     */     }
/*  92 */     if (ceh1.a(bup.ne) || ceh1.a(bup.cM)) {
/*  93 */       return true;
/*     */     }
/*     */     
/*  96 */     return (buo.a(ceh1.k(brz1, fx1.c()), gc.b) || (ceh1.b() == this && ((Integer)ceh1.c(a)).intValue() == 8));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 101 */     if (!☃.a(bry1, fx1)) {
/* 102 */       return bup.a.n();
/*     */     }
/* 104 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/* 109 */     if (aag1.a(bsf.b, fx1) > 11) {
/* 110 */       c(☃, aag1, fx1);
/* 111 */       aag1.a(fx1, false);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, bny bny1) {
/* 117 */     int i = ((Integer)☃.c(a)).intValue();
/*     */     
/* 119 */     if (bny1.m().b() == h() && i < 8) {
/* 120 */       if (bny1.c()) {
/* 121 */         return (bny1.j() == gc.b);
/*     */       }
/* 123 */       return true;
/*     */     } 
/*     */     
/* 126 */     return (i == 1);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ceh a(bny ☃) {
/* 132 */     ceh ceh = ☃.p().d_(☃.a());
/* 133 */     if (ceh.a(this)) {
/* 134 */       int i = ((Integer)ceh.c(a)).intValue();
/* 135 */       return ceh.a(a, Integer.valueOf(Math.min(8, i + 1)));
/*     */     } 
/*     */     
/* 138 */     return super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 143 */     ☃.a((cfj<?>[])new cfj[] { a });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\caa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */