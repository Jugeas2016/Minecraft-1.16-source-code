/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class czc
/*    */ {
/* 15 */   private static final Map<vk, Class<? extends czb>> a = Maps.newHashMap();
/*    */   
/*    */   static {
/* 18 */     a.put(czb.b, czd.class);
/* 19 */     a.put(czb.c, cyp.class);
/* 20 */     a.put(czb.a, cyr.class);
/*    */   }
/*    */   
/*    */   public static czb a(JsonElement ☃, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 24 */     if (☃.isJsonPrimitive()) {
/* 25 */       return (czb)jsonDeserializationContext.deserialize(☃, cyr.class);
/*    */     }
/*    */     
/* 28 */     JsonObject jsonObject = ☃.getAsJsonObject();
/* 29 */     String str = afd.a(jsonObject, "type", czb.b.toString());
/*    */     
/* 31 */     Class<? extends czb> clazz = a.get(new vk(str));
/* 32 */     if (clazz == null) {
/* 33 */       throw new JsonParseException("Unknown generator: " + str);
/*    */     }
/*    */     
/* 36 */     return (czb)jsonDeserializationContext.deserialize((JsonElement)jsonObject, clazz);
/*    */   }
/*    */   
/*    */   public static JsonElement a(czb ☃, JsonSerializationContext jsonSerializationContext) {
/* 40 */     JsonElement jsonElement = jsonSerializationContext.serialize(☃);
/* 41 */     if (jsonElement.isJsonObject()) {
/* 42 */       jsonElement.getAsJsonObject().addProperty("type", ☃.a().toString());
/*    */     }
/*    */     
/* 45 */     return jsonElement;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */