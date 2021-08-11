/*     */ import com.google.common.collect.HashMultimap;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Multimap;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.apache.logging.log4j.Marker;
/*     */ import org.apache.logging.log4j.MarkerManager;
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
/*     */ public class enr
/*     */ {
/*  38 */   private static final Marker a = MarkerManager.getMarker("SOUNDS");
/*  39 */   private static final Logger b = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  45 */   private static final Set<vk> c = Sets.newHashSet();
/*     */   
/*     */   private final enu d;
/*     */   
/*     */   private final dkd e;
/*     */   
/*     */   private boolean f;
/*     */   
/*  53 */   private final ddv g = new ddv();
/*  54 */   private final ddw h = this.g.c();
/*     */   
/*     */   private final enq i;
/*  57 */   private final ens j = new ens();
/*     */   
/*  59 */   private final enn k = new enn(this.g, this.j);
/*     */   
/*     */   private int l;
/*     */   
/*  63 */   private final Map<emt, enn.a> m = Maps.newHashMap();
/*  64 */   private final Multimap<adr, emt> n = (Multimap<adr, emt>)HashMultimap.create();
/*     */   
/*  66 */   private final List<emu> o = Lists.newArrayList();
/*  67 */   private final Map<emt, Integer> p = Maps.newHashMap();
/*  68 */   private final Map<emt, Integer> q = Maps.newHashMap();
/*  69 */   private final List<ent> r = Lists.newArrayList();
/*  70 */   private final List<emu> s = Lists.newArrayList();
/*     */   
/*  72 */   private final List<emq> t = Lists.newArrayList();
/*     */   
/*     */   public enr(enu ☃, dkd dkd1, ach ach1) {
/*  75 */     this.d = ☃;
/*  76 */     this.e = dkd1;
/*  77 */     this.i = new enq(ach1);
/*     */   }
/*     */   
/*     */   public void a() {
/*  81 */     c.clear();
/*  82 */     for (adp ☃ : gm.N) {
/*  83 */       vk vk = ☃.a();
/*  84 */       if (this.d.a(vk) == null) {
/*  85 */         b.warn("Missing sound for event: {}", gm.N.b(☃));
/*  86 */         c.add(vk);
/*     */       } 
/*     */     } 
/*  89 */     b();
/*  90 */     g();
/*     */   }
/*     */   
/*     */   private synchronized void g() {
/*  94 */     if (this.f) {
/*     */       return;
/*     */     }
/*     */     
/*     */     try {
/*  99 */       this.g.a();
/* 100 */       this.h.c();
/* 101 */       this.h.a(this.e.a(adr.a));
/* 102 */       this.i.a(this.t).thenRun(this.t::clear);
/* 103 */       this.f = true;
/* 104 */       b.info(a, "Sound engine started");
/* 105 */     } catch (RuntimeException ☃) {
/* 106 */       b.error(a, "Error starting SoundSystem. Turning off sounds & music", ☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private float a(@Nullable adr ☃) {
/* 111 */     if (☃ == null || ☃ == adr.a) {
/* 112 */       return 1.0F;
/*     */     }
/*     */     
/* 115 */     return this.e.a(☃);
/*     */   }
/*     */   
/*     */   public void a(adr ☃, float f) {
/* 119 */     if (!this.f) {
/*     */       return;
/*     */     }
/*     */     
/* 123 */     if (☃ == adr.a) {
/* 124 */       this.h.a(f);
/*     */       
/*     */       return;
/*     */     } 
/* 128 */     this.m.forEach((☃, a1) -> {
/*     */           float f = h(☃);
/*     */           a1.a(());
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() {
/* 142 */     if (this.f) {
/* 143 */       c();
/* 144 */       this.i.a();
/* 145 */       this.g.b();
/* 146 */       this.f = false;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(emt ☃) {
/* 151 */     if (this.f) {
/* 152 */       enn.a a = this.m.get(☃);
/* 153 */       if (a != null) {
/* 154 */         a.a(ddu::f);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void c() {
/* 160 */     if (this.f) {
/* 161 */       this.j.a();
/* 162 */       this.m.values().forEach(☃ -> ☃.a(ddu::f));
/* 163 */       this.m.clear();
/* 164 */       this.k.b();
/* 165 */       this.p.clear();
/* 166 */       this.o.clear();
/* 167 */       this.n.clear();
/* 168 */       this.q.clear();
/* 169 */       this.s.clear();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(ent ☃) {
/* 174 */     this.r.add(☃);
/*     */   }
/*     */   
/*     */   public void b(ent ☃) {
/* 178 */     this.r.remove(☃);
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 182 */     if (!☃) {
/* 183 */       h();
/*     */     }
/* 185 */     this.k.a();
/*     */   }
/*     */   
/*     */   private void h() {
/* 189 */     this.l++;
/*     */     
/* 191 */     this.s.stream().filter(emt::t).forEach(this::c);
/* 192 */     this.s.clear();
/*     */ 
/*     */     
/* 195 */     for (Iterator<emu> iterator = this.o.iterator(); iterator.hasNext(); ) { emu emu = iterator.next();
/* 196 */       if (!emu.t()) {
/* 197 */         a(emu);
/*     */       }
/* 199 */       emu.r();
/*     */       
/* 201 */       if (emu.n()) {
/* 202 */         a(emu); continue;
/*     */       } 
/* 204 */       float f1 = h(emu);
/* 205 */       float f2 = g(emu);
/* 206 */       dcn dcn = new dcn(emu.h(), emu.i(), emu.j());
/* 207 */       enn.a a = this.m.get(emu);
/* 208 */       if (a != null) {
/* 209 */         a.a(ddu1 -> {
/*     */               ddu1.b(☃);
/*     */               
/*     */               ddu1.a(f1);
/*     */               
/*     */               ddu1.a(dcn1);
/*     */             });
/*     */       } }
/*     */ 
/*     */     
/* 219 */     Iterator<Map.Entry<emt, enn.a>> ☃ = this.m.entrySet().iterator();
/* 220 */     while (☃.hasNext()) {
/* 221 */       Map.Entry<emt, enn.a> entry = ☃.next();
/*     */       
/* 223 */       enn.a a = entry.getValue();
/* 224 */       emt emt = entry.getKey();
/* 225 */       float f = this.e.a(emt.c());
/*     */       
/* 227 */       if (f <= 0.0F) {
/* 228 */         a.a(ddu::f);
/* 229 */         ☃.remove();
/*     */         
/*     */         continue;
/*     */       } 
/* 233 */       if (a.a()) {
/* 234 */         int i = ((Integer)this.q.get(emt)).intValue();
/* 235 */         if (i <= this.l) {
/* 236 */           if (e(emt)) {
/* 237 */             this.p.put(emt, Integer.valueOf(this.l + emt.e()));
/*     */           }
/* 239 */           ☃.remove();
/* 240 */           b.debug(a, "Removed channel {} because it's not playing anymore", a);
/* 241 */           this.q.remove(emt);
/*     */           
/*     */           try {
/* 244 */             this.n.remove(emt.c(), emt);
/* 245 */           } catch (RuntimeException runtimeException) {}
/*     */ 
/*     */ 
/*     */           
/* 249 */           if (emt instanceof emu) {
/* 250 */             this.o.remove(emt);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 256 */     Iterator<Map.Entry<emt, Integer>> iterator1 = this.p.entrySet().iterator();
/* 257 */     while (iterator1.hasNext()) {
/* 258 */       Map.Entry<emt, Integer> entry = iterator1.next();
/*     */       
/* 260 */       if (this.l >= ((Integer)entry.getValue()).intValue()) {
/* 261 */         emt emt = entry.getKey();
/*     */ 
/*     */         
/* 264 */         if (emt instanceof emu) {
/* 265 */           ((emu)emt).r();
/*     */         }
/*     */         
/* 268 */         c(emt);
/* 269 */         iterator1.remove();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static boolean d(emt ☃) {
/* 275 */     return (☃.e() > 0);
/*     */   }
/*     */   
/*     */   private static boolean e(emt ☃) {
/* 279 */     return (☃.d() && d(☃));
/*     */   }
/*     */   
/*     */   private static boolean f(emt ☃) {
/* 283 */     return (☃.d() && !d(☃));
/*     */   }
/*     */   
/*     */   public boolean b(emt ☃) {
/* 287 */     if (!this.f) {
/* 288 */       return false;
/*     */     }
/*     */     
/* 291 */     if (this.q.containsKey(☃) && ((Integer)this.q.get(☃)).intValue() <= this.l) {
/* 292 */       return true;
/*     */     }
/*     */     
/* 295 */     return this.m.containsKey(☃);
/*     */   }
/*     */   
/*     */   public void c(emt ☃) {
/* 299 */     if (!this.f) {
/*     */       return;
/*     */     }
/*     */     
/* 303 */     if (!☃.t()) {
/*     */       return;
/*     */     }
/*     */     
/* 307 */     env env = ☃.a(this.d);
/* 308 */     vk vk = ☃.a();
/* 309 */     if (env == null) {
/* 310 */       if (c.add(vk)) {
/* 311 */         b.warn(a, "Unable to play unknown soundEvent: {}", vk);
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */ 
/*     */     
/* 320 */     emq emq = ☃.b();
/* 321 */     if (emq == enu.a) {
/* 322 */       if (c.add(vk)) {
/* 323 */         b.warn(a, "Unable to play empty soundEvent: {}", vk);
/*     */       }
/*     */       
/*     */       return;
/*     */     } 
/* 328 */     float f1 = ☃.f();
/* 329 */     float f2 = Math.max(f1, 1.0F) * emq.j();
/*     */     
/* 331 */     adr adr = ☃.c();
/* 332 */     float f3 = h(☃);
/* 333 */     float f4 = g(☃);
/*     */     
/* 335 */     emt.a a = ☃.k();
/* 336 */     boolean bool1 = ☃.m();
/*     */     
/* 338 */     if (f3 == 0.0F && !☃.s()) {
/* 339 */       b.debug(a, "Skipped playing sound {}, volume was zero.", emq.a());
/*     */       
/*     */       return;
/*     */     } 
/* 343 */     dcn dcn = new dcn(☃.h(), ☃.i(), ☃.j());
/*     */     
/* 345 */     if (!this.r.isEmpty()) {
/* 346 */       boolean bool = (bool1 || a == emt.a.a || this.h.a().g(dcn) < (f2 * f2));
/* 347 */       if (bool) {
/* 348 */         for (ent ent : this.r) {
/* 349 */           ent.a(☃, env);
/*     */         }
/*     */       } else {
/* 352 */         b.debug(a, "Did not notify listeners of soundEvent: {}, it is too far away to hear", vk);
/*     */       } 
/*     */     } 
/*     */     
/* 356 */     if (this.h.b() <= 0.0F) {
/* 357 */       b.debug(a, "Skipped playing soundEvent: {}, master volume was zero", vk);
/*     */       
/*     */       return;
/*     */     } 
/* 361 */     boolean bool2 = f(☃);
/* 362 */     boolean bool3 = emq.h();
/*     */     
/* 364 */     CompletableFuture<enn.a> completableFuture = this.k.a(emq.h() ? ddv.c.b : ddv.c.a);
/* 365 */     enn.a a1 = completableFuture.join();
/* 366 */     if (a1 == null) {
/* 367 */       b.warn("Failed to create new sound handle");
/*     */       
/*     */       return;
/*     */     } 
/* 371 */     b.debug(a, "Playing sound {} for event {}", emq.a(), vk);
/*     */     
/* 373 */     this.q.put(☃, Integer.valueOf(this.l + 20));
/* 374 */     this.m.put(☃, a1);
/* 375 */     this.n.put(adr, ☃);
/*     */     
/* 377 */     a1.a(ddu1 -> {
/*     */           ddu1.a(☃);
/*     */           
/*     */           ddu1.b(f1);
/*     */           if (a1 == emt.a.b) {
/*     */             ddu1.c(f2);
/*     */           } else {
/*     */             ddu1.h();
/*     */           } 
/* 386 */           ddu1.a((bool1 && !bool2));
/*     */           
/*     */           ddu1.a(dcn1);
/*     */           ddu1.b(bool3);
/*     */         });
/* 391 */     if (!bool3) {
/* 392 */       this.i.a(emq.b())
/* 393 */         .thenAccept(ddz1 -> ☃.a(()));
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */       
/* 399 */       this.i.a(emq.b(), bool2)
/* 400 */         .thenAccept(enm1 -> ☃.a(()));
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 407 */     if (☃ instanceof emu) {
/* 408 */       this.o.add((emu)☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(emu ☃) {
/* 413 */     this.s.add(☃);
/*     */   }
/*     */   
/*     */   public void a(emq ☃) {
/* 417 */     this.t.add(☃);
/*     */   }
/*     */   
/*     */   private float g(emt ☃) {
/* 421 */     return afm.a(☃.g(), 0.5F, 2.0F);
/*     */   }
/*     */   
/*     */   private float h(emt ☃) {
/* 425 */     return afm.a(☃.f() * a(☃.c()), 0.0F, 1.0F);
/*     */   }
/*     */   
/*     */   public void d() {
/* 429 */     if (this.f) {
/* 430 */       this.k.a(☃ -> ☃.forEach(ddu::d));
/*     */     }
/*     */   }
/*     */   
/*     */   public void e() {
/* 435 */     if (this.f) {
/* 436 */       this.k.a(☃ -> ☃.forEach(ddu::e));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(emt ☃, int i) {
/* 441 */     this.p.put(☃, Integer.valueOf(this.l + i));
/*     */   }
/*     */   
/*     */   public void a(djk ☃) {
/* 445 */     if (!this.f || !☃.h()) {
/*     */       return;
/*     */     }
/*     */     
/* 449 */     dcn dcn = ☃.b();
/* 450 */     g g1 = ☃.l();
/* 451 */     g g2 = ☃.m();
/*     */     
/* 453 */     this.j.execute(() -> {
/*     */           this.h.a(☃);
/*     */           this.h.a(g1, g2);
/*     */         });
/*     */   }
/*     */   
/*     */   public void a(@Nullable vk ☃, @Nullable adr adr1) {
/* 460 */     if (adr1 != null) {
/* 461 */       for (emt emt : this.n.get(adr1)) {
/* 462 */         if (☃ == null || emt.a().equals(☃)) {
/* 463 */           a(emt);
/*     */         }
/*     */       }
/*     */     
/* 467 */     } else if (☃ == null) {
/* 468 */       c();
/*     */     } else {
/* 470 */       for (emt emt : this.m.keySet()) {
/* 471 */         if (emt.a().equals(☃)) {
/* 472 */           a(emt);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String f() {
/* 480 */     return this.g.d();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\enr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */