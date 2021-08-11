/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cxx
/*     */   extends cxs
/*     */ {
/*  36 */   private static final Logger k = LogManager.getLogger();
/*     */   public int a;
/*     */   public int b;
/*     */   public vj<brx> c;
/*     */   public boolean d;
/*     */   public boolean e;
/*     */   public byte f;
/*     */   
/*     */   public class a {
/*     */     public final bfw a;
/*     */     private boolean d = true;
/*  47 */     private int g = 127; private int e; private int f;
/*  48 */     private int h = 127;
/*     */     private int i;
/*     */     public int b;
/*     */     
/*     */     public a(cxx ☃, bfw bfw1) {
/*  53 */       this.a = bfw1;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public oj<?> a(bmb ☃) {
/*  58 */       if (this.d) {
/*  59 */         this.d = false;
/*  60 */         return new py(bmh.d(☃), this.c.f, this.c.d, this.c.h, this.c.j.values(), this.c.g, this.e, this.f, this.g + 1 - this.e, this.h + 1 - this.f);
/*  61 */       }  if (this.i++ % 5 == 0) {
/*  62 */         return new py(bmh.d(☃), this.c.f, this.c.d, this.c.h, this.c.j.values(), this.c.g, 0, 0, 0, 0);
/*     */       }
/*     */       
/*  65 */       return null;
/*     */     }
/*     */     
/*     */     public void a(int ☃, int i) {
/*  69 */       if (this.d) {
/*  70 */         this.e = Math.min(this.e, ☃);
/*  71 */         this.f = Math.min(this.f, i);
/*  72 */         this.g = Math.max(this.g, ☃);
/*  73 */         this.h = Math.max(this.h, i);
/*     */       } else {
/*  75 */         this.d = true;
/*  76 */         this.e = ☃;
/*  77 */         this.f = i;
/*  78 */         this.g = ☃;
/*  79 */         this.h = i;
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  91 */   public byte[] g = new byte[16384];
/*     */   public boolean h;
/*  93 */   public final List<a> i = Lists.newArrayList();
/*  94 */   private final Map<bfw, a> l = Maps.newHashMap();
/*  95 */   private final Map<String, cxt> m = Maps.newHashMap();
/*  96 */   public final Map<String, cxu> j = Maps.newLinkedHashMap();
/*  97 */   private final Map<String, cxv> n = Maps.newHashMap();
/*     */   
/*     */   public cxx(String ☃) {
/* 100 */     super(☃);
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i, int j, boolean bool1, boolean bool2, vj<brx> vj1) {
/* 104 */     this.f = (byte)j;
/* 105 */     a(☃, i, this.f);
/* 106 */     this.c = vj1;
/* 107 */     this.d = bool1;
/* 108 */     this.e = bool2;
/*     */     
/* 110 */     b();
/*     */   }
/*     */   
/*     */   public void a(double ☃, double d1, int i) {
/* 114 */     int j = 128 * (1 << i);
/*     */     
/* 116 */     int k = afm.c((☃ + 64.0D) / j);
/* 117 */     int m = afm.c((d1 + 64.0D) / j);
/*     */     
/* 119 */     this.a = k * j + j / 2 - 64;
/* 120 */     this.b = m * j + j / 2 - 64;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 125 */     this
/*     */       
/* 127 */       .c = (vj<brx>)chd.a(new Dynamic(mo.a, ☃.c("dimension"))).resultOrPartial(k::error).orElseThrow(() -> new IllegalArgumentException("Invalid map dimension: " + ☃.c("dimension")));
/*     */     
/* 129 */     this.a = ☃.h("xCenter");
/* 130 */     this.b = ☃.h("zCenter");
/* 131 */     this.f = (byte)afm.a(☃.f("scale"), 0, 4);
/*     */     
/* 133 */     this.d = (!☃.c("trackingPosition", 1) || ☃.q("trackingPosition"));
/* 134 */     this.e = ☃.q("unlimitedTracking");
/*     */     
/* 136 */     this.h = ☃.q("locked");
/*     */     
/* 138 */     this.g = ☃.m("colors");
/* 139 */     if (this.g.length != 16384) {
/* 140 */       this.g = new byte[16384];
/*     */     }
/*     */     
/* 143 */     mj mj1 = ☃.d("banners", 10);
/* 144 */     for (int i = 0; i < mj1.size(); i++) {
/* 145 */       cxt cxt = cxt.a(mj1.a(i));
/* 146 */       this.m.put(cxt.f(), cxt);
/* 147 */       a(cxt.c(), null, cxt.f(), cxt.a().u(), cxt.a().w(), 180.0D, cxt.d());
/*     */     } 
/*     */     
/* 150 */     mj mj2 = ☃.d("frames", 10);
/* 151 */     for (int j = 0; j < mj2.size(); j++) {
/* 152 */       cxv cxv = cxv.a(mj2.a(j));
/* 153 */       this.n.put(cxv.e(), cxv);
/* 154 */       a(cxu.a.b, null, "frame-" + cxv.d(), cxv.b().u(), cxv.b().w(), cxv.c(), null);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public md b(md ☃) {
/* 160 */     vk.a.encodeStart(mo.a, this.c.a()).resultOrPartial(k::error).ifPresent(mt1 -> ☃.a("dimension", mt1));
/* 161 */     ☃.b("xCenter", this.a);
/* 162 */     ☃.b("zCenter", this.b);
/* 163 */     ☃.a("scale", this.f);
/* 164 */     ☃.a("colors", this.g);
/* 165 */     ☃.a("trackingPosition", this.d);
/* 166 */     ☃.a("unlimitedTracking", this.e);
/* 167 */     ☃.a("locked", this.h);
/*     */     
/* 169 */     mj mj1 = new mj();
/* 170 */     for (cxt cxt : this.m.values()) {
/* 171 */       mj1.add(cxt.e());
/*     */     }
/* 173 */     ☃.a("banners", mj1);
/*     */     
/* 175 */     mj mj2 = new mj();
/* 176 */     for (cxv cxv : this.n.values()) {
/* 177 */       mj2.add(cxv.a());
/*     */     }
/* 179 */     ☃.a("frames", mj2);
/*     */     
/* 181 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(cxx ☃) {
/* 185 */     this.h = true;
/* 186 */     this.a = ☃.a;
/* 187 */     this.b = ☃.b;
/* 188 */     this.m.putAll(☃.m);
/* 189 */     this.j.putAll(☃.j);
/* 190 */     System.arraycopy(☃.g, 0, this.g, 0, ☃.g.length);
/* 191 */     b();
/*     */   }
/*     */   
/*     */   public void a(bfw ☃, bmb bmb1) {
/* 195 */     if (!this.l.containsKey(☃)) {
/* 196 */       a a = new a(this, ☃);
/* 197 */       this.l.put(☃, a);
/* 198 */       this.i.add(a);
/*     */     } 
/*     */     
/* 201 */     if (!☃.bm.h(bmb1)) {
/* 202 */       this.j.remove(☃.R().getString());
/*     */     }
/*     */     
/* 205 */     for (int i = 0; i < this.i.size(); i++) {
/* 206 */       a a = this.i.get(i);
/* 207 */       String str = a.a.R().getString();
/*     */       
/* 209 */       if (a.a.y || (!a.a.bm.h(bmb1) && !bmb1.y())) {
/* 210 */         this.l.remove(a.a);
/* 211 */         this.i.remove(a);
/* 212 */         this.j.remove(str);
/* 213 */       } else if (!bmb1.y() && a.a.l.Y() == this.c && this.d) {
/* 214 */         a(cxu.a.a, a.a.l, str, a.a.cD(), a.a.cH(), a.a.p, null);
/*     */       } 
/*     */     } 
/*     */     
/* 218 */     if (bmb1.y() && this.d) {
/* 219 */       bcp bcp = bmb1.z();
/* 220 */       fx fx = bcp.n();
/* 221 */       cxv cxv1 = this.n.get(cxv.a(fx));
/*     */ 
/*     */       
/* 224 */       if (cxv1 != null && bcp.Y() != cxv1.d() && this.n.containsKey(cxv1.e())) {
/* 225 */         this.j.remove("frame-" + cxv1.d());
/*     */       }
/* 227 */       cxv cxv2 = new cxv(fx, bcp.bZ().d() * 90, bcp.Y());
/* 228 */       a(cxu.a.b, ☃.l, "frame-" + bcp.Y(), fx.u(), fx.w(), (bcp.bZ().d() * 90), null);
/* 229 */       this.n.put(cxv2.e(), cxv2);
/*     */     } 
/*     */     
/* 232 */     md md = bmb1.o();
/* 233 */     if (md != null && md.c("Decorations", 9)) {
/* 234 */       mj mj = md.d("Decorations", 10);
/* 235 */       for (int j = 0; j < mj.size(); j++) {
/* 236 */         md md1 = mj.a(j);
/* 237 */         if (!this.j.containsKey(md1.l("id"))) {
/* 238 */           a(cxu.a.a(md1.f("type")), ☃.l, md1.l("id"), md1.k("x"), md1.k("z"), md1.k("rot"), null);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static void a(bmb ☃, fx fx1, String str, cxu.a a1) {
/*     */     mj mj;
/* 247 */     if (☃.n() && ☃.o().c("Decorations", 9)) {
/* 248 */       mj = ☃.o().d("Decorations", 10);
/*     */     } else {
/* 250 */       mj = new mj();
/* 251 */       ☃.a("Decorations", mj);
/*     */     } 
/* 253 */     md md = new md();
/* 254 */     md.a("type", a1.a());
/* 255 */     md.a("id", str);
/* 256 */     md.a("x", fx1.u());
/* 257 */     md.a("z", fx1.w());
/* 258 */     md.a("rot", 180.0D);
/* 259 */     mj.add(md);
/*     */ 
/*     */     
/* 262 */     if (a1.c()) {
/* 263 */       md md1 = ☃.a("display");
/* 264 */       md1.b("MapColor", a1.d());
/*     */     } 
/*     */   }
/*     */   private void a(cxu.a ☃, @Nullable bry bry1, String str, double d1, double d2, double d3, @Nullable nr nr1) {
/*     */     byte b3;
/* 269 */     int i = 1 << this.f;
/* 270 */     float f1 = (float)(d1 - this.a) / i;
/* 271 */     float f2 = (float)(d2 - this.b) / i;
/* 272 */     byte b1 = (byte)(int)((f1 * 2.0F) + 0.5D);
/* 273 */     byte b2 = (byte)(int)((f2 * 2.0F) + 0.5D);
/*     */     
/* 275 */     int j = 63;
/*     */     
/* 277 */     if (f1 >= -63.0F && f2 >= -63.0F && f1 <= 63.0F && f2 <= 63.0F) {
/* 278 */       d3 += (d3 < 0.0D) ? -8.0D : 8.0D;
/* 279 */       b3 = (byte)(int)(d3 * 16.0D / 360.0D);
/*     */       
/* 281 */       if (this.c == brx.h && bry1 != null) {
/* 282 */         int k = (int)(bry1.h().f() / 10L);
/* 283 */         b3 = (byte)(k * k * 34187121 + k * 121 >> 15 & 0xF);
/*     */       } 
/* 285 */     } else if (☃ == cxu.a.a) {
/* 286 */       int k = 320;
/* 287 */       if (Math.abs(f1) < 320.0F && Math.abs(f2) < 320.0F) {
/* 288 */         ☃ = cxu.a.g;
/* 289 */       } else if (this.e) {
/* 290 */         ☃ = cxu.a.h;
/*     */       } else {
/* 292 */         this.j.remove(str);
/*     */         return;
/*     */       } 
/* 295 */       b3 = 0;
/* 296 */       if (f1 <= -63.0F) {
/* 297 */         b1 = Byte.MIN_VALUE;
/*     */       }
/* 299 */       if (f2 <= -63.0F) {
/* 300 */         b2 = Byte.MIN_VALUE;
/*     */       }
/* 302 */       if (f1 >= 63.0F) {
/* 303 */         b1 = Byte.MAX_VALUE;
/*     */       }
/* 305 */       if (f2 >= 63.0F) {
/* 306 */         b2 = Byte.MAX_VALUE;
/*     */       }
/*     */     } else {
/* 309 */       this.j.remove(str);
/*     */       
/*     */       return;
/*     */     } 
/* 313 */     this.j.put(str, new cxu(☃, b1, b2, b3, nr1));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public oj<?> a(bmb ☃, brc brc1, bfw bfw1) {
/* 318 */     a a = this.l.get(bfw1);
/*     */     
/* 320 */     if (a == null) {
/* 321 */       return null;
/*     */     }
/*     */     
/* 324 */     return a.a(☃);
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i) {
/* 328 */     b();
/* 329 */     for (a a : this.i) {
/* 330 */       a.a(☃, i);
/*     */     }
/*     */   }
/*     */   
/*     */   public a a(bfw ☃) {
/* 335 */     a a = this.l.get(☃);
/*     */     
/* 337 */     if (a == null) {
/* 338 */       a = new a(this, ☃);
/* 339 */       this.l.put(☃, a);
/* 340 */       this.i.add(a);
/*     */     } 
/*     */     
/* 343 */     return a;
/*     */   }
/*     */   
/*     */   public void a(bry ☃, fx fx1) {
/* 347 */     double d1 = fx1.u() + 0.5D;
/* 348 */     double d2 = fx1.w() + 0.5D;
/* 349 */     int i = 1 << this.f;
/* 350 */     double d3 = (d1 - this.a) / i;
/* 351 */     double d4 = (d2 - this.b) / i;
/* 352 */     int j = 63;
/* 353 */     boolean bool = false;
/* 354 */     if (d3 >= -63.0D && d4 >= -63.0D && d3 <= 63.0D && d4 <= 63.0D) {
/* 355 */       cxt cxt = cxt.a(☃, fx1);
/* 356 */       if (cxt == null) {
/*     */         return;
/*     */       }
/*     */       
/* 360 */       boolean bool1 = true;
/* 361 */       if (this.m.containsKey(cxt.f()) && (
/* 362 */         (cxt)this.m.get(cxt.f())).equals(cxt)) {
/* 363 */         this.m.remove(cxt.f());
/* 364 */         this.j.remove(cxt.f());
/* 365 */         bool1 = false;
/* 366 */         bool = true;
/*     */       } 
/*     */ 
/*     */       
/* 370 */       if (bool1) {
/* 371 */         this.m.put(cxt.f(), cxt);
/* 372 */         a(cxt.c(), ☃, cxt.f(), d1, d2, 180.0D, cxt.d());
/* 373 */         bool = true;
/*     */       } 
/*     */       
/* 376 */       if (bool) {
/* 377 */         b();
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(brc ☃, int i, int j) {
/* 383 */     for (Iterator<cxt> iterator = this.m.values().iterator(); iterator.hasNext(); ) {
/* 384 */       cxt cxt = iterator.next();
/* 385 */       if (cxt.a().u() == i && cxt.a().w() == j) {
/* 386 */         cxt cxt1 = cxt.a(☃, cxt.a());
/* 387 */         if (!cxt.equals(cxt1)) {
/* 388 */           iterator.remove();
/* 389 */           this.j.remove(cxt.f());
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(fx ☃, int i) {
/* 400 */     this.j.remove("frame-" + i);
/* 401 */     this.n.remove(cxv.a(☃));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cxx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */