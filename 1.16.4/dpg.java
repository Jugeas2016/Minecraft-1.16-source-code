/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
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
/*     */ public class dpg
/*     */   extends dkw
/*     */ {
/*  25 */   private static final vk a = new vk("textures/gui/advancements/widgets.png");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  38 */   private static final int[] b = new int[] { 0, 10, -10, 25, -25 };
/*     */   
/*     */   private final dpe c;
/*     */   private final y d;
/*     */   private final ah e;
/*     */   private final afa i;
/*     */   private final int j;
/*     */   private final List<afa> k;
/*     */   private final djz l;
/*     */   private dpg m;
/*  48 */   private final List<dpg> n = Lists.newArrayList();
/*     */   private aa o;
/*     */   private final int p;
/*     */   private final int q;
/*     */   
/*     */   public dpg(dpe ☃, djz djz1, y y1, ah ah1) {
/*  54 */     this.c = ☃;
/*  55 */     this.d = y1;
/*  56 */     this.e = ah1;
/*  57 */     this.l = djz1;
/*  58 */     this.i = ly.a().a(djz1.g.a(ah1.a(), 163));
/*  59 */     this.p = afm.d(ah1.f() * 28.0F);
/*  60 */     this.q = afm.d(ah1.g() * 27.0F);
/*     */     
/*  62 */     int i = y1.g();
/*  63 */     int j = String.valueOf(i).length();
/*  64 */     int k = (i > 1) ? (djz1.g.b("  ") + djz1.g.b("0") * j * 2 + djz1.g.b("/")) : 0;
/*  65 */     int m = 29 + djz1.g.a(this.i) + k;
/*  66 */     this.k = ly.a().a(a(ns.a(ah1.b().e(), ob.a.a(ah1.e().c())), m));
/*  67 */     for (afa afa1 : this.k) {
/*  68 */       m = Math.max(m, djz1.g.a(afa1));
/*     */     }
/*  70 */     this.j = m + 3 + 5;
/*     */   }
/*     */   
/*     */   private static float a(dkj ☃, List<nu> list) {
/*  74 */     return (float)list.stream().mapToDouble(☃::a).max().orElse(0.0D);
/*     */   }
/*     */   
/*     */   private List<nu> a(nr ☃, int i) {
/*  78 */     dkj dkj = this.l.g.b();
/*     */     
/*  80 */     List<nu> list = null;
/*  81 */     float f = Float.MAX_VALUE;
/*     */     
/*  83 */     for (int j : b) {
/*  84 */       List<nu> list1 = dkj.b(☃, i - j, ob.a);
/*  85 */       float f1 = Math.abs(a(dkj, list1) - i);
/*  86 */       if (f1 <= 10.0F) {
/*  87 */         return list1;
/*     */       }
/*  89 */       if (f1 < f) {
/*  90 */         f = f1;
/*  91 */         list = list1;
/*     */       } 
/*     */     } 
/*     */     
/*  95 */     return list;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private dpg a(y ☃) {
/*     */     do {
/* 101 */       ☃ = ☃.b();
/* 102 */     } while (☃ != null && ☃.c() == null);
/* 103 */     if (☃ == null || ☃.c() == null) {
/* 104 */       return null;
/*     */     }
/* 106 */     return this.c.b(☃);
/*     */   }
/*     */   
/*     */   public void a(dfm ☃, int i, int j, boolean bool) {
/* 110 */     if (this.m != null) {
/* 111 */       int k = i + this.m.p + 13;
/* 112 */       int m = i + this.m.p + 26 + 4;
/* 113 */       int n = j + this.m.q + 13;
/* 114 */       int i1 = i + this.p + 13;
/* 115 */       int i2 = j + this.q + 13;
/* 116 */       int i3 = bool ? -16777216 : -1;
/* 117 */       if (bool) {
/* 118 */         a(☃, m, k, n - 1, i3);
/* 119 */         a(☃, m + 1, k, n, i3);
/* 120 */         a(☃, m, k, n + 1, i3);
/* 121 */         a(☃, i1, m - 1, i2 - 1, i3);
/* 122 */         a(☃, i1, m - 1, i2, i3);
/* 123 */         a(☃, i1, m - 1, i2 + 1, i3);
/* 124 */         b(☃, m - 1, i2, n, i3);
/* 125 */         b(☃, m + 1, i2, n, i3);
/*     */       } else {
/* 127 */         a(☃, m, k, n, i3);
/* 128 */         a(☃, i1, m, i2, i3);
/* 129 */         b(☃, m, i2, n, i3);
/*     */       } 
/*     */     } 
/*     */     
/* 133 */     for (dpg dpg1 : this.n) {
/* 134 */       dpg1.a(☃, i, j, bool);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(dfm ☃, int i, int j) {
/* 139 */     if (!this.e.j() || (this.o != null && this.o.a())) {
/* 140 */       dph dph; float f = (this.o == null) ? 0.0F : this.o.c();
/*     */ 
/*     */       
/* 143 */       if (f >= 1.0F) {
/* 144 */         dph = dph.a;
/*     */       } else {
/* 146 */         dph = dph.b;
/*     */       } 
/*     */       
/* 149 */       this.l.M().a(a);
/* 150 */       b(☃, i + this.p + 3, j + this.q, this.e.e().b(), 128 + dph.a() * 26, 26, 26);
/* 151 */       this.l.ad().c(this.e.c(), i + this.p + 8, j + this.q + 5);
/*     */     } 
/*     */     
/* 154 */     for (dpg dpg1 : this.n) {
/* 155 */       dpg1.a(☃, i, j);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(aa ☃) {
/* 164 */     this.o = ☃;
/*     */   }
/*     */   
/*     */   public void a(dpg ☃) {
/* 168 */     this.n.add(☃);
/*     */   } public void a(dfm ☃, int i, int j, float f, int k, int m) {
/*     */     dph dph1, dph2, dph3;
/*     */     int i4;
/* 172 */     boolean bool1 = (k + i + this.p + this.j + 26 >= (this.c.f()).k);
/* 173 */     String str = (this.o == null) ? null : this.o.d();
/* 174 */     int n = (str == null) ? 0 : this.l.g.b(str);
/* 175 */     this.l.g.getClass(); boolean bool2 = (113 - j - this.q - 26 <= 6 + this.k.size() * 9);
/* 176 */     float f1 = (this.o == null) ? 0.0F : this.o.c();
/*     */ 
/*     */ 
/*     */     
/* 180 */     int i1 = afm.d(f1 * this.j);
/*     */     
/* 182 */     if (f1 >= 1.0F) {
/* 183 */       i1 = this.j / 2;
/* 184 */       dph1 = dph.a;
/* 185 */       dph2 = dph.a;
/* 186 */       dph3 = dph.a;
/* 187 */     } else if (i1 < 2) {
/* 188 */       i1 = this.j / 2;
/* 189 */       dph1 = dph.b;
/* 190 */       dph2 = dph.b;
/* 191 */       dph3 = dph.b;
/* 192 */     } else if (i1 > this.j - 2) {
/* 193 */       i1 = this.j / 2;
/* 194 */       dph1 = dph.a;
/* 195 */       dph2 = dph.a;
/* 196 */       dph3 = dph.b;
/*     */     } else {
/* 198 */       dph1 = dph.a;
/* 199 */       dph2 = dph.b;
/* 200 */       dph3 = dph.b;
/*     */     } 
/* 202 */     int i2 = this.j - i1;
/*     */     
/* 204 */     this.l.M().a(a);
/* 205 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 206 */     RenderSystem.enableBlend();
/*     */     
/* 208 */     int i3 = j + this.q;
/*     */     
/* 210 */     if (bool1) {
/* 211 */       i4 = i + this.p - this.j + 26 + 6;
/*     */     } else {
/* 213 */       i4 = i + this.p;
/*     */     } 
/*     */     
/* 216 */     this.l.g.getClass(); int i5 = 32 + this.k.size() * 9;
/* 217 */     if (!this.k.isEmpty()) {
/* 218 */       if (bool2) {
/* 219 */         a(☃, i4, i3 + 26 - i5, this.j, i5, 10, 200, 26, 0, 52);
/*     */       } else {
/* 221 */         a(☃, i4, i3, this.j, i5, 10, 200, 26, 0, 52);
/*     */       } 
/*     */     }
/*     */     
/* 225 */     b(☃, i4, i3, 0, dph1.a() * 26, i1, 26);
/* 226 */     b(☃, i4 + i1, i3, 200 - i2, dph2.a() * 26, i2, 26);
/*     */     
/* 228 */     b(☃, i + this.p + 3, j + this.q, this.e.e().b(), 128 + dph3.a() * 26, 26, 26);
/*     */     
/* 230 */     if (bool1) {
/* 231 */       this.l.g.a(☃, this.i, (i4 + 5), (j + this.q + 9), -1);
/* 232 */       if (str != null) {
/* 233 */         this.l.g.a(☃, str, (i + this.p - n), (j + this.q + 9), -1);
/*     */       }
/*     */     } else {
/* 236 */       this.l.g.a(☃, this.i, (i + this.p + 32), (j + this.q + 9), -1);
/* 237 */       if (str != null) {
/* 238 */         this.l.g.a(☃, str, (i + this.p + this.j - n - 5), (j + this.q + 9), -1);
/*     */       }
/*     */     } 
/*     */     
/* 242 */     if (bool2) {
/* 243 */       for (int i6 = 0; i6 < this.k.size(); i6++) {
/* 244 */         this.l.g.getClass(); this.l.g.b(☃, this.k.get(i6), (i4 + 5), (i3 + 26 - i5 + 7 + i6 * 9), -5592406);
/*     */       } 
/*     */     } else {
/* 247 */       for (int i6 = 0; i6 < this.k.size(); i6++) {
/* 248 */         this.l.g.getClass(); this.l.g.b(☃, this.k.get(i6), (i4 + 5), (j + this.q + 9 + 17 + i6 * 9), -5592406);
/*     */       } 
/*     */     } 
/*     */     
/* 252 */     this.l.ad().c(this.e.c(), i + this.p + 8, j + this.q + 5);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, int i3, int i4) {
/* 257 */     b(☃, i, j, i3, i4, n, n);
/*     */     
/* 259 */     a(☃, i + n, j, k - n - n, n, i3 + n, i4, i1 - n - n, i2);
/*     */     
/* 261 */     b(☃, i + k - n, j, i3 + i1 - n, i4, n, n);
/*     */     
/* 263 */     b(☃, i, j + m - n, i3, i4 + i2 - n, n, n);
/*     */     
/* 265 */     a(☃, i + n, j + m - n, k - n - n, n, i3 + n, i4 + i2 - n, i1 - n - n, i2);
/*     */     
/* 267 */     b(☃, i + k - n, j + m - n, i3 + i1 - n, i4 + i2 - n, n, n);
/*     */     
/* 269 */     a(☃, i, j + n, n, m - n - n, i3, i4 + n, i1, i2 - n - n);
/*     */     
/* 271 */     a(☃, i + n, j + n, k - n - n, m - n - n, i3 + n, i4 + n, i1 - n - n, i2 - n - n);
/*     */     
/* 273 */     a(☃, i + k - n, j + n, n, m - n - n, i3 + i1 - n, i4 + n, i1, i2 - n - n);
/*     */   }
/*     */   protected void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, int i3) {
/*     */     int i4;
/* 277 */     for (i4 = 0; i4 < k; i4 += i2) {
/* 278 */       int i5 = i + i4;
/* 279 */       int i6 = Math.min(i2, k - i4);
/*     */       int i7;
/* 281 */       for (i7 = 0; i7 < m; i7 += i3) {
/* 282 */         int i8 = j + i7;
/* 283 */         int i9 = Math.min(i3, m - i7);
/*     */         
/* 285 */         b(☃, i5, i8, n, i1, i6, i9);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a(int ☃, int i, int j, int k) {
/* 291 */     if (this.e.j() && (this.o == null || !this.o.a())) {
/* 292 */       return false;
/*     */     }
/* 294 */     int m = ☃ + this.p;
/* 295 */     int n = m + 26;
/* 296 */     int i1 = i + this.q;
/* 297 */     int i2 = i1 + 26;
/* 298 */     return (j >= m && j <= n && k >= i1 && k <= i2);
/*     */   }
/*     */   
/*     */   public void b() {
/* 302 */     if (this.m == null && this.d.b() != null) {
/* 303 */       this.m = a(this.d);
/* 304 */       if (this.m != null) {
/* 305 */         this.m.a(this);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public int c() {
/* 311 */     return this.q;
/*     */   }
/*     */   
/*     */   public int d() {
/* 315 */     return this.p;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dpg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */