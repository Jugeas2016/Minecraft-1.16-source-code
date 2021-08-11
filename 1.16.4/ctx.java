/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ctx
/*    */   extends cte
/*    */ {
/* 13 */   private static final ceh K = bup.fF.n();
/* 14 */   private static final ceh L = bup.fG.n();
/* 15 */   private static final ceh M = bup.gR.n();
/*    */   
/*    */   public ctx(Codec<ctu> ☃) {
/* 18 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(Random ☃, cfw cfw1, bsv bsv1, int i, int j, int k, double d, ceh ceh1, ceh ceh2, int m, long l, ctu ctu1) {
/* 23 */     int n = i & 0xF;
/* 24 */     int i1 = j & 0xF;
/*    */     
/* 26 */     ceh ceh3 = K;
/* 27 */     ctv ctv = bsv1.e().e();
/* 28 */     ceh ceh4 = ctv.b();
/* 29 */     ceh ceh5 = ctv.a();
/* 30 */     ceh ceh6 = ceh4;
/*    */     
/* 32 */     int i2 = (int)(d / 3.0D + 3.0D + ☃.nextDouble() * 0.25D);
/* 33 */     boolean bool1 = (Math.cos(d / 3.0D * Math.PI) > 0.0D);
/* 34 */     int i3 = -1;
/* 35 */     boolean bool2 = false;
/* 36 */     int i4 = 0;
/*    */     
/* 38 */     fx.a a = new fx.a();
/*    */     
/* 40 */     for (int i5 = k; i5 >= 0; i5--) {
/* 41 */       if (i4 < 15) {
/* 42 */         a.d(n, i5, i1);
/* 43 */         ceh ceh7 = cfw1.d_(a);
/*    */         
/* 45 */         if (ceh7.g()) {
/* 46 */           i3 = -1;
/* 47 */         } else if (ceh7.a(ceh1.b())) {
/* 48 */           if (i3 == -1) {
/* 49 */             bool2 = false;
/* 50 */             if (i2 <= 0) {
/* 51 */               ceh3 = bup.a.n();
/* 52 */               ceh6 = ceh1;
/* 53 */             } else if (i5 >= m - 4 && i5 <= m + 1) {
/* 54 */               ceh3 = K;
/* 55 */               ceh6 = ceh4;
/*    */             } 
/*    */             
/* 58 */             if (i5 < m && (ceh3 == null || ceh3.g())) {
/* 59 */               ceh3 = ceh2;
/*    */             }
/*    */             
/* 62 */             i3 = i2 + Math.max(0, i5 - m);
/* 63 */             if (i5 >= m - 1) {
/* 64 */               if (i5 > 86 + i2 * 2) {
/* 65 */                 if (bool1) {
/* 66 */                   cfw1.a(a, bup.k.n(), false);
/*    */                 } else {
/* 68 */                   cfw1.a(a, bup.i.n(), false);
/*    */                 } 
/* 70 */               } else if (i5 > m + 3 + i2) {
/*    */                 ceh ceh8;
/* 72 */                 if (i5 < 64 || i5 > 127) {
/* 73 */                   ceh8 = L;
/* 74 */                 } else if (bool1) {
/* 75 */                   ceh8 = M;
/*    */                 } else {
/* 77 */                   ceh8 = a(i, i5, j);
/*    */                 } 
/* 79 */                 cfw1.a(a, ceh8, false);
/*    */               } else {
/* 81 */                 cfw1.a(a, ceh5, false);
/* 82 */                 bool2 = true;
/*    */               } 
/*    */             } else {
/* 85 */               cfw1.a(a, ceh6, false);
/* 86 */               if (ceh6 == K) {
/* 87 */                 cfw1.a(a, L, false);
/*    */               }
/*    */             } 
/* 90 */           } else if (i3 > 0) {
/* 91 */             i3--;
/*    */             
/* 93 */             if (bool2) {
/* 94 */               cfw1.a(a, L, false);
/*    */             } else {
/* 96 */               cfw1.a(a, a(i, i5, j), false);
/*    */             } 
/*    */           } 
/* 99 */           i4++;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ctx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */