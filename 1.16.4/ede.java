/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ede
/*     */   implements edh.a
/*     */ {
/*     */   private final djz a;
/*     */   
/*     */   public ede(djz ☃) {
/*  17 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, eag eag1, double d1, double d2, double d3) {
/*  22 */     RenderSystem.enableDepthTest();
/*  23 */     RenderSystem.shadeModel(7425);
/*  24 */     RenderSystem.enableAlphaTest();
/*  25 */     RenderSystem.defaultAlphaFunc();
/*  26 */     aqa aqa = this.a.h.k().g();
/*  27 */     dfo dfo = dfo.a();
/*  28 */     dfh dfh = dfo.c();
/*     */     
/*  30 */     double d4 = 0.0D - d2;
/*  31 */     double d5 = 256.0D - d2;
/*     */     
/*  33 */     RenderSystem.disableTexture();
/*  34 */     RenderSystem.disableBlend();
/*     */     
/*  36 */     double d6 = (aqa.V << 4) - d1;
/*  37 */     double d7 = (aqa.X << 4) - d3;
/*     */     
/*  39 */     RenderSystem.lineWidth(1.0F);
/*  40 */     dfh.a(3, dfk.l);
/*     */     
/*     */     int i;
/*  43 */     for (i = -16; i <= 32; i += 16) {
/*  44 */       for (int j = -16; j <= 32; j += 16) {
/*  45 */         dfh.a(d6 + i, d4, d7 + j).a(1.0F, 0.0F, 0.0F, 0.0F).d();
/*  46 */         dfh.a(d6 + i, d4, d7 + j).a(1.0F, 0.0F, 0.0F, 0.5F).d();
/*  47 */         dfh.a(d6 + i, d5, d7 + j).a(1.0F, 0.0F, 0.0F, 0.5F).d();
/*  48 */         dfh.a(d6 + i, d5, d7 + j).a(1.0F, 0.0F, 0.0F, 0.0F).d();
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/*  53 */     for (i = 2; i < 16; i += 2) {
/*  54 */       dfh.a(d6 + i, d4, d7).a(1.0F, 1.0F, 0.0F, 0.0F).d();
/*  55 */       dfh.a(d6 + i, d4, d7).a(1.0F, 1.0F, 0.0F, 1.0F).d();
/*  56 */       dfh.a(d6 + i, d5, d7).a(1.0F, 1.0F, 0.0F, 1.0F).d();
/*  57 */       dfh.a(d6 + i, d5, d7).a(1.0F, 1.0F, 0.0F, 0.0F).d();
/*     */       
/*  59 */       dfh.a(d6 + i, d4, d7 + 16.0D).a(1.0F, 1.0F, 0.0F, 0.0F).d();
/*  60 */       dfh.a(d6 + i, d4, d7 + 16.0D).a(1.0F, 1.0F, 0.0F, 1.0F).d();
/*  61 */       dfh.a(d6 + i, d5, d7 + 16.0D).a(1.0F, 1.0F, 0.0F, 1.0F).d();
/*  62 */       dfh.a(d6 + i, d5, d7 + 16.0D).a(1.0F, 1.0F, 0.0F, 0.0F).d();
/*     */     } 
/*     */ 
/*     */     
/*  66 */     for (i = 2; i < 16; i += 2) {
/*  67 */       dfh.a(d6, d4, d7 + i).a(1.0F, 1.0F, 0.0F, 0.0F).d();
/*  68 */       dfh.a(d6, d4, d7 + i).a(1.0F, 1.0F, 0.0F, 1.0F).d();
/*  69 */       dfh.a(d6, d5, d7 + i).a(1.0F, 1.0F, 0.0F, 1.0F).d();
/*  70 */       dfh.a(d6, d5, d7 + i).a(1.0F, 1.0F, 0.0F, 0.0F).d();
/*     */       
/*  72 */       dfh.a(d6 + 16.0D, d4, d7 + i).a(1.0F, 1.0F, 0.0F, 0.0F).d();
/*  73 */       dfh.a(d6 + 16.0D, d4, d7 + i).a(1.0F, 1.0F, 0.0F, 1.0F).d();
/*  74 */       dfh.a(d6 + 16.0D, d5, d7 + i).a(1.0F, 1.0F, 0.0F, 1.0F).d();
/*  75 */       dfh.a(d6 + 16.0D, d5, d7 + i).a(1.0F, 1.0F, 0.0F, 0.0F).d();
/*     */     } 
/*     */ 
/*     */     
/*  79 */     for (i = 0; i <= 256; i += 2) {
/*  80 */       double d = i - d2;
/*  81 */       dfh.a(d6, d, d7).a(1.0F, 1.0F, 0.0F, 0.0F).d();
/*  82 */       dfh.a(d6, d, d7).a(1.0F, 1.0F, 0.0F, 1.0F).d();
/*  83 */       dfh.a(d6, d, d7 + 16.0D).a(1.0F, 1.0F, 0.0F, 1.0F).d();
/*  84 */       dfh.a(d6 + 16.0D, d, d7 + 16.0D).a(1.0F, 1.0F, 0.0F, 1.0F).d();
/*  85 */       dfh.a(d6 + 16.0D, d, d7).a(1.0F, 1.0F, 0.0F, 1.0F).d();
/*  86 */       dfh.a(d6, d, d7).a(1.0F, 1.0F, 0.0F, 1.0F).d();
/*  87 */       dfh.a(d6, d, d7).a(1.0F, 1.0F, 0.0F, 0.0F).d();
/*     */     } 
/*     */     
/*  90 */     dfo.b();
/*     */ 
/*     */     
/*  93 */     RenderSystem.lineWidth(2.0F);
/*  94 */     dfh.a(3, dfk.l);
/*  95 */     for (i = 0; i <= 16; i += 16) {
/*  96 */       for (int j = 0; j <= 16; j += 16) {
/*  97 */         dfh.a(d6 + i, d4, d7 + j).a(0.25F, 0.25F, 1.0F, 0.0F).d();
/*  98 */         dfh.a(d6 + i, d4, d7 + j).a(0.25F, 0.25F, 1.0F, 1.0F).d();
/*  99 */         dfh.a(d6 + i, d5, d7 + j).a(0.25F, 0.25F, 1.0F, 1.0F).d();
/* 100 */         dfh.a(d6 + i, d5, d7 + j).a(0.25F, 0.25F, 1.0F, 0.0F).d();
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 105 */     for (i = 0; i <= 256; i += 16) {
/* 106 */       double d = i - d2;
/* 107 */       dfh.a(d6, d, d7).a(0.25F, 0.25F, 1.0F, 0.0F).d();
/* 108 */       dfh.a(d6, d, d7).a(0.25F, 0.25F, 1.0F, 1.0F).d();
/* 109 */       dfh.a(d6, d, d7 + 16.0D).a(0.25F, 0.25F, 1.0F, 1.0F).d();
/* 110 */       dfh.a(d6 + 16.0D, d, d7 + 16.0D).a(0.25F, 0.25F, 1.0F, 1.0F).d();
/* 111 */       dfh.a(d6 + 16.0D, d, d7).a(0.25F, 0.25F, 1.0F, 1.0F).d();
/* 112 */       dfh.a(d6, d, d7).a(0.25F, 0.25F, 1.0F, 1.0F).d();
/* 113 */       dfh.a(d6, d, d7).a(0.25F, 0.25F, 1.0F, 0.0F).d();
/*     */     } 
/*     */     
/* 116 */     dfo.b();
/*     */     
/* 118 */     RenderSystem.lineWidth(1.0F);
/* 119 */     RenderSystem.enableBlend();
/* 120 */     RenderSystem.enableTexture();
/* 121 */     RenderSystem.shadeModel(7424);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ede.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */