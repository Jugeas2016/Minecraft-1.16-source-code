/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.Executor;
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
/*     */ public class dzu
/*     */ {
/*  19 */   private final vk[] a = new vk[6];
/*     */   
/*     */   public dzu(vk ☃) {
/*  22 */     for (int i = 0; i < 6; i++) {
/*  23 */       this.a[i] = new vk(☃.b(), ☃.a() + '_' + i + ".png");
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(djz ☃, float f1, float f2, float f3) {
/*  28 */     dfo dfo = dfo.a();
/*  29 */     dfh dfh = dfo.c();
/*     */     
/*  31 */     RenderSystem.matrixMode(5889);
/*  32 */     RenderSystem.pushMatrix();
/*  33 */     RenderSystem.loadIdentity();
/*     */     
/*  35 */     RenderSystem.multMatrix(b.a(85.0D, ☃.aD().k() / ☃.aD().l(), 0.05F, 10.0F));
/*     */     
/*  37 */     RenderSystem.matrixMode(5888);
/*  38 */     RenderSystem.pushMatrix();
/*  39 */     RenderSystem.loadIdentity();
/*  40 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */     
/*  42 */     RenderSystem.rotatef(180.0F, 1.0F, 0.0F, 0.0F);
/*  43 */     RenderSystem.enableBlend();
/*  44 */     RenderSystem.disableAlphaTest();
/*  45 */     RenderSystem.disableCull();
/*  46 */     RenderSystem.depthMask(false);
/*  47 */     RenderSystem.defaultBlendFunc();
/*  48 */     int i = 2;
/*     */     
/*  50 */     for (int j = 0; j < 4; j++) {
/*  51 */       RenderSystem.pushMatrix();
/*  52 */       float f4 = ((j % 2) / 2.0F - 0.5F) / 256.0F;
/*  53 */       float f5 = ((j / 2) / 2.0F - 0.5F) / 256.0F;
/*  54 */       float f6 = 0.0F;
/*  55 */       RenderSystem.translatef(f4, f5, 0.0F);
/*     */       
/*  57 */       RenderSystem.rotatef(f1, 1.0F, 0.0F, 0.0F);
/*  58 */       RenderSystem.rotatef(f2, 0.0F, 1.0F, 0.0F);
/*     */       
/*  60 */       for (int k = 0; k < 6; k++) {
/*  61 */         ☃.M().a(this.a[k]);
/*  62 */         dfh.a(7, dfk.p);
/*  63 */         int m = Math.round(255.0F * f3) / (j + 1);
/*  64 */         if (k == 0) {
/*  65 */           dfh.a(-1.0D, -1.0D, 1.0D).a(0.0F, 0.0F).a(255, 255, 255, m).d();
/*  66 */           dfh.a(-1.0D, 1.0D, 1.0D).a(0.0F, 1.0F).a(255, 255, 255, m).d();
/*  67 */           dfh.a(1.0D, 1.0D, 1.0D).a(1.0F, 1.0F).a(255, 255, 255, m).d();
/*  68 */           dfh.a(1.0D, -1.0D, 1.0D).a(1.0F, 0.0F).a(255, 255, 255, m).d();
/*     */         } 
/*  70 */         if (k == 1) {
/*  71 */           dfh.a(1.0D, -1.0D, 1.0D).a(0.0F, 0.0F).a(255, 255, 255, m).d();
/*  72 */           dfh.a(1.0D, 1.0D, 1.0D).a(0.0F, 1.0F).a(255, 255, 255, m).d();
/*  73 */           dfh.a(1.0D, 1.0D, -1.0D).a(1.0F, 1.0F).a(255, 255, 255, m).d();
/*  74 */           dfh.a(1.0D, -1.0D, -1.0D).a(1.0F, 0.0F).a(255, 255, 255, m).d();
/*     */         } 
/*  76 */         if (k == 2) {
/*  77 */           dfh.a(1.0D, -1.0D, -1.0D).a(0.0F, 0.0F).a(255, 255, 255, m).d();
/*  78 */           dfh.a(1.0D, 1.0D, -1.0D).a(0.0F, 1.0F).a(255, 255, 255, m).d();
/*  79 */           dfh.a(-1.0D, 1.0D, -1.0D).a(1.0F, 1.0F).a(255, 255, 255, m).d();
/*  80 */           dfh.a(-1.0D, -1.0D, -1.0D).a(1.0F, 0.0F).a(255, 255, 255, m).d();
/*     */         } 
/*  82 */         if (k == 3) {
/*  83 */           dfh.a(-1.0D, -1.0D, -1.0D).a(0.0F, 0.0F).a(255, 255, 255, m).d();
/*  84 */           dfh.a(-1.0D, 1.0D, -1.0D).a(0.0F, 1.0F).a(255, 255, 255, m).d();
/*  85 */           dfh.a(-1.0D, 1.0D, 1.0D).a(1.0F, 1.0F).a(255, 255, 255, m).d();
/*  86 */           dfh.a(-1.0D, -1.0D, 1.0D).a(1.0F, 0.0F).a(255, 255, 255, m).d();
/*     */         } 
/*  88 */         if (k == 4) {
/*  89 */           dfh.a(-1.0D, -1.0D, -1.0D).a(0.0F, 0.0F).a(255, 255, 255, m).d();
/*  90 */           dfh.a(-1.0D, -1.0D, 1.0D).a(0.0F, 1.0F).a(255, 255, 255, m).d();
/*  91 */           dfh.a(1.0D, -1.0D, 1.0D).a(1.0F, 1.0F).a(255, 255, 255, m).d();
/*  92 */           dfh.a(1.0D, -1.0D, -1.0D).a(1.0F, 0.0F).a(255, 255, 255, m).d();
/*     */         } 
/*  94 */         if (k == 5) {
/*  95 */           dfh.a(-1.0D, 1.0D, 1.0D).a(0.0F, 0.0F).a(255, 255, 255, m).d();
/*  96 */           dfh.a(-1.0D, 1.0D, -1.0D).a(0.0F, 1.0F).a(255, 255, 255, m).d();
/*  97 */           dfh.a(1.0D, 1.0D, -1.0D).a(1.0F, 1.0F).a(255, 255, 255, m).d();
/*  98 */           dfh.a(1.0D, 1.0D, 1.0D).a(1.0F, 0.0F).a(255, 255, 255, m).d();
/*     */         } 
/* 100 */         dfo.b();
/*     */       } 
/* 102 */       RenderSystem.popMatrix();
/* 103 */       RenderSystem.colorMask(true, true, true, false);
/*     */     } 
/* 105 */     RenderSystem.colorMask(true, true, true, true);
/*     */     
/* 107 */     RenderSystem.matrixMode(5889);
/* 108 */     RenderSystem.popMatrix();
/* 109 */     RenderSystem.matrixMode(5888);
/* 110 */     RenderSystem.popMatrix();
/* 111 */     RenderSystem.depthMask(true);
/* 112 */     RenderSystem.enableCull();
/*     */     
/* 114 */     RenderSystem.enableDepthTest();
/*     */   }
/*     */   
/*     */   public CompletableFuture<Void> a(ekd ☃, Executor executor) {
/* 118 */     CompletableFuture[] arrayOfCompletableFuture = new CompletableFuture[6];
/* 119 */     for (int i = 0; i < arrayOfCompletableFuture.length; i++) {
/* 120 */       arrayOfCompletableFuture[i] = ☃.a(this.a[i], executor);
/*     */     }
/* 122 */     return CompletableFuture.allOf((CompletableFuture<?>[])arrayOfCompletableFuture);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dzu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */