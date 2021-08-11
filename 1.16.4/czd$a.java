/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonDeserializer;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import com.google.gson.JsonPrimitive;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import com.google.gson.JsonSerializer;
/*    */ import java.lang.reflect.Type;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */   implements JsonDeserializer<czd>, JsonSerializer<czd>
/*    */ {
/*    */   public czd a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 69 */     if (afd.b(☃)) {
/* 70 */       return new czd(afd.e(☃, "value"));
/*    */     }
/* 72 */     JsonObject jsonObject = afd.m(☃, "value");
/* 73 */     float f1 = afd.l(jsonObject, "min");
/* 74 */     float f2 = afd.l(jsonObject, "max");
/* 75 */     return new czd(f1, f2);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public JsonElement a(czd ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 81 */     if (czd.a(☃) == czd.b(☃)) {
/* 82 */       return (JsonElement)new JsonPrimitive(Float.valueOf(czd.a(☃)));
/*    */     }
/* 84 */     JsonObject jsonObject = new JsonObject();
/* 85 */     jsonObject.addProperty("min", Float.valueOf(czd.a(☃)));
/* 86 */     jsonObject.addProperty("max", Float.valueOf(czd.b(☃)));
/* 87 */     return (JsonElement)jsonObject;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czd$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */