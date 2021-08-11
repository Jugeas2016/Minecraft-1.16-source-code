/*     */ import com.google.common.collect.Iterables;
/*     */ import io.netty.buffer.ByteBuf;
/*     */ import io.netty.buffer.Unpooled;
/*     */ import io.netty.channel.ChannelFutureListener;
/*     */ import io.netty.channel.ChannelHandlerContext;
/*     */ import io.netty.channel.SimpleChannelInboundHandler;
/*     */ import io.netty.util.concurrent.GenericFutureListener;
/*     */ import java.nio.charset.StandardCharsets;
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
/*     */ class null
/*     */   extends SimpleChannelInboundHandler<ByteBuf>
/*     */ {
/*     */   public void channelActive(ChannelHandlerContext ☃) throws Exception {
/* 178 */     super.channelActive(☃);
/* 179 */     ByteBuf byteBuf = Unpooled.buffer();
/*     */     try {
/* 181 */       byteBuf.writeByte(254);
/* 182 */       byteBuf.writeByte(1);
/* 183 */       byteBuf.writeByte(250);
/*     */       
/* 185 */       char[] arrayOfChar = "MC|PingHost".toCharArray();
/* 186 */       byteBuf.writeShort(arrayOfChar.length);
/* 187 */       for (char c : arrayOfChar) {
/* 188 */         byteBuf.writeChar(c);
/*     */       }
/* 190 */       byteBuf.writeShort(7 + 2 * this.a.a.a().length());
/* 191 */       byteBuf.writeByte(127);
/* 192 */       arrayOfChar = this.a.a.a().toCharArray();
/* 193 */       byteBuf.writeShort(arrayOfChar.length);
/* 194 */       for (char c : arrayOfChar) {
/* 195 */         byteBuf.writeChar(c);
/*     */       }
/* 197 */       byteBuf.writeInt(this.a.a.b());
/*     */       
/* 199 */       ☃.channel().writeAndFlush(byteBuf).addListener((GenericFutureListener)ChannelFutureListener.CLOSE_ON_FAILURE);
/*     */     } finally {
/* 201 */       byteBuf.release();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ChannelHandlerContext ☃, ByteBuf byteBuf) throws Exception {
/* 207 */     short s = byteBuf.readUnsignedByte();
/*     */     
/* 209 */     if (s == 255) {
/* 210 */       String str = new String(byteBuf.readBytes(byteBuf.readShort() * 2).array(), StandardCharsets.UTF_16BE);
/* 211 */       String[] arrayOfString = (String[])Iterables.toArray(dxb.d().split(str), String.class);
/*     */       
/* 213 */       if ("§1".equals(arrayOfString[0])) {
/* 214 */         int i = afm.a(arrayOfString[1], 0);
/* 215 */         String str1 = arrayOfString[2];
/* 216 */         String str2 = arrayOfString[3];
/* 217 */         int j = afm.a(arrayOfString[4], -1);
/* 218 */         int k = afm.a(arrayOfString[5], -1);
/*     */         
/* 220 */         this.a.b.f = -1;
/* 221 */         this.a.b.g = new oe(str1);
/* 222 */         this.a.b.d = new oe(str2);
/* 223 */         this.a.b.c = dxb.a(j, k);
/*     */       } 
/*     */     } 
/*     */     
/* 227 */     ☃.close();
/*     */   }
/*     */ 
/*     */   
/*     */   public void exceptionCaught(ChannelHandlerContext ☃, Throwable throwable) throws Exception {
/* 232 */     ☃.close();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dxb$2$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */