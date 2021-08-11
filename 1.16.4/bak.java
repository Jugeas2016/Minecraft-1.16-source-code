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
/*     */ public class bak
/*     */   extends azz
/*     */ {
/*  60 */   private static final bon bo = bon.a(new brw[] { bmd.ml, bmd.mm });
/*     */   
/*  62 */   private static final us<Boolean> bp = uv.a((Class)bak.class, uu.i);
/*     */   
/*     */   private a<bfw> bq;
/*     */   private b br;
/*     */   
/*     */   public bak(aqe<? extends bak> ☃, brx brx1) {
/*  68 */     super((aqe)☃, brx1);
/*     */     
/*  70 */     eL();
/*     */   }
/*     */   
/*     */   private boolean eM() {
/*  74 */     return ((Boolean)this.R.<Boolean>a(bp)).booleanValue();
/*     */   }
/*     */   
/*     */   private void t(boolean ☃) {
/*  78 */     this.R.b(bp, Boolean.valueOf(☃));
/*     */     
/*  80 */     eL();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/*  85 */     super.b(☃);
/*     */     
/*  87 */     ☃.a("Trusting", eM());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/*  92 */     super.a(☃);
/*     */     
/*  94 */     t(☃.q("Trusting"));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  99 */     super.e();
/*     */     
/* 101 */     this.R.a(bp, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/* 106 */     this.br = new b(this, 0.6D, bo, true);
/* 107 */     this.bk.a(1, new avp(this));
/* 108 */     this.bk.a(3, this.br);
/* 109 */     this.bk.a(7, new awb(this, 0.3F));
/* 110 */     this.bk.a(8, new awm(this));
/* 111 */     this.bk.a(9, new avi(this, 0.8D));
/* 112 */     this.bk.a(10, new axk(this, 0.8D, 1.0000001E-5F));
/* 113 */     this.bk.a(11, new awd(this, (Class)bfw.class, 10.0F));
/*     */     
/* 115 */     this.bl.a(1, new axq<>(this, bac.class, false));
/* 116 */     this.bl.a(1, new axq<>(this, bax.class, 10, false, false, bax.bo));
/*     */   }
/*     */ 
/*     */   
/*     */   public void N() {
/* 121 */     if (u().b()) {
/* 122 */       double ☃ = u().c();
/* 123 */       if (☃ == 0.6D) {
/* 124 */         b(aqx.f);
/* 125 */         g(false);
/* 126 */       } else if (☃ == 1.33D) {
/* 127 */         b(aqx.a);
/* 128 */         g(true);
/*     */       } else {
/* 130 */         b(aqx.a);
/* 131 */         g(false);
/*     */       } 
/*     */     } else {
/* 134 */       b(aqx.a);
/* 135 */       g(false);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean h(double ☃) {
/* 141 */     return (!eM() && this.K > 2400);
/*     */   }
/*     */   
/*     */   public static ark.a eK() {
/* 145 */     return aqn.p()
/* 146 */       .a(arl.a, 10.0D)
/* 147 */       .a(arl.d, 0.30000001192092896D)
/* 148 */       .a(arl.f, 3.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(float ☃, float f1) {
/* 153 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected adp I() {
/* 159 */     return adq.jG;
/*     */   }
/*     */ 
/*     */   
/*     */   public int D() {
/* 164 */     return 900;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 169 */     return adq.jF;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 174 */     return adq.jH;
/*     */   }
/*     */   
/*     */   private float eN() {
/* 178 */     return (float)b(arl.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean B(aqa ☃) {
/* 183 */     return ☃.a(apk.c(this), eN());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 188 */     if (b(☃)) {
/* 189 */       return false;
/*     */     }
/*     */     
/* 192 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public aou b(bfw ☃, aot aot1) {
/* 197 */     bmb bmb = ☃.b(aot1);
/* 198 */     if ((this.br == null || this.br.h()) && !eM() && k(bmb) && ☃.h(this) < 9.0D) {
/* 199 */       a(☃, bmb);
/*     */       
/* 201 */       if (!this.l.v) {
/* 202 */         if (this.J.nextInt(3) == 0) {
/* 203 */           t(true);
/* 204 */           u(true);
/* 205 */           this.l.a(this, (byte)41);
/*     */         } else {
/* 207 */           u(false);
/* 208 */           this.l.a(this, (byte)40);
/*     */         } 
/*     */       }
/*     */       
/* 212 */       return aou.a(this.l.v);
/*     */     } 
/*     */     
/* 215 */     return super.b(☃, aot1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(byte ☃) {
/* 220 */     if (☃ == 41) {
/* 221 */       u(true);
/* 222 */     } else if (☃ == 40) {
/* 223 */       u(false);
/*     */     } else {
/* 225 */       super.a(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void u(boolean ☃) {
/* 230 */     hf hf = hh.G;
/* 231 */     if (!☃) {
/* 232 */       hf = hh.S;
/*     */     }
/* 234 */     for (int i = 0; i < 7; i++) {
/* 235 */       double d1 = this.J.nextGaussian() * 0.02D;
/* 236 */       double d2 = this.J.nextGaussian() * 0.02D;
/* 237 */       double d3 = this.J.nextGaussian() * 0.02D;
/* 238 */       this.l.a(hf, d(1.0D), cF() + 0.5D, g(1.0D), d1, d2, d3);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void eL() {
/* 243 */     if (this.bq == null) {
/* 244 */       this.bq = new a<>(this, bfw.class, 16.0F, 0.8D, 1.33D);
/*     */     }
/*     */     
/* 247 */     this.bk.a(this.bq);
/*     */     
/* 249 */     if (!eM()) {
/* 250 */       this.bk.a(4, this.bq);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public bak b(aag ☃, apy apy1) {
/* 256 */     return aqe.ac.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean k(bmb ☃) {
/* 261 */     return bo.a(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean c(aqe<bak> ☃, bry bry1, aqp aqp1, fx fx1, Random random) {
/* 267 */     return (random.nextInt(3) != 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brz ☃) {
/* 272 */     if (☃.j(this) && !☃.d(cc())) {
/* 273 */       fx fx = cB();
/* 274 */       if (fx.v() < ☃.t_()) {
/* 275 */         return false;
/*     */       }
/*     */       
/* 278 */       ceh ceh = ☃.d_(fx.c());
/* 279 */       if (ceh.a(bup.i) || ceh.a(aed.I)) {
/* 280 */         return true;
/*     */       }
/*     */     } 
/* 283 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/* 289 */     if (arc1 == null)
/*     */     {
/* 291 */       arc1 = new apy.a(1.0F);
/*     */     }
/*     */     
/* 294 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*     */   }
/*     */ 
/*     */   
/*     */   public dcn cf() {
/* 299 */     return new dcn(0.0D, (0.5F * ce()), (cy() * 0.4F));
/*     */   }
/*     */   
/*     */   static class a<T extends aqm> extends avd<T> {
/*     */     private final bak i;
/*     */     
/*     */     public a(bak ☃, Class<T> clazz, float f, double d1, double d2) {
/* 306 */       super(☃, clazz, f, d1, d2, aqd.e::test);
/* 307 */       this.i = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 312 */       return (!bak.a(this.i) && super.a());
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 317 */       return (!bak.a(this.i) && super.b());
/*     */     }
/*     */   }
/*     */   
/*     */   static class b extends axf {
/*     */     private final bak c;
/*     */     
/*     */     public b(bak ☃, double d, bon bon1, boolean bool) {
/* 325 */       super(☃, d, bon1, bool);
/* 326 */       this.c = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean g() {
/* 331 */       return (super.g() && !bak.a(this.c));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */