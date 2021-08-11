/*    */ import com.google.common.cache.CacheLoader;
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import com.mojang.util.UUIDTypeAdapter;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class null
/*    */   extends CacheLoader<String, GameProfile>
/*    */ {
/*    */   public GameProfile a(String ☃) throws Exception {
/* 27 */     GameProfile gameProfile = dis.a().fillProfileProperties(new GameProfile(UUIDTypeAdapter.fromString(☃), null), false);
/*    */     
/* 29 */     if (gameProfile == null) {
/* 30 */       throw new Exception("Couldn't get profile");
/*    */     }
/* 32 */     return gameProfile;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dis$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */