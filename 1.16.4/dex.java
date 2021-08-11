/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import java.nio.channels.Channels;
/*     */ import java.nio.channels.FileChannel;
/*     */ import java.nio.channels.ReadableByteChannel;
/*     */ import java.util.concurrent.ThreadLocalRandom;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import org.lwjgl.system.MemoryUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dex
/*     */ {
/*  26 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int a() {
/*  34 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*     */     
/*  36 */     if (w.d) {
/*  37 */       int[] ☃ = new int[ThreadLocalRandom.current().nextInt(15) + 1];
/*  38 */       dem.a(☃);
/*  39 */       int i = dem.M();
/*  40 */       dem.b(☃);
/*  41 */       return i;
/*     */     } 
/*     */     
/*  44 */     return dem.M();
/*     */   }
/*     */   
/*     */   public static void a(int ☃) {
/*  48 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*  49 */     dem.r(☃);
/*     */   }
/*     */   
/*     */   public static void a(int ☃, int i, int j) {
/*  53 */     a(det.b.a, ☃, 0, i, j);
/*     */   }
/*     */   
/*     */   public static void a(det.b ☃, int i, int j, int k) {
/*  57 */     a(☃, i, 0, j, k);
/*     */   }
/*     */   
/*     */   public static void a(int ☃, int i, int j, int k) {
/*  61 */     a(det.b.a, ☃, i, j, k);
/*     */   }
/*     */   
/*     */   public static void a(det.b ☃, int i, int j, int k, int m) {
/*  65 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*  66 */     b(i);
/*     */     
/*  68 */     if (j >= 0) {
/*  69 */       dem.b(3553, 33085, j);
/*  70 */       dem.b(3553, 33082, 0);
/*  71 */       dem.b(3553, 33083, j);
/*  72 */       dem.a(3553, 34049, 0.0F);
/*     */     } 
/*     */     
/*  75 */     for (int n = 0; n <= j; n++) {
/*  76 */       dem.a(3553, n, ☃.a(), k >> n, m >> n, 0, 6408, 5121, (IntBuffer)null);
/*     */     }
/*     */   }
/*     */   
/*     */   private static void b(int ☃) {
/*  81 */     RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
/*  82 */     dem.s(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static ByteBuffer a(InputStream ☃) throws IOException {
/*     */     ByteBuffer byteBuffer;
/*  89 */     if (☃ instanceof FileInputStream) {
/*  90 */       FileInputStream fileInputStream = (FileInputStream)☃;
/*  91 */       FileChannel fileChannel = fileInputStream.getChannel();
/*  92 */       byteBuffer = MemoryUtil.memAlloc((int)fileChannel.size() + 1);
/*  93 */       while (fileChannel.read(byteBuffer) != -1);
/*     */     } else {
/*     */       
/*  96 */       byteBuffer = MemoryUtil.memAlloc(8192);
/*  97 */       ReadableByteChannel readableByteChannel = Channels.newChannel(☃);
/*  98 */       while (readableByteChannel.read(byteBuffer) != -1) {
/*  99 */         if (byteBuffer.remaining() == 0) {
/* 100 */           byteBuffer = MemoryUtil.memRealloc(byteBuffer, byteBuffer.capacity() * 2);
/*     */         }
/*     */       } 
/*     */     } 
/* 104 */     return byteBuffer;
/*     */   }
/*     */   
/*     */   public static String b(InputStream ☃) {
/* 108 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 109 */     ByteBuffer byteBuffer = null;
/*     */     try {
/* 111 */       byteBuffer = a(☃);
/* 112 */       int i = byteBuffer.position();
/* 113 */       byteBuffer.rewind();
/* 114 */       return MemoryUtil.memASCII(byteBuffer, i);
/* 115 */     } catch (IOException iOException) {
/*     */     
/*     */     } finally {
/* 118 */       if (byteBuffer != null) {
/* 119 */         MemoryUtil.memFree(byteBuffer);
/*     */       }
/*     */     } 
/* 122 */     return null;
/*     */   }
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
/*     */   public static void a(IntBuffer ☃, int i, int j) {
/* 146 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 147 */     GL11.glPixelStorei(3312, 0);
/* 148 */     GL11.glPixelStorei(3313, 0);
/* 149 */     GL11.glPixelStorei(3314, 0);
/* 150 */     GL11.glPixelStorei(3315, 0);
/* 151 */     GL11.glPixelStorei(3316, 0);
/* 152 */     GL11.glPixelStorei(3317, 4);
/*     */     
/* 154 */     GL11.glTexImage2D(3553, 0, 6408, i, j, 0, 32993, 33639, ☃);
/*     */     
/* 156 */     GL11.glTexParameteri(3553, 10242, 10497);
/* 157 */     GL11.glTexParameteri(3553, 10243, 10497);
/*     */     
/* 159 */     GL11.glTexParameteri(3553, 10240, 9728);
/* 160 */     GL11.glTexParameteri(3553, 10241, 9729);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dex.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */