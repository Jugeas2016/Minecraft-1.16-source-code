/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.stream.Stream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class iz
/*     */ {
/*  15 */   private final Map<ja, vk> a = Maps.newHashMap();
/*  16 */   private final Set<ja> b = Sets.newHashSet();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public iz a(ja ☃, vk vk1) {
/*  22 */     this.a.put(☃, vk1);
/*  23 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Stream<ja> a() {
/*  33 */     return this.b.stream();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public iz b(ja ☃, ja ja1) {
/*  42 */     this.a.put(ja1, this.a.get(☃));
/*  43 */     this.b.add(ja1);
/*  44 */     return this;
/*     */   }
/*     */   
/*     */   public vk a(ja ☃) {
/*  48 */     ja ja1 = ☃;
/*  49 */     while (ja1 != null) {
/*  50 */       vk vk = this.a.get(ja1);
/*  51 */       if (vk != null) {
/*  52 */         return vk;
/*     */       }
/*  54 */       ja1 = ja1.b();
/*     */     } 
/*  56 */     throw new IllegalStateException("Can't find texture for slot " + ☃);
/*     */   }
/*     */   
/*     */   public iz c(ja ☃, vk vk1) {
/*  60 */     iz iz1 = new iz();
/*  61 */     iz1.a.putAll(this.a);
/*  62 */     iz1.b.addAll(this.b);
/*  63 */     iz1.a(☃, vk1);
/*  64 */     return iz1;
/*     */   }
/*     */   
/*     */   public static iz a(buo ☃) {
/*  68 */     vk vk = C(☃);
/*  69 */     return b(vk);
/*     */   }
/*     */   
/*     */   public static iz b(buo ☃) {
/*  73 */     vk vk = C(☃);
/*  74 */     return a(vk);
/*     */   }
/*     */   
/*     */   public static iz a(vk ☃) {
/*  78 */     return (new iz()).a(ja.b, ☃);
/*     */   }
/*     */   
/*     */   public static iz b(vk ☃) {
/*  82 */     return (new iz()).a(ja.a, ☃);
/*     */   }
/*     */   
/*     */   public static iz c(buo ☃) {
/*  86 */     return d(ja.p, C(☃));
/*     */   }
/*     */   
/*     */   public static iz c(vk ☃) {
/*  90 */     return d(ja.p, ☃);
/*     */   }
/*     */   
/*     */   public static iz d(buo ☃) {
/*  94 */     return d(ja.q, C(☃));
/*     */   }
/*     */   
/*     */   public static iz d(vk ☃) {
/*  98 */     return d(ja.q, ☃);
/*     */   }
/*     */   
/*     */   public static iz e(buo ☃) {
/* 102 */     return d(ja.s, C(☃));
/*     */   }
/*     */   
/*     */   public static iz e(vk ☃) {
/* 106 */     return d(ja.s, ☃);
/*     */   }
/*     */   
/*     */   public static iz f(buo ☃) {
/* 110 */     return d(ja.t, C(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static iz g(buo ☃) {
/* 118 */     return d(ja.y, C(☃));
/*     */   }
/*     */   
/*     */   public static iz a(buo ☃, buo buo1) {
/* 122 */     return (new iz())
/* 123 */       .a(ja.y, C(☃))
/* 124 */       .a(ja.z, C(buo1));
/*     */   }
/*     */ 
/*     */   
/*     */   public static iz h(buo ☃) {
/* 129 */     return d(ja.u, C(☃));
/*     */   }
/*     */   
/*     */   public static iz i(buo ☃) {
/* 133 */     return d(ja.x, C(☃));
/*     */   }
/*     */   
/*     */   public static iz g(vk ☃) {
/* 137 */     return d(ja.A, ☃);
/*     */   }
/*     */   
/*     */   public static iz b(buo ☃, buo buo1) {
/* 141 */     return (new iz()).a(ja.v, C(☃)).a(ja.w, a(buo1, "_top"));
/*     */   }
/*     */   
/*     */   public static iz d(ja ☃, vk vk1) {
/* 145 */     return (new iz()).a(☃, vk1);
/*     */   }
/*     */   
/*     */   public static iz j(buo ☃) {
/* 149 */     return (new iz())
/* 150 */       .a(ja.i, a(☃, "_side"))
/* 151 */       .a(ja.d, a(☃, "_top"));
/*     */   }
/*     */   
/*     */   public static iz k(buo ☃) {
/* 155 */     return (new iz())
/* 156 */       .a(ja.i, a(☃, "_side"))
/* 157 */       .a(ja.f, a(☃, "_top"));
/*     */   }
/*     */ 
/*     */   
/*     */   public static iz l(buo ☃) {
/* 162 */     return (new iz()).a(ja.i, C(☃)).a(ja.d, a(☃, "_top"));
/*     */   }
/*     */   
/*     */   public static iz a(vk ☃, vk vk1) {
/* 166 */     return (new iz()).a(ja.i, ☃).a(ja.d, vk1);
/*     */   }
/*     */   
/*     */   public static iz m(buo ☃) {
/* 170 */     return (new iz())
/* 171 */       .a(ja.i, a(☃, "_side"))
/* 172 */       .a(ja.f, a(☃, "_top"))
/* 173 */       .a(ja.e, a(☃, "_bottom"));
/*     */   }
/*     */   
/*     */   public static iz n(buo ☃) {
/* 177 */     vk vk = C(☃);
/* 178 */     return (new iz())
/* 179 */       .a(ja.r, vk)
/* 180 */       .a(ja.i, vk)
/* 181 */       .a(ja.f, a(☃, "_top"))
/* 182 */       .a(ja.e, a(☃, "_bottom"));
/*     */   }
/*     */   
/*     */   public static iz o(buo ☃) {
/* 186 */     vk vk = C(☃);
/* 187 */     return (new iz())
/* 188 */       .a(ja.r, vk)
/* 189 */       .a(ja.i, vk)
/* 190 */       .a(ja.d, a(☃, "_top"));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static iz p(buo ☃) {
/* 198 */     return (new iz()).a(ja.f, a(☃, "_top")).a(ja.e, a(☃, "_bottom"));
/*     */   }
/*     */   
/*     */   public static iz q(buo ☃) {
/* 202 */     return (new iz()).a(ja.c, C(☃));
/*     */   }
/*     */   
/*     */   public static iz h(vk ☃) {
/* 206 */     return (new iz()).a(ja.c, ☃);
/*     */   }
/*     */   
/*     */   public static iz r(buo ☃) {
/* 210 */     return (new iz()).a(ja.C, a(☃, "_0"));
/*     */   }
/*     */   
/*     */   public static iz s(buo ☃) {
/* 214 */     return (new iz()).a(ja.C, a(☃, "_1"));
/*     */   }
/*     */   
/*     */   public static iz t(buo ☃) {
/* 218 */     return (new iz()).a(ja.D, C(☃));
/*     */   }
/*     */   
/*     */   public static iz u(buo ☃) {
/* 222 */     return (new iz()).a(ja.G, C(☃));
/*     */   }
/*     */   
/*     */   public static iz i(vk ☃) {
/* 226 */     return (new iz()).a(ja.G, ☃);
/*     */   }
/*     */   
/*     */   public static iz a(blx ☃) {
/* 230 */     return (new iz()).a(ja.c, c(☃));
/*     */   }
/*     */   
/*     */   public static iz v(buo ☃) {
/* 234 */     return (new iz())
/* 235 */       .a(ja.i, a(☃, "_side"))
/* 236 */       .a(ja.g, a(☃, "_front"))
/* 237 */       .a(ja.h, a(☃, "_back"));
/*     */   }
/*     */   
/*     */   public static iz w(buo ☃) {
/* 241 */     return (new iz())
/* 242 */       .a(ja.i, a(☃, "_side"))
/* 243 */       .a(ja.g, a(☃, "_front"))
/* 244 */       .a(ja.f, a(☃, "_top"))
/* 245 */       .a(ja.e, a(☃, "_bottom"));
/*     */   }
/*     */   
/*     */   public static iz x(buo ☃) {
/* 249 */     return (new iz())
/* 250 */       .a(ja.i, a(☃, "_side"))
/* 251 */       .a(ja.g, a(☃, "_front"))
/* 252 */       .a(ja.f, a(☃, "_top"));
/*     */   }
/*     */   
/*     */   public static iz y(buo ☃) {
/* 256 */     return (new iz())
/* 257 */       .a(ja.i, a(☃, "_side"))
/* 258 */       .a(ja.g, a(☃, "_front"))
/* 259 */       .a(ja.d, a(☃, "_end"));
/*     */   }
/*     */   
/*     */   public static iz z(buo ☃) {
/* 263 */     return (new iz()).a(ja.f, a(☃, "_top"));
/*     */   }
/*     */   
/*     */   public static iz c(buo ☃, buo buo1) {
/* 267 */     return (new iz())
/* 268 */       .a(ja.c, a(☃, "_front"))
/* 269 */       .a(ja.o, C(buo1))
/* 270 */       .a(ja.n, a(☃, "_top"))
/* 271 */       .a(ja.j, a(☃, "_front"))
/* 272 */       .a(ja.l, a(☃, "_side"))
/* 273 */       .a(ja.k, a(☃, "_side"))
/* 274 */       .a(ja.m, a(☃, "_front"));
/*     */   }
/*     */ 
/*     */   
/*     */   public static iz d(buo ☃, buo buo1) {
/* 279 */     return (new iz())
/* 280 */       .a(ja.c, a(☃, "_front"))
/* 281 */       .a(ja.o, C(buo1))
/* 282 */       .a(ja.n, a(☃, "_top"))
/* 283 */       .a(ja.j, a(☃, "_front"))
/* 284 */       .a(ja.k, a(☃, "_front"))
/* 285 */       .a(ja.l, a(☃, "_side"))
/* 286 */       .a(ja.m, a(☃, "_side"));
/*     */   }
/*     */   
/*     */   public static iz A(buo ☃) {
/* 290 */     return (new iz())
/* 291 */       .a(ja.I, a(☃, "_log_lit"))
/* 292 */       .a(ja.C, a(☃, "_fire"));
/*     */   }
/*     */ 
/*     */   
/*     */   public static iz b(blx ☃) {
/* 297 */     return (new iz()).a(ja.H, c(☃));
/*     */   }
/*     */   
/*     */   public static iz B(buo ☃) {
/* 301 */     return (new iz()).a(ja.H, C(☃));
/*     */   }
/*     */   
/*     */   public static iz j(vk ☃) {
/* 305 */     return (new iz()).a(ja.H, ☃);
/*     */   }
/*     */   
/*     */   public static vk C(buo ☃) {
/* 309 */     vk vk = gm.Q.b(☃);
/* 310 */     return new vk(vk.b(), "block/" + vk.a());
/*     */   }
/*     */   
/*     */   public static vk a(buo ☃, String str) {
/* 314 */     vk vk = gm.Q.b(☃);
/* 315 */     return new vk(vk.b(), "block/" + vk.a() + str);
/*     */   }
/*     */   
/*     */   public static vk c(blx ☃) {
/* 319 */     vk vk = gm.T.b(☃);
/* 320 */     return new vk(vk.b(), "item/" + vk.a());
/*     */   }
/*     */   
/*     */   public static vk a(blx ☃, String str) {
/* 324 */     vk vk = gm.T.b(☃);
/* 325 */     return new vk(vk.b(), "item/" + vk.a() + str);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\iz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */