/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.InputStreamReader;
/*    */ import java.nio.charset.StandardCharsets;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
/*    */ import java.util.function.BiConsumer;
/*    */ import java.util.regex.Pattern;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ly
/*    */ {
/* 28 */   private static final Logger a = LogManager.getLogger();
/* 29 */   private static final Gson b = new Gson();
/*    */   
/* 31 */   private static final Pattern c = Pattern.compile("%(\\d+\\$)?[\\d.]*[df]");
/*    */   
/* 33 */   private static volatile ly d = c();
/*    */   
/*    */   private static ly c() {
/* 36 */     ImmutableMap.Builder<String, String> ☃ = ImmutableMap.builder();
/* 37 */     BiConsumer<String, String> biConsumer = ☃::put;
/* 38 */     try (InputStream ☃ = ly.class.getResourceAsStream("/assets/minecraft/lang/en_us.json")) {
/* 39 */       a(inputStream, biConsumer);
/* 40 */     } catch (IOException|com.google.gson.JsonParseException exception) {
/* 41 */       a.error("Couldn't read strings from /assets/minecraft/lang/en_us.json", exception);
/*    */     } 
/*    */     
/* 44 */     ImmutableMap immutableMap = ☃.build();
/* 45 */     return new ly((Map)immutableMap)
/*    */       {
/*    */         public String a(String ☃) {
/* 48 */           return (String)this.a.getOrDefault(☃, ☃);
/*    */         }
/*    */ 
/*    */         
/*    */         public boolean b(String ☃) {
/* 53 */           return this.a.containsKey(☃);
/*    */         }
/*    */ 
/*    */         
/*    */         public boolean b() {
/* 58 */           return false;
/*    */         }
/*    */ 
/*    */ 
/*    */         
/*    */         public afa a(nu ☃) {
/* 64 */           return afb1 -> ☃.a((), ob.a).isPresent();
/*    */         }
/*    */       };
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static void a(InputStream ☃, BiConsumer<String, String> biConsumer) {
/* 72 */     JsonObject jsonObject = (JsonObject)b.fromJson(new InputStreamReader(☃, StandardCharsets.UTF_8), JsonObject.class);
/* 73 */     for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)jsonObject.entrySet()) {
/* 74 */       String str = c.matcher(afd.a(entry.getValue(), entry.getKey())).replaceAll("%$1s");
/* 75 */       biConsumer.accept(entry.getKey(), str);
/*    */     } 
/*    */   }
/*    */   
/*    */   public static ly a() {
/* 80 */     return d;
/*    */   }
/*    */   
/*    */   public static void a(ly ☃) {
/* 84 */     d = ☃;
/*    */   }
/*    */   
/*    */   public abstract String a(String paramString);
/*    */   
/*    */   public abstract boolean b(String paramString);
/*    */   
/*    */   public abstract boolean b();
/*    */   
/*    */   public abstract afa a(nu paramnu);
/*    */   
/*    */   public List<afa> a(List<nu> ☃) {
/* 96 */     return (List<afa>)☃.stream().map(a()::a).collect(ImmutableList.toImmutableList());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ly.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */