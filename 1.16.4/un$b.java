/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import java.lang.reflect.Type;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class b
/*     */   implements JsonDeserializer<un>, JsonSerializer<un>
/*     */ {
/*     */   public un a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 170 */     JsonObject jsonObject = afd.m(☃, "status");
/* 171 */     un un = new un();
/*     */     
/* 173 */     if (jsonObject.has("description")) {
/* 174 */       un.a((nr)jsonDeserializationContext.deserialize(jsonObject.get("description"), nr.class));
/*     */     }
/*     */     
/* 177 */     if (jsonObject.has("players")) {
/* 178 */       un.a((un.a)jsonDeserializationContext.deserialize(jsonObject.get("players"), un.a.class));
/*     */     }
/*     */     
/* 181 */     if (jsonObject.has("version")) {
/* 182 */       un.a((un.c)jsonDeserializationContext.deserialize(jsonObject.get("version"), un.c.class));
/*     */     }
/*     */     
/* 185 */     if (jsonObject.has("favicon")) {
/* 186 */       un.a(afd.h(jsonObject, "favicon"));
/*     */     }
/*     */     
/* 189 */     return un;
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement a(un ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 194 */     JsonObject jsonObject = new JsonObject();
/*     */     
/* 196 */     if (☃.a() != null) {
/* 197 */       jsonObject.add("description", jsonSerializationContext.serialize(☃.a()));
/*     */     }
/*     */     
/* 200 */     if (☃.b() != null) {
/* 201 */       jsonObject.add("players", jsonSerializationContext.serialize(☃.b()));
/*     */     }
/*     */     
/* 204 */     if (☃.c() != null) {
/* 205 */       jsonObject.add("version", jsonSerializationContext.serialize(☃.c()));
/*     */     }
/*     */     
/* 208 */     if (☃.d() != null) {
/* 209 */       jsonObject.addProperty("favicon", ☃.d());
/*     */     }
/*     */     
/* 212 */     return (JsonElement)jsonObject;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip\\un$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */