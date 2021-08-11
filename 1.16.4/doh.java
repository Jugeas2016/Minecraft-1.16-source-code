/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.util.Optional;
/*     */ import java.util.function.Consumer;
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
/*     */ public class doh
/*     */   extends don
/*     */ {
/*  25 */   private static final vk a = new vk("textures/gui/title/mojangstudios.png");
/*     */   
/*  27 */   private static final int b = aez.a.a(255, 239, 50, 61);
/*  28 */   private static final int c = b & 0xFFFFFF;
/*     */ 
/*     */   
/*     */   private final djz d;
/*     */ 
/*     */   
/*     */   private final ace e;
/*     */ 
/*     */   
/*     */   private final Consumer<Optional<Throwable>> i;
/*     */ 
/*     */   
/*     */   private final boolean j;
/*     */ 
/*     */   
/*     */   private float k;
/*     */   
/*  45 */   private long l = -1L;
/*  46 */   private long m = -1L;
/*     */   
/*     */   public doh(djz ☃, ace ace1, Consumer<Optional<Throwable>> consumer, boolean bool) {
/*  49 */     this.d = ☃;
/*  50 */     this.e = ace1;
/*  51 */     this.i = consumer;
/*  52 */     this.j = bool;
/*     */   }
/*     */   
/*     */   public static void a(djz ☃) {
/*  56 */     ☃.M().a(a, new a());
/*     */   }
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/*     */     float f3;
/*  61 */     int k = this.d.aD().o();
/*  62 */     int m = this.d.aD().p();
/*  63 */     long l = x.b();
/*     */     
/*  65 */     if (this.j && (this.e.c() || this.d.y != null) && this.m == -1L) {
/*  66 */       this.m = l;
/*     */     }
/*     */     
/*  69 */     float f1 = (this.l > -1L) ? ((float)(l - this.l) / 1000.0F) : -1.0F;
/*  70 */     float f2 = (this.m > -1L) ? ((float)(l - this.m) / 500.0F) : -1.0F;
/*     */ 
/*     */     
/*  73 */     if (f1 >= 1.0F) {
/*  74 */       if (this.d.y != null) {
/*  75 */         this.d.y.a(☃, 0, 0, f);
/*     */       }
/*  77 */       int i5 = afm.f((1.0F - afm.a(f1 - 1.0F, 0.0F, 1.0F)) * 255.0F);
/*  78 */       a(☃, 0, 0, k, m, c | i5 << 24);
/*  79 */       f3 = 1.0F - afm.a(f1 - 1.0F, 0.0F, 1.0F);
/*  80 */     } else if (this.j) {
/*  81 */       if (this.d.y != null && f2 < 1.0F) {
/*  82 */         this.d.y.a(☃, i, j, f);
/*     */       }
/*  84 */       int i5 = afm.f(afm.a(f2, 0.15D, 1.0D) * 255.0D);
/*  85 */       a(☃, 0, 0, k, m, c | i5 << 24);
/*  86 */       f3 = afm.a(f2, 0.0F, 1.0F);
/*     */     } else {
/*  88 */       a(☃, 0, 0, k, m, b);
/*  89 */       f3 = 1.0F;
/*     */     } 
/*     */     
/*  92 */     int n = (int)(this.d.aD().o() * 0.5D);
/*  93 */     int i1 = (int)(this.d.aD().p() * 0.5D);
/*     */     
/*  95 */     double d1 = Math.min(this.d.aD().o() * 0.75D, this.d.aD().p()) * 0.25D;
/*  96 */     int i2 = (int)(d1 * 0.5D);
/*  97 */     double d2 = d1 * 4.0D;
/*  98 */     int i3 = (int)(d2 * 0.5D);
/*     */     
/* 100 */     this.d.M().a(a);
/*     */ 
/*     */     
/* 103 */     RenderSystem.enableBlend();
/* 104 */     RenderSystem.blendEquation(32774);
/* 105 */     RenderSystem.blendFunc(770, 1);
/* 106 */     RenderSystem.alphaFunc(516, 0.0F);
/*     */     
/* 108 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, f3);
/* 109 */     a(☃, n - i3, i1 - i2, i3, (int)d1, -0.0625F, 0.0F, 120, 60, 120, 120);
/* 110 */     a(☃, n, i1 - i2, i3, (int)d1, 0.0625F, 60.0F, 120, 60, 120, 120);
/*     */     
/* 112 */     RenderSystem.defaultBlendFunc();
/* 113 */     RenderSystem.defaultAlphaFunc();
/* 114 */     RenderSystem.disableBlend();
/*     */     
/* 116 */     int i4 = (int)(this.d.aD().p() * 0.8325D);
/*     */     
/* 118 */     float f4 = this.e.b();
/* 119 */     this.k = afm.a(this.k * 0.95F + f4 * 0.050000012F, 0.0F, 1.0F);
/*     */     
/* 121 */     if (f1 < 1.0F) {
/* 122 */       a(☃, k / 2 - i3, i4 - 5, k / 2 + i3, i4 + 5, 1.0F - afm.a(f1, 0.0F, 1.0F));
/*     */     }
/*     */     
/* 125 */     if (f1 >= 2.0F) {
/* 126 */       this.d.a((don)null);
/*     */     }
/*     */     
/* 129 */     if (this.l == -1L && this.e.d() && (!this.j || f2 >= 2.0F)) {
/*     */       try {
/* 131 */         this.e.e();
/* 132 */         this.i.accept(Optional.empty());
/* 133 */       } catch (Throwable throwable) {
/* 134 */         this.i.accept(Optional.of(throwable));
/*     */       } 
/* 136 */       this.l = x.b();
/* 137 */       if (this.d.y != null)
/*     */       {
/* 139 */         this.d.y.b(this.d, this.d.aD().o(), this.d.aD().p());
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, int i, int j, int k, int m, float f) {
/* 145 */     int n = afm.f((k - i - 2) * this.k);
/* 146 */     int i1 = Math.round(f * 255.0F);
/* 147 */     int i2 = aez.a.a(i1, 255, 255, 255);
/*     */     
/* 149 */     a(☃, i + 1, j, k - 1, j + 1, i2);
/* 150 */     a(☃, i + 1, m, k - 1, m - 1, i2);
/* 151 */     a(☃, i, j, i + 1, m, i2);
/* 152 */     a(☃, k, j, k - 1, m, i2);
/*     */     
/* 154 */     a(☃, i + 2, j + 2, i + n, m - 2, i2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/* 159 */     return true;
/*     */   }
/*     */   
/*     */   static class a extends ejy {
/*     */     public a() {
/* 164 */       super(doh.b());
/*     */     }
/*     */ 
/*     */     
/*     */     protected ejy.a b(ach ☃) {
/* 169 */       djz djz = djz.C();
/* 170 */       abm abm = djz.P().a();
/* 171 */       try (InputStream ☃ = abm.a(abk.a, doh.b())) {
/* 172 */         return new ejy.a(new ell(true, true), det.a(inputStream));
/* 173 */       } catch (IOException iOException) {
/* 174 */         return new ejy.a(iOException);
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\doh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */