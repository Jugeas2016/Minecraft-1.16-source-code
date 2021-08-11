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
/*    */ public class dgv
/*    */   extends dhc
/*    */ {
/* 15 */   private static final Logger b = LogManager.getLogger();
/*    */   
/*    */   public List<dgu> a;
/*    */   
/*    */   public static dgv a(String ☃) {
/* 20 */     dgv dgv1 = new dgv();
/* 21 */     dgv1.a = Lists.newArrayList();
/*    */     
/*    */     try {
/* 24 */       JsonParser jsonParser = new JsonParser();
/* 25 */       JsonObject jsonObject = jsonParser.parse(☃).getAsJsonObject();
/*    */       
/* 27 */       if (jsonObject.get("lists").isJsonArray()) {
/* 28 */         JsonArray jsonArray = jsonObject.get("lists").getAsJsonArray();
/*    */         
/* 30 */         Iterator<JsonElement> iterator = jsonArray.iterator();
/*    */         
/* 32 */         while (iterator.hasNext()) {
/* 33 */           dgv1.a.add(dgu.a(((JsonElement)iterator.next()).getAsJsonObject()));
/*    */         }
/*    */       } 
/* 36 */     } catch (Exception exception) {
/* 37 */       b.error("Could not parse RealmsServerPlayerLists: " + exception.getMessage());
/*    */     } 
/*    */     
/* 40 */     return dgv1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dgv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */