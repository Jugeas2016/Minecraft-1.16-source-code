/*     */ import com.google.common.cache.CacheBuilder;
/*     */ import com.google.common.cache.CacheLoader;
/*     */ import com.google.common.cache.LoadingCache;
/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Iterables;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Multimap;
/*     */ import com.google.common.hash.Hashing;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.minecraft.InsecureTextureException;
/*     */ import com.mojang.authlib.minecraft.MinecraftProfileTexture;
/*     */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*     */ import com.mojang.authlib.properties.Property;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.io.File;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class eks
/*     */ {
/*     */   private final ekd a;
/*     */   private final File b;
/*     */   private final MinecraftSessionService c;
/*     */   private final LoadingCache<String, Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>> d;
/*     */   
/*     */   public eks(ekd ☃, File file, MinecraftSessionService minecraftSessionService) {
/*  37 */     this.a = ☃;
/*  38 */     this.b = file;
/*  39 */     this.c = minecraftSessionService;
/*     */     
/*  41 */     this
/*     */ 
/*     */       
/*  44 */       .d = CacheBuilder.newBuilder().expireAfterAccess(15L, TimeUnit.SECONDS).build(new CacheLoader<String, Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>>(this, minecraftSessionService)
/*     */         {
/*     */           public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> a(String ☃)
/*     */           {
/*  48 */             GameProfile gameProfile = new GameProfile(null, "dummy_mcdummyface");
/*  49 */             gameProfile.getProperties().put("textures", new Property("textures", ☃, ""));
/*     */             try {
/*  51 */               return this.a.getTextures(gameProfile, false);
/*  52 */             } catch (Throwable throwable) {
/*  53 */               return (Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>)ImmutableMap.of();
/*     */             } 
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public vk a(MinecraftProfileTexture ☃, MinecraftProfileTexture.Type type) {
/*  60 */     return a(☃, type, (a)null);
/*     */   } public static interface a {
/*     */     void onSkinTextureAvailable(MinecraftProfileTexture.Type param1Type, vk param1vk, MinecraftProfileTexture param1MinecraftProfileTexture); }
/*     */   private vk a(MinecraftProfileTexture ☃, MinecraftProfileTexture.Type type, @Nullable a a1) {
/*  64 */     String str = Hashing.sha1().hashUnencodedChars(☃.getHash()).toString();
/*  65 */     vk vk = new vk("skins/" + str);
/*  66 */     ejq ejq = this.a.b(vk);
/*     */     
/*  68 */     if (ejq != null) {
/*  69 */       if (a1 != null) {
/*  70 */         a1.onSkinTextureAvailable(type, vk, ☃);
/*     */       }
/*     */     } else {
/*  73 */       File file1 = new File(this.b, (str.length() > 2) ? str.substring(0, 2) : "xx");
/*  74 */       File file2 = new File(file1, str);
/*  75 */       ejt ejt = new ejt(file2, ☃.getUrl(), ekj.a(), (type == MinecraftProfileTexture.Type.SKIN), () -> {
/*     */             if (☃ != null) {
/*     */               ☃.onSkinTextureAvailable(type, vk1, minecraftProfileTexture);
/*     */             }
/*     */           });
/*  80 */       this.a.a(vk, ejt);
/*     */     } 
/*     */     
/*  83 */     return vk;
/*     */   }
/*     */   
/*     */   public void a(GameProfile ☃, a a1, boolean bool) {
/*  87 */     Runnable runnable = () -> {
/*     */         Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> map = Maps.newHashMap();
/*     */         
/*     */         try {
/*     */           map.putAll(this.c.getTextures(☃, bool));
/*  92 */         } catch (InsecureTextureException insecureTextureException) {}
/*     */         
/*     */         if (map.isEmpty()) {
/*     */           ☃.getProperties().clear();
/*     */           
/*     */           if (☃.getId().equals(djz.C().J().e().getId())) {
/*     */             ☃.getProperties().putAll((Multimap)djz.C().K());
/*     */             map.putAll(this.c.getTextures(☃, false));
/*     */           } else {
/*     */             this.c.fillProfileProperties(☃, bool);
/*     */             try {
/*     */               map.putAll(this.c.getTextures(☃, bool));
/* 104 */             } catch (InsecureTextureException insecureTextureException) {}
/*     */           } 
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         djz.C().execute(());
/*     */       };
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 118 */     x.f().execute(runnable);
/*     */   }
/*     */   
/*     */   public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> a(GameProfile ☃) {
/* 122 */     Property property = (Property)Iterables.getFirst(☃.getProperties().get("textures"), null);
/* 123 */     if (property == null) {
/* 124 */       return (Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>)ImmutableMap.of();
/*     */     }
/*     */     
/* 127 */     return (Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>)this.d.getUnchecked(property.getValue());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eks.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */