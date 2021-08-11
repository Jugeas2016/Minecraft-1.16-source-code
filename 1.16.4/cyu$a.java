/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonDeserializer;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
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
/*    */ public class a
/*    */   implements JsonDeserializer<cyu>, JsonSerializer<cyu>
/*    */ {
/*    */   public cyu a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 65 */     JsonObject jsonObject = afd.m(☃, "value");
/* 66 */     Integer integer1 = jsonObject.has("min") ? Integer.valueOf(afd.n(jsonObject, "min")) : null;
/* 67 */     Integer integer2 = jsonObject.has("max") ? Integer.valueOf(afd.n(jsonObject, "max")) : null;
/* 68 */     return new cyu(integer1, integer2, null);
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonElement a(cyu ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 73 */     JsonObject jsonObject = new JsonObject();
/* 74 */     if (cyu.a(☃) != null) {
/* 75 */       jsonObject.addProperty("max", cyu.a(☃));
/*    */     }
/*    */     
/* 78 */     if (cyu.b(☃) != null) {
/* 79 */       jsonObject.addProperty("min", cyu.b(☃));
/*    */     }
/*    */     
/* 82 */     return (JsonElement)jsonObject;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cyu$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */