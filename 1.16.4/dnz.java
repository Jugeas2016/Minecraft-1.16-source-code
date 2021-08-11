/*     */ import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
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
/*     */ public class dnz
/*     */   extends dot
/*     */ {
/*  15 */   private static final nr a = new of("addServer.enterIp");
/*     */   
/*     */   private dlj b;
/*     */   private final dwz c;
/*     */   private dlq p;
/*     */   private final BooleanConsumer q;
/*     */   private final dot r;
/*     */   
/*     */   public dnz(dot ☃, BooleanConsumer booleanConsumer, dwz dwz1) {
/*  24 */     super(new of("selectServer.direct"));
/*  25 */     this.r = ☃;
/*  26 */     this.c = dwz1;
/*  27 */     this.q = booleanConsumer;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  32 */     this.p.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/*  37 */     if (aw_() == this.p && (☃ == 257 || ☃ == 335)) {
/*  38 */       h();
/*  39 */       return true;
/*     */     } 
/*  41 */     return super.a(☃, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  46 */     this.i.m.a(true);
/*  47 */     this.b = a(new dlj(this.k / 2 - 100, this.l / 4 + 96 + 12, 200, 20, new of("selectServer.select"), ☃ -> h()));
/*  48 */     a(new dlj(this.k / 2 - 100, this.l / 4 + 120 + 12, 200, 20, nq.d, ☃ -> this.q.accept(false)));
/*     */     
/*  50 */     this.p = new dlq(this.o, this.k / 2 - 100, 116, 200, 20, new of("addServer.enterIp"));
/*  51 */     this.p.k(128);
/*  52 */     this.p.e(true);
/*  53 */     this.p.a(this.i.k.aM);
/*  54 */     this.p.a(☃ -> i());
/*  55 */     this.e.add(this.p);
/*  56 */     b(this.p);
/*     */     
/*  58 */     i();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(djz ☃, int i, int j) {
/*  63 */     String str = this.p.b();
/*  64 */     b(☃, i, j);
/*  65 */     this.p.a(str);
/*     */   }
/*     */   
/*     */   private void h() {
/*  69 */     this.c.b = this.p.b();
/*  70 */     this.q.accept(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void at_() {
/*  75 */     this.i.a(this.r);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void e() {
/*  81 */     this.i.m.a(false);
/*  82 */     this.i.k.aM = this.p.b();
/*  83 */     this.i.k.b();
/*     */   }
/*     */   
/*     */   private void i() {
/*  87 */     String ☃ = this.p.b();
/*  88 */     this.b.o = (!☃.isEmpty() && (☃.split(":")).length > 0 && ☃.indexOf(' ') == -1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/*  93 */     a(☃);
/*     */     
/*  95 */     a(☃, this.o, this.d, this.k / 2, 20, 16777215);
/*  96 */     b(☃, this.o, a, this.k / 2 - 100, 100, 10526880);
/*     */     
/*  98 */     this.p.a(☃, i, j, f);
/*     */     
/* 100 */     super.a(☃, i, j, f);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dnz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */