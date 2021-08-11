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
/*     */ public class dpx
/*     */   extends dpp<bii>
/*     */ {
/*  21 */   private static final vk A = new vk("textures/gui/container/cartography_table.png");
/*     */   
/*     */   public dpx(bii ☃, bfv bfv1, nr nr1) {
/*  24 */     super(☃, bfv1, nr1);
/*  25 */     this.q -= 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/*  30 */     super.a(☃, i, j, f);
/*  31 */     a(☃, i, j);
/*     */   }
/*     */   
/*     */   protected void a(dfm ☃, float f, int i, int j) {
/*     */     cxx cxx;
/*  36 */     a(☃);
/*     */     
/*  38 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  39 */     this.i.M().a(A);
/*  40 */     int k = this.w;
/*  41 */     int m = this.x;
/*  42 */     b(☃, k, m, 0, 0, this.b, this.c);
/*     */     
/*  44 */     blx blx = this.t.a(1).e().b();
/*  45 */     boolean bool1 = (blx == bmd.pc);
/*  46 */     boolean bool2 = (blx == bmd.mb);
/*  47 */     boolean bool3 = (blx == bmd.dP);
/*     */     
/*  49 */     bmb bmb = this.t.a(0).e();
/*     */ 
/*     */     
/*  52 */     boolean bool4 = false;
/*  53 */     if (bmb.b() == bmd.nf) {
/*  54 */       cxx = bmh.a(bmb, this.i.r);
/*  55 */       if (cxx != null) {
/*  56 */         if (cxx.h) {
/*  57 */           bool4 = true;
/*     */           
/*  59 */           if (bool2 || bool3) {
/*  60 */             b(☃, k + 35, m + 31, this.b + 50, 132, 28, 21);
/*     */           }
/*     */         } 
/*  63 */         if (bool2 && cxx.f >= 4) {
/*  64 */           bool4 = true;
/*  65 */           b(☃, k + 35, m + 31, this.b + 50, 132, 28, 21);
/*     */         } 
/*     */       } 
/*     */     } else {
/*  69 */       cxx = null;
/*     */     } 
/*     */     
/*  72 */     a(☃, cxx, bool1, bool2, bool3, bool4);
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, @Nullable cxx cxx1, boolean bool1, boolean bool2, boolean bool3, boolean bool4) {
/*  76 */     int i = this.w;
/*  77 */     int j = this.x;
/*     */     
/*  79 */     if (bool2 && !bool4) {
/*  80 */       b(☃, i + 67, j + 13, this.b, 66, 66, 66);
/*  81 */       a(cxx1, i + 85, j + 31, 0.226F);
/*  82 */     } else if (bool1) {
/*  83 */       b(☃, i + 67 + 16, j + 13, this.b, 132, 50, 66);
/*  84 */       a(cxx1, i + 86, j + 16, 0.34F);
/*     */       
/*  86 */       this.i.M().a(A);
/*  87 */       RenderSystem.pushMatrix();
/*     */       
/*  89 */       RenderSystem.translatef(0.0F, 0.0F, 1.0F);
/*  90 */       b(☃, i + 67, j + 13 + 16, this.b, 132, 50, 66);
/*  91 */       a(cxx1, i + 70, j + 32, 0.34F);
/*     */       
/*  93 */       RenderSystem.popMatrix();
/*  94 */     } else if (bool3) {
/*  95 */       b(☃, i + 67, j + 13, this.b, 0, 66, 66);
/*  96 */       a(cxx1, i + 71, j + 17, 0.45F);
/*     */       
/*  98 */       this.i.M().a(A);
/*  99 */       RenderSystem.pushMatrix();
/*     */       
/* 101 */       RenderSystem.translatef(0.0F, 0.0F, 1.0F);
/* 102 */       b(☃, i + 66, j + 12, 0, this.c, 66, 66);
/*     */       
/* 104 */       RenderSystem.popMatrix();
/*     */     } else {
/* 106 */       b(☃, i + 67, j + 13, this.b, 0, 66, 66);
/* 107 */       a(cxx1, i + 71, j + 17, 0.45F);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(@Nullable cxx ☃, int i, int j, float f) {
/* 112 */     if (☃ != null) {
/* 113 */       RenderSystem.pushMatrix();
/*     */       
/* 115 */       RenderSystem.translatef(i, j, 1.0F);
/* 116 */       RenderSystem.scalef(f, f, 1.0F);
/* 117 */       eag.a a = eag.a(dfo.a().c());
/* 118 */       this.i.h.h().a(new dfm(), a, ☃, true, 15728880);
/* 119 */       a.a();
/*     */       
/* 121 */       RenderSystem.popMatrix();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dpx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */