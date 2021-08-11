/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.DataFixer;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.InvalidPathException;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.attribute.FileAttribute;
/*     */ import java.util.Map;
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
/*     */ public class csw
/*     */ {
/*  36 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  42 */   private final Map<vk, ctb> b = Maps.newHashMap();
/*     */   private final DataFixer c;
/*     */   private ach d;
/*     */   private final Path e;
/*     */   
/*     */   public csw(ach ☃, cyg.a a1, DataFixer dataFixer) {
/*  48 */     this.d = ☃;
/*  49 */     this.c = dataFixer;
/*  50 */     this.e = a1.a(cye.f).normalize();
/*     */   }
/*     */   
/*     */   public ctb a(vk ☃) {
/*  54 */     ctb ctb = b(☃);
/*  55 */     if (ctb == null) {
/*  56 */       ctb = new ctb();
/*  57 */       this.b.put(☃, ctb);
/*     */     } 
/*  59 */     return ctb;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ctb b(vk ☃) {
/*  64 */     return this.b.computeIfAbsent(☃, ☃ -> {
/*     */           ctb ctb = f(☃);
/*     */           return (ctb != null) ? ctb : e(☃);
/*     */         });
/*     */   }
/*     */   
/*     */   public void a(ach ☃) {
/*  71 */     this.d = ☃;
/*  72 */     this.b.clear();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private ctb e(vk ☃) {
/*  77 */     vk vk1 = new vk(☃.b(), "structures/" + ☃.a() + ".nbt");
/*  78 */     try (acg ☃ = this.d.a(vk1)) {
/*  79 */       return a(acg.b());
/*  80 */     } catch (FileNotFoundException fileNotFoundException) {
/*  81 */       return null;
/*  82 */     } catch (Throwable throwable) {
/*  83 */       a.error("Couldn't load structure {}: {}", ☃, throwable.toString());
/*  84 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private ctb f(vk ☃) {
/*  90 */     if (!this.e.toFile().isDirectory()) {
/*  91 */       return null;
/*     */     }
/*     */     
/*  94 */     Path path = b(☃, ".nbt");
/*     */     
/*  96 */     try (InputStream ☃ = new FileInputStream(path.toFile())) {
/*  97 */       return a(inputStream);
/*  98 */     } catch (FileNotFoundException fileNotFoundException) {
/*  99 */       return null;
/* 100 */     } catch (IOException iOException) {
/* 101 */       a.error("Couldn't load structure from {}", path, iOException);
/* 102 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   private ctb a(InputStream ☃) throws IOException {
/* 107 */     md md = mn.a(☃);
/* 108 */     return a(md);
/*     */   }
/*     */ 
/*     */   
/*     */   public ctb a(md ☃) {
/* 113 */     if (!☃.c("DataVersion", 99)) {
/* 114 */       ☃.b("DataVersion", 500);
/*     */     }
/*     */     
/* 117 */     ctb ctb = new ctb();
/* 118 */     ctb.b(mp.a(this.c, aga.f, ☃, ☃.h("DataVersion")));
/* 119 */     return ctb;
/*     */   }
/*     */   
/*     */   public boolean c(vk ☃) {
/* 123 */     ctb ctb = this.b.get(☃);
/* 124 */     if (ctb == null) {
/* 125 */       return false;
/*     */     }
/*     */     
/* 128 */     Path path1 = b(☃, ".nbt");
/*     */     
/* 130 */     Path path2 = path1.getParent();
/* 131 */     if (path2 == null) {
/* 132 */       return false;
/*     */     }
/*     */     
/*     */     try {
/* 136 */       Files.createDirectories(Files.exists(path2, new java.nio.file.LinkOption[0]) ? path2.toRealPath(new java.nio.file.LinkOption[0]) : path2, (FileAttribute<?>[])new FileAttribute[0]);
/* 137 */     } catch (IOException iOException) {
/* 138 */       a.error("Failed to create parent directory: {}", path2);
/* 139 */       return false;
/*     */     } 
/*     */     
/* 142 */     md md = ctb.a(new md());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 150 */     try (OutputStream ☃ = new FileOutputStream(path1.toFile())) {
/* 151 */       mn.a(md, outputStream);
/* 152 */     } catch (Throwable throwable) {
/* 153 */       return false;
/*     */     } 
/*     */     
/* 156 */     return true;
/*     */   }
/*     */   
/*     */   public Path a(vk ☃, String str) {
/*     */     try {
/* 161 */       Path path1 = this.e.resolve(☃.b());
/* 162 */       Path path2 = path1.resolve("structures");
/* 163 */       return s.b(path2, ☃.a(), str);
/* 164 */     } catch (InvalidPathException invalidPathException) {
/* 165 */       throw new v("Invalid resource path: " + ☃, invalidPathException);
/*     */     } 
/*     */   }
/*     */   
/*     */   private Path b(vk ☃, String str) {
/* 170 */     if (☃.a().contains("//")) {
/* 171 */       throw new v("Invalid resource path: " + ☃);
/*     */     }
/*     */     
/* 174 */     Path path = a(☃, str);
/*     */     
/* 176 */     if (!path.startsWith(this.e) || !s.a(path) || !s.b(path)) {
/* 177 */       throw new v("Invalid resource path: " + path);
/*     */     }
/*     */     
/* 180 */     return path;
/*     */   }
/*     */   
/*     */   public void d(vk ☃) {
/* 184 */     this.b.remove(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\csw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */