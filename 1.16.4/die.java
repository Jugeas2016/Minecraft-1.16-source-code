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
/*     */ public class die
/*     */   extends eoo
/*     */ {
/*  14 */   private static final nr a = new of("mco.reset.world.seed");
/*  15 */   private static final nr[] b = new nr[] { new of("generator.default"), new of("generator.flat"), new of("generator.large_biomes"), new of("generator.amplified") };
/*     */ 
/*     */   
/*     */   private final dif c;
/*     */ 
/*     */   
/*     */   private eom p;
/*     */ 
/*     */   
/*     */   private dlq q;
/*     */   
/*  26 */   private Boolean r = Boolean.valueOf(true);
/*  27 */   private Integer s = Integer.valueOf(0);
/*     */   
/*     */   private nr t;
/*     */   
/*     */   public die(dif ☃, nr nr1) {
/*  32 */     this.c = ☃;
/*  33 */     this.t = nr1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  38 */     this.q.a();
/*  39 */     super.d();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  44 */     this.i.m.a(true);
/*     */     
/*  46 */     this.p = new eom(new of("mco.reset.world.generate"), this.k / 2, 17, 16777215);
/*  47 */     d(this.p);
/*     */     
/*  49 */     this.q = new dlq(this.i.g, this.k / 2 - 100, j(2), 200, 20, null, new of("mco.reset.world.seed"));
/*  50 */     this.q.k(32);
/*  51 */     d(this.q);
/*  52 */     b(this.q);
/*     */     
/*  54 */     a(new dlj(this.k / 2 - 102, j(4), 205, 20, h(), ☃ -> {
/*     */             this.s = Integer.valueOf((this.s.intValue() + 1) % b.length);
/*     */             ☃.a(h());
/*     */           }));
/*  58 */     a(new dlj(this.k / 2 - 102, j(6) - 2, 205, 20, i(), ☃ -> {
/*     */             this.r = Boolean.valueOf(!this.r.booleanValue());
/*     */             
/*     */             ☃.a(i());
/*     */           }));
/*  63 */     a(new dlj(this.k / 2 - 102, j(12), 97, 20, this.t, ☃ -> this.c.a(new dif.c(this.q.b(), this.s.intValue(), this.r.booleanValue()))));
/*     */ 
/*     */ 
/*     */     
/*  67 */     a(new dlj(this.k / 2 + 8, j(12), 97, 20, nq.h, ☃ -> this.i.a(this.c)));
/*     */ 
/*     */     
/*  70 */     A();
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  75 */     this.i.m.a(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/*  80 */     if (☃ == 256) {
/*  81 */       this.i.a(this.c);
/*  82 */       return true;
/*     */     } 
/*  84 */     return super.a(☃, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/*  89 */     a(☃);
/*     */     
/*  91 */     this.p.a(this, ☃);
/*  92 */     this.o.b(☃, a, (this.k / 2 - 100), j(1), 10526880);
/*     */     
/*  94 */     this.q.a(☃, i, j, f);
/*     */     
/*  96 */     super.a(☃, i, j, f);
/*     */   }
/*     */   
/*     */   private nr h() {
/* 100 */     return (new of("selectWorld.mapType")).c(" ").a(b[this.s.intValue()]);
/*     */   }
/*     */   
/*     */   private nr i() {
/* 104 */     return nq.a(new of("selectWorld.mapFeatures"), this.r.booleanValue());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\die.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */