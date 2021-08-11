/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cth
/*    */   extends ctt<ctu>
/*    */ {
/*    */   public cth(Codec<ctu> ☃) {
/* 15 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(Random ☃, cfw cfw1, bsv bsv1, int i, int j, int k, double d, ceh ceh1, ceh ceh2, int m, long l, ctu ctu1) {
/* 20 */     a(☃, cfw1, bsv1, i, j, k, d, ceh1, ceh2, ctu1.a(), ctu1.b(), ctu1.c(), m);
/*    */   }
/*    */   
/*    */   protected void a(Random ☃, cfw cfw1, bsv bsv1, int i, int j, int k, double d, ceh ceh1, ceh ceh2, ceh ceh3, ceh ceh4, ceh ceh5, int m) {
/* 24 */     ceh ceh6 = ceh3;
/* 25 */     ceh ceh7 = ceh4;
/* 26 */     fx.a a = new fx.a();
/*    */     
/* 28 */     int n = -1;
/* 29 */     int i1 = (int)(d / 3.0D + 3.0D + ☃.nextDouble() * 0.25D);
/*    */     
/* 31 */     int i2 = i & 0xF;
/* 32 */     int i3 = j & 0xF;
/*    */     
/* 34 */     for (int i4 = k; i4 >= 0; i4--) {
/* 35 */       a.d(i2, i4, i3);
/* 36 */       ceh ceh8 = cfw1.d_(a);
/*    */       
/* 38 */       if (ceh8.g()) {
/* 39 */         n = -1;
/*    */ 
/*    */       
/*    */       }
/* 43 */       else if (ceh8.a(ceh1.b())) {
/*    */ 
/*    */ 
/*    */         
/* 47 */         if (n == -1) {
/* 48 */           if (i1 <= 0) {
/* 49 */             ceh6 = bup.a.n();
/* 50 */             ceh7 = ceh1;
/* 51 */           } else if (i4 >= m - 4 && i4 <= m + 1) {
/* 52 */             ceh6 = ceh3;
/* 53 */             ceh7 = ceh4;
/*    */           } 
/*    */           
/* 56 */           if (i4 < m && (ceh6 == null || ceh6.g())) {
/* 57 */             if (bsv1.a(a.d(i, i4, j)) < 0.15F) {
/* 58 */               ceh6 = bup.cD.n();
/*    */             } else {
/* 60 */               ceh6 = ceh2;
/*    */             } 
/* 62 */             a.d(i2, i4, i3);
/*    */           } 
/*    */           
/* 65 */           n = i1;
/* 66 */           if (i4 >= m - 1) {
/* 67 */             cfw1.a(a, ceh6, false);
/* 68 */           } else if (i4 < m - 7 - i1) {
/* 69 */             ceh6 = bup.a.n();
/* 70 */             ceh7 = ceh1;
/* 71 */             cfw1.a(a, ceh5, false);
/*    */           } else {
/* 73 */             cfw1.a(a, ceh7, false);
/*    */           } 
/* 75 */         } else if (n > 0) {
/* 76 */           n--;
/* 77 */           cfw1.a(a, ceh7, false);
/*    */ 
/*    */           
/* 80 */           if (n == 0 && ceh7.a(bup.C) && i1 > 1) {
/* 81 */             n = ☃.nextInt(4) + Math.max(0, i4 - 63);
/* 82 */             ceh7 = ceh7.a(bup.D) ? bup.hG.n() : bup.at.n();
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cth.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */