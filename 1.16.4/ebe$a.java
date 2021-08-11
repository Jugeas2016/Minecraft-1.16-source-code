/*    */ import com.google.gson.JsonArray;
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
/*    */   implements JsonDeserializer<ebe>
/*    */ {
/*    */   public ebe a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 60 */     JsonObject jsonObject = ☃.getAsJsonObject();
/*    */     
/* 62 */     float[] arrayOfFloat = b(jsonObject);
/* 63 */     int i = a(jsonObject);
/*    */     
/* 65 */     return new ebe(arrayOfFloat, i);
/*    */   }
/*    */   
/*    */   protected int a(JsonObject ☃) {
/* 69 */     int i = afd.a(☃, "rotation", 0);
/*    */     
/* 71 */     if (i < 0 || i % 90 != 0 || i / 90 > 3) {
/* 72 */       throw new JsonParseException("Invalid rotation " + i + " found, only 0/90/180/270 allowed");
/*    */     }
/*    */     
/* 75 */     return i;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   private float[] b(JsonObject ☃) {
/* 80 */     if (!☃.has("uv")) {
/* 81 */       return null;
/*    */     }
/*    */     
/* 84 */     JsonArray jsonArray = afd.u(☃, "uv");
/* 85 */     if (jsonArray.size() != 4) {
/* 86 */       throw new JsonParseException("Expected 4 uv values, found: " + jsonArray.size());
/*    */     }
/*    */     
/* 89 */     float[] arrayOfFloat = new float[4];
/* 90 */     for (int i = 0; i < arrayOfFloat.length; i++) {
/* 91 */       arrayOfFloat[i] = afd.e(jsonArray.get(i), "uv[" + i + "]");
/*    */     }
/*    */     
/* 94 */     return arrayOfFloat;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ebe$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */