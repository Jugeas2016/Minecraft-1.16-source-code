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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bgy
/*     */   extends bga
/*     */ {
/*  30 */   private static final us<Byte> g = uv.a((Class)bgy.class, uu.a);
/*  31 */   private static final us<Boolean> ag = uv.a((Class)bgy.class, uu.i);
/*     */   
/*  33 */   private bmb ah = new bmb(bmd.qM);
/*     */   
/*     */   private boolean ai;
/*     */   public int f;
/*     */   
/*     */   public bgy(aqe<? extends bgy> ☃, brx brx1) {
/*  39 */     super((aqe)☃, brx1);
/*     */   }
/*     */   
/*     */   public bgy(brx ☃, aqm aqm1, bmb bmb1) {
/*  43 */     super((aqe)aqe.aK, aqm1, ☃);
/*  44 */     this.ah = bmb1.i();
/*  45 */     this.R.b(g, Byte.valueOf((byte)bpu.f(bmb1)));
/*  46 */     this.R.b(ag, Boolean.valueOf(bmb1.u()));
/*     */   }
/*     */   
/*     */   public bgy(brx ☃, double d1, double d2, double d3) {
/*  50 */     super((aqe)aqe.aK, d1, d2, d3, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  55 */     super.e();
/*     */     
/*  57 */     this.R.a(g, Byte.valueOf((byte)0));
/*  58 */     this.R.a(ag, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/*  63 */     if (this.c > 4) {
/*  64 */       this.ai = true;
/*     */     }
/*     */     
/*  67 */     aqa ☃ = v();
/*  68 */     if ((this.ai || t()) && ☃ != null) {
/*  69 */       int i = ((Byte)this.R.<Byte>a(g)).byteValue();
/*  70 */       if (i > 0 && !z()) {
/*  71 */         if (!this.l.v && this.d == bga.a.b) {
/*  72 */           a(m(), 0.1F);
/*     */         }
/*  74 */         ad();
/*  75 */       } else if (i > 0) {
/*  76 */         o(true);
/*  77 */         dcn dcn = new dcn(☃.cD() - cD(), ☃.cG() - cE(), ☃.cH() - cH());
/*  78 */         o(cD(), cE() + dcn.c * 0.015D * i, cH());
/*  79 */         if (this.l.v) {
/*  80 */           this.E = cE();
/*     */         }
/*  82 */         double d = 0.05D * i;
/*  83 */         f(cC().a(0.95D).e(dcn.d().a(d)));
/*     */         
/*  85 */         if (this.f == 0) {
/*  86 */           a(adq.pf, 10.0F, 1.0F);
/*     */         }
/*     */         
/*  89 */         this.f++;
/*     */       } 
/*     */     } 
/*     */     
/*  93 */     super.j();
/*     */   }
/*     */   
/*     */   private boolean z() {
/*  97 */     aqa ☃ = v();
/*  98 */     if (☃ == null || !☃.aX()) {
/*  99 */       return false;
/*     */     }
/* 101 */     if (☃ instanceof aah && ☃.a_()) {
/* 102 */       return false;
/*     */     }
/* 104 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected bmb m() {
/* 109 */     return this.ah.i();
/*     */   }
/*     */   
/*     */   public boolean u() {
/* 113 */     return ((Boolean)this.R.<Boolean>a(ag)).booleanValue();
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected dck a(dcn ☃, dcn dcn1) {
/* 119 */     if (this.ai) {
/* 120 */       return null;
/*     */     }
/* 122 */     return super.a(☃, dcn1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dck ☃) {
/* 127 */     aqa aqa1 = ☃.a();
/* 128 */     float f1 = 8.0F;
/*     */     
/* 130 */     if (aqa1 instanceof aqm) {
/* 131 */       aqm aqm = (aqm)aqa1;
/* 132 */       f1 += bpu.a(this.ah, aqm.dC());
/*     */     } 
/*     */     
/* 135 */     aqa aqa2 = v();
/* 136 */     apk apk = apk.a(this, (aqa2 == null) ? this : aqa2);
/*     */     
/* 138 */     this.ai = true;
/* 139 */     adp adp = adq.pd;
/*     */     
/* 141 */     if (aqa1.a(apk, f1)) {
/* 142 */       if (aqa1.X() == aqe.u) {
/*     */         return;
/*     */       }
/* 145 */       if (aqa1 instanceof aqm) {
/* 146 */         aqm aqm = (aqm)aqa1;
/* 147 */         if (aqa2 instanceof aqm) {
/* 148 */           bpu.a(aqm, aqa2);
/* 149 */           bpu.b((aqm)aqa2, aqm);
/*     */         } 
/* 151 */         a(aqm);
/*     */       } 
/*     */     } 
/*     */     
/* 155 */     f(cC().d(-0.01D, -0.1D, -0.01D));
/*     */     
/* 157 */     float f2 = 1.0F;
/* 158 */     if (this.l instanceof aag && this.l.W() && bpu.h(this.ah)) {
/* 159 */       fx fx = aqa1.cB();
/* 160 */       if (this.l.e(fx)) {
/* 161 */         aql aql = aqe.P.a(this.l);
/* 162 */         aql.d(dcn.c(fx));
/* 163 */         aql.d((aqa2 instanceof aah) ? (aah)aqa2 : null);
/* 164 */         this.l.c(aql);
/* 165 */         adp = adq.pk;
/* 166 */         f2 = 5.0F;
/*     */       } 
/*     */     } 
/* 169 */     a(adp, f2, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp i() {
/* 174 */     return adq.pe;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a_(bfw ☃) {
/* 179 */     aqa aqa = v();
/*     */     
/* 181 */     if (aqa != null && aqa.bS() != ☃.bS()) {
/*     */       return;
/*     */     }
/* 184 */     super.a_(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 189 */     super.a(☃);
/*     */     
/* 191 */     if (☃.c("Trident", 10)) {
/* 192 */       this.ah = bmb.a(☃.p("Trident"));
/*     */     }
/* 194 */     this.ai = ☃.q("DealtDamage");
/*     */     
/* 196 */     this.R.b(g, Byte.valueOf((byte)bpu.f(this.ah)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 201 */     super.b(☃);
/*     */     
/* 203 */     ☃.a("Trident", this.ah.b(new md()));
/* 204 */     ☃.a("DealtDamage", this.ai);
/*     */   }
/*     */ 
/*     */   
/*     */   public void h() {
/* 209 */     int ☃ = ((Byte)this.R.<Byte>a(g)).byteValue();
/*     */     
/* 211 */     if (this.d != bga.a.b || ☃ <= 0) {
/* 212 */       super.h();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected float s() {
/* 218 */     return 0.99F;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean j(double ☃, double d1, double d2) {
/* 223 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bgy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */