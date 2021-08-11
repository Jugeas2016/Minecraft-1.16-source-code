/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.authlib.minecraft.MinecraftProfileTexture;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import com.mojang.util.UUIDTypeAdapter;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.net.HttpURLConnection;
/*     */ import java.net.URL;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.ByteOrder;
/*     */ import java.nio.IntBuffer;
/*     */ import java.util.Map;
/*     */ import java.util.UUID;
/*     */ import javax.annotation.Nullable;
/*     */ import javax.imageio.ImageIO;
/*     */ import org.apache.commons.codec.binary.Base64;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dir
/*     */ {
/*  34 */   private static final Map<String, a> a = Maps.newHashMap();
/*  35 */   private static final Map<String, Boolean> b = Maps.newHashMap();
/*  36 */   private static final Map<String, String> c = Maps.newHashMap();
/*     */   
/*  38 */   private static final Logger d = LogManager.getLogger();
/*  39 */   private static final vk e = new vk("textures/gui/presets/isles.png");
/*     */   
/*     */   public static void a(String ☃, @Nullable String str1) {
/*  42 */     if (str1 == null) {
/*  43 */       djz.C().M().a(e);
/*     */       
/*     */       return;
/*     */     } 
/*  47 */     int i = b(☃, str1);
/*     */     
/*  49 */     RenderSystem.bindTexture(i);
/*     */   }
/*     */   
/*     */   public static void a(String ☃, Runnable runnable) {
/*  53 */     RenderSystem.pushTextureAttributes();
/*     */     try {
/*  55 */       a(☃);
/*  56 */       runnable.run();
/*     */     } finally {
/*  58 */       RenderSystem.popAttributes();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void a(UUID ☃) {
/*  63 */     djz.C().M().a(ekj.a(☃));
/*     */   }
/*     */   
/*     */   private static void a(String ☃) {
/*  67 */     UUID uUID = UUIDTypeAdapter.fromString(☃);
/*     */     
/*  69 */     if (a.containsKey(☃)) {
/*  70 */       RenderSystem.bindTexture(a.a(a.get(☃)));
/*     */       
/*     */       return;
/*     */     } 
/*  74 */     if (b.containsKey(☃)) {
/*  75 */       if (!((Boolean)b.get(☃)).booleanValue()) {
/*  76 */         a(uUID);
/*     */       }
/*  78 */       else if (c.containsKey(☃)) {
/*  79 */         int i = b(☃, c.get(☃));
/*  80 */         RenderSystem.bindTexture(i);
/*     */       } else {
/*  82 */         a(uUID);
/*     */       } 
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/*  89 */     b.put(☃, Boolean.valueOf(false));
/*  90 */     a(uUID);
/*     */     
/*  92 */     Thread thread = new Thread("Realms Texture Downloader", ☃)
/*     */       {
/*     */         public void run() {
/*  95 */           Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> ☃ = dis.b(this.a);
/*     */           
/*  97 */           if (☃.containsKey(MinecraftProfileTexture.Type.SKIN)) {
/*  98 */             MinecraftProfileTexture minecraftProfileTexture = ☃.get(MinecraftProfileTexture.Type.SKIN);
/*     */             
/* 100 */             String str = minecraftProfileTexture.getUrl();
/*     */             
/* 102 */             HttpURLConnection httpURLConnection = null;
/* 103 */             dir.a().debug("Downloading http texture from {}", str);
/*     */             try {
/* 105 */               httpURLConnection = (HttpURLConnection)(new URL(str)).openConnection(djz.C().L());
/* 106 */               httpURLConnection.setDoInput(true);
/* 107 */               httpURLConnection.setDoOutput(false);
/* 108 */               httpURLConnection.connect();
/*     */               
/* 110 */               if (httpURLConnection.getResponseCode() / 100 != 2) {
/* 111 */                 dir.b().remove(this.a);
/*     */ 
/*     */                 
/*     */                 return;
/*     */               } 
/*     */               
/*     */               try {
/* 118 */                 bufferedImage = ImageIO.read(httpURLConnection.getInputStream());
/* 119 */               } catch (Exception exception) {
/* 120 */                 dir.b().remove(this.a);
/*     */                 return;
/*     */               } finally {
/* 123 */                 IOUtils.closeQuietly(httpURLConnection.getInputStream());
/*     */               } 
/*     */ 
/*     */               
/* 127 */               BufferedImage bufferedImage = (new dit()).a(bufferedImage);
/*     */               
/* 129 */               ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 130 */               ImageIO.write(bufferedImage, "png", byteArrayOutputStream);
/*     */ 
/*     */               
/* 133 */               dir.c().put(this.a, (new Base64()).encodeToString(byteArrayOutputStream.toByteArray()));
/* 134 */               dir.b().put(this.a, Boolean.valueOf(true));
/* 135 */             } catch (Exception exception) {
/* 136 */               dir.a().error("Couldn't download http texture", exception);
/* 137 */               dir.b().remove(this.a);
/*     */             } finally {
/* 139 */               if (httpURLConnection != null) {
/* 140 */                 httpURLConnection.disconnect();
/*     */               }
/*     */             } 
/*     */           } else {
/* 144 */             dir.b().put(this.a, Boolean.valueOf(true));
/*     */           } 
/*     */         }
/*     */       };
/*     */     
/* 149 */     thread.setDaemon(true);
/* 150 */     thread.start();
/*     */   }
/*     */ 
/*     */   
/*     */   private static int b(String ☃, String str1) {
/*     */     int i;
/* 156 */     if (a.containsKey(☃)) {
/* 157 */       a a = a.get(☃);
/*     */       
/* 159 */       if (a.b(a).equals(str1)) {
/* 160 */         return a.a(a);
/*     */       }
/*     */       
/* 163 */       RenderSystem.deleteTexture(a.a(a));
/* 164 */       i = a.a(a);
/*     */     } else {
/* 166 */       i = dem.M();
/*     */     } 
/*     */     
/* 169 */     IntBuffer intBuffer = null;
/* 170 */     int j = 0;
/* 171 */     int k = 0;
/*     */     
/*     */     try {
/*     */       BufferedImage bufferedImage;
/*     */       
/* 176 */       InputStream inputStream = new ByteArrayInputStream((new Base64()).decode(str1));
/*     */       
/*     */       try {
/* 179 */         bufferedImage = ImageIO.read(inputStream);
/*     */       } finally {
/* 181 */         IOUtils.closeQuietly(inputStream);
/*     */       } 
/*     */       
/* 184 */       j = bufferedImage.getWidth();
/* 185 */       k = bufferedImage.getHeight();
/*     */       
/* 187 */       int[] arrayOfInt = new int[j * k];
/* 188 */       bufferedImage.getRGB(0, 0, j, k, arrayOfInt, 0, j);
/*     */       
/* 190 */       intBuffer = ByteBuffer.allocateDirect(4 * j * k).order(ByteOrder.nativeOrder()).asIntBuffer();
/* 191 */       intBuffer.put(arrayOfInt);
/* 192 */       intBuffer.flip();
/* 193 */     } catch (IOException iOException) {
/* 194 */       BufferedImage bufferedImage; bufferedImage.printStackTrace();
/*     */     } 
/*     */     
/* 197 */     RenderSystem.activeTexture(33984);
/* 198 */     RenderSystem.bindTexture(i);
/* 199 */     dex.a(intBuffer, j, k);
/*     */     
/* 201 */     a.put(☃, new a(str1, i));
/*     */     
/* 203 */     return i;
/*     */   }
/*     */   
/*     */   public static class a {
/*     */     private final String a;
/*     */     private final int b;
/*     */     
/*     */     public a(String ☃, int i) {
/* 211 */       this.a = ☃;
/* 212 */       this.b = i;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dir.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */