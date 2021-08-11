/*     */ import com.google.common.hash.Hashing;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.net.UnknownHostException;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.Validate;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class d
/*     */   extends dre.a
/*     */ {
/*     */   private final drc b;
/*     */   private final djz c;
/*     */   private final dwz d;
/*     */   private final vk e;
/*     */   private String f;
/*     */   private ejs g;
/*     */   private long h;
/*     */   
/*     */   protected d(dre ☃, drc drc1, dwz dwz1) {
/* 222 */     this.b = drc1;
/* 223 */     this.d = dwz1;
/* 224 */     this.c = djz.C();
/* 225 */     this.e = new vk("servers/" + Hashing.sha1().hashUnencodedChars(dwz1.b) + "/icon");
/* 226 */     this.g = (ejs)this.c.M().b(this.e);
/*     */   } public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/*     */     int i6;
/*     */     List<nr> list1;
/*     */     nr nr2;
/* 231 */     if (!this.d.h) {
/* 232 */       this.d.h = true;
/* 233 */       this.d.e = -2L;
/* 234 */       this.d.d = oe.d;
/* 235 */       this.d.c = oe.d;
/*     */       
/* 237 */       dre.g().submit(() -> {
/*     */             try {
/*     */               this.b.k().a(this.d, ());
/* 240 */             } catch (UnknownHostException ☃) {
/*     */               this.d.e = -1L;
/*     */               this.d.d = dre.A();
/* 243 */             } catch (Exception ☃) {
/*     */               this.d.e = -1L;
/*     */               
/*     */               this.d.d = dre.B();
/*     */             } 
/*     */           });
/*     */     } 
/* 250 */     boolean bool1 = (this.d.f != w.a().getProtocolVersion());
/*     */     
/* 252 */     this.c.g.b(☃, this.d.a, (k + 32 + 3), (j + 1), 16777215);
/*     */     
/* 254 */     List<afa> list = this.c.g.b(this.d.d, m - 32 - 2);
/* 255 */     for (int i3 = 0; i3 < Math.min(list.size(), 2); i3++) {
/* 256 */       this.c.g.getClass(); this.c.g.b(☃, list.get(i3), (k + 32 + 3), (j + 12 + 9 * i3), 8421504);
/*     */     } 
/*     */     
/* 259 */     nr nr1 = bool1 ? this.d.g.e().a(k.m) : this.d.c;
/* 260 */     int i4 = this.c.g.a(nr1);
/* 261 */     this.c.g.b(☃, nr1, (k + m - i4 - 15 - 2), (j + 1), 8421504);
/*     */     
/* 263 */     int i5 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 268 */     if (bool1) {
/* 269 */       i6 = 5;
/* 270 */       nr2 = dre.t();
/* 271 */       list1 = this.d.i;
/* 272 */     } else if (this.d.h && this.d.e != -2L) {
/* 273 */       if (this.d.e < 0L) {
/* 274 */         i6 = 5;
/* 275 */       } else if (this.d.e < 150L) {
/* 276 */         i6 = 0;
/* 277 */       } else if (this.d.e < 300L) {
/* 278 */         i6 = 1;
/* 279 */       } else if (this.d.e < 600L) {
/* 280 */         i6 = 2;
/* 281 */       } else if (this.d.e < 1000L) {
/* 282 */         i6 = 3;
/*     */       } else {
/* 284 */         i6 = 4;
/*     */       } 
/*     */       
/* 287 */       if (this.d.e < 0L) {
/* 288 */         nr2 = dre.u();
/* 289 */         list1 = Collections.emptyList();
/*     */       } else {
/* 291 */         nr2 = new of("multiplayer.status.ping", new Object[] { Long.valueOf(this.d.e) });
/* 292 */         list1 = this.d.i;
/*     */       } 
/*     */     } else {
/* 295 */       i5 = 1;
/* 296 */       i6 = (int)(x.b() / 100L + (i * 2) & 0x7L);
/* 297 */       if (i6 > 4) {
/* 298 */         i6 = 8 - i6;
/*     */       }
/* 300 */       nr2 = dre.w();
/* 301 */       list1 = Collections.emptyList();
/*     */     } 
/*     */     
/* 304 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 305 */     this.c.M().a(dkw.h);
/* 306 */     dkw.a(☃, k + m - 15, j, (i5 * 10), (176 + i6 * 8), 10, 8, 256, 256);
/*     */     
/* 308 */     String str = this.d.c();
/* 309 */     if (!Objects.equals(str, this.f)) {
/* 310 */       if (a(str)) {
/* 311 */         this.f = str;
/*     */       } else {
/* 313 */         this.d.a((String)null);
/* 314 */         a();
/*     */       } 
/*     */     }
/*     */     
/* 318 */     if (this.g != null) {
/* 319 */       a(☃, k, j, this.e);
/*     */     } else {
/* 321 */       a(☃, k, j, dre.x());
/*     */     } 
/*     */     
/* 324 */     int i7 = i1 - k;
/* 325 */     int i8 = i2 - j;
/* 326 */     if (i7 >= m - 15 && i7 <= m - 5 && i8 >= 0 && i8 <= 8) {
/* 327 */       this.b.b(Collections.singletonList(nr2));
/* 328 */     } else if (i7 >= m - i4 - 15 - 2 && i7 <= m - 15 - 2 && i8 >= 0 && i8 <= 8) {
/* 329 */       this.b.b(list1);
/*     */     } 
/*     */     
/* 332 */     if (this.c.k.Y || bool) {
/* 333 */       this.c.M().a(dre.y());
/* 334 */       dkw.a(☃, k, j, k + 32, j + 32, -1601138544);
/* 335 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 336 */       int i9 = i1 - k;
/* 337 */       int i10 = i2 - j;
/*     */       
/* 339 */       if (c()) {
/* 340 */         if (i9 < 32 && i9 > 16) {
/* 341 */           dkw.a(☃, k, j, 0.0F, 32.0F, 32, 32, 256, 256);
/*     */         } else {
/* 343 */           dkw.a(☃, k, j, 0.0F, 0.0F, 32, 32, 256, 256);
/*     */         } 
/*     */       }
/* 346 */       if (i > 0) {
/* 347 */         if (i9 < 16 && i10 < 16) {
/* 348 */           dkw.a(☃, k, j, 96.0F, 32.0F, 32, 32, 256, 256);
/*     */         } else {
/* 350 */           dkw.a(☃, k, j, 96.0F, 0.0F, 32, 32, 256, 256);
/*     */         } 
/*     */       }
/* 353 */       if (i < this.b.l().c() - 1) {
/* 354 */         if (i9 < 16 && i10 > 16) {
/* 355 */           dkw.a(☃, k, j, 64.0F, 32.0F, 32, 32, 256, 256);
/*     */         } else {
/* 357 */           dkw.a(☃, k, j, 64.0F, 0.0F, 32, 32, 256, 256);
/*     */         } 
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a() {
/* 364 */     this.b.l().b();
/*     */   }
/*     */   
/*     */   protected void a(dfm ☃, int i, int j, vk vk1) {
/* 368 */     this.c.M().a(vk1);
/* 369 */     RenderSystem.enableBlend();
/* 370 */     dkw.a(☃, i, j, 0.0F, 0.0F, 32, 32, 32, 32);
/* 371 */     RenderSystem.disableBlend();
/*     */   }
/*     */   
/*     */   private boolean c() {
/* 375 */     return true;
/*     */   }
/*     */   
/*     */   private boolean a(@Nullable String ☃) {
/* 379 */     if (☃ == null) {
/* 380 */       this.c.M().c(this.e);
/* 381 */       if (this.g != null && this.g.e() != null) {
/* 382 */         this.g.e().close();
/*     */       }
/* 384 */       this.g = null;
/*     */     } else {
/*     */       try {
/* 387 */         det det = det.a(☃);
/* 388 */         Validate.validState((det.a() == 64), "Must be 64 pixels wide", new Object[0]);
/* 389 */         Validate.validState((det.b() == 64), "Must be 64 pixels high", new Object[0]);
/* 390 */         if (this.g == null) {
/* 391 */           this.g = new ejs(det);
/*     */         } else {
/* 393 */           this.g.a(det);
/* 394 */           this.g.a();
/*     */         } 
/* 396 */         this.c.M().a(this.e, this.g);
/* 397 */       } catch (Throwable throwable) {
/* 398 */         dre.z().error("Invalid icon for server {} ({})", this.d.a, this.d.b, throwable);
/* 399 */         return false;
/*     */       } 
/*     */     } 
/* 402 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 407 */     if (dot.y()) {
/*     */       
/* 409 */       dre dre1 = this.b.a;
/* 410 */       int k = dre1.au_().indexOf(this);
/*     */       
/* 412 */       if ((☃ == 264 && k < this.b.l().c() - 1) || (☃ == 265 && k > 0)) {
/*     */ 
/*     */         
/* 415 */         a(k, (☃ == 264) ? (k + 1) : (k - 1));
/* 416 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/* 420 */     return super.a(☃, i, j);
/*     */   }
/*     */   
/*     */   private void a(int ☃, int i) {
/* 424 */     this.b.l().a(☃, i);
/* 425 */     this.b.a.a(this.b.l());
/*     */     
/* 427 */     dre.a a1 = this.b.a.au_().get(i);
/* 428 */     this.b.a.a(a1);
/* 429 */     dre.a(this.a, a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/* 434 */     double d2 = ☃ - this.a.q();
/* 435 */     double d3 = d1 - dre.a(this.a, this.a.au_().indexOf(this));
/*     */     
/* 437 */     if (d2 <= 32.0D) {
/* 438 */       if (d2 < 32.0D && d2 > 16.0D && c()) {
/*     */         
/* 440 */         this.b.a(this);
/* 441 */         this.b.h();
/* 442 */         return true;
/*     */       } 
/*     */       
/* 445 */       int j = this.b.a.au_().indexOf(this);
/*     */       
/* 447 */       if (d2 < 16.0D && d3 < 16.0D && j > 0) {
/* 448 */         a(j, j - 1);
/* 449 */         return true;
/*     */       } 
/*     */ 
/*     */       
/* 453 */       if (d2 < 16.0D && d3 > 16.0D && j < this.b.l().c() - 1) {
/* 454 */         a(j, j + 1);
/* 455 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/* 459 */     this.b.a(this);
/* 460 */     if (x.b() - this.h < 250L) {
/* 461 */       this.b.h();
/*     */     }
/*     */     
/* 464 */     this.h = x.b();
/*     */     
/* 466 */     return false;
/*     */   }
/*     */   
/*     */   public dwz b() {
/* 470 */     return this.d;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dre$d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */