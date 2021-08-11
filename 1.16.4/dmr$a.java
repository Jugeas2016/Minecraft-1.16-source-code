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
/*     */ class a<T extends dmq>
/*     */ {
/*     */   private final T b;
/*  76 */   private long c = -1L;
/*  77 */   private long d = -1L;
/*  78 */   private dmq.a e = dmq.a.a;
/*     */   
/*     */   private a(dmr paramdmr, T ☃) {
/*  81 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public T a() {
/*  85 */     return this.b;
/*     */   }
/*     */   
/*     */   private float a(long ☃) {
/*  89 */     float f = afm.a((float)(☃ - this.c) / 600.0F, 0.0F, 1.0F);
/*  90 */     f *= f;
/*  91 */     if (this.e == dmq.a.b) {
/*  92 */       return 1.0F - f;
/*     */     }
/*  94 */     return f;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, dfm dfm1) {
/*  99 */     long l = x.b();
/*     */     
/* 101 */     if (this.c == -1L) {
/* 102 */       this.c = l;
/* 103 */       this.e.a(dmr.a(this.a).W());
/*     */     } 
/*     */     
/* 106 */     if (this.e == dmq.a.a && l - this.c <= 600L) {
/* 107 */       this.d = l;
/*     */     }
/*     */     
/* 110 */     RenderSystem.pushMatrix();
/* 111 */     RenderSystem.translatef(☃ - this.b.a() * a(l), (i * this.b.d()), (800 + i));
/* 112 */     dmq.a a1 = this.b.a(dfm1, this.a, l - this.d);
/* 113 */     RenderSystem.popMatrix();
/*     */     
/* 115 */     if (a1 != this.e) {
/* 116 */       this.c = l - (int)((1.0F - a(l)) * 600.0F);
/* 117 */       this.e = a1;
/* 118 */       this.e.a(dmr.a(this.a).W());
/*     */     } 
/*     */     
/* 121 */     return (this.e == dmq.a.b && l - this.c > 600L);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dmr$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */