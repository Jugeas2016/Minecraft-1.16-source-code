/*     */ import java.io.BufferedInputStream;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.net.Socket;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class adk
/*     */   extends adi
/*     */ {
/*  16 */   private static final Logger d = LogManager.getLogger();
/*     */ 
/*     */   
/*     */   private boolean e;
/*     */ 
/*     */   
/*     */   private final Socket f;
/*     */   
/*  24 */   private final byte[] g = new byte[1460];
/*     */   private final String h;
/*     */   private final vy i;
/*     */   
/*     */   adk(vy ☃, String str, Socket socket) {
/*  29 */     super("RCON Client " + socket.getInetAddress());
/*  30 */     this.i = ☃;
/*  31 */     this.f = socket;
/*     */     
/*     */     try {
/*  34 */       this.f.setSoTimeout(0);
/*  35 */     } catch (Exception exception) {
/*  36 */       this.a = false;
/*     */     } 
/*     */     
/*  39 */     this.h = str;
/*     */   }
/*     */ 
/*     */   
/*     */   public void run() {
/*     */     
/*  45 */     try { while (this.a) {
/*  46 */         String str; BufferedInputStream ☃ = new BufferedInputStream(this.f.getInputStream());
/*  47 */         int i = ☃.read(this.g, 0, 1460);
/*     */         
/*  49 */         if (10 > i) {
/*     */           return;
/*     */         }
/*     */         
/*  53 */         int j = 0;
/*  54 */         int k = adf.b(this.g, 0, i);
/*  55 */         if (k != i - 4) {
/*     */           return;
/*     */         }
/*     */         
/*  59 */         j += 4;
/*  60 */         int m = adf.b(this.g, j, i);
/*  61 */         j += 4;
/*     */         
/*  63 */         int n = adf.a(this.g, j);
/*  64 */         j += 4;
/*  65 */         switch (n) {
/*     */           case 3:
/*  67 */             str = adf.a(this.g, j, i);
/*  68 */             j += str.length();
/*  69 */             if (!str.isEmpty() && str.equals(this.h)) {
/*  70 */               this.e = true;
/*  71 */               a(m, 2, ""); continue;
/*     */             } 
/*  73 */             this.e = false;
/*  74 */             d();
/*     */             continue;
/*     */           
/*     */           case 2:
/*  78 */             if (this.e) {
/*  79 */               String str1 = adf.a(this.g, j, i);
/*     */               try {
/*  81 */                 a(m, this.i.a(str1));
/*  82 */               } catch (Exception exception) {
/*  83 */                 a(m, "Error executing: " + str1 + " (" + exception.getMessage() + ")");
/*     */               }  continue;
/*     */             } 
/*  86 */             d();
/*     */             continue;
/*     */         } 
/*     */         
/*  90 */         a(m, String.format("Unknown request %s", new Object[] { Integer.toHexString(n) }));
/*     */       }
/*     */        }
/*  93 */     catch (IOException iOException) {  }
/*  94 */     catch (Exception ☃)
/*  95 */     { d.error("Exception whilst parsing RCON input", ☃); }
/*     */     finally
/*  97 */     { e();
/*  98 */       d.info("Thread {} shutting down", this.b);
/*  99 */       this.a = false; }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(int ☃, int i, String str) throws IOException {
/* 106 */     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1248);
/* 107 */     DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
/* 108 */     byte[] arrayOfByte = str.getBytes(StandardCharsets.UTF_8);
/* 109 */     dataOutputStream.writeInt(Integer.reverseBytes(arrayOfByte.length + 10));
/* 110 */     dataOutputStream.writeInt(Integer.reverseBytes(☃));
/* 111 */     dataOutputStream.writeInt(Integer.reverseBytes(i));
/* 112 */     dataOutputStream.write(arrayOfByte);
/* 113 */     dataOutputStream.write(0);
/* 114 */     dataOutputStream.write(0);
/* 115 */     this.f.getOutputStream().write(byteArrayOutputStream.toByteArray());
/*     */   }
/*     */   
/*     */   private void d() throws IOException {
/* 119 */     a(-1, 2, "");
/*     */   }
/*     */   
/*     */   private void a(int ☃, String str) throws IOException {
/* 123 */     int i = str.length();
/*     */     
/*     */     do {
/* 126 */       int j = (4096 <= i) ? 4096 : i;
/* 127 */       a(☃, 0, str.substring(0, j));
/* 128 */       str = str.substring(j);
/* 129 */       i = str.length();
/* 130 */     } while (0 != i);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() {
/* 138 */     this.a = false;
/* 139 */     e();
/* 140 */     super.b();
/*     */   }
/*     */   
/*     */   private void e() {
/*     */     try {
/* 145 */       this.f.close();
/* 146 */     } catch (IOException ☃) {
/* 147 */       d.warn("Failed to close socket", ☃);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\adk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */