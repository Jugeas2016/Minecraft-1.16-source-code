/*     */ import java.net.InetAddress;
/*     */ import java.net.UnknownHostException;
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
/*     */ public class eol
/*     */ {
/*  21 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final dot b;
/*     */   private volatile boolean c;
/*     */   private nd d;
/*     */   
/*     */   public eol(dot ☃) {
/*  28 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public void a(dgq ☃, String str, int i) {
/*  32 */     djz djz = djz.C();
/*  33 */     djz.d(true);
/*  34 */     eoj.a(ekx.a("mco.connect.success", new Object[0]));
/*     */     
/*  36 */     (new Thread(this, "Realms-connect-task", str, i, djz, ☃)
/*     */       {
/*     */         public void run() {
/*  39 */           InetAddress ☃ = null;
/*     */           try {
/*  41 */             ☃ = InetAddress.getByName(this.a);
/*     */             
/*  43 */             if (eol.a(this.e)) {
/*     */               return;
/*     */             }
/*     */             
/*  47 */             eol.a(this.e, nd.a(☃, this.b, this.c.k.f()));
/*     */             
/*  49 */             if (eol.a(this.e)) {
/*     */               return;
/*     */             }
/*     */             
/*  53 */             eol.b(this.e).a(new dws(eol.b(this.e), this.c, eol.c(this.e), ☃ -> {
/*     */                   
/*  55 */                   })); if (eol.a(this.e)) {
/*     */               return;
/*     */             }
/*     */             
/*  59 */             eol.b(this.e).a(new tv(this.a, this.b, ne.d));
/*     */             
/*  61 */             if (eol.a(this.e)) {
/*     */               return;
/*     */             }
/*     */             
/*  65 */             eol.b(this.e).a(new ug(this.c.J().e()));
/*  66 */             this.c.a(this.d.d(this.a));
/*  67 */           } catch (UnknownHostException unknownHostException) {
/*  68 */             this.c.P().b();
/*     */             
/*  70 */             if (eol.a(this.e)) {
/*     */               return;
/*     */             }
/*     */             
/*  74 */             eol.c().error("Couldn't connect to world", unknownHostException);
/*  75 */             eoi eoi = new eoi(eol.c(this.e), nq.i, new of("disconnect.genericReason", new Object[] { "Unknown host '" + this.a + "'" }));
/*  76 */             this.c.execute(() -> ☃.a(eoi1));
/*  77 */           } catch (Exception exception) {
/*  78 */             this.c.P().b();
/*     */             
/*  80 */             if (eol.a(this.e)) {
/*     */               return;
/*     */             }
/*     */             
/*  84 */             eol.c().error("Couldn't connect to world", exception);
/*  85 */             String str = exception.toString();
/*     */             
/*  87 */             if (☃ != null) {
/*  88 */               String str1 = ☃ + ":" + this.b;
/*  89 */               str = str.replaceAll(str1, "");
/*     */             } 
/*     */             
/*  92 */             eoi eoi = new eoi(eol.c(this.e), nq.i, new of("disconnect.genericReason", new Object[] { str }));
/*  93 */             this.c.execute(() -> ☃.a(eoi1));
/*     */           } 
/*     */         }
/*  96 */       }).start();
/*     */   }
/*     */   
/*     */   public void a() {
/* 100 */     this.c = true;
/*     */     
/* 102 */     if (this.d != null && 
/* 103 */       this.d.h()) {
/* 104 */       this.d.a(new of("disconnect.genericReason"));
/* 105 */       this.d.m();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/* 111 */     if (this.d != null)
/* 112 */       if (this.d.h()) {
/* 113 */         this.d.a();
/*     */       } else {
/* 115 */         this.d.m();
/*     */       }  
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eol.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */