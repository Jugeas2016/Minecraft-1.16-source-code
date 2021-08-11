/*     */ import com.google.common.collect.Lists;
/*     */ import com.ibm.icu.text.ArabicShaping;
/*     */ import com.ibm.icu.text.ArabicShapingException;
/*     */ import com.ibm.icu.text.Bidi;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.function.Function;
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
/*     */ public class dku
/*     */ {
/*  40 */   private static final g c = new g(0.0F, 0.0F, 0.03F);
/*  41 */   public final int a = 9;
/*  42 */   public final Random b = new Random();
/*     */   
/*     */   private final Function<vk, dmw> d;
/*     */   
/*     */   private final dkj e;
/*     */   
/*     */   public dku(Function<vk, dmw> ☃) {
/*  49 */     this.d = ☃;
/*  50 */     this.e = new dkj((☃, ob1) -> a(ob1.k()).a(☃).a(ob1.b()));
/*     */   }
/*     */   
/*     */   private dmw a(vk ☃) {
/*  54 */     return this.d.apply(☃);
/*     */   }
/*     */   
/*     */   public int a(dfm ☃, String str, float f1, float f2, int i) {
/*  58 */     return a(str, f1, f2, i, ☃.c().a(), true, a());
/*     */   }
/*     */   
/*     */   public int a(dfm ☃, String str, float f1, float f2, int i, boolean bool) {
/*  62 */     RenderSystem.enableAlphaTest();
/*  63 */     return a(str, f1, f2, i, ☃.c().a(), true, bool);
/*     */   }
/*     */   
/*     */   public int b(dfm ☃, String str, float f1, float f2, int i) {
/*  67 */     RenderSystem.enableAlphaTest();
/*  68 */     return a(str, f1, f2, i, ☃.c().a(), false, a());
/*     */   }
/*     */   
/*     */   public int a(dfm ☃, afa afa1, float f1, float f2, int i) {
/*  72 */     RenderSystem.enableAlphaTest();
/*  73 */     return a(afa1, f1, f2, i, ☃.c().a(), true);
/*     */   }
/*     */   
/*     */   public int a(dfm ☃, nr nr1, float f1, float f2, int i) {
/*  77 */     RenderSystem.enableAlphaTest();
/*  78 */     return a(nr1.f(), f1, f2, i, ☃.c().a(), true);
/*     */   }
/*     */   
/*     */   public int b(dfm ☃, afa afa1, float f1, float f2, int i) {
/*  82 */     RenderSystem.enableAlphaTest();
/*  83 */     return a(afa1, f1, f2, i, ☃.c().a(), false);
/*     */   }
/*     */   
/*     */   public int b(dfm ☃, nr nr1, float f1, float f2, int i) {
/*  87 */     RenderSystem.enableAlphaTest();
/*  88 */     return a(nr1.f(), f1, f2, i, ☃.c().a(), false);
/*     */   }
/*     */   
/*     */   public String a(String ☃) {
/*     */     try {
/*  93 */       Bidi bidi = new Bidi((new ArabicShaping(8)).shape(☃), 127);
/*  94 */       bidi.setReorderingMode(0);
/*  95 */       return bidi.writeReordered(2);
/*  96 */     } catch (ArabicShapingException arabicShapingException) {
/*     */ 
/*     */       
/*  99 */       return ☃;
/*     */     } 
/*     */   }
/*     */   private int a(String ☃, float f1, float f2, int i, b b1, boolean bool1, boolean bool2) {
/* 103 */     if (☃ == null) {
/* 104 */       return 0;
/*     */     }
/*     */     
/* 107 */     eag.a a = eag.a(dfo.a().c());
/* 108 */     int j = a(☃, f1, f2, i, bool1, b1, a, false, 0, 15728880, bool2);
/* 109 */     a.a();
/* 110 */     return j;
/*     */   }
/*     */   
/*     */   private int a(afa ☃, float f1, float f2, int i, b b1, boolean bool) {
/* 114 */     eag.a a = eag.a(dfo.a().c());
/* 115 */     int j = a(☃, f1, f2, i, bool, b1, a, false, 0, 15728880);
/* 116 */     a.a();
/* 117 */     return j;
/*     */   }
/*     */   
/*     */   public int a(String ☃, float f1, float f2, int i, boolean bool1, b b1, eag eag1, boolean bool2, int j, int k) {
/* 121 */     return a(☃, f1, f2, i, bool1, b1, eag1, bool2, j, k, a());
/*     */   }
/*     */   
/*     */   public int a(String ☃, float f1, float f2, int i, boolean bool1, b b1, eag eag1, boolean bool2, int j, int k, boolean bool3) {
/* 125 */     return b(☃, f1, f2, i, bool1, b1, eag1, bool2, j, k, bool3);
/*     */   }
/*     */   
/*     */   public int a(nr ☃, float f1, float f2, int i, boolean bool1, b b1, eag eag1, boolean bool2, int j, int k) {
/* 129 */     return a(☃.f(), f1, f2, i, bool1, b1, eag1, bool2, j, k);
/*     */   }
/*     */   
/*     */   public int a(afa ☃, float f1, float f2, int i, boolean bool1, b b1, eag eag1, boolean bool2, int j, int k) {
/* 133 */     return b(☃, f1, f2, i, bool1, b1, eag1, bool2, j, k);
/*     */   }
/*     */ 
/*     */   
/*     */   private static int a(int ☃) {
/* 138 */     if ((☃ & 0xFC000000) == 0) {
/* 139 */       return ☃ | 0xFF000000;
/*     */     }
/* 141 */     return ☃;
/*     */   }
/*     */   
/*     */   private int b(String ☃, float f1, float f2, int i, boolean bool1, b b1, eag eag1, boolean bool2, int j, int k, boolean bool3) {
/* 145 */     if (bool3) {
/* 146 */       ☃ = a(☃);
/*     */     }
/*     */     
/* 149 */     i = a(i);
/*     */     
/* 151 */     b b2 = b1.d();
/* 152 */     if (bool1) {
/* 153 */       b(☃, f1, f2, i, true, b1, eag1, bool2, j, k);
/* 154 */       b2.a(c);
/*     */     } 
/*     */     
/* 157 */     f1 = b(☃, f1, f2, i, false, b2, eag1, bool2, j, k);
/*     */     
/* 159 */     return (int)f1 + (bool1 ? 1 : 0);
/*     */   }
/*     */   
/*     */   private int b(afa ☃, float f1, float f2, int i, boolean bool1, b b1, eag eag1, boolean bool2, int j, int k) {
/* 163 */     i = a(i);
/*     */     
/* 165 */     b b2 = b1.d();
/* 166 */     if (bool1) {
/* 167 */       c(☃, f1, f2, i, true, b1, eag1, bool2, j, k);
/* 168 */       b2.a(c);
/*     */     } 
/*     */     
/* 171 */     f1 = c(☃, f1, f2, i, false, b2, eag1, bool2, j, k);
/*     */     
/* 173 */     return (int)f1 + (bool1 ? 1 : 0);
/*     */   }
/*     */   
/*     */   class a
/*     */     implements afb
/*     */   {
/*     */     final eag a;
/*     */     private final boolean c;
/*     */     private final float d;
/*     */     private final float e;
/*     */     private final float f;
/*     */     private final float g;
/*     */     private final float h;
/*     */     private final b i;
/*     */     private final boolean j;
/*     */     private final int k;
/*     */     private float l;
/*     */     private float m;
/*     */     @Nullable
/*     */     private List<dmz.a> n;
/*     */     
/*     */     private void a(dmz.a ☃) {
/* 195 */       if (this.n == null) {
/* 196 */         this.n = Lists.newArrayList();
/*     */       }
/* 198 */       this.n.add(☃);
/*     */     }
/*     */     
/*     */     public a(dku this$0, eag ☃, float f1, float f2, int i, boolean bool1, b b1, boolean bool2, int j) {
/* 202 */       this.a = ☃;
/* 203 */       this.l = f1;
/* 204 */       this.m = f2;
/* 205 */       this.c = bool1;
/* 206 */       this.d = bool1 ? 0.25F : 1.0F;
/* 207 */       this.e = (i >> 16 & 0xFF) / 255.0F * this.d;
/* 208 */       this.f = (i >> 8 & 0xFF) / 255.0F * this.d;
/* 209 */       this.g = (i & 0xFF) / 255.0F * this.d;
/* 210 */       this.h = (i >> 24 & 0xFF) / 255.0F;
/* 211 */       this.i = b1;
/* 212 */       this.j = bool2;
/* 213 */       this.k = j;
/*     */     }
/*     */     
/*     */     public boolean accept(int ☃, ob ob1, int i) {
/*     */       float f1, f2, f3;
/* 218 */       dmw dmw = dku.a(this.b, ob1.k());
/* 219 */       dea dea = dmw.a(i);
/* 220 */       dmz dmz = (ob1.f() && i != 32) ? dmw.a(dea) : dmw.b(i);
/*     */       
/* 222 */       boolean bool = ob1.b();
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 227 */       float f4 = this.h;
/*     */       
/* 229 */       od od = ob1.a();
/* 230 */       if (od != null) {
/* 231 */         int j = od.a();
/* 232 */         f1 = (j >> 16 & 0xFF) / 255.0F * this.d;
/* 233 */         f2 = (j >> 8 & 0xFF) / 255.0F * this.d;
/* 234 */         f3 = (j & 0xFF) / 255.0F * this.d;
/*     */       } else {
/* 236 */         f1 = this.e;
/* 237 */         f2 = this.f;
/* 238 */         f3 = this.g;
/*     */       } 
/*     */       
/* 241 */       if (!(dmz instanceof dna)) {
/* 242 */         float f7 = bool ? dea.b() : 0.0F;
/* 243 */         float f8 = this.c ? dea.c() : 0.0F;
/*     */         
/* 245 */         dfq dfq = this.a.getBuffer(dmz.a(this.j));
/* 246 */         dku.a(this.b, dmz, bool, ob1.c(), f7, this.l + f8, this.m + f8, this.i, dfq, f1, f2, f3, f4, this.k);
/*     */       } 
/*     */       
/* 249 */       float f5 = dea.a(bool);
/*     */       
/* 251 */       float f6 = this.c ? 1.0F : 0.0F;
/* 252 */       if (ob1.d()) {
/* 253 */         a(new dmz.a(this.l + f6 - 1.0F, this.m + f6 + 4.5F, this.l + f6 + f5, this.m + f6 + 4.5F - 1.0F, 0.01F, f1, f2, f3, f4));
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 263 */       if (ob1.e()) {
/* 264 */         a(new dmz.a(this.l + f6 - 1.0F, this.m + f6 + 9.0F, this.l + f6 + f5, this.m + f6 + 9.0F - 1.0F, 0.01F, f1, f2, f3, f4));
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 273 */       this.l += f5;
/* 274 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public float a(int ☃, float f) {
/* 279 */       if (☃ != 0) {
/* 280 */         float f1 = (☃ >> 24 & 0xFF) / 255.0F;
/* 281 */         float f2 = (☃ >> 16 & 0xFF) / 255.0F;
/* 282 */         float f3 = (☃ >> 8 & 0xFF) / 255.0F;
/* 283 */         float f4 = (☃ & 0xFF) / 255.0F;
/* 284 */         a(new dmz.a(f - 1.0F, this.m + 9.0F, this.l + 1.0F, this.m - 1.0F, 0.01F, f2, f3, f4, f1));
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 293 */       if (this.n != null) {
/* 294 */         dmz dmz = dku.a(this.b, ob.b).a();
/* 295 */         dfq dfq = this.a.getBuffer(dmz.a(this.j));
/* 296 */         for (dmz.a a1 : this.n) {
/* 297 */           dmz.a(a1, this.i, dfq, this.k);
/*     */         }
/*     */       } 
/*     */       
/* 301 */       return this.l;
/*     */     }
/*     */   }
/*     */   
/*     */   private float b(String ☃, float f1, float f2, int i, boolean bool1, b b1, eag eag1, boolean bool2, int j, int k) {
/* 306 */     a a = new a(this, eag1, f1, f2, i, bool1, b1, bool2, k);
/* 307 */     afr.c(☃, ob.a, a);
/* 308 */     return a.a(j, f1);
/*     */   }
/*     */   
/*     */   private float c(afa ☃, float f1, float f2, int i, boolean bool1, b b1, eag eag1, boolean bool2, int j, int k) {
/* 312 */     a a = new a(this, eag1, f1, f2, i, bool1, b1, bool2, k);
/* 313 */     ☃.accept(a);
/* 314 */     return a.a(j, f1);
/*     */   }
/*     */   
/*     */   private void a(dmz ☃, boolean bool1, boolean bool2, float f1, float f2, float f3, b b1, dfq dfq1, float f4, float f5, float f6, float f7, int i) {
/* 318 */     ☃.a(bool2, f2, f3, b1, dfq1, f4, f5, f6, f7, i);
/* 319 */     if (bool1) {
/* 320 */       ☃.a(bool2, f2 + f1, f3, b1, dfq1, f4, f5, f6, f7, i);
/*     */     }
/*     */   }
/*     */   
/*     */   public int b(String ☃) {
/* 325 */     return afm.f(this.e.a(☃));
/*     */   }
/*     */   
/*     */   public int a(nu ☃) {
/* 329 */     return afm.f(this.e.a(☃));
/*     */   }
/*     */   
/*     */   public int a(afa ☃) {
/* 333 */     return afm.f(this.e.a(☃));
/*     */   }
/*     */   
/*     */   public String a(String ☃, int i, boolean bool) {
/* 337 */     return bool ? this.e.c(☃, i, ob.a) : this.e.b(☃, i, ob.a);
/*     */   }
/*     */   
/*     */   public String a(String ☃, int i) {
/* 341 */     return this.e.b(☃, i, ob.a);
/*     */   }
/*     */   
/*     */   public nu a(nu ☃, int i) {
/* 345 */     return this.e.a(☃, i, ob.a);
/*     */   }
/*     */   
/*     */   public void a(nu ☃, int i, int j, int k, int m) {
/* 349 */     b b = f.a().c();
/* 350 */     for (afa afa : b(☃, k)) {
/* 351 */       a(afa, i, j, m, b, false);
/* 352 */       j += 9;
/*     */     } 
/*     */   }
/*     */   
/*     */   public int b(String ☃, int i) {
/* 357 */     return 9 * this.e.g(☃, i, ob.a).size();
/*     */   }
/*     */   
/*     */   public List<afa> b(nu ☃, int i) {
/* 361 */     return ly.a().a(this.e.b(☃, i, ob.a));
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 365 */     return ly.a().b();
/*     */   }
/*     */   
/*     */   public dkj b() {
/* 369 */     return this.e;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dku.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */