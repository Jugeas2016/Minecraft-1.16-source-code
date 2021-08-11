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
/*     */ 
/*     */ 
/*     */ public class bhr
/*     */   extends bhl
/*     */ {
/*  24 */   private static final us<String> b = uv.a((Class)bhr.class, uu.d);
/*  25 */   private static final us<nr> c = uv.a((Class)bhr.class, uu.e);
/*     */   
/*  27 */   private final bqy d = new a(this);
/*     */   
/*     */   private int e;
/*     */ 
/*     */   
/*     */   public bhr(aqe<? extends bhr> ☃, brx brx1) {
/*  33 */     super(☃, brx1);
/*     */   }
/*     */   
/*     */   public bhr(brx ☃, double d1, double d2, double d3) {
/*  37 */     super(aqe.V, ☃, d1, d2, d3);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  42 */     super.e();
/*  43 */     ab().a(b, "");
/*  44 */     ab().a(c, oe.d);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/*  49 */     super.a(☃);
/*  50 */     this.d.b(☃);
/*  51 */     ab().b(b, u().k());
/*  52 */     ab().b(c, u().j());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(md ☃) {
/*  57 */     super.b(☃);
/*  58 */     this.d.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public bhl.a o() {
/*  63 */     return bhl.a.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh q() {
/*  68 */     return bup.er.n();
/*     */   }
/*     */   
/*     */   public bqy u() {
/*  72 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, int j, boolean bool) {
/*  77 */     if (bool && 
/*  78 */       this.K - this.e >= 4) {
/*  79 */       u().a(this.l);
/*  80 */       this.e = this.K;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aou a(bfw ☃, aot aot1) {
/*  87 */     return this.d.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(us<?> ☃) {
/*  92 */     super.a(☃);
/*     */     
/*  94 */     if (c.equals(☃)) {
/*     */       try {
/*  96 */         this.d.b(ab().<nr>a(c));
/*  97 */       } catch (Throwable throwable) {}
/*     */     }
/*  99 */     else if (b.equals(☃)) {
/* 100 */       this.d.a(ab().<String>a(b));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean cj() {
/* 106 */     return true;
/*     */   }
/*     */   
/*     */   public class a
/*     */     extends bqy {
/*     */     public aag d() {
/* 112 */       return (aag)this.b.l;
/*     */     }
/*     */     public a(bhr ☃) {}
/*     */     
/*     */     public void e() {
/* 117 */       this.b.ab().b(bhr.v(), k());
/* 118 */       this.b.ab().b(bhr.x(), j());
/*     */     }
/*     */ 
/*     */     
/*     */     public dcn f() {
/* 123 */       return this.b.cA();
/*     */     }
/*     */     
/*     */     public bhr g() {
/* 127 */       return this.b;
/*     */     }
/*     */ 
/*     */     
/*     */     public db h() {
/* 132 */       return new db(this, this.b.cA(), this.b.bi(), d(), 2, l().getString(), this.b.d(), d().l(), this.b);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bhr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */