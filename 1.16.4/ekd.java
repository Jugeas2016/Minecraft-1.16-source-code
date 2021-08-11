/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.io.IOException;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.Executor;
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
/*     */ public class ekd
/*     */   implements acc, eke, AutoCloseable
/*     */ {
/*  30 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*  32 */   public static final vk a = new vk("");
/*     */   
/*  34 */   private final Map<vk, ejq> c = Maps.newHashMap();
/*     */   
/*  36 */   private final Set<eke> d = Sets.newHashSet();
/*  37 */   private final Map<String, Integer> e = Maps.newHashMap();
/*     */   
/*     */   private final ach f;
/*     */   
/*     */   public ekd(ach ☃) {
/*  42 */     this.f = ☃;
/*     */   }
/*     */   
/*     */   public void a(vk ☃) {
/*  46 */     if (!RenderSystem.isOnRenderThread()) {
/*  47 */       RenderSystem.recordRenderCall(() -> d(☃));
/*     */     }
/*     */     else {
/*     */       
/*  51 */       d(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void d(vk ☃) {
/*  56 */     ejq ejq = this.c.get(☃);
/*     */ 
/*     */     
/*  59 */     if (ejq == null) {
/*  60 */       ejq = new ejy(☃);
/*  61 */       a(☃, ejq);
/*     */     } 
/*     */     
/*  64 */     ejq.d();
/*     */   }
/*     */   
/*     */   public void a(vk ☃, ejq ejq1) {
/*  68 */     ejq1 = c(☃, ejq1);
/*     */     
/*  70 */     ejq ejq2 = this.c.put(☃, ejq1);
/*  71 */     if (ejq2 != ejq1) {
/*  72 */       if (ejq2 != null && ejq2 != ejv.c()) {
/*     */         
/*  74 */         this.d.remove(ejq2);
/*  75 */         b(☃, ejq2);
/*     */       } 
/*  77 */       if (ejq1 instanceof eke) {
/*  78 */         this.d.add((eke)ejq1);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void b(vk ☃, ejq ejq1) {
/*  84 */     if (ejq1 != ejv.c()) {
/*     */       try {
/*  86 */         ejq1.close();
/*  87 */       } catch (Exception exception) {
/*  88 */         b.warn("Failed to close texture {}", ☃, exception);
/*     */       } 
/*     */     }
/*  91 */     ejq1.c();
/*     */   }
/*     */   
/*     */   private ejq c(vk ☃, ejq ejq1) {
/*     */     try {
/*  96 */       ejq1.a(this.f);
/*  97 */       return ejq1;
/*  98 */     } catch (IOException iOException) {
/*  99 */       if (☃ != a) {
/* 100 */         b.warn("Failed to load texture: {}", ☃, iOException);
/*     */       }
/* 102 */       return ejv.c();
/* 103 */     } catch (Throwable throwable) {
/* 104 */       l l = l.a(throwable, "Registering texture");
/* 105 */       m m = l.a("Resource location being registered");
/* 106 */       m.a("Resource location", ☃);
/* 107 */       m.a("Texture object class", () -> ☃.getClass().getName());
/*     */       
/* 109 */       throw new u(l);
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ejq b(vk ☃) {
/* 115 */     return this.c.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public vk a(String ☃, ejs ejs1) {
/* 120 */     Integer integer = this.e.get(☃);
/* 121 */     if (integer == null) {
/* 122 */       integer = Integer.valueOf(1);
/*     */     } else {
/* 124 */       Integer integer1 = integer, integer2 = integer = Integer.valueOf(integer.intValue() + 1);
/*     */     } 
/* 126 */     this.e.put(☃, integer);
/*     */     
/* 128 */     vk vk1 = new vk(String.format("dynamic/%s_%d", new Object[] { ☃, integer }));
/* 129 */     a(vk1, ejs1);
/*     */     
/* 131 */     return vk1;
/*     */   }
/*     */   
/*     */   public CompletableFuture<Void> a(vk ☃, Executor executor) {
/* 135 */     if (!this.c.containsKey(☃)) {
/* 136 */       ejx ejx = new ejx(this.f, ☃, executor);
/* 137 */       this.c.put(☃, ejx);
/* 138 */       return ejx.a().thenRunAsync(() -> a(☃, ejx1), ekd::a);
/*     */     } 
/* 140 */     return CompletableFuture.completedFuture(null);
/*     */   }
/*     */   
/*     */   private static void a(Runnable ☃) {
/* 144 */     djz.C().execute(() -> RenderSystem.recordRenderCall(☃::run));
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 149 */     for (eke ☃ : this.d) {
/* 150 */       ☃.e();
/*     */     }
/*     */   }
/*     */   
/*     */   public void c(vk ☃) {
/* 155 */     ejq ejq = b(☃);
/* 156 */     if (ejq != null) {
/* 157 */       dex.a(ejq.b());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() {
/* 163 */     this.c.forEach(this::b);
/* 164 */     this.c.clear();
/* 165 */     this.d.clear();
/* 166 */     this.e.clear();
/*     */   }
/*     */ 
/*     */   
/*     */   public CompletableFuture<Void> a(acc.a ☃, ach ach1, anw anw1, anw anw2, Executor executor1, Executor executor2) {
/* 171 */     return CompletableFuture.allOf((CompletableFuture<?>[])new CompletableFuture[] {
/* 172 */           doy.a(this, executor1), 
/* 173 */           a(dlh.i, executor1)
/* 174 */         }).thenCompose(☃::a).thenAcceptAsync(void_ -> {
/*     */           ejv.c();
/*     */           dfw.a(this.f);
/*     */           Iterator<Map.Entry<vk, ejq>> iterator = this.c.entrySet().iterator();
/*     */           while (iterator.hasNext()) {
/*     */             Map.Entry<vk, ejq> entry = iterator.next();
/*     */             vk vk1 = entry.getKey();
/*     */             ejq ejq = entry.getValue();
/*     */             if (ejq == ejv.c() && !vk1.equals(ejv.a())) {
/*     */               iterator.remove();
/*     */               continue;
/*     */             } 
/*     */             ejq.a(this, ☃, vk1, executor);
/*     */           } 
/*     */         }☃ -> RenderSystem.recordRenderCall(☃::run));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ekd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */