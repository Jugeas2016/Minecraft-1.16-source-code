/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonParser;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ public class dgh
/*    */   extends dhc
/*    */ {
/* 13 */   private static final Logger b = LogManager.getLogger();
/*    */   
/*    */   public List<dgg> a;
/*    */   
/*    */   public static dgh a(String ☃) {
/* 18 */     JsonParser jsonParser = new JsonParser();
/*    */     
/* 20 */     dgh dgh1 = new dgh();
/* 21 */     dgh1.a = Lists.newArrayList();
/*    */     try {
/* 23 */       JsonElement jsonElement = jsonParser.parse(☃).getAsJsonObject().get("backups");
/* 24 */       if (jsonElement.isJsonArray()) {
/* 25 */         Iterator<JsonElement> iterator = jsonElement.getAsJsonArray().iterator();
/* 26 */         while (iterator.hasNext()) {
/* 27 */           dgh1.a.add(dgg.a(iterator.next()));
/*    */         }
/*    */       } 
/* 30 */     } catch (Exception exception) {
/* 31 */       b.error("Could not parse BackupList: " + exception.getMessage());
/*    */     } 
/* 33 */     return dgh1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dgh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */