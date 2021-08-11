/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import java.io.BufferedReader;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.InputStreamReader;
/*    */ import java.nio.charset.StandardCharsets;
/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class abg
/*    */   implements abj
/*    */ {
/* 20 */   private static final Logger b = LogManager.getLogger();
/*    */   
/*    */   protected final File a;
/*    */   
/*    */   public abg(File ☃) {
/* 25 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   private static String c(abk ☃, vk vk1) {
/* 29 */     return String.format("%s/%s/%s", new Object[] { ☃.a(), vk1.b(), vk1.a() });
/*    */   }
/*    */   
/*    */   protected static String a(File ☃, File file1) {
/* 33 */     return ☃.toURI().relativize(file1.toURI()).getPath();
/*    */   }
/*    */ 
/*    */   
/*    */   public InputStream a(abk ☃, vk vk1) throws IOException {
/* 38 */     return a(c(☃, vk1));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(abk ☃, vk vk1) {
/* 43 */     return c(c(☃, vk1));
/*    */   }
/*    */ 
/*    */   
/*    */   protected abstract InputStream a(String paramString) throws IOException;
/*    */   
/*    */   public InputStream b(String ☃) throws IOException {
/* 50 */     if (☃.contains("/") || ☃.contains("\\")) {
/* 51 */       throw new IllegalArgumentException("Root resources can only be filenames, not paths (no / allowed!)");
/*    */     }
/* 53 */     return a(☃);
/*    */   }
/*    */   
/*    */   protected abstract boolean c(String paramString);
/*    */   
/*    */   protected void d(String ☃) {
/* 59 */     b.warn("ResourcePack: ignored non-lowercase namespace: {} in {}", ☃, this.a);
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public <T> T a(abn<T> ☃) throws IOException {
/* 65 */     try (InputStream ☃ = a("pack.mcmeta")) {
/* 66 */       return (T)a((abn)☃, inputStream);
/*    */     } 
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static <T> T a(abn<T> ☃, InputStream inputStream) {
/*    */     JsonObject jsonObject;
/* 73 */     try (BufferedReader ☃ = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
/* 74 */       jsonObject = afd.a(bufferedReader);
/* 75 */     } catch (IOException|JsonParseException exception) {
/* 76 */       b.error("Couldn't load {} metadata", ☃.a(), exception);
/* 77 */       return null;
/*    */     } 
/*    */     
/* 80 */     if (!jsonObject.has(☃.a())) {
/* 81 */       return null;
/*    */     }
/*    */     try {
/* 84 */       return ☃.a(afd.t(jsonObject, ☃.a()));
/* 85 */     } catch (JsonParseException jsonParseException) {
/* 86 */       b.error("Couldn't load {} metadata", ☃.a(), jsonParseException);
/* 87 */       return null;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 93 */     return this.a.getName();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\abg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */