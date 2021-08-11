/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.attribute.FileAttribute;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import java.util.OptionalLong;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.commons.lang3.mutable.MutableObject;
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
/*     */ 
/*     */ public class dsf
/*     */   extends dot
/*     */ {
/*  57 */   private static final Logger p = LogManager.getLogger();
/*     */   
/*  59 */   private static final nr q = new of("selectWorld.gameMode");
/*  60 */   private static final nr r = new of("selectWorld.enterSeed");
/*  61 */   private static final nr s = new of("selectWorld.seedInfo");
/*  62 */   private static final nr t = new of("selectWorld.enterName");
/*  63 */   private static final nr u = new of("selectWorld.resultFolder"); private final dot w; private dlq x;
/*  64 */   private static final nr v = new of("selectWorld.allowCommands.info");
/*     */   private String y;
/*     */   
/*  67 */   enum b { a("survival", bru.b),
/*  68 */     b("hardcore", bru.b),
/*  69 */     c("creative", bru.c),
/*  70 */     d("spectator", bru.e);
/*     */     
/*     */     private final String e;
/*     */     
/*     */     private final bru f;
/*     */     
/*     */     b(String ☃, bru bru1) {
/*  77 */       this.e = ☃;
/*  78 */       this.f = bru1;
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  85 */   private b z = b.a;
/*     */   @Nullable
/*     */   private b A;
/*  88 */   private aor B = aor.c;
/*  89 */   private aor C = aor.c;
/*     */   
/*     */   private boolean D;
/*     */   private boolean E;
/*     */   public boolean a;
/*     */   protected brk b;
/*     */   @Nullable
/*     */   private Path F;
/*     */   @Nullable
/*     */   private abw G;
/*     */   private boolean H;
/*     */   private dlj I;
/*     */   private dlj J;
/*     */   private dlj K;
/*     */   private dlj L;
/*     */   private dlj M;
/*     */   private dlj N;
/*     */   private dlj O;
/*     */   private nr P;
/*     */   private nr Q;
/*     */   private String R;
/* 110 */   private brt S = new brt();
/*     */   
/*     */   public final dsk c;
/*     */   
/*     */   public dsf(@Nullable dot ☃, bsa bsa1, chw chw1, @Nullable Path path, brk brk1, gn.b b1) {
/* 115 */     this(☃, brk1, new dsk(b1, chw1, dsl.a(chw1), OptionalLong.of(chw1.a())));
/* 116 */     this.R = bsa1.a();
/* 117 */     this.D = bsa1.e();
/* 118 */     this.E = true;
/* 119 */     this.B = bsa1.d();
/* 120 */     this.C = this.B;
/* 121 */     this.S.a(bsa1.f(), (MinecraftServer)null);
/*     */     
/* 123 */     if (bsa1.c()) {
/* 124 */       this.z = b.b;
/* 125 */     } else if (bsa1.b().f()) {
/* 126 */       this.z = b.a;
/* 127 */     } else if (bsa1.b().e()) {
/* 128 */       this.z = b.c;
/*     */     } 
/* 130 */     this.F = path;
/*     */   }
/*     */   
/*     */   public static dsf a(@Nullable dot ☃) {
/* 134 */     gn.b b1 = gn.b();
/* 135 */     return new dsf(☃, brk.a, new dsk(b1, chw.a(b1.b(gm.K), b1.b(gm.ay), b1.b(gm.ar)), Optional.of(dsl.a), OptionalLong.empty()));
/*     */   }
/*     */   
/*     */   private dsf(@Nullable dot ☃, brk brk1, dsk dsk1) {
/* 139 */     super(new of("selectWorld.create"));
/* 140 */     this.w = ☃;
/*     */     
/* 142 */     this.R = ekx.a("selectWorld.newWorld", new Object[0]);
/* 143 */     this.b = brk1;
/* 144 */     this.c = dsk1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/* 149 */     this.x.a();
/* 150 */     this.c.d();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/* 155 */     this.i.m.a(true);
/*     */ 
/*     */     
/* 158 */     this.x = new dlq(this, this.o, this.k / 2 - 100, 60, 200, 20, new of("selectWorld.enterName"))
/*     */       {
/*     */         protected nx c() {
/* 161 */           return super.c().c(". ").a(new of("selectWorld.resultFolder")).c(" ").c(dsf.a(this.a));
/*     */         }
/*     */       };
/* 164 */     this.x.a(this.R);
/* 165 */     this.x.a(☃ -> {
/*     */           this.R = ☃;
/*     */           this.I.o = !this.x.b().isEmpty();
/*     */           n();
/*     */         });
/* 170 */     this.e.add(this.x);
/*     */     
/* 172 */     int ☃ = this.k / 2 - 155;
/* 173 */     int i = this.k / 2 + 5;
/* 174 */     this.J = a(new dlj(this, ☃, 100, 150, 20, oe.d, ☃ -> {
/*     */             switch (null.a[this.z.ordinal()]) {
/*     */               case 1:
/*     */                 a(b.b);
/*     */                 break;
/*     */               case 2:
/*     */                 a(b.c);
/*     */                 break;
/*     */               case 3:
/*     */                 a(b.a);
/*     */                 break;
/*     */             } 
/*     */             ☃.c(250);
/*     */           })
/*     */         {
/*     */           public nr i()
/*     */           {
/* 191 */             return new of("options.generic_value", new Object[] { dsf.l(), new of("selectWorld.gameMode." + dsf.b.a(dsf.b(this.a))) });
/*     */           }
/*     */ 
/*     */           
/*     */           protected nx c() {
/* 196 */             return super.c().c(". ").a(dsf.d(this.a)).c(" ").a(dsf.c(this.a));
/*     */           }
/*     */         });
/*     */     
/* 200 */     this.K = a(new dlj(this, i, 100, 150, 20, new of("options.difficulty"), ☃ -> {
/*     */             this.B = this.B.d();
/*     */             this.C = this.B;
/*     */             ☃.c(250);
/*     */           })
/*     */         {
/*     */           public nr i() {
/* 207 */             return (new of("options.difficulty")).c(": ").a(dsf.e(this.a).b());
/*     */           }
/*     */         });
/*     */     
/* 211 */     this.O = a(new dlj(this, ☃, 151, 150, 20, new of("selectWorld.allowCommands"), ☃ -> {
/*     */             this.E = true;
/*     */             this.D = !this.D;
/*     */             ☃.c(250);
/*     */           })
/*     */         {
/*     */           public nr i() {
/* 218 */             return nq.a(super.i(), (dsf.f(this.a) && !this.a.a));
/*     */           }
/*     */ 
/*     */           
/*     */           protected nx c() {
/* 223 */             return super.c().c(". ").a(new of("selectWorld.allowCommands.info"));
/*     */           }
/*     */         });
/*     */     
/* 227 */     this.N = a(new dlj(i, 151, 150, 20, new of("selectWorld.dataPacks"), ☃ -> r()));
/* 228 */     this.M = a(new dlj(☃, 185, 150, 20, new of("selectWorld.gameRules"), ☃ -> this.i.a(new dsg(this.S.b(), ()))));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 233 */     this.c.a(this, this.i, this.o);
/*     */     
/* 235 */     this.L = a(new dlj(i, 185, 150, 20, new of("selectWorld.moreWorldOptions"), ☃ -> p()));
/*     */ 
/*     */     
/* 238 */     this.I = a(new dlj(☃, this.l - 28, 150, 20, new of("selectWorld.create"), ☃ -> o()));
/* 239 */     this.I.o = !this.R.isEmpty();
/* 240 */     a(new dlj(i, this.l - 28, 150, 20, nq.d, ☃ -> i()));
/*     */     
/* 242 */     h();
/*     */     
/* 244 */     b(this.x);
/*     */     
/* 246 */     a(this.z);
/* 247 */     n();
/*     */   }
/*     */   
/*     */   private void m() {
/* 251 */     this.P = new of("selectWorld.gameMode." + b.a(this.z) + ".line1");
/* 252 */     this.Q = new of("selectWorld.gameMode." + b.a(this.z) + ".line2");
/*     */   }
/*     */   
/*     */   private void n() {
/* 256 */     this.y = this.x.b().trim();
/*     */     
/* 258 */     if (this.y.isEmpty()) {
/* 259 */       this.y = "World";
/*     */     }
/*     */     
/*     */     try {
/* 263 */       this.y = s.a(this.i.k().c(), this.y, "");
/* 264 */     } catch (Exception ☃) {
/* 265 */       this.y = "World";
/*     */       try {
/* 267 */         this.y = s.a(this.i.k().c(), this.y, "");
/* 268 */       } catch (Exception exception) {
/* 269 */         throw new RuntimeException("Could not create save folder", exception);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 276 */     this.i.m.a(false);
/*     */   }
/*     */   private void o() {
/*     */     bsa bsa;
/* 280 */     this.i.c(new dod(new of("createWorld.preparing")));
/*     */     
/* 282 */     if (!u()) {
/*     */       return;
/*     */     }
/*     */     
/* 286 */     q();
/*     */     
/* 288 */     chw ☃ = this.c.a(this.a);
/*     */ 
/*     */     
/* 291 */     if (☃.g()) {
/* 292 */       brt brt1 = new brt();
/* 293 */       ((brt.a)brt1.<brt.a>a(brt.j)).a(false, (MinecraftServer)null);
/* 294 */       bsa = new bsa(this.x.b().trim(), bru.e, false, aor.a, true, brt1, brk.a);
/*     */     } else {
/* 296 */       bsa = new bsa(this.x.b().trim(), b.b(this.z), this.a, this.C, (this.D && !this.a), this.S, this.b);
/*     */     } 
/* 298 */     this.i.a(this.y, bsa, this.c.b(), ☃);
/*     */   }
/*     */   
/*     */   private void p() {
/* 302 */     c(!this.H);
/*     */   }
/*     */   
/*     */   private void a(b ☃) {
/* 306 */     if (!this.E) {
/* 307 */       this.D = (☃ == b.c);
/*     */     }
/* 309 */     if (☃ == b.b) {
/* 310 */       this.a = true;
/* 311 */       this.O.o = false;
/* 312 */       this.c.a.o = false;
/* 313 */       this.C = aor.d;
/* 314 */       this.K.o = false;
/*     */     } else {
/* 316 */       this.a = false;
/* 317 */       this.O.o = true;
/* 318 */       this.c.a.o = true;
/* 319 */       this.C = this.B;
/* 320 */       this.K.o = true;
/*     */     } 
/* 322 */     this.z = ☃;
/* 323 */     m();
/*     */   }
/*     */   
/*     */   public void h() {
/* 327 */     c(this.H);
/*     */   }
/*     */   
/*     */   private void c(boolean ☃) {
/* 331 */     this.H = ☃;
/*     */     
/* 333 */     this.J.p = !this.H;
/* 334 */     this.K.p = !this.H;
/*     */     
/* 336 */     if (this.c.a()) {
/* 337 */       this.N.p = false;
/* 338 */       this.J.o = false;
/* 339 */       if (this.A == null) {
/* 340 */         this.A = this.z;
/*     */       }
/* 342 */       a(b.d);
/* 343 */       this.O.p = false;
/*     */     } else {
/* 345 */       this.J.o = true;
/* 346 */       if (this.A != null) {
/* 347 */         a(this.A);
/*     */       }
/* 349 */       this.O.p = !this.H;
/* 350 */       this.N.p = !this.H;
/*     */     } 
/*     */     
/* 353 */     this.c.b(this.H);
/*     */     
/* 355 */     this.x.i(!this.H);
/*     */     
/* 357 */     if (this.H) {
/* 358 */       this.L.a(nq.c);
/*     */     } else {
/* 360 */       this.L.a(new of("selectWorld.moreWorldOptions"));
/*     */     } 
/* 362 */     this.M.p = !this.H;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 367 */     if (super.a(☃, i, j)) {
/* 368 */       return true;
/*     */     }
/*     */     
/* 371 */     if (☃ == 257 || ☃ == 335) {
/* 372 */       o();
/* 373 */       return true;
/*     */     } 
/*     */     
/* 376 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void at_() {
/* 381 */     if (this.H) {
/* 382 */       c(false);
/*     */     } else {
/* 384 */       i();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void i() {
/* 389 */     this.i.a(this.w);
/* 390 */     q();
/*     */   }
/*     */   
/*     */   private void q() {
/* 394 */     if (this.G != null) {
/* 395 */       this.G.close();
/*     */     }
/* 397 */     t();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 402 */     a(☃);
/*     */     
/* 404 */     a(☃, this.o, this.d, this.k / 2, 20, -1);
/* 405 */     if (this.H) {
/* 406 */       b(☃, this.o, r, this.k / 2 - 100, 47, -6250336);
/* 407 */       b(☃, this.o, s, this.k / 2 - 100, 85, -6250336);
/* 408 */       this.c.a(☃, i, j, f);
/*     */     } else {
/* 410 */       b(☃, this.o, t, this.k / 2 - 100, 47, -6250336);
/* 411 */       b(☃, this.o, (new oe("")).a(u).c(" ").c(this.y), this.k / 2 - 100, 85, -6250336);
/* 412 */       this.x.a(☃, i, j, f);
/*     */       
/* 414 */       b(☃, this.o, this.P, this.k / 2 - 150, 122, -6250336);
/* 415 */       b(☃, this.o, this.Q, this.k / 2 - 150, 134, -6250336);
/* 416 */       if (this.O.p) {
/* 417 */         b(☃, this.o, v, this.k / 2 - 150, 172, -6250336);
/*     */       }
/*     */     } 
/*     */     
/* 421 */     super.a(☃, i, j, f);
/*     */   }
/*     */ 
/*     */   
/*     */   protected <T extends dmi> T d(T ☃) {
/* 426 */     return super.d(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected <T extends dlh> T a(T ☃) {
/* 431 */     return super.a(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected Path k() {
/* 438 */     if (this.F == null) {
/*     */       try {
/* 440 */         this.F = Files.createTempDirectory("mcworld-", (FileAttribute<?>[])new FileAttribute[0]);
/* 441 */       } catch (IOException ☃) {
/* 442 */         p.warn("Failed to create temporary dir", ☃);
/* 443 */         dmp.c(this.i, this.y);
/* 444 */         i();
/*     */       } 
/*     */     }
/*     */     
/* 448 */     return this.F;
/*     */   }
/*     */   
/*     */   private void r() {
/* 452 */     Pair<File, abw> ☃ = A();
/*     */     
/* 454 */     if (☃ != null) {
/* 455 */       this.i.a(new dri(this, (abw)☃.getSecond(), this::a, (File)☃.getFirst(), new of("dataPack.title")));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(abw ☃) {
/* 461 */     ImmutableList immutableList = ImmutableList.copyOf(☃.d());
/* 462 */     List<String> list = (List<String>)☃.b().stream().filter(str -> !☃.contains(str)).collect(ImmutableList.toImmutableList());
/* 463 */     brk brk1 = new brk((List<String>)immutableList, list);
/*     */     
/* 465 */     if (immutableList.equals(this.b.a())) {
/*     */       
/* 467 */       this.b = brk1;
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 472 */     this.i.h(() -> this.i.a(new dod(new of("dataPack.validation.working"))));
/* 473 */     vz.a(☃.f(), dc.a.c, 2, x.f(), this.i).handle((vz1, throwable) -> {
/*     */           if (throwable != null) {
/*     */             p.warn("Failed to validate datapack", throwable);
/*     */             this.i.h(());
/*     */           } else {
/*     */             this.i.h(());
/*     */           } 
/*     */           return null;
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
/*     */   private void t() {
/* 502 */     if (this.F != null) {
/* 503 */       try (Stream<Path> ☃ = Files.walk(this.F, new java.nio.file.FileVisitOption[0])) {
/* 504 */         ☃.sorted(Comparator.reverseOrder()).forEach(☃ -> {
/*     */               try {
/*     */                 Files.delete(☃);
/* 507 */               } catch (IOException iOException) {
/*     */                 p.warn("Failed to remove temporary file {}", ☃, iOException);
/*     */               } 
/*     */             });
/* 511 */       } catch (IOException ☃) {
/* 512 */         p.warn("Failed to list temporary dir {}", this.F);
/*     */       } 
/* 514 */       this.F = null;
/*     */     } 
/*     */   }
/*     */   
/*     */   static class a extends RuntimeException {
/*     */     public a(Throwable ☃) {
/* 520 */       super(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   private static void a(Path ☃, Path path1, Path path2) {
/*     */     try {
/* 526 */       x.b(☃, path1, path2);
/* 527 */     } catch (IOException iOException) {
/* 528 */       p.warn("Failed to copy datapack file from {} to {}", path2, path1);
/* 529 */       throw new a(iOException);
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean u() {
/* 534 */     if (this.F != null) {
/* 535 */       try(cyg.a ☃ = this.i.k().c(this.y); 
/* 536 */           Stream<Path> ☃ = Files.walk(this.F, new java.nio.file.FileVisitOption[0])) {
/* 537 */         Path path = ☃.a(cye.g);
/* 538 */         Files.createDirectories(path, (FileAttribute<?>[])new FileAttribute[0]);
/* 539 */         stream.filter(☃ -> !☃.equals(this.F)).forEach(path1 -> a(this.F, ☃, path1));
/* 540 */       } catch (IOException|a ☃) {
/* 541 */         p.warn("Failed to copy datapacks to world {}", this.y, ☃);
/* 542 */         dmp.c(this.i, this.y);
/* 543 */         i();
/* 544 */         return false;
/*     */       } 
/*     */     }
/* 547 */     return true;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static Path a(Path ☃, djz djz1) {
/* 552 */     MutableObject<Path> mutableObject = new MutableObject();
/* 553 */     try (Stream<Path> ☃ = Files.walk(☃, new java.nio.file.FileVisitOption[0])) {
/* 554 */       stream.filter(path1 -> !path1.equals(☃)).forEach(path2 -> {
/*     */             Path path = (Path)☃.getValue();
/*     */             
/*     */             if (path == null) {
/*     */               try {
/*     */                 path = Files.createTempDirectory("mcworld-", (FileAttribute<?>[])new FileAttribute[0]);
/* 560 */               } catch (IOException iOException) {
/*     */                 p.warn("Failed to create temporary dir");
/*     */                 throw new a(iOException);
/*     */               } 
/*     */               ☃.setValue(path);
/*     */             } 
/*     */             a(path1, path, path2);
/*     */           });
/* 568 */     } catch (IOException|a exception) {
/* 569 */       p.warn("Failed to copy datapacks from world {}", ☃, exception);
/* 570 */       dmp.c(djz1, ☃.toString());
/* 571 */       return null;
/*     */     } 
/* 573 */     return (Path)mutableObject.getValue();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private Pair<File, abw> A() {
/* 578 */     Path ☃ = k();
/* 579 */     if (☃ != null) {
/* 580 */       File file = ☃.toFile();
/* 581 */       if (this.G == null) {
/* 582 */         this.G = new abw(new aby[] { new abz(), new abt(file, abx.a) });
/*     */ 
/*     */ 
/*     */         
/* 586 */         this.G.a();
/*     */       } 
/*     */       
/* 589 */       this.G.a(this.b.a());
/* 590 */       return Pair.of(file, this.G);
/*     */     } 
/*     */     
/* 593 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dsf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */