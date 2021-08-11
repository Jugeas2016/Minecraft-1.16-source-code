/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.util.UUID;
/*    */ 
/*    */ 
/*    */ public class adc
/*    */   extends acx<GameProfile>
/*    */ {
/*    */   public adc(GameProfile ☃) {
/* 10 */     super(☃);
/*    */   }
/*    */   
/*    */   public adc(JsonObject ☃) {
/* 14 */     super(b(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(JsonObject ☃) {
/* 19 */     if (g() == null) {
/*    */       return;
/*    */     }
/* 22 */     ☃.addProperty("uuid", (g().getId() == null) ? "" : g().getId().toString());
/* 23 */     ☃.addProperty("name", g().getName());
/*    */   }
/*    */   private static GameProfile b(JsonObject ☃) {
/*    */     UUID uUID;
/* 27 */     if (!☃.has("uuid") || !☃.has("name")) {
/* 28 */       return null;
/*    */     }
/* 30 */     String str = ☃.get("uuid").getAsString();
/*    */     
/*    */     try {
/* 33 */       uUID = UUID.fromString(str);
/* 34 */     } catch (Throwable throwable) {
/* 35 */       return null;
/*    */     } 
/* 37 */     return new GameProfile(uUID, ☃.get("name").getAsString());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\adc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */