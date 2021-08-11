/*     */ import java.util.Random;
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
/*     */ 
/*     */ 
/*     */ public class efm
/*     */   extends eeu<bcv>
/*     */ {
/*     */   private final efo a;
/*  29 */   private final Random e = new Random();
/*     */   
/*     */   public efm(eet ☃, efo efo1) {
/*  32 */     super(☃);
/*  33 */     this.a = efo1;
/*     */     
/*  35 */     this.c = 0.15F;
/*  36 */     this.d = 0.75F;
/*     */   }
/*     */   
/*     */   private int a(bmb ☃) {
/*  40 */     int i = 1;
/*  41 */     if (☃.E() > 48) {
/*  42 */       i = 5;
/*  43 */     } else if (☃.E() > 32) {
/*  44 */       i = 4;
/*  45 */     } else if (☃.E() > 16) {
/*  46 */       i = 3;
/*  47 */     } else if (☃.E() > 1) {
/*  48 */       i = 2;
/*     */     } 
/*     */     
/*  51 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bcv ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/*  56 */     dfm1.a();
/*     */     
/*  58 */     bmb bmb = ☃.g();
/*     */     
/*  60 */     int j = bmb.a() ? 187 : (blx.a(bmb.b()) + bmb.g());
/*  61 */     this.e.setSeed(j);
/*     */     
/*  63 */     elo elo = this.a.a(bmb, ☃.l, (aqm)null);
/*     */     
/*  65 */     boolean bool = elo.b();
/*  66 */     int k = a(bmb);
/*     */ 
/*     */     
/*  69 */     float f3 = 0.25F;
/*  70 */     float f4 = afm.a((☃.k() + f2) / 10.0F + ☃.b) * 0.1F + 0.1F;
/*  71 */     float f5 = (elo.f().a(ebm.b.h)).d.b();
/*  72 */     dfm1.a(0.0D, (f4 + 0.25F * f5), 0.0D);
/*     */ 
/*     */     
/*  75 */     float f6 = ☃.a(f2);
/*  76 */     dfm1.a(g.d.c(f6));
/*     */     
/*  78 */     float f7 = (elo.f()).h.d.a();
/*  79 */     float f8 = (elo.f()).h.d.b();
/*  80 */     float f9 = (elo.f()).h.d.c();
/*     */     
/*  82 */     if (!bool) {
/*  83 */       float f10 = -0.0F * (k - 1) * 0.5F * f7;
/*  84 */       float f11 = -0.0F * (k - 1) * 0.5F * f8;
/*  85 */       float f12 = -0.09375F * (k - 1) * 0.5F * f9;
/*  86 */       dfm1.a(f10, f11, f12);
/*     */     } 
/*  88 */     for (int m = 0; m < k; m++) {
/*  89 */       dfm1.a();
/*  90 */       if (m > 0) {
/*  91 */         if (bool) {
/*  92 */           float f10 = (this.e.nextFloat() * 2.0F - 1.0F) * 0.15F;
/*  93 */           float f11 = (this.e.nextFloat() * 2.0F - 1.0F) * 0.15F;
/*  94 */           float f12 = (this.e.nextFloat() * 2.0F - 1.0F) * 0.15F;
/*  95 */           dfm1.a(f10, f11, f12);
/*     */         } else {
/*  97 */           float f10 = (this.e.nextFloat() * 2.0F - 1.0F) * 0.15F * 0.5F;
/*  98 */           float f11 = (this.e.nextFloat() * 2.0F - 1.0F) * 0.15F * 0.5F;
/*  99 */           dfm1.a(f10, f11, 0.0D);
/*     */         } 
/*     */       }
/* 102 */       this.a.a(bmb, ebm.b.h, false, dfm1, eag1, i, ejw.a, elo);
/*     */       
/* 104 */       dfm1.b();
/* 105 */       if (!bool) {
/* 106 */         dfm1.a((0.0F * f7), (0.0F * f8), (0.09375F * f9));
/*     */       }
/*     */     } 
/* 109 */     dfm1.b();
/*     */     
/* 111 */     super.a(☃, f1, f2, dfm1, eag1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public vk a(bcv ☃) {
/* 116 */     return ekb.d;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\efm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */