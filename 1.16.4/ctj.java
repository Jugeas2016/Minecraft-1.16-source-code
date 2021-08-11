/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.mojang.serialization.Codec;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.stream.IntStream;
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
/*     */ public class ctj
/*     */   extends ctt<ctu>
/*     */ {
/*  19 */   protected static final ceh a = bup.gT.n();
/*  20 */   protected static final ceh b = bup.cE.n();
/*  21 */   private static final ceh c = bup.a.n();
/*  22 */   private static final ceh d = bup.E.n();
/*  23 */   private static final ceh e = bup.cD.n();
/*     */   
/*     */   private cuc K;
/*     */   private cuc L;
/*     */   private long M;
/*     */   
/*     */   public ctj(Codec<ctu> ☃) {
/*  30 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(Random ☃, cfw cfw1, bsv bsv1, int i, int j, int k, double d, ceh ceh1, ceh ceh2, int m, long l, ctu ctu1) {
/*  35 */     double d1 = 0.0D;
/*  36 */     double d2 = 0.0D;
/*  37 */     fx.a a = new fx.a();
/*  38 */     float f = bsv1.a(a.d(i, 63, j));
/*     */     
/*  40 */     double d3 = Math.min(Math.abs(d), this.K.a(i * 0.1D, j * 0.1D, false) * 15.0D);
/*     */     
/*  42 */     if (d3 > 1.8D) {
/*  43 */       double d4 = 0.09765625D;
/*  44 */       double d5 = Math.abs(this.L.a(i * 0.09765625D, j * 0.09765625D, false));
/*  45 */       d1 = d3 * d3 * 1.2D;
/*  46 */       double d6 = Math.ceil(d5 * 40.0D) + 14.0D;
/*  47 */       if (d1 > d6) {
/*  48 */         d1 = d6;
/*     */       }
/*     */       
/*  51 */       if (f > 0.1F) {
/*  52 */         d1 -= 2.0D;
/*     */       }
/*     */       
/*  55 */       if (d1 > 2.0D) {
/*  56 */         d2 = m - d1 - 7.0D;
/*  57 */         d1 += m;
/*     */       } else {
/*  59 */         d1 = 0.0D;
/*     */       } 
/*     */     } 
/*     */     
/*  63 */     int n = i & 0xF;
/*  64 */     int i1 = j & 0xF;
/*     */     
/*  66 */     ctv ctv = bsv1.e().e();
/*  67 */     ceh ceh3 = ctv.b();
/*  68 */     ceh ceh4 = ctv.a();
/*  69 */     ceh ceh5 = ceh3;
/*  70 */     ceh ceh6 = ceh4;
/*     */     
/*  72 */     int i2 = (int)(d / 3.0D + 3.0D + ☃.nextDouble() * 0.25D);
/*  73 */     int i3 = -1;
/*  74 */     int i4 = 0;
/*  75 */     int i5 = 2 + ☃.nextInt(4);
/*  76 */     int i6 = m + 18 + ☃.nextInt(10);
/*     */     
/*  78 */     for (int i7 = Math.max(k, (int)d1 + 1); i7 >= 0; i7--) {
/*  79 */       a.d(n, i7, i1);
/*     */       
/*  81 */       if (cfw1.d_(a).g() && i7 < (int)d1 && ☃.nextDouble() > 0.01D) {
/*  82 */         cfw1.a(a, a, false);
/*  83 */       } else if (cfw1.d_(a).c() == cva.j && i7 > (int)d2 && i7 < m && d2 != 0.0D && ☃.nextDouble() > 0.15D) {
/*  84 */         cfw1.a(a, a, false);
/*     */       } 
/*     */       
/*  87 */       ceh ceh7 = cfw1.d_(a);
/*  88 */       if (ceh7.g()) {
/*  89 */         i3 = -1;
/*     */ 
/*     */       
/*     */       }
/*  93 */       else if (ceh7.a(ceh1.b())) {
/*  94 */         if (i3 == -1) {
/*  95 */           if (i2 <= 0) {
/*  96 */             ceh6 = c;
/*  97 */             ceh5 = ceh1;
/*  98 */           } else if (i7 >= m - 4 && i7 <= m + 1) {
/*  99 */             ceh6 = ceh4;
/* 100 */             ceh5 = ceh3;
/*     */           } 
/*     */           
/* 103 */           if (i7 < m && (ceh6 == null || ceh6.g())) {
/* 104 */             if (bsv1.a(a.d(i, i7, j)) < 0.15F) {
/* 105 */               ceh6 = e;
/*     */             } else {
/* 107 */               ceh6 = ceh2;
/*     */             } 
/*     */           }
/*     */           
/* 111 */           i3 = i2;
/* 112 */           if (i7 >= m - 1) {
/* 113 */             cfw1.a(a, ceh6, false);
/* 114 */           } else if (i7 < m - 7 - i2) {
/* 115 */             ceh6 = c;
/* 116 */             ceh5 = ceh1;
/* 117 */             cfw1.a(a, d, false);
/*     */           } else {
/* 119 */             cfw1.a(a, ceh5, false);
/*     */           } 
/* 121 */         } else if (i3 > 0) {
/* 122 */           i3--;
/* 123 */           cfw1.a(a, ceh5, false);
/* 124 */           if (i3 == 0 && ceh5.a(bup.C) && i2 > 1) {
/* 125 */             i3 = ☃.nextInt(4) + Math.max(0, i7 - 63);
/* 126 */             ceh5 = ceh5.a(bup.D) ? bup.hG.n() : bup.at.n();
/*     */           } 
/*     */         } 
/* 129 */       } else if (ceh7.a(bup.gT) && 
/* 130 */         i4 <= i5 && i7 > i6) {
/* 131 */         cfw1.a(a, b, false);
/* 132 */         i4++;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(long ☃) {
/* 140 */     if (this.M != ☃ || this.K == null || this.L == null) {
/* 141 */       chx chx = new chx(☃);
/* 142 */       this.K = new cuc(chx, IntStream.rangeClosed(-3, 0));
/* 143 */       this.L = new cuc(chx, (List<Integer>)ImmutableList.of(Integer.valueOf(0)));
/*     */     } 
/* 145 */     this.M = ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ctj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */