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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class b
/*     */   extends dlv<doq.b.a>
/*     */ {
/*     */   public b(doq paramdoq) {
/* 375 */     super(paramdoq.i, paramdoq.k, paramdoq.l, 80, paramdoq.l - 37, 24);
/* 376 */     for (int ☃ = 0; ☃ < doq.h().size(); ☃++) {
/* 377 */       b(new a(this));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(@Nullable a ☃) {
/* 383 */     super.a(☃);
/*     */     
/* 385 */     if (☃ != null) {
/* 386 */       dkz.b.a((new of("narrator.select", new Object[] { ((doq.a)doq.h().get(au_().indexOf(☃))).a() })).getString());
/*     */     }
/* 388 */     this.a.c((☃ != null));
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean b() {
/* 393 */     return (this.a.aw_() == this);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 398 */     if (super.a(☃, i, j)) {
/* 399 */       return true;
/*     */     }
/* 401 */     if ((☃ == 257 || ☃ == 335) && 
/* 402 */       h() != null) {
/* 403 */       a.a(h());
/*     */     }
/*     */     
/* 406 */     return false;
/*     */   }
/*     */   
/*     */   public class a
/*     */     extends dlv.a<a> {
/*     */     public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 412 */       doq.a a1 = doq.h().get(i);
/* 413 */       a(☃, k, j, a1.a);
/* 414 */       this.a.a.o.b(☃, a1.b, (k + 18 + 5), (j + 6), 16777215);
/*     */     }
/*     */     public a(doq.b ☃) {}
/*     */     
/*     */     public boolean a(double ☃, double d1, int i) {
/* 419 */       if (i == 0) {
/* 420 */         a();
/*     */       }
/* 422 */       return false;
/*     */     }
/*     */     
/*     */     private void a() {
/* 426 */       this.a.a(this);
/* 427 */       doq.a ☃ = doq.h().get(this.a.au_().indexOf(this));
/* 428 */       gm<bsv> gm = (doq.a(this.a.a)).a.c.b().b(gm.ay);
/* 429 */       doq.a(this.a.a, ☃.c.apply(gm));
/* 430 */       doq.c(this.a.a).a(doq.a(gm, doq.b(this.a.a)));
/* 431 */       doq.c(this.a.a).k();
/*     */     }
/*     */     
/*     */     private void a(dfm ☃, int i, int j, blx blx1) {
/* 435 */       a(☃, i + 1, j + 1);
/*     */       
/* 437 */       RenderSystem.enableRescaleNormal();
/*     */       
/* 439 */       this.a.a.j.a(new bmb(blx1), i + 2, j + 2);
/*     */       
/* 441 */       RenderSystem.disableRescaleNormal();
/*     */     }
/*     */     
/*     */     private void a(dfm ☃, int i, int j) {
/* 445 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 446 */       doq.b.a(this.a).M().a(dkw.g);
/*     */       
/* 448 */       dkw.a(☃, i, j, this.a.a.v(), 0.0F, 0.0F, 18, 18, 128, 128);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\doq$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */