/*    */ import com.google.gson.JsonObject;
/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dhe
/*    */   extends dhc
/*    */ {
/* 12 */   private static final Logger j = LogManager.getLogger();
/*    */   
/* 14 */   public String a = "";
/* 15 */   public String b = "";
/* 16 */   public String c = "";
/* 17 */   public String d = "";
/* 18 */   public String e = "";
/*    */   @Nullable
/*    */   public String f;
/* 21 */   public String g = "";
/* 22 */   public String h = "";
/* 23 */   public a i = a.a;
/*    */   
/*    */   public static dhe a(JsonObject ☃) {
/* 26 */     dhe dhe1 = new dhe();
/*    */     try {
/* 28 */       dhe1.a = dip.a("id", ☃, "");
/* 29 */       dhe1.b = dip.a("name", ☃, "");
/* 30 */       dhe1.c = dip.a("version", ☃, "");
/* 31 */       dhe1.d = dip.a("author", ☃, "");
/* 32 */       dhe1.e = dip.a("link", ☃, "");
/* 33 */       dhe1.f = dip.a("image", ☃, (String)null);
/* 34 */       dhe1.g = dip.a("trailer", ☃, "");
/* 35 */       dhe1.h = dip.a("recommendedPlayers", ☃, "");
/* 36 */       dhe1.i = a.valueOf(dip.a("type", ☃, a.a.name()));
/* 37 */     } catch (Exception exception) {
/* 38 */       j.error("Could not parse WorldTemplate: " + exception.getMessage());
/*    */     } 
/* 40 */     return dhe1;
/*    */   }
/*    */   
/*    */   public enum a {
/* 44 */     a,
/* 45 */     b,
/* 46 */     c,
/* 47 */     d,
/* 48 */     e;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dhe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */