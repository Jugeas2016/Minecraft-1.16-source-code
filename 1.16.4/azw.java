/*     */ import java.util.Random;
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
/*     */ public abstract class azw
/*     */   extends bay
/*     */ {
/*  43 */   private static final us<Boolean> b = uv.a((Class)azw.class, uu.i);
/*     */   
/*     */   public azw(aqe<? extends azw> ☃, brx brx1) {
/*  46 */     super((aqe)☃, brx1);
/*     */     
/*  48 */     this.bh = new a(this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected float b(aqx ☃, aqb aqb1) {
/*  53 */     return aqb1.b * 0.65F;
/*     */   }
/*     */   
/*     */   public static ark.a m() {
/*  57 */     return aqn.p()
/*  58 */       .a(arl.a, 3.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean K() {
/*  63 */     return (super.K() || eN());
/*     */   }
/*     */   
/*     */   public static boolean b(aqe<? extends azw> ☃, bry bry1, aqp aqp1, fx fx1, Random random) {
/*  67 */     return (bry1.d_(fx1).a(bup.A) && bry1.d_(fx1.b()).a(bup.A));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean h(double ☃) {
/*  72 */     return (!eN() && !S());
/*     */   }
/*     */ 
/*     */   
/*     */   public int eq() {
/*  77 */     return 8;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  82 */     super.e();
/*     */     
/*  84 */     this.R.a(b, Boolean.valueOf(false));
/*     */   }
/*     */   
/*     */   private boolean eN() {
/*  88 */     return ((Boolean)this.R.<Boolean>a(b)).booleanValue();
/*     */   }
/*     */   
/*     */   public void t(boolean ☃) {
/*  92 */     this.R.b(b, Boolean.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/*  97 */     super.b(☃);
/*     */     
/*  99 */     ☃.a("FromBucket", eN());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 104 */     super.a(☃);
/*     */     
/* 106 */     t(☃.q("FromBucket"));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/* 111 */     super.o();
/*     */     
/* 113 */     this.bk.a(0, new awp(this, 1.25D));
/* 114 */     this.bk.a(2, new avd<>(this, bfw.class, 8.0F, 1.6D, 1.4D, aqd.g::test));
/* 115 */     this.bk.a(4, new b(this));
/*     */   }
/*     */ 
/*     */   
/*     */   protected ayj b(brx ☃) {
/* 120 */     return new ayl(this, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void g(dcn ☃) {
/* 125 */     if (dS() && aE()) {
/* 126 */       a(0.01F, ☃);
/* 127 */       a(aqr.a, cC());
/*     */       
/* 129 */       f(cC().a(0.9D));
/* 130 */       if (A() == null) {
/* 131 */         f(cC().b(0.0D, -0.005D, 0.0D));
/*     */       }
/*     */     } else {
/* 134 */       super.g(☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 140 */     if (!aE() && this.t && this.v) {
/* 141 */       f(cC().b(((this.J
/* 142 */             .nextFloat() * 2.0F - 1.0F) * 0.05F), 0.4000000059604645D, ((this.J
/*     */             
/* 144 */             .nextFloat() * 2.0F - 1.0F) * 0.05F)));
/*     */       
/* 146 */       this.t = false;
/* 147 */       this.Z = true;
/* 148 */       a(eM(), dG(), dH());
/*     */     } 
/*     */     
/* 151 */     super.k();
/*     */   }
/*     */ 
/*     */   
/*     */   protected aou b(bfw ☃, aot aot1) {
/* 156 */     bmb bmb = ☃.b(aot1);
/* 157 */     if (bmb.b() == bmd.lL && aX()) {
/* 158 */       a(adq.bn, 1.0F, 1.0F);
/*     */       
/* 160 */       bmb.g(1);
/* 161 */       bmb bmb1 = eK();
/* 162 */       k(bmb1);
/*     */       
/* 164 */       if (!this.l.v) {
/* 165 */         ac.j.a((aah)☃, bmb1);
/*     */       }
/*     */       
/* 168 */       if (bmb.a()) {
/* 169 */         ☃.a(aot1, bmb1);
/* 170 */       } else if (!☃.bm.e(bmb1)) {
/* 171 */         ☃.a(bmb1, false);
/*     */       } 
/*     */       
/* 174 */       ad();
/*     */       
/* 176 */       return aou.a(this.l.v);
/*     */     } 
/*     */     
/* 179 */     return super.b(☃, aot1);
/*     */   }
/*     */   
/*     */   protected void k(bmb ☃) {
/* 183 */     if (S())
/* 184 */       ☃.a(T()); 
/*     */   }
/*     */   
/*     */   protected abstract bmb eK();
/*     */   
/*     */   static class b
/*     */     extends awu {
/*     */     private final azw h;
/*     */     
/*     */     public b(azw ☃) {
/* 194 */       super(☃, 1.0D, 40);
/* 195 */       this.h = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 200 */       return (this.h.eL() && super.a());
/*     */     }
/*     */   }
/*     */   
/*     */   protected boolean eL() {
/* 205 */     return true;
/*     */   }
/*     */   
/*     */   protected abstract adp eM();
/*     */   
/*     */   static class a extends avb {
/*     */     a(azw ☃) {
/* 212 */       super(☃);
/* 213 */       this.i = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 218 */       if (this.i.a(aef.b))
/*     */       {
/* 220 */         this.i.f(this.i.cC().b(0.0D, 0.005D, 0.0D));
/*     */       }
/*     */       
/* 223 */       if (this.h != avb.a.b || this.i.x().m()) {
/* 224 */         this.i.q(0.0F);
/*     */         
/*     */         return;
/*     */       } 
/* 228 */       float ☃ = (float)(this.e * this.i.b(arl.d));
/* 229 */       this.i.q(afm.g(0.125F, this.i.dN(), ☃));
/*     */       
/* 231 */       double d1 = this.b - this.i.cD();
/* 232 */       double d2 = this.c - this.i.cE();
/* 233 */       double d3 = this.d - this.i.cH();
/*     */       
/* 235 */       if (d2 != 0.0D) {
/* 236 */         double d = afm.a(d1 * d1 + d2 * d2 + d3 * d3);
/*     */         
/* 238 */         this.i.f(this.i.cC().b(0.0D, this.i.dN() * d2 / d * 0.1D, 0.0D));
/*     */       } 
/*     */       
/* 241 */       if (d1 != 0.0D || d3 != 0.0D) {
/* 242 */         float f = (float)(afm.d(d3, d1) * 57.2957763671875D) - 90.0F;
/*     */         
/* 244 */         this.i.p = a(this.i.p, f, 90.0F);
/* 245 */         this.i.aA = this.i.p;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     private final azw i;
/*     */   }
/*     */   
/*     */   protected adp av() {
/* 254 */     return adq.ek;
/*     */   }
/*     */   
/*     */   protected void b(fx ☃, ceh ceh1) {}
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\azw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */