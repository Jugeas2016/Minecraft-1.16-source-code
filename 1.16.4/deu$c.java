/*     */ import java.io.IOException;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.channels.SeekableByteChannel;
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
/*     */ class c
/*     */   extends deu.a
/*     */ {
/*     */   private final SeekableByteChannel b;
/*     */   
/*     */   private c(SeekableByteChannel ☃) {
/*  84 */     this.b = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(long ☃, int i) throws IOException {
/*  89 */     ByteBuffer byteBuffer = MemoryUtil.memByteBuffer(☃, i);
/*  90 */     return this.b.read(byteBuffer);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃) throws IOException {
/*  95 */     this.b.position(this.b.position() + ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(long ☃) {
/* 100 */     return (super.a(☃) != 0 && this.b.isOpen()) ? 1 : 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() throws IOException {
/* 105 */     this.b.close();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\deu$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */