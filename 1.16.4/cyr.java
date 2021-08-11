/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonDeserializer;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonParseException;
/*    */ import com.google.gson.JsonPrimitive;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import com.google.gson.JsonSerializer;
/*    */ import java.lang.reflect.Type;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class cyr
/*    */   implements czb
/*    */ {
/*    */   private final int d;
/*    */   
/*    */   public cyr(int ☃) {
/* 20 */     this.d = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(Random ☃) {
/* 25 */     return this.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a() {
/* 30 */     return a;
/*    */   }
/*    */   
/*    */   public static cyr a(int ☃) {
/* 34 */     return new cyr(☃);
/*    */   }
/*    */   
/*    */   public static class a
/*    */     implements JsonDeserializer<cyr>, JsonSerializer<cyr> {
/*    */     public cyr a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 40 */       return new cyr(afd.g(☃, "value"));
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonElement a(cyr ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 45 */       return (JsonElement)new JsonPrimitive(Integer.valueOf(cyr.a(☃)));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cyr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */