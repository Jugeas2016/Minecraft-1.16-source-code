/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonObject;
/*     */ import it.unimi.dsi.fastutil.ints.IntCollection;
/*     */ import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.Reader;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class null
/*     */   extends ack<Map<vk, List<deb>>>
/*     */ {
/*     */   null(dmv ☃) {}
/*     */   
/*     */   protected Map<vk, List<deb>> a(ach ☃, anw anw1) {
/*  54 */     anw1.a();
/*  55 */     Gson gson = (new GsonBuilder()).setPrettyPrinting().disableHtmlEscaping().create();
/*     */     
/*  57 */     Map<vk, List<deb>> map = Maps.newHashMap();
/*     */     
/*  59 */     for (vk vk1 : ☃.a("font", ☃ -> ☃.endsWith(".json"))) {
/*  60 */       String str = vk1.a();
/*  61 */       vk vk2 = new vk(vk1.b(), str.substring("font/".length(), str.length() - ".json".length()));
/*  62 */       List<deb> list = map.computeIfAbsent(vk2, ☃ -> Lists.newArrayList((Object[])new deb[] { new dmu() }));
/*     */       
/*  64 */       anw1.a(vk2::toString);
/*     */       try {
/*  66 */         for (acg acg : ☃.c(vk1)) {
/*  67 */           anw1.a(acg::d);
/*  68 */           try(InputStream ☃ = acg.b(); 
/*  69 */               Reader ☃ = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
/*  70 */             anw1.a("reading");
/*  71 */             JsonArray jsonArray = afd.u(afd.<JsonObject>a(gson, reader, JsonObject.class), "providers");
/*     */             
/*  73 */             anw1.b("parsing");
/*     */             
/*  75 */             for (int i = jsonArray.size() - 1; i >= 0; i--) {
/*  76 */               JsonObject jsonObject = afd.m(jsonArray.get(i), "providers[" + i + "]");
/*     */               
/*     */               try {
/*  79 */                 String str1 = afd.h(jsonObject, "type");
/*  80 */                 dnh dnh = dnh.a(str1);
/*     */                 
/*  82 */                 anw1.a(str1);
/*  83 */                 deb deb = dnh.a(jsonObject).a(☃);
/*  84 */                 if (deb != null) {
/*  85 */                   list.add(deb);
/*     */                 }
/*  87 */                 anw1.c();
/*  88 */               } catch (RuntimeException runtimeException) {
/*  89 */                 dmv.c().warn("Unable to read definition '{}' in fonts.json in resourcepack: '{}': {}", vk2, acg.d(), runtimeException.getMessage());
/*     */               } 
/*     */             } 
/*  92 */             anw1.c();
/*  93 */           } catch (RuntimeException runtimeException) {
/*  94 */             dmv.c().warn("Unable to load font '{}' in fonts.json in resourcepack: '{}': {}", vk2, acg.d(), runtimeException.getMessage());
/*     */           } 
/*  96 */           anw1.c();
/*     */         } 
/*  98 */       } catch (IOException iOException) {
/*  99 */         dmv.c().warn("Unable to load font '{}' in fonts.json: {}", vk2, iOException.getMessage());
/*     */       } 
/*     */       
/* 102 */       anw1.a("caching");
/*     */       
/* 104 */       IntOpenHashSet intOpenHashSet = new IntOpenHashSet();
/* 105 */       for (deb deb : list) {
/* 106 */         intOpenHashSet.addAll((IntCollection)deb.a());
/*     */       }
/*     */ 
/*     */       
/* 110 */       intOpenHashSet.forEach(i -> {
/*     */             if (i == 32) {
/*     */               return;
/*     */             }
/*     */             for (deb deb : Lists.reverse(☃)) {
/*     */               if (deb.a(i) != null) {
/*     */                 break;
/*     */               }
/*     */             } 
/*     */           });
/* 120 */       anw1.c();
/*     */       
/* 122 */       anw1.c();
/*     */     } 
/*     */     
/* 125 */     anw1.b();
/* 126 */     return map;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(Map<vk, List<deb>> ☃, ach ach1, anw anw1) {
/* 131 */     anw1.a();
/*     */     
/* 133 */     anw1.a("closing");
/*     */     
/* 135 */     dmv.a(this.a).values().forEach(dmw::close);
/* 136 */     dmv.a(this.a).clear();
/*     */     
/* 138 */     anw1.b("reloading");
/* 139 */     ☃.forEach((☃, list) -> {
/*     */           dmw dmw = new dmw(dmv.b(this.a), ☃);
/*     */           
/*     */           dmw.a(Lists.reverse(list));
/*     */           dmv.a(this.a).put(☃, dmw);
/*     */         });
/* 145 */     anw1.c();
/* 146 */     anw1.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public String c() {
/* 151 */     return "FontManager";
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dmv$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */