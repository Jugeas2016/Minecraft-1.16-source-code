/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.gson.JsonArray;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParser;
/*    */ import java.util.List;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dgu
/*    */   extends dhc
/*    */ {
/* 17 */   private static final Logger c = LogManager.getLogger();
/* 18 */   private static final JsonParser d = new JsonParser();
/*    */   
/*    */   public long a;
/*    */   public List<String> b;
/*    */   
/*    */   public static dgu a(JsonObject ☃) {
/* 24 */     dgu dgu1 = new dgu();
/*    */     
/*    */     try {
/* 27 */       dgu1.a = dip.a("serverId", ☃, -1L);
/*    */       
/* 29 */       String str = dip.a("playerList", ☃, (String)null);
/*    */       
/* 31 */       if (str != null) {
/* 32 */         JsonElement jsonElement = d.parse(str);
/*    */         
/* 34 */         if (jsonElement.isJsonArray()) {
/* 35 */           dgu1.b = a(jsonElement.getAsJsonArray());
/*    */         } else {
/* 37 */           dgu1.b = Lists.newArrayList();
/*    */         } 
/*    */       } else {
/* 40 */         dgu1.b = Lists.newArrayList();
/*    */       } 
/* 42 */     } catch (Exception exception) {
/* 43 */       c.error("Could not parse RealmsServerPlayerList: " + exception.getMessage());
/*    */     } 
/*    */     
/* 46 */     return dgu1;
/*    */   }
/*    */   
/*    */   private static List<String> a(JsonArray ☃) {
/* 50 */     List<String> list = Lists.newArrayList();
/*    */     
/* 52 */     for (JsonElement jsonElement : ☃) {
/*    */       try {
/* 54 */         list.add(jsonElement.getAsString());
/* 55 */       } catch (Exception exception) {}
/*    */     } 
/*    */ 
/*    */     
/* 59 */     return list;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dgu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */