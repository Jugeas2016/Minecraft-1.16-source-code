/*     */ import com.google.common.collect.UnmodifiableIterator;
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
/*     */ public class ban
/*     */   extends azz
/*     */   implements aqk, ara
/*     */ {
/*  52 */   private static final us<Boolean> bo = uv.a((Class)ban.class, uu.i);
/*  53 */   private static final us<Integer> bp = uv.a((Class)ban.class, uu.b);
/*  54 */   private static final bon bq = bon.a(new brw[] { bmd.oY, bmd.oZ, bmd.qf });
/*     */   
/*     */   private final aqj br;
/*     */   
/*     */   public ban(aqe<? extends ban> ☃, brx brx1) {
/*  59 */     super((aqe)☃, brx1);
/*  60 */     this.br = new aqj(this.R, bp, bo);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  65 */     this.bk.a(0, new avp(this));
/*  66 */     this.bk.a(1, new awp(this, 1.25D));
/*  67 */     this.bk.a(3, new avi(this, 1.0D));
/*  68 */     this.bk.a(4, new axf(this, 1.2D, bon.a(new brw[] { bmd.pk }, ), false));
/*  69 */     this.bk.a(4, new axf(this, 1.2D, false, bq));
/*  70 */     this.bk.a(5, new avu(this, 1.1D));
/*  71 */     this.bk.a(6, new axk(this, 1.0D));
/*  72 */     this.bk.a(7, new awd(this, (Class)bfw.class, 6.0F));
/*  73 */     this.bk.a(8, new aws(this));
/*     */   }
/*     */   
/*     */   public static ark.a eK() {
/*  77 */     return aqn.p()
/*  78 */       .a(arl.a, 10.0D)
/*  79 */       .a(arl.d, 0.25D);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public aqa cm() {
/*  85 */     if (cn().isEmpty()) {
/*  86 */       return null;
/*     */     }
/*  88 */     return cn().get(0);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean er() {
/*  93 */     aqa ☃ = cm();
/*  94 */     if (!(☃ instanceof bfw)) {
/*  95 */       return false;
/*     */     }
/*  97 */     bfw bfw = (bfw)☃;
/*     */     
/*  99 */     if (bfw.dD().b() == bmd.pk || bfw.dE().b() == bmd.pk) {
/* 100 */       return true;
/*     */     }
/*     */     
/* 103 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(us<?> ☃) {
/* 108 */     if (bp.equals(☃) && this.l.v) {
/* 109 */       this.br.a();
/*     */     }
/* 111 */     super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 116 */     super.e();
/* 117 */     this.R.a(bo, Boolean.valueOf(false));
/* 118 */     this.R.a(bp, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 123 */     super.b(☃);
/* 124 */     this.br.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 129 */     super.a(☃);
/* 130 */     this.br.b(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 135 */     return adq.kN;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 140 */     return adq.kP;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 145 */     return adq.kO;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(fx ☃, ceh ceh1) {
/* 150 */     a(adq.kR, 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public aou b(bfw ☃, aot aot1) {
/* 155 */     boolean bool = k(☃.b(aot1));
/*     */     
/* 157 */     if (!bool && M_() && !bs() && !☃.eq()) {
/* 158 */       if (!this.l.v) {
/* 159 */         ☃.m(this);
/*     */       }
/* 161 */       return aou.a(this.l.v);
/*     */     } 
/*     */     
/* 164 */     aou aou = super.b(☃, aot1);
/* 165 */     if (!aou.a()) {
/* 166 */       bmb bmb = ☃.b(aot1);
/* 167 */       if (bmb.b() == bmd.lO) {
/* 168 */         return bmb.a(☃, this, aot1);
/*     */       }
/* 170 */       return aou.c;
/*     */     } 
/* 172 */     return aou;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean L_() {
/* 177 */     return (aX() && !w_());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void dn() {
/* 182 */     super.dn();
/* 183 */     if (M_()) {
/* 184 */       a(bmd.lO);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean M_() {
/* 190 */     return this.br.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(@Nullable adr ☃) {
/* 195 */     this.br.a(true);
/* 196 */     if (☃ != null) {
/* 197 */       this.l.a((bfw)null, this, adq.kQ, ☃, 0.5F, 1.0F);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public dcn b(aqm ☃) {
/* 203 */     gc gc = ca();
/* 204 */     if (gc.n() == gc.a.b) {
/* 205 */       return super.b(☃);
/*     */     }
/*     */     
/* 208 */     int[][] arrayOfInt = bho.a(gc);
/* 209 */     fx fx = cB();
/* 210 */     fx.a a = new fx.a();
/*     */     
/* 212 */     for (UnmodifiableIterator<aqx> unmodifiableIterator = ☃.ej().iterator(); unmodifiableIterator.hasNext(); ) { aqx aqx = unmodifiableIterator.next();
/* 213 */       dci dci = ☃.f(aqx);
/*     */       
/* 215 */       for (int[] arrayOfInt1 : arrayOfInt) {
/* 216 */         a.d(fx.u() + arrayOfInt1[0], fx.v(), fx.w() + arrayOfInt1[1]);
/*     */         
/* 218 */         double d = this.l.h(a);
/* 219 */         if (bho.a(d)) {
/*     */ 
/*     */ 
/*     */           
/* 223 */           dcn dcn = dcn.a(a, d);
/* 224 */           if (bho.a(this.l, ☃, dci.c(dcn))) {
/* 225 */             ☃.b(aqx);
/* 226 */             return dcn;
/*     */           } 
/*     */         } 
/*     */       }  }
/*     */     
/* 231 */     return super.b(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aag ☃, aql aql1) {
/* 236 */     if (☃.ad() != aor.a) {
/* 237 */       bel bel = aqe.bb.a(☃);
/* 238 */       bel.a(aqf.a, new bmb(bmd.kv));
/* 239 */       bel.b(cD(), cE(), cH(), this.p, this.q);
/* 240 */       bel.q(eD());
/* 241 */       bel.a(w_());
/* 242 */       if (S()) {
/* 243 */         bel.a(T());
/* 244 */         bel.n(bX());
/*     */       } 
/* 246 */       bel.es();
/* 247 */       ☃.c(bel);
/* 248 */       ad();
/*     */     } else {
/* 250 */       super.a(☃, aql1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void g(dcn ☃) {
/* 256 */     a(this, this.br, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public float N_() {
/* 261 */     return (float)b(arl.d) * 0.225F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a_(dcn ☃) {
/* 266 */     super.g(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean O_() {
/* 271 */     return this.br.a(cY());
/*     */   }
/*     */ 
/*     */   
/*     */   public ban b(aag ☃, apy apy1) {
/* 276 */     return aqe.ah.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean k(bmb ☃) {
/* 281 */     return bq.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public dcn cf() {
/* 286 */     return new dcn(0.0D, (0.6F * ce()), (cy() * 0.4F));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ban.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */