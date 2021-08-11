/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Collections;
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
/*     */ public class dro
/*     */   extends dkw
/*     */   implements dmf, dmi
/*     */ {
/*  26 */   private static final vk a = new vk("textures/gui/recipe_book.png");
/*     */ 
/*     */ 
/*     */   
/*  30 */   private final List<a> b = Lists.newArrayList();
/*     */   
/*     */   private boolean c;
/*     */   
/*     */   private int d;
/*     */   
/*     */   private int e;
/*     */   
/*     */   private djz i;
/*     */   private drt j;
/*     */   private boq<?> k;
/*     */   private float l;
/*     */   private boolean m;
/*     */   
/*     */   public void a(djz ☃, drt drt1, int i, int j, int k, int m, float f) {
/*  45 */     this.i = ☃;
/*  46 */     this.j = drt1;
/*     */     
/*  48 */     if (☃.s.bp instanceof bid) {
/*  49 */       this.m = true;
/*     */     }
/*     */     
/*  52 */     boolean bool = ☃.s.F().a((bjj)☃.s.bp);
/*     */     
/*  54 */     List<boq<?>> list1 = drt1.b(true);
/*  55 */     List<boq<?>> list2 = bool ? Collections.<boq<?>>emptyList() : drt1.b(false);
/*     */     
/*  57 */     int n = list1.size();
/*  58 */     int i1 = n + list2.size();
/*     */     
/*  60 */     int i2 = (i1 <= 16) ? 4 : 5;
/*  61 */     int i3 = (int)Math.ceil((i1 / i2));
/*  62 */     this.d = i;
/*  63 */     this.e = j;
/*     */     
/*  65 */     int i4 = 25;
/*     */ 
/*     */     
/*  68 */     float f1 = (this.d + Math.min(i1, i2) * 25);
/*  69 */     float f2 = (k + 50);
/*  70 */     if (f1 > f2) {
/*  71 */       this.d = (int)(this.d - f * (int)((f1 - f2) / f));
/*     */     }
/*     */     
/*  74 */     float f3 = (this.e + i3 * 25);
/*  75 */     float f4 = (m + 50);
/*  76 */     if (f3 > f4) {
/*  77 */       this.e = (int)(this.e - f * afm.f((f3 - f4) / f));
/*     */     }
/*     */     
/*  80 */     float f5 = this.e;
/*  81 */     float f6 = (m - 100);
/*  82 */     if (f5 < f6) {
/*  83 */       this.e = (int)(this.e - f * afm.f((f5 - f6) / f));
/*     */     }
/*     */     
/*  86 */     this.c = true;
/*     */     
/*  88 */     this.b.clear();
/*  89 */     for (int i5 = 0; i5 < i1; i5++) {
/*  90 */       boolean bool1 = (i5 < n);
/*  91 */       boq<?> boq1 = bool1 ? list1.get(i5) : list2.get(i5 - n);
/*     */       
/*  93 */       int i6 = this.d + 4 + 25 * i5 % i2;
/*  94 */       int i7 = this.e + 5 + 25 * i5 / i2;
/*  95 */       if (this.m) {
/*  96 */         this.b.add(new b(this, i6, i7, boq1, bool1));
/*     */       } else {
/*  98 */         this.b.add(new a(this, i6, i7, boq1, bool1));
/*     */       } 
/*     */     } 
/*     */     
/* 102 */     this.k = null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c_(boolean ☃) {
/* 107 */     return false;
/*     */   }
/*     */   
/*     */   public drt a() {
/* 111 */     return this.j;
/*     */   }
/*     */   
/*     */   public boq<?> b() {
/* 115 */     return this.k;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/* 120 */     if (i != 0) {
/* 121 */       return false;
/*     */     }
/*     */     
/* 124 */     for (a a : this.b) {
/* 125 */       if (a.a(☃, d1, i)) {
/* 126 */         this.k = a.a(a);
/* 127 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/* 131 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(double ☃, double d1) {
/* 136 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 141 */     if (!this.c) {
/*     */       return;
/*     */     }
/*     */     
/* 145 */     this.l += f;
/*     */     
/* 147 */     RenderSystem.enableBlend();
/* 148 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 149 */     this.i.M().a(a);
/*     */     
/* 151 */     RenderSystem.pushMatrix();
/* 152 */     RenderSystem.translatef(0.0F, 0.0F, 170.0F);
/*     */     
/* 154 */     int k = (this.b.size() <= 16) ? 4 : 5;
/* 155 */     int m = Math.min(this.b.size(), k);
/* 156 */     int n = afm.f(this.b.size() / k);
/*     */     
/* 158 */     int i1 = 24;
/* 159 */     int i2 = 4;
/* 160 */     int i3 = 82;
/* 161 */     int i4 = 208;
/* 162 */     c(☃, m, n, 24, 4, 82, 208);
/*     */     
/* 164 */     RenderSystem.disableBlend();
/*     */     
/* 166 */     for (a a : this.b) {
/* 167 */       a.a(☃, i, j, f);
/*     */     }
/* 169 */     RenderSystem.popMatrix();
/*     */   }
/*     */   
/*     */   private void c(dfm ☃, int i, int j, int k, int m, int n, int i1) {
/* 173 */     b(☃, this.d, this.e, n, i1, m, m);
/* 174 */     b(☃, this.d + m * 2 + i * k, this.e, n + k + m, i1, m, m);
/* 175 */     b(☃, this.d, this.e + m * 2 + j * k, n, i1 + k + m, m, m);
/* 176 */     b(☃, this.d + m * 2 + i * k, this.e + m * 2 + j * k, n + k + m, i1 + k + m, m, m);
/*     */     
/* 178 */     for (int i2 = 0; i2 < i; i2++) {
/* 179 */       b(☃, this.d + m + i2 * k, this.e, n + m, i1, k, m);
/* 180 */       b(☃, this.d + m + (i2 + 1) * k, this.e, n + m, i1, m, m);
/*     */       
/* 182 */       for (int i3 = 0; i3 < j; i3++) {
/* 183 */         if (i2 == 0) {
/* 184 */           b(☃, this.d, this.e + m + i3 * k, n, i1 + m, m, k);
/* 185 */           b(☃, this.d, this.e + m + (i3 + 1) * k, n, i1 + m, m, m);
/*     */         } 
/*     */         
/* 188 */         b(☃, this.d + m + i2 * k, this.e + m + i3 * k, n + m, i1 + m, k, k);
/* 189 */         b(☃, this.d + m + (i2 + 1) * k, this.e + m + i3 * k, n + m, i1 + m, m, k);
/* 190 */         b(☃, this.d + m + i2 * k, this.e + m + (i3 + 1) * k, n + m, i1 + m, k, m);
/* 191 */         b(☃, this.d + m + (i2 + 1) * k - 1, this.e + m + (i3 + 1) * k - 1, n + m, i1 + m, m + 1, m + 1);
/*     */         
/* 193 */         if (i2 == i - 1) {
/* 194 */           b(☃, this.d + m * 2 + i * k, this.e + m + i3 * k, n + k + m, i1 + m, m, k);
/* 195 */           b(☃, this.d + m * 2 + i * k, this.e + m + (i3 + 1) * k, n + k + m, i1 + m, m, m);
/*     */         } 
/*     */       } 
/*     */       
/* 199 */       b(☃, this.d + m + i2 * k, this.e + m * 2 + j * k, n + m, i1 + k + m, k, m);
/* 200 */       b(☃, this.d + m + (i2 + 1) * k, this.e + m * 2 + j * k, n + m, i1 + k + m, m, m);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 205 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public boolean c() {
/* 209 */     return this.c;
/*     */   }
/*     */   
/*     */   class b extends a {
/*     */     public b(dro this$0, int ☃, int i, boq<?> boq1, boolean bool) {
/* 214 */       super(this$0, ☃, i, boq1, bool);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(boq<?> ☃) {
/* 219 */       bmb[] arrayOfBmb = ((bon)☃.a().get(0)).a();
/* 220 */       this.a.add(new dro.a.a(this, 10, 10, arrayOfBmb));
/*     */     }
/*     */   }
/*     */   
/*     */   class a extends dlh implements uz<bon> {
/*     */     private final boq<?> c;
/*     */     private final boolean d;
/* 227 */     protected final List<a> a = Lists.newArrayList();
/*     */     
/*     */     public a(dro this$0, int ☃, int i, boq<?> boq1, boolean bool) {
/* 230 */       super(☃, i, 200, 20, oe.d);
/* 231 */       this.j = 24;
/* 232 */       this.k = 24;
/* 233 */       this.c = boq1;
/* 234 */       this.d = bool;
/*     */       
/* 236 */       a(boq1);
/*     */     }
/*     */     
/*     */     protected void a(boq<?> ☃) {
/* 240 */       a(3, 3, -1, ☃, ☃.a().iterator(), 0);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(Iterator<bon> ☃, int i, int j, int k, int m) {
/* 245 */       bmb[] arrayOfBmb = ((bon)☃.next()).a();
/* 246 */       if (arrayOfBmb.length != 0) {
/* 247 */         this.a.add(new a(this, 3 + m * 7, 3 + k * 7, arrayOfBmb));
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(dfm ☃, int i, int j, float f) {
/* 253 */       RenderSystem.enableAlphaTest();
/* 254 */       dro.a(this.b).M().a(dro.d());
/*     */       
/* 256 */       int k = 152;
/* 257 */       if (!this.d) {
/* 258 */         k += 26;
/*     */       }
/* 260 */       int m = dro.b(this.b) ? 130 : 78;
/* 261 */       if (g()) {
/* 262 */         m += 26;
/*     */       }
/* 264 */       b(☃, this.l, this.m, k, m, this.j, this.k);
/*     */       
/* 266 */       for (a a1 : this.a) {
/* 267 */         RenderSystem.pushMatrix();
/* 268 */         float f1 = 0.42F;
/* 269 */         int n = (int)((this.l + a1.b) / 0.42F - 3.0F);
/* 270 */         int i1 = (int)((this.m + a1.c) / 0.42F - 3.0F);
/* 271 */         RenderSystem.scalef(0.42F, 0.42F, 1.0F);
/* 272 */         dro.a(this.b).ad().b(a1.a[afm.d(dro.c(this.b) / 30.0F) % a1.a.length], n, i1);
/* 273 */         RenderSystem.popMatrix();
/*     */       } 
/*     */       
/* 276 */       RenderSystem.disableAlphaTest();
/*     */     }
/*     */     
/*     */     public class a {
/*     */       public final bmb[] a;
/*     */       public final int b;
/*     */       public final int c;
/*     */       
/*     */       public a(dro.a ☃, int i, int j, bmb[] arrayOfBmb) {
/* 285 */         this.b = i;
/* 286 */         this.c = j;
/* 287 */         this.a = arrayOfBmb;
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dro.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */