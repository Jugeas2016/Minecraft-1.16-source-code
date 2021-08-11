/*     */ import com.google.common.collect.Lists;
/*     */ import java.io.IOException;
/*     */ import java.net.InetAddress;
/*     */ import java.net.ServerSocket;
/*     */ import java.net.Socket;
/*     */ import java.net.SocketTimeoutException;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class adl
/*     */   extends adi
/*     */ {
/*  18 */   private static final Logger d = LogManager.getLogger();
/*     */   
/*     */   private final ServerSocket e;
/*     */   private final String f;
/*  22 */   private final List<adk> g = Lists.newArrayList();
/*     */   private final vy h;
/*     */   
/*     */   private adl(vy ☃, ServerSocket serverSocket, String str) {
/*  26 */     super("RCON Listener");
/*  27 */     this.h = ☃;
/*  28 */     this.e = serverSocket;
/*  29 */     this.f = str;
/*     */   }
/*     */   
/*     */   private void d() {
/*  33 */     this.g.removeIf(☃ -> !☃.c());
/*     */   }
/*     */ 
/*     */   
/*     */   public void run() {
/*     */     try {
/*  39 */       while (this.a) {
/*     */         
/*     */         try {
/*  42 */           Socket ☃ = this.e.accept();
/*  43 */           adk adk = new adk(this.h, this.f, ☃);
/*  44 */           adk.a();
/*  45 */           this.g.add(adk);
/*     */ 
/*     */           
/*  48 */           d();
/*  49 */         } catch (SocketTimeoutException ☃) {
/*     */           
/*  51 */           d();
/*  52 */         } catch (IOException ☃) {
/*  53 */           if (this.a) {
/*  54 */             d.info("IO exception: ", ☃);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } finally {
/*  59 */       a(this.e);
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static adl a(vy ☃) {
/*  65 */     zh zh = ☃.g_();
/*     */     
/*  67 */     String str1 = ☃.h_();
/*  68 */     if (str1.isEmpty()) {
/*  69 */       str1 = "0.0.0.0";
/*     */     }
/*     */     
/*  72 */     int i = zh.u;
/*  73 */     if (0 >= i || 65535 < i) {
/*  74 */       d.warn("Invalid rcon port {} found in server.properties, rcon disabled!", Integer.valueOf(i));
/*  75 */       return null;
/*     */     } 
/*     */     
/*  78 */     String str2 = zh.v;
/*  79 */     if (str2.isEmpty()) {
/*  80 */       d.warn("No rcon password set in server.properties, rcon disabled!");
/*  81 */       return null;
/*     */     } 
/*     */     
/*     */     try {
/*  85 */       ServerSocket serverSocket = new ServerSocket(i, 0, InetAddress.getByName(str1));
/*  86 */       serverSocket.setSoTimeout(500);
/*     */       
/*  88 */       adl adl1 = new adl(☃, serverSocket, str2);
/*  89 */       if (!adl1.a()) {
/*  90 */         return null;
/*     */       }
/*  92 */       d.info("RCON running on {}:{}", str1, Integer.valueOf(i));
/*  93 */       return adl1;
/*  94 */     } catch (IOException iOException) {
/*  95 */       d.warn("Unable to initialise RCON on {}:{}", str1, Integer.valueOf(i), iOException);
/*     */ 
/*     */       
/*  98 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b() {
/* 103 */     this.a = false;
/* 104 */     a(this.e);
/* 105 */     super.b();
/*     */     
/* 107 */     for (adk ☃ : this.g) {
/* 108 */       if (☃.c()) {
/* 109 */         ☃.b();
/*     */       }
/*     */     } 
/* 112 */     this.g.clear();
/*     */   }
/*     */   
/*     */   private void a(ServerSocket ☃) {
/* 116 */     d.debug("closeSocket: {}", ☃);
/*     */     
/*     */     try {
/* 119 */       ☃.close();
/* 120 */     } catch (IOException iOException) {
/* 121 */       d.warn("Failed to close socket", iOException);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\adl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */