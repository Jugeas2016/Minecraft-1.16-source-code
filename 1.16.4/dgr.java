/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParser;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dgr
/*    */   extends dhc
/*    */ {
/* 11 */   private static final Logger d = LogManager.getLogger();
/*    */   
/*    */   public String a;
/*    */   public String b;
/*    */   public String c;
/*    */   
/*    */   public static dgr a(String ☃) {
/* 18 */     JsonParser jsonParser = new JsonParser();
/* 19 */     dgr dgr1 = new dgr();
/*    */     try {
/* 21 */       JsonObject jsonObject = jsonParser.parse(☃).getAsJsonObject();
/* 22 */       dgr1.a = dip.a("address", jsonObject, (String)null);
/* 23 */       dgr1.b = dip.a("resourcePackUrl", jsonObject, (String)null);
/* 24 */       dgr1.c = dip.a("resourcePackHash", jsonObject, (String)null);
/* 25 */     } catch (Exception exception) {
/* 26 */       d.error("Could not parse RealmsServerAddress: " + exception.getMessage());
/*    */     } 
/*    */     
/* 29 */     return dgr1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dgr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */