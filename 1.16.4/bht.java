/*     */ import java.util.List;
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
/*     */ public class bht
/*     */   extends bhm
/*     */   implements ccx
/*     */ {
/*     */   private boolean d = true;
/*  24 */   private int e = -1;
/*  25 */   private final fx f = fx.b;
/*     */   
/*     */   public bht(aqe<? extends bht> ☃, brx brx1) {
/*  28 */     super(☃, brx1);
/*     */   }
/*     */   
/*     */   public bht(brx ☃, double d1, double d2, double d3) {
/*  32 */     super(aqe.X, d1, d2, d3, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public bhl.a o() {
/*  37 */     return bhl.a.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh q() {
/*  42 */     return bup.fy.n();
/*     */   }
/*     */ 
/*     */   
/*     */   public int s() {
/*  47 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int Z_() {
/*  52 */     return 5;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, int j, boolean bool) {
/*  57 */     boolean bool1 = !bool;
/*     */     
/*  59 */     if (bool1 != u()) {
/*  60 */       o(bool1);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean u() {
/*  65 */     return this.d;
/*     */   }
/*     */   
/*     */   public void o(boolean ☃) {
/*  69 */     this.d = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public brx v() {
/*  74 */     return this.l;
/*     */   }
/*     */ 
/*     */   
/*     */   public double x() {
/*  79 */     return cD();
/*     */   }
/*     */ 
/*     */   
/*     */   public double z() {
/*  84 */     return cE() + 0.5D;
/*     */   }
/*     */ 
/*     */   
/*     */   public double A() {
/*  89 */     return cH();
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/*  94 */     super.j();
/*     */     
/*  96 */     if (!this.l.v && aX() && u()) {
/*  97 */       fx ☃ = cB();
/*  98 */       if (☃.equals(this.f)) {
/*  99 */         this.e--;
/*     */       } else {
/* 101 */         m(0);
/*     */       } 
/*     */       
/* 104 */       if (!C()) {
/* 105 */         m(0);
/*     */         
/* 107 */         if (B()) {
/* 108 */           m(4);
/* 109 */           X_();
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean B() {
/* 116 */     if (ccy.a(this)) {
/* 117 */       return true;
/*     */     }
/*     */     
/* 120 */     List<bcv> ☃ = (List)this.l.a((Class)bcv.class, cc().c(0.25D, 0.0D, 0.25D), aqd.a);
/*     */     
/* 122 */     if (!☃.isEmpty()) {
/* 123 */       ccy.a(this, ☃.get(0));
/*     */     }
/*     */     
/* 126 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(apk ☃) {
/* 131 */     super.a(☃);
/*     */     
/* 133 */     if (this.l.V().b(brt.g)) {
/* 134 */       a(bup.fy);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(md ☃) {
/* 140 */     super.b(☃);
/* 141 */     ☃.b("TransferCooldown", this.e);
/* 142 */     ☃.a("Enabled", this.d);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/* 147 */     super.a(☃);
/* 148 */     this.e = ☃.h("TransferCooldown");
/* 149 */     this.d = ☃.e("Enabled") ? ☃.q("Enabled") : true;
/*     */   }
/*     */   
/*     */   public void m(int ☃) {
/* 153 */     this.e = ☃;
/*     */   }
/*     */   
/*     */   public boolean C() {
/* 157 */     return (this.e > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public bic a(int ☃, bfv bfv1) {
/* 162 */     return new bix(☃, bfv1, this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bht.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */