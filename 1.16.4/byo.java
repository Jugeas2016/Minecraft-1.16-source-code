/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class byo
/*     */   extends buo
/*     */ {
/*  24 */   public static final cfe<cfh> a = cex.aI;
/*  25 */   public static final cey b = cex.w;
/*  26 */   public static final cfg c = cex.ax;
/*     */   
/*     */   public byo(ceg.c ☃) {
/*  29 */     super(☃);
/*  30 */     j(((ceh)this.n.b()).a(a, cfh.a).a(c, Integer.valueOf(0)).a(b, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/*  35 */     return n().a(a, cfh.a(☃.p().d_(☃.a().c())));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/*  40 */     if (gc1 == gc.a) {
/*  41 */       return ☃.a(a, cfh.a(ceh1));
/*     */     }
/*  43 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, buo buo1, fx fx2, boolean bool) {
/*  48 */     boolean bool1 = brx1.r(fx1);
/*     */     
/*  50 */     if (bool1 != ((Boolean)☃.c(b)).booleanValue()) {
/*  51 */       if (bool1) {
/*  52 */         a(brx1, fx1);
/*     */       }
/*  54 */       brx1.a(fx1, ☃.a(b, Boolean.valueOf(bool1)), 3);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(brx ☃, fx fx1) {
/*  59 */     if (☃.d_(fx1.b()).g()) {
/*  60 */       ☃.a(fx1, this, 0, 0);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  66 */     if (brx1.v) {
/*  67 */       return aou.a;
/*     */     }
/*     */     
/*  70 */     ☃ = ☃.a(c);
/*  71 */     brx1.a(fx1, ☃, 3);
/*  72 */     a(brx1, fx1);
/*  73 */     bfw1.a(aea.af);
/*     */     
/*  75 */     return aou.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, bfw bfw1) {
/*  80 */     if (brx1.v) {
/*     */       return;
/*     */     }
/*     */     
/*  84 */     a(brx1, fx1);
/*  85 */     bfw1.a(aea.ae);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brx brx1, fx fx1, int i, int j) {
/*  90 */     int k = ((Integer)☃.c(c)).intValue();
/*  91 */     float f = (float)Math.pow(2.0D, (k - 12) / 12.0D);
/*     */     
/*  93 */     brx1.a((bfw)null, fx1, ((cfh)☃.c(a)).b(), adr.c, 3.0F, f);
/*  94 */     brx1.a(hh.O, fx1.u() + 0.5D, fx1.v() + 1.2D, fx1.w() + 0.5D, k / 24.0D, 0.0D, 0.0D);
/*  95 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 100 */     ☃.a((cfj<?>[])new cfj[] { a, b, c });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\byo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */