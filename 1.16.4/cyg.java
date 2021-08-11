/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import com.google.common.io.Files;
/*     */ import com.mojang.datafixers.DataFixer;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import com.mojang.serialization.DynamicOps;
/*     */ import com.mojang.serialization.Lifecycle;
/*     */ import java.io.BufferedOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.nio.file.FileVisitResult;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.Paths;
/*     */ import java.nio.file.SimpleFileVisitor;
/*     */ import java.nio.file.attribute.BasicFileAttributes;
/*     */ import java.nio.file.attribute.FileAttribute;
/*     */ import java.time.LocalDateTime;
/*     */ import java.time.format.DateTimeFormatter;
/*     */ import java.time.format.DateTimeFormatterBuilder;
/*     */ import java.time.format.SignStyle;
/*     */ import java.time.temporal.ChronoField;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.function.BiFunction;
/*     */ import java.util.zip.ZipEntry;
/*     */ import java.util.zip.ZipOutputStream;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cyg
/*     */ {
/*  62 */   private static final Logger a = LogManager.getLogger();
/*  63 */   private static final DateTimeFormatter b = (new DateTimeFormatterBuilder())
/*  64 */     .appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD)
/*  65 */     .appendLiteral('-')
/*  66 */     .appendValue(ChronoField.MONTH_OF_YEAR, 2)
/*  67 */     .appendLiteral('-')
/*  68 */     .appendValue(ChronoField.DAY_OF_MONTH, 2)
/*  69 */     .appendLiteral('_')
/*  70 */     .appendValue(ChronoField.HOUR_OF_DAY, 2)
/*  71 */     .appendLiteral('-')
/*  72 */     .appendValue(ChronoField.MINUTE_OF_HOUR, 2)
/*  73 */     .appendLiteral('-')
/*  74 */     .appendValue(ChronoField.SECOND_OF_MINUTE, 2)
/*  75 */     .toFormatter();
/*     */ 
/*     */ 
/*     */   
/*  79 */   private static final ImmutableList<String> c = ImmutableList.of("RandomSeed", "generatorName", "generatorOptions", "generatorVersion", "legacy_custom_options", "MapFeatures", "BonusChest");
/*     */ 
/*     */ 
/*     */   
/*     */   private final Path d;
/*     */ 
/*     */   
/*     */   private final Path e;
/*     */ 
/*     */   
/*     */   private final DataFixer f;
/*     */ 
/*     */ 
/*     */   
/*     */   public cyg(Path ☃, Path path1, DataFixer dataFixer) {
/*  94 */     this.f = dataFixer;
/*     */     try {
/*  96 */       Files.createDirectories(Files.exists(☃, new java.nio.file.LinkOption[0]) ? ☃.toRealPath(new java.nio.file.LinkOption[0]) : ☃, (FileAttribute<?>[])new FileAttribute[0]);
/*  97 */     } catch (IOException iOException) {
/*  98 */       throw new RuntimeException(iOException);
/*     */     } 
/* 100 */     this.d = ☃;
/* 101 */     this.e = path1;
/*     */   }
/*     */   
/*     */   public static cyg a(Path ☃) {
/* 105 */     return new cyg(☃, ☃.resolve("../backups"), agb.a());
/*     */   }
/*     */   
/*     */   private static <T> Pair<chw, Lifecycle> a(Dynamic<T> ☃, DataFixer dataFixer, int i) {
/* 109 */     Dynamic<T> dynamic1 = ☃.get("WorldGenSettings").orElseEmptyMap();
/*     */     
/* 111 */     for (UnmodifiableIterator<String> unmodifiableIterator = c.iterator(); unmodifiableIterator.hasNext(); ) { String str = unmodifiableIterator.next();
/* 112 */       Optional<? extends Dynamic<?>> optional = ☃.get(str).result();
/* 113 */       if (optional.isPresent()) {
/* 114 */         dynamic1 = dynamic1.set(str, optional.get());
/*     */       } }
/*     */ 
/*     */     
/* 118 */     Dynamic<T> dynamic2 = dataFixer.update(akn.y, dynamic1, i, w.a().getWorldVersion());
/* 119 */     DataResult<chw> dataResult = chw.a.parse(dynamic2);
/* 120 */     return Pair.of(dataResult.resultOrPartial(x.a("WorldGenSettings: ", a::error)).orElseGet(() -> { gm<chd> gm = (gm<chd>)vg.<chd>a(gm.K).codec().parse(☃).resultOrPartial(x.a("Dimension type registry: ", a::error)).orElseThrow(()); gm<bsv> gm1 = (gm<bsv>)vg.<bsv>a(gm.ay).codec().parse(☃).resultOrPartial(x.a("Biome registry: ", a::error)).orElseThrow(()); gm<chp> gm2 = (gm<chp>)vg.<chp>a(gm.ar).codec().parse(☃).resultOrPartial(x.a("Noise settings registry: ", a::error)).orElseThrow(()); return chw.a(gm, gm1, gm2); }), dataResult
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 125 */         .lifecycle());
/*     */   }
/*     */   
/*     */   private static brk a(Dynamic<?> ☃) {
/* 129 */     return brk.b.parse(☃).resultOrPartial(a::error).orElse(brk.a);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<cyh> b() throws cyf {
/* 137 */     if (!Files.isDirectory(this.d, new java.nio.file.LinkOption[0])) {
/* 138 */       throw new cyf((new of("selectWorld.load_folder_access")).getString());
/*     */     }
/*     */     
/* 141 */     List<cyh> ☃ = Lists.newArrayList();
/*     */     
/* 143 */     File[] arrayOfFile = this.d.toFile().listFiles();
/* 144 */     for (File file : arrayOfFile) {
/* 145 */       if (file.isDirectory()) {
/*     */         boolean bool;
/*     */ 
/*     */ 
/*     */         
/*     */         try {
/* 151 */           bool = aex.b(file.toPath());
/* 152 */         } catch (Exception exception) {
/* 153 */           a.warn("Failed to read {} lock", file, exception);
/*     */         } 
/*     */ 
/*     */         
/* 157 */         cyh cyh = a(file, a(file, bool));
/* 158 */         if (cyh != null) {
/* 159 */           ☃.add(cyh);
/*     */         }
/*     */       } 
/*     */     } 
/* 163 */     return ☃;
/*     */   }
/*     */   
/*     */   private int g() {
/* 167 */     return 19133;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private <T> T a(File ☃, BiFunction<File, DataFixer, T> biFunction) {
/* 172 */     if (!☃.exists()) {
/* 173 */       return null;
/*     */     }
/*     */     
/* 176 */     File file = new File(☃, "level.dat");
/* 177 */     if (file.exists()) {
/* 178 */       T t = biFunction.apply(file, this.f);
/* 179 */       if (t != null) {
/* 180 */         return t;
/*     */       }
/*     */     } 
/*     */     
/* 184 */     file = new File(☃, "level.dat_old");
/* 185 */     if (file.exists()) {
/* 186 */       return biFunction.apply(file, this.f);
/*     */     }
/* 188 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static brk b(File ☃, DataFixer dataFixer) {
/*     */     try {
/* 194 */       md md1 = mn.a(☃);
/* 195 */       md md2 = md1.p("Data");
/* 196 */       md2.r("Player");
/* 197 */       int i = md2.c("DataVersion", 99) ? md2.h("DataVersion") : -1;
/* 198 */       Dynamic<mt> dynamic = dataFixer.update(aga.a.a(), new Dynamic(mo.a, md2), i, w.a().getWorldVersion());
/* 199 */       return dynamic.get("DataPacks").result().map(cyg::a).orElse(brk.a);
/* 200 */     } catch (Exception exception) {
/* 201 */       a.error("Exception reading {}", ☃, exception);
/*     */       
/* 203 */       return null;
/*     */     } 
/*     */   }
/*     */   private static BiFunction<File, DataFixer, cyl> b(DynamicOps<mt> ☃, brk brk1) {
/* 207 */     return (file, dataFixer) -> {
/*     */         try {
/*     */           md md1 = mn.a(file);
/*     */           md md2 = md1.p("Data");
/*     */           md md3 = md2.c("Player", 10) ? md2.p("Player") : null;
/*     */           md2.r("Player");
/*     */           int i = md2.c("DataVersion", 99) ? md2.h("DataVersion") : -1;
/*     */           Dynamic<mt> dynamic = dataFixer.update(aga.a.a(), new Dynamic(☃, md2), i, w.a().getWorldVersion());
/*     */           Pair<chw, Lifecycle> pair = a(dynamic, dataFixer, i);
/*     */           cyi cyi = cyi.a(dynamic);
/*     */           bsa bsa = bsa.a(dynamic, brk1);
/*     */           return cyl.a(dynamic, dataFixer, i, md3, bsa, cyi, (chw)pair.getFirst(), (Lifecycle)pair.getSecond());
/* 219 */         } catch (Exception exception) {
/*     */           a.error("Exception reading {}", file, exception);
/*     */           return null;
/*     */         } 
/*     */       };
/*     */   }
/*     */   
/*     */   private BiFunction<File, DataFixer, cyh> a(File ☃, boolean bool) {
/* 227 */     return (file1, dataFixer) -> {
/*     */         try {
/*     */           md md1 = mn.a(file1);
/*     */           md md2 = md1.p("Data");
/*     */           md2.r("Player");
/*     */           int i = md2.c("DataVersion", 99) ? md2.h("DataVersion") : -1;
/*     */           Dynamic<mt> dynamic = dataFixer.update(aga.a.a(), new Dynamic(mo.a, md2), i, w.a().getWorldVersion());
/*     */           cyi cyi = cyi.a(dynamic);
/*     */           int j = cyi.a();
/*     */           if (j == 19132 || j == 19133) {
/*     */             boolean bool1 = (j != g());
/*     */             File file = new File(☃, "icon.png");
/*     */             brk brk = dynamic.get("DataPacks").result().map(cyg::a).orElse(brk.a);
/*     */             bsa bsa = bsa.a(dynamic, brk);
/*     */             return new cyh(bsa, cyi, ☃.getName(), bool1, bool, file);
/*     */           } 
/*     */           return null;
/* 244 */         } catch (Exception exception) {
/*     */           a.error("Exception reading {}", file1, exception);
/*     */           return null;
/*     */         } 
/*     */       };
/*     */   }
/*     */   
/*     */   public boolean a(String ☃) {
/*     */     try {
/* 253 */       Path path = this.d.resolve(☃);
/* 254 */       Files.createDirectory(path, (FileAttribute<?>[])new FileAttribute[0]);
/* 255 */       Files.deleteIfExists(path);
/* 256 */       return true;
/* 257 */     } catch (IOException iOException) {
/* 258 */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean b(String ☃) {
/* 263 */     return Files.isDirectory(this.d.resolve(☃), new java.nio.file.LinkOption[0]);
/*     */   }
/*     */   
/*     */   public Path c() {
/* 267 */     return this.d;
/*     */   }
/*     */   
/*     */   public Path d() {
/* 271 */     return this.e;
/*     */   }
/*     */   
/*     */   public a c(String ☃) throws IOException {
/* 275 */     return new a(this, ☃);
/*     */   }
/*     */   
/*     */   public class a implements AutoCloseable {
/*     */     private final aex b;
/*     */     private final Path c;
/*     */     private final String d;
/* 282 */     private final Map<cye, Path> e = Maps.newHashMap();
/*     */     
/*     */     public a(cyg ☃, String str) throws IOException {
/* 285 */       this.d = str;
/* 286 */       this.c = cyg.a(☃).resolve(str);
/* 287 */       this.b = aex.a(this.c);
/*     */     }
/*     */     
/*     */     public String a() {
/* 291 */       return this.d;
/*     */     }
/*     */     
/*     */     public Path a(cye ☃) {
/* 295 */       return this.e.computeIfAbsent(☃, ☃ -> this.c.resolve(☃.a()));
/*     */     }
/*     */     
/*     */     public File a(vj<brx> ☃) {
/* 299 */       return chd.a(☃, this.c.toFile());
/*     */     }
/*     */     
/*     */     private void i() {
/* 303 */       if (!this.b.a()) {
/* 304 */         throw new IllegalStateException("Lock is no longer valid");
/*     */       }
/*     */     }
/*     */     
/*     */     public cyk b() {
/* 309 */       i();
/* 310 */       return new cyk(this, cyg.b(this.a));
/*     */     }
/*     */     
/*     */     public boolean c() {
/* 314 */       cyh ☃ = d();
/* 315 */       return (☃ != null && ☃.k().a() != cyg.c(this.a));
/*     */     }
/*     */     
/*     */     public boolean a(afn ☃) {
/* 319 */       i();
/* 320 */       return cyj.a(this, ☃);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public cyh d() {
/* 325 */       i();
/* 326 */       return (cyh)cyg.a(this.a, this.c.toFile(), cyg.a(this.a, this.c.toFile(), false));
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public cyn a(DynamicOps<mt> ☃, brk brk1) {
/* 331 */       i();
/* 332 */       return (cyn)cyg.a(this.a, this.c.toFile(), cyg.a(☃, brk1));
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public brk e() {
/* 337 */       i();
/* 338 */       return (brk)cyg.a(this.a, this.c.toFile(), (☃, dataFixer) -> cyg.a(☃, dataFixer));
/*     */     }
/*     */     
/*     */     public void a(gn ☃, cyn cyn1) {
/* 342 */       a(☃, cyn1, null);
/*     */     }
/*     */     
/*     */     public void a(gn ☃, cyn cyn1, @Nullable md md1) {
/* 346 */       File file = this.c.toFile();
/*     */       
/* 348 */       md md2 = cyn1.a(☃, md1);
/*     */       
/* 350 */       md md3 = new md();
/* 351 */       md3.a("Data", md2);
/*     */       
/*     */       try {
/* 354 */         File file1 = File.createTempFile("level", ".dat", file);
/* 355 */         mn.a(md3, file1);
/*     */         
/* 357 */         File file2 = new File(file, "level.dat_old");
/* 358 */         File file3 = new File(file, "level.dat");
/* 359 */         x.a(file3, file1, file2);
/* 360 */       } catch (Exception exception) {
/* 361 */         cyg.e().error("Failed to save level {}", file, exception);
/*     */       } 
/*     */     }
/*     */     
/*     */     public File f() {
/* 366 */       i();
/* 367 */       return this.c.resolve("icon.png").toFile();
/*     */     }
/*     */     
/*     */     public void g() throws IOException {
/* 371 */       i();
/*     */       
/* 373 */       Path ☃ = this.c.resolve("session.lock");
/*     */       
/* 375 */       for (int i = 1; i <= 5; i++) {
/* 376 */         cyg.e().info("Attempt {}...", Integer.valueOf(i));
/*     */         
/*     */         try {
/* 379 */           Files.walkFileTree(this.c, new SimpleFileVisitor<Path>(this, ☃)
/*     */               {
/*     */                 public FileVisitResult a(Path ☃, BasicFileAttributes basicFileAttributes) throws IOException {
/* 382 */                   if (!☃.equals(this.a)) {
/* 383 */                     cyg.e().debug("Deleting {}", ☃);
/* 384 */                     Files.delete(☃);
/*     */                   } 
/* 386 */                   return FileVisitResult.CONTINUE;
/*     */                 }
/*     */ 
/*     */                 
/*     */                 public FileVisitResult a(Path ☃, IOException iOException) throws IOException {
/* 391 */                   if (iOException != null) {
/* 392 */                     throw iOException;
/*     */                   }
/*     */                   
/* 395 */                   if (☃.equals(cyg.a.a(this.b))) {
/*     */                     
/* 397 */                     cyg.a.b(this.b).close();
/* 398 */                     Files.deleteIfExists(this.a);
/*     */                   } 
/* 400 */                   Files.delete(☃);
/* 401 */                   return FileVisitResult.CONTINUE;
/*     */                 }
/*     */               });
/*     */           break;
/* 405 */         } catch (IOException iOException) {
/* 406 */           if (i < 5) {
/* 407 */             cyg.e().warn("Failed to delete {}", this.c, iOException);
/*     */             try {
/* 409 */               Thread.sleep(500L);
/* 410 */             } catch (InterruptedException interruptedException) {}
/*     */           } else {
/*     */             
/* 413 */             throw iOException;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     public void a(String ☃) throws IOException {
/* 420 */       i();
/* 421 */       File file1 = new File(cyg.a(this.a).toFile(), this.d);
/* 422 */       if (!file1.exists()) {
/*     */         return;
/*     */       }
/*     */       
/* 426 */       File file2 = new File(file1, "level.dat");
/* 427 */       if (file2.exists()) {
/*     */         
/* 429 */         md md1 = mn.a(file2);
/* 430 */         md md2 = md1.p("Data");
/* 431 */         md2.a("LevelName", ☃);
/*     */         
/* 433 */         mn.a(md1, file2);
/*     */       } 
/*     */     }
/*     */     
/*     */     public long h() throws IOException {
/* 438 */       i();
/* 439 */       String ☃ = LocalDateTime.now().format(cyg.f()) + "_" + this.d;
/*     */       
/* 441 */       Path path1 = this.a.d();
/*     */       try {
/* 443 */         Files.createDirectories(Files.exists(path1, new java.nio.file.LinkOption[0]) ? path1.toRealPath(new java.nio.file.LinkOption[0]) : path1, (FileAttribute<?>[])new FileAttribute[0]);
/* 444 */       } catch (IOException iOException) {
/* 445 */         throw new RuntimeException(iOException);
/*     */       } 
/* 447 */       Path path2 = path1.resolve(s.a(path1, ☃, ".zip"));
/*     */       
/* 449 */       try (ZipOutputStream ☃ = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(path2, new java.nio.file.OpenOption[0])))) {
/* 450 */         Path path = Paths.get(this.d, new String[0]);
/*     */         
/* 452 */         Files.walkFileTree(this.c, new SimpleFileVisitor<Path>(this, path, zipOutputStream)
/*     */             {
/*     */               public FileVisitResult a(Path ☃, BasicFileAttributes basicFileAttributes) throws IOException {
/* 455 */                 if (☃.endsWith("session.lock")) {
/* 456 */                   return FileVisitResult.CONTINUE;
/*     */                 }
/* 458 */                 String str = this.a.resolve(cyg.a.a(this.c).relativize(☃)).toString().replace('\\', '/');
/* 459 */                 ZipEntry zipEntry = new ZipEntry(str);
/* 460 */                 this.b.putNextEntry(zipEntry);
/* 461 */                 Files.asByteSource(☃.toFile()).copyTo(this.b);
/* 462 */                 this.b.closeEntry();
/* 463 */                 return FileVisitResult.CONTINUE;
/*     */               }
/*     */             });
/*     */       } 
/*     */       
/* 468 */       return Files.size(path2);
/*     */     }
/*     */ 
/*     */     
/*     */     public void close() throws IOException {
/* 473 */       this.b.close();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cyg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */