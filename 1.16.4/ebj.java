/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonDeserializer;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import java.lang.reflect.Type;
/*    */ import java.util.Map;
/*    */ import javax.annotation.Nullable;
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
/*    */ public class ebj
/*    */ {
/*    */   private final vk a;
/*    */   private final Map<vk, Float> b;
/*    */   
/*    */   public ebj(vk ☃, Map<vk, Float> map) {
/* 27 */     this.a = ☃;
/* 28 */     this.b = map;
/*    */   }
/*    */   
/*    */   public vk a() {
/* 32 */     return this.a;
/*    */   }
/*    */   
/*    */   boolean a(bmb ☃, @Nullable dwt dwt1, @Nullable aqm aqm1) {
/* 36 */     blx blx = ☃.b();
/*    */     
/* 38 */     for (Map.Entry<vk, Float> entry : this.b.entrySet()) {
/* 39 */       ejn ejn = ejm.a(blx, entry.getKey());
/* 40 */       if (ejn == null || ejn.call(☃, dwt1, aqm1) < ((Float)entry.getValue()).floatValue()) {
/* 41 */         return false;
/*    */       }
/*    */     } 
/* 44 */     return true;
/*    */   }
/*    */   
/*    */   public static class a
/*    */     implements JsonDeserializer<ebj> {
/*    */     public ebj a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 50 */       JsonObject jsonObject = ☃.getAsJsonObject();
/*    */       
/* 52 */       vk vk = new vk(afd.h(jsonObject, "model"));
/* 53 */       Map<vk, Float> map = a(jsonObject);
/*    */       
/* 55 */       return new ebj(vk, map);
/*    */     }
/*    */     
/*    */     protected Map<vk, Float> a(JsonObject ☃) {
/* 59 */       Map<vk, Float> map = Maps.newLinkedHashMap();
/*    */       
/* 61 */       JsonObject jsonObject = afd.t(☃, "predicate");
/* 62 */       for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)jsonObject.entrySet()) {
/* 63 */         map.put(new vk(entry
/* 64 */               .getKey()), 
/* 65 */             Float.valueOf(afd.e(entry.getValue(), entry.getKey())));
/*    */       }
/*    */ 
/*    */       
/* 69 */       return map;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ebj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */