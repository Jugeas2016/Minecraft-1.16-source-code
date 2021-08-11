/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dtg
/*    */ {
/*    */   public static void a(dwn ☃, dwn dwn1, dwn dwn2, boolean bool) {
/* 18 */     dwn dwn3 = bool ? ☃ : dwn1;
/* 19 */     dwn dwn4 = bool ? dwn1 : ☃;
/*    */     
/* 21 */     dwn3.e = (bool ? -0.3F : 0.3F) + dwn2.e;
/* 22 */     dwn4.e = (bool ? 0.6F : -0.6F) + dwn2.e;
/* 23 */     dwn3.d = -1.5707964F + dwn2.d + 0.1F;
/* 24 */     dwn4.d = -1.5F + dwn2.d;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void a(dwn ☃, dwn dwn1, aqm aqm1, boolean bool) {
/* 31 */     dwn dwn2 = bool ? ☃ : dwn1;
/* 32 */     dwn dwn3 = bool ? dwn1 : ☃;
/*    */     
/* 34 */     dwn2.e = bool ? -0.8F : 0.8F;
/* 35 */     dwn2.d = -0.97079635F;
/* 36 */     dwn3.d = dwn2.d;
/*    */ 
/*    */     
/* 39 */     float f1 = bkt.g(aqm1.dY());
/* 40 */     float f2 = afm.a(aqm1.ea(), 0.0F, f1);
/* 41 */     float f3 = f2 / f1;
/* 42 */     dwn3.e = afm.g(f3, 0.4F, 0.85F) * (bool ? true : -1);
/* 43 */     dwn3.d = afm.g(f3, dwn3.d, -1.5707964F);
/*    */   }
/*    */   
/*    */   public static <T extends aqn> void a(dwn ☃, dwn dwn1, T t, float f1, float f2) {
/* 47 */     float f3 = afm.a(f1 * 3.1415927F);
/* 48 */     float f4 = afm.a((1.0F - (1.0F - f1) * (1.0F - f1)) * 3.1415927F);
/* 49 */     ☃.f = 0.0F;
/* 50 */     dwn1.f = 0.0F;
/* 51 */     ☃.e = 0.15707964F;
/* 52 */     dwn1.e = -0.15707964F;
/*    */     
/* 54 */     if (t.dV() == aqi.b) {
/* 55 */       ☃.d = -1.8849558F + afm.b(f2 * 0.09F) * 0.15F;
/* 56 */       dwn1.d = -0.0F + afm.b(f2 * 0.19F) * 0.5F;
/*    */       
/* 58 */       ☃.d += f3 * 2.2F - f4 * 0.4F;
/* 59 */       dwn1.d += f3 * 1.2F - f4 * 0.4F;
/*    */     } else {
/* 61 */       ☃.d = -0.0F + afm.b(f2 * 0.19F) * 0.5F;
/* 62 */       dwn1.d = -1.8849558F + afm.b(f2 * 0.09F) * 0.15F;
/*    */       
/* 64 */       ☃.d += f3 * 1.2F - f4 * 0.4F;
/* 65 */       dwn1.d += f3 * 2.2F - f4 * 0.4F;
/*    */     } 
/*    */     
/* 68 */     a(☃, dwn1, f2);
/*    */   }
/*    */   
/*    */   public static void a(dwn ☃, dwn dwn1, float f) {
/* 72 */     ☃.f += afm.b(f * 0.09F) * 0.05F + 0.05F;
/* 73 */     dwn1.f -= afm.b(f * 0.09F) * 0.05F + 0.05F;
/* 74 */     ☃.d += afm.a(f * 0.067F) * 0.05F;
/* 75 */     dwn1.d -= afm.a(f * 0.067F) * 0.05F;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void a(dwn ☃, dwn dwn1, boolean bool, float f1, float f2) {
/* 82 */     float f3 = afm.a(f1 * 3.1415927F);
/* 83 */     float f4 = afm.a((1.0F - (1.0F - f1) * (1.0F - f1)) * 3.1415927F);
/* 84 */     dwn1.f = 0.0F;
/* 85 */     ☃.f = 0.0F;
/* 86 */     dwn1.e = -(0.1F - f3 * 0.6F);
/* 87 */     ☃.e = 0.1F - f3 * 0.6F;
/*    */     
/* 89 */     float f5 = -3.1415927F / (bool ? 1.5F : 2.25F);
/* 90 */     dwn1.d = f5;
/* 91 */     ☃.d = f5;
/*    */     
/* 93 */     dwn1.d += f3 * 1.2F - f4 * 0.4F;
/* 94 */     ☃.d += f3 * 1.2F - f4 * 0.4F;
/*    */     
/* 96 */     a(dwn1, ☃, f2);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dtg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */