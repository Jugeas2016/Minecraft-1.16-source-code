/*     */ import java.net.InetAddress;
/*     */ import java.net.UnknownHostException;
/*     */ import java.util.concurrent.atomic.AtomicInteger;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dnt
/*     */   extends dot
/*     */ {
/*  27 */   private static final AtomicInteger a = new AtomicInteger(0);
/*  28 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*     */   private nd c;
/*     */   
/*     */   private boolean p;
/*     */   private final dot q;
/*  34 */   private nr r = new of("connect.connecting");
/*  35 */   private long s = -1L;
/*     */   
/*     */   public dnt(dot ☃, djz djz1, dwz dwz1) {
/*  38 */     super(dkz.a);
/*  39 */     this.i = djz1;
/*  40 */     this.q = ☃;
/*  41 */     dwy dwy = dwy.a(dwz1.b);
/*     */     
/*  43 */     djz1.r();
/*  44 */     djz1.a(dwz1);
/*  45 */     a(dwy.a(), dwy.b());
/*     */   }
/*     */   
/*     */   public dnt(dot ☃, djz djz1, String str, int i) {
/*  49 */     super(dkz.a);
/*  50 */     this.i = djz1;
/*  51 */     this.q = ☃;
/*  52 */     djz1.r();
/*  53 */     a(str, i);
/*     */   }
/*     */   
/*     */   private void a(String ☃, int i) {
/*  57 */     b.info("Connecting to {}, {}", ☃, Integer.valueOf(i));
/*  58 */     Thread thread = new Thread(this, "Server Connector #" + a.incrementAndGet(), ☃, i)
/*     */       {
/*     */         public void run() {
/*  61 */           InetAddress ☃ = null;
/*     */           try {
/*  63 */             if (dnt.a(this.c)) {
/*     */               return;
/*     */             }
/*  66 */             ☃ = InetAddress.getByName(this.a);
/*  67 */             dnt.a(this.c, nd.a(☃, this.b, this.c.i.k.f()));
/*  68 */             dnt.b(this.c).a(new dws(dnt.b(this.c), this.c.i, dnt.c(this.c), nr1 -> dnt.a(☃, nr1)));
/*  69 */             dnt.b(this.c).a(new tv(this.a, this.b, ne.d));
/*  70 */             dnt.b(this.c).a(new ug(this.c.i.J().e()));
/*  71 */           } catch (UnknownHostException unknownHostException) {
/*  72 */             if (dnt.a(this.c)) {
/*     */               return;
/*     */             }
/*  75 */             dnt.g().error("Couldn't connect to server", unknownHostException);
/*  76 */             this.c.i.execute(() -> this.c.i.a(new doa(dnt.c(this.c), nq.i, new of("disconnect.genericReason", new Object[] { "Unknown host" }))));
/*  77 */           } catch (Exception exception) {
/*  78 */             if (dnt.a(this.c)) {
/*     */               return;
/*     */             }
/*  81 */             dnt.g().error("Couldn't connect to server", exception);
/*  82 */             String str = (☃ == null) ? exception.toString() : exception.toString().replaceAll(☃ + ":" + this.b, "");
/*  83 */             this.c.i.execute(() -> this.c.i.a(new doa(dnt.c(this.c), nq.i, new of("disconnect.genericReason", new Object[] { ☃ }))));
/*     */           } 
/*     */         }
/*     */       };
/*  87 */     thread.setUncaughtExceptionHandler(new o(b));
/*  88 */     thread.start();
/*     */   }
/*     */   
/*     */   private void a(nr ☃) {
/*  92 */     this.r = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  97 */     if (this.c != null) {
/*  98 */       if (this.c.h()) {
/*  99 */         this.c.a();
/*     */       } else {
/* 101 */         this.c.m();
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean as_() {
/* 108 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/* 113 */     a(new dlj(this.k / 2 - 100, this.l / 4 + 120 + 12, 200, 20, nq.d, ☃ -> {
/*     */             this.p = true;
/*     */             if (this.c != null) {
/*     */               this.c.a(new of("connect.aborted"));
/*     */             }
/*     */             this.i.a(this.q);
/*     */           }));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 124 */     a(☃);
/*     */     
/* 126 */     long l = x.b();
/* 127 */     if (l - this.s > 2000L) {
/* 128 */       this.s = l;
/*     */       
/* 130 */       dkz.b.a((new of("narrator.joining")).getString());
/*     */     } 
/*     */     
/* 133 */     a(☃, this.o, this.r, this.k / 2, this.l / 2 - 50, 16777215);
/*     */     
/* 135 */     super.a(☃, i, j, f);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dnt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */