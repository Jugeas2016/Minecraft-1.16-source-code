/*     */ import com.google.common.collect.Iterables;
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
/*     */ public class edc
/*     */   implements edh.a
/*     */ {
/*  40 */   private static final Logger a = LogManager.getLogger();
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
/*     */   private final djz b;
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
/*  83 */   private final Map<fx, b> c = Maps.newHashMap();
/*  84 */   private final Map<UUID, a> d = Maps.newHashMap();
/*     */   
/*     */   @Nullable
/*     */   private UUID e;
/*     */   
/*     */   public edc(djz ☃) {
/*  90 */     this.b = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/*  95 */     this.c.clear();
/*  96 */     this.d.clear();
/*  97 */     this.e = null;
/*     */   }
/*     */   
/*     */   public void a(b ☃) {
/* 101 */     this.c.put(☃.a, ☃);
/*     */   }
/*     */   
/*     */   public void a(fx ☃) {
/* 105 */     this.c.remove(☃);
/*     */   }
/*     */   
/*     */   public void a(fx ☃, int i) {
/* 109 */     b b = this.c.get(☃);
/* 110 */     if (b == null) {
/* 111 */       a.warn("Strange, setFreeTicketCount was called for an unknown POI: " + ☃);
/*     */       return;
/*     */     } 
/* 114 */     b.c = i;
/*     */   }
/*     */   
/*     */   public void a(a ☃) {
/* 118 */     this.d.put(☃.a, ☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, eag eag1, double d1, double d2, double d3) {
/* 127 */     RenderSystem.pushMatrix();
/* 128 */     RenderSystem.enableBlend();
/* 129 */     RenderSystem.defaultBlendFunc();
/* 130 */     RenderSystem.disableTexture();
/*     */     
/* 132 */     b();
/*     */     
/* 134 */     a(d1, d2, d3);
/*     */     
/* 136 */     RenderSystem.enableTexture();
/* 137 */     RenderSystem.disableBlend();
/* 138 */     RenderSystem.popMatrix();
/*     */     
/* 140 */     if (!this.b.s.a_()) {
/* 141 */       d();
/*     */     }
/*     */   }
/*     */   
/*     */   private void b() {
/* 146 */     this.d.entrySet().removeIf(☃ -> {
/*     */           aqa aqa = this.b.r.a(((a)☃.getValue()).b);
/* 148 */           return (aqa == null || aqa.y);
/*     */         });
/*     */   }
/*     */   
/*     */   private void a(double ☃, double d1, double d2) {
/* 153 */     fx fx = new fx(☃, d1, d2);
/*     */     
/* 155 */     this.d.values().forEach(a1 -> {
/*     */           if (c(a1)) {
/*     */             b(a1, ☃, d1, d2);
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 162 */     for (fx fx1 : this.c.keySet()) {
/* 163 */       if (fx.a(fx1, 30.0D)) {
/* 164 */         b(fx1);
/*     */       }
/*     */     } 
/*     */     
/* 168 */     this.c.values().forEach(b1 -> {
/*     */           if (☃.a(b1.a, 30.0D)) {
/*     */             b(b1);
/*     */           }
/*     */         });
/*     */     
/* 174 */     c().forEach((fx1, list) -> {
/*     */           if (☃.a(fx1, 30.0D)) {
/*     */             a(fx1, list);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   private static void b(fx ☃) {
/* 183 */     float f = 0.05F;
/* 184 */     RenderSystem.enableBlend();
/* 185 */     RenderSystem.defaultBlendFunc();
/* 186 */     edh.a(☃, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
/*     */   }
/*     */   
/*     */   private void a(fx ☃, List<String> list) {
/* 190 */     float f = 0.05F;
/* 191 */     RenderSystem.enableBlend();
/* 192 */     RenderSystem.defaultBlendFunc();
/* 193 */     edh.a(☃, 0.05F, 0.2F, 0.2F, 1.0F, 0.3F);
/* 194 */     a("" + list, ☃, 0, -256);
/* 195 */     a("Ghost POI", ☃, 1, -65536);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void b(b ☃) {
/* 201 */     int i = 0;
/* 202 */     Set<String> set1 = c(☃);
/* 203 */     if (set1.size() < 4) {
/* 204 */       a("Owners: " + set1, ☃, i, -256);
/*     */     } else {
/* 206 */       a("" + set1.size() + " ticket holders", ☃, i, -256);
/*     */     } 
/*     */     
/* 209 */     i++;
/*     */     
/* 211 */     Set<String> set2 = d(☃);
/* 212 */     if (set2.size() < 4) {
/* 213 */       a("Candidates: " + set2, ☃, i, -23296);
/*     */     } else {
/* 215 */       a("" + set2.size() + " potential owners", ☃, i, -23296);
/*     */     } 
/*     */     
/* 218 */     i++;
/* 219 */     a("Free tickets: " + ☃.c, ☃, i, -256);
/*     */     
/* 221 */     i++;
/* 222 */     a(☃.b, ☃, i, -1);
/*     */   }
/*     */   
/*     */   private void a(a ☃, double d1, double d2, double d3) {
/* 226 */     if (☃.j != null) {
/* 227 */       edn.a(☃.j, 0.5F, false, false, d1, d2, d3);
/*     */     }
/*     */   }
/*     */   
/*     */   private void b(a ☃, double d1, double d2, double d3) {
/* 232 */     boolean bool = b(☃);
/* 233 */     int i = 0;
/*     */ 
/*     */     
/* 236 */     a(☃.h, i, ☃.c, -1, 0.03F);
/* 237 */     i++;
/*     */ 
/*     */     
/* 240 */     if (bool) {
/* 241 */       a(☃.h, i, ☃.d + " " + ☃.e + " xp", -1, 0.02F);
/* 242 */       i++;
/*     */     } 
/*     */     
/* 245 */     if (bool) {
/* 246 */       int j = (☃.f < ☃.g) ? -23296 : -1;
/* 247 */       a(☃.h, i, "health: " + String.format("%.1f", new Object[] { Float.valueOf(☃.f) }) + " / " + String.format("%.1f", new Object[] { Float.valueOf(☃.g) }), j, 0.02F);
/* 248 */       i++;
/*     */     } 
/*     */     
/* 251 */     if (bool && 
/* 252 */       !☃.i.equals("")) {
/* 253 */       a(☃.h, i, ☃.i, -98404, 0.02F);
/* 254 */       i++;
/*     */     } 
/*     */ 
/*     */     
/* 258 */     if (bool) {
/* 259 */       for (String str : ☃.m) {
/* 260 */         a(☃.h, i, str, -16711681, 0.02F);
/* 261 */         i++;
/*     */       } 
/*     */     }
/* 264 */     if (bool) {
/* 265 */       for (String str : ☃.l) {
/* 266 */         a(☃.h, i, str, -16711936, 0.02F);
/* 267 */         i++;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 272 */     if (☃.k) {
/* 273 */       a(☃.h, i, "Wants Golem", -23296, 0.02F);
/* 274 */       i++;
/*     */     } 
/*     */ 
/*     */     
/* 278 */     if (bool) {
/* 279 */       for (String str : ☃.o) {
/* 280 */         if (str.startsWith(☃.c)) {
/* 281 */           a(☃.h, i, str, -1, 0.02F);
/*     */         } else {
/* 283 */           a(☃.h, i, str, -23296, 0.02F);
/*     */         } 
/* 285 */         i++;
/*     */       } 
/*     */     }
/*     */     
/* 289 */     if (bool) {
/* 290 */       for (String str : Lists.reverse(☃.n)) {
/* 291 */         a(☃.h, i, str, -3355444, 0.02F);
/* 292 */         i++;
/*     */       } 
/*     */     }
/*     */     
/* 296 */     if (bool) {
/* 297 */       a(☃, d1, d2, d3);
/*     */     }
/*     */   }
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
/*     */   private Set<String> c(b ☃) {
/* 334 */     return (Set<String>)c(☃.a)
/* 335 */       .stream()
/* 336 */       .map(ry::a)
/* 337 */       .collect(Collectors.toSet());
/*     */   }
/*     */ 
/*     */   
/*     */   private Set<String> d(b ☃) {
/* 342 */     return (Set<String>)d(☃.a)
/* 343 */       .stream()
/* 344 */       .map(ry::a)
/* 345 */       .collect(Collectors.toSet());
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean b(a ☃) {
/* 350 */     return Objects.equals(this.e, ☃.a);
/*     */   }
/*     */   
/*     */   private boolean c(a ☃) {
/* 354 */     bfw bfw = this.b.s;
/* 355 */     fx fx1 = new fx(bfw.cD(), ☃.h.b(), bfw.cH());
/* 356 */     fx fx2 = new fx(☃.h);
/* 357 */     return fx1.a(fx2, 30.0D);
/*     */   }
/*     */   
/*     */   private Collection<UUID> c(fx ☃) {
/* 361 */     return (Collection<UUID>)this.d.values()
/* 362 */       .stream()
/* 363 */       .filter(a1 -> a.b(a1, ☃))
/* 364 */       .map(a::a)
/* 365 */       .collect(Collectors.toSet());
/*     */   }
/*     */ 
/*     */   
/*     */   private Collection<UUID> d(fx ☃) {
/* 370 */     return (Collection<UUID>)this.d.values()
/* 371 */       .stream()
/* 372 */       .filter(a1 -> a.a(a1, ☃))
/* 373 */       .map(a::a)
/* 374 */       .collect(Collectors.toSet());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Map<fx, List<String>> c() {
/* 383 */     Map<fx, List<String>> ☃ = Maps.newHashMap();
/* 384 */     for (a a1 : this.d.values()) {
/* 385 */       for (fx fx : Iterables.concat(a1.p, a1.q)) {
/* 386 */         if (!this.c.containsKey(fx))
/*     */         {
/* 388 */           ((List<String>)☃.computeIfAbsent(fx, ☃ -> Lists.newArrayList())).add(a1.c);
/*     */         }
/*     */       } 
/*     */     } 
/* 392 */     return ☃;
/*     */   }
/*     */   
/*     */   private void d() {
/* 396 */     edh.a(this.b.aa(), 8).ifPresent(☃ -> this.e = ☃.bS());
/*     */   }
/*     */   
/*     */   public static class b {
/*     */     public final fx a;
/*     */     public String b;
/*     */     public int c;
/*     */     
/*     */     public b(fx ☃, String str, int i) {
/* 405 */       this.a = ☃;
/* 406 */       this.b = str;
/* 407 */       this.c = i;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static class a
/*     */   {
/*     */     public final UUID a;
/*     */     
/*     */     public final int b;
/*     */     public final String c;
/*     */     public final String d;
/*     */     public final int e;
/*     */     public final float f;
/*     */     public final float g;
/*     */     public final gk h;
/*     */     public final String i;
/*     */     public final cxd j;
/*     */     public final boolean k;
/* 426 */     public final List<String> l = Lists.newArrayList();
/* 427 */     public final List<String> m = Lists.newArrayList();
/* 428 */     public final List<String> n = Lists.newArrayList();
/* 429 */     public final List<String> o = Lists.newArrayList();
/* 430 */     public final Set<fx> p = Sets.newHashSet();
/* 431 */     public final Set<fx> q = Sets.newHashSet();
/*     */     
/*     */     public a(UUID ☃, int i, String str1, String str2, int j, float f1, float f2, gk gk1, String str3, @Nullable cxd cxd1, boolean bool) {
/* 434 */       this.a = ☃;
/* 435 */       this.b = i;
/* 436 */       this.c = str1;
/* 437 */       this.d = str2;
/* 438 */       this.e = j;
/* 439 */       this.f = f1;
/* 440 */       this.g = f2;
/* 441 */       this.h = gk1;
/* 442 */       this.i = str3;
/* 443 */       this.j = cxd1;
/* 444 */       this.k = bool;
/*     */     }
/*     */     
/*     */     private boolean a(fx ☃) {
/* 448 */       return this.p.stream().anyMatch(☃::equals);
/*     */     }
/*     */     
/*     */     private boolean b(fx ☃) {
/* 452 */       return this.q.contains(☃);
/*     */     }
/*     */     
/*     */     public UUID a() {
/* 456 */       return this.a;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\edc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */