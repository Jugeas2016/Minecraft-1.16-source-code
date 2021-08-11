/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bei
/*     */   extends bdq
/*     */   implements bdi, beo
/*     */ {
/*  59 */   private static final us<Boolean> d = uv.a((Class)bei.class, uu.i);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int bo;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  76 */   protected static final ImmutableList<? extends azc<? extends azb<? super bei>>> b = ImmutableList.of(azc.c, azc.d);
/*     */ 
/*     */ 
/*     */   
/*  80 */   protected static final ImmutableList<? extends ayd<?>> c = ImmutableList.of(ayd.g, ayd.h, ayd.k, ayd.l, ayd.n, ayd.m, ayd.D, ayd.t, ayd.o, ayd.p);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bei(aqe<? extends bei> ☃, brx brx1) {
/*  94 */     super((aqe)☃, brx1);
/*  95 */     this.f = 5;
/*     */   }
/*     */ 
/*     */   
/*     */   protected arf.b<bei> cK() {
/* 100 */     return arf.a((Collection<? extends ayd<?>>)c, (Collection<? extends azc<? extends azb<? super bei>>>)b);
/*     */   }
/*     */ 
/*     */   
/*     */   protected arf<?> a(Dynamic<?> ☃) {
/* 105 */     arf<bei> arf = cK().a(☃);
/* 106 */     a(arf);
/* 107 */     b(arf);
/* 108 */     c(arf);
/*     */     
/* 110 */     arf.a((Set<bhf>)ImmutableSet.of(bhf.a));
/* 111 */     arf.b(bhf.b);
/* 112 */     arf.e();
/* 113 */     return arf;
/*     */   }
/*     */ 
/*     */   
/*     */   private static void a(arf<bei> ☃) {
/* 118 */     ☃.a(bhf.a, 0, ImmutableList.of(new asu(45, 90), new asy()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void b(arf<bei> ☃) {
/* 125 */     ☃.a(bhf.b, 10, ImmutableList.of(new atw<>(bei::eO), new atj<>(new atl(8.0F), 
/*     */             
/* 127 */             afh.a(30, 60)), new ati<>(
/* 128 */             (List<Pair<arv<? super aqm>, Integer>>)ImmutableList.of(
/* 129 */               Pair.of(new atc(0.4F), Integer.valueOf(2)), 
/* 130 */               Pair.of(new ats(0.4F, 3), Integer.valueOf(2)), 
/* 131 */               Pair.of(new asc(30, 60), Integer.valueOf(1))))));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static void c(arf<bei> ☃) {
/* 137 */     ☃.a(bhf.k, 10, ImmutableList.of(new atq(1.0F), new ath<>(bei::eK, new asv(40)), new ath<>(bei::w_, new asv(15)), new aty<>()), ayd.o);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Optional<? extends aqm> eO() {
/* 146 */     return ((List<? extends aqm>)cJ().c(ayd.h).orElse(ImmutableList.of())).stream().filter(bei::i).findFirst();
/*     */   }
/*     */   
/*     */   private static boolean i(aqm ☃) {
/* 150 */     aqe<?> aqe = ☃.X();
/* 151 */     return (aqe != aqe.aX && aqe != aqe.m && aqd.f.test(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 156 */     super.e();
/* 157 */     this.R.a(d, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(us<?> ☃) {
/* 162 */     super.a(☃);
/* 163 */     if (d.equals(☃)) {
/* 164 */       x_();
/*     */     }
/*     */   }
/*     */   
/*     */   public static ark.a m() {
/* 169 */     return bdq.eR()
/* 170 */       .a(arl.a, 40.0D)
/* 171 */       .a(arl.d, 0.30000001192092896D)
/* 172 */       .a(arl.c, 0.6000000238418579D)
/* 173 */       .a(arl.g, 1.0D)
/* 174 */       .a(arl.f, 6.0D);
/*     */   }
/*     */   
/*     */   public boolean eK() {
/* 178 */     return !w_();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean B(aqa ☃) {
/* 183 */     if (!(☃ instanceof aqm)) {
/* 184 */       return false;
/*     */     }
/* 186 */     this.bo = 10;
/* 187 */     this.l.a(this, (byte)4);
/*     */     
/* 189 */     a(adq.rD, 1.0F, dH());
/* 190 */     return beo.a(this, (aqm)☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/* 195 */     return !eB();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e(aqm ☃) {
/* 200 */     if (!w_()) {
/* 201 */       beo.b(this, ☃);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public double bc() {
/* 207 */     return cz() - (w_() ? 0.2D : 0.15D);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 212 */     boolean bool = super.a(☃, f);
/* 213 */     if (this.l.v) {
/* 214 */       return false;
/*     */     }
/* 216 */     if (!bool || !(☃.k() instanceof aqm)) {
/* 217 */       return bool;
/*     */     }
/* 219 */     aqm aqm = (aqm)☃.k();
/* 220 */     if (aqd.f.test(aqm) && !arw.a(this, aqm, 4.0D)) {
/* 221 */       j(aqm);
/*     */     }
/* 223 */     return bool;
/*     */   }
/*     */   
/*     */   private void j(aqm ☃) {
/* 227 */     this.bg.b(ayd.D);
/* 228 */     this.bg.a(ayd.o, ☃, 200L);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public arf<bei> cJ() {
/* 234 */     return (arf)super.cJ();
/*     */   }
/*     */   
/*     */   protected void eL() {
/* 238 */     bhf ☃ = this.bg.f().orElse(null);
/*     */ 
/*     */     
/* 241 */     this.bg.a((List<bhf>)ImmutableList.of(bhf.k, bhf.b));
/*     */     
/* 243 */     bhf bhf1 = this.bg.f().orElse(null);
/* 244 */     if (bhf1 == bhf.k && ☃ != bhf.k)
/*     */     {
/* 246 */       eN();
/*     */     }
/*     */ 
/*     */     
/* 250 */     s(this.bg.a(ayd.o));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void N() {
/* 256 */     this.l.Z().a("zoglinBrain");
/* 257 */     cJ().a((aag)this.l, this);
/* 258 */     this.l.Z().c();
/*     */     
/* 260 */     eL();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(boolean ☃) {
/* 265 */     ab().b(d, Boolean.valueOf(☃));
/* 266 */     if (!this.l.v && ☃) {
/* 267 */       a(arl.f).a(0.5D);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean w_() {
/* 273 */     return ((Boolean)ab().<Boolean>a(d)).booleanValue();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void k() {
/* 279 */     if (this.bo > 0) {
/* 280 */       this.bo--;
/*     */     }
/* 282 */     super.k();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(byte ☃) {
/* 288 */     if (☃ == 4) {
/*     */       
/* 290 */       this.bo = 10;
/* 291 */       a(adq.rD, 1.0F, dH());
/*     */     } else {
/* 293 */       super.a(☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int eM() {
/* 299 */     return this.bo;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 304 */     if (this.l.v) {
/* 305 */       return null;
/*     */     }
/* 307 */     if (this.bg.a(ayd.o)) {
/* 308 */       return adq.rC;
/*     */     }
/* 310 */     return adq.rB;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 315 */     return adq.rF;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 320 */     return adq.rE;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(fx ☃, ceh ceh1) {
/* 325 */     a(adq.rG, 0.15F, 1.0F);
/*     */   }
/*     */   
/*     */   protected void eN() {
/* 329 */     a(adq.rC, 1.0F, dH());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void M() {
/* 334 */     super.M();
/* 335 */     rz.a(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public aqq dC() {
/* 340 */     return aqq.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 345 */     super.b(☃);
/*     */     
/* 347 */     if (w_()) {
/* 348 */       ☃.a("IsBaby", true);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 354 */     super.a(☃);
/*     */     
/* 356 */     if (☃.q("IsBaby"))
/* 357 */       a(true); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bei.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */