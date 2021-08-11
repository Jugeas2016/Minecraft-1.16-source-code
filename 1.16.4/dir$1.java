/*     */ import com.mojang.authlib.minecraft.MinecraftProfileTexture;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.net.HttpURLConnection;
/*     */ import java.net.URL;
/*     */ import java.util.Map;
/*     */ import javax.imageio.ImageIO;
/*     */ import org.apache.commons.codec.binary.Base64;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class null
/*     */   extends Thread
/*     */ {
/*     */   null(String ☃, String paramString1) {
/*  92 */     super(☃);
/*     */   }
/*     */   public void run() {
/*  95 */     Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> ☃ = dis.b(this.a);
/*     */     
/*  97 */     if (☃.containsKey(MinecraftProfileTexture.Type.SKIN)) {
/*  98 */       MinecraftProfileTexture minecraftProfileTexture = ☃.get(MinecraftProfileTexture.Type.SKIN);
/*     */       
/* 100 */       String str = minecraftProfileTexture.getUrl();
/*     */       
/* 102 */       HttpURLConnection httpURLConnection = null;
/* 103 */       dir.a().debug("Downloading http texture from {}", str);
/*     */       try {
/* 105 */         httpURLConnection = (HttpURLConnection)(new URL(str)).openConnection(djz.C().L());
/* 106 */         httpURLConnection.setDoInput(true);
/* 107 */         httpURLConnection.setDoOutput(false);
/* 108 */         httpURLConnection.connect();
/*     */         
/* 110 */         if (httpURLConnection.getResponseCode() / 100 != 2) {
/* 111 */           dir.b().remove(this.a);
/*     */ 
/*     */           
/*     */           return;
/*     */         } 
/*     */         
/*     */         try {
/* 118 */           bufferedImage = ImageIO.read(httpURLConnection.getInputStream());
/* 119 */         } catch (Exception exception) {
/* 120 */           dir.b().remove(this.a);
/*     */           return;
/*     */         } finally {
/* 123 */           IOUtils.closeQuietly(httpURLConnection.getInputStream());
/*     */         } 
/*     */ 
/*     */         
/* 127 */         BufferedImage bufferedImage = (new dit()).a(bufferedImage);
/*     */         
/* 129 */         ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 130 */         ImageIO.write(bufferedImage, "png", byteArrayOutputStream);
/*     */ 
/*     */         
/* 133 */         dir.c().put(this.a, (new Base64()).encodeToString(byteArrayOutputStream.toByteArray()));
/* 134 */         dir.b().put(this.a, Boolean.valueOf(true));
/* 135 */       } catch (Exception exception) {
/* 136 */         dir.a().error("Couldn't download http texture", exception);
/* 137 */         dir.b().remove(this.a);
/*     */       } finally {
/* 139 */         if (httpURLConnection != null) {
/* 140 */           httpURLConnection.disconnect();
/*     */         }
/*     */       } 
/*     */     } else {
/* 144 */       dir.b().put(this.a, Boolean.valueOf(true));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dir$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */