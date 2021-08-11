/*     */ import com.google.common.util.concurrent.ListeningExecutorService;
/*     */ import com.google.common.util.concurrent.MoreExecutors;
/*     */ import com.google.common.util.concurrent.ThreadFactoryBuilder;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.net.HttpURLConnection;
/*     */ import java.net.Proxy;
/*     */ import java.net.ServerSocket;
/*     */ import java.net.URL;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.Executor;
/*     */ import java.util.concurrent.Executors;
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
/*     */ public class aff
/*     */ {
/*  35 */   private static final Logger b = LogManager.getLogger();
/*  36 */   public static final ListeningExecutorService a = MoreExecutors.listeningDecorator(Executors.newCachedThreadPool((new ThreadFactoryBuilder()).setDaemon(true).setUncaughtExceptionHandler(new o(b)).setNameFormat("Downloader %d").build()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static CompletableFuture<?> a(File ☃, String str, Map<String, String> map, int i, @Nullable afn afn1, Proxy proxy) {
/* 115 */     return CompletableFuture.supplyAsync(() -> {
/*     */           HttpURLConnection httpURLConnection = null;
/*     */           
/*     */           InputStream inputStream = null;
/*     */           
/*     */           OutputStream outputStream = null;
/*     */           
/*     */           if (☃ != null) {
/*     */             ☃.b(new of("resourcepack.downloading"));
/*     */             
/*     */             ☃.c(new of("resourcepack.requesting"));
/*     */           } 
/*     */           
/*     */           try {
/*     */             byte[] arrayOfByte = new byte[4096];
/*     */             
/*     */             URL uRL = new URL(str);
/*     */             
/*     */             httpURLConnection = (HttpURLConnection)uRL.openConnection(proxy);
/*     */             
/*     */             httpURLConnection.setInstanceFollowRedirects(true);
/*     */             
/*     */             float f1 = 0.0F;
/*     */             
/*     */             float f2 = map.entrySet().size();
/*     */             
/*     */             for (Map.Entry<String, String> entry : (Iterable<Map.Entry<String, String>>)map.entrySet()) {
/*     */               httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
/*     */               
/*     */               if (☃ != null) {
/*     */                 ☃.a((int)(++f1 / f2 * 100.0F));
/*     */               }
/*     */             } 
/*     */             
/*     */             inputStream = httpURLConnection.getInputStream();
/*     */             
/*     */             f2 = httpURLConnection.getContentLength();
/*     */             
/*     */             int j = httpURLConnection.getContentLength();
/*     */             if (☃ != null) {
/*     */               ☃.c(new of("resourcepack.progress", new Object[] { String.format(Locale.ROOT, "%.2f", new Object[] { Float.valueOf(f2 / 1000.0F / 1000.0F) }) }));
/*     */             }
/*     */             if (file.exists()) {
/*     */               long l = file.length();
/*     */               if (l == j) {
/*     */                 if (☃ != null) {
/*     */                   ☃.a();
/*     */                 }
/*     */                 return null;
/*     */               } 
/*     */               b.warn("Deleting {} as it does not match what we currently have ({} vs our {}).", file, Integer.valueOf(j), Long.valueOf(l));
/*     */               FileUtils.deleteQuietly(file);
/*     */             } else if (file.getParentFile() != null) {
/*     */               file.getParentFile().mkdirs();
/*     */             } 
/*     */             outputStream = new DataOutputStream(new FileOutputStream(file));
/*     */             if (i > 0 && f2 > i) {
/*     */               if (☃ != null) {
/*     */                 ☃.a();
/*     */               }
/*     */               throw new IOException("Filesize is bigger than maximum allowed (file is " + f1 + ", limit is " + i + ")");
/*     */             } 
/*     */             int k;
/*     */             while ((k = inputStream.read(arrayOfByte)) >= 0) {
/*     */               f1 += k;
/*     */               if (☃ != null) {
/*     */                 ☃.a((int)(f1 / f2 * 100.0F));
/*     */               }
/*     */               if (i > 0 && f1 > i) {
/*     */                 if (☃ != null) {
/*     */                   ☃.a();
/*     */                 }
/*     */                 throw new IOException("Filesize was bigger than maximum allowed (got >= " + f1 + ", limit was " + i + ")");
/*     */               } 
/*     */               if (Thread.interrupted()) {
/*     */                 b.error("INTERRUPTED");
/*     */                 if (☃ != null) {
/*     */                   ☃.a();
/*     */                 }
/*     */                 return null;
/*     */               } 
/*     */               outputStream.write(arrayOfByte, 0, k);
/*     */             } 
/*     */             if (☃ != null) {
/*     */               ☃.a();
/*     */             }
/* 201 */           } catch (Throwable throwable) {
/*     */             throwable.printStackTrace();
/*     */             
/*     */             if (httpURLConnection != null) {
/*     */               InputStream inputStream1 = httpURLConnection.getErrorStream();
/*     */               try {
/*     */                 b.error(IOUtils.toString(inputStream1));
/* 208 */               } catch (IOException iOException) {
/*     */                 iOException.printStackTrace();
/*     */               } 
/*     */             } 
/*     */             if (☃ != null) {
/*     */               ☃.a();
/*     */             }
/*     */           } finally {
/*     */             IOUtils.closeQuietly(inputStream);
/*     */             IOUtils.closeQuietly(outputStream);
/*     */           } 
/*     */           return null;
/*     */         }(Executor)a);
/*     */   }
/*     */ 
/*     */   
/*     */   public static int a() {
/* 225 */     try (ServerSocket ☃ = new ServerSocket(0)) {
/* 226 */       return ☃.getLocalPort();
/* 227 */     } catch (IOException ☃) {
/* 228 */       return 25564;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aff.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */