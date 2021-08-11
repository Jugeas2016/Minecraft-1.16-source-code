/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import java.lang.reflect.Type;
/*     */ import java.util.Locale;
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
/*     */ public class a
/*     */   implements JsonDeserializer<ebb>
/*     */ {
/*     */   public ebb a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/*  72 */     JsonObject jsonObject = ☃.getAsJsonObject();
/*  73 */     g g1 = e(jsonObject);
/*  74 */     g g2 = d(jsonObject);
/*  75 */     ebd ebd = a(jsonObject);
/*  76 */     Map<gc, ebc> map = a(jsonDeserializationContext, jsonObject);
/*  77 */     if (jsonObject.has("shade") && !afd.c(jsonObject, "shade")) {
/*  78 */       throw new JsonParseException("Expected shade to be a Boolean");
/*     */     }
/*  80 */     boolean bool = afd.a(jsonObject, "shade", true);
/*     */     
/*  82 */     return new ebb(g1, g2, map, ebd, bool);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private ebd a(JsonObject ☃) {
/*  87 */     ebd ebd = null;
/*  88 */     if (☃.has("rotation")) {
/*  89 */       JsonObject jsonObject = afd.t(☃, "rotation");
/*  90 */       g g = a(jsonObject, "origin");
/*  91 */       g.b(0.0625F);
/*  92 */       gc.a a1 = c(jsonObject);
/*  93 */       float f = b(jsonObject);
/*  94 */       boolean bool = afd.a(jsonObject, "rescale", false);
/*     */       
/*  96 */       ebd = new ebd(g, a1, f, bool);
/*     */     } 
/*  98 */     return ebd;
/*     */   }
/*     */   
/*     */   private float b(JsonObject ☃) {
/* 102 */     float f = afd.l(☃, "angle");
/* 103 */     if (f != 0.0F && afm.e(f) != 22.5F && afm.e(f) != 45.0F) {
/* 104 */       throw new JsonParseException("Invalid rotation " + f + " found, only -45/-22.5/0/22.5/45 allowed");
/*     */     }
/* 106 */     return f;
/*     */   }
/*     */   
/*     */   private gc.a c(JsonObject ☃) {
/* 110 */     String str = afd.h(☃, "axis");
/* 111 */     gc.a a1 = gc.a.a(str.toLowerCase(Locale.ROOT));
/* 112 */     if (a1 == null) {
/* 113 */       throw new JsonParseException("Invalid rotation axis: " + str);
/*     */     }
/* 115 */     return a1;
/*     */   }
/*     */   
/*     */   private Map<gc, ebc> a(JsonDeserializationContext ☃, JsonObject jsonObject) {
/* 119 */     Map<gc, ebc> map = b(☃, jsonObject);
/*     */     
/* 121 */     if (map.isEmpty()) {
/* 122 */       throw new JsonParseException("Expected between 1 and 6 unique faces, got 0");
/*     */     }
/*     */     
/* 125 */     return map;
/*     */   }
/*     */   
/*     */   private Map<gc, ebc> b(JsonDeserializationContext ☃, JsonObject jsonObject) {
/* 129 */     Map<gc, ebc> map = Maps.newEnumMap(gc.class);
/* 130 */     JsonObject jsonObject1 = afd.t(jsonObject, "faces");
/* 131 */     for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)jsonObject1.entrySet()) {
/* 132 */       gc gc = a(entry.getKey());
/* 133 */       map.put(gc, ☃.deserialize(entry.getValue(), ebc.class));
/*     */     } 
/* 135 */     return map;
/*     */   }
/*     */   
/*     */   private gc a(String ☃) {
/* 139 */     gc gc = gc.a(☃);
/* 140 */     if (gc == null) {
/* 141 */       throw new JsonParseException("Unknown facing: " + ☃);
/*     */     }
/* 143 */     return gc;
/*     */   }
/*     */   
/*     */   private g d(JsonObject ☃) {
/* 147 */     g g = a(☃, "to");
/* 148 */     if (g.a() < -16.0F || g.b() < -16.0F || g.c() < -16.0F || g
/* 149 */       .a() > 32.0F || g.b() > 32.0F || g.c() > 32.0F)
/*     */     {
/* 151 */       throw new JsonParseException("'to' specifier exceeds the allowed boundaries: " + g);
/*     */     }
/* 153 */     return g;
/*     */   }
/*     */   
/*     */   private g e(JsonObject ☃) {
/* 157 */     g g = a(☃, "from");
/* 158 */     if (g.a() < -16.0F || g.b() < -16.0F || g.c() < -16.0F || g
/* 159 */       .a() > 32.0F || g.b() > 32.0F || g.c() > 32.0F)
/*     */     {
/* 161 */       throw new JsonParseException("'from' specifier exceeds the allowed boundaries: " + g);
/*     */     }
/* 163 */     return g;
/*     */   }
/*     */   
/*     */   private g a(JsonObject ☃, String str) {
/* 167 */     JsonArray jsonArray = afd.u(☃, str);
/* 168 */     if (jsonArray.size() != 3) {
/* 169 */       throw new JsonParseException("Expected 3 " + str + " values, found: " + jsonArray.size());
/*     */     }
/*     */     
/* 172 */     float[] arrayOfFloat = new float[3];
/* 173 */     for (int i = 0; i < arrayOfFloat.length; i++) {
/* 174 */       arrayOfFloat[i] = afd.e(jsonArray.get(i), str + "[" + i + "]");
/*     */     }
/* 176 */     return new g(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2]);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ebb$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */