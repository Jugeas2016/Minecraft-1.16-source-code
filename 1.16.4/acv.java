/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.io.File;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class acv
/*    */   extends acy<GameProfile, acw>
/*    */ {
/*    */   public acv(File ☃) {
/* 11 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected acx<GameProfile> a(JsonObject ☃) {
/* 16 */     return new acw(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public String[] a() {
/* 21 */     String[] ☃ = new String[d().size()];
/* 22 */     int i = 0;
/* 23 */     for (acx<GameProfile> acx : d()) {
/* 24 */       ☃[i++] = ((GameProfile)acx.g()).getName();
/*    */     }
/* 26 */     return ☃;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean b(GameProfile ☃) {
/* 40 */     acw acw = b(☃);
/*    */     
/* 42 */     if (acw != null) {
/* 43 */       return acw.b();
/*    */     }
/*    */     
/* 46 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   protected String c(GameProfile ☃) {
/* 51 */     return ☃.getId().toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\acv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */