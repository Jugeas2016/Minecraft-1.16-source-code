/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.io.IOException;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.ConcurrentLinkedQueue;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
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
/*     */ public class ekb
/*     */   extends ejq
/*     */   implements eke
/*     */ {
/*  38 */   private static final Logger f = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*  43 */   public static final vk d = biz.c;
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*  48 */   public static final vk e = new vk("textures/atlas/particles.png");
/*     */ 
/*     */   
/*  51 */   private final List<ekc> g = Lists.newArrayList();
/*  52 */   private final Set<vk> h = Sets.newHashSet();
/*  53 */   private final Map<vk, ekc> i = Maps.newHashMap();
/*     */   
/*     */   private final vk j;
/*     */   private final int k;
/*     */   
/*     */   public ekb(vk ☃) {
/*  59 */     this.j = ☃;
/*  60 */     this.k = RenderSystem.maxSupportedTextureSize();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ach ☃) throws IOException {}
/*     */ 
/*     */   
/*     */   public void a(a ☃) {
/*  69 */     this.h.clear();
/*  70 */     this.h.addAll(☃.a);
/*     */ 
/*     */     
/*  73 */     f.info("Created: {}x{}x{} {}-atlas", Integer.valueOf(☃.b), Integer.valueOf(☃.c), Integer.valueOf(☃.d), this.j);
/*  74 */     dex.a(b(), ☃.d, ☃.b, ☃.c);
/*     */     
/*  76 */     f();
/*     */     
/*  78 */     for (ekc ekc : ☃.e) {
/*  79 */       this.i.put(ekc.l(), ekc);
/*     */ 
/*     */       
/*     */       try {
/*  83 */         ekc.o();
/*  84 */       } catch (Throwable throwable) {
/*  85 */         l l = l.a(throwable, "Stitching texture atlas");
/*  86 */         m m = l.a("Texture being stitched together");
/*     */         
/*  88 */         m.a("Atlas path", this.j);
/*  89 */         m.a("Sprite", ekc);
/*     */         
/*  91 */         throw new u(l);
/*     */       } 
/*     */       
/*  94 */       if (ekc.r()) {
/*  95 */         this.g.add(ekc);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public a a(ach ☃, Stream<vk> stream, anw anw1, int i) {
/*     */     int i2;
/* 105 */     anw1.a("preparing");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 110 */     Set<vk> set = (Set<vk>)stream.peek(☃ -> { if (☃ == null) throw new IllegalArgumentException("Location cannot be null!");  }).collect(Collectors.toSet());
/*     */     
/* 112 */     int j = this.k;
/* 113 */     ejz ejz = new ejz(j, j, i);
/*     */     
/* 115 */     int k = Integer.MAX_VALUE;
/* 116 */     int m = 1 << i;
/*     */     
/* 118 */     anw1.b("extracting_frames");
/*     */     
/* 120 */     for (ekc.a a : a(☃, set)) {
/* 121 */       k = Math.min(k, Math.min(a.b(), a.c()));
/* 122 */       i2 = Math.min(Integer.lowestOneBit(a.b()), Integer.lowestOneBit(a.c()));
/* 123 */       if (i2 < m) {
/* 124 */         f.warn("Texture {} with size {}x{} limits mip level from {} to {}", a.a(), Integer.valueOf(a.b()), Integer.valueOf(a.c()), Integer.valueOf(afm.f(m)), Integer.valueOf(afm.f(i2)));
/* 125 */         m = i2;
/*     */       } 
/*     */       
/* 128 */       ejz.a(a);
/*     */     } 
/*     */ 
/*     */     
/* 132 */     int n = Math.min(k, m);
/* 133 */     int i1 = afm.f(n);
/*     */ 
/*     */     
/* 136 */     if (i1 < i) {
/* 137 */       f.warn("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", this.j, Integer.valueOf(i), Integer.valueOf(i1), Integer.valueOf(n));
/* 138 */       i2 = i1;
/*     */     } else {
/* 140 */       i2 = i;
/*     */     } 
/*     */ 
/*     */     
/* 144 */     anw1.b("register");
/* 145 */     ejz.a(ejv.b());
/*     */     
/* 147 */     anw1.b("stitching");
/*     */     
/*     */     try {
/* 150 */       ejz.c();
/* 151 */     } catch (eka eka) {
/* 152 */       l l = l.a(eka, "Stitching");
/* 153 */       m m1 = l.a("Stitcher");
/* 154 */       m1.a("Sprites", eka.a().stream().map(☃ -> String.format("%s[%dx%d]", new Object[] { ☃.a(), Integer.valueOf(☃.b()), Integer.valueOf(☃.c()) })).collect(Collectors.joining(",")));
/* 155 */       m1.a("Max Texture Size", Integer.valueOf(j));
/* 156 */       throw new u(l);
/*     */     } 
/*     */ 
/*     */     
/* 160 */     anw1.b("loading");
/* 161 */     List<ekc> list = a(☃, ejz, i2);
/*     */     
/* 163 */     anw1.c();
/* 164 */     return new a(set, ejz.a(), ejz.b(), i2, list);
/*     */   }
/*     */   
/*     */   private Collection<ekc.a> a(ach ☃, Set<vk> set) {
/* 168 */     List<CompletableFuture<?>> list = Lists.newArrayList();
/* 169 */     ConcurrentLinkedQueue<ekc.a> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
/*     */ 
/*     */     
/* 172 */     for (Iterator<vk> iterator = set.iterator(); iterator.hasNext(); ) { vk vk1 = iterator.next();
/* 173 */       if (ejv.a().equals(vk1)) {
/*     */         continue;
/*     */       }
/* 176 */       list.add(CompletableFuture.runAsync(() -> {
/*     */               ekc.a a;
/*     */               
/*     */               vk vk1 = b(☃);
/*     */               try (acg ☃ = ach1.a(vk1)) {
/*     */                 deu deu = new deu(acg.toString(), acg.b());
/*     */                 elc elc = acg.<elc>a(elc.a);
/*     */                 if (elc == null) {
/*     */                   elc = elc.b;
/*     */                 }
/*     */                 Pair<Integer, Integer> pair = elc.a(deu.a, deu.b);
/*     */                 a = new ekc.a(☃, ((Integer)pair.getFirst()).intValue(), ((Integer)pair.getSecond()).intValue(), elc);
/* 188 */               } catch (RuntimeException runtimeException) {
/*     */                 f.error("Unable to parse metadata from {} : {}", vk1, runtimeException);
/*     */                 return;
/* 191 */               } catch (IOException iOException) {
/*     */                 f.error("Using missing texture, unable to load {} : {}", vk1, iOException);
/*     */                 
/*     */                 return;
/*     */               } 
/*     */               concurrentLinkedQueue.add(a);
/* 197 */             }x.f())); }
/*     */     
/* 199 */     CompletableFuture.allOf((CompletableFuture<?>[])list.<CompletableFuture>toArray(new CompletableFuture[0])).join();
/* 200 */     return concurrentLinkedQueue;
/*     */   }
/*     */   
/*     */   private List<ekc> a(ach ☃, ejz ejz1, int i) {
/* 204 */     ConcurrentLinkedQueue<ekc> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
/* 205 */     List<CompletableFuture<?>> list = Lists.newArrayList();
/*     */     
/* 207 */     ejz1.a((a1, i, j, k, m) -> {
/*     */           if (a1 == ejv.b()) {
/*     */             ejv ejv = ejv.a(this, ☃, i, j, k, m);
/*     */ 
/*     */ 
/*     */             
/*     */             concurrentLinkedQueue.add(ejv);
/*     */           } else {
/*     */             list.add(CompletableFuture.runAsync((), x.f()));
/*     */           } 
/*     */         });
/*     */ 
/*     */ 
/*     */     
/* 221 */     CompletableFuture.allOf((CompletableFuture<?>[])list.<CompletableFuture>toArray(new CompletableFuture[0])).join();
/* 222 */     return Lists.newArrayList(concurrentLinkedQueue);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private ekc a(ach ☃, ekc.a a1, int i, int j, int k, int m, int n) {
/* 227 */     vk vk1 = b(a1.a());
/*     */     
/* 229 */     try (acg ☃ = ☃.a(vk1)) {
/* 230 */       det det = det.a(acg.b());
/* 231 */       return new ekc(this, a1, k, i, j, m, n, det);
/* 232 */     } catch (RuntimeException runtimeException) {
/* 233 */       f.error("Unable to parse metadata from {}", vk1, runtimeException);
/* 234 */       return null;
/* 235 */     } catch (IOException iOException) {
/* 236 */       f.error("Using missing texture, unable to load {}", vk1, iOException);
/* 237 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   private vk b(vk ☃) {
/* 242 */     return new vk(☃.b(), String.format("textures/%s%s", new Object[] { ☃.a(), ".png" }));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a() {
/* 251 */     d();
/* 252 */     for (ekc ☃ : this.g) {
/* 253 */       ☃.q();
/*     */     }
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
/*     */   public void e() {
/* 267 */     if (!RenderSystem.isOnRenderThread()) {
/* 268 */       RenderSystem.recordRenderCall(this::a);
/*     */     } else {
/* 270 */       a();
/*     */     } 
/*     */   }
/*     */   
/*     */   public ekc a(vk ☃) {
/* 275 */     ekc ekc = this.i.get(☃);
/* 276 */     if (ekc == null) {
/* 277 */       return this.i.get(ejv.a());
/*     */     }
/* 279 */     return ekc;
/*     */   }
/*     */   
/*     */   public void f() {
/* 283 */     for (ekc ☃ : this.i.values()) {
/* 284 */       ☃.close();
/*     */     }
/* 286 */     this.i.clear();
/* 287 */     this.g.clear();
/*     */   }
/*     */   
/*     */   public vk g() {
/* 291 */     return this.j;
/*     */   }
/*     */   
/*     */   public void b(a ☃) {
/* 295 */     a(false, (☃.d > 0));
/*     */   }
/*     */   
/*     */   public static class a {
/*     */     final Set<vk> a;
/*     */     final int b;
/*     */     final int c;
/*     */     final int d;
/*     */     final List<ekc> e;
/*     */     
/*     */     public a(Set<vk> ☃, int i, int j, int k, List<ekc> list) {
/* 306 */       this.a = ☃;
/* 307 */       this.b = i;
/* 308 */       this.c = j;
/* 309 */       this.d = k;
/* 310 */       this.e = list;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ekb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */