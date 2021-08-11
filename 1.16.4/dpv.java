/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Collections;
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
/*     */ public class dpv
/*     */   extends dot
/*     */ {
/*     */   public static interface a
/*     */   {
/*     */     int a();
/*     */     
/*     */     nu a(int param1Int);
/*     */     
/*     */     default nu b(int ☃) {
/*  45 */       if (☃ >= 0 && ☃ < a()) {
/*  46 */         return a(☃);
/*     */       }
/*  48 */       return nu.c;
/*     */     }
/*     */     
/*     */     static a a(bmb ☃) {
/*  52 */       blx blx = ☃.b();
/*  53 */       if (blx == bmd.oU)
/*  54 */         return new dpv.c(☃); 
/*  55 */       if (blx == bmd.oT) {
/*  56 */         return new dpv.b(☃);
/*     */       }
/*  58 */       return dpv.a;
/*     */     }
/*     */   }
/*     */   
/*  62 */   public static final a a = new a()
/*     */     {
/*     */       public int a() {
/*  65 */         return 0;
/*     */       }
/*     */ 
/*     */       
/*     */       public nu a(int ☃) {
/*  70 */         return nu.c;
/*     */       }
/*     */     };
/*     */   
/*     */   public static class c implements a {
/*     */     private final List<String> a;
/*     */     
/*     */     public c(bmb ☃) {
/*  78 */       this.a = b(☃);
/*     */     }
/*     */     
/*     */     private static List<String> b(bmb ☃) {
/*  82 */       md md = ☃.o();
/*  83 */       if (md != null && bns.a(md)) {
/*  84 */         return dpv.a(md);
/*     */       }
/*     */       
/*  87 */       return (List<String>)ImmutableList.of(nr.a.a((new of("book.invalid.tag")).a(k.e)));
/*     */     }
/*     */ 
/*     */     
/*     */     public int a() {
/*  92 */       return this.a.size();
/*     */     }
/*     */ 
/*     */     
/*     */     public nu a(int ☃) {
/*  97 */       String str = this.a.get(☃);
/*     */       try {
/*  99 */         nu nu = nr.a.a(str);
/* 100 */         if (nu != null) {
/* 101 */           return nu;
/*     */         }
/* 103 */       } catch (Exception exception) {}
/*     */       
/* 105 */       return nu.b(str);
/*     */     }
/*     */   }
/*     */   
/*     */   public static class b implements a {
/*     */     private final List<String> a;
/*     */     
/*     */     public b(bmb ☃) {
/* 113 */       this.a = b(☃);
/*     */     }
/*     */     
/*     */     private static List<String> b(bmb ☃) {
/* 117 */       md md = ☃.o();
/* 118 */       return (md != null) ? dpv.a(md) : (List<String>)ImmutableList.of();
/*     */     }
/*     */ 
/*     */     
/*     */     public int a() {
/* 123 */       return this.a.size();
/*     */     }
/*     */ 
/*     */     
/*     */     public nu a(int ☃) {
/* 128 */       return nu.b(this.a.get(☃));
/*     */     }
/*     */   }
/*     */   
/* 132 */   public static final vk b = new vk("textures/gui/book.png");
/*     */ 
/*     */ 
/*     */   
/*     */   private a c;
/*     */ 
/*     */   
/*     */   private int p;
/*     */ 
/*     */   
/* 142 */   private List<afa> q = Collections.emptyList();
/* 143 */   private int r = -1;
/* 144 */   private nr s = oe.d;
/*     */   
/*     */   private dqt t;
/*     */   
/*     */   private dqt u;
/*     */   private final boolean v;
/*     */   
/*     */   public dpv(a ☃) {
/* 152 */     this(☃, true);
/*     */   }
/*     */   
/*     */   public dpv() {
/* 156 */     this(a, false);
/*     */   }
/*     */   
/*     */   private dpv(a ☃, boolean bool) {
/* 160 */     super(dkz.a);
/* 161 */     this.c = ☃;
/* 162 */     this.v = bool;
/*     */   }
/*     */   
/*     */   public void a(a ☃) {
/* 166 */     this.c = ☃;
/* 167 */     this.p = afm.a(this.p, 0, ☃.a());
/* 168 */     n();
/* 169 */     this.r = -1;
/*     */   }
/*     */   
/*     */   public boolean a(int ☃) {
/* 173 */     int i = afm.a(☃, 0, this.c.a() - 1);
/* 174 */     if (i != this.p) {
/* 175 */       this.p = i;
/* 176 */       n();
/* 177 */       this.r = -1;
/* 178 */       return true;
/*     */     } 
/* 180 */     return false;
/*     */   }
/*     */   
/*     */   protected boolean b(int ☃) {
/* 184 */     return a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/* 189 */     i();
/* 190 */     k();
/*     */   }
/*     */   
/*     */   protected void i() {
/* 194 */     a(new dlj(this.k / 2 - 100, 196, 200, 20, nq.c, ☃ -> this.i.a((dot)null)));
/*     */   }
/*     */   
/*     */   protected void k() {
/* 198 */     int ☃ = (this.k - 192) / 2;
/* 199 */     int i = 2;
/*     */     
/* 201 */     this.t = a(new dqt(☃ + 116, 159, true, ☃ -> m(), this.v));
/* 202 */     this.u = a(new dqt(☃ + 43, 159, false, ☃ -> l(), this.v));
/*     */     
/* 204 */     n();
/*     */   }
/*     */   
/*     */   private int h() {
/* 208 */     return this.c.a();
/*     */   }
/*     */   
/*     */   protected void l() {
/* 212 */     if (this.p > 0) {
/* 213 */       this.p--;
/*     */     }
/* 215 */     n();
/*     */   }
/*     */   
/*     */   protected void m() {
/* 219 */     if (this.p < h() - 1) {
/* 220 */       this.p++;
/*     */     }
/* 222 */     n();
/*     */   }
/*     */   
/*     */   private void n() {
/* 226 */     this.t.p = (this.p < h() - 1);
/* 227 */     this.u.p = (this.p > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 232 */     if (super.a(☃, i, j)) {
/* 233 */       return true;
/*     */     }
/*     */     
/* 236 */     switch (☃) {
/*     */       case 266:
/* 238 */         this.u.b();
/* 239 */         return true;
/*     */       case 267:
/* 241 */         this.t.b();
/* 242 */         return true;
/*     */     } 
/* 244 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 250 */     a(☃);
/*     */     
/* 252 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 253 */     this.i.M().a(b);
/* 254 */     int k = (this.k - 192) / 2;
/* 255 */     int m = 2;
/* 256 */     b(☃, k, 2, 0, 0, 192, 192);
/*     */     
/* 258 */     if (this.r != this.p) {
/* 259 */       nu nu = this.c.b(this.p);
/* 260 */       this.q = this.o.b(nu, 114);
/* 261 */       this.s = new of("book.pageIndicator", new Object[] { Integer.valueOf(this.p + 1), Integer.valueOf(Math.max(h(), 1)) });
/*     */     } 
/* 263 */     this.r = this.p;
/*     */     
/* 265 */     int n = this.o.a(this.s);
/* 266 */     this.o.b(☃, this.s, (k - n + 192 - 44), 18.0F, 0);
/*     */     
/* 268 */     this.o.getClass(); int i1 = Math.min(128 / 9, this.q.size());
/* 269 */     for (int i2 = 0; i2 < i1; i2++) {
/* 270 */       afa afa = this.q.get(i2);
/* 271 */       this.o.getClass(); this.o.b(☃, afa, (k + 36), (32 + i2 * 9), 0);
/*     */     } 
/*     */     
/* 274 */     ob ob = a(i, j);
/* 275 */     if (ob != null) {
/* 276 */       a(☃, ob, i, j);
/*     */     }
/*     */     
/* 279 */     super.a(☃, i, j, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/* 284 */     if (i == 0) {
/* 285 */       ob ob = a(☃, d1);
/* 286 */       if (ob != null && a(ob)) {
/* 287 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 291 */     return super.a(☃, d1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ob ☃) {
/* 296 */     np np = ☃.h();
/* 297 */     if (np == null) {
/* 298 */       return false;
/*     */     }
/*     */     
/* 301 */     if (np.a() == np.a.e) {
/* 302 */       String str = np.b();
/*     */       try {
/* 304 */         int i = Integer.parseInt(str) - 1;
/* 305 */         return b(i);
/* 306 */       } catch (Exception exception) {
/*     */ 
/*     */         
/* 309 */         return false;
/*     */       } 
/*     */     } 
/* 312 */     boolean bool = super.a(☃);
/* 313 */     if (bool && np.a() == np.a.c) {
/* 314 */       this.i.a((dot)null);
/*     */     }
/* 316 */     return bool;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ob a(double ☃, double d1) {
/* 321 */     if (this.q.isEmpty()) {
/* 322 */       return null;
/*     */     }
/*     */     
/* 325 */     int i = afm.c(☃ - ((this.k - 192) / 2) - 36.0D);
/* 326 */     int j = afm.c(d1 - 2.0D - 30.0D);
/*     */     
/* 328 */     if (i < 0 || j < 0) {
/* 329 */       return null;
/*     */     }
/* 331 */     this.o.getClass(); int k = Math.min(128 / 9, this.q.size());
/*     */     
/* 333 */     this.i.g.getClass(); if (i <= 114 && j < 9 * k + k) {
/* 334 */       this.i.g.getClass(); int m = j / 9;
/* 335 */       if (m >= 0 && m < this.q.size()) {
/* 336 */         afa afa = this.q.get(m);
/* 337 */         return this.i.g.b().a(afa, i);
/*     */       } 
/*     */       
/* 340 */       return null;
/*     */     } 
/*     */     
/* 343 */     return null;
/*     */   }
/*     */   
/*     */   public static List<String> a(md ☃) {
/* 347 */     mj mj = ☃.d("pages", 8).d();
/* 348 */     ImmutableList.Builder<String> builder = ImmutableList.builder();
/* 349 */     for (int i = 0; i < mj.size(); i++) {
/* 350 */       builder.add(mj.j(i));
/*     */     }
/* 352 */     return (List<String>)builder.build();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dpv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */