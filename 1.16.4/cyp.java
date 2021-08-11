/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonDeserializer;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import com.google.gson.JsonSerializer;
/*    */ import java.lang.reflect.Type;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class cyp
/*    */   implements czb
/*    */ {
/*    */   private final int d;
/*    */   private final float e;
/*    */   
/*    */   public cyp(int ☃, float f) {
/* 22 */     this.d = ☃;
/* 23 */     this.e = f;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int a(Random ☃) {
/* 30 */     int i = 0;
/* 31 */     for (int j = 0; j < this.d; j++) {
/* 32 */       if (☃.nextFloat() < this.e) {
/* 33 */         i++;
/*    */       }
/*    */     } 
/*    */     
/* 37 */     return i;
/*    */   }
/*    */   
/*    */   public static cyp a(int ☃, float f) {
/* 41 */     return new cyp(☃, f);
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a() {
/* 46 */     return c;
/*    */   }
/*    */   
/*    */   public static class a
/*    */     implements JsonDeserializer<cyp>, JsonSerializer<cyp> {
/*    */     public cyp a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 52 */       JsonObject jsonObject = afd.m(☃, "value");
/* 53 */       int i = afd.n(jsonObject, "n");
/* 54 */       float f = afd.l(jsonObject, "p");
/* 55 */       return new cyp(i, f);
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonElement a(cyp ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 60 */       JsonObject jsonObject = new JsonObject();
/* 61 */       jsonObject.addProperty("n", Integer.valueOf(cyp.a(☃)));
/* 62 */       jsonObject.addProperty("p", Float.valueOf(cyp.b(☃)));
/* 63 */       return (JsonElement)jsonObject;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cyp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */