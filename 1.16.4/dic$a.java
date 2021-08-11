/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
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
/*     */ class a
/*     */   extends dlv.a<dic.a>
/*     */ {
/*     */   private final dgk b;
/*     */   private final List<dhn> c;
/*     */   
/*     */   class a
/*     */     extends dhn
/*     */   {
/*     */     a(dic.a ☃) {
/* 257 */       super(15, 15, 215, 5);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(dfm ☃, int i, int j, boolean bool) {
/* 262 */       dic.f(this.e.a).M().a(dic.c());
/* 263 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 264 */       float f = bool ? 19.0F : 0.0F;
/* 265 */       dkw.a(☃, i, j, f, 0.0F, 18, 18, 37, 18);
/*     */       
/* 267 */       if (bool) {
/* 268 */         dic.a(this.e.a, dic.f());
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(int ☃) {
/* 274 */       dic.c(this.e.a, ☃);
/*     */     }
/*     */   }
/*     */   
/*     */   class b extends dhn {
/*     */     b(dic.a ☃) {
/* 280 */       super(15, 15, 235, 5);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(dfm ☃, int i, int j, boolean bool) {
/* 285 */       dic.g(this.e.a).M().a(dic.g());
/* 286 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 287 */       float f = bool ? 19.0F : 0.0F;
/* 288 */       dkw.a(☃, i, j, f, 0.0F, 18, 18, 37, 18);
/*     */       
/* 290 */       if (bool) {
/* 291 */         dic.a(this.e.a, dic.h());
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(int ☃) {
/* 297 */       dic.d(this.e.a, ☃);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   a(dic paramdic, dgk ☃) {
/* 307 */     this.b = ☃;
/* 308 */     this.c = Arrays.asList(new dhn[] { new a(this), new b(this) });
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 313 */     a(☃, this.b, k, j, i1, i2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/* 318 */     dhn.a(dic.b(this.a), this, this.c, i, ☃, d1);
/* 319 */     return true;
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, dgk dgk1, int i, int j, int k, int m) {
/* 323 */     dic.h(this.a).b(☃, dgk1.b, (i + 38), (j + 1), 16777215);
/* 324 */     dic.i(this.a).b(☃, dgk1.c, (i + 38), (j + 12), 7105644);
/* 325 */     dic.j(this.a).b(☃, dis.a(dgk1.e), (i + 38), (j + 24), 7105644);
/*     */ 
/*     */     
/* 328 */     dhn.a(☃, this.c, dic.b(this.a), i, j, k, m);
/*     */     
/* 330 */     dir.a(dgk1.d, () -> {
/*     */           RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */           dkw.a(☃, i, j, 32, 32, 8.0F, 8.0F, 8, 8, 64, 64);
/*     */           dkw.a(☃, i, j, 32, 32, 40.0F, 8.0F, 8, 8, 64, 64);
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dic$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */