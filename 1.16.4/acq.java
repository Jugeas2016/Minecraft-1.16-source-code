/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.io.Files;
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.mojang.authlib.Agent;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.GameProfileRepository;
/*     */ import com.mojang.authlib.ProfileLookupCallback;
/*     */ import java.io.File;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.io.Reader;
/*     */ import java.io.Writer;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.text.DateFormat;
/*     */ import java.text.ParseException;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Calendar;
/*     */ import java.util.Comparator;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.UUID;
/*     */ import java.util.concurrent.atomic.AtomicLong;
/*     */ import java.util.concurrent.atomic.AtomicReference;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class acq
/*     */ {
/*  43 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */   
/*     */   private static boolean b;
/*     */   
/*  48 */   private final Map<String, a> c = Maps.newConcurrentMap();
/*  49 */   private final Map<UUID, a> d = Maps.newConcurrentMap();
/*     */   private final GameProfileRepository e;
/*  51 */   private final Gson f = (new GsonBuilder()).create();
/*     */   private final File g;
/*  53 */   private final AtomicLong h = new AtomicLong();
/*     */   
/*     */   public acq(GameProfileRepository ☃, File file) {
/*  56 */     this.e = ☃;
/*  57 */     this.g = file;
/*     */     
/*  59 */     Lists.reverse(a()).forEach(this::a);
/*     */   }
/*     */   
/*     */   private void a(a ☃) {
/*  63 */     GameProfile gameProfile = ☃.a();
/*  64 */     ☃.a(d());
/*  65 */     String str = gameProfile.getName();
/*  66 */     if (str != null) {
/*  67 */       this.c.put(str.toLowerCase(Locale.ROOT), ☃);
/*     */     }
/*  69 */     UUID uUID = gameProfile.getId();
/*  70 */     if (uUID != null) {
/*  71 */       this.d.put(uUID, ☃);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static GameProfile a(GameProfileRepository ☃, String str) {
/*  77 */     AtomicReference<GameProfile> atomicReference = new AtomicReference<>();
/*  78 */     ProfileLookupCallback profileLookupCallback = new ProfileLookupCallback(atomicReference)
/*     */       {
/*     */         public void onProfileLookupSucceeded(GameProfile ☃) {
/*  81 */           this.a.set(☃);
/*     */         }
/*     */ 
/*     */         
/*     */         public void onProfileLookupFailed(GameProfile ☃, Exception exception) {
/*  86 */           this.a.set(null);
/*     */         }
/*     */       };
/*     */     
/*  90 */     ☃.findProfilesByNames(new String[] { str }, Agent.MINECRAFT, profileLookupCallback);
/*  91 */     GameProfile gameProfile = atomicReference.get();
/*  92 */     if (!c() && gameProfile == null) {
/*  93 */       UUID uUID = bfw.a(new GameProfile(null, str));
/*  94 */       gameProfile = new GameProfile(uUID, str);
/*     */     } 
/*  96 */     return gameProfile;
/*     */   }
/*     */   
/*     */   public static void a(boolean ☃) {
/* 100 */     b = ☃;
/*     */   }
/*     */   
/*     */   private static boolean c() {
/* 104 */     return b;
/*     */   }
/*     */   
/*     */   public void a(GameProfile ☃) {
/* 108 */     Calendar calendar = Calendar.getInstance();
/* 109 */     calendar.setTime(new Date());
/* 110 */     calendar.add(2, 1);
/* 111 */     Date date = calendar.getTime();
/*     */     
/* 113 */     a a = new a(☃, date);
/* 114 */     a(a);
/* 115 */     b();
/*     */   }
/*     */   
/*     */   private long d() {
/* 119 */     return this.h.incrementAndGet();
/*     */   }
/*     */   @Nullable
/*     */   public GameProfile a(String ☃) {
/*     */     GameProfile gameProfile;
/* 124 */     String str = ☃.toLowerCase(Locale.ROOT);
/* 125 */     a a = this.c.get(str);
/*     */     
/* 127 */     boolean bool = false;
/*     */     
/* 129 */     if (a != null && (new Date()).getTime() >= a.a(a).getTime()) {
/*     */       
/* 131 */       this.d.remove(a.a().getId());
/* 132 */       this.c.remove(a.a().getName().toLowerCase(Locale.ROOT));
/* 133 */       bool = true;
/* 134 */       a = null;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 139 */     if (a != null) {
/* 140 */       a.a(d());
/* 141 */       gameProfile = a.a();
/*     */     } else {
/* 143 */       gameProfile = a(this.e, str);
/* 144 */       if (gameProfile != null) {
/* 145 */         a(gameProfile);
/*     */         
/* 147 */         bool = false;
/*     */       } 
/*     */     } 
/*     */     
/* 151 */     if (bool) {
/* 152 */       b();
/*     */     }
/* 154 */     return gameProfile;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public GameProfile a(UUID ☃) {
/* 159 */     a a = this.d.get(☃);
/* 160 */     if (a == null) {
/* 161 */       return null;
/*     */     }
/* 163 */     a.a(d());
/* 164 */     return a.a();
/*     */   }
/*     */   
/*     */   private static DateFormat e() {
/* 168 */     return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
/*     */   }
/*     */   
/*     */   public List<a> a() {
/* 172 */     List<a> ☃ = Lists.newArrayList();
/* 173 */     try (Reader ☃ = Files.newReader(this.g, StandardCharsets.UTF_8)) {
/* 174 */       JsonArray jsonArray = (JsonArray)this.f.fromJson(reader, JsonArray.class);
/* 175 */       if (jsonArray == null) {
/* 176 */         return ☃;
/*     */       }
/* 178 */       DateFormat dateFormat = e();
/* 179 */       jsonArray.forEach(jsonElement -> {
/*     */             a a = a(jsonElement, ☃);
/*     */             if (a != null) {
/*     */               list.add(a);
/*     */             }
/*     */           });
/* 185 */     } catch (FileNotFoundException fileNotFoundException) {
/*     */     
/* 187 */     } catch (IOException|com.google.gson.JsonParseException exception) {
/* 188 */       a.warn("Failed to load profile cache {}", this.g, exception);
/*     */     } 
/* 190 */     return ☃;
/*     */   }
/*     */   
/*     */   public void b() {
/* 194 */     JsonArray ☃ = new JsonArray();
/* 195 */     DateFormat dateFormat = e();
/* 196 */     a(1000).forEach(a1 -> ☃.add(a(a1, dateFormat)));
/*     */     
/* 198 */     String str = this.f.toJson((JsonElement)☃);
/* 199 */     try (Writer ☃ = Files.newWriter(this.g, StandardCharsets.UTF_8)) {
/* 200 */       writer.write(str);
/* 201 */     } catch (IOException iOException) {}
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private Stream<a> a(int ☃) {
/* 207 */     return ImmutableList.copyOf(this.d.values()).stream().sorted(Comparator.<a, Comparable>comparing(a::c).reversed()).limit(☃);
/*     */   }
/*     */   
/*     */   private static JsonElement a(a ☃, DateFormat dateFormat) {
/* 211 */     JsonObject jsonObject = new JsonObject();
/* 212 */     jsonObject.addProperty("name", ☃.a().getName());
/* 213 */     UUID uUID = ☃.a().getId();
/* 214 */     jsonObject.addProperty("uuid", (uUID == null) ? "" : uUID.toString());
/* 215 */     jsonObject.addProperty("expiresOn", dateFormat.format(☃.b()));
/* 216 */     return (JsonElement)jsonObject;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static a a(JsonElement ☃, DateFormat dateFormat) {
/* 221 */     if (☃.isJsonObject()) {
/* 222 */       UUID uUID; JsonObject jsonObject = ☃.getAsJsonObject();
/* 223 */       JsonElement jsonElement1 = jsonObject.get("name");
/* 224 */       JsonElement jsonElement2 = jsonObject.get("uuid");
/* 225 */       JsonElement jsonElement3 = jsonObject.get("expiresOn");
/* 226 */       if (jsonElement1 == null || jsonElement2 == null) {
/* 227 */         return null;
/*     */       }
/* 229 */       String str1 = jsonElement2.getAsString();
/* 230 */       String str2 = jsonElement1.getAsString();
/* 231 */       Date date = null;
/* 232 */       if (jsonElement3 != null) {
/*     */         try {
/* 234 */           date = dateFormat.parse(jsonElement3.getAsString());
/* 235 */         } catch (ParseException parseException) {}
/*     */       }
/*     */       
/* 238 */       if (str2 == null || str1 == null || date == null) {
/* 239 */         return null;
/*     */       }
/*     */       
/*     */       try {
/* 243 */         uUID = UUID.fromString(str1);
/* 244 */       } catch (Throwable throwable) {
/* 245 */         return null;
/*     */       } 
/* 247 */       return new a(new GameProfile(uUID, str2), date);
/*     */     } 
/* 249 */     return null;
/*     */   }
/*     */   
/*     */   static class a
/*     */   {
/*     */     private final GameProfile a;
/*     */     private final Date b;
/*     */     private volatile long c;
/*     */     
/*     */     private a(GameProfile ☃, Date date) {
/* 259 */       this.a = ☃;
/* 260 */       this.b = date;
/*     */     }
/*     */     
/*     */     public GameProfile a() {
/* 264 */       return this.a;
/*     */     }
/*     */     
/*     */     public Date b() {
/* 268 */       return this.b;
/*     */     }
/*     */     
/*     */     public void a(long ☃) {
/* 272 */       this.c = ☃;
/*     */     }
/*     */     
/*     */     public long c() {
/* 276 */       return this.c;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\acq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */