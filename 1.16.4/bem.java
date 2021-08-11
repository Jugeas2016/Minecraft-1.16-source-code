/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import java.util.Collection;
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
/*     */ public class bem
/*     */   extends azz
/*     */   implements bdi, beo
/*     */ {
/*  57 */   private static final us<Boolean> bq = uv.a((Class)bem.class, uu.i);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int br;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  69 */   private int bs = 0;
/*     */   
/*     */   private boolean bt = false;
/*  72 */   protected static final ImmutableList<? extends azc<? extends azb<? super bem>>> bo = ImmutableList.of(azc.c, azc.d, azc.n, azc.m);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  78 */   protected static final ImmutableList<? extends ayd<?>> bp = ImmutableList.of(ayd.r, ayd.g, ayd.h, ayd.k, ayd.l, ayd.n, ayd.m, ayd.D, ayd.t, ayd.o, ayd.p, ayd.aa, (Object[])new ayd[] { ayd.z, ayd.ac, ayd.ad, ayd.Z, ayd.I, ayd.ag, ayd.ah });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bem(aqe<? extends bem> ☃, brx brx1) {
/* 101 */     super((aqe)☃, brx1);
/* 102 */     this.f = 5;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/* 107 */     return !eB();
/*     */   }
/*     */   
/*     */   public static ark.a eK() {
/* 111 */     return bdq.eR()
/* 112 */       .a(arl.a, 40.0D)
/* 113 */       .a(arl.d, 0.30000001192092896D)
/* 114 */       .a(arl.c, 0.6000000238418579D)
/* 115 */       .a(arl.g, 1.0D)
/* 116 */       .a(arl.f, 6.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean B(aqa ☃) {
/* 121 */     if (!(☃ instanceof aqm)) {
/* 122 */       return false;
/*     */     }
/* 124 */     this.br = 10;
/* 125 */     this.l.a(this, (byte)4);
/*     */     
/* 127 */     a(adq.fD, 1.0F, dH());
/* 128 */     ben.a(this, (aqm)☃);
/* 129 */     return beo.a(this, (aqm)☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e(aqm ☃) {
/* 134 */     if (eL()) {
/* 135 */       beo.b(this, ☃);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 141 */     boolean bool = super.a(☃, f);
/* 142 */     if (this.l.v) {
/* 143 */       return false;
/*     */     }
/* 145 */     if (bool && ☃.k() instanceof aqm) {
/* 146 */       ben.b(this, (aqm)☃.k());
/*     */     }
/* 148 */     return bool;
/*     */   }
/*     */ 
/*     */   
/*     */   protected arf.b<bem> cK() {
/* 153 */     return arf.a((Collection<? extends ayd<?>>)bp, (Collection<? extends azc<? extends azb<? super bem>>>)bo);
/*     */   }
/*     */ 
/*     */   
/*     */   protected arf<?> a(Dynamic<?> ☃) {
/* 158 */     return ben.a(cK().a(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public arf<bem> cJ() {
/* 164 */     return (arf)super.cJ();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void N() {
/* 169 */     this.l.Z().a("hoglinBrain");
/* 170 */     cJ().a((aag)this.l, this);
/* 171 */     this.l.Z().c();
/*     */     
/* 173 */     ben.a(this);
/*     */     
/* 175 */     if (eN()) {
/* 176 */       this.bs++;
/* 177 */       if (this.bs > 300) {
/* 178 */         a(adq.fE);
/* 179 */         c((aag)this.l);
/*     */       } 
/*     */     } else {
/* 182 */       this.bs = 0;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void k() {
/* 189 */     if (this.br > 0) {
/* 190 */       this.br--;
/*     */     }
/* 192 */     super.k();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m() {
/* 197 */     if (w_()) {
/* 198 */       this.f = 3;
/* 199 */       a(arl.f).a(0.5D);
/*     */     } else {
/* 201 */       this.f = 5;
/* 202 */       a(arl.f).a(6.0D);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean c(aqe<bem> ☃, bry bry1, aqp aqp1, fx fx1, Random random) {
/* 207 */     return !bry1.d_(fx1.c()).a(bup.iK);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/* 213 */     if (☃.u_().nextFloat() < 0.2F) {
/* 214 */       a(true);
/*     */     }
/*     */     
/* 217 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean h(double ☃) {
/* 222 */     return !eu();
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(fx ☃, brz brz1) {
/* 227 */     if (ben.a(this, ☃)) {
/* 228 */       return -1.0F;
/*     */     }
/* 230 */     if (brz1.d_(☃.c()).a(bup.mu))
/*     */     {
/* 232 */       return 10.0F;
/*     */     }
/* 234 */     return 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public double bc() {
/* 239 */     return cz() - (w_() ? 0.2D : 0.15D);
/*     */   }
/*     */ 
/*     */   
/*     */   public aou b(bfw ☃, aot aot1) {
/* 244 */     aou aou = super.b(☃, aot1);
/* 245 */     if (aou.a()) {
/* 246 */       es();
/*     */     }
/* 248 */     return aou;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(byte ☃) {
/* 254 */     if (☃ == 4) {
/*     */       
/* 256 */       this.br = 10;
/* 257 */       a(adq.fD, 1.0F, dH());
/*     */     } else {
/* 259 */       super.a(☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int eM() {
/* 265 */     return this.br;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean cV() {
/* 270 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int d(bfw ☃) {
/* 275 */     return this.f;
/*     */   }
/*     */   
/*     */   private void c(aag ☃) {
/* 279 */     bei bei = a(aqe.aX, true);
/* 280 */     if (bei != null) {
/* 281 */       bei.c(new apu(apw.i, 200, 0));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean k(bmb ☃) {
/* 287 */     return (☃.b() == bmd.bw);
/*     */   }
/*     */   
/*     */   public boolean eL() {
/* 291 */     return !w_();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 296 */     super.e();
/* 297 */     this.R.a(bq, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 302 */     super.b(☃);
/* 303 */     if (eV()) {
/* 304 */       ☃.a("IsImmuneToZombification", true);
/*     */     }
/* 306 */     ☃.b("TimeInOverworld", this.bs);
/* 307 */     if (this.bt) {
/* 308 */       ☃.a("CannotBeHunted", true);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 314 */     super.a(☃);
/* 315 */     t(☃.q("IsImmuneToZombification"));
/* 316 */     this.bs = ☃.h("TimeInOverworld");
/* 317 */     u(☃.q("CannotBeHunted"));
/*     */   }
/*     */   
/*     */   public void t(boolean ☃) {
/* 321 */     ab().b(bq, Boolean.valueOf(☃));
/*     */   }
/*     */   
/*     */   private boolean eV() {
/* 325 */     return ((Boolean)ab().<Boolean>a(bq)).booleanValue();
/*     */   }
/*     */   
/*     */   public boolean eN() {
/* 329 */     return (!this.l.k().g() && !eV() && !eD());
/*     */   }
/*     */   
/*     */   private void u(boolean ☃) {
/* 333 */     this.bt = ☃;
/*     */   }
/*     */   
/*     */   public boolean eO() {
/* 337 */     return (eL() && !this.bt);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public apy a(aag ☃, apy apy1) {
/* 343 */     bem bem1 = aqe.G.a(☃);
/* 344 */     if (bem1 != null) {
/* 345 */       bem1.es();
/*     */     }
/* 347 */     return bem1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean eP() {
/* 356 */     return (!ben.c(this) && super.eP());
/*     */   }
/*     */ 
/*     */   
/*     */   public adr cu() {
/* 361 */     return adr.f;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 366 */     if (this.l.v) {
/* 367 */       return null;
/*     */     }
/* 369 */     return ben.b(this).orElse(null);
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 374 */     return adq.fG;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 379 */     return adq.fF;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp av() {
/* 384 */     return adq.gi;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp aw() {
/* 389 */     return adq.gh;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(fx ☃, ceh ceh1) {
/* 394 */     a(adq.fI, 0.15F, 1.0F);
/*     */   }
/*     */   
/*     */   protected void a(adp ☃) {
/* 398 */     a(☃, dG(), dH());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void M() {
/* 403 */     super.M();
/* 404 */     rz.a(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */