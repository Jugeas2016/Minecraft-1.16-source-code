/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bor
/*     */   extends acj
/*     */ {
/*  36 */   private static final Gson a = (new GsonBuilder()).setPrettyPrinting().disableHtmlEscaping().create();
/*  37 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*  39 */   private Map<bot<?>, Map<vk, boq<?>>> c = (Map<bot<?>, Map<vk, boq<?>>>)ImmutableMap.of();
/*     */   private boolean d;
/*     */   
/*     */   public bor() {
/*  43 */     super(a, "recipes");
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(Map<vk, JsonElement> ☃, ach ach1, anw anw1) {
/*  48 */     this.d = false;
/*  49 */     Map<bot<?>, ImmutableMap.Builder<vk, boq<?>>> map = Maps.newHashMap();
/*     */     
/*  51 */     for (Map.Entry<vk, JsonElement> entry : ☃.entrySet()) {
/*  52 */       vk vk = entry.getKey();
/*     */       try {
/*  54 */         boq<?> boq = a(vk, afd.m(entry.getValue(), "top element"));
/*  55 */         ((ImmutableMap.Builder)map.computeIfAbsent(boq.g(), ☃ -> ImmutableMap.builder())).put(vk, boq);
/*  56 */       } catch (JsonParseException|IllegalArgumentException runtimeException) {
/*  57 */         b.error("Parsing error loading recipe {}", vk, runtimeException);
/*     */       } 
/*     */     } 
/*     */     
/*  61 */     this.c = (Map<bot<?>, Map<vk, boq<?>>>)map.entrySet().stream().collect(ImmutableMap.toImmutableMap(Map.Entry::getKey, ☃ -> ((ImmutableMap.Builder)☃.getValue()).build()));
/*  62 */     b.info("Loaded {} recipes", Integer.valueOf(map.size()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <C extends aon, T extends boq<C>> Optional<T> a(bot<T> ☃, C c, brx brx1) {
/*  70 */     return b(☃).values().stream().flatMap(boq1 -> x.a(☃.a(boq1, brx1, aon1))).findFirst();
/*     */   }
/*     */   
/*     */   public <C extends aon, T extends boq<C>> List<T> a(bot<T> ☃) {
/*  74 */     return (List<T>)b(☃).values()
/*  75 */       .stream()
/*  76 */       .map(☃ -> ☃)
/*  77 */       .collect(Collectors.toList());
/*     */   }
/*     */   
/*     */   public <C extends aon, T extends boq<C>> List<T> b(bot<T> ☃, C c, brx brx1) {
/*  81 */     return (List<T>)b(☃).values()
/*  82 */       .stream()
/*  83 */       .flatMap(boq1 -> x.a(☃.a(boq1, brx1, aon1)))
/*  84 */       .sorted(Comparator.comparing(☃ -> ☃.c().j()))
/*  85 */       .collect(Collectors.toList());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private <C extends aon, T extends boq<C>> Map<vk, boq<C>> b(bot<T> ☃) {
/*  91 */     return (Map<vk, boq<C>>)this.c.getOrDefault(☃, Collections.emptyMap());
/*     */   }
/*     */   
/*     */   public <C extends aon, T extends boq<C>> gj<bmb> c(bot<T> ☃, C c, brx brx1) {
/*  95 */     Optional<T> optional = a(☃, c, brx1);
/*  96 */     if (optional.isPresent()) {
/*  97 */       return ((boq<C>)optional.get()).b(c);
/*     */     }
/*     */     
/* 100 */     gj<bmb> gj = gj.a(c.Z_(), bmb.b);
/* 101 */     for (int i = 0; i < gj.size(); i++) {
/* 102 */       gj.set(i, c.a(i));
/*     */     }
/* 104 */     return gj;
/*     */   }
/*     */   
/*     */   public Optional<? extends boq<?>> a(vk ☃) {
/* 108 */     return this.c.values().stream().map(map -> (boq)map.get(☃)).filter(Objects::nonNull).findFirst();
/*     */   }
/*     */   
/*     */   public Collection<boq<?>> b() {
/* 112 */     return (Collection<boq<?>>)this.c.values().stream().flatMap(☃ -> ☃.values().stream()).collect(Collectors.toSet());
/*     */   }
/*     */   
/*     */   public Stream<vk> d() {
/* 116 */     return this.c.values().stream().flatMap(☃ -> ☃.keySet().stream());
/*     */   }
/*     */   
/*     */   public static boq<?> a(vk ☃, JsonObject jsonObject) {
/* 120 */     String str = afd.h(jsonObject, "type");
/* 121 */     return ((bos<boq<?>>)gm.ae.b(new vk(str))
/* 122 */       .orElseThrow(() -> new JsonSyntaxException("Invalid or unsupported recipe type '" + ☃ + "'")))
/* 123 */       .a(☃, jsonObject);
/*     */   }
/*     */   
/*     */   public void a(Iterable<boq<?>> ☃) {
/* 127 */     this.d = false;
/*     */     
/* 129 */     Map<bot<?>, Map<vk, boq<?>>> map = Maps.newHashMap();
/* 130 */     ☃.forEach(boq1 -> {
/*     */           Map<vk, boq<?>> map = ☃.computeIfAbsent(boq1.g(), ());
/*     */           
/*     */           boq<?> boq2 = map.put(boq1.f(), boq1);
/*     */           if (boq2 != null) {
/*     */             throw new IllegalStateException("Duplicate recipe ignored with ID " + boq1.f());
/*     */           }
/*     */         });
/* 138 */     this.c = (Map<bot<?>, Map<vk, boq<?>>>)ImmutableMap.copyOf(map);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */