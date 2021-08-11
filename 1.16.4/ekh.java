/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import java.nio.file.Files;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.CompletionStage;
/*     */ import java.util.concurrent.locks.ReentrantLock;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.regex.Pattern;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.codec.digest.DigestUtils;
/*     */ import org.apache.commons.io.FileUtils;
/*     */ import org.apache.commons.io.comparator.LastModifiedFileComparator;
/*     */ import org.apache.commons.io.filefilter.TrueFileFilter;
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
/*     */ public class ekh
/*     */   implements aby
/*     */ {
/*  43 */   private static final Logger a = LogManager.getLogger();
/*  44 */   private static final Pattern b = Pattern.compile("^[a-fA-F0-9]{40}$");
/*     */ 
/*     */ 
/*     */   
/*     */   private final abm c;
/*     */ 
/*     */ 
/*     */   
/*     */   private final File d;
/*     */ 
/*     */   
/*  55 */   private final ReentrantLock e = new ReentrantLock();
/*     */   private final ekg f;
/*     */   @Nullable
/*     */   private CompletableFuture<?> g;
/*     */   @Nullable
/*     */   private abu h;
/*     */   
/*     */   public ekh(File ☃, ekg ekg1) {
/*  63 */     this.d = ☃;
/*  64 */     this.f = ekg1;
/*  65 */     this.c = new eki(ekg1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(Consumer<abu> ☃, abu.a a1) {
/*  70 */     abu abu1 = abu.a("vanilla", true, () -> this.c, a1, abu.b.b, abx.b);
/*  71 */     if (abu1 != null) {
/*  72 */       ☃.accept(abu1);
/*     */     }
/*  74 */     if (this.h != null) {
/*  75 */       ☃.accept(this.h);
/*     */     }
/*     */     
/*  78 */     abu abu2 = a(a1);
/*  79 */     if (abu2 != null) {
/*  80 */       ☃.accept(abu2);
/*     */     }
/*     */   }
/*     */   
/*     */   public abm a() {
/*  85 */     return this.c;
/*     */   }
/*     */   
/*     */   private static Map<String, String> c() {
/*  89 */     Map<String, String> ☃ = Maps.newHashMap();
/*  90 */     ☃.put("X-Minecraft-Username", djz.C().J().c());
/*  91 */     ☃.put("X-Minecraft-UUID", djz.C().J().b());
/*  92 */     ☃.put("X-Minecraft-Version", w.a().getName());
/*  93 */     ☃.put("X-Minecraft-Version-ID", w.a().getId());
/*  94 */     ☃.put("X-Minecraft-Pack-Format", String.valueOf(w.a().getPackVersion()));
/*  95 */     ☃.put("User-Agent", "Minecraft Java/" + w.a().getName());
/*  96 */     return ☃;
/*     */   }
/*     */   
/*     */   public CompletableFuture<?> a(String ☃, String str1) {
/* 100 */     String str2 = DigestUtils.sha1Hex(☃);
/* 101 */     String str3 = b.matcher(str1).matches() ? str1 : "";
/*     */     
/* 103 */     this.e.lock(); try {
/*     */       CompletableFuture<?> completableFuture;
/* 105 */       b();
/* 106 */       d();
/*     */       
/* 108 */       File file = new File(this.d, str2);
/*     */ 
/*     */       
/* 111 */       if (file.exists()) {
/* 112 */         completableFuture = CompletableFuture.completedFuture("");
/*     */       } else {
/* 114 */         dor dor = new dor();
/* 115 */         Map<String, String> map = c();
/*     */         
/* 117 */         djz djz = djz.C();
/* 118 */         djz.g(() -> ☃.a(dor1));
/* 119 */         completableFuture = aff.a(file, ☃, map, 104857600, dor, djz.L());
/*     */       } 
/*     */       
/* 122 */       this
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 128 */         .g = completableFuture.thenCompose(object -> !a(☃, file) ? x.a(new RuntimeException("Hash check failure for file " + file + ", see log")) : a(file, abx.d)).whenComplete((void_, throwable) -> {
/*     */             if (throwable != null) {
/*     */               a.warn("Pack application failed: {}, deleting file {}", throwable.getMessage(), ☃);
/*     */               a(☃);
/*     */             } 
/*     */           });
/* 134 */       return this.g;
/*     */     } finally {
/* 136 */       this.e.unlock();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void a(File ☃) {
/*     */     try {
/* 142 */       Files.delete(☃.toPath());
/* 143 */     } catch (IOException iOException) {
/* 144 */       a.warn("Failed to delete file {}: {}", ☃, iOException.getMessage());
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b() {
/* 149 */     this.e.lock();
/*     */     try {
/* 151 */       if (this.g != null) {
/* 152 */         this.g.cancel(true);
/*     */       }
/*     */       
/* 155 */       this.g = null;
/*     */       
/* 157 */       if (this.h != null) {
/* 158 */         this.h = null;
/* 159 */         djz.C().D();
/*     */       } 
/*     */     } finally {
/* 162 */       this.e.unlock();
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean a(String ☃, File file) {
/*     */     try {
/*     */       String str;
/* 169 */       try (FileInputStream ☃ = new FileInputStream(file)) {
/* 170 */         str = DigestUtils.sha1Hex(fileInputStream);
/*     */       } 
/* 172 */       if (☃.isEmpty()) {
/* 173 */         a.info("Found file {} without verification hash", file);
/* 174 */         return true;
/*     */       } 
/*     */       
/* 177 */       if (str.toLowerCase(Locale.ROOT).equals(☃.toLowerCase(Locale.ROOT))) {
/* 178 */         a.info("Found file {} matching requested hash {}", file, ☃);
/* 179 */         return true;
/*     */       } 
/* 181 */       a.warn("File {} had wrong hash (expected {}, found {}).", file, ☃, str);
/*     */     }
/* 183 */     catch (IOException iOException) {
/* 184 */       String str; a.warn("File {} couldn't be hashed.", file, str);
/*     */     } 
/* 186 */     return false;
/*     */   }
/*     */   
/*     */   private void d() {
/*     */     try {
/* 191 */       List<File> ☃ = Lists.newArrayList(FileUtils.listFiles(this.d, TrueFileFilter.TRUE, null));
/* 192 */       ☃.sort(LastModifiedFileComparator.LASTMODIFIED_REVERSE);
/* 193 */       int i = 0;
/* 194 */       for (File file : ☃) {
/* 195 */         if (i++ >= 10) {
/* 196 */           a.info("Deleting old server resource pack {}", file.getName());
/* 197 */           FileUtils.deleteQuietly(file);
/*     */         } 
/*     */       } 
/* 200 */     } catch (IllegalArgumentException ☃) {
/* 201 */       a.error("Error while deleting old server resource pack : {}", ☃.getMessage());
/*     */     } 
/*     */   }
/*     */   
/*     */   public CompletableFuture<Void> a(File ☃, abx abx1) {
/*     */     abo abo;
/* 207 */     try (abh ☃ = new abh(☃)) {
/* 208 */       abo = abh.<abo>a(abo.a);
/* 209 */     } catch (IOException iOException) {
/* 210 */       return x.a(new IOException(String.format("Invalid resourcepack at %s", new Object[] { ☃ }), iOException));
/*     */     } 
/*     */     
/* 213 */     a.info("Applying server pack {}", ☃);
/* 214 */     this.h = new abu("server", true, () -> new abh(☃), new of("resourcePack.server.name"), abo.a(), abv.a(abo.b()), abu.b.a, true, abx1);
/* 215 */     return djz.C().D();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private abu a(abu.a ☃) {
/* 220 */     abu abu1 = null;
/* 221 */     File file = this.f.a(new vk("resourcepacks/programmer_art.zip"));
/* 222 */     if (file != null && file.isFile()) {
/* 223 */       abu1 = a(☃, () -> c(☃));
/*     */     }
/* 225 */     if (abu1 == null && w.d) {
/* 226 */       File file1 = this.f.a("../resourcepacks/programmer_art");
/* 227 */       if (file1 != null && file1.isDirectory()) {
/* 228 */         abu1 = a(☃, () -> b(☃));
/*     */       }
/*     */     } 
/* 231 */     return abu1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static abu a(abu.a ☃, Supplier<abj> supplier) {
/* 236 */     return abu.a("programer_art", false, supplier, ☃, abu.b.a, abx.b);
/*     */   }
/*     */   
/*     */   private static abi b(File ☃) {
/* 240 */     return new abi(☃)
/*     */       {
/*     */         public String a() {
/* 243 */           return "Programmer Art";
/*     */         }
/*     */       };
/*     */   }
/*     */   
/*     */   private static abj c(File ☃) {
/* 249 */     return new abh(☃)
/*     */       {
/*     */         public String a() {
/* 252 */           return "Programmer Art";
/*     */         }
/*     */       };
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ekh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */