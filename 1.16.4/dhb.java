/*     */ import com.google.common.annotations.VisibleForTesting;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParser;
/*     */ import java.net.URI;
/*     */ import java.net.URISyntaxException;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dhb
/*     */   extends dhc
/*     */ {
/*  20 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  25 */   private static final Pattern b = Pattern.compile("^[a-zA-Z][-a-zA-Z0-9+.]+:");
/*     */   
/*     */   private final boolean c;
/*     */   @Nullable
/*     */   private final String d;
/*     */   private final URI e;
/*     */   
/*     */   private dhb(boolean ☃, @Nullable String str, URI uRI) {
/*  33 */     this.c = ☃;
/*  34 */     this.d = str;
/*  35 */     this.e = uRI;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static dhb a(String ☃) {
/*     */     try {
/*  41 */       JsonParser jsonParser = new JsonParser();
/*  42 */       JsonObject jsonObject = jsonParser.parse(☃).getAsJsonObject();
/*  43 */       String str = dip.a("uploadEndpoint", jsonObject, (String)null);
/*  44 */       if (str != null) {
/*  45 */         int i = dip.a("port", jsonObject, -1);
/*  46 */         URI uRI = a(str, i);
/*  47 */         if (uRI != null) {
/*  48 */           boolean bool = dip.a("worldClosed", jsonObject, false);
/*  49 */           String str1 = dip.a("token", jsonObject, (String)null);
/*  50 */           return new dhb(bool, str1, uRI);
/*     */         } 
/*     */       } 
/*  53 */     } catch (Exception exception) {
/*  54 */       a.error("Could not parse UploadInfo: " + exception.getMessage());
/*     */     } 
/*     */     
/*  57 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   @VisibleForTesting
/*     */   public static URI a(String ☃, int i) {
/*  63 */     Matcher matcher = b.matcher(☃);
/*     */     
/*  65 */     String str = a(☃, matcher);
/*     */     try {
/*  67 */       URI uRI = new URI(str);
/*  68 */       int j = a(i, uRI.getPort());
/*  69 */       if (j != uRI.getPort()) {
/*  70 */         return new URI(uRI.getScheme(), uRI.getUserInfo(), uRI.getHost(), j, uRI.getPath(), uRI.getQuery(), uRI.getFragment());
/*     */       }
/*  72 */       return uRI;
/*  73 */     } catch (URISyntaxException uRISyntaxException) {
/*  74 */       a.warn("Failed to parse URI {}", str, uRISyntaxException);
/*     */ 
/*     */       
/*  77 */       return null;
/*     */     } 
/*     */   }
/*     */   private static int a(int ☃, int i) {
/*  81 */     if (☃ != -1) {
/*  82 */       return ☃;
/*     */     }
/*  84 */     if (i != -1) {
/*  85 */       return i;
/*     */     }
/*  87 */     return 8080;
/*     */   }
/*     */   
/*     */   private static String a(String ☃, Matcher matcher) {
/*  91 */     if (matcher.find()) {
/*  92 */       return ☃;
/*     */     }
/*  94 */     return "http://" + ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public static String b(@Nullable String ☃) {
/*  99 */     JsonObject jsonObject = new JsonObject();
/* 100 */     if (☃ != null) {
/* 101 */       jsonObject.addProperty("token", ☃);
/*     */     }
/* 103 */     return jsonObject.toString();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public String a() {
/* 108 */     return this.d;
/*     */   }
/*     */   
/*     */   public URI b() {
/* 112 */     return this.e;
/*     */   }
/*     */   
/*     */   public boolean c() {
/* 116 */     return this.c;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dhb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */