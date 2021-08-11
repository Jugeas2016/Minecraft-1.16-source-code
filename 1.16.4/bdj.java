/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public class bdj
/*     */   extends bea
/*     */ {
/*     */   private bas bo;
/*     */   
/*     */   public bdj(aqe<? extends bdj> ☃, brx brx1) {
/*  47 */     super((aqe)☃, brx1);
/*     */     
/*  49 */     this.f = 10;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  54 */     super.o();
/*     */     
/*  56 */     this.bk.a(0, new avp(this));
/*  57 */     this.bk.a(1, new b());
/*  58 */     this.bk.a(2, new avd<>(this, bfw.class, 8.0F, 0.6D, 1.0D));
/*  59 */     this.bk.a(4, new c());
/*  60 */     this.bk.a(5, new a());
/*  61 */     this.bk.a(6, new d(this));
/*  62 */     this.bk.a(8, new awt(this, 0.6D));
/*  63 */     this.bk.a(9, new awd(this, (Class)bfw.class, 3.0F, 1.0F));
/*  64 */     this.bk.a(10, new awd(this, (Class)aqn.class, 8.0F));
/*     */     
/*  66 */     this.bl.a(1, (new axp(this, new Class[] { bhc.class })).a(new Class[0]));
/*  67 */     this.bl.a(2, (new axq<>(this, (Class)bfw.class, true)).a(300));
/*  68 */     this.bl.a(3, (new axq<>(this, (Class)bfe.class, false)).a(300));
/*  69 */     this.bl.a(3, new axq<>(this, bai.class, false));
/*     */   }
/*     */   
/*     */   public static ark.a eK() {
/*  73 */     return bdq.eR()
/*  74 */       .a(arl.d, 0.5D)
/*  75 */       .a(arl.b, 12.0D)
/*  76 */       .a(arl.a, 24.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  81 */     super.e();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/*  86 */     super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public adp eL() {
/*  91 */     return adq.dO;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/*  96 */     super.b(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void N() {
/* 101 */     super.N();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean r(aqa ☃) {
/* 106 */     if (☃ == null) {
/* 107 */       return false;
/*     */     }
/* 109 */     if (☃ == this) {
/* 110 */       return true;
/*     */     }
/* 112 */     if (super.r(☃)) {
/* 113 */       return true;
/*     */     }
/* 115 */     if (☃ instanceof bee) {
/* 116 */       return r(((bee)☃).eK());
/*     */     }
/* 118 */     if (☃ instanceof aqm && ((aqm)☃).dC() == aqq.d)
/*     */     {
/* 120 */       return (bG() == null && ☃.bG() == null);
/*     */     }
/* 122 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 127 */     return adq.dM;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 132 */     return adq.dP;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 137 */     return adq.dR;
/*     */   }
/*     */   
/*     */   private void a(@Nullable bas ☃) {
/* 141 */     this.bo = ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private bas fg() {
/* 146 */     return this.bo;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp eM() {
/* 151 */     return adq.dN;
/*     */   }
/*     */   
/*     */   public void a(int ☃, boolean bool) {}
/*     */   
/*     */   class b
/*     */     extends bea.b {
/*     */     private b(bdj this$0) {}
/*     */     
/*     */     public void e() {
/* 161 */       if (this.a.A() != null) {
/* 162 */         this.a.t().a(this.a.A(), this.a.Q(), this.a.O());
/* 163 */       } else if (bdj.a(this.a) != null) {
/* 164 */         this.a.t().a(bdj.a(this.a), this.a.Q(), this.a.O());
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   class a extends bea.c { private a(bdj this$0) {}
/*     */     
/*     */     protected int g() {
/* 172 */       return 40;
/*     */     }
/*     */ 
/*     */     
/*     */     protected int h() {
/* 177 */       return 100;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     protected void j() {
/* 183 */       aqm ☃ = this.a.A();
/* 184 */       double d1 = Math.min(☃.cE(), this.a.cE());
/* 185 */       double d2 = Math.max(☃.cE(), this.a.cE()) + 1.0D;
/* 186 */       float f = (float)afm.d(☃.cH() - this.a.cH(), ☃.cD() - this.a.cD());
/* 187 */       if (this.a.h(☃) < 9.0D) {
/*     */         int i;
/* 189 */         for (i = 0; i < 5; i++) {
/* 190 */           float f1 = f + i * 3.1415927F * 0.4F;
/* 191 */           a(this.a.cD() + afm.b(f1) * 1.5D, this.a.cH() + afm.a(f1) * 1.5D, d1, d2, f1, 0);
/*     */         } 
/*     */         
/* 194 */         for (i = 0; i < 8; i++) {
/* 195 */           float f1 = f + i * 3.1415927F * 2.0F / 8.0F + 1.2566371F;
/* 196 */           a(this.a.cD() + afm.b(f1) * 2.5D, this.a.cH() + afm.a(f1) * 2.5D, d1, d2, f1, 3);
/*     */         } 
/*     */       } else {
/*     */         
/* 200 */         for (int i = 0; i < 16; i++) {
/* 201 */           double d = 1.25D * (i + 1);
/* 202 */           int j = 1 * i;
/* 203 */           a(this.a.cD() + afm.b(f) * d, this.a.cH() + afm.a(f) * d, d1, d2, f, j);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     private void a(double ☃, double d1, double d2, double d3, float f, int i) {
/* 210 */       fx fx = new fx(☃, d3, d1);
/* 211 */       boolean bool = false;
/* 212 */       double d = 0.0D;
/*     */       do {
/* 214 */         fx fx1 = fx.c();
/* 215 */         ceh ceh = this.a.l.d_(fx1);
/* 216 */         if (ceh.d(this.a.l, fx1, gc.b)) {
/* 217 */           if (!this.a.l.w(fx)) {
/* 218 */             ceh ceh1 = this.a.l.d_(fx);
/* 219 */             ddh ddh = ceh1.k(this.a.l, fx);
/* 220 */             if (!ddh.b()) {
/* 221 */               d = ddh.c(gc.a.b);
/*     */             }
/*     */           } 
/* 224 */           bool = true;
/*     */           break;
/*     */         } 
/* 227 */         fx = fx.c();
/* 228 */       } while (fx.v() >= afm.c(d2) - 1);
/* 229 */       if (bool) {
/* 230 */         this.a.l.c(new bge(this.a.l, ☃, fx.v() + d, d1, f, i, this.a));
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     protected adp k() {
/* 236 */       return adq.dS;
/*     */     }
/*     */ 
/*     */     
/*     */     protected bea.a l() {
/* 241 */       return bea.a.c;
/*     */     } }
/*     */   class c extends bea.c { private final azg e;
/*     */     
/*     */     private c(bdj this$0) {
/* 246 */       this.e = (new azg()).a(16.0D).c().e().a().b();
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 250 */       if (!super.a()) {
/* 251 */         return false;
/*     */       }
/*     */ 
/*     */       
/* 255 */       int ☃ = this.a.l.<bee>a(bee.class, this.e, this.a, this.a.cc().g(16.0D)).size();
/* 256 */       return (bdj.b(this.a).nextInt(8) + 1 > ☃);
/*     */     }
/*     */ 
/*     */     
/*     */     protected int g() {
/* 261 */       return 100;
/*     */     }
/*     */ 
/*     */     
/*     */     protected int h() {
/* 266 */       return 340;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void j() {
/* 271 */       aag ☃ = (aag)this.a.l;
/* 272 */       for (int i = 0; i < 3; i++) {
/* 273 */         fx fx = this.a.cB().b(-2 + bdj.c(this.a).nextInt(5), 1, -2 + bdj.d(this.a).nextInt(5));
/* 274 */         bee bee = aqe.aO.a(this.a.l);
/* 275 */         bee.a(fx, 0.0F, 0.0F);
/* 276 */         bee.a(☃, this.a.l.d(fx), aqp.f, (arc)null, (md)null);
/* 277 */         bee.a(this.a);
/* 278 */         bee.g(fx);
/* 279 */         bee.a(20 * (30 + bdj.e(this.a).nextInt(90)));
/* 280 */         ☃.l(bee);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     protected adp k() {
/* 286 */       return adq.dT;
/*     */     }
/*     */ 
/*     */     
/*     */     protected bea.a l() {
/* 291 */       return bea.a.b;
/*     */     } }
/*     */   
/*     */   public class d extends bea.c { public d(bdj ☃) {
/* 295 */       super(☃);
/* 296 */       this.e = (new azg()).a(16.0D).a().a(☃ -> (((bas)☃).eL() == bkx.l));
/*     */     }
/*     */     private final azg e;
/*     */     public boolean a() {
/* 300 */       if (this.a.A() != null)
/*     */       {
/* 302 */         return false;
/*     */       }
/* 304 */       if (this.a.eW())
/*     */       {
/* 306 */         return false;
/*     */       }
/* 308 */       if (this.a.K < this.c) {
/* 309 */         return false;
/*     */       }
/* 311 */       if (!this.a.l.V().b(brt.b)) {
/* 312 */         return false;
/*     */       }
/*     */       
/* 315 */       List<bas> ☃ = this.a.l.a(bas.class, this.e, this.a, this.a.cc().c(16.0D, 4.0D, 16.0D));
/*     */       
/* 317 */       if (☃.isEmpty()) {
/* 318 */         return false;
/*     */       }
/* 320 */       bdj.a(this.a, ☃.get(bdj.f(this.a).nextInt(☃.size())));
/* 321 */       return true;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 327 */       return (bdj.a(this.a) != null && this.b > 0);
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 332 */       super.d();
/* 333 */       bdj.a(this.a, (bas)null);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void j() {
/* 338 */       bas ☃ = bdj.a(this.a);
/* 339 */       if (☃ != null && ☃.aX()) {
/* 340 */         ☃.b(bkx.o);
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     protected int m() {
/* 346 */       return 40;
/*     */     }
/*     */ 
/*     */     
/*     */     protected int g() {
/* 351 */       return 60;
/*     */     }
/*     */ 
/*     */     
/*     */     protected int h() {
/* 356 */       return 140;
/*     */     }
/*     */ 
/*     */     
/*     */     protected adp k() {
/* 361 */       return adq.dU;
/*     */     }
/*     */ 
/*     */     
/*     */     protected bea.a l() {
/* 366 */       return bea.a.d;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bdj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */