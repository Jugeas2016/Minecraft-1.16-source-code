/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import java.lang.reflect.Type;
/*     */ import java.util.UUID;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   implements JsonDeserializer<un.a>, JsonSerializer<un.a>
/*     */ {
/*     */   public un.a a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/*  88 */     JsonObject jsonObject = afd.m(☃, "players");
/*  89 */     un.a a1 = new un.a(afd.n(jsonObject, "max"), afd.n(jsonObject, "online"));
/*     */     
/*  91 */     if (afd.d(jsonObject, "sample")) {
/*  92 */       JsonArray jsonArray = afd.u(jsonObject, "sample");
/*  93 */       if (jsonArray.size() > 0) {
/*  94 */         GameProfile[] arrayOfGameProfile = new GameProfile[jsonArray.size()];
/*  95 */         for (int i = 0; i < arrayOfGameProfile.length; i++) {
/*  96 */           JsonObject jsonObject1 = afd.m(jsonArray.get(i), "player[" + i + "]");
/*  97 */           String str = afd.h(jsonObject1, "id");
/*  98 */           arrayOfGameProfile[i] = new GameProfile(UUID.fromString(str), afd.h(jsonObject1, "name"));
/*     */         } 
/* 100 */         a1.a(arrayOfGameProfile);
/*     */       } 
/*     */     } 
/*     */     
/* 104 */     return a1;
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement a(un.a ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 109 */     JsonObject jsonObject = new JsonObject();
/*     */     
/* 111 */     jsonObject.addProperty("max", Integer.valueOf(☃.a()));
/* 112 */     jsonObject.addProperty("online", Integer.valueOf(☃.b()));
/*     */     
/* 114 */     if (☃.c() != null && (☃.c()).length > 0) {
/* 115 */       JsonArray jsonArray = new JsonArray();
/*     */       
/* 117 */       for (int i = 0; i < (☃.c()).length; i++) {
/* 118 */         JsonObject jsonObject1 = new JsonObject();
/* 119 */         UUID uUID = ☃.c()[i].getId();
/* 120 */         jsonObject1.addProperty("id", (uUID == null) ? "" : uUID.toString());
/* 121 */         jsonObject1.addProperty("name", ☃.c()[i].getName());
/* 122 */         jsonArray.add((JsonElement)jsonObject1);
/*     */       } 
/*     */       
/* 125 */       jsonObject.add("sample", (JsonElement)jsonArray);
/*     */     } 
/*     */     
/* 128 */     return (JsonElement)jsonObject;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip\\un$a$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */