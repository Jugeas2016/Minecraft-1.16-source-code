/*     */ import java.io.EOFException;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import java.nio.channels.Channels;
/*     */ import java.nio.channels.ReadableByteChannel;
/*     */ import java.nio.channels.SeekableByteChannel;
/*     */ import org.lwjgl.stb.STBIEOFCallback;
/*     */ import org.lwjgl.stb.STBIEOFCallbackI;
/*     */ import org.lwjgl.stb.STBIIOCallbacks;
/*     */ import org.lwjgl.stb.STBIReadCallback;
/*     */ import org.lwjgl.stb.STBIReadCallbackI;
/*     */ import org.lwjgl.stb.STBISkipCallback;
/*     */ import org.lwjgl.stb.STBISkipCallbackI;
/*     */ import org.lwjgl.stb.STBImage;
/*     */ import org.lwjgl.system.MemoryStack;
/*     */ import org.lwjgl.system.MemoryUtil;
/*     */ 
/*     */ public class deu
/*     */ {
/*     */   public final int a;
/*     */   public final int b;
/*     */   
/*     */   public deu(String ☃, InputStream inputStream) throws IOException {
/*  27 */     try(MemoryStack ☃ = MemoryStack.stackPush(); 
/*  28 */         a ☃ = a(inputStream); 
/*  29 */         STBIReadCallback ☃ = STBIReadCallback.create(a::a); 
/*  30 */         STBISkipCallback ☃ = STBISkipCallback.create(a::a); 
/*  31 */         STBIEOFCallback ☃ = STBIEOFCallback.create(a::a)) {
/*     */       
/*  33 */       STBIIOCallbacks sTBIIOCallbacks = STBIIOCallbacks.mallocStack(memoryStack);
/*  34 */       sTBIIOCallbacks.read((STBIReadCallbackI)sTBIReadCallback);
/*  35 */       sTBIIOCallbacks.skip((STBISkipCallbackI)sTBISkipCallback);
/*  36 */       sTBIIOCallbacks.eof((STBIEOFCallbackI)sTBIEOFCallback);
/*  37 */       IntBuffer intBuffer1 = memoryStack.mallocInt(1);
/*  38 */       IntBuffer intBuffer2 = memoryStack.mallocInt(1);
/*  39 */       IntBuffer intBuffer3 = memoryStack.mallocInt(1);
/*  40 */       if (!STBImage.stbi_info_from_callbacks(sTBIIOCallbacks, 0L, intBuffer1, intBuffer2, intBuffer3)) {
/*  41 */         throw new IOException("Could not read info from the PNG file " + ☃ + " " + STBImage.stbi_failure_reason());
/*     */       }
/*  43 */       this.a = intBuffer1.get(0);
/*  44 */       this.b = intBuffer2.get(0);
/*     */     } 
/*     */   }
/*     */   static abstract class a implements AutoCloseable { protected boolean a;
/*     */     
/*     */     private a() {}
/*     */     
/*     */     int a(long ☃, long l1, int i) {
/*     */       try {
/*  53 */         return b(l1, i);
/*  54 */       } catch (IOException iOException) {
/*  55 */         this.a = true;
/*  56 */         return 0;
/*     */       } 
/*     */     }
/*     */     
/*     */     void a(long ☃, int i) {
/*     */       try {
/*  62 */         a(i);
/*  63 */       } catch (IOException iOException) {
/*  64 */         this.a = true;
/*     */       } 
/*     */     }
/*     */     
/*     */     int a(long ☃) {
/*  69 */       return this.a ? 1 : 0;
/*     */     }
/*     */     
/*     */     protected abstract int b(long param1Long, int param1Int) throws IOException;
/*     */     
/*     */     protected abstract void a(int param1Int) throws IOException;
/*     */     
/*     */     public abstract void close() throws IOException; }
/*     */ 
/*     */   
/*     */   static class c
/*     */     extends a {
/*     */     private final SeekableByteChannel b;
/*     */     
/*     */     private c(SeekableByteChannel ☃) {
/*  84 */       this.b = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public int b(long ☃, int i) throws IOException {
/*  89 */       ByteBuffer byteBuffer = MemoryUtil.memByteBuffer(☃, i);
/*  90 */       return this.b.read(byteBuffer);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(int ☃) throws IOException {
/*  95 */       this.b.position(this.b.position() + ☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public int a(long ☃) {
/* 100 */       return (super.a(☃) != 0 && this.b.isOpen()) ? 1 : 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public void close() throws IOException {
/* 105 */       this.b.close();
/*     */     }
/*     */   }
/*     */   
/*     */   static class b
/*     */     extends a
/*     */   {
/*     */     private final ReadableByteChannel b;
/* 113 */     private long c = MemoryUtil.nmemAlloc(128L);
/* 114 */     private int d = 128;
/*     */     private int e;
/*     */     private int f;
/*     */     
/*     */     private b(ReadableByteChannel ☃) {
/* 119 */       this.b = ☃;
/*     */     }
/*     */     
/*     */     private void b(int ☃) throws IOException {
/* 123 */       ByteBuffer byteBuffer = MemoryUtil.memByteBuffer(this.c, this.d);
/*     */       
/* 125 */       if (☃ + this.f > this.d) {
/* 126 */         this.d = ☃ + this.f;
/* 127 */         byteBuffer = MemoryUtil.memRealloc(byteBuffer, this.d);
/* 128 */         this.c = MemoryUtil.memAddress(byteBuffer);
/*     */       } 
/*     */       
/* 131 */       byteBuffer.position(this.e);
/* 132 */       while (☃ + this.f > this.e) {
/*     */         
/* 134 */         try { int i = this.b.read(byteBuffer);
/* 135 */           if (i == -1)
/*     */           
/*     */           { 
/*     */             
/* 139 */             this.e = byteBuffer.position(); break; }  } finally { this.e = byteBuffer.position(); }
/*     */       
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public int b(long ☃, int i) throws IOException {
/* 146 */       b(i);
/* 147 */       if (i + this.f > this.e) {
/* 148 */         i = this.e - this.f;
/*     */       }
/*     */ 
/*     */       
/* 152 */       MemoryUtil.memCopy(this.c + this.f, ☃, i);
/* 153 */       this.f += i;
/* 154 */       return i;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(int ☃) throws IOException {
/* 159 */       if (☃ > 0) {
/* 160 */         b(☃);
/* 161 */         if (☃ + this.f > this.e) {
/* 162 */           throw new EOFException("Can't skip past the EOF.");
/*     */         }
/*     */       } 
/* 165 */       if (this.f + ☃ < 0) {
/* 166 */         throw new IOException("Can't seek before the beginning: " + (this.f + ☃));
/*     */       }
/* 168 */       this.f += ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void close() throws IOException {
/* 173 */       MemoryUtil.nmemFree(this.c);
/* 174 */       this.b.close();
/*     */     }
/*     */   }
/*     */   
/*     */   private static a a(InputStream ☃) {
/* 179 */     if (☃ instanceof FileInputStream) {
/* 180 */       return new c(((FileInputStream)☃).getChannel());
/*     */     }
/* 182 */     return new b(Channels.newChannel(☃));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\deu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */