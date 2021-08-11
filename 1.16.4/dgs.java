/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.gson.JsonArray;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParser;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ public class dgs
/*    */   extends dhc
/*    */ {
/* 15 */   private static final Logger b = LogManager.getLogger();
/*    */   
/*    */   public List<dgq> a;
/*    */   
/*    */   public static dgs a(String ☃) {
/* 20 */     dgs dgs1 = new dgs();
/* 21 */     dgs1.a = Lists.newArrayList();
/*    */     try {
/* 23 */       JsonParser jsonParser = new JsonParser();
/* 24 */       JsonObject jsonObject = jsonParser.parse(☃).getAsJsonObject();
/* 25 */       if (jsonObject.get("servers").isJsonArray()) {
/* 26 */         JsonArray jsonArray = jsonObject.get("servers").getAsJsonArray();
/* 27 */         Iterator<JsonElement> iterator = jsonArray.iterator();
/* 28 */         while (iterator.hasNext()) {
/* 29 */           dgs1.a.add(dgq.a(((JsonElement)iterator.next()).getAsJsonObject()));
/*    */         }
/*    */       } 
/* 32 */     } catch (Exception exception) {
/* 33 */       b.error("Could not parse McoServerList: " + exception.getMessage());
/*    */     } 
/* 35 */     return dgs1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dgs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */