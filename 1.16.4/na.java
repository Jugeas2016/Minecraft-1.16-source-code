/*    */ import io.netty.buffer.ByteBuf;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import io.netty.handler.codec.MessageToByteEncoder;
/*    */ import javax.crypto.Cipher;
/*    */ 
/*    */ 
/*    */ public class na
/*    */   extends MessageToByteEncoder<ByteBuf>
/*    */ {
/*    */   private final my a;
/*    */   
/*    */   public na(Cipher ☃) {
/* 13 */     this.a = new my(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(ChannelHandlerContext ☃, ByteBuf byteBuf1, ByteBuf byteBuf2) throws Exception {
/* 18 */     this.a.a(byteBuf1, byteBuf2);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\na.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */