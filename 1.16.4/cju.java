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
/*     */ public class cju
/*     */   extends cjl<cmh>
/*     */ {
/*     */   public cju(Codec<cmh> ☃) {
/*  17 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmh cmh1) {
/*  22 */     while (☃.w(fx1) && fx1.v() > 2) {
/*  23 */       fx1 = fx1.c();
/*     */     }
/*     */     
/*  26 */     if (!☃.d_(fx1).a(bup.cE)) {
/*  27 */       return false;
/*     */     }
/*  29 */     fx1 = fx1.b(random.nextInt(4));
/*     */     
/*  31 */     int i = random.nextInt(4) + 7;
/*  32 */     int j = i / 4 + random.nextInt(2);
/*     */     
/*  34 */     if (j > 1 && random.nextInt(60) == 0) {
/*  35 */       fx1 = fx1.b(10 + random.nextInt(30));
/*     */     }
/*     */     int k;
/*  38 */     for (k = 0; k < i; k++) {
/*  39 */       float f = (1.0F - k / i) * j;
/*  40 */       int n = afm.f(f);
/*     */       
/*  42 */       for (int i1 = -n; i1 <= n; i1++) {
/*  43 */         float f1 = afm.a(i1) - 0.25F;
/*  44 */         for (int i2 = -n; i2 <= n; i2++) {
/*  45 */           float f2 = afm.a(i2) - 0.25F;
/*  46 */           if ((i1 == 0 && i2 == 0) || f1 * f1 + f2 * f2 <= f * f)
/*     */           {
/*     */             
/*  49 */             if ((i1 != -n && i1 != n && i2 != -n && i2 != n) || 
/*  50 */               random.nextFloat() <= 0.75F) {
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*  55 */               ceh ceh = ☃.d_(fx1.b(i1, k, i2));
/*  56 */               buo buo = ceh.b();
/*     */               
/*  58 */               if (ceh.g() || b(buo) || buo == bup.cE || buo == bup.cD) {
/*  59 */                 a(☃, fx1.b(i1, k, i2), bup.gT.n());
/*     */               }
/*     */               
/*  62 */               if (k != 0 && n > 1) {
/*  63 */                 ceh = ☃.d_(fx1.b(i1, -k, i2));
/*  64 */                 buo = ceh.b();
/*     */                 
/*  66 */                 if (ceh.g() || b(buo) || buo == bup.cE || buo == bup.cD)
/*  67 */                   a(☃, fx1.b(i1, -k, i2), bup.gT.n()); 
/*     */               } 
/*     */             }  } 
/*     */         } 
/*     */       } 
/*     */     } 
/*  73 */     k = j - 1;
/*  74 */     if (k < 0) {
/*  75 */       k = 0;
/*  76 */     } else if (k > 1) {
/*  77 */       k = 1;
/*     */     } 
/*  79 */     for (int m = -k; m <= k; m++) {
/*  80 */       for (int n = -k; n <= k; n++) {
/*  81 */         fx fx2 = fx1.b(m, -1, n);
/*  82 */         int i1 = 50;
/*  83 */         if (Math.abs(m) == 1 && Math.abs(n) == 1) {
/*  84 */           i1 = random.nextInt(5);
/*     */         }
/*  86 */         while (fx2.v() > 50) {
/*  87 */           ceh ceh = ☃.d_(fx2);
/*  88 */           buo buo = ceh.b();
/*     */           
/*  90 */           if (ceh.g() || b(buo) || buo == bup.cE || buo == bup.cD || buo == bup.gT) {
/*  91 */             a(☃, fx2, bup.gT.n());
/*     */ 
/*     */ 
/*     */             
/*  95 */             fx2 = fx2.c();
/*  96 */             i1--;
/*  97 */             if (i1 <= 0) {
/*  98 */               fx2 = fx2.c(random.nextInt(5) + 1);
/*  99 */               i1 = random.nextInt(5);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 105 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cju.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */