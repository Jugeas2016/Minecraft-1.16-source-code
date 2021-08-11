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
/*     */ public class cti
/*     */   extends cte
/*     */ {
/*  14 */   private static final ceh K = bup.fF.n();
/*  15 */   private static final ceh L = bup.fG.n();
/*  16 */   private static final ceh M = bup.gR.n();
/*     */   
/*     */   public cti(Codec<ctu> ☃) {
/*  19 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(Random ☃, cfw cfw1, bsv bsv1, int i, int j, int k, double d, ceh ceh1, ceh ceh2, int m, long l, ctu ctu1) {
/*  24 */     double d1 = 0.0D;
/*     */     
/*  26 */     double d2 = Math.min(Math.abs(d), this.c.a(i * 0.25D, j * 0.25D, false) * 15.0D);
/*  27 */     if (d2 > 0.0D) {
/*  28 */       double d3 = 0.001953125D;
/*  29 */       double d4 = Math.abs(this.d.a(i * 0.001953125D, j * 0.001953125D, false));
/*  30 */       d1 = d2 * d2 * 2.5D;
/*  31 */       double d5 = Math.ceil(d4 * 50.0D) + 14.0D;
/*  32 */       if (d1 > d5) {
/*  33 */         d1 = d5;
/*     */       }
/*  35 */       d1 += 64.0D;
/*     */     } 
/*     */     
/*  38 */     int n = i & 0xF;
/*  39 */     int i1 = j & 0xF;
/*     */     
/*  41 */     ceh ceh3 = K;
/*  42 */     ctv ctv = bsv1.e().e();
/*  43 */     ceh ceh4 = ctv.b();
/*  44 */     ceh ceh5 = ctv.a();
/*  45 */     ceh ceh6 = ceh4;
/*     */     
/*  47 */     int i2 = (int)(d / 3.0D + 3.0D + ☃.nextDouble() * 0.25D);
/*  48 */     boolean bool1 = (Math.cos(d / 3.0D * Math.PI) > 0.0D);
/*  49 */     int i3 = -1;
/*  50 */     boolean bool2 = false;
/*     */     
/*  52 */     fx.a a = new fx.a();
/*     */     
/*  54 */     for (int i4 = Math.max(k, (int)d1 + 1); i4 >= 0; i4--) {
/*  55 */       a.d(n, i4, i1);
/*  56 */       if (cfw1.d_(a).g() && i4 < (int)d1) {
/*  57 */         cfw1.a(a, ceh1, false);
/*     */       }
/*     */       
/*  60 */       ceh ceh7 = cfw1.d_(a);
/*     */       
/*  62 */       if (ceh7.g()) {
/*  63 */         i3 = -1;
/*  64 */       } else if (ceh7.a(ceh1.b())) {
/*  65 */         if (i3 == -1) {
/*  66 */           bool2 = false;
/*  67 */           if (i2 <= 0) {
/*  68 */             ceh3 = bup.a.n();
/*  69 */             ceh6 = ceh1;
/*  70 */           } else if (i4 >= m - 4 && i4 <= m + 1) {
/*  71 */             ceh3 = K;
/*  72 */             ceh6 = ceh4;
/*     */           } 
/*     */           
/*  75 */           if (i4 < m && (ceh3 == null || ceh3.g())) {
/*  76 */             ceh3 = ceh2;
/*     */           }
/*     */           
/*  79 */           i3 = i2 + Math.max(0, i4 - m);
/*  80 */           if (i4 >= m - 1) {
/*  81 */             if (i4 > m + 3 + i2) {
/*     */               ceh ceh8;
/*  83 */               if (i4 < 64 || i4 > 127) {
/*  84 */                 ceh8 = L;
/*  85 */               } else if (bool1) {
/*  86 */                 ceh8 = M;
/*     */               } else {
/*  88 */                 ceh8 = a(i, i4, j);
/*     */               } 
/*  90 */               cfw1.a(a, ceh8, false);
/*     */             } else {
/*  92 */               cfw1.a(a, ceh5, false);
/*  93 */               bool2 = true;
/*     */             } 
/*     */           } else {
/*  96 */             cfw1.a(a, ceh6, false);
/*  97 */             buo buo = ceh6.b();
/*  98 */             if (buo == bup.fF || buo == bup.fG || buo == bup.fH || buo == bup.fI || buo == bup.fJ || buo == bup.fK || buo == bup.fL || buo == bup.fM || buo == bup.fN || buo == bup.fO || buo == bup.fP || buo == bup.fQ || buo == bup.fR || buo == bup.fS || buo == bup.fT || buo == bup.fU)
/*     */             {
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
/* 115 */               cfw1.a(a, L, false);
/*     */             }
/*     */           } 
/* 118 */         } else if (i3 > 0) {
/* 119 */           i3--;
/*     */           
/* 121 */           if (bool2) {
/* 122 */             cfw1.a(a, L, false);
/*     */           } else {
/* 124 */             cfw1.a(a, a(i, i4, j), false);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cti.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */