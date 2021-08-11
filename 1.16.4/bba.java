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
/*     */ public abstract class bba
/*     */   extends bbb
/*     */ {
/*  22 */   private static final us<Boolean> bw = uv.a((Class)bba.class, uu.i);
/*     */ 
/*     */   
/*     */   protected bba(aqe<? extends bba> ☃, brx brx1) {
/*  26 */     super((aqe)☃, brx1);
/*     */     
/*  28 */     this.bu = false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void eK() {
/*  33 */     a(arl.a).a(fp());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  38 */     super.e();
/*     */     
/*  40 */     this.R.a(bw, Boolean.valueOf(false));
/*     */   }
/*     */   
/*     */   public static ark.a eL() {
/*  44 */     return fi()
/*  45 */       .a(arl.d, 0.17499999701976776D)
/*  46 */       .a(arl.m, 0.5D);
/*     */   }
/*     */   
/*     */   public boolean eM() {
/*  50 */     return ((Boolean)this.R.<Boolean>a(bw)).booleanValue();
/*     */   }
/*     */   
/*     */   public void t(boolean ☃) {
/*  54 */     this.R.b(bw, Boolean.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   protected int eN() {
/*  59 */     if (eM()) {
/*  60 */       return 17;
/*     */     }
/*  62 */     return super.eN();
/*     */   }
/*     */ 
/*     */   
/*     */   public double bc() {
/*  67 */     return super.bc() - 0.25D;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void dn() {
/*  72 */     super.dn();
/*  73 */     if (eM()) {
/*  74 */       if (!this.l.v) {
/*  75 */         a(bup.bR);
/*     */       }
/*  77 */       t(false);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/*  83 */     super.b(☃);
/*     */     
/*  85 */     ☃.a("ChestedHorse", eM());
/*  86 */     if (eM()) {
/*  87 */       mj mj = new mj();
/*     */       
/*  89 */       for (int i = 2; i < this.br.Z_(); i++) {
/*  90 */         bmb bmb = this.br.a(i);
/*     */         
/*  92 */         if (!bmb.a()) {
/*  93 */           md md1 = new md();
/*     */           
/*  95 */           md1.a("Slot", (byte)i);
/*     */           
/*  97 */           bmb.b(md1);
/*  98 */           mj.add(md1);
/*     */         } 
/*     */       } 
/* 101 */       ☃.a("Items", mj);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 107 */     super.a(☃);
/*     */     
/* 109 */     t(☃.q("ChestedHorse"));
/*     */     
/* 111 */     if (eM()) {
/* 112 */       mj mj = ☃.d("Items", 10);
/* 113 */       fd();
/*     */       
/* 115 */       for (int i = 0; i < mj.size(); i++) {
/* 116 */         md md1 = mj.a(i);
/* 117 */         int j = md1.f("Slot") & 0xFF;
/*     */         
/* 119 */         if (j >= 2 && j < this.br.Z_()) {
/* 120 */           this.br.a(j, bmb.a(md1));
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 125 */     fe();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a_(int ☃, bmb bmb1) {
/* 130 */     if (☃ == 499) {
/* 131 */       if (eM() && bmb1.a()) {
/* 132 */         t(false);
/* 133 */         fd();
/* 134 */         return true;
/*     */       } 
/* 136 */       if (!eM() && bmb1.b() == bup.bR.h()) {
/* 137 */         t(true);
/* 138 */         fd();
/* 139 */         return true;
/*     */       } 
/*     */     } 
/* 142 */     return super.a_(☃, bmb1);
/*     */   }
/*     */ 
/*     */   
/*     */   public aou b(bfw ☃, aot aot1) {
/* 147 */     bmb bmb = ☃.b(aot1);
/*     */     
/* 149 */     if (!w_()) {
/* 150 */       if (eW() && ☃.eq()) {
/* 151 */         f(☃);
/* 152 */         return aou.a(this.l.v);
/*     */       } 
/*     */       
/* 155 */       if (bs()) {
/* 156 */         return super.b(☃, aot1);
/*     */       }
/*     */     } 
/*     */     
/* 160 */     if (!bmb.a()) {
/* 161 */       if (k(bmb)) {
/* 162 */         return b(☃, bmb);
/*     */       }
/*     */       
/* 165 */       if (!eW()) {
/* 166 */         fm();
/* 167 */         return aou.a(this.l.v);
/*     */       } 
/*     */       
/* 170 */       if (!eM() && bmb.b() == bup.bR.h()) {
/* 171 */         t(true);
/* 172 */         eO();
/* 173 */         if (!☃.bC.d) {
/* 174 */           bmb.g(1);
/*     */         }
/* 176 */         fd();
/* 177 */         return aou.a(this.l.v);
/*     */       } 
/*     */       
/* 180 */       if (!w_() && !M_() && bmb.b() == bmd.lO) {
/* 181 */         f(☃);
/* 182 */         return aou.a(this.l.v);
/*     */       } 
/*     */     } 
/* 185 */     if (w_()) {
/* 186 */       return super.b(☃, aot1);
/*     */     }
/*     */     
/* 189 */     h(☃);
/*     */     
/* 191 */     return aou.a(this.l.v);
/*     */   }
/*     */   
/*     */   protected void eO() {
/* 195 */     a(adq.cP, 1.0F, (this.J.nextFloat() - this.J.nextFloat()) * 0.2F + 1.0F);
/*     */   }
/*     */   
/*     */   public int eU() {
/* 199 */     return 5;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bba.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */