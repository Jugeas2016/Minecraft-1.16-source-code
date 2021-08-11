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
/*     */ public class caz
/*     */   extends buo
/*     */ {
/*  27 */   public static final cey a = cex.B;
/*     */   
/*     */   public caz(ceg.c ☃) {
/*  30 */     super(☃);
/*  31 */     j(n().a(a, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/*  36 */     if (ceh1.a(☃.b())) {
/*     */       return;
/*     */     }
/*  39 */     if (brx1.r(fx1)) {
/*  40 */       a(brx1, fx1);
/*  41 */       brx1.a(fx1, false);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, buo buo1, fx fx2, boolean bool) {
/*  47 */     if (brx1.r(fx1)) {
/*  48 */       a(brx1, fx1);
/*  49 */       brx1.a(fx1, false);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, bfw bfw1) {
/*  55 */     if (!☃.s_() && !bfw1.b_() && ((Boolean)ceh1.c(a)).booleanValue()) {
/*  56 */       a(☃, fx1);
/*     */     }
/*     */     
/*  59 */     super.a(☃, fx1, ceh1, bfw1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, brp brp1) {
/*  64 */     if (☃.v) {
/*     */       return;
/*     */     }
/*     */     
/*  68 */     bcw bcw = new bcw(☃, fx1.u() + 0.5D, fx1.v(), fx1.w() + 0.5D, brp1.d());
/*  69 */     bcw.a((short)(☃.t.nextInt(bcw.i() / 4) + bcw.i() / 8));
/*  70 */     ☃.c(bcw);
/*     */   }
/*     */   
/*     */   public static void a(brx ☃, fx fx1) {
/*  74 */     a(☃, fx1, (aqm)null);
/*     */   }
/*     */   
/*     */   private static void a(brx ☃, fx fx1, @Nullable aqm aqm1) {
/*  78 */     if (☃.v) {
/*     */       return;
/*     */     }
/*  81 */     bcw bcw = new bcw(☃, fx1.u() + 0.5D, fx1.v(), fx1.w() + 0.5D, aqm1);
/*  82 */     ☃.c(bcw);
/*  83 */     ☃.a((bfw)null, bcw.cD(), bcw.cE(), bcw.cH(), adq.pb, adr.e, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  88 */     bmb bmb = bfw1.b(aot1);
/*  89 */     blx blx = bmb.b();
/*  90 */     if (blx == bmd.ka || blx == bmd.oS) {
/*  91 */       a(brx1, fx1, bfw1);
/*  92 */       brx1.a(fx1, bup.a.n(), 11);
/*     */       
/*  94 */       if (!bfw1.b_()) {
/*  95 */         if (blx == bmd.ka) {
/*  96 */           bmb.a(1, bfw1, bfw1 -> bfw1.d(☃));
/*     */         } else {
/*  98 */           bmb.g(1);
/*     */         } 
/*     */       }
/* 101 */       return aou.a(brx1.v);
/*     */     } 
/* 103 */     return super.a(☃, brx1, fx1, bfw1, aot1, dcj1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, ceh ceh1, dcj dcj1, bgm bgm1) {
/* 108 */     if (!☃.v) {
/* 109 */       aqa aqa = bgm1.v();
/* 110 */       if (bgm1.bq()) {
/* 111 */         fx fx = dcj1.a();
/* 112 */         a(☃, fx, (aqa instanceof aqm) ? (aqm)aqa : null);
/* 113 */         ☃.a(fx, false);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brp ☃) {
/* 120 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 125 */     ☃.a((cfj<?>[])new cfj[] { a });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\caz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */