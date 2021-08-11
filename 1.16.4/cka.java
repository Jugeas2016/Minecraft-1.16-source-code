/*     */ import com.mojang.serialization.Codec;
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
/*     */ public class cka
/*     */   extends cjl<cls>
/*     */ {
/*  19 */   private static final ceh a = bup.lb.n();
/*     */   
/*     */   public cka(Codec<cls> ☃) {
/*  22 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cls cls1) {
/*  27 */     while (fx1.v() > 5 && ☃.w(fx1)) {
/*  28 */       fx1 = fx1.c();
/*     */     }
/*  30 */     if (fx1.v() <= 4) {
/*  31 */       return false;
/*     */     }
/*     */     
/*  34 */     fx1 = fx1.c(4);
/*     */     
/*  36 */     if (☃.a(gp.a(fx1), cla.q).findAny().isPresent()) {
/*  37 */       return false;
/*     */     }
/*     */     
/*  40 */     boolean[] arrayOfBoolean = new boolean[2048];
/*     */     
/*  42 */     int i = random.nextInt(4) + 4; int j;
/*  43 */     for (j = 0; j < i; j++) {
/*  44 */       double d1 = random.nextDouble() * 6.0D + 3.0D;
/*  45 */       double d2 = random.nextDouble() * 4.0D + 2.0D;
/*  46 */       double d3 = random.nextDouble() * 6.0D + 3.0D;
/*     */       
/*  48 */       double d4 = random.nextDouble() * (16.0D - d1 - 2.0D) + 1.0D + d1 / 2.0D;
/*  49 */       double d5 = random.nextDouble() * (8.0D - d2 - 4.0D) + 2.0D + d2 / 2.0D;
/*  50 */       double d6 = random.nextDouble() * (16.0D - d3 - 2.0D) + 1.0D + d3 / 2.0D;
/*     */       
/*  52 */       for (int k = 1; k < 15; k++) {
/*  53 */         for (int m = 1; m < 15; m++) {
/*  54 */           for (int n = 1; n < 7; n++) {
/*  55 */             double d7 = (k - d4) / d1 / 2.0D;
/*  56 */             double d8 = (n - d5) / d2 / 2.0D;
/*  57 */             double d9 = (m - d6) / d3 / 2.0D;
/*  58 */             double d10 = d7 * d7 + d8 * d8 + d9 * d9;
/*  59 */             if (d10 < 1.0D) {
/*  60 */               arrayOfBoolean[(k * 16 + m) * 8 + n] = true;
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  67 */     for (j = 0; j < 16; j++) {
/*  68 */       for (int k = 0; k < 16; k++) {
/*  69 */         for (int m = 0; m < 8; m++) {
/*  70 */           boolean bool = (!arrayOfBoolean[(j * 16 + k) * 8 + m] && ((j < 15 && arrayOfBoolean[((j + 1) * 16 + k) * 8 + m]) || (j > 0 && arrayOfBoolean[((j - 1) * 16 + k) * 8 + m]) || (k < 15 && arrayOfBoolean[(j * 16 + k + 1) * 8 + m]) || (k > 0 && arrayOfBoolean[(j * 16 + k - 1) * 8 + m]) || (m < 7 && arrayOfBoolean[(j * 16 + k) * 8 + m + 1]) || (m > 0 && arrayOfBoolean[(j * 16 + k) * 8 + m - 1])));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  79 */           if (bool) {
/*  80 */             cva cva = ☃.d_(fx1.b(j, m, k)).c();
/*  81 */             if (m >= 4 && cva.a()) {
/*  82 */               return false;
/*     */             }
/*  84 */             if (m < 4 && !cva.b() && ☃.d_(fx1.b(j, m, k)) != cls1.b) {
/*  85 */               return false;
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  92 */     for (j = 0; j < 16; j++) {
/*  93 */       for (int k = 0; k < 16; k++) {
/*  94 */         for (int m = 0; m < 8; m++) {
/*  95 */           if (arrayOfBoolean[(j * 16 + k) * 8 + m]) {
/*  96 */             ☃.a(fx1.b(j, m, k), (m >= 4) ? a : cls1.b, 2);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 102 */     for (j = 0; j < 16; j++) {
/* 103 */       for (int k = 0; k < 16; k++) {
/* 104 */         for (int m = 4; m < 8; m++) {
/* 105 */           if (arrayOfBoolean[(j * 16 + k) * 8 + m]) {
/* 106 */             fx fx2 = fx1.b(j, m - 1, k);
/*     */             
/* 108 */             if (b(☃.d_(fx2).b()) && ☃.a(bsf.a, fx1.b(j, m, k)) > 0) {
/* 109 */               bsv bsv = ☃.v(fx2);
/* 110 */               if (bsv.e().e().a().a(bup.dT)) {
/* 111 */                 ☃.a(fx2, bup.dT.n(), 2);
/*     */               } else {
/* 113 */                 ☃.a(fx2, bup.i.n(), 2);
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 121 */     if (cls1.b.c() == cva.l) {
/* 122 */       for (j = 0; j < 16; j++) {
/* 123 */         for (int k = 0; k < 16; k++) {
/* 124 */           for (int m = 0; m < 8; m++) {
/* 125 */             boolean bool = (!arrayOfBoolean[(j * 16 + k) * 8 + m] && ((j < 15 && arrayOfBoolean[((j + 1) * 16 + k) * 8 + m]) || (j > 0 && arrayOfBoolean[((j - 1) * 16 + k) * 8 + m]) || (k < 15 && arrayOfBoolean[(j * 16 + k + 1) * 8 + m]) || (k > 0 && arrayOfBoolean[(j * 16 + k - 1) * 8 + m]) || (m < 7 && arrayOfBoolean[(j * 16 + k) * 8 + m + 1]) || (m > 0 && arrayOfBoolean[(j * 16 + k) * 8 + m - 1])));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 134 */             if (bool && (
/* 135 */               m < 4 || random.nextInt(2) != 0) && ☃.d_(fx1.b(j, m, k)).c().b()) {
/* 136 */               ☃.a(fx1.b(j, m, k), bup.b.n(), 2);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 144 */     if (cls1.b.c() == cva.j) {
/* 145 */       for (j = 0; j < 16; j++) {
/* 146 */         for (int k = 0; k < 16; k++) {
/* 147 */           int m = 4;
/* 148 */           fx fx2 = fx1.b(j, 4, k);
/* 149 */           if (☃.v(fx2).a(☃, fx2, false)) {
/* 150 */             ☃.a(fx2, bup.cD.n(), 2);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 156 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cka.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */