/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import it.unimi.dsi.fastutil.ints.IntArrayList;
/*     */ import it.unimi.dsi.fastutil.ints.IntList;
/*     */ import java.util.Collections;
/*     */ import java.util.EnumSet;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.CompletableFuture;
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
/*     */ public class cga
/*     */ {
/*  27 */   private static final EnumSet<chn.a> n = EnumSet.of(chn.a.c, chn.a.a);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  32 */   private static final EnumSet<chn.a> o = EnumSet.of(chn.a.d, chn.a.b, chn.a.e, chn.a.f);
/*     */ 
/*     */   
/*     */   private static final c p;
/*     */ 
/*     */   
/*     */   static {
/*  39 */     p = ((☃, aag1, csw1, aaj1, function, cfw1) -> {
/*     */         if (cfw1 instanceof cgp && !cfw1.k().b(☃))
/*     */           ((cgp)cfw1).a(☃); 
/*     */         return CompletableFuture.completedFuture(Either.left(cfw1));
/*     */       });
/*     */   }
/*     */   public static final cga b; public static final cga c; public static final cga d; public static final cga e; public static final cga f;
/*  46 */   public static final cga a = a("empty", (cga)null, -1, n, a.a, (☃, cfy1, list, cfw1) -> {
/*     */       
/*  48 */       }); public static final cga g; public static final cga h; public static final cga i; public static final cga j; public static final cga k; static { b = a("structure_starts", a, 0, n, a.a, (☃, aag1, cfy1, csw1, aaj1, function, list, cfw1) -> {
/*     */           if (!cfw1.k().b(☃)) {
/*     */             if (aag1.l().aX().A().b()) {
/*     */               cfy1.a(aag1.r(), aag1.a(), cfw1, csw1, aag1.C());
/*     */             }
/*     */             
/*     */             if (cfw1 instanceof cgp) {
/*     */               ((cgp)cfw1).a(☃);
/*     */             }
/*     */           } 
/*     */           
/*     */           return CompletableFuture.completedFuture(Either.left(cfw1));
/*     */         });
/*  61 */     c = a("structure_references", b, 8, n, a.a, (☃, cfy1, list, cfw1) -> {
/*     */           aam aam = new aam(☃, list);
/*     */           
/*     */           cfy1.a(aam, ☃.a().a(aam), cfw1);
/*     */         });
/*  66 */     d = a("biomes", c, 0, n, a.a, (☃, cfy1, list, cfw1) -> cfy1.a(☃.r().b(gm.ay), cfw1));
/*     */ 
/*     */     
/*  69 */     e = a("noise", d, 8, n, a.a, (☃, cfy1, list, cfw1) -> {
/*     */           aam aam = new aam(☃, list);
/*     */           
/*     */           cfy1.a(aam, ☃.a().a(aam), cfw1);
/*     */         });
/*  74 */     f = a("surface", e, 0, n, a.a, (☃, cfy1, list, cfw1) -> cfy1.a(new aam(☃, list), cfw1));
/*     */ 
/*     */     
/*  77 */     g = a("carvers", f, 0, n, a.a, (☃, cfy1, list, cfw1) -> cfy1.a(☃.C(), ☃.d(), cfw1, chm.a.a));
/*     */ 
/*     */     
/*  80 */     h = a("liquid_carvers", g, 0, o, a.a, (☃, cfy1, list, cfw1) -> cfy1.a(☃.C(), ☃.d(), cfw1, chm.a.b));
/*     */ 
/*     */     
/*  83 */     i = a("features", h, 8, o, a.a, (☃, aag1, cfy1, csw1, aaj1, function, list, cfw1) -> {
/*     */           cgp cgp = (cgp)cfw1;
/*     */           cgp.a(aaj1);
/*     */           if (!cfw1.k().b(☃)) {
/*     */             chn.a(cfw1, EnumSet.of(chn.a.e, chn.a.f, chn.a.d, chn.a.b));
/*     */             aam aam = new aam(aag1, list);
/*     */             cfy1.a(aam, aag1.a().a(aam));
/*     */             cgp.a(☃);
/*     */           } 
/*     */           return CompletableFuture.completedFuture(Either.left(cfw1));
/*     */         });
/*  94 */     j = a("light", i, 1, o, a.a, (☃, aag1, cfy1, csw1, aaj1, function, list, cfw1) -> a(☃, aaj1, cfw1), (☃, aag1, csw1, aaj1, function, cfw1) -> a(☃, aaj1, cfw1));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 106 */     k = a("spawn", j, 0, o, a.a, (☃, cfy1, list, cfw1) -> cfy1.a(new aam(☃, list))); } private static CompletableFuture<Either<cfw, zr.a>> a(cga ☃, aaj aaj1, cfw cfw1) { boolean bool = a(☃, cfw1); if (!cfw1.k().b(☃))
/*     */       ((cgp)cfw1).a(☃); 
/*     */     return aaj1.a(cfw1, bool).thenApply(Either::left); }
/* 109 */   public static final cga l = a("heightmaps", k, 0, o, a.a, (☃, cfy1, list, cfw1) -> {
/*     */       
/* 111 */       }); public static final cga m; static { m = a("full", l, 0, o, a.b, (☃, aag1, cfy1, csw1, aaj1, function, list, cfw1) -> (CompletableFuture)function.apply(cfw1), (☃, aag1, csw1, aaj1, function, cfw1) -> (CompletableFuture)function.apply(cfw1)); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static cga a(String ☃, @Nullable cga cga1, int i, EnumSet<chn.a> enumSet, a a1, d d1) {
/* 117 */     return a(☃, cga1, i, enumSet, a1, d1);
/*     */   }
/*     */   
/*     */   private static cga a(String ☃, @Nullable cga cga1, int i, EnumSet<chn.a> enumSet, a a1, b b1) {
/* 121 */     return a(☃, cga1, i, enumSet, a1, b1, p);
/*     */   }
/*     */   
/*     */   private static cga a(String ☃, @Nullable cga cga1, int i, EnumSet<chn.a> enumSet, a a1, b b1, c c1) {
/* 125 */     return gm.<cga>a(gm.Z, ☃, new cga(☃, cga1, i, enumSet, a1, b1, c1));
/*     */   }
/*     */   
/*     */   public static List<cga> a() {
/* 129 */     List<cga> ☃ = Lists.newArrayList();
/* 130 */     cga cga1 = m;
/* 131 */     while (cga1.e() != cga1) {
/* 132 */       ☃.add(cga1);
/* 133 */       cga1 = cga1.e();
/*     */     } 
/* 135 */     ☃.add(cga1);
/* 136 */     Collections.reverse(☃);
/* 137 */     return ☃;
/*     */   }
/*     */   
/*     */   private static boolean a(cga ☃, cfw cfw1) {
/* 141 */     return (cfw1.k().b(☃) && cfw1.r());
/*     */   }
/*     */   
/* 144 */   private static final List<cga> q = (List<cga>)ImmutableList.of(m, i, h, b, b, b, b, b, b, b, b);
/*     */   
/*     */   private static final IntList r;
/*     */   
/*     */   private final String s;
/*     */   private final int t;
/*     */   private final cga u;
/*     */   private final b v;
/*     */   private final c w;
/*     */   private final int x;
/*     */   private final a y;
/*     */   private final EnumSet<chn.a> z;
/*     */   
/*     */   static {
/* 158 */     r = (IntList)x.a(new IntArrayList(a().size()), ☃ -> {
/*     */           int i = 0;
/*     */           for (int j = a().size() - 1; j >= 0; j--) {
/*     */             while (i + 1 < q.size() && j <= ((cga)q.get(i + 1)).c())
/*     */               i++; 
/*     */             ☃.add(0, i);
/*     */           } 
/*     */         });
/*     */   }
/*     */   
/*     */   public static cga a(int ☃) {
/* 169 */     if (☃ >= q.size()) {
/* 170 */       return a;
/*     */     }
/* 172 */     if (☃ < 0) {
/* 173 */       return m;
/*     */     }
/* 175 */     return q.get(☃);
/*     */   }
/*     */   
/*     */   public static int b() {
/* 179 */     return q.size();
/*     */   }
/*     */   
/*     */   public static int a(cga ☃) {
/* 183 */     return r.getInt(☃.c());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   cga(String ☃, @Nullable cga cga1, int i, EnumSet<chn.a> enumSet, a a1, b b1, c c1) {
/* 196 */     this.s = ☃;
/* 197 */     this.u = (cga1 == null) ? this : cga1;
/* 198 */     this.v = b1;
/* 199 */     this.w = c1;
/* 200 */     this.x = i;
/* 201 */     this.y = a1;
/* 202 */     this.z = enumSet;
/* 203 */     this.t = (cga1 == null) ? 0 : (cga1.c() + 1);
/*     */   }
/*     */   
/*     */   public int c() {
/* 207 */     return this.t;
/*     */   }
/*     */   
/*     */   public String d() {
/* 211 */     return this.s;
/*     */   }
/*     */   
/*     */   public cga e() {
/* 215 */     return this.u;
/*     */   }
/*     */   
/*     */   public CompletableFuture<Either<cfw, zr.a>> a(aag ☃, cfy cfy1, csw csw1, aaj aaj1, Function<cfw, CompletableFuture<Either<cfw, zr.a>>> function, List<cfw> list) {
/* 219 */     return this.v.doWork(this, ☃, cfy1, csw1, aaj1, function, list, list.get(list.size() / 2));
/*     */   }
/*     */   
/*     */   public CompletableFuture<Either<cfw, zr.a>> a(aag ☃, csw csw1, aaj aaj1, Function<cfw, CompletableFuture<Either<cfw, zr.a>>> function, cfw cfw1) {
/* 223 */     return this.w.doWork(this, ☃, csw1, aaj1, function, cfw1);
/*     */   }
/*     */   
/*     */   public int f() {
/* 227 */     return this.x;
/*     */   }
/*     */   
/*     */   public a g() {
/* 231 */     return this.y;
/*     */   }
/*     */   
/*     */   public static cga a(String ☃) {
/* 235 */     return gm.Z.a(vk.a(☃));
/*     */   }
/*     */   
/*     */   public EnumSet<chn.a> h() {
/* 239 */     return this.z;
/*     */   }
/*     */   
/*     */   public boolean b(cga ☃) {
/* 243 */     return (c() >= ☃.c());
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 248 */     return gm.Z.b(this).toString();
/*     */   }
/*     */   
/*     */   static interface b {
/*     */     CompletableFuture<Either<cfw, zr.a>> doWork(cga param1cga, aag param1aag, cfy param1cfy, csw param1csw, aaj param1aaj, Function<cfw, CompletableFuture<Either<cfw, zr.a>>> param1Function, List<cfw> param1List, cfw param1cfw);
/*     */   }
/*     */   
/*     */   static interface c {
/*     */     CompletableFuture<Either<cfw, zr.a>> doWork(cga param1cga, aag param1aag, csw param1csw, aaj param1aaj, Function<cfw, CompletableFuture<Either<cfw, zr.a>>> param1Function, cfw param1cfw);
/*     */   }
/*     */   
/*     */   static interface d
/*     */     extends b {
/*     */     default CompletableFuture<Either<cfw, zr.a>> doWork(cga ☃, aag aag1, cfy cfy1, csw csw1, aaj aaj1, Function<cfw, CompletableFuture<Either<cfw, zr.a>>> function, List<cfw> list, cfw cfw1) {
/* 262 */       if (!cfw1.k().b(☃)) {
/* 263 */         doWork(aag1, cfy1, list, cfw1);
/*     */         
/* 265 */         if (cfw1 instanceof cgp) {
/* 266 */           ((cgp)cfw1).a(☃);
/*     */         }
/*     */       } 
/* 269 */       return CompletableFuture.completedFuture(Either.left(cfw1));
/*     */     }
/*     */     
/*     */     void doWork(aag param1aag, cfy param1cfy, List<cfw> param1List, cfw param1cfw);
/*     */   }
/*     */   
/*     */   public enum a {
/* 276 */     a,
/* 277 */     b;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cga.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */