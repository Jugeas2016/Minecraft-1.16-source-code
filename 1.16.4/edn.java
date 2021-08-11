/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
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
/*     */ public class edn
/*     */   implements edh.a
/*     */ {
/*  22 */   private final Map<Integer, cxd> a = Maps.newHashMap();
/*  23 */   private final Map<Integer, Float> b = Maps.newHashMap();
/*  24 */   private final Map<Integer, Long> c = Maps.newHashMap();
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
/*     */   public void a(int ☃, cxd cxd1, float f) {
/*  41 */     this.a.put(Integer.valueOf(☃), cxd1);
/*  42 */     this.c.put(Integer.valueOf(☃), Long.valueOf(x.b()));
/*  43 */     this.b.put(Integer.valueOf(☃), Float.valueOf(f));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, eag eag1, double d1, double d2, double d3) {
/*  48 */     if (this.a.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/*  52 */     long l = x.b();
/*  53 */     for (Integer integer : this.a.keySet()) {
/*  54 */       cxd cxd = this.a.get(integer);
/*  55 */       float f = ((Float)this.b.get(integer)).floatValue();
/*  56 */       a(cxd, f, true, true, d1, d2, d3);
/*     */     } 
/*     */     
/*  59 */     for (Integer integer : (Integer[])this.c.keySet().toArray((Object[])new Integer[0])) {
/*  60 */       if (l - ((Long)this.c.get(integer)).longValue() > 5000L) {
/*  61 */         this.a.remove(integer);
/*  62 */         this.c.remove(integer);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void a(cxd ☃, float f, boolean bool1, boolean bool2, double d1, double d2, double d3) {
/*  68 */     RenderSystem.pushMatrix();
/*     */     
/*  70 */     RenderSystem.enableBlend();
/*  71 */     RenderSystem.defaultBlendFunc();
/*  72 */     RenderSystem.color4f(0.0F, 1.0F, 0.0F, 0.75F);
/*  73 */     RenderSystem.disableTexture();
/*  74 */     RenderSystem.lineWidth(6.0F);
/*     */     
/*  76 */     b(☃, f, bool1, bool2, d1, d2, d3);
/*     */     
/*  78 */     RenderSystem.enableTexture();
/*  79 */     RenderSystem.disableBlend();
/*  80 */     RenderSystem.popMatrix();
/*     */   }
/*     */   
/*     */   private static void b(cxd ☃, float f, boolean bool1, boolean bool2, double d1, double d2, double d3) {
/*  84 */     a(☃, d1, d2, d3);
/*     */     
/*  86 */     fx fx = ☃.m();
/*  87 */     if (a(fx, d1, d2, d3) <= 80.0F) {
/*  88 */       edh.a((new dci((fx.u() + 0.25F), (fx.v() + 0.25F), fx.w() + 0.25D, (fx.u() + 0.75F), (fx.v() + 0.75F), (fx.w() + 0.75F))).d(-d1, -d2, -d3), 0.0F, 1.0F, 0.0F, 0.5F);
/*     */       
/*  90 */       for (int i = 0; i < ☃.e(); i++) {
/*  91 */         cxb cxb = ☃.a(i);
/*  92 */         if (a(cxb.a(), d1, d2, d3) <= 80.0F) {
/*  93 */           float f1 = (i == ☃.f()) ? 1.0F : 0.0F;
/*  94 */           float f2 = (i == ☃.f()) ? 0.0F : 1.0F;
/*  95 */           edh.a((new dci((cxb.a + 0.5F - f), (cxb.b + 0.01F * i), (cxb.c + 0.5F - f), (cxb.a + 0.5F + f), (cxb.b + 0.25F + 0.01F * i), (cxb.c + 0.5F + f)))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 102 */               .d(-d1, -d2, -d3), f1, 0.0F, f2, 0.5F);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 107 */     if (bool1) {
/* 108 */       for (cxb cxb : ☃.l()) {
/* 109 */         if (a(cxb.a(), d1, d2, d3) <= 80.0F)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 117 */           edh.a((new dci((cxb.a + 0.5F - f / 2.0F), (cxb.b + 0.01F), (cxb.c + 0.5F - f / 2.0F), (cxb.a + 0.5F + f / 2.0F), cxb.b + 0.1D, (cxb.c + 0.5F + f / 2.0F)))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 124 */               .d(-d1, -d2, -d3), 1.0F, 0.8F, 0.8F, 0.5F);
/*     */         }
/*     */       } 
/*     */       
/* 128 */       for (cxb cxb : ☃.k()) {
/* 129 */         if (a(cxb.a(), d1, d2, d3) <= 80.0F)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 137 */           edh.a((new dci((cxb.a + 0.5F - f / 2.0F), (cxb.b + 0.01F), (cxb.c + 0.5F - f / 2.0F), (cxb.a + 0.5F + f / 2.0F), cxb.b + 0.1D, (cxb.c + 0.5F + f / 2.0F)))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 144 */               .d(-d1, -d2, -d3), 0.8F, 1.0F, 1.0F, 0.5F);
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 150 */     if (bool2) {
/* 151 */       for (int i = 0; i < ☃.e(); i++) {
/* 152 */         cxb cxb = ☃.a(i);
/* 153 */         if (a(cxb.a(), d1, d2, d3) <= 80.0F) {
/* 154 */           edh.a(String.format("%s", new Object[] { cxb.l }), cxb.a + 0.5D, cxb.b + 0.75D, cxb.c + 0.5D, -1, 0.02F, true, 0.0F, true);
/* 155 */           edh.a(String.format(Locale.ROOT, "%.2f", new Object[] { Float.valueOf(cxb.k) }), cxb.a + 0.5D, cxb.b + 0.25D, cxb.c + 0.5D, -1, 0.02F, true, 0.0F, true);
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public static void a(cxd ☃, double d1, double d2, double d3) {
/* 162 */     dfo dfo = dfo.a();
/* 163 */     dfh dfh = dfo.c();
/*     */     
/* 165 */     dfh.a(3, dfk.l);
/* 166 */     for (int i = 0; i < ☃.e(); i++) {
/* 167 */       cxb cxb = ☃.a(i);
/*     */       
/* 169 */       if (a(cxb.a(), d1, d2, d3) <= 80.0F) {
/*     */ 
/*     */ 
/*     */         
/* 173 */         float f = i / ☃.e() * 0.33F;
/* 174 */         int j = (i == 0) ? 0 : afm.f(f, 0.9F, 0.9F);
/* 175 */         int k = j >> 16 & 0xFF;
/* 176 */         int m = j >> 8 & 0xFF;
/* 177 */         int n = j & 0xFF;
/*     */         
/* 179 */         dfh.a(cxb.a - d1 + 0.5D, cxb.b - d2 + 0.5D, cxb.c - d3 + 0.5D).a(k, m, n, 255).d();
/*     */       } 
/* 181 */     }  dfo.b();
/*     */   }
/*     */   
/*     */   private static float a(fx ☃, double d1, double d2, double d3) {
/* 185 */     return (float)(Math.abs(☃.u() - d1) + Math.abs(☃.v() - d2) + Math.abs(☃.w() - d3));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\edn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */