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
/*     */ public abstract class bto
/*     */   extends bud
/*     */ {
/*  27 */   public static final cfb a = bxm.aq;
/*  28 */   public static final cey b = cex.r;
/*     */   
/*     */   protected bto(ceg.c ☃) {
/*  31 */     super(☃);
/*  32 */     j(((ceh)this.n.b()).a(a, gc.c).a(b, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  37 */     if (brx1.v) {
/*  38 */       return aou.a;
/*     */     }
/*     */     
/*  41 */     a(brx1, fx1, bfw1);
/*     */     
/*  43 */     return aou.b;
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract void a(brx parambrx, fx paramfx, bfw parambfw);
/*     */   
/*     */   public ceh a(bny ☃) {
/*  50 */     return n().a(a, ☃.f().f());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, aqm aqm1, bmb bmb1) {
/*  55 */     if (bmb1.t()) {
/*  56 */       ccj ccj = ☃.c(fx1);
/*  57 */       if (ccj instanceof cbz) {
/*  58 */         ((cbz)ccj).a(bmb1.r());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/*  65 */     if (☃.a(ceh1.b())) {
/*     */       return;
/*     */     }
/*     */     
/*  69 */     ccj ccj = brx1.c(fx1);
/*  70 */     if (ccj instanceof cbz) {
/*  71 */       aoq.a(brx1, fx1, (cbz)ccj);
/*  72 */       ((cbz)ccj).a(brx1, dcn.a(fx1));
/*  73 */       brx1.c(fx1, this);
/*     */     } 
/*  75 */     super.a(☃, brx1, fx1, ceh1, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃) {
/*  80 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brx brx1, fx fx1) {
/*  85 */     return bic.a(brx1.c(fx1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bzh b(ceh ☃) {
/*  93 */     return bzh.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/*  98 */     return ☃.a(a, bzm1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/* 103 */     return ☃.a(byg1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 108 */     ☃.a((cfj<?>[])new cfj[] { a, b });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bto.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */