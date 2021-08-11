/*     */ import com.mojang.blaze3d.systems.RenderSystem;
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
/*     */ public class dif
/*     */   extends dig
/*     */ {
/*  27 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*     */   private final dot c;
/*     */   private final dgq p;
/*     */   private eom q;
/*     */   private eom r;
/*  33 */   private nr s = new of("mco.reset.world.title");
/*  34 */   private nr t = new of("mco.reset.world.warning");
/*  35 */   private nr u = nq.d;
/*  36 */   private int v = 16711680;
/*     */   
/*  38 */   private static final vk w = new vk("realms", "textures/gui/realms/slot_frame.png");
/*  39 */   private static final vk x = new vk("realms", "textures/gui/realms/upload.png");
/*  40 */   private static final vk y = new vk("realms", "textures/gui/realms/adventure.png");
/*  41 */   private static final vk z = new vk("realms", "textures/gui/realms/survival_spawn.png");
/*  42 */   private static final vk A = new vk("realms", "textures/gui/realms/new_world.png");
/*  43 */   private static final vk B = new vk("realms", "textures/gui/realms/experience.png");
/*  44 */   private static final vk C = new vk("realms", "textures/gui/realms/inspiration.png");
/*     */   
/*     */   private dhf D;
/*     */   
/*     */   private dhf E;
/*     */   private dhf F;
/*     */   private dhf G;
/*  51 */   public int a = -1;
/*     */   
/*  53 */   private b H = b.a;
/*     */   
/*     */   private c I;
/*     */   
/*     */   private dhe J;
/*     */   @Nullable
/*     */   private nr K;
/*     */   private final Runnable L;
/*     */   private final Runnable M;
/*     */   
/*     */   public dif(dot ☃, dgq dgq1, Runnable runnable1, Runnable runnable2) {
/*  64 */     this.c = ☃;
/*  65 */     this.p = dgq1;
/*  66 */     this.L = runnable1;
/*  67 */     this.M = runnable2;
/*     */   }
/*     */   
/*     */   public dif(dot ☃, dgq dgq1, nr nr1, nr nr2, int i, nr nr3, Runnable runnable1, Runnable runnable2) {
/*  71 */     this(☃, dgq1, runnable1, runnable2);
/*  72 */     this.s = nr1;
/*  73 */     this.t = nr2;
/*  74 */     this.v = i;
/*  75 */     this.u = nr3;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/*  79 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public void a(nr ☃) {
/*  83 */     this.K = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  88 */     a(new dlj(this.k / 2 - 40, j(14) - 10, 80, 20, this.u, ☃ -> this.i.a(this.c)));
/*     */ 
/*     */ 
/*     */     
/*  92 */     (new Thread(this, "Realms-reset-world-fetcher")
/*     */       {
/*     */         public void run() {
/*  95 */           dgb ☃ = dgb.a();
/*     */           try {
/*  97 */             dhf dhf1 = ☃.a(1, 10, dgq.c.a);
/*  98 */             dhf dhf2 = ☃.a(1, 10, dgq.c.c);
/*  99 */             dhf dhf3 = ☃.a(1, 10, dgq.c.d);
/* 100 */             dhf dhf4 = ☃.a(1, 10, dgq.c.e);
/* 101 */             dif.a(this.a).execute(() -> {
/*     */                   dif.a(this.a, ☃);
/*     */                   dif.b(this.a, dhf1);
/*     */                   dif.c(this.a, dhf2);
/*     */                   dif.d(this.a, dhf3);
/*     */                 });
/* 107 */           } catch (dhi dhi) {
/* 108 */             dif.a().error("Couldn't fetch templates in reset world", dhi);
/*     */           } 
/*     */         }
/* 111 */       }).start();
/*     */     
/* 113 */     this.q = d(new eom(this.s, this.k / 2, 7, 16777215));
/* 114 */     this.r = d(new eom(this.t, this.k / 2, 22, this.v));
/*     */     
/* 116 */     a(new a(this, b(1), j(0) + 10, new of("mco.reset.world.generate"), A, ☃ -> this.i.a(new die(this, this.s))));
/*     */ 
/*     */ 
/*     */     
/* 120 */     a(new a(this, b(2), j(0) + 10, new of("mco.reset.world.upload"), x, ☃ -> {
/*     */             dot dot1 = new dih(this.p.a, (this.a != -1) ? this.a : this.p.n, this, this.M);
/*     */             this.i.a(dot1);
/*     */           }));
/* 124 */     a(new a(this, b(3), j(0) + 10, new of("mco.reset.world.template"), z, ☃ -> {
/*     */             dii dii = new dii(this, dgq.c.a, this.D);
/*     */             dii.a(new of("mco.reset.world.template"));
/*     */             this.i.a(dii);
/*     */           }));
/* 129 */     a(new a(this, b(1), j(6) + 20, new of("mco.reset.world.adventure"), y, ☃ -> {
/*     */             dii dii = new dii(this, dgq.c.c, this.E);
/*     */             dii.a(new of("mco.reset.world.adventure"));
/*     */             this.i.a(dii);
/*     */           }));
/* 134 */     a(new a(this, b(2), j(6) + 20, new of("mco.reset.world.experience"), B, ☃ -> {
/*     */             dii dii = new dii(this, dgq.c.d, this.F);
/*     */             dii.a(new of("mco.reset.world.experience"));
/*     */             this.i.a(dii);
/*     */           }));
/* 139 */     a(new a(this, b(3), j(6) + 20, new of("mco.reset.world.inspiration"), C, ☃ -> {
/*     */             dii dii = new dii(this, dgq.c.e, this.G);
/*     */             
/*     */             dii.a(new of("mco.reset.world.inspiration"));
/*     */             this.i.a(dii);
/*     */           }));
/* 145 */     A();
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 150 */     this.i.m.a(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 155 */     if (☃ == 256) {
/* 156 */       this.i.a(this.c);
/* 157 */       return true;
/*     */     } 
/* 159 */     return super.a(☃, i, j);
/*     */   }
/*     */   
/*     */   private int b(int ☃) {
/* 163 */     return this.k / 2 - 130 + (☃ - 1) * 100;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 168 */     a(☃);
/*     */     
/* 170 */     this.q.a(this, ☃);
/* 171 */     this.r.a(this, ☃);
/*     */     
/* 173 */     super.a(☃, i, j, f);
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, int i, int j, nr nr1, vk vk1, boolean bool1, boolean bool2) {
/* 177 */     this.i.M().a(vk1);
/*     */     
/* 179 */     if (bool1) {
/* 180 */       RenderSystem.color4f(0.56F, 0.56F, 0.56F, 1.0F);
/*     */     } else {
/* 182 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */     } 
/*     */     
/* 185 */     dkw.a(☃, i + 2, j + 14, 0.0F, 0.0F, 56, 56, 56, 56);
/*     */     
/* 187 */     this.i.M().a(w);
/*     */     
/* 189 */     if (bool1) {
/* 190 */       RenderSystem.color4f(0.56F, 0.56F, 0.56F, 1.0F);
/*     */     } else {
/* 192 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */     } 
/*     */     
/* 195 */     dkw.a(☃, i, j + 12, 0.0F, 0.0F, 60, 60, 60, 60);
/*     */     
/* 197 */     int k = bool1 ? 10526880 : 16777215;
/* 198 */     a(☃, this.o, nr1, i + 30, j, k);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(@Nullable dhe ☃) {
/* 203 */     if (☃ == null) {
/*     */       return;
/*     */     }
/*     */     
/* 207 */     if (this.a == -1) {
/* 208 */       b(☃);
/*     */     } else {
/* 210 */       switch (null.a[☃.i.ordinal()]) {
/*     */         case 1:
/* 212 */           this.H = b.e;
/*     */           break;
/*     */         case 2:
/* 215 */           this.H = b.d;
/*     */           break;
/*     */         case 3:
/* 218 */           this.H = b.f;
/*     */           break;
/*     */         case 4:
/* 221 */           this.H = b.g;
/*     */           break;
/*     */       } 
/* 224 */       this.J = ☃;
/* 225 */       h();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void h() {
/* 230 */     a(() -> {
/*     */           switch (null.b[this.H.ordinal()]) {
/*     */             case 1:
/*     */             case 2:
/*     */             case 3:
/*     */             case 4:
/*     */               if (this.J != null) {
/*     */                 b(this.J);
/*     */               }
/*     */               break;
/*     */             case 5:
/*     */               if (this.I != null) {
/*     */                 b(this.I);
/*     */               }
/*     */               break;
/*     */           } 
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(Runnable ☃) {
/* 254 */     this.i.a(new dhz(this.c, new djf(this.p.a, this.a, ☃)));
/*     */   }
/*     */   
/*     */   enum b {
/* 258 */     a,
/* 259 */     b,
/* 260 */     c,
/* 261 */     d,
/* 262 */     e,
/* 263 */     f,
/* 264 */     g;
/*     */   }
/*     */   
/*     */   public void b(dhe ☃) {
/* 268 */     a((String)null, ☃, -1, true);
/*     */   }
/*     */   
/*     */   private void b(c ☃) {
/* 272 */     a(c.a(☃), (dhe)null, c.b(☃), c.c(☃));
/*     */   }
/*     */   
/*     */   private void a(@Nullable String ☃, @Nullable dhe dhe1, int i, boolean bool) {
/* 276 */     this.i.a(new dhz(this.c, new djc(☃, dhe1, i, bool, this.p.a, this.K, this.L)));
/*     */   }
/*     */   
/*     */   public static class c {
/*     */     private final String a;
/*     */     private final int b;
/*     */     private final boolean c;
/*     */     
/*     */     public c(String ☃, int i, boolean bool) {
/* 285 */       this.a = ☃;
/* 286 */       this.b = i;
/* 287 */       this.c = bool;
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(c ☃) {
/* 292 */     if (this.a == -1) {
/* 293 */       b(☃);
/*     */     } else {
/* 295 */       this.H = b.b;
/* 296 */       this.I = ☃;
/* 297 */       h();
/*     */     } 
/*     */   }
/*     */   
/*     */   class a extends dlj {
/*     */     private final vk b;
/*     */     
/*     */     public a(dif this$0, int ☃, int i, nr nr1, vk vk1, dlj.a a1) {
/* 305 */       super(☃, i, 60, 72, nr1, a1);
/* 306 */       this.b = vk1;
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(dfm ☃, int i, int j, float f) {
/* 311 */       dif.a(this.a, ☃, this.l, this.m, i(), this.b, g(), b(i, j));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dif.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */