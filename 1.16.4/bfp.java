/*     */ import java.util.EnumSet;
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
/*     */ public class bfp
/*     */   extends bfe
/*     */ {
/*     */   @Nullable
/*     */   private fx bp;
/*     */   private int bq;
/*     */   
/*     */   public bfp(aqe<? extends bfp> ☃, brx brx1) {
/*  58 */     super((aqe)☃, brx1);
/*  59 */     this.k = true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  64 */     this.bk.a(0, new avp(this));
/*  65 */     this.bk.a(0, new axi<>(this, bnv.a(new bmb(bmd.nv), bnw.h), adq.qu, ☃ -> (this.l.N() && !☃.bF())));
/*  66 */     this.bk.a(0, new axi<>(this, new bmb(bmd.lT), adq.qz, ☃ -> (this.l.M() && ☃.bF())));
/*  67 */     this.bk.a(1, new axg(this));
/*  68 */     this.bk.a(1, new avd<>(this, bej.class, 8.0F, 0.5D, 0.5D));
/*  69 */     this.bk.a(1, new avd<>(this, bdj.class, 12.0F, 0.5D, 0.5D));
/*  70 */     this.bk.a(1, new avd<>(this, bef.class, 8.0F, 0.5D, 0.5D));
/*  71 */     this.bk.a(1, new avd<>(this, bee.class, 8.0F, 0.5D, 0.5D));
/*  72 */     this.bk.a(1, new avd<>(this, bdt.class, 15.0F, 0.5D, 0.5D));
/*  73 */     this.bk.a(1, new avd<>(this, bdo.class, 12.0F, 0.5D, 0.5D));
/*  74 */     this.bk.a(1, new avd<>(this, bei.class, 10.0F, 0.5D, 0.5D));
/*  75 */     this.bk.a(1, new awp(this, 0.5D));
/*  76 */     this.bk.a(1, new awe(this));
/*  77 */     this.bk.a(2, new a(this, this, 2.0D, 0.35D));
/*  78 */     this.bk.a(4, new awk(this, 0.35D));
/*  79 */     this.bk.a(8, new axk(this, 0.35D));
/*  80 */     this.bk.a(9, new avy(this, (Class)bfw.class, 3.0F, 1.0F));
/*  81 */     this.bk.a(10, new awd(this, (Class)aqn.class, 8.0F));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public apy a(aag ☃, apy apy1) {
/*  87 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean eP() {
/*  92 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aou b(bfw ☃, aot aot1) {
/*  98 */     bmb bmb = ☃.b(aot1);
/*  99 */     if (bmb.b() != bmd.oG && aX() && !eN() && !w_()) {
/*     */       
/* 101 */       if (aot1 == aot.a) {
/* 102 */         ☃.a(aea.R);
/*     */       }
/*     */       
/* 105 */       if (eO().isEmpty()) {
/* 106 */         return aou.a(this.l.v);
/*     */       }
/*     */       
/* 109 */       if (!this.l.v) {
/*     */         
/* 111 */         f(☃);
/* 112 */         a(☃, d(), 1);
/*     */       } 
/* 114 */       return aou.a(this.l.v);
/*     */     } 
/* 116 */     return super.b(☃, aot1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void eW() {
/* 121 */     bfn.f[] ☃ = (bfn.f[])bfn.b.get(1);
/* 122 */     bfn.f[] arrayOfF1 = (bfn.f[])bfn.b.get(2);
/*     */     
/* 124 */     if (☃ == null || arrayOfF1 == null) {
/*     */       return;
/*     */     }
/*     */     
/* 128 */     bqw bqw = eO();
/* 129 */     a(bqw, ☃, 5);
/*     */     
/* 131 */     int i = this.J.nextInt(arrayOfF1.length);
/* 132 */     bfn.f f = arrayOfF1[i];
/* 133 */     bqv bqv = f.a(this, this.J);
/* 134 */     if (bqv != null) {
/* 135 */       bqw.add(bqv);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 141 */     super.b(☃);
/* 142 */     ☃.b("DespawnDelay", this.bq);
/*     */     
/* 144 */     if (this.bp != null) {
/* 145 */       ☃.a("WanderTarget", mp.a(this.bp));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 151 */     super.a(☃);
/* 152 */     if (☃.c("DespawnDelay", 99)) {
/* 153 */       this.bq = ☃.h("DespawnDelay");
/*     */     }
/* 155 */     if (☃.e("WanderTarget")) {
/* 156 */       this.bp = mp.b(☃.p("WanderTarget"));
/*     */     }
/*     */     
/* 159 */     c_(Math.max(0, i()));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean h(double ☃) {
/* 164 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(bqv ☃) {
/* 169 */     if (☃.s()) {
/* 170 */       int i = 3 + this.J.nextInt(4);
/* 171 */       this.l.c(new aqg(this.l, cD(), cE() + 0.5D, cH(), i));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 177 */     if (eN()) {
/* 178 */       return adq.qA;
/*     */     }
/* 180 */     return adq.qs;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 185 */     return adq.qx;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 190 */     return adq.qt;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp c(bmb ☃) {
/* 195 */     blx blx = ☃.b();
/* 196 */     if (blx == bmd.lT) {
/* 197 */       return adq.qv;
/*     */     }
/* 199 */     return adq.qw;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected adp t(boolean ☃) {
/* 205 */     return ☃ ? adq.qB : adq.qy;
/*     */   }
/*     */ 
/*     */   
/*     */   public adp eQ() {
/* 210 */     return adq.qB;
/*     */   }
/*     */   
/*     */   public void u(int ☃) {
/* 214 */     this.bq = ☃;
/*     */   }
/*     */   
/*     */   public int eX() {
/* 218 */     return this.bq;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 223 */     super.k();
/*     */     
/* 225 */     if (!this.l.v) {
/* 226 */       eY();
/*     */     }
/*     */   }
/*     */   
/*     */   private void eY() {
/* 231 */     if (this.bq > 0 && !eN() && --this.bq == 0) {
/* 232 */       ad();
/*     */     }
/*     */   }
/*     */   
/*     */   public void g(@Nullable fx ☃) {
/* 237 */     this.bp = ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private fx eZ() {
/* 242 */     return this.bp;
/*     */   }
/*     */   
/*     */   class a extends avv {
/*     */     final bfp a;
/*     */     final double b;
/*     */     final double c;
/*     */     
/*     */     a(bfp this$0, bfp ☃, double d1, double d2) {
/* 251 */       this.a = ☃;
/* 252 */       this.b = d1;
/* 253 */       this.c = d2;
/* 254 */       a(EnumSet.of(avv.a.a));
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 259 */       this.a.g((fx)null);
/* 260 */       bfp.a(this.d).o();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 265 */       fx ☃ = bfp.b(this.a);
/* 266 */       return (☃ != null && a(☃, this.b));
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 271 */       fx ☃ = bfp.b(this.a);
/* 272 */       if (☃ != null && bfp.c(this.d).m()) {
/* 273 */         if (a(☃, 10.0D)) {
/*     */           
/* 275 */           dcn dcn1 = (new dcn(☃.u() - this.a.cD(), ☃.v() - this.a.cE(), ☃.w() - this.a.cH())).d();
/* 276 */           dcn dcn2 = dcn1.a(10.0D).b(this.a.cD(), this.a.cE(), this.a.cH());
/* 277 */           bfp.d(this.d).a(dcn2.b, dcn2.c, dcn2.d, this.c);
/*     */         } else {
/* 279 */           bfp.e(this.d).a(☃.u(), ☃.v(), ☃.w(), this.c);
/*     */         } 
/*     */       }
/*     */     }
/*     */     
/*     */     private boolean a(fx ☃, double d) {
/* 285 */       return !☃.a(this.a.cA(), d);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bfp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */