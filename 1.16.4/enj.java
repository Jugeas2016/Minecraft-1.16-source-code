/*     */ import java.io.IOException;
/*     */ import java.net.DatagramPacket;
/*     */ import java.net.DatagramSocket;
/*     */ import java.net.InetAddress;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.concurrent.atomic.AtomicInteger;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class enj
/*     */   extends Thread
/*     */ {
/*  15 */   private static final AtomicInteger a = new AtomicInteger(0);
/*  16 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*     */   private final String c;
/*     */   
/*     */   private final DatagramSocket d;
/*     */   
/*     */   private boolean e = true;
/*     */   
/*     */   private final String f;
/*     */ 
/*     */   
/*     */   public enj(String ☃, String str1) throws IOException {
/*  28 */     super("LanServerPinger #" + a.incrementAndGet());
/*  29 */     this.c = ☃;
/*  30 */     this.f = str1;
/*  31 */     setDaemon(true);
/*  32 */     setUncaughtExceptionHandler(new o(b));
/*     */     
/*  34 */     this.d = new DatagramSocket();
/*     */   }
/*     */ 
/*     */   
/*     */   public void run() {
/*  39 */     String ☃ = a(this.c, this.f);
/*  40 */     byte[] arrayOfByte = ☃.getBytes(StandardCharsets.UTF_8);
/*     */     
/*  42 */     while (!isInterrupted() && this.e) {
/*     */       try {
/*  44 */         InetAddress inetAddress = InetAddress.getByName("224.0.2.60");
/*     */         
/*  46 */         DatagramPacket datagramPacket = new DatagramPacket(arrayOfByte, arrayOfByte.length, inetAddress, 4445);
/*  47 */         this.d.send(datagramPacket);
/*  48 */       } catch (IOException iOException) {
/*  49 */         b.warn("LanServerPinger: {}", iOException.getMessage());
/*     */         
/*     */         break;
/*     */       } 
/*     */       try {
/*  54 */         sleep(1500L);
/*  55 */       } catch (InterruptedException interruptedException) {}
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void interrupt() {
/*  62 */     super.interrupt();
/*     */ 
/*     */     
/*  65 */     this.e = false;
/*     */   }
/*     */   
/*     */   public static String a(String ☃, String str1) {
/*  69 */     return "[MOTD]" + ☃ + "[/MOTD][AD]" + str1 + "[/AD]";
/*     */   }
/*     */   
/*     */   public static String a(String ☃) {
/*  73 */     int i = ☃.indexOf("[MOTD]");
/*  74 */     if (i < 0) {
/*  75 */       return "missing no";
/*     */     }
/*  77 */     int j = ☃.indexOf("[/MOTD]", i + "[MOTD]".length());
/*  78 */     if (j < i) {
/*  79 */       return "missing no";
/*     */     }
/*  81 */     return ☃.substring(i + "[MOTD]".length(), j);
/*     */   }
/*     */   
/*     */   public static String b(String ☃) {
/*  85 */     int i = ☃.indexOf("[/MOTD]");
/*  86 */     if (i < 0) {
/*  87 */       return null;
/*     */     }
/*     */     
/*  90 */     int j = ☃.indexOf("[/MOTD]", i + "[/MOTD]".length());
/*  91 */     if (j >= 0)
/*     */     {
/*  93 */       return null;
/*     */     }
/*     */     
/*  96 */     int k = ☃.indexOf("[AD]", i + "[/MOTD]".length());
/*  97 */     if (k < 0) {
/*  98 */       return null;
/*     */     }
/* 100 */     int m = ☃.indexOf("[/AD]", k + "[AD]".length());
/* 101 */     if (m < k) {
/* 102 */       return null;
/*     */     }
/* 104 */     return ☃.substring(k + "[AD]".length(), m);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\enj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */