/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.google.common.collect.Maps;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.util.List;
/*    */ import java.util.Map;
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
/*    */ public class ekv
/*    */   extends ly
/*    */ {
/* 21 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   private final Map<String, String> b;
/*    */   private final boolean c;
/*    */   
/*    */   private ekv(Map<String, String> ☃, boolean bool) {
/* 27 */     this.b = ☃;
/* 28 */     this.c = bool;
/*    */   }
/*    */   
/*    */   public static ekv a(ach ☃, List<eky> list) {
/* 32 */     Map<String, String> map = Maps.newHashMap();
/*    */     
/* 34 */     boolean bool = false;
/* 35 */     for (eky eky : list) {
/*    */       
/* 37 */       bool |= eky.a();
/* 38 */       String str = String.format("lang/%s.json", new Object[] { eky.getCode() });
/*    */       
/* 40 */       for (String str1 : ☃.a()) {
/*    */         
/* 42 */         try { vk vk = new vk(str1, str);
/* 43 */           a(☃.c(vk), map); }
/* 44 */         catch (FileNotFoundException fileNotFoundException) {  }
/* 45 */         catch (Exception exception)
/* 46 */         { a.warn("Skipped language file: {}:{} ({})", str1, str, exception.toString()); }
/*    */       
/*    */       } 
/*    */     } 
/* 50 */     return new ekv((Map<String, String>)ImmutableMap.copyOf(map), bool);
/*    */   }
/*    */   
/*    */   private static void a(List<acg> ☃, Map<String, String> map) {
/* 54 */     for (acg acg : ☃) {
/* 55 */       try (InputStream ☃ = acg.b()) {
/* 56 */         ly.a(inputStream, map::put);
/* 57 */       } catch (IOException iOException) {
/* 58 */         a.warn("Failed to load translations from {}", acg, iOException);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public String a(String ☃) {
/* 65 */     return this.b.getOrDefault(☃, ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(String ☃) {
/* 70 */     return this.b.containsKey(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 75 */     return this.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public afa a(nu ☃) {
/* 80 */     return ekw.a(☃, this.c);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ekv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */