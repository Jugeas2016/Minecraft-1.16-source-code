/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.mojang.serialization.Codec;
/*     */ import java.util.Arrays;
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
/*     */ 
/*     */ public class cte
/*     */   extends ctt<ctu>
/*     */ {
/*  21 */   private static final ceh K = bup.fF.n();
/*  22 */   private static final ceh L = bup.fG.n();
/*  23 */   private static final ceh M = bup.gR.n();
/*  24 */   private static final ceh N = bup.fJ.n();
/*  25 */   private static final ceh O = bup.fR.n();
/*  26 */   private static final ceh P = bup.fT.n();
/*  27 */   private static final ceh Q = bup.fN.n();
/*     */   
/*     */   protected ceh[] a;
/*     */   protected long b;
/*     */   protected cuc c;
/*     */   protected cuc d;
/*     */   protected cuc e;
/*     */   
/*     */   public cte(Codec<ctu> ☃) {
/*  36 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(Random ☃, cfw cfw1, bsv bsv1, int i, int j, int k, double d, ceh ceh1, ceh ceh2, int m, long l, ctu ctu1) {
/*  41 */     int n = i & 0xF;
/*  42 */     int i1 = j & 0xF;
/*     */     
/*  44 */     ceh ceh3 = K;
/*  45 */     ctv ctv = bsv1.e().e();
/*  46 */     ceh ceh4 = ctv.b();
/*  47 */     ceh ceh5 = ctv.a();
/*  48 */     ceh ceh6 = ceh4;
/*     */     
/*  50 */     int i2 = (int)(d / 3.0D + 3.0D + ☃.nextDouble() * 0.25D);
/*  51 */     boolean bool1 = (Math.cos(d / 3.0D * Math.PI) > 0.0D);
/*  52 */     int i3 = -1;
/*  53 */     boolean bool2 = false;
/*  54 */     int i4 = 0;
/*     */     
/*  56 */     fx.a a = new fx.a();
/*     */     
/*  58 */     for (int i5 = k; i5 >= 0; i5--) {
/*  59 */       if (i4 < 15) {
/*  60 */         a.d(n, i5, i1);
/*  61 */         ceh ceh7 = cfw1.d_(a);
/*     */         
/*  63 */         if (ceh7.g()) {
/*  64 */           i3 = -1;
/*  65 */         } else if (ceh7.a(ceh1.b())) {
/*  66 */           if (i3 == -1) {
/*  67 */             bool2 = false;
/*  68 */             if (i2 <= 0) {
/*  69 */               ceh3 = bup.a.n();
/*  70 */               ceh6 = ceh1;
/*  71 */             } else if (i5 >= m - 4 && i5 <= m + 1) {
/*  72 */               ceh3 = K;
/*  73 */               ceh6 = ceh4;
/*     */             } 
/*     */             
/*  76 */             if (i5 < m && (ceh3 == null || ceh3.g())) {
/*  77 */               ceh3 = ceh2;
/*     */             }
/*     */             
/*  80 */             i3 = i2 + Math.max(0, i5 - m);
/*  81 */             if (i5 >= m - 1) {
/*  82 */               if (i5 > m + 3 + i2) {
/*     */                 ceh ceh8;
/*  84 */                 if (i5 < 64 || i5 > 127) {
/*  85 */                   ceh8 = L;
/*  86 */                 } else if (bool1) {
/*  87 */                   ceh8 = M;
/*     */                 } else {
/*  89 */                   ceh8 = a(i, i5, j);
/*     */                 } 
/*  91 */                 cfw1.a(a, ceh8, false);
/*     */               } else {
/*  93 */                 cfw1.a(a, ceh5, false);
/*  94 */                 bool2 = true;
/*     */               } 
/*     */             } else {
/*  97 */               cfw1.a(a, ceh6, false);
/*  98 */               buo buo = ceh6.b();
/*  99 */               if (buo == bup.fF || buo == bup.fG || buo == bup.fH || buo == bup.fI || buo == bup.fJ || buo == bup.fK || buo == bup.fL || buo == bup.fM || buo == bup.fN || buo == bup.fO || buo == bup.fP || buo == bup.fQ || buo == bup.fR || buo == bup.fS || buo == bup.fT || buo == bup.fU)
/*     */               {
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
/* 116 */                 cfw1.a(a, L, false);
/*     */               }
/*     */             } 
/* 119 */           } else if (i3 > 0) {
/* 120 */             i3--;
/*     */             
/* 122 */             if (bool2) {
/* 123 */               cfw1.a(a, L, false);
/*     */             } else {
/* 125 */               cfw1.a(a, a(i, i5, j), false);
/*     */             } 
/*     */           } 
/* 128 */           i4++;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(long ☃) {
/* 137 */     if (this.b != ☃ || this.a == null) {
/* 138 */       b(☃);
/*     */     }
/* 140 */     if (this.b != ☃ || this.c == null || this.d == null) {
/* 141 */       chx chx = new chx(☃);
/* 142 */       this.c = new cuc(chx, IntStream.rangeClosed(-3, 0));
/* 143 */       this.d = new cuc(chx, (List<Integer>)ImmutableList.of(Integer.valueOf(0)));
/*     */     } 
/* 145 */     this.b = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(long ☃) {
/* 150 */     this.a = new ceh[64];
/* 151 */     Arrays.fill((Object[])this.a, M);
/*     */     
/* 153 */     chx chx = new chx(☃);
/* 154 */     this.e = new cuc(chx, (List<Integer>)ImmutableList.of(Integer.valueOf(0)));
/*     */     int i;
/* 156 */     for (i = 0; i < 64; i++) {
/* 157 */       i += chx.nextInt(5) + 1;
/* 158 */       if (i < 64) {
/* 159 */         this.a[i] = L;
/*     */       }
/*     */     } 
/*     */     
/* 163 */     i = chx.nextInt(4) + 2; int j;
/* 164 */     for (j = 0; j < i; j++) {
/* 165 */       int i2 = chx.nextInt(3) + 1;
/* 166 */       int i3 = chx.nextInt(64);
/*     */       
/* 168 */       for (int i4 = 0; i3 + i4 < 64 && i4 < i2; i4++) {
/* 169 */         this.a[i3 + i4] = N;
/*     */       }
/*     */     } 
/* 172 */     j = chx.nextInt(4) + 2; int k;
/* 173 */     for (k = 0; k < j; k++) {
/* 174 */       int i2 = chx.nextInt(3) + 2;
/* 175 */       int i3 = chx.nextInt(64);
/*     */       
/* 177 */       for (int i4 = 0; i3 + i4 < 64 && i4 < i2; i4++) {
/* 178 */         this.a[i3 + i4] = O;
/*     */       }
/*     */     } 
/* 181 */     k = chx.nextInt(4) + 2; int m;
/* 182 */     for (m = 0; m < k; m++) {
/* 183 */       int i2 = chx.nextInt(3) + 1;
/* 184 */       int i3 = chx.nextInt(64);
/*     */       
/* 186 */       for (int i4 = 0; i3 + i4 < 64 && i4 < i2; i4++) {
/* 187 */         this.a[i3 + i4] = P;
/*     */       }
/*     */     } 
/* 190 */     m = chx.nextInt(3) + 3;
/* 191 */     int n = 0;
/* 192 */     for (int i1 = 0; i1 < m; i1++) {
/* 193 */       int i2 = 1;
/* 194 */       n += chx.nextInt(16) + 4;
/*     */       
/* 196 */       for (int i3 = 0; n + i3 < 64 && i3 < 1; i3++) {
/* 197 */         this.a[n + i3] = K;
/* 198 */         if (n + i3 > 1 && chx.nextBoolean()) {
/* 199 */           this.a[n + i3 - 1] = Q;
/*     */         }
/* 201 */         if (n + i3 < 63 && chx.nextBoolean()) {
/* 202 */           this.a[n + i3 + 1] = Q;
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected ceh a(int ☃, int i, int j) {
/* 209 */     int k = (int)Math.round(this.e.a(☃ / 512.0D, j / 512.0D, false) * 2.0D);
/* 210 */     return this.a[(i + k + 64) % 64];
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cte.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */