/*     */ import java.io.IOException;
/*     */ import java.net.DatagramPacket;
/*     */ import java.net.InetAddress;
/*     */ import java.net.MulticastSocket;
/*     */ import java.net.SocketTimeoutException;
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
/*     */ public class a
/*     */   extends Thread
/*     */ {
/*     */   private final eni.b a;
/*     */   private final InetAddress b;
/*     */   private final MulticastSocket c;
/*     */   
/*     */   public a(eni.b ☃) throws IOException {
/*  70 */     super("LanServerDetector #" + eni.a().incrementAndGet());
/*  71 */     this.a = ☃;
/*  72 */     setDaemon(true);
/*  73 */     setUncaughtExceptionHandler(new o(eni.b()));
/*     */     
/*  75 */     this.c = new MulticastSocket(4445);
/*  76 */     this.b = InetAddress.getByName("224.0.2.60");
/*  77 */     this.c.setSoTimeout(5000);
/*  78 */     this.c.joinGroup(this.b);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void run() {
/*  84 */     byte[] ☃ = new byte[1024];
/*     */     
/*  86 */     while (!isInterrupted()) {
/*  87 */       DatagramPacket datagramPacket = new DatagramPacket(☃, ☃.length);
/*     */       try {
/*  89 */         this.c.receive(datagramPacket);
/*  90 */       } catch (SocketTimeoutException socketTimeoutException) {
/*     */         continue;
/*  92 */       } catch (IOException iOException) {
/*  93 */         eni.b().error("Couldn't ping server", iOException);
/*     */         
/*     */         break;
/*     */       } 
/*  97 */       String str = new String(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength(), StandardCharsets.UTF_8);
/*  98 */       eni.b().debug("{}: {}", datagramPacket.getAddress(), str);
/*  99 */       this.a.a(str, datagramPacket.getAddress());
/*     */     } 
/*     */     
/*     */     try {
/* 103 */       this.c.leaveGroup(this.b);
/* 104 */     } catch (IOException iOException) {}
/*     */     
/* 106 */     this.c.close();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eni$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */