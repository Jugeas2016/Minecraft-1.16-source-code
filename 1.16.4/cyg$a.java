/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.io.Files;
/*     */ import com.mojang.datafixers.DataFixer;
/*     */ import com.mojang.serialization.DynamicOps;
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
/*     */ import java.util.Map;
/*     */ import java.util.zip.ZipEntry;
/*     */ import java.util.zip.ZipOutputStream;
/*     */ import javax.annotation.Nullable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */   implements AutoCloseable
/*     */ {
/*     */   private final aex b;
/*     */   private final Path c;
/*     */   private final String d;
/* 282 */   private final Map<cye, Path> e = Maps.newHashMap();
/*     */   
/*     */   public a(cyg ☃, String str) throws IOException {
/* 285 */     this.d = str;
/* 286 */     this.c = cyg.a(☃).resolve(str);
/* 287 */     this.b = aex.a(this.c);
/*     */   }
/*     */   
/*     */   public String a() {
/* 291 */     return this.d;
/*     */   }
/*     */   
/*     */   public Path a(cye ☃) {
/* 295 */     return this.e.computeIfAbsent(☃, ☃ -> this.c.resolve(☃.a()));
/*     */   }
/*     */   
/*     */   public File a(vj<brx> ☃) {
/* 299 */     return chd.a(☃, this.c.toFile());
/*     */   }
/*     */   
/*     */   private void i() {
/* 303 */     if (!this.b.a()) {
/* 304 */       throw new IllegalStateException("Lock is no longer valid");
/*     */     }
/*     */   }
/*     */   
/*     */   public cyk b() {
/* 309 */     i();
/* 310 */     return new cyk(this, cyg.b(this.a));
/*     */   }
/*     */   
/*     */   public boolean c() {
/* 314 */     cyh ☃ = d();
/* 315 */     return (☃ != null && ☃.k().a() != cyg.c(this.a));
/*     */   }
/*     */   
/*     */   public boolean a(afn ☃) {
/* 319 */     i();
/* 320 */     return cyj.a(this, ☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public cyh d() {
/* 325 */     i();
/* 326 */     return (cyh)cyg.a(this.a, this.c.toFile(), cyg.a(this.a, this.c.toFile(), false));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public cyn a(DynamicOps<mt> ☃, brk brk1) {
/* 331 */     i();
/* 332 */     return (cyn)cyg.a(this.a, this.c.toFile(), cyg.a(☃, brk1));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public brk e() {
/* 337 */     i();
/* 338 */     return (brk)cyg.a(this.a, this.c.toFile(), (☃, dataFixer) -> cyg.a(☃, dataFixer));
/*     */   }
/*     */   
/*     */   public void a(gn ☃, cyn cyn1) {
/* 342 */     a(☃, cyn1, null);
/*     */   }
/*     */   
/*     */   public void a(gn ☃, cyn cyn1, @Nullable md md1) {
/* 346 */     File file = this.c.toFile();
/*     */     
/* 348 */     md md2 = cyn1.a(☃, md1);
/*     */     
/* 350 */     md md3 = new md();
/* 351 */     md3.a("Data", md2);
/*     */     
/*     */     try {
/* 354 */       File file1 = File.createTempFile("level", ".dat", file);
/* 355 */       mn.a(md3, file1);
/*     */       
/* 357 */       File file2 = new File(file, "level.dat_old");
/* 358 */       File file3 = new File(file, "level.dat");
/* 359 */       x.a(file3, file1, file2);
/* 360 */     } catch (Exception exception) {
/* 361 */       cyg.e().error("Failed to save level {}", file, exception);
/*     */     } 
/*     */   }
/*     */   
/*     */   public File f() {
/* 366 */     i();
/* 367 */     return this.c.resolve("icon.png").toFile();
/*     */   }
/*     */   
/*     */   public void g() throws IOException {
/* 371 */     i();
/*     */     
/* 373 */     Path ☃ = this.c.resolve("session.lock");
/*     */     
/* 375 */     for (int i = 1; i <= 5; i++) {
/* 376 */       cyg.e().info("Attempt {}...", Integer.valueOf(i));
/*     */       
/*     */       try {
/* 379 */         Files.walkFileTree(this.c, new SimpleFileVisitor<Path>(this, ☃)
/*     */             {
/*     */               public FileVisitResult a(Path ☃, BasicFileAttributes basicFileAttributes) throws IOException {
/* 382 */                 if (!☃.equals(this.a)) {
/* 383 */                   cyg.e().debug("Deleting {}", ☃);
/* 384 */                   Files.delete(☃);
/*     */                 } 
/* 386 */                 return FileVisitResult.CONTINUE;
/*     */               }
/*     */ 
/*     */               
/*     */               public FileVisitResult a(Path ☃, IOException iOException) throws IOException {
/* 391 */                 if (iOException != null) {
/* 392 */                   throw iOException;
/*     */                 }
/*     */                 
/* 395 */                 if (☃.equals(cyg.a.a(this.b))) {
/*     */                   
/* 397 */                   cyg.a.b(this.b).close();
/* 398 */                   Files.deleteIfExists(this.a);
/*     */                 } 
/* 400 */                 Files.delete(☃);
/* 401 */                 return FileVisitResult.CONTINUE;
/*     */               }
/*     */             });
/*     */         break;
/* 405 */       } catch (IOException iOException) {
/* 406 */         if (i < 5) {
/* 407 */           cyg.e().warn("Failed to delete {}", this.c, iOException);
/*     */           try {
/* 409 */             Thread.sleep(500L);
/* 410 */           } catch (InterruptedException interruptedException) {}
/*     */         } else {
/*     */           
/* 413 */           throw iOException;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(String ☃) throws IOException {
/* 420 */     i();
/* 421 */     File file1 = new File(cyg.a(this.a).toFile(), this.d);
/* 422 */     if (!file1.exists()) {
/*     */       return;
/*     */     }
/*     */     
/* 426 */     File file2 = new File(file1, "level.dat");
/* 427 */     if (file2.exists()) {
/*     */       
/* 429 */       md md1 = mn.a(file2);
/* 430 */       md md2 = md1.p("Data");
/* 431 */       md2.a("LevelName", ☃);
/*     */       
/* 433 */       mn.a(md1, file2);
/*     */     } 
/*     */   }
/*     */   
/*     */   public long h() throws IOException {
/* 438 */     i();
/* 439 */     String ☃ = LocalDateTime.now().format(cyg.f()) + "_" + this.d;
/*     */     
/* 441 */     Path path1 = this.a.d();
/*     */     try {
/* 443 */       Files.createDirectories(Files.exists(path1, new java.nio.file.LinkOption[0]) ? path1.toRealPath(new java.nio.file.LinkOption[0]) : path1, (FileAttribute<?>[])new FileAttribute[0]);
/* 444 */     } catch (IOException iOException) {
/* 445 */       throw new RuntimeException(iOException);
/*     */     } 
/* 447 */     Path path2 = path1.resolve(s.a(path1, ☃, ".zip"));
/*     */     
/* 449 */     try (ZipOutputStream ☃ = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(path2, new java.nio.file.OpenOption[0])))) {
/* 450 */       Path path = Paths.get(this.d, new String[0]);
/*     */       
/* 452 */       Files.walkFileTree(this.c, new SimpleFileVisitor<Path>(this, path, zipOutputStream)
/*     */           {
/*     */             public FileVisitResult a(Path ☃, BasicFileAttributes basicFileAttributes) throws IOException {
/* 455 */               if (☃.endsWith("session.lock")) {
/* 456 */                 return FileVisitResult.CONTINUE;
/*     */               }
/* 458 */               String str = this.a.resolve(cyg.a.a(this.c).relativize(☃)).toString().replace('\\', '/');
/* 459 */               ZipEntry zipEntry = new ZipEntry(str);
/* 460 */               this.b.putNextEntry(zipEntry);
/* 461 */               Files.asByteSource(☃.toFile()).copyTo(this.b);
/* 462 */               this.b.closeEntry();
/* 463 */               return FileVisitResult.CONTINUE;
/*     */             }
/*     */           });
/*     */     } 
/*     */     
/* 468 */     return Files.size(path2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() throws IOException {
/* 473 */     this.b.close();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cyg$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */