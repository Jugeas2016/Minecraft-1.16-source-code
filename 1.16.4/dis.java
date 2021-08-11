/*    */ import com.google.common.cache.CacheBuilder;
/*    */ import com.google.common.cache.CacheLoader;
/*    */ import com.google.common.cache.LoadingCache;
/*    */ import com.google.common.collect.Maps;
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import com.mojang.authlib.minecraft.MinecraftProfileTexture;
/*    */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*    */ import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
/*    */ import com.mojang.util.UUIDTypeAdapter;
/*    */ import java.util.Date;
/*    */ import java.util.Map;
/*    */ import java.util.concurrent.TimeUnit;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dis
/*    */ {
/* 19 */   private static final YggdrasilAuthenticationService b = new YggdrasilAuthenticationService(djz.C().L());
/* 20 */   private static final MinecraftSessionService c = b.createMinecraftSessionService();
/*    */   
/* 22 */   public static LoadingCache<String, GameProfile> a = CacheBuilder.newBuilder()
/* 23 */     .expireAfterWrite(60L, TimeUnit.MINUTES)
/* 24 */     .build(new CacheLoader<String, GameProfile>()
/*    */       {
/*    */         public GameProfile a(String ☃) throws Exception {
/* 27 */           GameProfile gameProfile = dis.a().fillProfileProperties(new GameProfile(UUIDTypeAdapter.fromString(☃), null), false);
/*    */           
/* 29 */           if (gameProfile == null) {
/* 30 */             throw new Exception("Couldn't get profile");
/*    */           }
/* 32 */           return gameProfile;
/*    */         }
/*    */       });
/*    */ 
/*    */   
/*    */   public static String a(String ☃) throws Exception {
/* 38 */     GameProfile gameProfile = (GameProfile)a.get(☃);
/* 39 */     return gameProfile.getName();
/*    */   }
/*    */   
/*    */   public static Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> b(String ☃) {
/*    */     try {
/* 44 */       GameProfile gameProfile = (GameProfile)a.get(☃);
/* 45 */       return c.getTextures(gameProfile, false);
/* 46 */     } catch (Exception exception) {
/* 47 */       return Maps.newHashMap();
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static String a(long ☃) {
/* 56 */     if (☃ < 0L) {
/* 57 */       return "right now";
/*    */     }
/*    */     
/* 60 */     long l1 = ☃ / 1000L;
/*    */     
/* 62 */     if (l1 < 60L) {
/* 63 */       return ((l1 == 1L) ? "1 second" : (l1 + " seconds")) + " ago";
/*    */     }
/*    */     
/* 66 */     if (l1 < 3600L) {
/* 67 */       long l = l1 / 60L;
/* 68 */       return ((l == 1L) ? "1 minute" : (l + " minutes")) + " ago";
/*    */     } 
/*    */     
/* 71 */     if (l1 < 86400L) {
/* 72 */       long l = l1 / 3600L;
/* 73 */       return ((l == 1L) ? "1 hour" : (l + " hours")) + " ago";
/*    */     } 
/*    */     
/* 76 */     long l2 = l1 / 86400L;
/*    */     
/* 78 */     return ((l2 == 1L) ? "1 day" : (l2 + " days")) + " ago";
/*    */   }
/*    */   
/*    */   public static String a(Date ☃) {
/* 82 */     return a(System.currentTimeMillis() - ☃.getTime());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dis.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */