/*     */ import javax.annotation.Nullable;
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
/*     */ public class dhx
/*     */   extends eoo
/*     */ {
/*  21 */   private static final Logger a = LogManager.getLogger();
/*  22 */   private static final nr b = new of("mco.configure.world.invite.profile.name");
/*  23 */   private static final nr c = new of("mco.configure.world.players.error");
/*     */   
/*     */   private dlq p;
/*     */   
/*     */   private final dgq q;
/*     */   
/*     */   private final dhs r;
/*     */   private final dot s;
/*     */   @Nullable
/*     */   private nr t;
/*     */   
/*     */   public dhx(dhs ☃, dot dot1, dgq dgq1) {
/*  35 */     this.r = ☃;
/*  36 */     this.s = dot1;
/*  37 */     this.q = dgq1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  42 */     this.p.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  47 */     this.i.m.a(true);
/*     */     
/*  49 */     this.p = new dlq(this.i.g, this.k / 2 - 100, j(2), 200, 20, null, new of("mco.configure.world.invite.profile.name"));
/*  50 */     d(this.p);
/*  51 */     b(this.p);
/*     */     
/*  53 */     a(new dlj(this.k / 2 - 100, j(10), 200, 20, new of("mco.configure.world.buttons.invite"), ☃ -> h()));
/*  54 */     a(new dlj(this.k / 2 - 100, j(12), 200, 20, nq.d, ☃ -> this.i.a(this.s)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  59 */     this.i.m.a(false);
/*     */   }
/*     */   
/*     */   private void h() {
/*  63 */     dgb ☃ = dgb.a();
/*     */     
/*  65 */     if (this.p.b() == null || this.p.b().isEmpty()) {
/*  66 */       a(c);
/*     */       
/*     */       return;
/*     */     } 
/*     */     try {
/*  71 */       dgq dgq1 = ☃.b(this.q.a, this.p.b().trim());
/*     */       
/*  73 */       if (dgq1 != null) {
/*  74 */         this.q.h = dgq1.h;
/*  75 */         this.i.a(new did(this.r, this.q));
/*     */       } else {
/*  77 */         a(c);
/*     */       } 
/*  79 */     } catch (Exception exception) {
/*  80 */       a.error("Couldn't invite user");
/*  81 */       a(c);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(nr ☃) {
/*  86 */     this.t = ☃;
/*  87 */     eoj.a(☃.getString());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/*  92 */     if (☃ == 256) {
/*  93 */       this.i.a(this.s);
/*  94 */       return true;
/*     */     } 
/*     */     
/*  97 */     return super.a(☃, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 102 */     a(☃);
/*     */     
/* 104 */     this.o.b(☃, b, (this.k / 2 - 100), j(1), 10526880);
/*     */     
/* 106 */     if (this.t != null) {
/* 107 */       a(☃, this.o, this.t, this.k / 2, j(5), 16711680);
/*     */     }
/*     */     
/* 110 */     this.p.a(☃, i, j, f);
/*     */     
/* 112 */     super.a(☃, i, j, f);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dhx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */