/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParser;
/*    */ import java.util.Collections;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dhf
/*    */   extends dhc
/*    */ {
/* 16 */   private static final Logger e = LogManager.getLogger();
/*    */   
/*    */   public List<dhe> a;
/*    */   public int b;
/*    */   
/*    */   public dhf(int ☃) {
/* 22 */     this.a = Collections.emptyList();
/* 23 */     this.b = 0;
/* 24 */     this.c = ☃;
/* 25 */     this.d = -1;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int c;
/*    */ 
/*    */ 
/*    */   
/*    */   public int d;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public dhf() {}
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static dhf a(String ☃) {
/* 47 */     dhf dhf1 = new dhf();
/* 48 */     dhf1.a = Lists.newArrayList();
/*    */     try {
/* 50 */       JsonParser jsonParser = new JsonParser();
/* 51 */       JsonObject jsonObject = jsonParser.parse(☃).getAsJsonObject();
/* 52 */       if (jsonObject.get("templates").isJsonArray()) {
/* 53 */         Iterator<JsonElement> iterator = jsonObject.get("templates").getAsJsonArray().iterator();
/* 54 */         while (iterator.hasNext()) {
/* 55 */           dhf1.a.add(dhe.a(((JsonElement)iterator.next()).getAsJsonObject()));
/*    */         }
/*    */       } 
/*    */       
/* 59 */       dhf1.b = dip.a("page", jsonObject, 0);
/* 60 */       dhf1.c = dip.a("size", jsonObject, 0);
/* 61 */       dhf1.d = dip.a("total", jsonObject, 0);
/* 62 */     } catch (Exception exception) {
/* 63 */       e.error("Could not parse WorldTemplatePaginatedList: " + exception.getMessage());
/*    */     } 
/* 65 */     return dhf1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dhf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */