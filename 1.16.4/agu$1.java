/*    */ import com.google.gson.JsonArray;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonDeserializer;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonParseException;
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
/*    */ final class null
/*    */   implements JsonDeserializer<nr>
/*    */ {
/*    */   public nx a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 31 */     if (☃.isJsonPrimitive())
/*    */     {
/* 33 */       return new oe(☃.getAsString()); } 
/* 34 */     if (☃.isJsonArray()) {
/*    */       
/* 36 */       JsonArray jsonArray = ☃.getAsJsonArray();
/* 37 */       nx nx = null;
/*    */       
/* 39 */       for (JsonElement jsonElement : jsonArray) {
/* 40 */         nx nx1 = a(jsonElement, jsonElement.getClass(), jsonDeserializationContext);
/* 41 */         if (nx == null) {
/* 42 */           nx = nx1; continue;
/*    */         } 
/* 44 */         nx.a(nx1);
/*    */       } 
/*    */ 
/*    */       
/* 48 */       return nx;
/*    */     } 
/* 50 */     throw new JsonParseException("Don't know how to turn " + ☃ + " into a Component");
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\agu$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */