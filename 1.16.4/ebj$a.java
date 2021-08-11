/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonDeserializer;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import java.lang.reflect.Type;
/*    */ import java.util.Map;
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
/*    */   implements JsonDeserializer<ebj>
/*    */ {
/*    */   public ebj a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 50 */     JsonObject jsonObject = ☃.getAsJsonObject();
/*    */     
/* 52 */     vk vk = new vk(afd.h(jsonObject, "model"));
/* 53 */     Map<vk, Float> map = a(jsonObject);
/*    */     
/* 55 */     return new ebj(vk, map);
/*    */   }
/*    */   
/*    */   protected Map<vk, Float> a(JsonObject ☃) {
/* 59 */     Map<vk, Float> map = Maps.newLinkedHashMap();
/*    */     
/* 61 */     JsonObject jsonObject = afd.t(☃, "predicate");
/* 62 */     for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)jsonObject.entrySet()) {
/* 63 */       map.put(new vk(entry
/* 64 */             .getKey()), 
/* 65 */           Float.valueOf(afd.e(entry.getValue(), entry.getKey())));
/*    */     }
/*    */ 
/*    */     
/* 69 */     return map;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ebj$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */