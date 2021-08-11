/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonParseException;
/*    */ import java.io.BufferedReader;
/*    */ import java.io.InputStream;
/*    */ import java.io.InputStreamReader;
/*    */ import java.io.Reader;
/*    */ import java.nio.charset.StandardCharsets;
/*    */ import java.util.Map;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class acj
/*    */   extends ack<Map<vk, JsonElement>>
/*    */ {
/* 22 */   private static final Logger a = LogManager.getLogger();
/*    */   
/* 24 */   private static final int b = ".json".length();
/*    */   
/*    */   private final Gson c;
/*    */   private final String d;
/*    */   
/*    */   public acj(Gson ☃, String str) {
/* 30 */     this.c = ☃;
/* 31 */     this.d = str;
/*    */   }
/*    */ 
/*    */   
/*    */   protected Map<vk, JsonElement> a(ach ☃, anw anw1) {
/* 36 */     Map<vk, JsonElement> map = Maps.newHashMap();
/*    */     
/* 38 */     int i = this.d.length() + 1;
/*    */     
/* 40 */     for (vk vk1 : ☃.a(this.d, ☃ -> ☃.endsWith(".json"))) {
/* 41 */       String str = vk1.a();
/* 42 */       vk vk2 = new vk(vk1.b(), str.substring(i, str.length() - b));
/*    */       
/* 44 */       try(acg ☃ = ☃.a(vk1); 
/* 45 */           InputStream ☃ = acg.b(); 
/* 46 */           Reader ☃ = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
/* 47 */         JsonElement jsonElement = afd.<JsonElement>a(this.c, reader, JsonElement.class);
/* 48 */         if (jsonElement != null) {
/* 49 */           JsonElement jsonElement1 = map.put(vk2, jsonElement);
/* 50 */           if (jsonElement1 != null) {
/* 51 */             throw new IllegalStateException("Duplicate data file ignored with ID " + vk2);
/*    */           }
/*    */         } else {
/* 54 */           a.error("Couldn't load data file {} from {} as it's null or empty", vk2, vk1);
/*    */         } 
/* 56 */       } catch (JsonParseException|IllegalArgumentException|java.io.IOException exception) {
/* 57 */         a.error("Couldn't parse data file {} from {}", vk2, vk1, exception);
/*    */       } 
/*    */     } 
/*    */     
/* 61 */     return map;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\acj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */