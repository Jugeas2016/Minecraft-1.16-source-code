/*    */ import io.netty.buffer.ByteBuf;
/*    */ import io.netty.channel.ChannelHandler.Sharable;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import io.netty.handler.codec.MessageToByteEncoder;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Sharable
/*    */ public class nm
/*    */   extends MessageToByteEncoder<ByteBuf>
/*    */ {
/*    */   protected void a(ChannelHandlerContext ☃, ByteBuf byteBuf1, ByteBuf byteBuf2) throws Exception {
/* 14 */     int i = byteBuf1.readableBytes();
/* 15 */     int j = nf.a(i);
/*    */     
/* 17 */     if (j > 3) {
/* 18 */       throw new IllegalArgumentException("unable to fit " + i + " into " + '\003');
/*    */     }
/*    */     
/* 21 */     nf nf = new nf(byteBuf2);
/*    */     
/* 23 */     nf.ensureWritable(j + i);
/*    */     
/* 25 */     nf.d(i);
/* 26 */     nf.writeBytes(byteBuf1, byteBuf1.readerIndex(), i);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\nm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */