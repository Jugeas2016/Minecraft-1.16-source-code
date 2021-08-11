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
/*     */ public class cbv
/*     */   extends bzv
/*     */ {
/*     */   @Nullable
/*     */   private static cem c;
/*     */   @Nullable
/*     */   private static cem d;
/*     */   
/*     */   protected cbv(ceg.c ☃) {
/*  35 */     super(bzv.b.b, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, @Nullable aqm aqm1, bmb bmb1) {
/*  40 */     super.a(☃, fx1, ceh1, aqm1, bmb1);
/*     */     
/*  42 */     ccj ccj = ☃.c(fx1);
/*  43 */     if (ccj instanceof cdg) {
/*  44 */       a(☃, fx1, (cdg)ccj);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void a(brx ☃, fx fx1, cdg cdg1) {
/*  49 */     if (☃.v) {
/*     */       return;
/*     */     }
/*  52 */     ceh ceh = cdg1.p();
/*  53 */     boolean bool = (ceh.a(bup.fe) || ceh.a(bup.ff));
/*  54 */     if (!bool || fx1.v() < 0 || ☃.ad() == aor.a) {
/*     */       return;
/*     */     }
/*     */     
/*  58 */     cem cem1 = c();
/*  59 */     cem.b b = cem1.a(☃, fx1);
/*  60 */     if (b == null) {
/*     */       return;
/*     */     }
/*     */     
/*  64 */     for (int i = 0; i < cem1.c(); i++) {
/*  65 */       for (int k = 0; k < cem1.b(); k++) {
/*  66 */         cel cel = b.a(i, k, 0);
/*  67 */         ☃.a(cel.d(), bup.a.n(), 2);
/*  68 */         ☃.c(2001, cel.d(), buo.i(cel.a()));
/*     */       } 
/*     */     } 
/*     */     
/*  72 */     bcl bcl = aqe.aT.a(☃);
/*  73 */     fx fx2 = b.a(1, 2, 0).d();
/*  74 */     bcl.b(fx2.u() + 0.5D, fx2.v() + 0.55D, fx2.w() + 0.5D, (b.b().n() == gc.a.a) ? 0.0F : 90.0F, 0.0F);
/*  75 */     bcl.aA = (b.b().n() == gc.a.a) ? 0.0F : 90.0F;
/*  76 */     bcl.m();
/*     */     
/*  78 */     for (aah aah : ☃.<aah>a(aah.class, bcl.cc().g(50.0D))) {
/*  79 */       ac.n.a(aah, bcl);
/*     */     }
/*     */     
/*  82 */     ☃.c(bcl);
/*     */     
/*  84 */     for (int j = 0; j < cem1.c(); j++) {
/*  85 */       for (int k = 0; k < cem1.b(); k++) {
/*  86 */         ☃.a(b.a(j, k, 0).d(), bup.a);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean b(brx ☃, fx fx1, bmb bmb1) {
/*  92 */     if (bmb1.b() == bmd.pf && fx1.v() >= 2 && ☃.ad() != aor.a && !☃.v) {
/*  93 */       return (d().a(☃, fx1) != null);
/*     */     }
/*     */     
/*  96 */     return false;
/*     */   }
/*     */   
/*     */   private static cem c() {
/* 100 */     if (c == null)
/*     */     {
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
/* 112 */       c = cen.a().a(new String[] { "^^^", "###", "~#~" }).a('#', ☃ -> ☃.a().a(aed.ai)).a('^', cel.a(cer.a(bup.fe).or(cer.a(bup.ff)))).a('~', cel.a(cep.a(cva.a))).b();
/*     */     }
/*     */     
/* 115 */     return c;
/*     */   }
/*     */   
/*     */   private static cem d() {
/* 119 */     if (d == null)
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 128 */       d = cen.a().a(new String[] { "   ", "###", "~#~" }).a('#', ☃ -> ☃.a().a(aed.ai)).a('~', cel.a(cep.a(cva.a))).b();
/*     */     }
/*     */     
/* 131 */     return d;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cbv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */