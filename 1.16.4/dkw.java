/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.function.BiConsumer;
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
/*     */ public abstract class dkw
/*     */ {
/*  20 */   public static final vk f = new vk("textures/gui/options_background.png");
/*  21 */   public static final vk g = new vk("textures/gui/container/stats_icons.png");
/*  22 */   public static final vk h = new vk("textures/gui/icons.png");
/*     */   private int a;
/*     */   
/*     */   protected void a(dfm ☃, int i, int j, int k, int m) {
/*  26 */     if (j < i) {
/*  27 */       int n = i;
/*  28 */       i = j;
/*  29 */       j = n;
/*     */     } 
/*  31 */     a(☃, i, k, j + 1, k + 1, m);
/*     */   }
/*     */   
/*     */   protected void b(dfm ☃, int i, int j, int k, int m) {
/*  35 */     if (k < j) {
/*  36 */       int n = j;
/*  37 */       j = k;
/*  38 */       k = n;
/*     */     } 
/*  40 */     a(☃, i, j + 1, i + 1, k, m);
/*     */   }
/*     */   
/*     */   public static void a(dfm ☃, int i, int j, int k, int m, int n) {
/*  44 */     a(☃.c().a(), i, j, k, m, n);
/*     */   }
/*     */   
/*     */   private static void a(b ☃, int i, int j, int k, int m, int n) {
/*  48 */     if (i < k) {
/*  49 */       int i1 = i;
/*  50 */       i = k;
/*  51 */       k = i1;
/*     */     } 
/*  53 */     if (j < m) {
/*  54 */       int i1 = j;
/*  55 */       j = m;
/*  56 */       m = i1;
/*     */     } 
/*  58 */     float f1 = (n >> 24 & 0xFF) / 255.0F;
/*  59 */     float f2 = (n >> 16 & 0xFF) / 255.0F;
/*  60 */     float f3 = (n >> 8 & 0xFF) / 255.0F;
/*  61 */     float f4 = (n & 0xFF) / 255.0F;
/*  62 */     dfh dfh = dfo.a().c();
/*  63 */     RenderSystem.enableBlend();
/*  64 */     RenderSystem.disableTexture();
/*  65 */     RenderSystem.defaultBlendFunc();
/*  66 */     dfh.a(7, dfk.l);
/*  67 */     dfh.a(☃, i, m, 0.0F).a(f2, f3, f4, f1).d();
/*  68 */     dfh.a(☃, k, m, 0.0F).a(f2, f3, f4, f1).d();
/*  69 */     dfh.a(☃, k, j, 0.0F).a(f2, f3, f4, f1).d();
/*  70 */     dfh.a(☃, i, j, 0.0F).a(f2, f3, f4, f1).d();
/*  71 */     dfh.c();
/*  72 */     dfi.a(dfh);
/*  73 */     RenderSystem.enableTexture();
/*  74 */     RenderSystem.disableBlend();
/*     */   }
/*     */   
/*     */   protected void a(dfm ☃, int i, int j, int k, int m, int n, int i1) {
/*  78 */     RenderSystem.disableTexture();
/*  79 */     RenderSystem.enableBlend();
/*  80 */     RenderSystem.disableAlphaTest();
/*  81 */     RenderSystem.defaultBlendFunc();
/*  82 */     RenderSystem.shadeModel(7425);
/*     */     
/*  84 */     dfo dfo = dfo.a();
/*  85 */     dfh dfh = dfo.c();
/*  86 */     dfh.a(7, dfk.l);
/*  87 */     a(☃.c().a(), dfh, i, j, k, m, this.a, n, i1);
/*  88 */     dfo.b();
/*     */     
/*  90 */     RenderSystem.shadeModel(7424);
/*  91 */     RenderSystem.disableBlend();
/*  92 */     RenderSystem.enableAlphaTest();
/*  93 */     RenderSystem.enableTexture();
/*     */   }
/*     */   
/*     */   protected static void a(b ☃, dfh dfh1, int i, int j, int k, int m, int n, int i1, int i2) {
/*  97 */     float f1 = (i1 >> 24 & 0xFF) / 255.0F;
/*  98 */     float f2 = (i1 >> 16 & 0xFF) / 255.0F;
/*  99 */     float f3 = (i1 >> 8 & 0xFF) / 255.0F;
/* 100 */     float f4 = (i1 & 0xFF) / 255.0F;
/*     */     
/* 102 */     float f5 = (i2 >> 24 & 0xFF) / 255.0F;
/* 103 */     float f6 = (i2 >> 16 & 0xFF) / 255.0F;
/* 104 */     float f7 = (i2 >> 8 & 0xFF) / 255.0F;
/* 105 */     float f8 = (i2 & 0xFF) / 255.0F;
/*     */     
/* 107 */     dfh1.a(☃, k, j, n).a(f2, f3, f4, f1).d();
/* 108 */     dfh1.a(☃, i, j, n).a(f2, f3, f4, f1).d();
/* 109 */     dfh1.a(☃, i, m, n).a(f6, f7, f8, f5).d();
/* 110 */     dfh1.a(☃, k, m, n).a(f6, f7, f8, f5).d();
/*     */   }
/*     */   
/*     */   public static void a(dfm ☃, dku dku1, String str, int i, int j, int k) {
/* 114 */     dku1.a(☃, str, (i - dku1.b(str) / 2), j, k);
/*     */   }
/*     */   
/*     */   public static void a(dfm ☃, dku dku1, nr nr1, int i, int j, int k) {
/* 118 */     afa afa = nr1.f();
/* 119 */     dku1.a(☃, afa, (i - dku1.a(afa) / 2), j, k);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void b(dfm ☃, dku dku1, String str, int i, int j, int k) {
/* 127 */     dku1.a(☃, str, i, j, k);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void b(dfm ☃, dku dku1, nr nr1, int i, int j, int k) {
/* 135 */     dku1.a(☃, nr1, i, j, k);
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i, BiConsumer<Integer, Integer> biConsumer) {
/* 139 */     RenderSystem.blendFuncSeparate(dem.r.o, dem.j.j, dem.r.l, dem.j.j);
/*     */     
/* 141 */     biConsumer.accept(Integer.valueOf(☃ + 1), Integer.valueOf(i));
/* 142 */     biConsumer.accept(Integer.valueOf(☃ - 1), Integer.valueOf(i));
/* 143 */     biConsumer.accept(Integer.valueOf(☃), Integer.valueOf(i + 1));
/* 144 */     biConsumer.accept(Integer.valueOf(☃), Integer.valueOf(i - 1));
/*     */     
/* 146 */     RenderSystem.blendFunc(dem.r.l, dem.j.j);
/*     */     
/* 148 */     biConsumer.accept(Integer.valueOf(☃), Integer.valueOf(i));
/*     */   }
/*     */   
/*     */   public static void a(dfm ☃, int i, int j, int k, int m, int n, ekc ekc1) {
/* 152 */     a(☃
/* 153 */         .c().a(), i, i + m, j, j + n, k, ekc1
/*     */ 
/*     */         
/* 156 */         .h(), ekc1.i(), ekc1
/* 157 */         .j(), ekc1.k());
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(dfm ☃, int i, int j, int k, int m, int n, int i1) {
/* 162 */     a(☃, i, j, this.a, k, m, n, i1, 256, 256);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(dfm ☃, int i, int j, int k, float f1, float f2, int m, int n, int i1, int i2) {
/* 172 */     a(☃, i, i + m, j, j + n, k, m, n, f1, f2, i2, i1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(dfm ☃, int i, int j, int k, int m, float f1, float f2, int n, int i1, int i2, int i3) {
/* 183 */     a(☃, i, i + k, j, j + m, 0, n, i1, f1, f2, i2, i3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(dfm ☃, int i, int j, float f1, float f2, int k, int m, int n, int i1) {
/* 194 */     a(☃, i, j, k, m, f1, f2, k, m, n, i1);
/*     */   }
/*     */   
/*     */   private static void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, float f1, float f2, int i3, int i4) {
/* 198 */     a(☃.c().a(), i, j, k, m, n, (f1 + 0.0F) / i3, (f1 + i1) / i3, (f2 + 0.0F) / i4, (f2 + i2) / i4);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void a(b ☃, int i, int j, int k, int m, int n, float f1, float f2, float f3, float f4) {
/* 207 */     dfh dfh = dfo.a().c();
/* 208 */     dfh.a(7, dfk.n);
/* 209 */     dfh.a(☃, i, m, n).a(f1, f4).d();
/* 210 */     dfh.a(☃, j, m, n).a(f2, f4).d();
/* 211 */     dfh.a(☃, j, k, n).a(f2, f3).d();
/* 212 */     dfh.a(☃, i, k, n).a(f1, f3).d();
/* 213 */     dfh.c();
/*     */     
/* 215 */     RenderSystem.enableAlphaTest();
/* 216 */     dfi.a(dfh);
/*     */   }
/*     */   
/*     */   public int v() {
/* 220 */     return this.a;
/*     */   }
/*     */   
/*     */   public void d(int ☃) {
/* 224 */     this.a = ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dkw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */