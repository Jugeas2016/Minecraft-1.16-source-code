/*     */ import io.netty.channel.Channel;
/*     */ import io.netty.channel.ChannelException;
/*     */ import io.netty.channel.ChannelHandler;
/*     */ import io.netty.channel.ChannelInitializer;
/*     */ import io.netty.channel.ChannelOption;
/*     */ import io.netty.handler.timeout.ReadTimeoutHandler;
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
/*     */   extends ChannelInitializer<Channel>
/*     */ {
/*     */   null(aax ☃) {}
/*     */   
/*     */   protected void initChannel(Channel ☃) throws Exception {
/*     */     try {
/*  92 */       ☃.config().setOption(ChannelOption.TCP_NODELAY, Boolean.valueOf(true));
/*  93 */     } catch (ChannelException channelException) {}
/*     */ 
/*     */     
/*  96 */     ☃.pipeline()
/*  97 */       .addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(30))
/*  98 */       .addLast("legacy_query", (ChannelHandler)new aav(this.a))
/*     */       
/* 100 */       .addLast("splitter", (ChannelHandler)new nl())
/* 101 */       .addLast("decoder", (ChannelHandler)new ng(ok.a))
/*     */       
/* 103 */       .addLast("prepender", (ChannelHandler)new nm())
/* 104 */       .addLast("encoder", (ChannelHandler)new nh(ok.b));
/*     */     
/* 106 */     int i = aax.a(this.a).k();
/* 107 */     nd nd = (i > 0) ? new nj(i) : new nd(ok.a);
/* 108 */     aax.b(this.a).add(nd);
/* 109 */     ☃.pipeline().addLast("packet_handler", (ChannelHandler)nd);
/* 110 */     nd.a(new aaz(aax.a(this.a), nd));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aax$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */