/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.Date;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dgg
/*    */   extends dhc
/*    */ {
/* 18 */   private static final Logger f = LogManager.getLogger();
/*    */   
/*    */   public String a;
/*    */   
/*    */   public Date b;
/*    */   
/*    */   public long c;
/*    */   private boolean g;
/* 26 */   public Map<String, String> d = Maps.newHashMap();
/*    */ 
/*    */   
/* 29 */   public Map<String, String> e = Maps.newHashMap();
/*    */   
/*    */   public static dgg a(JsonElement ☃) {
/* 32 */     JsonObject jsonObject = ☃.getAsJsonObject();
/* 33 */     dgg dgg1 = new dgg();
/*    */     try {
/* 35 */       dgg1.a = dip.a("backupId", jsonObject, "");
/* 36 */       dgg1.b = dip.a("lastModifiedDate", jsonObject);
/* 37 */       dgg1.c = dip.a("size", jsonObject, 0L);
/* 38 */       if (jsonObject.has("metadata")) {
/* 39 */         JsonObject jsonObject1 = jsonObject.getAsJsonObject("metadata");
/* 40 */         Set<Map.Entry<String, JsonElement>> set = jsonObject1.entrySet();
/* 41 */         for (Map.Entry<String, JsonElement> entry : set) {
/* 42 */           if (!((JsonElement)entry.getValue()).isJsonNull()) {
/* 43 */             dgg1.d.put(a(entry.getKey()), ((JsonElement)entry.getValue()).getAsString());
/*    */           }
/*    */         } 
/*    */       } 
/* 47 */     } catch (Exception exception) {
/* 48 */       f.error("Could not parse Backup: " + exception.getMessage());
/*    */     } 
/* 50 */     return dgg1;
/*    */   }
/*    */   
/*    */   private static String a(String ☃) {
/* 54 */     String[] arrayOfString = ☃.split("_");
/* 55 */     StringBuilder stringBuilder = new StringBuilder();
/* 56 */     for (String str : arrayOfString) {
/* 57 */       if (str != null && str.length() >= 1) {
/* 58 */         if ("of".equals(str)) {
/* 59 */           stringBuilder.append(str).append(" ");
/*    */         } else {
/* 61 */           char c = Character.toUpperCase(str.charAt(0));
/* 62 */           stringBuilder.append(c).append(str.substring(1)).append(" ");
/*    */         } 
/*    */       }
/*    */     } 
/* 66 */     return stringBuilder.toString();
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 70 */     return this.g;
/*    */   }
/*    */   
/*    */   public void a(boolean ☃) {
/* 74 */     this.g = ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dgg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */