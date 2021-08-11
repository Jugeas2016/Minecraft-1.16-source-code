/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.internal.Streams;
/*     */ import com.google.gson.stream.JsonWriter;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStreamWriter;
/*     */ import java.net.HttpURLConnection;
/*     */ import java.net.URL;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.Executor;
/*     */ import java.util.concurrent.ExecutorService;
/*     */ import java.util.concurrent.ThreadFactory;
/*     */ import java.util.concurrent.atomic.AtomicInteger;
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
/*     */ public class abd
/*     */   implements AutoCloseable
/*     */ {
/*  38 */   private static final Logger a = LogManager.getLogger();
/*  39 */   private static final AtomicInteger b = new AtomicInteger(1); static {
/*  40 */     c = (☃ -> {
/*     */         Thread thread = new Thread(☃);
/*     */         thread.setName("Chat-Filter-Worker-" + b.getAndIncrement());
/*     */         return thread;
/*     */       });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final ThreadFactory c;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final URL d;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final URL e;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final URL f;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final String g;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int h;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final String i;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final a j;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final ExecutorService k;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(GameProfile ☃, URL uRL, Executor executor) {
/* 101 */     JsonObject jsonObject = new JsonObject();
/* 102 */     jsonObject.addProperty("server", this.i);
/* 103 */     jsonObject.addProperty("room", "Chat");
/* 104 */     jsonObject.addProperty("user_id", ☃.getId().toString());
/* 105 */     jsonObject.addProperty("user_display_name", ☃.getName());
/*     */     
/* 107 */     executor.execute(() -> {
/*     */           try {
/*     */             b(☃, uRL);
/* 110 */           } catch (Exception exception) {
/*     */             a.warn("Failed to send join/leave packet to {} for player {}", uRL, gameProfile, exception);
/*     */           } 
/*     */         });
/*     */   }
/*     */   
/*     */   private CompletableFuture<Optional<String>> a(GameProfile ☃, String str, a a1, Executor executor) {
/* 117 */     if (str.isEmpty()) {
/* 118 */       return CompletableFuture.completedFuture(Optional.of(""));
/*     */     }
/* 120 */     JsonObject jsonObject = new JsonObject();
/* 121 */     jsonObject.addProperty("rule", Integer.valueOf(this.h));
/* 122 */     jsonObject.addProperty("server", this.i);
/* 123 */     jsonObject.addProperty("room", "Chat");
/* 124 */     jsonObject.addProperty("player", ☃.getId().toString());
/* 125 */     jsonObject.addProperty("player_display_name", ☃.getName());
/* 126 */     jsonObject.addProperty("text", str);
/*     */     
/* 128 */     return CompletableFuture.supplyAsync(() -> {
/*     */           try {
/*     */             JsonObject jsonObject = a(☃, this.d);
/*     */             boolean bool = afd.a(jsonObject, "response", false);
/*     */             if (bool) {
/*     */               return Optional.of(str);
/*     */             }
/*     */             String str1 = afd.a(jsonObject, "hashed", (String)null);
/*     */             if (str1 == null) {
/*     */               return Optional.empty();
/*     */             }
/*     */             int i = afd.u(jsonObject, "hashes").size();
/*     */             return a1.shouldIgnore(str1, i) ? Optional.empty() : Optional.<String>of(str1);
/* 141 */           } catch (Exception exception) {
/*     */             a.warn("Failed to validate message '{}'", str, exception);
/*     */             return Optional.empty();
/*     */           } 
/*     */         }executor);
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() {
/* 150 */     this.k.shutdownNow();
/*     */   }
/*     */   
/*     */   private void a(InputStream ☃) throws IOException {
/* 154 */     byte[] arrayOfByte = new byte[1024];
/* 155 */     while (☃.read(arrayOfByte) != -1);
/*     */   }
/*     */ 
/*     */   
/*     */   private JsonObject a(JsonObject ☃, URL uRL) throws IOException {
/* 160 */     HttpURLConnection httpURLConnection = c(☃, uRL);
/*     */     
/* 162 */     try (InputStream ☃ = httpURLConnection.getInputStream()) {
/* 163 */       if (httpURLConnection.getResponseCode() == 204) {
/* 164 */         return new JsonObject();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void b(JsonObject ☃, URL uRL) throws IOException {
/* 175 */     HttpURLConnection httpURLConnection = c(☃, uRL);
/*     */     
/* 177 */     try (InputStream ☃ = httpURLConnection.getInputStream()) {
/* 178 */       a(inputStream);
/*     */     } 
/*     */   }
/*     */   
/*     */   private HttpURLConnection c(JsonObject ☃, URL uRL) throws IOException {
/* 183 */     HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
/* 184 */     httpURLConnection.setConnectTimeout(15000);
/* 185 */     httpURLConnection.setReadTimeout(2000);
/* 186 */     httpURLConnection.setUseCaches(false);
/* 187 */     httpURLConnection.setDoOutput(true);
/* 188 */     httpURLConnection.setDoInput(true);
/*     */     
/* 190 */     httpURLConnection.setRequestMethod("POST");
/* 191 */     httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
/* 192 */     httpURLConnection.setRequestProperty("Accept", "application/json");
/* 193 */     httpURLConnection.setRequestProperty("Authorization", "Basic " + this.g);
/* 194 */     httpURLConnection.setRequestProperty("User-Agent", "Minecraft server" + w.a().getName());
/*     */     
/* 196 */     try(OutputStreamWriter ☃ = new OutputStreamWriter(httpURLConnection.getOutputStream(), StandardCharsets.UTF_8); 
/* 197 */         JsonWriter ☃ = new JsonWriter(outputStreamWriter)) {
/* 198 */       Streams.write((JsonElement)☃, jsonWriter);
/*     */     } 
/*     */ 
/*     */     
/* 202 */     int i = httpURLConnection.getResponseCode();
/* 203 */     if (i < 200 || i >= 300) {
/* 204 */       throw new c(i + " " + httpURLConnection.getResponseMessage());
/*     */     }
/* 206 */     return httpURLConnection;
/*     */   }
/*     */   
/*     */   public abc a(GameProfile ☃) {
/* 210 */     return new b(☃);
/*     */   }
/*     */   
/*     */   public static class c extends RuntimeException {
/*     */     private c(String ☃) {
/* 215 */       super(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   class b implements abc {
/*     */     private final GameProfile b;
/*     */     private final Executor c;
/*     */     
/*     */     private b(abd this$0, GameProfile ☃) {
/* 224 */       this.b = ☃;
/* 225 */       aoe<Runnable> aoe = aoe.a(abd.a(abd.this), "chat stream for " + ☃.getName());
/* 226 */       this.c = aoe::a;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 231 */       abd.a(this.a, this.b, abd.b(this.a), this.c);
/*     */     }
/*     */ 
/*     */     
/*     */     public void b() {
/* 236 */       abd.a(this.a, this.b, abd.c(this.a), this.c);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public CompletableFuture<Optional<List<String>>> a(List<String> ☃) {
/* 244 */       List<CompletableFuture<Optional<String>>> list = (List<CompletableFuture<Optional<String>>>)☃.stream().map(☃ -> abd.a(this.a, this.b, ☃, abd.d(this.a), this.c)).collect(ImmutableList.toImmutableList());
/*     */       
/* 246 */       return x.<Optional<String>>b(list)
/* 247 */         .thenApply(☃ -> Optional.of(☃.stream().map(()).collect(ImmutableList.toImmutableList())))
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 252 */         .exceptionally(☃ -> Optional.empty());
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public CompletableFuture<Optional<String>> a(String ☃) {
/* 258 */       return abd.a(this.a, this.b, ☃, abd.d(this.a), this.c);
/*     */     } }
/*     */   
/*     */   @FunctionalInterface
/*     */   public static interface a { public static final a a = (☃, i) -> false;
/*     */     
/*     */     static {
/* 265 */       b = ((☃, i) -> (☃.length() == i));
/*     */     }
/*     */     
/*     */     public static final a b;
/*     */     
/*     */     boolean shouldIgnore(String param1String, int param1Int); }
/*     */ 
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\abd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */