/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.io.File;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.net.URI;
/*     */ import java.net.URISyntaxException;
/*     */ import java.net.URL;
/*     */ import java.nio.file.FileSystem;
/*     */ import java.nio.file.FileSystemNotFoundException;
/*     */ import java.nio.file.FileSystems;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.Paths;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Enumeration;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class abm
/*     */   implements abj
/*     */ {
/*     */   public static Path a;
/*  38 */   private static final Logger d = LogManager.getLogger(); public static Class<?> b;
/*     */   
/*     */   static {
/*  41 */     e = x.<Map<abk, FileSystem>>a(Maps.newHashMap(), ☃ -> {
/*     */           synchronized (abm.class) {
/*     */             for (abk abk : abk.values()) {
/*     */               URL uRL = abm.class.getResource("/" + abk.a() + "/.mcassetsroot");
/*     */               try {
/*     */                 URI uRI = uRL.toURI();
/*     */                 if ("jar".equals(uRI.getScheme())) {
/*     */                   FileSystem fileSystem;
/*     */                   try {
/*     */                     fileSystem = FileSystems.getFileSystem(uRI);
/*  51 */                   } catch (FileSystemNotFoundException fileSystemNotFoundException) {
/*     */                     fileSystem = FileSystems.newFileSystem(uRI, Collections.emptyMap());
/*     */                   } 
/*     */                   ☃.put(abk, fileSystem);
/*     */                 } 
/*  56 */               } catch (URISyntaxException|IOException exception) {
/*     */                 d.error("Couldn't get a list of all vanilla resources", exception);
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         });
/*     */   }
/*     */   private static final Map<abk, FileSystem> e; public final Set<String> c;
/*     */   
/*     */   public abm(String... ☃) {
/*  66 */     this.c = (Set<String>)ImmutableSet.copyOf((Object[])☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public InputStream b(String ☃) throws IOException {
/*  71 */     if (☃.contains("/") || ☃.contains("\\")) {
/*  72 */       throw new IllegalArgumentException("Root resources can only be filenames, not paths (no / allowed!)");
/*     */     }
/*  74 */     if (a != null) {
/*  75 */       Path path = a.resolve(☃);
/*  76 */       if (Files.exists(path, new java.nio.file.LinkOption[0])) {
/*  77 */         return Files.newInputStream(path, new java.nio.file.OpenOption[0]);
/*     */       }
/*     */     } 
/*  80 */     return a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public InputStream a(abk ☃, vk vk1) throws IOException {
/*  85 */     InputStream inputStream = c(☃, vk1);
/*  86 */     if (inputStream != null) {
/*  87 */       return inputStream;
/*     */     }
/*  89 */     throw new FileNotFoundException(vk1.a());
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<vk> a(abk ☃, String str1, String str2, int i, Predicate<String> predicate) {
/*  94 */     Set<vk> set = Sets.newHashSet();
/*     */     
/*  96 */     if (a != null) {
/*     */       try {
/*  98 */         a(set, i, str1, a.resolve(☃.a()), str2, predicate);
/*  99 */       } catch (IOException iOException) {}
/*     */ 
/*     */ 
/*     */       
/* 103 */       if (☃ == abk.a) {
/* 104 */         Enumeration<URL> enumeration = null;
/*     */         try {
/* 106 */           enumeration = b.getClassLoader().getResources(☃.a() + "/");
/* 107 */         } catch (IOException iOException) {}
/*     */         
/* 109 */         while (enumeration != null && enumeration.hasMoreElements()) {
/*     */           try {
/* 111 */             URI uRI = ((URL)enumeration.nextElement()).toURI();
/* 112 */             if ("file".equals(uRI.getScheme())) {
/* 113 */               a(set, i, str1, Paths.get(uRI), str2, predicate);
/*     */             }
/* 115 */           } catch (URISyntaxException|IOException uRISyntaxException) {}
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 122 */     try { URL uRL = abm.class.getResource("/" + ☃.a() + "/.mcassetsroot");
/* 123 */       if (uRL == null) {
/* 124 */         d.error("Couldn't find .mcassetsroot, cannot load vanilla resources");
/* 125 */         return set;
/*     */       } 
/* 127 */       URI uRI = uRL.toURI();
/* 128 */       if ("file".equals(uRI.getScheme())) {
/* 129 */         URL uRL1 = new URL(uRL.toString().substring(0, uRL.toString().length() - ".mcassetsroot".length()));
/* 130 */         Path path = Paths.get(uRL1.toURI());
/* 131 */         a(set, i, str1, path, str2, predicate);
/* 132 */       } else if ("jar".equals(uRI.getScheme())) {
/* 133 */         Path path = ((FileSystem)e.get(☃)).getPath("/" + ☃.a(), new String[0]);
/* 134 */         a(set, i, "minecraft", path, str2, predicate);
/*     */       } else {
/* 136 */         d.error("Unsupported scheme {} trying to list vanilla resources (NYI?)", uRI);
/*     */       }  }
/* 138 */     catch (FileNotFoundException|java.nio.file.NoSuchFileException fileNotFoundException) {  }
/* 139 */     catch (URISyntaxException|IOException exception)
/* 140 */     { d.error("Couldn't get a list of all vanilla resources", exception); }
/*     */ 
/*     */     
/* 143 */     return set;
/*     */   }
/*     */   
/*     */   private static void a(Collection<vk> ☃, int i, String str1, Path path, String str2, Predicate<String> predicate) throws IOException {
/* 147 */     Path path1 = path.resolve(str1);
/* 148 */     try (Stream<Path> ☃ = Files.walk(path1.resolve(str2), i, new java.nio.file.FileVisitOption[0])) {
/* 149 */       stream
/* 150 */         .filter(path -> (!path.endsWith(".mcmeta") && Files.isRegularFile(path, new java.nio.file.LinkOption[0]) && ☃.test(path.getFileName().toString())))
/* 151 */         .map(path2 -> new vk(☃, path1.relativize(path2).toString().replaceAll("\\\\", "/")))
/* 152 */         .forEach(☃::add);
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected InputStream c(abk ☃, vk vk1) {
/* 158 */     String str = d(☃, vk1);
/*     */     
/* 160 */     if (a != null) {
/* 161 */       Path path = a.resolve(☃.a() + "/" + vk1.b() + "/" + vk1.a());
/* 162 */       if (Files.exists(path, new java.nio.file.LinkOption[0])) {
/*     */         try {
/* 164 */           return Files.newInputStream(path, new java.nio.file.OpenOption[0]);
/* 165 */         } catch (IOException iOException) {}
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/*     */     try {
/* 171 */       URL uRL = abm.class.getResource(str);
/* 172 */       if (a(str, uRL)) {
/* 173 */         return uRL.openStream();
/*     */       }
/* 175 */     } catch (IOException iOException) {
/* 176 */       return abm.class.getResourceAsStream(str);
/*     */     } 
/*     */     
/* 179 */     return null;
/*     */   }
/*     */   
/*     */   private static String d(abk ☃, vk vk1) {
/* 183 */     return "/" + ☃.a() + "/" + vk1.b() + "/" + vk1.a();
/*     */   }
/*     */   
/*     */   private static boolean a(String ☃, @Nullable URL uRL) throws IOException {
/* 187 */     return (uRL != null && (uRL.getProtocol().equals("jar") || abi.a(new File(uRL.getFile()), ☃)));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected InputStream a(String ☃) {
/* 192 */     return abm.class.getResourceAsStream("/" + ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(abk ☃, vk vk1) {
/* 197 */     String str = d(☃, vk1);
/*     */     
/* 199 */     if (a != null) {
/* 200 */       Path path = a.resolve(☃.a() + "/" + vk1.b() + "/" + vk1.a());
/* 201 */       if (Files.exists(path, new java.nio.file.LinkOption[0])) {
/* 202 */         return true;
/*     */       }
/*     */     } 
/*     */     
/*     */     try {
/* 207 */       URL uRL = abm.class.getResource(str);
/* 208 */       return a(str, uRL);
/* 209 */     } catch (IOException iOException) {
/*     */ 
/*     */       
/* 212 */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   public Set<String> a(abk ☃) {
/* 217 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public <T> T a(abn<T> ☃) throws IOException {
/* 223 */     try (InputStream ☃ = b("pack.mcmeta")) {
/* 224 */       return (T)abg.a((abn)☃, inputStream);
/* 225 */     } catch (RuntimeException|FileNotFoundException exception) {
/* 226 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/* 232 */     return "Default";
/*     */   }
/*     */   
/*     */   public void close() {}
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\abm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */