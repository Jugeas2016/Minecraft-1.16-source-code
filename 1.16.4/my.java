/*    */ import io.netty.buffer.ByteBuf;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import javax.crypto.Cipher;
/*    */ import javax.crypto.ShortBufferException;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class my
/*    */ {
/*    */   private final Cipher a;
/* 11 */   private byte[] b = new byte[0];
/* 12 */   private byte[] c = new byte[0];
/*    */   
/*    */   protected my(Cipher ☃) {
/* 15 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   private byte[] a(ByteBuf ☃) {
/* 19 */     int i = ☃.readableBytes();
/* 20 */     if (this.b.length < i) {
/* 21 */       this.b = new byte[i];
/*    */     }
/* 23 */     ☃.readBytes(this.b, 0, i);
/* 24 */     return this.b;
/*    */   }
/*    */   
/*    */   protected ByteBuf a(ChannelHandlerContext ☃, ByteBuf byteBuf) throws ShortBufferException {
/* 28 */     int i = byteBuf.readableBytes();
/* 29 */     byte[] arrayOfByte = a(byteBuf);
/*    */     
/* 31 */     ByteBuf byteBuf1 = ☃.alloc().heapBuffer(this.a.getOutputSize(i));
/* 32 */     byteBuf1.writerIndex(this.a.update(arrayOfByte, 0, i, byteBuf1.array(), byteBuf1.arrayOffset()));
/*    */     
/* 34 */     return byteBuf1;
/*    */   }
/*    */   
/*    */   protected void a(ByteBuf ☃, ByteBuf byteBuf1) throws ShortBufferException {
/* 38 */     int i = ☃.readableBytes();
/* 39 */     byte[] arrayOfByte = a(☃);
/*    */     
/* 41 */     int j = this.a.getOutputSize(i);
/* 42 */     if (this.c.length < j) {
/* 43 */       this.c = new byte[j];
/*    */     }
/* 45 */     byteBuf1.writeBytes(this.c, 0, this.a.update(arrayOfByte, 0, i, this.c));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\my.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */