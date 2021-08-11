/*     */ import java.util.List;
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
/*     */ public class aql
/*     */   extends aqa
/*     */ {
/*     */   private int c;
/*     */   public long b;
/*     */   private int d;
/*     */   private boolean e;
/*     */   @Nullable
/*     */   private aah f;
/*     */   
/*     */   public aql(aqe<? extends aql> ☃, brx brx1) {
/*  33 */     super(☃, brx1);
/*     */     
/*  35 */     this.Y = true;
/*  36 */     this.c = 2;
/*  37 */     this.b = this.J.nextLong();
/*  38 */     this.d = this.J.nextInt(3) + 1;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/*  42 */     this.e = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public adr cu() {
/*  47 */     return adr.d;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void d(@Nullable aah ☃) {
/*  56 */     this.f = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/*  61 */     super.j();
/*     */     
/*  63 */     if (this.c == 2) {
/*  64 */       aor ☃ = this.l.ad();
/*  65 */       if (☃ == aor.c || ☃ == aor.d) {
/*  66 */         a(4);
/*     */       }
/*     */       
/*  69 */       this.l.a((bfw)null, cD(), cE(), cH(), adq.hd, adr.d, 10000.0F, 0.8F + this.J.nextFloat() * 0.2F);
/*  70 */       this.l.a((bfw)null, cD(), cE(), cH(), adq.hc, adr.d, 2.0F, 0.5F + this.J.nextFloat() * 0.2F);
/*     */     } 
/*     */     
/*  73 */     this.c--;
/*  74 */     if (this.c < 0) {
/*  75 */       if (this.d == 0) {
/*  76 */         ad();
/*  77 */       } else if (this.c < -this.J.nextInt(10)) {
/*  78 */         this.d--;
/*  79 */         this.c = 1;
/*  80 */         this.b = this.J.nextLong();
/*  81 */         a(0);
/*     */       } 
/*     */     }
/*     */     
/*  85 */     if (this.c >= 0) {
/*  86 */       if (!(this.l instanceof aag)) {
/*  87 */         this.l.c(2);
/*  88 */       } else if (!this.e) {
/*  89 */         double ☃ = 3.0D;
/*  90 */         List<aqa> list = this.l.a(this, new dci(cD() - 3.0D, cE() - 3.0D, cH() - 3.0D, cD() + 3.0D, cE() + 6.0D + 3.0D, cH() + 3.0D), aqa::aX);
/*  91 */         for (aqa aqa1 : list) {
/*  92 */           aqa1.a((aag)this.l, this);
/*     */         }
/*  94 */         if (this.f != null) {
/*  95 */           ac.E.a(this.f, list);
/*     */         }
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(int ☃) {
/* 102 */     if (this.e || this.l.v || !this.l.V().b(brt.a)) {
/*     */       return;
/*     */     }
/*     */     
/* 106 */     fx fx = cB();
/* 107 */     ceh ceh = bue.a(this.l, fx);
/*     */     
/* 109 */     if (this.l.d_(fx).g() && ceh.a(this.l, fx)) {
/* 110 */       this.l.a(fx, ceh);
/*     */     }
/*     */     
/* 113 */     for (int i = 0; i < ☃; i++) {
/* 114 */       fx fx1 = fx.b(this.J.nextInt(3) - 1, this.J.nextInt(3) - 1, this.J.nextInt(3) - 1);
/* 115 */       ceh = bue.a(this.l, fx1);
/* 116 */       if (this.l.d_(fx1).g() && ceh.a(this.l, fx1)) {
/* 117 */         this.l.a(fx1, ceh);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(double ☃) {
/* 125 */     double d = 64.0D * bW();
/* 126 */     return (☃ < d * d);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void e() {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected void b(md ☃) {}
/*     */ 
/*     */   
/*     */   public oj<?> P() {
/* 143 */     return new on(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aql.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */