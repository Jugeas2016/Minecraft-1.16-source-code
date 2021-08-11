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
/*     */ public class bdp
/*     */   extends bdz
/*     */ {
/*     */   public bdp(aqe<? extends bdp> ☃, brx brx1) {
/*  28 */     super((aqe)☃, brx1);
/*     */   }
/*     */   
/*     */   public static ark.a m() {
/*  32 */     return bdq.eR()
/*  33 */       .a(arl.d, 0.20000000298023224D);
/*     */   }
/*     */   
/*     */   public static boolean b(aqe<bdp> ☃, bry bry1, aqp aqp1, fx fx1, Random random) {
/*  37 */     return (bry1.ad() != aor.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brz ☃) {
/*  42 */     return (☃.j(this) && !☃.d(cc()));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(int ☃, boolean bool) {
/*  47 */     super.a(☃, bool);
/*  48 */     a(arl.i).a((☃ * 3));
/*     */   }
/*     */ 
/*     */   
/*     */   public float aR() {
/*  53 */     return 1.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected hf eI() {
/*  58 */     return hh.A;
/*     */   }
/*     */ 
/*     */   
/*     */   protected vk J() {
/*  63 */     return eQ() ? cyq.a : X().i();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bq() {
/*  68 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int eJ() {
/*  73 */     return super.eJ() * 4;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void eK() {
/*  78 */     this.b *= 0.9F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void dK() {
/*  83 */     dcn ☃ = cC();
/*  84 */     n(☃.b, (dJ() + eP() * 0.1F), ☃.d);
/*  85 */     this.Z = true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void c(ael<cuw> ☃) {
/*  90 */     if (☃ == aef.c) {
/*  91 */       dcn dcn = cC();
/*  92 */       n(dcn.b, (0.22F + eP() * 0.05F), dcn.d);
/*  93 */       this.Z = true;
/*     */     } else {
/*  95 */       super.c(☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(float ☃, float f1) {
/* 101 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean eL() {
/* 106 */     return dS();
/*     */   }
/*     */ 
/*     */   
/*     */   protected float eM() {
/* 111 */     return super.eM() + 2.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 116 */     if (eQ()) {
/* 117 */       return adq.hx;
/*     */     }
/* 119 */     return adq.hw;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 125 */     if (eQ()) {
/* 126 */       return adq.ho;
/*     */     }
/* 128 */     return adq.hv;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected adp eN() {
/* 134 */     if (eQ()) {
/* 135 */       return adq.hA;
/*     */     }
/* 137 */     return adq.hz;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected adp eO() {
/* 143 */     return adq.hy;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bdp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */