/*     */ import com.google.common.base.Charsets;
/*     */ import com.google.common.collect.EvictingQueue;
/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Queues;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.Reader;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Queue;
/*     */ import java.util.Random;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.Executor;
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
/*     */ public class dyi
/*     */   implements acc
/*     */ {
/*  68 */   private static final List<dyk> b = (List<dyk>)ImmutableList.of(dyk.a, dyk.b, dyk.d, dyk.c, dyk.e);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected dwt a;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  78 */   private final Map<dyk, Queue<dyg>> c = Maps.newIdentityHashMap();
/*  79 */   private final Queue<dzd> d = Queues.newArrayDeque();
/*     */   private final ekd e;
/*  81 */   private final Random f = new Random();
/*  82 */   private final Int2ObjectMap<dyj<?>> g = (Int2ObjectMap<dyj<?>>)new Int2ObjectOpenHashMap();
/*  83 */   private final Queue<dyg> h = Queues.newArrayDeque();
/*  84 */   private final Map<vk, a> i = Maps.newHashMap();
/*     */   private final ekb j;
/*     */   
/*     */   class a
/*     */     implements dyw {
/*     */     private List<ekc> b;
/*     */     
/*     */     public ekc a(int ☃, int i) {
/*  92 */       return this.b.get(☃ * (this.b.size() - 1) / i);
/*     */     }
/*     */     private a(dyi this$0) {}
/*     */     
/*     */     public ekc a(Random ☃) {
/*  97 */       return this.b.get(☃.nextInt(this.b.size()));
/*     */     }
/*     */     
/*     */     public void a(List<ekc> ☃) {
/* 101 */       this.b = (List<ekc>)ImmutableList.copyOf(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public dyi(dwt ☃, ekd ekd1) {
/* 106 */     this.j = new ekb(ekb.e);
/* 107 */     ekd1.a(this.j.g(), this.j);
/*     */     
/* 109 */     this.a = ☃;
/* 110 */     this.e = ekd1;
/*     */     
/* 112 */     e();
/*     */   }
/*     */   
/*     */   private void e() {
/* 116 */     a(hh.a, a::new);
/* 117 */     a(hh.b, a::new);
/* 118 */     a(hh.c, new dxg.a());
/* 119 */     a(hh.d, new dza.a());
/* 120 */     a(hh.e, a::new);
/* 121 */     a(hh.ad, a::new);
/* 122 */     a(hh.ab, a::new);
/* 123 */     a(hh.ag, a::new);
/* 124 */     a(hh.ah, b::new);
/* 125 */     a(hh.f, a::new);
/* 126 */     a(hh.F, a::new);
/* 127 */     a(hh.g, c::new);
/* 128 */     a(hh.ac, a::new);
/* 129 */     a(hh.h, a::new);
/* 130 */     a(hh.i, a::new);
/* 131 */     a(hh.af, b::new);
/* 132 */     a(hh.j, k::new);
/* 133 */     a(hh.k, j::new);
/* 134 */     a(hh.l, l::new);
/* 135 */     a(hh.m, r::new);
/* 136 */     a(hh.n, q::new);
/* 137 */     a(hh.o, a::new);
/* 138 */     a(hh.p, d::new);
/* 139 */     a(hh.q, new dyd.a());
/* 140 */     a(hh.r, b::new);
/* 141 */     a(hh.s, b::new);
/* 142 */     a(hh.t, a::new);
/* 143 */     a(hh.u, c::new);
/* 144 */     a(hh.v, new dxz.a());
/* 145 */     a(hh.w, a::new);
/* 146 */     a(hh.x, a::new);
/* 147 */     a(hh.y, d::new);
/* 148 */     a(hh.z, a::new);
/* 149 */     a(hh.A, a::new);
/* 150 */     a(hh.C, a::new);
/* 151 */     a(hh.B, a::new);
/* 152 */     a(hh.D, a::new);
/* 153 */     a(hh.E, c::new);
/* 154 */     a(hh.G, b::new);
/* 155 */     a(hh.H, b::new);
/* 156 */     a(hh.I, new dxi.a());
/* 157 */     a(hh.J, new dxi.b());
/* 158 */     a(hh.K, new dxi.c());
/* 159 */     a(hh.L, a::new);
/* 160 */     a(hh.M, a::new);
/* 161 */     a(hh.N, d::new);
/* 162 */     a(hh.ae, a::new);
/* 163 */     a(hh.O, a::new);
/* 164 */     a(hh.P, a::new);
/* 165 */     a(hh.Q, a::new);
/* 166 */     a(hh.R, a::new);
/* 167 */     a(hh.S, a::new);
/* 168 */     a(hh.T, b::new);
/* 169 */     a(hh.U, a::new);
/* 170 */     a(hh.W, a::new);
/* 171 */     a(hh.X, a::new);
/* 172 */     a(hh.V, a::new);
/* 173 */     a(hh.Y, b::new);
/* 174 */     a(hh.Z, a::new);
/* 175 */     a(hh.aa, e::new);
/* 176 */     a(hh.ai, h::new);
/* 177 */     a(hh.aj, g::new);
/* 178 */     a(hh.ak, i::new);
/* 179 */     a(hh.al, m::new);
/* 180 */     a(hh.am, a::new);
/* 181 */     a(hh.an, a::new);
/* 182 */     a(hh.ao, c::new);
/* 183 */     a(hh.ap, o::new);
/* 184 */     a(hh.aq, n::new);
/* 185 */     a(hh.ar, p::new);
/* 186 */     a(hh.as, a::new);
/* 187 */     a(hh.at, a::new);
/*     */   }
/*     */   
/*     */   private <T extends hf> void a(hg<T> ☃, dyj<T> dyj1) {
/* 191 */     this.g.put(gm.V.a(☃), dyj1);
/*     */   }
/*     */   
/*     */   private <T extends hf> void a(hg<T> ☃, b<T> b1) {
/* 195 */     a a = new a();
/* 196 */     this.i.put(gm.V.b(☃), a);
/* 197 */     this.g.put(gm.V.a(☃), b1.create(a));
/*     */   }
/*     */ 
/*     */   
/*     */   public CompletableFuture<Void> a(acc.a ☃, ach ach1, anw anw1, anw anw2, Executor executor1, Executor executor2) {
/* 202 */     Map<vk, List<vk>> map = Maps.newConcurrentMap();
/*     */ 
/*     */ 
/*     */     
/* 206 */     CompletableFuture[] arrayOfCompletableFuture = (CompletableFuture[])gm.V.c().stream().map(vk1 -> CompletableFuture.runAsync((), executor)).toArray(☃ -> new CompletableFuture[☃]);
/*     */     
/* 208 */     return CompletableFuture.allOf((CompletableFuture<?>[])arrayOfCompletableFuture)
/* 209 */       .thenApplyAsync(void_ -> {
/*     */           ☃.a();
/*     */           
/*     */           ☃.a("stitching");
/*     */           ekb.a a = this.j.a(ach1, map.values().stream().flatMap(Collection::stream), ☃, 0);
/*     */           ☃.c();
/*     */           ☃.b();
/*     */           return a;
/* 217 */         }executor1).thenCompose(☃::a)
/* 218 */       .thenAcceptAsync(a1 -> {
/*     */           this.c.clear();
/*     */           ☃.a();
/*     */           ☃.a("upload");
/*     */           this.j.a(a1);
/*     */           ☃.b("bindSpriteSets");
/*     */           ekc ekc = this.j.a(ejv.a());
/*     */           map.forEach(());
/*     */           ☃.c();
/*     */           ☃.b();
/*     */         }executor2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a() {
/* 237 */     this.j.f();
/*     */   }
/*     */   
/*     */   private void a(ach ☃, vk vk1, Map<vk, List<vk>> map) {
/* 241 */     vk vk2 = new vk(vk1.b(), "particles/" + vk1.a() + ".json");
/* 242 */     try(acg ☃ = ☃.a(vk2); 
/* 243 */         Reader ☃ = new InputStreamReader(acg.b(), Charsets.UTF_8)) {
/* 244 */       dyh dyh = dyh.a(afd.a(reader));
/*     */       
/* 246 */       List<vk> list = dyh.a();
/* 247 */       boolean bool = this.i.containsKey(vk1);
/* 248 */       if (list == null) {
/* 249 */         if (bool) {
/* 250 */           throw new IllegalStateException("Missing texture list for particle " + vk1);
/*     */         }
/*     */       } else {
/* 253 */         if (!bool) {
/* 254 */           throw new IllegalStateException("Redundant texture list for particle " + vk1);
/*     */         }
/* 256 */         map.put(vk1, (List<vk>)list.stream().map(☃ -> new vk(☃.b(), "particle/" + ☃.a())).collect(Collectors.toList()));
/*     */       } 
/* 258 */     } catch (IOException iOException) {
/* 259 */       throw new IllegalStateException("Failed to load description for particle " + vk1, iOException);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(aqa ☃, hf hf1) {
/* 264 */     this.d.add(new dzd(this.a, ☃, hf1));
/*     */   }
/*     */   
/*     */   public void a(aqa ☃, hf hf1, int i) {
/* 268 */     this.d.add(new dzd(this.a, ☃, hf1, i));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public dyg a(hf ☃, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 273 */     dyg dyg = b(☃, d1, d2, d3, d4, d5, d6);
/* 274 */     if (dyg != null) {
/* 275 */       a(dyg);
/* 276 */       return dyg;
/*     */     } 
/* 278 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private <T extends hf> dyg b(T ☃, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 284 */     dyj<T> dyj = (dyj<T>)this.g.get(gm.V.a(☃.b()));
/* 285 */     if (dyj == null) {
/* 286 */       return null;
/*     */     }
/* 288 */     return dyj.a(☃, this.a, d1, d2, d3, d4, d5, d6);
/*     */   }
/*     */   
/*     */   public void a(dyg ☃) {
/* 292 */     this.h.add(☃);
/*     */   }
/*     */   
/*     */   public void b() {
/* 296 */     this.c.forEach((☃, queue) -> {
/*     */           this.a.Z().a(☃.toString());
/*     */           
/*     */           a(queue);
/*     */           this.a.Z().c();
/*     */         });
/* 302 */     if (!this.d.isEmpty()) {
/* 303 */       List<dzd> ☃ = Lists.newArrayList();
/* 304 */       for (dzd dzd : this.d) {
/* 305 */         dzd.a();
/* 306 */         if (!dzd.l()) {
/* 307 */           ☃.add(dzd);
/*     */         }
/*     */       } 
/* 310 */       this.d.removeAll(☃);
/*     */     } 
/*     */     
/* 313 */     if (!this.h.isEmpty()) {
/*     */       dyg ☃;
/* 315 */       while ((☃ = this.h.poll()) != null) {
/* 316 */         ((Queue<dyg>)this.c.computeIfAbsent(☃.b(), ☃ -> EvictingQueue.create(16384))).add(☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(Collection<dyg> ☃) {
/* 322 */     if (!☃.isEmpty()) {
/* 323 */       for (Iterator<dyg> iterator = ☃.iterator(); iterator.hasNext(); ) {
/* 324 */         dyg dyg = iterator.next();
/* 325 */         b(dyg);
/*     */         
/* 327 */         if (!dyg.l()) {
/* 328 */           iterator.remove();
/*     */         }
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private void b(dyg ☃) {
/*     */     try {
/* 336 */       ☃.a();
/* 337 */     } catch (Throwable throwable) {
/* 338 */       l l = l.a(throwable, "Ticking Particle");
/* 339 */       m m = l.a("Particle being ticked");
/* 340 */       m.a("Particle", ☃::toString);
/* 341 */       m.a("Particle Type", ☃.b()::toString);
/*     */       
/* 343 */       throw new u(l);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(dfm ☃, eag.a a1, eaf eaf1, djk djk1, float f) {
/* 348 */     eaf1.c();
/* 349 */     RenderSystem.enableAlphaTest();
/* 350 */     RenderSystem.defaultAlphaFunc();
/* 351 */     RenderSystem.enableDepthTest();
/* 352 */     RenderSystem.enableFog();
/*     */     
/* 354 */     RenderSystem.pushMatrix();
/* 355 */     RenderSystem.multMatrix(☃.c().a());
/* 356 */     for (dyk dyk : b) {
/* 357 */       Iterable<dyg> iterable = this.c.get(dyk);
/* 358 */       if (iterable == null) {
/*     */         continue;
/*     */       }
/*     */       
/* 362 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */       
/* 364 */       dfo dfo = dfo.a();
/* 365 */       dfh dfh = dfo.c();
/* 366 */       dyk.a(dfh, this.e);
/* 367 */       for (dyg dyg : iterable) {
/*     */         try {
/* 369 */           dyg.a(dfh, djk1, f);
/* 370 */         } catch (Throwable throwable) {
/* 371 */           l l = l.a(throwable, "Rendering Particle");
/* 372 */           m m = l.a("Particle being rendered");
/* 373 */           m.a("Particle", dyg::toString);
/* 374 */           m.a("Particle Type", dyk::toString);
/* 375 */           throw new u(l);
/*     */         } 
/*     */       } 
/* 378 */       dyk.a(dfo);
/*     */     } 
/*     */     
/* 381 */     RenderSystem.popMatrix();
/* 382 */     RenderSystem.depthMask(true);
/* 383 */     RenderSystem.depthFunc(515);
/* 384 */     RenderSystem.disableBlend();
/* 385 */     RenderSystem.defaultAlphaFunc();
/* 386 */     eaf1.b();
/* 387 */     RenderSystem.disableFog();
/*     */   }
/*     */   
/*     */   public void a(@Nullable dwt ☃) {
/* 391 */     this.a = ☃;
/* 392 */     this.c.clear();
/* 393 */     this.d.clear();
/*     */   }
/*     */   
/*     */   public void a(fx ☃, ceh ceh1) {
/* 397 */     if (ceh1.g()) {
/*     */       return;
/*     */     }
/*     */     
/* 401 */     ddh ddh = ceh1.j(this.a, ☃);
/*     */     
/* 403 */     double d = 0.25D;
/*     */ 
/*     */     
/* 406 */     ddh.b((d1, d2, d3, d4, d5, d6) -> {
/*     */           double d7 = Math.min(1.0D, d4 - d1);
/*     */           double d8 = Math.min(1.0D, d5 - d2);
/*     */           double d9 = Math.min(1.0D, d6 - d3);
/*     */           int i = Math.max(2, afm.f(d7 / 0.25D));
/*     */           int j = Math.max(2, afm.f(d8 / 0.25D));
/*     */           int k = Math.max(2, afm.f(d9 / 0.25D));
/*     */           for (int m = 0; m < i; m++) {
/*     */             for (int n = 0; n < j; n++) {
/*     */               for (int i1 = 0; i1 < k; i1++) {
/*     */                 double d10 = (m + 0.5D) / i;
/*     */                 double d11 = (n + 0.5D) / j;
/*     */                 double d12 = (i1 + 0.5D) / k;
/*     */                 double d13 = d10 * d7 + d1;
/*     */                 double d14 = d11 * d8 + d2;
/*     */                 double d15 = d12 * d9 + d3;
/*     */                 a((new dza(this.a, ☃.u() + d13, ☃.v() + d14, ☃.w() + d15, d10 - 0.5D, d11 - 0.5D, d12 - 0.5D, ceh1)).a(☃));
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(fx ☃, gc gc1) {
/* 434 */     ceh ceh = this.a.d_(☃);
/* 435 */     if (ceh.h() == bzh.a) {
/*     */       return;
/*     */     }
/*     */     
/* 439 */     int i = ☃.u();
/* 440 */     int j = ☃.v();
/* 441 */     int k = ☃.w();
/*     */     
/* 443 */     float f = 0.1F;
/*     */     
/* 445 */     dci dci = ceh.j(this.a, ☃).a();
/* 446 */     double d1 = i + this.f.nextDouble() * (dci.d - dci.a - 0.20000000298023224D) + 0.10000000149011612D + dci.a;
/* 447 */     double d2 = j + this.f.nextDouble() * (dci.e - dci.b - 0.20000000298023224D) + 0.10000000149011612D + dci.b;
/* 448 */     double d3 = k + this.f.nextDouble() * (dci.f - dci.c - 0.20000000298023224D) + 0.10000000149011612D + dci.c;
/*     */ 
/*     */     
/* 451 */     if (gc1 == gc.a) {
/* 452 */       d2 = j + dci.b - 0.10000000149011612D;
/*     */     }
/* 454 */     if (gc1 == gc.b) {
/* 455 */       d2 = j + dci.e + 0.10000000149011612D;
/*     */     }
/* 457 */     if (gc1 == gc.c) {
/* 458 */       d3 = k + dci.c - 0.10000000149011612D;
/*     */     }
/* 460 */     if (gc1 == gc.d) {
/* 461 */       d3 = k + dci.f + 0.10000000149011612D;
/*     */     }
/* 463 */     if (gc1 == gc.e) {
/* 464 */       d1 = i + dci.a - 0.10000000149011612D;
/*     */     }
/* 466 */     if (gc1 == gc.f) {
/* 467 */       d1 = i + dci.d + 0.10000000149011612D;
/*     */     }
/*     */     
/* 470 */     a((new dza(this.a, d1, d2, d3, 0.0D, 0.0D, 0.0D, ceh)).a(☃).c(0.2F).d(0.6F));
/*     */   }
/*     */   
/*     */   public String d() {
/* 474 */     return String.valueOf(this.c.values().stream().mapToInt(Collection::size).sum());
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   static interface b<T extends hf> {
/*     */     dyj<T> create(dyw param1dyw);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dyi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */