/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.Reader;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.Executor;
/*     */ import java.util.function.Function;
/*     */ import java.util.stream.Collectors;
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
/*     */ public class aeo<T>
/*     */ {
/*  30 */   private static final Logger a = LogManager.getLogger();
/*  31 */   private static final Gson b = new Gson();
/*     */   
/*  33 */   private static final int c = ".json".length();
/*     */   
/*     */   private final Function<vk, Optional<T>> d;
/*     */   private final String e;
/*     */   private final String f;
/*     */   
/*     */   public aeo(Function<vk, Optional<T>> ☃, String str1, String str2) {
/*  40 */     this.d = ☃;
/*  41 */     this.e = str1;
/*  42 */     this.f = str2;
/*     */   }
/*     */   
/*     */   public CompletableFuture<Map<vk, ael.a>> a(ach ☃, Executor executor) {
/*  46 */     return CompletableFuture.supplyAsync(() -> {
/*     */           Map<vk, ael.a> map = Maps.newHashMap();
/*     */           
/*     */           for (vk vk1 : ☃.a(this.e, ())) {
/*     */             String str = vk1.a();
/*     */             
/*     */             vk vk2 = new vk(vk1.b(), str.substring(this.e.length() + 1, str.length() - c));
/*     */             try {
/*     */               for (acg acg : ☃.c(vk1)) {
/*     */                 try(InputStream ☃ = acg.b(); Reader ☃ = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
/*     */                   JsonObject jsonObject = afd.<JsonObject>a(b, reader, JsonObject.class);
/*     */                   if (jsonObject == null) {
/*     */                     a.error("Couldn't load {} tag list {} from {} in data pack {} as it is empty or null", this.f, vk2, vk1, acg.d());
/*     */                   } else {
/*     */                     ((ael.a)map.computeIfAbsent(vk2, ())).a(jsonObject, acg.d());
/*     */                   } 
/*  62 */                 } catch (IOException|RuntimeException exception) {
/*     */                   a.error("Couldn't read {} tag list {} from {} in data pack {}", this.f, vk2, vk1, acg.d(), exception);
/*     */                 } finally {
/*     */                   IOUtils.closeQuietly(acg);
/*     */                 } 
/*     */               } 
/*  68 */             } catch (IOException iOException) {
/*     */               a.error("Couldn't read {} tag list {} from {}", this.f, vk2, vk1, iOException);
/*     */             } 
/*     */           } 
/*     */           return map;
/*     */         }executor);
/*     */   }
/*     */ 
/*     */   
/*     */   public aem<T> a(Map<vk, ael.a> ☃) {
/*  78 */     Map<vk, ael<T>> map = Maps.newHashMap();
/*  79 */     Function<vk, ael<T>> function = map::get;
/*  80 */     Function<vk, T> function1 = ☃ -> ((Optional)this.d.apply(☃)).orElse(null);
/*     */     
/*  82 */     while (!☃.isEmpty()) {
/*  83 */       boolean bool = false;
/*  84 */       for (Iterator<Map.Entry<vk, ael.a>> iterator = ☃.entrySet().iterator(); iterator.hasNext(); ) {
/*  85 */         Map.Entry<vk, ael.a> entry = iterator.next();
/*  86 */         Optional<ael<T>> optional = ((ael.a)entry.getValue()).a(function, function1);
/*  87 */         if (optional.isPresent()) {
/*  88 */           map.put(entry.getKey(), optional.get());
/*  89 */           iterator.remove();
/*  90 */           bool = true;
/*     */         } 
/*     */       } 
/*  93 */       if (!bool) {
/*     */         break;
/*     */       }
/*     */     } 
/*     */     
/*  98 */     ☃.forEach((vk1, a1) -> a.error("Couldn't load {} tag {} as it is missing following references: {}", this.f, vk1, a1.b(☃, function).<CharSequence>map(Objects::toString).collect(Collectors.joining(","))));
/*     */     
/* 100 */     return aem.a(map);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aeo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */