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
/*     */ public class bxs
/*     */   extends bud
/*     */ {
/*  29 */   public static final cey a = cex.n;
/*     */   
/*     */   protected bxs(ceg.c ☃) {
/*  32 */     super(☃);
/*  33 */     j(((ceh)this.n.b()).a(a, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, @Nullable aqm aqm1, bmb bmb1) {
/*  38 */     super.a(☃, fx1, ceh1, aqm1, bmb1);
/*  39 */     md md = bmb1.p();
/*  40 */     if (md.e("BlockEntityTag")) {
/*  41 */       md md1 = md.p("BlockEntityTag");
/*  42 */       if (md1.e("RecordItem")) {
/*  43 */         ☃.a(fx1, ceh1.a(a, Boolean.valueOf(true)), 2);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  50 */     if (((Boolean)☃.c(a)).booleanValue()) {
/*  51 */       a(brx1, fx1);
/*     */       
/*  53 */       ☃ = ☃.a(a, Boolean.valueOf(false));
/*  54 */       brx1.a(fx1, ☃, 2);
/*     */       
/*  56 */       return aou.a(brx1.v);
/*     */     } 
/*     */     
/*  59 */     return aou.c;
/*     */   }
/*     */   
/*     */   public void a(bry ☃, fx fx1, ceh ceh1, bmb bmb1) {
/*  63 */     ccj ccj = ☃.c(fx1);
/*  64 */     if (!(ccj instanceof cda)) {
/*     */       return;
/*     */     }
/*     */     
/*  68 */     ((cda)ccj).a(bmb1.i());
/*  69 */     ☃.a(fx1, ceh1.a(a, Boolean.valueOf(true)), 2);
/*     */   }
/*     */   
/*     */   private void a(brx ☃, fx fx1) {
/*  73 */     if (☃.v) {
/*     */       return;
/*     */     }
/*     */     
/*  77 */     ccj ccj = ☃.c(fx1);
/*  78 */     if (!(ccj instanceof cda)) {
/*     */       return;
/*     */     }
/*     */     
/*  82 */     cda cda = (cda)ccj;
/*  83 */     bmb bmb1 = cda.d();
/*  84 */     if (bmb1.a()) {
/*     */       return;
/*     */     }
/*     */     
/*  88 */     ☃.c(1010, fx1, 0);
/*  89 */     cda.Y_();
/*     */     
/*  91 */     float f = 0.7F;
/*  92 */     double d1 = (☃.t.nextFloat() * 0.7F) + 0.15000000596046448D;
/*  93 */     double d2 = (☃.t.nextFloat() * 0.7F) + 0.06000000238418579D + 0.6D;
/*  94 */     double d3 = (☃.t.nextFloat() * 0.7F) + 0.15000000596046448D;
/*     */     
/*  96 */     bmb bmb2 = bmb1.i();
/*     */     
/*  98 */     bcv bcv = new bcv(☃, fx1.u() + d1, fx1.v() + d2, fx1.w() + d3, bmb2);
/*  99 */     bcv.m();
/* 100 */     ☃.c(bcv);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 105 */     if (☃.a(ceh1.b())) {
/*     */       return;
/*     */     }
/* 108 */     a(brx1, fx1);
/* 109 */     super.a(☃, brx1, fx1, ceh1, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public ccj a(brc ☃) {
/* 114 */     return new cda();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃) {
/* 119 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brx brx1, fx fx1) {
/* 124 */     ccj ccj = brx1.c(fx1);
/* 125 */     if (ccj instanceof cda) {
/* 126 */       blx blx = ((cda)ccj).d().b();
/* 127 */       if (blx instanceof bmq) {
/* 128 */         return ((bmq)blx).f();
/*     */       }
/*     */     } 
/*     */     
/* 132 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public bzh b(ceh ☃) {
/* 137 */     return bzh.c;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 142 */     ☃.a((cfj<?>[])new cfj[] { a });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bxs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */