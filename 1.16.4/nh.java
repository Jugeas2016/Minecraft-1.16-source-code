/*    */ import io.netty.buffer.ByteBuf;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import io.netty.handler.codec.MessageToByteEncoder;
/*    */ import java.io.IOException;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ import org.apache.logging.log4j.Marker;
/*    */ import org.apache.logging.log4j.MarkerManager;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class nh
/*    */   extends MessageToByteEncoder<oj<?>>
/*    */ {
/* 16 */   private static final Logger a = LogManager.getLogger();
/* 17 */   private static final Marker b = MarkerManager.getMarker("PACKET_SENT", nd.b);
/*    */   
/*    */   private final ok c;
/*    */   
/*    */   public nh(ok ☃) {
/* 22 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(ChannelHandlerContext ☃, oj<?> oj1, ByteBuf byteBuf) throws Exception {
/* 27 */     ne ne = (ne)☃.channel().attr(nd.c).get();
/* 28 */     if (ne == null) {
/* 29 */       throw new RuntimeException("ConnectionProtocol unknown: " + oj1);
/*    */     }
/* 31 */     Integer integer = ne.a(this.c, oj1);
/*    */ 
/*    */     
/* 34 */     if (a.isDebugEnabled()) {
/* 35 */       a.debug(b, "OUT: [{}:{}] {}", ☃.channel().attr(nd.c).get(), integer, oj1.getClass().getName());
/*    */     }
/*    */     
/* 38 */     if (integer == null) {
/* 39 */       throw new IOException("Can't serialize unregistered packet");
/*    */     }
/*    */     
/* 42 */     nf nf = new nf(byteBuf);
/* 43 */     nf.d(integer.intValue());
/*    */     
/*    */     try {
/* 46 */       oj1.b(nf);
/* 47 */     } catch (Throwable throwable) {
/* 48 */       a.error(throwable);
/* 49 */       if (oj1.a()) {
/* 50 */         throw new nk(throwable);
/*    */       }
/* 52 */       throw throwable;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\nh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */