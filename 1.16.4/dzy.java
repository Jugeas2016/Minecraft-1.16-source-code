/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import net.minecraft.util.CubicSampler;
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
/*     */ public class dzy
/*     */ {
/*     */   private static float a;
/*     */   private static float b;
/*     */   private static float c;
/*     */   
/*     */   public enum a
/*     */   {
/*  26 */     a, b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  35 */   private static int d = -1;
/*  36 */   private static int e = -1;
/*  37 */   private static long f = -1L;
/*     */   
/*     */   public static void a(djk ☃, float f1, dwt dwt1, int i, float f2) {
/*  40 */     cux cux = ☃.k();
/*     */     
/*  42 */     if (cux.a(aef.b)) {
/*  43 */       long l = x.b();
/*  44 */       int j = dwt1.v(new fx(☃.b())).n();
/*  45 */       if (f < 0L) {
/*  46 */         d = j;
/*  47 */         e = j;
/*  48 */         f = l;
/*     */       } 
/*     */       
/*  51 */       int k = d >> 16 & 0xFF;
/*  52 */       int m = d >> 8 & 0xFF;
/*  53 */       int n = d & 0xFF;
/*     */       
/*  55 */       int i1 = e >> 16 & 0xFF;
/*  56 */       int i2 = e >> 8 & 0xFF;
/*  57 */       int i3 = e & 0xFF;
/*     */       
/*  59 */       float f3 = afm.a((float)(l - f) / 5000.0F, 0.0F, 1.0F);
/*  60 */       float f4 = afm.g(f3, i1, k);
/*  61 */       float f5 = afm.g(f3, i2, m);
/*  62 */       float f6 = afm.g(f3, i3, n);
/*  63 */       a = f4 / 255.0F;
/*  64 */       b = f5 / 255.0F;
/*  65 */       c = f6 / 255.0F;
/*     */       
/*  67 */       if (d != j) {
/*  68 */         d = j;
/*  69 */         e = afm.d(f4) << 16 | afm.d(f5) << 8 | afm.d(f6);
/*  70 */         f = l;
/*     */       } 
/*  72 */     } else if (cux.a(aef.c)) {
/*  73 */       a = 0.6F;
/*  74 */       b = 0.1F;
/*  75 */       c = 0.0F;
/*  76 */       f = -1L;
/*     */     } else {
/*  78 */       float f3 = 0.25F + 0.75F * i / 32.0F;
/*  79 */       f3 = 1.0F - (float)Math.pow(f3, 0.25D);
/*     */       
/*  81 */       dcn dcn1 = dwt1.a(☃.c(), f1);
/*  82 */       float f4 = (float)dcn1.b;
/*  83 */       float f5 = (float)dcn1.c;
/*  84 */       float f6 = (float)dcn1.d;
/*     */       
/*  86 */       float f7 = afm.a(afm.b(dwt1.f(f1) * 6.2831855F) * 2.0F + 0.5F, 0.0F, 1.0F);
/*  87 */       bsx bsx = dwt1.d();
/*     */       
/*  89 */       dcn dcn2 = ☃.b().a(2.0D, 2.0D, 2.0D).a(0.25D);
/*  90 */       dcn dcn3 = CubicSampler.a(dcn2, (i, j, k) -> ☃.a().a(dcn.a(bsx1.a(i, j, k).f()), f));
/*     */       
/*  92 */       a = (float)dcn3.a();
/*  93 */       b = (float)dcn3.b();
/*  94 */       c = (float)dcn3.c();
/*     */       
/*  96 */       if (i >= 4) {
/*  97 */         float f10 = (afm.a(dwt1.a(f1)) > 0.0F) ? -1.0F : 1.0F;
/*  98 */         g g = new g(f10, 0.0F, 0.0F);
/*  99 */         float f11 = ☃.l().c(g);
/* 100 */         if (f11 < 0.0F) {
/* 101 */           f11 = 0.0F;
/*     */         }
/* 103 */         if (f11 > 0.0F) {
/* 104 */           float[] arrayOfFloat = dwt1.a().a(dwt1.f(f1), f1);
/* 105 */           if (arrayOfFloat != null) {
/* 106 */             f11 *= arrayOfFloat[3];
/* 107 */             a = a * (1.0F - f11) + arrayOfFloat[0] * f11;
/* 108 */             b = b * (1.0F - f11) + arrayOfFloat[1] * f11;
/* 109 */             c = c * (1.0F - f11) + arrayOfFloat[2] * f11;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 114 */       a += (f4 - a) * f3;
/* 115 */       b += (f5 - b) * f3;
/* 116 */       c += (f6 - c) * f3;
/*     */       
/* 118 */       float f8 = dwt1.d(f1);
/* 119 */       if (f8 > 0.0F) {
/* 120 */         float f10 = 1.0F - f8 * 0.5F;
/* 121 */         float f11 = 1.0F - f8 * 0.4F;
/* 122 */         a *= f10;
/* 123 */         b *= f10;
/* 124 */         c *= f11;
/*     */       } 
/* 126 */       float f9 = dwt1.b(f1);
/* 127 */       if (f9 > 0.0F) {
/* 128 */         float f = 1.0F - f9 * 0.5F;
/* 129 */         a *= f;
/* 130 */         b *= f;
/* 131 */         c *= f;
/*     */       } 
/* 133 */       f = -1L;
/*     */     } 
/*     */     
/* 136 */     double d = (☃.b()).c * dwt1.w().h();
/* 137 */     if (☃.g() instanceof aqm && ((aqm)☃.g()).a(apw.o)) {
/* 138 */       int j = ((aqm)☃.g()).b(apw.o).b();
/* 139 */       if (j < 20) {
/* 140 */         d *= (1.0F - j / 20.0F);
/*     */       } else {
/* 142 */         d = 0.0D;
/*     */       } 
/*     */     } 
/* 145 */     if (d < 1.0D && !cux.a(aef.c)) {
/* 146 */       if (d < 0.0D) {
/* 147 */         d = 0.0D;
/*     */       }
/* 149 */       d *= d;
/* 150 */       a = (float)(a * d);
/* 151 */       b = (float)(b * d);
/* 152 */       c = (float)(c * d);
/*     */     } 
/*     */     
/* 155 */     if (f2 > 0.0F) {
/* 156 */       a = a * (1.0F - f2) + a * 0.7F * f2;
/* 157 */       b = b * (1.0F - f2) + b * 0.6F * f2;
/* 158 */       c = c * (1.0F - f2) + c * 0.6F * f2;
/*     */     } 
/*     */     
/* 161 */     if (cux.a(aef.b)) {
/* 162 */       float f3 = 0.0F;
/* 163 */       if (☃.g() instanceof dzm) {
/* 164 */         dzm dzm = (dzm)☃.g();
/* 165 */         f3 = dzm.N();
/*     */       } 
/*     */       
/* 168 */       float f4 = Math.min(1.0F / a, Math.min(1.0F / b, 1.0F / c));
/* 169 */       a = a * (1.0F - f3) + a * f4 * f3;
/* 170 */       b = b * (1.0F - f3) + b * f4 * f3;
/* 171 */       c = c * (1.0F - f3) + c * f4 * f3;
/* 172 */     } else if (☃.g() instanceof aqm && ((aqm)☃.g()).a(apw.p)) {
/* 173 */       float f3 = dzz.a((aqm)☃.g(), f1);
/* 174 */       float f4 = Math.min(1.0F / a, Math.min(1.0F / b, 1.0F / c));
/* 175 */       a = a * (1.0F - f3) + a * f4 * f3;
/* 176 */       b = b * (1.0F - f3) + b * f4 * f3;
/* 177 */       c = c * (1.0F - f3) + c * f4 * f3;
/*     */     } 
/*     */     
/* 180 */     RenderSystem.clearColor(a, b, c, 0.0F);
/*     */   }
/*     */   
/*     */   public static void a() {
/* 184 */     RenderSystem.fogDensity(0.0F);
/* 185 */     RenderSystem.fogMode(dem.m.c);
/*     */   }
/*     */   
/*     */   public static void a(djk ☃, a a1, float f, boolean bool) {
/* 189 */     cux cux = ☃.k();
/* 190 */     aqa aqa = ☃.g();
/*     */     
/* 192 */     if (cux.a(aef.b)) {
/* 193 */       float f1 = 1.0F;
/* 194 */       f1 = 0.05F;
/* 195 */       if (aqa instanceof dzm) {
/* 196 */         dzm dzm = (dzm)aqa;
/* 197 */         f1 -= dzm.N() * dzm.N() * 0.03F;
/* 198 */         bsv bsv = dzm.l.v(dzm.cB());
/* 199 */         if (bsv.t() == bsv.b.o) {
/* 200 */           f1 += 0.005F;
/*     */         }
/*     */       } 
/*     */       
/* 204 */       RenderSystem.fogDensity(f1);
/* 205 */       RenderSystem.fogMode(dem.m.c);
/*     */     } else {
/*     */       float f1, f2;
/*     */ 
/*     */       
/* 210 */       if (cux.a(aef.c)) {
/* 211 */         if (aqa instanceof aqm && ((aqm)aqa).a(apw.l)) {
/* 212 */           f1 = 0.0F;
/* 213 */           f2 = 3.0F;
/*     */         } else {
/* 215 */           f1 = 0.25F;
/* 216 */           f2 = 1.0F;
/*     */         } 
/* 218 */       } else if (aqa instanceof aqm && ((aqm)aqa).a(apw.o)) {
/* 219 */         int i = ((aqm)aqa).b(apw.o).b();
/*     */         
/* 221 */         float f3 = afm.g(Math.min(1.0F, i / 20.0F), f, 5.0F);
/*     */         
/* 223 */         if (a1 == a.a) {
/* 224 */           f1 = 0.0F;
/* 225 */           f2 = f3 * 0.8F;
/*     */         } else {
/* 227 */           f1 = f3 * 0.25F;
/* 228 */           f2 = f3;
/*     */         }
/*     */       
/* 231 */       } else if (bool) {
/* 232 */         f1 = f * 0.05F;
/* 233 */         f2 = Math.min(f, 192.0F) * 0.5F;
/* 234 */       } else if (a1 == a.a) {
/* 235 */         f1 = 0.0F;
/* 236 */         f2 = f;
/*     */       } else {
/* 238 */         f1 = f * 0.75F;
/* 239 */         f2 = f;
/*     */       } 
/*     */ 
/*     */       
/* 243 */       RenderSystem.fogStart(f1);
/* 244 */       RenderSystem.fogEnd(f2);
/*     */       
/* 246 */       RenderSystem.fogMode(dem.m.a);
/* 247 */       RenderSystem.setupNvFogDistance();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void b() {
/* 252 */     RenderSystem.fog(2918, a, b, c, 1.0F);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dzy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */