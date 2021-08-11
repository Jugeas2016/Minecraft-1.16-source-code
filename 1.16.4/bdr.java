/*     */ import java.util.EnumSet;
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
/*     */ public abstract class bdr
/*     */   extends bdq
/*     */ {
/*     */   private fx b;
/*     */   private boolean c;
/*     */   private boolean d;
/*     */   
/*     */   protected bdr(aqe<? extends bdr> ☃, brx brx1) {
/*  33 */     super((aqe)☃, brx1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  38 */     super.o();
/*  39 */     this.bk.a(4, new a<>(this, 0.7D, 0.595D));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/*  44 */     super.b(☃);
/*     */     
/*  46 */     if (this.b != null) {
/*  47 */       ☃.a("PatrolTarget", mp.a(this.b));
/*     */     }
/*     */     
/*  50 */     ☃.a("PatrolLeader", this.c);
/*  51 */     ☃.a("Patrolling", this.d);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/*  56 */     super.a(☃);
/*     */     
/*  58 */     if (☃.e("PatrolTarget")) {
/*  59 */       this.b = mp.b(☃.p("PatrolTarget"));
/*     */     }
/*     */     
/*  62 */     this.c = ☃.q("PatrolLeader");
/*  63 */     this.d = ☃.q("Patrolling");
/*     */   }
/*     */ 
/*     */   
/*     */   public double bb() {
/*  68 */     return -0.45D;
/*     */   }
/*     */   
/*     */   public boolean eN() {
/*  72 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/*  80 */     if (aqp1 != aqp.p && aqp1 != aqp.h && aqp1 != aqp.d && 
/*  81 */       this.J.nextFloat() < 0.06F && eN()) {
/*  82 */       this.c = true;
/*     */     }
/*     */ 
/*     */     
/*  86 */     if (eS()) {
/*  87 */       a(aqf.f, bhb.s());
/*  88 */       a(aqf.f, 2.0F);
/*     */     } 
/*     */     
/*  91 */     if (aqp1 == aqp.p) {
/*  92 */       this.d = true;
/*     */     }
/*     */     
/*  95 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*     */   }
/*     */   
/*     */   public static boolean b(aqe<? extends bdr> ☃, bry bry1, aqp aqp1, fx fx1, Random random) {
/*  99 */     if (bry1.a(bsf.b, fx1) > 8) {
/* 100 */       return false;
/*     */     }
/*     */     
/* 103 */     return c((aqe)☃, bry1, aqp1, fx1, random);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean h(double ☃) {
/* 108 */     return (!this.d || ☃ > 16384.0D);
/*     */   }
/*     */   
/*     */   public void g(fx ☃) {
/* 112 */     this.b = ☃;
/* 113 */     this.d = true;
/*     */   }
/*     */   
/*     */   public fx eO() {
/* 117 */     return this.b;
/*     */   }
/*     */   
/*     */   public boolean eP() {
/* 121 */     return (this.b != null);
/*     */   }
/*     */   
/*     */   public void t(boolean ☃) {
/* 125 */     this.c = ☃;
/* 126 */     this.d = true;
/*     */   }
/*     */   
/*     */   public boolean eS() {
/* 130 */     return this.c;
/*     */   }
/*     */   
/*     */   public boolean eT() {
/* 134 */     return true;
/*     */   }
/*     */   
/*     */   public void eU() {
/* 138 */     this.b = cB().b(-500 + this.J.nextInt(1000), 0, -500 + this.J.nextInt(1000));
/* 139 */     this.d = true;
/*     */   }
/*     */   
/*     */   protected boolean eV() {
/* 143 */     return this.d;
/*     */   }
/*     */   
/*     */   protected void u(boolean ☃) {
/* 147 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   public static class a<T extends bdr>
/*     */     extends avv
/*     */   {
/*     */     private final T a;
/*     */     private final double b;
/*     */     private final double c;
/*     */     private long d;
/*     */     
/*     */     public a(T ☃, double d1, double d2) {
/* 159 */       this.a = ☃;
/* 160 */       this.b = d1;
/* 161 */       this.c = d2;
/* 162 */       this.d = -1L;
/* 163 */       a(EnumSet.of(avv.a.a));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 168 */       boolean ☃ = (((bdr)this.a).l.T() < this.d);
/* 169 */       return (this.a.eV() && this.a.A() == null && !this.a.bs() && this.a.eP() && !☃);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void c() {}
/*     */ 
/*     */ 
/*     */     
/*     */     public void d() {}
/*     */ 
/*     */     
/*     */     public void e() {
/* 182 */       boolean ☃ = this.a.eS();
/* 183 */       ayj ayj = this.a.x();
/* 184 */       if (ayj.m()) {
/* 185 */         List<bdr> list = g();
/* 186 */         if (this.a.eV() && list.isEmpty()) {
/* 187 */           this.a.u(false);
/* 188 */         } else if (!☃ || !this.a.eO().a(this.a.cA(), 10.0D)) {
/* 189 */           dcn dcn1 = dcn.c(this.a.eO());
/*     */ 
/*     */           
/* 192 */           dcn dcn2 = this.a.cA();
/* 193 */           dcn dcn3 = dcn2.d(dcn1);
/*     */           
/* 195 */           dcn1 = dcn3.b(90.0F).a(0.4D).e(dcn1);
/*     */           
/* 197 */           dcn dcn4 = dcn1.d(dcn2).d().a(10.0D).e(dcn2);
/* 198 */           fx fx = new fx(dcn4);
/* 199 */           fx = ((bdr)this.a).l.a(chn.a.f, fx);
/*     */           
/* 201 */           if (!ayj.a(fx.u(), fx.v(), fx.w(), ☃ ? this.c : this.b)) {
/*     */             
/* 203 */             h();
/* 204 */             this.d = ((bdr)this.a).l.T() + 200L;
/* 205 */           } else if (☃) {
/* 206 */             for (bdr bdr1 : list) {
/* 207 */               bdr1.g(fx);
/*     */             }
/*     */           } 
/*     */         } else {
/* 211 */           this.a.eU();
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     private List<bdr> g() {
/* 217 */       return ((bdr)this.a).l.a(bdr.class, this.a.cc().g(16.0D), ☃ -> (☃.eT() && !☃.s((aqa)this.a)));
/*     */     }
/*     */     
/*     */     private boolean h() {
/* 221 */       Random ☃ = this.a.cY();
/* 222 */       fx fx = ((bdr)this.a).l.a(chn.a.f, this.a.cB().b(-8 + ☃.nextInt(16), 0, -8 + ☃.nextInt(16)));
/* 223 */       return this.a.x().a(fx.u(), fx.v(), fx.w(), this.b);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bdr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */