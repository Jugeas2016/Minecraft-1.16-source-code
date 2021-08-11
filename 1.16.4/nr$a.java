/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonPrimitive;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import com.google.gson.stream.JsonReader;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import java.io.IOException;
/*     */ import java.io.StringReader;
/*     */ import java.lang.reflect.Field;
/*     */ import java.lang.reflect.Type;
/*     */ import java.util.Map;
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
/*     */ public class a
/*     */   implements JsonDeserializer<nx>, JsonSerializer<nr>
/*     */ {
/*     */   private static final Gson a;
/*     */   private static final Field b;
/*     */   private static final Field c;
/*     */   
/*     */   static {
/* 131 */     a = x.<Gson>a(() -> {
/*     */           GsonBuilder ☃ = new GsonBuilder();
/*     */           
/*     */           ☃.disableHtmlEscaping();
/*     */           ☃.registerTypeHierarchyAdapter(nr.class, new a());
/*     */           ☃.registerTypeHierarchyAdapter(ob.class, new ob.a());
/*     */           ☃.registerTypeAdapterFactory(new afl());
/*     */           return ☃.create();
/*     */         });
/* 140 */     b = x.<Field>a(() -> {
/*     */           try {
/*     */             new JsonReader(new StringReader(""));
/*     */             Field ☃ = JsonReader.class.getDeclaredField("pos");
/*     */             ☃.setAccessible(true);
/*     */             return ☃;
/* 146 */           } catch (NoSuchFieldException ☃) {
/*     */             throw new IllegalStateException("Couldn't get field 'pos' for JsonReader", ☃);
/*     */           } 
/*     */         });
/*     */     
/* 151 */     c = x.<Field>a(() -> {
/*     */           try {
/*     */             new JsonReader(new StringReader(""));
/*     */             Field ☃ = JsonReader.class.getDeclaredField("lineStart");
/*     */             ☃.setAccessible(true);
/*     */             return ☃;
/* 157 */           } catch (NoSuchFieldException ☃) {
/*     */             throw new IllegalStateException("Couldn't get field 'lineStart' for JsonReader", ☃);
/*     */           } 
/*     */         });
/*     */   }
/*     */   
/*     */   public nx a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 164 */     if (☃.isJsonPrimitive())
/*     */     {
/* 166 */       return new oe(☃.getAsString()); } 
/* 167 */     if (☃.isJsonObject()) {
/* 168 */       nx nx; JsonObject jsonObject = ☃.getAsJsonObject();
/*     */ 
/*     */       
/* 171 */       if (jsonObject.has("text")) {
/* 172 */         nx = new oe(afd.h(jsonObject, "text"));
/* 173 */       } else if (jsonObject.has("translate")) {
/* 174 */         String str = afd.h(jsonObject, "translate");
/*     */         
/* 176 */         if (jsonObject.has("with")) {
/* 177 */           JsonArray jsonArray = afd.u(jsonObject, "with");
/* 178 */           Object[] arrayOfObject = new Object[jsonArray.size()];
/*     */           
/* 180 */           for (int i = 0; i < arrayOfObject.length; i++) {
/* 181 */             arrayOfObject[i] = a(jsonArray.get(i), type, jsonDeserializationContext);
/*     */             
/* 183 */             if (arrayOfObject[i] instanceof oe) {
/* 184 */               oe oe = (oe)arrayOfObject[i];
/* 185 */               if (oe.c().g() && oe.b().isEmpty()) {
/* 186 */                 arrayOfObject[i] = oe.h();
/*     */               }
/*     */             } 
/*     */           } 
/*     */           
/* 191 */           nx = new of(str, arrayOfObject);
/*     */         } else {
/* 193 */           nx = new of(str);
/*     */         } 
/* 195 */       } else if (jsonObject.has("score")) {
/* 196 */         JsonObject jsonObject1 = afd.t(jsonObject, "score");
/* 197 */         if (jsonObject1.has("name") && jsonObject1.has("objective")) {
/* 198 */           nx = new nz(afd.h(jsonObject1, "name"), afd.h(jsonObject1, "objective"));
/*     */         } else {
/* 200 */           throw new JsonParseException("A score component needs a least a name and an objective");
/*     */         } 
/* 202 */       } else if (jsonObject.has("selector")) {
/* 203 */         nx = new oa(afd.h(jsonObject, "selector"));
/* 204 */       } else if (jsonObject.has("keybind")) {
/* 205 */         nx = new nw(afd.h(jsonObject, "keybind"));
/* 206 */       } else if (jsonObject.has("nbt")) {
/* 207 */         String str = afd.h(jsonObject, "nbt");
/* 208 */         boolean bool = afd.a(jsonObject, "interpret", false);
/* 209 */         if (jsonObject.has("block")) {
/* 210 */           nx = new ny.a(str, bool, afd.h(jsonObject, "block"));
/* 211 */         } else if (jsonObject.has("entity")) {
/* 212 */           nx = new ny.b(str, bool, afd.h(jsonObject, "entity"));
/* 213 */         } else if (jsonObject.has("storage")) {
/* 214 */           nx = new ny.c(str, bool, new vk(afd.h(jsonObject, "storage")));
/*     */         } else {
/* 216 */           throw new JsonParseException("Don't know how to turn " + ☃ + " into a Component");
/*     */         } 
/*     */       } else {
/* 219 */         throw new JsonParseException("Don't know how to turn " + ☃ + " into a Component");
/*     */       } 
/*     */       
/* 222 */       if (jsonObject.has("extra")) {
/* 223 */         JsonArray jsonArray = afd.u(jsonObject, "extra");
/*     */         
/* 225 */         if (jsonArray.size() > 0) {
/* 226 */           for (int i = 0; i < jsonArray.size(); i++) {
/* 227 */             nx.a(a(jsonArray.get(i), type, jsonDeserializationContext));
/*     */           }
/*     */         } else {
/* 230 */           throw new JsonParseException("Unexpected empty array of components");
/*     */         } 
/*     */       } 
/*     */       
/* 234 */       nx.a((ob)jsonDeserializationContext.deserialize(☃, ob.class));
/*     */       
/* 236 */       return nx;
/* 237 */     }  if (☃.isJsonArray()) {
/*     */       
/* 239 */       JsonArray jsonArray = ☃.getAsJsonArray();
/* 240 */       nx nx = null;
/*     */       
/* 242 */       for (JsonElement jsonElement : jsonArray) {
/* 243 */         nx nx1 = a(jsonElement, jsonElement.getClass(), jsonDeserializationContext);
/* 244 */         if (nx == null) {
/* 245 */           nx = nx1; continue;
/*     */         } 
/* 247 */         nx.a(nx1);
/*     */       } 
/*     */ 
/*     */       
/* 251 */       return nx;
/*     */     } 
/* 253 */     throw new JsonParseException("Don't know how to turn " + ☃ + " into a Component");
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(ob ☃, JsonObject jsonObject, JsonSerializationContext jsonSerializationContext) {
/* 258 */     JsonElement jsonElement = jsonSerializationContext.serialize(☃);
/*     */     
/* 260 */     if (jsonElement.isJsonObject()) {
/* 261 */       JsonObject jsonObject1 = (JsonObject)jsonElement;
/* 262 */       for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)jsonObject1.entrySet()) {
/* 263 */         jsonObject.add(entry.getKey(), entry.getValue());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement a(nr ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 270 */     JsonObject jsonObject = new JsonObject();
/*     */     
/* 272 */     if (!☃.c().g()) {
/* 273 */       a(☃.c(), jsonObject, jsonSerializationContext);
/*     */     }
/*     */     
/* 276 */     if (!☃.b().isEmpty()) {
/* 277 */       JsonArray jsonArray = new JsonArray();
/*     */       
/* 279 */       for (nr nr1 : ☃.b()) {
/* 280 */         jsonArray.add(a(nr1, nr1.getClass(), jsonSerializationContext));
/*     */       }
/*     */       
/* 283 */       jsonObject.add("extra", (JsonElement)jsonArray);
/*     */     } 
/*     */     
/* 286 */     if (☃ instanceof oe) {
/* 287 */       jsonObject.addProperty("text", ((oe)☃).h());
/* 288 */     } else if (☃ instanceof of) {
/* 289 */       of of = (of)☃;
/* 290 */       jsonObject.addProperty("translate", of.i());
/*     */       
/* 292 */       if (of.j() != null && (of.j()).length > 0) {
/* 293 */         JsonArray jsonArray = new JsonArray();
/*     */         
/* 295 */         for (Object object : of.j()) {
/* 296 */           if (object instanceof nr) {
/* 297 */             jsonArray.add(a((nr)object, object.getClass(), jsonSerializationContext));
/*     */           } else {
/* 299 */             jsonArray.add((JsonElement)new JsonPrimitive(String.valueOf(object)));
/*     */           } 
/*     */         } 
/*     */         
/* 303 */         jsonObject.add("with", (JsonElement)jsonArray);
/*     */       } 
/* 305 */     } else if (☃ instanceof nz) {
/* 306 */       nz nz = (nz)☃;
/* 307 */       JsonObject jsonObject1 = new JsonObject();
/* 308 */       jsonObject1.addProperty("name", nz.h());
/* 309 */       jsonObject1.addProperty("objective", nz.j());
/* 310 */       jsonObject.add("score", (JsonElement)jsonObject1);
/* 311 */     } else if (☃ instanceof oa) {
/* 312 */       oa oa = (oa)☃;
/* 313 */       jsonObject.addProperty("selector", oa.h());
/* 314 */     } else if (☃ instanceof nw) {
/* 315 */       nw nw = (nw)☃;
/* 316 */       jsonObject.addProperty("keybind", nw.i());
/* 317 */     } else if (☃ instanceof ny) {
/* 318 */       ny ny = (ny)☃;
/* 319 */       jsonObject.addProperty("nbt", ny.h());
/* 320 */       jsonObject.addProperty("interpret", Boolean.valueOf(ny.i()));
/* 321 */       if (☃ instanceof ny.a) {
/* 322 */         ny.a a1 = (ny.a)☃;
/* 323 */         jsonObject.addProperty("block", a1.j());
/* 324 */       } else if (☃ instanceof ny.b) {
/* 325 */         ny.b b = (ny.b)☃;
/* 326 */         jsonObject.addProperty("entity", b.j());
/* 327 */       } else if (☃ instanceof ny.c) {
/* 328 */         ny.c c = (ny.c)☃;
/* 329 */         jsonObject.addProperty("storage", c.j().toString());
/*     */       } else {
/* 331 */         throw new IllegalArgumentException("Don't know how to serialize " + ☃ + " as a Component");
/*     */       } 
/*     */     } else {
/* 334 */       throw new IllegalArgumentException("Don't know how to serialize " + ☃ + " as a Component");
/*     */     } 
/*     */     
/* 337 */     return (JsonElement)jsonObject;
/*     */   }
/*     */   
/*     */   public static String a(nr ☃) {
/* 341 */     return a.toJson(☃);
/*     */   }
/*     */   
/*     */   public static JsonElement b(nr ☃) {
/* 345 */     return a.toJsonTree(☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static nx a(String ☃) {
/* 350 */     return afd.<nx>a(a, ☃, nx.class, false);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static nx a(JsonElement ☃) {
/* 355 */     return (nx)a.fromJson(☃, nx.class);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static nx b(String ☃) {
/* 360 */     return afd.<nx>a(a, ☃, nx.class, true);
/*     */   }
/*     */   
/*     */   public static nx a(StringReader ☃) {
/*     */     try {
/* 365 */       JsonReader jsonReader = new JsonReader(new StringReader(☃.getRemaining()));
/* 366 */       jsonReader.setLenient(false);
/* 367 */       nx nx = (nx)a.getAdapter(nx.class).read(jsonReader);
/* 368 */       ☃.setCursor(☃.getCursor() + a(jsonReader));
/* 369 */       return nx;
/* 370 */     } catch (IOException|StackOverflowError throwable) {
/* 371 */       throw new JsonParseException(throwable);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static int a(JsonReader ☃) {
/*     */     try {
/* 377 */       return b.getInt(☃) - c.getInt(☃) + 1;
/* 378 */     } catch (IllegalAccessException illegalAccessException) {
/* 379 */       throw new IllegalStateException("Couldn't read position of JsonReader", illegalAccessException);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\nr$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */