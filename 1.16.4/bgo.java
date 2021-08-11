/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.UUID;
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
/*     */ public class bgo
/*     */   extends bgm
/*     */ {
/*     */   private aqa b;
/*     */   @Nullable
/*     */   private gc c;
/*     */   private int d;
/*     */   private double e;
/*     */   private double f;
/*     */   private double g;
/*     */   @Nullable
/*     */   private UUID ag;
/*     */   
/*     */   public bgo(aqe<? extends bgo> ☃, brx brx1) {
/*  50 */     super((aqe)☃, brx1);
/*     */     
/*  52 */     this.H = true;
/*     */   }
/*     */   
/*     */   public bgo(brx ☃, double d1, double d2, double d3, double d4, double d5, double d6) {
/*  56 */     this(aqe.at, ☃);
/*     */     
/*  58 */     b(d1, d2, d3, this.p, this.q);
/*     */     
/*  60 */     n(d4, d5, d6);
/*     */   }
/*     */   
/*     */   public bgo(brx ☃, aqm aqm1, aqa aqa1, gc.a a1) {
/*  64 */     this(aqe.at, ☃);
/*  65 */     b(aqm1);
/*     */     
/*  67 */     fx fx = aqm1.cB();
/*  68 */     double d1 = fx.u() + 0.5D;
/*  69 */     double d2 = fx.v() + 0.5D;
/*  70 */     double d3 = fx.w() + 0.5D;
/*     */     
/*  72 */     b(d1, d2, d3, this.p, this.q);
/*     */     
/*  74 */     this.b = aqa1;
/*     */     
/*  76 */     this.c = gc.b;
/*  77 */     a(a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public adr cu() {
/*  82 */     return adr.f;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(md ☃) {
/*  87 */     super.b(☃);
/*  88 */     if (this.b != null) {
/*  89 */       ☃.a("Target", this.b.bS());
/*     */     }
/*  91 */     if (this.c != null) {
/*  92 */       ☃.b("Dir", this.c.c());
/*     */     }
/*  94 */     ☃.b("Steps", this.d);
/*  95 */     ☃.a("TXD", this.e);
/*  96 */     ☃.a("TYD", this.f);
/*  97 */     ☃.a("TZD", this.g);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/* 102 */     super.a(☃);
/* 103 */     this.d = ☃.h("Steps");
/* 104 */     this.e = ☃.k("TXD");
/* 105 */     this.f = ☃.k("TYD");
/* 106 */     this.g = ☃.k("TZD");
/* 107 */     if (☃.c("Dir", 99)) {
/* 108 */       this.c = gc.a(☃.h("Dir"));
/*     */     }
/* 110 */     if (☃.b("Target")) {
/* 111 */       this.ag = ☃.a("Target");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void e() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(@Nullable gc ☃) {
/* 125 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   private void a(@Nullable gc.a ☃) {
/*     */     fx fx;
/* 130 */     double d1 = 0.5D;
/* 131 */     if (this.b == null) {
/* 132 */       fx = cB().c();
/*     */     } else {
/* 134 */       d1 = this.b.cz() * 0.5D;
/* 135 */       fx = new fx(this.b.cD(), this.b.cE() + d1, this.b.cH());
/*     */     } 
/*     */     
/* 138 */     double d2 = fx.u() + 0.5D;
/* 139 */     double d3 = fx.v() + d1;
/* 140 */     double d4 = fx.w() + 0.5D;
/*     */     
/* 142 */     gc gc1 = null;
/* 143 */     if (!fx.a(cA(), 2.0D)) {
/* 144 */       fx fx1 = cB();
/* 145 */       List<gc> list = Lists.newArrayList();
/*     */       
/* 147 */       if (☃ != gc.a.a) {
/* 148 */         if (fx1.u() < fx.u() && this.l.w(fx1.g())) {
/* 149 */           list.add(gc.f);
/* 150 */         } else if (fx1.u() > fx.u() && this.l.w(fx1.f())) {
/* 151 */           list.add(gc.e);
/*     */         } 
/*     */       }
/* 154 */       if (☃ != gc.a.b) {
/* 155 */         if (fx1.v() < fx.v() && this.l.w(fx1.b())) {
/* 156 */           list.add(gc.b);
/* 157 */         } else if (fx1.v() > fx.v() && this.l.w(fx1.c())) {
/* 158 */           list.add(gc.a);
/*     */         } 
/*     */       }
/* 161 */       if (☃ != gc.a.c) {
/* 162 */         if (fx1.w() < fx.w() && this.l.w(fx1.e())) {
/* 163 */           list.add(gc.d);
/* 164 */         } else if (fx1.w() > fx.w() && this.l.w(fx1.d())) {
/* 165 */           list.add(gc.c);
/*     */         } 
/*     */       }
/*     */       
/* 169 */       gc1 = gc.a(this.J);
/* 170 */       if (list.isEmpty()) {
/* 171 */         int i = 5;
/* 172 */         while (!this.l.w(fx1.a(gc1)) && i > 0) {
/* 173 */           gc1 = gc.a(this.J);
/* 174 */           i--;
/*     */         } 
/*     */       } else {
/* 177 */         gc1 = list.get(this.J.nextInt(list.size()));
/*     */       } 
/*     */       
/* 180 */       d2 = cD() + gc1.i();
/* 181 */       d3 = cE() + gc1.j();
/* 182 */       d4 = cH() + gc1.k();
/*     */     } 
/*     */     
/* 185 */     a(gc1);
/*     */     
/* 187 */     double d5 = d2 - cD();
/* 188 */     double d6 = d3 - cE();
/* 189 */     double d7 = d4 - cH();
/*     */     
/* 191 */     double d8 = afm.a(d5 * d5 + d6 * d6 + d7 * d7);
/* 192 */     if (d8 == 0.0D) {
/* 193 */       this.e = 0.0D;
/* 194 */       this.f = 0.0D;
/* 195 */       this.g = 0.0D;
/*     */     } else {
/* 197 */       this.e = d5 / d8 * 0.15D;
/* 198 */       this.f = d6 / d8 * 0.15D;
/* 199 */       this.g = d7 / d8 * 0.15D;
/*     */     } 
/*     */     
/* 202 */     this.Z = true;
/* 203 */     this.d = 10 + this.J.nextInt(5) * 10;
/*     */   }
/*     */ 
/*     */   
/*     */   public void cI() {
/* 208 */     if (this.l.ad() == aor.a) {
/* 209 */       ad();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 215 */     super.j();
/*     */     
/* 217 */     if (!this.l.v) {
/* 218 */       if (this.b == null && this.ag != null) {
/* 219 */         this.b = ((aag)this.l).a(this.ag);
/* 220 */         if (this.b == null) {
/* 221 */           this.ag = null;
/*     */         }
/*     */       } 
/*     */       
/* 225 */       if (this.b != null && this.b.aX() && (!(this.b instanceof bfw) || !((bfw)this.b).a_())) {
/* 226 */         this.e = afm.a(this.e * 1.025D, -1.0D, 1.0D);
/* 227 */         this.f = afm.a(this.f * 1.025D, -1.0D, 1.0D);
/* 228 */         this.g = afm.a(this.g * 1.025D, -1.0D, 1.0D);
/*     */         
/* 230 */         dcn dcn = cC();
/* 231 */         f(dcn.b((this.e - dcn.b) * 0.2D, (this.f - dcn.c) * 0.2D, (this.g - dcn.d) * 0.2D));
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 237 */       else if (!aB()) {
/* 238 */         f(cC().b(0.0D, -0.04D, 0.0D));
/*     */       } 
/*     */ 
/*     */       
/* 242 */       dcl dcl = bgn.a(this, this::a);
/* 243 */       if (dcl.c() != dcl.a.a) {
/* 244 */         a(dcl);
/*     */       }
/*     */     } 
/*     */     
/* 248 */     ay();
/* 249 */     dcn ☃ = cC();
/* 250 */     d(cD() + ☃.b, cE() + ☃.c, cH() + ☃.d);
/*     */     
/* 252 */     bgn.a(this, 0.5F);
/*     */     
/* 254 */     if (this.l.v) {
/* 255 */       this.l.a(hh.t, cD() - ☃.b, cE() - ☃.c + 0.15D, cH() - ☃.d, 0.0D, 0.0D, 0.0D);
/*     */     }
/* 257 */     else if (this.b != null && !this.b.y) {
/* 258 */       if (this.d > 0) {
/* 259 */         this.d--;
/* 260 */         if (this.d == 0) {
/* 261 */           a((this.c == null) ? null : this.c.n());
/*     */         }
/*     */       } 
/*     */       
/* 265 */       if (this.c != null) {
/*     */         
/* 267 */         fx fx = cB();
/* 268 */         gc.a a = this.c.n();
/* 269 */         if (this.l.a(fx.a(this.c), this)) {
/* 270 */           a(a);
/*     */         } else {
/* 272 */           fx fx1 = this.b.cB();
/* 273 */           if ((a == gc.a.a && fx.u() == fx1.u()) || (a == gc.a.c && fx
/* 274 */             .w() == fx1.w()) || (a == gc.a.b && fx
/* 275 */             .v() == fx1.v()))
/*     */           {
/* 277 */             a(a);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean a(aqa ☃) {
/* 287 */     return (super.a(☃) && !☃.H);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bq() {
/* 292 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃) {
/* 297 */     return (☃ < 16384.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public float aR() {
/* 302 */     return 1.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dck ☃) {
/* 307 */     super.a(☃);
/* 308 */     aqa aqa1 = ☃.a();
/* 309 */     aqa aqa2 = v();
/* 310 */     aqm aqm = (aqa2 instanceof aqm) ? (aqm)aqa2 : null;
/* 311 */     boolean bool = aqa1.a(apk.a(this, aqm).c(), 4.0F);
/* 312 */     if (bool) {
/* 313 */       a(aqm, aqa1);
/* 314 */       if (aqa1 instanceof aqm) {
/* 315 */         ((aqm)aqa1).c(new apu(apw.y, 200));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dcj ☃) {
/* 322 */     super.a(☃);
/* 323 */     ((aag)this.l).a(hh.w, cD(), cE(), cH(), 2, 0.2D, 0.2D, 0.2D, 0.0D);
/* 324 */     a(adq.nf, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dcl ☃) {
/* 329 */     super.a(☃);
/* 330 */     ad();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aT() {
/* 335 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 340 */     if (!this.l.v) {
/* 341 */       a(adq.ng, 1.0F, 1.0F);
/* 342 */       ((aag)this.l).a(hh.g, cD(), cE(), cH(), 15, 0.2D, 0.2D, 0.2D, 0.0D);
/* 343 */       ad();
/*     */     } 
/* 345 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public oj<?> P() {
/* 350 */     return new on(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bgo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */