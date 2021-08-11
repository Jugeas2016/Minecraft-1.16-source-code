/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParser;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dha
/*    */   extends dhc
/*    */ {
/* 13 */   private static final Logger d = LogManager.getLogger();
/*    */   
/*    */   public long a;
/*    */   public int b;
/* 17 */   public a c = a.a;
/*    */   
/*    */   public static dha a(String ☃) {
/* 20 */     dha dha1 = new dha();
/*    */     try {
/* 22 */       JsonParser jsonParser = new JsonParser();
/* 23 */       JsonObject jsonObject = jsonParser.parse(☃).getAsJsonObject();
/* 24 */       dha1.a = dip.a("startDate", jsonObject, 0L);
/* 25 */       dha1.b = dip.a("daysLeft", jsonObject, 0);
/* 26 */       dha1.c = b(dip.a("subscriptionType", jsonObject, a.a.name()));
/* 27 */     } catch (Exception exception) {
/* 28 */       d.error("Could not parse Subscription: " + exception.getMessage());
/*    */     } 
/* 30 */     return dha1;
/*    */   }
/*    */   
/*    */   private static a b(String ☃) {
/*    */     try {
/* 35 */       return a.valueOf(☃);
/* 36 */     } catch (Exception exception) {
/* 37 */       return a.a;
/*    */     } 
/*    */   }
/*    */   
/*    */   public enum a {
/* 42 */     a, b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dha.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */