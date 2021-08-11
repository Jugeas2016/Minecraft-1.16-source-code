/*     */ import com.google.common.util.concurrent.Runnables;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.io.IOException;
/*     */ import java.util.Random;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.Executor;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class doy
/*     */   extends dot
/*     */ {
/*  40 */   private static final Logger b = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */   
/*  44 */   public static final dzu a = new dzu(new vk("textures/gui/title/background/panorama"));
/*  45 */   private static final vk c = new vk("textures/gui/title/background/panorama_overlay.png");
/*  46 */   private static final vk p = new vk("textures/gui/accessibility.png");
/*     */   
/*     */   private final boolean q;
/*     */   
/*     */   @Nullable
/*     */   private String r;
/*     */   
/*     */   private dlj s;
/*  54 */   private static final vk t = new vk("textures/gui/title/minecraft.png");
/*  55 */   private static final vk u = new vk("textures/gui/title/edition.png");
/*     */   
/*     */   private boolean v;
/*     */   private dot w;
/*     */   private int x;
/*     */   private int y;
/*  61 */   private final eai z = new eai(a);
/*     */   private final boolean A;
/*     */   private long B;
/*     */   
/*     */   public doy() {
/*  66 */     this(false);
/*     */   }
/*     */   
/*     */   public doy(boolean ☃) {
/*  70 */     super(new of("narrator.screen.title"));
/*  71 */     this.A = ☃;
/*  72 */     this.q = ((new Random()).nextFloat() < 1.0E-4D);
/*     */   }
/*     */   
/*     */   private boolean h() {
/*  76 */     return (this.i.k.T && this.w != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  81 */     if (h()) {
/*  82 */       this.w.d();
/*     */     }
/*     */   }
/*     */   
/*     */   public static CompletableFuture<Void> a(ekd ☃, Executor executor) {
/*  87 */     return CompletableFuture.allOf((CompletableFuture<?>[])new CompletableFuture[] { ☃
/*  88 */           .a(t, executor), ☃
/*  89 */           .a(u, executor), ☃
/*  90 */           .a(c, executor), a
/*  91 */           .a(☃, executor) });
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean ay_() {
/*  97 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean as_() {
/* 102 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/* 107 */     if (this.r == null) {
/* 108 */       this.r = this.i.az().a();
/*     */     }
/* 110 */     this.x = this.o.b("Copyright Mojang AB. Do not distribute!");
/* 111 */     this.y = this.k - this.x - 2;
/*     */     
/* 113 */     int ☃ = 24;
/* 114 */     int i = this.l / 4 + 48;
/*     */     
/* 116 */     if (this.i.v()) {
/* 117 */       c(i, 24);
/*     */     } else {
/* 119 */       b(i, 24);
/*     */     } 
/*     */     
/* 122 */     a(new dlr(this.k / 2 - 124, i + 72 + 12, 20, 20, 0, 106, 20, dlj.i, 256, 256, ☃ -> this.i.a(new dof(this, this.i.k, this.i.R())), new of("narrator.button.language")));
/* 123 */     a(new dlj(this.k / 2 - 100, i + 72 + 12, 98, 20, new of("menu.options"), ☃ -> this.i.a(new dok(this, this.i.k))));
/* 124 */     a(new dlj(this.k / 2 + 2, i + 72 + 12, 98, 20, new of("menu.quit"), ☃ -> this.i.n()));
/* 125 */     a(new dlr(this.k / 2 + 104, i + 72 + 12, 20, 20, 0, 0, 20, p, 32, 64, ☃ -> this.i.a(new dnm(this, this.i.k)), new of("narrator.button.accessibility")));
/*     */     
/* 127 */     this.i.d(false);
/*     */     
/* 129 */     if (this.i.k.T && !this.v) {
/* 130 */       eok eok = new eok();
/* 131 */       this.w = eok.b(this);
/* 132 */       this.v = true;
/*     */     } 
/*     */     
/* 135 */     if (h()) {
/* 136 */       this.w.b(this.i, this.k, this.l);
/*     */     }
/*     */   }
/*     */   
/*     */   private void b(int ☃, int i) {
/* 141 */     a(new dlj(this.k / 2 - 100, ☃, 200, 20, new of("menu.singleplayer"), ☃ -> this.i.a(new dsj(this))));
/* 142 */     boolean bool = this.i.s();
/* 143 */     dlj.b b = bool ? dlj.s : ((☃, dfm1, i, j) -> {
/*     */         if (!☃.o) {
/*     */           c(dfm1, this.i.g.b(new of("title.multiplayer.disabled"), Math.max(this.k / 2 - 43, 170)), i, j);
/*     */         }
/*     */       });
/* 148 */     ((dlj)a((T)new dlj(this.k / 2 - 100, ☃ + i * 1, 200, 20, new of("menu.multiplayer"), ☃ -> { dot dot1 = this.i.k.ad ? new drc(this) : new drd(this); this.i.a(dot1); }b))).o = bool;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 153 */     ((dlj)a((T)new dlj(this.k / 2 - 100, ☃ + i * 2, 200, 20, new of("menu.online"), ☃ -> k(), b))).o = bool;
/*     */   }
/*     */   
/*     */   private void c(int ☃, int i) {
/* 157 */     boolean bool = i();
/*     */     
/* 159 */     a(new dlj(this.k / 2 - 100, ☃, 200, 20, new of("menu.playdemo"), dlj1 -> {
/*     */             if (☃) {
/*     */               this.i.a("Demo_World");
/*     */             } else {
/*     */               gn.b b = gn.b();
/*     */               this.i.a("Demo_World", MinecraftServer.c, b, chw.a(b));
/*     */             } 
/*     */           }));
/* 167 */     this.s = a(new dlj(this.k / 2 - 100, ☃ + i * 1, 200, 20, new of("menu.resetdemo"), ☃ -> {
/*     */             cyg cyg = this.i.k();
/*     */ 
/*     */ 
/*     */             
/*     */             try (cyg.a ☃ = cyg.c("Demo_World")) {
/*     */               cyh cyh = a.d();
/*     */ 
/*     */               
/*     */               if (cyh != null) {
/*     */                 this.i.a(new dns(this::c, new of("selectWorld.deleteQuestion"), new of("selectWorld.deleteWarning", new Object[] { cyh.b() }), new of("selectWorld.deleteButton"), nq.d));
/*     */               }
/* 179 */             } catch (IOException iOException) {
/*     */               dmp.a(this.i, "Demo_World");
/*     */               b.warn("Failed to access demo world", iOException);
/*     */             } 
/*     */           }));
/* 184 */     this.s.o = bool;
/*     */   }
/*     */   
/*     */   private boolean i() {
/* 188 */     try (cyg.a ☃ = this.i.k().c("Demo_World")) {
/* 189 */       return (☃.d() != null);
/* 190 */     } catch (IOException ☃) {
/* 191 */       dmp.a(this.i, "Demo_World");
/* 192 */       b.warn("Failed to read demo world data", ☃);
/*     */       
/* 194 */       return false;
/*     */     } 
/*     */   }
/*     */   private void k() {
/* 198 */     eok ☃ = new eok();
/* 199 */     ☃.a(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 204 */     if (this.B == 0L && this.A) {
/* 205 */       this.B = x.b();
/*     */     }
/* 207 */     float f1 = this.A ? ((float)(x.b() - this.B) / 1000.0F) : 1.0F;
/*     */     
/* 209 */     a(☃, 0, 0, this.k, this.l, -1);
/*     */     
/* 211 */     this.z.a(f, afm.a(f1, 0.0F, 1.0F));
/*     */     
/* 213 */     int k = 274;
/* 214 */     int m = this.k / 2 - 137;
/* 215 */     int n = 30;
/*     */     
/* 217 */     this.i.M().a(c);
/* 218 */     RenderSystem.enableBlend();
/* 219 */     RenderSystem.blendFunc(dem.r.l, dem.j.j);
/* 220 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, this.A ? afm.f(afm.a(f1, 0.0F, 1.0F)) : 1.0F);
/* 221 */     a(☃, 0, 0, this.k, this.l, 0.0F, 0.0F, 16, 128, 16, 128);
/*     */     
/* 223 */     float f2 = this.A ? afm.a(f1 - 1.0F, 0.0F, 1.0F) : 1.0F;
/* 224 */     int i1 = afm.f(f2 * 255.0F) << 24;
/*     */     
/* 226 */     if ((i1 & 0xFC000000) == 0) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 231 */     this.i.M().a(t);
/* 232 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, f2);
/*     */     
/* 234 */     if (this.q) {
/* 235 */       a(m, 30, (integer1, integer2) -> {
/*     */             b(☃, integer1.intValue() + 0, integer2.intValue(), 0, 0, 99, 44);
/*     */             b(☃, integer1.intValue() + 99, integer2.intValue(), 129, 0, 27, 44);
/*     */             b(☃, integer1.intValue() + 99 + 26, integer2.intValue(), 126, 0, 3, 44);
/*     */             b(☃, integer1.intValue() + 99 + 26 + 3, integer2.intValue(), 99, 0, 26, 44);
/*     */             b(☃, integer1.intValue() + 155, integer2.intValue(), 0, 45, 155, 44);
/*     */           });
/*     */     } else {
/* 243 */       a(m, 30, (integer1, integer2) -> {
/*     */             b(☃, integer1.intValue() + 0, integer2.intValue(), 0, 0, 155, 44);
/*     */             b(☃, integer1.intValue() + 155, integer2.intValue(), 0, 45, 155, 44);
/*     */           });
/*     */     } 
/* 248 */     this.i.M().a(u);
/* 249 */     a(☃, m + 88, 67, 0.0F, 0.0F, 98, 14, 128, 16);
/*     */     
/* 251 */     if (this.r != null) {
/* 252 */       RenderSystem.pushMatrix();
/* 253 */       RenderSystem.translatef((this.k / 2 + 90), 70.0F, 0.0F);
/*     */       
/* 255 */       RenderSystem.rotatef(-20.0F, 0.0F, 0.0F, 1.0F);
/* 256 */       float f3 = 1.8F - afm.e(afm.a((float)(x.b() % 1000L) / 1000.0F * 6.2831855F) * 0.1F);
/*     */       
/* 258 */       f3 = f3 * 100.0F / (this.o.b(this.r) + 32);
/* 259 */       RenderSystem.scalef(f3, f3, f3);
/* 260 */       a(☃, this.o, this.r, 0, -8, 0xFFFF00 | i1);
/* 261 */       RenderSystem.popMatrix();
/*     */     } 
/*     */     
/* 264 */     String str = "Minecraft " + w.a().getName();
/*     */     
/* 266 */     if (this.i.v()) {
/* 267 */       str = str + " Demo";
/*     */     } else {
/* 269 */       str = str + ("release".equalsIgnoreCase(this.i.h()) ? "" : ("/" + this.i.h()));
/*     */     } 
/*     */     
/* 272 */     if (this.i.d()) {
/* 273 */       str = str + ekx.a("menu.modded", new Object[0]);
/*     */     }
/*     */     
/* 276 */     b(☃, this.o, str, 2, this.l - 10, 0xFFFFFF | i1);
/*     */     
/* 278 */     b(☃, this.o, "Copyright Mojang AB. Do not distribute!", this.y, this.l - 10, 0xFFFFFF | i1);
/* 279 */     if (i > this.y && i < this.y + this.x && j > this.l - 10 && j < this.l) {
/* 280 */       a(☃, this.y, this.l - 1, this.y + this.x, this.l, 0xFFFFFF | i1);
/*     */     }
/*     */     
/* 283 */     for (dlh dlh : this.m) {
/* 284 */       dlh.a(f2);
/*     */     }
/*     */     
/* 287 */     super.a(☃, i, j, f);
/*     */     
/* 289 */     if (h() && f2 >= 1.0F) {
/* 290 */       this.w.a(☃, i, j, f);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/* 296 */     if (super.a(☃, d1, i)) {
/* 297 */       return true;
/*     */     }
/*     */     
/* 300 */     if (h() && this.w.a(☃, d1, i)) {
/* 301 */       return true;
/*     */     }
/*     */     
/* 304 */     if (☃ > this.y && ☃ < (this.y + this.x) && d1 > (this.l - 10) && d1 < this.l) {
/* 305 */       this.i.a(new dpa(false, Runnables.doNothing()));
/*     */     }
/* 307 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 312 */     if (this.w != null) {
/* 313 */       this.w.e();
/*     */     }
/*     */   }
/*     */   
/*     */   private void c(boolean ☃) {
/* 318 */     if (☃) {
/* 319 */       try (cyg.a ☃ = this.i.k().c("Demo_World")) {
/* 320 */         a.g();
/* 321 */       } catch (IOException iOException) {
/* 322 */         dmp.b(this.i, "Demo_World");
/* 323 */         b.warn("Failed to delete demo world", iOException);
/*     */       } 
/*     */     }
/* 326 */     this.i.a(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\doy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */