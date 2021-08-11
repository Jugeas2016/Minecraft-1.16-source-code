/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.function.Function;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ebi
/*     */ {
/*  17 */   public static final List<String> a = Lists.newArrayList((Object[])new String[] { "layer0", "layer1", "layer2", "layer3", "layer4" });
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ebf a(Function<elr, ekc> ☃, ebf ebf1) {
/*  23 */     Map<String, Either<elr, String>> map = Maps.newHashMap();
/*     */     
/*  25 */     List<ebb> list = Lists.newArrayList();
/*  26 */     for (int i = 0; i < a.size(); i++) {
/*  27 */       String str = a.get(i);
/*  28 */       if (!ebf1.b(str)) {
/*     */         break;
/*     */       }
/*     */       
/*  32 */       elr elr = ebf1.c(str);
/*  33 */       map.put(str, Either.left(elr));
/*     */       
/*  35 */       ekc ekc = ☃.apply(elr);
/*  36 */       list.addAll(a(i, str, ekc));
/*     */     } 
/*     */     
/*  39 */     map.put("particle", ebf1.b("particle") ? Either.left(ebf1.c("particle")) : map.get("layer0"));
/*     */     
/*  41 */     ebf ebf2 = new ebf(null, list, map, false, ebf1.c(), ebf1.h(), ebf1.e());
/*  42 */     ebf2.b = ebf1.b;
/*  43 */     return ebf2;
/*     */   }
/*     */   
/*     */   private List<ebb> a(int ☃, String str, ekc ekc1) {
/*  47 */     Map<gc, ebc> map = Maps.newHashMap();
/*  48 */     map.put(gc.d, new ebc(null, ☃, str, new ebe(new float[] { 0.0F, 0.0F, 16.0F, 16.0F }, 0)));
/*  49 */     map.put(gc.c, new ebc(null, ☃, str, new ebe(new float[] { 16.0F, 0.0F, 0.0F, 16.0F }, 0)));
/*     */     
/*  51 */     List<ebb> list = Lists.newArrayList();
/*  52 */     list.add(new ebb(new g(0.0F, 0.0F, 7.5F), new g(16.0F, 16.0F, 8.5F), map, null, true));
/*     */     
/*  54 */     list.addAll(a(ekc1, str, ☃));
/*     */     
/*  56 */     return list;
/*     */   }
/*     */   
/*     */   private List<ebb> a(ekc ☃, String str, int i) {
/*  60 */     float f1 = ☃.f();
/*  61 */     float f2 = ☃.g();
/*  62 */     List<ebb> list = Lists.newArrayList();
/*     */     
/*  64 */     for (a a : a(☃)) {
/*  65 */       float f3 = 0.0F;
/*  66 */       float f4 = 0.0F;
/*  67 */       float f5 = 0.0F;
/*  68 */       float f6 = 0.0F;
/*  69 */       float f7 = 0.0F;
/*  70 */       float f8 = 0.0F;
/*  71 */       float f9 = 0.0F;
/*  72 */       float f10 = 0.0F;
/*  73 */       float f11 = 16.0F / f1;
/*  74 */       float f12 = 16.0F / f2;
/*     */       
/*  76 */       float f13 = a.b();
/*  77 */       float f14 = a.c();
/*  78 */       float f15 = a.d();
/*     */       
/*  80 */       b b = a.a();
/*  81 */       switch (null.a[b.ordinal()]) {
/*     */         case 1:
/*  83 */           f3 = f7 = f13;
/*  84 */           f5 = f8 = f14 + 1.0F;
/*  85 */           f4 = f9 = f15;
/*  86 */           f6 = f15;
/*  87 */           f10 = f15 + 1.0F;
/*     */           break;
/*     */         case 2:
/*  90 */           f9 = f15;
/*  91 */           f10 = f15 + 1.0F;
/*  92 */           f3 = f7 = f13;
/*  93 */           f5 = f8 = f14 + 1.0F;
/*  94 */           f4 = f15 + 1.0F;
/*  95 */           f6 = f15 + 1.0F;
/*     */           break;
/*     */         case 3:
/*  98 */           f3 = f7 = f15;
/*  99 */           f5 = f15;
/* 100 */           f8 = f15 + 1.0F;
/* 101 */           f4 = f10 = f13;
/* 102 */           f6 = f9 = f14 + 1.0F;
/*     */           break;
/*     */         case 4:
/* 105 */           f7 = f15;
/* 106 */           f8 = f15 + 1.0F;
/* 107 */           f3 = f15 + 1.0F;
/* 108 */           f5 = f15 + 1.0F;
/* 109 */           f4 = f10 = f13;
/* 110 */           f6 = f9 = f14 + 1.0F;
/*     */           break;
/*     */       } 
/*     */       
/* 114 */       f3 *= f11;
/* 115 */       f5 *= f11;
/* 116 */       f4 *= f12;
/* 117 */       f6 *= f12;
/*     */       
/* 119 */       f4 = 16.0F - f4;
/* 120 */       f6 = 16.0F - f6;
/*     */       
/* 122 */       f7 *= f11;
/* 123 */       f8 *= f11;
/* 124 */       f9 *= f12;
/* 125 */       f10 *= f12;
/*     */       
/* 127 */       Map<gc, ebc> map = Maps.newHashMap();
/* 128 */       map.put(b.a(), new ebc(null, i, str, new ebe(new float[] { f7, f9, f8, f10 }, 0)));
/*     */       
/* 130 */       switch (null.a[b.ordinal()]) {
/*     */         case 1:
/* 132 */           list.add(new ebb(new g(f3, f4, 7.5F), new g(f5, f4, 8.5F), map, null, true));
/*     */         
/*     */         case 2:
/* 135 */           list.add(new ebb(new g(f3, f6, 7.5F), new g(f5, f6, 8.5F), map, null, true));
/*     */         
/*     */         case 3:
/* 138 */           list.add(new ebb(new g(f3, f4, 7.5F), new g(f3, f6, 8.5F), map, null, true));
/*     */         
/*     */         case 4:
/* 141 */           list.add(new ebb(new g(f5, f4, 7.5F), new g(f5, f6, 8.5F), map, null, true));
/*     */       } 
/*     */ 
/*     */     
/*     */     } 
/* 146 */     return list;
/*     */   }
/*     */   
/*     */   private List<a> a(ekc ☃) {
/* 150 */     int i = ☃.f();
/* 151 */     int j = ☃.g();
/*     */     
/* 153 */     List<a> list = Lists.newArrayList();
/* 154 */     for (int k = 0; k < ☃.n(); k++) {
/* 155 */       for (int m = 0; m < j; m++) {
/* 156 */         for (int n = 0; n < i; n++) {
/* 157 */           boolean bool = !a(☃, k, n, m, i, j);
/*     */           
/* 159 */           a(b.a, list, ☃, k, n, m, i, j, bool);
/* 160 */           a(b.b, list, ☃, k, n, m, i, j, bool);
/* 161 */           a(b.c, list, ☃, k, n, m, i, j, bool);
/* 162 */           a(b.d, list, ☃, k, n, m, i, j, bool);
/*     */         } 
/*     */       } 
/*     */     } 
/* 166 */     return list;
/*     */   }
/*     */   
/*     */   private void a(b ☃, List<a> list, ekc ekc1, int i, int j, int k, int m, int n, boolean bool) {
/* 170 */     boolean bool1 = (a(ekc1, i, j + ☃.b(), k + ☃.c(), m, n) && bool);
/* 171 */     if (bool1) {
/* 172 */       a(list, ☃, j, k);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(List<a> ☃, b b1, int i, int j) {
/* 177 */     a a = null;
/* 178 */     for (a a1 : ☃) {
/* 179 */       if (a1.a() != b1) {
/*     */         continue;
/*     */       }
/*     */       
/* 183 */       int n = b.a(b1) ? j : i;
/*     */       
/* 185 */       if (a1.d() == n) {
/* 186 */         a = a1;
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/* 191 */     int k = b.a(b1) ? j : i;
/* 192 */     int m = b.a(b1) ? i : j;
/* 193 */     if (a == null) {
/* 194 */       ☃.add(new a(b1, m, k));
/*     */     } else {
/* 196 */       a.a(m);
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean a(ekc ☃, int i, int j, int k, int m, int n) {
/* 201 */     if (j < 0 || k < 0 || j >= m || k >= n) {
/* 202 */       return true;
/*     */     }
/* 204 */     return ☃.a(i, j, k);
/*     */   }
/*     */   
/*     */   enum b
/*     */   {
/* 209 */     a((String)gc.b, 0, -1),
/* 210 */     b((String)gc.a, 0, 1),
/* 211 */     c((String)gc.f, -1, 0),
/* 212 */     d((String)gc.e, 1, 0);
/*     */     
/*     */     private final gc e;
/*     */     private final int f;
/*     */     private final int g;
/*     */     
/*     */     b(gc ☃, int i, int j) {
/* 219 */       this.e = ☃;
/* 220 */       this.f = i;
/* 221 */       this.g = j;
/*     */     }
/*     */     
/*     */     public gc a() {
/* 225 */       return this.e;
/*     */     }
/*     */     
/*     */     public int b() {
/* 229 */       return this.f;
/*     */     }
/*     */     
/*     */     public int c() {
/* 233 */       return this.g;
/*     */     }
/*     */     
/*     */     private boolean d() {
/* 237 */       return (this == b || this == a);
/*     */     }
/*     */   }
/*     */   
/*     */   static class a
/*     */   {
/*     */     private final ebi.b a;
/*     */     private int b;
/*     */     private int c;
/*     */     private final int d;
/*     */     
/*     */     public a(ebi.b ☃, int i, int j) {
/* 249 */       this.a = ☃;
/* 250 */       this.b = i;
/* 251 */       this.c = i;
/* 252 */       this.d = j;
/*     */     }
/*     */     
/*     */     public void a(int ☃) {
/* 256 */       if (☃ < this.b) {
/* 257 */         this.b = ☃;
/* 258 */       } else if (☃ > this.c) {
/* 259 */         this.c = ☃;
/*     */       } 
/*     */     }
/*     */     
/*     */     public ebi.b a() {
/* 264 */       return this.a;
/*     */     }
/*     */     
/*     */     public int b() {
/* 268 */       return this.b;
/*     */     }
/*     */     
/*     */     public int c() {
/* 272 */       return this.c;
/*     */     }
/*     */     
/*     */     public int d() {
/* 276 */       return this.d;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ebi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */