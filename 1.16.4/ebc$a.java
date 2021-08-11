/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonDeserializer;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import java.lang.reflect.Type;
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
/*    */   implements JsonDeserializer<ebc>
/*    */ {
/*    */   public ebc a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 34 */     JsonObject jsonObject = ☃.getAsJsonObject();
/*    */     
/* 36 */     gc gc = c(jsonObject);
/* 37 */     int i = a(jsonObject);
/* 38 */     String str = b(jsonObject);
/* 39 */     ebe ebe = (ebe)jsonDeserializationContext.deserialize((JsonElement)jsonObject, ebe.class);
/*    */     
/* 41 */     return new ebc(gc, i, str, ebe);
/*    */   }
/*    */   
/*    */   protected int a(JsonObject ☃) {
/* 45 */     return afd.a(☃, "tintindex", -1);
/*    */   }
/*    */   
/*    */   private String b(JsonObject ☃) {
/* 49 */     return afd.h(☃, "texture");
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   private gc c(JsonObject ☃) {
/* 54 */     String str = afd.a(☃, "cullface", "");
/* 55 */     return gc.a(str);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ebc$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */