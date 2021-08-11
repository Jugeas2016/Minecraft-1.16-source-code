/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.common.io.Files;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import java.io.BufferedReader;
/*    */ import java.io.File;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.nio.charset.StandardCharsets;
/*    */ import java.util.Collection;
/*    */ import java.util.Map;
/*    */ import java.util.function.Predicate;
/*    */ import java.util.stream.Collectors;
/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.commons.io.IOUtils;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ekg
/*    */ {
/* 26 */   protected static final Logger a = LogManager.getLogger();
/*    */   
/* 28 */   private final Map<String, File> b = Maps.newHashMap();
/* 29 */   private final Map<vk, File> c = Maps.newHashMap();
/*    */ 
/*    */   
/*    */   protected ekg() {}
/*    */   
/*    */   public ekg(File ☃, String str) {
/* 35 */     File file1 = new File(☃, "objects");
/*    */     
/* 37 */     File file2 = new File(☃, "indexes/" + str + ".json");
/* 38 */     BufferedReader bufferedReader = null;
/*    */     try {
/* 40 */       bufferedReader = Files.newReader(file2, StandardCharsets.UTF_8);
/* 41 */       JsonObject jsonObject1 = afd.a(bufferedReader);
/* 42 */       JsonObject jsonObject2 = afd.a(jsonObject1, "objects", (JsonObject)null);
/* 43 */       if (jsonObject2 != null) {
/* 44 */         for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)jsonObject2.entrySet()) {
/* 45 */           JsonObject jsonObject = (JsonObject)entry.getValue();
/*    */           
/* 47 */           String str1 = entry.getKey();
/* 48 */           String[] arrayOfString = str1.split("/", 2);
/* 49 */           String str2 = afd.h(jsonObject, "hash");
/* 50 */           File file = new File(file1, str2.substring(0, 2) + "/" + str2);
/*    */           
/* 52 */           if (arrayOfString.length == 1) {
/* 53 */             this.b.put(arrayOfString[0], file); continue;
/*    */           } 
/* 55 */           this.c.put(new vk(arrayOfString[0], arrayOfString[1]), file);
/*    */         }
/*    */       
/*    */       }
/* 59 */     } catch (JsonParseException jsonParseException) {
/* 60 */       a.error("Unable to parse resource index file: {}", file2);
/* 61 */     } catch (FileNotFoundException fileNotFoundException) {
/* 62 */       a.error("Can't find the resource index file: {}", file2);
/*    */     } finally {
/* 64 */       IOUtils.closeQuietly(bufferedReader);
/*    */     } 
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public File a(vk ☃) {
/* 70 */     return this.c.get(☃);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public File a(String ☃) {
/* 75 */     return this.b.get(☃);
/*    */   }
/*    */   
/*    */   public Collection<vk> a(String ☃, String str1, int i, Predicate<String> predicate) {
/* 79 */     return (Collection<vk>)this.c.keySet().stream()
/* 80 */       .filter(vk1 -> {
/*    */           String str = vk1.a();
/* 82 */           return (vk1.b().equals(☃) && !str.endsWith(".mcmeta") && str.startsWith(str1 + "/") && predicate.test(str));
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 87 */         }).collect(Collectors.toList());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ekg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */