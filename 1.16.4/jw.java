/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.io.BufferedWriter;
/*     */ import java.io.IOException;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.attribute.FileAttribute;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.function.Function;
/*     */ import java.util.stream.Collector;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class jw<T>
/*     */   implements hm
/*     */ {
/*  29 */   private static final Logger d = LogManager.getLogger();
/*  30 */   private static final Gson e = (new GsonBuilder()).setPrettyPrinting().create();
/*     */   
/*     */   protected final hl b;
/*     */   
/*     */   protected final gm<T> c;
/*  35 */   private final Map<vk, ael.a> f = Maps.newLinkedHashMap();
/*     */   
/*     */   protected jw(hl ☃, gm<T> gm1) {
/*  38 */     this.b = ☃;
/*  39 */     this.c = gm1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(hn ☃) {
/*  46 */     this.f.clear();
/*  47 */     b();
/*     */     
/*  49 */     ael<T> ael = aei.a();
/*  50 */     Function<vk, ael<T>> function = vk1 -> this.f.containsKey(vk1) ? ☃ : null;
/*  51 */     Function<vk, T> function1 = ☃ -> this.c.b(☃).orElse(null);
/*  52 */     this.f.forEach((vk1, a1) -> {
/*     */           List<ael.b> list = a1.b(☃, function).collect((Collector)Collectors.toList());
/*     */           
/*     */           if (!list.isEmpty()) {
/*     */             throw new IllegalArgumentException(String.format("Couldn't define tag %s as it is missing following references: %s", new Object[] { vk1, list.stream().map(Objects::toString).collect(Collectors.joining(",")) }));
/*     */           }
/*     */           
/*     */           JsonObject jsonObject = a1.c();
/*     */           Path path = a(vk1);
/*     */           try {
/*     */             String str1 = e.toJson((JsonElement)jsonObject);
/*     */             String str2 = a.hashUnencodedChars(str1).toString();
/*     */             if (!Objects.equals(hn1.a(path), str2) || !Files.exists(path, new java.nio.file.LinkOption[0])) {
/*     */               Files.createDirectories(path.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
/*     */               try (BufferedWriter ☃ = Files.newBufferedWriter(path, new java.nio.file.OpenOption[0])) {
/*     */                 bufferedWriter.write(str1);
/*     */               } 
/*     */             } 
/*     */             hn1.a(path, str2);
/*  71 */           } catch (IOException iOException) {
/*     */             d.error("Couldn't save tags to {}", path, iOException);
/*     */           } 
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected a<T> a(ael.e<T> ☃) {
/*  80 */     ael.a a = b(☃);
/*  81 */     return new a<>(a, this.c, "vanilla");
/*     */   }
/*     */   
/*     */   protected ael.a b(ael.e<T> ☃) {
/*  85 */     return this.f.computeIfAbsent(☃.a(), ☃ -> new ael.a());
/*     */   }
/*     */   protected abstract void b();
/*     */   
/*     */   protected abstract Path a(vk paramvk);
/*     */   
/*     */   public static class a<T> { private final ael.a a;
/*     */     
/*     */     private a(ael.a ☃, gm<T> gm1, String str) {
/*  94 */       this.a = ☃;
/*  95 */       this.b = gm1;
/*  96 */       this.c = str;
/*     */     }
/*     */     private final gm<T> b; private final String c;
/*     */     public a<T> a(T ☃) {
/* 100 */       this.a.a(this.b.b(☃), this.c);
/* 101 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public a<T> a(ael.e<T> ☃) {
/* 110 */       this.a.c(☃.a(), this.c);
/* 111 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @SafeVarargs
/*     */     public final a<T> a(T... ☃) {
/* 122 */       Stream.<T>of(☃).map(this.b::b).forEach(☃ -> this.a.a(☃, this.c));
/* 123 */       return this;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\jw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */