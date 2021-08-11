/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.Date;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dgk
/*    */   extends dhc
/*    */ {
/* 13 */   private static final Logger f = LogManager.getLogger();
/*    */   
/*    */   public String a;
/*    */   public String b;
/*    */   public String c;
/*    */   public String d;
/*    */   public Date e;
/*    */   
/*    */   public static dgk a(JsonObject ☃) {
/* 22 */     dgk dgk1 = new dgk();
/*    */     try {
/* 24 */       dgk1.a = dip.a("invitationId", ☃, "");
/* 25 */       dgk1.b = dip.a("worldName", ☃, "");
/* 26 */       dgk1.c = dip.a("worldOwnerName", ☃, "");
/* 27 */       dgk1.d = dip.a("worldOwnerUuid", ☃, "");
/* 28 */       dgk1.e = dip.a("date", ☃);
/* 29 */     } catch (Exception exception) {
/* 30 */       f.error("Could not parse PendingInvite: " + exception.getMessage());
/*    */     } 
/* 32 */     return dgk1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dgk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */