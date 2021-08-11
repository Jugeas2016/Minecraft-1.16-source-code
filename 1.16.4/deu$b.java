/*     */ import java.io.EOFException;
/*     */ import java.io.IOException;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.channels.ReadableByteChannel;
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
/*     */ class b
/*     */   extends deu.a
/*     */ {
/*     */   private final ReadableByteChannel b;
/* 113 */   private long c = MemoryUtil.nmemAlloc(128L);
/* 114 */   private int d = 128;
/*     */   private int e;
/*     */   private int f;
/*     */   
/*     */   private b(ReadableByteChannel ☃) {
/* 119 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   private void b(int ☃) throws IOException {
/* 123 */     ByteBuffer byteBuffer = MemoryUtil.memByteBuffer(this.c, this.d);
/*     */     
/* 125 */     if (☃ + this.f > this.d) {
/* 126 */       this.d = ☃ + this.f;
/* 127 */       byteBuffer = MemoryUtil.memRealloc(byteBuffer, this.d);
/* 128 */       this.c = MemoryUtil.memAddress(byteBuffer);
/*     */     } 
/*     */     
/* 131 */     byteBuffer.position(this.e);
/* 132 */     while (☃ + this.f > this.e) {
/*     */       
/* 134 */       try { int i = this.b.read(byteBuffer);
/* 135 */         if (i == -1)
/*     */         
/*     */         { 
/*     */           
/* 139 */           this.e = byteBuffer.position(); break; }  } finally { this.e = byteBuffer.position(); }
/*     */     
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(long ☃, int i) throws IOException {
/* 146 */     b(i);
/* 147 */     if (i + this.f > this.e) {
/* 148 */       i = this.e - this.f;
/*     */     }
/*     */ 
/*     */     
/* 152 */     MemoryUtil.memCopy(this.c + this.f, ☃, i);
/* 153 */     this.f += i;
/* 154 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃) throws IOException {
/* 159 */     if (☃ > 0) {
/* 160 */       b(☃);
/* 161 */       if (☃ + this.f > this.e) {
/* 162 */         throw new EOFException("Can't skip past the EOF.");
/*     */       }
/*     */     } 
/* 165 */     if (this.f + ☃ < 0) {
/* 166 */       throw new IOException("Can't seek before the beginning: " + (this.f + ☃));
/*     */     }
/* 168 */     this.f += ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() throws IOException {
/* 173 */     MemoryUtil.nmemFree(this.c);
/* 174 */     this.b.close();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\deu$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */