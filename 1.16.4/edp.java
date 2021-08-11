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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class edp
/*     */   implements edh.a
/*     */ {
/*     */   private final djz a;
/*     */   
/*     */   public edp(djz ☃) {
/*  23 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, eag eag1, double d1, double d2, double d3) {
/*  28 */     brc brc = this.a.s.l;
/*     */     
/*  30 */     RenderSystem.enableBlend();
/*  31 */     RenderSystem.defaultBlendFunc();
/*  32 */     RenderSystem.lineWidth(2.0F);
/*  33 */     RenderSystem.disableTexture();
/*  34 */     RenderSystem.depthMask(false);
/*     */     
/*  36 */     fx fx = new fx(d1, d2, d3);
/*     */ 
/*     */     
/*  39 */     for (fx fx1 : fx.a(fx.b(-6, -6, -6), fx.b(6, 6, 6))) {
/*  40 */       ceh ceh = brc.d_(fx1);
/*     */       
/*  42 */       if (ceh.a(bup.a)) {
/*     */         continue;
/*     */       }
/*     */ 
/*     */       
/*  47 */       ddh ddh = ceh.j(brc, fx1);
/*  48 */       for (dci dci1 : ddh.d()) {
/*  49 */         dci dci2 = dci1.a(fx1).g(0.002D).d(-d1, -d2, -d3);
/*     */         
/*  51 */         double d4 = dci2.a;
/*  52 */         double d5 = dci2.b;
/*  53 */         double d6 = dci2.c;
/*     */         
/*  55 */         double d7 = dci2.d;
/*  56 */         double d8 = dci2.e;
/*  57 */         double d9 = dci2.f;
/*     */         
/*  59 */         float f1 = 1.0F;
/*  60 */         float f2 = 0.0F;
/*  61 */         float f3 = 0.0F;
/*  62 */         float f4 = 0.5F;
/*     */         
/*  64 */         if (ceh.d(brc, fx1, gc.e)) {
/*  65 */           dfo dfo = dfo.a();
/*  66 */           dfh dfh = dfo.c();
/*  67 */           dfh.a(5, dfk.l);
/*  68 */           dfh.a(d4, d5, d6).a(1.0F, 0.0F, 0.0F, 0.5F).d();
/*  69 */           dfh.a(d4, d5, d9).a(1.0F, 0.0F, 0.0F, 0.5F).d();
/*  70 */           dfh.a(d4, d8, d6).a(1.0F, 0.0F, 0.0F, 0.5F).d();
/*  71 */           dfh.a(d4, d8, d9).a(1.0F, 0.0F, 0.0F, 0.5F).d();
/*  72 */           dfo.b();
/*     */         } 
/*  74 */         if (ceh.d(brc, fx1, gc.d)) {
/*  75 */           dfo dfo = dfo.a();
/*  76 */           dfh dfh = dfo.c();
/*  77 */           dfh.a(5, dfk.l);
/*  78 */           dfh.a(d4, d8, d9).a(1.0F, 0.0F, 0.0F, 0.5F).d();
/*  79 */           dfh.a(d4, d5, d9).a(1.0F, 0.0F, 0.0F, 0.5F).d();
/*  80 */           dfh.a(d7, d8, d9).a(1.0F, 0.0F, 0.0F, 0.5F).d();
/*  81 */           dfh.a(d7, d5, d9).a(1.0F, 0.0F, 0.0F, 0.5F).d();
/*  82 */           dfo.b();
/*     */         } 
/*  84 */         if (ceh.d(brc, fx1, gc.f)) {
/*  85 */           dfo dfo = dfo.a();
/*  86 */           dfh dfh = dfo.c();
/*  87 */           dfh.a(5, dfk.l);
/*  88 */           dfh.a(d7, d5, d9).a(1.0F, 0.0F, 0.0F, 0.5F).d();
/*  89 */           dfh.a(d7, d5, d6).a(1.0F, 0.0F, 0.0F, 0.5F).d();
/*  90 */           dfh.a(d7, d8, d9).a(1.0F, 0.0F, 0.0F, 0.5F).d();
/*  91 */           dfh.a(d7, d8, d6).a(1.0F, 0.0F, 0.0F, 0.5F).d();
/*  92 */           dfo.b();
/*     */         } 
/*  94 */         if (ceh.d(brc, fx1, gc.c)) {
/*  95 */           dfo dfo = dfo.a();
/*  96 */           dfh dfh = dfo.c();
/*  97 */           dfh.a(5, dfk.l);
/*  98 */           dfh.a(d7, d8, d6).a(1.0F, 0.0F, 0.0F, 0.5F).d();
/*  99 */           dfh.a(d7, d5, d6).a(1.0F, 0.0F, 0.0F, 0.5F).d();
/* 100 */           dfh.a(d4, d8, d6).a(1.0F, 0.0F, 0.0F, 0.5F).d();
/* 101 */           dfh.a(d4, d5, d6).a(1.0F, 0.0F, 0.0F, 0.5F).d();
/* 102 */           dfo.b();
/*     */         } 
/* 104 */         if (ceh.d(brc, fx1, gc.a)) {
/* 105 */           dfo dfo = dfo.a();
/* 106 */           dfh dfh = dfo.c();
/* 107 */           dfh.a(5, dfk.l);
/* 108 */           dfh.a(d4, d5, d6).a(1.0F, 0.0F, 0.0F, 0.5F).d();
/* 109 */           dfh.a(d7, d5, d6).a(1.0F, 0.0F, 0.0F, 0.5F).d();
/* 110 */           dfh.a(d4, d5, d9).a(1.0F, 0.0F, 0.0F, 0.5F).d();
/* 111 */           dfh.a(d7, d5, d9).a(1.0F, 0.0F, 0.0F, 0.5F).d();
/* 112 */           dfo.b();
/*     */         } 
/* 114 */         if (ceh.d(brc, fx1, gc.b)) {
/* 115 */           dfo dfo = dfo.a();
/* 116 */           dfh dfh = dfo.c();
/* 117 */           dfh.a(5, dfk.l);
/* 118 */           dfh.a(d4, d8, d6).a(1.0F, 0.0F, 0.0F, 0.5F).d();
/* 119 */           dfh.a(d4, d8, d9).a(1.0F, 0.0F, 0.0F, 0.5F).d();
/* 120 */           dfh.a(d7, d8, d6).a(1.0F, 0.0F, 0.0F, 0.5F).d();
/* 121 */           dfh.a(d7, d8, d9).a(1.0F, 0.0F, 0.0F, 0.5F).d();
/* 122 */           dfo.b();
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 127 */     RenderSystem.depthMask(true);
/* 128 */     RenderSystem.enableTexture();
/* 129 */     RenderSystem.disableBlend();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\edp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */