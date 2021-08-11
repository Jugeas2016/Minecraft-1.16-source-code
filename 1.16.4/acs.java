/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.Date;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class acs
/*    */   extends acp<String>
/*    */ {
/*    */   public acs(String ☃) {
/* 12 */     this(☃, null, null, null, null);
/*    */   }
/*    */   
/*    */   public acs(String ☃, @Nullable Date date1, @Nullable String str1, @Nullable Date date2, @Nullable String str2) {
/* 16 */     super(☃, date1, str1, date2, str2);
/*    */   }
/*    */ 
/*    */   
/*    */   public nr e() {
/* 21 */     return new oe(g());
/*    */   }
/*    */   
/*    */   public acs(JsonObject ☃) {
/* 25 */     super(b(☃), ☃);
/*    */   }
/*    */   
/*    */   private static String b(JsonObject ☃) {
/* 29 */     return ☃.has("ip") ? ☃.get("ip").getAsString() : null;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(JsonObject ☃) {
/* 34 */     if (g() == null) {
/*    */       return;
/*    */     }
/* 37 */     ☃.addProperty("ip", g());
/* 38 */     super.a(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\acs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */