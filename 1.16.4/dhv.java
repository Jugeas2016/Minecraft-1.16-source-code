/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.util.concurrent.RateLimiter;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ import java.util.concurrent.locks.ReentrantLock;
/*     */ import java.util.stream.Collectors;
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
/*     */ public class dhv
/*     */   extends eoo
/*     */ {
/*  36 */   private static final Logger a = LogManager.getLogger();
/*  37 */   private static final ReentrantLock b = new ReentrantLock();
/*     */   
/*     */   private final dot c;
/*     */   
/*     */   private final dhd p;
/*     */   private final nr q;
/*     */   private final RateLimiter r;
/*     */   private dlj s;
/*     */   private final String t;
/*     */   private final a u;
/*     */   private volatile nr v;
/*  48 */   private volatile nr w = new of("mco.download.preparing");
/*     */   
/*     */   private volatile String x;
/*     */   
/*     */   private volatile boolean y;
/*     */   private volatile boolean z = true;
/*     */   private volatile boolean A;
/*     */   private volatile boolean B;
/*     */   private Long C;
/*     */   private Long D;
/*     */   private long E;
/*     */   private int F;
/*  60 */   private static final String[] G = new String[] { "", ".", ". .", ". . ." };
/*     */   
/*     */   private int H;
/*     */   private boolean I;
/*     */   private final BooleanConsumer J;
/*     */   
/*     */   public dhv(dot ☃, dhd dhd1, String str, BooleanConsumer booleanConsumer) {
/*  67 */     this.J = booleanConsumer;
/*  68 */     this.c = ☃;
/*  69 */     this.t = str;
/*  70 */     this.p = dhd1;
/*  71 */     this.u = new a(this);
/*  72 */     this.q = new of("mco.download.title");
/*  73 */     this.r = RateLimiter.create(0.10000000149011612D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  78 */     this.i.m.a(true);
/*  79 */     this.s = a(new dlj(this.k / 2 - 100, this.l - 42, 200, 20, nq.d, ☃ -> {
/*     */             this.y = true;
/*     */             i();
/*     */           }));
/*  83 */     h();
/*     */   }
/*     */   
/*     */   private void h() {
/*  87 */     if (this.A) {
/*     */       return;
/*     */     }
/*     */     
/*  91 */     if (!this.I && b(this.p.a) >= 5368709120L) {
/*  92 */       nr ☃ = new of("mco.download.confirmation.line1", new Object[] { dfx.b(5368709120L) });
/*  93 */       nr nr1 = new of("mco.download.confirmation.line2");
/*  94 */       this.i.a(new dhy(☃ -> { this.I = true; this.i.a(this); k(); }dhy.a.a, ☃, nr1, false));
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */       
/* 100 */       k();
/*     */     } 
/*     */   }
/*     */   
/*     */   private long b(String ☃) {
/* 105 */     dfy dfy = new dfy();
/* 106 */     return dfy.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/* 111 */     super.d();
/*     */     
/* 113 */     this.F++;
/*     */     
/* 115 */     if (this.w != null && 
/* 116 */       this.r.tryAcquire(1)) {
/* 117 */       List<nr> ☃ = Lists.newArrayList();
/* 118 */       ☃.add(this.q);
/* 119 */       ☃.add(this.w);
/* 120 */       if (this.x != null) {
/* 121 */         ☃.add(new oe(this.x + "%"));
/* 122 */         ☃.add(new oe(dfx.b(this.E) + "/s"));
/*     */       } 
/* 124 */       if (this.v != null) {
/* 125 */         ☃.add(this.v);
/*     */       }
/* 127 */       String str = ☃.stream().map(nr::getString).collect(Collectors.joining("\n"));
/* 128 */       eoj.a(str);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 135 */     if (☃ == 256) {
/* 136 */       this.y = true;
/* 137 */       i();
/* 138 */       return true;
/*     */     } 
/* 140 */     return super.a(☃, i, j);
/*     */   }
/*     */   
/*     */   private void i() {
/* 144 */     if (this.A && this.J != null && this.v == null) {
/* 145 */       this.J.accept(true);
/*     */     }
/*     */     
/* 148 */     this.i.a(this.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 153 */     a(☃);
/*     */     
/* 155 */     a(☃, this.o, this.q, this.k / 2, 20, 16777215);
/*     */     
/* 157 */     a(☃, this.o, this.w, this.k / 2, 50, 16777215);
/*     */     
/* 159 */     if (this.z) {
/* 160 */       b(☃);
/*     */     }
/*     */     
/* 163 */     if (this.u.a != 0L && !this.y) {
/* 164 */       c(☃);
/* 165 */       d(☃);
/*     */     } 
/*     */     
/* 168 */     if (this.v != null) {
/* 169 */       a(☃, this.o, this.v, this.k / 2, 110, 16711680);
/*     */     }
/*     */     
/* 172 */     super.a(☃, i, j, f);
/*     */   }
/*     */   
/*     */   private void b(dfm ☃) {
/* 176 */     int i = this.o.a(this.w);
/*     */     
/* 178 */     if (this.F % 10 == 0) {
/* 179 */       this.H++;
/*     */     }
/*     */     
/* 182 */     this.o.b(☃, G[this.H % G.length], (this.k / 2 + i / 2 + 5), 50.0F, 16777215);
/*     */   }
/*     */   
/*     */   private void c(dfm ☃) {
/* 186 */     double d1 = Math.min(this.u.a / this.u.b, 1.0D);
/* 187 */     this.x = String.format(Locale.ROOT, "%.1f", new Object[] { Double.valueOf(d1 * 100.0D) });
/*     */     
/* 189 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 190 */     RenderSystem.disableTexture();
/* 191 */     dfo dfo = dfo.a();
/* 192 */     dfh dfh = dfo.c();
/* 193 */     dfh.a(7, dfk.l);
/*     */     
/* 195 */     double d2 = (this.k / 2 - 100);
/* 196 */     double d3 = 0.5D;
/*     */     
/* 198 */     dfh.a(d2 - 0.5D, 95.5D, 0.0D).a(217, 210, 210, 255).d();
/* 199 */     dfh.a(d2 + 200.0D * d1 + 0.5D, 95.5D, 0.0D).a(217, 210, 210, 255).d();
/* 200 */     dfh.a(d2 + 200.0D * d1 + 0.5D, 79.5D, 0.0D).a(217, 210, 210, 255).d();
/* 201 */     dfh.a(d2 - 0.5D, 79.5D, 0.0D).a(217, 210, 210, 255).d();
/*     */     
/* 203 */     dfh.a(d2, 95.0D, 0.0D).a(128, 128, 128, 255).d();
/* 204 */     dfh.a(d2 + 200.0D * d1, 95.0D, 0.0D).a(128, 128, 128, 255).d();
/* 205 */     dfh.a(d2 + 200.0D * d1, 80.0D, 0.0D).a(128, 128, 128, 255).d();
/* 206 */     dfh.a(d2, 80.0D, 0.0D).a(128, 128, 128, 255).d();
/*     */     
/* 208 */     dfo.b();
/* 209 */     RenderSystem.enableTexture();
/*     */     
/* 211 */     a(☃, this.o, this.x + " %", this.k / 2, 84, 16777215);
/*     */   }
/*     */   
/*     */   private void d(dfm ☃) {
/* 215 */     if (this.F % 20 == 0) {
/* 216 */       if (this.C != null) {
/* 217 */         long l = x.b() - this.D.longValue();
/* 218 */         if (l == 0L) {
/* 219 */           l = 1L;
/*     */         }
/* 221 */         this.E = 1000L * (this.u.a - this.C.longValue()) / l;
/* 222 */         a(☃, this.E);
/*     */       } 
/* 224 */       this.C = Long.valueOf(this.u.a);
/* 225 */       this.D = Long.valueOf(x.b());
/*     */     } else {
/* 227 */       a(☃, this.E);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, long l) {
/* 232 */     if (l > 0L) {
/* 233 */       int i = this.o.b(this.x);
/* 234 */       String str = "(" + dfx.b(l) + "/s)";
/* 235 */       this.o.b(☃, str, (this.k / 2 + i / 2 + 15), 84.0F, 16777215);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void k() {
/* 240 */     (new Thread(() -> {
/*     */           try {
/*     */             if (!b.tryLock(1L, TimeUnit.SECONDS)) {
/*     */               this.w = new of("mco.download.failed");
/*     */               
/*     */               return;
/*     */             } 
/*     */             
/*     */             if (this.y) {
/*     */               l();
/*     */               
/*     */               return;
/*     */             } 
/*     */             
/*     */             this.w = new of("mco.download.downloading", new Object[] { this.t });
/*     */             
/*     */             dfy ☃ = new dfy();
/*     */             
/*     */             ☃.a(this.p.a);
/*     */             
/*     */             ☃.a(this.p, this.t, this.u, this.i.k());
/*     */             while (!☃.b()) {
/*     */               if (☃.c()) {
/*     */                 ☃.a();
/*     */                 this.v = new of("mco.download.failed");
/*     */                 this.s.a(nq.c);
/*     */                 return;
/*     */               } 
/*     */               if (☃.d()) {
/*     */                 if (!this.B) {
/*     */                   this.w = new of("mco.download.extracting");
/*     */                 }
/*     */                 this.B = true;
/*     */               } 
/*     */               if (this.y) {
/*     */                 ☃.a();
/*     */                 l();
/*     */                 return;
/*     */               } 
/*     */               try {
/*     */                 Thread.sleep(500L);
/* 281 */               } catch (InterruptedException interruptedException) {
/*     */                 a.error("Failed to check Realms backup download status");
/*     */               } 
/*     */             } 
/*     */             
/*     */             this.A = true;
/*     */             this.w = new of("mco.download.done");
/*     */             this.s.a(nq.c);
/* 289 */           } catch (InterruptedException ☃) {
/*     */             a.error("Could not acquire upload lock");
/* 291 */           } catch (Exception ☃) {
/*     */             this.v = new of("mco.download.failed");
/*     */             
/*     */             ☃.printStackTrace();
/*     */           } finally {
/*     */             if (b.isHeldByCurrentThread()) {
/*     */               b.unlock();
/*     */             } else {
/*     */               return;
/*     */             } 
/*     */             this.z = false;
/*     */             this.A = true;
/*     */           } 
/* 304 */         })).start();
/*     */   }
/*     */   
/*     */   private void l() {
/* 308 */     this.w = new of("mco.download.cancelled");
/*     */   }
/*     */   
/*     */   public class a {
/*     */     public volatile long a;
/*     */     public volatile long b;
/*     */     
/*     */     public a(dhv ☃) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dhv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */