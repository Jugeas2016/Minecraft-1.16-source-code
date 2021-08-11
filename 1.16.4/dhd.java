/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParser;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dhd
/*    */   extends dhc
/*    */ {
/* 11 */   private static final Logger d = LogManager.getLogger();
/*    */   
/*    */   public String a;
/*    */   public String b;
/*    */   public String c;
/*    */   
/*    */   public static dhd a(String ☃) {
/* 18 */     JsonParser jsonParser = new JsonParser();
/* 19 */     JsonObject jsonObject = jsonParser.parse(☃).getAsJsonObject();
/*    */     
/* 21 */     dhd dhd1 = new dhd();
/*    */     
/*    */     try {
/* 24 */       dhd1.a = dip.a("downloadLink", jsonObject, "");
/* 25 */       dhd1.b = dip.a("resourcePackUrl", jsonObject, "");
/* 26 */       dhd1.c = dip.a("resourcePackHash", jsonObject, "");
/* 27 */     } catch (Exception exception) {
/* 28 */       d.error("Could not parse WorldDownload: " + exception.getMessage());
/*    */     } 
/*    */     
/* 31 */     return dhd1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dhd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */