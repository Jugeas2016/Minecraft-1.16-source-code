/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import javax.annotation.Nullable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class eaq
/*     */ {
/*  26 */   private static final vk a = new vk("textures/misc/underwater.png");
/*     */   
/*     */   public static void a(djz ☃, dfm dfm1) {
/*  29 */     RenderSystem.disableAlphaTest();
/*     */     
/*  31 */     bfw bfw = ☃.s;
/*  32 */     if (!bfw.H) {
/*  33 */       ceh ceh = a(bfw);
/*  34 */       if (ceh != null) {
/*  35 */         a(☃, ☃.ab().a().a(ceh), dfm1);
/*     */       }
/*     */     } 
/*     */     
/*  39 */     if (!☃.s.a_()) {
/*  40 */       if (☃.s.a(aef.b)) {
/*  41 */         b(☃, dfm1);
/*     */       }
/*     */       
/*  44 */       if (☃.s.bq()) {
/*  45 */         c(☃, dfm1);
/*     */       }
/*     */     } 
/*     */     
/*  49 */     RenderSystem.enableAlphaTest();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static ceh a(bfw ☃) {
/*  54 */     fx.a a = new fx.a();
/*  55 */     for (int i = 0; i < 8; i++) {
/*  56 */       double d1 = ☃.cD() + ((((i >> 0) % 2) - 0.5F) * ☃.cy() * 0.8F);
/*  57 */       double d2 = ☃.cG() + ((((i >> 1) % 2) - 0.5F) * 0.1F);
/*  58 */       double d3 = ☃.cH() + ((((i >> 2) % 2) - 0.5F) * ☃.cy() * 0.8F);
/*     */       
/*  60 */       a.c(d1, d2, d3);
/*  61 */       ceh ceh = ☃.l.d_(a);
/*  62 */       if (ceh.h() != bzh.a && ceh.p(☃.l, a)) {
/*  63 */         return ceh;
/*     */       }
/*     */     } 
/*  66 */     return null;
/*     */   }
/*     */   
/*     */   private static void a(djz ☃, ekc ekc1, dfm dfm1) {
/*  70 */     ☃.M().a(ekc1.m().g());
/*     */     
/*  72 */     dfh dfh = dfo.a().c();
/*     */     
/*  74 */     float f1 = 0.1F;
/*     */     
/*  76 */     float f2 = -1.0F;
/*  77 */     float f3 = 1.0F;
/*  78 */     float f4 = -1.0F;
/*  79 */     float f5 = 1.0F;
/*  80 */     float f6 = -0.5F;
/*     */     
/*  82 */     float f7 = ekc1.h();
/*  83 */     float f8 = ekc1.i();
/*  84 */     float f9 = ekc1.j();
/*  85 */     float f10 = ekc1.k();
/*     */     
/*  87 */     b b = dfm1.c().a();
/*     */     
/*  89 */     dfh.a(7, dfk.o);
/*  90 */     dfh.a(b, -1.0F, -1.0F, -0.5F).a(0.1F, 0.1F, 0.1F, 1.0F).a(f8, f10).d();
/*  91 */     dfh.a(b, 1.0F, -1.0F, -0.5F).a(0.1F, 0.1F, 0.1F, 1.0F).a(f7, f10).d();
/*  92 */     dfh.a(b, 1.0F, 1.0F, -0.5F).a(0.1F, 0.1F, 0.1F, 1.0F).a(f7, f9).d();
/*  93 */     dfh.a(b, -1.0F, 1.0F, -0.5F).a(0.1F, 0.1F, 0.1F, 1.0F).a(f8, f9).d();
/*  94 */     dfh.c();
/*  95 */     dfi.a(dfh);
/*     */   }
/*     */   
/*     */   private static void b(djz ☃, dfm dfm1) {
/*  99 */     RenderSystem.enableTexture();
/* 100 */     ☃.M().a(a);
/*     */     
/* 102 */     dfh dfh = dfo.a().c();
/*     */     
/* 104 */     float f1 = ☃.s.aR();
/* 105 */     RenderSystem.enableBlend();
/* 106 */     RenderSystem.defaultBlendFunc();
/*     */     
/* 108 */     float f2 = 4.0F;
/*     */     
/* 110 */     float f3 = -1.0F;
/* 111 */     float f4 = 1.0F;
/* 112 */     float f5 = -1.0F;
/* 113 */     float f6 = 1.0F;
/* 114 */     float f7 = -0.5F;
/*     */     
/* 116 */     float f8 = -☃.s.p / 64.0F;
/* 117 */     float f9 = ☃.s.q / 64.0F;
/*     */     
/* 119 */     b b = dfm1.c().a();
/*     */     
/* 121 */     dfh.a(7, dfk.o);
/* 122 */     dfh.a(b, -1.0F, -1.0F, -0.5F).a(f1, f1, f1, 0.1F).a(4.0F + f8, 4.0F + f9).d();
/* 123 */     dfh.a(b, 1.0F, -1.0F, -0.5F).a(f1, f1, f1, 0.1F).a(0.0F + f8, 4.0F + f9).d();
/* 124 */     dfh.a(b, 1.0F, 1.0F, -0.5F).a(f1, f1, f1, 0.1F).a(0.0F + f8, 0.0F + f9).d();
/* 125 */     dfh.a(b, -1.0F, 1.0F, -0.5F).a(f1, f1, f1, 0.1F).a(4.0F + f8, 0.0F + f9).d();
/* 126 */     dfh.c();
/* 127 */     dfi.a(dfh);
/*     */     
/* 129 */     RenderSystem.disableBlend();
/*     */   }
/*     */   
/*     */   private static void c(djz ☃, dfm dfm1) {
/* 133 */     dfh dfh = dfo.a().c();
/*     */     
/* 135 */     RenderSystem.depthFunc(519);
/* 136 */     RenderSystem.depthMask(false);
/* 137 */     RenderSystem.enableBlend();
/* 138 */     RenderSystem.defaultBlendFunc();
/* 139 */     RenderSystem.enableTexture();
/*     */     
/* 141 */     ekc ekc = els.b.c();
/* 142 */     ☃.M().a(ekc.m().g());
/*     */     
/* 144 */     float f1 = ekc.h();
/* 145 */     float f2 = ekc.i();
/* 146 */     float f3 = (f1 + f2) / 2.0F;
/*     */     
/* 148 */     float f4 = ekc.j();
/* 149 */     float f5 = ekc.k();
/* 150 */     float f6 = (f4 + f5) / 2.0F;
/*     */     
/* 152 */     float f7 = ekc.p();
/*     */     
/* 154 */     float f8 = afm.g(f7, f1, f3);
/* 155 */     float f9 = afm.g(f7, f2, f3);
/* 156 */     float f10 = afm.g(f7, f4, f6);
/* 157 */     float f11 = afm.g(f7, f5, f6);
/*     */     
/* 159 */     float f12 = 1.0F;
/* 160 */     for (int i = 0; i < 2; i++) {
/* 161 */       dfm1.a();
/*     */       
/* 163 */       float f13 = -0.5F;
/* 164 */       float f14 = 0.5F;
/* 165 */       float f15 = -0.5F;
/* 166 */       float f16 = 0.5F;
/* 167 */       float f17 = -0.5F;
/* 168 */       dfm1.a((-(i * 2 - 1) * 0.24F), -0.30000001192092896D, 0.0D);
/* 169 */       dfm1.a(g.d.a((i * 2 - 1) * 10.0F));
/*     */       
/* 171 */       b b = dfm1.c().a();
/*     */       
/* 173 */       dfh.a(7, dfk.o);
/* 174 */       dfh.a(b, -0.5F, -0.5F, -0.5F).a(1.0F, 1.0F, 1.0F, 0.9F).a(f9, f11).d();
/* 175 */       dfh.a(b, 0.5F, -0.5F, -0.5F).a(1.0F, 1.0F, 1.0F, 0.9F).a(f8, f11).d();
/* 176 */       dfh.a(b, 0.5F, 0.5F, -0.5F).a(1.0F, 1.0F, 1.0F, 0.9F).a(f8, f10).d();
/* 177 */       dfh.a(b, -0.5F, 0.5F, -0.5F).a(1.0F, 1.0F, 1.0F, 0.9F).a(f9, f10).d();
/* 178 */       dfh.c();
/* 179 */       dfi.a(dfh);
/* 180 */       dfm1.b();
/*     */     } 
/* 182 */     RenderSystem.disableBlend();
/* 183 */     RenderSystem.depthMask(true);
/* 184 */     RenderSystem.depthFunc(515);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eaq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */