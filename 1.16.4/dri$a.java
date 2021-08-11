/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.nio.file.DirectoryStream;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.LinkOption;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.StandardWatchEventKinds;
/*     */ import java.nio.file.WatchEvent;
/*     */ import java.nio.file.WatchKey;
/*     */ import java.nio.file.WatchService;
/*     */ import java.util.List;
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
/*     */ class a
/*     */   implements AutoCloseable
/*     */ {
/*     */   private final WatchService a;
/*     */   private final Path b;
/*     */   
/*     */   public a(File ☃) throws IOException {
/* 227 */     this.b = ☃.toPath();
/* 228 */     this.a = this.b.getFileSystem().newWatchService();
/*     */     
/*     */     try {
/* 231 */       a(this.b);
/*     */ 
/*     */       
/* 234 */       try (DirectoryStream<Path> ☃ = Files.newDirectoryStream(this.b)) {
/* 235 */         for (Path path : directoryStream) {
/* 236 */           if (Files.isDirectory(path, new LinkOption[] { LinkOption.NOFOLLOW_LINKS })) {
/* 237 */             a(path);
/*     */           }
/*     */         } 
/*     */       } 
/* 241 */     } catch (Exception exception) {
/* 242 */       this.a.close();
/* 243 */       throw exception;
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static a a(File ☃) {
/*     */     try {
/* 250 */       return new a(☃);
/* 251 */     } catch (IOException iOException) {
/* 252 */       dri.h().warn("Failed to initialize pack directory {} monitoring", ☃, iOException);
/* 253 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(Path ☃) throws IOException {
/* 258 */     ☃.register(this.a, (WatchEvent.Kind<?>[])new WatchEvent.Kind[] { StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY });
/*     */   }
/*     */   
/*     */   public boolean a() throws IOException {
/* 262 */     boolean ☃ = false;
/*     */     
/*     */     WatchKey watchKey;
/*     */     
/* 266 */     while ((watchKey = this.a.poll()) != null) {
/* 267 */       List<WatchEvent<?>> list = watchKey.pollEvents();
/* 268 */       for (WatchEvent<?> watchEvent : list) {
/* 269 */         ☃ = true;
/*     */         
/* 271 */         Path path = this.b.resolve((Path)watchEvent.context());
/* 272 */         if (watchKey.watchable() == this.b && watchEvent.kind() == StandardWatchEventKinds.ENTRY_CREATE && Files.isDirectory(path, new LinkOption[] { LinkOption.NOFOLLOW_LINKS })) {
/* 273 */           a(path);
/*     */         }
/*     */       } 
/*     */       
/* 277 */       watchKey.reset();
/*     */     } 
/*     */     
/* 280 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() throws IOException {
/* 285 */     this.a.close();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dri$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */