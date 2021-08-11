/*    */ import com.google.common.collect.Sets;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class eli
/*    */   implements abn<elh>
/*    */ {
/*    */   public elh b(JsonObject ☃) {
/* 20 */     Set<eky> set = Sets.newHashSet();
/*    */     
/* 22 */     for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)☃.entrySet()) {
/* 23 */       String str1 = entry.getKey();
/* 24 */       if (str1.length() > 16) {
/* 25 */         throw new JsonParseException("Invalid language->'" + str1 + "': language code must not be more than " + '\020' + " characters long");
/*    */       }
/* 27 */       JsonObject jsonObject = afd.m(entry.getValue(), "language");
/* 28 */       String str2 = afd.h(jsonObject, "region");
/* 29 */       String str3 = afd.h(jsonObject, "name");
/* 30 */       boolean bool = afd.a(jsonObject, "bidirectional", false);
/*    */       
/* 32 */       if (str2.isEmpty()) {
/* 33 */         throw new JsonParseException("Invalid language->'" + str1 + "'->region: empty value");
/*    */       }
/*    */       
/* 36 */       if (str3.isEmpty()) {
/* 37 */         throw new JsonParseException("Invalid language->'" + str1 + "'->name: empty value");
/*    */       }
/*    */       
/* 40 */       if (!set.add(new eky(str1, str2, str3, bool))) {
/* 41 */         throw new JsonParseException("Duplicate language->'" + str1 + "' defined");
/*    */       }
/*    */     } 
/*    */     
/* 45 */     return new elh(set);
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 50 */     return "language";
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eli.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */