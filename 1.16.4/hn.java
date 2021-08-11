/*     */ import com.google.common.base.Charsets;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.io.IOException;
/*     */ import java.io.Writer;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.attribute.FileAttribute;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Set;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ public class hn
/*     */ {
/*  22 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final Path b;
/*     */   
/*     */   private final Path c;
/*     */   
/*     */   private int d;
/*  29 */   private final Map<Path, String> e = Maps.newHashMap();
/*  30 */   private final Map<Path, String> f = Maps.newHashMap();
/*  31 */   private final Set<Path> g = Sets.newHashSet();
/*     */   
/*     */   public hn(Path ☃, String str) throws IOException {
/*  34 */     this.b = ☃;
/*     */     
/*  36 */     Path path = ☃.resolve(".cache");
/*  37 */     Files.createDirectories(path, (FileAttribute<?>[])new FileAttribute[0]);
/*  38 */     this.c = path.resolve(str);
/*     */     
/*  40 */     c().forEach(☃ -> (String)this.e.put(☃, ""));
/*     */     
/*  42 */     if (Files.isReadable(this.c))
/*  43 */       IOUtils.readLines(Files.newInputStream(this.c, new java.nio.file.OpenOption[0]), Charsets.UTF_8).forEach(str -> {
/*     */             int i = str.indexOf(' ');
/*     */             this.e.put(☃.resolve(str.substring(i + 1)), str.substring(0, i));
/*     */           }); 
/*     */   }
/*     */   
/*     */   public void a() throws IOException {
/*     */     Writer ☃;
/*  51 */     b();
/*     */ 
/*     */     
/*     */     try {
/*  55 */       ☃ = Files.newBufferedWriter(this.c, new java.nio.file.OpenOption[0]);
/*  56 */     } catch (IOException iOException) {
/*  57 */       a.warn("Unable write cachefile {}: {}", this.c, iOException.toString());
/*     */       
/*     */       return;
/*     */     } 
/*  61 */     IOUtils.writeLines((Collection)this.f
/*  62 */         .entrySet().stream().map(☃ -> (String)☃.getValue() + ' ' + this.b.relativize((Path)☃.getKey())).collect(Collectors.toList()), 
/*  63 */         System.lineSeparator(), ☃);
/*     */ 
/*     */ 
/*     */     
/*  67 */     ☃.close();
/*     */     
/*  69 */     a.debug("Caching: cache hits: {}, created: {} removed: {}", 
/*  70 */         Integer.valueOf(this.d), 
/*  71 */         Integer.valueOf(this.f.size() - this.d), 
/*  72 */         Integer.valueOf(this.e.size()));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public String a(Path ☃) {
/*  78 */     return this.e.get(☃);
/*     */   }
/*     */   
/*     */   public void a(Path ☃, String str) {
/*  82 */     this.f.put(☃, str);
/*  83 */     if (Objects.equals(this.e.remove(☃), str)) {
/*  84 */       this.d++;
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean b(Path ☃) {
/*  89 */     return this.e.containsKey(☃);
/*     */   }
/*     */   
/*     */   public void c(Path ☃) {
/*  93 */     this.g.add(☃);
/*     */   }
/*     */   
/*     */   private void b() throws IOException {
/*  97 */     c().forEach(☃ -> {
/*     */           if (b(☃) && !this.g.contains(☃)) {
/*     */             try {
/*     */               Files.delete(☃);
/* 101 */             } catch (IOException iOException) {
/*     */               a.debug("Unable to delete: {} ({})", ☃, iOException.toString());
/*     */             } 
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   private Stream<Path> c() throws IOException {
/* 109 */     return Files.walk(this.b, new java.nio.file.FileVisitOption[0]).filter(☃ -> (!Objects.equals(this.c, ☃) && !Files.isDirectory(☃, new java.nio.file.LinkOption[0])));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\hn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */