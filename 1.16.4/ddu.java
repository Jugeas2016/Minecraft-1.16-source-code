/*     */ import java.io.IOException;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.util.concurrent.atomic.AtomicBoolean;
/*     */ import javax.annotation.Nullable;
/*     */ import javax.sound.sampled.AudioFormat;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.lwjgl.openal.AL10;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ddu
/*     */ {
/*  17 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */   
/*     */   private final int b;
/*     */   
/*  22 */   private final AtomicBoolean c = new AtomicBoolean(true);
/*     */   
/*  24 */   private int d = 16384;
/*     */   
/*     */   @Nullable
/*     */   private enm e;
/*     */   
/*     */   @Nullable
/*     */   static ddu a() {
/*  31 */     int[] ☃ = new int[1];
/*     */     
/*  33 */     AL10.alGenSources(☃);
/*  34 */     if (ddy.a("Allocate new source")) {
/*  35 */       return null;
/*     */     }
/*  37 */     return new ddu(☃[0]);
/*     */   }
/*     */   
/*     */   private ddu(int ☃) {
/*  41 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public void b() {
/*  45 */     if (this.c.compareAndSet(true, false)) {
/*  46 */       AL10.alSourceStop(this.b);
/*  47 */       ddy.a("Stop");
/*  48 */       if (this.e != null) {
/*     */         try {
/*  50 */           this.e.close();
/*  51 */         } catch (IOException ☃) {
/*  52 */           a.error("Failed to close audio stream", ☃);
/*     */         } 
/*  54 */         k();
/*  55 */         this.e = null;
/*     */       } 
/*     */       
/*  58 */       AL10.alDeleteSources(new int[] { this.b });
/*  59 */       ddy.a("Cleanup");
/*     */     } 
/*     */   }
/*     */   
/*     */   public void c() {
/*  64 */     AL10.alSourcePlay(this.b);
/*     */   }
/*     */   
/*     */   private int j() {
/*  68 */     if (!this.c.get()) {
/*  69 */       return 4116;
/*     */     }
/*  71 */     return AL10.alGetSourcei(this.b, 4112);
/*     */   }
/*     */   
/*     */   public void d() {
/*  75 */     if (j() == 4114) {
/*  76 */       AL10.alSourcePause(this.b);
/*     */     }
/*     */   }
/*     */   
/*     */   public void e() {
/*  81 */     if (j() == 4115) {
/*  82 */       AL10.alSourcePlay(this.b);
/*     */     }
/*     */   }
/*     */   
/*     */   public void f() {
/*  87 */     if (this.c.get()) {
/*  88 */       AL10.alSourceStop(this.b);
/*  89 */       ddy.a("Stop");
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean g() {
/*  98 */     return (j() == 4116);
/*     */   }
/*     */   
/*     */   public void a(dcn ☃) {
/* 102 */     AL10.alSourcefv(this.b, 4100, new float[] { (float)☃.b, (float)☃.c, (float)☃.d });
/*     */   }
/*     */   
/*     */   public void a(float ☃) {
/* 106 */     AL10.alSourcef(this.b, 4099, ☃);
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 110 */     AL10.alSourcei(this.b, 4103, ☃ ? 1 : 0);
/*     */   }
/*     */   
/*     */   public void b(float ☃) {
/* 114 */     AL10.alSourcef(this.b, 4106, ☃);
/*     */   }
/*     */   
/*     */   public void h() {
/* 118 */     AL10.alSourcei(this.b, 53248, 0);
/*     */   }
/*     */   
/*     */   public void c(float ☃) {
/* 122 */     AL10.alSourcei(this.b, 53248, 53251);
/* 123 */     AL10.alSourcef(this.b, 4131, ☃);
/* 124 */     AL10.alSourcef(this.b, 4129, 1.0F);
/* 125 */     AL10.alSourcef(this.b, 4128, 0.0F);
/*     */   }
/*     */   
/*     */   public void b(boolean ☃) {
/* 129 */     AL10.alSourcei(this.b, 514, ☃ ? 1 : 0);
/*     */   }
/*     */   
/*     */   public void a(ddz ☃) {
/* 133 */     ☃.a().ifPresent(☃ -> AL10.alSourcei(this.b, 4105, ☃));
/*     */   }
/*     */   
/*     */   public void a(enm ☃) {
/* 137 */     this.e = ☃;
/* 138 */     AudioFormat audioFormat = ☃.a();
/* 139 */     this.d = a(audioFormat, 1);
/* 140 */     a(4);
/*     */   }
/*     */   
/*     */   private static int a(AudioFormat ☃, int i) {
/* 144 */     return (int)((i * ☃.getSampleSizeInBits()) / 8.0F * ☃.getChannels() * ☃.getSampleRate());
/*     */   }
/*     */   
/*     */   private void a(int ☃) {
/* 148 */     if (this.e != null) {
/*     */       try {
/* 150 */         for (int i = 0; i < ☃; i++) {
/* 151 */           ByteBuffer byteBuffer = this.e.a(this.d);
/* 152 */           if (byteBuffer != null)
/*     */           {
/* 154 */             (new ddz(byteBuffer, this.e.a())).c().ifPresent(☃ -> AL10.alSourceQueueBuffers(this.b, new int[] { ☃ }));
/*     */           }
/*     */         } 
/* 157 */       } catch (IOException iOException) {
/* 158 */         a.error("Failed to read from audio stream", iOException);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public void i() {
/* 164 */     if (this.e != null) {
/* 165 */       int ☃ = k();
/* 166 */       a(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private int k() {
/* 171 */     int ☃ = AL10.alGetSourcei(this.b, 4118);
/*     */     
/* 173 */     if (☃ > 0) {
/* 174 */       int[] arrayOfInt = new int[☃];
/* 175 */       AL10.alSourceUnqueueBuffers(this.b, arrayOfInt);
/* 176 */       ddy.a("Unqueue buffers");
/* 177 */       AL10.alDeleteBuffers(arrayOfInt);
/* 178 */       ddy.a("Remove processed buffers");
/*     */     } 
/*     */     
/* 181 */     return ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ddu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */