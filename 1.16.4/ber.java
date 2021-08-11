/*     */ import javax.annotation.Nullable;
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
/*     */ 
/*     */ public abstract class ber
/*     */   extends bdq
/*     */ {
/*  26 */   protected static final us<Boolean> b = uv.a((Class)ber.class, uu.i);
/*     */   
/*  28 */   protected int c = 0;
/*     */   
/*     */   public ber(aqe<? extends ber> ☃, brx brx1) {
/*  31 */     super((aqe)☃, brx1);
/*  32 */     p(true);
/*  33 */     eS();
/*  34 */     a(cwz.l, 16.0F);
/*  35 */     a(cwz.m, -1.0F);
/*     */   }
/*     */   
/*     */   private void eS() {
/*  39 */     if (azi.a(this)) {
/*  40 */       ((ayi)x()).a(true);
/*     */     }
/*     */   }
/*     */   
/*     */   protected abstract boolean m();
/*     */   
/*     */   public void t(boolean ☃) {
/*  47 */     ab().b(b, Boolean.valueOf(☃));
/*     */   }
/*     */   
/*     */   protected boolean eK() {
/*  51 */     return ((Boolean)ab().<Boolean>a(b)).booleanValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  56 */     super.e();
/*  57 */     this.R.a(b, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/*  62 */     super.b(☃);
/*     */     
/*  64 */     if (eK()) {
/*  65 */       ☃.a("IsImmuneToZombification", true);
/*     */     }
/*  67 */     ☃.b("TimeInOverworld", this.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public double bb() {
/*  72 */     return w_() ? -0.05D : -0.45D;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/*  77 */     super.a(☃);
/*     */     
/*  79 */     t(☃.q("IsImmuneToZombification"));
/*  80 */     this.c = ☃.h("TimeInOverworld");
/*     */   }
/*     */ 
/*     */   
/*     */   protected void N() {
/*  85 */     super.N();
/*     */     
/*  87 */     if (eL()) {
/*  88 */       this.c++;
/*     */     } else {
/*  90 */       this.c = 0;
/*     */     } 
/*  92 */     if (this.c > 300) {
/*  93 */       eP();
/*  94 */       c((aag)this.l);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean eL() {
/*  99 */     return (!this.l.k().g() && !eK() && !eD());
/*     */   }
/*     */   
/*     */   protected void c(aag ☃) {
/* 103 */     bel bel = a(aqe.bb, true);
/* 104 */     if (bel != null) {
/* 105 */       bel.c(new apu(apw.i, 200, 0));
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean eM() {
/* 110 */     return !w_();
/*     */   }
/*     */ 
/*     */   
/*     */   public abstract beu eN();
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public aqm A() {
/* 119 */     return this.bg.<aqm>c(ayd.o).orElse(null);
/*     */   }
/*     */   
/*     */   protected boolean eO() {
/* 123 */     return dD().b() instanceof bni;
/*     */   }
/*     */ 
/*     */   
/*     */   public void F() {
/* 128 */     if (bet.d(this)) {
/* 129 */       super.F();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void M() {
/* 135 */     super.M();
/* 136 */     rz.a(this);
/*     */   }
/*     */   
/*     */   protected abstract void eP();
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ber.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */