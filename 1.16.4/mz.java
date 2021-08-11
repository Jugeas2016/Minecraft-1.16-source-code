/*    */ import io.netty.buffer.ByteBuf;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import io.netty.handler.codec.MessageToMessageDecoder;
/*    */ import java.util.List;
/*    */ import javax.crypto.Cipher;
/*    */ 
/*    */ 
/*    */ public class mz
/*    */   extends MessageToMessageDecoder<ByteBuf>
/*    */ {
/*    */   private final my a;
/*    */   
/*    */   public mz(Cipher ☃) {
/* 14 */     this.a = new my(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(ChannelHandlerContext ☃, ByteBuf byteBuf, List<Object> list) throws Exception {
/* 19 */     list.add(this.a.a(☃, byteBuf));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\mz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */