/*     */ import com.google.common.base.Charsets;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.common.io.Files;
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.internal.Streams;
/*     */ import com.google.gson.reflect.TypeToken;
/*     */ import com.google.gson.stream.JsonReader;
/*     */ import com.mojang.datafixers.DataFixer;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import com.mojang.serialization.DynamicOps;
/*     */ import com.mojang.serialization.JsonOps;
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStream;
/*     */ import java.io.OutputStreamWriter;
/*     */ import java.io.StringReader;
/*     */ import java.io.Writer;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.stream.Collector;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class vt
/*     */ {
/*  56 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*  58 */   private static final Gson b = (new GsonBuilder())
/*  59 */     .registerTypeAdapter(aa.class, new aa.a())
/*  60 */     .registerTypeAdapter(vk.class, new vk.a())
/*  61 */     .setPrettyPrinting()
/*  62 */     .create();
/*  63 */   private static final TypeToken<Map<vk, aa>> c = new TypeToken<Map<vk, aa>>()
/*     */     {
/*     */     
/*     */     };
/*     */   private final DataFixer d;
/*  68 */   private final Map<y, aa> g = Maps.newLinkedHashMap(); private final acu e; private final File f;
/*  69 */   private final Set<y> h = Sets.newLinkedHashSet();
/*  70 */   private final Set<y> i = Sets.newLinkedHashSet();
/*  71 */   private final Set<y> j = Sets.newLinkedHashSet();
/*     */   private aah k;
/*     */   @Nullable
/*     */   private y l;
/*     */   private boolean m = true;
/*     */   
/*     */   public vt(DataFixer ☃, acu acu1, vv vv1, File file, aah aah1) {
/*  78 */     this.d = ☃;
/*  79 */     this.e = acu1;
/*  80 */     this.f = file;
/*  81 */     this.k = aah1;
/*  82 */     d(vv1);
/*     */   }
/*     */   
/*     */   public void a(aah ☃) {
/*  86 */     this.k = ☃;
/*     */   }
/*     */   
/*     */   public void a() {
/*  90 */     for (af<?> ☃ : ac.a()) {
/*  91 */       ☃.a(this);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(vv ☃) {
/*  96 */     a();
/*  97 */     this.g.clear();
/*  98 */     this.h.clear();
/*  99 */     this.i.clear();
/* 100 */     this.j.clear();
/* 101 */     this.m = true;
/* 102 */     this.l = null;
/* 103 */     d(☃);
/*     */   }
/*     */   
/*     */   private void b(vv ☃) {
/* 107 */     for (y y1 : ☃.a()) {
/* 108 */       c(y1);
/*     */     }
/*     */   }
/*     */   
/*     */   private void c() {
/* 113 */     List<y> ☃ = Lists.newArrayList();
/* 114 */     for (Map.Entry<y, aa> entry : this.g.entrySet()) {
/* 115 */       if (((aa)entry.getValue()).a()) {
/* 116 */         ☃.add(entry.getKey());
/* 117 */         this.j.add(entry.getKey());
/*     */       } 
/*     */     } 
/* 120 */     for (y y1 : ☃) {
/* 121 */       e(y1);
/*     */     }
/*     */   }
/*     */   
/*     */   private void c(vv ☃) {
/* 126 */     for (y y1 : ☃.a()) {
/* 127 */       if (y1.f().isEmpty()) {
/* 128 */         a(y1, "");
/* 129 */         y1.d().a(this.k);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void d(vv ☃) {
/* 135 */     if (this.f.isFile()) {
/* 136 */       try (JsonReader ☃ = new JsonReader(new StringReader(Files.toString(this.f, StandardCharsets.UTF_8)))) {
/* 137 */         jsonReader.setLenient(false);
/* 138 */         Dynamic<JsonElement> dynamic = new Dynamic((DynamicOps)JsonOps.INSTANCE, Streams.parse(jsonReader));
/*     */ 
/*     */         
/* 141 */         if (!dynamic.get("DataVersion").asNumber().result().isPresent()) {
/* 142 */           dynamic = dynamic.set("DataVersion", dynamic.createInt(1343));
/*     */         }
/* 144 */         dynamic = this.d.update(aga.i.a(), dynamic, dynamic.get("DataVersion").asInt(0), w.a().getWorldVersion());
/*     */         
/* 146 */         dynamic = dynamic.remove("DataVersion");
/*     */         
/* 148 */         Map<vk, aa> map = (Map<vk, aa>)b.getAdapter(c).fromJsonTree((JsonElement)dynamic.getValue());
/*     */         
/* 150 */         if (map == null) {
/* 151 */           throw new JsonParseException("Found null for advancements");
/*     */         }
/* 153 */         Stream<Map.Entry<vk, aa>> stream = map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue));
/* 154 */         for (Map.Entry<vk, aa> entry : (Iterable<Map.Entry<vk, aa>>)stream.collect((Collector)Collectors.toList())) {
/* 155 */           y y1 = ☃.a(entry.getKey());
/* 156 */           if (y1 == null) {
/* 157 */             a.warn("Ignored advancement '{}' in progress file {} - it doesn't exist anymore?", entry.getKey(), this.f);
/*     */             continue;
/*     */           } 
/* 160 */           a(y1, entry.getValue());
/*     */         } 
/* 162 */       } catch (JsonParseException jsonParseException) {
/* 163 */         a.error("Couldn't parse player advancements in {}", this.f, jsonParseException);
/* 164 */       } catch (IOException iOException) {
/* 165 */         a.error("Couldn't access player advancements in {}", this.f, iOException);
/*     */       } 
/*     */     }
/*     */     
/* 169 */     c(☃);
/* 170 */     c();
/* 171 */     b(☃);
/*     */   }
/*     */   
/*     */   public void b() {
/* 175 */     Map<vk, aa> ☃ = Maps.newHashMap();
/* 176 */     for (Map.Entry<y, aa> entry : this.g.entrySet()) {
/* 177 */       aa aa = entry.getValue();
/* 178 */       if (aa.b()) {
/* 179 */         ☃.put(((y)entry.getKey()).h(), aa);
/*     */       }
/*     */     } 
/* 182 */     if (this.f.getParentFile() != null) {
/* 183 */       this.f.getParentFile().mkdirs();
/*     */     }
/*     */     
/* 186 */     JsonElement jsonElement = b.toJsonTree(☃);
/* 187 */     jsonElement.getAsJsonObject().addProperty("DataVersion", Integer.valueOf(w.a().getWorldVersion()));
/* 188 */     try(OutputStream ☃ = new FileOutputStream(this.f); Writer ☃ = new OutputStreamWriter(outputStream, Charsets.UTF_8.newEncoder())) {
/* 189 */       b.toJson(jsonElement, writer);
/* 190 */     } catch (IOException iOException) {
/* 191 */       a.error("Couldn't save player advancements to {}", this.f, iOException);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a(y ☃, String str) {
/* 196 */     boolean bool1 = false;
/*     */     
/* 198 */     aa aa = b(☃);
/* 199 */     boolean bool2 = aa.a();
/*     */     
/* 201 */     if (aa.a(str)) {
/* 202 */       d(☃);
/* 203 */       this.j.add(☃);
/* 204 */       bool1 = true;
/*     */       
/* 206 */       if (!bool2 && aa.a()) {
/* 207 */         ☃.d().a(this.k);
/* 208 */         if (☃.c() != null && ☃.c().i() && this.k.l.V().b(brt.w)) {
/* 209 */           this.e.a(new of("chat.type.advancement." + ☃.c().e().a(), new Object[] { this.k.d(), ☃.j() }), no.b, x.b);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 214 */     if (aa.a()) {
/* 215 */       e(☃);
/*     */     }
/*     */     
/* 218 */     return bool1;
/*     */   }
/*     */   
/*     */   public boolean b(y ☃, String str) {
/* 222 */     boolean bool = false;
/*     */     
/* 224 */     aa aa = b(☃);
/* 225 */     if (aa.b(str)) {
/* 226 */       c(☃);
/* 227 */       this.j.add(☃);
/* 228 */       bool = true;
/*     */     } 
/*     */     
/* 231 */     if (!aa.b()) {
/* 232 */       e(☃);
/*     */     }
/*     */     
/* 235 */     return bool;
/*     */   }
/*     */   
/*     */   private void c(y ☃) {
/* 239 */     aa aa = b(☃);
/* 240 */     if (aa.a()) {
/*     */       return;
/*     */     }
/* 243 */     for (Map.Entry<String, ad> entry : ☃.f().entrySet()) {
/* 244 */       ae ae = aa.c(entry.getKey());
/* 245 */       if (ae == null || ae.a()) {
/*     */         continue;
/*     */       }
/* 248 */       ag ag = ((ad)entry.getValue()).a();
/* 249 */       if (ag != null) {
/* 250 */         af<ag> af = ac.a(ag.a());
/* 251 */         if (af != null) {
/* 252 */           af.a(this, new af.a<>(ag, ☃, entry.getKey()));
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void d(y ☃) {
/* 259 */     aa aa = b(☃);
/* 260 */     for (Map.Entry<String, ad> entry : ☃.f().entrySet()) {
/* 261 */       ae ae = aa.c(entry.getKey());
/* 262 */       if (ae == null || (!ae.a() && !aa.a())) {
/*     */         continue;
/*     */       }
/* 265 */       ag ag = ((ad)entry.getValue()).a();
/* 266 */       if (ag != null) {
/* 267 */         af<ag> af = ac.a(ag.a());
/* 268 */         if (af != null) {
/* 269 */           af.b(this, new af.a<>(ag, ☃, entry.getKey()));
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(aah ☃) {
/* 276 */     if (this.m || !this.i.isEmpty() || !this.j.isEmpty()) {
/* 277 */       Map<vk, aa> map = Maps.newHashMap();
/* 278 */       Set<y> set = Sets.newLinkedHashSet();
/* 279 */       Set<vk> set1 = Sets.newLinkedHashSet();
/* 280 */       for (y y1 : this.j) {
/* 281 */         if (this.h.contains(y1)) {
/* 282 */           map.put(y1.h(), this.g.get(y1));
/*     */         }
/*     */       } 
/* 285 */       for (y y1 : this.i) {
/* 286 */         if (this.h.contains(y1)) {
/* 287 */           set.add(y1); continue;
/*     */         } 
/* 289 */         set1.add(y1.h());
/*     */       } 
/*     */       
/* 292 */       if (this.m || !map.isEmpty() || !set.isEmpty() || !set1.isEmpty()) {
/* 293 */         ☃.b.a(new rt(this.m, set, set1, map));
/* 294 */         this.i.clear();
/* 295 */         this.j.clear();
/*     */       } 
/*     */     } 
/* 298 */     this.m = false;
/*     */   }
/*     */   
/*     */   public void a(@Nullable y ☃) {
/* 302 */     y y1 = this.l;
/* 303 */     if (☃ != null && ☃.b() == null && ☃.c() != null) {
/* 304 */       this.l = ☃;
/*     */     } else {
/* 306 */       this.l = null;
/*     */     } 
/* 308 */     if (y1 != this.l) {
/* 309 */       this.k.b.a(new qs((this.l == null) ? null : this.l.h()));
/*     */     }
/*     */   }
/*     */   
/*     */   public aa b(y ☃) {
/* 314 */     aa aa = this.g.get(☃);
/* 315 */     if (aa == null) {
/* 316 */       aa = new aa();
/* 317 */       a(☃, aa);
/*     */     } 
/* 319 */     return aa;
/*     */   }
/*     */   
/*     */   private void a(y ☃, aa aa1) {
/* 323 */     aa1.a(☃.f(), ☃.i());
/* 324 */     this.g.put(☃, aa1);
/*     */   }
/*     */   
/*     */   private void e(y ☃) {
/* 328 */     boolean bool1 = f(☃);
/* 329 */     boolean bool2 = this.h.contains(☃);
/*     */     
/* 331 */     if (bool1 && !bool2) {
/* 332 */       this.h.add(☃);
/* 333 */       this.i.add(☃);
/* 334 */       if (this.g.containsKey(☃)) {
/* 335 */         this.j.add(☃);
/*     */       }
/* 337 */     } else if (!bool1 && bool2) {
/* 338 */       this.h.remove(☃);
/* 339 */       this.i.add(☃);
/*     */     } 
/*     */     
/* 342 */     if (bool1 != bool2 && 
/* 343 */       ☃.b() != null) {
/* 344 */       e(☃.b());
/*     */     }
/*     */     
/* 347 */     for (y y1 : ☃.e()) {
/* 348 */       e(y1);
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean f(y ☃) {
/* 353 */     for (int i = 0; ☃ != null && i <= 2; i++) {
/* 354 */       if (i == 0 && 
/* 355 */         g(☃)) {
/* 356 */         return true;
/*     */       }
/*     */ 
/*     */       
/* 360 */       if (☃.c() == null) {
/* 361 */         return false;
/*     */       }
/* 363 */       aa aa = b(☃);
/* 364 */       if (aa.a())
/* 365 */         return true; 
/* 366 */       if (☃.c().j()) {
/* 367 */         return false;
/*     */       }
/*     */ 
/*     */       
/* 371 */       ☃ = ☃.b();
/*     */     } 
/*     */     
/* 374 */     return false;
/*     */   }
/*     */   
/*     */   private boolean g(y ☃) {
/* 378 */     aa aa = b(☃);
/* 379 */     if (aa.a()) {
/* 380 */       return true;
/*     */     }
/*     */     
/* 383 */     for (y y1 : ☃.e()) {
/* 384 */       if (g(y1)) {
/* 385 */         return true;
/*     */       }
/*     */     } 
/* 388 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\vt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */