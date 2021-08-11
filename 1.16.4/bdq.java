/*     */ import java.util.Random;
/*     */ import java.util.function.Predicate;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class bdq
/*     */   extends aqu
/*     */   implements bdi
/*     */ {
/*     */   protected bdq(aqe<? extends bdq> ☃, brx brx1) {
/*  30 */     super((aqe)☃, brx1);
/*  31 */     this.f = 5;
/*     */   }
/*     */ 
/*     */   
/*     */   public adr cu() {
/*  36 */     return adr.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/*  41 */     dA();
/*  42 */     eQ();
/*  43 */     super.k();
/*     */   }
/*     */   
/*     */   protected void eQ() {
/*  47 */     float ☃ = aR();
/*  48 */     if (☃ > 0.5F) {
/*  49 */       this.aI += 2;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean L() {
/*  55 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp av() {
/*  60 */     return adq.gi;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp aw() {
/*  65 */     return adq.gh;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/*  70 */     if (b(☃)) {
/*  71 */       return false;
/*     */     }
/*  73 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/*  78 */     return adq.gf;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/*  83 */     return adq.ge;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp o(int ☃) {
/*  88 */     if (☃ > 4) {
/*  89 */       return adq.gd;
/*     */     }
/*  91 */     return adq.gg;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float a(fx ☃, brz brz1) {
/*  97 */     return 0.5F - brz1.y(☃);
/*     */   }
/*     */   
/*     */   public static boolean a(bsk ☃, fx fx1, Random random) {
/* 101 */     if (☃.a(bsf.a, fx1) > random.nextInt(32)) {
/* 102 */       return false;
/*     */     }
/*     */     
/* 105 */     int i = ☃.E().W() ? ☃.c(fx1, 10) : ☃.B(fx1);
/* 106 */     return (i <= random.nextInt(8));
/*     */   }
/*     */   
/*     */   public static boolean b(aqe<? extends bdq> ☃, bsk bsk1, aqp aqp1, fx fx1, Random random) {
/* 110 */     return (bsk1.ad() != aor.a && 
/* 111 */       a(bsk1, fx1, random) && 
/* 112 */       a((aqe)☃, bsk1, aqp1, fx1, random));
/*     */   }
/*     */   
/*     */   public static boolean c(aqe<? extends bdq> ☃, bry bry1, aqp aqp1, fx fx1, Random random) {
/* 116 */     return (bry1.ad() != aor.a && 
/* 117 */       a((aqe)☃, bry1, aqp1, fx1, random));
/*     */   }
/*     */   
/*     */   public static ark.a eR() {
/* 121 */     return aqn.p()
/* 122 */       .a(arl.f);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean cV() {
/* 127 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean cW() {
/* 132 */     return true;
/*     */   }
/*     */   
/*     */   public boolean f(bfw ☃) {
/* 136 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb f(bmb ☃) {
/* 141 */     if (☃.b() instanceof bmo) {
/* 142 */       Predicate<bmb> predicate = ((bmo)☃.b()).e();
/* 143 */       bmb bmb1 = bmo.a(this, predicate);
/* 144 */       return bmb1.a() ? new bmb(bmd.kd) : bmb1;
/*     */     } 
/* 146 */     return bmb.b;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bdq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */