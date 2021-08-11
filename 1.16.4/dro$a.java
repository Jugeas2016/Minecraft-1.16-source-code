/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Iterator;
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
/*     */ class a
/*     */   extends dlh
/*     */   implements uz<bon>
/*     */ {
/*     */   private final boq<?> c;
/*     */   private final boolean d;
/* 227 */   protected final List<a> a = Lists.newArrayList();
/*     */   
/*     */   public a(dro paramdro, int ☃, int i, boq<?> boq1, boolean bool) {
/* 230 */     super(☃, i, 200, 20, oe.d);
/* 231 */     this.j = 24;
/* 232 */     this.k = 24;
/* 233 */     this.c = boq1;
/* 234 */     this.d = bool;
/*     */     
/* 236 */     a(boq1);
/*     */   }
/*     */   
/*     */   protected void a(boq<?> ☃) {
/* 240 */     a(3, 3, -1, ☃, ☃.a().iterator(), 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(Iterator<bon> ☃, int i, int j, int k, int m) {
/* 245 */     bmb[] arrayOfBmb = ((bon)☃.next()).a();
/* 246 */     if (arrayOfBmb.length != 0) {
/* 247 */       this.a.add(new a(this, 3 + m * 7, 3 + k * 7, arrayOfBmb));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(dfm ☃, int i, int j, float f) {
/* 253 */     RenderSystem.enableAlphaTest();
/* 254 */     dro.a(this.b).M().a(dro.d());
/*     */     
/* 256 */     int k = 152;
/* 257 */     if (!this.d) {
/* 258 */       k += 26;
/*     */     }
/* 260 */     int m = dro.b(this.b) ? 130 : 78;
/* 261 */     if (g()) {
/* 262 */       m += 26;
/*     */     }
/* 264 */     b(☃, this.l, this.m, k, m, this.j, this.k);
/*     */     
/* 266 */     for (a a1 : this.a) {
/* 267 */       RenderSystem.pushMatrix();
/* 268 */       float f1 = 0.42F;
/* 269 */       int n = (int)((this.l + a1.b) / 0.42F - 3.0F);
/* 270 */       int i1 = (int)((this.m + a1.c) / 0.42F - 3.0F);
/* 271 */       RenderSystem.scalef(0.42F, 0.42F, 1.0F);
/* 272 */       dro.a(this.b).ad().b(a1.a[afm.d(dro.c(this.b) / 30.0F) % a1.a.length], n, i1);
/* 273 */       RenderSystem.popMatrix();
/*     */     } 
/*     */     
/* 276 */     RenderSystem.disableAlphaTest();
/*     */   }
/*     */   
/*     */   public class a {
/*     */     public final bmb[] a;
/*     */     public final int b;
/*     */     public final int c;
/*     */     
/*     */     public a(dro.a ☃, int i, int j, bmb[] arrayOfBmb) {
/* 285 */       this.b = i;
/* 286 */       this.c = j;
/* 287 */       this.a = arrayOfBmb;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dro$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */