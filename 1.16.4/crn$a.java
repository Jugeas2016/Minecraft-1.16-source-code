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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */   extends crx
/*     */ {
/*     */   private final crm.b d;
/*     */   private final float e;
/*     */   private final vk f;
/*     */   private final bzm g;
/*     */   private final boolean h;
/*     */   
/*     */   public a(csw ☃, vk vk1, fx fx1, bzm bzm1, float f, crm.b b1, boolean bool) {
/* 199 */     super(clb.H, 0);
/*     */     
/* 201 */     this.f = vk1;
/* 202 */     this.c = fx1;
/* 203 */     this.g = bzm1;
/* 204 */     this.e = f;
/* 205 */     this.d = b1;
/* 206 */     this.h = bool;
/*     */     
/* 208 */     a(☃);
/*     */   }
/*     */   
/*     */   public a(csw ☃, md md1) {
/* 212 */     super(clb.H, md1);
/* 213 */     this.f = new vk(md1.l("Template"));
/* 214 */     this.g = bzm.valueOf(md1.l("Rot"));
/* 215 */     this.e = md1.j("Integrity");
/* 216 */     this.d = crm.b.valueOf(md1.l("BiomeType"));
/* 217 */     this.h = md1.q("IsLarge");
/* 218 */     a(☃);
/*     */   }
/*     */   
/*     */   private void a(csw ☃) {
/* 222 */     ctb ctb = ☃.a(this.f);
/* 223 */     csx csx = (new csx()).a(this.g).a(byg.a).a(cse.d);
/* 224 */     a(ctb, this.c, csx);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/* 229 */     super.a(☃);
/* 230 */     ☃.a("Template", this.f.toString());
/* 231 */     ☃.a("Rot", this.g.name());
/* 232 */     ☃.a("Integrity", this.e);
/* 233 */     ☃.a("BiomeType", this.d.toString());
/* 234 */     ☃.a("IsLarge", this.h);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(String ☃, fx fx1, bsk bsk1, Random random, cra cra1) {
/* 239 */     if ("chest".equals(☃)) {
/* 240 */       bsk1.a(fx1, bup.bR.n().a(bve.d, Boolean.valueOf(bsk1.b(fx1).a(aef.b))), 2);
/*     */       
/* 242 */       ccj ccj = bsk1.c(fx1);
/* 243 */       if (ccj instanceof ccn) {
/* 244 */         ((ccn)ccj).a(this.h ? cyq.F : cyq.E, random.nextLong());
/*     */       }
/*     */     }
/* 247 */     else if ("drowned".equals(☃)) {
/* 248 */       bde bde = aqe.q.a(bsk1.E());
/* 249 */       bde.es();
/* 250 */       bde.a(fx1, 0.0F, 0.0F);
/* 251 */       bde.a(bsk1, bsk1.d(fx1), aqp.d, (arc)null, (md)null);
/* 252 */       bsk1.l(bde);
/* 253 */       if (fx1.v() > bsk1.t_()) {
/* 254 */         bsk1.a(fx1, bup.a.n(), 2);
/*     */       } else {
/* 256 */         bsk1.a(fx1, bup.A.n(), 2);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 263 */     this.b.b().a(new csg(this.e)).a(cse.d);
/* 264 */     int i = ☃.a(chn.a.c, this.c.u(), this.c.w());
/* 265 */     this.c = new fx(this.c.u(), i, this.c.w());
/* 266 */     fx fx2 = ctb.a(new fx(this.a.a().u() - 1, 0, this.a.a().w() - 1), byg.a, this.g, fx.b).a(this.c);
/* 267 */     this.c = new fx(this.c.u(), a(this.c, ☃, fx2), this.c.w());
/*     */     
/* 269 */     return super.a(☃, bsn1, cfy1, random, cra1, brd1, fx1);
/*     */   }
/*     */   
/*     */   private int a(fx ☃, brc brc1, fx fx1) {
/* 273 */     int i = ☃.v();
/* 274 */     int j = 512;
/* 275 */     int k = i - 1;
/* 276 */     int m = 0;
/* 277 */     for (fx fx2 : fx.a(☃, fx1)) {
/* 278 */       int i1 = fx2.u();
/* 279 */       int i2 = fx2.w();
/* 280 */       int i3 = ☃.v() - 1;
/* 281 */       fx.a a1 = new fx.a(i1, i3, i2);
/* 282 */       ceh ceh = brc1.d_(a1);
/* 283 */       cux cux = brc1.b(a1);
/* 284 */       while ((ceh.g() || cux.a(aef.b) || ceh.b().a(aed.U)) && i3 > 1) {
/* 285 */         i3--;
/* 286 */         a1.d(i1, i3, i2);
/* 287 */         ceh = brc1.d_(a1);
/* 288 */         cux = brc1.b(a1);
/*     */       } 
/*     */       
/* 291 */       j = Math.min(j, i3);
/* 292 */       if (i3 < k - 2) {
/* 293 */         m++;
/*     */       }
/*     */     } 
/*     */     
/* 297 */     int n = Math.abs(☃.u() - fx1.u());
/* 298 */     if (k - j > 2 && m > n - 2) {
/* 299 */       i = j + 1;
/*     */     }
/*     */     
/* 302 */     return i;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crn$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */