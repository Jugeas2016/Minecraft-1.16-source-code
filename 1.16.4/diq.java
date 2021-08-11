/*    */ import com.google.gson.annotations.SerializedName;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.nio.charset.StandardCharsets;
/*    */ import org.apache.commons.io.FileUtils;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class diq
/*    */ {
/* 15 */   private static final dgi a = new dgi();
/*    */   
/*    */   public static a a() {
/* 18 */     File ☃ = b();
/*    */     
/*    */     try {
/* 21 */       return a.<a>a(FileUtils.readFileToString(☃, StandardCharsets.UTF_8), a.class);
/* 22 */     } catch (IOException iOException) {
/* 23 */       return new a();
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void a(a ☃) {
/* 28 */     File file = b();
/*    */     
/*    */     try {
/* 31 */       FileUtils.writeStringToFile(file, a.a(☃), StandardCharsets.UTF_8);
/* 32 */     } catch (IOException iOException) {}
/*    */   }
/*    */ 
/*    */   
/*    */   private static File b() {
/* 37 */     return new File((djz.C()).n, "realms_persistence.json");
/*    */   }
/*    */   
/*    */   public static class a implements dgy {
/*    */     @SerializedName("newsLink")
/*    */     public String a;
/*    */     @SerializedName("hasUnreadNews")
/*    */     public boolean b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\diq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */