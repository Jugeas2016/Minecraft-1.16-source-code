/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParser;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ public class dgl
/*    */   extends dhc
/*    */ {
/* 14 */   private static final Logger b = LogManager.getLogger();
/*    */   
/* 16 */   public List<dgk> a = Lists.newArrayList();
/*    */   
/*    */   public static dgl a(String ☃) {
/* 19 */     dgl dgl1 = new dgl();
/*    */     try {
/* 21 */       JsonParser jsonParser = new JsonParser();
/* 22 */       JsonObject jsonObject = jsonParser.parse(☃).getAsJsonObject();
/* 23 */       if (jsonObject.get("invites").isJsonArray()) {
/* 24 */         Iterator<JsonElement> iterator = jsonObject.get("invites").getAsJsonArray().iterator();
/* 25 */         while (iterator.hasNext()) {
/* 26 */           dgl1.a.add(dgk.a(((JsonElement)iterator.next()).getAsJsonObject()));
/*    */         }
/*    */       } 
/* 29 */     } catch (Exception exception) {
/* 30 */       b.error("Could not parse PendingInvitesList: " + exception.getMessage());
/*    */     } 
/* 32 */     return dgl1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dgl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */