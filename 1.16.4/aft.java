/*    */ import java.util.regex.Pattern;
/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.commons.lang3.StringUtils;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aft
/*    */ {
/* 10 */   private static final Pattern a = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");
/*    */   
/*    */   public static String a(int ☃) {
/* 13 */     int i = ☃ / 20;
/* 14 */     int j = i / 60;
/* 15 */     i %= 60;
/*    */     
/* 17 */     if (i < 10) {
/* 18 */       return j + ":0" + i;
/*    */     }
/* 20 */     return j + ":" + i;
/*    */   }
/*    */   
/*    */   public static String a(String ☃) {
/* 24 */     return a.matcher(☃).replaceAll("");
/*    */   }
/*    */   
/*    */   public static boolean b(@Nullable String ☃) {
/* 28 */     return StringUtils.isEmpty(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aft.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */