/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.Random;
/*     */ import java.util.UUID;
/*     */ import java.util.function.Predicate;
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
/*     */ public class bao
/*     */   extends azz
/*     */   implements aqs
/*     */ {
/*  58 */   private static final us<Boolean> bo = uv.a((Class)bao.class, uu.i);
/*     */   
/*     */   private float bp;
/*     */   
/*     */   private float bq;
/*     */   
/*     */   private int br;
/*  65 */   private static final afh bs = afu.a(20, 39);
/*     */   private int bt;
/*     */   private UUID bu;
/*     */   
/*     */   public bao(aqe<? extends bao> ☃, brx brx1) {
/*  70 */     super((aqe)☃, brx1);
/*     */   }
/*     */ 
/*     */   
/*     */   public apy a(aag ☃, apy apy1) {
/*  75 */     return aqe.al.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean k(bmb ☃) {
/*  80 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  85 */     super.o();
/*     */     
/*  87 */     this.bk.a(0, new avp(this));
/*  88 */     this.bk.a(1, new c(this));
/*  89 */     this.bk.a(1, new d(this));
/*  90 */     this.bk.a(4, new avu(this, 1.25D));
/*  91 */     this.bk.a(5, new awt(this, 1.0D));
/*  92 */     this.bk.a(6, new awd(this, (Class)bfw.class, 6.0F));
/*  93 */     this.bk.a(7, new aws(this));
/*     */     
/*  95 */     this.bl.a(1, new b(this));
/*  96 */     this.bl.a(2, new a(this));
/*  97 */     this.bl.a(3, new axq<>(this, bfw.class, 10, true, false, this::a_));
/*  98 */     this.bl.a(4, new axq<>(this, bah.class, 10, true, true, null));
/*  99 */     this.bl.a(5, new axw<>(this, false));
/*     */   }
/*     */   
/*     */   public static ark.a eK() {
/* 103 */     return aqn.p()
/* 104 */       .a(arl.a, 30.0D)
/* 105 */       .a(arl.b, 20.0D)
/* 106 */       .a(arl.d, 0.25D)
/* 107 */       .a(arl.f, 6.0D);
/*     */   }
/*     */   
/*     */   public static boolean c(aqe<bao> ☃, bry bry1, aqp aqp1, fx fx1, Random random) {
/* 111 */     Optional<vj<bsv>> optional = bry1.i(fx1);
/*     */     
/* 113 */     if (Objects.equals(optional, Optional.of(btb.k)) || Objects.equals(optional, Optional.of(btb.Y))) {
/* 114 */       return (bry1.b(fx1, 0) > 8 && bry1.d_(fx1.c()).a(bup.cD));
/*     */     }
/*     */     
/* 117 */     return b((aqe)☃, bry1, aqp1, fx1, random);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 122 */     super.a(☃);
/* 123 */     a((aag)this.l, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 128 */     super.b(☃);
/* 129 */     c(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void G_() {
/* 134 */     a_(bs.a(this.J));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a_(int ☃) {
/* 139 */     this.bt = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int E_() {
/* 144 */     return this.bt;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(@Nullable UUID ☃) {
/* 149 */     this.bu = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public UUID F_() {
/* 154 */     return this.bu;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 159 */     if (w_()) {
/* 160 */       return adq.lI;
/*     */     }
/* 162 */     return adq.lH;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 167 */     return adq.lK;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 172 */     return adq.lJ;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(fx ☃, ceh ceh1) {
/* 177 */     a(adq.lL, 0.15F, 1.0F);
/*     */   }
/*     */   
/*     */   protected void eL() {
/* 181 */     if (this.br <= 0) {
/* 182 */       a(adq.lM, 1.0F, dH());
/*     */       
/* 184 */       this.br = 40;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 190 */     super.e();
/*     */     
/* 192 */     this.R.a(bo, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 197 */     super.j();
/*     */     
/* 199 */     if (this.l.v) {
/* 200 */       if (this.bq != this.bp) {
/* 201 */         x_();
/*     */       }
/* 203 */       this.bp = this.bq;
/* 204 */       if (eM()) {
/* 205 */         this.bq = afm.a(this.bq + 1.0F, 0.0F, 6.0F);
/*     */       } else {
/* 207 */         this.bq = afm.a(this.bq - 1.0F, 0.0F, 6.0F);
/*     */       } 
/*     */     } 
/*     */     
/* 211 */     if (this.br > 0) {
/* 212 */       this.br--;
/*     */     }
/*     */     
/* 215 */     if (!this.l.v) {
/* 216 */       a((aag)this.l, true);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public aqb a(aqx ☃) {
/* 222 */     if (this.bq > 0.0F) {
/*     */       
/* 224 */       float f1 = this.bq / 6.0F;
/* 225 */       float f2 = 1.0F + f1;
/* 226 */       return super.a(☃).a(1.0F, f2);
/*     */     } 
/* 228 */     return super.a(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean B(aqa ☃) {
/* 235 */     boolean bool = ☃.a(apk.c(this), (int)b(arl.f));
/* 236 */     if (bool) {
/* 237 */       a(this, ☃);
/*     */     }
/* 239 */     return bool;
/*     */   }
/*     */   
/*     */   public boolean eM() {
/* 243 */     return ((Boolean)this.R.<Boolean>a(bo)).booleanValue();
/*     */   }
/*     */   
/*     */   public void t(boolean ☃) {
/* 247 */     this.R.b(bo, Boolean.valueOf(☃));
/*     */   }
/*     */   
/*     */   public float y(float ☃) {
/* 251 */     return afm.g(☃, this.bp, this.bq) / 6.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float dM() {
/* 256 */     return 0.98F;
/*     */   }
/*     */ 
/*     */   
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/* 261 */     if (arc1 == null) {
/* 262 */       arc1 = new apy.a(1.0F);
/*     */     }
/*     */     
/* 265 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   class b
/*     */     extends axp
/*     */   {
/*     */     public b(bao this$0) {
/* 274 */       super(this$0, new Class[0]);
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 279 */       super.c();
/* 280 */       if (this.a.w_()) {
/* 281 */         g();
/* 282 */         d();
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(aqn ☃, aqm aqm1) {
/* 288 */       if (☃ instanceof bao && 
/* 289 */         !☃.w_()) {
/* 290 */         super.a(☃, aqm1);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   class a
/*     */     extends axq<bfw>
/*     */   {
/*     */     public a(bao this$0) {
/* 302 */       super(this$0, bfw.class, 20, true, true, (Predicate<aqm>)null);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 307 */       if (this.i.w_()) {
/* 308 */         return false;
/*     */       }
/*     */ 
/*     */       
/* 312 */       if (super.a()) {
/* 313 */         List<bao> ☃ = this.i.l.a(bao.class, this.i.cc().c(8.0D, 4.0D, 8.0D));
/* 314 */         for (bao bao1 : ☃) {
/* 315 */           if (bao1.w_()) {
/* 316 */             return true;
/*     */           }
/*     */         } 
/*     */       } 
/*     */       
/* 321 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     protected double k() {
/* 326 */       return super.k() * 0.5D;
/*     */     }
/*     */   }
/*     */   
/*     */   class c extends awf {
/*     */     public c(bao this$0) {
/* 332 */       super(this$0, 1.25D, true);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(aqm ☃, double d) {
/* 337 */       double d1 = a(☃);
/* 338 */       if (d <= d1 && h()) {
/* 339 */         g();
/* 340 */         this.a.B(☃);
/* 341 */         this.b.t(false);
/* 342 */       } else if (d <= d1 * 2.0D) {
/* 343 */         if (h()) {
/* 344 */           this.b.t(false);
/* 345 */           g();
/*     */         } 
/* 347 */         if (j() <= 10) {
/* 348 */           this.b.t(true);
/* 349 */           this.b.eL();
/*     */         } 
/*     */       } else {
/*     */         
/* 353 */         g();
/* 354 */         this.b.t(false);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 360 */       this.b.t(false);
/* 361 */       super.d();
/*     */     }
/*     */ 
/*     */     
/*     */     protected double a(aqm ☃) {
/* 366 */       return (4.0F + ☃.cy());
/*     */     }
/*     */   }
/*     */   
/*     */   class d extends awp {
/*     */     public d(bao this$0) {
/* 372 */       super(this$0, 2.0D);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 377 */       if (!this.g.w_() && !this.g.bq()) {
/* 378 */         return false;
/*     */       }
/* 380 */       return super.a();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */