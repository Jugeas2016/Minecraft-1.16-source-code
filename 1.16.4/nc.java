/*    */ import io.netty.buffer.ByteBuf;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import io.netty.handler.codec.MessageToByteEncoder;
/*    */ import java.util.zip.Deflater;
/*    */ 
/*    */ 
/*    */ public class nc
/*    */   extends MessageToByteEncoder<ByteBuf>
/*    */ {
/* 10 */   private final byte[] a = new byte[8192];
/*    */   private final Deflater b;
/*    */   private int c;
/*    */   
/*    */   public nc(int ☃) {
/* 15 */     this.c = ☃;
/* 16 */     this.b = new Deflater();
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(ChannelHandlerContext ☃, ByteBuf byteBuf1, ByteBuf byteBuf2) throws Exception {
/* 21 */     int i = byteBuf1.readableBytes();
/* 22 */     nf nf = new nf(byteBuf2);
/*    */     
/* 24 */     if (i < this.c) {
/* 25 */       nf.d(0);
/* 26 */       nf.writeBytes(byteBuf1);
/*    */     } else {
/* 28 */       byte[] arrayOfByte = new byte[i];
/* 29 */       byteBuf1.readBytes(arrayOfByte);
/*    */       
/* 31 */       nf.d(arrayOfByte.length);
/*    */       
/* 33 */       this.b.setInput(arrayOfByte, 0, i);
/* 34 */       this.b.finish();
/* 35 */       while (!this.b.finished()) {
/* 36 */         int j = this.b.deflate(this.a);
/* 37 */         nf.writeBytes(this.a, 0, j);
/*    */       } 
/* 39 */       this.b.reset();
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(int ☃) {
/* 48 */     this.c = ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\nc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */