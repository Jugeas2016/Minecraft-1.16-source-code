/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParser;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dgd
/*    */ {
/* 12 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   private final String b;
/*    */   private final int c;
/*    */   
/*    */   private dgd(String ☃, int i) {
/* 18 */     this.b = ☃;
/* 19 */     this.c = i;
/*    */   }
/*    */   
/*    */   public static dgd a(String ☃) {
/*    */     try {
/* 24 */       JsonParser jsonParser = new JsonParser();
/* 25 */       JsonObject jsonObject = jsonParser.parse(☃).getAsJsonObject();
/* 26 */       String str = dip.a("errorMsg", jsonObject, "");
/* 27 */       int i = dip.a("errorCode", jsonObject, -1);
/* 28 */       return new dgd(str, i);
/* 29 */     } catch (Exception exception) {
/* 30 */       a.error("Could not parse RealmsError: " + exception.getMessage());
/* 31 */       a.error("The error was: " + ☃);
/* 32 */       return new dgd("Failed to parse response from server", -1);
/*    */     } 
/*    */   }
/*    */   
/*    */   public String a() {
/* 37 */     return this.b;
/*    */   }
/*    */   
/*    */   public int b() {
/* 41 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dgd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */