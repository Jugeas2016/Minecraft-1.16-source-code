/*     */ import java.util.List;
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
/*     */ public class eca
/*     */   extends ece<cce>
/*     */ {
/*  19 */   public static final vk a = new vk("textures/entity/beacon_beam.png");
/*     */ 
/*     */   
/*     */   public eca(ecd ☃) {
/*  23 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(cce ☃, float f, dfm dfm1, eag eag1, int i, int j) {
/*  28 */     long l = ☃.v().T();
/*     */     
/*  30 */     List<cce.a> list = ☃.f();
/*  31 */     int k = 0;
/*  32 */     for (int m = 0; m < list.size(); m++) {
/*  33 */       cce.a a = list.get(m);
/*  34 */       a(dfm1, eag1, f, l, k, (m == list.size() - 1) ? 1024 : a.c(), a.b());
/*  35 */       k += a.c();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void a(dfm ☃, eag eag1, float f, long l, int i, int j, float[] arrayOfFloat) {
/*  40 */     a(☃, eag1, a, f, 1.0F, l, i, j, arrayOfFloat, 0.2F, 0.25F);
/*     */   }
/*     */   
/*     */   public static void a(dfm ☃, eag eag1, vk vk1, float f1, float f2, long l, int i, int j, float[] arrayOfFloat, float f3, float f4) {
/*  44 */     int k = i + j;
/*     */     
/*  46 */     ☃.a();
/*  47 */     ☃.a(0.5D, 0.0D, 0.5D);
/*     */     
/*  49 */     float f5 = (float)Math.floorMod(l, 40L) + f1;
/*     */     
/*  51 */     float f6 = (j < 0) ? f5 : -f5;
/*  52 */     float f7 = afm.h(f6 * 0.2F - afm.d(f6 * 0.1F));
/*     */     
/*  54 */     float f8 = arrayOfFloat[0];
/*  55 */     float f9 = arrayOfFloat[1];
/*  56 */     float f10 = arrayOfFloat[2];
/*     */     
/*  58 */     ☃.a();
/*     */     
/*  60 */     ☃.a(g.d.a(f5 * 2.25F - 45.0F));
/*     */     
/*  62 */     float f11 = 0.0F;
/*  63 */     float f12 = f3;
/*  64 */     float f13 = f3;
/*  65 */     float f14 = 0.0F;
/*     */     
/*  67 */     float f15 = -f3;
/*  68 */     float f16 = 0.0F;
/*  69 */     float f17 = 0.0F;
/*  70 */     float f18 = -f3;
/*     */     
/*  72 */     float f19 = 0.0F;
/*  73 */     float f20 = 1.0F;
/*  74 */     float f21 = -1.0F + f7;
/*  75 */     float f22 = j * f2 * 0.5F / f3 + f21;
/*     */     
/*  77 */     a(☃, eag1.getBuffer(eao.d(vk1, false)), f8, f9, f10, 1.0F, i, k, 0.0F, f12, f13, 0.0F, f15, 0.0F, 0.0F, f18, 0.0F, 1.0F, f22, f21);
/*     */     
/*  79 */     ☃.b();
/*     */     
/*  81 */     f11 = -f4;
/*  82 */     f12 = -f4;
/*  83 */     f13 = f4;
/*  84 */     f14 = -f4;
/*     */     
/*  86 */     f15 = -f4;
/*  87 */     f16 = f4;
/*  88 */     f17 = f4;
/*  89 */     f18 = f4;
/*     */     
/*  91 */     f19 = 0.0F;
/*  92 */     f20 = 1.0F;
/*  93 */     f21 = -1.0F + f7;
/*  94 */     f22 = j * f2 + f21;
/*     */     
/*  96 */     a(☃, eag1.getBuffer(eao.d(vk1, true)), f8, f9, f10, 0.125F, i, k, f11, f12, f13, f14, f15, f16, f17, f18, 0.0F, 1.0F, f22, f21);
/*     */     
/*  98 */     ☃.b();
/*     */   }
/*     */   
/*     */   private static void a(dfm ☃, dfq dfq1, float f1, float f2, float f3, float f4, int i, int j, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
/* 102 */     dfm.a a = ☃.c();
/* 103 */     b b = a.a();
/* 104 */     a a1 = a.b();
/* 105 */     a(b, a1, dfq1, f1, f2, f3, f4, i, j, f5, f6, f7, f8, f13, f14, f15, f16);
/* 106 */     a(b, a1, dfq1, f1, f2, f3, f4, i, j, f11, f12, f9, f10, f13, f14, f15, f16);
/* 107 */     a(b, a1, dfq1, f1, f2, f3, f4, i, j, f7, f8, f11, f12, f13, f14, f15, f16);
/* 108 */     a(b, a1, dfq1, f1, f2, f3, f4, i, j, f9, f10, f5, f6, f13, f14, f15, f16);
/*     */   }
/*     */   
/*     */   private static void a(b ☃, a a1, dfq dfq1, float f1, float f2, float f3, float f4, int i, int j, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
/* 112 */     a(☃, a1, dfq1, f1, f2, f3, f4, j, f5, f6, f10, f11);
/* 113 */     a(☃, a1, dfq1, f1, f2, f3, f4, i, f5, f6, f10, f12);
/* 114 */     a(☃, a1, dfq1, f1, f2, f3, f4, i, f7, f8, f9, f12);
/* 115 */     a(☃, a1, dfq1, f1, f2, f3, f4, j, f7, f8, f9, f11);
/*     */   }
/*     */   
/*     */   private static void a(b ☃, a a1, dfq dfq1, float f1, float f2, float f3, float f4, int i, float f5, float f6, float f7, float f8) {
/* 119 */     dfq1.a(☃, f5, i, f6).a(f1, f2, f3, f4).a(f7, f8).b(ejw.a).a(15728880).a(a1, 0.0F, 1.0F, 0.0F).d();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(cce ☃) {
/* 124 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eca.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */