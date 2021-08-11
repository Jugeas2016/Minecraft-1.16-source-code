/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.hash.Hashing;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.nio.file.Path;
/*     */ import java.text.DateFormat;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Collections;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Optional;
/*     */ import java.util.function.Supplier;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.StringUtils;
/*     */ import org.apache.commons.lang3.Validate;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dsm
/*     */   extends dlv<dsm.a>
/*     */ {
/*  60 */   private static final Logger a = LogManager.getLogger();
/*  61 */   private static final DateFormat o = new SimpleDateFormat();
/*  62 */   private static final vk p = new vk("textures/misc/unknown_server.png");
/*  63 */   private static final vk q = new vk("textures/gui/world_selection.png");
/*     */   
/*  65 */   private static final nr r = (new of("selectWorld.tooltip.fromNewerVersion1")).a(k.m);
/*  66 */   private static final nr s = (new of("selectWorld.tooltip.fromNewerVersion2")).a(k.m);
/*  67 */   private static final nr t = (new of("selectWorld.tooltip.snapshot1")).a(k.g);
/*  68 */   private static final nr u = (new of("selectWorld.tooltip.snapshot2")).a(k.g);
/*  69 */   private static final nr v = (new of("selectWorld.locked")).a(k.m);
/*     */   
/*     */   private final dsj w;
/*     */   
/*     */   @Nullable
/*     */   private List<cyh> x;
/*     */   
/*     */   public dsm(dsj ☃, djz djz1, int i, int j, int k, int m, int n, Supplier<String> supplier, @Nullable dsm dsm1) {
/*  77 */     super(djz1, i, j, k, m, n);
/*  78 */     this.w = ☃;
/*     */     
/*  80 */     if (dsm1 != null) {
/*  81 */       this.x = dsm1.x;
/*     */     }
/*  83 */     a(supplier, false);
/*     */   }
/*     */   
/*     */   public void a(Supplier<String> ☃, boolean bool) {
/*  87 */     k();
/*  88 */     cyg cyg = this.b.k();
/*  89 */     if (this.x == null || bool) {
/*     */       try {
/*  91 */         this.x = cyg.b();
/*  92 */       } catch (cyf cyf) {
/*  93 */         a.error("Couldn't load level list", cyf);
/*  94 */         this.b.a(new doc(new of("selectWorld.unable_to_load"), new oe(cyf.getMessage())));
/*     */         return;
/*     */       } 
/*  97 */       Collections.sort(this.x);
/*     */     } 
/*     */     
/* 100 */     if (this.x.isEmpty()) {
/* 101 */       this.b.a(dsf.a((dot)null));
/*     */       
/*     */       return;
/*     */     } 
/* 105 */     String str = ((String)☃.get()).toLowerCase(Locale.ROOT);
/* 106 */     for (cyh cyh : this.x) {
/* 107 */       if (cyh.b().toLowerCase(Locale.ROOT).contains(str) || cyh.a().toLowerCase(Locale.ROOT).contains(str)) {
/* 108 */         b(new a(this, this, cyh));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected int e() {
/* 115 */     return super.e() + 20;
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/* 120 */     return super.d() + 50;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean b() {
/* 125 */     return (this.w.aw_() == this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(@Nullable a ☃) {
/* 130 */     super.a(☃);
/*     */     
/* 132 */     if (☃ != null) {
/* 133 */       cyh cyh = a.a(☃);
/* 134 */       dkz.b.a((new of("narrator.select", new Object[] { new of("narrator.select.world", new Object[] { cyh
/* 135 */                   .b(), new Date(cyh
/* 136 */                     .e()), 
/* 137 */                   cyh.h() ? new of("gameMode.hardcore") : new of("gameMode." + cyh.g().b()), 
/* 138 */                   cyh.i() ? new of("selectWorld.cheats") : oe.d, cyh
/* 139 */                   .j()
/* 140 */                 }) })).getString());
/*     */     } 
/* 142 */     this.w.c((☃ != null && !a.a(☃).o()));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dlf.b ☃) {
/* 147 */     a(☃, ☃ -> !a.a(☃).o());
/*     */   }
/*     */   
/*     */   public Optional<a> f() {
/* 151 */     return Optional.ofNullable(h());
/*     */   }
/*     */   
/*     */   public dsj g() {
/* 155 */     return this.w;
/*     */   }
/*     */ 
/*     */   
/*     */   public final class a
/*     */     extends dlv.a<a>
/*     */     implements AutoCloseable
/*     */   {
/*     */     private final djz b;
/*     */     
/*     */     private final dsj c;
/*     */     
/*     */     private final cyh d;
/*     */     
/*     */     private final vk e;
/*     */     
/*     */     private File f;
/*     */     
/*     */     @Nullable
/*     */     private final ejs g;
/*     */     private long h;
/*     */     
/*     */     public a(dsm ☃, dsm dsm1, cyh cyh1) {
/* 178 */       this.c = dsm1.g();
/* 179 */       this.d = cyh1;
/* 180 */       this.b = djz.C();
/* 181 */       String str = cyh1.a();
/* 182 */       this.e = new vk("minecraft", "worlds/" + x.a(str, vk::b) + "/" + Hashing.sha1().hashUnencodedChars(str) + "/icon");
/* 183 */       this.f = cyh1.c();
/*     */       
/* 185 */       if (!this.f.isFile()) {
/* 186 */         this.f = null;
/*     */       }
/*     */       
/* 189 */       this.g = g();
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 194 */       String str1 = this.d.b();
/* 195 */       String str2 = this.d.a() + " (" + dsm.t().format(new Date(this.d.e())) + ")";
/*     */       
/* 197 */       if (StringUtils.isEmpty(str1)) {
/* 198 */         str1 = ekx.a("selectWorld.world", new Object[0]) + " " + (i + 1);
/*     */       }
/*     */       
/* 201 */       nr nr = this.d.p();
/*     */       
/* 203 */       this.b.g.b(☃, str1, (k + 32 + 3), (j + 1), 16777215);
/* 204 */       this.b.g.getClass(); this.b.g.b(☃, str2, (k + 32 + 3), (j + 9 + 3), 8421504);
/* 205 */       this.b.g.getClass(); this.b.g.getClass(); this.b.g.b(☃, nr, (k + 32 + 3), (j + 9 + 9 + 3), 8421504);
/*     */       
/* 207 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 208 */       this.b.M().a((this.g != null) ? this.e : dsm.u());
/* 209 */       RenderSystem.enableBlend();
/* 210 */       dkw.a(☃, k, j, 0.0F, 0.0F, 32, 32, 32, 32);
/* 211 */       RenderSystem.disableBlend();
/*     */       
/* 213 */       if (this.b.k.Y || bool) {
/* 214 */         this.b.M().a(dsm.w());
/* 215 */         dkw.a(☃, k, j, k + 32, j + 32, -1601138544);
/* 216 */         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 217 */         int i3 = i1 - k;
/*     */         
/* 219 */         boolean bool1 = (i3 < 32);
/* 220 */         int i4 = bool1 ? 32 : 0;
/* 221 */         if (this.d.o()) {
/* 222 */           dkw.a(☃, k, j, 96.0F, i4, 32, 32, 256, 256);
/* 223 */           if (bool1) {
/* 224 */             this.c.b(this.b.g.b(dsm.x(), 175));
/*     */           }
/* 226 */         } else if (this.d.l()) {
/* 227 */           dkw.a(☃, k, j, 32.0F, i4, 32, 32, 256, 256);
/* 228 */           if (this.d.m()) {
/* 229 */             dkw.a(☃, k, j, 96.0F, i4, 32, 32, 256, 256);
/* 230 */             if (bool1) {
/* 231 */               this.c.b((List<afa>)ImmutableList.of(dsm.y().f(), dsm.z().f()));
/*     */             }
/* 233 */           } else if (!w.a().isStable()) {
/* 234 */             dkw.a(☃, k, j, 64.0F, i4, 32, 32, 256, 256);
/* 235 */             if (bool1) {
/* 236 */               this.c.b((List<afa>)ImmutableList.of(dsm.A().f(), dsm.B().f()));
/*     */             }
/*     */           } 
/*     */         } else {
/* 240 */           dkw.a(☃, k, j, 0.0F, i4, 32, 32, 256, 256);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(double ☃, double d1, int i) {
/* 247 */       if (this.d.o()) {
/* 248 */         return true;
/*     */       }
/* 250 */       this.a.a(this);
/* 251 */       this.c.c(this.a.f().isPresent());
/*     */       
/* 253 */       if (☃ - this.a.q() <= 32.0D) {
/* 254 */         a();
/* 255 */         return true;
/*     */       } 
/*     */       
/* 258 */       if (x.b() - this.h < 250L) {
/* 259 */         a();
/* 260 */         return true;
/*     */       } 
/*     */       
/* 263 */       this.h = x.b();
/* 264 */       return false;
/*     */     }
/*     */     
/*     */     public void a() {
/* 268 */       if (this.d.o()) {
/*     */         return;
/*     */       }
/* 271 */       if (this.d.n()) {
/* 272 */         nr ☃ = new of("selectWorld.backupQuestion");
/* 273 */         nr nr1 = new of("selectWorld.backupWarning", new Object[] { this.d.j(), w.a().getName() });
/*     */         
/* 275 */         this.b.a(new dno(this.c, (☃, bool1) -> {
/*     */                 if (☃) {
/*     */                   String str = this.d.a();
/*     */ 
/*     */                   
/*     */                   try (cyg.a ☃ = this.b.k().c(str)) {
/*     */                     dsh.a(a1);
/* 282 */                   } catch (IOException iOException) {
/*     */                     dmp.a(this.b, str);
/*     */ 
/*     */                     
/*     */                     dsm.C().error("Failed to backup level {}", str, iOException);
/*     */                   } 
/*     */                 } 
/*     */ 
/*     */                 
/*     */                 e();
/*     */               }☃, nr1, false));
/* 293 */       } else if (this.d.m()) {
/* 294 */         this.b.a(new dns(☃ -> {
/*     */                 
/*     */                 if (☃) {
/*     */                   try {
/*     */                     e();
/* 299 */                   } catch (Exception exception) {
/*     */                     dsm.C().error("Failure to open 'future world'", exception);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                     
/*     */                     this.b.a(new dnn((), new of("selectWorld.futureworld.error.title"), new of("selectWorld.futureworld.error.text")));
/*     */                   } 
/*     */                 } else {
/*     */                   this.b.a(this.c);
/*     */                 } 
/* 312 */               }new of("selectWorld.versionQuestion"), new of("selectWorld.versionWarning", new Object[] { this.d.j(), new of("selectWorld.versionJoinButton"), nq.d })));
/*     */       
/*     */       }
/*     */       else {
/*     */         
/* 317 */         e();
/*     */       } 
/*     */     }
/*     */     
/*     */     public void b() {
/* 322 */       this.b.a(new dns(☃ -> {
/*     */               if (☃) {
/*     */                 this.b.a(new dor());
/*     */                 
/*     */                 cyg cyg = this.b.k();
/*     */                 String str = this.d.a();
/*     */                 try (cyg.a ☃ = cyg.c(str)) {
/*     */                   a1.g();
/* 330 */                 } catch (IOException iOException) {
/*     */                   dmp.b(this.b, str);
/*     */                   
/*     */                   dsm.C().error("Failed to delete world {}", str, iOException);
/*     */                 } 
/*     */                 
/*     */                 this.a.a((), true);
/*     */               } 
/*     */               this.b.a(this.c);
/* 339 */             }new of("selectWorld.deleteQuestion"), new of("selectWorld.deleteWarning", new Object[] { this.d.b() }), new of("selectWorld.deleteButton"), nq.d));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void c() {
/* 346 */       String ☃ = this.d.a();
/*     */       try {
/* 348 */         cyg.a a1 = this.b.k().c(☃);
/* 349 */         this.b.a(new dsh(bool -> {
/*     */                 
/*     */                 try {
/*     */                   ☃.close();
/* 353 */                 } catch (IOException iOException) {
/*     */                   dsm.C().error("Failed to unlock level {}", str, iOException);
/*     */                 } 
/*     */                 
/*     */                 if (bool) {
/*     */                   this.a.a((), true);
/*     */                 }
/*     */                 
/*     */                 this.b.a(this.c);
/*     */               }a1));
/* 363 */       } catch (IOException iOException) {
/* 364 */         dmp.a(this.b, ☃);
/* 365 */         dsm.C().error("Failed to access level {}", ☃, iOException);
/* 366 */         this.a.a(() -> this.c.b.b(), true);
/*     */       } 
/*     */     }
/*     */     
/*     */     public void d() {
/* 371 */       f();
/* 372 */       gn.b ☃ = gn.b();
/*     */       
/* 374 */       try(cyg.a ☃ = this.b.k().c(this.d.a()); 
/* 375 */           djz.b ☃ = this.b.a(☃, djz::a, djz::a, false, a1)) {
/*     */         
/* 377 */         bsa bsa = b.c().I();
/* 378 */         brk brk = bsa.g();
/* 379 */         chw chw = b.c().A();
/* 380 */         Path path = dsf.a(a1.a(cye.g), this.b);
/*     */         
/* 382 */         if (chw.i()) {
/* 383 */           this.b.a(new dns(bool -> this.b.a(bool ? new dsf(this.c, ☃, chw1, path, brk1, b1) : this.c), new of("selectWorld.recreate.customized.title"), new of("selectWorld.recreate.customized.text"), nq.g, nq.d));
/*     */ 
/*     */         
/*     */         }
/*     */         else {
/*     */ 
/*     */ 
/*     */           
/* 391 */           this.b.a(new dsf(this.c, bsa, chw, path, brk, ☃));
/*     */         } 
/* 393 */       } catch (Exception exception) {
/* 394 */         dsm.C().error("Unable to recreate world", exception);
/* 395 */         this.b.a(new dnn(() -> this.b.a(this.c), new of("selectWorld.recreate.error.title"), new of("selectWorld.recreate.error.text")));
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private void e() {
/* 404 */       this.b.W().a(emp.a(adq.pF, 1.0F));
/* 405 */       if (this.b.k().b(this.d.a())) {
/* 406 */         f();
/* 407 */         this.b.a(this.d.a());
/*     */       } 
/*     */     }
/*     */     
/*     */     private void f() {
/* 412 */       this.b.c(new dod(new of("selectWorld.data_read")));
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     private ejs g() {
/* 417 */       boolean ☃ = (this.f != null && this.f.isFile());
/* 418 */       if (☃) {
/* 419 */         try (InputStream ☃ = new FileInputStream(this.f)) {
/*     */           
/* 421 */           det det = det.a(inputStream);
/* 422 */           Validate.validState((det.a() == 64), "Must be 64 pixels wide", new Object[0]);
/* 423 */           Validate.validState((det.b() == 64), "Must be 64 pixels high", new Object[0]);
/* 424 */           ejs ejs1 = new ejs(det);
/* 425 */           this.b.M().a(this.e, ejs1);
/* 426 */           return ejs1;
/* 427 */         } catch (Throwable throwable) {
/* 428 */           dsm.C().error("Invalid icon for world {}", this.d.a(), throwable);
/* 429 */           this.f = null;
/* 430 */           return null;
/*     */         } 
/*     */       }
/* 433 */       this.b.M().c(this.e);
/* 434 */       return null;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void close() {
/* 440 */       if (this.g != null)
/* 441 */         this.g.close(); 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dsm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */