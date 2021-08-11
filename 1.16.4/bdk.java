/*     */ import java.util.EnumSet;
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
/*     */ public class bdk
/*     */   extends aqh
/*     */   implements bdi
/*     */ {
/*  39 */   private static final us<Boolean> b = uv.a((Class)bdk.class, uu.i);
/*     */   
/*  41 */   private int c = 1;
/*     */   
/*     */   public bdk(aqe<? extends bdk> ☃, brx brx1) {
/*  44 */     super((aqe)☃, brx1);
/*     */     
/*  46 */     this.f = 5;
/*     */     
/*  48 */     this.bh = new b(this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  53 */     this.bk.a(5, new d(this));
/*     */     
/*  55 */     this.bk.a(7, new a(this));
/*  56 */     this.bk.a(7, new c(this));
/*     */ 
/*     */     
/*  59 */     this.bl.a(1, new axq<>(this, bfw.class, 10, true, false, ☃ -> (Math.abs(☃.cE() - cE()) <= 4.0D)));
/*     */   }
/*     */   
/*     */   public boolean m() {
/*  63 */     return ((Boolean)this.R.<Boolean>a(b)).booleanValue();
/*     */   }
/*     */   
/*     */   public void t(boolean ☃) {
/*  67 */     this.R.b(b, Boolean.valueOf(☃));
/*     */   }
/*     */   
/*     */   public int eI() {
/*  71 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean L() {
/*  76 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/*  81 */     if (b(☃)) {
/*  82 */       return false;
/*     */     }
/*  84 */     if (☃.j() instanceof bgk && 
/*  85 */       ☃.k() instanceof bfw) {
/*     */       
/*  87 */       super.a(☃, 1000.0F);
/*  88 */       return true;
/*     */     } 
/*     */ 
/*     */     
/*  92 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  97 */     super.e();
/*     */     
/*  99 */     this.R.a(b, Boolean.valueOf(false));
/*     */   }
/*     */   
/*     */   public static ark.a eJ() {
/* 103 */     return aqn.p()
/* 104 */       .a(arl.a, 10.0D)
/* 105 */       .a(arl.b, 100.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public adr cu() {
/* 110 */     return adr.f;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 115 */     return adq.eR;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 120 */     return adq.eT;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 125 */     return adq.eS;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float dG() {
/* 130 */     return 5.0F;
/*     */   }
/*     */   
/*     */   public static boolean b(aqe<bdk> ☃, bry bry1, aqp aqp1, fx fx1, Random random) {
/* 134 */     return (bry1.ad() != aor.a && random
/* 135 */       .nextInt(20) == 0 && 
/* 136 */       a((aqe)☃, bry1, aqp1, fx1, random));
/*     */   }
/*     */ 
/*     */   
/*     */   public int eq() {
/* 141 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 146 */     super.b(☃);
/* 147 */     ☃.b("ExplosionPower", this.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 152 */     super.a(☃);
/* 153 */     if (☃.c("ExplosionPower", 99))
/* 154 */       this.c = ☃.h("ExplosionPower"); 
/*     */   }
/*     */   
/*     */   static class b
/*     */     extends avb {
/*     */     private final bdk i;
/*     */     private int j;
/*     */     
/*     */     public b(bdk ☃) {
/* 163 */       super(☃);
/* 164 */       this.i = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 169 */       if (this.h != avb.a.b) {
/*     */         return;
/*     */       }
/*     */ 
/*     */       
/* 174 */       if (this.j-- <= 0) {
/* 175 */         this.j += this.i.cY().nextInt(5) + 2;
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 180 */         dcn ☃ = new dcn(this.b - this.i.cD(), this.c - this.i.cE(), this.d - this.i.cH());
/*     */         
/* 182 */         double d = ☃.f();
/* 183 */         ☃ = ☃.d();
/*     */         
/* 185 */         if (a(☃, afm.f(d))) {
/* 186 */           this.i.f(this.i.cC().e(☃.a(0.1D)));
/*     */         } else {
/* 188 */           this.h = avb.a.a;
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     private boolean a(dcn ☃, int i) {
/* 194 */       dci dci = this.i.cc();
/* 195 */       for (int j = 1; j < i; j++) {
/* 196 */         dci = dci.c(☃);
/* 197 */         if (!this.i.l.a_(this.i, dci)) {
/* 198 */           return false;
/*     */         }
/*     */       } 
/*     */       
/* 202 */       return true;
/*     */     }
/*     */   }
/*     */   
/*     */   static class d extends avv {
/*     */     private final bdk a;
/*     */     
/*     */     public d(bdk ☃) {
/* 210 */       this.a = ☃;
/*     */       
/* 212 */       a(EnumSet.of(avv.a.a));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 217 */       avb ☃ = this.a.u();
/* 218 */       if (!☃.b()) {
/* 219 */         return true;
/*     */       }
/*     */       
/* 222 */       double d1 = ☃.d() - this.a.cD();
/* 223 */       double d2 = ☃.e() - this.a.cE();
/* 224 */       double d3 = ☃.f() - this.a.cH();
/*     */       
/* 226 */       double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/*     */       
/* 228 */       if (d4 < 1.0D || d4 > 3600.0D) {
/* 229 */         return true;
/*     */       }
/*     */       
/* 232 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 237 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 242 */       Random ☃ = this.a.cY();
/* 243 */       double d1 = this.a.cD() + ((☃.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 244 */       double d2 = this.a.cE() + ((☃.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 245 */       double d3 = this.a.cH() + ((☃.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 246 */       this.a.u().a(d1, d2, d3, 1.0D);
/*     */     }
/*     */   }
/*     */   
/*     */   static class a extends avv {
/*     */     private final bdk a;
/*     */     
/*     */     public a(bdk ☃) {
/* 254 */       this.a = ☃;
/*     */       
/* 256 */       a(EnumSet.of(avv.a.b));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 261 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 266 */       if (this.a.A() == null) {
/* 267 */         dcn ☃ = this.a.cC();
/* 268 */         this.a.p = -((float)afm.d(☃.b, ☃.d)) * 57.295776F;
/* 269 */         this.a.aA = this.a.p;
/*     */       } else {
/* 271 */         aqm ☃ = this.a.A();
/*     */         
/* 273 */         double d = 64.0D;
/* 274 */         if (☃.h(this.a) < 4096.0D) {
/* 275 */           double d1 = ☃.cD() - this.a.cD();
/* 276 */           double d2 = ☃.cH() - this.a.cH();
/* 277 */           this.a.p = -((float)afm.d(d1, d2)) * 57.295776F;
/* 278 */           this.a.aA = this.a.p;
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   static class c extends avv {
/*     */     private final bdk b;
/*     */     public int a;
/*     */     
/*     */     public c(bdk ☃) {
/* 289 */       this.b = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 294 */       return (this.b.A() != null);
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 299 */       this.a = 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 304 */       this.b.t(false);
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 309 */       aqm ☃ = this.b.A();
/*     */       
/* 311 */       double d = 64.0D;
/* 312 */       if (☃.h(this.b) < 4096.0D && this.b.D(☃)) {
/* 313 */         brx brx = this.b.l;
/*     */         
/* 315 */         this.a++;
/* 316 */         if (this.a == 10 && !this.b.aA()) {
/* 317 */           brx.a((bfw)null, 1015, this.b.cB(), 0);
/*     */         }
/* 319 */         if (this.a == 20) {
/* 320 */           double d1 = 4.0D;
/* 321 */           dcn dcn = this.b.f(1.0F);
/*     */           
/* 323 */           double d2 = ☃.cD() - this.b.cD() + dcn.b * 4.0D;
/* 324 */           double d3 = ☃.e(0.5D) - 0.5D + this.b.e(0.5D);
/* 325 */           double d4 = ☃.cH() - this.b.cH() + dcn.d * 4.0D;
/*     */           
/* 327 */           if (!this.b.aA()) {
/* 328 */             brx.a((bfw)null, 1016, this.b.cB(), 0);
/*     */           }
/* 330 */           bgk bgk = new bgk(brx, this.b, d2, d3, d4);
/* 331 */           bgk.e = this.b.eI();
/* 332 */           bgk.d(this.b.cD() + dcn.b * 4.0D, this.b.e(0.5D) + 0.5D, bgk.cH() + dcn.d * 4.0D);
/* 333 */           brx.c(bgk);
/* 334 */           this.a = -40;
/*     */         } 
/* 336 */       } else if (this.a > 0) {
/* 337 */         this.a--;
/*     */       } 
/* 339 */       this.b.t((this.a > 10));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected float b(aqx ☃, aqb aqb1) {
/* 345 */     return 2.6F;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bdk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */