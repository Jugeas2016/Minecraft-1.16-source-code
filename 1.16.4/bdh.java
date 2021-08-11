/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bdh
/*     */   extends bdq
/*     */ {
/*     */   private int b;
/*     */   private boolean c;
/*     */   
/*     */   public bdh(aqe<? extends bdh> ☃, brx brx1) {
/*  38 */     super((aqe)☃, brx1);
/*  39 */     this.f = 3;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  44 */     this.bk.a(1, new avp(this));
/*  45 */     this.bk.a(2, new awf(this, 1.0D, false));
/*  46 */     this.bk.a(3, new axk(this, 1.0D));
/*  47 */     this.bk.a(7, new awd(this, (Class)bfw.class, 8.0F));
/*  48 */     this.bk.a(8, new aws(this));
/*     */     
/*  50 */     this.bl.a(1, (new axp(this, new Class[0])).a(new Class[0]));
/*  51 */     this.bl.a(2, new axq<>(this, bfw.class, true));
/*     */   }
/*     */ 
/*     */   
/*     */   protected float b(aqx ☃, aqb aqb1) {
/*  56 */     return 0.13F;
/*     */   }
/*     */   
/*     */   public static ark.a m() {
/*  60 */     return bdq.eR()
/*  61 */       .a(arl.a, 8.0D)
/*  62 */       .a(arl.d, 0.25D)
/*  63 */       .a(arl.f, 2.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean aC() {
/*  68 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/*  73 */     return adq.dE;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/*  78 */     return adq.dG;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/*  83 */     return adq.dF;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(fx ☃, ceh ceh1) {
/*  88 */     a(adq.dH, 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/*  93 */     super.a(☃);
/*  94 */     this.b = ☃.h("Lifetime");
/*  95 */     this.c = ☃.q("PlayerSpawned");
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 100 */     super.b(☃);
/* 101 */     ☃.b("Lifetime", this.b);
/* 102 */     ☃.a("PlayerSpawned", this.c);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void j() {
/* 108 */     this.aA = this.p;
/*     */     
/* 110 */     super.j();
/*     */   }
/*     */ 
/*     */   
/*     */   public void n(float ☃) {
/* 115 */     this.p = ☃;
/* 116 */     super.n(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public double bb() {
/* 121 */     return 0.1D;
/*     */   }
/*     */   
/*     */   public boolean eK() {
/* 125 */     return this.c;
/*     */   }
/*     */   
/*     */   public void t(boolean ☃) {
/* 129 */     this.c = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 134 */     super.k();
/*     */     
/* 136 */     if (this.l.v) {
/* 137 */       for (int ☃ = 0; ☃ < 2; ☃++) {
/* 138 */         this.l.a(hh.Q, d(0.5D), cF(), g(0.5D), (this.J.nextDouble() - 0.5D) * 2.0D, -this.J.nextDouble(), (this.J.nextDouble() - 0.5D) * 2.0D);
/*     */       }
/*     */     } else {
/* 141 */       if (!eu()) {
/* 142 */         this.b++;
/*     */       }
/*     */       
/* 145 */       if (this.b >= 2400) {
/* 146 */         ad();
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean b(aqe<bdh> ☃, bry bry1, aqp aqp1, fx fx1, Random random) {
/* 152 */     if (c((aqe)☃, bry1, aqp1, fx1, random)) {
/* 153 */       bfw bfw = bry1.a(fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D, 5.0D, true);
/* 154 */       return (bfw == null);
/*     */     } 
/* 156 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public aqq dC() {
/* 161 */     return aqq.c;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bdh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */