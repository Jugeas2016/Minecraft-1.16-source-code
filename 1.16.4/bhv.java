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
/*     */ public class bhv
/*     */   extends bhl
/*     */ {
/*  25 */   private int b = -1;
/*     */   
/*     */   public bhv(aqe<? extends bhv> ☃, brx brx1) {
/*  28 */     super(☃, brx1);
/*     */   }
/*     */   
/*     */   public bhv(brx ☃, double d1, double d2, double d3) {
/*  32 */     super(aqe.Z, ☃, d1, d2, d3);
/*     */   }
/*     */ 
/*     */   
/*     */   public bhl.a o() {
/*  37 */     return bhl.a.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh q() {
/*  42 */     return bup.bH.n();
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/*  47 */     super.j();
/*     */     
/*  49 */     if (this.b > 0) {
/*  50 */       this.b--;
/*  51 */       this.l.a(hh.S, cD(), cE() + 0.5D, cH(), 0.0D, 0.0D, 0.0D);
/*  52 */     } else if (this.b == 0) {
/*  53 */       h(c(cC()));
/*     */     } 
/*     */     
/*  56 */     if (this.u) {
/*  57 */       double ☃ = c(cC());
/*     */       
/*  59 */       if (☃ >= 0.009999999776482582D) {
/*  60 */         h(☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/*  67 */     aqa aqa = ☃.j();
/*  68 */     if (aqa instanceof bga) {
/*  69 */       bga bga = (bga)aqa;
/*  70 */       if (bga.bq()) {
/*  71 */         h(bga.cC().g());
/*     */       }
/*     */     } 
/*  74 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(apk ☃) {
/*  79 */     double d = c(cC());
/*     */     
/*  81 */     if (☃.p() || ☃.d() || d >= 0.009999999776482582D) {
/*  82 */       if (this.b < 0) {
/*  83 */         u();
/*  84 */         this.b = this.J.nextInt(20) + this.J.nextInt(20);
/*     */       } 
/*     */       
/*     */       return;
/*     */     } 
/*  89 */     super.a(☃);
/*     */     
/*  91 */     if (!☃.d() && this.l.V().b(brt.g)) {
/*  92 */       a(bup.bH);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void h(double ☃) {
/*  97 */     if (!this.l.v) {
/*  98 */       double d = Math.sqrt(☃);
/*  99 */       if (d > 5.0D) {
/* 100 */         d = 5.0D;
/*     */       }
/* 102 */       this.l.a(this, cD(), cE(), cH(), (float)(4.0D + this.J.nextDouble() * 1.5D * d), brp.a.b);
/* 103 */       ad();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(float ☃, float f1) {
/* 109 */     if (☃ >= 3.0F) {
/* 110 */       float f = ☃ / 10.0F;
/* 111 */       h((f * f));
/*     */     } 
/*     */     
/* 114 */     return super.b(☃, f1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, int j, boolean bool) {
/* 119 */     if (bool && this.b < 0) {
/* 120 */       u();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(byte ☃) {
/* 126 */     if (☃ == 10) {
/* 127 */       u();
/*     */     } else {
/* 129 */       super.a(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void u() {
/* 134 */     this.b = 80;
/*     */     
/* 136 */     if (!this.l.v) {
/* 137 */       this.l.a(this, (byte)10);
/* 138 */       if (!aA()) {
/* 139 */         this.l.a((bfw)null, cD(), cE(), cH(), adq.pb, adr.e, 1.0F, 1.0F);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public int v() {
/* 145 */     return this.b;
/*     */   }
/*     */   
/*     */   public boolean x() {
/* 149 */     return (this.b > -1);
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(brp ☃, brc brc1, fx fx1, ceh ceh1, cux cux1, float f) {
/* 154 */     if (x() && (ceh1.a(aed.H) || brc1.d_(fx1.b()).a(aed.H))) {
/* 155 */       return 0.0F;
/*     */     }
/*     */     
/* 158 */     return super.a(☃, brc1, fx1, ceh1, cux1, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brp ☃, brc brc1, fx fx1, ceh ceh1, float f) {
/* 163 */     if (x() && (ceh1.a(aed.H) || brc1.d_(fx1.b()).a(aed.H))) {
/* 164 */       return false;
/*     */     }
/*     */     
/* 167 */     return super.a(☃, brc1, fx1, ceh1, f);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/* 172 */     super.a(☃);
/* 173 */     if (☃.c("TNTFuse", 99)) {
/* 174 */       this.b = ☃.h("TNTFuse");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(md ☃) {
/* 180 */     super.b(☃);
/* 181 */     ☃.b("TNTFuse", this.b);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bhv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */