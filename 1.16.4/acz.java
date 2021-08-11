/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.io.File;
/*    */ 
/*    */ 
/*    */ public class acz
/*    */   extends acy<GameProfile, ada>
/*    */ {
/*    */   public acz(File ☃) {
/* 10 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected acx<GameProfile> a(JsonObject ☃) {
/* 15 */     return new ada(☃);
/*    */   }
/*    */   
/*    */   public boolean a(GameProfile ☃) {
/* 19 */     return d(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public String[] a() {
/* 24 */     String[] ☃ = new String[d().size()];
/* 25 */     int i = 0;
/* 26 */     for (acx<GameProfile> acx : d()) {
/* 27 */       ☃[i++] = ((GameProfile)acx.g()).getName();
/*    */     }
/* 29 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected String b(GameProfile ☃) {
/* 34 */     return ☃.getId().toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\acz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */