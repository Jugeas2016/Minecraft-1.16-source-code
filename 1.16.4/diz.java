/*     */ import java.util.concurrent.locks.ReentrantLock;
/*     */ import java.util.function.Function;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class diz
/*     */   extends dja
/*     */ {
/*     */   private final dgq c;
/*     */   private final dot d;
/*     */   private final dfw e;
/*     */   private final ReentrantLock f;
/*     */   
/*     */   public diz(dfw ☃, dot dot1, dgq dgq1, ReentrantLock reentrantLock) {
/*  30 */     this.d = dot1;
/*  31 */     this.e = ☃;
/*  32 */     this.c = dgq1;
/*  33 */     this.f = reentrantLock;
/*     */   }
/*     */ 
/*     */   
/*     */   public void run() {
/*  38 */     b(new of("mco.connect.connecting"));
/*     */     
/*  40 */     dgb ☃ = dgb.a();
/*  41 */     boolean bool1 = false;
/*  42 */     boolean bool2 = false;
/*  43 */     int i = 5;
/*  44 */     dgr dgr = null;
/*  45 */     boolean bool3 = false;
/*  46 */     boolean bool4 = false;
/*     */ 
/*     */     
/*  49 */     for (int j = 0; j < 40 && 
/*  50 */       !c(); j++) {
/*     */ 
/*     */       
/*     */       try {
/*     */         
/*  55 */         dgr = ☃.b(this.c.a);
/*  56 */         bool1 = true;
/*  57 */       } catch (dhj dhj) {
/*     */         
/*  59 */         i = dhj.e;
/*  60 */       } catch (dhi dhi) {
/*  61 */         if (dhi.c == 6002) {
/*  62 */           bool3 = true; break;
/*     */         } 
/*  64 */         if (dhi.c == 6006) {
/*  65 */           bool4 = true;
/*     */           break;
/*     */         } 
/*  68 */         bool2 = true;
/*  69 */         a(dhi.toString());
/*  70 */         a.error("Couldn't connect to world", dhi);
/*     */         
/*     */         break;
/*  73 */       } catch (Exception exception) {
/*  74 */         bool2 = true;
/*  75 */         a.error("Couldn't connect to world", exception);
/*  76 */         a(exception.getLocalizedMessage());
/*     */         
/*     */         break;
/*     */       } 
/*  80 */       if (bool1) {
/*     */         break;
/*     */       }
/*     */       
/*  84 */       b(i);
/*     */     } 
/*     */     
/*  87 */     if (bool3) {
/*  88 */       a(new dim(this.d, this.e, this.c));
/*  89 */     } else if (bool4) {
/*  90 */       if (this.c.g.equals(djz.C().J().b())) {
/*  91 */         a(new dhq(this.d, this.e, this.c.a, (this.c.m == dgq.c.b)));
/*     */       } else {
/*  93 */         a(new dhw(new of("mco.brokenworld.nonowner.title"), new of("mco.brokenworld.nonowner.error"), this.d));
/*     */       } 
/*  95 */     } else if (!c() && !bool2) {
/*  96 */       if (bool1) {
/*  97 */         dgr dgr1 = dgr;
/*  98 */         if (dgr1.b != null && dgr1.c != null) {
/*  99 */           nr nr1 = new of("mco.configure.world.resourcepack.question.line1");
/* 100 */           nr nr2 = new of("mco.configure.world.resourcepack.question.line2");
/* 101 */           a(new dhy(bool -> {
/*     */                   try {
/*     */                     if (bool) {
/*     */                       Function<Throwable, Void> function = ();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                       
/*     */                       try {
/*     */                         djz.C().P().a(☃.b, ☃.c).thenRun(()).exceptionally(function);
/* 115 */                       } catch (Exception exception) {
/*     */                         function.apply(exception);
/*     */                       } 
/*     */                     } else {
/*     */                       a(this.d);
/*     */                     } 
/*     */                   } finally {
/*     */                     if (this.f != null && this.f.isHeldByCurrentThread()) {
/*     */                       this.f.unlock();
/*     */                     }
/*     */                   } 
/*     */                 }dhy.a.b, nr1, nr2, true));
/*     */         } else {
/* 128 */           a(new dhz(this.d, new dix(this.d, this.c, dgr1)));
/*     */         } 
/*     */       } else {
/* 131 */         a(new of("mco.errorMessage.connectionFailure"));
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void b(int ☃) {
/*     */     try {
/* 138 */       Thread.sleep((☃ * 1000));
/* 139 */     } catch (InterruptedException interruptedException) {
/* 140 */       a.warn(interruptedException.getLocalizedMessage());
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\diz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */