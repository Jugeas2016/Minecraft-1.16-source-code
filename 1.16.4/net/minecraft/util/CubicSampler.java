/*    */ package net.minecraft.util;
/*    */ 
/*    */ import afm;
/*    */ import dcn;
/*    */ import javax.annotation.Nonnull;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CubicSampler
/*    */ {
/* 11 */   private static final double[] a = new double[] { 0.0D, 1.0D, 4.0D, 6.0D, 4.0D, 1.0D, 0.0D };
/*    */ 
/*    */ 
/*    */   
/*    */   @Nonnull
/*    */   public static dcn a(dcn ☃, Vec3Fetcher vec3Fetcher) {
/* 17 */     int i = afm.c(☃.a());
/* 18 */     int j = afm.c(☃.b());
/* 19 */     int k = afm.c(☃.c());
/*    */     
/* 21 */     double d1 = ☃.a() - i;
/* 22 */     double d2 = ☃.b() - j;
/* 23 */     double d3 = ☃.c() - k;
/*    */     
/* 25 */     double d4 = 0.0D;
/* 26 */     dcn dcn1 = dcn.a;
/* 27 */     for (int m = 0; m < 6; m++) {
/* 28 */       double d = afm.d(d1, a[m + 1], a[m]);
/* 29 */       int n = i - 2 + m;
/*    */       
/* 31 */       for (int i1 = 0; i1 < 6; i1++) {
/* 32 */         double d5 = afm.d(d2, a[i1 + 1], a[i1]);
/* 33 */         int i2 = j - 2 + i1;
/*    */         
/* 35 */         for (int i3 = 0; i3 < 6; i3++) {
/* 36 */           double d6 = afm.d(d3, a[i3 + 1], a[i3]);
/* 37 */           int i4 = k - 2 + i3;
/*    */           
/* 39 */           double d7 = d * d5 * d6;
/* 40 */           d4 += d7;
/*    */           
/* 42 */           dcn1 = dcn1.e(vec3Fetcher.fetch(n, i2, i4).a(d7));
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 47 */     dcn1 = dcn1.a(1.0D / d4);
/* 48 */     return dcn1;
/*    */   }
/*    */   
/*    */   public static interface Vec3Fetcher {
/*    */     dcn fetch(int param1Int1, int param1Int2, int param1Int3);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\net\minecraf\\util\CubicSampler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */