/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonParser;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.time.Duration;
/*     */ import java.util.Optional;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ import java.util.concurrent.atomic.AtomicBoolean;
/*     */ import java.util.function.Consumer;
/*     */ import org.apache.http.Header;
/*     */ import org.apache.http.HttpEntity;
/*     */ import org.apache.http.HttpResponse;
/*     */ import org.apache.http.client.config.RequestConfig;
/*     */ import org.apache.http.client.methods.CloseableHttpResponse;
/*     */ import org.apache.http.client.methods.HttpPost;
/*     */ import org.apache.http.client.methods.HttpUriRequest;
/*     */ import org.apache.http.entity.InputStreamEntity;
/*     */ import org.apache.http.impl.client.CloseableHttpClient;
/*     */ import org.apache.http.impl.client.HttpClientBuilder;
/*     */ import org.apache.http.util.Args;
/*     */ import org.apache.http.util.EntityUtils;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dfz
/*     */ {
/*  34 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final File b;
/*     */   
/*     */   private final long c;
/*     */   
/*     */   private final int d;
/*     */   
/*     */   private final dhb e;
/*     */   
/*     */   private final String f;
/*     */   private final String g;
/*     */   private final String h;
/*     */   private final dgf i;
/*  48 */   private final AtomicBoolean j = new AtomicBoolean(false);
/*     */   
/*     */   private CompletableFuture<dio> k;
/*  51 */   private final RequestConfig l = RequestConfig.custom()
/*  52 */     .setSocketTimeout((int)TimeUnit.MINUTES.toMillis(10L))
/*  53 */     .setConnectTimeout((int)TimeUnit.SECONDS.toMillis(15L))
/*  54 */     .build();
/*     */   
/*     */   public dfz(File ☃, long l, int i, dhb dhb1, dkm dkm1, String str, dgf dgf1) {
/*  57 */     this.b = ☃;
/*  58 */     this.c = l;
/*  59 */     this.d = i;
/*  60 */     this.e = dhb1;
/*  61 */     this.f = dkm1.a();
/*  62 */     this.g = dkm1.c();
/*  63 */     this.h = str;
/*  64 */     this.i = dgf1;
/*     */   }
/*     */   
/*     */   public void a(Consumer<dio> ☃) {
/*  68 */     if (this.k != null) {
/*     */       return;
/*     */     }
/*     */     
/*  72 */     this.k = CompletableFuture.supplyAsync(() -> a(0));
/*  73 */     this.k.thenAccept(☃);
/*     */   }
/*     */   
/*     */   public void a() {
/*  77 */     this.j.set(true);
/*  78 */     if (this.k != null) {
/*  79 */       this.k.cancel(false);
/*  80 */       this.k = null;
/*     */     } 
/*     */   }
/*     */   
/*     */   private dio a(int ☃) {
/*  85 */     dio.a a = new dio.a();
/*  86 */     if (this.j.get()) {
/*  87 */       return a.a();
/*     */     }
/*  89 */     this.i.b = this.b.length();
/*  90 */     HttpPost httpPost = new HttpPost(this.e.b().resolve("/upload/" + this.c + "/" + this.d));
/*  91 */     CloseableHttpClient closeableHttpClient = HttpClientBuilder.create().setDefaultRequestConfig(this.l).build();
/*     */     try {
/*  93 */       a(httpPost);
/*  94 */       CloseableHttpResponse closeableHttpResponse = closeableHttpClient.execute((HttpUriRequest)httpPost);
/*  95 */       long l = a((HttpResponse)closeableHttpResponse);
/*  96 */       if (a(l, ☃)) {
/*  97 */         return b(l, ☃);
/*     */       }
/*  99 */       a((HttpResponse)closeableHttpResponse, a);
/* 100 */     } catch (Exception exception) {
/* 101 */       if (!this.j.get()) {
/* 102 */         a.error("Caught exception while uploading: ", exception);
/*     */       }
/*     */     } finally {
/* 105 */       a(httpPost, closeableHttpClient);
/*     */     } 
/* 107 */     return a.a();
/*     */   }
/*     */   
/*     */   private void a(HttpPost ☃, CloseableHttpClient closeableHttpClient) {
/* 111 */     ☃.releaseConnection();
/* 112 */     if (closeableHttpClient != null) {
/*     */       try {
/* 114 */         closeableHttpClient.close();
/* 115 */       } catch (IOException iOException) {
/* 116 */         a.error("Failed to close Realms upload client");
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(HttpPost ☃) throws FileNotFoundException {
/* 122 */     ☃.setHeader("Cookie", "sid=" + this.f + ";token=" + this.e.a() + ";user=" + this.g + ";version=" + this.h);
/* 123 */     a a = new a(new FileInputStream(this.b), this.b.length(), this.i);
/* 124 */     a.setContentType("application/octet-stream");
/* 125 */     ☃.setEntity((HttpEntity)a);
/*     */   }
/*     */   
/*     */   private void a(HttpResponse ☃, dio.a a1) throws IOException {
/* 129 */     int i = ☃.getStatusLine().getStatusCode();
/* 130 */     if (i == 401) {
/* 131 */       a.debug("Realms server returned 401: " + ☃.getFirstHeader("WWW-Authenticate"));
/*     */     }
/* 133 */     a1.a(i);
/* 134 */     if (☃.getEntity() != null) {
/* 135 */       String str = EntityUtils.toString(☃.getEntity(), "UTF-8");
/*     */       
/* 137 */       if (str != null) {
/*     */         try {
/* 139 */           JsonParser jsonParser = new JsonParser();
/* 140 */           JsonElement jsonElement = jsonParser.parse(str).getAsJsonObject().get("errorMsg");
/* 141 */           Optional<String> optional = Optional.<JsonElement>ofNullable(jsonElement).map(JsonElement::getAsString);
/* 142 */           a1.a(optional.orElse(null));
/* 143 */         } catch (Exception exception) {}
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean a(long ☃, int i) {
/* 150 */     return (☃ > 0L && i + 1 < 5);
/*     */   }
/*     */   
/*     */   private dio b(long ☃, int i) throws InterruptedException {
/* 154 */     Thread.sleep(Duration.ofSeconds(☃).toMillis());
/* 155 */     return a(i + 1);
/*     */   }
/*     */   
/*     */   private long a(HttpResponse ☃) {
/* 159 */     return ((Long)Optional.<Header>ofNullable(☃.getFirstHeader("Retry-After"))
/* 160 */       .map(Header::getValue)
/* 161 */       .map(Long::valueOf)
/* 162 */       .orElse(Long.valueOf(0L))).longValue();
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 166 */     return (this.k.isDone() || this.k.isCancelled());
/*     */   }
/*     */   
/*     */   static class a extends InputStreamEntity {
/*     */     private final long a;
/*     */     private final InputStream b;
/*     */     private final dgf c;
/*     */     
/*     */     public a(InputStream ☃, long l, dgf dgf1) {
/* 175 */       super(☃);
/* 176 */       this.b = ☃;
/* 177 */       this.a = l;
/* 178 */       this.c = dgf1;
/*     */     }
/*     */ 
/*     */     
/*     */     public void writeTo(OutputStream ☃) throws IOException {
/* 183 */       Args.notNull(☃, "Output stream");
/* 184 */       InputStream inputStream = this.b;
/*     */       try {
/* 186 */         byte[] arrayOfByte = new byte[4096];
/*     */         
/* 188 */         if (this.a < 0L) {
/*     */           int i;
/* 190 */           while ((i = inputStream.read(arrayOfByte)) != -1) {
/* 191 */             ☃.write(arrayOfByte, 0, i);
/* 192 */             this.c.a += i;
/*     */           } 
/*     */         } else {
/*     */           
/* 196 */           long l = this.a;
/* 197 */           while (l > 0L) {
/* 198 */             int i = inputStream.read(arrayOfByte, 0, (int)Math.min(4096L, l));
/* 199 */             if (i == -1) {
/*     */               break;
/*     */             }
/* 202 */             ☃.write(arrayOfByte, 0, i);
/* 203 */             this.c.a += i;
/* 204 */             l -= i;
/* 205 */             ☃.flush();
/*     */           } 
/*     */         } 
/*     */       } finally {
/* 209 */         inputStream.close();
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dfz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */