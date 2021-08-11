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
/*     */ public class ejk
/*     */   extends efr<dzj, dvd<dzj>>
/*     */ {
/*     */   public ejk(eet ☃) {
/*  44 */     this(☃, false);
/*     */   }
/*     */   
/*     */   public ejk(eet ☃, boolean bool) {
/*  48 */     super(☃, new dvd<>(0.0F, bool), 0.5F);
/*     */     
/*  50 */     a(new eik<>(this, new dum<>(0.5F), new dum<>(1.0F)));
/*  51 */     a(new ein<>(this));
/*  52 */     a(new ehs<>(this));
/*  53 */     a(new eia(this));
/*  54 */     a(new ehu(this));
/*  55 */     a(new ehz<>(this));
/*  56 */     a(new eid<>(this));
/*  57 */     a(new eir<>(this));
/*  58 */     a(new eja<>(this));
/*  59 */     a(new eht<>(this));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dzj ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/*  64 */     b(☃);
/*  65 */     super.a(☃, f1, f2, dfm1, eag1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public dcn a(dzj ☃, float f) {
/*  70 */     if (☃.bz()) {
/*  71 */       return new dcn(0.0D, -0.125D, 0.0D);
/*     */     }
/*     */     
/*  74 */     return super.a(☃, f);
/*     */   }
/*     */   
/*     */   private void b(dzj ☃) {
/*  78 */     dvd<dzj> dvd = c();
/*  79 */     if (☃.a_()) {
/*  80 */       dvd.d_(false);
/*  81 */       dvd.f.h = true;
/*  82 */       dvd.g.h = true;
/*     */     } else {
/*  84 */       dvd.d_(true);
/*     */       
/*  86 */       dvd.g.h = ☃.a(bfx.g);
/*  87 */       dvd.x.h = ☃.a(bfx.b);
/*  88 */       dvd.v.h = ☃.a(bfx.e);
/*  89 */       dvd.w.h = ☃.a(bfx.f);
/*  90 */       dvd.t.h = ☃.a(bfx.c);
/*  91 */       dvd.u.h = ☃.a(bfx.d);
/*     */       
/*  93 */       dvd.o = ☃.bz();
/*     */       
/*  95 */       dum.a a1 = a(☃, aot.a);
/*  96 */       dum.a a2 = a(☃, aot.b);
/*     */ 
/*     */       
/*  99 */       if (a1.a()) {
/* 100 */         a2 = ☃.dE().a() ? dum.a.a : dum.a.b;
/*     */       }
/*     */       
/* 103 */       if (☃.dV() == aqi.b) {
/* 104 */         dvd.n = a1;
/* 105 */         dvd.m = a2;
/*     */       } else {
/* 107 */         dvd.n = a2;
/* 108 */         dvd.m = a1;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static dum.a a(dzj ☃, aot aot1) {
/* 115 */     bmb bmb = ☃.b(aot1);
/* 116 */     if (bmb.a()) {
/* 117 */       return dum.a.a;
/*     */     }
/*     */     
/* 120 */     if (☃.dX() == aot1 && ☃.dZ() > 0) {
/* 121 */       bnn bnn = bmb.l();
/* 122 */       if (bnn == bnn.d)
/* 123 */         return dum.a.c; 
/* 124 */       if (bnn == bnn.e)
/* 125 */         return dum.a.d; 
/* 126 */       if (bnn == bnn.f)
/* 127 */         return dum.a.e; 
/* 128 */       if (bnn == bnn.g && aot1 == ☃.dX()) {
/* 129 */         return dum.a.f;
/*     */       }
/*     */     }
/* 132 */     else if (!☃.ai && bmb.b() == bmd.qQ && bkt.d(bmb)) {
/* 133 */       return dum.a.g;
/*     */     } 
/*     */ 
/*     */     
/* 137 */     return dum.a.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public vk a(dzj ☃) {
/* 142 */     return ☃.o();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dzj ☃, dfm dfm1, float f) {
/* 147 */     float f1 = 0.9375F;
/* 148 */     dfm1.a(0.9375F, 0.9375F, 0.9375F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dzj ☃, nr nr1, dfm dfm1, eag eag1, int i) {
/* 153 */     double d = this.b.b(☃);
/*     */     
/* 155 */     dfm1.a();
/* 156 */     if (d < 100.0D) {
/* 157 */       ddn ddn = ☃.eN();
/* 158 */       ddk ddk = ddn.a(2);
/* 159 */       if (ddk != null) {
/* 160 */         ddm ddm = ddn.c(☃.bU(), ddk);
/* 161 */         super.a(☃, (new oe(Integer.toString(ddm.b()))).c(" ").a(ddk.d()), dfm1, eag1, i);
/* 162 */         a().getClass(); dfm1.a(0.0D, (9.0F * 1.15F * 0.025F), 0.0D);
/*     */       } 
/*     */     } 
/*     */     
/* 166 */     super.a(☃, nr1, dfm1, eag1, i);
/* 167 */     dfm1.b();
/*     */   }
/*     */   
/*     */   public void a(dfm ☃, eag eag1, int i, dzj dzj1) {
/* 171 */     a(☃, eag1, i, dzj1, this.e.i, this.e.u);
/*     */   }
/*     */   
/*     */   public void b(dfm ☃, eag eag1, int i, dzj dzj1) {
/* 175 */     a(☃, eag1, i, dzj1, this.e.j, this.e.t);
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, eag eag1, int i, dzj dzj1, dwn dwn1, dwn dwn2) {
/* 179 */     dvd<dzj> dvd = c();
/* 180 */     b(dzj1);
/*     */     
/* 182 */     dvd.c = 0.0F;
/* 183 */     dvd.o = false;
/* 184 */     dvd.p = 0.0F;
/* 185 */     dvd.a(dzj1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 186 */     dwn1.d = 0.0F;
/* 187 */     dwn1.a(☃, eag1.getBuffer(eao.b(dzj1.o())), i, ejw.a);
/* 188 */     dwn2.d = 0.0F;
/* 189 */     dwn2.a(☃, eag1.getBuffer(eao.h(dzj1.o())), i, ejw.a);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dzj ☃, dfm dfm1, float f1, float f2, float f3) {
/* 194 */     float f = ☃.a(f3);
/* 195 */     if (☃.ef()) {
/* 196 */       super.a(☃, dfm1, f1, f2, f3);
/*     */       
/* 198 */       float f4 = ☃.eg() + f3;
/* 199 */       float f5 = afm.a(f4 * f4 / 100.0F, 0.0F, 1.0F);
/*     */       
/* 201 */       if (!☃.dR()) {
/* 202 */         dfm1.a(g.b.a(f5 * (-90.0F - ☃.q)));
/*     */       }
/*     */       
/* 205 */       dcn dcn1 = ☃.f(f3);
/* 206 */       dcn dcn2 = ☃.cC();
/* 207 */       double d1 = aqa.c(dcn2);
/* 208 */       double d2 = aqa.c(dcn1);
/* 209 */       if (d1 > 0.0D && d2 > 0.0D) {
/* 210 */         double d3 = (dcn2.b * dcn1.b + dcn2.d * dcn1.d) / Math.sqrt(d1 * d2);
/* 211 */         double d4 = dcn2.b * dcn1.d - dcn2.d * dcn1.b;
/* 212 */         dfm1.a(g.d.c((float)(Math.signum(d4) * Math.acos(d3))));
/*     */       } 
/* 214 */     } else if (f > 0.0F) {
/* 215 */       super.a(☃, dfm1, f1, f2, f3);
/*     */ 
/*     */ 
/*     */       
/* 219 */       float f4 = ☃.aE() ? (-90.0F - ☃.q) : -90.0F;
/*     */ 
/*     */       
/* 222 */       float f5 = afm.g(f, 0.0F, f4);
/* 223 */       dfm1.a(g.b.a(f5));
/*     */       
/* 225 */       if (☃.bC())
/*     */       {
/* 227 */         dfm1.a(0.0D, -1.0D, 0.30000001192092896D);
/*     */       }
/*     */     } else {
/* 230 */       super.a(☃, dfm1, f1, f2, f3);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ejk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */