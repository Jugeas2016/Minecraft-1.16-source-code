/*     */ import com.google.common.collect.Maps;
/*     */ import java.io.IOException;
/*     */ import java.net.DatagramPacket;
/*     */ import java.net.DatagramSocket;
/*     */ import java.net.InetAddress;
/*     */ import java.net.PortUnreachableException;
/*     */ import java.net.SocketAddress;
/*     */ import java.net.SocketTimeoutException;
/*     */ import java.net.UnknownHostException;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.Date;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class adj
/*     */   extends adi
/*     */ {
/*  26 */   private static final Logger d = LogManager.getLogger();
/*     */   
/*     */   private long e;
/*     */   
/*     */   private final int f;
/*     */   
/*     */   private final int g;
/*     */   
/*     */   private final int h;
/*     */   private final String i;
/*     */   private final String j;
/*     */   private DatagramSocket k;
/*  38 */   private final byte[] l = new byte[1460];
/*     */   private String m;
/*     */   private String n;
/*     */   private final Map<SocketAddress, a> o;
/*     */   private final ade p;
/*     */   private long q;
/*     */   private final vy r;
/*     */   
/*     */   private adj(vy ☃, int i) {
/*  47 */     super("Query Listener");
/*  48 */     this.r = ☃;
/*     */     
/*  50 */     this.f = i;
/*  51 */     this.n = ☃.h_();
/*  52 */     this.g = ☃.p();
/*  53 */     this.i = ☃.i_();
/*  54 */     this.h = ☃.J();
/*  55 */     this.j = ☃.k_();
/*     */ 
/*     */     
/*  58 */     this.q = 0L;
/*     */     
/*  60 */     this.m = "0.0.0.0";
/*     */ 
/*     */     
/*  63 */     if (this.n.isEmpty() || this.m.equals(this.n)) {
/*     */       
/*  65 */       this.n = "0.0.0.0";
/*     */       try {
/*  67 */         InetAddress inetAddress = InetAddress.getLocalHost();
/*  68 */         this.m = inetAddress.getHostAddress();
/*  69 */       } catch (UnknownHostException unknownHostException) {
/*  70 */         d.warn("Unable to determine local host IP, please set server-ip in server.properties", unknownHostException);
/*     */       } 
/*     */     } else {
/*  73 */       this.m = this.n;
/*     */     } 
/*     */ 
/*     */     
/*  77 */     this.p = new ade(1460);
/*  78 */     this.o = Maps.newHashMap();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static adj a(vy ☃) {
/*  83 */     int i = (☃.g_()).s;
/*  84 */     if (0 >= i || 65535 < i) {
/*  85 */       d.warn("Invalid query port {} found in server.properties (queries disabled)", Integer.valueOf(i));
/*  86 */       return null;
/*     */     } 
/*     */     
/*  89 */     adj adj1 = new adj(☃, i);
/*  90 */     if (!adj1.a()) {
/*  91 */       return null;
/*     */     }
/*  93 */     return adj1;
/*     */   }
/*     */   
/*     */   private void a(byte[] ☃, DatagramPacket datagramPacket) throws IOException {
/*  97 */     this.k.send(new DatagramPacket(☃, ☃.length, datagramPacket.getSocketAddress()));
/*     */   }
/*     */   private boolean a(DatagramPacket ☃) throws IOException {
/*     */     ade ade1;
/* 101 */     byte[] arrayOfByte = ☃.getData();
/* 102 */     int i = ☃.getLength();
/* 103 */     SocketAddress socketAddress = ☃.getSocketAddress();
/* 104 */     d.debug("Packet len {} [{}]", Integer.valueOf(i), socketAddress);
/* 105 */     if (3 > i || -2 != arrayOfByte[0] || -3 != arrayOfByte[1]) {
/*     */       
/* 107 */       d.debug("Invalid packet [{}]", socketAddress);
/* 108 */       return false;
/*     */     } 
/*     */ 
/*     */     
/* 112 */     d.debug("Packet '{}' [{}]", adf.a(arrayOfByte[2]), socketAddress);
/* 113 */     switch (arrayOfByte[2]) {
/*     */       
/*     */       case 9:
/* 116 */         d(☃);
/* 117 */         d.debug("Challenge [{}]", socketAddress);
/* 118 */         return true;
/*     */ 
/*     */       
/*     */       case 0:
/* 122 */         if (!c(☃).booleanValue()) {
/* 123 */           d.debug("Invalid challenge [{}]", socketAddress);
/* 124 */           return false;
/*     */         } 
/*     */         
/* 127 */         if (15 == i) {
/*     */           
/* 129 */           a(b(☃), ☃);
/* 130 */           d.debug("Rules [{}]", socketAddress);
/*     */           break;
/*     */         } 
/* 133 */         ade1 = new ade(1460);
/* 134 */         ade1.a(0);
/* 135 */         ade1.a(a(☃.getSocketAddress()));
/* 136 */         ade1.a(this.i);
/* 137 */         ade1.a("SMP");
/* 138 */         ade1.a(this.j);
/* 139 */         ade1.a(Integer.toString(this.r.I()));
/* 140 */         ade1.a(Integer.toString(this.h));
/* 141 */         ade1.a((short)this.g);
/* 142 */         ade1.a(this.m);
/*     */         
/* 144 */         a(ade1.a(), ☃);
/* 145 */         d.debug("Status [{}]", socketAddress);
/*     */         break;
/*     */     } 
/*     */     
/* 149 */     return true;
/*     */   }
/*     */   
/*     */   private byte[] b(DatagramPacket ☃) throws IOException {
/* 153 */     long l = x.b();
/* 154 */     if (l < this.q + 5000L) {
/*     */       
/* 156 */       byte[] arrayOfByte1 = this.p.a();
/* 157 */       byte[] arrayOfByte2 = a(☃.getSocketAddress());
/* 158 */       arrayOfByte1[1] = arrayOfByte2[0];
/* 159 */       arrayOfByte1[2] = arrayOfByte2[1];
/* 160 */       arrayOfByte1[3] = arrayOfByte2[2];
/* 161 */       arrayOfByte1[4] = arrayOfByte2[3];
/*     */       
/* 163 */       return arrayOfByte1;
/*     */     } 
/*     */     
/* 166 */     this.q = l;
/*     */     
/* 168 */     this.p.b();
/* 169 */     this.p.a(0);
/* 170 */     this.p.a(a(☃.getSocketAddress()));
/* 171 */     this.p.a("splitnum");
/* 172 */     this.p.a(128);
/* 173 */     this.p.a(0);
/*     */ 
/*     */     
/* 176 */     this.p.a("hostname");
/* 177 */     this.p.a(this.i);
/* 178 */     this.p.a("gametype");
/* 179 */     this.p.a("SMP");
/* 180 */     this.p.a("game_id");
/* 181 */     this.p.a("MINECRAFT");
/* 182 */     this.p.a("version");
/* 183 */     this.p.a(this.r.H());
/* 184 */     this.p.a("plugins");
/* 185 */     this.p.a(this.r.j_());
/* 186 */     this.p.a("map");
/* 187 */     this.p.a(this.j);
/* 188 */     this.p.a("numplayers");
/* 189 */     this.p.a("" + this.r.I());
/* 190 */     this.p.a("maxplayers");
/* 191 */     this.p.a("" + this.h);
/* 192 */     this.p.a("hostport");
/* 193 */     this.p.a("" + this.g);
/* 194 */     this.p.a("hostip");
/* 195 */     this.p.a(this.m);
/* 196 */     this.p.a(0);
/* 197 */     this.p.a(1);
/*     */ 
/*     */ 
/*     */     
/* 201 */     this.p.a("player_");
/* 202 */     this.p.a(0);
/*     */     
/* 204 */     String[] arrayOfString = this.r.K();
/* 205 */     for (String str : arrayOfString) {
/* 206 */       this.p.a(str);
/*     */     }
/* 208 */     this.p.a(0);
/*     */     
/* 210 */     return this.p.a();
/*     */   }
/*     */   
/*     */   private byte[] a(SocketAddress ☃) {
/* 214 */     return ((a)this.o.get(☃)).c();
/*     */   }
/*     */   
/*     */   private Boolean c(DatagramPacket ☃) {
/* 218 */     SocketAddress socketAddress = ☃.getSocketAddress();
/* 219 */     if (!this.o.containsKey(socketAddress))
/*     */     {
/* 221 */       return Boolean.valueOf(false);
/*     */     }
/*     */     
/* 224 */     byte[] arrayOfByte = ☃.getData();
/* 225 */     return Boolean.valueOf((((a)this.o.get(socketAddress)).a() == adf.c(arrayOfByte, 7, ☃.getLength())));
/*     */   }
/*     */   
/*     */   private void d(DatagramPacket ☃) throws IOException {
/* 229 */     a a = new a(☃);
/* 230 */     this.o.put(☃.getSocketAddress(), a);
/*     */     
/* 232 */     a(a.b(), ☃);
/*     */   }
/*     */   
/*     */   private void d() {
/* 236 */     if (!this.a) {
/*     */       return;
/*     */     }
/*     */     
/* 240 */     long ☃ = x.b();
/* 241 */     if (☃ < this.e + 30000L) {
/*     */       return;
/*     */     }
/* 244 */     this.e = ☃;
/*     */     
/* 246 */     this.o.values().removeIf(a1 -> a1.a(☃).booleanValue());
/*     */   }
/*     */ 
/*     */   
/*     */   public void run() {
/* 251 */     d.info("Query running on {}:{}", this.n, Integer.valueOf(this.f));
/* 252 */     this.e = x.b();
/* 253 */     DatagramPacket ☃ = new DatagramPacket(this.l, this.l.length);
/*     */     
/*     */     try {
/* 256 */       while (this.a) {
/*     */         try {
/* 258 */           this.k.receive(☃);
/*     */ 
/*     */           
/* 261 */           d();
/*     */ 
/*     */           
/* 264 */           a(☃);
/* 265 */         } catch (SocketTimeoutException socketTimeoutException) {
/*     */           
/* 267 */           d();
/* 268 */         } catch (PortUnreachableException portUnreachableException) {
/*     */         
/* 270 */         } catch (IOException iOException) {
/*     */           
/* 272 */           a(iOException);
/*     */         } 
/*     */       } 
/*     */     } finally {
/* 276 */       d.debug("closeSocket: {}:{}", this.n, Integer.valueOf(this.f));
/* 277 */       this.k.close();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/* 283 */     if (this.a) {
/* 284 */       return true;
/*     */     }
/*     */     
/* 287 */     if (!e()) {
/* 288 */       return false;
/*     */     }
/*     */     
/* 291 */     return super.a();
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(Exception ☃) {
/* 296 */     if (!this.a) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 301 */     d.warn("Unexpected exception", ☃);
/*     */ 
/*     */     
/* 304 */     if (!e()) {
/* 305 */       d.error("Failed to recover from exception, shutting down!");
/* 306 */       this.a = false;
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean e() {
/*     */     try {
/* 312 */       this.k = new DatagramSocket(this.f, InetAddress.getByName(this.n));
/* 313 */       this.k.setSoTimeout(500);
/* 314 */       return true;
/* 315 */     } catch (Exception ☃) {
/* 316 */       d.warn("Unable to initialise query system on {}:{}", this.n, Integer.valueOf(this.f), ☃);
/*     */       
/* 318 */       return false;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static class a
/*     */   {
/* 329 */     private final long a = (new Date()).getTime(); private final int b; private final byte[] c; public a(DatagramPacket ☃) {
/* 330 */       byte[] arrayOfByte = ☃.getData();
/* 331 */       this.c = new byte[4];
/* 332 */       this.c[0] = arrayOfByte[3];
/* 333 */       this.c[1] = arrayOfByte[4];
/* 334 */       this.c[2] = arrayOfByte[5];
/* 335 */       this.c[3] = arrayOfByte[6];
/* 336 */       this.e = new String(this.c, StandardCharsets.UTF_8);
/* 337 */       this.b = (new Random()).nextInt(16777216);
/* 338 */       this.d = String.format("\t%s%d\000", new Object[] { this.e, Integer.valueOf(this.b) }).getBytes(StandardCharsets.UTF_8);
/*     */     }
/*     */     private final byte[] d; private final String e;
/*     */     public Boolean a(long ☃) {
/* 342 */       return Boolean.valueOf((this.a < ☃));
/*     */     }
/*     */     
/*     */     public int a() {
/* 346 */       return this.b;
/*     */     }
/*     */     
/*     */     public byte[] b() {
/* 350 */       return this.d;
/*     */     }
/*     */     
/*     */     public byte[] c() {
/* 354 */       return this.c;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\adj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */