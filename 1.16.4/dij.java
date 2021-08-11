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
/*     */ public class dij
/*     */   extends eoo
/*     */ {
/*  16 */   private static final nr a = new of("mco.configure.world.name");
/*  17 */   private static final nr b = new of("mco.configure.world.description");
/*     */   
/*     */   private final dhs c;
/*     */   
/*     */   private final dgq p;
/*     */   private dlj q;
/*     */   private dlq r;
/*     */   private dlq s;
/*     */   private eom t;
/*     */   
/*     */   public dij(dhs ☃, dgq dgq1) {
/*  28 */     this.c = ☃;
/*  29 */     this.p = dgq1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  34 */     this.s.a();
/*  35 */     this.r.a();
/*     */     
/*  37 */     this.q.o = !this.s.b().trim().isEmpty();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  42 */     this.i.m.a(true);
/*     */     
/*  44 */     int ☃ = this.k / 2 - 106;
/*     */     
/*  46 */     this.q = a(new dlj(☃ - 2, j(12), 106, 20, new of("mco.configure.world.buttons.done"), ☃ -> a()));
/*  47 */     a(new dlj(this.k / 2 + 2, j(12), 106, 20, nq.d, ☃ -> this.i.a(this.c)));
/*     */ 
/*     */     
/*  50 */     String str = (this.p.e == dgq.b.b) ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open";
/*  51 */     dlj dlj1 = new dlj(this.k / 2 - 53, j(0), 106, 20, new of(str), ☃ -> {
/*     */           if (this.p.e == dgq.b.b) {
/*     */             nr nr1 = new of("mco.configure.world.close.question.line1");
/*     */ 
/*     */             
/*     */             nr nr2 = new of("mco.configure.world.close.question.line2");
/*     */ 
/*     */             
/*     */             this.i.a(new dhy((), dhy.a.b, nr1, nr2, true));
/*     */           } else {
/*     */             this.c.a(false, this);
/*     */           } 
/*     */         });
/*     */ 
/*     */     
/*  66 */     a(dlj1);
/*     */     
/*  68 */     this.s = new dlq(this.i.g, ☃, j(4), 212, 20, null, new of("mco.configure.world.name"));
/*  69 */     this.s.k(32);
/*     */     
/*  71 */     this.s.a(this.p.b());
/*  72 */     d(this.s);
/*  73 */     c(this.s);
/*     */     
/*  75 */     this.r = new dlq(this.i.g, ☃, j(8), 212, 20, null, new of("mco.configure.world.description"));
/*  76 */     this.r.k(32);
/*     */     
/*  78 */     this.r.a(this.p.a());
/*  79 */     d(this.r);
/*     */     
/*  81 */     this.t = d(new eom(new of("mco.configure.world.settings.title"), this.k / 2, 17, 16777215));
/*  82 */     A();
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  87 */     this.i.m.a(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/*  92 */     if (☃ == 256) {
/*  93 */       this.i.a(this.c);
/*  94 */       return true;
/*     */     } 
/*  96 */     return super.a(☃, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 101 */     a(☃);
/*     */     
/* 103 */     this.t.a(this, ☃);
/*     */     
/* 105 */     this.o.b(☃, a, (this.k / 2 - 106), j(3), 10526880);
/* 106 */     this.o.b(☃, b, (this.k / 2 - 106), j(7), 10526880);
/*     */     
/* 108 */     this.s.a(☃, i, j, f);
/* 109 */     this.r.a(☃, i, j, f);
/*     */     
/* 111 */     super.a(☃, i, j, f);
/*     */   }
/*     */   
/*     */   public void a() {
/* 115 */     this.c.a(this.s.b(), this.r.b());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dij.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */