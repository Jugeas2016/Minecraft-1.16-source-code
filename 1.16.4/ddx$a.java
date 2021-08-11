/*    */ import com.google.common.collect.Lists;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.util.List;
/*    */ import org.lwjgl.BufferUtils;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class a
/*    */ {
/* 26 */   private final List<ByteBuffer> a = Lists.newArrayList();
/*    */   
/*    */   private final int b;
/*    */   private int c;
/*    */   private ByteBuffer d;
/*    */   
/*    */   public a(int ☃) {
/* 33 */     this.b = ☃ + 1 & 0xFFFFFFFE;
/* 34 */     b();
/*    */   }
/*    */   
/*    */   private void b() {
/* 38 */     this.d = BufferUtils.createByteBuffer(this.b);
/*    */   }
/*    */   
/*    */   public void a(float ☃) {
/* 42 */     if (this.d.remaining() == 0) {
/* 43 */       this.d.flip();
/* 44 */       this.a.add(this.d);
/* 45 */       b();
/*    */     } 
/*    */     
/* 48 */     int i = afm.a((int)(☃ * 32767.5F - 0.5F), -32768, 32767);
/* 49 */     this.d.putShort((short)i);
/* 50 */     this.c += 2;
/*    */   }
/*    */   
/*    */   public ByteBuffer a() {
/* 54 */     this.d.flip();
/*    */     
/* 56 */     if (this.a.isEmpty()) {
/* 57 */       return this.d;
/*    */     }
/*    */     
/* 60 */     ByteBuffer ☃ = BufferUtils.createByteBuffer(this.c);
/* 61 */     this.a.forEach(☃::put);
/* 62 */     ☃.put(this.d);
/* 63 */     ☃.flip();
/* 64 */     return ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ddx$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */