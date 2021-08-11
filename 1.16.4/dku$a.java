/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
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
/*     */ class a
/*     */   implements afb
/*     */ {
/*     */   final eag a;
/*     */   private final boolean c;
/*     */   private final float d;
/*     */   private final float e;
/*     */   private final float f;
/*     */   private final float g;
/*     */   private final float h;
/*     */   private final b i;
/*     */   private final boolean j;
/*     */   private final int k;
/*     */   private float l;
/*     */   private float m;
/*     */   @Nullable
/*     */   private List<dmz.a> n;
/*     */   
/*     */   private void a(dmz.a ☃) {
/* 195 */     if (this.n == null) {
/* 196 */       this.n = Lists.newArrayList();
/*     */     }
/* 198 */     this.n.add(☃);
/*     */   }
/*     */   
/*     */   public a(dku paramdku, eag ☃, float f1, float f2, int i, boolean bool1, b b1, boolean bool2, int j) {
/* 202 */     this.a = ☃;
/* 203 */     this.l = f1;
/* 204 */     this.m = f2;
/* 205 */     this.c = bool1;
/* 206 */     this.d = bool1 ? 0.25F : 1.0F;
/* 207 */     this.e = (i >> 16 & 0xFF) / 255.0F * this.d;
/* 208 */     this.f = (i >> 8 & 0xFF) / 255.0F * this.d;
/* 209 */     this.g = (i & 0xFF) / 255.0F * this.d;
/* 210 */     this.h = (i >> 24 & 0xFF) / 255.0F;
/* 211 */     this.i = b1;
/* 212 */     this.j = bool2;
/* 213 */     this.k = j;
/*     */   }
/*     */   
/*     */   public boolean accept(int ☃, ob ob1, int i) {
/*     */     float f1, f2, f3;
/* 218 */     dmw dmw = dku.a(this.b, ob1.k());
/* 219 */     dea dea = dmw.a(i);
/* 220 */     dmz dmz = (ob1.f() && i != 32) ? dmw.a(dea) : dmw.b(i);
/*     */     
/* 222 */     boolean bool = ob1.b();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 227 */     float f4 = this.h;
/*     */     
/* 229 */     od od = ob1.a();
/* 230 */     if (od != null) {
/* 231 */       int j = od.a();
/* 232 */       f1 = (j >> 16 & 0xFF) / 255.0F * this.d;
/* 233 */       f2 = (j >> 8 & 0xFF) / 255.0F * this.d;
/* 234 */       f3 = (j & 0xFF) / 255.0F * this.d;
/*     */     } else {
/* 236 */       f1 = this.e;
/* 237 */       f2 = this.f;
/* 238 */       f3 = this.g;
/*     */     } 
/*     */     
/* 241 */     if (!(dmz instanceof dna)) {
/* 242 */       float f7 = bool ? dea.b() : 0.0F;
/* 243 */       float f8 = this.c ? dea.c() : 0.0F;
/*     */       
/* 245 */       dfq dfq = this.a.getBuffer(dmz.a(this.j));
/* 246 */       dku.a(this.b, dmz, bool, ob1.c(), f7, this.l + f8, this.m + f8, this.i, dfq, f1, f2, f3, f4, this.k);
/*     */     } 
/*     */     
/* 249 */     float f5 = dea.a(bool);
/*     */     
/* 251 */     float f6 = this.c ? 1.0F : 0.0F;
/* 252 */     if (ob1.d()) {
/* 253 */       a(new dmz.a(this.l + f6 - 1.0F, this.m + f6 + 4.5F, this.l + f6 + f5, this.m + f6 + 4.5F - 1.0F, 0.01F, f1, f2, f3, f4));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 263 */     if (ob1.e()) {
/* 264 */       a(new dmz.a(this.l + f6 - 1.0F, this.m + f6 + 9.0F, this.l + f6 + f5, this.m + f6 + 9.0F - 1.0F, 0.01F, f1, f2, f3, f4));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 273 */     this.l += f5;
/* 274 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(int ☃, float f) {
/* 279 */     if (☃ != 0) {
/* 280 */       float f1 = (☃ >> 24 & 0xFF) / 255.0F;
/* 281 */       float f2 = (☃ >> 16 & 0xFF) / 255.0F;
/* 282 */       float f3 = (☃ >> 8 & 0xFF) / 255.0F;
/* 283 */       float f4 = (☃ & 0xFF) / 255.0F;
/* 284 */       a(new dmz.a(f - 1.0F, this.m + 9.0F, this.l + 1.0F, this.m - 1.0F, 0.01F, f2, f3, f4, f1));
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 293 */     if (this.n != null) {
/* 294 */       dmz dmz = dku.a(this.b, ob.b).a();
/* 295 */       dfq dfq = this.a.getBuffer(dmz.a(this.j));
/* 296 */       for (dmz.a a1 : this.n) {
/* 297 */         dmz.a(a1, this.i, dfq, this.k);
/*     */       }
/*     */     } 
/*     */     
/* 301 */     return this.l;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dku$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */