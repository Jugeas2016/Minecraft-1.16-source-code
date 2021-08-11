/*     */ import java.util.EnumSet;
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
/*     */ public class bee
/*     */   extends bdq
/*     */ {
/*  44 */   protected static final us<Byte> b = uv.a((Class)bee.class, uu.a);
/*     */   
/*     */   private aqn c;
/*     */   
/*     */   @Nullable
/*     */   private fx d;
/*     */   
/*     */   private boolean bo;
/*     */   private int bp;
/*     */   
/*     */   public bee(aqe<? extends bee> ☃, brx brx1) {
/*  55 */     super((aqe)☃, brx1);
/*     */     
/*  57 */     this.bh = new c(this, this);
/*     */     
/*  59 */     this.f = 3;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqr ☃, dcn dcn1) {
/*  64 */     super.a(☃, dcn1);
/*     */     
/*  66 */     ay();
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/*  71 */     this.H = true;
/*  72 */     super.j();
/*  73 */     this.H = false;
/*     */     
/*  75 */     e(true);
/*     */     
/*  77 */     if (this.bo && 
/*  78 */       --this.bp <= 0) {
/*  79 */       this.bp = 20;
/*  80 */       a(apk.i, 1.0F);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void o() {
/*  87 */     super.o();
/*     */     
/*  89 */     this.bk.a(0, new avp(this));
/*  90 */     this.bk.a(4, new a(this));
/*  91 */     this.bk.a(8, new d(this));
/*  92 */     this.bk.a(9, new awd(this, (Class)bfw.class, 3.0F, 1.0F));
/*  93 */     this.bk.a(10, new awd(this, (Class)aqn.class, 8.0F));
/*     */     
/*  95 */     this.bl.a(1, (new axp(this, new Class[] { bhc.class })).a(new Class[0]));
/*  96 */     this.bl.a(2, new b(this, this));
/*  97 */     this.bl.a(3, new axq<>(this, bfw.class, true));
/*     */   }
/*     */   
/*     */   public static ark.a m() {
/* 101 */     return bdq.eR()
/* 102 */       .a(arl.a, 14.0D)
/* 103 */       .a(arl.f, 4.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 108 */     super.e();
/*     */     
/* 110 */     this.R.a(b, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 115 */     super.a(☃);
/*     */     
/* 117 */     if (☃.e("BoundX")) {
/* 118 */       this.d = new fx(☃.h("BoundX"), ☃.h("BoundY"), ☃.h("BoundZ"));
/*     */     }
/* 120 */     if (☃.e("LifeTicks")) {
/* 121 */       a(☃.h("LifeTicks"));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 127 */     super.b(☃);
/*     */     
/* 129 */     if (this.d != null) {
/* 130 */       ☃.b("BoundX", this.d.u());
/* 131 */       ☃.b("BoundY", this.d.v());
/* 132 */       ☃.b("BoundZ", this.d.w());
/*     */     } 
/* 134 */     if (this.bo) {
/* 135 */       ☃.b("LifeTicks", this.bp);
/*     */     }
/*     */   }
/*     */   
/*     */   public aqn eK() {
/* 140 */     return this.c;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public fx eL() {
/* 145 */     return this.d;
/*     */   }
/*     */   
/*     */   public void g(@Nullable fx ☃) {
/* 149 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   private boolean b(int ☃) {
/* 153 */     int i = ((Byte)this.R.<Byte>a(b)).byteValue();
/* 154 */     return ((i & ☃) != 0);
/*     */   }
/*     */   
/*     */   private void a(int ☃, boolean bool) {
/* 158 */     int i = ((Byte)this.R.<Byte>a(b)).byteValue();
/* 159 */     if (bool) {
/* 160 */       i |= ☃;
/*     */     } else {
/* 162 */       i &= ☃ ^ 0xFFFFFFFF;
/*     */     } 
/* 164 */     this.R.b(b, Byte.valueOf((byte)(i & 0xFF)));
/*     */   }
/*     */   
/*     */   public boolean eM() {
/* 168 */     return b(1);
/*     */   }
/*     */   
/*     */   public void t(boolean ☃) {
/* 172 */     a(1, ☃);
/*     */   }
/*     */   
/*     */   public void a(aqn ☃) {
/* 176 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 180 */     this.bo = true;
/* 181 */     this.bp = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 186 */     return adq.pO;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 191 */     return adq.pQ;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 196 */     return adq.pR;
/*     */   }
/*     */ 
/*     */   
/*     */   public float aR() {
/* 201 */     return 1.0F;
/*     */   }
/*     */   
/*     */   class c extends avb {
/*     */     public c(bee this$0, bee ☃) {
/* 206 */       super(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 211 */       if (this.h != avb.a.b) {
/*     */         return;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 219 */       dcn ☃ = new dcn(this.b - this.i.cD(), this.c - this.i.cE(), this.d - this.i.cH());
/*     */ 
/*     */       
/* 222 */       double d = ☃.f();
/* 223 */       if (d < this.i.cc().a()) {
/* 224 */         this.h = avb.a.a;
/* 225 */         this.i.f(this.i.cC().a(0.5D));
/*     */       } else {
/* 227 */         this.i.f(this.i.cC().e(☃.a(this.e * 0.05D / d)));
/*     */         
/* 229 */         if (this.i.A() == null) {
/* 230 */           dcn dcn = this.i.cC();
/* 231 */           this.i.p = -((float)afm.d(dcn.b, dcn.d)) * 57.295776F;
/* 232 */           this.i.aA = this.i.p;
/*     */         } else {
/*     */           
/* 235 */           double d1 = this.i.A().cD() - this.i.cD();
/* 236 */           double d2 = this.i.A().cH() - this.i.cH();
/* 237 */           this.i.p = -((float)afm.d(d1, d2)) * 57.295776F;
/* 238 */           this.i.aA = this.i.p;
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   class a extends avv {
/*     */     public a(bee this$0) {
/* 246 */       a(EnumSet.of(avv.a.a));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 251 */       if (this.a.A() != null && !this.a.u().b() && bee.a(this.a).nextInt(7) == 0) {
/* 252 */         return (this.a.h(this.a.A()) > 4.0D);
/*     */       }
/* 254 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 259 */       return (this.a.u().b() && this.a.eM() && this.a.A() != null && this.a.A().aX());
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 264 */       aqm ☃ = this.a.A();
/* 265 */       dcn dcn = ☃.j(1.0F);
/* 266 */       bee.b(this.a).a(dcn.b, dcn.c, dcn.d, 1.0D);
/* 267 */       this.a.t(true);
/* 268 */       this.a.a(adq.pP, 1.0F, 1.0F);
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 273 */       this.a.t(false);
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 278 */       aqm ☃ = this.a.A();
/* 279 */       if (this.a.cc().c(☃.cc())) {
/* 280 */         this.a.B(☃);
/* 281 */         this.a.t(false);
/*     */       } else {
/* 283 */         double d = this.a.h(☃);
/* 284 */         if (d < 9.0D) {
/* 285 */           dcn dcn = ☃.j(1.0F);
/* 286 */           bee.c(this.a).a(dcn.b, dcn.c, dcn.d, 1.0D);
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   class d extends avv {
/*     */     public d(bee this$0) {
/* 294 */       a(EnumSet.of(avv.a.a));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 299 */       return (!this.a.u().b() && bee.d(this.a).nextInt(7) == 0);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 304 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 309 */       fx ☃ = this.a.eL();
/* 310 */       if (☃ == null)
/*     */       {
/* 312 */         ☃ = this.a.cB();
/*     */       }
/*     */       
/* 315 */       for (int i = 0; i < 3; i++) {
/* 316 */         fx fx = ☃.b(bee.e(this.a).nextInt(15) - 7, bee.f(this.a).nextInt(11) - 5, bee.g(this.a).nextInt(15) - 7);
/* 317 */         if (this.a.l.w(fx)) {
/* 318 */           bee.h(this.a).a(fx.u() + 0.5D, fx.v() + 0.5D, fx.w() + 0.5D, 0.25D);
/* 319 */           if (this.a.A() == null) {
/* 320 */             this.a.t().a(fx.u() + 0.5D, fx.v() + 0.5D, fx.w() + 0.5D, 180.0F, 20.0F);
/*     */           }
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/* 331 */     a(aos1);
/* 332 */     b(aos1);
/*     */     
/* 334 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(aos ☃) {
/* 339 */     a(aqf.a, new bmb(bmd.kA));
/* 340 */     a(aqf.a, 0.0F);
/*     */   }
/*     */   
/*     */   class b extends axx {
/* 344 */     private final azg b = (new azg()).c().e();
/*     */     
/*     */     public b(bee this$0, aqu ☃) {
/* 347 */       super(☃, false);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 352 */       return (bee.i(this.a) != null && bee.i(this.a).A() != null && a(bee.i(this.a).A(), this.b));
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 357 */       this.a.h(bee.i(this.a).A());
/* 358 */       super.c();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bee.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */