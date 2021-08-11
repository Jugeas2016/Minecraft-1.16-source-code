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
/*    */ public class a
/*    */   implements JsonDeserializer<cyp>, JsonSerializer<cyp>
/*    */ {
/*    */   public cyp a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 52 */     JsonObject jsonObject = afd.m(☃, "value");
/* 53 */     int i = afd.n(jsonObject, "n");
/* 54 */     float f = afd.l(jsonObject, "p");
/* 55 */     return new cyp(i, f);
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonElement a(cyp ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 60 */     JsonObject jsonObject = new JsonObject();
/* 61 */     jsonObject.addProperty("n", Integer.valueOf(cyp.a(☃)));
/* 62 */     jsonObject.addProperty("p", Float.valueOf(cyp.b(☃)));
/* 63 */     return (JsonElement)jsonObject;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cyp$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */