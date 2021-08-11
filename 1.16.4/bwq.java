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
/*     */ public class bwq
/*     */   extends bvt
/*     */ {
/*     */   private final ddh[] i;
/*     */   
/*     */   public bwq(ceg.c ☃) {
/*  29 */     super(2.0F, 2.0F, 16.0F, 16.0F, 24.0F, ☃);
/*  30 */     j(((ceh)this.n.b()).a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
/*     */     
/*  32 */     this.i = a(2.0F, 1.0F, 16.0F, 6.0F, 15.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh d(ceh ☃, brc brc1, fx fx1) {
/*  37 */     return this.i[g(☃)];
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh a(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  42 */     return b(☃, brc1, fx1, dcs1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/*  47 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(ceh ☃, boolean bool, gc gc1) {
/*  51 */     buo buo = ☃.b();
/*     */     
/*  53 */     boolean bool1 = c(buo);
/*  54 */     boolean bool2 = (buo instanceof bwr && bwr.a(☃, gc1));
/*  55 */     return ((!b(buo) && bool) || bool1 || bool2);
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean c(buo ☃) {
/*  60 */     return (☃.a(aed.M) && ☃.a(aed.k) == n().a(aed.k));
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  65 */     if (brx1.v) {
/*  66 */       bmb bmb = bfw1.b(aot1);
/*  67 */       if (bmb.b() == bmd.pH) {
/*  68 */         return aou.a;
/*     */       }
/*  70 */       return aou.c;
/*     */     } 
/*     */ 
/*     */     
/*  74 */     return bmf.a(bfw1, brx1, fx1);
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/*  79 */     brc brc = ☃.p();
/*  80 */     fx fx1 = ☃.a();
/*  81 */     cux cux = ☃.p().b(☃.a());
/*     */ 
/*     */     
/*  84 */     fx fx2 = fx1.d();
/*  85 */     fx fx3 = fx1.g();
/*  86 */     fx fx4 = fx1.e();
/*  87 */     fx fx5 = fx1.f();
/*     */     
/*  89 */     ceh ceh1 = brc.d_(fx2);
/*  90 */     ceh ceh2 = brc.d_(fx3);
/*  91 */     ceh ceh3 = brc.d_(fx4);
/*  92 */     ceh ceh4 = brc.d_(fx5);
/*     */     
/*  94 */     return super.a(☃)
/*  95 */       .a(a, Boolean.valueOf(a(ceh1, ceh1.d(brc, fx2, gc.d), gc.d)))
/*  96 */       .a(b, Boolean.valueOf(a(ceh2, ceh2.d(brc, fx3, gc.e), gc.e)))
/*  97 */       .a(c, Boolean.valueOf(a(ceh3, ceh3.d(brc, fx4, gc.c), gc.c)))
/*  98 */       .a(d, Boolean.valueOf(a(ceh4, ceh4.d(brc, fx5, gc.f), gc.f)))
/*  99 */       .a(e, Boolean.valueOf((cux.a() == cuy.c)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 104 */     if (((Boolean)☃.c(e)).booleanValue()) {
/* 105 */       bry1.I().a(fx1, cuy.c, cuy.c.a(bry1));
/*     */     }
/* 107 */     if (gc1.n().e() == gc.c.a) {
/* 108 */       return ☃.a(f.get(gc1), Boolean.valueOf(a(ceh1, ceh1.d(bry1, fx2, gc1.f()), gc1.f())));
/*     */     }
/* 110 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 115 */     ☃.a((cfj<?>[])new cfj[] { a, b, d, c, e });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bwq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */