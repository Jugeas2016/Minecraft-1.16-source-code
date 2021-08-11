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
/*     */ public class dhu
/*     */   extends eoo
/*     */ {
/*  17 */   private static final nr a = new of("mco.configure.world.name");
/*  18 */   private static final nr b = new of("mco.configure.world.description");
/*     */   
/*     */   private final dgq c;
/*     */   
/*     */   private final dfw p;
/*     */   private dlq q;
/*     */   private dlq r;
/*     */   private dlj s;
/*     */   private eom t;
/*     */   
/*     */   public dhu(dgq ☃, dfw dfw1) {
/*  29 */     this.c = ☃;
/*  30 */     this.p = dfw1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  35 */     if (this.q != null) {
/*  36 */       this.q.a();
/*     */     }
/*     */     
/*  39 */     if (this.r != null) {
/*  40 */       this.r.a();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  46 */     this.i.m.a(true);
/*     */     
/*  48 */     this.s = a(new dlj(this.k / 2 - 100, this.l / 4 + 120 + 17, 97, 20, new of("mco.create.world"), ☃ -> h()));
/*  49 */     a(new dlj(this.k / 2 + 5, this.l / 4 + 120 + 17, 95, 20, nq.d, ☃ -> this.i.a(this.p)));
/*     */     
/*  51 */     this.s.o = false;
/*     */     
/*  53 */     this.q = new dlq(this.i.g, this.k / 2 - 100, 65, 200, 20, null, new of("mco.configure.world.name"));
/*  54 */     d(this.q);
/*  55 */     b(this.q);
/*     */     
/*  57 */     this.r = new dlq(this.i.g, this.k / 2 - 100, 115, 200, 20, null, new of("mco.configure.world.description"));
/*  58 */     d(this.r);
/*     */     
/*  60 */     this.t = new eom(new of("mco.selectServer.create"), this.k / 2, 11, 16777215);
/*  61 */     d(this.t);
/*     */     
/*  63 */     A();
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  68 */     this.i.m.a(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(char ☃, int i) {
/*  73 */     boolean bool = super.a(☃, i);
/*     */     
/*  75 */     this.s.o = i();
/*  76 */     return bool;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/*  81 */     if (☃ == 256) {
/*  82 */       this.i.a(this.p);
/*  83 */       return true;
/*     */     } 
/*     */ 
/*     */     
/*  87 */     boolean bool = super.a(☃, i, j);
/*  88 */     this.s.o = i();
/*  89 */     return bool;
/*     */   }
/*     */   
/*     */   private void h() {
/*  93 */     if (i()) {
/*  94 */       dif ☃ = new dif(this.p, this.c, new of("mco.selectServer.create"), new of("mco.create.world.subtitle"), 10526880, new of("mco.create.world.skip"), () -> this.i.a(this.p.g()), () -> this.i.a(this.p.g()));
/*     */ 
/*     */ 
/*     */       
/*  98 */       ☃.a(new of("mco.create.world.reset.title"));
/*  99 */       this.i.a(new dhz(this.p, new djg(this.c.a, this.q.b(), this.r.b(), ☃)));
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean i() {
/* 104 */     return !this.q.b().trim().isEmpty();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 109 */     a(☃);
/*     */     
/* 111 */     this.t.a(this, ☃);
/* 112 */     this.o.b(☃, a, (this.k / 2 - 100), 52.0F, 10526880);
/* 113 */     this.o.b(☃, b, (this.k / 2 - 100), 102.0F, 10526880);
/*     */     
/* 115 */     if (this.q != null) {
/* 116 */       this.q.a(☃, i, j, f);
/*     */     }
/*     */     
/* 119 */     if (this.r != null) {
/* 120 */       this.r.a(☃, i, j, f);
/*     */     }
/*     */     
/* 123 */     super.a(☃, i, j, f);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dhu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */