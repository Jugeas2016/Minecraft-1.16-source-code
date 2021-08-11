/*    */ import io.netty.buffer.ByteBuf;
/*    */ import io.netty.buffer.Unpooled;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import io.netty.handler.codec.ByteToMessageDecoder;
/*    */ import io.netty.handler.codec.DecoderException;
/*    */ import java.util.List;
/*    */ import java.util.zip.Inflater;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class nb
/*    */   extends ByteToMessageDecoder
/*    */ {
/*    */   private final Inflater a;
/*    */   private int b;
/*    */   
/*    */   public nb(int ☃) {
/* 19 */     this.b = ☃;
/* 20 */     this.a = new Inflater();
/*    */   }
/*    */ 
/*    */   
/*    */   protected void decode(ChannelHandlerContext ☃, ByteBuf byteBuf, List<Object> list) throws Exception {
/* 25 */     if (byteBuf.readableBytes() == 0) {
/*    */       return;
/*    */     }
/*    */     
/* 29 */     nf nf = new nf(byteBuf);
/* 30 */     int i = nf.i();
/*    */     
/* 32 */     if (i == 0)
/* 33 */     { list.add(nf.readBytes(nf.readableBytes())); }
/* 34 */     else { if (i < this.b)
/* 35 */         throw new DecoderException("Badly compressed packet - size of " + i + " is below server threshold of " + this.b); 
/* 36 */       if (i > 2097152) {
/* 37 */         throw new DecoderException("Badly compressed packet - size of " + i + " is larger than protocol maximum of " + 2097152);
/*    */       }
/* 39 */       byte[] arrayOfByte1 = new byte[nf.readableBytes()];
/* 40 */       nf.readBytes(arrayOfByte1);
/* 41 */       this.a.setInput(arrayOfByte1);
/*    */       
/* 43 */       byte[] arrayOfByte2 = new byte[i];
/* 44 */       this.a.inflate(arrayOfByte2);
/* 45 */       list.add(Unpooled.wrappedBuffer(arrayOfByte2));
/*    */       
/* 47 */       this.a.reset(); }
/*    */   
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(int ☃) {
/* 56 */     this.b = ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\nb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */