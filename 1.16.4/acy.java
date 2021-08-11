/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.io.Files;
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.BufferedWriter;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class acy<K, V extends acx<K>>
/*     */ {
/*  27 */   protected static final Logger a = LogManager.getLogger();
/*  28 */   private static final Gson b = (new GsonBuilder()).setPrettyPrinting().create();
/*     */   
/*     */   private final File c;
/*  31 */   private final Map<String, V> d = Maps.newHashMap();
/*     */   
/*     */   public acy(File ☃) {
/*  34 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public File b() {
/*  38 */     return this.c;
/*     */   }
/*     */   
/*     */   public void a(V ☃) {
/*  42 */     this.d.put(a(☃.g()), ☃);
/*     */     try {
/*  44 */       e();
/*  45 */     } catch (IOException iOException) {
/*  46 */       a.warn("Could not save the list after adding a user.", iOException);
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public V b(K ☃) {
/*  52 */     g();
/*  53 */     return this.d.get(a(☃));
/*     */   }
/*     */   
/*     */   public void c(K ☃) {
/*  57 */     this.d.remove(a(☃));
/*     */     try {
/*  59 */       e();
/*  60 */     } catch (IOException iOException) {
/*  61 */       a.warn("Could not save the list after removing a user.", iOException);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(acx<K> ☃) {
/*  66 */     c(☃.g());
/*     */   }
/*     */   
/*     */   public String[] a() {
/*  70 */     return (String[])this.d.keySet().toArray((Object[])new String[this.d.size()]);
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  74 */     return (this.d.size() < 1);
/*     */   }
/*     */   
/*     */   protected String a(K ☃) {
/*  78 */     return ☃.toString();
/*     */   }
/*     */   
/*     */   protected boolean d(K ☃) {
/*  82 */     return this.d.containsKey(a(☃));
/*     */   }
/*     */   
/*     */   private void g() {
/*  86 */     List<K> ☃ = Lists.newArrayList();
/*  87 */     for (acx<K> acx : this.d.values()) {
/*  88 */       if (acx.f()) {
/*  89 */         ☃.add(acx.g());
/*     */       }
/*     */     } 
/*  92 */     for (K k : ☃) {
/*  93 */       this.d.remove(a(k));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Collection<V> d() {
/* 100 */     return this.d.values();
/*     */   }
/*     */   
/*     */   public void e() throws IOException {
/* 104 */     JsonArray ☃ = new JsonArray();
/* 105 */     this.d.values().stream().map(☃ -> (JsonObject)x.<JsonObject>a(new JsonObject(), ☃::a)).forEach(☃::add);
/* 106 */     try (BufferedWriter ☃ = Files.newWriter(this.c, StandardCharsets.UTF_8)) {
/* 107 */       b.toJson((JsonElement)☃, bufferedWriter);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void f() throws IOException {
/* 114 */     if (!this.c.exists()) {
/*     */       return;
/*     */     }
/* 117 */     try (BufferedReader ☃ = Files.newReader(this.c, StandardCharsets.UTF_8)) {
/* 118 */       JsonArray jsonArray = (JsonArray)b.fromJson(☃, JsonArray.class);
/*     */       
/* 120 */       this.d.clear();
/* 121 */       for (JsonElement jsonElement : jsonArray) {
/* 122 */         JsonObject jsonObject = afd.m(jsonElement, "entry");
/* 123 */         acx<K> acx = a(jsonObject);
/* 124 */         if (acx.g() != null)
/* 125 */           this.d.put(a(acx.g()), (V)acx); 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected abstract acx<K> a(JsonObject paramJsonObject);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\acy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */