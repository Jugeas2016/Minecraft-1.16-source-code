/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonPrimitive;
/*     */ import com.google.gson.internal.Streams;
/*     */ import com.google.gson.stream.JsonReader;
/*     */ import com.mojang.datafixers.DataFixer;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.StringReader;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.Set;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.commons.io.FileUtils;
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
/*     */ public class adw
/*     */   extends aeb
/*     */ {
/*  38 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*     */   private final MinecraftServer c;
/*     */   
/*     */   private final File d;
/*  43 */   private final Set<adx<?>> e = Sets.newHashSet();
/*  44 */   private int f = -300;
/*     */   
/*     */   public adw(MinecraftServer ☃, File file) {
/*  47 */     this.c = ☃;
/*  48 */     this.d = file;
/*  49 */     if (file.isFile()) {
/*     */       try {
/*  51 */         a(☃.az(), FileUtils.readFileToString(file));
/*  52 */       } catch (IOException iOException) {
/*  53 */         b.error("Couldn't read statistics file {}", file, iOException);
/*  54 */       } catch (JsonParseException jsonParseException) {
/*  55 */         b.error("Couldn't parse statistics file {}", file, jsonParseException);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public void a() {
/*     */     try {
/*  62 */       FileUtils.writeStringToFile(this.d, b());
/*  63 */     } catch (IOException ☃) {
/*  64 */       b.error("Couldn't save stats", ☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bfw ☃, adx<?> adx1, int i) {
/*  70 */     super.a(☃, adx1, i);
/*  71 */     this.e.add(adx1);
/*     */   }
/*     */   
/*     */   private Set<adx<?>> d() {
/*  75 */     Set<adx<?>> ☃ = Sets.newHashSet(this.e);
/*  76 */     this.e.clear();
/*  77 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(DataFixer ☃, String str) {
/*  81 */     try (JsonReader ☃ = new JsonReader(new StringReader(str))) {
/*  82 */       jsonReader.setLenient(false);
/*  83 */       JsonElement jsonElement = Streams.parse(jsonReader);
/*     */       
/*  85 */       if (jsonElement.isJsonNull()) {
/*  86 */         b.error("Unable to parse Stat data from {}", this.d);
/*     */         
/*     */         return;
/*     */       } 
/*  90 */       md md = a(jsonElement.getAsJsonObject());
/*     */       
/*  92 */       if (!md.c("DataVersion", 99)) {
/*  93 */         md.b("DataVersion", 1343);
/*     */       }
/*  95 */       md = mp.a(☃, aga.g, md, md.h("DataVersion"));
/*     */       
/*  97 */       if (md.c("stats", 10)) {
/*  98 */         md md1 = md.p("stats");
/*  99 */         for (String str1 : md1.d()) {
/* 100 */           if (md1.c(str1, 10)) {
/* 101 */             x.a(gm.ag.b(new vk(str1)), adz1 -> {
/*     */                   md md1 = ☃.p(str);
/*     */ 
/*     */                   
/*     */                   for (String str1 : md1.d()) {
/*     */                     if (md1.c(str1, 99)) {
/*     */                       x.a(a(adz1, str1), (), ());
/*     */ 
/*     */                       
/*     */                       continue;
/*     */                     } 
/*     */                     
/*     */                     b.warn("Invalid statistic value in {}: Don't know what {} is for key {}", this.d, md1.c(str1), str1);
/*     */                   } 
/*     */                 }() -> b.warn("Invalid statistic type in {}: Don't know what {} is", this.d, ☃));
/*     */           }
/*     */         } 
/*     */       } 
/* 119 */     } catch (JsonParseException|IOException exception) {
/* 120 */       b.error("Unable to parse Stat data from {}", this.d, exception);
/*     */     } 
/*     */   }
/*     */   
/*     */   private <T> Optional<adx<T>> a(adz<T> ☃, String str) {
/* 125 */     return Optional.<vk>ofNullable(vk.a(str))
/* 126 */       .flatMap(☃.a()::b)
/* 127 */       .map(☃::b);
/*     */   }
/*     */   
/*     */   private static md a(JsonObject ☃) {
/* 131 */     md md = new md();
/* 132 */     for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)☃.entrySet()) {
/* 133 */       JsonElement jsonElement = entry.getValue();
/* 134 */       if (jsonElement.isJsonObject()) {
/* 135 */         md.a(entry.getKey(), a(jsonElement.getAsJsonObject())); continue;
/* 136 */       }  if (jsonElement.isJsonPrimitive()) {
/* 137 */         JsonPrimitive jsonPrimitive = jsonElement.getAsJsonPrimitive();
/* 138 */         if (jsonPrimitive.isNumber()) {
/* 139 */           md.b(entry.getKey(), jsonPrimitive.getAsInt());
/*     */         }
/*     */       } 
/*     */     } 
/* 143 */     return md;
/*     */   }
/*     */   
/*     */   protected String b() {
/* 147 */     Map<adz<?>, JsonObject> ☃ = Maps.newHashMap();
/* 148 */     for (ObjectIterator<Object2IntMap.Entry<adx<?>>> objectIterator = this.a.object2IntEntrySet().iterator(); objectIterator.hasNext(); ) { Object2IntMap.Entry<adx<?>> entry = objectIterator.next();
/* 149 */       adx<?> adx = (adx)entry.getKey();
/* 150 */       ((JsonObject)☃.computeIfAbsent(adx.a(), ☃ -> new JsonObject())).addProperty(b(adx).toString(), Integer.valueOf(entry.getIntValue())); }
/*     */ 
/*     */     
/* 153 */     JsonObject jsonObject1 = new JsonObject();
/* 154 */     for (Map.Entry<adz<?>, JsonObject> entry : ☃.entrySet()) {
/* 155 */       jsonObject1.add(gm.ag.b(entry.getKey()).toString(), (JsonElement)entry.getValue());
/*     */     }
/*     */     
/* 158 */     JsonObject jsonObject2 = new JsonObject();
/* 159 */     jsonObject2.add("stats", (JsonElement)jsonObject1);
/* 160 */     jsonObject2.addProperty("DataVersion", Integer.valueOf(w.a().getWorldVersion()));
/*     */     
/* 162 */     return jsonObject2.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static <T> vk b(adx<T> ☃) {
/* 168 */     return ☃.a().a().b(☃.b());
/*     */   }
/*     */   
/*     */   public void c() {
/* 172 */     this.e.addAll((Collection<? extends adx<?>>)this.a.keySet());
/*     */   }
/*     */   
/*     */   public void a(aah ☃) {
/* 176 */     int i = this.c.ai();
/* 177 */     Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
/*     */     
/* 179 */     if (i - this.f > 300) {
/* 180 */       this.f = i;
/*     */       
/* 182 */       for (adx<?> adx : d()) {
/* 183 */         object2IntOpenHashMap.put(adx, a(adx));
/*     */       }
/*     */     } 
/*     */     
/* 187 */     ☃.b.a(new ot((Object2IntMap<adx<?>>)object2IntOpenHashMap));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\adw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */