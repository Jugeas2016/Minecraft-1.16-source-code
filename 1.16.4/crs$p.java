/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ abstract class p
/*     */   extends cru
/*     */ {
/* 211 */   protected a d = a.a;
/*     */   
/*     */   protected p(clb ☃, int i) {
/* 214 */     super(☃, i);
/*     */   }
/*     */   
/*     */   public p(clb ☃, md md1) {
/* 218 */     super(☃, md1);
/* 219 */     this.d = a.valueOf(md1.l("EntryDoor"));
/*     */   }
/*     */   
/*     */   public enum a {
/* 223 */     a, b, c, d;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/* 228 */     ☃.a("EntryDoor", this.d.name());
/*     */   }
/*     */   
/*     */   protected void a(bsr ☃, Random random, cra cra1, a a1, int i, int j, int k) {
/* 232 */     switch (crs.null.a[a1.ordinal()]) {
/*     */       case 1:
/* 234 */         a(☃, cra1, i, j, k, i + 3 - 1, j + 3 - 1, k, m, m, false);
/*     */         break;
/*     */       case 2:
/* 237 */         a(☃, bup.du.n(), i, j, k, cra1);
/* 238 */         a(☃, bup.du.n(), i, j + 1, k, cra1);
/* 239 */         a(☃, bup.du.n(), i, j + 2, k, cra1);
/* 240 */         a(☃, bup.du.n(), i + 1, j + 2, k, cra1);
/* 241 */         a(☃, bup.du.n(), i + 2, j + 2, k, cra1);
/* 242 */         a(☃, bup.du.n(), i + 2, j + 1, k, cra1);
/* 243 */         a(☃, bup.du.n(), i + 2, j, k, cra1);
/* 244 */         a(☃, bup.cf.n(), i + 1, j, k, cra1);
/* 245 */         a(☃, bup.cf.n().a(bwb.e, cfd.a), i + 1, j + 1, k, cra1);
/*     */         break;
/*     */       case 3:
/* 248 */         a(☃, bup.lb.n(), i + 1, j, k, cra1);
/* 249 */         a(☃, bup.lb.n(), i + 1, j + 1, k, cra1);
/* 250 */         a(☃, bup.dH.n().a(bxq.d, Boolean.valueOf(true)), i, j, k, cra1);
/* 251 */         a(☃, bup.dH.n().a(bxq.d, Boolean.valueOf(true)), i, j + 1, k, cra1);
/* 252 */         a(☃, bup.dH.n().a(bxq.b, Boolean.valueOf(true)).a(bxq.d, Boolean.valueOf(true)), i, j + 2, k, cra1);
/* 253 */         a(☃, bup.dH.n().a(bxq.b, Boolean.valueOf(true)).a(bxq.d, Boolean.valueOf(true)), i + 1, j + 2, k, cra1);
/* 254 */         a(☃, bup.dH.n().a(bxq.b, Boolean.valueOf(true)).a(bxq.d, Boolean.valueOf(true)), i + 2, j + 2, k, cra1);
/* 255 */         a(☃, bup.dH.n().a(bxq.b, Boolean.valueOf(true)), i + 2, j + 1, k, cra1);
/* 256 */         a(☃, bup.dH.n().a(bxq.b, Boolean.valueOf(true)), i + 2, j, k, cra1);
/*     */         break;
/*     */       case 4:
/* 259 */         a(☃, bup.du.n(), i, j, k, cra1);
/* 260 */         a(☃, bup.du.n(), i, j + 1, k, cra1);
/* 261 */         a(☃, bup.du.n(), i, j + 2, k, cra1);
/* 262 */         a(☃, bup.du.n(), i + 1, j + 2, k, cra1);
/* 263 */         a(☃, bup.du.n(), i + 2, j + 2, k, cra1);
/* 264 */         a(☃, bup.du.n(), i + 2, j + 1, k, cra1);
/* 265 */         a(☃, bup.du.n(), i + 2, j, k, cra1);
/* 266 */         a(☃, bup.cr.n(), i + 1, j, k, cra1);
/* 267 */         a(☃, bup.cr.n().a(bwb.e, cfd.a), i + 1, j + 1, k, cra1);
/* 268 */         a(☃, bup.cB.n().a(buv.aq, gc.c), i + 2, j + 1, k + 1, cra1);
/* 269 */         a(☃, bup.cB.n().a(buv.aq, gc.d), i + 2, j + 1, k - 1, cra1);
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   protected a a(Random ☃) {
/* 275 */     int i = ☃.nextInt(5);
/* 276 */     switch (i)
/*     */     
/*     */     { 
/*     */       default:
/* 280 */         return a.a;
/*     */       case 2:
/* 282 */         return a.b;
/*     */       case 3:
/* 284 */         return a.c;
/*     */       case 4:
/* 286 */         break; }  return a.d;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected cru a(crs.m ☃, List<cru> list, Random random, int i, int j) {
/* 292 */     gc gc = i();
/* 293 */     if (gc != null) {
/* 294 */       switch (crs.null.b[gc.ordinal()]) {
/*     */         case 1:
/* 296 */           return crs.a(☃, list, random, this.n.a + i, this.n.b + j, this.n.c - 1, gc, h());
/*     */         case 2:
/* 298 */           return crs.a(☃, list, random, this.n.a + i, this.n.b + j, this.n.f + 1, gc, h());
/*     */         case 3:
/* 300 */           return crs.a(☃, list, random, this.n.a - 1, this.n.b + j, this.n.c + i, gc, h());
/*     */         case 4:
/* 302 */           return crs.a(☃, list, random, this.n.d + 1, this.n.b + j, this.n.c + i, gc, h());
/*     */       } 
/*     */     }
/* 305 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected cru b(crs.m ☃, List<cru> list, Random random, int i, int j) {
/* 310 */     gc gc = i();
/* 311 */     if (gc != null) {
/* 312 */       switch (crs.null.b[gc.ordinal()]) {
/*     */         case 1:
/* 314 */           return crs.a(☃, list, random, this.n.a - 1, this.n.b + i, this.n.c + j, gc.e, h());
/*     */         case 2:
/* 316 */           return crs.a(☃, list, random, this.n.a - 1, this.n.b + i, this.n.c + j, gc.e, h());
/*     */         case 3:
/* 318 */           return crs.a(☃, list, random, this.n.a + j, this.n.b + i, this.n.c - 1, gc.c, h());
/*     */         case 4:
/* 320 */           return crs.a(☃, list, random, this.n.a + j, this.n.b + i, this.n.c - 1, gc.c, h());
/*     */       } 
/*     */     }
/* 323 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected cru c(crs.m ☃, List<cru> list, Random random, int i, int j) {
/* 328 */     gc gc = i();
/* 329 */     if (gc != null) {
/* 330 */       switch (crs.null.b[gc.ordinal()]) {
/*     */         case 1:
/* 332 */           return crs.a(☃, list, random, this.n.d + 1, this.n.b + i, this.n.c + j, gc.f, h());
/*     */         case 2:
/* 334 */           return crs.a(☃, list, random, this.n.d + 1, this.n.b + i, this.n.c + j, gc.f, h());
/*     */         case 3:
/* 336 */           return crs.a(☃, list, random, this.n.a + j, this.n.b + i, this.n.f + 1, gc.d, h());
/*     */         case 4:
/* 338 */           return crs.a(☃, list, random, this.n.a + j, this.n.b + i, this.n.f + 1, gc.d, h());
/*     */       } 
/*     */     }
/* 341 */     return null;
/*     */   }
/*     */   
/*     */   protected static boolean a(cra ☃) {
/* 345 */     return (☃ != null && ☃.b > 10);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crs$p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */