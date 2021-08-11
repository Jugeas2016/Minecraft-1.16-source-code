/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonPrimitive;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import com.google.gson.reflect.TypeToken;
/*     */ import com.google.gson.stream.JsonReader;
/*     */ import java.io.IOException;
/*     */ import java.io.Reader;
/*     */ import java.io.StringReader;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.StringUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class afd
/*     */ {
/*  27 */   private static final Gson a = (new GsonBuilder()).create();
/*     */   
/*     */   public static boolean a(JsonObject ☃, String str) {
/*  30 */     if (!f(☃, str)) {
/*  31 */       return false;
/*     */     }
/*  33 */     return ☃.getAsJsonPrimitive(str).isString();
/*     */   }
/*     */   
/*     */   public static boolean a(JsonElement ☃) {
/*  37 */     if (!☃.isJsonPrimitive()) {
/*  38 */       return false;
/*     */     }
/*  40 */     return ☃.getAsJsonPrimitive().isString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean b(JsonElement ☃) {
/*  51 */     if (!☃.isJsonPrimitive()) {
/*  52 */       return false;
/*     */     }
/*  54 */     return ☃.getAsJsonPrimitive().isNumber();
/*     */   }
/*     */   
/*     */   public static boolean c(JsonObject ☃, String str) {
/*  58 */     if (!f(☃, str)) {
/*  59 */       return false;
/*     */     }
/*  61 */     return ☃.getAsJsonPrimitive(str).isBoolean();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean d(JsonObject ☃, String str) {
/*  72 */     if (!g(☃, str)) {
/*  73 */       return false;
/*     */     }
/*  75 */     return ☃.get(str).isJsonArray();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean f(JsonObject ☃, String str) {
/*  86 */     if (!g(☃, str)) {
/*  87 */       return false;
/*     */     }
/*  89 */     return ☃.get(str).isJsonPrimitive();
/*     */   }
/*     */   
/*     */   public static boolean g(JsonObject ☃, String str) {
/*  93 */     if (☃ == null) {
/*  94 */       return false;
/*     */     }
/*  96 */     return (☃.get(str) != null);
/*     */   }
/*     */   
/*     */   public static String a(JsonElement ☃, String str) {
/* 100 */     if (☃.isJsonPrimitive()) {
/* 101 */       return ☃.getAsString();
/*     */     }
/* 103 */     throw new JsonSyntaxException("Expected " + str + " to be a string, was " + d(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public static String h(JsonObject ☃, String str) {
/* 108 */     if (☃.has(str)) {
/* 109 */       return a(☃.get(str), str);
/*     */     }
/* 111 */     throw new JsonSyntaxException("Missing " + str + ", expected to find a string");
/*     */   }
/*     */ 
/*     */   
/*     */   public static String a(JsonObject ☃, String str1, String str2) {
/* 116 */     if (☃.has(str1)) {
/* 117 */       return a(☃.get(str1), str1);
/*     */     }
/* 119 */     return str2;
/*     */   }
/*     */ 
/*     */   
/*     */   public static blx b(JsonElement ☃, String str) {
/* 124 */     if (☃.isJsonPrimitive()) {
/* 125 */       String str1 = ☃.getAsString();
/* 126 */       return (blx)gm.T.b(new vk(str1))
/* 127 */         .orElseThrow(() -> new JsonSyntaxException("Expected " + ☃ + " to be an item, was unknown string '" + str1 + "'"));
/*     */     } 
/* 129 */     throw new JsonSyntaxException("Expected " + str + " to be an item, was " + d(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public static blx i(JsonObject ☃, String str) {
/* 134 */     if (☃.has(str)) {
/* 135 */       return b(☃.get(str), str);
/*     */     }
/* 137 */     throw new JsonSyntaxException("Missing " + str + ", expected to find an item");
/*     */   }
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
/*     */   public static boolean c(JsonElement ☃, String str) {
/* 150 */     if (☃.isJsonPrimitive()) {
/* 151 */       return ☃.getAsBoolean();
/*     */     }
/* 153 */     throw new JsonSyntaxException("Expected " + str + " to be a Boolean, was " + d(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean j(JsonObject ☃, String str) {
/* 158 */     if (☃.has(str)) {
/* 159 */       return c(☃.get(str), str);
/*     */     }
/* 161 */     throw new JsonSyntaxException("Missing " + str + ", expected to find a Boolean");
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean a(JsonObject ☃, String str, boolean bool) {
/* 166 */     if (☃.has(str)) {
/* 167 */       return c(☃.get(str), str);
/*     */     }
/* 169 */     return bool;
/*     */   }
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
/*     */   public static float e(JsonElement ☃, String str) {
/* 198 */     if (☃.isJsonPrimitive() && ☃.getAsJsonPrimitive().isNumber()) {
/* 199 */       return ☃.getAsFloat();
/*     */     }
/* 201 */     throw new JsonSyntaxException("Expected " + str + " to be a Float, was " + d(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public static float l(JsonObject ☃, String str) {
/* 206 */     if (☃.has(str)) {
/* 207 */       return e(☃.get(str), str);
/*     */     }
/* 209 */     throw new JsonSyntaxException("Missing " + str + ", expected to find a Float");
/*     */   }
/*     */ 
/*     */   
/*     */   public static float a(JsonObject ☃, String str, float f) {
/* 214 */     if (☃.has(str)) {
/* 215 */       return e(☃.get(str), str);
/*     */     }
/* 217 */     return f;
/*     */   }
/*     */ 
/*     */   
/*     */   public static long f(JsonElement ☃, String str) {
/* 222 */     if (☃.isJsonPrimitive() && ☃.getAsJsonPrimitive().isNumber()) {
/* 223 */       return ☃.getAsLong();
/*     */     }
/* 225 */     throw new JsonSyntaxException("Expected " + str + " to be a Long, was " + d(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public static long m(JsonObject ☃, String str) {
/* 230 */     if (☃.has(str)) {
/* 231 */       return f(☃.get(str), str);
/*     */     }
/* 233 */     throw new JsonSyntaxException("Missing " + str + ", expected to find a Long");
/*     */   }
/*     */ 
/*     */   
/*     */   public static long a(JsonObject ☃, String str, long l) {
/* 238 */     if (☃.has(str)) {
/* 239 */       return f(☃.get(str), str);
/*     */     }
/* 241 */     return l;
/*     */   }
/*     */ 
/*     */   
/*     */   public static int g(JsonElement ☃, String str) {
/* 246 */     if (☃.isJsonPrimitive() && ☃.getAsJsonPrimitive().isNumber()) {
/* 247 */       return ☃.getAsInt();
/*     */     }
/* 249 */     throw new JsonSyntaxException("Expected " + str + " to be a Int, was " + d(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public static int n(JsonObject ☃, String str) {
/* 254 */     if (☃.has(str)) {
/* 255 */       return g(☃.get(str), str);
/*     */     }
/* 257 */     throw new JsonSyntaxException("Missing " + str + ", expected to find a Int");
/*     */   }
/*     */ 
/*     */   
/*     */   public static int a(JsonObject ☃, String str, int i) {
/* 262 */     if (☃.has(str)) {
/* 263 */       return g(☃.get(str), str);
/*     */     }
/* 265 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public static byte h(JsonElement ☃, String str) {
/* 270 */     if (☃.isJsonPrimitive() && ☃.getAsJsonPrimitive().isNumber()) {
/* 271 */       return ☃.getAsByte();
/*     */     }
/* 273 */     throw new JsonSyntaxException("Expected " + str + " to be a Byte, was " + d(☃));
/*     */   }
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
/*     */   public static byte a(JsonObject ☃, String str, byte b) {
/* 286 */     if (☃.has(str)) {
/* 287 */       return h(☃.get(str), str);
/*     */     }
/* 289 */     return b;
/*     */   }
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
/*     */   public static JsonObject m(JsonElement ☃, String str) {
/* 390 */     if (☃.isJsonObject()) {
/* 391 */       return ☃.getAsJsonObject();
/*     */     }
/* 393 */     throw new JsonSyntaxException("Expected " + str + " to be a JsonObject, was " + d(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public static JsonObject t(JsonObject ☃, String str) {
/* 398 */     if (☃.has(str)) {
/* 399 */       return m(☃.get(str), str);
/*     */     }
/* 401 */     throw new JsonSyntaxException("Missing " + str + ", expected to find a JsonObject");
/*     */   }
/*     */ 
/*     */   
/*     */   public static JsonObject a(JsonObject ☃, String str, JsonObject jsonObject1) {
/* 406 */     if (☃.has(str)) {
/* 407 */       return m(☃.get(str), str);
/*     */     }
/* 409 */     return jsonObject1;
/*     */   }
/*     */ 
/*     */   
/*     */   public static JsonArray n(JsonElement ☃, String str) {
/* 414 */     if (☃.isJsonArray()) {
/* 415 */       return ☃.getAsJsonArray();
/*     */     }
/* 417 */     throw new JsonSyntaxException("Expected " + str + " to be a JsonArray, was " + d(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public static JsonArray u(JsonObject ☃, String str) {
/* 422 */     if (☃.has(str)) {
/* 423 */       return n(☃.get(str), str);
/*     */     }
/* 425 */     throw new JsonSyntaxException("Missing " + str + ", expected to find a JsonArray");
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static JsonArray a(JsonObject ☃, String str, @Nullable JsonArray jsonArray) {
/* 431 */     if (☃.has(str)) {
/* 432 */       return n(☃.get(str), str);
/*     */     }
/* 434 */     return jsonArray;
/*     */   }
/*     */ 
/*     */   
/*     */   public static <T> T a(@Nullable JsonElement ☃, String str, JsonDeserializationContext jsonDeserializationContext, Class<? extends T> clazz) {
/* 439 */     if (☃ != null) {
/* 440 */       return (T)jsonDeserializationContext.deserialize(☃, clazz);
/*     */     }
/* 442 */     throw new JsonSyntaxException("Missing " + str);
/*     */   }
/*     */ 
/*     */   
/*     */   public static <T> T a(JsonObject ☃, String str, JsonDeserializationContext jsonDeserializationContext, Class<? extends T> clazz) {
/* 447 */     if (☃.has(str)) {
/* 448 */       return a(☃.get(str), str, jsonDeserializationContext, clazz);
/*     */     }
/* 450 */     throw new JsonSyntaxException("Missing " + str);
/*     */   }
/*     */ 
/*     */   
/*     */   public static <T> T a(JsonObject ☃, String str, T t, JsonDeserializationContext jsonDeserializationContext, Class<? extends T> clazz) {
/* 455 */     if (☃.has(str)) {
/* 456 */       return a(☃.get(str), str, jsonDeserializationContext, clazz);
/*     */     }
/* 458 */     return t;
/*     */   }
/*     */ 
/*     */   
/*     */   public static String d(JsonElement ☃) {
/* 463 */     String str = StringUtils.abbreviateMiddle(String.valueOf(☃), "...", 10);
/* 464 */     if (☃ == null) {
/* 465 */       return "null (missing)";
/*     */     }
/* 467 */     if (☃.isJsonNull()) {
/* 468 */       return "null (json)";
/*     */     }
/* 470 */     if (☃.isJsonArray()) {
/* 471 */       return "an array (" + str + ")";
/*     */     }
/* 473 */     if (☃.isJsonObject()) {
/* 474 */       return "an object (" + str + ")";
/*     */     }
/* 476 */     if (☃.isJsonPrimitive()) {
/* 477 */       JsonPrimitive jsonPrimitive = ☃.getAsJsonPrimitive();
/* 478 */       if (jsonPrimitive.isNumber()) {
/* 479 */         return "a number (" + str + ")";
/*     */       }
/* 481 */       if (jsonPrimitive.isBoolean()) {
/* 482 */         return "a boolean (" + str + ")";
/*     */       }
/*     */     } 
/* 485 */     return str;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static <T> T a(Gson ☃, Reader reader, Class<T> clazz, boolean bool) {
/*     */     try {
/* 491 */       JsonReader jsonReader = new JsonReader(reader);
/* 492 */       jsonReader.setLenient(bool);
/* 493 */       return (T)☃.getAdapter(clazz).read(jsonReader);
/* 494 */     } catch (IOException iOException) {
/* 495 */       throw new JsonParseException(iOException);
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static <T> T a(Gson ☃, Reader reader, TypeToken<T> typeToken, boolean bool) {
/*     */     try {
/* 502 */       JsonReader jsonReader = new JsonReader(reader);
/* 503 */       jsonReader.setLenient(bool);
/* 504 */       return (T)☃.getAdapter(typeToken).read(jsonReader);
/* 505 */     } catch (IOException iOException) {
/* 506 */       throw new JsonParseException(iOException);
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static <T> T a(Gson ☃, String str, TypeToken<T> typeToken, boolean bool) {
/* 512 */     return a(☃, new StringReader(str), typeToken, bool);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static <T> T a(Gson ☃, String str, Class<T> clazz, boolean bool) {
/* 517 */     return a(☃, new StringReader(str), clazz, bool);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static <T> T a(Gson ☃, Reader reader, TypeToken<T> typeToken) {
/* 522 */     return a(☃, reader, typeToken, false);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static <T> T a(Gson ☃, String str, TypeToken<T> typeToken) {
/* 527 */     return a(☃, str, typeToken, false);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static <T> T a(Gson ☃, Reader reader, Class<T> clazz) {
/* 532 */     return a(☃, reader, clazz, false);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static <T> T a(Gson ☃, String str, Class<T> clazz) {
/* 537 */     return a(☃, str, clazz, false);
/*     */   }
/*     */   
/*     */   public static JsonObject a(String ☃, boolean bool) {
/* 541 */     return a(new StringReader(☃), bool);
/*     */   }
/*     */   
/*     */   public static JsonObject a(Reader ☃, boolean bool) {
/* 545 */     return a(a, ☃, JsonObject.class, bool);
/*     */   }
/*     */   
/*     */   public static JsonObject a(String ☃) {
/* 549 */     return a(☃, false);
/*     */   }
/*     */   
/*     */   public static JsonObject a(Reader ☃) {
/* 553 */     return a(☃, false);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\afd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */