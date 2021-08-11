/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dip
/*    */ {
/*    */   public static String a(String ☃, JsonObject jsonObject, String str1) {
/* 10 */     JsonElement jsonElement = jsonObject.get(☃);
/* 11 */     if (jsonElement != null) {
/* 12 */       return jsonElement.isJsonNull() ? str1 : jsonElement.getAsString();
/*    */     }
/* 14 */     return str1;
/*    */   }
/*    */ 
/*    */   
/*    */   public static int a(String ☃, JsonObject jsonObject, int i) {
/* 19 */     JsonElement jsonElement = jsonObject.get(☃);
/* 20 */     if (jsonElement != null) {
/* 21 */       return jsonElement.isJsonNull() ? i : jsonElement.getAsInt();
/*    */     }
/* 23 */     return i;
/*    */   }
/*    */ 
/*    */   
/*    */   public static long a(String ☃, JsonObject jsonObject, long l) {
/* 28 */     JsonElement jsonElement = jsonObject.get(☃);
/* 29 */     if (jsonElement != null) {
/* 30 */       return jsonElement.isJsonNull() ? l : jsonElement.getAsLong();
/*    */     }
/* 32 */     return l;
/*    */   }
/*    */ 
/*    */   
/*    */   public static boolean a(String ☃, JsonObject jsonObject, boolean bool) {
/* 37 */     JsonElement jsonElement = jsonObject.get(☃);
/* 38 */     if (jsonElement != null) {
/* 39 */       return jsonElement.isJsonNull() ? bool : jsonElement.getAsBoolean();
/*    */     }
/* 41 */     return bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public static Date a(String ☃, JsonObject jsonObject) {
/* 46 */     JsonElement jsonElement = jsonObject.get(☃);
/* 47 */     if (jsonElement != null) {
/* 48 */       return new Date(Long.parseLong(jsonElement.getAsString()));
/*    */     }
/* 50 */     return new Date();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dip.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */