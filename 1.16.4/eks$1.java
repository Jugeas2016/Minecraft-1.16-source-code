/*    */ import com.google.common.cache.CacheLoader;
/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import com.mojang.authlib.minecraft.MinecraftProfileTexture;
/*    */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*    */ import com.mojang.authlib.properties.Property;
/*    */ import java.util.Map;
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
/*    */ class null
/*    */   extends CacheLoader<String, Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>>
/*    */ {
/*    */   null(eks ☃, MinecraftSessionService paramMinecraftSessionService) {}
/*    */   
/*    */   public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> a(String ☃) {
/* 48 */     GameProfile gameProfile = new GameProfile(null, "dummy_mcdummyface");
/* 49 */     gameProfile.getProperties().put("textures", new Property("textures", ☃, ""));
/*    */     try {
/* 51 */       return this.a.getTextures(gameProfile, false);
/* 52 */     } catch (Throwable throwable) {
/* 53 */       return (Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>)ImmutableMap.of();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eks$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */