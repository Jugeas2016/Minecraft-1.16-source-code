/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Set;
/*     */ import java.util.UUID;
/*     */ import java.util.stream.Collectors;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class edb
/*     */   implements edh.a
/*     */ {
/*     */   private final djz a;
/*  71 */   private final Map<fx, b> b = Maps.newHashMap();
/*  72 */   private final Map<UUID, a> c = Maps.newHashMap();
/*     */   
/*     */   private UUID d;
/*     */   
/*     */   public edb(djz ☃) {
/*  77 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/*  82 */     this.b.clear();
/*  83 */     this.c.clear();
/*  84 */     this.d = null;
/*     */   }
/*     */   
/*     */   public void a(b ☃) {
/*  88 */     this.b.put(☃.a, ☃);
/*     */   }
/*     */   
/*     */   public void a(a ☃) {
/*  92 */     this.c.put(☃.a, ☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, eag eag1, double d1, double d2, double d3) {
/* 101 */     RenderSystem.pushMatrix();
/* 102 */     RenderSystem.enableBlend();
/* 103 */     RenderSystem.defaultBlendFunc();
/* 104 */     RenderSystem.disableTexture();
/*     */     
/* 106 */     c();
/* 107 */     b();
/*     */     
/* 109 */     d();
/*     */     
/* 111 */     RenderSystem.enableTexture();
/* 112 */     RenderSystem.disableBlend();
/* 113 */     RenderSystem.popMatrix();
/*     */     
/* 115 */     if (!this.a.s.a_()) {
/* 116 */       i();
/*     */     }
/*     */   }
/*     */   
/*     */   private void b() {
/* 121 */     this.c.entrySet().removeIf(☃ -> (this.a.r.a(((a)☃.getValue()).b) == null));
/*     */   }
/*     */   
/*     */   private void c() {
/* 125 */     long ☃ = this.a.r.T() - 20L;
/* 126 */     this.b.entrySet().removeIf(entry -> (((b)entry.getValue()).f < ☃));
/*     */   }
/*     */   
/*     */   private void d() {
/* 130 */     fx ☃ = g().c();
/*     */     
/* 132 */     this.c.values().forEach(☃ -> {
/*     */           if (e(☃)) {
/*     */             c(☃);
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 139 */     f();
/*     */ 
/*     */ 
/*     */     
/* 143 */     for (fx fx : this.b.keySet()) {
/* 144 */       if (☃.a(fx, 30.0D)) {
/* 145 */         a(fx);
/*     */       }
/*     */     } 
/*     */     
/* 149 */     Map<fx, Set<UUID>> map = e();
/*     */     
/* 151 */     this.b.values().forEach(b1 -> {
/*     */           if (☃.a(b1.a, 30.0D)) {
/*     */             Set<UUID> set = (Set<UUID>)map.get(b1.a);
/*     */             
/*     */             a(b1, (set == null) ? Sets.newHashSet() : set);
/*     */           } 
/*     */         });
/* 158 */     h().forEach((fx1, list) -> {
/*     */           if (☃.a(fx1, 30.0D)) {
/*     */             a(fx1, list);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Map<fx, Set<UUID>> e() {
/* 170 */     Map<fx, Set<UUID>> ☃ = Maps.newHashMap();
/*     */     
/* 172 */     this.c.values().forEach(a1 -> a1.i.forEach(()));
/*     */ 
/*     */     
/* 175 */     return ☃;
/*     */   }
/*     */   
/*     */   private void f() {
/* 179 */     Map<fx, Set<UUID>> ☃ = Maps.newHashMap();
/*     */     
/* 181 */     this.c.values().stream()
/* 182 */       .filter(a::c)
/* 183 */       .forEach(a1 -> ((Set<UUID>)☃.computeIfAbsent(a1.f, ())).add(a1.a()));
/*     */     
/* 185 */     ☃.entrySet().forEach(☃ -> {
/*     */           fx fx = (fx)☃.getKey();
/*     */           Set<UUID> set = (Set<UUID>)☃.getValue();
/*     */           Set<String> set1 = (Set<String>)set.stream().map(ry::a).collect(Collectors.toSet());
/*     */           int i = 1;
/*     */           a(set1.toString(), fx, i++, -256);
/*     */           a("Flower", fx, i++, -1);
/*     */           float f = 0.05F;
/*     */           a(fx, 0.05F, 0.8F, 0.8F, 0.0F, 0.3F);
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static String a(Collection<UUID> ☃) {
/* 200 */     if (☃.isEmpty())
/* 201 */       return "-"; 
/* 202 */     if (☃.size() > 3) {
/* 203 */       return "" + ☃.size() + " bees";
/*     */     }
/* 205 */     return ((Set)☃.stream().map(ry::a).collect(Collectors.toSet())).toString();
/*     */   }
/*     */ 
/*     */   
/*     */   private static void a(fx ☃) {
/* 210 */     float f = 0.05F;
/* 211 */     a(☃, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
/*     */   }
/*     */   
/*     */   private void a(fx ☃, List<String> list) {
/* 215 */     float f = 0.05F;
/* 216 */     a(☃, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
/* 217 */     a("" + list, ☃, 0, -256);
/* 218 */     a("Ghost Hive", ☃, 1, -65536);
/*     */   }
/*     */   
/*     */   private static void a(fx ☃, float f1, float f2, float f3, float f4, float f5) {
/* 222 */     RenderSystem.enableBlend();
/* 223 */     RenderSystem.defaultBlendFunc();
/* 224 */     edh.a(☃, f1, f2, f3, f4, f5);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(b ☃, Collection<UUID> collection) {
/* 230 */     int i = 0;
/*     */     
/* 232 */     if (!collection.isEmpty()) {
/* 233 */       a("Blacklisted by " + a(collection), ☃, i++, -65536);
/*     */     }
/*     */     
/* 236 */     a("Out: " + a(b(☃.a)), ☃, i++, -3355444);
/*     */     
/* 238 */     if (☃.c == 0) {
/* 239 */       a("In: -", ☃, i++, -256);
/* 240 */     } else if (☃.c == 1) {
/* 241 */       a("In: 1 bee", ☃, i++, -256);
/*     */     } else {
/* 243 */       a("In: " + ☃.c + " bees", ☃, i++, -256);
/*     */     } 
/*     */     
/* 246 */     a("Honey: " + ☃.d, ☃, i++, -23296);
/*     */     
/* 248 */     a(☃.b + (☃.e ? " (sedated)" : ""), ☃, i++, -1);
/*     */   }
/*     */   
/*     */   private void b(a ☃) {
/* 252 */     if (☃.d != null) {
/* 253 */       edn.a(☃.d, 0.5F, false, false, g().b().a(), g().b().b(), g().b().c());
/*     */     }
/*     */   }
/*     */   
/*     */   private void c(a ☃) {
/* 258 */     boolean bool = d(☃);
/*     */ 
/*     */     
/* 261 */     int i = 0;
/*     */ 
/*     */     
/* 264 */     a(☃.c, i++, ☃.toString(), -1, 0.03F);
/*     */ 
/*     */ 
/*     */     
/* 268 */     if (☃.e == null) {
/* 269 */       a(☃.c, i++, "No hive", -98404, 0.02F);
/*     */     } else {
/* 271 */       a(☃.c, i++, "Hive: " + a(☃, ☃.e), -256, 0.02F);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 276 */     if (☃.f == null) {
/* 277 */       a(☃.c, i++, "No flower", -98404, 0.02F);
/*     */     } else {
/* 279 */       a(☃.c, i++, "Flower: " + a(☃, ☃.f), -256, 0.02F);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 284 */     for (String str : ☃.h) {
/* 285 */       a(☃.c, i++, str, -16711936, 0.02F);
/*     */     }
/*     */ 
/*     */     
/* 289 */     if (bool) {
/* 290 */       b(☃);
/*     */     }
/*     */ 
/*     */     
/* 294 */     if (☃.g > 0) {
/* 295 */       int j = (☃.g < 600) ? -3355444 : -23296;
/* 296 */       a(☃.c, i++, "Travelling: " + ☃.g + " ticks", j, 0.02F);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static void a(String ☃, b b1, int i, int j) {
/* 302 */     fx fx = b1.a;
/* 303 */     a(☃, fx, i, j);
/*     */   }
/*     */   
/*     */   private static void a(String ☃, fx fx1, int i, int j) {
/* 307 */     double d1 = 1.3D;
/* 308 */     double d2 = 0.2D;
/*     */     
/* 310 */     double d3 = fx1.u() + 0.5D;
/* 311 */     double d4 = fx1.v() + 1.3D + i * 0.2D;
/* 312 */     double d5 = fx1.w() + 0.5D;
/*     */     
/* 314 */     edh.a(☃, d3, d4, d5, j, 0.02F, true, 0.0F, true);
/*     */   }
/*     */   
/*     */   private static void a(gk ☃, int i, String str, int j, float f) {
/* 318 */     double d1 = 2.4D;
/* 319 */     double d2 = 0.25D;
/*     */ 
/*     */ 
/*     */     
/* 323 */     fx fx = new fx(☃);
/*     */     
/* 325 */     double d3 = fx.u() + 0.5D;
/* 326 */     double d4 = ☃.b() + 2.4D + i * 0.25D;
/* 327 */     double d5 = fx.w() + 0.5D;
/*     */     
/* 329 */     float f1 = 0.5F;
/* 330 */     edh.a(str, d3, d4, d5, j, f, false, 0.5F, true);
/*     */   }
/*     */   
/*     */   private djk g() {
/* 334 */     return this.a.h.k();
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
/*     */   private String a(a ☃, fx fx1) {
/* 346 */     float f = afm.a(fx1.a(☃.c.a(), ☃.c.b(), ☃.c.c(), true));
/* 347 */     double d = Math.round(f * 10.0F) / 10.0D;
/* 348 */     return fx1.x() + " (dist " + d + ")";
/*     */   }
/*     */   
/*     */   private boolean d(a ☃) {
/* 352 */     return Objects.equals(this.d, ☃.a);
/*     */   }
/*     */   
/*     */   private boolean e(a ☃) {
/* 356 */     bfw bfw = this.a.s;
/* 357 */     fx fx1 = new fx(bfw.cD(), ☃.c.b(), bfw.cH());
/* 358 */     fx fx2 = new fx(☃.c);
/* 359 */     return fx1.a(fx2, 30.0D);
/*     */   }
/*     */   
/*     */   private Collection<UUID> b(fx ☃) {
/* 363 */     return (Collection<UUID>)this.c.values()
/* 364 */       .stream()
/* 365 */       .filter(a1 -> a1.a(☃))
/* 366 */       .map(a::a)
/* 367 */       .collect(Collectors.toSet());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Map<fx, List<String>> h() {
/* 376 */     Map<fx, List<String>> ☃ = Maps.newHashMap();
/* 377 */     for (a a1 : this.c.values()) {
/* 378 */       if (a1.e != null && !this.b.containsKey(a1.e))
/*     */       {
/* 380 */         ((List<String>)☃.computeIfAbsent(a1.e, ☃ -> Lists.newArrayList())).add(a1.b());
/*     */       }
/*     */     } 
/* 383 */     return ☃;
/*     */   }
/*     */   
/*     */   private void i() {
/* 387 */     edh.a(this.a.aa(), 8).ifPresent(☃ -> this.d = ☃.bS());
/*     */   }
/*     */   
/*     */   public static class b {
/*     */     public final fx a;
/*     */     public final String b;
/*     */     public final int c;
/*     */     public final int d;
/*     */     public final boolean e;
/*     */     public final long f;
/*     */     
/*     */     public b(fx ☃, String str, int i, int j, boolean bool, long l) {
/* 399 */       this.a = ☃;
/* 400 */       this.b = str;
/* 401 */       this.c = i;
/* 402 */       this.d = j;
/* 403 */       this.e = bool;
/* 404 */       this.f = l;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static class a
/*     */   {
/*     */     public final UUID a;
/*     */     
/*     */     public final int b;
/*     */     
/*     */     public final gk c;
/*     */     
/*     */     @Nullable
/*     */     public final cxd d;
/*     */     
/*     */     @Nullable
/*     */     public final fx e;
/*     */     
/*     */     @Nullable
/*     */     public final fx f;
/*     */     public final int g;
/* 426 */     public final List<String> h = Lists.newArrayList();
/* 427 */     public final Set<fx> i = Sets.newHashSet();
/*     */     
/*     */     public a(UUID ☃, int i, gk gk1, cxd cxd1, fx fx1, fx fx2, int j) {
/* 430 */       this.a = ☃;
/* 431 */       this.b = i;
/* 432 */       this.c = gk1;
/* 433 */       this.d = cxd1;
/* 434 */       this.e = fx1;
/* 435 */       this.f = fx2;
/* 436 */       this.g = j;
/*     */     }
/*     */     
/*     */     public boolean a(fx ☃) {
/* 440 */       return (this.e != null && this.e.equals(☃));
/*     */     }
/*     */     
/*     */     public UUID a() {
/* 444 */       return this.a;
/*     */     }
/*     */     
/*     */     public String b() {
/* 448 */       return ry.a(this.a);
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 453 */       return b();
/*     */     }
/*     */     
/*     */     public boolean c() {
/* 457 */       return (this.f != null);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\edb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */