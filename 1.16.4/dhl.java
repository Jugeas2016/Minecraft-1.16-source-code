/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.concurrent.ConcurrentHashMap;
/*     */ import java.util.concurrent.Executors;
/*     */ import java.util.concurrent.ScheduledExecutorService;
/*     */ import java.util.concurrent.ScheduledFuture;
/*     */ import java.util.concurrent.TimeUnit;
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
/*     */ public class dhl
/*     */ {
/*  24 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*  26 */   private final ScheduledExecutorService b = Executors.newScheduledThreadPool(3);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private volatile boolean c = true;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  37 */   private final Runnable d = new c();
/*  38 */   private final Runnable e = new b();
/*  39 */   private final Runnable f = new e();
/*  40 */   private final Runnable g = new a();
/*  41 */   private final Runnable h = new f();
/*     */   
/*  43 */   private final Set<dgq> i = Sets.newHashSet();
/*  44 */   private List<dgq> j = Lists.newArrayList();
/*     */   
/*     */   private dgv k;
/*     */   
/*     */   private int l;
/*     */   private boolean m;
/*     */   private boolean n;
/*     */   private String o;
/*     */   private ScheduledFuture<?> p;
/*     */   private ScheduledFuture<?> q;
/*     */   private ScheduledFuture<?> r;
/*     */   private ScheduledFuture<?> s;
/*     */   private ScheduledFuture<?> t;
/*  57 */   private final Map<d, Boolean> u = new ConcurrentHashMap<>((d.values()).length);
/*     */   
/*     */   public boolean a() {
/*  60 */     return this.c;
/*     */   }
/*     */   
/*     */   public synchronized void b() {
/*  64 */     if (this.c) {
/*  65 */       this.c = false;
/*  66 */       o();
/*  67 */       n();
/*     */     } 
/*     */   }
/*     */   
/*     */   public synchronized void c() {
/*  72 */     if (this.c) {
/*  73 */       this.c = false;
/*  74 */       o();
/*     */       
/*  76 */       this.u.put(d.b, Boolean.valueOf(false));
/*  77 */       this.q = this.b.scheduleAtFixedRate(this.e, 0L, 10L, TimeUnit.SECONDS);
/*     */       
/*  79 */       this.u.put(d.c, Boolean.valueOf(false));
/*  80 */       this.r = this.b.scheduleAtFixedRate(this.f, 0L, 60L, TimeUnit.SECONDS);
/*     */       
/*  82 */       this.u.put(d.e, Boolean.valueOf(false));
/*  83 */       this.t = this.b.scheduleAtFixedRate(this.h, 0L, 300L, TimeUnit.SECONDS);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a(d ☃) {
/*  88 */     Boolean bool = this.u.get(☃);
/*  89 */     return (bool == null) ? false : bool.booleanValue();
/*     */   }
/*     */   
/*     */   public void d() {
/*  93 */     for (d ☃ : this.u.keySet()) {
/*  94 */       this.u.put(☃, Boolean.valueOf(false));
/*     */     }
/*     */   }
/*     */   
/*     */   public synchronized void e() {
/*  99 */     l();
/* 100 */     b();
/*     */   }
/*     */   
/*     */   public synchronized List<dgq> f() {
/* 104 */     return Lists.newArrayList(this.j);
/*     */   }
/*     */   
/*     */   public synchronized int g() {
/* 108 */     return this.l;
/*     */   }
/*     */   
/*     */   public synchronized boolean h() {
/* 112 */     return this.m;
/*     */   }
/*     */   
/*     */   public synchronized dgv i() {
/* 116 */     return this.k;
/*     */   }
/*     */   
/*     */   public synchronized boolean j() {
/* 120 */     return this.n;
/*     */   }
/*     */   
/*     */   public synchronized String k() {
/* 124 */     return this.o;
/*     */   }
/*     */   
/*     */   public synchronized void l() {
/* 128 */     this.c = true;
/* 129 */     o();
/*     */   }
/*     */   
/*     */   private void n() {
/* 133 */     for (d ☃ : d.values()) {
/* 134 */       this.u.put(☃, Boolean.valueOf(false));
/*     */     }
/*     */     
/* 137 */     this.p = this.b.scheduleAtFixedRate(this.d, 0L, 60L, TimeUnit.SECONDS);
/* 138 */     this.q = this.b.scheduleAtFixedRate(this.e, 0L, 10L, TimeUnit.SECONDS);
/* 139 */     this.r = this.b.scheduleAtFixedRate(this.f, 0L, 60L, TimeUnit.SECONDS);
/* 140 */     this.s = this.b.scheduleAtFixedRate(this.g, 0L, 10L, TimeUnit.SECONDS);
/* 141 */     this.t = this.b.scheduleAtFixedRate(this.h, 0L, 300L, TimeUnit.SECONDS);
/*     */   }
/*     */   
/*     */   private void o() {
/*     */     try {
/* 146 */       if (this.p != null) {
/* 147 */         this.p.cancel(false);
/*     */       }
/*     */       
/* 150 */       if (this.q != null) {
/* 151 */         this.q.cancel(false);
/*     */       }
/*     */       
/* 154 */       if (this.r != null) {
/* 155 */         this.r.cancel(false);
/*     */       }
/*     */       
/* 158 */       if (this.s != null) {
/* 159 */         this.s.cancel(false);
/*     */       }
/*     */       
/* 162 */       if (this.t != null) {
/* 163 */         this.t.cancel(false);
/*     */       }
/* 165 */     } catch (Exception ☃) {
/* 166 */       a.error("Failed to cancel Realms tasks", ☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private synchronized void a(List<dgq> ☃) {
/* 171 */     int i = 0;
/*     */     
/* 173 */     for (dgq dgq : this.i) {
/* 174 */       if (☃.remove(dgq)) {
/* 175 */         i++;
/*     */       }
/*     */     } 
/*     */     
/* 179 */     if (i == 0) {
/* 180 */       this.i.clear();
/*     */     }
/*     */     
/* 183 */     this.j = ☃;
/*     */   }
/*     */   
/*     */   public synchronized void a(dgq ☃) {
/* 187 */     this.j.remove(☃);
/* 188 */     this.i.add(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean p() {
/* 193 */     return !this.c;
/*     */   }
/*     */   
/*     */   class c
/*     */     implements Runnable {
/*     */     public void run() {
/* 199 */       if (dhl.a(this.a))
/* 200 */         a(); 
/*     */     }
/*     */     private c(dhl this$0) {}
/*     */     
/*     */     private void a() {
/*     */       try {
/* 206 */         dgb ☃ = dgb.a();
/*     */         
/* 208 */         List<dgq> list = (☃.e()).a;
/*     */         
/* 210 */         if (list != null) {
/* 211 */           list.sort(new dgq.a(djz.C().J().c()));
/* 212 */           dhl.a(this.a, list);
/* 213 */           dhl.b(this.a).put(dhl.d.a, Boolean.valueOf(true));
/*     */         } else {
/* 215 */           dhl.m().warn("Realms server list was null or empty");
/*     */         } 
/* 217 */       } catch (Exception ☃) {
/* 218 */         dhl.b(this.a).put(dhl.d.a, Boolean.valueOf(true));
/* 219 */         dhl.m().error("Couldn't get server list", ☃);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   class b implements Runnable { private b(dhl this$0) {}
/*     */     
/*     */     public void run() {
/* 227 */       if (dhl.a(this.a)) {
/* 228 */         a();
/*     */       }
/*     */     }
/*     */     
/*     */     private void a() {
/*     */       try {
/* 234 */         dgb ☃ = dgb.a();
/* 235 */         dhl.a(this.a, ☃.j());
/* 236 */         dhl.b(this.a).put(dhl.d.b, Boolean.valueOf(true));
/* 237 */       } catch (Exception ☃) {
/* 238 */         dhl.m().error("Couldn't get pending invite count", ☃);
/*     */       } 
/*     */     } }
/*     */   
/*     */   class e implements Runnable {
/*     */     private e(dhl this$0) {}
/*     */     
/*     */     public void run() {
/* 246 */       if (dhl.a(this.a)) {
/* 247 */         a();
/*     */       }
/*     */     }
/*     */     
/*     */     private void a() {
/*     */       try {
/* 253 */         dgb ☃ = dgb.a();
/*     */         
/* 255 */         dhl.a(this.a, ☃.n().booleanValue());
/* 256 */         dhl.b(this.a).put(dhl.d.c, Boolean.valueOf(true));
/* 257 */       } catch (Exception ☃) {
/* 258 */         dhl.m().error("Couldn't get trial availability", ☃);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   class a implements Runnable { private a(dhl this$0) {}
/*     */     
/*     */     public void run() {
/* 266 */       if (dhl.a(this.a)) {
/* 267 */         a();
/*     */       }
/*     */     }
/*     */     
/*     */     private void a() {
/*     */       try {
/* 273 */         dgb ☃ = dgb.a();
/* 274 */         dhl.a(this.a, ☃.f());
/* 275 */         dhl.b(this.a).put(dhl.d.d, Boolean.valueOf(true));
/* 276 */       } catch (Exception ☃) {
/* 277 */         dhl.m().error("Couldn't get live stats", ☃);
/*     */       } 
/*     */     } }
/*     */   
/*     */   class f implements Runnable {
/*     */     private f(dhl this$0) {}
/*     */     
/*     */     public void run() {
/* 285 */       if (dhl.a(this.a)) {
/* 286 */         a();
/*     */       }
/*     */     }
/*     */     
/*     */     private void a() {
/*     */       try {
/* 292 */         dgb ☃ = dgb.a();
/*     */         
/* 294 */         dgp dgp = null;
/*     */         
/*     */         try {
/* 297 */           dgp = ☃.m();
/* 298 */         } catch (Exception exception) {}
/*     */ 
/*     */         
/* 301 */         diq.a a = diq.a();
/*     */         
/* 303 */         if (dgp != null) {
/* 304 */           String str = dgp.a;
/*     */           
/* 306 */           if (str != null && 
/* 307 */             !str.equals(a.a)) {
/* 308 */             a.b = true;
/* 309 */             a.a = str;
/* 310 */             diq.a(a);
/*     */           } 
/*     */         } 
/*     */ 
/*     */         
/* 315 */         dhl.b(this.a, a.b);
/* 316 */         dhl.a(this.a, a.a);
/*     */         
/* 318 */         dhl.b(this.a).put(dhl.d.e, Boolean.valueOf(true));
/* 319 */       } catch (Exception ☃) {
/* 320 */         dhl.m().error("Couldn't get unread news", ☃);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public enum d {
/* 326 */     a,
/* 327 */     b,
/* 328 */     c,
/* 329 */     d,
/* 330 */     e;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dhl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */