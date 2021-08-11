/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.net.HttpURLConnection;
/*     */ import java.net.URL;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.io.FileUtils;
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
/*     */ public class ejt
/*     */   extends ejy
/*     */ {
/*  24 */   private static final Logger e = LogManager.getLogger();
/*     */   
/*     */   @Nullable
/*     */   private final File f;
/*     */   
/*     */   private final String g;
/*     */   
/*     */   private final boolean h;
/*     */   
/*     */   @Nullable
/*     */   private final Runnable i;
/*     */   @Nullable
/*     */   private CompletableFuture<?> j;
/*     */   private boolean k;
/*     */   
/*     */   public ejt(@Nullable File ☃, String str, vk vk1, boolean bool, @Nullable Runnable runnable) {
/*  40 */     super(vk1);
/*  41 */     this.f = ☃;
/*  42 */     this.g = str;
/*  43 */     this.h = bool;
/*  44 */     this.i = runnable;
/*     */   }
/*     */   
/*     */   private void a(det ☃) {
/*  48 */     if (this.i != null) {
/*  49 */       this.i.run();
/*     */     }
/*  51 */     djz.C().execute(() -> {
/*     */           this.k = true;
/*     */           if (!RenderSystem.isOnRenderThread()) {
/*     */             RenderSystem.recordRenderCall(());
/*     */           } else {
/*     */             b(☃);
/*     */           } 
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void b(det ☃) {
/*  65 */     dex.a(b(), ☃.a(), ☃.b());
/*  66 */     ☃.a(0, 0, 0, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ach ☃) throws IOException {
/*     */     det det;
/*  72 */     djz.C().execute(() -> {
/*     */           if (!this.k) {
/*     */             try {
/*     */               super.a(☃);
/*  76 */             } catch (IOException iOException) {
/*     */               e.warn("Failed to load texture: {}", this.d, iOException);
/*     */             } 
/*     */             
/*     */             this.k = true;
/*     */           } 
/*     */         });
/*  83 */     if (this.j != null) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  88 */     if (this.f != null && this.f.isFile()) {
/*  89 */       e.debug("Loading http texture from local cache ({})", this.f);
/*  90 */       FileInputStream fileInputStream = new FileInputStream(this.f);
/*  91 */       det = a(fileInputStream);
/*     */     } else {
/*  93 */       det = null;
/*     */     } 
/*  95 */     if (det != null) {
/*  96 */       a(det);
/*     */       
/*     */       return;
/*     */     } 
/* 100 */     this.j = CompletableFuture.runAsync(() -> {
/*     */           HttpURLConnection ☃ = null;
/*     */           
/*     */           e.debug("Downloading http texture from {} to {}", this.g, this.f);
/*     */           
/*     */           try {
/*     */             InputStream inputStream;
/*     */             
/*     */             ☃ = (HttpURLConnection)(new URL(this.g)).openConnection(djz.C().L());
/*     */             
/*     */             ☃.setDoInput(true);
/*     */             
/*     */             ☃.setDoOutput(false);
/*     */             
/*     */             ☃.connect();
/*     */             
/*     */             if (☃.getResponseCode() / 100 != 2) {
/*     */               return;
/*     */             }
/*     */             
/*     */             if (this.f != null) {
/*     */               FileUtils.copyInputStreamToFile(☃.getInputStream(), this.f);
/*     */               inputStream = new FileInputStream(this.f);
/*     */             } else {
/*     */               inputStream = ☃.getInputStream();
/*     */             } 
/*     */             djz.C().execute(());
/* 127 */           } catch (Exception exception) {
/*     */             e.error("Couldn't download http texture", exception);
/*     */           } finally {
/*     */             if (☃ != null) {
/*     */               ☃.disconnect();
/*     */             }
/*     */           } 
/* 134 */         }x.f());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private det a(InputStream ☃) {
/* 139 */     det det = null;
/*     */     try {
/* 141 */       det = det.a(☃);
/* 142 */       if (this.h) {
/* 143 */         det = c(det);
/*     */       }
/* 145 */     } catch (IOException iOException) {
/* 146 */       e.warn("Error while loading the skin texture", iOException);
/*     */     } 
/* 148 */     return det;
/*     */   }
/*     */   
/*     */   private static det c(det ☃) {
/* 152 */     boolean bool = (☃.b() == 32);
/* 153 */     if (bool) {
/* 154 */       det det1 = new det(64, 64, true);
/* 155 */       det1.a(☃);
/* 156 */       ☃.close();
/* 157 */       ☃ = det1;
/*     */       
/* 159 */       ☃.a(0, 32, 64, 32, 0);
/*     */ 
/*     */       
/* 162 */       ☃.a(4, 16, 16, 32, 4, 4, true, false);
/* 163 */       ☃.a(8, 16, 16, 32, 4, 4, true, false);
/* 164 */       ☃.a(0, 20, 24, 32, 4, 12, true, false);
/* 165 */       ☃.a(4, 20, 16, 32, 4, 12, true, false);
/* 166 */       ☃.a(8, 20, 8, 32, 4, 12, true, false);
/* 167 */       ☃.a(12, 20, 16, 32, 4, 12, true, false);
/*     */ 
/*     */       
/* 170 */       ☃.a(44, 16, -8, 32, 4, 4, true, false);
/* 171 */       ☃.a(48, 16, -8, 32, 4, 4, true, false);
/* 172 */       ☃.a(40, 20, 0, 32, 4, 12, true, false);
/* 173 */       ☃.a(44, 20, -8, 32, 4, 12, true, false);
/* 174 */       ☃.a(48, 20, -16, 32, 4, 12, true, false);
/* 175 */       ☃.a(52, 20, -8, 32, 4, 12, true, false);
/*     */     } 
/*     */     
/* 178 */     b(☃, 0, 0, 32, 16);
/*     */     
/* 180 */     if (bool) {
/* 181 */       a(☃, 32, 0, 64, 32);
/*     */     }
/* 183 */     b(☃, 0, 16, 64, 32);
/* 184 */     b(☃, 16, 48, 48, 64);
/*     */     
/* 186 */     return ☃;
/*     */   }
/*     */   private static void a(det ☃, int i, int j, int k, int m) {
/*     */     int n;
/* 190 */     for (n = i; n < k; n++) {
/* 191 */       for (int i1 = j; i1 < m; i1++) {
/* 192 */         int i2 = ☃.a(n, i1);
/* 193 */         if ((i2 >> 24 & 0xFF) < 128) {
/*     */           return;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 199 */     for (n = i; n < k; n++) {
/* 200 */       for (int i1 = j; i1 < m; i1++) {
/* 201 */         ☃.a(n, i1, ☃.a(n, i1) & 0xFFFFFF);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void b(det ☃, int i, int j, int k, int m) {
/* 207 */     for (int n = i; n < k; n++) {
/* 208 */       for (int i1 = j; i1 < m; i1++)
/* 209 */         ☃.a(n, i1, ☃.a(n, i1) | 0xFF000000); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ejt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */