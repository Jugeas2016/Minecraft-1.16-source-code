/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonNull;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonPrimitive;
/*     */ import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*     */ import java.util.Map;
/*     */ import java.util.function.Predicate;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class cg
/*     */ {
/*     */   private final bz.d b;
/*     */   private final bru c;
/*     */   private final Map<adx<?>, bz.d> d;
/*  33 */   public static final cg a = (new d()).b();
/*     */   private final Object2BooleanMap<vk> e;
/*     */   private final Map<vk, c> f;
/*     */   
/*     */   static interface c extends Predicate<aa> {
/*     */     JsonElement a();
/*     */   }
/*     */   
/*     */   static class b implements c {
/*     */     public b(boolean ☃) {
/*  43 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement a() {
/*  48 */       return (JsonElement)new JsonPrimitive(Boolean.valueOf(this.a));
/*     */     }
/*     */     private final boolean a;
/*     */     
/*     */     public boolean a(aa ☃) {
/*  53 */       return (☃.a() == this.a);
/*     */     }
/*     */   }
/*     */   
/*     */   static class a implements c {
/*     */     private final Object2BooleanMap<String> a;
/*     */     
/*     */     public a(Object2BooleanMap<String> ☃) {
/*  61 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement a() {
/*  66 */       JsonObject ☃ = new JsonObject();
/*  67 */       this.a.forEach(☃::addProperty);
/*  68 */       return (JsonElement)☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(aa ☃) {
/*  73 */       for (ObjectIterator<Object2BooleanMap.Entry<String>> objectIterator = this.a.object2BooleanEntrySet().iterator(); objectIterator.hasNext(); ) { Object2BooleanMap.Entry<String> entry = objectIterator.next();
/*  74 */         ae ae = ☃.c((String)entry.getKey());
/*  75 */         if (ae == null || ae.a() != entry.getBooleanValue()) {
/*  76 */           return false;
/*     */         } }
/*     */       
/*  79 */       return true;
/*     */     }
/*     */   }
/*     */   
/*     */   private static c b(JsonElement ☃) {
/*  84 */     if (☃.isJsonPrimitive()) {
/*  85 */       boolean bool = ☃.getAsBoolean();
/*  86 */       return new b(bool);
/*     */     } 
/*     */     
/*  89 */     Object2BooleanOpenHashMap object2BooleanOpenHashMap = new Object2BooleanOpenHashMap();
/*  90 */     JsonObject jsonObject = afd.m(☃, "criterion data");
/*  91 */     jsonObject.entrySet().forEach(entry -> {
/*     */           boolean bool = afd.c((JsonElement)entry.getValue(), "criterion test");
/*     */           ☃.put(entry.getKey(), bool);
/*     */         });
/*  95 */     return new a((Object2BooleanMap<String>)object2BooleanOpenHashMap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private cg(bz.d ☃, bru bru1, Map<adx<?>, bz.d> map, Object2BooleanMap<vk> object2BooleanMap, Map<vk, c> map1) {
/* 105 */     this.b = ☃;
/* 106 */     this.c = bru1;
/* 107 */     this.d = map;
/* 108 */     this.e = object2BooleanMap;
/* 109 */     this.f = map1;
/*     */   }
/*     */   
/*     */   public boolean a(aqa ☃) {
/* 113 */     if (this == a) {
/* 114 */       return true;
/*     */     }
/*     */     
/* 117 */     if (!(☃ instanceof aah)) {
/* 118 */       return false;
/*     */     }
/*     */     
/* 121 */     aah aah = (aah)☃;
/*     */     
/* 123 */     if (!this.b.d(aah.bD)) {
/* 124 */       return false;
/*     */     }
/*     */     
/* 127 */     if (this.c != bru.a && this.c != aah.d.b()) {
/* 128 */       return false;
/*     */     }
/*     */     
/* 131 */     aeb aeb = aah.A();
/* 132 */     for (Map.Entry<adx<?>, bz.d> entry : this.d.entrySet()) {
/* 133 */       int i = aeb.a(entry.getKey());
/* 134 */       if (!((bz.d)entry.getValue()).d(i)) {
/* 135 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 139 */     adt adt = aah.B();
/* 140 */     for (ObjectIterator<Object2BooleanMap.Entry<vk>> objectIterator = this.e.object2BooleanEntrySet().iterator(); objectIterator.hasNext(); ) { Object2BooleanMap.Entry<vk> entry = objectIterator.next();
/* 141 */       if (adt.b((vk)entry.getKey()) != entry.getBooleanValue()) {
/* 142 */         return false;
/*     */       } }
/*     */ 
/*     */     
/* 146 */     if (!this.f.isEmpty()) {
/* 147 */       vt vt = aah.J();
/* 148 */       vv vv = aah.ch().aA();
/*     */       
/* 150 */       for (Map.Entry<vk, c> entry : this.f.entrySet()) {
/* 151 */         y y = vv.a(entry.getKey());
/* 152 */         if (y == null || !((c)entry.getValue()).test(vt.b(y))) {
/* 153 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 158 */     return true;
/*     */   }
/*     */   
/*     */   public static cg a(@Nullable JsonElement ☃) {
/* 162 */     if (☃ == null || ☃.isJsonNull()) {
/* 163 */       return a;
/*     */     }
/*     */     
/* 166 */     JsonObject jsonObject1 = afd.m(☃, "player");
/* 167 */     bz.d d1 = bz.d.a(jsonObject1.get("level"));
/*     */     
/* 169 */     String str = afd.a(jsonObject1, "gamemode", "");
/* 170 */     bru bru1 = bru.a(str, bru.a);
/*     */     
/* 172 */     Map<adx<?>, bz.d> map = Maps.newHashMap();
/* 173 */     JsonArray jsonArray = afd.a(jsonObject1, "stats", (JsonArray)null);
/* 174 */     if (jsonArray != null) {
/* 175 */       for (JsonElement jsonElement : jsonArray) {
/* 176 */         JsonObject jsonObject = afd.m(jsonElement, "stats entry");
/* 177 */         vk vk1 = new vk(afd.h(jsonObject, "type"));
/*     */         
/* 179 */         adz<?> adz = gm.ag.a(vk1);
/* 180 */         if (adz == null) {
/* 181 */           throw new JsonParseException("Invalid stat type: " + vk1);
/*     */         }
/*     */         
/* 184 */         vk vk2 = new vk(afd.h(jsonObject, "stat"));
/* 185 */         adx<?> adx = a(adz, vk2);
/*     */         
/* 187 */         bz.d d2 = bz.d.a(jsonObject.get("value"));
/* 188 */         map.put(adx, d2);
/*     */       } 
/*     */     }
/*     */     
/* 192 */     Object2BooleanOpenHashMap object2BooleanOpenHashMap = new Object2BooleanOpenHashMap();
/* 193 */     JsonObject jsonObject2 = afd.a(jsonObject1, "recipes", new JsonObject());
/* 194 */     for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)jsonObject2.entrySet()) {
/* 195 */       vk vk = new vk(entry.getKey());
/* 196 */       boolean bool = afd.c(entry.getValue(), "recipe present");
/* 197 */       object2BooleanOpenHashMap.put(vk, bool);
/*     */     } 
/*     */     
/* 200 */     Map<vk, c> map1 = Maps.newHashMap();
/* 201 */     JsonObject jsonObject3 = afd.a(jsonObject1, "advancements", new JsonObject());
/* 202 */     for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)jsonObject3.entrySet()) {
/* 203 */       vk vk = new vk(entry.getKey());
/* 204 */       c c = b(entry.getValue());
/* 205 */       map1.put(vk, c);
/*     */     } 
/*     */     
/* 208 */     return new cg(d1, bru1, map, (Object2BooleanMap<vk>)object2BooleanOpenHashMap, map1);
/*     */   }
/*     */   
/*     */   private static <T> adx<T> a(adz<T> ☃, vk vk1) {
/* 212 */     gm<T> gm = ☃.a();
/* 213 */     T t = gm.a(vk1);
/* 214 */     if (t == null) {
/* 215 */       throw new JsonParseException("Unknown object " + vk1 + " for stat type " + gm.ag.b(☃));
/*     */     }
/*     */     
/* 218 */     return ☃.b(t);
/*     */   }
/*     */   
/*     */   private static <T> vk a(adx<T> ☃) {
/* 222 */     return ☃.a().a().b(☃.b());
/*     */   }
/*     */   
/*     */   public JsonElement a() {
/* 226 */     if (this == a) {
/* 227 */       return (JsonElement)JsonNull.INSTANCE;
/*     */     }
/*     */     
/* 230 */     JsonObject ☃ = new JsonObject();
/* 231 */     ☃.add("level", this.b.d());
/*     */     
/* 233 */     if (this.c != bru.a) {
/* 234 */       ☃.addProperty("gamemode", this.c.b());
/*     */     }
/*     */     
/* 237 */     if (!this.d.isEmpty()) {
/* 238 */       JsonArray jsonArray = new JsonArray();
/* 239 */       this.d.forEach((adx1, d1) -> {
/*     */             JsonObject jsonObject = new JsonObject();
/*     */             jsonObject.addProperty("type", gm.ag.b(adx1.a()).toString());
/*     */             jsonObject.addProperty("stat", a(adx1).toString());
/*     */             jsonObject.add("value", d1.d());
/*     */             ☃.add((JsonElement)jsonObject);
/*     */           });
/* 246 */       ☃.add("stats", (JsonElement)jsonArray);
/*     */     } 
/*     */     
/* 249 */     if (!this.e.isEmpty()) {
/* 250 */       JsonObject jsonObject = new JsonObject();
/* 251 */       this.e.forEach((vk1, bool) -> ☃.addProperty(vk1.toString(), bool));
/* 252 */       ☃.add("recipes", (JsonElement)jsonObject);
/*     */     } 
/*     */     
/* 255 */     if (!this.f.isEmpty()) {
/* 256 */       JsonObject jsonObject = new JsonObject();
/* 257 */       this.f.forEach((vk1, c1) -> ☃.add(vk1.toString(), c1.a()));
/* 258 */       ☃.add("advancements", (JsonElement)jsonObject);
/*     */     } 
/*     */     
/* 261 */     return (JsonElement)☃;
/*     */   }
/*     */   
/*     */   public static class d {
/* 265 */     private bz.d a = bz.d.e;
/* 266 */     private bru b = bru.a;
/* 267 */     private final Map<adx<?>, bz.d> c = Maps.newHashMap();
/* 268 */     private final Object2BooleanMap<vk> d = (Object2BooleanMap<vk>)new Object2BooleanOpenHashMap();
/* 269 */     private final Map<vk, cg.c> e = Maps.newHashMap();
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
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public cg b() {
/* 306 */       return new cg(this.a, this.b, this.c, this.d, this.e);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */