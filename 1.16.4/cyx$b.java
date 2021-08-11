/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import java.lang.reflect.Type;
/*     */ import org.apache.commons.lang3.ArrayUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   implements JsonDeserializer<cyx>, JsonSerializer<cyx>
/*     */ {
/*     */   public cyx a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 168 */     JsonObject jsonObject = afd.m(☃, "loot pool");
/* 169 */     czq[] arrayOfCzq = afd.<czq[]>a(jsonObject, "entries", jsonDeserializationContext, (Class)czq[].class);
/* 170 */     dbo[] arrayOfDbo = afd.<dbo[]>a(jsonObject, "conditions", new dbo[0], jsonDeserializationContext, (Class)dbo[].class);
/* 171 */     daj[] arrayOfDaj = afd.<daj[]>a(jsonObject, "functions", new daj[0], jsonDeserializationContext, (Class)daj[].class);
/* 172 */     czb czb = czc.a(jsonObject.get("rolls"), jsonDeserializationContext);
/* 173 */     czd czd = afd.<czd>a(jsonObject, "bonus_rolls", new czd(0.0F, 0.0F), jsonDeserializationContext, czd.class);
/* 174 */     return new cyx(arrayOfCzq, arrayOfDbo, arrayOfDaj, czb, czd, null);
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement a(cyx ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 179 */     JsonObject jsonObject = new JsonObject();
/* 180 */     jsonObject.add("rolls", czc.a(cyx.a(☃), jsonSerializationContext));
/* 181 */     jsonObject.add("entries", jsonSerializationContext.serialize(cyx.b(☃)));
/* 182 */     if (cyx.c(☃).b() != 0.0F && cyx.c(☃).c() != 0.0F) {
/* 183 */       jsonObject.add("bonus_rolls", jsonSerializationContext.serialize(cyx.c(☃)));
/*     */     }
/* 185 */     if (!ArrayUtils.isEmpty((Object[])cyx.d(☃))) {
/* 186 */       jsonObject.add("conditions", jsonSerializationContext.serialize(cyx.d(☃)));
/*     */     }
/* 188 */     if (!ArrayUtils.isEmpty((Object[])cyx.e(☃))) {
/* 189 */       jsonObject.add("functions", jsonSerializationContext.serialize(cyx.e(☃)));
/*     */     }
/* 191 */     return (JsonElement)jsonObject;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cyx$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */