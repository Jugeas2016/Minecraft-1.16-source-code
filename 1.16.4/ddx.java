/*     */ import com.google.common.collect.Lists;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.FloatBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import java.util.List;
/*     */ import javax.sound.sampled.AudioFormat;
/*     */ import org.lwjgl.BufferUtils;
/*     */ import org.lwjgl.PointerBuffer;
/*     */ import org.lwjgl.stb.STBVorbis;
/*     */ import org.lwjgl.stb.STBVorbisInfo;
/*     */ import org.lwjgl.system.MemoryStack;
/*     */ import org.lwjgl.system.MemoryUtil;
/*     */ 
/*     */ 
/*     */ public class ddx
/*     */   implements enm
/*     */ {
/*     */   private long a;
/*     */   private final AudioFormat b;
/*     */   private final InputStream c;
/*     */   
/*     */   static class a
/*     */   {
/*  26 */     private final List<ByteBuffer> a = Lists.newArrayList();
/*     */     
/*     */     private final int b;
/*     */     private int c;
/*     */     private ByteBuffer d;
/*     */     
/*     */     public a(int ☃) {
/*  33 */       this.b = ☃ + 1 & 0xFFFFFFFE;
/*  34 */       b();
/*     */     }
/*     */     
/*     */     private void b() {
/*  38 */       this.d = BufferUtils.createByteBuffer(this.b);
/*     */     }
/*     */     
/*     */     public void a(float ☃) {
/*  42 */       if (this.d.remaining() == 0) {
/*  43 */         this.d.flip();
/*  44 */         this.a.add(this.d);
/*  45 */         b();
/*     */       } 
/*     */       
/*  48 */       int i = afm.a((int)(☃ * 32767.5F - 0.5F), -32768, 32767);
/*  49 */       this.d.putShort((short)i);
/*  50 */       this.c += 2;
/*     */     }
/*     */     
/*     */     public ByteBuffer a() {
/*  54 */       this.d.flip();
/*     */       
/*  56 */       if (this.a.isEmpty()) {
/*  57 */         return this.d;
/*     */       }
/*     */       
/*  60 */       ByteBuffer ☃ = BufferUtils.createByteBuffer(this.c);
/*  61 */       this.a.forEach(☃::put);
/*  62 */       ☃.put(this.d);
/*  63 */       ☃.flip();
/*  64 */       return ☃;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  71 */   private ByteBuffer d = MemoryUtil.memAlloc(8192);
/*     */   
/*     */   public ddx(InputStream ☃) throws IOException {
/*  74 */     this.c = ☃;
/*     */     
/*  76 */     this.d.limit(0);
/*  77 */     try (MemoryStack ☃ = MemoryStack.stackPush()) {
/*  78 */       IntBuffer intBuffer1 = memoryStack.mallocInt(1);
/*  79 */       IntBuffer intBuffer2 = memoryStack.mallocInt(1);
/*  80 */       while (this.a == 0L) {
/*  81 */         if (!c()) {
/*  82 */           throw new IOException("Failed to find Ogg header");
/*     */         }
/*  84 */         int i = this.d.position();
/*  85 */         this.d.position(0);
/*  86 */         this.a = STBVorbis.stb_vorbis_open_pushdata(this.d, intBuffer1, intBuffer2, null);
/*  87 */         this.d.position(i);
/*  88 */         int j = intBuffer2.get(0);
/*     */         
/*  90 */         if (j == 1) {
/*  91 */           d(); continue;
/*  92 */         }  if (j != 0) {
/*  93 */           throw new IOException("Failed to read Ogg file " + j);
/*     */         }
/*     */       } 
/*  96 */       this.d.position(this.d.position() + intBuffer1.get(0));
/*     */       
/*  98 */       STBVorbisInfo sTBVorbisInfo = STBVorbisInfo.mallocStack(memoryStack);
/*     */       
/* 100 */       STBVorbis.stb_vorbis_get_info(this.a, sTBVorbisInfo);
/* 101 */       this.b = new AudioFormat(sTBVorbisInfo.sample_rate(), 16, sTBVorbisInfo.channels(), true, false);
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean c() throws IOException {
/* 106 */     int ☃ = this.d.limit();
/* 107 */     int i = this.d.capacity() - ☃;
/* 108 */     if (i == 0) {
/* 109 */       return true;
/*     */     }
/*     */     
/* 112 */     byte[] arrayOfByte = new byte[i];
/* 113 */     int j = this.c.read(arrayOfByte);
/* 114 */     if (j == -1) {
/* 115 */       return false;
/*     */     }
/* 117 */     int k = this.d.position();
/* 118 */     this.d.limit(☃ + j);
/* 119 */     this.d.position(☃);
/* 120 */     this.d.put(arrayOfByte, 0, j);
/* 121 */     this.d.position(k);
/* 122 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private void d() {
/* 127 */     boolean ☃ = (this.d.position() == 0);
/* 128 */     boolean bool1 = (this.d.position() == this.d.limit());
/*     */     
/* 130 */     if (bool1 && !☃) {
/* 131 */       this.d.position(0);
/* 132 */       this.d.limit(0);
/*     */     } else {
/* 134 */       ByteBuffer byteBuffer = MemoryUtil.memAlloc(☃ ? (2 * this.d.capacity()) : this.d.capacity());
/* 135 */       byteBuffer.put(this.d);
/* 136 */       MemoryUtil.memFree(this.d);
/*     */       
/* 138 */       byteBuffer.flip();
/* 139 */       this.d = byteBuffer;
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean a(a ☃) throws IOException {
/* 144 */     if (this.a == 0L) {
/* 145 */       return false;
/*     */     }
/*     */     
/* 148 */     try (MemoryStack ☃ = MemoryStack.stackPush()) {
/* 149 */       PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
/* 150 */       IntBuffer intBuffer1 = memoryStack.mallocInt(1);
/* 151 */       IntBuffer intBuffer2 = memoryStack.mallocInt(1);
/*     */       
/*     */       while (true) {
/* 154 */         int i = STBVorbis.stb_vorbis_decode_frame_pushdata(this.a, this.d, intBuffer1, pointerBuffer, intBuffer2);
/* 155 */         this.d.position(this.d.position() + i);
/*     */         
/* 157 */         int j = STBVorbis.stb_vorbis_get_error(this.a);
/* 158 */         if (j == 1) {
/* 159 */           d();
/* 160 */           if (!c()) {
/*     */             break;
/*     */           }
/*     */           
/*     */           continue;
/*     */         } 
/* 166 */         if (j != 0) {
/* 167 */           throw new IOException("Failed to read Ogg file " + j);
/*     */         }
/*     */         
/* 170 */         int k = intBuffer2.get(0);
/* 171 */         if (k == 0) {
/*     */           continue;
/*     */         }
/*     */ 
/*     */         
/* 176 */         int m = intBuffer1.get(0);
/* 177 */         PointerBuffer pointerBuffer1 = pointerBuffer.getPointerBuffer(m);
/* 178 */         if (m == 1) {
/* 179 */           a(pointerBuffer1.getFloatBuffer(0, k), ☃);
/* 180 */           return true;
/* 181 */         }  if (m == 2) {
/* 182 */           a(pointerBuffer1.getFloatBuffer(0, k), pointerBuffer1.getFloatBuffer(1, k), ☃);
/* 183 */           return true;
/*     */         } 
/* 185 */         throw new IllegalStateException("Invalid number of channels: " + m);
/*     */       } 
/*     */ 
/*     */       
/* 189 */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(FloatBuffer ☃, a a1) {
/* 194 */     while (☃.hasRemaining()) {
/* 195 */       a1.a(☃.get());
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(FloatBuffer ☃, FloatBuffer floatBuffer1, a a1) {
/* 200 */     while (☃.hasRemaining() && floatBuffer1.hasRemaining()) {
/* 201 */       a1.a(☃.get());
/* 202 */       a1.a(floatBuffer1.get());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() throws IOException {
/* 208 */     if (this.a != 0L) {
/* 209 */       STBVorbis.stb_vorbis_close(this.a);
/* 210 */       this.a = 0L;
/*     */     } 
/* 212 */     MemoryUtil.memFree(this.d);
/* 213 */     this.c.close();
/*     */   }
/*     */ 
/*     */   
/*     */   public AudioFormat a() {
/* 218 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public ByteBuffer a(int ☃) throws IOException {
/* 223 */     a a = new a(☃ + 8192);
/* 224 */     while (a(a) && a.a(a) < ☃);
/*     */ 
/*     */     
/* 227 */     return a.a();
/*     */   }
/*     */   
/*     */   public ByteBuffer b() throws IOException {
/* 231 */     a ☃ = new a(16384);
/* 232 */     while (a(☃));
/*     */ 
/*     */     
/* 235 */     return ☃.a();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ddx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */