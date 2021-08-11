/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import java.util.Collection;
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
/*     */ public class bev
/*     */   extends ber
/*     */ {
/*  41 */   protected static final ImmutableList<azc<? extends azb<? super bev>>> d = ImmutableList.of(azc.c, azc.d, azc.b, azc.f, azc.l);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  49 */   protected static final ImmutableList<ayd<?>> bo = ImmutableList.of(ayd.n, ayd.v, ayd.g, ayd.h, ayd.k, ayd.l, ayd.Y, ayd.X, ayd.x, ayd.y, ayd.m, ayd.D, (Object[])new ayd[] { ayd.o, ayd.p, ayd.q, ayd.t, ayd.L, ayd.K, ayd.b });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bev(aqe<? extends bev> ☃, brx brx1) {
/*  72 */     super((aqe)☃, brx1);
/*  73 */     this.f = 20;
/*     */   }
/*     */   
/*     */   public static ark.a eS() {
/*  77 */     return bdq.eR()
/*  78 */       .a(arl.a, 50.0D)
/*  79 */       .a(arl.d, 0.3499999940395355D)
/*  80 */       .a(arl.f, 7.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/*  86 */     bew.a(this);
/*  87 */     a(aos1);
/*  88 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(aos ☃) {
/*  93 */     a(aqf.a, new bmb(bmd.ky));
/*     */   }
/*     */ 
/*     */   
/*     */   protected arf.b<bev> cK() {
/*  98 */     return arf.a((Collection<? extends ayd<?>>)bo, (Collection<? extends azc<? extends azb<? super bev>>>)d);
/*     */   }
/*     */ 
/*     */   
/*     */   protected arf<?> a(Dynamic<?> ☃) {
/* 103 */     return bew.a(this, cK().a(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public arf<bev> cJ() {
/* 109 */     return (arf)super.cJ();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m() {
/* 114 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i(bmb ☃) {
/* 119 */     if (☃.b() == bmd.ky) {
/* 120 */       return super.i(☃);
/*     */     }
/* 122 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void N() {
/* 127 */     this.l.Z().a("piglinBruteBrain");
/* 128 */     cJ().a((aag)this.l, this);
/* 129 */     this.l.Z().c();
/*     */     
/* 131 */     bew.b(this);
/* 132 */     bew.c(this);
/*     */     
/* 134 */     super.N();
/*     */   }
/*     */ 
/*     */   
/*     */   public beu eN() {
/* 139 */     if (eF() && eO()) {
/* 140 */       return beu.a;
/*     */     }
/* 142 */     return beu.f;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 148 */     boolean bool = super.a(☃, f);
/* 149 */     if (this.l.v) {
/* 150 */       return false;
/*     */     }
/* 152 */     if (bool && ☃.k() instanceof aqm) {
/* 153 */       bew.a(this, (aqm)☃.k());
/*     */     }
/* 155 */     return bool;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 160 */     return adq.lc;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 165 */     return adq.lf;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 170 */     return adq.le;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(fx ☃, ceh ceh1) {
/* 175 */     a(adq.lg, 0.15F, 1.0F);
/*     */   }
/*     */   
/*     */   protected void eT() {
/* 179 */     a(adq.ld, 1.0F, dH());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void eP() {
/* 184 */     a(adq.lh, 1.0F, dH());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bev.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */