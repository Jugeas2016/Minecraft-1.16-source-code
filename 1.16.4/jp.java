/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStream;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.attribute.FileAttribute;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.io.FileUtils;
/*     */ import org.apache.commons.io.IOUtils;
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
/*     */ public class jp
/*     */   implements hm
/*     */ {
/*     */   @Nullable
/*  32 */   private static final Path b = null;
/*     */   
/*  34 */   private static final Logger c = LogManager.getLogger();
/*     */   
/*     */   private final hl d;
/*     */   
/*  38 */   private final List<a> e = Lists.newArrayList();
/*     */   
/*     */   public jp(hl ☃) {
/*  41 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   public jp a(a ☃) {
/*  45 */     this.e.add(☃);
/*  46 */     return this;
/*     */   }
/*     */   
/*     */   private md a(String ☃, md md1) {
/*  50 */     md md2 = md1;
/*  51 */     for (a a : this.e) {
/*  52 */       md2 = a.a(☃, md2);
/*     */     }
/*  54 */     return md2;
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   public static interface a {
/*     */     md a(String param1String, md param1md); }
/*     */   
/*     */   static class b { private final String a;
/*     */     private final byte[] b;
/*     */     
/*     */     public b(String ☃, byte[] arrayOfByte, @Nullable String str1, String str2) {
/*  65 */       this.a = ☃;
/*  66 */       this.b = arrayOfByte;
/*  67 */       this.c = str1;
/*  68 */       this.d = str2;
/*     */     }
/*     */     @Nullable
/*     */     private final String c; private final String d; }
/*     */   
/*     */   public void a(hn ☃) throws IOException {
/*  74 */     Path path = this.d.b();
/*     */     
/*  76 */     List<CompletableFuture<b>> list = Lists.newArrayList();
/*     */     
/*  78 */     for (Path path1 : this.d.a()) {
/*  79 */       Files.walk(path1, new java.nio.file.FileVisitOption[0]).filter(☃ -> ☃.toString().endsWith(".snbt")).forEach(path2 -> ☃.add(CompletableFuture.supplyAsync((), x.f())));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  84 */     ((List)x.<b>b(list).join()).stream().filter(Objects::nonNull).forEach(b1 -> a(☃, b1, path));
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/*  89 */     return "SNBT -> NBT";
/*     */   }
/*     */   
/*     */   private String a(Path ☃, Path path1) {
/*  93 */     String str = ☃.relativize(path1).toString().replaceAll("\\\\", "/");
/*  94 */     return str.substring(0, str.length() - ".snbt".length());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private b a(Path ☃, String str) {
/*  99 */     try (BufferedReader ☃ = Files.newBufferedReader(☃)) {
/* 100 */       String str3, str1 = IOUtils.toString(bufferedReader);
/* 101 */       md md = a(str, mu.a(str1));
/* 102 */       ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 103 */       mn.a(md, byteArrayOutputStream);
/* 104 */       byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
/* 105 */       String str2 = a.hashBytes(arrayOfByte).toString();
/*     */       
/* 107 */       if (b != null) {
/* 108 */         str3 = md.a("    ", 0).getString() + "\n";
/*     */       } else {
/* 110 */         str3 = null;
/*     */       } 
/* 112 */       return new b(str, arrayOfByte, str3, str2);
/* 113 */     } catch (CommandSyntaxException commandSyntaxException) {
/* 114 */       c.error("Couldn't convert {} from SNBT to NBT at {} as it's invalid SNBT", str, ☃, commandSyntaxException);
/* 115 */     } catch (IOException iOException) {
/* 116 */       c.error("Couldn't convert {} from SNBT to NBT at {}", str, ☃, iOException);
/*     */     } 
/* 118 */     return null;
/*     */   }
/*     */   
/*     */   private void a(hn ☃, b b1, Path path) {
/* 122 */     if (b.a(b1) != null) {
/* 123 */       Path path2 = b.resolve(b.b(b1) + ".snbt");
/*     */       try {
/* 125 */         FileUtils.write(path2.toFile(), b.a(b1), StandardCharsets.UTF_8);
/* 126 */       } catch (IOException iOException) {
/* 127 */         c.error("Couldn't write structure SNBT {} at {}", b.b(b1), path2, iOException);
/*     */       } 
/*     */     } 
/*     */     
/* 131 */     Path path1 = path.resolve(b.b(b1) + ".nbt");
/*     */     try {
/* 133 */       if (!Objects.equals(☃.a(path1), b.c(b1)) || !Files.exists(path1, new java.nio.file.LinkOption[0])) {
/* 134 */         Files.createDirectories(path1.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
/* 135 */         try (OutputStream ☃ = Files.newOutputStream(path1, new java.nio.file.OpenOption[0])) {
/* 136 */           outputStream.write(b.d(b1));
/*     */         } 
/*     */       } 
/* 139 */       ☃.a(path1, b.c(b1));
/* 140 */     } catch (IOException iOException) {
/* 141 */       c.error("Couldn't write structure {} at {}", b.b(b1), path1, iOException);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\jp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */