/*    */ import com.google.common.collect.Sets;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParser;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ public class dgj
/*    */   extends dhc
/*    */ {
/* 11 */   public Set<String> a = Sets.newHashSet();
/*    */   
/*    */   public static dgj a(String ☃) {
/* 14 */     dgj dgj1 = new dgj();
/* 15 */     JsonParser jsonParser = new JsonParser();
/*    */     try {
/* 17 */       JsonElement jsonElement1 = jsonParser.parse(☃);
/* 18 */       JsonObject jsonObject = jsonElement1.getAsJsonObject();
/* 19 */       JsonElement jsonElement2 = jsonObject.get("ops");
/* 20 */       if (jsonElement2.isJsonArray()) {
/* 21 */         for (JsonElement jsonElement : jsonElement2.getAsJsonArray()) {
/* 22 */           dgj1.a.add(jsonElement.getAsString());
/*    */         }
/*    */       }
/* 25 */     } catch (Exception exception) {}
/*    */     
/* 27 */     return dgj1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dgj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */