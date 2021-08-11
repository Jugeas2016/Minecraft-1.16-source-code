/*     */ import com.google.common.hash.Hashing;
/*     */ import com.google.common.io.Files;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.io.BufferedInputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.nio.file.Path;
/*     */ import java.util.Locale;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
/*     */ import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
/*     */ import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
/*     */ import org.apache.commons.io.FileUtils;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ import org.apache.commons.io.output.CountingOutputStream;
/*     */ import org.apache.commons.lang3.StringUtils;
/*     */ import org.apache.http.client.config.RequestConfig;
/*     */ import org.apache.http.client.methods.CloseableHttpResponse;
/*     */ import org.apache.http.client.methods.HttpGet;
/*     */ import org.apache.http.client.methods.HttpUriRequest;
/*     */ import org.apache.http.impl.client.CloseableHttpClient;
/*     */ import org.apache.http.impl.client.HttpClientBuilder;
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
/*     */ public class dfy
/*     */ {
/*  45 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private volatile boolean b;
/*     */   
/*     */   private volatile boolean c;
/*     */   
/*     */   private volatile boolean d;
/*     */   
/*     */   private volatile boolean e;
/*     */   private volatile File f;
/*     */   private volatile File g;
/*     */   private volatile HttpGet h;
/*     */   private Thread i;
/*  58 */   private final RequestConfig j = RequestConfig.custom()
/*  59 */     .setSocketTimeout(120000)
/*  60 */     .setConnectTimeout(120000)
/*  61 */     .build();
/*     */   
/*     */   public long a(String ☃) {
/*  64 */     CloseableHttpClient closeableHttpClient = null;
/*  65 */     HttpGet httpGet = null;
/*     */     try {
/*  67 */       httpGet = new HttpGet(☃);
/*     */ 
/*     */       
/*  70 */       closeableHttpClient = HttpClientBuilder.create().setDefaultRequestConfig(this.j).build();
/*  71 */       CloseableHttpResponse closeableHttpResponse = closeableHttpClient.execute((HttpUriRequest)httpGet);
/*  72 */       return Long.parseLong(closeableHttpResponse.getFirstHeader("Content-Length").getValue());
/*  73 */     } catch (Throwable throwable) {
/*  74 */       a.error("Unable to get content length for download");
/*  75 */       return 0L;
/*     */     } finally {
/*  77 */       if (httpGet != null) {
/*  78 */         httpGet.releaseConnection();
/*     */       }
/*  80 */       if (closeableHttpClient != null) {
/*     */         try {
/*  82 */           closeableHttpClient.close();
/*  83 */         } catch (IOException iOException) {
/*  84 */           a.error("Could not close http client", iOException);
/*     */         } 
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(dhd ☃, String str, dhv.a a1, cyg cyg1) {
/*  91 */     if (this.i != null) {
/*     */       return;
/*     */     }
/*     */     
/*  95 */     this.i = new Thread(() -> {
/*     */           CloseableHttpClient closeableHttpClient = null;
/*     */           
/*     */           try {
/*     */             this.f = File.createTempFile("backup", ".tar.gz");
/*     */             
/*     */             this.h = new HttpGet(☃.a);
/*     */             
/*     */             closeableHttpClient = HttpClientBuilder.create().setDefaultRequestConfig(this.j).build();
/*     */             
/*     */             CloseableHttpResponse closeableHttpResponse = closeableHttpClient.execute((HttpUriRequest)this.h);
/*     */             
/*     */             a1.b = Long.parseLong(closeableHttpResponse.getFirstHeader("Content-Length").getValue());
/*     */             
/*     */             if (closeableHttpResponse.getStatusLine().getStatusCode() != 200) {
/*     */               this.d = true;
/*     */               
/*     */               this.h.abort();
/*     */               return;
/*     */             } 
/*     */             OutputStream outputStream = new FileOutputStream(this.f);
/*     */             b b = new b(str.trim(), this.f, cyg1, a1);
/*     */             a a2 = new a(this, outputStream);
/*     */             a2.a(b);
/*     */             IOUtils.copy(closeableHttpResponse.getEntity().getContent(), (OutputStream)a2);
/* 120 */           } catch (Exception exception) {
/*     */             a.error("Caught exception while downloading: " + exception.getMessage());
/*     */             
/*     */             this.d = true;
/*     */           } finally {
/*     */             this.h.releaseConnection();
/*     */             
/*     */             if (this.f != null) {
/*     */               this.f.delete();
/*     */             }
/*     */             
/*     */             if (!this.d) {
/*     */               if (!☃.b.isEmpty() && !☃.c.isEmpty()) {
/*     */                 try {
/*     */                   this.f = File.createTempFile("resources", ".tar.gz");
/*     */                   
/*     */                   this.h = new HttpGet(☃.b);
/*     */                   
/*     */                   CloseableHttpResponse closeableHttpResponse = closeableHttpClient.execute((HttpUriRequest)this.h);
/*     */                   
/*     */                   a1.b = Long.parseLong(closeableHttpResponse.getFirstHeader("Content-Length").getValue());
/*     */                   
/*     */                   if (closeableHttpResponse.getStatusLine().getStatusCode() != 200) {
/*     */                     this.d = true;
/*     */                     this.h.abort();
/*     */                     return;
/*     */                   } 
/*     */                   OutputStream outputStream = new FileOutputStream(this.f);
/*     */                   c c = new c(this.f, a1, ☃);
/*     */                   a a2 = new a(this, outputStream);
/*     */                   a2.a(c);
/*     */                   IOUtils.copy(closeableHttpResponse.getEntity().getContent(), (OutputStream)a2);
/* 152 */                 } catch (Exception exception) {
/*     */                   a.error("Caught exception while downloading: " + exception.getMessage());
/*     */                   
/*     */                   this.d = true;
/*     */                 } finally {
/*     */                   this.h.releaseConnection();
/*     */                   
/*     */                   if (this.f != null) {
/*     */                     this.f.delete();
/*     */                   }
/*     */                 } 
/*     */               } else {
/*     */                 this.c = true;
/*     */               } 
/*     */             }
/*     */             if (closeableHttpClient != null) {
/*     */               try {
/*     */                 closeableHttpClient.close();
/* 170 */               } catch (IOException iOException) {
/*     */                 a.error("Failed to close Realms download client");
/*     */               } 
/*     */             }
/*     */           } 
/*     */         });
/* 176 */     this.i.setUncaughtExceptionHandler(new dhg(a));
/* 177 */     this.i.start();
/*     */   }
/*     */   
/*     */   public void a() {
/* 181 */     if (this.h != null) {
/* 182 */       this.h.abort();
/*     */     }
/*     */     
/* 185 */     if (this.f != null) {
/* 186 */       this.f.delete();
/*     */     }
/*     */     
/* 189 */     this.b = true;
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 193 */     return this.c;
/*     */   }
/*     */   
/*     */   public boolean c() {
/* 197 */     return this.d;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 201 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/* 205 */   private static final String[] k = new String[] { "CON", "COM", "PRN", "AUX", "CLOCK$", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9" };
/*     */ 
/*     */ 
/*     */   
/*     */   public static String b(String ☃) {
/* 210 */     ☃ = ☃.replaceAll("[\\./\"]", "_");
/*     */     
/* 212 */     for (String str : k) {
/* 213 */       if (☃.equalsIgnoreCase(str)) {
/* 214 */         ☃ = "_" + ☃ + "_";
/*     */       }
/*     */     } 
/*     */     
/* 218 */     return ☃;
/*     */   }
/*     */   private void a(String ☃, File file, cyg cyg1) throws IOException {
/*     */     String str;
/* 222 */     Pattern pattern = Pattern.compile(".*-([0-9]+)$");
/*     */ 
/*     */     
/* 225 */     int i = 1;
/*     */     
/* 227 */     for (char c : w.e) {
/* 228 */       ☃ = ☃.replace(c, '_');
/*     */     }
/*     */     
/* 231 */     if (StringUtils.isEmpty(☃)) {
/* 232 */       ☃ = "Realm";
/*     */     }
/*     */     
/* 235 */     ☃ = b(☃);
/*     */     
/*     */     try {
/* 238 */       for (cyh cyh : cyg1.b()) {
/* 239 */         if (cyh.a().toLowerCase(Locale.ROOT).startsWith(☃.toLowerCase(Locale.ROOT))) {
/* 240 */           Matcher matcher = pattern.matcher(cyh.a());
/* 241 */           if (matcher.matches()) {
/* 242 */             if (Integer.valueOf(matcher.group(1)).intValue() > i)
/* 243 */               i = Integer.valueOf(matcher.group(1)).intValue(); 
/*     */             continue;
/*     */           } 
/* 246 */           i++;
/*     */         }
/*     */       
/*     */       } 
/* 250 */     } catch (Exception exception) {
/* 251 */       a.error("Error getting level list", exception);
/* 252 */       this.d = true;
/*     */       
/*     */       return;
/*     */     } 
/* 256 */     if (!cyg1.a(☃) || i > 1) {
/* 257 */       str = ☃ + ((i == 1) ? "" : ("-" + i));
/*     */       
/* 259 */       if (!cyg1.a(str)) {
/* 260 */         boolean bool = false;
/*     */         
/* 262 */         while (!bool) {
/* 263 */           i++;
/* 264 */           str = ☃ + ((i == 1) ? "" : ("-" + i));
/*     */           
/* 266 */           if (cyg1.a(str)) {
/* 267 */             bool = true;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } else {
/* 272 */       str = ☃;
/*     */     } 
/*     */     
/* 275 */     TarArchiveInputStream tarArchiveInputStream = null;
/* 276 */     File file1 = new File((djz.C()).n.getAbsolutePath(), "saves");
/*     */     try {
/* 278 */       file1.mkdir();
/*     */       
/* 280 */       tarArchiveInputStream = new TarArchiveInputStream((InputStream)new GzipCompressorInputStream(new BufferedInputStream(new FileInputStream(file))));
/*     */       
/* 282 */       TarArchiveEntry tarArchiveEntry = tarArchiveInputStream.getNextTarEntry();
/* 283 */       while (tarArchiveEntry != null) {
/* 284 */         File file2 = new File(file1, tarArchiveEntry.getName().replace("world", str));
/*     */         
/* 286 */         if (tarArchiveEntry.isDirectory()) {
/* 287 */           file2.mkdirs();
/*     */         } else {
/* 289 */           file2.createNewFile();
/*     */           
/* 291 */           try (FileOutputStream ☃ = new FileOutputStream(file2)) {
/* 292 */             IOUtils.copy((InputStream)tarArchiveInputStream, fileOutputStream);
/*     */           } 
/*     */         } 
/*     */         
/* 296 */         tarArchiveEntry = tarArchiveInputStream.getNextTarEntry();
/*     */       } 
/* 298 */     } catch (Exception exception) {
/* 299 */       a.error("Error extracting world", exception);
/* 300 */       this.d = true;
/*     */     } finally {
/* 302 */       if (tarArchiveInputStream != null) {
/* 303 */         tarArchiveInputStream.close();
/*     */       }
/*     */       
/* 306 */       if (file != null) {
/* 307 */         file.delete();
/*     */       }
/*     */       
/* 310 */       try (cyg.a ☃ = cyg1.c(str)) {
/* 311 */         a.a(str.trim());
/* 312 */         Path path = a.a(cye.e);
/* 313 */         a(path.toFile());
/* 314 */       } catch (IOException iOException) {
/* 315 */         a.error("Failed to rename unpacked realms level {}", str, iOException);
/*     */       } 
/*     */       
/* 318 */       this.g = new File(file1, str + File.separator + "resources.zip");
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void a(File ☃) {
/* 323 */     if (☃.exists())
/*     */       try {
/* 325 */         md md1 = mn.a(☃);
/* 326 */         md md2 = md1.p("Data");
/* 327 */         md2.r("Player");
/* 328 */         mn.a(md1, ☃);
/* 329 */       } catch (Exception exception) {
/* 330 */         exception.printStackTrace();
/*     */       }  
/*     */   }
/*     */   
/*     */   class b
/*     */     implements ActionListener {
/*     */     private final String b;
/*     */     private final File c;
/*     */     private final cyg d;
/*     */     private final dhv.a e;
/*     */     
/*     */     private b(dfy this$0, String ☃, File file, cyg cyg1, dhv.a a1) {
/* 342 */       this.b = ☃;
/* 343 */       this.c = file;
/* 344 */       this.d = cyg1;
/* 345 */       this.e = a1;
/*     */     }
/*     */ 
/*     */     
/*     */     public void actionPerformed(ActionEvent ☃) {
/* 350 */       this.e.a = ((dfy.a)☃.getSource()).getByteCount();
/*     */       
/* 352 */       if (this.e.a >= this.e.b && !dfy.a(this.a) && !dfy.b(this.a))
/*     */         try {
/* 354 */           dfy.a(this.a, true);
/* 355 */           dfy.a(this.a, this.b, this.c, this.d);
/* 356 */         } catch (IOException iOException) {
/* 357 */           dfy.e().error("Error extracting archive", iOException);
/* 358 */           dfy.b(this.a, true);
/*     */         }  
/*     */     }
/*     */   }
/*     */   
/*     */   class c
/*     */     implements ActionListener {
/*     */     private final File b;
/*     */     private final dhv.a c;
/*     */     private final dhd d;
/*     */     
/*     */     private c(dfy this$0, File ☃, dhv.a a1, dhd dhd1) {
/* 370 */       this.b = ☃;
/* 371 */       this.c = a1;
/* 372 */       this.d = dhd1;
/*     */     }
/*     */ 
/*     */     
/*     */     public void actionPerformed(ActionEvent ☃) {
/* 377 */       this.c.a = ((dfy.a)☃.getSource()).getByteCount();
/*     */       
/* 379 */       if (this.c.a >= this.c.b && !dfy.a(this.a))
/*     */         
/*     */         try {
/* 382 */           String str = Hashing.sha1().hashBytes(Files.toByteArray(this.b)).toString();
/*     */           
/* 384 */           if (str.equals(this.d.c)) {
/* 385 */             FileUtils.copyFile(this.b, dfy.c(this.a));
/* 386 */             dfy.c(this.a, true);
/*     */           } else {
/* 388 */             dfy.e().error("Resourcepack had wrong hash (expected " + this.d.c + ", found " + str + "). Deleting it.");
/* 389 */             FileUtils.deleteQuietly(this.b);
/* 390 */             dfy.b(this.a, true);
/*     */           } 
/* 392 */         } catch (IOException iOException) {
/* 393 */           dfy.e().error("Error copying resourcepack file", iOException.getMessage());
/* 394 */           dfy.b(this.a, true);
/*     */         }  
/*     */     }
/*     */   }
/*     */   
/*     */   class a
/*     */     extends CountingOutputStream {
/*     */     private ActionListener b;
/*     */     
/*     */     public a(dfy this$0, OutputStream ☃) {
/* 404 */       super(☃);
/*     */     }
/*     */     
/*     */     public void a(ActionListener ☃) {
/* 408 */       this.b = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void afterWrite(int ☃) throws IOException {
/* 413 */       super.afterWrite(☃);
/* 414 */       if (this.b != null)
/* 415 */         this.b.actionPerformed(new ActionEvent(this, 0, null)); 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dfy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */