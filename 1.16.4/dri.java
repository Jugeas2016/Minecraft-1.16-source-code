/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.hash.Hashing;
/*     */ import java.io.File;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.nio.file.DirectoryStream;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.LinkOption;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.StandardWatchEventKinds;
/*     */ import java.nio.file.WatchEvent;
/*     */ import java.nio.file.WatchKey;
/*     */ import java.nio.file.WatchService;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.mutable.MutableBoolean;
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
/*     */ public class dri
/*     */   extends dot
/*     */ {
/*  49 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*  51 */   private static final nr b = (new of("pack.dropInfo")).a(k.h);
/*  52 */   private static final nr c = new of("pack.folderInfo");
/*     */ 
/*     */   
/*  55 */   private static final vk p = new vk("textures/misc/unknown_pack.png");
/*     */   
/*     */   private final drh q;
/*     */   
/*     */   private final dot r;
/*     */   
/*     */   @Nullable
/*     */   private a s;
/*     */   private long t;
/*     */   private drj u;
/*     */   private drj v;
/*     */   private final File w;
/*     */   private dlj x;
/*  68 */   private final Map<String, vk> y = Maps.newHashMap();
/*     */   
/*     */   public dri(dot ☃, abw abw1, Consumer<abw> consumer, File file, nr nr1) {
/*  71 */     super(nr1);
/*  72 */     this.r = ☃;
/*  73 */     this.q = new drh(this::k, this::a, abw1, consumer);
/*  74 */     this.w = file;
/*  75 */     this.s = a.a(file);
/*     */   }
/*     */ 
/*     */   
/*     */   public void at_() {
/*  80 */     this.q.c();
/*  81 */     this.i.a(this.r);
/*  82 */     i();
/*     */   }
/*     */   
/*     */   private void i() {
/*  86 */     if (this.s != null) {
/*     */       try {
/*  88 */         this.s.close();
/*  89 */         this.s = null;
/*  90 */       } catch (Exception exception) {}
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void b() {
/*  97 */     this.x = a(new dlj(this.k / 2 + 4, this.l - 48, 150, 20, nq.c, ☃ -> at_()));
/*  98 */     a(new dlj(this.k / 2 - 154, this.l - 48, 150, 20, new of("pack.openFolder"), ☃ -> x.i().a(this.w), (☃, dfm1, i, j) -> b(dfm1, c, i, j)));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 103 */     this.u = new drj(this.i, 200, this.l, new of("pack.available.title"));
/* 104 */     this.u.g(this.k / 2 - 4 - 200);
/* 105 */     this.e.add(this.u);
/*     */     
/* 107 */     this.v = new drj(this.i, 200, this.l, new of("pack.selected.title"));
/* 108 */     this.v.g(this.k / 2 + 4);
/* 109 */     this.e.add(this.v);
/*     */     
/* 111 */     l();
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/* 116 */     if (this.s != null) {
/*     */       try {
/* 118 */         if (this.s.a())
/*     */         {
/* 120 */           this.t = 20L;
/*     */         }
/* 122 */       } catch (IOException ☃) {
/* 123 */         a.warn("Failed to poll for directory {} changes, stopping", this.w);
/* 124 */         i();
/*     */       } 
/*     */     }
/*     */     
/* 128 */     if (this.t > 0L && 
/* 129 */       --this.t == 0L) {
/* 130 */       l();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private void k() {
/* 136 */     a(this.v, this.q.b());
/* 137 */     a(this.u, this.q.a());
/* 138 */     this.x.o = !this.v.au_().isEmpty();
/*     */   }
/*     */   
/*     */   private void a(drj ☃, Stream<drh.a> stream) {
/* 142 */     ☃.au_().clear();
/* 143 */     stream.forEach(a1 -> ☃.au_().add(new drj.a(this.i, ☃, this, a1)));
/*     */   }
/*     */   
/*     */   private void l() {
/* 147 */     this.q.d();
/* 148 */     k();
/* 149 */     this.t = 0L;
/* 150 */     this.y.clear();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 155 */     e(0);
/*     */     
/* 157 */     this.u.a(☃, i, j, f);
/* 158 */     this.v.a(☃, i, j, f);
/*     */     
/* 160 */     a(☃, this.o, this.d, this.k / 2, 8, 16777215);
/* 161 */     a(☃, this.o, b, this.k / 2, 20, 16777215);
/* 162 */     super.a(☃, i, j, f);
/*     */   }
/*     */   
/*     */   protected static void a(djz ☃, List<Path> list, Path path) {
/* 166 */     MutableBoolean mutableBoolean = new MutableBoolean();
/* 167 */     list.forEach(path1 -> {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           try (Stream<Path> ☃ = Files.walk(path1, new java.nio.file.FileVisitOption[0])) {
/*     */             
/*     */             stream.forEach(());
/* 177 */           } catch (IOException iOException) {
/*     */             a.warn("Failed to copy datapack file from {} to {}", path1, ☃);
/*     */             mutableBoolean.setTrue();
/*     */           } 
/*     */         });
/* 182 */     if (mutableBoolean.isTrue()) {
/* 183 */       dmp.c(☃, path.toString());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(List<Path> ☃) {
/* 189 */     String str = ☃.stream().map(Path::getFileName).map(Path::toString).collect(Collectors.joining(", "));
/* 190 */     this.i.a(new dns(bool -> { if (bool) { a(this.i, ☃, this.w.toPath()); l(); }  this.i.a(this); }new of("pack.dropConfirm"), new oe(str)));
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
/*     */   private vk a(ekd ☃, abu abu1) {
/* 202 */     try(abj ☃ = abu1.d(); 
/* 203 */         InputStream ☃ = abj.b("pack.png")) {
/* 204 */       String str = abu1.e();
/* 205 */       vk vk1 = new vk("minecraft", "pack/" + x.a(str, vk::b) + "/" + Hashing.sha1().hashUnencodedChars(str) + "/icon");
/*     */       
/* 207 */       det det = det.a(inputStream);
/* 208 */       ☃.a(vk1, new ejs(det));
/* 209 */       return vk1;
/* 210 */     } catch (FileNotFoundException fileNotFoundException) {
/*     */     
/* 212 */     } catch (Exception exception) {
/* 213 */       a.warn("Failed to load icon from pack {}", abu1.e(), exception);
/*     */     } 
/* 215 */     return p;
/*     */   }
/*     */   
/*     */   private vk a(abu ☃) {
/* 219 */     return this.y.computeIfAbsent(☃.e(), str -> a(this.i.M(), ☃));
/*     */   }
/*     */   
/*     */   static class a implements AutoCloseable {
/*     */     private final WatchService a;
/*     */     private final Path b;
/*     */     
/*     */     public a(File ☃) throws IOException {
/* 227 */       this.b = ☃.toPath();
/* 228 */       this.a = this.b.getFileSystem().newWatchService();
/*     */       
/*     */       try {
/* 231 */         a(this.b);
/*     */ 
/*     */         
/* 234 */         try (DirectoryStream<Path> ☃ = Files.newDirectoryStream(this.b)) {
/* 235 */           for (Path path : directoryStream) {
/* 236 */             if (Files.isDirectory(path, new LinkOption[] { LinkOption.NOFOLLOW_LINKS })) {
/* 237 */               a(path);
/*     */             }
/*     */           } 
/*     */         } 
/* 241 */       } catch (Exception exception) {
/* 242 */         this.a.close();
/* 243 */         throw exception;
/*     */       } 
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public static a a(File ☃) {
/*     */       try {
/* 250 */         return new a(☃);
/* 251 */       } catch (IOException iOException) {
/* 252 */         dri.h().warn("Failed to initialize pack directory {} monitoring", ☃, iOException);
/* 253 */         return null;
/*     */       } 
/*     */     }
/*     */     
/*     */     private void a(Path ☃) throws IOException {
/* 258 */       ☃.register(this.a, (WatchEvent.Kind<?>[])new WatchEvent.Kind[] { StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY });
/*     */     }
/*     */     
/*     */     public boolean a() throws IOException {
/* 262 */       boolean ☃ = false;
/*     */       
/*     */       WatchKey watchKey;
/*     */       
/* 266 */       while ((watchKey = this.a.poll()) != null) {
/* 267 */         List<WatchEvent<?>> list = watchKey.pollEvents();
/* 268 */         for (WatchEvent<?> watchEvent : list) {
/* 269 */           ☃ = true;
/*     */           
/* 271 */           Path path = this.b.resolve((Path)watchEvent.context());
/* 272 */           if (watchKey.watchable() == this.b && watchEvent.kind() == StandardWatchEventKinds.ENTRY_CREATE && Files.isDirectory(path, new LinkOption[] { LinkOption.NOFOLLOW_LINKS })) {
/* 273 */             a(path);
/*     */           }
/*     */         } 
/*     */         
/* 277 */         watchKey.reset();
/*     */       } 
/*     */       
/* 280 */       return ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void close() throws IOException {
/* 285 */       this.a.close();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dri.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */