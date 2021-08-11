/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.util.UUID;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class acw
/*    */   extends acx<GameProfile>
/*    */ {
/*    */   private final int a;
/*    */   private final boolean b;
/*    */   
/*    */   public acw(GameProfile ☃, int i, boolean bool) {
/* 14 */     super(☃);
/* 15 */     this.a = i;
/* 16 */     this.b = bool;
/*    */   }
/*    */   
/*    */   public acw(JsonObject ☃) {
/* 20 */     super(b(☃));
/* 21 */     this.a = ☃.has("level") ? ☃.get("level").getAsInt() : 0;
/* 22 */     this.b = (☃.has("bypassesPlayerLimit") && ☃.get("bypassesPlayerLimit").getAsBoolean());
/*    */   }
/*    */   
/*    */   public int a() {
/* 26 */     return this.a;
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 30 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(JsonObject ☃) {
/* 35 */     if (g() == null) {
/*    */       return;
/*    */     }
/* 38 */     ☃.addProperty("uuid", (g().getId() == null) ? "" : g().getId().toString());
/* 39 */     ☃.addProperty("name", g().getName());
/* 40 */     ☃.addProperty("level", Integer.valueOf(this.a));
/* 41 */     ☃.addProperty("bypassesPlayerLimit", Boolean.valueOf(this.b));
/*    */   }
/*    */   private static GameProfile b(JsonObject ☃) {
/*    */     UUID uUID;
/* 45 */     if (!☃.has("uuid") || !☃.has("name")) {
/* 46 */       return null;
/*    */     }
/* 48 */     String str = ☃.get("uuid").getAsString();
/*    */     
/*    */     try {
/* 51 */       uUID = UUID.fromString(str);
/* 52 */     } catch (Throwable throwable) {
/* 53 */       return null;
/*    */     } 
/* 55 */     return new GameProfile(uUID, ☃.get("name").getAsString());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\acw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */