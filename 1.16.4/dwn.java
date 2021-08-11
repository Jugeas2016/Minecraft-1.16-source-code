/*     */ import it.unimi.dsi.fastutil.objects.ObjectArrayList;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectList;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectListIterator;
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
/*     */ public class dwn
/*     */ {
/*  17 */   private float i = 64.0F;
/*  18 */   private float j = 32.0F;
/*     */   
/*     */   private int k;
/*     */   
/*     */   private int l;
/*     */   
/*     */   public float a;
/*     */   
/*     */   public float b;
/*     */   public float c;
/*     */   public float d;
/*     */   public float e;
/*     */   public float f;
/*     */   public boolean g;
/*     */   public boolean h = true;
/*  33 */   private final ObjectList<a> m = (ObjectList<a>)new ObjectArrayList();
/*  34 */   private final ObjectList<dwn> n = (ObjectList<dwn>)new ObjectArrayList();
/*     */   
/*     */   public dwn(duv ☃) {
/*  37 */     ☃.b(this);
/*  38 */     b(☃.r, ☃.s);
/*     */   }
/*     */   
/*     */   public dwn(duv ☃, int i, int j) {
/*  42 */     this(☃.r, ☃.s, i, j);
/*  43 */     ☃.b(this);
/*     */   }
/*     */   
/*     */   public dwn(int ☃, int i, int j, int k) {
/*  47 */     b(☃, i);
/*  48 */     a(j, k);
/*     */   }
/*     */ 
/*     */   
/*     */   private dwn() {}
/*     */   
/*     */   public dwn a() {
/*  55 */     dwn ☃ = new dwn();
/*  56 */     ☃.a(this);
/*  57 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(dwn ☃) {
/*  61 */     this.d = ☃.d;
/*  62 */     this.e = ☃.e;
/*  63 */     this.f = ☃.f;
/*  64 */     this.a = ☃.a;
/*  65 */     this.b = ☃.b;
/*  66 */     this.c = ☃.c;
/*     */   }
/*     */   
/*     */   public void b(dwn ☃) {
/*  70 */     this.n.add(☃);
/*     */   }
/*     */   
/*     */   public dwn a(int ☃, int i) {
/*  74 */     this.k = ☃;
/*  75 */     this.l = i;
/*  76 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public dwn a(String ☃, float f1, float f2, float f3, int i, int j, int k, float f4, int m, int n) {
/*  81 */     a(m, n);
/*  82 */     a(this.k, this.l, f1, f2, f3, i, j, k, f4, f4, f4, this.g, false);
/*  83 */     return this;
/*     */   }
/*     */   
/*     */   public dwn a(float ☃, float f1, float f2, float f3, float f4, float f5) {
/*  87 */     a(this.k, this.l, ☃, f1, f2, f3, f4, f5, 0.0F, 0.0F, 0.0F, this.g, false);
/*  88 */     return this;
/*     */   }
/*     */   
/*     */   public dwn a(float ☃, float f1, float f2, float f3, float f4, float f5, boolean bool) {
/*  92 */     a(this.k, this.l, ☃, f1, f2, f3, f4, f5, 0.0F, 0.0F, 0.0F, bool, false);
/*  93 */     return this;
/*     */   }
/*     */   
/*     */   public void a(float ☃, float f1, float f2, float f3, float f4, float f5, float f6) {
/*  97 */     a(this.k, this.l, ☃, f1, f2, f3, f4, f5, f6, f6, f6, this.g, false);
/*     */   }
/*     */   
/*     */   public void a(float ☃, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
/* 101 */     a(this.k, this.l, ☃, f1, f2, f3, f4, f5, f6, f7, f8, this.g, false);
/*     */   }
/*     */   
/*     */   public void a(float ☃, float f1, float f2, float f3, float f4, float f5, float f6, boolean bool) {
/* 105 */     a(this.k, this.l, ☃, f1, f2, f3, f4, f5, f6, f6, f6, bool, false);
/*     */   }
/*     */   
/*     */   private void a(int ☃, int i, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean bool1, boolean bool2) {
/* 109 */     this.m.add(new a(☃, i, f1, f2, f3, f4, f5, f6, f7, f8, f9, bool1, this.i, this.j));
/*     */   }
/*     */   
/*     */   public void a(float ☃, float f1, float f2) {
/* 113 */     this.a = ☃;
/* 114 */     this.b = f1;
/* 115 */     this.c = f2;
/*     */   }
/*     */   
/*     */   public void a(dfm ☃, dfq dfq1, int i, int j) {
/* 119 */     a(☃, dfq1, i, j, 1.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   public void a(dfm ☃, dfq dfq1, int i, int j, float f1, float f2, float f3, float f4) {
/* 123 */     if (!this.h) {
/*     */       return;
/*     */     }
/* 126 */     if (this.m.isEmpty() && this.n.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/* 130 */     ☃.a();
/* 131 */     a(☃);
/*     */     
/* 133 */     a(☃.c(), dfq1, i, j, f1, f2, f3, f4);
/*     */     
/* 135 */     for (ObjectListIterator<dwn> objectListIterator = this.n.iterator(); objectListIterator.hasNext(); ) { dwn dwn1 = objectListIterator.next();
/* 136 */       dwn1.a(☃, dfq1, i, j, f1, f2, f3, f4); }
/*     */ 
/*     */     
/* 139 */     ☃.b();
/*     */   }
/*     */   
/*     */   public void a(dfm ☃) {
/* 143 */     ☃.a((this.a / 16.0F), (this.b / 16.0F), (this.c / 16.0F));
/* 144 */     if (this.f != 0.0F) {
/* 145 */       ☃.a(g.f.c(this.f));
/*     */     }
/* 147 */     if (this.e != 0.0F) {
/* 148 */       ☃.a(g.d.c(this.e));
/*     */     }
/* 150 */     if (this.d != 0.0F) {
/* 151 */       ☃.a(g.b.c(this.d));
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(dfm.a ☃, dfq dfq1, int i, int j, float f1, float f2, float f3, float f4) {
/* 156 */     b b = ☃.a();
/* 157 */     a a1 = ☃.b();
/* 158 */     for (ObjectListIterator<a> objectListIterator = this.m.iterator(); objectListIterator.hasNext(); ) { a a2 = objectListIterator.next();
/* 159 */       for (b b1 : a.a(a2)) {
/* 160 */         g g = b1.b.e();
/* 161 */         g.a(a1);
/*     */         
/* 163 */         float f5 = g.a();
/* 164 */         float f6 = g.b();
/* 165 */         float f7 = g.c();
/*     */         
/* 167 */         for (int k = 0; k < 4; k++) {
/* 168 */           c c = b1.a[k];
/* 169 */           float f8 = c.a.a() / 16.0F;
/* 170 */           float f9 = c.a.b() / 16.0F;
/* 171 */           float f10 = c.a.c() / 16.0F;
/* 172 */           h h = new h(f8, f9, f10, 1.0F);
/* 173 */           h.a(b);
/*     */           
/* 175 */           dfq1.a(h.a(), h.b(), h.c(), f1, f2, f3, f4, c.b, c.c, j, i, f5, f6, f7);
/*     */         } 
/*     */       }  }
/*     */   
/*     */   }
/*     */   
/*     */   public dwn b(int ☃, int i) {
/* 182 */     this.i = ☃;
/* 183 */     this.j = i;
/* 184 */     return this;
/*     */   }
/*     */   
/*     */   public a a(Random ☃) {
/* 188 */     return (a)this.m.get(☃.nextInt(this.m.size()));
/*     */   }
/*     */   
/*     */   public static class a {
/*     */     private final dwn.b[] g;
/*     */     public final float a;
/*     */     public final float b;
/*     */     public final float c;
/*     */     public final float d;
/*     */     public final float e;
/*     */     public final float f;
/*     */     
/*     */     public a(int ☃, int i, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean bool, float f10, float f11) {
/* 201 */       this.a = f1;
/* 202 */       this.b = f2;
/* 203 */       this.c = f3;
/* 204 */       this.d = f1 + f4;
/* 205 */       this.e = f2 + f5;
/* 206 */       this.f = f3 + f6;
/* 207 */       this.g = new dwn.b[6];
/*     */       
/* 209 */       float f12 = f1 + f4;
/* 210 */       float f13 = f2 + f5;
/* 211 */       float f14 = f3 + f6;
/*     */       
/* 213 */       f1 -= f7;
/* 214 */       f2 -= f8;
/* 215 */       f3 -= f9;
/* 216 */       f12 += f7;
/* 217 */       f13 += f8;
/* 218 */       f14 += f9;
/*     */       
/* 220 */       if (bool) {
/* 221 */         float f = f12;
/* 222 */         f12 = f1;
/* 223 */         f1 = f;
/*     */       } 
/*     */       
/* 226 */       dwn.c c1 = new dwn.c(f1, f2, f3, 0.0F, 0.0F);
/* 227 */       dwn.c c2 = new dwn.c(f12, f2, f3, 0.0F, 8.0F);
/* 228 */       dwn.c c3 = new dwn.c(f12, f13, f3, 8.0F, 8.0F);
/* 229 */       dwn.c c4 = new dwn.c(f1, f13, f3, 8.0F, 0.0F);
/*     */       
/* 231 */       dwn.c c5 = new dwn.c(f1, f2, f14, 0.0F, 0.0F);
/* 232 */       dwn.c c6 = new dwn.c(f12, f2, f14, 0.0F, 8.0F);
/* 233 */       dwn.c c7 = new dwn.c(f12, f13, f14, 8.0F, 8.0F);
/* 234 */       dwn.c c8 = new dwn.c(f1, f13, f14, 8.0F, 0.0F);
/*     */       
/* 236 */       float f15 = ☃;
/* 237 */       float f16 = ☃ + f6;
/* 238 */       float f17 = ☃ + f6 + f4;
/* 239 */       float f18 = ☃ + f6 + f4 + f4;
/* 240 */       float f19 = ☃ + f6 + f4 + f6;
/* 241 */       float f20 = ☃ + f6 + f4 + f6 + f4;
/*     */       
/* 243 */       float f21 = i;
/* 244 */       float f22 = i + f6;
/* 245 */       float f23 = i + f6 + f5;
/*     */       
/* 247 */       this.g[2] = new dwn.b(new dwn.c[] { c6, c5, c1, c2 }, f16, f21, f17, f22, f10, f11, bool, gc.a);
/* 248 */       this.g[3] = new dwn.b(new dwn.c[] { c3, c4, c8, c7 }, f17, f22, f18, f21, f10, f11, bool, gc.b);
/*     */       
/* 250 */       this.g[1] = new dwn.b(new dwn.c[] { c1, c5, c8, c4 }, f15, f22, f16, f23, f10, f11, bool, gc.e);
/* 251 */       this.g[4] = new dwn.b(new dwn.c[] { c2, c1, c4, c3 }, f16, f22, f17, f23, f10, f11, bool, gc.c);
/* 252 */       this.g[0] = new dwn.b(new dwn.c[] { c6, c2, c3, c7 }, f17, f22, f19, f23, f10, f11, bool, gc.f);
/* 253 */       this.g[5] = new dwn.b(new dwn.c[] { c5, c6, c7, c8 }, f19, f22, f20, f23, f10, f11, bool, gc.d);
/*     */     }
/*     */   }
/*     */   
/*     */   static class b {
/*     */     public final dwn.c[] a;
/*     */     public final g b;
/*     */     
/*     */     public b(dwn.c[] ☃, float f1, float f2, float f3, float f4, float f5, float f6, boolean bool, gc gc1) {
/* 262 */       this.a = ☃;
/*     */       
/* 264 */       float f7 = 0.0F / f5;
/* 265 */       float f8 = 0.0F / f6;
/* 266 */       ☃[0] = ☃[0].a(f3 / f5 - f7, f2 / f6 + f8);
/* 267 */       ☃[1] = ☃[1].a(f1 / f5 + f7, f2 / f6 + f8);
/* 268 */       ☃[2] = ☃[2].a(f1 / f5 + f7, f4 / f6 - f8);
/* 269 */       ☃[3] = ☃[3].a(f3 / f5 - f7, f4 / f6 - f8);
/*     */       
/* 271 */       if (bool) {
/* 272 */         int i = ☃.length;
/* 273 */         for (int j = 0; j < i / 2; j++) {
/* 274 */           dwn.c c1 = ☃[j];
/* 275 */           ☃[j] = ☃[i - 1 - j];
/* 276 */           ☃[i - 1 - j] = c1;
/*     */         } 
/*     */       } 
/*     */       
/* 280 */       this.b = gc1.l();
/* 281 */       if (bool) {
/* 282 */         this.b.b(-1.0F, 1.0F, 1.0F);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   static class c
/*     */   {
/*     */     public final g a;
/*     */     public final float b;
/*     */     public final float c;
/*     */     
/*     */     public c(float ☃, float f1, float f2, float f3, float f4) {
/* 294 */       this(new g(☃, f1, f2), f3, f4);
/*     */     }
/*     */     
/*     */     public c a(float ☃, float f1) {
/* 298 */       return new c(this.a, ☃, f1);
/*     */     }
/*     */     
/*     */     public c(g ☃, float f1, float f2) {
/* 302 */       this.a = ☃;
/* 303 */       this.b = f1;
/* 304 */       this.c = f2;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dwn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */