/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParser;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dgp
/*    */   extends dhc
/*    */ {
/* 11 */   private static final Logger b = LogManager.getLogger();
/*    */   
/*    */   public String a;
/*    */   
/*    */   public static dgp a(String ☃) {
/* 16 */     dgp dgp1 = new dgp();
/*    */     
/*    */     try {
/* 19 */       JsonParser jsonParser = new JsonParser();
/* 20 */       JsonObject jsonObject = jsonParser.parse(☃).getAsJsonObject();
/* 21 */       dgp1.a = dip.a("newsLink", jsonObject, (String)null);
/* 22 */     } catch (Exception exception) {
/* 23 */       b.error("Could not parse RealmsNews: " + exception.getMessage());
/*    */     } 
/*    */     
/* 26 */     return dgp1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dgp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */