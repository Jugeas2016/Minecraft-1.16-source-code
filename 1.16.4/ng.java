/*    */ import io.netty.buffer.ByteBuf;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import io.netty.handler.codec.ByteToMessageDecoder;
/*    */ import java.io.IOException;
/*    */ import java.util.List;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ import org.apache.logging.log4j.Marker;
/*    */ import org.apache.logging.log4j.MarkerManager;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ng
/*    */   extends ByteToMessageDecoder
/*    */ {
/* 17 */   private static final Logger a = LogManager.getLogger();
/* 18 */   private static final Marker b = MarkerManager.getMarker("PACKET_RECEIVED", nd.b);
/*    */   
/*    */   private final ok c;
/*    */   
/*    */   public ng(ok ☃) {
/* 23 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void decode(ChannelHandlerContext ☃, ByteBuf byteBuf, List<Object> list) throws Exception {
/* 28 */     if (byteBuf.readableBytes() == 0) {
/*    */       return;
/*    */     }
/*    */     
/* 32 */     nf nf = new nf(byteBuf);
/* 33 */     int i = nf.i();
/* 34 */     oj<?> oj = ((ne)☃.channel().attr(nd.c).get()).a(this.c, i);
/*    */     
/* 36 */     if (oj == null) {
/* 37 */       throw new IOException("Bad packet id " + i);
/*    */     }
/*    */     
/* 40 */     oj.a(nf);
/* 41 */     if (nf.readableBytes() > 0) {
/* 42 */       throw new IOException("Packet " + ((ne)☃.channel().attr(nd.c).get()).a() + "/" + i + " (" + oj.getClass().getSimpleName() + ") was larger than I expected, found " + nf.readableBytes() + " bytes extra whilst reading packet " + i);
/*    */     }
/* 44 */     list.add(oj);
/*    */ 
/*    */     
/* 47 */     if (a.isDebugEnabled())
/* 48 */       a.debug(b, " IN: [{}:{}] {}", ☃.channel().attr(nd.c).get(), Integer.valueOf(i), oj.getClass().getName()); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ng.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */